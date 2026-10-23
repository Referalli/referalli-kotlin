// Code generated from the Referalli OpenAPI document. DO NOT EDIT.
// Changes belong in the generator, which overwrites this file.

package com.referalli

/** `validation_error` (HTTP 400). */
class ValidationError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `mode_mismatch` (HTTP 400). */
class ModeMismatchError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `bad_request` (HTTP 400). */
class BadRequestError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `unauthorized` (HTTP 401). */
class AuthenticationError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `step_up_required` (HTTP 401). */
class StepUpRequiredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `payment_required` (HTTP 402). */
class PaymentRequiredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `forbidden` (HTTP 403). */
class PermissionDeniedError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `webhooks_disabled` (HTTP 403). */
class WebhooksDisabledError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `sso_required` (HTTP 403). */
class SsoRequiredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `access_suspended` (HTTP 403). */
class AccessSuspendedError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `not_found` (HTTP 404). */
class NotFoundError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `conflict` (HTTP 409). */
class ConflictError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `idempotency_in_progress` (HTTP 409). */
class IdempotencyInProgressError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `replay` (HTTP 409). */
class ReplayError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `live_mode_only` (HTTP 409). */
class LiveModeOnlyError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `test_mode_only` (HTTP 409). */
class TestModeOnlyError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `test_mode_unsupported` (HTTP 409). */
class TestModeUnsupportedError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `gone` (HTTP 410). */
class GoneError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `idempotency_key_reused` (HTTP 422). */
class IdempotencyKeyReusedError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `payload_too_large` (HTTP 413). */
class PayloadTooLargeError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `connection_paused` (HTTP 423). */
class ConnectionPausedError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `rate_limited` (HTTP 429). */
class RateLimitedError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `internal_error` (HTTP 500). */
class InternalServerError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `atlas_error` (HTTP 502). */
class AtlasError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `sso_provider_error` (HTTP 502). */
class SsoProviderError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `sso_not_configured` (HTTP 503). */
class SsoNotConfiguredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

internal fun apiException(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?): ApiException =
    when (code) {
        "validation_error" -> ValidationError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "mode_mismatch" -> ModeMismatchError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "bad_request" -> BadRequestError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "unauthorized" -> AuthenticationError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "step_up_required" -> StepUpRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "payment_required" -> PaymentRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "forbidden" -> PermissionDeniedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "webhooks_disabled" -> WebhooksDisabledError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "sso_required" -> SsoRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "access_suspended" -> AccessSuspendedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "not_found" -> NotFoundError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "conflict" -> ConflictError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "idempotency_in_progress" -> IdempotencyInProgressError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "replay" -> ReplayError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "live_mode_only" -> LiveModeOnlyError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "test_mode_only" -> TestModeOnlyError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "test_mode_unsupported" -> TestModeUnsupportedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "gone" -> GoneError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "idempotency_key_reused" -> IdempotencyKeyReusedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "payload_too_large" -> PayloadTooLargeError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "connection_paused" -> ConnectionPausedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "rate_limited" -> RateLimitedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "internal_error" -> InternalServerError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "atlas_error" -> AtlasError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "sso_provider_error" -> SsoProviderError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "sso_not_configured" -> SsoNotConfiguredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        else -> ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
    }
