package com.referalli

/** One HTTP request the API client sends. [timeoutMillis] bounds the whole attempt. */
data class HttpRequestData(
    val method: String,
    val url: String,
    val headers: Map<String, String>,
    val body: String?,
    val timeoutMillis: Long,
)

/** The response to an [HttpRequestData]. Header names are lowercase. */
data class HttpResponseData(
    val status: Int,
    val headers: Map<String, List<String>>,
    val body: String,
) {
    fun header(name: String): String? = headers[name.lowercase()]?.firstOrNull()
}

/**
 * The API client's HTTP seam. The JVM default ([JavaHttpTransport], in JavaHttpTransport.kt) uses
 * java.net.http; supply another (OkHttp, Ktor, HttpURLConnection on Android, a test double) through
 * `ReferalliClient(transport = ...)`. Throw an [java.io.IOException] for a network failure or
 * timeout: the client retries those for idempotent requests.
 */
fun interface HttpTransport {
    suspend fun execute(request: HttpRequestData): HttpResponseData
}
