// Referalli app attribution for Kotlin/JVM and Android (stdlib + java.net only,
// no java.net.http, so it runs on Android minSdk 21).
//
//   Referalli.configure(publishableKey = "tk_…", programId = "prg_…", storage = prefsStorage)
//   Referalli.handleDeepLink(url)                     // app/universal link opened the app
//   Referalli.getReferral { referral -> … }           // first open: link, install referrer or deferred match
//   Referalli.trackSignup(user.id) { result, error -> … }
//
// On Android use com.referalli:referalli-android, which adds SharedPreferences
// storage, Play Install Referrer and main-thread callbacks:
// `Referalli.configure(context, "tk_…")`.
//
// The blocking methods on ReferalliTracker do network I/O: call them off the
// main thread. The Referalli facade runs them on its own executor.
//
// In-app purchases are reported from your backend (POST /v1/mobile/purchases
// with a secret API key, after validating the receipt), never from the app.

package com.referalli

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URI
import java.net.URLDecoder
import java.util.UUID
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

// ---------------------------------------------------------------------------
// Public types

/** How a referral was captured. */
enum class ReferralSource { LINK, DEFERRED, INSTALL_REFERRER, MANUAL }

/** The referral captured for this install. */
data class ReferalliReferral(
    /** The click id (`ref_click_id`): deterministic attribution when present. */
    val clickId: String? = null,
    /** The partner's referral code (`via`). */
    val code: String? = null,
    /** Where the link wanted to send the user (deferred matches only). */
    val destination: String? = null,
    /** The program the click belongs to, when the API reports it. */
    val programId: String? = null,
    val source: ReferralSource,
    val capturedAtMillis: Long,
)

/** The outcome of `trackSignup`. */
data class ReferalliSignupResult(val attributed: Boolean, val referralId: String?, val partnerId: String?)

/** A tracker call failed: a non-2xx `status`, or a transport error (`status == null`). */
class ReferalliTrackerException(message: String, val status: Int? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)

/** Minimal key-value persistence so the install id and referral survive restarts. */
interface KeyValueStorage {
    fun get(key: String): String?
    fun put(key: String, value: String)
    fun remove(key: String)
}

class InMemoryStorage : KeyValueStorage {
    private val map = java.util.concurrent.ConcurrentHashMap<String, String>()
    override fun get(key: String): String? = map[key]
    override fun put(key: String, value: String) { map[key] = value }
    override fun remove(key: String) { map.remove(key) }
}

/** One HTTP exchange of the tracker. */
data class TrackerRequest(val method: String, val url: String, val body: String?, val headers: Map<String, String>)
data class TrackerResponse(val status: Int, val body: String)

/** The tracker's HTTP seam. The default uses HttpURLConnection; plug in OkHttp or a test double. */
fun interface TrackerTransport {
    @Throws(IOException::class)
    fun send(request: TrackerRequest): TrackerResponse
}

/** HttpURLConnection transport: available on every JVM and every Android version. */
class UrlConnectionTrackerTransport(
    private val connectTimeoutMs: Int = 10_000,
    private val readTimeoutMs: Int = 10_000,
) : TrackerTransport {
    override fun send(request: TrackerRequest): TrackerResponse {
        val connection = URI(request.url).toURL().openConnection() as HttpURLConnection
        try {
            connection.requestMethod = request.method
            connection.connectTimeout = connectTimeoutMs
            connection.readTimeout = readTimeoutMs
            connection.useCaches = false
            request.headers.forEach { (k, v) -> connection.setRequestProperty(k, v) }
            if (request.body != null) {
                connection.doOutput = true
                connection.outputStream.use { it.write(request.body.toByteArray(Charsets.UTF_8)) }
            }
            val status = connection.responseCode
            val stream = if (status in 200..299) connection.inputStream else connection.errorStream
            val text = stream?.use { it.readBytes().toString(Charsets.UTF_8) } ?: ""
            return TrackerResponse(status, text)
        } finally {
            connection.disconnect()
        }
    }
}

/**
 * Supplies the raw install referrer string (Android: Play Install Referrer), or
 * null when unavailable. Called once, on a background thread, may block briefly.
 */
fun interface InstallReferrerProvider {
    fun installReferrer(): String?
}

/** Callback for asynchronous facade calls: exactly one of `value` / `error` is meaningful. */
fun interface ReferalliCallback<T> {
    fun onResult(value: T?, error: Throwable?)
}

// ---------------------------------------------------------------------------
// Tracker

