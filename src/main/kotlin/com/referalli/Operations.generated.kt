// Code generated from the Referalli OpenAPI document. DO NOT EDIT.
// Changes belong in the generator, which overwrites this file.

@file:Suppress("unused")

package com.referalli

import kotlinx.coroutines.flow.Flow

/**
 * Revoke an API key. DELETE /v1/api-keys/{id}
 *
 * Revokes a key at once. `cascade=true` also revokes every key it minted (and theirs); `pair=true` also revokes its live/test twin. Returns the revoked ids. Needs an owner or admin session, or an API key with the `admin` scope. Audited.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session of any role.
 *
 * cascade: true: also revoke every key this key minted, and theirs.
 * pair: true: also revoke its live/test twin.
 */
suspend fun ReferalliClient.deleteApiKeysId(id: String, cascade: String? = null, pair: String? = null, idempotencyKey: String? = null): DeleteApiKeysIdResponse =
    DeleteApiKeysIdResponse.fromJson(send("DELETE", "/v1/api-keys/${segment(id)}", listOf("cascade" to cascade?.toString(), "pair" to pair?.toString()), null, idempotencyKey, "json"))

/**
 * Delete a marketing asset. DELETE /v1/assets/{id}
 *
 * Removes a marketing asset.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteAssetsId(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/assets/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Delete an auth connection. DELETE /v1/auth/connections/{id}
 *
 * Removes the connection; its webhook URL and signed endpoints stop accepting calls. Referrals it filed stay.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteAuthConnectionsId(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/auth/connections/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Delete a billing connection. DELETE /v1/billing/connections/{id}
 *
 * Deletes the connection: its secrets and credentials are wiped and its webhook URL stops accepting events. Recorded billing events stay. Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteBillingConnectionsId(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/billing/connections/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Remove the portal domain. DELETE /v1/branding/domain
 *
 * Stops serving the partner portal on the custom domain.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteBrandingDomain(idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/branding/domain", emptyList(), null, idempotencyKey, "json"))

/**
 * Remove the link domain. DELETE /v1/branding/link-domain
 *
 * Stops using the custom link domain; links go back to the default host.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteBrandingLinkDomain(idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/branding/link-domain", emptyList(), null, idempotencyKey, "json"))

/**
 * Close a CLI listener. DELETE /v1/cli/listeners/{id}
 *
 * Closes the listener; queued events are dropped.
 *
 * **Auth:** an API key with `webhooks:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteCliListenersId(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/cli/listeners/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Reset an email template. DELETE /v1/email/templates/{event}/{locale}
 *
 * Removes the override; the default template is used again.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteEmailTemplatesEventLocale(event: String, locale: String, idempotencyKey: String? = null): DeleteEmailTemplatesEventLocaleResponse =
    DeleteEmailTemplatesEventLocaleResponse.fromJson(send("DELETE", "/v1/email/templates/${segment(event)}/${segment(locale)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Disconnect an integration. DELETE /v1/integrations/{kind}
 *
 * Removes the HubSpot or Segment connection and its stored credential.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteIntegrationsKind(kind: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/integrations/${segment(kind)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Remove a team member. DELETE /v1/org/members/{userId}
 *
 * Removes a member. Members can remove themselves; otherwise owner or admin. The last owner stays (409). Audited. Live mode only.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.deleteOrgMembersUserId(userId: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/org/members/${segment(userId)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Delete a partner. DELETE /v1/partners/{id}
 *
 * Deletes a partner that never did anything, with its enrollments, links, coupons and payout profile. A partner with any clicks, referrals, commissions, payouts or other history is `409`: archive it instead (`status: "archived"`). Audited.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deletePartnersId(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/partners/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Disconnect a payout provider. DELETE /v1/payout-connections/{provider}
 *
 * Removes the stored credentials for a provider. Payouts by that method are then simulated until you reconnect. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.deletePayoutConnectionsProvider(provider: String, idempotencyKey: String? = null): DeletePayoutConnectionsProviderResponse =
    DeletePayoutConnectionsProviderResponse.fromJson(send("DELETE", "/v1/payout-connections/${segment(provider)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Delete a product margin. DELETE /v1/profitability/products/{productRef}
 *
 * Removes a product from the margin catalog; its payments fall back to the program or org margin. Audited.
 *
 * **Auth:** an API key with `analytics:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteProfitabilityProductsProductRef(productRef: String, idempotencyKey: String? = null): OkStatus =
    OkStatus.fromJson(send("DELETE", "/v1/profitability/products/${segment(productRef)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Delete a webhook endpoint. DELETE /v1/webhook-endpoints/{id}
 *
 * Removes the endpoint and its delivery history. Audited.
 *
 * **Auth:** an API key with `webhooks:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteWebhookEndpointsId(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/webhook-endpoints/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Unsubscribe a Zapier hook. DELETE /v1/zapier/hooks/{id}
 *
 * REST hook unsubscribe, called by Zapier when a Zap turns off.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.deleteZapierHooksId(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("DELETE", "/v1/zapier/hooks/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Get platform metrics. GET /v1/admin/metrics
 *
 * Platform admins only. Live orgs (and suspended ones), partner accounts (and banned ones), programs, commission earned, payouts sent and open fraud cases across the platform.
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.getAdminMetrics(idempotencyKey: String? = null): GetAdminMetricsResponse =
    GetAdminMetricsResponse.fromJson(send("GET", "/v1/admin/metrics", emptyList(), null, idempotencyKey, "json"))

/**
 * List organizations. GET /v1/admin/orgs
 *
 * Platform admins only. Organizations, searchable by name with `q`.
 *
 * **Auth:** a platform admin session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAdminOrgs(q: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAdminOrgsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/admin/orgs", listOf("q" to q?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAdminOrgsResponseDataItem.fromJson(it) }

/** Every item of [getAdminOrgs], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAdminOrgsEach(q: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAdminOrgsResponseDataItem> =
    paginate { cursor -> getAdminOrgs(q = q, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List partner accounts. GET /v1/admin/partner-accounts
 *
 * Platform admins only. Partner accounts with KYC and sanctions status, filtered by `flagged` (banned) and text `q`.
 *
 * **Auth:** a platform admin session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAdminPartnerAccounts(flagged: Boolean? = null, q: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAdminPartnerAccountsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/admin/partner-accounts", listOf("flagged" to flagged?.toString(), "q" to q?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAdminPartnerAccountsResponseDataItem.fromJson(it) }

/** Every item of [getAdminPartnerAccounts], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAdminPartnerAccountsEach(flagged: Boolean? = null, q: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAdminPartnerAccountsResponseDataItem> =
    paginate { cursor -> getAdminPartnerAccounts(flagged = flagged, q = q, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List partnered AI agents. GET /v1/agents
 *
 * The AI agents partnered with this org, with their wallet, metadata and how many recommendations each has attributed, most active first.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session with role `owner`, `admin`, `analyst`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAgents(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAgentsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/agents", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAgentsResponseDataItem.fromJson(it) }

/** Every item of [getAgents], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAgentsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAgentsResponseDataItem> =
    paginate { cursor -> getAgents(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List agent recommendations. GET /v1/agents/recommendations
 *
 * Signed recommendations AI agents have attributed in this org, newest first.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session with role `owner`, `admin`, `analyst`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAgentsRecommendations(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAgentsRecommendationsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/agents/recommendations", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAgentsRecommendationsResponseDataItem.fromJson(it) }

/** Every item of [getAgentsRecommendations], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAgentsRecommendationsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAgentsRecommendationsResponseDataItem> =
    paginate { cursor -> getAgentsRecommendations(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get revenue by channel. GET /v1/analytics/by-channel
 *
 * Referrals and referred revenue by how they were matched (`coupon`, `deterministic` click, `email_hash`, `probabilistic`, `manual`…).
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAnalyticsByChannel(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsByChannelResponseDataItem> =
    Page.fromJson(send("GET", "/v1/analytics/by-channel", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAnalyticsByChannelResponseDataItem.fromJson(it) }

/** Every item of [getAnalyticsByChannel], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAnalyticsByChannelEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAnalyticsByChannelResponseDataItem> =
    paginate { cursor -> getAnalyticsByChannel(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get revenue by country. GET /v1/analytics/by-geo
 *
 * Referrals and referred revenue by the country of the winning click, highest revenue first.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAnalyticsByGeo(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsByGeoResponseDataItem> =
    Page.fromJson(send("GET", "/v1/analytics/by-geo", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAnalyticsByGeoResponseDataItem.fromJson(it) }

/** Every item of [getAnalyticsByGeo], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAnalyticsByGeoEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAnalyticsByGeoResponseDataItem> =
    paginate { cursor -> getAnalyticsByGeo(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get cohort LTV. GET /v1/analytics/cohort-ltv
 *
 * Referred customers grouped by sign-up month over the last `months` (default 6), with net revenue (payments minus refunds) and revenue per customer.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAnalyticsCohortLtv(months: Long? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsCohortLtvResponseDataItem> =
    Page.fromJson(send("GET", "/v1/analytics/cohort-ltv", listOf("months" to months?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAnalyticsCohortLtvResponseDataItem.fromJson(it) }

/** Every item of [getAnalyticsCohortLtv], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAnalyticsCohortLtvEach(months: Long? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAnalyticsCohortLtvResponseDataItem> =
    paginate { cursor -> getAnalyticsCohortLtv(months = months, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get coupon performance. GET /v1/analytics/coupon-performance
 *
 * Referrals and revenue per coupon code, highest revenue first.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAnalyticsCouponPerformance(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsCouponPerformanceResponseDataItem> =
    Page.fromJson(send("GET", "/v1/analytics/coupon-performance", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAnalyticsCouponPerformanceResponseDataItem.fromJson(it) }

/** Every item of [getAnalyticsCouponPerformance], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAnalyticsCouponPerformanceEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAnalyticsCouponPerformanceResponseDataItem> =
    paginate { cursor -> getAnalyticsCouponPerformance(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the funnel overview. GET /v1/analytics/overview
 *
 * Over the last `days` (default 30), optionally for one program: clicks (and how many were filtered), visitors, sign-ups, payments, referred revenue, commission earned and reversed, active partners and the click-to-sign-up and sign-up-to-paid rates.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getAnalyticsOverview(programId: String? = null, days: Long? = null, idempotencyKey: String? = null): GetAnalyticsOverviewResponse =
    GetAnalyticsOverviewResponse.fromJson(send("GET", "/v1/analytics/overview", listOf("programId" to programId?.toString(), "days" to days?.toString()), null, idempotencyKey, "json"))

/**
 * Get a daily time series. GET /v1/analytics/timeseries
 *
 * One `metric` (`clicks`, `signups` or `revenue` in minor units) per day over the last `days`, optionally for one program.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAnalyticsTimeseries(metric: String, days: Long? = null, programId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsTimeseriesResponseDataItem> =
    Page.fromJson(send("GET", "/v1/analytics/timeseries", listOf("metric" to metric?.toString(), "days" to days?.toString(), "programId" to programId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAnalyticsTimeseriesResponseDataItem.fromJson(it) }

/** Every item of [getAnalyticsTimeseries], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAnalyticsTimeseriesEach(metric: String, days: Long? = null, programId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAnalyticsTimeseriesResponseDataItem> =
    paginate { cursor -> getAnalyticsTimeseries(metric = metric, days = days, programId = programId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List API keys. GET /v1/api-keys
 *
 * Every key of the org, live and test (a test-mode caller sees test keys only), oldest first, with scopes, pinned version, owner, expiry and last use. Never returns the secret. Filter by `mode` or `owner`.
 *
 * **Auth:** an API key with `team:read` (or `full`), or a session of any role.
 *
 * mode: Only live or only test keys; default both.
 * owner: Only keys with this owner.
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getApiKeys(mode: String? = null, owner: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<ApiKey> =
    Page.fromJson(send("GET", "/v1/api-keys", listOf("mode" to mode?.toString(), "owner" to owner?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { ApiKey.fromJson(it) }

/** Every item of [getApiKeys], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getApiKeysEach(mode: String? = null, owner: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<ApiKey> =
    paginate { cursor -> getApiKeys(mode = mode, owner = owner, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get an API key. GET /v1/api-keys/{id}
 *
 * One key of the org, without its secret.
 *
 * **Auth:** an API key with `team:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getApiKeysId(id: String, idempotencyKey: String? = null): ApiKey =
    ApiKey.fromJson(send("GET", "/v1/api-keys/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * List marketing assets. GET /v1/assets
 *
 * Marketing assets, filtered by `programId`.
 *
 * **Auth:** an API key with `partners:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAssets(programId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAssetsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/assets", listOf("programId" to programId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAssetsResponseDataItem.fromJson(it) }

/** Every item of [getAssets], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAssetsEach(programId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAssetsResponseDataItem> =
    paginate { cursor -> getAssets(programId = programId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get program suggestions. GET /v1/assistant/suggestions
 *
 * Draft-only suggestions for running the program, each with a suggested action for a person to take: partners who never drove a click, links with clicks but no referrals, programs without a commission rule, the review queue, and credit ROI findings. It never changes anything.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAssistantSuggestions(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAssistantSuggestionsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/assistant/suggestions", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetAssistantSuggestionsResponseDataItem.fromJson(it) }

/** Every item of [getAssistantSuggestions], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAssistantSuggestionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetAssistantSuggestionsResponseDataItem> =
    paginate { cursor -> getAssistantSuggestions(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List audit log entries. GET /v1/audit-logs
 *
 * Every change recorded in the org, newest first: who did it (`actor`, `actorType`), what (`action`; a trailing `*` matches a prefix such as `payout.*`) and to what (`subjectType`, `subjectId`). Filter by any of those and by `created[gte]`/`created[lte]`.
 *
 * **Auth:** an API key with `audit:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * actor: Actor id: a user, API key or connection id.
 * action: Exact action, or a prefix ending in * (e.g. payout.*).
 * starting_after: An entry id: return the entries after it.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAuditLogs(actor: String? = null, actorType: String? = null, action: String? = null, subjectType: String? = null, subjectId: String? = null, createdGte: String? = null, createdLte: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, idempotencyKey: String? = null): Page<AuditLogEntry> =
    Page.fromJson(send("GET", "/v1/audit-logs", listOf("actor" to actor?.toString(), "actorType" to actorType?.toString(), "action" to action?.toString(), "subjectType" to subjectType?.toString(), "subjectId" to subjectId?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString()), null, idempotencyKey, "list")) { AuditLogEntry.fromJson(it) }

/** Every item of [getAuditLogs], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAuditLogsEach(actor: String? = null, actorType: String? = null, action: String? = null, subjectType: String? = null, subjectId: String? = null, createdGte: String? = null, createdLte: String? = null, limit: Long? = null, endingBefore: String? = null, idempotencyKey: String? = null): Flow<AuditLogEntry> =
    paginate { cursor -> getAuditLogs(actor = actor, actorType = actorType, action = action, subjectType = subjectType, subjectId = subjectId, createdGte = createdGte, createdLte = createdLte, limit = limit, startingAfter = cursor, endingBefore = endingBefore, idempotencyKey = idempotencyKey) }

/**
 * List auth connections. GET /v1/auth/connections
 *
 * Auth-platform connections with provider, program, status, signature version and rotation state. Secrets are never returned.
 *
 * **Auth:** an API key with `integrations:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getAuthConnections(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<AuthConnection> =
    Page.fromJson(send("GET", "/v1/auth/connections", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { AuthConnection.fromJson(it) }

/** Every item of [getAuthConnections], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getAuthConnectionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<AuthConnection> =
    paginate { cursor -> getAuthConnections(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Export a user (signed protocol). GET /v1/auth/connections/{id}/export
 *
 * An access request the platform forwards: everything filed under the customer and their partner record. Signed with the connection secret in `x-referalli-signature: t=<unix>,v1=…,v2=…` (v2 also signs the request line; once a connection has seen v2 it requires it), with a unique `x-referalli-id` per call. Calls older than 5 minutes, reused ids (`409 replay`), paused connections (`423 connection_paused`) and unknown fields (`422`) are refused.
 *
 * **Auth:** a signature (see above); no API key.
 */
suspend fun ReferalliClient.getAuthConnectionsIdExport(id: String, customerRef: String, idempotencyKey: String? = null): GetAuthConnectionsIdExportResponse =
    GetAuthConnectionsIdExportResponse.fromJson(send("GET", "/v1/auth/connections/${segment(id)}/export", listOf("customerRef" to customerRef?.toString()), null, idempotencyKey, "json"))

/**
 * List sign-in providers. GET /v1/auth/providers
 *
 * The identity providers configured on this deployment, for rendering sign-in buttons.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getAuthProviders(idempotencyKey: String? = null): GetAuthProvidersResponse =
    GetAuthProvidersResponse.fromJson(send("GET", "/v1/auth/providers", emptyList(), null, idempotencyKey, "json"))

/**
 * List billing connections. GET /v1/billing/connections
 *
 * Billing connections (deleted ones excluded), with status, whether credentials are needed and set, the value mapping and secret-rotation state.
 *
 * **Auth:** an API key with `billing:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getBillingConnections(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<BillingConnection> =
    Page.fromJson(send("GET", "/v1/billing/connections", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { BillingConnection.fromJson(it) }

/** Every item of [getBillingConnections], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getBillingConnectionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<BillingConnection> =
    paginate { cursor -> getBillingConnections(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a billing connection. GET /v1/billing/connections/{id}
 *
 * One billing connection, without its secrets.
 *
 * **Auth:** an API key with `billing:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getBillingConnectionsId(id: String, idempotencyKey: String? = null): BillingConnection =
    BillingConnection.fromJson(send("GET", "/v1/billing/connections/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * List billing events. GET /v1/billing/events
 *
 * Payments, refunds and other billing events received from every connection, newest first. Filter with `customerRef`.
 *
 * **Auth:** an API key with `billing:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getBillingEvents(customerRef: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<BillingEvent> =
    Page.fromJson(send("GET", "/v1/billing/events", listOf("customerRef" to customerRef?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { BillingEvent.fromJson(it) }

/** Every item of [getBillingEvents], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getBillingEventsEach(customerRef: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<BillingEvent> =
    paginate { cursor -> getBillingEvents(customerRef = customerRef, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the plan. GET /v1/billing/plan
 *
 * The org's Referalli plan and status, its limits and current usage (programs, partners), the plan catalog, whether there is a subscription to manage and whether this caller may activate a plan without checkout.
 *
 * **Auth:** an API key with `billing:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getBillingPlan(idempotencyKey: String? = null): GetBillingPlanResponse =
    GetBillingPlanResponse.fromJson(send("GET", "/v1/billing/plan", emptyList(), null, idempotencyKey, "json"))

/**
 * Get branding. GET /v1/branding
 *
 * The org's logo, theme tokens, sender address, and its custom portal and link domains with their status (`none`, `pending` DNS, `provisioning` a certificate, `active`).
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getBranding(idempotencyKey: String? = null): GetBrandingResponse =
    GetBrandingResponse.fromJson(send("GET", "/v1/branding", emptyList(), null, idempotencyKey, "json"))

/**
 * Get a customer's consent. GET /v1/cleanroom/consent
 *
 * A customer's recorded consent: whether granted, its purposes, the attributes they declared and when it changed. `consent: null` when none is recorded.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getCleanroomConsent(customerRef: String, idempotencyKey: String? = null): GetCleanroomConsentResponse =
    GetCleanroomConsentResponse.fromJson(send("GET", "/v1/cleanroom/consent", listOf("customerRef" to customerRef?.toString()), null, idempotencyKey, "json"))

/**
 * Query the clean room. GET /v1/cleanroom/query
 *
 * Aggregates over consenting customers only, grouped by a zero-party attribute they declared (`dimension`): customers, converted customers and referred revenue per value. Cohorts smaller than 5 are suppressed (k-anonymity); individual rows never leave.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getCleanroomQuery(dimension: String, idempotencyKey: String? = null): GetCleanroomQueryResponse =
    GetCleanroomQueryResponse.fromJson(send("GET", "/v1/cleanroom/query", listOf("dimension" to dimension?.toString()), null, idempotencyKey, "json"))

/**
 * Get a pending CLI sign-in. GET /v1/cli/device-codes/{userCode}
 *
 * For the approval page: the pending code, which CLI asked and when it expires. Needs a signed-in person (owner or admin). 404 when expired or used.
 *
 * **Auth:** an API key with `team:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getCliDeviceCodesUserCode(userCode: String, idempotencyKey: String? = null): GetCliDeviceCodesUserCodeResponse =
    GetCliDeviceCodesUserCodeResponse.fromJson(send("GET", "/v1/cli/device-codes/${segment(userCode)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Receive listener events. GET /v1/cli/listeners/{id}/events
 *
 * Up to 50 queued events for the listener, oldest first, each with its body and signed headers. `wait` long-polls up to 25 seconds for the first event. Polling keeps the listener alive.
 *
 * **Auth:** an API key with `webhooks:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getCliListenersIdEvents(id: String, wait: Long? = null, idempotencyKey: String? = null): GetCliListenersIdEventsResponse =
    GetCliListenersIdEventsResponse.fromJson(send("GET", "/v1/cli/listeners/${segment(id)}/events", listOf("wait" to wait?.toString()), null, idempotencyKey, "json"))

/**
 * Tail the request log. GET /v1/cli/logs
 *
 * The CLI's `logs tail` command: the org's recent API requests (method, path without query string, status, latency, actor). The first call returns the latest 20 and a `cursor`; pass it as `after` (with `wait` to long-poll up to 25 seconds) for newer entries. Kept for a day.
 *
 * **Auth:** an API key with `audit:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * after: Return entries after this cursor.
 */
suspend fun ReferalliClient.getCliLogs(after: Long? = null, wait: Long? = null, limit: Long? = null, idempotencyKey: String? = null): GetCliLogsResponse =
    GetCliLogsResponse.fromJson(send("GET", "/v1/cli/logs", listOf("after" to after?.toString(), "wait" to wait?.toString(), "limit" to limit?.toString()), null, idempotencyKey, "json"))

