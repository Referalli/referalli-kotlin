# Referalli Kotlin SDK

The official Kotlin/JVM client for the [Referalli](https://referalli.com) API: attribution-first affiliate and referral programs.

- One typed `suspend` function per API operation, with data classes for every model; a blocking twin (`client.blocking`) for code without coroutines.
- Retries with backoff, idempotency keys, timeouts, `Flow`/`Sequence` auto-paging and one exception class per error code.
- Webhook signature verification and typed webhook payloads.
- A pluggable HTTP transport (`HttpTransport`); the JVM default uses `java.net.http`. JVM 17+.

Docs: <https://referalli.com/docs>. For Android apps, use `com.referalli:referalli-android` (the app tracker); keep API keys on your server.

## Install

```kotlin
// build.gradle.kts
dependencies {
    implementation("com.referalli:referalli-kotlin:0.1.0")
}
```

## Quickstart

Keep the `rk_` API key on your server. (These samples are compiled from `src/conformance/kotlin/ReadmeSamples.kt`.)

```kotlin
import com.referalli.*

suspend fun quickstart() {
    val client = ReferalliClient(apiKey = System.getenv("REFERALLI_API_KEY"))

    // 1. Create a referral link for a partner
    val link = client.postLinks(
        PostLinksBody(programId = "prg_123", partnerId = "ptr_123", destinationUrl = "https://example.com/pricing"),
    )
    println(link.shortUrl)

    // 2. Attribute a signup to the partner who referred it
    client.postReferralsAssociate(PostReferralsAssociateBody(programId = "prg_123", customerRef = "user_42", anonId = "anon_from_cookie"))

    // 3. Track a conversion: a purchase your server has validated
    client.postMobilePurchases(PostMobilePurchasesBody(eventId = "order_1001", customerRef = "user_42", amountMinor = 4900, currency = "usd"))
}
```

Without coroutines, use the blocking twin:

```kotlin
val client = ReferalliClient(apiKey = System.getenv("REFERALLI_API_KEY")).blocking
val link = client.postLinks(PostLinksBody(programId = "prg_123", partnerId = "ptr_123", destinationUrl = "https://example.com/pricing"))
for (partner in client.getPartnersEach(status = "active")) println(partner.email)
```

Verify a webhook delivery (pass the raw body exactly as received):

```kotlin
fun handleWebhook(rawBody: String, headers: Map<String, String>): Int {
    val event = try {
        ReferalliWebhook.constructEvent(rawBody, headers, listOf(System.getenv("REFERALLI_WEBHOOK_SECRET")))
    } catch (e: WebhookVerificationException) {
        return 400
    }
    when (val payload = event.payload) {
        is WebhookPayload.CommissionEarned -> println("commission ${payload.data}")
        else -> Unit
    }
    return 204
}
```

## Configuration

```kotlin
val client = ReferalliClient(
    apiKey = "rk_live_...",
    baseUrl = "https://referalli.com", // the default
    timeoutMillis = 30_000,            // per attempt
    maxRetries = 3,                    // retries for idempotent requests
    mode = ReferalliClient.Mode.LIVE,  // optional: assert the key's mode
)
val fast = client.withOptions(timeoutMillis = 5_000, maxRetries = 0)
```

Requests are pinned to `ReferalliVersion.API`; pass `apiVersion` to pin another.

### HTTP transport

`ReferalliClient(transport = ...)` takes any `HttpTransport` (a `fun interface` with one `suspend fun execute(HttpRequestData): HttpResponseData`). Throw an `IOException` for network failures and timeouts so the client can retry them. The default, `JavaHttpTransport`, uses `java.net.http.HttpClient`.

### Test mode

Use a test-mode key (`rk_test_...`) to work against your organization's test data. `mode = ReferalliClient.Mode.TEST` makes every request assert it: the API rejects a request whose key is in the other mode with `ModeMismatchError`. Webhook events carry `livemode`.

## Errors

Every API error throws a subclass of `ApiException` named after its code (`ValidationError`, `NotFoundError`, `RateLimitedError`, ...), with `status`, `code`, `apiMessage`, `requestId`, `docsUrl`, `details` and `retryAfter`. Network failures and timeouts throw `ApiConnectionException` after the retries run out. All of them extend `ReferalliException`.

```kotlin
try {
    client.getPartnersId(id = "ptr_missing")
} catch (e: NotFoundError) {
    println("${e.code} ${e.status} ${e.requestId} ${e.docsUrl}")
} catch (e: RateLimitedError) {
    println("retry after ${e.retryAfter}")
} catch (e: ApiException) {
    println("${e.code}: ${e.apiMessage}")
}
```

Retries: GET, PUT and DELETE requests, and writes carrying an `Idempotency-Key`, are retried on 429, 5xx and network errors with exponential backoff and jitter, honoring `Retry-After`. POST and PATCH requests always carry a key (generated unless you pass `idempotencyKey`), reused across retries, so a retried write is applied once.

## Pagination

List functions return one `Page<T>`; their `Each` twin follows the cursor: a cold `Flow<T>` on the suspend client, a lazy `Sequence<T>` on `client.blocking`.

```kotlin
val page = client.getPartners(status = "active", limit = 50)
client.getPartners(status = "active", limit = 50, startingAfter = page.nextCursor)

client.getReferralsEach().collect { referral -> println(referral.id) }
```

## Webhooks

`ReferalliWebhook.constructEvent(rawBody, headers, secrets)` checks the Standard Webhooks signature (`webhook-id`, `webhook-timestamp`, `webhook-signature`) in constant time, rejects deliveries more than 5 minutes old or ahead (`toleranceSec`), and returns a `WebhookEvent` whose `payload` is a `WebhookPayload` subclass per topic (`ReferralCreated`, `CommissionEarned`, ...; topic names are constants on `WebhookTopic`). Pass two secrets while you rotate one. `ReferalliWebhook.verify(...)` returns a `Boolean` instead of throwing.

## Any operation by id

```kotlin
val partner = client.call("getPartnersId", path = mapOf("id" to "ptr_123"))
val partners = client.listAll("getPartners", query = mapOf("status" to JsonValue.Str("active"))).toList()
```

## Versioning

This library follows semantic versioning; see [CHANGELOG.md](./CHANGELOG.md).

## License

MIT. See [LICENSE](./LICENSE).