class ReferalliTracker @JvmOverloads constructor(
    /** The org's public tracking token (Settings → Tracking). Safe to ship in an app. */
    val publishableKey: String,
    /** The program installs belong to; needed for `trackSignup` to attribute. */
    val programId: String? = null,
    val baseUrl: String = DEFAULT_BASE_URL,
    private val storage: KeyValueStorage = InMemoryStorage(),
    private val transport: TrackerTransport = UrlConnectionTrackerTransport(),
    /** When false, `getReferral()` never calls the deferred resolver on its own. */
    val deferredResolution: Boolean = true,
    private val installReferrer: InstallReferrerProvider? = null,
    /** False when the app was installed long before this SDK first ran (skip first-open matching). */
    private val freshInstall: () -> Boolean = { true },
    private val clock: () -> Long = System::currentTimeMillis,
) {
    companion object {
        const val DEFAULT_BASE_URL = "https://referalli.com"
        internal const val ANON_KEY = "referalli.anon_id"
        internal const val REFERRAL_KEY = "referalli.referral"
        internal const val FIRST_OPEN_KEY = "referalli.first_open_done"

        /** Extracts `ref_click_id` and `via` (or `ref`), or the code of a `/go/<token>/<code>` link. */
        @JvmStatic
        fun parseLink(url: String, nowMillis: Long = System.currentTimeMillis()): ReferalliReferral? {
            val uri = try { URI(url) } catch (_: Exception) { return null }
            val query = parseQuery(uri.rawQuery)
            val clickId = query["ref_click_id"]
            var code = query["via"] ?: query["ref"]
            val parts = (uri.rawPath ?: "").split('/').filter { it.isNotEmpty() }
            if (code == null && parts.size == 3 && parts[0] == "go") code = decode(parts[2])
            if (clickId == null && code == null) return null
            return ReferalliReferral(clickId = clickId, code = code, source = ReferralSource.LINK, capturedAtMillis = nowMillis)
        }

        /** Parses a Play install referrer (`ref_click_id=…&via=…`, possibly URL-encoded once more). */
        @JvmStatic
        fun parseInstallReferrer(raw: String?, nowMillis: Long = System.currentTimeMillis()): ReferalliReferral? {
            if (raw.isNullOrBlank()) return null
            var query = parseQuery(raw)
            if (query["ref_click_id"] == null && query["via"] == null && raw.contains("%3D")) query = parseQuery(decode(raw))
            val clickId = query["ref_click_id"]
            val code = query["via"] ?: query["ref"]
            if (clickId == null && code == null) return null
            return ReferalliReferral(clickId = clickId, code = code, source = ReferralSource.INSTALL_REFERRER, capturedAtMillis = nowMillis)
        }

        private fun decode(s: String): String = try { URLDecoder.decode(s, "UTF-8") } catch (_: IllegalArgumentException) { s }

        private fun parseQuery(raw: String?): Map<String, String> {
            if (raw.isNullOrEmpty()) return emptyMap()
            val out = LinkedHashMap<String, String>()
            for (pair in raw.split('&')) {
                if (pair.isEmpty()) continue
                val i = pair.indexOf('=')
                val key = decode(if (i < 0) pair else pair.substring(0, i))
                val value = if (i < 0) "" else decode(pair.substring(i + 1))
                if (value.isNotEmpty() && key !in out) out[key] = value
            }
            return out
        }
    }

    private val stateLock = Any()
    private val resolveLock = Any()

    /** Random install id, persisted across launches. Not derived from the device. */
    val anonId: String
        get() = synchronized(stateLock) {
            storage.get(ANON_KEY) ?: ("a_" + UUID.randomUUID().toString().replace("-", "").lowercase().take(20))
                .also { storage.put(ANON_KEY, it) }
        }

    /** The stored referral, if one was captured. Does not hit the network. */
    val storedReferral: ReferalliReferral?
        get() = synchronized(stateLock) { loadReferral() }

    // -- Links ---------------------------------------------------------------

    /**
     * Captures a referral from an app link / deep link URL and stores it. Returns null (keeping any
     * earlier referral) when the URL carries none. Does not do network I/O: call [reportVisit]
     * (the facade does it for you) to record the visit.
     */
    fun handleDeepLink(url: String): ReferalliReferral? {
        val captured = parseLink(url, clock()) ?: return null
        synchronized(stateLock) {
            saveReferral(captured)
            storage.put(FIRST_OPEN_KEY, "1")
        }
        return captured
    }

    /** Sets the referral from a code the user typed. No network I/O. */
    fun setReferral(code: String): ReferalliReferral {
        val referral = ReferalliReferral(code = code, source = ReferralSource.MANUAL, capturedAtMillis = clock())
        synchronized(stateLock) {
            saveReferral(referral)
            storage.put(FIRST_OPEN_KEY, "1")
        }
        return referral
    }

    /** Reports the visit for a captured referral; fills in the click id the API records. Blocking. */
    fun reportVisit(referral: ReferalliReferral, url: String? = null): String? {
        val clickId = trackVisit(code = referral.code, clickId = referral.clickId, url = url)
        if (referral.clickId == null && clickId != null) {
            synchronized(stateLock) {
                if (loadReferral()?.capturedAtMillis == referral.capturedAtMillis) saveReferral(referral.copy(clickId = clickId))
            }
        }
        return clickId
    }

    // -- Referral lookup -------------------------------------------------------

    /**
     * The referral for this install: the stored one; on first open the install referrer, then (when
     * [deferredResolution] is on) a deferred match from the API. Blocking. Network failures return
     * null and the lookup is retried on the next call.
     */
    fun getReferral(): ReferalliReferral? {
        storedReferral?.let { return it }
        synchronized(resolveLock) {
            storedReferral?.let { return it }
            if (firstOpenDone()) return null
            if (!freshInstall()) {
                markFirstOpen()
                return null
            }
            val fromStore = installReferrer?.let { provider ->
                parseInstallReferrer(runCatching { provider.installReferrer() }.getOrNull(), clock())
            }
            if (fromStore != null) {
                synchronized(stateLock) {
                    saveReferral(fromStore)
                    storage.put(FIRST_OPEN_KEY, "1")
                }
                runCatching { reportVisit(fromStore) }
                return referral
            }
            if (!deferredResolution) return null
            return resolveDeferredLocked()
        }
    }

    /** Runs the deferred resolver once per install (call it yourself when [deferredResolution] is off). */
    fun resolveDeferred(): ReferalliReferral? {
        storedReferral?.let { return it }
        synchronized(resolveLock) {
            storedReferral?.let { return it }
            if (firstOpenDone()) return null
            return resolveDeferredLocked()
        }
    }

    private fun resolveDeferredLocked(): ReferalliReferral? {
        val json = try {
            parseTrackerJson(request("GET", "/t/$publishableKey/mobile/resolve", null))
        } catch (_: Exception) {
            return null // retry on the next launch
        }
        markFirstOpen()
        if (json["matched"] != true) return null
        val clickId = json["clickId"] as? String
        val code = json["code"] as? String
        if (clickId == null && code == null) return null
        val found = ReferalliReferral(
            clickId = clickId,
            code = code,
            destination = json["destination"] as? String,
            programId = json["programId"] as? String,
            source = ReferralSource.DEFERRED,
            capturedAtMillis = clock(),
        )
        synchronized(stateLock) { saveReferral(found) }
        // Tie the install id to the click so identify-based attribution works too.
        runCatching { trackVisit(clickId = clickId) }
        return found
    }

    // -- Events ----------------------------------------------------------------

    /**
     * Reports a signup: links the install to [customerRef] and, when a program is known, asks the
     * API to attribute the customer (`/mobile/install`). Blocking; throws [ReferalliTrackerException].
     */
    @JvmOverloads
    fun trackSignup(customerRef: String, emailHash: String? = null): ReferalliSignupResult {
        val current = getReferral()
        identify(customerRef = customerRef, emailHash = emailHash)
        val program = programId ?: current?.programId
            ?: return ReferalliSignupResult(attributed = false, referralId = null, partnerId = null)
        val body = linkedMapOf("programId" to program, "customerRef" to customerRef, "deviceId" to anonId)
        current?.clickId?.let { body["clickId"] = it }
        val json = parseTrackerJson(request("POST", "/t/$publishableKey/mobile/install", body))
        return ReferalliSignupResult(
            attributed = json["attributed"] == true,
            referralId = json["referralId"] as? String,
            partnerId = json["partnerId"] as? String,
        )
    }

    /** Reports an app visit. Returns the click id the API recorded or echoed, if any. Blocking. */
    @JvmOverloads
    fun trackVisit(code: String? = null, clickId: String? = null, url: String? = null): String? {
        val body = linkedMapOf("anonId" to anonId)
        code?.let { body["code"] = it }
        clickId?.let { body["clickId"] = it }
        url?.let { body["url"] = it.take(2048) }
        val json = parseTrackerJson(request("POST", "/t/$publishableKey/visit", body))
        return (json["clickId"] as? String) ?: clickId
    }

    /** Ties the install to a signed-up customer (or a hashed email). Blocking. */
    @JvmOverloads
    fun identify(customerRef: String? = null, emailHash: String? = null) {
        val body = linkedMapOf("anonId" to anonId)
        customerRef?.let { body["customerRef"] = it }
        emailHash?.let { body["emailHash"] = it }
        request("POST", "/t/$publishableKey/identify", body)
    }

    /** Forgets the install id, the referral and the first-open flag. */
    fun reset() = synchronized(stateLock) {
        listOf(ANON_KEY, REFERRAL_KEY, FIRST_OPEN_KEY).forEach(storage::remove)
    }

    // -- Internals ---------------------------------------------------------------

    private fun firstOpenDone(): Boolean = synchronized(stateLock) { storage.get(FIRST_OPEN_KEY) != null }
    private fun markFirstOpen() = synchronized(stateLock) { storage.put(FIRST_OPEN_KEY, "1") }

    private fun request(method: String, path: String, body: Map<String, String>?): String {
        val headers = linkedMapOf("accept" to "application/json")
        if (body != null) headers["content-type"] = "application/json"
        val response = try {
            transport.send(TrackerRequest(method, baseUrl.trimEnd('/') + path, body?.let(::trackerJson), headers))
        } catch (e: IOException) {
            throw ReferalliTrackerException("could not reach Referalli: ${e.message}", cause = e)
        }
        if (response.status !in 200..299) {
            throw ReferalliTrackerException("Referalli answered ${response.status} for $method $path", response.status)
        }
        return response.body
    }

    // Callers hold stateLock.
    private fun loadReferral(): ReferalliReferral? {
        val raw = storage.get(REFERRAL_KEY) ?: return null
        val json = try { parseTrackerJson(raw) } catch (_: Exception) { return null }
        val source = runCatching { ReferralSource.valueOf(json["source"] as String) }.getOrNull() ?: return null
        return ReferalliReferral(
            clickId = json["clickId"] as? String,
            code = json["code"] as? String,
            destination = json["destination"] as? String,
            programId = json["programId"] as? String,
            source = source,
            capturedAtMillis = (json["capturedAtMillis"] as? String)?.toLongOrNull() ?: 0L,
        )
    }

    private fun saveReferral(r: ReferalliReferral) {
        val map = linkedMapOf("source" to r.source.name, "capturedAtMillis" to r.capturedAtMillis.toString())
        r.clickId?.let { map["clickId"] = it }
        r.code?.let { map["code"] = it }
        r.destination?.let { map["destination"] = it }
        r.programId?.let { map["programId"] = it }
        storage.put(REFERRAL_KEY, trackerJson(map))
    }
}