/**
 * List triggerable topics. GET /v1/cli/topics
 *
 * The event topics `POST /v1/cli/trigger` can send.
 *
 * **Auth:** an API key with `webhooks:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getCliTopics(idempotencyKey: String? = null): GetCliTopicsResponse =
    GetCliTopicsResponse.fromJson(send("GET", "/v1/cli/topics", emptyList(), null, idempotencyKey, "json"))

/**
 * List commission rules. GET /v1/commission-rules
 *
 * Every rule version, by program and newest version first. Filter with `programId`.
 *
 * **Auth:** an API key with `commissions:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getCommissionRules(programId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<CommissionRule> =
    Page.fromJson(send("GET", "/v1/commission-rules", listOf("programId" to programId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { CommissionRule.fromJson(it) }

/** Every item of [getCommissionRules], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getCommissionRulesEach(programId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<CommissionRule> =
    paginate { cursor -> getCommissionRules(programId = programId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List commission ledger events. GET /v1/commissions
 *
 * The append-only commission ledger, newest first: `earned` lines and the `approved`, `paid`, `reversed` and `adjusted` events recorded against them (`relatedCommissionId`). Filter by `partnerId`, `programId`, `type` or `referralId`.
 *
 * **Auth:** an API key with `commissions:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getCommissions(partnerId: String? = null, programId: String? = null, type: String? = null, referralId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<CommissionEvent> =
    Page.fromJson(send("GET", "/v1/commissions", listOf("partnerId" to partnerId?.toString(), "programId" to programId?.toString(), "type" to type?.toString(), "referralId" to referralId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { CommissionEvent.fromJson(it) }

/** Every item of [getCommissions], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getCommissionsEach(partnerId: String? = null, programId: String? = null, type: String? = null, referralId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<CommissionEvent> =
    paginate { cursor -> getCommissions(partnerId = partnerId, programId = programId, type = type, referralId = referralId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a commission. GET /v1/commissions/{id}
 *
 * One ledger event. An `earned` line also carries its billing event, its net after reversals and adjustments, its state (`pending`, `approved` or `paid`) and every event recorded against it.
 *
 * **Auth:** an API key with `commissions:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getCommissionsId(id: String, idempotencyKey: String? = null): CommissionLine =
    CommissionLine.fromJson(send("GET", "/v1/commissions/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * List partner contracts. GET /v1/contracts
 *
 * The org's contracts and their status (`draft`, `sent`, `accepted`, `declined`, `void`).
 *
 * **Auth:** an API key with `partners:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getContracts(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetContractsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/contracts", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetContractsResponseDataItem.fromJson(it) }

/** Every item of [getContracts], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getContractsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetContractsResponseDataItem> =
    paginate { cursor -> getContracts(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List coupon codes. GET /v1/coupons
 *
 * Coupon codes, filtered by `programId` and/or `partnerId`.
 *
 * **Auth:** an API key with `links:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getCoupons(programId: String? = null, partnerId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Coupon> =
    Page.fromJson(send("GET", "/v1/coupons", listOf("programId" to programId?.toString(), "partnerId" to partnerId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Coupon.fromJson(it) }

/** Every item of [getCoupons], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getCouponsEach(programId: String? = null, partnerId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Coupon> =
    paginate { cursor -> getCoupons(programId = programId, partnerId = partnerId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Search creators. GET /v1/creators
 *
 * Published creator profiles, most engaged first, filtered by text (`q`), `category`, `channel`, minimum audience, minimum engagement and audience country. Each carries verified stats and whether this org already invited them. Emails are never returned.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getCreators(q: String? = null, category: String? = null, channel: String? = null, minAudience: Long? = null, minEngagementBps: Long? = null, audienceCountry: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<CreatorProfile> =
    Page.fromJson(send("GET", "/v1/creators", listOf("q" to q?.toString(), "category" to category?.toString(), "channel" to channel?.toString(), "minAudience" to minAudience?.toString(), "minEngagementBps" to minEngagementBps?.toString(), "audienceCountry" to audienceCountry?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { CreatorProfile.fromJson(it) }

/** Every item of [getCreators], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getCreatorsEach(q: String? = null, category: String? = null, channel: String? = null, minAudience: Long? = null, minEngagementBps: Long? = null, audienceCountry: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<CreatorProfile> =
    paginate { cursor -> getCreators(q = q, category = category, channel = channel, minAudience = minAudience, minEngagementBps = minEngagementBps, audienceCountry = audienceCountry, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a creator. GET /v1/creators/{accountId}
 *
 * One published creator profile with verified stats. 404 when not listed.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getCreatorsAccountId(accountId: String, idempotencyKey: String? = null): CreatorProfile =
    CreatorProfile.fromJson(send("GET", "/v1/creators/${segment(accountId)}", emptyList(), null, idempotencyKey, "json"))

/**
 * List registered deals. GET /v1/deals
 *
 * Deals partners registered, newest first. Filter with `status` (`submitted`, `approved`, `rejected`, `won`, `lost`).
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getDeals(status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetDealsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/deals", listOf("status" to status?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetDealsResponseDataItem.fromJson(it) }

/** Every item of [getDeals], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getDealsEach(status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetDealsResponseDataItem> =
    paginate { cursor -> getDeals(status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List partner disputes. GET /v1/disputes
 *
 * Disputes partners filed with this org, newest first.
 *
 * **Auth:** an API key with `commissions:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getDisputes(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetDisputesResponseDataItem> =
    Page.fromJson(send("GET", "/v1/disputes", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetDisputesResponseDataItem.fromJson(it) }

/** Every item of [getDisputes], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getDisputesEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetDisputesResponseDataItem> =
    paginate { cursor -> getDisputes(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get email settings. GET /v1/email/settings
 *
 * The org's own email provider (`resend`, `brevo` or `postmark`), sender identity, branding and sending-domain status. The API key is never returned.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getEmailSettings(idempotencyKey: String? = null): EmailSettings =
    EmailSettings.fromJson(send("GET", "/v1/email/settings", emptyList(), null, idempotencyKey, "json"))

/**
 * List email templates. GET /v1/email/templates
 *
 * Every email event with its placeholders and, per locale, the default template and the org's override if any.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getEmailTemplates(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<EmailTemplateEvent> =
    Page.fromJson(send("GET", "/v1/email/templates", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { EmailTemplateEvent.fromJson(it) }

/** Every item of [getEmailTemplates], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getEmailTemplatesEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<EmailTemplateEvent> =
    paginate { cursor -> getEmailTemplates(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Read embedded partner stats. GET /v1/embed/summary
 *
 * Called by the embed component with `Authorization: Bearer <embed token>`: the partner's name, eligible clicks, active referrals, balances and link codes. 401 for a missing, invalid or expired token.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getEmbedSummary(idempotencyKey: String? = null): GetEmbedSummaryResponse =
    GetEmbedSummaryResponse.fromJson(send("GET", "/v1/embed/summary", emptyList(), null, idempotencyKey, "json"))

/**
 * Export payouts for accounting. GET /v1/export/accounting
 *
 * A year's sent payouts as a CSV that QuickBooks (`format=quickbooks`, the default) or Xero imports.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.getExportAccounting(format: String? = null, year: Long, idempotencyKey: String? = null): String =
    (send("GET", "/v1/export/accounting", listOf("format" to format?.toString(), "year" to year?.toString()), null, idempotencyKey, "text") as JsonValue.Str).value

/**
 * Export all org data. GET /v1/export/full
 *
 * Every tenant table of the org as NDJSON (one JSON object per line, tagged with its table), streamed so any size works. Owner or admin.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getExportFull(idempotencyKey: String? = null): String =
    (send("GET", "/v1/export/full", emptyList(), null, idempotencyKey, "text") as JsonValue.Str).value

/**
 * List fraud cases. GET /v1/fraud/cases
 *
 * The fraud case queue (self-referrals, quality, rings, value patterns, identity risk), newest first, with the evidence. Filter with `status`.
 *
 * **Auth:** an API key with `fraud:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getFraudCases(status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<FraudCase> =
    Page.fromJson(send("GET", "/v1/fraud/cases", listOf("status" to status?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { FraudCase.fromJson(it) }

/** Every item of [getFraudCases], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getFraudCasesEach(status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<FraudCase> =
    paginate { cursor -> getFraudCases(status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List FX rates. GET /v1/fx-rates
 *
 * The org's rates first, then the platform fallback, newest per pair first. A payout uses the org's latest rate at or before the run, else the platform's. Filter by `base` and `quote`.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session with role `owner`, `admin`, `finance`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getFxRates(base: String? = null, quote: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<FxRate> =
    Page.fromJson(send("GET", "/v1/fx-rates", listOf("base" to base?.toString(), "quote" to quote?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { FxRate.fromJson(it) }

/** Every item of [getFxRates], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getFxRatesEach(base: String? = null, quote: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<FxRate> =
    paginate { cursor -> getFxRates(base = base, quote = quote, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Query the GraphQL read layer. GET /v1/graphql
 *
 * A read-only GraphQL endpoint over the same org-scoped data as REST (programs, partners, referrals, analytics), with the same authentication. Mutations stay in REST.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getGraphql(idempotencyKey: String? = null): GetGraphqlResponse =
    GetGraphqlResponse.fromJson(send("GET", "/v1/graphql", emptyList(), null, idempotencyKey, "json"))

/**
 * Check API health. GET /v1/health
 *
 * `200 { "ok": true }` when this instance can serve requests: both database pools answer and it is not shutting down. Otherwise `503` with `reason` (`shutting_down`, with `Retry-After`, or `database_unreachable`).
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getHealth(idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("GET", "/v1/health", emptyList(), null, idempotencyKey, "json"))

/**
 * Describe the current host. GET /v1/hosts/current
 *
 * What the request's host is: a merchant's verified portal domain (with the org's name, branding and public programs), a merchant link domain, or Referalli's own app. Used by the web app before anyone signs in.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getHostsCurrent(idempotencyKey: String? = null): GetHostsCurrentResponse =
    send("GET", "/v1/hosts/current", emptyList(), null, idempotencyKey, "json")

/**
 * Get the current host's theme stylesheet. GET /v1/hosts/current/theme.css
 *
 * On a merchant's portal domain, the org's theme tokens as a `:root` stylesheet; empty elsewhere.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getHostsCurrentThemeCss(idempotencyKey: String? = null): String =
    (send("GET", "/v1/hosts/current/theme.css", emptyList(), null, idempotencyKey, "text") as JsonValue.Str).value

/**
 * Get incrementality results. GET /v1/incrementality
 *
 * For a program's active referrals: treatment and control counts, conversion rates and lift, overall and per partner.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getIncrementality(programId: String, idempotencyKey: String? = null): GetIncrementalityResponse =
    GetIncrementalityResponse.fromJson(send("GET", "/v1/incrementality", listOf("programId" to programId?.toString()), null, idempotencyKey, "json"))

/**
 * List integrations. GET /v1/integrations
 *
 * The HubSpot and Segment connections with status, settings and the last test result. Credentials are never returned.
 *
 * **Auth:** an API key with `integrations:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getIntegrations(idempotencyKey: String? = null): GetIntegrationsResponse =
    GetIntegrationsResponse.fromJson(send("GET", "/v1/integrations", emptyList(), null, idempotencyKey, "json"))

/**
 * List integration deliveries. GET /v1/integrations/deliveries
 *
 * What was sent to Zapier, HubSpot and Segment, newest first, filtered by `kind` and `status`.
 *
 * **Auth:** an API key with `integrations:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getIntegrationsDeliveries(kind: String? = null, status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<IntegrationDelivery> =
    Page.fromJson(send("GET", "/v1/integrations/deliveries", listOf("kind" to kind?.toString(), "status" to status?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { IntegrationDelivery.fromJson(it) }

/** Every item of [getIntegrationsDeliveries], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getIntegrationsDeliveriesEach(kind: String? = null, status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<IntegrationDelivery> =
    paginate { cursor -> getIntegrationsDeliveries(kind = kind, status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List creator invitations. GET /v1/invitations
 *
 * The org's creator invitations and their status (`pending`, `accepted`, `declined`, `withdrawn`).
 *
 * **Auth:** an API key with `partners:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getInvitations(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetInvitationsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/invitations", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetInvitationsResponseDataItem.fromJson(it) }

/** Every item of [getInvitations], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getInvitationsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetInvitationsResponseDataItem> =
    paginate { cursor -> getInvitations(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List links. GET /v1/links
 *
 * Tracked links with their short URL and click count, filtered by `programId` and/or `partnerId`.
 *
 * **Auth:** an API key with `links:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getLinks(programId: String? = null, partnerId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Link> =
    Page.fromJson(send("GET", "/v1/links", listOf("programId" to programId?.toString(), "partnerId" to partnerId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Link.fromJson(it) }

/** Every item of [getLinks], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getLinksEach(programId: String? = null, partnerId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Link> =
    paginate { cursor -> getLinks(programId = programId, partnerId = partnerId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a link's QR code. GET /v1/links/{id}/qr
 *
 * An SVG QR code for the link's short URL.
 *
 * **Auth:** an API key with `links:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getLinksIdQr(id: String, idempotencyKey: String? = null): String =
    (send("GET", "/v1/links/${segment(id)}/qr", emptyList(), null, idempotencyKey, "text") as JsonValue.Str).value

/**
 * List the org's marketplace listings. GET /v1/marketplace/listing
 *
 * The org's listings with their platform-computed stats: eligible clicks, active referrals, earnings per click, conversion rate, payout reliability and approval latency.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getMarketplaceListing(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetMarketplaceListingResponseDataItem> =
    Page.fromJson(send("GET", "/v1/marketplace/listing", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetMarketplaceListingResponseDataItem.fromJson(it) }

/** Every item of [getMarketplaceListing], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getMarketplaceListingEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetMarketplaceListingResponseDataItem> =
    paginate { cursor -> getMarketplaceListing(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the current caller. GET /v1/me
 *
 * Who is calling. With a user session: the user and their org memberships (no `x-org-id` needed). With an API key: the key (name, prefix, scopes, pinned version, mode, owner, expiry) and its org.
 *
 * **Auth:** an API key with `team:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getMe(idempotencyKey: String? = null): GetMeResponse =
    GetMeResponse.fromJson(send("GET", "/v1/me", emptyList(), null, idempotencyKey, "json"))

/**
 * List negotiation rounds. GET /v1/negotiations
 *
 * Agent negotiation rounds and their decisions, newest first, optionally for one program.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getNegotiations(programId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetNegotiationsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/negotiations", listOf("programId" to programId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetNegotiationsResponseDataItem.fromJson(it) }

/** Every item of [getNegotiations], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getNegotiationsEach(programId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetNegotiationsResponseDataItem> =
    paginate { cursor -> getNegotiations(programId = programId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a customer's network journey. GET /v1/network/journey
 *
 * For a hashed customer email, the partner accounts that touched them at any opted-in merchant (never which merchant) and each one's credit under `model`. 403 unless the org has joined the network.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getNetworkJourney(emailHash: String, model: String? = null, idempotencyKey: String? = null): GetNetworkJourneyResponse =
    GetNetworkJourneyResponse.fromJson(send("GET", "/v1/network/journey", listOf("emailHash" to emailHash?.toString(), "model" to model?.toString()), null, idempotencyKey, "json"))

/**
 * Get network membership. GET /v1/network/settings
 *
 * Whether the org contributes to (and can read) the attribution network.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getNetworkSettings(idempotencyKey: String? = null): GetNetworkSettingsResponse =
    GetNetworkSettingsResponse.fromJson(send("GET", "/v1/network/settings", emptyList(), null, idempotencyKey, "json"))

/**
 * List notifications. GET /v1/notifications
 *
 * The org's in-app notifications (failing webhooks, anomalies, answered invitations…), newest first. `unread=true` for unread only.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session of any role.
 *
 * unread: true: unread notifications only.
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getNotifications(unread: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Notification> =
    Page.fromJson(send("GET", "/v1/notifications", listOf("unread" to unread?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Notification.fromJson(it) }

/** Every item of [getNotifications], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getNotificationsEach(unread: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Notification> =
    paginate { cursor -> getNotifications(unread = unread, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List on-chain connections. GET /v1/onchain/connections
 *
 * The org's on-chain conversion connections.
 *
 * **Auth:** an API key with `billing:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getOnchainConnections(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetOnchainConnectionsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/onchain/connections", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetOnchainConnectionsResponseDataItem.fromJson(it) }

/** Every item of [getOnchainConnections], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getOnchainConnectionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetOnchainConnectionsResponseDataItem> =
    paginate { cursor -> getOnchainConnections(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the OpenAPI document. GET /v1/openapi.json
 *
 * This reference as an OpenAPI 3.1 document (JSON).
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getOpenapiJson(idempotencyKey: String? = null): GetOpenapiJsonResponse =
    send("GET", "/v1/openapi.json", emptyList(), null, idempotencyKey, "json").obj().mapValues { it.value }

/**
 * Get the OpenAPI document as YAML. GET /v1/openapi.yaml
 *
 * The same OpenAPI 3.1 document as `GET /v1/openapi.json`, serialized as YAML.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getOpenapiYaml(idempotencyKey: String? = null): String =
    (send("GET", "/v1/openapi.yaml", emptyList(), null, idempotencyKey, "text") as JsonValue.Str).value

/**
 * Get the organization. GET /v1/org
 *
 * The current org: name, plan, settings, public `trackingToken`, payout KYC requirement and mode (`livemode`; test orgs also carry `liveOrgId`).
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getOrg(idempotencyKey: String? = null): Org =
    Org.fromJson(send("GET", "/v1/org", emptyList(), null, idempotencyKey, "json"))

/**
 * Get the FX feed setting. GET /v1/org/fx-feed
 *
 * Whether the daily ECB reference-rate feed is on for this org, and the date of its latest rate.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.getOrgFxFeed(idempotencyKey: String? = null): GetOrgFxFeedResponse =
    GetOrgFxFeedResponse.fromJson(send("GET", "/v1/org/fx-feed", emptyList(), null, idempotencyKey, "json"))

/**
 * List team members. GET /v1/org/members
 *
 * Members of the org with their role and email, oldest first.
 *
 * **Auth:** an API key with `team:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getOrgMembers(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Member> =
    Page.fromJson(send("GET", "/v1/org/members", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Member.fromJson(it) }

/** Every item of [getOrgMembers], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getOrgMembersEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Member> =
    paginate { cursor -> getOrgMembers(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get payout schedules. GET /v1/org/payout-schedule
 *
 * The org schedule and its next run date, plus each program's override (`{ kind: 'off' }`, its own schedule, or `null` to follow the org) and next run date.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getOrgPayoutSchedule(idempotencyKey: String? = null): GetOrgPayoutScheduleResponse =
    GetOrgPayoutScheduleResponse.fromJson(send("GET", "/v1/org/payout-schedule", emptyList(), null, idempotencyKey, "json"))

/**
 * Get referral query parameters. GET /v1/org/referral-params
 *
 * The query parameters aff.js reads a referral code from: the built-in ones (`via`, `ref`, `aff`) and the org's extra ones.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getOrgReferralParams(idempotencyKey: String? = null): GetOrgReferralParamsResponse =
    GetOrgReferralParamsResponse.fromJson(send("GET", "/v1/org/referral-params", emptyList(), null, idempotencyKey, "json"))

/**
 * Get the data retention policy. GET /v1/org/retention
 *
 * How many days each kind of raw data is kept before the nightly purge, the allowed minimum and default per kind, and the last purge run.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getOrgRetention(idempotencyKey: String? = null): Retention =
    Retention.fromJson(send("GET", "/v1/org/retention", emptyList(), null, idempotencyKey, "json"))

/**
 * Get SSO settings. GET /v1/org/sso
 *
 * Single sign-on for the org: whether SSO is configured on this deployment and linked to a directory tenant, its connections and domains, whether SSO is required, the role mapping, recent setup tickets and any provider error.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getOrgSso(idempotencyKey: String? = null): GetOrgSsoResponse =
    GetOrgSsoResponse.fromJson(send("GET", "/v1/org/sso", emptyList(), null, idempotencyKey, "json"))

/**
 * Get SAML metadata. GET /v1/org/sso/connections/{id}/saml-metadata
 *
 * The SAML service-provider metadata for one of the org's SSO connections, to give the identity provider.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getOrgSsoConnectionsIdSamlMetadata(id: String, idempotencyKey: String? = null): GetOrgSsoConnectionsIdSamlMetadataResponse =
    GetOrgSsoConnectionsIdSamlMetadataResponse.fromJson(send("GET", "/v1/org/sso/connections/${segment(id)}/saml-metadata", emptyList(), null, idempotencyKey, "json"))

/**
 * Get the tax profile. GET /v1/org/tax-profile
 *
 * The org's legal name, address, country, VAT id, EIN, domestic VAT rate, whether partner VAT ids are checked against EU VIES, and the 1099 filing provider.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.getOrgTaxProfile(idempotencyKey: String? = null): TaxProfile =
    TaxProfile.fromJson(send("GET", "/v1/org/tax-profile", emptyList(), null, idempotencyKey, "json"))

/**
 * List outreach messages. GET /v1/outreach
 *
 * Drafted, approved and sent outreach messages, newest first.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getOutreach(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetOutreachResponseDataItem> =
    Page.fromJson(send("GET", "/v1/outreach", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetOutreachResponseDataItem.fromJson(it) }

/** Every item of [getOutreach], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getOutreachEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetOutreachResponseDataItem> =
    paginate { cursor -> getOutreach(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List my achievements. GET /v1/partner/achievements
 *
 * Badges computed from the ledger (first click, referral milestones, first payout, $1,000 earned), each with progress toward its target.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerAchievements(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerAchievementsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/achievements", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerAchievementsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerAchievements], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerAchievementsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerAchievementsResponseDataItem> =
    paginate { cursor -> getPartnerAchievements(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List my advances. GET /v1/partner/advance
 *
 * The partner's advances with what remains to repay.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerAdvance(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerAdvanceResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/advance", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerAdvanceResponseDataItem.fromJson(it) }

/** Every item of [getPartnerAdvance], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerAdvanceEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerAdvanceResponseDataItem> =
    paginate { cursor -> getPartnerAdvance(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get my advance offer. GET /v1/partner/advance/offer
 *
 * How much the partner could receive now against future commissions (`maxAdvanceMinor`), from their recent run rate and quality score, and the fee.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerAdvanceOffer(idempotencyKey: String? = null): GetPartnerAdvanceOfferResponse =
    GetPartnerAdvanceOfferResponse.fromJson(send("GET", "/v1/partner/advance/offer", emptyList(), null, idempotencyKey, "json"))

/**
 * List marketing assets. GET /v1/partner/assets
 *
 * Marketing assets (copy, images, banners) of the programs the partner is approved in; group-only assets show only to that group's members.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerAssets(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerAssetsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/assets", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerAssetsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerAssets], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerAssetsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerAssetsResponseDataItem> =
    paginate { cursor -> getPartnerAssets(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List my contracts. GET /v1/partner/contracts
 *
 * Contracts merchants sent the partner.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerContracts(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerContractsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/contracts", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerContractsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerContracts], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerContractsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerContractsResponseDataItem> =
    paginate { cursor -> getPartnerContracts(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List my deals. GET /v1/partner/deals
 *
 * The partner's registered deals across merchants, newest first.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerDeals(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerDealsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/deals", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerDealsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerDeals], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerDealsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerDealsResponseDataItem> =
    paginate { cursor -> getPartnerDeals(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List my disputes. GET /v1/partner/disputes
 *
 * Disputes the partner filed about missing or wrong credit, newest first, with the merchant's resolution.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerDisputes(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerDisputesResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/disputes", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerDisputesResponseDataItem.fromJson(it) }

/** Every item of [getPartnerDisputes], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerDisputesEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerDisputesResponseDataItem> =
    paginate { cursor -> getPartnerDisputes(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List my groups. GET /v1/partner/groups
 *
 * The partner's groups across programs, with their onboarding and payout terms.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerGroups(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerGroupsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/groups", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerGroupsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerGroups], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerGroupsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerGroupsResponseDataItem> =
    paginate { cursor -> getPartnerGroups(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List my invitations. GET /v1/partner/invitations
 *
 * Program invitations merchants sent the partner.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerInvitations(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerInvitationsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/invitations", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerInvitationsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerInvitations], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerInvitationsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerInvitationsResponseDataItem> =
    paginate { cursor -> getPartnerInvitations(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get my identity verification status. GET /v1/partner/kyc/status
 *
 * The partner account's KYC status (`unverified`, `pending`, `verified`, `rejected`), sanctions screening status and when it was verified.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerKycStatus(idempotencyKey: String? = null): GetPartnerKycStatusResponse =
    GetPartnerKycStatusResponse.fromJson(send("GET", "/v1/partner/kyc/status", emptyList(), null, idempotencyKey, "json"))

/**
 * List my links. GET /v1/partner/links
 *
 * The partner's tracked links across merchants, newest first, with the short URL, the `?via=` parameter for direct links and eligible clicks.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerLinks(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerLinksResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/links", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerLinksResponseDataItem.fromJson(it) }

/** Every item of [getPartnerLinks], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerLinksEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerLinksResponseDataItem> =
    paginate { cursor -> getPartnerLinks(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get my link's QR code. GET /v1/partner/links/{id}/qr
 *
 * An SVG QR code for one of the partner's links.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerLinksIdQr(id: String, idempotencyKey: String? = null): String =
    (send("GET", "/v1/partner/links/${segment(id)}/qr", emptyList(), null, idempotencyKey, "text") as JsonValue.Str).value

/**
 * Browse the marketplace. GET /v1/partner/marketplace
 *
 * Public listings of active live programs across every merchant, sponsored first, with commission terms and platform-computed stats. Filter with `category`. Partner session only.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerMarketplace(category: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerMarketplaceResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/marketplace", listOf("category" to category?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerMarketplaceResponseDataItem.fromJson(it) }

/** Every item of [getPartnerMarketplace], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerMarketplaceEach(category: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerMarketplaceResponseDataItem> =
    paginate { cursor -> getPartnerMarketplace(category = category, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get my account and memberships. GET /v1/partner/me
 *
 * The partner account and every merchant it partners with, each with its programs and enrollment status.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerMe(idempotencyKey: String? = null): GetPartnerMeResponse =
    GetPartnerMeResponse.fromJson(send("GET", "/v1/partner/me", emptyList(), null, idempotencyKey, "json"))

/**
 * List my notifications. GET /v1/partner/notifications
 *
 * The partner account's notifications, newest first.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerNotifications(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Notification> =
    Page.fromJson(send("GET", "/v1/partner/notifications", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Notification.fromJson(it) }

/** Every item of [getPartnerNotifications], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerNotificationsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Notification> =
    paginate { cursor -> getPartnerNotifications(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get self-billing status. GET /v1/partner/orgs/{orgId}/self-billing
 *
 * The partner's VAT details with this merchant and whether they accepted the current self-billing agreement (`currentVersion`).
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerOrgsOrgIdSelfBilling(orgId: String, idempotencyKey: String? = null): GetPartnerOrgsOrgIdSelfBillingResponse =
    GetPartnerOrgsOrgIdSelfBillingResponse.fromJson(send("GET", "/v1/partner/orgs/${segment(orgId)}/self-billing", emptyList(), null, idempotencyKey, "json"))

/**
 * Get my reputation passport. GET /v1/partner/passport
 *
 * A signed, portable passport of the partner's verified performance across every program (programs, eligible clicks, referrals, repeat-payer rate, average quality), valid for 90 days.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerPassport(idempotencyKey: String? = null): Passport =
    Passport.fromJson(send("GET", "/v1/partner/passport", emptyList(), null, idempotencyKey, "json"))

/**
 * List my payouts. GET /v1/partner/payouts
 *
 * The partner's payouts across merchants, newest first.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerPayouts(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerPayoutsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/payouts", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerPayoutsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerPayouts], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerPayoutsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerPayoutsResponseDataItem> =
    paginate { cursor -> getPartnerPayouts(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get my payout invoice. GET /v1/partner/payouts/{id}/invoice
 *
 * The invoice for one of the partner's payouts, as JSON or (`format=html`) a printable page.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerPayoutsIdInvoice(id: String, format: String? = null, idempotencyKey: String? = null): Invoice =
    Invoice.fromJson(send("GET", "/v1/partner/payouts/${segment(id)}/invoice", listOf("format" to format?.toString()), null, idempotencyKey, "json"))

/**
 * List my postback calls. GET /v1/partner/postback-logs
 *
 * Recent postback calls with the topic, URL and the status code the partner's server answered.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerPostbackLogs(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerPostbackLogsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/postback-logs", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerPostbackLogsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerPostbackLogs], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerPostbackLogsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerPostbackLogsResponseDataItem> =
    paginate { cursor -> getPartnerPostbackLogs(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get my creator profile. GET /v1/partner/profile
 *
 * The partner's creator profile (headline, bio, channels, audience, engagement) and verified stats.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerProfile(idempotencyKey: String? = null): CreatorProfile =
    CreatorProfile.fromJson(send("GET", "/v1/partner/profile", emptyList(), null, idempotencyKey, "json"))

/**
 * Get my verified performance. GET /v1/partner/profile/verified
 *
 * The partner's performance across all programs, computed by the platform from the ledger rather than self-reported: programs, eligible clicks, active referrals and repeat-payer rate.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerProfileVerified(idempotencyKey: String? = null): GetPartnerProfileVerifiedResponse =
    GetPartnerProfileVerifiedResponse.fromJson(send("GET", "/v1/partner/profile/verified", emptyList(), null, idempotencyKey, "json"))

/**
 * Get a program leaderboard. GET /v1/partner/programs/{programId}/leaderboard
 *
 * Top 25 partners by approved commission in the program (during the active contest, if any). Other partners' names are masked; the partner's own row is marked `you`. 403 when the program has no leaderboard.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerProgramsProgramIdLeaderboard(programId: String, idempotencyKey: String? = null): GetPartnerProgramsProgramIdLeaderboardResponse =
    GetPartnerProgramsProgramIdLeaderboardResponse.fromJson(send("GET", "/v1/partner/programs/${segment(programId)}/leaderboard", emptyList(), null, idempotencyKey, "json"))

/**
 * Get my recruiting link. GET /v1/partner/recruit
 *
 * The partner's recruit code and sign-up URL. Partners who sign up through it become their sub-affiliates where both partner the same merchant.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerRecruit(idempotencyKey: String? = null): GetPartnerRecruitResponse =
    GetPartnerRecruitResponse.fromJson(send("GET", "/v1/partner/recruit", emptyList(), null, idempotencyKey, "json"))

/**
 * List my referrals. GET /v1/partner/referrals
 *
 * The partner's referrals across merchants, newest first. Customer ids are redacted to their last 4 characters.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerReferrals(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerReferralsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/referrals", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerReferralsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerReferrals], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerReferralsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerReferralsResponseDataItem> =
    paginate { cursor -> getPartnerReferrals(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Explain a referral. GET /v1/partner/referrals/{id}/transparency
 *
 * Why a referral credited the partner (or did not fully): the model, window, touchpoints considered, the partner's share of the credit and the reasoning notes. No customer data.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerReferralsIdTransparency(id: String, idempotencyKey: String? = null): GetPartnerReferralsIdTransparencyResponse =
    GetPartnerReferralsIdTransparencyResponse.fromJson(send("GET", "/v1/partner/referrals/${segment(id)}/transparency", emptyList(), null, idempotencyKey, "json"))

/**
 * List partners. GET /v1/partners
 *
 * Partners, newest first. Filter by `email`, `externalRef` or `status`. Archived partners are hidden unless you ask for them with `status=archived` or `includeArchived=true`.
 *
 * **Auth:** an API key with `partners:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartners(email: String? = null, externalRef: String? = null, status: String? = null, includeArchived: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Partner> =
    Page.fromJson(send("GET", "/v1/partners", listOf("email" to email?.toString(), "externalRef" to externalRef?.toString(), "status" to status?.toString(), "includeArchived" to includeArchived?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Partner.fromJson(it) }

/** Every item of [getPartners], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnersEach(email: String? = null, externalRef: String? = null, status: String? = null, includeArchived: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Partner> =
    paginate { cursor -> getPartners(email = email, externalRef = externalRef, status = status, includeArchived = includeArchived, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get my security settings. GET /v1/partner/security
 *
 * Whether two-factor sign-in is on for the partner account.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerSecurity(idempotencyKey: String? = null): GetPartnerSecurityResponse =
    GetPartnerSecurityResponse.fromJson(send("GET", "/v1/partner/security", emptyList(), null, idempotencyKey, "json"))

/**
 * Get a partner. GET /v1/partners/{id}
 *
 * One partner, with a cross-network warning when the same account is flagged or banned by other merchants (it never says which).
 *
 * **Auth:** an API key with `partners:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getPartnersId(id: String, idempotencyKey: String? = null): GetPartnersIdResponse =
    send("GET", "/v1/partners/${segment(id)}", emptyList(), null, idempotencyKey, "json")

/**
 * Get a partner's balances. GET /v1/partners/{id}/balances
 *
 * The partner's commission balances per currency: pending (in hold), approved (payable), paid and reversed.
 *
 * **Auth:** an API key with `commissions:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnersIdBalances(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Balance> =
    Page.fromJson(send("GET", "/v1/partners/${segment(id)}/balances", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Balance.fromJson(it) }

/** Every item of [getPartnersIdBalances], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnersIdBalancesEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Balance> =
    paginate { cursor -> getPartnersIdBalances(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List a partner's enrollments. GET /v1/partners/{id}/enrollments
 *
 * The programs a partner is enrolled in or applied to, with status and group.
 *
 * **Auth:** an API key with `partners:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnersIdEnrollments(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnersIdEnrollmentsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partners/${segment(id)}/enrollments", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnersIdEnrollmentsResponseDataItem.fromJson(it) }

/** Every item of [getPartnersIdEnrollments], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnersIdEnrollmentsEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnersIdEnrollmentsResponseDataItem> =
    paginate { cursor -> getPartnersIdEnrollments(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a partner's payout profile. GET /v1/partners/{id}/payout-profile
 *
 * The partner's payout method, currency, threshold and tax form status. Method details are not returned. 404 when none is set.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getPartnersIdPayoutProfile(id: String, idempotencyKey: String? = null): PayoutProfile =
    PayoutProfile.fromJson(send("GET", "/v1/partners/${segment(id)}/payout-profile", emptyList(), null, idempotencyKey, "json"))

/**
 * Get a partner's quality score. GET /v1/partners/{id}/quality
 *
 * The partner's quality score computed now (with its metrics) and the last stored snapshot.
 *
 * **Auth:** an API key with `partners:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getPartnersIdQuality(id: String, idempotencyKey: String? = null): GetPartnersIdQualityResponse =
    GetPartnersIdQualityResponse.fromJson(send("GET", "/v1/partners/${segment(id)}/quality", emptyList(), null, idempotencyKey, "json"))

/**
 * Get my stats. GET /v1/partner/stats
 *
 * Per merchant: eligible clicks, active referrals, payments and commission balances.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerStats(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerStatsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/stats", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerStatsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerStats], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerStatsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerStatsResponseDataItem> =
    paginate { cursor -> getPartnerStats(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List my tax documents. GET /v1/partner/tax-documents
 *
 * Tax forms delivered to the partner by every merchant they work with, newest year first.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerTaxDocuments(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerTaxDocumentsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/tax-documents", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerTaxDocumentsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerTaxDocuments], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerTaxDocumentsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerTaxDocumentsResponseDataItem> =
    paginate { cursor -> getPartnerTaxDocuments(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get my tax document. GET /v1/partner/tax-documents/{id}
 *
 * The recipient copy of a delivered tax form, as an HTML page.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.getPartnerTaxDocumentsId(id: String, idempotencyKey: String? = null): String =
    (send("GET", "/v1/partner/tax-documents/${segment(id)}", emptyList(), null, idempotencyKey, "text") as JsonValue.Str).value

/**
 * List program terms. GET /v1/partner/terms
 *
 * The latest terms version of each program the partner is approved in, and whether they accepted it.
 *
 * **Auth:** a partner session.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPartnerTerms(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerTermsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/partner/terms", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPartnerTermsResponseDataItem.fromJson(it) }

/** Every item of [getPartnerTerms], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPartnerTermsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPartnerTermsResponseDataItem> =
    paginate { cursor -> getPartnerTerms(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the passport signing key. GET /v1/passport/public-key
 *
 * The ed25519 public key partner passports are signed with, so anyone can verify one offline.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getPassportPublicKey(idempotencyKey: String? = null): GetPassportPublicKeyResponse =
    GetPassportPublicKeyResponse.fromJson(send("GET", "/v1/passport/public-key", emptyList(), null, idempotencyKey, "json"))

/**
 * List payout provider connections. GET /v1/payout-connections
 *
 * The payout providers the org connected with its own credentials (PayPal, Stripe, Circle, Wise, Payoneer, Tremendous), with environment and status. Secrets are never returned.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session with role `owner`, `admin`, `finance`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPayoutConnections(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPayoutConnectionsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/payout-connections", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetPayoutConnectionsResponseDataItem.fromJson(it) }

/** Every item of [getPayoutConnections], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPayoutConnectionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetPayoutConnectionsResponseDataItem> =
    paginate { cursor -> getPayoutConnections(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List payout runs. GET /v1/payout-runs
 *
 * Payout runs, newest first, with their status and summary.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPayoutRuns(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<PayoutRun> =
    Page.fromJson(send("GET", "/v1/payout-runs", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { PayoutRun.fromJson(it) }

/** Every item of [getPayoutRuns], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPayoutRunsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<PayoutRun> =
    paginate { cursor -> getPayoutRuns(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List payouts. GET /v1/payouts
 *
 * Individual payouts, newest first, with rail, provider reference and failure reason. Filter with `partnerId`.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPayouts(partnerId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Payout> =
    Page.fromJson(send("GET", "/v1/payouts", listOf("partnerId" to partnerId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Payout.fromJson(it) }

/** Every item of [getPayouts], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPayoutsEach(partnerId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Payout> =
    paginate { cursor -> getPayouts(partnerId = partnerId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a payout's invoice. GET /v1/payouts/{id}/invoice
 *
 * The self-billing invoice issued for a payout, as JSON or (`format=html`) a printable page. 404 when the payout has no invoice.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getPayoutsIdInvoice(id: String, format: String? = null, idempotencyKey: String? = null): Invoice =
    Invoice.fromJson(send("GET", "/v1/payouts/${segment(id)}/invoice", listOf("format" to format?.toString()), null, idempotencyKey, "json"))

/**
 * Export a customer's data. GET /v1/privacy/export
 *
 * Every stored row that references the customer, for a data-subject access request.
 *
 * **Auth:** an API key with `privacy:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getPrivacyExport(customerRef: String, idempotencyKey: String? = null): CustomerExport =
    CustomerExport.fromJson(send("GET", "/v1/privacy/export", listOf("customerRef" to customerRef?.toString()), null, idempotencyKey, "json"))

/**
 * List data-subject requests. GET /v1/privacy/requests
 *
 * Access and erasure requests, newest first, with their status.
 *
 * **Auth:** an API key with `privacy:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPrivacyRequests(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<PrivacyRequest> =
    Page.fromJson(send("GET", "/v1/privacy/requests", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { PrivacyRequest.fromJson(it) }

/** Every item of [getPrivacyRequests], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getPrivacyRequestsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<PrivacyRequest> =
    paginate { cursor -> getPrivacyRequests(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a data-subject request. GET /v1/privacy/requests/{id}
 *
 * Poll one request: `pending`, `completed` or `failed`, and whether data was found.
 *
 * **Auth:** an API key with `privacy:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getPrivacyRequestsId(id: String, idempotencyKey: String? = null): PrivacyRequest =
    PrivacyRequest.fromJson(send("GET", "/v1/privacy/requests/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Get a data-subject request result. GET /v1/privacy/requests/{id}/result
 *
 * The full result of a completed request; for access requests, the exported data. 400 until it is completed.
 *
 * **Auth:** an API key with `privacy:read` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.getPrivacyRequestsIdResult(id: String, idempotencyKey: String? = null): GetPrivacyRequestsIdResultResponse =
    GetPrivacyRequestsIdResultResponse.fromJson(send("GET", "/v1/privacy/requests/${segment(id)}/result", emptyList(), null, idempotencyKey, "json"))

/**
 * List product margins. GET /v1/profitability/products
 *
 * The margin catalog: per product, a margin (bps) or a unit cost, used to turn revenue into profit.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProfitabilityProducts(idempotencyKey: String? = null): GetProfitabilityProductsResponse =
    GetProfitabilityProductsResponse.fromJson(send("GET", "/v1/profitability/products", emptyList(), null, idempotencyKey, "json"))

/**
 * Get a product margin. GET /v1/profitability/products/{productRef}
 *
 * One product of the margin catalog.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProfitabilityProductsProductRef(productRef: String, idempotencyKey: String? = null): GetProfitabilityProductsProductRefResponse =
    GetProfitabilityProductsProductRefResponse.fromJson(send("GET", "/v1/profitability/products/${segment(productRef)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Get a rebuild job. GET /v1/profitability/rebuild/{jobId}
 *
 * Progress of a rebuild: `queued`, `running`, `done` or `failed` (a job untouched for an hour reports `failed` with `error: "stale"`), with processed and total counts.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProfitabilityRebuildJobId(jobId: String, idempotencyKey: String? = null): GetProfitabilityRebuildJobIdResponse =
    GetProfitabilityRebuildJobIdResponse.fromJson(send("GET", "/v1/profitability/rebuild/${segment(jobId)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Get profitability settings. GET /v1/profitability/settings
 *
 * The economics credit ROI is computed with: reporting currency, default margin, how a credit's cost is modelled, how credit use is inferred, attribution and churn windows, target ROI and more. With `programId`, the program's overrides merged over the org's.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProfitabilitySettings(programId: String? = null, idempotencyKey: String? = null): GetProfitabilitySettingsResponse =
    GetProfitabilitySettingsResponse.fromJson(send("GET", "/v1/profitability/settings", listOf("programId" to programId?.toString()), null, idempotencyKey, "json"))

/**
 * List programs. GET /v1/programs
 *
 * The org's programs, oldest first, with their settings.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getPrograms(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Program> =
    Page.fromJson(send("GET", "/v1/programs", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Program.fromJson(it) }

/** Every item of [getPrograms], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getProgramsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Program> =
    paginate { cursor -> getPrograms(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a program. GET /v1/programs/{id}
 *
 * One program with its settings (defaults filled in) and public page.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProgramsId(id: String, idempotencyKey: String? = null): Program =
    Program.fromJson(send("GET", "/v1/programs/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Get autopricing settings. GET /v1/programs/{id}/autopricing
 *
 * The program's autopricing configuration, or `null` when it's off.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProgramsIdAutopricing(id: String, idempotencyKey: String? = null): GetProgramsIdAutopricingResponse =
    GetProgramsIdAutopricingResponse.fromJson(send("GET", "/v1/programs/${segment(id)}/autopricing", emptyList(), null, idempotencyKey, "json"))

/**
 * List program enrollments. GET /v1/programs/{id}/enrollments
 *
 * The program's enrollments and applications, newest first, each with the partner and a cross-network warning when other merchants banned the same account. Filter with `status`.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getProgramsIdEnrollments(id: String, status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetProgramsIdEnrollmentsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/programs/${segment(id)}/enrollments", listOf("status" to status?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetProgramsIdEnrollmentsResponseDataItem.fromJson(it) }

/** Every item of [getProgramsIdEnrollments], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getProgramsIdEnrollmentsEach(id: String, status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetProgramsIdEnrollmentsResponseDataItem> =
    paginate { cursor -> getProgramsIdEnrollments(id = id, status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the referral tree. GET /v1/programs/{id}/graph
 *
 * Who referred whom from one partner (`root`) down, with revenue and net commission per node. Where customers are partners too (customerRef equals a partner's externalRef), the tree continues up to `depth` partner levels. Stops at 5,000 referrals and says so.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProgramsIdGraph(id: String, root: String, depth: Long? = null, idempotencyKey: String? = null): GetProgramsIdGraphResponse =
    send("GET", "/v1/programs/${segment(id)}/graph", listOf("root" to root?.toString(), "depth" to depth?.toString()), null, idempotencyKey, "json")

/**
 * List partner groups. GET /v1/programs/{id}/groups
 *
 * The program's partner groups with member counts. Archived groups are hidden unless `includeArchived=true`.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 *
 * includeArchived: true: include archived groups.
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getProgramsIdGroups(id: String, includeArchived: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<PartnerGroup> =
    Page.fromJson(send("GET", "/v1/programs/${segment(id)}/groups", listOf("includeArchived" to includeArchived?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { PartnerGroup.fromJson(it) }

/** Every item of [getProgramsIdGroups], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getProgramsIdGroupsEach(id: String, includeArchived: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<PartnerGroup> =
    paginate { cursor -> getProgramsIdGroups(id = id, includeArchived = includeArchived, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the agent negotiation policy. GET /v1/programs/{id}/negotiation-policy
 *
 * The program's negotiation policy, or `null` when it isn't open to negotiation.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProgramsIdNegotiationPolicy(id: String, idempotencyKey: String? = null): GetProgramsIdNegotiationPolicyResponse =
    GetProgramsIdNegotiationPolicyResponse.fromJson(send("GET", "/v1/programs/${segment(id)}/negotiation-policy", emptyList(), null, idempotencyKey, "json"))

/**
 * List promotions. GET /v1/programs/{id}/promotions
 *
 * The program's promotions, latest start first.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getProgramsIdPromotions(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Promotion> =
    Page.fromJson(send("GET", "/v1/programs/${segment(id)}/promotions", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Promotion.fromJson(it) }

/** Every item of [getProgramsIdPromotions], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getProgramsIdPromotionsEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Promotion> =
    paginate { cursor -> getProgramsIdPromotions(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the referee reward. GET /v1/programs/{id}/referee-reward
 *
 * The program's reward for referred customers (the friend's side of a double-sided program), or `null` when it has none.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getProgramsIdRefereeReward(id: String, idempotencyKey: String? = null): GetProgramsIdRefereeRewardResponse =
    GetProgramsIdRefereeRewardResponse.fromJson(send("GET", "/v1/programs/${segment(id)}/referee-reward", emptyList(), null, idempotencyKey, "json"))

/**
 * List terms acceptances. GET /v1/programs/{id}/terms-acceptances
 *
 * Which partner accepted which version of the program's terms, newest first.
 *
 * **Auth:** an API key with `programs:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getProgramsIdTermsAcceptances(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetProgramsIdTermsAcceptancesResponseDataItem> =
    Page.fromJson(send("GET", "/v1/programs/${segment(id)}/terms-acceptances", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetProgramsIdTermsAcceptancesResponseDataItem.fromJson(it) }

/** Every item of [getProgramsIdTermsAcceptances], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getProgramsIdTermsAcceptancesEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetProgramsIdTermsAcceptancesResponseDataItem> =
    paginate { cursor -> getProgramsIdTermsAcceptances(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List prospects. GET /v1/prospects
 *
 * Prospects, best fit first, with channel, audience, evidence and outreach status. Filter with `status`.
 *
 * **Auth:** an API key with `growth:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getProspects(status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetProspectsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/prospects", listOf("status" to status?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetProspectsResponseDataItem.fromJson(it) }

/** Every item of [getProspects], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getProspectsEach(status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetProspectsResponseDataItem> =
    paginate { cursor -> getProspects(status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a program's public page. GET /v1/public/programs/{handle}
 *
 * What a program's public join page shows: the program and merchant names, pitch, cookie window, terms, base commission, branding and whether joining is approved at once. No authentication; only active live programs with a `publicHandle` are found.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getPublicProgramsHandle(handle: String, idempotencyKey: String? = null): GetPublicProgramsHandleResponse =
    GetPublicProgramsHandleResponse.fromJson(send("GET", "/v1/public/programs/${segment(handle)}", emptyList(), null, idempotencyKey, "json"))

/**
 * List referrals. GET /v1/referrals
 *
 * Referrals, newest first, filtered by `programId`, `partnerId`, `status` or `customerRef`.
 *
 * **Auth:** an API key with `referrals:read` (or `full`), or a session of any role.
 *
 * customerRef: Your id for the referred customer.
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getReferrals(programId: String? = null, partnerId: String? = null, status: String? = null, customerRef: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Referral> =
    Page.fromJson(send("GET", "/v1/referrals", listOf("programId" to programId?.toString(), "partnerId" to partnerId?.toString(), "status" to status?.toString(), "customerRef" to customerRef?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Referral.fromJson(it) }

/** Every item of [getReferrals], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getReferralsEach(programId: String? = null, partnerId: String? = null, status: String? = null, customerRef: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Referral> =
    paginate { cursor -> getReferrals(programId = programId, partnerId = partnerId, status = status, customerRef = customerRef, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a referral. GET /v1/referrals/{id}
 *
 * One referral with its touch credits and attribution reasoning.
 *
 * **Auth:** an API key with `referrals:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getReferralsId(id: String, idempotencyKey: String? = null): Referral =
    Referral.fromJson(send("GET", "/v1/referrals/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Get the attribution journey. GET /v1/referrals/{id}/journey
 *
 * The referral with every touchpoint considered: each click's time, URL, fraud score, eligibility, credit weight and which one won.
 *
 * **Auth:** an API key with `referrals:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getReferralsIdJourney(id: String, idempotencyKey: String? = null): GetReferralsIdJourneyResponse =
    GetReferralsIdJourneyResponse.fromJson(send("GET", "/v1/referrals/${segment(id)}/journey", emptyList(), null, idempotencyKey, "json"))

/**
 * Report filtered clicks. GET /v1/reports/filtered-clicks
 *
 * Per day, newest first: total clicks, clicks excluded from attribution (bots, rate limits, invalid traffic) and the average fraud score.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getReportsFilteredClicks(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetReportsFilteredClicksResponseDataItem> =
    Page.fromJson(send("GET", "/v1/reports/filtered-clicks", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetReportsFilteredClicksResponseDataItem.fromJson(it) }

/** Every item of [getReportsFilteredClicks], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getReportsFilteredClicksEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetReportsFilteredClicksResponseDataItem> =
    paginate { cursor -> getReportsFilteredClicks(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get partner performance. GET /v1/reports/partner-performance
 *
 * Per partner, highest revenue first: clicks, referrals, payments, referred revenue, commission earned and reversed. `format=csv` returns the same as a CSV file.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * format: csv: the same rows as a CSV file.
 */
