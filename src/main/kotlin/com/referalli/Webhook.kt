package com.referalli

import java.security.MessageDigest
import java.util.Base64
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import kotlin.math.abs

/** A webhook delivery: the envelope every topic shares, plus its payload typed by topic. */
data class WebhookEvent(
    val id: String,
    val topic: String,
    val orgId: String?,
    val livemode: Boolean,
    val createdAt: String?,
    /** The raw payload. */
    val data: JsonValue,
    /** The payload decoded as its topic's type ([WebhookPayload.Unknown] for a topic this SDK predates). */
    val payload: WebhookPayload,
)

/**
 * Verifies and parses Referalli webhook deliveries (Standard Webhooks signatures).
 *
 * The signature is `v1,` + base64 HMAC-SHA256 of `{webhook-id}.{webhook-timestamp}.{raw body}`,
 * keyed with the base64 after `whsec_`. It is compared in constant time, and deliveries more than
 * `toleranceSec` (default 300) from now, in either direction, are rejected.
 */
object ReferalliWebhook {
    const val TOLERANCE_SEC = 300L

    /**
     * True when [rawBody] (exactly as received) was signed with one of [secrets] within the
     * tolerance. [headers] may use any case. Pass two secrets while you rotate one.
     */
    @JvmStatic
    @JvmOverloads
    fun verify(
        rawBody: String,
        headers: Map<String, String>,
        secrets: List<String>,
        nowEpochSeconds: Long = System.currentTimeMillis() / 1000,
        toleranceSec: Long = TOLERANCE_SEC,
    ): Boolean = problem(rawBody, headers, secrets, nowEpochSeconds, toleranceSec) == null

    /** Verifies a delivery and returns its event, typed by topic. Throws [WebhookVerificationException]. */
    @JvmStatic
    @JvmOverloads
    fun constructEvent(
        rawBody: String,
        headers: Map<String, String>,
        secrets: List<String>,
        nowEpochSeconds: Long = System.currentTimeMillis() / 1000,
        toleranceSec: Long = TOLERANCE_SEC,
    ): WebhookEvent {
        problem(rawBody, headers, secrets, nowEpochSeconds, toleranceSec)?.let { throw WebhookVerificationException(it) }
        val json = try {
            JsonValue.parse(rawBody)
        } catch (e: JsonException) {
            throw WebhookVerificationException("the body is not JSON: ${e.message}")
        }
        val fields = (json as? JsonValue.Obj)?.fields ?: throw WebhookVerificationException("the body is not a webhook event")
        val topic = (fields["topic"] as? JsonValue.Str)?.value ?: throw WebhookVerificationException("the body is not a webhook event")
        val data = fields["data"] ?: JsonValue.Null
        val payload = try {
            WebhookPayload.decode(topic, data)
        } catch (e: RuntimeException) {
            WebhookPayload.Unknown(topic, data)
        }
        return WebhookEvent(
            id = (fields["id"] as? JsonValue.Str)?.value ?: "",
            topic = topic,
            orgId = (fields["orgId"] as? JsonValue.Str)?.value,
            livemode = (fields["livemode"] as? JsonValue.Bool)?.value ?: true,
            createdAt = (fields["createdAt"] as? JsonValue.Str)?.value,
            data = data,
            payload = payload,
        )
    }

    private fun problem(rawBody: String, headers: Map<String, String>, secrets: List<String>, now: Long, toleranceSec: Long): String? {
        val lower = headers.mapKeys { it.key.lowercase() }
        val id = lower["webhook-id"]
        val ts = lower["webhook-timestamp"]
        val sig = lower["webhook-signature"]
        if (id.isNullOrEmpty() || ts.isNullOrEmpty() || sig.isNullOrEmpty()) return "missing webhook-id, webhook-timestamp or webhook-signature header"
        if (!ts.all { it in '0'..'9' }) return "webhook-timestamp is not a unix timestamp"
        val seconds = ts.toLongOrNull() ?: return "webhook-timestamp is not a unix timestamp"
        if (abs(now - seconds) > toleranceSec) return "webhook-timestamp is outside the tolerance (replayed or clock skew)"
        val provided = sig.split(" ").filter { it.startsWith("v1,") }
        val message = "$id.$ts.$rawBody".toByteArray(Charsets.UTF_8)
        for (secret in secrets) {
            val key = if (secret.startsWith("whsec_")) {
                try {
                    Base64.getDecoder().decode(secret.removePrefix("whsec_"))
                } catch (e: IllegalArgumentException) {
                    secret.toByteArray(Charsets.UTF_8)
                }
            } else {
                secret.toByteArray(Charsets.UTF_8)
            }
            val mac = Mac.getInstance("HmacSHA256").apply { init(SecretKeySpec(key, "HmacSHA256")) }
            val expected = "v1," + Base64.getEncoder().encodeToString(mac.doFinal(message))
            if (provided.any { MessageDigest.isEqual(it.toByteArray(), expected.toByteArray()) }) return null
        }
        return "no signature matches the secret"
    }
}