// ---------------------------------------------------------------------------
// Facade

/** The app-wide entry point. Call [configure] once at startup. */
object Referalli {
    @Volatile private var current: ReferalliTracker? = null
    @Volatile private var callbackExecutor: Executor = Executor { it.run() }
    private val worker: ExecutorService = Executors.newSingleThreadExecutor { r ->
        Thread(r, "referalli-tracker").apply { isDaemon = true }
    }

    /** The configured tracker, or null before [configure]. */
    @JvmStatic
    val shared: ReferalliTracker? get() = current

    /**
     * @param publishableKey your org's public tracking token (Settings → Tracking).
     * @param programId the program installs belong to; needed for `trackSignup` to attribute.
     * @param callbackExecutor where callbacks run (Android: the main thread).
     */
    @JvmStatic
    @JvmOverloads
    fun configure(
        publishableKey: String,
        programId: String? = null,
        baseUrl: String = ReferalliTracker.DEFAULT_BASE_URL,
        storage: KeyValueStorage = InMemoryStorage(),
        transport: TrackerTransport = UrlConnectionTrackerTransport(),
        deferredResolution: Boolean = true,
        installReferrer: InstallReferrerProvider? = null,
        freshInstall: () -> Boolean = { true },
        callbackExecutor: Executor = Executor { it.run() },
    ): ReferalliTracker {
        val tracker = ReferalliTracker(
            publishableKey, programId, baseUrl, storage, transport, deferredResolution, installReferrer, freshInstall,
        )
        this.callbackExecutor = callbackExecutor
        current = tracker
        return tracker
    }