suspend fun ReferalliClient.getReportsPartnerPerformance(format: String? = null, idempotencyKey: String? = null): GetReportsPartnerPerformanceResponse =
    send("GET", "/v1/reports/partner-performance", listOf("format" to format?.toString()), null, idempotencyKey, "json").array().map { GetReportsPartnerPerformanceResponseValueItem.fromJson(it) }

/**
 * List issued referee rewards. GET /v1/rewards
 *
 * Rewards issued to referred customers, newest first, with code and status (`issued`, `redeemed`, `void`). Filter with `status`.
 *
 * **Auth:** an API key with `commissions:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getRewards(status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetRewardsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/rewards", listOf("status" to status?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetRewardsResponseDataItem.fromJson(it) }

/** Every item of [getRewards], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getRewardsEach(status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetRewardsResponseDataItem> =
    paginate { cursor -> getRewards(status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Look up a reward code. GET /v1/rewards/lookup/{code}
 *
 * Whether a reward code is valid (issued and unredeemed), with its kind and amount, so your checkout can apply it. Unknown codes answer `{ "valid": false }`.
 *
 * **Auth:** an API key with `commissions:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getRewardsLookupCode(code: String, idempotencyKey: String? = null): GetRewardsLookupCodeResponse =
    GetRewardsLookupCodeResponse.fromJson(send("GET", "/v1/rewards/lookup/${segment(code)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Get the ROI breakdown. GET /v1/roi/breakdown
 *
 * The summary figures grouped `by` program, partner, cohort (grant month), source or role, best ROI first (cohorts in date order). Partner and program rows also carry their referrals' combined figures. `from`/`to` select grants by grant date (a date covers its whole UTC day), `programId` and `partnerId` narrow them, `windowDays` overrides each program's attribution window (30, 90, 180, 365, or 0 for lifetime), and `currency` views one native currency instead of the reporting currency. `format=csv` returns the same as a CSV file.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * from: Grants (or referrals) from this instant or date, inclusive.
 * to: Up to this instant, or through the end of this date (UTC), inclusive.
 * partnerId: The grant's partner: the referrer, or the partner of the referee's referral.
 * windowDays: Attribution window; default each program's setting. 0 = lifetime.
 * currency: Default the reporting currency (converted); another code gives that currency only.
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getRoiBreakdown(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, by: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetRoiBreakdownResponseDataItem> =
    Page.fromJson(send("GET", "/v1/roi/breakdown", listOf("from" to from?.toString(), "to" to to?.toString(), "programId" to programId?.toString(), "partnerId" to partnerId?.toString(), "windowDays" to windowDays?.toString(), "currency" to currency?.toString(), "format" to format?.toString(), "by" to by?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetRoiBreakdownResponseDataItem.fromJson(it) }

/** Every item of [getRoiBreakdown], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getRoiBreakdownEach(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, by: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetRoiBreakdownResponseDataItem> =
    paginate { cursor -> getRoiBreakdown(from = from, to = to, programId = programId, partnerId = partnerId, windowDays = windowDays, currency = currency, format = format, by = by, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get ROI data quality. GET /v1/roi/data-quality
 *
 * How complete the inputs to ROI are over `from`/`to`: payments with credit-applied info, products with a margin, partners linked to their own customer id, events excluded for a missing FX rate, and a list of gaps with how to fix each.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * from: Grants (or referrals) from this instant or date, inclusive.
 * to: Up to this instant, or through the end of this date (UTC), inclusive.
 */
suspend fun ReferalliClient.getRoiDataQuality(from: String? = null, to: String? = null, format: String? = null, idempotencyKey: String? = null): GetRoiDataQualityResponse =
    GetRoiDataQualityResponse.fromJson(send("GET", "/v1/roi/data-quality", listOf("from" to from?.toString(), "to" to to?.toString(), "format" to format?.toString()), null, idempotencyKey, "json"))

/**
 * List credit grants. GET /v1/roi/grants
 *
 * Each credit grant in view with its status (`open`, `used`, `expired`, `revoked`) and figures, newest first. Filter by `status`, `role` (`referee` or `referrer`) and `paidBack`. `from`/`to` select grants by grant date (a date covers its whole UTC day), `programId` and `partnerId` narrow them, `windowDays` overrides each program's attribution window (30, 90, 180, 365, or 0 for lifetime), and `currency` views one native currency instead of the reporting currency. `format=csv` returns the same as a CSV file. CSV returns every grant, unpaged.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * from: Grants (or referrals) from this instant or date, inclusive.
 * to: Up to this instant, or through the end of this date (UTC), inclusive.
 * partnerId: The grant's partner: the referrer, or the partner of the referee's referral.
 * windowDays: Attribution window; default each program's setting. 0 = lifetime.
 * currency: Default the reporting currency (converted); another code gives that currency only.
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getRoiGrants(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, status: String? = null, role: String? = null, paidBack: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<RoiGrant> =
    Page.fromJson(send("GET", "/v1/roi/grants", listOf("from" to from?.toString(), "to" to to?.toString(), "programId" to programId?.toString(), "partnerId" to partnerId?.toString(), "windowDays" to windowDays?.toString(), "currency" to currency?.toString(), "format" to format?.toString(), "status" to status?.toString(), "role" to role?.toString(), "paidBack" to paidBack?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { RoiGrant.fromJson(it) }

/** Every item of [getRoiGrants], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getRoiGrantsEach(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, status: String? = null, role: String? = null, paidBack: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<RoiGrant> =
    paginate { cursor -> getRoiGrants(from = from, to = to, programId = programId, partnerId = partnerId, windowDays = windowDays, currency = currency, format = format, status = status, role = role, paidBack = paidBack, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Trace a partner's value. GET /v1/roi/partners/{id}/trace
 *
 * The same trace for a partner's own customer identity (through their externalRef).
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * windowDays: Attribution window; default each program's setting. 0 = lifetime.
 */
suspend fun ReferalliClient.getRoiPartnersIdTrace(id: String, windowDays: Long? = null, format: String? = null, idempotencyKey: String? = null): RoiTrace =
    RoiTrace.fromJson(send("GET", "/v1/roi/partners/${segment(id)}/trace", listOf("windowDays" to windowDays?.toString(), "format" to format?.toString()), null, idempotencyKey, "json"))

/**
 * List value patterns. GET /v1/roi/patterns
 *
 * Every value pattern from one detection run, with the matching subjects: `credit_only` (a referee used their credit and paid no cash after within the window), `churn_at_exhaustion` (used it up, paid, then stopped), `bonus_collector` (a partner holding commission credit who never spends their own cash) and `negative_partner` (a partner whose referrals net below zero). Matches wait until the evidence is in, so young customers are never flagged.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getRoiPatterns(idempotencyKey: String? = null): GetRoiPatternsResponse =
    GetRoiPatternsResponse.fromJson(send("GET", "/v1/roi/patterns", emptyList(), null, idempotencyKey, "json"))

/**
 * Get a value pattern. GET /v1/roi/patterns/{pattern}
 *
 * The subjects currently matching one pattern, with the detail of each match.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getRoiPatternsPattern(pattern: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<RoiPatternEntry> =
    Page.fromJson(send("GET", "/v1/roi/patterns/${segment(pattern)}", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { RoiPatternEntry.fromJson(it) }

/** Every item of [getRoiPatternsPattern], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getRoiPatternsPatternEach(pattern: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<RoiPatternEntry> =
    paginate { cursor -> getRoiPatternsPattern(pattern = pattern, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the ROI summary. GET /v1/roi/summary
 *
 * Credit ROI for the grants in view: credit cost, cash and profit from the recipients after each grant, net, ROI, payback share and median days, outstanding credit and how much of it is measured rather than inferred. With `programId`, also status against the program's target ROI. `model=incremental` adds the lift against the program's holdout group; `includeProjection=true` adds the expected payback of open grants. `from`/`to` select grants by grant date (a date covers its whole UTC day), `programId` and `partnerId` narrow them, `windowDays` overrides each program's attribution window (30, 90, 180, 365, or 0 for lifetime), and `currency` views one native currency instead of the reporting currency. `format=csv` returns the same as a CSV file.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * from: Grants (or referrals) from this instant or date, inclusive.
 * to: Up to this instant, or through the end of this date (UTC), inclusive.
 * partnerId: The grant's partner: the referrer, or the partner of the referee's referral.
 * windowDays: Attribution window; default each program's setting. 0 = lifetime.
 * currency: Default the reporting currency (converted); another code gives that currency only.
 * model: naive (default): ROI of every grant. incremental: also `incremental`, the program's credit-caused lift against its recorded holdout (requires programId; reporting currency; from/to select referrals by first qualifying payment).
 * includeProjection: true: also `projection`, the expected payback of the open grants in view from their program-and-role cohort's median curve (labelled 'projection'; needs 50 closed grants per cohort).
 */
suspend fun ReferalliClient.getRoiSummary(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, model: String? = null, includeProjection: String? = null, idempotencyKey: String? = null): RoiSummary =
    RoiSummary.fromJson(send("GET", "/v1/roi/summary", listOf("from" to from?.toString(), "to" to to?.toString(), "programId" to programId?.toString(), "partnerId" to partnerId?.toString(), "windowDays" to windowDays?.toString(), "currency" to currency?.toString(), "format" to format?.toString(), "model" to model?.toString(), "includeProjection" to includeProjection?.toString()), null, idempotencyKey, "json"))

/**
 * Trace a customer's value. GET /v1/roi/trace/{customerRef}
 *
 * Every value event of a customer (and the identities linked to them) in order, with the running net, to see exactly how their ROI was computed. `format=csv` for a file.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 *
 * windowDays: Attribution window; default each program's setting. 0 = lifetime.
 */
suspend fun ReferalliClient.getRoiTraceCustomerRef(customerRef: String, windowDays: Long? = null, format: String? = null, idempotencyKey: String? = null): RoiTrace =
    RoiTrace.fromJson(send("GET", "/v1/roi/trace/${segment(customerRef)}", listOf("windowDays" to windowDays?.toString(), "format" to format?.toString()), null, idempotencyKey, "json"))

