package com.referalli

import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import kotlin.math.min
import kotlin.math.pow
import kotlin.random.Random
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

/**
 * Server-side client for the Referalli API. Keep the `rk_` key on your server.
 *
 * Every operation is a `suspend` function named after its operationId (`postLinks`, `getPartners`,
 * ...); [blocking] has the same functions for code without coroutines. Writes carry an
 * `Idempotency-Key` (generated unless you pass `idempotencyKey`) that is reused across retries.
 * Idempotent requests are retried on 429, 5xx and network errors with exponential backoff and
 * jitter, honoring `Retry-After`. Requests are pinned to [ReferalliVersion.API].
 *
 * [mode] (`Mode.TEST` or `Mode.LIVE`) asserts the key's mode on every request: the API refuses a
 * request whose key is in the other mode.
 */
class ReferalliClient(
    val apiKey: String?,
    val baseUrl: String = DEFAULT_BASE_URL,
    /** Milliseconds each attempt may take. */
    val timeoutMillis: Long = 30_000,
    val maxRetries: Int = 3,
    val retryBaseDelaySeconds: Double = 0.5,
    val apiVersion: String = ReferalliVersion.API,
    val mode: Mode? = null,
    private val transport: HttpTransport = defaultTransport(baseUrl),
) {
    /** The API key mode a client can assert. */
    enum class Mode(val wire: String) { TEST("test"), LIVE("live") }

    companion object {
        const val DEFAULT_BASE_URL = "https://referalli.com"
        private val RETRY_STATUSES = setOf(429, 500, 502, 503, 504)

        /** Methods that are safe to retry without an idempotency key. */
        private val IDEMPOTENT_METHODS = setOf("GET", "HEAD", "PUT", "DELETE", "OPTIONS")

        /** Writes that get a generated Idempotency-Key when you don't pass one. */
        private val KEYED_METHODS = setOf("POST", "PATCH")
        private const val MAX_RETRY_DELAY_SECONDS = 30.0
    }

    /** The same operations as blocking calls (each runs on the calling thread). */
    val blocking: ReferalliBlockingClient by lazy { ReferalliBlockingClient(this) }

    /** A copy of this client with some settings changed (sharing its transport). */
    fun withOptions(
        timeoutMillis: Long = this.timeoutMillis,
        maxRetries: Int = this.maxRetries,
        retryBaseDelaySeconds: Double = this.retryBaseDelaySeconds,
        apiVersion: String = this.apiVersion,
        mode: Mode? = this.mode,
    ): ReferalliClient = ReferalliClient(apiKey, baseUrl, timeoutMillis, maxRetries, retryBaseDelaySeconds, apiVersion, mode, transport)

    internal fun segment(value: String): String = encode(value)

    private fun encode(value: String): String = URLEncoder.encode(value, StandardCharsets.UTF_8.name()).replace("+", "%20")

    internal fun headersFor(method: String, hasBody: Boolean, idempotencyKey: String?): Map<String, String> = buildMap {
        put("accept", "application/json")
        // Wire protocol: the API reads these header names.
        put("referalli-version", apiVersion)
        mode?.let { put("referalli-mode", it.wire) }
        put("user-agent", "referalli-kotlin/${ReferalliVersion.SDK}")
        apiKey?.let { put("authorization", "Bearer $it") }
        if (hasBody) put("content-type", "application/json")
        val key = idempotencyKey ?: if (method in KEYED_METHODS) UUID.randomUUID().toString() else null
        key?.let { put("idempotency-key", it) }
    }

    /** Only idempotent requests are retried: safe methods, or writes that carry an idempotency key. */
    internal fun retryable(method: String, headers: Map<String, String>): Boolean =
        method in IDEMPOTENT_METHODS || headers.containsKey("idempotency-key")

    internal suspend fun send(method: String, path: String, query: List<Pair<String, String?>>, body: JsonValue?, idempotencyKey: String?, kind: String): JsonValue {
        val qs = query.filter { it.second != null }.joinToString("&") { "${encode(it.first)}=${encode(it.second!!)}" }
        val url = baseUrl.trimEnd('/') + path + if (qs.isEmpty()) "" else "?$qs"
        val headers = headersFor(method, body != null, idempotencyKey)
        val request = HttpRequestData(method, url, headers, body?.stringify(), timeoutMillis)
        val canRetry = retryable(method, headers)

        var attempt = 0
        while (true) {
            val response = try {
                transport.execute(request)
            } catch (e: java.io.IOException) {
                if (canRetry && attempt < maxRetries) {
                    sleep(delaySeconds(attempt, null))
                    attempt++
                    continue
                }
                throw ApiConnectionException(e)
            }
            val status = response.status
            val text = response.body
            if (status in 200..299) {
                return when {
                    kind == "text" -> JsonValue.Str(text)
                    kind == "empty" || text.isEmpty() -> JsonValue.Null
                    else -> JsonValue.parse(text)
                }
            }
            val retryAfter = parseRetryAfter(response.header("retry-after"))
            if (status in RETRY_STATUSES && canRetry && attempt < maxRetries) {
                sleep(delaySeconds(attempt, retryAfter))
                attempt++
                continue
            }
            throw toApiException(status, text, response.header("x-request-id"), retryAfter)
        }
    }

    /** Exponential backoff with jitter; `Retry-After` wins when the server sends it. */
    private fun delaySeconds(attempt: Int, retryAfter: Double?): Double =
        retryAfter?.coerceIn(0.0, MAX_RETRY_DELAY_SECONDS)
            ?: (min(retryBaseDelaySeconds * 2.0.pow(attempt), MAX_RETRY_DELAY_SECONDS) * (0.5 + Random.nextDouble() * 0.5))

    private suspend fun sleep(seconds: Double) {
        if (seconds > 0) delay((seconds * 1000).toLong())
    }

    private fun parseRetryAfter(value: String?): Double? {
        if (value.isNullOrEmpty()) return null
        value.toDoubleOrNull()?.let { return it }
        return try {
            val at = ZonedDateTime.parse(value, DateTimeFormatter.RFC_1123_DATE_TIME).toEpochSecond()
            (at - System.currentTimeMillis() / 1000.0).coerceAtLeast(0.0)
        } catch (e: Exception) {
            null
        }
    }

    private fun toApiException(status: Int, text: String, requestIdHeader: String?, retryAfter: Double?): ApiException {
        val err = try {
            JsonValue.parse(text)["error"] as? JsonValue.Obj
        } catch (e: JsonException) {
            null
        }
        val code = err?.get("code")?.orNull()?.let { (it as? JsonValue.Str)?.value } ?: "http_error"
        val message = (err?.get("message") as? JsonValue.Str)?.value ?: text.ifEmpty { "HTTP $status" }
        val requestId = (err?.get("requestId") as? JsonValue.Str)?.value ?: requestIdHeader
        val docsUrl = (err?.get("docs_url") as? JsonValue.Str)?.value
        return apiException(status, code, message, requestId, docsUrl, err?.get("details"), retryAfter)
    }

    internal fun <T> paginate(fetch: suspend (String?) -> Page<T>): Flow<T> = flow {
        var cursor: String? = null
        while (true) {
            val page = fetch(cursor)
            for (item in page.data) emit(item)
            val next = page.nextCursor
            if (!page.hasMore || next.isNullOrEmpty()) break
            cursor = next
        }
    }

    /** Every item of a list operation (by id), following `next_cursor`. */
    fun listAll(operationId: String, path: Map<String, String> = emptyMap(), query: Map<String, JsonValue> = emptyMap()): Flow<JsonValue> = flow {
        val q = query.toMutableMap()
        while (true) {
            val page = call(operationId, path, q).obj()
            for (item in page.getValue("data").array()) emit(item)
            val next = page["next_cursor"]?.orNull()?.string()
            if (page["has_more"]?.bool() != true || next.isNullOrEmpty()) break
            q["starting_after"] = JsonValue.Str(next)
        }
    }
}