    private fun tracker(): ReferalliTracker =
        current ?: throw IllegalStateException("Referalli.configure(publishableKey) has not been called")

    /** Captures the referral from an app link and records the visit in the background. */
    @JvmStatic
    fun handleDeepLink(url: String): ReferalliReferral? {
        val t = current ?: return null
        val captured = t.handleDeepLink(url) ?: return null
        worker.execute { runCatching { t.reportVisit(captured, url) } }
        return captured
    }

    /** Sets the referral from a code the user typed and records the visit in the background. */
    @JvmStatic
    fun setReferral(code: String): ReferalliReferral? {
        val t = current ?: return null
        val referral = t.setReferral(code)
        worker.execute { runCatching { t.reportVisit(referral) } }
        return referral
    }

    /** Looks up the referral in the background. The callback gets null when not referred. */
    @JvmStatic
    fun getReferral(callback: ReferalliCallback<ReferalliReferral>) = async(callback) { tracker().getReferral() }

    /** Runs the deferred resolver (for apps that turned `deferredResolution` off until consent). */
    @JvmStatic
    fun resolveDeferred(callback: ReferalliCallback<ReferalliReferral>) = async(callback) { tracker().resolveDeferred() }

    @JvmStatic
    @JvmOverloads
    fun trackSignup(
        customerRef: String,
        emailHash: String? = null,
        callback: ReferalliCallback<ReferalliSignupResult> = ReferalliCallback { _, _ -> },
    ) = async(callback) { tracker().trackSignup(customerRef, emailHash) }