/**
 * Get setup progress. GET /v1/setup/status
 *
 * The install checker: which integration steps are done (auth or associate, program and rule, partner, snippet or click, billing, a payable partner, webhooks) and the next steps as hints.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getSetupStatus(idempotencyKey: String? = null): GetSetupStatusResponse =
    GetSetupStatusResponse.fromJson(send("GET", "/v1/setup/status", emptyList(), null, idempotencyKey, "json"))

/**
 * Get platform status. GET /v1/status
 *
 * Overall state (`operational`, `degraded` or `major_outage`), each component's health and the open incidents. Cached 30 seconds.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getStatus(idempotencyKey: String? = null): GetStatusResponse =
    GetStatusResponse.fromJson(send("GET", "/v1/status", emptyList(), null, idempotencyKey, "json"))

/**
 * List status incidents. GET /v1/status/incidents
 *
 * Recent incidents, newest first, with their updates.
 *
 * **Auth:** none.
 *
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getStatusIncidents(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Incident> =
    Page.fromJson(send("GET", "/v1/status/incidents", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { Incident.fromJson(it) }

/** Every item of [getStatusIncidents], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getStatusIncidentsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<Incident> =
    paginate { cursor -> getStatusIncidents(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get the incidents feed. GET /v1/status/incidents.atom
 *
 * The 50 most recent incidents as an Atom feed.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getStatusIncidentsAtom(idempotencyKey: String? = null): String =
    (send("GET", "/v1/status/incidents.atom", emptyList(), null, idempotencyKey, "text") as JsonValue.Str).value

/**
 * Get a status incident. GET /v1/status/incidents/{id}
 *
 * One incident with its updates.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getStatusIncidentsId(id: String, idempotencyKey: String? = null): Incident =
    Incident.fromJson(send("GET", "/v1/status/incidents/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Export 1099-NEC data. GET /v1/tax/1099
 *
 * For each partner with a W-9 on file: the total actually paid in the tax year, in USD at recorded FX rates, and whether a form is required (US$600 or more, or a currency that couldn't be converted, listed in `fxMissingCurrencies` for review).
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session with role `owner`, `admin`, `finance`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getTax1099(year: Long, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetTax1099ResponseDataItem> =
    Page.fromJson(send("GET", "/v1/tax/1099", listOf("year" to year?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetTax1099ResponseDataItem.fromJson(it) }

/** Every item of [getTax1099], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getTax1099Each(year: Long, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetTax1099ResponseDataItem> =
    paginate { cursor -> getTax1099(year = year, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List 1099 filings. GET /v1/tax/1099/filings
 *
 * A tax year's filings with their provider status and the documents in each.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session with role `owner`, `admin`, `finance`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getTax1099Filings(year: Long, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetTax1099FilingsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/tax/1099/filings", listOf("year" to year?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetTax1099FilingsResponseDataItem.fromJson(it) }

/** Every item of [getTax1099Filings], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getTax1099FilingsEach(year: Long, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetTax1099FilingsResponseDataItem> =
    paginate { cursor -> getTax1099Filings(year = year, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Preview 1099-NEC filings. GET /v1/tax/1099/preview
 *
 * Which partners would get a 1099-NEC for a tax year, with amounts and anything missing (W-9s, TINs), without filing.
 *
 * **Auth:** an API key with `payouts:read` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.getTax1099Preview(year: Long, idempotencyKey: String? = null): NecPreview =
    NecPreview.fromJson(send("GET", "/v1/tax/1099/preview", listOf("year" to year?.toString()), null, idempotencyKey, "json"))

/**
 * Get the test clock. GET /v1/test_clock
 *
 * Test mode only (`409 test_mode_only` otherwise). The test org's current time and how far it has been advanced.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getTestClock(idempotencyKey: String? = null): GetTestClockResponse =
    GetTestClockResponse.fromJson(send("GET", "/v1/test_clock", emptyList(), null, idempotencyKey, "json"))

/**
 * List captured test emails. GET /v1/test/emails
 *
 * Test mode only. Emails the test org would have sent, captured instead of delivered, newest first.
 *
 * **Auth:** an API key with `org:read` (or `full`), or a session of any role.
 *
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getTestEmails(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetTestEmailsResponseDataItem> =
    Page.fromJson(send("GET", "/v1/test/emails", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { GetTestEmailsResponseDataItem.fromJson(it) }

/** Every item of [getTestEmails], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getTestEmailsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<GetTestEmailsResponseDataItem> =
    paginate { cursor -> getTestEmails(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a value import job. GET /v1/value/import/{jobId}
 *
 * Progress and result of a background import: status, processed and total rows, recorded and duplicate counts and row errors.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getValueImportJobId(jobId: String, idempotencyKey: String? = null): GetValueImportJobIdResponse =
    GetValueImportJobIdResponse.fromJson(send("GET", "/v1/value/import/${segment(jobId)}", emptyList(), null, idempotencyKey, "json"))

/**
 * List API versions. GET /v1/versions
 *
 * Every API version, newest first, with what changed in it, the latest version and the deprecation policy. Pin a version with the `Referalli-Version` header or on the API key.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.getVersions(idempotencyKey: String? = null): GetVersionsResponse =
    GetVersionsResponse.fromJson(send("GET", "/v1/versions", emptyList(), null, idempotencyKey, "json"))

/**
 * List webhook deliveries. GET /v1/webhook-deliveries
 *
 * Deliveries to every endpoint, newest first: topic, status (`pending`, `delivered`, `failed`), attempts, the last response code and, while pending, when the next attempt is. Filter with `endpointId`.
 *
 * **Auth:** an API key with `webhooks:read` (or `full`), or a session of any role.
 *
 * endpointId: Only deliveries to this endpoint.
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getWebhookDeliveries(endpointId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<WebhookDelivery> =
    Page.fromJson(send("GET", "/v1/webhook-deliveries", listOf("endpointId" to endpointId?.toString(), "limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { WebhookDelivery.fromJson(it) }

/** Every item of [getWebhookDeliveries], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getWebhookDeliveriesEach(endpointId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<WebhookDelivery> =
    paginate { cursor -> getWebhookDeliveries(endpointId = endpointId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a webhook delivery. GET /v1/webhook-deliveries/{id}
 *
 * One delivery in full: the exact `payload` sent, its `eventId`, and what the endpoint answered last (`lastStatusCode`, the first 2,000 characters of `lastResponseBody`, or `lastError` when there was no response).
 *
 * **Auth:** an API key with `webhooks:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getWebhookDeliveriesId(id: String, idempotencyKey: String? = null): GetWebhookDeliveriesIdResponse =
    send("GET", "/v1/webhook-deliveries/${segment(id)}", emptyList(), null, idempotencyKey, "json")

/**
 * List webhook endpoints. GET /v1/webhook-endpoints
 *
 * Endpoints with their topics, programs, status (`active`, `paused`, `disabled`), secret-rotation state and failure state. Secrets are never returned.
 *
 * **Auth:** an API key with `webhooks:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getWebhookEndpoints(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<WebhookEndpoint> =
    Page.fromJson(send("GET", "/v1/webhook-endpoints", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { WebhookEndpoint.fromJson(it) }

/** Every item of [getWebhookEndpoints], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getWebhookEndpointsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<WebhookEndpoint> =
    paginate { cursor -> getWebhookEndpoints(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Get a webhook endpoint. GET /v1/webhook-endpoints/{id}
 *
 * One endpoint with its status, rotation and failure state.
 *
 * **Auth:** an API key with `webhooks:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getWebhookEndpointsId(id: String, idempotencyKey: String? = null): WebhookEndpoint =
    WebhookEndpoint.fromJson(send("GET", "/v1/webhook-endpoints/${segment(id)}", emptyList(), null, idempotencyKey, "json"))

/**
 * List an endpoint's deliveries. GET /v1/webhook-endpoints/{id}/deliveries
 *
 * What one endpoint was sent, newest first.
 *
 * **Auth:** an API key with `webhooks:read` (or `full`), or a session of any role.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getWebhookEndpointsIdDeliveries(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<WebhookDelivery> =
    Page.fromJson(send("GET", "/v1/webhook-endpoints/${segment(id)}/deliveries", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { WebhookDelivery.fromJson(it) }

/** Every item of [getWebhookEndpointsIdDeliveries], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getWebhookEndpointsIdDeliveriesEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<WebhookDelivery> =
    paginate { cursor -> getWebhookEndpointsIdDeliveries(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * List Zapier trigger events. GET /v1/zapier/events
 *
 * The event keys Zapier triggers can subscribe to.
 *
 * **Auth:** an API key with `integrations:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getZapierEvents(idempotencyKey: String? = null): GetZapierEventsResponse =
    send("GET", "/v1/zapier/events", emptyList(), null, idempotencyKey, "json").array().map { GetZapierEventsResponseValueItem.fromJson(it) }

/**
 * List Zapier hooks. GET /v1/zapier/hooks
 *
 * Active Zapier REST hook subscriptions, newest first.
 *
 * **Auth:** an API key with `integrations:read` (or `full`), or a session with role `owner`, `admin`.
 *
 * limit: Items per page, 1 to 100 (default 50). From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * starting_after: A cursor: the id of an item (the previous page's `next_cursor`); returns the items after it. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * ending_before: A cursor: returns the items before this item id (the previous page). Not with `starting_after`. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[gte]: Only items created at or after this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 * created[lte]: Only items created at or before this time (ISO 8601), on lists of timestamped records. From API version 2026-11-01; ignored under 2026-10-21, where lists are a capped plain array.
 */
