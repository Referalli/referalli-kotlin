package com.referalli

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration
import kotlinx.coroutines.future.await

/**
 * The JVM default [HttpTransport], on java.net.http (JDK 11+). This file is the only one that uses
 * java.net.http: an Android build swaps it for its own `defaultTransport()`.
 *
 * HTTP/2 over TLS (ALPN); HTTP/1.1 for plain http://, where the JDK would otherwise send an
 * `Upgrade: h2c` request that many servers (Node's included) don't answer.
 */
class JavaHttpTransport(private val client: HttpClient) : HttpTransport {
    constructor(baseUrl: String) : this(
        HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(30))
            .version(if (baseUrl.startsWith("https://")) HttpClient.Version.HTTP_2 else HttpClient.Version.HTTP_1_1)
            .build(),
    )

    override suspend fun execute(request: HttpRequestData): HttpResponseData {
        val builder = HttpRequest.newBuilder(URI.create(request.url)).timeout(Duration.ofMillis(request.timeoutMillis))
        request.headers.forEach { (k, v) -> builder.header(k, v) }
        val publisher = request.body?.let { HttpRequest.BodyPublishers.ofString(it) } ?: HttpRequest.BodyPublishers.noBody()
        val response = try {
            client.sendAsync(builder.method(request.method, publisher).build(), HttpResponse.BodyHandlers.ofString()).await()
        } catch (e: java.util.concurrent.CompletionException) {
            throw (e.cause as? java.io.IOException) ?: java.io.IOException(e.cause ?: e)
        }
        val headers = response.headers().map().mapKeys { it.key.lowercase() }
        return HttpResponseData(response.statusCode(), headers, response.body() ?: "")
    }
}

/** The transport a client uses when none is given. */
internal fun defaultTransport(baseUrl: String): HttpTransport = JavaHttpTransport(baseUrl)