    private fun <T> async(callback: ReferalliCallback<T>, block: () -> T?) {
        val deliver = callbackExecutor
        worker.execute {
            val outcome = runCatching(block)
            deliver.execute { callback.onResult(outcome.getOrNull(), outcome.exceptionOrNull()) }
        }
    }
}

// ---------------------------------------------------------------------------
// Tiny JSON (flat objects of strings / booleans / numbers / null), kept private so
// the tracker has no dependency and works on any JVM or Android.

private fun trackerJson(map: Map<String, String>): String =
    map.entries.joinToString(",", "{", "}") { (k, v) -> "${trackerQuote(k)}:${trackerQuote(v)}" }

private fun trackerQuote(s: String): String = buildString(s.length + 2) {
    append('"')
    for (c in s) {
        when {
            c == '"' -> append("\\\"")
            c == '\\' -> append("\\\\")
            c == '\n' -> append("\\n")
            c == '\r' -> append("\\r")
            c == '\t' -> append("\\t")
            c < ' ' -> append("\\u%04x".format(c.code))
            else -> append(c)
        }
    }
    append('"')
}

/** Parses the top level of a JSON object; nested values are skipped (returned as null). */
private fun parseTrackerJson(text: String): Map<String, Any?> {
    val p = TrackerJsonCursor(text)
    p.ws(); p.expect('{')
    val out = LinkedHashMap<String, Any?>()
    p.ws()
    if (p.peek() == '}') return out
    while (true) {
        p.ws(); val key = p.string(); p.ws(); p.expect(':'); p.ws()
        out[key] = p.value()
        p.ws()
        when (p.next()) {
            ',' -> continue
            '}' -> return out
            else -> throw IllegalArgumentException("bad JSON at ${p.i}")
        }
    }
}

private class TrackerJsonCursor(val s: String) {
    var i = 0
    fun peek(): Char = if (i < s.length) s[i] else '\u0000'
    fun next(): Char = if (i < s.length) s[i++] else throw IllegalArgumentException("unexpected end of JSON")
    fun ws() { while (i < s.length && s[i].isWhitespace()) i++ }
    fun expect(c: Char) { if (next() != c) throw IllegalArgumentException("expected '$c' at ${i - 1}") }

    fun value(): Any? = when (val c = peek()) {
        '"' -> string()
        '{', '[' -> { skipNested(); null }
        't' -> { literal("true"); true }
        'f' -> { literal("false"); false }
        'n' -> { literal("null"); null }
        else -> if (c == '-' || c.isDigit()) number() else throw IllegalArgumentException("bad JSON value at $i")
    }

    fun string(): String {
        expect('"')
        val sb = StringBuilder()
        while (true) {
            when (val c = next()) {
                '"' -> return sb.toString()
                '\\' -> when (val e = next()) {
                    'n' -> sb.append('\n'); 't' -> sb.append('\t'); 'r' -> sb.append('\r')
                    'b' -> sb.append('\b'); 'f' -> sb.append('\u000C')
                    'u' -> { sb.append(s.substring(i, i + 4).toInt(16).toChar()); i += 4 }
                    else -> sb.append(e)
                }
                else -> sb.append(c)
            }
        }
    }

    private fun number(): Double {
        val start = i
        while (i < s.length && (s[i].isDigit() || s[i] in "+-.eE")) i++
        return s.substring(start, i).toDouble()
    }

    private fun literal(word: String) {
        if (!s.startsWith(word, i)) throw IllegalArgumentException("bad JSON literal at $i")
        i += word.length
    }

    private fun skipNested() {
        var depth = 0
        while (true) {
            when (peek()) {
                '"' -> { string(); continue }
                '{', '[' -> depth++
                '}', ']' -> depth--
            }
            next()
            if (depth == 0) return
        }
    }
}