suspend fun ReferalliClient.getZapierHooks(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<ZapierHook> =
    Page.fromJson(send("GET", "/v1/zapier/hooks", listOf("limit" to limit?.toString(), "starting_after" to startingAfter?.toString(), "ending_before" to endingBefore?.toString(), "created[gte]" to createdGte?.toString(), "created[lte]" to createdLte?.toString()), null, idempotencyKey, "list")) { ZapierHook.fromJson(it) }

/** Every item of [getZapierHooks], following the pages (cold [Flow]: each collection starts over). */
fun ReferalliClient.getZapierHooksEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Flow<ZapierHook> =
    paginate { cursor -> getZapierHooks(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/**
 * Poll a Zapier trigger. GET /v1/zapier/triggers/{event}
 *
 * Zapier polling and sample data: the latest `limit` events of that kind, newest first, in the shape the hook delivers. Always a plain array (Zapier's contract), whatever the API version.
 *
 * **Auth:** an API key with `integrations:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.getZapierTriggersEvent(event: String, limit: Long? = null, idempotencyKey: String? = null): GetZapierTriggersEventResponse =
    send("GET", "/v1/zapier/triggers/${segment(event)}", listOf("limit" to limit?.toString()), null, idempotencyKey, "json").array().map { GetZapierTriggersEventResponseValueItem.fromJson(it) }

/**
 * Edit a status incident. PATCH /v1/admin/status/incidents/{id}
 *
 * Platform admins only. Changes an incident's title, severity, state, body or affected components. Setting `state: "resolved"` stamps `resolvedAt`.
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.patchAdminStatusIncidentsId(id: String, body: PatchAdminStatusIncidentsIdBody, idempotencyKey: String? = null): Incident =
    Incident.fromJson(send("PATCH", "/v1/admin/status/incidents/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update an API key. PATCH /v1/api-keys/{id}
 *
 * Changes a key's pinned `apiVersion`, `owner` or expiry (`expiresInDays` from now; `null` removes it). Revoked keys are 404. Needs an owner or admin session, or an API key with the `admin` scope. Audited.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.patchApiKeysId(id: String, body: PatchApiKeysIdBody, idempotencyKey: String? = null): PatchApiKeysIdResponse =
    PatchApiKeysIdResponse.fromJson(send("PATCH", "/v1/api-keys/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update an auth connection. PATCH /v1/auth/connections/{id}
 *
 * Pauses or resumes a connection, renames it, changes `autoEnrollUsers` or the destination of auto-created links, or (signed-protocol connections) sets `signatureVersion`: `v2` to require request-line signatures, `v1+v2` to accept both again.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchAuthConnectionsId(id: String, body: PatchAuthConnectionsIdBody, idempotencyKey: String? = null): PatchAuthConnectionsIdResponse =
    PatchAuthConnectionsIdResponse.fromJson(send("PATCH", "/v1/auth/connections/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update a billing connection. PATCH /v1/billing/connections/{id}
 *
 * Renames a connection or sets `status`: `paused` makes its webhook URL refuse events until set back to `active`. Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchBillingConnectionsId(id: String, body: PatchBillingConnectionsIdBody, idempotencyKey: String? = null): BillingConnection =
    BillingConnection.fromJson(send("PATCH", "/v1/billing/connections/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update the organization. PATCH /v1/org
 *
 * Changes the org name, merges keys into `settings` (a free-form map) and turns `payoutKycRequired` on or off. Audited.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchOrg(body: PatchOrgBody, idempotencyKey: String? = null): PatchOrgResponse =
    PatchOrgResponse.fromJson(send("PATCH", "/v1/org", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Change a member's role. PATCH /v1/org/members/{userId}
 *
 * Changes a member's role. Only owners change owner roles, and the last owner can't be demoted (409). Audited. Live mode only.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchOrgMembersUserId(userId: String, body: PatchOrgMembersUserIdBody, idempotencyKey: String? = null): PatchOrgMembersUserIdResponse =
    PatchOrgMembersUserIdResponse.fromJson(send("PATCH", "/v1/org/members/${segment(userId)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update SSO settings. PATCH /v1/org/sso
 *
 * Requires SSO for members on the org's SSO domains (`requireSso`; needs an active connection and the owner signed in through SSO, so nobody is locked out) and maps identity-provider roles to Referalli roles. Owner only. Live mode only.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`.
 */
suspend fun ReferalliClient.patchOrgSso(body: PatchOrgSsoBody, idempotencyKey: String? = null): PatchOrgSsoResponse =
    PatchOrgSsoResponse.fromJson(send("PATCH", "/v1/org/sso", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update a partner group. PATCH /v1/partner-groups/{id}
 *
 * Changes a group's terms, or archives it (`archived: true`); archived groups take no new members.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchPartnerGroupsId(id: String, body: PatchPartnerGroupsIdBody, idempotencyKey: String? = null): PartnerGroup =
    PartnerGroup.fromJson(send("PATCH", "/v1/partner-groups/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update a partner. PATCH /v1/partners/{id}
 *
 * Changes the display name, status (`active`, `suspended`, `banned`, `archived`), tags, notes or externalRef (`null` clears it). Suspended partners keep earning but are not paid; banned ones stop attributing. 409 when another partner has the externalRef. Audited.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchPartnersId(id: String, body: PatchPartnersIdBody, idempotencyKey: String? = null): Partner =
    Partner.fromJson(send("PATCH", "/v1/partners/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Change a partner's payout threshold. PATCH /v1/partners/{id}/payout-profile
 *
 * Changes only the minimum balance before a payout (`minThresholdMinor`). 404 when the partner has no profile. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.patchPartnersIdPayoutProfile(id: String, body: PatchPartnersIdPayoutProfileBody, idempotencyKey: String? = null): PatchPartnersIdPayoutProfileResponse =
    PatchPartnersIdPayoutProfileResponse.fromJson(send("PATCH", "/v1/partners/${segment(id)}/payout-profile", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update a program. PATCH /v1/programs/{id}
 *
 * Changes any program field or setting; omitted fields keep their value, and `publicPage` is merged. Changing `termsMd` records a new terms version. Setting `status` to `paused` or `archived` stops new attribution. `mobileApp` (iOS Team ID and bundle id, Android package and signing-certificate fingerprints) publishes the program's apps in the universal-links and App Links files on the org's link hosts. Audited.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchProgramsId(id: String, body: PatchProgramsIdBody, idempotencyKey: String? = null): Program =
    Program.fromJson(send("PATCH", "/v1/programs/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Pause or resume a referral. PATCH /v1/referrals/{id}
 *
 * Sets `status` to `paused` (no new commissions) or back to `active`. Only active referrals can be paused and only paused ones resumed (409 otherwise); setting the current status is a no-op. Publishes `referral.paused` or `referral.resumed`. Audited.
 *
 * **Auth:** an API key with `referrals:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchReferralsId(id: String, body: PatchReferralsIdBody, idempotencyKey: String? = null): Referral =
    Referral.fromJson(send("PATCH", "/v1/referrals/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update a webhook endpoint. PATCH /v1/webhook-endpoints/{id}
 *
 * Changes the URL, topics, programs (`null` or `[]` for every program) or legacy signature, or pauses it (`status: "paused"`, deliveries held). Setting `active` re-enables a paused or auto-disabled endpoint: held deliveries resume and the failure clock starts over. Audited.
 *
 * **Auth:** an API key with `webhooks:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.patchWebhookEndpointsId(id: String, body: PatchWebhookEndpointsIdBody, idempotencyKey: String? = null): WebhookEndpoint =
    WebhookEndpoint.fromJson(send("PATCH", "/v1/webhook-endpoints/${segment(id)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set an organization's plan. POST /v1/admin/orgs/{id}/plan
 *
 * Platform admins only. Moves an org to a plan without checkout.
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.postAdminOrgsIdPlan(id: String, body: PostAdminOrgsIdPlanBody, idempotencyKey: String? = null): PostAdminOrgsIdPlanResponse =
    PostAdminOrgsIdPlanResponse.fromJson(send("POST", "/v1/admin/orgs/${segment(id)}/plan", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Suspend an organization. POST /v1/admin/orgs/{id}/suspend
 *
 * Platform admins only. Suspends an org with a reason; its members and keys get 403 until it's unsuspended.
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.postAdminOrgsIdSuspend(id: String, body: PostAdminOrgsIdSuspendBody, idempotencyKey: String? = null): PostAdminOrgsIdSuspendResponse =
    PostAdminOrgsIdSuspendResponse.fromJson(send("POST", "/v1/admin/orgs/${segment(id)}/suspend", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Unsuspend an organization. POST /v1/admin/orgs/{id}/unsuspend
 *
 * Platform admins only. Lifts a suspension.
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.postAdminOrgsIdUnsuspend(id: String, idempotencyKey: String? = null): PostAdminOrgsIdUnsuspendResponse =
    PostAdminOrgsIdUnsuspendResponse.fromJson(send("POST", "/v1/admin/orgs/${segment(id)}/unsuspend", emptyList(), null, idempotencyKey, "json"))

/**
 * Ban a partner account. POST /v1/admin/partner-accounts/{id}/ban
 *
 * Platform admins only. Bans a partner account across the platform and signs it out everywhere.
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.postAdminPartnerAccountsIdBan(id: String, idempotencyKey: String? = null): PostAdminPartnerAccountsIdBanResponse =
    PostAdminPartnerAccountsIdBanResponse.fromJson(send("POST", "/v1/admin/partner-accounts/${segment(id)}/ban", emptyList(), null, idempotencyKey, "json"))

/**
 * Unban a partner account. POST /v1/admin/partner-accounts/{id}/unban
 *
 * Platform admins only. Lifts a platform ban.
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.postAdminPartnerAccountsIdUnban(id: String, idempotencyKey: String? = null): PostAdminPartnerAccountsIdUnbanResponse =
    PostAdminPartnerAccountsIdUnbanResponse.fromJson(send("POST", "/v1/admin/partner-accounts/${segment(id)}/unban", emptyList(), null, idempotencyKey, "json"))

/**
 * Open a status incident. POST /v1/admin/status/incidents
 *
 * Platform admins only. Opens an incident on the status page (and mirrors it to the hosted status space when configured).
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.postAdminStatusIncidents(body: PostAdminStatusIncidentsBody, idempotencyKey: String? = null): Incident =
    Incident.fromJson(send("POST", "/v1/admin/status/incidents", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Post an incident update. POST /v1/admin/status/incidents/{id}/updates
 *
 * Platform admins only. Adds a timestamped update to an incident and moves it to the given state.
 *
 * **Auth:** a platform admin session.
 */
suspend fun ReferalliClient.postAdminStatusIncidentsIdUpdates(id: String, body: PostAdminStatusIncidentsIdUpdatesBody, idempotencyKey: String? = null): Incident =
    Incident.fromJson(send("POST", "/v1/admin/status/incidents/${segment(id)}/updates", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Register an AI agent. POST /v1/agents/register
 *
 * Registers (or updates) an AI agent identity, proven by a wallet signature over a nonce from `POST /v1/partner/auth/wallet/nonce`. The nonce is single use and valid for 10 minutes. `instantPayout` pays the agent per outcome on the crypto rail. No API key: the signature is the credential.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.postAgentsRegister(body: PostAgentsRegisterBody, idempotencyKey: String? = null): PostAgentsRegisterResponse =
    PostAgentsRegisterResponse.fromJson(send("POST", "/v1/agents/register", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Scan for anomalies. POST /v1/anomalies/scan
 *
 * Compares the last 24 hours of clicks, sign-ups and revenue with the trailing 7-day average and returns this org's spikes (3x or more) and drops (under 20%). Findings also become notifications; nothing is changed automatically. Also runs hourly.
 *
 * **Auth:** an API key with `analytics:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postAnomaliesScan(idempotencyKey: String? = null): PostAnomaliesScanResponse =
    send("POST", "/v1/anomalies/scan", emptyList(), null, idempotencyKey, "json").array().map { PostAnomaliesScanResponseValueItem.fromJson(it) }

/**
 * Create an API key. POST /v1/api-keys
 *
 * Mints a secret key (`rk_live_…` / `rk_test_…`), shown only in this response. `scopes` defaults to `full`; a key can't grant scopes it doesn't hold. `mode` picks live, test or a matching pair of both (`both` returns `{ pairId, live, test }`); a test-mode caller can mint test keys only. `publishable: true` mints a browser-safe `rk_pub_` key limited to `programs:read` and `events:write` from `allowedOrigins`. `apiVersion` pins the key (default: latest). Needs an owner or admin session, or an API key with the `admin` scope. Audited.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postApiKeys(body: PostApiKeysBody, idempotencyKey: String? = null): PostApiKeysResponse =
    send("POST", "/v1/api-keys", emptyList(), body.toJson(), idempotencyKey, "json")

/**
 * Create a marketing asset. POST /v1/assets
 *
 * Adds a marketing asset (`banner`, `copy`, `video` or `logo`) to a program for its approved partners, or only for one group's members with `groupId`.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postAssets(body: PostAssetsBody, idempotencyKey: String? = null): PostAssetsResponse =
    PostAssetsResponse.fromJson(send("POST", "/v1/assets", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Replay attribution. POST /v1/attribution/replay
 *
 * Deterministically recomputes attribution for a program's referrals from the recorded clicks and identity links, under its current model. Returns what changed. Audited.
 *
 * **Auth:** an API key with `referrals:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postAttributionReplay(body: PostAttributionReplayBody, idempotencyKey: String? = null): PostAttributionReplayResponse =
    PostAttributionReplayResponse.fromJson(send("POST", "/v1/attribution/replay", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Connect an auth platform. POST /v1/auth/connections
 *
 * Connects your sign-up system so new users are attributed server-side without calling associate: `clerk`, `supabase`, `workos` or `generic` receive the platform's user webhooks at the returned URL; `atlas` and `custom` call the signed protocol endpoints under `/v1/auth/connections/{id}/`. `autoEnrollUsers` makes every new user a partner too. Returns the signing secret once. 409 when an Atlas instance already has a connection.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postAuthConnections(body: PostAuthConnectionsBody, idempotencyKey: String? = null): CreatedAuthConnection =
    CreatedAuthConnection.fromJson(send("POST", "/v1/auth/connections", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Change a user's id (signed protocol). POST /v1/auth/connections/{id}/aliases
 *
 * The app stamped or changed a user's id after the sign-up was filed: referrals and identity move from `fromCustomerRef` to `toCustomerRef`. Publishes `customer.aliased`. Signed with the connection secret in `x-referalli-signature: t=<unix>,v1=…,v2=…` (v2 also signs the request line; once a connection has seen v2 it requires it), with a unique `x-referalli-id` per call. Calls older than 5 minutes, reused ids (`409 replay`), paused connections (`423 connection_paused`) and unknown fields (`422`) are refused.
 *
 * **Auth:** a signature (see above); no API key.
 */
suspend fun ReferalliClient.postAuthConnectionsIdAliases(id: String, body: PostAuthConnectionsIdAliasesBody, idempotencyKey: String? = null): PostAuthConnectionsIdAliasesResponse =
    PostAuthConnectionsIdAliasesResponse.fromJson(send("POST", "/v1/auth/connections/${segment(id)}/aliases", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Erase a user (signed protocol). POST /v1/auth/connections/{id}/erase
 *
 * The platform deleted a user or fulfilled an erasure request: the customer's referral data and their partner record are erased. An unknown user succeeds with nothing erased. Signed with the connection secret in `x-referalli-signature: t=<unix>,v1=…,v2=…` (v2 also signs the request line; once a connection has seen v2 it requires it), with a unique `x-referalli-id` per call. Calls older than 5 minutes, reused ids (`409 replay`), paused connections (`423 connection_paused`) and unknown fields (`422`) are refused.
 *
 * **Auth:** a signature (see above); no API key.
 */
suspend fun ReferalliClient.postAuthConnectionsIdErase(id: String, body: PostAuthConnectionsIdEraseBody, idempotencyKey: String? = null): PostAuthConnectionsIdEraseResponse =
    PostAuthConnectionsIdEraseResponse.fromJson(send("POST", "/v1/auth/connections/${segment(id)}/erase", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Test an auth connection (signed protocol). POST /v1/auth/connections/{id}/ping
 *
 * Proves the secret works: returns the connection, its program and org and the server time, to check clock skew. Signed with the connection secret in `x-referalli-signature: t=<unix>,v1=…,v2=…` (v2 also signs the request line; once a connection has seen v2 it requires it), with a unique `x-referalli-id` per call. Calls older than 5 minutes, reused ids (`409 replay`), paused connections (`423 connection_paused`) and unknown fields (`422`) are refused.
 *
 * **Auth:** a signature (see above); no API key.
 */
suspend fun ReferalliClient.postAuthConnectionsIdPing(id: String, body: Map<String, JsonValue>, idempotencyKey: String? = null): PostAuthConnectionsIdPingResponse =
    PostAuthConnectionsIdPingResponse.fromJson(send("POST", "/v1/auth/connections/${segment(id)}/ping", emptyList(), JsonValue.Obj(body.mapValues { it.value }), idempotencyKey, "json"))

/**
 * Revoke the previous auth secret. POST /v1/auth/connections/{id}/revoke-previous-secret
 *
 * Ends the rotation overlap at once: only the newest secret verifies from now on.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postAuthConnectionsIdRevokePreviousSecret(id: String, idempotencyKey: String? = null): PostAuthConnectionsIdRevokePreviousSecretResponse =
    PostAuthConnectionsIdRevokePreviousSecretResponse.fromJson(send("POST", "/v1/auth/connections/${segment(id)}/revoke-previous-secret", emptyList(), null, idempotencyKey, "json"))

/**
 * Rotate an auth connection secret. POST /v1/auth/connections/{id}/rotate-secret
 *
 * Issues a new signing secret, returned once. The previous one keeps verifying for 24 hours, or until revoked.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postAuthConnectionsIdRotateSecret(id: String, idempotencyKey: String? = null): PostAuthConnectionsIdRotateSecretResponse =
    PostAuthConnectionsIdRotateSecretResponse.fromJson(send("POST", "/v1/auth/connections/${segment(id)}/rotate-secret", emptyList(), null, idempotencyKey, "json"))

/**
 * Report a user signal (signed protocol). POST /v1/auth/connections/{id}/signals
 *
 * A later verdict about a user: `email_verified` releases a hold for an unverified email, `fraud_confirmed` or `self_referral` voids their referral, `banned`/`unbanned` follow on their partner record. `details` is kept as evidence. Signed with the connection secret in `x-referalli-signature: t=<unix>,v1=…,v2=…` (v2 also signs the request line; once a connection has seen v2 it requires it), with a unique `x-referalli-id` per call. Calls older than 5 minutes, reused ids (`409 replay`), paused connections (`423 connection_paused`) and unknown fields (`422`) are refused.
 *
 * **Auth:** a signature (see above); no API key.
 */
suspend fun ReferalliClient.postAuthConnectionsIdSignals(id: String, body: PostAuthConnectionsIdSignalsBody, idempotencyKey: String? = null): PostAuthConnectionsIdSignalsResponse =
    PostAuthConnectionsIdSignalsResponse.fromJson(send("POST", "/v1/auth/connections/${segment(id)}/signals", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Attribute a new user (signed protocol). POST /v1/auth/connections/{id}/signups
 *
 * The auth platform reports a new user with the referral context captured at sign-up (`referral.code`, or with cookie consent `clickId`/`anonId`) and optional risk signals. The user is attributed (risky sign-ups are held for review), optionally made a partner with their own link, and the answer says why with reason codes. `test: true` or `atlas-test: 1` simulates without storing. Repeating the same user is idempotent. Signed with the connection secret in `x-referalli-signature: t=<unix>,v1=…,v2=…` (v2 also signs the request line; once a connection has seen v2 it requires it), with a unique `x-referalli-id` per call. Calls older than 5 minutes, reused ids (`409 replay`), paused connections (`423 connection_paused`) and unknown fields (`422`) are refused.
 *
 * **Auth:** a signature (see above); no API key.
 */
suspend fun ReferalliClient.postAuthConnectionsIdSignups(id: String, body: PostAuthConnectionsIdSignupsBody, idempotencyKey: String? = null): PostAuthConnectionsIdSignupsResponse =
    PostAuthConnectionsIdSignupsResponse.fromJson(send("POST", "/v1/auth/connections/${segment(id)}/signups", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update a user (signed protocol). POST /v1/auth/connections/{id}/users
 *
 * The user changed: email and name follow to their partner record, `suspended` suspends it, `deleted` erases. Signed with the connection secret in `x-referalli-signature: t=<unix>,v1=…,v2=…` (v2 also signs the request line; once a connection has seen v2 it requires it), with a unique `x-referalli-id` per call. Calls older than 5 minutes, reused ids (`409 replay`), paused connections (`423 connection_paused`) and unknown fields (`422`) are refused.
 *
 * **Auth:** a signature (see above); no API key.
 */
suspend fun ReferalliClient.postAuthConnectionsIdUsers(id: String, body: PostAuthConnectionsIdUsersBody, idempotencyKey: String? = null): PostAuthConnectionsIdUsersResponse =
    PostAuthConnectionsIdUsersResponse.fromJson(send("POST", "/v1/auth/connections/${segment(id)}/users", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Sign out. POST /v1/auth/logout
 *
 * Ends the browser session (and any portal-domain sessions handed off from it) and clears the cookies. Returns the identity provider's `logoutUrl` to end the provider session too, or `null`.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.postAuthLogout(idempotencyKey: String? = null): PostAuthLogoutResponse =
    PostAuthLogoutResponse.fromJson(send("POST", "/v1/auth/logout", emptyList(), null, idempotencyKey, "json"))

/**
 * Activate a plan directly. POST /v1/billing/activate
 *
 * Moves the org to a plan without checkout: anyone may move to Free (after cancelling a subscription); paid plans only for platform admins or self-hosted deployments (403 otherwise). Owner only. Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`.
 */
suspend fun ReferalliClient.postBillingActivate(body: PostBillingActivateBody, idempotencyKey: String? = null): PostBillingActivateResponse =
    PostBillingActivateResponse.fromJson(send("POST", "/v1/billing/activate", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Start a plan checkout. POST /v1/billing/checkout
 *
 * Creates a checkout session for a paid plan and returns its `url` to redirect to. 400 when billing is not configured on this deployment.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBillingCheckout(body: PostBillingCheckoutBody, idempotencyKey: String? = null): PostBillingCheckoutResponse =
    PostBillingCheckoutResponse.fromJson(send("POST", "/v1/billing/checkout", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Create a billing connection. POST /v1/billing/connections
 *
 * Connects a billing provider (`stripe`, `paddle`, `lemonsqueezy`, `polar`, `chargebee`, `shopify`, `recurly`, `braintree`, `woocommerce`, `bigcommerce` or `generic`) so its payment webhooks become commissions. Returns the `webhookUrl` path to register with the provider and its signing secret (generated unless you pass the provider's own `webhookSecret`); the secret is returned only here. Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBillingConnections(body: PostBillingConnectionsBody, idempotencyKey: String? = null): CreatedBillingConnection =
    CreatedBillingConnection.fromJson(send("POST", "/v1/billing/connections", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Rotate the webhook signing secret. POST /v1/billing/connections/{id}/rotate-secret
 *
 * Generates a new signing secret, returned once. The previous one keeps verifying until `previousSecretExpiresAt` (24 hours). Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBillingConnectionsIdRotateSecret(id: String, idempotencyKey: String? = null): PostBillingConnectionsIdRotateSecretResponse =
    PostBillingConnectionsIdRotateSecretResponse.fromJson(send("POST", "/v1/billing/connections/${segment(id)}/rotate-secret", emptyList(), null, idempotencyKey, "json"))

/**
 * Preview the value mapping. POST /v1/billing/connections/{id}/value-mapping/preview
 *
 * Applies the saved mapping (or a draft `mapping`) to a sample `payload` and returns what would be recorded. Writes nothing. A generic-connector body with `events` gets one result per event.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBillingConnectionsIdValueMappingPreview(id: String, body: PostBillingConnectionsIdValueMappingPreviewBody, idempotencyKey: String? = null): ValueMappingPreview =
    ValueMappingPreview.fromJson(send("POST", "/v1/billing/connections/${segment(id)}/value-mapping/preview", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Open the subscription portal. POST /v1/billing/portal
 *
 * Returns the `url` of the billing portal where the owner manages or cancels the subscription. 400 before there is a subscription.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBillingPortal(idempotencyKey: String? = null): PostBillingPortalResponse =
    PostBillingPortalResponse.fromJson(send("POST", "/v1/billing/portal", emptyList(), null, idempotencyKey, "json"))

/**
 * Set a custom portal domain. POST /v1/branding/domain
 *
 * Starts serving the partner portal on your own domain (such as `partners.example.com`), in your branding: returns the CNAME and TXT records to add. Needs a plan with custom domains (402 otherwise).
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBrandingDomain(body: PostBrandingDomainBody, idempotencyKey: String? = null): PostBrandingDomainResponse =
    PostBrandingDomainResponse.fromJson(send("POST", "/v1/branding/domain", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Verify the portal domain. POST /v1/branding/domain/verify
 *
 * Checks the portal domain's TXT record and CNAME, routes it and reports `provisioning` or `active` as for the link domain.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBrandingDomainVerify(idempotencyKey: String? = null): PostBrandingLinkDomainVerifyResponse =
    PostBrandingLinkDomainVerifyResponse.fromJson(send("POST", "/v1/branding/domain/verify", emptyList(), null, idempotencyKey, "json"))

/**
 * Set a custom link domain. POST /v1/branding/link-domain
 *
 * Starts using your own domain (such as `go.example.com`) for partner links: returns the CNAME target and the TXT record that proves you control it. Links move onto it once verified. Needs a plan with custom domains (402 otherwise); 409 when the domain is in use.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBrandingLinkDomain(body: PostBrandingLinkDomainBody, idempotencyKey: String? = null): PostBrandingLinkDomainResponse =
    PostBrandingLinkDomainResponse.fromJson(send("POST", "/v1/branding/link-domain", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Verify the link domain. POST /v1/branding/link-domain/verify
 *
 * Checks the TXT record and the CNAME. When both are right the domain is routed here; it is `active` once HTTPS answers on it (`provisioning` while the certificate is issued, which finishes on its own). 400 with what is missing otherwise.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postBrandingLinkDomainVerify(idempotencyKey: String? = null): PostBrandingLinkDomainVerifyResponse =
    PostBrandingLinkDomainVerifyResponse.fromJson(send("POST", "/v1/branding/link-domain/verify", emptyList(), null, idempotencyKey, "json"))

/**
 * Start a CLI sign-in. POST /v1/cli/device-codes
 *
 * The CLI `login` command calls this to start a device sign-in: returns a `deviceCode` for polling and a `userCode` for the person to approve at `verificationUri`. Codes expire after 10 minutes. No authentication; limited per IP.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.postCliDeviceCodes(body: PostCliDeviceCodesBody, idempotencyKey: String? = null): PostCliDeviceCodesResponse =
    PostCliDeviceCodesResponse.fromJson(send("POST", "/v1/cli/device-codes", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Poll a CLI sign-in. POST /v1/cli/device-codes/token
 *
 * Polled by the CLI every `interval` seconds with its `deviceCode`. Answers `pending`, `expired`, `denied` or `consumed`, or once approved, `approved` with the new API key (returned once). Polling faster than allowed is `429`.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.postCliDeviceCodesToken(body: PostCliDeviceCodesTokenBody, idempotencyKey: String? = null): PostCliDeviceCodesTokenResponse =
    PostCliDeviceCodesTokenResponse.fromJson(send("POST", "/v1/cli/device-codes/token", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Approve a CLI sign-in. POST /v1/cli/device-codes/{userCode}/approve
 *
 * Approves the sign-in and mints its API key in this org. `access` picks the scopes: `cli` (webhooks write and read access to the rest, the default), `read` or `full`. Needs a signed-in owner or admin. Audited.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postCliDeviceCodesUserCodeApprove(userCode: String, body: PostCliDeviceCodesUserCodeApproveBody, idempotencyKey: String? = null): PostCliDeviceCodesUserCodeApproveResponse =
    PostCliDeviceCodesUserCodeApproveResponse.fromJson(send("POST", "/v1/cli/device-codes/${segment(userCode)}/approve", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Deny a CLI sign-in. POST /v1/cli/device-codes/{userCode}/deny
 *
 * Refuses a pending sign-in; the CLI then sees `denied`.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postCliDeviceCodesUserCodeDeny(userCode: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/cli/device-codes/${segment(userCode)}/deny", emptyList(), null, idempotencyKey, "json"))

/**
 * Open a CLI event listener. POST /v1/cli/listeners
 *
 * The CLI `listen` command opens a listener for some `topics` (default every topic). Events are queued for it while it polls at least every 2 minutes, and each comes with Standard Webhooks headers signed with the returned `secret`, so the CLI can forward them to a local server.
 *
 * **Auth:** an API key with `webhooks:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postCliListeners(body: PostCliListenersBody, idempotencyKey: String? = null): PostCliListenersResponse =
    PostCliListenersResponse.fromJson(send("POST", "/v1/cli/listeners", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Send a test event. POST /v1/cli/trigger
 *
 * The CLI `trigger` command sends a realistic sample event (ids `*_test_…`, `test: true`) to the org's listeners and webhook endpoints. `data` overrides fields of the sample. 400 for a topic with no sample; `GET /v1/cli/topics` lists them.
 *
 * **Auth:** an API key with `webhooks:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postCliTrigger(body: PostCliTriggerBody, idempotencyKey: String? = null): PostCliTriggerResponse =
    PostCliTriggerResponse.fromJson(send("POST", "/v1/cli/trigger", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Publish a commission rule. POST /v1/commission-rules
 *
 * Publishes a new version of a program's commission rule; the latest version applies to new payments, and past lines keep the version that earned them. A rule has a `base` (percent in basis points, or a fixed amount), what it applies to (gross or net of tax or fees), how long it recurs, a hold before lines can be paid (`holdDays`, default 30), and optional conditions, per-partner/link/product overrides, volume tiers, event bounties, sub-affiliate levels and new-vs-expansion rates. Unknown fields at any depth are rejected. Audited.
 *
 * **Auth:** an API key with `commissions:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postCommissionRules(body: PostCommissionRulesBody, idempotencyKey: String? = null): PostCommissionRulesResponse =
    PostCommissionRulesResponse.fromJson(send("POST", "/v1/commission-rules", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Approve due commissions. POST /v1/commissions/approve-due
 *
 * Approves every pending line whose hold has elapsed (this also runs on a schedule). Returns how many were approved. Audited.
 *
 * **Auth:** an API key with `commissions:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postCommissionsApproveDue(idempotencyKey: String? = null): PostCommissionsApproveDueResponse =
    PostCommissionsApproveDueResponse.fromJson(send("POST", "/v1/commissions/approve-due", emptyList(), null, idempotencyKey, "json"))

/**
 * Adjust a commission. POST /v1/commissions/{id}/adjust
 *
 * Records an `adjusted` event against an earned line (a correction; the ledger is append-only). `amountMinor` is signed. An adjustment that would take the line below zero is refused unless `allowNegative`. Audited.
 *
 * **Auth:** an API key with `commissions:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postCommissionsIdAdjust(id: String, body: PostCommissionsIdAdjustBody, idempotencyKey: String? = null): PostCommissionsIdAdjustResponse =
    PostCommissionsIdAdjustResponse.fromJson(send("POST", "/v1/commissions/${segment(id)}/adjust", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Settle a commission yourself. POST /v1/commissions/{id}/settle
 *
 * Marks an earned line paid because you credited the partner yourself (for example as store credit), with your `reference`: records `approved` (if it isn't yet) and `paid`, and publishes `commission.settled`. The line never reaches a payout run or the 1099 export. Repeating the same reference returns the original settlement; a line already paid otherwise is 409. Audited.
 *
 * **Auth:** an API key with `commissions:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postCommissionsIdSettle(id: String, body: PostCommissionsIdSettleBody, idempotencyKey: String? = null): Settlement =
    Settlement.fromJson(send("POST", "/v1/commissions/${segment(id)}/settle", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Create a partner contract. POST /v1/contracts
 *
 * A contract offering one partner custom terms (`termsMd`) and `compensation` (percent or fixed) in a program, as a draft or sent at once (`send: true`). When accepted, the compensation becomes a partner override on a new rule version. Audited.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postContracts(body: PostContractsBody, idempotencyKey: String? = null): PostContractsResponse =
    PostContractsResponse.fromJson(send("POST", "/v1/contracts", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Send a contract. POST /v1/contracts/{id}/send
 *
 * Sends a draft contract to the partner. 400 when it is not a draft.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postContractsIdSend(id: String, idempotencyKey: String? = null): OkStatus =
    OkStatus.fromJson(send("POST", "/v1/contracts/${segment(id)}/send", emptyList(), null, idempotencyKey, "json"))

/**
 * Create a coupon code. POST /v1/coupons
 *
 * Registers a coupon code for a partner in a program, so checkouts that use it attribute to them (coupon codes win over clicks). Codes match case-insensitively and are unique per org (409).
 *
 * **Auth:** an API key with `links:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postCoupons(body: PostCouponsBody, idempotencyKey: String? = null): PostCouponsResponse =
    PostCouponsResponse.fromJson(send("POST", "/v1/coupons", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Invite a creator. POST /v1/creators/{accountId}/invite
 *
 * Invites a listed creator to a program with an optional message. 400 when they do not accept invitations or were already invited to that program.
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postCreatorsAccountIdInvite(accountId: String, body: PostCreatorsAccountIdInviteBody, idempotencyKey: String? = null): PostCreatorsAccountIdInviteResponse =
    PostCreatorsAccountIdInviteResponse.fromJson(send("POST", "/v1/creators/${segment(accountId)}/invite", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Approve a deal. POST /v1/deals/{id}/approve
 *
 * Approves a submitted deal and protects it for the partner for `protectionDays` (default 90). 404 when there's no submitted deal with that id.
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postDealsIdApprove(id: String, body: PostDealsIdApproveBody, idempotencyKey: String? = null): PostDealsIdApproveResponse =
    PostDealsIdApproveResponse.fromJson(send("POST", "/v1/deals/${segment(id)}/approve", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Reject a deal. POST /v1/deals/{id}/reject
 *
 * Rejects a submitted deal.
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postDealsIdReject(id: String, idempotencyKey: String? = null): PostDealsIdRejectResponse =
    PostDealsIdRejectResponse.fromJson(send("POST", "/v1/deals/${segment(id)}/reject", emptyList(), null, idempotencyKey, "json"))

/**
 * Mark a deal won. POST /v1/deals/{id}/won
 *
 * Marks an approved deal won, within its protection window: creates the referral for `customerRef` so the customer's payments earn the partner commission. Publishes `referral.created`.
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postDealsIdWon(id: String, body: PostDealsIdWonBody, idempotencyKey: String? = null): PostDealsIdWonResponse =
    PostDealsIdWonResponse.fromJson(send("POST", "/v1/deals/${segment(id)}/won", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Ingest prospects. POST /v1/discovery/corpus
 *
 * Adds up to 500 prospects from your own crawl or data source. Raw page `html` is scanned for affiliate footprints (the competitor programs it recognizes) to enrich the evidence; `keywords` scores fit. Duplicate URLs are skipped. Needs a plan with discovery (402 otherwise).
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postDiscoveryCorpus(body: PostDiscoveryCorpusBody, idempotencyKey: String? = null): PostDiscoveryCorpusResponse =
    PostDiscoveryCorpusResponse.fromJson(send("POST", "/v1/discovery/corpus", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Search for prospective partners. POST /v1/discovery/search
 *
 * Searches the configured corpus for creators and sites matching `keywords` (and `category`), scores their fit and saves them as prospects. Needs a plan with discovery (402 otherwise).
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postDiscoverySearch(body: PostDiscoverySearchBody, idempotencyKey: String? = null): PostDiscoverySearchResponse =
    PostDiscoverySearchResponse.fromJson(send("POST", "/v1/discovery/search", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Resolve a dispute. POST /v1/disputes/{id}/resolve
 *
 * Resolves an open dispute with a `resolution` note, which the partner sees. Publishes `dispute.resolved`. 404 when not open. Audited.
 *
 * **Auth:** an API key with `commissions:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postDisputesIdResolve(id: String, body: PostDisputesIdResolveBody, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/disputes/${segment(id)}/resolve", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Preview an email. POST /v1/email/preview
 *
 * Renders an event's email with sample values, from the stored template or an unsaved draft.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postEmailPreview(body: PostEmailPreviewBody, idempotencyKey: String? = null): EmailRendered =
    EmailRendered.fromJson(send("POST", "/v1/email/preview", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Check the sending domain. POST /v1/email/settings/verify-domain
 *
 * Asks the email provider whether the from address's domain is verified for sending, and stores the result. 400 until a provider, key and from address are set.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postEmailSettingsVerifyDomain(idempotencyKey: String? = null): PostEmailSettingsVerifyDomainResponse =
    send("POST", "/v1/email/settings/verify-domain", emptyList(), null, idempotencyKey, "json")

/**
 * Send a test email. POST /v1/email/test
 *
 * Sends one email with sample values to `to` through the org's provider. 400 without a provider or when the provider refuses it.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postEmailTest(body: PostEmailTestBody, idempotencyKey: String? = null): PostEmailTestResponse =
    PostEmailTestResponse.fromJson(send("POST", "/v1/email/test", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Mint a partner embed token. POST /v1/embed/tokens
 *
 * A 15-minute token for the partner with this email, for the partner stats web component (`/embed.js`) in your app.
 *
 * **Auth:** an API key with `links:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postEmbedTokens(body: PostEmbedTokensBody, idempotencyKey: String? = null): PostEmbedTokensResponse =
    PostEmbedTokensResponse.fromJson(send("POST", "/v1/embed/tokens", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Resolve a fraud case. POST /v1/fraud/cases/{id}/resolve
 *
 * Closes a case with an `action`: `dismiss` (a held referral is approved), `void_referral`, `suspend_partner` or `ban_partner`. The matching `referral.*` events are published. Audited.
 *
 * **Auth:** an API key with `fraud:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postFraudCasesIdResolve(id: String, body: PostFraudCasesIdResolveBody, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/fraud/cases/${segment(id)}/resolve", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Detect referral rings. POST /v1/fraud/detect-rings
 *
 * Looks for partners who are likely one operator with many accounts (a shared payout destination or a shared non-freemail sign-up domain) and opens a `ring` case for each group.
 *
 * **Auth:** an API key with `fraud:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postFraudDetectRings(idempotencyKey: String? = null): PostFraudDetectRingsResponse =
    PostFraudDetectRingsResponse.fromJson(send("POST", "/v1/fraud/detect-rings", emptyList(), null, idempotencyKey, "json"))

/**
 * Scan for invalid traffic. POST /v1/fraud/invalid-traffic/scan
 *
 * Scores each partner's clicks over the last `windowHours` (1 to 168, default 24) for invalid traffic and returns the probability, label and contributing signals per partner, plus how many were flagged.
 *
 * **Auth:** an API key with `fraud:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postFraudInvalidTrafficScan(body: PostFraudInvalidTrafficScanBody, idempotencyKey: String? = null): PostFraudInvalidTrafficScanResponse =
    PostFraudInvalidTrafficScanResponse.fromJson(send("POST", "/v1/fraud/invalid-traffic/scan", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Record an FX rate. POST /v1/fx-rates
 *
 * Records the rate cross-currency payouts convert at, for a currency pair, as a decimal string (`"1.0825"`), effective now or at `effectiveAt`. A manual rate pins its pair over the daily feed until cleared. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postFxRates(body: PostFxRatesBody, idempotencyKey: String? = null): FxRate =
    FxRate.fromJson(send("POST", "/v1/fx-rates", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Clear a manual FX rate. POST /v1/fx-rates/clear-override
 *
 * Retires the manual rates for a pair, handing it back to the feed. Returns how many were cleared. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postFxRatesClearOverride(body: PostFxRatesClearOverrideBody, idempotencyKey: String? = null): PostFxRatesClearOverrideResponse =
    PostFxRatesClearOverrideResponse.fromJson(send("POST", "/v1/fx-rates/clear-override", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Sync the FX feed now. POST /v1/fx-rates/sync
 *
 * Fetches the latest ECB reference rates for this org now, instead of waiting for the daily sync.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postFxRatesSync(idempotencyKey: String? = null): PostFxRatesSyncResponse =
    PostFxRatesSyncResponse.fromJson(send("POST", "/v1/fx-rates/sync", emptyList(), null, idempotencyKey, "json"))

/**
 * Query the GraphQL read layer (POST). POST /v1/graphql
 *
 * The GraphQL endpoint with the query in a JSON body. Read-only, so a read-scoped API key may call it.
 *
 * **Auth:** an API key with `analytics:read` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postGraphql(body: PostGraphqlBody, idempotencyKey: String? = null): PostGraphqlResponse =
    PostGraphqlResponse.fromJson(send("POST", "/v1/graphql", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Import partners from another tool. POST /v1/import/{provider}
 *
 * Imports partners, links and codes from a Rewardful, FirstPromoter, Tolt or PartnerStack CSV export (as a `text/csv` body or `{ "csv": "…" }`) into a program. `dryRun=true` reports what would happen; `destinationUrl` is used when the export has no link column. The tool's referral parameter is added to aff.js so shared links keep crediting. Audited.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postImportProvider(provider: String, body: PostImportProviderBody, programId: String, dryRun: Boolean? = null, destinationUrl: String? = null, idempotencyKey: String? = null): PostImportProviderResponse =
    PostImportProviderResponse.fromJson(send("POST", "/v1/import/${segment(provider)}", listOf("programId" to programId?.toString(), "dryRun" to dryRun?.toString(), "destinationUrl" to destinationUrl?.toString()), body.toJson(), idempotencyKey, "json"))

/**
 * Retry an integration delivery. POST /v1/integrations/deliveries/{id}/retry
 *
 * Queues a failed or skipped delivery again. 404 when there is no failed or skipped delivery with that id.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postIntegrationsDeliveriesIdRetry(id: String, idempotencyKey: String? = null): IntegrationDelivery =
    IntegrationDelivery.fromJson(send("POST", "/v1/integrations/deliveries/${segment(id)}/retry", emptyList(), null, idempotencyKey, "json"))

/**
 * Test the HubSpot connection. POST /v1/integrations/hubspot/test
 *
 * Checks the token against HubSpot and (unless `setupProperties: false`) creates the custom properties the sync uses. Returns `ok` and the error, if any, rather than failing.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postIntegrationsHubspotTest(body: PostIntegrationsHubspotTestBody, idempotencyKey: String? = null): PostIntegrationsHubspotTestResponse =
    PostIntegrationsHubspotTestResponse.fromJson(send("POST", "/v1/integrations/hubspot/test", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Test the Segment connection. POST /v1/integrations/segment/test
 *
 * Sends one test track event with the write key and reports whether Segment accepted it.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postIntegrationsSegmentTest(idempotencyKey: String? = null): PostIntegrationsSegmentTestResponse =
    PostIntegrationsSegmentTestResponse.fromJson(send("POST", "/v1/integrations/segment/test", emptyList(), null, idempotencyKey, "json"))

/**
 * Withdraw an invitation. POST /v1/invitations/{id}/withdraw
 *
 * Withdraws a pending creator invitation. 400 when it was already answered or withdrawn.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postInvitationsIdWithdraw(id: String, idempotencyKey: String? = null): OkStatus =
    OkStatus.fromJson(send("POST", "/v1/invitations/${segment(id)}/withdraw", emptyList(), null, idempotencyKey, "json"))

/**
 * Create a tracked link. POST /v1/links
 *
 * Creates a partner's tracked link in a program. `code` (letters, digits, `-`; stored lowercase) is unique per org and generated when omitted. Returns the `shortUrl` to share, on the org's verified link domain when it has one. 409 when the code is taken. Audited.
 *
 * **Auth:** an API key with `links:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postLinks(body: PostLinksBody, idempotencyKey: String? = null): CreatedLink =
    CreatedLink.fromJson(send("POST", "/v1/links", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Report an in-app purchase. POST /v1/mobile/purchases
 *
 * Your backend reports a validated App Store or Play purchase (or refund), after checking the receipt; it flows through the same commission engine as web billing. Idempotent per `eventId`. Never call this from the app itself.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postMobilePurchases(body: PostMobilePurchasesBody, idempotencyKey: String? = null): PostMobilePurchasesResponse =
    PostMobilePurchasesResponse.fromJson(send("POST", "/v1/mobile/purchases", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Mark a notification read. POST /v1/notifications/{id}/read
 *
 * Marks one notification read. Unknown or already-read ids are a no-op.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postNotificationsIdRead(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/notifications/${segment(id)}/read", emptyList(), null, idempotencyKey, "json"))

/**
 * Create an on-chain connection. POST /v1/onchain/connections
 *
 * Connects an on-chain indexer: on-chain conversions posted to its webhook URL become billing events. Returns the webhook URL and signing secret.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postOnchainConnections(body: PostOnchainConnectionsBody, idempotencyKey: String? = null): PostOnchainConnectionsResponse =
    PostOnchainConnectionsResponse.fromJson(send("POST", "/v1/onchain/connections", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Add a team member. POST /v1/org/members
 *
 * Adds an existing Referalli user (by email) with a role: `owner`, `admin`, `finance`, `analyst` or `support`. Only an owner can add an owner. 404 when no user has that email; 409 when already a member. Live mode only.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postOrgMembers(body: PostOrgMembersBody, idempotencyKey: String? = null): PostOrgMembersResponse =
    PostOrgMembersResponse.fromJson(send("POST", "/v1/org/members", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Create an organization. POST /v1/orgs
 *
 * Creates an organization with the signed-in user as its owner. Needs a user session (not an API key) but no `x-org-id`. Limited to 20 per hour per user. Live mode only.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postOrgs(body: PostOrgsBody, idempotencyKey: String? = null): PostOrgsResponse =
    PostOrgsResponse.fromJson(send("POST", "/v1/orgs", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Link the org to SSO. POST /v1/org/sso/link
 *
 * Creates the org's directory tenant at the SSO provider, with the calling owner (who must have signed in with the provider) as its first admin. Owner session only. 409 when already linked elsewhere. Live mode only.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`.
 */
suspend fun ReferalliClient.postOrgSsoLink(idempotencyKey: String? = null): PostOrgSsoLinkResponse =
    PostOrgSsoLinkResponse.fromJson(send("POST", "/v1/org/sso/link", emptyList(), null, idempotencyKey, "json"))

/**
 * Create an SSO setup link. POST /v1/org/sso/tickets
 *
 * A one-time link (valid `expiresInDays`, default 3) for the customer's IT admin to configure SAML or OIDC (and SCIM) on the provider's hosted page. The URL is returned once and never stored. Live mode only.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postOrgSsoTickets(body: PostOrgSsoTicketsBody, idempotencyKey: String? = null): PostOrgSsoTicketsResponse =
    PostOrgSsoTicketsResponse.fromJson(send("POST", "/v1/org/sso/tickets", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Revoke an SSO setup link. POST /v1/org/sso/tickets/{id}/revoke
 *
 * Revokes a pending setup link. Live mode only.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postOrgSsoTicketsIdRevoke(id: String, idempotencyKey: String? = null): PostOrgSsoTicketsIdRevokeResponse =
    PostOrgSsoTicketsIdRevokeResponse.fromJson(send("POST", "/v1/org/sso/tickets/${segment(id)}/revoke", emptyList(), null, idempotencyKey, "json"))

/**
 * Draft an outreach sequence. POST /v1/outreach/draft
 *
 * Drafts a recruiting email sequence for a prospect. Drafts are only sent after you approve them.
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postOutreachDraft(body: PostOutreachDraftBody, idempotencyKey: String? = null): PostOutreachDraftResponse =
    PostOutreachDraftResponse.fromJson(send("POST", "/v1/outreach/draft", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Approve an outreach message. POST /v1/outreach/{id}/approve
 *
 * Approves a drafted message so `POST /v1/outreach/send-due` sends it when due. Audited.
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postOutreachIdApprove(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/outreach/${segment(id)}/approve", emptyList(), null, idempotencyKey, "json"))

/**
 * Send due outreach. POST /v1/outreach/send-due
 *
 * Sends approved outreach messages that are due, skipping prospects without an email and addresses on the do-not-contact list (unsubscribed).
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postOutreachSendDue(idempotencyKey: String? = null): PostOutreachSendDueResponse =
    PostOutreachSendDueResponse.fromJson(send("POST", "/v1/outreach/send-due", emptyList(), null, idempotencyKey, "json"))

/**
 * Take a commission advance. POST /v1/partner/advance/accept
 *
 * Takes an advance of `amountMinor` (up to the offer). The principal plus fee is repaid by withholding future commissions from payouts.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerAdvanceAccept(body: PostPartnerAdvanceAcceptBody, idempotencyKey: String? = null): PostPartnerAdvanceAcceptResponse =
    PostPartnerAdvanceAcceptResponse.fromJson(send("POST", "/v1/partner/advance/accept", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Get a wallet sign-in nonce. POST /v1/partner/auth/wallet/nonce
 *
 * Starts wallet sign-in (and AI agent registration): returns a single-use nonce, valid 10 minutes, and the message to sign with the wallet.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.postPartnerAuthWalletNonce(body: PostPartnerAuthWalletNonceBody, idempotencyKey: String? = null): PostPartnerAuthWalletNonceResponse =
    PostPartnerAuthWalletNonceResponse.fromJson(send("POST", "/v1/partner/auth/wallet/nonce", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Sign in with a wallet. POST /v1/partner/auth/wallet/verify
 *
 * Verifies the wallet's signature over the nonce message and signs the partner in (creating the account on first use), setting the session cookie. 401 for an expired nonce or a signature that does not match.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.postPartnerAuthWalletVerify(body: PostPartnerAuthWalletVerifyBody, idempotencyKey: String? = null): PostPartnerAuthWalletVerifyResponse =
    PostPartnerAuthWalletVerifyResponse.fromJson(send("POST", "/v1/partner/auth/wallet/verify", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Accept a contract. POST /v1/partner/contracts/{id}/accept
 *
 * Accepts a sent contract; its compensation then applies to the partner's commissions in that program.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerContractsIdAccept(id: String, idempotencyKey: String? = null): OkStatus =
    OkStatus.fromJson(send("POST", "/v1/partner/contracts/${segment(id)}/accept", emptyList(), null, idempotencyKey, "json"))

/**
 * Decline a contract. POST /v1/partner/contracts/{id}/decline
 *
 * Declines a sent contract.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerContractsIdDecline(id: String, idempotencyKey: String? = null): OkStatus =
    OkStatus.fromJson(send("POST", "/v1/partner/contracts/${segment(id)}/decline", emptyList(), null, idempotencyKey, "json"))

/**
 * Register a deal. POST /v1/partner/deals
 *
 * A partner registers a B2B deal (company, contact, expected value) in a program they are approved in, for the merchant to approve. Publishes `deal.submitted`.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerDeals(body: PostPartnerDealsBody, idempotencyKey: String? = null): PostPartnerDealsResponse =
    PostPartnerDealsResponse.fromJson(send("POST", "/v1/partner/deals", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * File a dispute. POST /v1/partner/disputes
 *
 * Files a dispute with a merchant about a missing attribution or an unpaid commission, optionally for a referral. The merchant resolves it.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerDisputes(body: PostPartnerDisputesBody, idempotencyKey: String? = null): PostPartnerDisputesResponse =
    PostPartnerDisputesResponse.fromJson(send("POST", "/v1/partner/disputes", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Accept an invitation. POST /v1/partner/invitations/{id}/accept
 *
 * Accepts a pending invitation: the partner is created in the merchant's org if needed and enrolled, approved. The merchant is notified.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerInvitationsIdAccept(id: String, idempotencyKey: String? = null): OkStatus =
    OkStatus.fromJson(send("POST", "/v1/partner/invitations/${segment(id)}/accept", emptyList(), null, idempotencyKey, "json"))

/**
 * Decline an invitation. POST /v1/partner/invitations/{id}/decline
 *
 * Declines a pending invitation. The merchant is notified.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerInvitationsIdDecline(id: String, idempotencyKey: String? = null): OkStatus =
    OkStatus.fromJson(send("POST", "/v1/partner/invitations/${segment(id)}/decline", emptyList(), null, idempotencyKey, "json"))

/**
 * Submit identity verification. POST /v1/partner/kyc/submit
 *
 * Submits the partner's legal name, country and optional date of birth and document reference for identity verification and sanctions screening. Merchants that require KYC pay only verified partners. Limited to 5 per hour per IP.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerKycSubmit(body: PostPartnerKycSubmitBody, idempotencyKey: String? = null): PostPartnerKycSubmitResponse =
    PostPartnerKycSubmitResponse.fromJson(send("POST", "/v1/partner/kyc/submit", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Create a link. POST /v1/partner/links
 *
 * Creates a tracked link in a program the partner is approved in (403 otherwise), optionally for one of the program's marketing assets. `code` is generated when omitted; 409 when taken.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerLinks(body: PostPartnerLinksBody, idempotencyKey: String? = null): CreatedLink =
    CreatedLink.fromJson(send("POST", "/v1/partner/links", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Mark my notification read. POST /v1/partner/notifications/{id}/read
 *
 * Marks one of the partner's notifications read.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerNotificationsIdRead(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/partner/notifications/${segment(id)}/read", emptyList(), null, idempotencyKey, "json"))

/**
 * Accept self-billing. POST /v1/partner/orgs/{orgId}/self-billing
 *
 * Accepts the current self-billing agreement with this merchant (`{ "accept": true }`), so the merchant issues the invoices for the partner's payouts. 404 until payout details exist.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerOrgsOrgIdSelfBilling(orgId: String, body: PostPartnerOrgsOrgIdSelfBillingBody, idempotencyKey: String? = null): PostPartnerOrgsOrgIdSelfBillingResponse =
    PostPartnerOrgsOrgIdSelfBillingResponse.fromJson(send("POST", "/v1/partner/orgs/${segment(orgId)}/self-billing", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Submit my tax form. POST /v1/partner/orgs/{orgId}/tax-form
 *
 * Submits a W-9, W-8BEN or W-8BEN-E to this merchant. A tax form is required before the partner is included in payouts.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerOrgsOrgIdTaxForm(orgId: String, body: PostPartnerOrgsOrgIdTaxFormBody, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/partner/orgs/${segment(orgId)}/tax-form", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Apply to a program. POST /v1/partner/programs/{programId}/apply
 *
 * Applies to an active program (for example from the marketplace), creating the partner in that merchant's org if needed. The merchant approves or rejects it. Publishes `partner.applied`. 403 for blocked accounts.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerProgramsProgramIdApply(programId: String, idempotencyKey: String? = null): PostPartnerProgramsProgramIdApplyResponse =
    PostPartnerProgramsProgramIdApplyResponse.fromJson(send("POST", "/v1/partner/programs/${segment(programId)}/apply", emptyList(), null, idempotencyKey, "json"))

/**
 * Create a partner. POST /v1/partners
 *
 * Creates a partner. `email` is unique per org, and so is `externalRef` (your own id for them, such as a user id). With `upsert: true` an existing partner matching the email or externalRef is returned instead of a 409 (and gets the externalRef if it had none). Over the plan's partner limit this is `402 payment_required`. Audited.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postPartners(body: PostPartnersBody, idempotencyKey: String? = null): Partner =
    Partner.fromJson(send("POST", "/v1/partners", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Turn off two-factor. POST /v1/partner/security/totp/disable
 *
 * Turns two-factor off; needs a valid current `code`. 401 for a wrong code.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerSecurityTotpDisable(body: PostPartnerSecurityTotpDisableBody, idempotencyKey: String? = null): PostPartnerSecurityTotpDisableResponse =
    PostPartnerSecurityTotpDisableResponse.fromJson(send("POST", "/v1/partner/security/totp/disable", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Turn on two-factor. POST /v1/partner/security/totp/enable
 *
 * Confirms setup with a current 6-digit `code`. From then on, changing payout details needs a code in `x-totp-code`. 401 for a wrong code.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerSecurityTotpEnable(body: PostPartnerSecurityTotpEnableBody, idempotencyKey: String? = null): PostPartnerSecurityTotpEnableResponse =
    PostPartnerSecurityTotpEnableResponse.fromJson(send("POST", "/v1/partner/security/totp/enable", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Start two-factor setup. POST /v1/partner/security/totp/setup
 *
 * Generates a TOTP secret and its `otpauth://` URI for an authenticator app. 400 when two-factor is already on.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerSecurityTotpSetup(idempotencyKey: String? = null): PostPartnerSecurityTotpSetupResponse =
    PostPartnerSecurityTotpSetupResponse.fromJson(send("POST", "/v1/partner/security/totp/setup", emptyList(), null, idempotencyKey, "json"))

/**
 * Record a partner's tax form. POST /v1/partners/{id}/tax-form
 *
 * Records a W-9, W-8BEN or W-8BEN-E for the partner (`data` is the form's fields). A tax form on file is required before a partner is included in a payout run.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postPartnersIdTaxForm(id: String, body: PostPartnersIdTaxFormBody, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/partners/${segment(id)}/tax-form", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Accept program terms. POST /v1/partner/terms/{versionId}/accept
 *
 * Records the partner's acceptance of a terms version. Repeating it is a no-op.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPartnerTermsVersionIdAccept(versionId: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/partner/terms/${segment(versionId)}/accept", emptyList(), null, idempotencyKey, "json"))

/**
 * Verify a partner passport. POST /v1/passport/verify
 *
 * Checks a partner's signed reputation passport: `valid: true` with its claims, or `valid: false` with the reason (bad signature, expired). No authentication.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.postPassportVerify(body: PostPassportVerifyBody, idempotencyKey: String? = null): PostPassportVerifyResponse =
    PostPassportVerifyResponse.fromJson(send("POST", "/v1/passport/verify", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Create a payout run. POST /v1/payout-runs
 *
 * Builds a draft run: one payout per partner who has a payout profile, a tax form and an approved, unpaid balance over their threshold, converted into their payout currency at recorded FX, each with a self-billing invoice. Partners left out are listed in `skipped` with the reason. Nothing is paid until you execute it. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postPayoutRuns(idempotencyKey: String? = null): PayoutRunCreated =
    PayoutRunCreated.fromJson(send("POST", "/v1/payout-runs", emptyList(), null, idempotencyKey, "json"))

/**
 * Cancel a payout run. POST /v1/payout-runs/{id}/cancel
 *
 * Cancels a run that hasn't paid out and releases its lines back to the partners' approved balances. A run with money in flight is 409. Publishes `payout.cancelled` per payout. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postPayoutRunsIdCancel(id: String, idempotencyKey: String? = null): PostPayoutRunsIdCancelResponse =
    PostPayoutRunsIdCancelResponse.fromJson(send("POST", "/v1/payout-runs/${segment(id)}/cancel", emptyList(), null, idempotencyKey, "json"))

/**
 * Execute a payout run. POST /v1/payout-runs/{id}/execute
 *
 * Pays a draft run through the org's own connected payout providers (methods with no connection are simulated and logged; test mode uses the test rail). Returns how many were sent, submitted (settling asynchronously) and failed; each outcome publishes `payout.sent`, `payout.submitted` or `payout.failed`. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postPayoutRunsIdExecute(id: String, idempotencyKey: String? = null): PostPayoutRunsIdExecuteResponse =
    PostPayoutRunsIdExecuteResponse.fromJson(send("POST", "/v1/payout-runs/${segment(id)}/execute", emptyList(), null, idempotencyKey, "json"))

/**
 * Run due payout schedules. POST /v1/payout-runs/run-scheduled
 *
 * Creates and executes payout runs for every schedule (org or program) that is due now. This also runs hourly on its own.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postPayoutRunsRunScheduled(idempotencyKey: String? = null): PostPayoutRunsRunScheduledResponse =
    send("POST", "/v1/payout-runs/run-scheduled", emptyList(), null, idempotencyKey, "json").array().map { PostPayoutRunsRunScheduledResponseValueItem.fromJson(it) }

/**
 * Erase a data subject. POST /v1/privacy/forget
 *
 * Erases (pseudonymizes, keeping the ledger balanced) a customer by `customerRef`, a partner by `partnerId`, or by `email` both the partner with that email and every customer stored under its hash. Send exactly one. 400 when nothing is found. Audited.
 *
 * **Auth:** an API key with `privacy:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postPrivacyForget(body: PostPrivacyForgetBody, idempotencyKey: String? = null): PostPrivacyForgetResponse =
    PostPrivacyForgetResponse.fromJson(send("POST", "/v1/privacy/forget", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Find a data subject by email. POST /v1/privacy/lookup
 *
 * Which customers and partners an email refers to. The email is hashed on the server and never stored.
 *
 * **Auth:** an API key with `privacy:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postPrivacyLookup(body: PostPrivacyLookupBody, idempotencyKey: String? = null): PostPrivacyLookupResponse =
    PostPrivacyLookupResponse.fromJson(send("POST", "/v1/privacy/lookup", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Open a data-subject request. POST /v1/privacy/requests
 *
 * Opens an `access` or `erasure` request for one subject (`email`, `customerRef` or `partnerId`) and answers `202` with the request to poll. Publishes `privacy.request_completed` when done.
 *
 * **Auth:** an API key with `privacy:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postPrivacyRequests(body: PostPrivacyRequestsBody, idempotencyKey: String? = null): PostPrivacyRequestsResponse =
    PostPrivacyRequestsResponse.fromJson(send("POST", "/v1/privacy/requests", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Rebuild ROI figures. POST /v1/profitability/rebuild
 *
 * Recomputes every stored ROI figure from the value events with the current settings and mappings, in the background. Returns a `jobId` to poll; while one rebuild is running, the same job is returned. Audited.
 *
 * **Auth:** an API key with `analytics:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postProfitabilityRebuild(idempotencyKey: String? = null): PostProfitabilityRebuildResponse =
    PostProfitabilityRebuildResponse.fromJson(send("POST", "/v1/profitability/rebuild", emptyList(), null, idempotencyKey, "json"))

/**
 * Create a program. POST /v1/programs
 *
 * Creates an affiliate program: its attribution model, cookie window, how long after sign-up a conversion still counts, terms, public page and settings. `slug` is unique per org. Terms are versioned so partners can be asked to accept new ones. Over the plan's program limit this is `402 payment_required`.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postPrograms(body: PostProgramsBody, idempotencyKey: String? = null): Program =
    Program.fromJson(send("POST", "/v1/programs", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Apply partner levels. POST /v1/programs/{id}/apply-leveling
 *
 * Promotes the program's partners to the highest level their referral count qualifies for (never demotes). Publishes `partner.level_up` per promotion.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postProgramsIdApplyLeveling(id: String, idempotencyKey: String? = null): PostProgramsIdApplyLevelingResponse =
    PostProgramsIdApplyLevelingResponse.fromJson(send("POST", "/v1/programs/${segment(id)}/apply-leveling", emptyList(), null, idempotencyKey, "json"))

/**
 * Run autopricing. POST /v1/programs/{id}/autoprice/run
 *
 * Moves each partner's rate toward the target and publishes the new rates as partner overrides on a new rule version. Objective `roas` compares attributed revenue to commission; `roi` uses each partner's matured referral ROI, holding partners with too few matured referrals or an unknown ROI (listed in `held`). 400 when autopricing is off, the program has no percent-based rule, or no partner has a known ROI under `roi`.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postProgramsIdAutopriceRun(id: String, body: PostProgramsIdAutopriceRunBody, idempotencyKey: String? = null): PostProgramsIdAutopriceRunResponse =
    PostProgramsIdAutopriceRunResponse.fromJson(send("POST", "/v1/programs/${segment(id)}/autoprice/run", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Enroll a partner. POST /v1/programs/{id}/enrollments
 *
 * Enrolls an existing partner in the program, approved at once. Publishes `partner.enrolled`. 409 when already enrolled.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postProgramsIdEnrollments(id: String, body: PostProgramsIdEnrollmentsBody, idempotencyKey: String? = null): Enrollment =
    Enrollment.fromJson(send("POST", "/v1/programs/${segment(id)}/enrollments", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Approve an application. POST /v1/programs/{id}/enrollments/{enrollmentId}/approve
 *
 * Approves a pending application (`status: "applied"`). Publishes `partner.approved`. 404 when there is no pending application with that id. Audited.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postProgramsIdEnrollmentsEnrollmentIdApprove(id: String, enrollmentId: String, idempotencyKey: String? = null): PostProgramsIdEnrollmentsEnrollmentIdApproveResponse =
    PostProgramsIdEnrollmentsEnrollmentIdApproveResponse.fromJson(send("POST", "/v1/programs/${segment(id)}/enrollments/${segment(enrollmentId)}/approve", emptyList(), null, idempotencyKey, "json"))

/**
 * Reject an application. POST /v1/programs/{id}/enrollments/{enrollmentId}/reject
 *
 * Rejects a pending application. 404 when there is no pending application with that id. Audited.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postProgramsIdEnrollmentsEnrollmentIdReject(id: String, enrollmentId: String, idempotencyKey: String? = null): PostProgramsIdEnrollmentsEnrollmentIdRejectResponse =
    PostProgramsIdEnrollmentsEnrollmentIdRejectResponse.fromJson(send("POST", "/v1/programs/${segment(id)}/enrollments/${segment(enrollmentId)}/reject", emptyList(), null, idempotencyKey, "json"))

/**
 * Create a partner group. POST /v1/programs/{id}/groups
 *
 * A group of partners in a program with its own commission base (or `null` to keep the program rule's), hold days, payout threshold, payout currency, onboarding message and checklist. Names are unique per program (409).
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postProgramsIdGroups(id: String, body: PostProgramsIdGroupsBody, idempotencyKey: String? = null): PartnerGroup =
    PartnerGroup.fromJson(send("POST", "/v1/programs/${segment(id)}/groups", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Create a promotion. POST /v1/programs/{id}/promotions
 *
 * A time-boxed commission change for the whole program or one group: `replace` the base rate, or `boost` it by `bps`, between `startsAt` and `endsAt`. Payments in that window get it.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postProgramsIdPromotions(id: String, body: PostProgramsIdPromotionsBody, idempotencyKey: String? = null): Promotion =
    Promotion.fromJson(send("POST", "/v1/programs/${segment(id)}/promotions", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * End a promotion. POST /v1/promotions/{id}/end
 *
 * Ends a promotion now: payments from this moment on no longer get it.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postPromotionsIdEnd(id: String, idempotencyKey: String? = null): Promotion =
    Promotion.fromJson(send("POST", "/v1/promotions/${segment(id)}/end", emptyList(), null, idempotencyKey, "json"))

/**
 * Join a program. POST /v1/public/programs/{handle}/join
 *
 * One-step join from the public page for a signed-in partner: creates (or claims, with a verified email) the partner in the merchant's org and enrolls them, approved with a first link when the program auto-approves, otherwise as an application. Publishes `partner.approved` or `partner.applied`. 409 when the merchant's partner with that email belongs to another account.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.postPublicProgramsHandleJoin(handle: String, body: PostPublicProgramsHandleJoinBody, idempotencyKey: String? = null): PostPublicProgramsHandleJoinResponse =
    PostPublicProgramsHandleJoinResponse.fromJson(send("POST", "/v1/public/programs/${segment(handle)}/join", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Recompute quality scores. POST /v1/quality/recompute
 *
 * Snapshots every partner's quality score now; per the org's policy, low scores open a `quality` case or suspend the partner. Audited.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postQualityRecompute(idempotencyKey: String? = null): PostQualityRecomputeResponse =
    PostQualityRecomputeResponse.fromJson(send("POST", "/v1/quality/recompute", emptyList(), null, idempotencyKey, "json"))

/**
 * Attribute a new customer. POST /v1/referrals/associate
 *
 * The key server-side call: tell Referalli a customer signed up, with whatever you know about where they came from (`referralToken`/`ref_click_id`, `anonId`, `couponCode`, `emailHash`, IP and user agent). The attribution engine picks the partner under the program's model and windows. `referral` is `null` when no partner matched (not an error); `reasoning.notes` says why. Repeating `idempotencyKey` returns the existing referral. `occurredAt` records a late call at the real sign-up time (up to 5 minutes of clock skew is tolerated) and backfills payments since. `emailDomain` lets burner-email sign-ups be held for review. Publishes `referral.created` (or `referral.held`).
 *
 * **Auth:** an API key with `referrals:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postReferralsAssociate(body: PostReferralsAssociateBody, idempotencyKey: String? = null): AssociateResponse =
    AssociateResponse.fromJson(send("POST", "/v1/referrals/associate", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Approve a held referral. POST /v1/referrals/{id}/approve
 *
 * Releases a referral held for review (`pending_review`) back to `active`. 404 when it isn't pending review. Publishes `referral.approved`. Audited.
 *
 * **Auth:** an API key with `referrals:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postReferralsIdApprove(id: String, idempotencyKey: String? = null): Referral =
    Referral.fromJson(send("POST", "/v1/referrals/${segment(id)}/approve", emptyList(), null, idempotencyKey, "json"))

/**
 * Reassign a referral. POST /v1/referrals/{id}/reassign
 *
 * Moves the referral to another partner (recorded as a manual match). Publishes `referral.reassigned` with the previous partner. Audited.
 *
 * **Auth:** an API key with `referrals:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postReferralsIdReassign(id: String, body: PostReferralsIdReassignBody, idempotencyKey: String? = null): Referral =
    Referral.fromJson(send("POST", "/v1/referrals/${segment(id)}/reassign", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Void a referral. POST /v1/referrals/{id}/void
 *
 * Voids the referral so it earns nothing more. Publishes `referral.voided`. Audited.
 *
 * **Auth:** an API key with `referrals:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postReferralsIdVoid(id: String, idempotencyKey: String? = null): Referral =
    Referral.fromJson(send("POST", "/v1/referrals/${segment(id)}/void", emptyList(), null, idempotencyKey, "json"))

/**
 * Redeem a reward. POST /v1/rewards/{id}/redeem
 *
 * Records a (possibly partial) redemption: `amountMinor` (default the remaining balance) is capped at what's left, and the reward becomes `redeemed` once it is used up. `externalId` makes it idempotent (409 if reused for another reward). Publishes `credit.redeemed`.
 *
 * **Auth:** an API key with `commissions:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postRewardsIdRedeem(id: String, body: PostRewardsIdRedeemBody, idempotencyKey: String? = null): PostRewardsRedeemByCodeResponse =
    PostRewardsRedeemByCodeResponse.fromJson(send("POST", "/v1/rewards/${segment(id)}/redeem", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Redeem a reward by code. POST /v1/rewards/redeem-by-code
 *
 * Records a redemption of the reward with this code; see `POST /v1/rewards/{id}/redeem`. 404 for an unknown code.
 *
 * **Auth:** an API key with `commissions:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postRewardsRedeemByCode(body: PostRewardsRedeemByCodeBody, idempotencyKey: String? = null): PostRewardsRedeemByCodeResponse =
    PostRewardsRedeemByCodeResponse.fromJson(send("POST", "/v1/rewards/redeem-by-code", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Open a review for a pattern match. POST /v1/roi/patterns/{pattern}/review
 *
 * Turns one live pattern match (by `customerRef` and/or `partnerId`, optionally `programId`) into a `value_pattern` fraud case against its partner, or returns the open case for the same match. Publishes `fraud.case_opened`. 404 when no such match exists. Audited.
 *
 * **Auth:** an API key with `analytics:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postRoiPatternsPatternReview(pattern: String, body: PostRoiPatternsPatternReviewBody, idempotencyKey: String? = null): FraudCase =
    FraudCase.fromJson(send("POST", "/v1/roi/patterns/${segment(pattern)}/review", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Simulate billing history. POST /v1/sandbox/simulate
 *
 * Generates deterministic billing history through the real commission pipeline, so you can see commissions flow without a provider: a new sandbox customer referred to the partner, `months` (default 3) of subscription payments at `priceMinor`, then for `scenario: "refund"` a half refund of the first invoice or for `churn` a cancellation. Returns the customer and what was created. Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postSandboxSimulate(body: PostSandboxSimulateBody, idempotencyKey: String? = null): PostSandboxSimulateResponse =
    PostSandboxSimulateResponse.fromJson(send("POST", "/v1/sandbox/simulate", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * File a corrected 1099. POST /v1/tax/1099/documents/{id}/correct
 *
 * Files a corrected form for one document with the partner's current amount. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postTax1099DocumentsIdCorrect(id: String, idempotencyKey: String? = null): TaxFiling =
    TaxFiling.fromJson(send("POST", "/v1/tax/1099/documents/${segment(id)}/correct", emptyList(), null, idempotencyKey, "json"))

/**
 * File 1099-NEC forms. POST /v1/tax/1099/filings
 *
 * E-files the year's 1099-NEC forms through the connected provider and records one document per partner. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postTax1099Filings(body: PostTax1099FilingsBody, idempotencyKey: String? = null): TaxFiling =
    TaxFiling.fromJson(send("POST", "/v1/tax/1099/filings", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Refresh a filing status. POST /v1/tax/1099/filings/{id}/refresh
 *
 * Asks the filing provider for the latest status of a filing and its documents; accepted forms are then delivered to partners (`tax.form_delivered`).
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postTax1099FilingsIdRefresh(id: String, idempotencyKey: String? = null): PostTax1099FilingsIdRefreshResponse =
    PostTax1099FilingsIdRefreshResponse.fromJson(send("POST", "/v1/tax/1099/filings/${segment(id)}/refresh", emptyList(), null, idempotencyKey, "json"))

/**
 * Advance the test clock. POST /v1/test_clock/advance
 *
 * Test mode only. Moves the test org's clock forward by `seconds` (never back), then runs what came due: held commissions are approved, payout schedules fire and retention purges run. Returns the new time and what ran. Audited.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.postTestClockAdvance(body: PostTestClockAdvanceBody, idempotencyKey: String? = null): PostTestClockAdvanceResponse =
    PostTestClockAdvanceResponse.fromJson(send("POST", "/v1/test_clock/advance", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Track an event. POST /v1/track/events
 *
 * Records one event. `type: "event"` is a product event for a known customer (`event`, such as `trial_started`) that can pay a bounty under the program's commission rule; it returns whether it was recorded and the commission. `idempotencyKey` deduplicates. `type: "click"` records a server-side click for a partner; `type: "custom"` records an audited custom event. Publishable keys may send only custom events.
 *
 * **Auth:** an API key with `events:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postTrackEvents(body: JsonValue, idempotencyKey: String? = null): PostTrackEventsResponse =
    PostTrackEventsResponse.fromJson(send("POST", "/v1/track/events", emptyList(), body, idempotencyKey, "json"))

/**
 * Unsubscribe from outreach. POST /v1/unsubscribe/{token}
 *
 * The one-click unsubscribe link in outreach emails. No authentication; the token identifies the recipient.
 *
 * **Auth:** none.
 */
suspend fun ReferalliClient.postUnsubscribeToken(token: String, idempotencyKey: String? = null): PostUnsubscribeTokenResponse =
    PostUnsubscribeTokenResponse.fromJson(send("POST", "/v1/unsubscribe/${segment(token)}", emptyList(), null, idempotencyKey, "json"))

/**
 * Record value events. POST /v1/value/events
 *
 * Reports up to 500 value facts from your platform: `payment`, `refund`, `credit_granted`, `credit_redeemed`, `credit_expired`, `credit_revoked`, `cost` or `adjustment`. Each needs `kind`, `currency`, `externalId` (your stable id, which makes it idempotent) and `occurredAt`, plus the customer, partner (`partnerId` or `partnerExternalRef`), grant, program, product and amount fields (`cashMinor`, `creditAppliedMinor`, `discountMinor`, `taxMinor`, `feesMinor`, `costMinor`, `faceMinor`) that apply. Each event is validated and recorded on its own: `results` and `errors` are by index. A repeat of an `externalId` with new figures supersedes the earlier one.
 *
 * **Auth:** an API key with `analytics:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postValueEvents(body: PostValueEventsBody, idempotencyKey: String? = null): PostValueEventsResponse =
    PostValueEventsResponse.fromJson(send("POST", "/v1/value/events", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Import value events from CSV. POST /v1/value/import
 *
 * Imports value events from CSV text (up to 10,000 rows and 5 MB, else `413 payload_too_large`) with a `mapping` from column names to event fields (money as `<field>Minor` or `<field>Major`). `kind` applies to every row unless a column maps to it. Up to 500 rows are recorded before the response; a larger file answers `202` with a `jobId` to poll. `dryRun` returns the first 20 parsed rows and every row error without recording.
 *
 * **Auth:** an API key with `analytics:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postValueImport(body: PostValueImportBody, idempotencyKey: String? = null): PostValueImportResponse =
    send("POST", "/v1/value/import", emptyList(), body.toJson(), idempotencyKey, "json")

/**
 * Replay a webhook delivery. POST /v1/webhook-deliveries/{id}/replay
 *
 * Queues the delivery again at once with its attempt count reset. It keeps its `webhook-id`, so receivers can deduplicate.
 *
 * **Auth:** an API key with `webhooks:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postWebhookDeliveriesIdReplay(id: String, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("POST", "/v1/webhook-deliveries/${segment(id)}/replay", emptyList(), null, idempotencyKey, "json"))

/**
 * Create a webhook endpoint. POST /v1/webhook-endpoints
 *
 * Subscribes an HTTPS URL to event topics (default `["*"]`, every event; see the `webhooks` section of this document for each topic's payload). `programIds` limits it to events about those programs (org-wide events such as payouts are then not sent). Deliveries are signed the Standard Webhooks way with the returned `secret` (`whsec_…`), shown only here. `legacySignature: true` also sends the deprecated body-only signature.
 *
 * **Auth:** an API key with `webhooks:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postWebhookEndpoints(body: PostWebhookEndpointsBody, idempotencyKey: String? = null): PostWebhookEndpointsResponse =
    PostWebhookEndpointsResponse.fromJson(send("POST", "/v1/webhook-endpoints", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Rotate an endpoint secret. POST /v1/webhook-endpoints/{id}/rotate-secret
 *
 * Issues a new signing secret, returned once. For 24 hours (`previousSecretExpiresAt`) every delivery carries a signature from each secret, so receivers can switch without dropping any. Audited.
 *
 * **Auth:** an API key with `webhooks:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postWebhookEndpointsIdRotateSecret(id: String, idempotencyKey: String? = null): PostWebhookEndpointsIdRotateSecretResponse =
    PostWebhookEndpointsIdRotateSecretResponse.fromJson(send("POST", "/v1/webhook-endpoints/${segment(id)}/rotate-secret", emptyList(), null, idempotencyKey, "json"))

/**
 * Mint a referral widget token. POST /v1/widget/tokens
 *
 * Your backend mints a short-lived token (60 to 3600 seconds, default 900) for a signed-in customer, identified by `customerRef` or `partnerExternalRef`, for the in-app referral widget. When the program has `settings.widget.autoEnroll`, a customer who isn't a partner yet is created on demand (send `email`). The token only reads that partner's own data.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.postWidgetTokens(body: PostWidgetTokensBody, idempotencyKey: String? = null): PostWidgetTokensResponse =
    PostWidgetTokensResponse.fromJson(send("POST", "/v1/widget/tokens", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Record a conversion from Zapier. POST /v1/zapier/conversions
 *
 * Zapier's "Record conversion" action: a payment (or refund) for a customer through a generic billing connection (the org's first active one unless `connectionId`), with no signature needed. Idempotent by `providerEventId`. 400 without a generic billing connection.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postZapierConversions(body: PostZapierConversionsBody, idempotencyKey: String? = null): PostZapierConversionsResponse =
    PostZapierConversionsResponse.fromJson(send("POST", "/v1/zapier/conversions", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Subscribe a Zapier hook. POST /v1/zapier/hooks
 *
 * REST hook subscribe, called by Zapier when a Zap turns on: events of `event` are posted to the HTTPS `target_url`.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.postZapierHooks(body: PostZapierHooksBody, idempotencyKey: String? = null): ZapierHook =
    ZapierHook.fromJson(send("POST", "/v1/zapier/hooks", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set provider API credentials. PUT /v1/billing/connections/{id}/credentials
 *
 * For providers that send thin webhooks (Recurly, BigCommerce), the API credentials used to fetch the full event: `apiKey`, or `apiToken` plus `storeHash`, and `region`. Stored encrypted. 400 for providers that take no credentials or when a required field is missing. Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putBillingConnectionsIdCredentials(id: String, body: PutBillingConnectionsIdCredentialsBody, idempotencyKey: String? = null): PutBillingConnectionsIdCredentialsResponse =
    PutBillingConnectionsIdCredentialsResponse.fromJson(send("PUT", "/v1/billing/connections/${segment(id)}/credentials", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set the webhook signing secret. PUT /v1/billing/connections/{id}/secret
 *
 * Replaces the connection's signing secret with the provider's own (at least 8 characters). The previous secret keeps verifying for 24 hours. Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putBillingConnectionsIdSecret(id: String, body: PutBillingConnectionsIdSecretBody, idempotencyKey: String? = null): PutBillingConnectionsIdSecretResponse =
    PutBillingConnectionsIdSecretResponse.fromJson(send("PUT", "/v1/billing/connections/${segment(id)}/secret", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set the value mapping. PUT /v1/billing/connections/{id}/value-mapping
 *
 * Where cash, credit applied, discount, cost and product live in this connection's payloads, as dot paths (`[]` sums an array, for example `data.discounts[].amount`), and whether amounts are in minor or major units. Each save bumps the mapping version; a rebuild re-applies it to stored events. Audited.
 *
 * **Auth:** an API key with `billing:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putBillingConnectionsIdValueMapping(id: String, body: PutBillingConnectionsIdValueMappingBody, idempotencyKey: String? = null): PutBillingConnectionsIdValueMappingResponse =
    PutBillingConnectionsIdValueMappingResponse.fromJson(send("PUT", "/v1/billing/connections/${segment(id)}/value-mapping", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update branding. PUT /v1/branding
 *
 * Sets the logo URL, theme (only the documented `--r-*` tokens, with plain CSS values) and email sender. Omitted fields keep their value.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putBranding(body: PutBrandingBody, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("PUT", "/v1/branding", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update email settings. PUT /v1/email/settings
 *
 * Sets the email provider and its API key (write-only: omit to keep it, `null` to remove), the from address and name, reply-to, logo and primary color for partner emails. Without a provider, no email is sent.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putEmailSettings(body: PutEmailSettingsBody, idempotencyKey: String? = null): EmailSettings =
    EmailSettings.fromJson(send("PUT", "/v1/email/settings", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Override an email template. PUT /v1/email/templates/{event}/{locale}
 *
 * Replaces the subject, text and optional HTML of one event in one locale. 404 for an unknown event or locale.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putEmailTemplatesEventLocale(event: String, locale: String, body: PutEmailTemplatesEventLocaleBody, idempotencyKey: String? = null): PutEmailTemplatesEventLocaleResponse =
    PutEmailTemplatesEventLocaleResponse.fromJson(send("PUT", "/v1/email/templates/${segment(event)}/${segment(locale)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Connect HubSpot. PUT /v1/integrations/hubspot
 *
 * Connects HubSpot with your private-app `token` (required the first time; omit to keep it) to sync partners as contacts and referrals as deals in `pipeline`, moving them to `paidDealStage` when they pay. `status: "paused"` stops syncing.
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putIntegrationsHubspot(body: PutIntegrationsHubspotBody, idempotencyKey: String? = null): IntegrationConnection =
    IntegrationConnection.fromJson(send("PUT", "/v1/integrations/hubspot", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Connect Segment. PUT /v1/integrations/segment
 *
 * Connects a Segment source with its `writeKey` (required the first time) and sends referral, commission, payout and partner events as track calls; `events` limits which topics (`null` for all).
 *
 * **Auth:** an API key with `integrations:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putIntegrationsSegment(body: PutIntegrationsSegmentBody, idempotencyKey: String? = null): IntegrationConnection =
    IntegrationConnection.fromJson(send("PUT", "/v1/integrations/segment", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * List a program in the marketplace. PUT /v1/marketplace/listing
 *
 * Creates or updates the marketplace listing of a program: visibility (`public` or `unlisted`), category, headline, description and sponsored placement. Audited.
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putMarketplaceListing(body: PutMarketplaceListingBody, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("PUT", "/v1/marketplace/listing", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set my email language. PUT /v1/me/locale
 *
 * The signed-in user's preferred locale for emails. User session only.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.putMeLocale(body: PutMeLocaleBody, idempotencyKey: String? = null): PutMeLocaleResponse =
    PutMeLocaleResponse.fromJson(send("PUT", "/v1/me/locale", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Turn my ROI digest on or off. PUT /v1/me/roi-digest
 *
 * Whether the signed-in member receives this org's periodic credit ROI digest email. User session only.
 *
 * **Auth:** an API key with `team:write` (or `full`), or a session of any role.
 */
suspend fun ReferalliClient.putMeRoiDigest(body: PutMeRoiDigestBody, idempotencyKey: String? = null): PutMeRoiDigestResponse =
    PutMeRoiDigestResponse.fromJson(send("PUT", "/v1/me/roi-digest", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Join or leave the attribution network. PUT /v1/network/settings
 *
 * Opts the org in or out of the cross-merchant attribution network: contributing its referral touchpoints (as hashed customer identities and partner accounts, never merchant identity or PII) and, in return, reading the network journey.
 *
 * **Auth:** an API key with `growth:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putNetworkSettings(body: PutNetworkSettingsBody, idempotencyKey: String? = null): PutNetworkSettingsResponse =
    PutNetworkSettingsResponse.fromJson(send("PUT", "/v1/network/settings", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Turn the FX feed on or off. PUT /v1/org/fx-feed
 *
 * Turns the daily ECB reference-rate feed on or off. Turning it on syncs once at once and returns how many rates were inserted. Audited.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.putOrgFxFeed(body: PutOrgFxFeedBody, idempotencyKey: String? = null): PutOrgFxFeedResponse =
    PutOrgFxFeedResponse.fromJson(send("PUT", "/v1/org/fx-feed", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set the org payout schedule. PUT /v1/org/payout-schedule
 *
 * When payouts run automatically for every program without its own schedule: a `schedule` (`monthly`, `weekly`, `twice_monthly` or `custom` dates), the older `dayOfMonth` form, or `null` to turn automatic payouts off. Send exactly one of `schedule` and `dayOfMonth`. Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.putOrgPayoutSchedule(body: PutOrgPayoutScheduleBody, idempotencyKey: String? = null): PutOrgPayoutScheduleResponse =
    PutOrgPayoutScheduleResponse.fromJson(send("PUT", "/v1/org/payout-schedule", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set referral query parameters. PUT /v1/org/referral-params
 *
 * Replaces the extra query parameters aff.js reads a referral code from (up to 10; lowercase letters, digits and `_`). Built-in names are dropped. Imports add the previous tool's parameter here so already-shared links keep crediting. Audited.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putOrgReferralParams(body: PutOrgReferralParamsBody, idempotencyKey: String? = null): GetOrgReferralParamsResponse =
    GetOrgReferralParamsResponse.fromJson(send("PUT", "/v1/org/referral-params", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set the data retention policy. PUT /v1/org/retention
 *
 * Changes retention days for one or more kinds of raw data (others keep their value). Values below a kind's minimum are rejected. Audited.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putOrgRetention(body: PutOrgRetentionBody, idempotencyKey: String? = null): Retention =
    Retention.fromJson(send("PUT", "/v1/org/retention", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Connect a 1099 filing provider. PUT /v1/org/tax-filing
 *
 * Chooses who e-files 1099-NEC forms: `test` (simulated) or `tax1099` with your own API key (stored encrypted). Audited.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putOrgTaxFiling(body: PutOrgTaxFilingBody, idempotencyKey: String? = null): PutOrgTaxFilingResponse =
    PutOrgTaxFilingResponse.fromJson(send("PUT", "/v1/org/tax-filing", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update the tax profile. PUT /v1/org/tax-profile
 *
 * Sets any of the tax profile fields; `null` clears one. A VAT id must be a valid EU VAT number; an EIN looks like `12-3456789`. Audited.
 *
 * **Auth:** an API key with `org:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.putOrgTaxProfile(body: PutOrgTaxProfileBody, idempotencyKey: String? = null): TaxProfile =
    TaxProfile.fromJson(send("PUT", "/v1/org/tax-profile", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set my email language (partner). PUT /v1/partner/locale
 *
 * The partner account's preferred locale for emails.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.putPartnerLocale(body: PutPartnerLocaleBody, idempotencyKey: String? = null): PutPartnerLocaleResponse =
    PutPartnerLocaleResponse.fromJson(send("PUT", "/v1/partner/locale", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set my payout details. PUT /v1/partner/orgs/{orgId}/payout-profile
 *
 * How this merchant pays the partner: the method, its details (checked for what the rail needs, such as a PayPal email or wallet address) and currency. When two-factor sign-in is on, send the current code in `x-totp-code` (`401 step_up_required` otherwise).
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.putPartnerOrgsOrgIdPayoutProfile(orgId: String, body: PutPartnerOrgsOrgIdPayoutProfileBody, idempotencyKey: String? = null): PutPartnerOrgsOrgIdPayoutProfileResponse =
    PutPartnerOrgsOrgIdPayoutProfileResponse.fromJson(send("PUT", "/v1/partner/orgs/${segment(orgId)}/payout-profile", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set my conversion postback. PUT /v1/partner/orgs/{orgId}/postback
 *
 * Registers a server-to-server postback URL the merchant calls on the partner's events, with macros `{topic}`, `{partner_id}`, `{referral_id}`, `{customer}`, `{amount}`, `{currency}`. Returns a new signing secret.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.putPartnerOrgsOrgIdPostback(orgId: String, body: PutPartnerOrgsOrgIdPostbackBody, idempotencyKey: String? = null): PutPartnerOrgsOrgIdPostbackResponse =
    PutPartnerOrgsOrgIdPostbackResponse.fromJson(send("PUT", "/v1/partner/orgs/${segment(orgId)}/postback", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set my VAT number. PUT /v1/partner/orgs/{orgId}/vat
 *
 * Sets the partner's own EU VAT number with this merchant, checked against VIES when the merchant requires it.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.putPartnerOrgsOrgIdVat(orgId: String, body: PutPartnerOrgsOrgIdVatBody, idempotencyKey: String? = null): PutPartnersIdVatResponse =
    PutPartnersIdVatResponse.fromJson(send("PUT", "/v1/partner/orgs/${segment(orgId)}/vat", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update my creator profile. PUT /v1/partner/profile
 *
 * Updates the creator profile merchants search. `published: true` lists it in creator search; `acceptsInvites` controls whether merchants can invite the partner.
 *
 * **Auth:** a partner session.
 */
suspend fun ReferalliClient.putPartnerProfile(body: PutPartnerProfileBody, idempotencyKey: String? = null): Ok =
    Ok.fromJson(send("PUT", "/v1/partner/profile", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set a partner's payout profile. PUT /v1/partners/{id}/payout-profile
 *
 * How the partner is paid: `method` (`paypal`, `wise`, `stripe_connect`, `ach`, `crypto`, `payoneer`, `tremendous` or `csv`), method `details` (a free-form map such as `{ "paypalEmail": … }`), the currency to pay in and the minimum balance before a payout. Partners can also set this themselves in the portal.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.putPartnersIdPayoutProfile(id: String, body: PutPartnersIdPayoutProfileBody, idempotencyKey: String? = null): PutPartnersIdPayoutProfileResponse =
    PutPartnersIdPayoutProfileResponse.fromJson(send("PUT", "/v1/partners/${segment(id)}/payout-profile", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set a partner's VAT number. PUT /v1/partners/{id}/vat
 *
 * Sets (or clears with `null`) the partner's EU VAT number on their payout profile. With `viesCheck` on, VIES must list it as registered. 404 until the partner has payout details. Audited.
 *
 * **Auth:** an API key with `partners:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.putPartnersIdVat(id: String, body: PutPartnersIdVatBody, idempotencyKey: String? = null): PutPartnersIdVatResponse =
    PutPartnersIdVatResponse.fromJson(send("PUT", "/v1/partners/${segment(id)}/vat", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Connect a payout provider. PUT /v1/payout-connections/{provider}
 *
 * Connects (or replaces) your own account with a payout provider, so payouts move money from your account: `paypal` (`clientId`, `secret`), `stripe` (`secretKey`), `circle` (`apiKey`, `walletId`), `wise` (`apiToken`, `profileId`), `payoneer` (`clientId`, `secret`, `programId`) or `tremendous` (`apiKey`, `fundingSourceId`), each with `env`. Stored encrypted and never echoed. Live mode only (`409 test_mode_unsupported` in test mode). Audited.
 *
 * **Auth:** an API key with `payouts:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.putPayoutConnectionsProvider(provider: String, body: JsonValue, idempotencyKey: String? = null): PutPayoutConnectionsProviderResponse =
    PutPayoutConnectionsProviderResponse.fromJson(send("PUT", "/v1/payout-connections/${segment(provider)}", emptyList(), body, idempotencyKey, "json"))

/**
 * Set a product margin. PUT /v1/profitability/products/{productRef}
 *
 * Sets a product's margin (`marginBps`) or unit cost (`unitCostMinor`, in `currency`, default the reporting currency); exactly one of the two. Audited.
 *
 * **Auth:** an API key with `analytics:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putProfitabilityProductsProductRef(productRef: String, body: PutProfitabilityProductsProductRefBody, idempotencyKey: String? = null): GetProfitabilityProductsProductRefResponse =
    GetProfitabilityProductsProductRefResponse.fromJson(send("PUT", "/v1/profitability/products/${segment(productRef)}", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Update profitability settings. PUT /v1/profitability/settings
 *
 * Changes the org's economics settings, or with `programId` that program's overrides (a program can't override org-only fields such as the reporting currency). Returns the resolved settings. Re-run `POST /v1/profitability/rebuild` to apply changes to past figures. Audited.
 *
 * **Auth:** an API key with `analytics:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putProfitabilitySettings(body: PutProfitabilitySettingsBody, idempotencyKey: String? = null): GetProfitabilitySettingsResponse =
    GetProfitabilitySettingsResponse.fromJson(send("PUT", "/v1/profitability/settings", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Configure autopricing. PUT /v1/programs/{id}/autopricing
 *
 * Self-pricing commissions: a target (`targetRoas`, or with `objective: "roi"` a `targetRoi`) and the `minBps`/`maxBps` band partner rates may move within. `enabled: false` turns it off.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putProgramsIdAutopricing(id: String, body: PutProgramsIdAutopricingBody, idempotencyKey: String? = null): PutProgramsIdAutopricingResponse =
    PutProgramsIdAutopricingResponse.fromJson(send("PUT", "/v1/programs/${segment(id)}/autopricing", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set the incrementality holdout. PUT /v1/programs/{id}/incrementality
 *
 * Holds out a random control share of referrals (`holdoutBps`, up to 5000 = 50%) from being commissioned, so comparing control and treatment conversion measures the true lift partners cause. 0 turns it off.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putProgramsIdIncrementality(id: String, body: PutProgramsIdIncrementalityBody, idempotencyKey: String? = null): PutProgramsIdIncrementalityResponse =
    PutProgramsIdIncrementalityResponse.fromJson(send("PUT", "/v1/programs/${segment(id)}/incrementality", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set the agent negotiation policy. PUT /v1/programs/{id}/negotiation-policy
 *
 * What an agent may negotiate to in this program: rates between `minBps` and `maxBps`, accepted automatically up to `autoAcceptMaxBps`. Requires `minBps <= autoAcceptMaxBps <= maxBps`. `enabled: false` closes the program to negotiation.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putProgramsIdNegotiationPolicy(id: String, body: PutProgramsIdNegotiationPolicyBody, idempotencyKey: String? = null): PutProgramsIdNegotiationPolicyResponse =
    PutProgramsIdNegotiationPolicyResponse.fromJson(send("PUT", "/v1/programs/${segment(id)}/negotiation-policy", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set a partner's group. PUT /v1/programs/{id}/partners/{partnerId}/group
 *
 * Puts an enrolled partner in one of the program's groups, or none (`groupId: null`). A partner is in at most one group per program.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putProgramsIdPartnersPartnerIdGroup(id: String, partnerId: String, body: PutProgramsIdPartnersPartnerIdGroupBody, idempotencyKey: String? = null): PutProgramsIdPartnersPartnerIdGroupResponse =
    PutProgramsIdPartnersPartnerIdGroupResponse.fromJson(send("PUT", "/v1/programs/${segment(id)}/partners/${segment(partnerId)}/group", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set a program's payout schedule. PUT /v1/programs/{id}/payout-schedule
 *
 * Overrides the org payout schedule for this program: a schedule, `{ "kind": "off" }` to never pay it automatically, or `null` to follow the org schedule again. Returns the next run date. Audited.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`, `finance`.
 */
suspend fun ReferalliClient.putProgramsIdPayoutSchedule(id: String, body: PutProgramsIdPayoutScheduleBody, idempotencyKey: String? = null): PutProgramsIdPayoutScheduleResponse =
    PutProgramsIdPayoutScheduleResponse.fromJson(send("PUT", "/v1/programs/${segment(id)}/payout-schedule", emptyList(), body.toJson(), idempotencyKey, "json"))

/**
 * Set the referee reward. PUT /v1/programs/{id}/referee-reward
 *
 * What a referred customer gets: `store_credit`, a `coupon` or a `gift_card`, either a flat `amountMinor` or a percent (`bps`, optionally capped with `capMinor`) of their first payment, issued on their first commission or first payment. A percent reward needs `on: "first_payment"`. `enabled: false` removes it. Each reward issued publishes `referee_reward.earned`.
 *
 * **Auth:** an API key with `programs:write` (or `full`), or a session with role `owner`, `admin`.
 */
suspend fun ReferalliClient.putProgramsIdRefereeReward(id: String, body: PutProgramsIdRefereeRewardBody, idempotencyKey: String? = null): PutProgramsIdRefereeRewardResponse =
    PutProgramsIdRefereeRewardResponse.fromJson(send("PUT", "/v1/programs/${segment(id)}/referee-reward", emptyList(), body.toJson(), idempotencyKey, "json"))

/** Calls any operation by its id through its typed function; JSON in, JSON out. */
suspend fun ReferalliClient.call(operationId: String, path: Map<String, String> = emptyMap(), query: Map<String, JsonValue> = emptyMap(), body: JsonValue? = null, idempotencyKey: String? = null): JsonValue =
    call0(operationId, path, query, body, idempotencyKey)
        ?: call1(operationId, path, query, body, idempotencyKey)
        ?: call2(operationId, path, query, body, idempotencyKey)
        ?: call3(operationId, path, query, body, idempotencyKey)
        ?: call4(operationId, path, query, body, idempotencyKey)
        ?: call5(operationId, path, query, body, idempotencyKey)
        ?: call6(operationId, path, query, body, idempotencyKey)
        ?: call7(operationId, path, query, body, idempotencyKey)
        ?: call8(operationId, path, query, body, idempotencyKey)
        ?: call9(operationId, path, query, body, idempotencyKey)
        ?: throw IllegalArgumentException("unknown operation $operationId")

private suspend fun ReferalliClient.call0(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "deleteApiKeysId" -> deleteApiKeysId(id = path.getValue("id"), cascade = query["cascade"]?.queryString(), pair = query["pair"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteAssetsId" -> deleteAssetsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteAuthConnectionsId" -> deleteAuthConnectionsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteBillingConnectionsId" -> deleteBillingConnectionsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteBrandingDomain" -> deleteBrandingDomain(idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteBrandingLinkDomain" -> deleteBrandingLinkDomain(idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteCliListenersId" -> deleteCliListenersId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteEmailTemplatesEventLocale" -> deleteEmailTemplatesEventLocale(event = path.getValue("event"), locale = path.getValue("locale"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteIntegrationsKind" -> deleteIntegrationsKind(kind = path.getValue("kind"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteOrgMembersUserId" -> deleteOrgMembersUserId(userId = path.getValue("userId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deletePartnersId" -> deletePartnersId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deletePayoutConnectionsProvider" -> deletePayoutConnectionsProvider(provider = path.getValue("provider"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteProfitabilityProductsProductRef" -> deleteProfitabilityProductsProductRef(productRef = path.getValue("productRef"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteWebhookEndpointsId" -> deleteWebhookEndpointsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "deleteZapierHooksId" -> deleteZapierHooksId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getAdminMetrics" -> getAdminMetrics(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getAdminOrgs" -> getAdminOrgs(q = query["q"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAdminPartnerAccounts" -> getAdminPartnerAccounts(flagged = query["flagged"]?.queryBoolean(), q = query["q"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAgents" -> getAgents(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAgentsRecommendations" -> getAgentsRecommendations(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAnalyticsByChannel" -> getAnalyticsByChannel(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAnalyticsByGeo" -> getAnalyticsByGeo(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAnalyticsCohortLtv" -> getAnalyticsCohortLtv(months = query["months"]?.queryLong(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAnalyticsCouponPerformance" -> getAnalyticsCouponPerformance(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAnalyticsOverview" -> getAnalyticsOverview(programId = query["programId"]?.queryString(), days = query["days"]?.queryLong(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getAnalyticsTimeseries" -> getAnalyticsTimeseries(metric = query["metric"]?.queryString()!!, days = query["days"]?.queryLong(), programId = query["programId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getApiKeys" -> getApiKeys(mode = query["mode"]?.queryString(), owner = query["owner"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getApiKeysId" -> getApiKeysId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getAssets" -> getAssets(programId = query["programId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAssistantSuggestions" -> getAssistantSuggestions(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAuditLogs" -> getAuditLogs(actor = query["actor"]?.queryString(), actorType = query["actorType"]?.queryString(), action = query["action"]?.queryString(), subjectType = query["subjectType"]?.queryString(), subjectId = query["subjectId"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAuthConnections" -> getAuthConnections(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getAuthConnectionsIdExport" -> getAuthConnectionsIdExport(id = path.getValue("id"), customerRef = query["customerRef"]?.queryString()!!, idempotencyKey = idempotencyKey).let { it.toJson() }
        "getAuthProviders" -> getAuthProviders(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getBillingConnections" -> getBillingConnections(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getBillingConnectionsId" -> getBillingConnectionsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getBillingEvents" -> getBillingEvents(customerRef = query["customerRef"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getBillingPlan" -> getBillingPlan(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getBranding" -> getBranding(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getCleanroomConsent" -> getCleanroomConsent(customerRef = query["customerRef"]?.queryString()!!, idempotencyKey = idempotencyKey).let { it.toJson() }
        else -> null
    }

private suspend fun ReferalliClient.call1(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "getCleanroomQuery" -> getCleanroomQuery(dimension = query["dimension"]?.queryString()!!, idempotencyKey = idempotencyKey).let { it.toJson() }
        "getCliDeviceCodesUserCode" -> getCliDeviceCodesUserCode(userCode = path.getValue("userCode"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getCliListenersIdEvents" -> getCliListenersIdEvents(id = path.getValue("id"), wait = query["wait"]?.queryLong(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getCliLogs" -> getCliLogs(after = query["after"]?.queryLong(), wait = query["wait"]?.queryLong(), limit = query["limit"]?.queryLong(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getCliTopics" -> getCliTopics(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getCommissionRules" -> getCommissionRules(programId = query["programId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getCommissions" -> getCommissions(partnerId = query["partnerId"]?.queryString(), programId = query["programId"]?.queryString(), type = query["type"]?.queryString(), referralId = query["referralId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getCommissionsId" -> getCommissionsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getContracts" -> getContracts(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getCoupons" -> getCoupons(programId = query["programId"]?.queryString(), partnerId = query["partnerId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getCreators" -> getCreators(q = query["q"]?.queryString(), category = query["category"]?.queryString(), channel = query["channel"]?.queryString(), minAudience = query["minAudience"]?.queryLong(), minEngagementBps = query["minEngagementBps"]?.queryLong(), audienceCountry = query["audienceCountry"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getCreatorsAccountId" -> getCreatorsAccountId(accountId = path.getValue("accountId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getDeals" -> getDeals(status = query["status"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getDisputes" -> getDisputes(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getEmailSettings" -> getEmailSettings(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getEmailTemplates" -> getEmailTemplates(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getEmbedSummary" -> getEmbedSummary(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getExportAccounting" -> getExportAccounting(format = query["format"]?.queryString(), year = query["year"]?.queryLong()!!, idempotencyKey = idempotencyKey).let { JsonValue.Str(it) }
        "getExportFull" -> getExportFull(idempotencyKey = idempotencyKey).let { JsonValue.Str(it) }
        "getFraudCases" -> getFraudCases(status = query["status"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getFxRates" -> getFxRates(base = query["base"]?.queryString(), quote = query["quote"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getGraphql" -> getGraphql(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getHealth" -> getHealth(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getHostsCurrent" -> getHostsCurrent(idempotencyKey = idempotencyKey).let { it }
        "getHostsCurrentThemeCss" -> getHostsCurrentThemeCss(idempotencyKey = idempotencyKey).let { JsonValue.Str(it) }
        "getIncrementality" -> getIncrementality(programId = query["programId"]?.queryString()!!, idempotencyKey = idempotencyKey).let { it.toJson() }
        "getIntegrations" -> getIntegrations(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getIntegrationsDeliveries" -> getIntegrationsDeliveries(kind = query["kind"]?.queryString(), status = query["status"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getInvitations" -> getInvitations(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getLinks" -> getLinks(programId = query["programId"]?.queryString(), partnerId = query["partnerId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getLinksIdQr" -> getLinksIdQr(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { JsonValue.Str(it) }
        "getMarketplaceListing" -> getMarketplaceListing(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getMe" -> getMe(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getNegotiations" -> getNegotiations(programId = query["programId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getNetworkJourney" -> getNetworkJourney(emailHash = query["emailHash"]?.queryString()!!, model = query["model"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getNetworkSettings" -> getNetworkSettings(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getNotifications" -> getNotifications(unread = query["unread"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getOnchainConnections" -> getOnchainConnections(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getOpenapiJson" -> getOpenapiJson(idempotencyKey = idempotencyKey).let { JsonValue.Obj(it.mapValues { it.value }) }
        "getOpenapiYaml" -> getOpenapiYaml(idempotencyKey = idempotencyKey).let { JsonValue.Str(it) }
        else -> null
    }

private suspend fun ReferalliClient.call2(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "getOrg" -> getOrg(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getOrgFxFeed" -> getOrgFxFeed(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getOrgMembers" -> getOrgMembers(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getOrgPayoutSchedule" -> getOrgPayoutSchedule(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getOrgReferralParams" -> getOrgReferralParams(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getOrgRetention" -> getOrgRetention(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getOrgSso" -> getOrgSso(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getOrgSsoConnectionsIdSamlMetadata" -> getOrgSsoConnectionsIdSamlMetadata(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getOrgTaxProfile" -> getOrgTaxProfile(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getOutreach" -> getOutreach(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerAchievements" -> getPartnerAchievements(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerAdvance" -> getPartnerAdvance(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerAdvanceOffer" -> getPartnerAdvanceOffer(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerAssets" -> getPartnerAssets(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerContracts" -> getPartnerContracts(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerDeals" -> getPartnerDeals(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerDisputes" -> getPartnerDisputes(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerGroups" -> getPartnerGroups(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerInvitations" -> getPartnerInvitations(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerKycStatus" -> getPartnerKycStatus(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerLinks" -> getPartnerLinks(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerLinksIdQr" -> getPartnerLinksIdQr(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { JsonValue.Str(it) }
        "getPartnerMarketplace" -> getPartnerMarketplace(category = query["category"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerMe" -> getPartnerMe(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerNotifications" -> getPartnerNotifications(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerOrgsOrgIdSelfBilling" -> getPartnerOrgsOrgIdSelfBilling(orgId = path.getValue("orgId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerPassport" -> getPartnerPassport(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerPayouts" -> getPartnerPayouts(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerPayoutsIdInvoice" -> getPartnerPayoutsIdInvoice(id = path.getValue("id"), format = query["format"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerPostbackLogs" -> getPartnerPostbackLogs(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerProfile" -> getPartnerProfile(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerProfileVerified" -> getPartnerProfileVerified(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerProgramsProgramIdLeaderboard" -> getPartnerProgramsProgramIdLeaderboard(programId = path.getValue("programId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerRecruit" -> getPartnerRecruit(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerReferrals" -> getPartnerReferrals(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerReferralsIdTransparency" -> getPartnerReferralsIdTransparency(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartners" -> getPartners(email = query["email"]?.queryString(), externalRef = query["externalRef"]?.queryString(), status = query["status"]?.queryString(), includeArchived = query["includeArchived"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerSecurity" -> getPartnerSecurity(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnersId" -> getPartnersId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it }
        "getPartnersIdBalances" -> getPartnersIdBalances(id = path.getValue("id"), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        else -> null
    }

private suspend fun ReferalliClient.call3(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "getPartnersIdEnrollments" -> getPartnersIdEnrollments(id = path.getValue("id"), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnersIdPayoutProfile" -> getPartnersIdPayoutProfile(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnersIdQuality" -> getPartnersIdQuality(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPartnerStats" -> getPartnerStats(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerTaxDocuments" -> getPartnerTaxDocuments(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPartnerTaxDocumentsId" -> getPartnerTaxDocumentsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { JsonValue.Str(it) }
        "getPartnerTerms" -> getPartnerTerms(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPassportPublicKey" -> getPassportPublicKey(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPayoutConnections" -> getPayoutConnections(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPayoutRuns" -> getPayoutRuns(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPayouts" -> getPayouts(partnerId = query["partnerId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPayoutsIdInvoice" -> getPayoutsIdInvoice(id = path.getValue("id"), format = query["format"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPrivacyExport" -> getPrivacyExport(customerRef = query["customerRef"]?.queryString()!!, idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPrivacyRequests" -> getPrivacyRequests(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPrivacyRequestsId" -> getPrivacyRequestsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPrivacyRequestsIdResult" -> getPrivacyRequestsIdResult(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getProfitabilityProducts" -> getProfitabilityProducts(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getProfitabilityProductsProductRef" -> getProfitabilityProductsProductRef(productRef = path.getValue("productRef"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getProfitabilityRebuildJobId" -> getProfitabilityRebuildJobId(jobId = path.getValue("jobId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getProfitabilitySettings" -> getProfitabilitySettings(programId = query["programId"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getPrograms" -> getPrograms(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getProgramsId" -> getProgramsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getProgramsIdAutopricing" -> getProgramsIdAutopricing(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getProgramsIdEnrollments" -> getProgramsIdEnrollments(id = path.getValue("id"), status = query["status"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getProgramsIdGraph" -> getProgramsIdGraph(id = path.getValue("id"), root = query["root"]?.queryString()!!, depth = query["depth"]?.queryLong(), idempotencyKey = idempotencyKey).let { it }
        "getProgramsIdGroups" -> getProgramsIdGroups(id = path.getValue("id"), includeArchived = query["includeArchived"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getProgramsIdNegotiationPolicy" -> getProgramsIdNegotiationPolicy(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getProgramsIdPromotions" -> getProgramsIdPromotions(id = path.getValue("id"), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getProgramsIdRefereeReward" -> getProgramsIdRefereeReward(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getProgramsIdTermsAcceptances" -> getProgramsIdTermsAcceptances(id = path.getValue("id"), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getProspects" -> getProspects(status = query["status"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getPublicProgramsHandle" -> getPublicProgramsHandle(handle = path.getValue("handle"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getReferrals" -> getReferrals(programId = query["programId"]?.queryString(), partnerId = query["partnerId"]?.queryString(), status = query["status"]?.queryString(), customerRef = query["customerRef"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getReferralsId" -> getReferralsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getReferralsIdJourney" -> getReferralsIdJourney(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getReportsFilteredClicks" -> getReportsFilteredClicks(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getReportsPartnerPerformance" -> getReportsPartnerPerformance(format = query["format"]?.queryString(), idempotencyKey = idempotencyKey).let { JsonValue.Arr(it.map { it.toJson() }) }
        "getRewards" -> getRewards(status = query["status"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getRewardsLookupCode" -> getRewardsLookupCode(code = path.getValue("code"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getRoiBreakdown" -> getRoiBreakdown(from = query["from"]?.queryString(), to = query["to"]?.queryString(), programId = query["programId"]?.queryString(), partnerId = query["partnerId"]?.queryString(), windowDays = query["windowDays"]?.queryLong(), currency = query["currency"]?.queryString(), format = query["format"]?.queryString(), by = query["by"]?.queryString()!!, limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        else -> null
    }

private suspend fun ReferalliClient.call4(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "getRoiDataQuality" -> getRoiDataQuality(from = query["from"]?.queryString(), to = query["to"]?.queryString(), format = query["format"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getRoiGrants" -> getRoiGrants(from = query["from"]?.queryString(), to = query["to"]?.queryString(), programId = query["programId"]?.queryString(), partnerId = query["partnerId"]?.queryString(), windowDays = query["windowDays"]?.queryLong(), currency = query["currency"]?.queryString(), format = query["format"]?.queryString(), status = query["status"]?.queryString(), role = query["role"]?.queryString(), paidBack = query["paidBack"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getRoiPartnersIdTrace" -> getRoiPartnersIdTrace(id = path.getValue("id"), windowDays = query["windowDays"]?.queryLong(), format = query["format"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getRoiPatterns" -> getRoiPatterns(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getRoiPatternsPattern" -> getRoiPatternsPattern(pattern = path.getValue("pattern"), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getRoiSummary" -> getRoiSummary(from = query["from"]?.queryString(), to = query["to"]?.queryString(), programId = query["programId"]?.queryString(), partnerId = query["partnerId"]?.queryString(), windowDays = query["windowDays"]?.queryLong(), currency = query["currency"]?.queryString(), format = query["format"]?.queryString(), model = query["model"]?.queryString(), includeProjection = query["includeProjection"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getRoiTraceCustomerRef" -> getRoiTraceCustomerRef(customerRef = path.getValue("customerRef"), windowDays = query["windowDays"]?.queryLong(), format = query["format"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getSetupStatus" -> getSetupStatus(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getStatus" -> getStatus(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getStatusIncidents" -> getStatusIncidents(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getStatusIncidentsAtom" -> getStatusIncidentsAtom(idempotencyKey = idempotencyKey).let { JsonValue.Str(it) }
        "getStatusIncidentsId" -> getStatusIncidentsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getTax1099" -> getTax1099(year = query["year"]?.queryLong()!!, limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getTax1099Filings" -> getTax1099Filings(year = query["year"]?.queryLong()!!, limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getTax1099Preview" -> getTax1099Preview(year = query["year"]?.queryLong()!!, idempotencyKey = idempotencyKey).let { it.toJson() }
        "getTestClock" -> getTestClock(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getTestEmails" -> getTestEmails(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getValueImportJobId" -> getValueImportJobId(jobId = path.getValue("jobId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getVersions" -> getVersions(idempotencyKey = idempotencyKey).let { it.toJson() }
        "getWebhookDeliveries" -> getWebhookDeliveries(endpointId = query["endpointId"]?.queryString(), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getWebhookDeliveriesId" -> getWebhookDeliveriesId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it }
        "getWebhookEndpoints" -> getWebhookEndpoints(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getWebhookEndpointsId" -> getWebhookEndpointsId(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "getWebhookEndpointsIdDeliveries" -> getWebhookEndpointsIdDeliveries(id = path.getValue("id"), limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getZapierEvents" -> getZapierEvents(idempotencyKey = idempotencyKey).let { JsonValue.Arr(it.map { it.toJson() }) }
        "getZapierHooks" -> getZapierHooks(limit = query["limit"]?.queryLong(), startingAfter = query["starting_after"]?.queryString(), endingBefore = query["ending_before"]?.queryString(), createdGte = query["created[gte]"]?.queryString(), createdLte = query["created[lte]"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson { it.toJson() } }
        "getZapierTriggersEvent" -> getZapierTriggersEvent(event = path.getValue("event"), limit = query["limit"]?.queryLong(), idempotencyKey = idempotencyKey).let { JsonValue.Arr(it.map { it.toJson() }) }
        "patchAdminStatusIncidentsId" -> patchAdminStatusIncidentsId(id = path.getValue("id"), body = PatchAdminStatusIncidentsIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchApiKeysId" -> patchApiKeysId(id = path.getValue("id"), body = PatchApiKeysIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchAuthConnectionsId" -> patchAuthConnectionsId(id = path.getValue("id"), body = PatchAuthConnectionsIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchBillingConnectionsId" -> patchBillingConnectionsId(id = path.getValue("id"), body = PatchBillingConnectionsIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchOrg" -> patchOrg(body = PatchOrgBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchOrgMembersUserId" -> patchOrgMembersUserId(userId = path.getValue("userId"), body = PatchOrgMembersUserIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchOrgSso" -> patchOrgSso(body = PatchOrgSsoBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchPartnerGroupsId" -> patchPartnerGroupsId(id = path.getValue("id"), body = PatchPartnerGroupsIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchPartnersId" -> patchPartnersId(id = path.getValue("id"), body = PatchPartnersIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchPartnersIdPayoutProfile" -> patchPartnersIdPayoutProfile(id = path.getValue("id"), body = PatchPartnersIdPayoutProfileBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchProgramsId" -> patchProgramsId(id = path.getValue("id"), body = PatchProgramsIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchReferralsId" -> patchReferralsId(id = path.getValue("id"), body = PatchReferralsIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "patchWebhookEndpointsId" -> patchWebhookEndpointsId(id = path.getValue("id"), body = PatchWebhookEndpointsIdBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        else -> null
    }

private suspend fun ReferalliClient.call5(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "postAdminOrgsIdPlan" -> postAdminOrgsIdPlan(id = path.getValue("id"), body = PostAdminOrgsIdPlanBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAdminOrgsIdSuspend" -> postAdminOrgsIdSuspend(id = path.getValue("id"), body = PostAdminOrgsIdSuspendBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAdminOrgsIdUnsuspend" -> postAdminOrgsIdUnsuspend(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAdminPartnerAccountsIdBan" -> postAdminPartnerAccountsIdBan(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAdminPartnerAccountsIdUnban" -> postAdminPartnerAccountsIdUnban(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAdminStatusIncidents" -> postAdminStatusIncidents(body = PostAdminStatusIncidentsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAdminStatusIncidentsIdUpdates" -> postAdminStatusIncidentsIdUpdates(id = path.getValue("id"), body = PostAdminStatusIncidentsIdUpdatesBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAgentsRegister" -> postAgentsRegister(body = PostAgentsRegisterBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAnomaliesScan" -> postAnomaliesScan(idempotencyKey = idempotencyKey).let { JsonValue.Arr(it.map { it.toJson() }) }
        "postApiKeys" -> postApiKeys(body = PostApiKeysBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it }
        "postAssets" -> postAssets(body = PostAssetsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAttributionReplay" -> postAttributionReplay(body = PostAttributionReplayBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnections" -> postAuthConnections(body = PostAuthConnectionsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnectionsIdAliases" -> postAuthConnectionsIdAliases(id = path.getValue("id"), body = PostAuthConnectionsIdAliasesBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnectionsIdErase" -> postAuthConnectionsIdErase(id = path.getValue("id"), body = PostAuthConnectionsIdEraseBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnectionsIdPing" -> postAuthConnectionsIdPing(id = path.getValue("id"), body = (body ?: JsonValue.Obj(emptyMap())).obj().mapValues { it.value }, idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnectionsIdRevokePreviousSecret" -> postAuthConnectionsIdRevokePreviousSecret(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnectionsIdRotateSecret" -> postAuthConnectionsIdRotateSecret(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnectionsIdSignals" -> postAuthConnectionsIdSignals(id = path.getValue("id"), body = PostAuthConnectionsIdSignalsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnectionsIdSignups" -> postAuthConnectionsIdSignups(id = path.getValue("id"), body = PostAuthConnectionsIdSignupsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthConnectionsIdUsers" -> postAuthConnectionsIdUsers(id = path.getValue("id"), body = PostAuthConnectionsIdUsersBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postAuthLogout" -> postAuthLogout(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBillingActivate" -> postBillingActivate(body = PostBillingActivateBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBillingCheckout" -> postBillingCheckout(body = PostBillingCheckoutBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBillingConnections" -> postBillingConnections(body = PostBillingConnectionsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBillingConnectionsIdRotateSecret" -> postBillingConnectionsIdRotateSecret(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBillingConnectionsIdValueMappingPreview" -> postBillingConnectionsIdValueMappingPreview(id = path.getValue("id"), body = PostBillingConnectionsIdValueMappingPreviewBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBillingPortal" -> postBillingPortal(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBrandingDomain" -> postBrandingDomain(body = PostBrandingDomainBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBrandingDomainVerify" -> postBrandingDomainVerify(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBrandingLinkDomain" -> postBrandingLinkDomain(body = PostBrandingLinkDomainBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postBrandingLinkDomainVerify" -> postBrandingLinkDomainVerify(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCliDeviceCodes" -> postCliDeviceCodes(body = PostCliDeviceCodesBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCliDeviceCodesToken" -> postCliDeviceCodesToken(body = PostCliDeviceCodesTokenBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCliDeviceCodesUserCodeApprove" -> postCliDeviceCodesUserCodeApprove(userCode = path.getValue("userCode"), body = PostCliDeviceCodesUserCodeApproveBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCliDeviceCodesUserCodeDeny" -> postCliDeviceCodesUserCodeDeny(userCode = path.getValue("userCode"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCliListeners" -> postCliListeners(body = PostCliListenersBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCliTrigger" -> postCliTrigger(body = PostCliTriggerBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCommissionRules" -> postCommissionRules(body = PostCommissionRulesBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCommissionsApproveDue" -> postCommissionsApproveDue(idempotencyKey = idempotencyKey).let { it.toJson() }
        else -> null
    }

private suspend fun ReferalliClient.call6(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "postCommissionsIdAdjust" -> postCommissionsIdAdjust(id = path.getValue("id"), body = PostCommissionsIdAdjustBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCommissionsIdSettle" -> postCommissionsIdSettle(id = path.getValue("id"), body = PostCommissionsIdSettleBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postContracts" -> postContracts(body = PostContractsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postContractsIdSend" -> postContractsIdSend(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCoupons" -> postCoupons(body = PostCouponsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postCreatorsAccountIdInvite" -> postCreatorsAccountIdInvite(accountId = path.getValue("accountId"), body = PostCreatorsAccountIdInviteBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postDealsIdApprove" -> postDealsIdApprove(id = path.getValue("id"), body = PostDealsIdApproveBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postDealsIdReject" -> postDealsIdReject(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postDealsIdWon" -> postDealsIdWon(id = path.getValue("id"), body = PostDealsIdWonBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postDiscoveryCorpus" -> postDiscoveryCorpus(body = PostDiscoveryCorpusBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postDiscoverySearch" -> postDiscoverySearch(body = PostDiscoverySearchBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postDisputesIdResolve" -> postDisputesIdResolve(id = path.getValue("id"), body = PostDisputesIdResolveBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postEmailPreview" -> postEmailPreview(body = PostEmailPreviewBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postEmailSettingsVerifyDomain" -> postEmailSettingsVerifyDomain(idempotencyKey = idempotencyKey).let { it }
        "postEmailTest" -> postEmailTest(body = PostEmailTestBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postEmbedTokens" -> postEmbedTokens(body = PostEmbedTokensBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postFraudCasesIdResolve" -> postFraudCasesIdResolve(id = path.getValue("id"), body = PostFraudCasesIdResolveBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postFraudDetectRings" -> postFraudDetectRings(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postFraudInvalidTrafficScan" -> postFraudInvalidTrafficScan(body = PostFraudInvalidTrafficScanBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postFxRates" -> postFxRates(body = PostFxRatesBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postFxRatesClearOverride" -> postFxRatesClearOverride(body = PostFxRatesClearOverrideBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postFxRatesSync" -> postFxRatesSync(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postGraphql" -> postGraphql(body = PostGraphqlBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postImportProvider" -> postImportProvider(provider = path.getValue("provider"), body = PostImportProviderBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), programId = query["programId"]?.queryString()!!, dryRun = query["dryRun"]?.queryBoolean(), destinationUrl = query["destinationUrl"]?.queryString(), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postIntegrationsDeliveriesIdRetry" -> postIntegrationsDeliveriesIdRetry(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postIntegrationsHubspotTest" -> postIntegrationsHubspotTest(body = PostIntegrationsHubspotTestBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postIntegrationsSegmentTest" -> postIntegrationsSegmentTest(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postInvitationsIdWithdraw" -> postInvitationsIdWithdraw(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postLinks" -> postLinks(body = PostLinksBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postMobilePurchases" -> postMobilePurchases(body = PostMobilePurchasesBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postNotificationsIdRead" -> postNotificationsIdRead(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOnchainConnections" -> postOnchainConnections(body = PostOnchainConnectionsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOrgMembers" -> postOrgMembers(body = PostOrgMembersBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOrgs" -> postOrgs(body = PostOrgsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOrgSsoLink" -> postOrgSsoLink(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOrgSsoTickets" -> postOrgSsoTickets(body = PostOrgSsoTicketsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOrgSsoTicketsIdRevoke" -> postOrgSsoTicketsIdRevoke(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOutreachDraft" -> postOutreachDraft(body = PostOutreachDraftBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOutreachIdApprove" -> postOutreachIdApprove(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postOutreachSendDue" -> postOutreachSendDue(idempotencyKey = idempotencyKey).let { it.toJson() }
        else -> null
    }

private suspend fun ReferalliClient.call7(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "postPartnerAdvanceAccept" -> postPartnerAdvanceAccept(body = PostPartnerAdvanceAcceptBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerAuthWalletNonce" -> postPartnerAuthWalletNonce(body = PostPartnerAuthWalletNonceBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerAuthWalletVerify" -> postPartnerAuthWalletVerify(body = PostPartnerAuthWalletVerifyBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerContractsIdAccept" -> postPartnerContractsIdAccept(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerContractsIdDecline" -> postPartnerContractsIdDecline(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerDeals" -> postPartnerDeals(body = PostPartnerDealsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerDisputes" -> postPartnerDisputes(body = PostPartnerDisputesBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerInvitationsIdAccept" -> postPartnerInvitationsIdAccept(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerInvitationsIdDecline" -> postPartnerInvitationsIdDecline(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerKycSubmit" -> postPartnerKycSubmit(body = PostPartnerKycSubmitBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerLinks" -> postPartnerLinks(body = PostPartnerLinksBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerNotificationsIdRead" -> postPartnerNotificationsIdRead(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerOrgsOrgIdSelfBilling" -> postPartnerOrgsOrgIdSelfBilling(orgId = path.getValue("orgId"), body = PostPartnerOrgsOrgIdSelfBillingBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerOrgsOrgIdTaxForm" -> postPartnerOrgsOrgIdTaxForm(orgId = path.getValue("orgId"), body = PostPartnerOrgsOrgIdTaxFormBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerProgramsProgramIdApply" -> postPartnerProgramsProgramIdApply(programId = path.getValue("programId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartners" -> postPartners(body = PostPartnersBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerSecurityTotpDisable" -> postPartnerSecurityTotpDisable(body = PostPartnerSecurityTotpDisableBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerSecurityTotpEnable" -> postPartnerSecurityTotpEnable(body = PostPartnerSecurityTotpEnableBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerSecurityTotpSetup" -> postPartnerSecurityTotpSetup(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnersIdTaxForm" -> postPartnersIdTaxForm(id = path.getValue("id"), body = PostPartnersIdTaxFormBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPartnerTermsVersionIdAccept" -> postPartnerTermsVersionIdAccept(versionId = path.getValue("versionId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPassportVerify" -> postPassportVerify(body = PostPassportVerifyBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPayoutRuns" -> postPayoutRuns(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPayoutRunsIdCancel" -> postPayoutRunsIdCancel(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPayoutRunsIdExecute" -> postPayoutRunsIdExecute(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPayoutRunsRunScheduled" -> postPayoutRunsRunScheduled(idempotencyKey = idempotencyKey).let { JsonValue.Arr(it.map { it.toJson() }) }
        "postPrivacyForget" -> postPrivacyForget(body = PostPrivacyForgetBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPrivacyLookup" -> postPrivacyLookup(body = PostPrivacyLookupBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPrivacyRequests" -> postPrivacyRequests(body = PostPrivacyRequestsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postProfitabilityRebuild" -> postProfitabilityRebuild(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPrograms" -> postPrograms(body = PostProgramsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postProgramsIdApplyLeveling" -> postProgramsIdApplyLeveling(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postProgramsIdAutopriceRun" -> postProgramsIdAutopriceRun(id = path.getValue("id"), body = PostProgramsIdAutopriceRunBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postProgramsIdEnrollments" -> postProgramsIdEnrollments(id = path.getValue("id"), body = PostProgramsIdEnrollmentsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postProgramsIdEnrollmentsEnrollmentIdApprove" -> postProgramsIdEnrollmentsEnrollmentIdApprove(id = path.getValue("id"), enrollmentId = path.getValue("enrollmentId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postProgramsIdEnrollmentsEnrollmentIdReject" -> postProgramsIdEnrollmentsEnrollmentIdReject(id = path.getValue("id"), enrollmentId = path.getValue("enrollmentId"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postProgramsIdGroups" -> postProgramsIdGroups(id = path.getValue("id"), body = PostProgramsIdGroupsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postProgramsIdPromotions" -> postProgramsIdPromotions(id = path.getValue("id"), body = PostProgramsIdPromotionsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPromotionsIdEnd" -> postPromotionsIdEnd(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postPublicProgramsHandleJoin" -> postPublicProgramsHandleJoin(handle = path.getValue("handle"), body = PostPublicProgramsHandleJoinBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        else -> null
    }

private suspend fun ReferalliClient.call8(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "postQualityRecompute" -> postQualityRecompute(idempotencyKey = idempotencyKey).let { it.toJson() }
        "postReferralsAssociate" -> postReferralsAssociate(body = PostReferralsAssociateBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postReferralsIdApprove" -> postReferralsIdApprove(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postReferralsIdReassign" -> postReferralsIdReassign(id = path.getValue("id"), body = PostReferralsIdReassignBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postReferralsIdVoid" -> postReferralsIdVoid(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postRewardsIdRedeem" -> postRewardsIdRedeem(id = path.getValue("id"), body = PostRewardsIdRedeemBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postRewardsRedeemByCode" -> postRewardsRedeemByCode(body = PostRewardsRedeemByCodeBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postRoiPatternsPatternReview" -> postRoiPatternsPatternReview(pattern = path.getValue("pattern"), body = PostRoiPatternsPatternReviewBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postSandboxSimulate" -> postSandboxSimulate(body = PostSandboxSimulateBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postTax1099DocumentsIdCorrect" -> postTax1099DocumentsIdCorrect(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postTax1099Filings" -> postTax1099Filings(body = PostTax1099FilingsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postTax1099FilingsIdRefresh" -> postTax1099FilingsIdRefresh(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postTestClockAdvance" -> postTestClockAdvance(body = PostTestClockAdvanceBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postTrackEvents" -> postTrackEvents(body = (body ?: JsonValue.Obj(emptyMap())), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postUnsubscribeToken" -> postUnsubscribeToken(token = path.getValue("token"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postValueEvents" -> postValueEvents(body = PostValueEventsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postValueImport" -> postValueImport(body = PostValueImportBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it }
        "postWebhookDeliveriesIdReplay" -> postWebhookDeliveriesIdReplay(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postWebhookEndpoints" -> postWebhookEndpoints(body = PostWebhookEndpointsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postWebhookEndpointsIdRotateSecret" -> postWebhookEndpointsIdRotateSecret(id = path.getValue("id"), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postWidgetTokens" -> postWidgetTokens(body = PostWidgetTokensBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postZapierConversions" -> postZapierConversions(body = PostZapierConversionsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "postZapierHooks" -> postZapierHooks(body = PostZapierHooksBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putBillingConnectionsIdCredentials" -> putBillingConnectionsIdCredentials(id = path.getValue("id"), body = PutBillingConnectionsIdCredentialsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putBillingConnectionsIdSecret" -> putBillingConnectionsIdSecret(id = path.getValue("id"), body = PutBillingConnectionsIdSecretBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putBillingConnectionsIdValueMapping" -> putBillingConnectionsIdValueMapping(id = path.getValue("id"), body = PutBillingConnectionsIdValueMappingBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putBranding" -> putBranding(body = PutBrandingBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putEmailSettings" -> putEmailSettings(body = PutEmailSettingsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putEmailTemplatesEventLocale" -> putEmailTemplatesEventLocale(event = path.getValue("event"), locale = path.getValue("locale"), body = PutEmailTemplatesEventLocaleBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putIntegrationsHubspot" -> putIntegrationsHubspot(body = PutIntegrationsHubspotBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putIntegrationsSegment" -> putIntegrationsSegment(body = PutIntegrationsSegmentBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putMarketplaceListing" -> putMarketplaceListing(body = PutMarketplaceListingBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putMeLocale" -> putMeLocale(body = PutMeLocaleBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putMeRoiDigest" -> putMeRoiDigest(body = PutMeRoiDigestBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putNetworkSettings" -> putNetworkSettings(body = PutNetworkSettingsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putOrgFxFeed" -> putOrgFxFeed(body = PutOrgFxFeedBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putOrgPayoutSchedule" -> putOrgPayoutSchedule(body = PutOrgPayoutScheduleBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putOrgReferralParams" -> putOrgReferralParams(body = PutOrgReferralParamsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putOrgRetention" -> putOrgRetention(body = PutOrgRetentionBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putOrgTaxFiling" -> putOrgTaxFiling(body = PutOrgTaxFilingBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        else -> null
    }

private suspend fun ReferalliClient.call9(operationId: String, path: Map<String, String>, query: Map<String, JsonValue>, body: JsonValue?, idempotencyKey: String?): JsonValue? =
    when (operationId) {
        "putOrgTaxProfile" -> putOrgTaxProfile(body = PutOrgTaxProfileBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putPartnerLocale" -> putPartnerLocale(body = PutPartnerLocaleBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putPartnerOrgsOrgIdPayoutProfile" -> putPartnerOrgsOrgIdPayoutProfile(orgId = path.getValue("orgId"), body = PutPartnerOrgsOrgIdPayoutProfileBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putPartnerOrgsOrgIdPostback" -> putPartnerOrgsOrgIdPostback(orgId = path.getValue("orgId"), body = PutPartnerOrgsOrgIdPostbackBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putPartnerOrgsOrgIdVat" -> putPartnerOrgsOrgIdVat(orgId = path.getValue("orgId"), body = PutPartnerOrgsOrgIdVatBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putPartnerProfile" -> putPartnerProfile(body = PutPartnerProfileBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putPartnersIdPayoutProfile" -> putPartnersIdPayoutProfile(id = path.getValue("id"), body = PutPartnersIdPayoutProfileBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putPartnersIdVat" -> putPartnersIdVat(id = path.getValue("id"), body = PutPartnersIdVatBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putPayoutConnectionsProvider" -> putPayoutConnectionsProvider(provider = path.getValue("provider"), body = (body ?: JsonValue.Obj(emptyMap())), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putProfitabilityProductsProductRef" -> putProfitabilityProductsProductRef(productRef = path.getValue("productRef"), body = PutProfitabilityProductsProductRefBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putProfitabilitySettings" -> putProfitabilitySettings(body = PutProfitabilitySettingsBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putProgramsIdAutopricing" -> putProgramsIdAutopricing(id = path.getValue("id"), body = PutProgramsIdAutopricingBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putProgramsIdIncrementality" -> putProgramsIdIncrementality(id = path.getValue("id"), body = PutProgramsIdIncrementalityBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putProgramsIdNegotiationPolicy" -> putProgramsIdNegotiationPolicy(id = path.getValue("id"), body = PutProgramsIdNegotiationPolicyBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putProgramsIdPartnersPartnerIdGroup" -> putProgramsIdPartnersPartnerIdGroup(id = path.getValue("id"), partnerId = path.getValue("partnerId"), body = PutProgramsIdPartnersPartnerIdGroupBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putProgramsIdPayoutSchedule" -> putProgramsIdPayoutSchedule(id = path.getValue("id"), body = PutProgramsIdPayoutScheduleBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        "putProgramsIdRefereeReward" -> putProgramsIdRefereeReward(id = path.getValue("id"), body = PutProgramsIdRefereeRewardBody.fromJson((body ?: JsonValue.Obj(emptyMap()))), idempotencyKey = idempotencyKey).let { it.toJson() }
        else -> null
    }