/**
 * Blocking twin of [ReferalliClient] (`client.blocking`): the same functions, run with
 * `runBlocking` on the calling thread, and `Each` functions that return a lazy [Sequence].
 */
class ReferalliBlockingClient(val client: ReferalliClient) {
    internal fun <T> paginate(fetch: (String?) -> Page<T>): Sequence<T> = sequence {
        var cursor: String? = null
        while (true) {
            val page = fetch(cursor)
            yieldAll(page.data)
            val next = page.nextCursor
            if (!page.hasMore || next.isNullOrEmpty()) break
            cursor = next
        }
    }

    /** Calls any operation by its id; JSON in, JSON out. */
    fun call(operationId: String, path: Map<String, String> = emptyMap(), query: Map<String, JsonValue> = emptyMap(), body: JsonValue? = null, idempotencyKey: String? = null): JsonValue =
        runBlocking { client.call(operationId, path, query, body, idempotencyKey) }

    /** Every item of a list operation (by id), following `next_cursor`, one request per page. */
    fun listAll(operationId: String, path: Map<String, String> = emptyMap(), query: Map<String, JsonValue> = emptyMap()): Sequence<JsonValue> = sequence {
        val q = query.toMutableMap()
        while (true) {
            val page = call(operationId, path, q).obj()
            yieldAll(page.getValue("data").array())
            val next = page["next_cursor"]?.orNull()?.string()
            if (page["has_more"]?.bool() != true || next.isNullOrEmpty()) break
            q["starting_after"] = JsonValue.Str(next)
        }
    }
}

/** One page of a list: pass [nextCursor] as `startingAfter` for the next. */
data class Page<T>(val `object`: String, val data: List<T>, val hasMore: Boolean, val nextCursor: String?) {
    fun toJson(encode: (T) -> JsonValue): JsonValue = JsonValue.Obj(
        mapOf(
            "object" to JsonValue.Str(`object`),
            "data" to JsonValue.Arr(data.map(encode)),
            "has_more" to JsonValue.Bool(hasMore),
            "next_cursor" to (nextCursor?.let { JsonValue.Str(it) } ?: JsonValue.Null),
        ),
    )

    companion object {
        fun <T> fromJson(json: JsonValue, decode: (JsonValue) -> T): Page<T> {
            val o = json.obj()
            return Page(
                o["object"]?.orNull()?.string() ?: "list",
                o.getValue("data").array().map(decode),
                o["has_more"]?.bool() ?: false,
                o["next_cursor"]?.orNull()?.string(),
            )
        }
    }
}

/** Base class for every exception this SDK throws. */
open class ReferalliException(message: String, cause: Throwable? = null) : RuntimeException(message, cause)

/** The API could not be reached (network error or timeout), after retries. */
class ApiConnectionException(cause: Throwable) : ReferalliException("could not reach the Referalli API: ${cause.message}", cause)

/** A webhook delivery failed signature or timestamp verification, or isn't a JSON event. */
class WebhookVerificationException(message: String) : ReferalliException(message)

/** The API answered with an error. [code] is stable; [docsUrl] explains it. */
open class ApiException(
    val status: Int,
    val code: String,
    val apiMessage: String,
    val requestId: String?,
    val docsUrl: String?,
    val details: JsonValue?,
    val retryAfter: Double?,
) : ReferalliException("$code ($status): $apiMessage")
