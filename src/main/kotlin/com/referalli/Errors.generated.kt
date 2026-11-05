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

/** `invalid_handoff_token` (HTTP 400). */
class InvalidHandoffTokenError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `unauthorized` (HTTP 401). */
class AuthenticationError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `step_up_required` (HTTP 401). */
class StepUpRequiredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `reauth_required` (HTTP 401). */
class ReauthRequiredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
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

/** `program_scoped_key` (HTTP 403). */
class ProgramScopedKeyError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `restricted_session` (HTTP 403). */
class RestrictedSessionError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `not_found` (HTTP 404). */
class NotFoundError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `not_enrolled` (HTTP 404). */
class NotEnrolledError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `conflict` (HTTP 409). */
class ConflictError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `idempotency_in_progress` (HTTP 409). */
class IdempotencyInProgressError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `stripe_key_required` (HTTP 409). */
class StripeKeyRequiredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `credit_credentials_required` (HTTP 409). */
class CreditCredentialsRequiredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `api_key_expired` (HTTP 409). */
class ApiKeyExpiredError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
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

/** `stripe_key_invalid` (HTTP 422). */
class StripeKeyInvalidError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `stripe_key_wrong_mode` (HTTP 422). */
class StripeKeyWrongModeError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `stripe_key_permission` (HTTP 422). */
class StripeKeyPermissionError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `provider_credentials_invalid` (HTTP 422). */
class ProviderCredentialsInvalidError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `provider_credentials_wrong_mode` (HTTP 422). */
class ProviderCredentialsWrongModeError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `provider_permission` (HTTP 422). */
class ProviderPermissionError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
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

/** `stripe_unavailable` (HTTP 502). */
class StripeUnavailableError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
    ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)

/** `provider_unavailable` (HTTP 502). */
class ProviderUnavailableError(status: Int, code: String, apiMessage: String, requestId: String?, docsUrl: String?, details: JsonValue?, retryAfter: Double?) :
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
        "invalid_handoff_token" -> InvalidHandoffTokenError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "unauthorized" -> AuthenticationError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "step_up_required" -> StepUpRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "reauth_required" -> ReauthRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "payment_required" -> PaymentRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "forbidden" -> PermissionDeniedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "webhooks_disabled" -> WebhooksDisabledError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "sso_required" -> SsoRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "access_suspended" -> AccessSuspendedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "program_scoped_key" -> ProgramScopedKeyError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "restricted_session" -> RestrictedSessionError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "not_found" -> NotFoundError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "not_enrolled" -> NotEnrolledError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "conflict" -> ConflictError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "idempotency_in_progress" -> IdempotencyInProgressError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "stripe_key_required" -> StripeKeyRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "credit_credentials_required" -> CreditCredentialsRequiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "api_key_expired" -> ApiKeyExpiredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "replay" -> ReplayError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "live_mode_only" -> LiveModeOnlyError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "test_mode_only" -> TestModeOnlyError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "test_mode_unsupported" -> TestModeUnsupportedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "gone" -> GoneError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "idempotency_key_reused" -> IdempotencyKeyReusedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "stripe_key_invalid" -> StripeKeyInvalidError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "stripe_key_wrong_mode" -> StripeKeyWrongModeError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "stripe_key_permission" -> StripeKeyPermissionError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "provider_credentials_invalid" -> ProviderCredentialsInvalidError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "provider_credentials_wrong_mode" -> ProviderCredentialsWrongModeError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "provider_permission" -> ProviderPermissionError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "payload_too_large" -> PayloadTooLargeError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "connection_paused" -> ConnectionPausedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "rate_limited" -> RateLimitedError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "internal_error" -> InternalServerError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "atlas_error" -> AtlasError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "stripe_unavailable" -> StripeUnavailableError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "provider_unavailable" -> ProviderUnavailableError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "sso_provider_error" -> SsoProviderError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        "sso_not_configured" -> SsoNotConfiguredError(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
        else -> ApiException(status, code, apiMessage, requestId, docsUrl, details, retryAfter)
    }
