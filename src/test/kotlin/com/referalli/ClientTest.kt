package com.referalli

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertTrue
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking

private const val PARTNER = """{"id":"ptr_1","email":"a@example.com","displayName":"A","externalRef":null,"status":"active","tags":[],"notes":null,"createdAt":"2026-10-21T12:00:00Z"}"""

/** A transport that answers from a queue and records requests. */
private class FakeTransport(vararg responses: HttpResponseData) : HttpTransport {
    val queue = ArrayDeque(responses.toList())
    val seen = mutableListOf<HttpRequestData>()
    override suspend fun execute(request: HttpRequestData): HttpResponseData {
        seen += request
        return queue.removeFirst()
    }
}

private fun ok(body: String) = HttpResponseData(200, emptyMap(), body)

class ClientTest {
    private fun client(t: HttpTransport) =
        ReferalliClient(apiKey = "rk_test_1", baseUrl = "http://mock", retryBaseDelaySeconds = 0.001, mode = ReferalliClient.Mode.TEST, transport = t)

    @Test
    fun postRetriesWithTheSameIdempotencyKey(): Unit = runBlocking {
        val t = FakeTransport(
            HttpResponseData(429, mapOf("retry-after" to listOf("0")), """{"error":{"code":"rate_limited","message":"slow"}}"""),
            ok(PARTNER),
        )
        val partner = client(t).postPartners(PostPartnersBody(email = "a@example.com"))
        assertEquals("ptr_1", partner.id)
        assertEquals(2, t.seen.size)
        val first = t.seen[0].headers
        assertEquals(first["idempotency-key"], t.seen[1].headers["idempotency-key"])
        assertEquals("test", first["referalli-mode"])
        assertEquals("referalli-kotlin/${ReferalliVersion.SDK}", first["user-agent"])
    }

    @Test
    fun typedErrorsAreNotRetried() {
        val t = FakeTransport(HttpResponseData(404, emptyMap(), """{"error":{"code":"not_found","message":"nope","requestId":"req_1"}}"""))
        val e = assertFailsWith<NotFoundError> { client(t).blocking.getPartnersId(id = "ptr x/y") }
        assertEquals("req_1", e.requestId)
        assertEquals(1, t.seen.size)
        assertEquals("http://mock/v1/partners/ptr%20x%2Fy", t.seen[0].url)
    }

    @Test
    fun unkeyedWritesAreNotRetried() {
        val c = client(FakeTransport())
        assertTrue(c.retryable("GET", emptyMap()))
        assertTrue(!c.retryable("POST", emptyMap()))
        assertTrue(c.headersFor("PATCH", true, null).containsKey("idempotency-key"))
        assertTrue(!c.headersFor("GET", false, null).containsKey("idempotency-key"))
    }

    @Test
    fun eachFollowsTheCursor(): Unit = runBlocking {
        val t = FakeTransport(
            ok("""{"object":"list","data":[$PARTNER],"has_more":true,"next_cursor":"ptr_1"}"""),
            ok("""{"object":"list","data":[${PARTNER.replace("ptr_1", "ptr_2")}],"has_more":false,"next_cursor":null}"""),
        )
        val ids = client(t).getPartnersEach(limit = 1).toList().map { it.id }
        assertEquals(listOf("ptr_1", "ptr_2"), ids)
        assertTrue(t.seen[1].url.contains("starting_after=ptr_1"))
    }

    @Test
    fun webhookVectorsAndConstructEvent() {
        val vectors = JsonValue.parse(javaClass.getResource("/vectors.json")!!.readText()).obj().getValue("cases").array()
        for (v in vectors) {
            val o = v.obj()
            val got = ReferalliWebhook.verify(
                o.getValue("body").string(),
                o.getValue("headers").obj().mapValues { it.value.string() },
                o.getValue("secrets").array().map { it.string() },
                o.getValue("now").long(),
            )
            assertEquals(o.getValue("valid").bool(), got, o.getValue("name").string())
        }
        val first = vectors.first().obj()
        val event = ReferalliWebhook.constructEvent(
            first.getValue("body").string(),
            first.getValue("headers").obj().mapValues { it.value.string() },
            first.getValue("secrets").array().map { it.string() },
            first.getValue("now").long(),
        )
        assertEquals(WebhookTopic.REFERRAL_CREATED, event.topic)
        // The shared vector's data is partial (only partnerId), so it decodes to the Unknown fallback.
        assertIs<WebhookPayload.Unknown>(event.payload)
        // A complete referral.created payload decodes to its typed class.
        val full = JsonValue.parse(
            """{"referralId":"ref_1","programId":"prg_1","partnerId":"ptr_1","customerRef":"cus_1","status":"pending","matchedVia":"link"}""",
        )
        assertIs<WebhookPayload.ReferralCreated>(WebhookPayload.decode("referral.created", full))
        assertFailsWith<WebhookVerificationException> {
            ReferalliWebhook.constructEvent(first.getValue("body").string(), emptyMap(), listOf("whsec_x"))
        }
    }
}
