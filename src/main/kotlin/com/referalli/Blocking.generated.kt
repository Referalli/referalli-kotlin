// Code generated from the Referalli OpenAPI document. DO NOT EDIT.
// Changes belong in the generator, which overwrites this file.

@file:Suppress("unused")

package com.referalli

import kotlinx.coroutines.runBlocking

/** Blocking [ReferalliClient.deleteApiKeysId]: Revoke an API key. DELETE /v1/api-keys/{id} */
fun ReferalliBlockingClient.deleteApiKeysId(id: String, cascade: String? = null, pair: String? = null, idempotencyKey: String? = null): DeleteApiKeysIdResponse =
    runBlocking { this@deleteApiKeysId.client.deleteApiKeysId(id = id, cascade = cascade, pair = pair, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteAssetsId]: Delete a marketing asset. DELETE /v1/assets/{id} */
fun ReferalliBlockingClient.deleteAssetsId(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteAssetsId.client.deleteAssetsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteAuthConnectionsId]: Delete an auth connection. DELETE /v1/auth/connections/{id} */
fun ReferalliBlockingClient.deleteAuthConnectionsId(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteAuthConnectionsId.client.deleteAuthConnectionsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteBillingConnectionsId]: Delete a billing connection. DELETE /v1/billing/connections/{id} */
fun ReferalliBlockingClient.deleteBillingConnectionsId(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteBillingConnectionsId.client.deleteBillingConnectionsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteBrandingDomain]: Remove the portal domain. DELETE /v1/branding/domain */
fun ReferalliBlockingClient.deleteBrandingDomain(idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteBrandingDomain.client.deleteBrandingDomain(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteBrandingLinkDomain]: Remove the link domain. DELETE /v1/branding/link-domain */
fun ReferalliBlockingClient.deleteBrandingLinkDomain(idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteBrandingLinkDomain.client.deleteBrandingLinkDomain(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteCliListenersId]: Close a CLI listener. DELETE /v1/cli/listeners/{id} */
fun ReferalliBlockingClient.deleteCliListenersId(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteCliListenersId.client.deleteCliListenersId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteEmailTemplatesEventLocale]: Reset an email template. DELETE /v1/email/templates/{event}/{locale} */
fun ReferalliBlockingClient.deleteEmailTemplatesEventLocale(event: String, locale: String, idempotencyKey: String? = null): DeleteEmailTemplatesEventLocaleResponse =
    runBlocking { this@deleteEmailTemplatesEventLocale.client.deleteEmailTemplatesEventLocale(event = event, locale = locale, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteIntegrationsKind]: Disconnect an integration. DELETE /v1/integrations/{kind} */
fun ReferalliBlockingClient.deleteIntegrationsKind(kind: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteIntegrationsKind.client.deleteIntegrationsKind(kind = kind, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteOrgMembersUserId]: Remove a team member. DELETE /v1/org/members/{userId} */
fun ReferalliBlockingClient.deleteOrgMembersUserId(userId: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteOrgMembersUserId.client.deleteOrgMembersUserId(userId = userId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deletePartnersId]: Delete a partner. DELETE /v1/partners/{id} */
fun ReferalliBlockingClient.deletePartnersId(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deletePartnersId.client.deletePartnersId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deletePayoutConnectionsProvider]: Disconnect a payout provider. DELETE /v1/payout-connections/{provider} */
fun ReferalliBlockingClient.deletePayoutConnectionsProvider(provider: String, idempotencyKey: String? = null): DeletePayoutConnectionsProviderResponse =
    runBlocking { this@deletePayoutConnectionsProvider.client.deletePayoutConnectionsProvider(provider = provider, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteProfitabilityProductsProductRef]: Delete a product margin. DELETE /v1/profitability/products/{productRef} */
fun ReferalliBlockingClient.deleteProfitabilityProductsProductRef(productRef: String, idempotencyKey: String? = null): OkStatus =
    runBlocking { this@deleteProfitabilityProductsProductRef.client.deleteProfitabilityProductsProductRef(productRef = productRef, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteWebhookEndpointsId]: Delete a webhook endpoint. DELETE /v1/webhook-endpoints/{id} */
fun ReferalliBlockingClient.deleteWebhookEndpointsId(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteWebhookEndpointsId.client.deleteWebhookEndpointsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.deleteZapierHooksId]: Unsubscribe a Zapier hook. DELETE /v1/zapier/hooks/{id} */
fun ReferalliBlockingClient.deleteZapierHooksId(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@deleteZapierHooksId.client.deleteZapierHooksId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAdminMetrics]: Get platform metrics. GET /v1/admin/metrics */
fun ReferalliBlockingClient.getAdminMetrics(idempotencyKey: String? = null): GetAdminMetricsResponse =
    runBlocking { this@getAdminMetrics.client.getAdminMetrics(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAdminOrgs]: List organizations. GET /v1/admin/orgs */
fun ReferalliBlockingClient.getAdminOrgs(q: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAdminOrgsResponseDataItem> =
    runBlocking { this@getAdminOrgs.client.getAdminOrgs(q = q, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAdminOrgs], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAdminOrgsEach(q: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAdminOrgsResponseDataItem> =
    paginate { cursor -> getAdminOrgs(q = q, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAdminPartnerAccounts]: List partner accounts. GET /v1/admin/partner-accounts */
fun ReferalliBlockingClient.getAdminPartnerAccounts(flagged: Boolean? = null, q: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAdminPartnerAccountsResponseDataItem> =
    runBlocking { this@getAdminPartnerAccounts.client.getAdminPartnerAccounts(flagged = flagged, q = q, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAdminPartnerAccounts], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAdminPartnerAccountsEach(flagged: Boolean? = null, q: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAdminPartnerAccountsResponseDataItem> =
    paginate { cursor -> getAdminPartnerAccounts(flagged = flagged, q = q, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAgents]: List partnered AI agents. GET /v1/agents */
fun ReferalliBlockingClient.getAgents(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAgentsResponseDataItem> =
    runBlocking { this@getAgents.client.getAgents(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAgents], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAgentsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAgentsResponseDataItem> =
    paginate { cursor -> getAgents(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAgentsRecommendations]: List agent recommendations. GET /v1/agents/recommendations */
fun ReferalliBlockingClient.getAgentsRecommendations(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAgentsRecommendationsResponseDataItem> =
    runBlocking { this@getAgentsRecommendations.client.getAgentsRecommendations(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAgentsRecommendations], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAgentsRecommendationsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAgentsRecommendationsResponseDataItem> =
    paginate { cursor -> getAgentsRecommendations(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAnalyticsByChannel]: Get revenue by channel. GET /v1/analytics/by-channel */
fun ReferalliBlockingClient.getAnalyticsByChannel(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsByChannelResponseDataItem> =
    runBlocking { this@getAnalyticsByChannel.client.getAnalyticsByChannel(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAnalyticsByChannel], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAnalyticsByChannelEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAnalyticsByChannelResponseDataItem> =
    paginate { cursor -> getAnalyticsByChannel(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAnalyticsByGeo]: Get revenue by country. GET /v1/analytics/by-geo */
fun ReferalliBlockingClient.getAnalyticsByGeo(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsByGeoResponseDataItem> =
    runBlocking { this@getAnalyticsByGeo.client.getAnalyticsByGeo(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAnalyticsByGeo], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAnalyticsByGeoEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAnalyticsByGeoResponseDataItem> =
    paginate { cursor -> getAnalyticsByGeo(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAnalyticsCohortLtv]: Get cohort LTV. GET /v1/analytics/cohort-ltv */
fun ReferalliBlockingClient.getAnalyticsCohortLtv(months: Long? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsCohortLtvResponseDataItem> =
    runBlocking { this@getAnalyticsCohortLtv.client.getAnalyticsCohortLtv(months = months, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAnalyticsCohortLtv], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAnalyticsCohortLtvEach(months: Long? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAnalyticsCohortLtvResponseDataItem> =
    paginate { cursor -> getAnalyticsCohortLtv(months = months, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAnalyticsCouponPerformance]: Get coupon performance. GET /v1/analytics/coupon-performance */
fun ReferalliBlockingClient.getAnalyticsCouponPerformance(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsCouponPerformanceResponseDataItem> =
    runBlocking { this@getAnalyticsCouponPerformance.client.getAnalyticsCouponPerformance(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAnalyticsCouponPerformance], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAnalyticsCouponPerformanceEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAnalyticsCouponPerformanceResponseDataItem> =
    paginate { cursor -> getAnalyticsCouponPerformance(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAnalyticsOverview]: Get the funnel overview. GET /v1/analytics/overview */
fun ReferalliBlockingClient.getAnalyticsOverview(programId: String? = null, days: Long? = null, idempotencyKey: String? = null): GetAnalyticsOverviewResponse =
    runBlocking { this@getAnalyticsOverview.client.getAnalyticsOverview(programId = programId, days = days, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAnalyticsTimeseries]: Get a daily time series. GET /v1/analytics/timeseries */
fun ReferalliBlockingClient.getAnalyticsTimeseries(metric: String, days: Long? = null, programId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAnalyticsTimeseriesResponseDataItem> =
    runBlocking { this@getAnalyticsTimeseries.client.getAnalyticsTimeseries(metric = metric, days = days, programId = programId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAnalyticsTimeseries], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAnalyticsTimeseriesEach(metric: String, days: Long? = null, programId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAnalyticsTimeseriesResponseDataItem> =
    paginate { cursor -> getAnalyticsTimeseries(metric = metric, days = days, programId = programId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getApiKeys]: List API keys. GET /v1/api-keys */
fun ReferalliBlockingClient.getApiKeys(mode: String? = null, owner: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<ApiKey> =
    runBlocking { this@getApiKeys.client.getApiKeys(mode = mode, owner = owner, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getApiKeys], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getApiKeysEach(mode: String? = null, owner: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<ApiKey> =
    paginate { cursor -> getApiKeys(mode = mode, owner = owner, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getApiKeysId]: Get an API key. GET /v1/api-keys/{id} */
fun ReferalliBlockingClient.getApiKeysId(id: String, idempotencyKey: String? = null): ApiKey =
    runBlocking { this@getApiKeysId.client.getApiKeysId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAssets]: List marketing assets. GET /v1/assets */
fun ReferalliBlockingClient.getAssets(programId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAssetsResponseDataItem> =
    runBlocking { this@getAssets.client.getAssets(programId = programId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAssets], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAssetsEach(programId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAssetsResponseDataItem> =
    paginate { cursor -> getAssets(programId = programId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAssistantSuggestions]: Get program suggestions. GET /v1/assistant/suggestions */
fun ReferalliBlockingClient.getAssistantSuggestions(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetAssistantSuggestionsResponseDataItem> =
    runBlocking { this@getAssistantSuggestions.client.getAssistantSuggestions(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAssistantSuggestions], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAssistantSuggestionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetAssistantSuggestionsResponseDataItem> =
    paginate { cursor -> getAssistantSuggestions(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAuditLogs]: List audit log entries. GET /v1/audit-logs */
fun ReferalliBlockingClient.getAuditLogs(actor: String? = null, actorType: String? = null, action: String? = null, subjectType: String? = null, subjectId: String? = null, createdGte: String? = null, createdLte: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, idempotencyKey: String? = null): Page<AuditLogEntry> =
    runBlocking { this@getAuditLogs.client.getAuditLogs(actor = actor, actorType = actorType, action = action, subjectType = subjectType, subjectId = subjectId, createdGte = createdGte, createdLte = createdLte, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, idempotencyKey = idempotencyKey) }

/** Every item of [getAuditLogs], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAuditLogsEach(actor: String? = null, actorType: String? = null, action: String? = null, subjectType: String? = null, subjectId: String? = null, createdGte: String? = null, createdLte: String? = null, limit: Long? = null, endingBefore: String? = null, idempotencyKey: String? = null): Sequence<AuditLogEntry> =
    paginate { cursor -> getAuditLogs(actor = actor, actorType = actorType, action = action, subjectType = subjectType, subjectId = subjectId, createdGte = createdGte, createdLte = createdLte, limit = limit, startingAfter = cursor, endingBefore = endingBefore, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAuthConnections]: List auth connections. GET /v1/auth/connections */
fun ReferalliBlockingClient.getAuthConnections(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<AuthConnection> =
    runBlocking { this@getAuthConnections.client.getAuthConnections(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getAuthConnections], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getAuthConnectionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<AuthConnection> =
    paginate { cursor -> getAuthConnections(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAuthConnectionsIdExport]: Export a user (signed protocol). GET /v1/auth/connections/{id}/export */
fun ReferalliBlockingClient.getAuthConnectionsIdExport(id: String, customerRef: String, idempotencyKey: String? = null): GetAuthConnectionsIdExportResponse =
    runBlocking { this@getAuthConnectionsIdExport.client.getAuthConnectionsIdExport(id = id, customerRef = customerRef, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getAuthProviders]: List sign-in providers. GET /v1/auth/providers */
fun ReferalliBlockingClient.getAuthProviders(idempotencyKey: String? = null): GetAuthProvidersResponse =
    runBlocking { this@getAuthProviders.client.getAuthProviders(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getBillingConnections]: List billing connections. GET /v1/billing/connections */
fun ReferalliBlockingClient.getBillingConnections(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<BillingConnection> =
    runBlocking { this@getBillingConnections.client.getBillingConnections(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getBillingConnections], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getBillingConnectionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<BillingConnection> =
    paginate { cursor -> getBillingConnections(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getBillingConnectionsId]: Get a billing connection. GET /v1/billing/connections/{id} */
fun ReferalliBlockingClient.getBillingConnectionsId(id: String, idempotencyKey: String? = null): BillingConnection =
    runBlocking { this@getBillingConnectionsId.client.getBillingConnectionsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getBillingEvents]: List billing events. GET /v1/billing/events */
fun ReferalliBlockingClient.getBillingEvents(customerRef: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<BillingEvent> =
    runBlocking { this@getBillingEvents.client.getBillingEvents(customerRef = customerRef, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getBillingEvents], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getBillingEventsEach(customerRef: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<BillingEvent> =
    paginate { cursor -> getBillingEvents(customerRef = customerRef, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getBillingPlan]: Get the plan. GET /v1/billing/plan */
fun ReferalliBlockingClient.getBillingPlan(idempotencyKey: String? = null): GetBillingPlanResponse =
    runBlocking { this@getBillingPlan.client.getBillingPlan(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getBranding]: Get branding. GET /v1/branding */
fun ReferalliBlockingClient.getBranding(idempotencyKey: String? = null): GetBrandingResponse =
    runBlocking { this@getBranding.client.getBranding(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCleanroomConsent]: Get a customer's consent. GET /v1/cleanroom/consent */
fun ReferalliBlockingClient.getCleanroomConsent(customerRef: String, idempotencyKey: String? = null): GetCleanroomConsentResponse =
    runBlocking { this@getCleanroomConsent.client.getCleanroomConsent(customerRef = customerRef, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCleanroomQuery]: Query the clean room. GET /v1/cleanroom/query */
fun ReferalliBlockingClient.getCleanroomQuery(dimension: String, idempotencyKey: String? = null): GetCleanroomQueryResponse =
    runBlocking { this@getCleanroomQuery.client.getCleanroomQuery(dimension = dimension, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCliDeviceCodesUserCode]: Get a pending CLI sign-in. GET /v1/cli/device-codes/{userCode} */
fun ReferalliBlockingClient.getCliDeviceCodesUserCode(userCode: String, idempotencyKey: String? = null): GetCliDeviceCodesUserCodeResponse =
    runBlocking { this@getCliDeviceCodesUserCode.client.getCliDeviceCodesUserCode(userCode = userCode, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCliListenersIdEvents]: Receive listener events. GET /v1/cli/listeners/{id}/events */
fun ReferalliBlockingClient.getCliListenersIdEvents(id: String, wait: Long? = null, idempotencyKey: String? = null): GetCliListenersIdEventsResponse =
    runBlocking { this@getCliListenersIdEvents.client.getCliListenersIdEvents(id = id, wait = wait, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCliLogs]: Tail the request log. GET /v1/cli/logs */
fun ReferalliBlockingClient.getCliLogs(after: Long? = null, wait: Long? = null, limit: Long? = null, idempotencyKey: String? = null): GetCliLogsResponse =
    runBlocking { this@getCliLogs.client.getCliLogs(after = after, wait = wait, limit = limit, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCliTopics]: List triggerable topics. GET /v1/cli/topics */
fun ReferalliBlockingClient.getCliTopics(idempotencyKey: String? = null): GetCliTopicsResponse =
    runBlocking { this@getCliTopics.client.getCliTopics(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCommissionRules]: List commission rules. GET /v1/commission-rules */
fun ReferalliBlockingClient.getCommissionRules(programId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<CommissionRule> =
    runBlocking { this@getCommissionRules.client.getCommissionRules(programId = programId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getCommissionRules], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getCommissionRulesEach(programId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<CommissionRule> =
    paginate { cursor -> getCommissionRules(programId = programId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCommissions]: List commission ledger events. GET /v1/commissions */
fun ReferalliBlockingClient.getCommissions(partnerId: String? = null, programId: String? = null, type: String? = null, referralId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<CommissionEvent> =
    runBlocking { this@getCommissions.client.getCommissions(partnerId = partnerId, programId = programId, type = type, referralId = referralId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getCommissions], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getCommissionsEach(partnerId: String? = null, programId: String? = null, type: String? = null, referralId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<CommissionEvent> =
    paginate { cursor -> getCommissions(partnerId = partnerId, programId = programId, type = type, referralId = referralId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCommissionsId]: Get a commission. GET /v1/commissions/{id} */
fun ReferalliBlockingClient.getCommissionsId(id: String, idempotencyKey: String? = null): CommissionLine =
    runBlocking { this@getCommissionsId.client.getCommissionsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getContracts]: List partner contracts. GET /v1/contracts */
fun ReferalliBlockingClient.getContracts(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetContractsResponseDataItem> =
    runBlocking { this@getContracts.client.getContracts(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getContracts], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getContractsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetContractsResponseDataItem> =
    paginate { cursor -> getContracts(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCoupons]: List coupon codes. GET /v1/coupons */
fun ReferalliBlockingClient.getCoupons(programId: String? = null, partnerId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Coupon> =
    runBlocking { this@getCoupons.client.getCoupons(programId = programId, partnerId = partnerId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getCoupons], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getCouponsEach(programId: String? = null, partnerId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Coupon> =
    paginate { cursor -> getCoupons(programId = programId, partnerId = partnerId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCreators]: Search creators. GET /v1/creators */
fun ReferalliBlockingClient.getCreators(q: String? = null, category: String? = null, channel: String? = null, minAudience: Long? = null, minEngagementBps: Long? = null, audienceCountry: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<CreatorProfile> =
    runBlocking { this@getCreators.client.getCreators(q = q, category = category, channel = channel, minAudience = minAudience, minEngagementBps = minEngagementBps, audienceCountry = audienceCountry, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getCreators], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getCreatorsEach(q: String? = null, category: String? = null, channel: String? = null, minAudience: Long? = null, minEngagementBps: Long? = null, audienceCountry: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<CreatorProfile> =
    paginate { cursor -> getCreators(q = q, category = category, channel = channel, minAudience = minAudience, minEngagementBps = minEngagementBps, audienceCountry = audienceCountry, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getCreatorsAccountId]: Get a creator. GET /v1/creators/{accountId} */
fun ReferalliBlockingClient.getCreatorsAccountId(accountId: String, idempotencyKey: String? = null): CreatorProfile =
    runBlocking { this@getCreatorsAccountId.client.getCreatorsAccountId(accountId = accountId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getDeals]: List registered deals. GET /v1/deals */
fun ReferalliBlockingClient.getDeals(status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetDealsResponseDataItem> =
    runBlocking { this@getDeals.client.getDeals(status = status, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getDeals], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getDealsEach(status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetDealsResponseDataItem> =
    paginate { cursor -> getDeals(status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getDisputes]: List partner disputes. GET /v1/disputes */
fun ReferalliBlockingClient.getDisputes(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetDisputesResponseDataItem> =
    runBlocking { this@getDisputes.client.getDisputes(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getDisputes], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getDisputesEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetDisputesResponseDataItem> =
    paginate { cursor -> getDisputes(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getEmailSettings]: Get email settings. GET /v1/email/settings */
fun ReferalliBlockingClient.getEmailSettings(idempotencyKey: String? = null): EmailSettings =
    runBlocking { this@getEmailSettings.client.getEmailSettings(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getEmailTemplates]: List email templates. GET /v1/email/templates */
fun ReferalliBlockingClient.getEmailTemplates(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<EmailTemplateEvent> =
    runBlocking { this@getEmailTemplates.client.getEmailTemplates(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getEmailTemplates], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getEmailTemplatesEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<EmailTemplateEvent> =
    paginate { cursor -> getEmailTemplates(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getEmbedSummary]: Read embedded partner stats. GET /v1/embed/summary */
fun ReferalliBlockingClient.getEmbedSummary(idempotencyKey: String? = null): GetEmbedSummaryResponse =
    runBlocking { this@getEmbedSummary.client.getEmbedSummary(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getExportAccounting]: Export payouts for accounting. GET /v1/export/accounting */
fun ReferalliBlockingClient.getExportAccounting(format: String? = null, year: Long, idempotencyKey: String? = null): String =
    runBlocking { this@getExportAccounting.client.getExportAccounting(format = format, year = year, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getExportFull]: Export all org data. GET /v1/export/full */
fun ReferalliBlockingClient.getExportFull(idempotencyKey: String? = null): String =
    runBlocking { this@getExportFull.client.getExportFull(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getFraudCases]: List fraud cases. GET /v1/fraud/cases */
fun ReferalliBlockingClient.getFraudCases(status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<FraudCase> =
    runBlocking { this@getFraudCases.client.getFraudCases(status = status, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getFraudCases], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getFraudCasesEach(status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<FraudCase> =
    paginate { cursor -> getFraudCases(status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getFxRates]: List FX rates. GET /v1/fx-rates */
fun ReferalliBlockingClient.getFxRates(base: String? = null, quote: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<FxRate> =
    runBlocking { this@getFxRates.client.getFxRates(base = base, quote = quote, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getFxRates], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getFxRatesEach(base: String? = null, quote: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<FxRate> =
    paginate { cursor -> getFxRates(base = base, quote = quote, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getGraphql]: Query the GraphQL read layer. GET /v1/graphql */
fun ReferalliBlockingClient.getGraphql(idempotencyKey: String? = null): GetGraphqlResponse =
    runBlocking { this@getGraphql.client.getGraphql(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getHealth]: Check API health. GET /v1/health */
fun ReferalliBlockingClient.getHealth(idempotencyKey: String? = null): Ok =
    runBlocking { this@getHealth.client.getHealth(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getHostsCurrent]: Describe the current host. GET /v1/hosts/current */
fun ReferalliBlockingClient.getHostsCurrent(idempotencyKey: String? = null): GetHostsCurrentResponse =
    runBlocking { this@getHostsCurrent.client.getHostsCurrent(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getHostsCurrentThemeCss]: Get the current host's theme stylesheet. GET /v1/hosts/current/theme.css */
fun ReferalliBlockingClient.getHostsCurrentThemeCss(idempotencyKey: String? = null): String =
    runBlocking { this@getHostsCurrentThemeCss.client.getHostsCurrentThemeCss(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getIncrementality]: Get incrementality results. GET /v1/incrementality */
fun ReferalliBlockingClient.getIncrementality(programId: String, idempotencyKey: String? = null): GetIncrementalityResponse =
    runBlocking { this@getIncrementality.client.getIncrementality(programId = programId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getIntegrations]: List integrations. GET /v1/integrations */
fun ReferalliBlockingClient.getIntegrations(idempotencyKey: String? = null): GetIntegrationsResponse =
    runBlocking { this@getIntegrations.client.getIntegrations(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getIntegrationsDeliveries]: List integration deliveries. GET /v1/integrations/deliveries */
fun ReferalliBlockingClient.getIntegrationsDeliveries(kind: String? = null, status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<IntegrationDelivery> =
    runBlocking { this@getIntegrationsDeliveries.client.getIntegrationsDeliveries(kind = kind, status = status, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getIntegrationsDeliveries], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getIntegrationsDeliveriesEach(kind: String? = null, status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<IntegrationDelivery> =
    paginate { cursor -> getIntegrationsDeliveries(kind = kind, status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getInvitations]: List creator invitations. GET /v1/invitations */
fun ReferalliBlockingClient.getInvitations(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetInvitationsResponseDataItem> =
    runBlocking { this@getInvitations.client.getInvitations(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getInvitations], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getInvitationsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetInvitationsResponseDataItem> =
    paginate { cursor -> getInvitations(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getLinks]: List links. GET /v1/links */
fun ReferalliBlockingClient.getLinks(programId: String? = null, partnerId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Link> =
    runBlocking { this@getLinks.client.getLinks(programId = programId, partnerId = partnerId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getLinks], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getLinksEach(programId: String? = null, partnerId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Link> =
    paginate { cursor -> getLinks(programId = programId, partnerId = partnerId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getLinksIdQr]: Get a link's QR code. GET /v1/links/{id}/qr */
fun ReferalliBlockingClient.getLinksIdQr(id: String, idempotencyKey: String? = null): String =
    runBlocking { this@getLinksIdQr.client.getLinksIdQr(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getMarketplaceListing]: List the org's marketplace listings. GET /v1/marketplace/listing */
fun ReferalliBlockingClient.getMarketplaceListing(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetMarketplaceListingResponseDataItem> =
    runBlocking { this@getMarketplaceListing.client.getMarketplaceListing(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getMarketplaceListing], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getMarketplaceListingEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetMarketplaceListingResponseDataItem> =
    paginate { cursor -> getMarketplaceListing(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getMe]: Get the current caller. GET /v1/me */
fun ReferalliBlockingClient.getMe(idempotencyKey: String? = null): GetMeResponse =
    runBlocking { this@getMe.client.getMe(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getNegotiations]: List negotiation rounds. GET /v1/negotiations */
fun ReferalliBlockingClient.getNegotiations(programId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetNegotiationsResponseDataItem> =
    runBlocking { this@getNegotiations.client.getNegotiations(programId = programId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getNegotiations], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getNegotiationsEach(programId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetNegotiationsResponseDataItem> =
    paginate { cursor -> getNegotiations(programId = programId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getNetworkJourney]: Get a customer's network journey. GET /v1/network/journey */
fun ReferalliBlockingClient.getNetworkJourney(emailHash: String, model: String? = null, idempotencyKey: String? = null): GetNetworkJourneyResponse =
    runBlocking { this@getNetworkJourney.client.getNetworkJourney(emailHash = emailHash, model = model, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getNetworkSettings]: Get network membership. GET /v1/network/settings */
fun ReferalliBlockingClient.getNetworkSettings(idempotencyKey: String? = null): GetNetworkSettingsResponse =
    runBlocking { this@getNetworkSettings.client.getNetworkSettings(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getNotifications]: List notifications. GET /v1/notifications */
fun ReferalliBlockingClient.getNotifications(unread: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Notification> =
    runBlocking { this@getNotifications.client.getNotifications(unread = unread, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getNotifications], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getNotificationsEach(unread: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Notification> =
    paginate { cursor -> getNotifications(unread = unread, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOnchainConnections]: List on-chain connections. GET /v1/onchain/connections */
fun ReferalliBlockingClient.getOnchainConnections(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetOnchainConnectionsResponseDataItem> =
    runBlocking { this@getOnchainConnections.client.getOnchainConnections(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getOnchainConnections], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getOnchainConnectionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetOnchainConnectionsResponseDataItem> =
    paginate { cursor -> getOnchainConnections(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOpenapiJson]: Get the OpenAPI document. GET /v1/openapi.json */
fun ReferalliBlockingClient.getOpenapiJson(idempotencyKey: String? = null): GetOpenapiJsonResponse =
    runBlocking { this@getOpenapiJson.client.getOpenapiJson(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOpenapiYaml]: Get the OpenAPI document as YAML. GET /v1/openapi.yaml */
fun ReferalliBlockingClient.getOpenapiYaml(idempotencyKey: String? = null): String =
    runBlocking { this@getOpenapiYaml.client.getOpenapiYaml(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrg]: Get the organization. GET /v1/org */
fun ReferalliBlockingClient.getOrg(idempotencyKey: String? = null): Org =
    runBlocking { this@getOrg.client.getOrg(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrgFxFeed]: Get the FX feed setting. GET /v1/org/fx-feed */
fun ReferalliBlockingClient.getOrgFxFeed(idempotencyKey: String? = null): GetOrgFxFeedResponse =
    runBlocking { this@getOrgFxFeed.client.getOrgFxFeed(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrgMembers]: List team members. GET /v1/org/members */
fun ReferalliBlockingClient.getOrgMembers(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Member> =
    runBlocking { this@getOrgMembers.client.getOrgMembers(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getOrgMembers], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getOrgMembersEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Member> =
    paginate { cursor -> getOrgMembers(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrgPayoutSchedule]: Get payout schedules. GET /v1/org/payout-schedule */
fun ReferalliBlockingClient.getOrgPayoutSchedule(idempotencyKey: String? = null): GetOrgPayoutScheduleResponse =
    runBlocking { this@getOrgPayoutSchedule.client.getOrgPayoutSchedule(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrgReferralParams]: Get referral query parameters. GET /v1/org/referral-params */
fun ReferalliBlockingClient.getOrgReferralParams(idempotencyKey: String? = null): GetOrgReferralParamsResponse =
    runBlocking { this@getOrgReferralParams.client.getOrgReferralParams(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrgRetention]: Get the data retention policy. GET /v1/org/retention */
fun ReferalliBlockingClient.getOrgRetention(idempotencyKey: String? = null): Retention =
    runBlocking { this@getOrgRetention.client.getOrgRetention(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrgSso]: Get SSO settings. GET /v1/org/sso */
fun ReferalliBlockingClient.getOrgSso(idempotencyKey: String? = null): GetOrgSsoResponse =
    runBlocking { this@getOrgSso.client.getOrgSso(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrgSsoConnectionsIdSamlMetadata]: Get SAML metadata. GET /v1/org/sso/connections/{id}/saml-metadata */
fun ReferalliBlockingClient.getOrgSsoConnectionsIdSamlMetadata(id: String, idempotencyKey: String? = null): GetOrgSsoConnectionsIdSamlMetadataResponse =
    runBlocking { this@getOrgSsoConnectionsIdSamlMetadata.client.getOrgSsoConnectionsIdSamlMetadata(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOrgTaxProfile]: Get the tax profile. GET /v1/org/tax-profile */
fun ReferalliBlockingClient.getOrgTaxProfile(idempotencyKey: String? = null): TaxProfile =
    runBlocking { this@getOrgTaxProfile.client.getOrgTaxProfile(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getOutreach]: List outreach messages. GET /v1/outreach */
fun ReferalliBlockingClient.getOutreach(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetOutreachResponseDataItem> =
    runBlocking { this@getOutreach.client.getOutreach(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getOutreach], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getOutreachEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetOutreachResponseDataItem> =
    paginate { cursor -> getOutreach(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerAchievements]: List my achievements. GET /v1/partner/achievements */
fun ReferalliBlockingClient.getPartnerAchievements(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerAchievementsResponseDataItem> =
    runBlocking { this@getPartnerAchievements.client.getPartnerAchievements(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerAchievements], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerAchievementsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerAchievementsResponseDataItem> =
    paginate { cursor -> getPartnerAchievements(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerAdvance]: List my advances. GET /v1/partner/advance */
fun ReferalliBlockingClient.getPartnerAdvance(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerAdvanceResponseDataItem> =
    runBlocking { this@getPartnerAdvance.client.getPartnerAdvance(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerAdvance], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerAdvanceEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerAdvanceResponseDataItem> =
    paginate { cursor -> getPartnerAdvance(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerAdvanceOffer]: Get my advance offer. GET /v1/partner/advance/offer */
fun ReferalliBlockingClient.getPartnerAdvanceOffer(idempotencyKey: String? = null): GetPartnerAdvanceOfferResponse =
    runBlocking { this@getPartnerAdvanceOffer.client.getPartnerAdvanceOffer(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerAssets]: List marketing assets. GET /v1/partner/assets */
fun ReferalliBlockingClient.getPartnerAssets(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerAssetsResponseDataItem> =
    runBlocking { this@getPartnerAssets.client.getPartnerAssets(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerAssets], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerAssetsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerAssetsResponseDataItem> =
    paginate { cursor -> getPartnerAssets(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerContracts]: List my contracts. GET /v1/partner/contracts */
fun ReferalliBlockingClient.getPartnerContracts(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerContractsResponseDataItem> =
    runBlocking { this@getPartnerContracts.client.getPartnerContracts(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerContracts], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerContractsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerContractsResponseDataItem> =
    paginate { cursor -> getPartnerContracts(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerDeals]: List my deals. GET /v1/partner/deals */
fun ReferalliBlockingClient.getPartnerDeals(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerDealsResponseDataItem> =
    runBlocking { this@getPartnerDeals.client.getPartnerDeals(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerDeals], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerDealsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerDealsResponseDataItem> =
    paginate { cursor -> getPartnerDeals(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerDisputes]: List my disputes. GET /v1/partner/disputes */
fun ReferalliBlockingClient.getPartnerDisputes(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerDisputesResponseDataItem> =
    runBlocking { this@getPartnerDisputes.client.getPartnerDisputes(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerDisputes], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerDisputesEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerDisputesResponseDataItem> =
    paginate { cursor -> getPartnerDisputes(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerGroups]: List my groups. GET /v1/partner/groups */
fun ReferalliBlockingClient.getPartnerGroups(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerGroupsResponseDataItem> =
    runBlocking { this@getPartnerGroups.client.getPartnerGroups(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerGroups], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerGroupsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerGroupsResponseDataItem> =
    paginate { cursor -> getPartnerGroups(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerInvitations]: List my invitations. GET /v1/partner/invitations */
fun ReferalliBlockingClient.getPartnerInvitations(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerInvitationsResponseDataItem> =
    runBlocking { this@getPartnerInvitations.client.getPartnerInvitations(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerInvitations], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerInvitationsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerInvitationsResponseDataItem> =
    paginate { cursor -> getPartnerInvitations(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerKycStatus]: Get my identity verification status. GET /v1/partner/kyc/status */
fun ReferalliBlockingClient.getPartnerKycStatus(idempotencyKey: String? = null): GetPartnerKycStatusResponse =
    runBlocking { this@getPartnerKycStatus.client.getPartnerKycStatus(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerLinks]: List my links. GET /v1/partner/links */
fun ReferalliBlockingClient.getPartnerLinks(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerLinksResponseDataItem> =
    runBlocking { this@getPartnerLinks.client.getPartnerLinks(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerLinks], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerLinksEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerLinksResponseDataItem> =
    paginate { cursor -> getPartnerLinks(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerLinksIdQr]: Get my link's QR code. GET /v1/partner/links/{id}/qr */
fun ReferalliBlockingClient.getPartnerLinksIdQr(id: String, idempotencyKey: String? = null): String =
    runBlocking { this@getPartnerLinksIdQr.client.getPartnerLinksIdQr(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerMarketplace]: Browse the marketplace. GET /v1/partner/marketplace */
fun ReferalliBlockingClient.getPartnerMarketplace(category: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerMarketplaceResponseDataItem> =
    runBlocking { this@getPartnerMarketplace.client.getPartnerMarketplace(category = category, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerMarketplace], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerMarketplaceEach(category: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerMarketplaceResponseDataItem> =
    paginate { cursor -> getPartnerMarketplace(category = category, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerMe]: Get my account and memberships. GET /v1/partner/me */
fun ReferalliBlockingClient.getPartnerMe(idempotencyKey: String? = null): GetPartnerMeResponse =
    runBlocking { this@getPartnerMe.client.getPartnerMe(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerNotifications]: List my notifications. GET /v1/partner/notifications */
fun ReferalliBlockingClient.getPartnerNotifications(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Notification> =
    runBlocking { this@getPartnerNotifications.client.getPartnerNotifications(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerNotifications], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerNotificationsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Notification> =
    paginate { cursor -> getPartnerNotifications(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerOrgsOrgIdSelfBilling]: Get self-billing status. GET /v1/partner/orgs/{orgId}/self-billing */
fun ReferalliBlockingClient.getPartnerOrgsOrgIdSelfBilling(orgId: String, idempotencyKey: String? = null): GetPartnerOrgsOrgIdSelfBillingResponse =
    runBlocking { this@getPartnerOrgsOrgIdSelfBilling.client.getPartnerOrgsOrgIdSelfBilling(orgId = orgId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerPassport]: Get my reputation passport. GET /v1/partner/passport */
fun ReferalliBlockingClient.getPartnerPassport(idempotencyKey: String? = null): Passport =
    runBlocking { this@getPartnerPassport.client.getPartnerPassport(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerPayouts]: List my payouts. GET /v1/partner/payouts */
fun ReferalliBlockingClient.getPartnerPayouts(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerPayoutsResponseDataItem> =
    runBlocking { this@getPartnerPayouts.client.getPartnerPayouts(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerPayouts], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerPayoutsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerPayoutsResponseDataItem> =
    paginate { cursor -> getPartnerPayouts(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerPayoutsIdInvoice]: Get my payout invoice. GET /v1/partner/payouts/{id}/invoice */
fun ReferalliBlockingClient.getPartnerPayoutsIdInvoice(id: String, format: String? = null, idempotencyKey: String? = null): Invoice =
    runBlocking { this@getPartnerPayoutsIdInvoice.client.getPartnerPayoutsIdInvoice(id = id, format = format, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerPostbackLogs]: List my postback calls. GET /v1/partner/postback-logs */
fun ReferalliBlockingClient.getPartnerPostbackLogs(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerPostbackLogsResponseDataItem> =
    runBlocking { this@getPartnerPostbackLogs.client.getPartnerPostbackLogs(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerPostbackLogs], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerPostbackLogsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerPostbackLogsResponseDataItem> =
    paginate { cursor -> getPartnerPostbackLogs(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerProfile]: Get my creator profile. GET /v1/partner/profile */
fun ReferalliBlockingClient.getPartnerProfile(idempotencyKey: String? = null): CreatorProfile =
    runBlocking { this@getPartnerProfile.client.getPartnerProfile(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerProfileVerified]: Get my verified performance. GET /v1/partner/profile/verified */
fun ReferalliBlockingClient.getPartnerProfileVerified(idempotencyKey: String? = null): GetPartnerProfileVerifiedResponse =
    runBlocking { this@getPartnerProfileVerified.client.getPartnerProfileVerified(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerProgramsProgramIdLeaderboard]: Get a program leaderboard. GET /v1/partner/programs/{programId}/leaderboard */
fun ReferalliBlockingClient.getPartnerProgramsProgramIdLeaderboard(programId: String, idempotencyKey: String? = null): GetPartnerProgramsProgramIdLeaderboardResponse =
    runBlocking { this@getPartnerProgramsProgramIdLeaderboard.client.getPartnerProgramsProgramIdLeaderboard(programId = programId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerRecruit]: Get my recruiting link. GET /v1/partner/recruit */
fun ReferalliBlockingClient.getPartnerRecruit(idempotencyKey: String? = null): GetPartnerRecruitResponse =
    runBlocking { this@getPartnerRecruit.client.getPartnerRecruit(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerReferrals]: List my referrals. GET /v1/partner/referrals */
fun ReferalliBlockingClient.getPartnerReferrals(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerReferralsResponseDataItem> =
    runBlocking { this@getPartnerReferrals.client.getPartnerReferrals(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerReferrals], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerReferralsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerReferralsResponseDataItem> =
    paginate { cursor -> getPartnerReferrals(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerReferralsIdTransparency]: Explain a referral. GET /v1/partner/referrals/{id}/transparency */
fun ReferalliBlockingClient.getPartnerReferralsIdTransparency(id: String, idempotencyKey: String? = null): GetPartnerReferralsIdTransparencyResponse =
    runBlocking { this@getPartnerReferralsIdTransparency.client.getPartnerReferralsIdTransparency(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartners]: List partners. GET /v1/partners */
fun ReferalliBlockingClient.getPartners(email: String? = null, externalRef: String? = null, status: String? = null, includeArchived: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Partner> =
    runBlocking { this@getPartners.client.getPartners(email = email, externalRef = externalRef, status = status, includeArchived = includeArchived, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartners], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnersEach(email: String? = null, externalRef: String? = null, status: String? = null, includeArchived: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Partner> =
    paginate { cursor -> getPartners(email = email, externalRef = externalRef, status = status, includeArchived = includeArchived, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerSecurity]: Get my security settings. GET /v1/partner/security */
fun ReferalliBlockingClient.getPartnerSecurity(idempotencyKey: String? = null): GetPartnerSecurityResponse =
    runBlocking { this@getPartnerSecurity.client.getPartnerSecurity(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnersId]: Get a partner. GET /v1/partners/{id} */
fun ReferalliBlockingClient.getPartnersId(id: String, idempotencyKey: String? = null): GetPartnersIdResponse =
    runBlocking { this@getPartnersId.client.getPartnersId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnersIdBalances]: Get a partner's balances. GET /v1/partners/{id}/balances */
fun ReferalliBlockingClient.getPartnersIdBalances(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Balance> =
    runBlocking { this@getPartnersIdBalances.client.getPartnersIdBalances(id = id, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnersIdBalances], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnersIdBalancesEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Balance> =
    paginate { cursor -> getPartnersIdBalances(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnersIdEnrollments]: List a partner's enrollments. GET /v1/partners/{id}/enrollments */
fun ReferalliBlockingClient.getPartnersIdEnrollments(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnersIdEnrollmentsResponseDataItem> =
    runBlocking { this@getPartnersIdEnrollments.client.getPartnersIdEnrollments(id = id, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnersIdEnrollments], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnersIdEnrollmentsEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnersIdEnrollmentsResponseDataItem> =
    paginate { cursor -> getPartnersIdEnrollments(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnersIdPayoutProfile]: Get a partner's payout profile. GET /v1/partners/{id}/payout-profile */
fun ReferalliBlockingClient.getPartnersIdPayoutProfile(id: String, idempotencyKey: String? = null): PayoutProfile =
    runBlocking { this@getPartnersIdPayoutProfile.client.getPartnersIdPayoutProfile(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnersIdQuality]: Get a partner's quality score. GET /v1/partners/{id}/quality */
fun ReferalliBlockingClient.getPartnersIdQuality(id: String, idempotencyKey: String? = null): GetPartnersIdQualityResponse =
    runBlocking { this@getPartnersIdQuality.client.getPartnersIdQuality(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerStats]: Get my stats. GET /v1/partner/stats */
fun ReferalliBlockingClient.getPartnerStats(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerStatsResponseDataItem> =
    runBlocking { this@getPartnerStats.client.getPartnerStats(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerStats], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerStatsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerStatsResponseDataItem> =
    paginate { cursor -> getPartnerStats(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerTaxDocuments]: List my tax documents. GET /v1/partner/tax-documents */
fun ReferalliBlockingClient.getPartnerTaxDocuments(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerTaxDocumentsResponseDataItem> =
    runBlocking { this@getPartnerTaxDocuments.client.getPartnerTaxDocuments(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerTaxDocuments], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerTaxDocumentsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerTaxDocumentsResponseDataItem> =
    paginate { cursor -> getPartnerTaxDocuments(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerTaxDocumentsId]: Get my tax document. GET /v1/partner/tax-documents/{id} */
fun ReferalliBlockingClient.getPartnerTaxDocumentsId(id: String, idempotencyKey: String? = null): String =
    runBlocking { this@getPartnerTaxDocumentsId.client.getPartnerTaxDocumentsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPartnerTerms]: List program terms. GET /v1/partner/terms */
fun ReferalliBlockingClient.getPartnerTerms(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPartnerTermsResponseDataItem> =
    runBlocking { this@getPartnerTerms.client.getPartnerTerms(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPartnerTerms], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPartnerTermsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPartnerTermsResponseDataItem> =
    paginate { cursor -> getPartnerTerms(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPassportPublicKey]: Get the passport signing key. GET /v1/passport/public-key */
fun ReferalliBlockingClient.getPassportPublicKey(idempotencyKey: String? = null): GetPassportPublicKeyResponse =
    runBlocking { this@getPassportPublicKey.client.getPassportPublicKey(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPayoutConnections]: List payout provider connections. GET /v1/payout-connections */
fun ReferalliBlockingClient.getPayoutConnections(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetPayoutConnectionsResponseDataItem> =
    runBlocking { this@getPayoutConnections.client.getPayoutConnections(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPayoutConnections], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPayoutConnectionsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetPayoutConnectionsResponseDataItem> =
    paginate { cursor -> getPayoutConnections(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPayoutRuns]: List payout runs. GET /v1/payout-runs */
fun ReferalliBlockingClient.getPayoutRuns(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<PayoutRun> =
    runBlocking { this@getPayoutRuns.client.getPayoutRuns(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPayoutRuns], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPayoutRunsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<PayoutRun> =
    paginate { cursor -> getPayoutRuns(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPayouts]: List payouts. GET /v1/payouts */
fun ReferalliBlockingClient.getPayouts(partnerId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Payout> =
    runBlocking { this@getPayouts.client.getPayouts(partnerId = partnerId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPayouts], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPayoutsEach(partnerId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Payout> =
    paginate { cursor -> getPayouts(partnerId = partnerId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPayoutsIdInvoice]: Get a payout's invoice. GET /v1/payouts/{id}/invoice */
fun ReferalliBlockingClient.getPayoutsIdInvoice(id: String, format: String? = null, idempotencyKey: String? = null): Invoice =
    runBlocking { this@getPayoutsIdInvoice.client.getPayoutsIdInvoice(id = id, format = format, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPrivacyExport]: Export a customer's data. GET /v1/privacy/export */
fun ReferalliBlockingClient.getPrivacyExport(customerRef: String, idempotencyKey: String? = null): CustomerExport =
    runBlocking { this@getPrivacyExport.client.getPrivacyExport(customerRef = customerRef, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPrivacyRequests]: List data-subject requests. GET /v1/privacy/requests */
fun ReferalliBlockingClient.getPrivacyRequests(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<PrivacyRequest> =
    runBlocking { this@getPrivacyRequests.client.getPrivacyRequests(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPrivacyRequests], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getPrivacyRequestsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<PrivacyRequest> =
    paginate { cursor -> getPrivacyRequests(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPrivacyRequestsId]: Get a data-subject request. GET /v1/privacy/requests/{id} */
fun ReferalliBlockingClient.getPrivacyRequestsId(id: String, idempotencyKey: String? = null): PrivacyRequest =
    runBlocking { this@getPrivacyRequestsId.client.getPrivacyRequestsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPrivacyRequestsIdResult]: Get a data-subject request result. GET /v1/privacy/requests/{id}/result */
fun ReferalliBlockingClient.getPrivacyRequestsIdResult(id: String, idempotencyKey: String? = null): GetPrivacyRequestsIdResultResponse =
    runBlocking { this@getPrivacyRequestsIdResult.client.getPrivacyRequestsIdResult(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProfitabilityProducts]: List product margins. GET /v1/profitability/products */
fun ReferalliBlockingClient.getProfitabilityProducts(idempotencyKey: String? = null): GetProfitabilityProductsResponse =
    runBlocking { this@getProfitabilityProducts.client.getProfitabilityProducts(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProfitabilityProductsProductRef]: Get a product margin. GET /v1/profitability/products/{productRef} */
fun ReferalliBlockingClient.getProfitabilityProductsProductRef(productRef: String, idempotencyKey: String? = null): GetProfitabilityProductsProductRefResponse =
    runBlocking { this@getProfitabilityProductsProductRef.client.getProfitabilityProductsProductRef(productRef = productRef, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProfitabilityRebuildJobId]: Get a rebuild job. GET /v1/profitability/rebuild/{jobId} */
fun ReferalliBlockingClient.getProfitabilityRebuildJobId(jobId: String, idempotencyKey: String? = null): GetProfitabilityRebuildJobIdResponse =
    runBlocking { this@getProfitabilityRebuildJobId.client.getProfitabilityRebuildJobId(jobId = jobId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProfitabilitySettings]: Get profitability settings. GET /v1/profitability/settings */
fun ReferalliBlockingClient.getProfitabilitySettings(programId: String? = null, idempotencyKey: String? = null): GetProfitabilitySettingsResponse =
    runBlocking { this@getProfitabilitySettings.client.getProfitabilitySettings(programId = programId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPrograms]: List programs. GET /v1/programs */
fun ReferalliBlockingClient.getPrograms(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Program> =
    runBlocking { this@getPrograms.client.getPrograms(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getPrograms], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getProgramsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Program> =
    paginate { cursor -> getPrograms(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsId]: Get a program. GET /v1/programs/{id} */
fun ReferalliBlockingClient.getProgramsId(id: String, idempotencyKey: String? = null): Program =
    runBlocking { this@getProgramsId.client.getProgramsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsIdAutopricing]: Get autopricing settings. GET /v1/programs/{id}/autopricing */
fun ReferalliBlockingClient.getProgramsIdAutopricing(id: String, idempotencyKey: String? = null): GetProgramsIdAutopricingResponse =
    runBlocking { this@getProgramsIdAutopricing.client.getProgramsIdAutopricing(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsIdEnrollments]: List program enrollments. GET /v1/programs/{id}/enrollments */
fun ReferalliBlockingClient.getProgramsIdEnrollments(id: String, status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetProgramsIdEnrollmentsResponseDataItem> =
    runBlocking { this@getProgramsIdEnrollments.client.getProgramsIdEnrollments(id = id, status = status, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getProgramsIdEnrollments], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getProgramsIdEnrollmentsEach(id: String, status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetProgramsIdEnrollmentsResponseDataItem> =
    paginate { cursor -> getProgramsIdEnrollments(id = id, status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsIdGraph]: Get the referral tree. GET /v1/programs/{id}/graph */
fun ReferalliBlockingClient.getProgramsIdGraph(id: String, root: String, depth: Long? = null, idempotencyKey: String? = null): GetProgramsIdGraphResponse =
    runBlocking { this@getProgramsIdGraph.client.getProgramsIdGraph(id = id, root = root, depth = depth, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsIdGroups]: List partner groups. GET /v1/programs/{id}/groups */
fun ReferalliBlockingClient.getProgramsIdGroups(id: String, includeArchived: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<PartnerGroup> =
    runBlocking { this@getProgramsIdGroups.client.getProgramsIdGroups(id = id, includeArchived = includeArchived, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getProgramsIdGroups], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getProgramsIdGroupsEach(id: String, includeArchived: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<PartnerGroup> =
    paginate { cursor -> getProgramsIdGroups(id = id, includeArchived = includeArchived, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsIdNegotiationPolicy]: Get the agent negotiation policy. GET /v1/programs/{id}/negotiation-policy */
fun ReferalliBlockingClient.getProgramsIdNegotiationPolicy(id: String, idempotencyKey: String? = null): GetProgramsIdNegotiationPolicyResponse =
    runBlocking { this@getProgramsIdNegotiationPolicy.client.getProgramsIdNegotiationPolicy(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsIdPromotions]: List promotions. GET /v1/programs/{id}/promotions */
fun ReferalliBlockingClient.getProgramsIdPromotions(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Promotion> =
    runBlocking { this@getProgramsIdPromotions.client.getProgramsIdPromotions(id = id, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getProgramsIdPromotions], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getProgramsIdPromotionsEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Promotion> =
    paginate { cursor -> getProgramsIdPromotions(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsIdRefereeReward]: Get the referee reward. GET /v1/programs/{id}/referee-reward */
fun ReferalliBlockingClient.getProgramsIdRefereeReward(id: String, idempotencyKey: String? = null): GetProgramsIdRefereeRewardResponse =
    runBlocking { this@getProgramsIdRefereeReward.client.getProgramsIdRefereeReward(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProgramsIdTermsAcceptances]: List terms acceptances. GET /v1/programs/{id}/terms-acceptances */
fun ReferalliBlockingClient.getProgramsIdTermsAcceptances(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetProgramsIdTermsAcceptancesResponseDataItem> =
    runBlocking { this@getProgramsIdTermsAcceptances.client.getProgramsIdTermsAcceptances(id = id, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getProgramsIdTermsAcceptances], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getProgramsIdTermsAcceptancesEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetProgramsIdTermsAcceptancesResponseDataItem> =
    paginate { cursor -> getProgramsIdTermsAcceptances(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getProspects]: List prospects. GET /v1/prospects */
fun ReferalliBlockingClient.getProspects(status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetProspectsResponseDataItem> =
    runBlocking { this@getProspects.client.getProspects(status = status, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getProspects], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getProspectsEach(status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetProspectsResponseDataItem> =
    paginate { cursor -> getProspects(status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getPublicProgramsHandle]: Get a program's public page. GET /v1/public/programs/{handle} */
fun ReferalliBlockingClient.getPublicProgramsHandle(handle: String, idempotencyKey: String? = null): GetPublicProgramsHandleResponse =
    runBlocking { this@getPublicProgramsHandle.client.getPublicProgramsHandle(handle = handle, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getReferrals]: List referrals. GET /v1/referrals */
fun ReferalliBlockingClient.getReferrals(programId: String? = null, partnerId: String? = null, status: String? = null, customerRef: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Referral> =
    runBlocking { this@getReferrals.client.getReferrals(programId = programId, partnerId = partnerId, status = status, customerRef = customerRef, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getReferrals], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getReferralsEach(programId: String? = null, partnerId: String? = null, status: String? = null, customerRef: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Referral> =
    paginate { cursor -> getReferrals(programId = programId, partnerId = partnerId, status = status, customerRef = customerRef, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getReferralsId]: Get a referral. GET /v1/referrals/{id} */
fun ReferalliBlockingClient.getReferralsId(id: String, idempotencyKey: String? = null): Referral =
    runBlocking { this@getReferralsId.client.getReferralsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getReferralsIdJourney]: Get the attribution journey. GET /v1/referrals/{id}/journey */
fun ReferalliBlockingClient.getReferralsIdJourney(id: String, idempotencyKey: String? = null): GetReferralsIdJourneyResponse =
    runBlocking { this@getReferralsIdJourney.client.getReferralsIdJourney(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getReportsFilteredClicks]: Report filtered clicks. GET /v1/reports/filtered-clicks */
fun ReferalliBlockingClient.getReportsFilteredClicks(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetReportsFilteredClicksResponseDataItem> =
    runBlocking { this@getReportsFilteredClicks.client.getReportsFilteredClicks(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getReportsFilteredClicks], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getReportsFilteredClicksEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetReportsFilteredClicksResponseDataItem> =
    paginate { cursor -> getReportsFilteredClicks(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getReportsPartnerPerformance]: Get partner performance. GET /v1/reports/partner-performance */
fun ReferalliBlockingClient.getReportsPartnerPerformance(format: String? = null, idempotencyKey: String? = null): GetReportsPartnerPerformanceResponse =
    runBlocking { this@getReportsPartnerPerformance.client.getReportsPartnerPerformance(format = format, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRewards]: List issued referee rewards. GET /v1/rewards */
fun ReferalliBlockingClient.getRewards(status: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetRewardsResponseDataItem> =
    runBlocking { this@getRewards.client.getRewards(status = status, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getRewards], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getRewardsEach(status: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetRewardsResponseDataItem> =
    paginate { cursor -> getRewards(status = status, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRewardsLookupCode]: Look up a reward code. GET /v1/rewards/lookup/{code} */
fun ReferalliBlockingClient.getRewardsLookupCode(code: String, idempotencyKey: String? = null): GetRewardsLookupCodeResponse =
    runBlocking { this@getRewardsLookupCode.client.getRewardsLookupCode(code = code, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRoiBreakdown]: Get the ROI breakdown. GET /v1/roi/breakdown */
fun ReferalliBlockingClient.getRoiBreakdown(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, by: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetRoiBreakdownResponseDataItem> =
    runBlocking { this@getRoiBreakdown.client.getRoiBreakdown(from = from, to = to, programId = programId, partnerId = partnerId, windowDays = windowDays, currency = currency, format = format, by = by, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getRoiBreakdown], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getRoiBreakdownEach(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, by: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetRoiBreakdownResponseDataItem> =
    paginate { cursor -> getRoiBreakdown(from = from, to = to, programId = programId, partnerId = partnerId, windowDays = windowDays, currency = currency, format = format, by = by, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRoiDataQuality]: Get ROI data quality. GET /v1/roi/data-quality */
fun ReferalliBlockingClient.getRoiDataQuality(from: String? = null, to: String? = null, format: String? = null, idempotencyKey: String? = null): GetRoiDataQualityResponse =
    runBlocking { this@getRoiDataQuality.client.getRoiDataQuality(from = from, to = to, format = format, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRoiGrants]: List credit grants. GET /v1/roi/grants */
fun ReferalliBlockingClient.getRoiGrants(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, status: String? = null, role: String? = null, paidBack: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<RoiGrant> =
    runBlocking { this@getRoiGrants.client.getRoiGrants(from = from, to = to, programId = programId, partnerId = partnerId, windowDays = windowDays, currency = currency, format = format, status = status, role = role, paidBack = paidBack, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getRoiGrants], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getRoiGrantsEach(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, status: String? = null, role: String? = null, paidBack: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<RoiGrant> =
    paginate { cursor -> getRoiGrants(from = from, to = to, programId = programId, partnerId = partnerId, windowDays = windowDays, currency = currency, format = format, status = status, role = role, paidBack = paidBack, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRoiPartnersIdTrace]: Trace a partner's value. GET /v1/roi/partners/{id}/trace */
fun ReferalliBlockingClient.getRoiPartnersIdTrace(id: String, windowDays: Long? = null, format: String? = null, idempotencyKey: String? = null): RoiTrace =
    runBlocking { this@getRoiPartnersIdTrace.client.getRoiPartnersIdTrace(id = id, windowDays = windowDays, format = format, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRoiPatterns]: List value patterns. GET /v1/roi/patterns */
fun ReferalliBlockingClient.getRoiPatterns(idempotencyKey: String? = null): GetRoiPatternsResponse =
    runBlocking { this@getRoiPatterns.client.getRoiPatterns(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRoiPatternsPattern]: Get a value pattern. GET /v1/roi/patterns/{pattern} */
fun ReferalliBlockingClient.getRoiPatternsPattern(pattern: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<RoiPatternEntry> =
    runBlocking { this@getRoiPatternsPattern.client.getRoiPatternsPattern(pattern = pattern, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getRoiPatternsPattern], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getRoiPatternsPatternEach(pattern: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<RoiPatternEntry> =
    paginate { cursor -> getRoiPatternsPattern(pattern = pattern, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRoiSummary]: Get the ROI summary. GET /v1/roi/summary */
fun ReferalliBlockingClient.getRoiSummary(from: String? = null, to: String? = null, programId: String? = null, partnerId: String? = null, windowDays: Long? = null, currency: String? = null, format: String? = null, model: String? = null, includeProjection: String? = null, idempotencyKey: String? = null): RoiSummary =
    runBlocking { this@getRoiSummary.client.getRoiSummary(from = from, to = to, programId = programId, partnerId = partnerId, windowDays = windowDays, currency = currency, format = format, model = model, includeProjection = includeProjection, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getRoiTraceCustomerRef]: Trace a customer's value. GET /v1/roi/trace/{customerRef} */
fun ReferalliBlockingClient.getRoiTraceCustomerRef(customerRef: String, windowDays: Long? = null, format: String? = null, idempotencyKey: String? = null): RoiTrace =
    runBlocking { this@getRoiTraceCustomerRef.client.getRoiTraceCustomerRef(customerRef = customerRef, windowDays = windowDays, format = format, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getSetupStatus]: Get setup progress. GET /v1/setup/status */
fun ReferalliBlockingClient.getSetupStatus(idempotencyKey: String? = null): GetSetupStatusResponse =
    runBlocking { this@getSetupStatus.client.getSetupStatus(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getStatus]: Get platform status. GET /v1/status */
fun ReferalliBlockingClient.getStatus(idempotencyKey: String? = null): GetStatusResponse =
    runBlocking { this@getStatus.client.getStatus(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getStatusIncidents]: List status incidents. GET /v1/status/incidents */
fun ReferalliBlockingClient.getStatusIncidents(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<Incident> =
    runBlocking { this@getStatusIncidents.client.getStatusIncidents(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getStatusIncidents], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getStatusIncidentsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<Incident> =
    paginate { cursor -> getStatusIncidents(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getStatusIncidentsAtom]: Get the incidents feed. GET /v1/status/incidents.atom */
fun ReferalliBlockingClient.getStatusIncidentsAtom(idempotencyKey: String? = null): String =
    runBlocking { this@getStatusIncidentsAtom.client.getStatusIncidentsAtom(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getStatusIncidentsId]: Get a status incident. GET /v1/status/incidents/{id} */
fun ReferalliBlockingClient.getStatusIncidentsId(id: String, idempotencyKey: String? = null): Incident =
    runBlocking { this@getStatusIncidentsId.client.getStatusIncidentsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getTax1099]: Export 1099-NEC data. GET /v1/tax/1099 */
fun ReferalliBlockingClient.getTax1099(year: Long, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetTax1099ResponseDataItem> =
    runBlocking { this@getTax1099.client.getTax1099(year = year, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getTax1099], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getTax1099Each(year: Long, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetTax1099ResponseDataItem> =
    paginate { cursor -> getTax1099(year = year, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getTax1099Filings]: List 1099 filings. GET /v1/tax/1099/filings */
fun ReferalliBlockingClient.getTax1099Filings(year: Long, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetTax1099FilingsResponseDataItem> =
    runBlocking { this@getTax1099Filings.client.getTax1099Filings(year = year, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getTax1099Filings], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getTax1099FilingsEach(year: Long, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetTax1099FilingsResponseDataItem> =
    paginate { cursor -> getTax1099Filings(year = year, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getTax1099Preview]: Preview 1099-NEC filings. GET /v1/tax/1099/preview */
fun ReferalliBlockingClient.getTax1099Preview(year: Long, idempotencyKey: String? = null): NecPreview =
    runBlocking { this@getTax1099Preview.client.getTax1099Preview(year = year, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getTestClock]: Get the test clock. GET /v1/test_clock */
fun ReferalliBlockingClient.getTestClock(idempotencyKey: String? = null): GetTestClockResponse =
    runBlocking { this@getTestClock.client.getTestClock(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getTestEmails]: List captured test emails. GET /v1/test/emails */
fun ReferalliBlockingClient.getTestEmails(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<GetTestEmailsResponseDataItem> =
    runBlocking { this@getTestEmails.client.getTestEmails(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getTestEmails], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getTestEmailsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<GetTestEmailsResponseDataItem> =
    paginate { cursor -> getTestEmails(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getValueImportJobId]: Get a value import job. GET /v1/value/import/{jobId} */
fun ReferalliBlockingClient.getValueImportJobId(jobId: String, idempotencyKey: String? = null): GetValueImportJobIdResponse =
    runBlocking { this@getValueImportJobId.client.getValueImportJobId(jobId = jobId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getVersions]: List API versions. GET /v1/versions */
fun ReferalliBlockingClient.getVersions(idempotencyKey: String? = null): GetVersionsResponse =
    runBlocking { this@getVersions.client.getVersions(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getWebhookDeliveries]: List webhook deliveries. GET /v1/webhook-deliveries */
fun ReferalliBlockingClient.getWebhookDeliveries(endpointId: String? = null, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<WebhookDelivery> =
    runBlocking { this@getWebhookDeliveries.client.getWebhookDeliveries(endpointId = endpointId, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getWebhookDeliveries], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getWebhookDeliveriesEach(endpointId: String? = null, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<WebhookDelivery> =
    paginate { cursor -> getWebhookDeliveries(endpointId = endpointId, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getWebhookDeliveriesId]: Get a webhook delivery. GET /v1/webhook-deliveries/{id} */
fun ReferalliBlockingClient.getWebhookDeliveriesId(id: String, idempotencyKey: String? = null): GetWebhookDeliveriesIdResponse =
    runBlocking { this@getWebhookDeliveriesId.client.getWebhookDeliveriesId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getWebhookEndpoints]: List webhook endpoints. GET /v1/webhook-endpoints */
fun ReferalliBlockingClient.getWebhookEndpoints(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<WebhookEndpoint> =
    runBlocking { this@getWebhookEndpoints.client.getWebhookEndpoints(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getWebhookEndpoints], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getWebhookEndpointsEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<WebhookEndpoint> =
    paginate { cursor -> getWebhookEndpoints(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getWebhookEndpointsId]: Get a webhook endpoint. GET /v1/webhook-endpoints/{id} */
fun ReferalliBlockingClient.getWebhookEndpointsId(id: String, idempotencyKey: String? = null): WebhookEndpoint =
    runBlocking { this@getWebhookEndpointsId.client.getWebhookEndpointsId(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getWebhookEndpointsIdDeliveries]: List an endpoint's deliveries. GET /v1/webhook-endpoints/{id}/deliveries */
fun ReferalliBlockingClient.getWebhookEndpointsIdDeliveries(id: String, limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<WebhookDelivery> =
    runBlocking { this@getWebhookEndpointsIdDeliveries.client.getWebhookEndpointsIdDeliveries(id = id, limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getWebhookEndpointsIdDeliveries], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getWebhookEndpointsIdDeliveriesEach(id: String, limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<WebhookDelivery> =
    paginate { cursor -> getWebhookEndpointsIdDeliveries(id = id, limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getZapierEvents]: List Zapier trigger events. GET /v1/zapier/events */
fun ReferalliBlockingClient.getZapierEvents(idempotencyKey: String? = null): GetZapierEventsResponse =
    runBlocking { this@getZapierEvents.client.getZapierEvents(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getZapierHooks]: List Zapier hooks. GET /v1/zapier/hooks */
fun ReferalliBlockingClient.getZapierHooks(limit: Long? = null, startingAfter: String? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Page<ZapierHook> =
    runBlocking { this@getZapierHooks.client.getZapierHooks(limit = limit, startingAfter = startingAfter, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Every item of [getZapierHooks], following the pages (lazily, one request per page). */
fun ReferalliBlockingClient.getZapierHooksEach(limit: Long? = null, endingBefore: String? = null, createdGte: String? = null, createdLte: String? = null, idempotencyKey: String? = null): Sequence<ZapierHook> =
    paginate { cursor -> getZapierHooks(limit = limit, startingAfter = cursor, endingBefore = endingBefore, createdGte = createdGte, createdLte = createdLte, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.getZapierTriggersEvent]: Poll a Zapier trigger. GET /v1/zapier/triggers/{event} */
fun ReferalliBlockingClient.getZapierTriggersEvent(event: String, limit: Long? = null, idempotencyKey: String? = null): GetZapierTriggersEventResponse =
    runBlocking { this@getZapierTriggersEvent.client.getZapierTriggersEvent(event = event, limit = limit, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchAdminStatusIncidentsId]: Edit a status incident. PATCH /v1/admin/status/incidents/{id} */
fun ReferalliBlockingClient.patchAdminStatusIncidentsId(id: String, body: PatchAdminStatusIncidentsIdBody, idempotencyKey: String? = null): Incident =
    runBlocking { this@patchAdminStatusIncidentsId.client.patchAdminStatusIncidentsId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchApiKeysId]: Update an API key. PATCH /v1/api-keys/{id} */
fun ReferalliBlockingClient.patchApiKeysId(id: String, body: PatchApiKeysIdBody, idempotencyKey: String? = null): PatchApiKeysIdResponse =
    runBlocking { this@patchApiKeysId.client.patchApiKeysId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchAuthConnectionsId]: Update an auth connection. PATCH /v1/auth/connections/{id} */
fun ReferalliBlockingClient.patchAuthConnectionsId(id: String, body: PatchAuthConnectionsIdBody, idempotencyKey: String? = null): PatchAuthConnectionsIdResponse =
    runBlocking { this@patchAuthConnectionsId.client.patchAuthConnectionsId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchBillingConnectionsId]: Update a billing connection. PATCH /v1/billing/connections/{id} */
fun ReferalliBlockingClient.patchBillingConnectionsId(id: String, body: PatchBillingConnectionsIdBody, idempotencyKey: String? = null): BillingConnection =
    runBlocking { this@patchBillingConnectionsId.client.patchBillingConnectionsId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchOrg]: Update the organization. PATCH /v1/org */
fun ReferalliBlockingClient.patchOrg(body: PatchOrgBody, idempotencyKey: String? = null): PatchOrgResponse =
    runBlocking { this@patchOrg.client.patchOrg(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchOrgMembersUserId]: Change a member's role. PATCH /v1/org/members/{userId} */
fun ReferalliBlockingClient.patchOrgMembersUserId(userId: String, body: PatchOrgMembersUserIdBody, idempotencyKey: String? = null): PatchOrgMembersUserIdResponse =
    runBlocking { this@patchOrgMembersUserId.client.patchOrgMembersUserId(userId = userId, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchOrgSso]: Update SSO settings. PATCH /v1/org/sso */
fun ReferalliBlockingClient.patchOrgSso(body: PatchOrgSsoBody, idempotencyKey: String? = null): PatchOrgSsoResponse =
    runBlocking { this@patchOrgSso.client.patchOrgSso(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchPartnerGroupsId]: Update a partner group. PATCH /v1/partner-groups/{id} */
fun ReferalliBlockingClient.patchPartnerGroupsId(id: String, body: PatchPartnerGroupsIdBody, idempotencyKey: String? = null): PartnerGroup =
    runBlocking { this@patchPartnerGroupsId.client.patchPartnerGroupsId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchPartnersId]: Update a partner. PATCH /v1/partners/{id} */
fun ReferalliBlockingClient.patchPartnersId(id: String, body: PatchPartnersIdBody, idempotencyKey: String? = null): Partner =
    runBlocking { this@patchPartnersId.client.patchPartnersId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchPartnersIdPayoutProfile]: Change a partner's payout threshold. PATCH /v1/partners/{id}/payout-profile */
fun ReferalliBlockingClient.patchPartnersIdPayoutProfile(id: String, body: PatchPartnersIdPayoutProfileBody, idempotencyKey: String? = null): PatchPartnersIdPayoutProfileResponse =
    runBlocking { this@patchPartnersIdPayoutProfile.client.patchPartnersIdPayoutProfile(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchProgramsId]: Update a program. PATCH /v1/programs/{id} */
fun ReferalliBlockingClient.patchProgramsId(id: String, body: PatchProgramsIdBody, idempotencyKey: String? = null): Program =
    runBlocking { this@patchProgramsId.client.patchProgramsId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchReferralsId]: Pause or resume a referral. PATCH /v1/referrals/{id} */
fun ReferalliBlockingClient.patchReferralsId(id: String, body: PatchReferralsIdBody, idempotencyKey: String? = null): Referral =
    runBlocking { this@patchReferralsId.client.patchReferralsId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.patchWebhookEndpointsId]: Update a webhook endpoint. PATCH /v1/webhook-endpoints/{id} */
fun ReferalliBlockingClient.patchWebhookEndpointsId(id: String, body: PatchWebhookEndpointsIdBody, idempotencyKey: String? = null): WebhookEndpoint =
    runBlocking { this@patchWebhookEndpointsId.client.patchWebhookEndpointsId(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAdminOrgsIdPlan]: Set an organization's plan. POST /v1/admin/orgs/{id}/plan */
fun ReferalliBlockingClient.postAdminOrgsIdPlan(id: String, body: PostAdminOrgsIdPlanBody, idempotencyKey: String? = null): PostAdminOrgsIdPlanResponse =
    runBlocking { this@postAdminOrgsIdPlan.client.postAdminOrgsIdPlan(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAdminOrgsIdSuspend]: Suspend an organization. POST /v1/admin/orgs/{id}/suspend */
fun ReferalliBlockingClient.postAdminOrgsIdSuspend(id: String, body: PostAdminOrgsIdSuspendBody, idempotencyKey: String? = null): PostAdminOrgsIdSuspendResponse =
    runBlocking { this@postAdminOrgsIdSuspend.client.postAdminOrgsIdSuspend(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAdminOrgsIdUnsuspend]: Unsuspend an organization. POST /v1/admin/orgs/{id}/unsuspend */
fun ReferalliBlockingClient.postAdminOrgsIdUnsuspend(id: String, idempotencyKey: String? = null): PostAdminOrgsIdUnsuspendResponse =
    runBlocking { this@postAdminOrgsIdUnsuspend.client.postAdminOrgsIdUnsuspend(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAdminPartnerAccountsIdBan]: Ban a partner account. POST /v1/admin/partner-accounts/{id}/ban */
fun ReferalliBlockingClient.postAdminPartnerAccountsIdBan(id: String, idempotencyKey: String? = null): PostAdminPartnerAccountsIdBanResponse =
    runBlocking { this@postAdminPartnerAccountsIdBan.client.postAdminPartnerAccountsIdBan(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAdminPartnerAccountsIdUnban]: Unban a partner account. POST /v1/admin/partner-accounts/{id}/unban */
fun ReferalliBlockingClient.postAdminPartnerAccountsIdUnban(id: String, idempotencyKey: String? = null): PostAdminPartnerAccountsIdUnbanResponse =
    runBlocking { this@postAdminPartnerAccountsIdUnban.client.postAdminPartnerAccountsIdUnban(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAdminStatusIncidents]: Open a status incident. POST /v1/admin/status/incidents */
fun ReferalliBlockingClient.postAdminStatusIncidents(body: PostAdminStatusIncidentsBody, idempotencyKey: String? = null): Incident =
    runBlocking { this@postAdminStatusIncidents.client.postAdminStatusIncidents(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAdminStatusIncidentsIdUpdates]: Post an incident update. POST /v1/admin/status/incidents/{id}/updates */
fun ReferalliBlockingClient.postAdminStatusIncidentsIdUpdates(id: String, body: PostAdminStatusIncidentsIdUpdatesBody, idempotencyKey: String? = null): Incident =
    runBlocking { this@postAdminStatusIncidentsIdUpdates.client.postAdminStatusIncidentsIdUpdates(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAgentsRegister]: Register an AI agent. POST /v1/agents/register */
fun ReferalliBlockingClient.postAgentsRegister(body: PostAgentsRegisterBody, idempotencyKey: String? = null): PostAgentsRegisterResponse =
    runBlocking { this@postAgentsRegister.client.postAgentsRegister(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAnomaliesScan]: Scan for anomalies. POST /v1/anomalies/scan */
fun ReferalliBlockingClient.postAnomaliesScan(idempotencyKey: String? = null): PostAnomaliesScanResponse =
    runBlocking { this@postAnomaliesScan.client.postAnomaliesScan(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postApiKeys]: Create an API key. POST /v1/api-keys */
fun ReferalliBlockingClient.postApiKeys(body: PostApiKeysBody, idempotencyKey: String? = null): PostApiKeysResponse =
    runBlocking { this@postApiKeys.client.postApiKeys(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAssets]: Create a marketing asset. POST /v1/assets */
fun ReferalliBlockingClient.postAssets(body: PostAssetsBody, idempotencyKey: String? = null): PostAssetsResponse =
    runBlocking { this@postAssets.client.postAssets(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAttributionReplay]: Replay attribution. POST /v1/attribution/replay */
fun ReferalliBlockingClient.postAttributionReplay(body: PostAttributionReplayBody, idempotencyKey: String? = null): PostAttributionReplayResponse =
    runBlocking { this@postAttributionReplay.client.postAttributionReplay(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnections]: Connect an auth platform. POST /v1/auth/connections */
fun ReferalliBlockingClient.postAuthConnections(body: PostAuthConnectionsBody, idempotencyKey: String? = null): CreatedAuthConnection =
    runBlocking { this@postAuthConnections.client.postAuthConnections(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnectionsIdAliases]: Change a user's id (signed protocol). POST /v1/auth/connections/{id}/aliases */
fun ReferalliBlockingClient.postAuthConnectionsIdAliases(id: String, body: PostAuthConnectionsIdAliasesBody, idempotencyKey: String? = null): PostAuthConnectionsIdAliasesResponse =
    runBlocking { this@postAuthConnectionsIdAliases.client.postAuthConnectionsIdAliases(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnectionsIdErase]: Erase a user (signed protocol). POST /v1/auth/connections/{id}/erase */
fun ReferalliBlockingClient.postAuthConnectionsIdErase(id: String, body: PostAuthConnectionsIdEraseBody, idempotencyKey: String? = null): PostAuthConnectionsIdEraseResponse =
    runBlocking { this@postAuthConnectionsIdErase.client.postAuthConnectionsIdErase(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnectionsIdPing]: Test an auth connection (signed protocol). POST /v1/auth/connections/{id}/ping */
fun ReferalliBlockingClient.postAuthConnectionsIdPing(id: String, body: Map<String, JsonValue>, idempotencyKey: String? = null): PostAuthConnectionsIdPingResponse =
    runBlocking { this@postAuthConnectionsIdPing.client.postAuthConnectionsIdPing(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnectionsIdRevokePreviousSecret]: Revoke the previous auth secret. POST /v1/auth/connections/{id}/revoke-previous-secret */
fun ReferalliBlockingClient.postAuthConnectionsIdRevokePreviousSecret(id: String, idempotencyKey: String? = null): PostAuthConnectionsIdRevokePreviousSecretResponse =
    runBlocking { this@postAuthConnectionsIdRevokePreviousSecret.client.postAuthConnectionsIdRevokePreviousSecret(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnectionsIdRotateSecret]: Rotate an auth connection secret. POST /v1/auth/connections/{id}/rotate-secret */
fun ReferalliBlockingClient.postAuthConnectionsIdRotateSecret(id: String, idempotencyKey: String? = null): PostAuthConnectionsIdRotateSecretResponse =
    runBlocking { this@postAuthConnectionsIdRotateSecret.client.postAuthConnectionsIdRotateSecret(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnectionsIdSignals]: Report a user signal (signed protocol). POST /v1/auth/connections/{id}/signals */
fun ReferalliBlockingClient.postAuthConnectionsIdSignals(id: String, body: PostAuthConnectionsIdSignalsBody, idempotencyKey: String? = null): PostAuthConnectionsIdSignalsResponse =
    runBlocking { this@postAuthConnectionsIdSignals.client.postAuthConnectionsIdSignals(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnectionsIdSignups]: Attribute a new user (signed protocol). POST /v1/auth/connections/{id}/signups */
fun ReferalliBlockingClient.postAuthConnectionsIdSignups(id: String, body: PostAuthConnectionsIdSignupsBody, idempotencyKey: String? = null): PostAuthConnectionsIdSignupsResponse =
    runBlocking { this@postAuthConnectionsIdSignups.client.postAuthConnectionsIdSignups(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthConnectionsIdUsers]: Update a user (signed protocol). POST /v1/auth/connections/{id}/users */
fun ReferalliBlockingClient.postAuthConnectionsIdUsers(id: String, body: PostAuthConnectionsIdUsersBody, idempotencyKey: String? = null): PostAuthConnectionsIdUsersResponse =
    runBlocking { this@postAuthConnectionsIdUsers.client.postAuthConnectionsIdUsers(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postAuthLogout]: Sign out. POST /v1/auth/logout */
fun ReferalliBlockingClient.postAuthLogout(idempotencyKey: String? = null): PostAuthLogoutResponse =
    runBlocking { this@postAuthLogout.client.postAuthLogout(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBillingActivate]: Activate a plan directly. POST /v1/billing/activate */
fun ReferalliBlockingClient.postBillingActivate(body: PostBillingActivateBody, idempotencyKey: String? = null): PostBillingActivateResponse =
    runBlocking { this@postBillingActivate.client.postBillingActivate(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBillingCheckout]: Start a plan checkout. POST /v1/billing/checkout */
fun ReferalliBlockingClient.postBillingCheckout(body: PostBillingCheckoutBody, idempotencyKey: String? = null): PostBillingCheckoutResponse =
    runBlocking { this@postBillingCheckout.client.postBillingCheckout(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBillingConnections]: Create a billing connection. POST /v1/billing/connections */
fun ReferalliBlockingClient.postBillingConnections(body: PostBillingConnectionsBody, idempotencyKey: String? = null): CreatedBillingConnection =
    runBlocking { this@postBillingConnections.client.postBillingConnections(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBillingConnectionsIdRotateSecret]: Rotate the webhook signing secret. POST /v1/billing/connections/{id}/rotate-secret */
fun ReferalliBlockingClient.postBillingConnectionsIdRotateSecret(id: String, idempotencyKey: String? = null): PostBillingConnectionsIdRotateSecretResponse =
    runBlocking { this@postBillingConnectionsIdRotateSecret.client.postBillingConnectionsIdRotateSecret(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBillingConnectionsIdValueMappingPreview]: Preview the value mapping. POST /v1/billing/connections/{id}/value-mapping/preview */
fun ReferalliBlockingClient.postBillingConnectionsIdValueMappingPreview(id: String, body: PostBillingConnectionsIdValueMappingPreviewBody, idempotencyKey: String? = null): ValueMappingPreview =
    runBlocking { this@postBillingConnectionsIdValueMappingPreview.client.postBillingConnectionsIdValueMappingPreview(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBillingPortal]: Open the subscription portal. POST /v1/billing/portal */
fun ReferalliBlockingClient.postBillingPortal(idempotencyKey: String? = null): PostBillingPortalResponse =
    runBlocking { this@postBillingPortal.client.postBillingPortal(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBrandingDomain]: Set a custom portal domain. POST /v1/branding/domain */
fun ReferalliBlockingClient.postBrandingDomain(body: PostBrandingDomainBody, idempotencyKey: String? = null): PostBrandingDomainResponse =
    runBlocking { this@postBrandingDomain.client.postBrandingDomain(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBrandingDomainVerify]: Verify the portal domain. POST /v1/branding/domain/verify */
fun ReferalliBlockingClient.postBrandingDomainVerify(idempotencyKey: String? = null): PostBrandingLinkDomainVerifyResponse =
    runBlocking { this@postBrandingDomainVerify.client.postBrandingDomainVerify(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBrandingLinkDomain]: Set a custom link domain. POST /v1/branding/link-domain */
fun ReferalliBlockingClient.postBrandingLinkDomain(body: PostBrandingLinkDomainBody, idempotencyKey: String? = null): PostBrandingLinkDomainResponse =
    runBlocking { this@postBrandingLinkDomain.client.postBrandingLinkDomain(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postBrandingLinkDomainVerify]: Verify the link domain. POST /v1/branding/link-domain/verify */
fun ReferalliBlockingClient.postBrandingLinkDomainVerify(idempotencyKey: String? = null): PostBrandingLinkDomainVerifyResponse =
    runBlocking { this@postBrandingLinkDomainVerify.client.postBrandingLinkDomainVerify(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCliDeviceCodes]: Start a CLI sign-in. POST /v1/cli/device-codes */
fun ReferalliBlockingClient.postCliDeviceCodes(body: PostCliDeviceCodesBody, idempotencyKey: String? = null): PostCliDeviceCodesResponse =
    runBlocking { this@postCliDeviceCodes.client.postCliDeviceCodes(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCliDeviceCodesToken]: Poll a CLI sign-in. POST /v1/cli/device-codes/token */
fun ReferalliBlockingClient.postCliDeviceCodesToken(body: PostCliDeviceCodesTokenBody, idempotencyKey: String? = null): PostCliDeviceCodesTokenResponse =
    runBlocking { this@postCliDeviceCodesToken.client.postCliDeviceCodesToken(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCliDeviceCodesUserCodeApprove]: Approve a CLI sign-in. POST /v1/cli/device-codes/{userCode}/approve */
fun ReferalliBlockingClient.postCliDeviceCodesUserCodeApprove(userCode: String, body: PostCliDeviceCodesUserCodeApproveBody, idempotencyKey: String? = null): PostCliDeviceCodesUserCodeApproveResponse =
    runBlocking { this@postCliDeviceCodesUserCodeApprove.client.postCliDeviceCodesUserCodeApprove(userCode = userCode, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCliDeviceCodesUserCodeDeny]: Deny a CLI sign-in. POST /v1/cli/device-codes/{userCode}/deny */
fun ReferalliBlockingClient.postCliDeviceCodesUserCodeDeny(userCode: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@postCliDeviceCodesUserCodeDeny.client.postCliDeviceCodesUserCodeDeny(userCode = userCode, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCliListeners]: Open a CLI event listener. POST /v1/cli/listeners */
fun ReferalliBlockingClient.postCliListeners(body: PostCliListenersBody, idempotencyKey: String? = null): PostCliListenersResponse =
    runBlocking { this@postCliListeners.client.postCliListeners(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCliTrigger]: Send a test event. POST /v1/cli/trigger */
fun ReferalliBlockingClient.postCliTrigger(body: PostCliTriggerBody, idempotencyKey: String? = null): PostCliTriggerResponse =
    runBlocking { this@postCliTrigger.client.postCliTrigger(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCommissionRules]: Publish a commission rule. POST /v1/commission-rules */
fun ReferalliBlockingClient.postCommissionRules(body: PostCommissionRulesBody, idempotencyKey: String? = null): PostCommissionRulesResponse =
    runBlocking { this@postCommissionRules.client.postCommissionRules(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCommissionsApproveDue]: Approve due commissions. POST /v1/commissions/approve-due */
fun ReferalliBlockingClient.postCommissionsApproveDue(idempotencyKey: String? = null): PostCommissionsApproveDueResponse =
    runBlocking { this@postCommissionsApproveDue.client.postCommissionsApproveDue(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCommissionsIdAdjust]: Adjust a commission. POST /v1/commissions/{id}/adjust */
fun ReferalliBlockingClient.postCommissionsIdAdjust(id: String, body: PostCommissionsIdAdjustBody, idempotencyKey: String? = null): PostCommissionsIdAdjustResponse =
    runBlocking { this@postCommissionsIdAdjust.client.postCommissionsIdAdjust(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCommissionsIdSettle]: Settle a commission yourself. POST /v1/commissions/{id}/settle */
fun ReferalliBlockingClient.postCommissionsIdSettle(id: String, body: PostCommissionsIdSettleBody, idempotencyKey: String? = null): Settlement =
    runBlocking { this@postCommissionsIdSettle.client.postCommissionsIdSettle(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postContracts]: Create a partner contract. POST /v1/contracts */
fun ReferalliBlockingClient.postContracts(body: PostContractsBody, idempotencyKey: String? = null): PostContractsResponse =
    runBlocking { this@postContracts.client.postContracts(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postContractsIdSend]: Send a contract. POST /v1/contracts/{id}/send */
fun ReferalliBlockingClient.postContractsIdSend(id: String, idempotencyKey: String? = null): OkStatus =
    runBlocking { this@postContractsIdSend.client.postContractsIdSend(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCoupons]: Create a coupon code. POST /v1/coupons */
fun ReferalliBlockingClient.postCoupons(body: PostCouponsBody, idempotencyKey: String? = null): PostCouponsResponse =
    runBlocking { this@postCoupons.client.postCoupons(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postCreatorsAccountIdInvite]: Invite a creator. POST /v1/creators/{accountId}/invite */
fun ReferalliBlockingClient.postCreatorsAccountIdInvite(accountId: String, body: PostCreatorsAccountIdInviteBody, idempotencyKey: String? = null): PostCreatorsAccountIdInviteResponse =
    runBlocking { this@postCreatorsAccountIdInvite.client.postCreatorsAccountIdInvite(accountId = accountId, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postDealsIdApprove]: Approve a deal. POST /v1/deals/{id}/approve */
fun ReferalliBlockingClient.postDealsIdApprove(id: String, body: PostDealsIdApproveBody, idempotencyKey: String? = null): PostDealsIdApproveResponse =
    runBlocking { this@postDealsIdApprove.client.postDealsIdApprove(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postDealsIdReject]: Reject a deal. POST /v1/deals/{id}/reject */
fun ReferalliBlockingClient.postDealsIdReject(id: String, idempotencyKey: String? = null): PostDealsIdRejectResponse =
    runBlocking { this@postDealsIdReject.client.postDealsIdReject(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postDealsIdWon]: Mark a deal won. POST /v1/deals/{id}/won */
fun ReferalliBlockingClient.postDealsIdWon(id: String, body: PostDealsIdWonBody, idempotencyKey: String? = null): PostDealsIdWonResponse =
    runBlocking { this@postDealsIdWon.client.postDealsIdWon(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postDiscoveryCorpus]: Ingest prospects. POST /v1/discovery/corpus */
fun ReferalliBlockingClient.postDiscoveryCorpus(body: PostDiscoveryCorpusBody, idempotencyKey: String? = null): PostDiscoveryCorpusResponse =
    runBlocking { this@postDiscoveryCorpus.client.postDiscoveryCorpus(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postDiscoverySearch]: Search for prospective partners. POST /v1/discovery/search */
fun ReferalliBlockingClient.postDiscoverySearch(body: PostDiscoverySearchBody, idempotencyKey: String? = null): PostDiscoverySearchResponse =
    runBlocking { this@postDiscoverySearch.client.postDiscoverySearch(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postDisputesIdResolve]: Resolve a dispute. POST /v1/disputes/{id}/resolve */
fun ReferalliBlockingClient.postDisputesIdResolve(id: String, body: PostDisputesIdResolveBody, idempotencyKey: String? = null): Ok =
    runBlocking { this@postDisputesIdResolve.client.postDisputesIdResolve(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postEmailPreview]: Preview an email. POST /v1/email/preview */
fun ReferalliBlockingClient.postEmailPreview(body: PostEmailPreviewBody, idempotencyKey: String? = null): EmailRendered =
    runBlocking { this@postEmailPreview.client.postEmailPreview(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postEmailSettingsVerifyDomain]: Check the sending domain. POST /v1/email/settings/verify-domain */
fun ReferalliBlockingClient.postEmailSettingsVerifyDomain(idempotencyKey: String? = null): PostEmailSettingsVerifyDomainResponse =
    runBlocking { this@postEmailSettingsVerifyDomain.client.postEmailSettingsVerifyDomain(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postEmailTest]: Send a test email. POST /v1/email/test */
fun ReferalliBlockingClient.postEmailTest(body: PostEmailTestBody, idempotencyKey: String? = null): PostEmailTestResponse =
    runBlocking { this@postEmailTest.client.postEmailTest(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postEmbedTokens]: Mint a partner embed token. POST /v1/embed/tokens */
fun ReferalliBlockingClient.postEmbedTokens(body: PostEmbedTokensBody, idempotencyKey: String? = null): PostEmbedTokensResponse =
    runBlocking { this@postEmbedTokens.client.postEmbedTokens(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postFraudCasesIdResolve]: Resolve a fraud case. POST /v1/fraud/cases/{id}/resolve */
fun ReferalliBlockingClient.postFraudCasesIdResolve(id: String, body: PostFraudCasesIdResolveBody, idempotencyKey: String? = null): Ok =
    runBlocking { this@postFraudCasesIdResolve.client.postFraudCasesIdResolve(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postFraudDetectRings]: Detect referral rings. POST /v1/fraud/detect-rings */
fun ReferalliBlockingClient.postFraudDetectRings(idempotencyKey: String? = null): PostFraudDetectRingsResponse =
    runBlocking { this@postFraudDetectRings.client.postFraudDetectRings(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postFraudInvalidTrafficScan]: Scan for invalid traffic. POST /v1/fraud/invalid-traffic/scan */
fun ReferalliBlockingClient.postFraudInvalidTrafficScan(body: PostFraudInvalidTrafficScanBody, idempotencyKey: String? = null): PostFraudInvalidTrafficScanResponse =
    runBlocking { this@postFraudInvalidTrafficScan.client.postFraudInvalidTrafficScan(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postFxRates]: Record an FX rate. POST /v1/fx-rates */
fun ReferalliBlockingClient.postFxRates(body: PostFxRatesBody, idempotencyKey: String? = null): FxRate =
    runBlocking { this@postFxRates.client.postFxRates(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postFxRatesClearOverride]: Clear a manual FX rate. POST /v1/fx-rates/clear-override */
fun ReferalliBlockingClient.postFxRatesClearOverride(body: PostFxRatesClearOverrideBody, idempotencyKey: String? = null): PostFxRatesClearOverrideResponse =
    runBlocking { this@postFxRatesClearOverride.client.postFxRatesClearOverride(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postFxRatesSync]: Sync the FX feed now. POST /v1/fx-rates/sync */
fun ReferalliBlockingClient.postFxRatesSync(idempotencyKey: String? = null): PostFxRatesSyncResponse =
    runBlocking { this@postFxRatesSync.client.postFxRatesSync(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postGraphql]: Query the GraphQL read layer (POST). POST /v1/graphql */
fun ReferalliBlockingClient.postGraphql(body: PostGraphqlBody, idempotencyKey: String? = null): PostGraphqlResponse =
    runBlocking { this@postGraphql.client.postGraphql(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postImportProvider]: Import partners from another tool. POST /v1/import/{provider} */
fun ReferalliBlockingClient.postImportProvider(provider: String, body: PostImportProviderBody, programId: String, dryRun: Boolean? = null, destinationUrl: String? = null, idempotencyKey: String? = null): PostImportProviderResponse =
    runBlocking { this@postImportProvider.client.postImportProvider(provider = provider, body = body, programId = programId, dryRun = dryRun, destinationUrl = destinationUrl, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postIntegrationsDeliveriesIdRetry]: Retry an integration delivery. POST /v1/integrations/deliveries/{id}/retry */
fun ReferalliBlockingClient.postIntegrationsDeliveriesIdRetry(id: String, idempotencyKey: String? = null): IntegrationDelivery =
    runBlocking { this@postIntegrationsDeliveriesIdRetry.client.postIntegrationsDeliveriesIdRetry(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postIntegrationsHubspotTest]: Test the HubSpot connection. POST /v1/integrations/hubspot/test */
fun ReferalliBlockingClient.postIntegrationsHubspotTest(body: PostIntegrationsHubspotTestBody, idempotencyKey: String? = null): PostIntegrationsHubspotTestResponse =
    runBlocking { this@postIntegrationsHubspotTest.client.postIntegrationsHubspotTest(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postIntegrationsSegmentTest]: Test the Segment connection. POST /v1/integrations/segment/test */
fun ReferalliBlockingClient.postIntegrationsSegmentTest(idempotencyKey: String? = null): PostIntegrationsSegmentTestResponse =
    runBlocking { this@postIntegrationsSegmentTest.client.postIntegrationsSegmentTest(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postInvitationsIdWithdraw]: Withdraw an invitation. POST /v1/invitations/{id}/withdraw */
fun ReferalliBlockingClient.postInvitationsIdWithdraw(id: String, idempotencyKey: String? = null): OkStatus =
    runBlocking { this@postInvitationsIdWithdraw.client.postInvitationsIdWithdraw(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postLinks]: Create a tracked link. POST /v1/links */
fun ReferalliBlockingClient.postLinks(body: PostLinksBody, idempotencyKey: String? = null): CreatedLink =
    runBlocking { this@postLinks.client.postLinks(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postMobilePurchases]: Report an in-app purchase. POST /v1/mobile/purchases */
fun ReferalliBlockingClient.postMobilePurchases(body: PostMobilePurchasesBody, idempotencyKey: String? = null): PostMobilePurchasesResponse =
    runBlocking { this@postMobilePurchases.client.postMobilePurchases(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postNotificationsIdRead]: Mark a notification read. POST /v1/notifications/{id}/read */
fun ReferalliBlockingClient.postNotificationsIdRead(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@postNotificationsIdRead.client.postNotificationsIdRead(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOnchainConnections]: Create an on-chain connection. POST /v1/onchain/connections */
fun ReferalliBlockingClient.postOnchainConnections(body: PostOnchainConnectionsBody, idempotencyKey: String? = null): PostOnchainConnectionsResponse =
    runBlocking { this@postOnchainConnections.client.postOnchainConnections(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOrgMembers]: Add a team member. POST /v1/org/members */
fun ReferalliBlockingClient.postOrgMembers(body: PostOrgMembersBody, idempotencyKey: String? = null): PostOrgMembersResponse =
    runBlocking { this@postOrgMembers.client.postOrgMembers(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOrgs]: Create an organization. POST /v1/orgs */
fun ReferalliBlockingClient.postOrgs(body: PostOrgsBody, idempotencyKey: String? = null): PostOrgsResponse =
    runBlocking { this@postOrgs.client.postOrgs(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOrgSsoLink]: Link the org to SSO. POST /v1/org/sso/link */
fun ReferalliBlockingClient.postOrgSsoLink(idempotencyKey: String? = null): PostOrgSsoLinkResponse =
    runBlocking { this@postOrgSsoLink.client.postOrgSsoLink(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOrgSsoTickets]: Create an SSO setup link. POST /v1/org/sso/tickets */
fun ReferalliBlockingClient.postOrgSsoTickets(body: PostOrgSsoTicketsBody, idempotencyKey: String? = null): PostOrgSsoTicketsResponse =
    runBlocking { this@postOrgSsoTickets.client.postOrgSsoTickets(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOrgSsoTicketsIdRevoke]: Revoke an SSO setup link. POST /v1/org/sso/tickets/{id}/revoke */
fun ReferalliBlockingClient.postOrgSsoTicketsIdRevoke(id: String, idempotencyKey: String? = null): PostOrgSsoTicketsIdRevokeResponse =
    runBlocking { this@postOrgSsoTicketsIdRevoke.client.postOrgSsoTicketsIdRevoke(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOutreachDraft]: Draft an outreach sequence. POST /v1/outreach/draft */
fun ReferalliBlockingClient.postOutreachDraft(body: PostOutreachDraftBody, idempotencyKey: String? = null): PostOutreachDraftResponse =
    runBlocking { this@postOutreachDraft.client.postOutreachDraft(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOutreachIdApprove]: Approve an outreach message. POST /v1/outreach/{id}/approve */
fun ReferalliBlockingClient.postOutreachIdApprove(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@postOutreachIdApprove.client.postOutreachIdApprove(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postOutreachSendDue]: Send due outreach. POST /v1/outreach/send-due */
fun ReferalliBlockingClient.postOutreachSendDue(idempotencyKey: String? = null): PostOutreachSendDueResponse =
    runBlocking { this@postOutreachSendDue.client.postOutreachSendDue(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerAdvanceAccept]: Take a commission advance. POST /v1/partner/advance/accept */
fun ReferalliBlockingClient.postPartnerAdvanceAccept(body: PostPartnerAdvanceAcceptBody, idempotencyKey: String? = null): PostPartnerAdvanceAcceptResponse =
    runBlocking { this@postPartnerAdvanceAccept.client.postPartnerAdvanceAccept(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerAuthWalletNonce]: Get a wallet sign-in nonce. POST /v1/partner/auth/wallet/nonce */
fun ReferalliBlockingClient.postPartnerAuthWalletNonce(body: PostPartnerAuthWalletNonceBody, idempotencyKey: String? = null): PostPartnerAuthWalletNonceResponse =
    runBlocking { this@postPartnerAuthWalletNonce.client.postPartnerAuthWalletNonce(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerAuthWalletVerify]: Sign in with a wallet. POST /v1/partner/auth/wallet/verify */
fun ReferalliBlockingClient.postPartnerAuthWalletVerify(body: PostPartnerAuthWalletVerifyBody, idempotencyKey: String? = null): PostPartnerAuthWalletVerifyResponse =
    runBlocking { this@postPartnerAuthWalletVerify.client.postPartnerAuthWalletVerify(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerContractsIdAccept]: Accept a contract. POST /v1/partner/contracts/{id}/accept */
fun ReferalliBlockingClient.postPartnerContractsIdAccept(id: String, idempotencyKey: String? = null): OkStatus =
    runBlocking { this@postPartnerContractsIdAccept.client.postPartnerContractsIdAccept(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerContractsIdDecline]: Decline a contract. POST /v1/partner/contracts/{id}/decline */
fun ReferalliBlockingClient.postPartnerContractsIdDecline(id: String, idempotencyKey: String? = null): OkStatus =
    runBlocking { this@postPartnerContractsIdDecline.client.postPartnerContractsIdDecline(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerDeals]: Register a deal. POST /v1/partner/deals */
fun ReferalliBlockingClient.postPartnerDeals(body: PostPartnerDealsBody, idempotencyKey: String? = null): PostPartnerDealsResponse =
    runBlocking { this@postPartnerDeals.client.postPartnerDeals(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerDisputes]: File a dispute. POST /v1/partner/disputes */
fun ReferalliBlockingClient.postPartnerDisputes(body: PostPartnerDisputesBody, idempotencyKey: String? = null): PostPartnerDisputesResponse =
    runBlocking { this@postPartnerDisputes.client.postPartnerDisputes(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerInvitationsIdAccept]: Accept an invitation. POST /v1/partner/invitations/{id}/accept */
fun ReferalliBlockingClient.postPartnerInvitationsIdAccept(id: String, idempotencyKey: String? = null): OkStatus =
    runBlocking { this@postPartnerInvitationsIdAccept.client.postPartnerInvitationsIdAccept(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerInvitationsIdDecline]: Decline an invitation. POST /v1/partner/invitations/{id}/decline */
fun ReferalliBlockingClient.postPartnerInvitationsIdDecline(id: String, idempotencyKey: String? = null): OkStatus =
    runBlocking { this@postPartnerInvitationsIdDecline.client.postPartnerInvitationsIdDecline(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerKycSubmit]: Submit identity verification. POST /v1/partner/kyc/submit */
fun ReferalliBlockingClient.postPartnerKycSubmit(body: PostPartnerKycSubmitBody, idempotencyKey: String? = null): PostPartnerKycSubmitResponse =
    runBlocking { this@postPartnerKycSubmit.client.postPartnerKycSubmit(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerLinks]: Create a link. POST /v1/partner/links */
fun ReferalliBlockingClient.postPartnerLinks(body: PostPartnerLinksBody, idempotencyKey: String? = null): CreatedLink =
    runBlocking { this@postPartnerLinks.client.postPartnerLinks(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerNotificationsIdRead]: Mark my notification read. POST /v1/partner/notifications/{id}/read */
fun ReferalliBlockingClient.postPartnerNotificationsIdRead(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@postPartnerNotificationsIdRead.client.postPartnerNotificationsIdRead(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerOrgsOrgIdSelfBilling]: Accept self-billing. POST /v1/partner/orgs/{orgId}/self-billing */
fun ReferalliBlockingClient.postPartnerOrgsOrgIdSelfBilling(orgId: String, body: PostPartnerOrgsOrgIdSelfBillingBody, idempotencyKey: String? = null): PostPartnerOrgsOrgIdSelfBillingResponse =
    runBlocking { this@postPartnerOrgsOrgIdSelfBilling.client.postPartnerOrgsOrgIdSelfBilling(orgId = orgId, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerOrgsOrgIdTaxForm]: Submit my tax form. POST /v1/partner/orgs/{orgId}/tax-form */
fun ReferalliBlockingClient.postPartnerOrgsOrgIdTaxForm(orgId: String, body: PostPartnerOrgsOrgIdTaxFormBody, idempotencyKey: String? = null): Ok =
    runBlocking { this@postPartnerOrgsOrgIdTaxForm.client.postPartnerOrgsOrgIdTaxForm(orgId = orgId, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerProgramsProgramIdApply]: Apply to a program. POST /v1/partner/programs/{programId}/apply */
fun ReferalliBlockingClient.postPartnerProgramsProgramIdApply(programId: String, idempotencyKey: String? = null): PostPartnerProgramsProgramIdApplyResponse =
    runBlocking { this@postPartnerProgramsProgramIdApply.client.postPartnerProgramsProgramIdApply(programId = programId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartners]: Create a partner. POST /v1/partners */
fun ReferalliBlockingClient.postPartners(body: PostPartnersBody, idempotencyKey: String? = null): Partner =
    runBlocking { this@postPartners.client.postPartners(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerSecurityTotpDisable]: Turn off two-factor. POST /v1/partner/security/totp/disable */
fun ReferalliBlockingClient.postPartnerSecurityTotpDisable(body: PostPartnerSecurityTotpDisableBody, idempotencyKey: String? = null): PostPartnerSecurityTotpDisableResponse =
    runBlocking { this@postPartnerSecurityTotpDisable.client.postPartnerSecurityTotpDisable(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerSecurityTotpEnable]: Turn on two-factor. POST /v1/partner/security/totp/enable */
fun ReferalliBlockingClient.postPartnerSecurityTotpEnable(body: PostPartnerSecurityTotpEnableBody, idempotencyKey: String? = null): PostPartnerSecurityTotpEnableResponse =
    runBlocking { this@postPartnerSecurityTotpEnable.client.postPartnerSecurityTotpEnable(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerSecurityTotpSetup]: Start two-factor setup. POST /v1/partner/security/totp/setup */
fun ReferalliBlockingClient.postPartnerSecurityTotpSetup(idempotencyKey: String? = null): PostPartnerSecurityTotpSetupResponse =
    runBlocking { this@postPartnerSecurityTotpSetup.client.postPartnerSecurityTotpSetup(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnersIdTaxForm]: Record a partner's tax form. POST /v1/partners/{id}/tax-form */
fun ReferalliBlockingClient.postPartnersIdTaxForm(id: String, body: PostPartnersIdTaxFormBody, idempotencyKey: String? = null): Ok =
    runBlocking { this@postPartnersIdTaxForm.client.postPartnersIdTaxForm(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPartnerTermsVersionIdAccept]: Accept program terms. POST /v1/partner/terms/{versionId}/accept */
fun ReferalliBlockingClient.postPartnerTermsVersionIdAccept(versionId: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@postPartnerTermsVersionIdAccept.client.postPartnerTermsVersionIdAccept(versionId = versionId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPassportVerify]: Verify a partner passport. POST /v1/passport/verify */
fun ReferalliBlockingClient.postPassportVerify(body: PostPassportVerifyBody, idempotencyKey: String? = null): PostPassportVerifyResponse =
    runBlocking { this@postPassportVerify.client.postPassportVerify(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPayoutRuns]: Create a payout run. POST /v1/payout-runs */
fun ReferalliBlockingClient.postPayoutRuns(idempotencyKey: String? = null): PayoutRunCreated =
    runBlocking { this@postPayoutRuns.client.postPayoutRuns(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPayoutRunsIdCancel]: Cancel a payout run. POST /v1/payout-runs/{id}/cancel */
fun ReferalliBlockingClient.postPayoutRunsIdCancel(id: String, idempotencyKey: String? = null): PostPayoutRunsIdCancelResponse =
    runBlocking { this@postPayoutRunsIdCancel.client.postPayoutRunsIdCancel(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPayoutRunsIdExecute]: Execute a payout run. POST /v1/payout-runs/{id}/execute */
fun ReferalliBlockingClient.postPayoutRunsIdExecute(id: String, idempotencyKey: String? = null): PostPayoutRunsIdExecuteResponse =
    runBlocking { this@postPayoutRunsIdExecute.client.postPayoutRunsIdExecute(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPayoutRunsRunScheduled]: Run due payout schedules. POST /v1/payout-runs/run-scheduled */
fun ReferalliBlockingClient.postPayoutRunsRunScheduled(idempotencyKey: String? = null): PostPayoutRunsRunScheduledResponse =
    runBlocking { this@postPayoutRunsRunScheduled.client.postPayoutRunsRunScheduled(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPrivacyForget]: Erase a data subject. POST /v1/privacy/forget */
fun ReferalliBlockingClient.postPrivacyForget(body: PostPrivacyForgetBody, idempotencyKey: String? = null): PostPrivacyForgetResponse =
    runBlocking { this@postPrivacyForget.client.postPrivacyForget(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPrivacyLookup]: Find a data subject by email. POST /v1/privacy/lookup */
fun ReferalliBlockingClient.postPrivacyLookup(body: PostPrivacyLookupBody, idempotencyKey: String? = null): PostPrivacyLookupResponse =
    runBlocking { this@postPrivacyLookup.client.postPrivacyLookup(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPrivacyRequests]: Open a data-subject request. POST /v1/privacy/requests */
fun ReferalliBlockingClient.postPrivacyRequests(body: PostPrivacyRequestsBody, idempotencyKey: String? = null): PostPrivacyRequestsResponse =
    runBlocking { this@postPrivacyRequests.client.postPrivacyRequests(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postProfitabilityRebuild]: Rebuild ROI figures. POST /v1/profitability/rebuild */
fun ReferalliBlockingClient.postProfitabilityRebuild(idempotencyKey: String? = null): PostProfitabilityRebuildResponse =
    runBlocking { this@postProfitabilityRebuild.client.postProfitabilityRebuild(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPrograms]: Create a program. POST /v1/programs */
fun ReferalliBlockingClient.postPrograms(body: PostProgramsBody, idempotencyKey: String? = null): Program =
    runBlocking { this@postPrograms.client.postPrograms(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postProgramsIdApplyLeveling]: Apply partner levels. POST /v1/programs/{id}/apply-leveling */
fun ReferalliBlockingClient.postProgramsIdApplyLeveling(id: String, idempotencyKey: String? = null): PostProgramsIdApplyLevelingResponse =
    runBlocking { this@postProgramsIdApplyLeveling.client.postProgramsIdApplyLeveling(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postProgramsIdAutopriceRun]: Run autopricing. POST /v1/programs/{id}/autoprice/run */
fun ReferalliBlockingClient.postProgramsIdAutopriceRun(id: String, body: PostProgramsIdAutopriceRunBody, idempotencyKey: String? = null): PostProgramsIdAutopriceRunResponse =
    runBlocking { this@postProgramsIdAutopriceRun.client.postProgramsIdAutopriceRun(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postProgramsIdEnrollments]: Enroll a partner. POST /v1/programs/{id}/enrollments */
fun ReferalliBlockingClient.postProgramsIdEnrollments(id: String, body: PostProgramsIdEnrollmentsBody, idempotencyKey: String? = null): Enrollment =
    runBlocking { this@postProgramsIdEnrollments.client.postProgramsIdEnrollments(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postProgramsIdEnrollmentsEnrollmentIdApprove]: Approve an application. POST /v1/programs/{id}/enrollments/{enrollmentId}/approve */
fun ReferalliBlockingClient.postProgramsIdEnrollmentsEnrollmentIdApprove(id: String, enrollmentId: String, idempotencyKey: String? = null): PostProgramsIdEnrollmentsEnrollmentIdApproveResponse =
    runBlocking { this@postProgramsIdEnrollmentsEnrollmentIdApprove.client.postProgramsIdEnrollmentsEnrollmentIdApprove(id = id, enrollmentId = enrollmentId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postProgramsIdEnrollmentsEnrollmentIdReject]: Reject an application. POST /v1/programs/{id}/enrollments/{enrollmentId}/reject */
fun ReferalliBlockingClient.postProgramsIdEnrollmentsEnrollmentIdReject(id: String, enrollmentId: String, idempotencyKey: String? = null): PostProgramsIdEnrollmentsEnrollmentIdRejectResponse =
    runBlocking { this@postProgramsIdEnrollmentsEnrollmentIdReject.client.postProgramsIdEnrollmentsEnrollmentIdReject(id = id, enrollmentId = enrollmentId, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postProgramsIdGroups]: Create a partner group. POST /v1/programs/{id}/groups */
fun ReferalliBlockingClient.postProgramsIdGroups(id: String, body: PostProgramsIdGroupsBody, idempotencyKey: String? = null): PartnerGroup =
    runBlocking { this@postProgramsIdGroups.client.postProgramsIdGroups(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postProgramsIdPromotions]: Create a promotion. POST /v1/programs/{id}/promotions */
fun ReferalliBlockingClient.postProgramsIdPromotions(id: String, body: PostProgramsIdPromotionsBody, idempotencyKey: String? = null): Promotion =
    runBlocking { this@postProgramsIdPromotions.client.postProgramsIdPromotions(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPromotionsIdEnd]: End a promotion. POST /v1/promotions/{id}/end */
fun ReferalliBlockingClient.postPromotionsIdEnd(id: String, idempotencyKey: String? = null): Promotion =
    runBlocking { this@postPromotionsIdEnd.client.postPromotionsIdEnd(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postPublicProgramsHandleJoin]: Join a program. POST /v1/public/programs/{handle}/join */
fun ReferalliBlockingClient.postPublicProgramsHandleJoin(handle: String, body: PostPublicProgramsHandleJoinBody, idempotencyKey: String? = null): PostPublicProgramsHandleJoinResponse =
    runBlocking { this@postPublicProgramsHandleJoin.client.postPublicProgramsHandleJoin(handle = handle, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postQualityRecompute]: Recompute quality scores. POST /v1/quality/recompute */
fun ReferalliBlockingClient.postQualityRecompute(idempotencyKey: String? = null): PostQualityRecomputeResponse =
    runBlocking { this@postQualityRecompute.client.postQualityRecompute(idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postReferralsAssociate]: Attribute a new customer. POST /v1/referrals/associate */
fun ReferalliBlockingClient.postReferralsAssociate(body: PostReferralsAssociateBody, idempotencyKey: String? = null): AssociateResponse =
    runBlocking { this@postReferralsAssociate.client.postReferralsAssociate(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postReferralsIdApprove]: Approve a held referral. POST /v1/referrals/{id}/approve */
fun ReferalliBlockingClient.postReferralsIdApprove(id: String, idempotencyKey: String? = null): Referral =
    runBlocking { this@postReferralsIdApprove.client.postReferralsIdApprove(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postReferralsIdReassign]: Reassign a referral. POST /v1/referrals/{id}/reassign */
fun ReferalliBlockingClient.postReferralsIdReassign(id: String, body: PostReferralsIdReassignBody, idempotencyKey: String? = null): Referral =
    runBlocking { this@postReferralsIdReassign.client.postReferralsIdReassign(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postReferralsIdVoid]: Void a referral. POST /v1/referrals/{id}/void */
fun ReferalliBlockingClient.postReferralsIdVoid(id: String, idempotencyKey: String? = null): Referral =
    runBlocking { this@postReferralsIdVoid.client.postReferralsIdVoid(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postRewardsIdRedeem]: Redeem a reward. POST /v1/rewards/{id}/redeem */
fun ReferalliBlockingClient.postRewardsIdRedeem(id: String, body: PostRewardsIdRedeemBody, idempotencyKey: String? = null): PostRewardsRedeemByCodeResponse =
    runBlocking { this@postRewardsIdRedeem.client.postRewardsIdRedeem(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postRewardsRedeemByCode]: Redeem a reward by code. POST /v1/rewards/redeem-by-code */
fun ReferalliBlockingClient.postRewardsRedeemByCode(body: PostRewardsRedeemByCodeBody, idempotencyKey: String? = null): PostRewardsRedeemByCodeResponse =
    runBlocking { this@postRewardsRedeemByCode.client.postRewardsRedeemByCode(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postRoiPatternsPatternReview]: Open a review for a pattern match. POST /v1/roi/patterns/{pattern}/review */
fun ReferalliBlockingClient.postRoiPatternsPatternReview(pattern: String, body: PostRoiPatternsPatternReviewBody, idempotencyKey: String? = null): FraudCase =
    runBlocking { this@postRoiPatternsPatternReview.client.postRoiPatternsPatternReview(pattern = pattern, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postSandboxSimulate]: Simulate billing history. POST /v1/sandbox/simulate */
fun ReferalliBlockingClient.postSandboxSimulate(body: PostSandboxSimulateBody, idempotencyKey: String? = null): PostSandboxSimulateResponse =
    runBlocking { this@postSandboxSimulate.client.postSandboxSimulate(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postTax1099DocumentsIdCorrect]: File a corrected 1099. POST /v1/tax/1099/documents/{id}/correct */
fun ReferalliBlockingClient.postTax1099DocumentsIdCorrect(id: String, idempotencyKey: String? = null): TaxFiling =
    runBlocking { this@postTax1099DocumentsIdCorrect.client.postTax1099DocumentsIdCorrect(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postTax1099Filings]: File 1099-NEC forms. POST /v1/tax/1099/filings */
fun ReferalliBlockingClient.postTax1099Filings(body: PostTax1099FilingsBody, idempotencyKey: String? = null): TaxFiling =
    runBlocking { this@postTax1099Filings.client.postTax1099Filings(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postTax1099FilingsIdRefresh]: Refresh a filing status. POST /v1/tax/1099/filings/{id}/refresh */
fun ReferalliBlockingClient.postTax1099FilingsIdRefresh(id: String, idempotencyKey: String? = null): PostTax1099FilingsIdRefreshResponse =
    runBlocking { this@postTax1099FilingsIdRefresh.client.postTax1099FilingsIdRefresh(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postTestClockAdvance]: Advance the test clock. POST /v1/test_clock/advance */
fun ReferalliBlockingClient.postTestClockAdvance(body: PostTestClockAdvanceBody, idempotencyKey: String? = null): PostTestClockAdvanceResponse =
    runBlocking { this@postTestClockAdvance.client.postTestClockAdvance(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postTrackEvents]: Track an event. POST /v1/track/events */
fun ReferalliBlockingClient.postTrackEvents(body: JsonValue, idempotencyKey: String? = null): PostTrackEventsResponse =
    runBlocking { this@postTrackEvents.client.postTrackEvents(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postUnsubscribeToken]: Unsubscribe from outreach. POST /v1/unsubscribe/{token} */
fun ReferalliBlockingClient.postUnsubscribeToken(token: String, idempotencyKey: String? = null): PostUnsubscribeTokenResponse =
    runBlocking { this@postUnsubscribeToken.client.postUnsubscribeToken(token = token, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postValueEvents]: Record value events. POST /v1/value/events */
fun ReferalliBlockingClient.postValueEvents(body: PostValueEventsBody, idempotencyKey: String? = null): PostValueEventsResponse =
    runBlocking { this@postValueEvents.client.postValueEvents(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postValueImport]: Import value events from CSV. POST /v1/value/import */
fun ReferalliBlockingClient.postValueImport(body: PostValueImportBody, idempotencyKey: String? = null): PostValueImportResponse =
    runBlocking { this@postValueImport.client.postValueImport(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postWebhookDeliveriesIdReplay]: Replay a webhook delivery. POST /v1/webhook-deliveries/{id}/replay */
fun ReferalliBlockingClient.postWebhookDeliveriesIdReplay(id: String, idempotencyKey: String? = null): Ok =
    runBlocking { this@postWebhookDeliveriesIdReplay.client.postWebhookDeliveriesIdReplay(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postWebhookEndpoints]: Create a webhook endpoint. POST /v1/webhook-endpoints */
fun ReferalliBlockingClient.postWebhookEndpoints(body: PostWebhookEndpointsBody, idempotencyKey: String? = null): PostWebhookEndpointsResponse =
    runBlocking { this@postWebhookEndpoints.client.postWebhookEndpoints(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postWebhookEndpointsIdRotateSecret]: Rotate an endpoint secret. POST /v1/webhook-endpoints/{id}/rotate-secret */
fun ReferalliBlockingClient.postWebhookEndpointsIdRotateSecret(id: String, idempotencyKey: String? = null): PostWebhookEndpointsIdRotateSecretResponse =
    runBlocking { this@postWebhookEndpointsIdRotateSecret.client.postWebhookEndpointsIdRotateSecret(id = id, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postWidgetTokens]: Mint a referral widget token. POST /v1/widget/tokens */
fun ReferalliBlockingClient.postWidgetTokens(body: PostWidgetTokensBody, idempotencyKey: String? = null): PostWidgetTokensResponse =
    runBlocking { this@postWidgetTokens.client.postWidgetTokens(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postZapierConversions]: Record a conversion from Zapier. POST /v1/zapier/conversions */
fun ReferalliBlockingClient.postZapierConversions(body: PostZapierConversionsBody, idempotencyKey: String? = null): PostZapierConversionsResponse =
    runBlocking { this@postZapierConversions.client.postZapierConversions(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.postZapierHooks]: Subscribe a Zapier hook. POST /v1/zapier/hooks */
fun ReferalliBlockingClient.postZapierHooks(body: PostZapierHooksBody, idempotencyKey: String? = null): ZapierHook =
    runBlocking { this@postZapierHooks.client.postZapierHooks(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putBillingConnectionsIdCredentials]: Set provider API credentials. PUT /v1/billing/connections/{id}/credentials */
fun ReferalliBlockingClient.putBillingConnectionsIdCredentials(id: String, body: PutBillingConnectionsIdCredentialsBody, idempotencyKey: String? = null): PutBillingConnectionsIdCredentialsResponse =
    runBlocking { this@putBillingConnectionsIdCredentials.client.putBillingConnectionsIdCredentials(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putBillingConnectionsIdSecret]: Set the webhook signing secret. PUT /v1/billing/connections/{id}/secret */
fun ReferalliBlockingClient.putBillingConnectionsIdSecret(id: String, body: PutBillingConnectionsIdSecretBody, idempotencyKey: String? = null): PutBillingConnectionsIdSecretResponse =
    runBlocking { this@putBillingConnectionsIdSecret.client.putBillingConnectionsIdSecret(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putBillingConnectionsIdValueMapping]: Set the value mapping. PUT /v1/billing/connections/{id}/value-mapping */
fun ReferalliBlockingClient.putBillingConnectionsIdValueMapping(id: String, body: PutBillingConnectionsIdValueMappingBody, idempotencyKey: String? = null): PutBillingConnectionsIdValueMappingResponse =
    runBlocking { this@putBillingConnectionsIdValueMapping.client.putBillingConnectionsIdValueMapping(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putBranding]: Update branding. PUT /v1/branding */
fun ReferalliBlockingClient.putBranding(body: PutBrandingBody, idempotencyKey: String? = null): Ok =
    runBlocking { this@putBranding.client.putBranding(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putEmailSettings]: Update email settings. PUT /v1/email/settings */
fun ReferalliBlockingClient.putEmailSettings(body: PutEmailSettingsBody, idempotencyKey: String? = null): EmailSettings =
    runBlocking { this@putEmailSettings.client.putEmailSettings(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putEmailTemplatesEventLocale]: Override an email template. PUT /v1/email/templates/{event}/{locale} */
fun ReferalliBlockingClient.putEmailTemplatesEventLocale(event: String, locale: String, body: PutEmailTemplatesEventLocaleBody, idempotencyKey: String? = null): PutEmailTemplatesEventLocaleResponse =
    runBlocking { this@putEmailTemplatesEventLocale.client.putEmailTemplatesEventLocale(event = event, locale = locale, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putIntegrationsHubspot]: Connect HubSpot. PUT /v1/integrations/hubspot */
fun ReferalliBlockingClient.putIntegrationsHubspot(body: PutIntegrationsHubspotBody, idempotencyKey: String? = null): IntegrationConnection =
    runBlocking { this@putIntegrationsHubspot.client.putIntegrationsHubspot(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putIntegrationsSegment]: Connect Segment. PUT /v1/integrations/segment */
fun ReferalliBlockingClient.putIntegrationsSegment(body: PutIntegrationsSegmentBody, idempotencyKey: String? = null): IntegrationConnection =
    runBlocking { this@putIntegrationsSegment.client.putIntegrationsSegment(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putMarketplaceListing]: List a program in the marketplace. PUT /v1/marketplace/listing */
fun ReferalliBlockingClient.putMarketplaceListing(body: PutMarketplaceListingBody, idempotencyKey: String? = null): Ok =
    runBlocking { this@putMarketplaceListing.client.putMarketplaceListing(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putMeLocale]: Set my email language. PUT /v1/me/locale */
fun ReferalliBlockingClient.putMeLocale(body: PutMeLocaleBody, idempotencyKey: String? = null): PutMeLocaleResponse =
    runBlocking { this@putMeLocale.client.putMeLocale(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putMeRoiDigest]: Turn my ROI digest on or off. PUT /v1/me/roi-digest */
fun ReferalliBlockingClient.putMeRoiDigest(body: PutMeRoiDigestBody, idempotencyKey: String? = null): PutMeRoiDigestResponse =
    runBlocking { this@putMeRoiDigest.client.putMeRoiDigest(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putNetworkSettings]: Join or leave the attribution network. PUT /v1/network/settings */
fun ReferalliBlockingClient.putNetworkSettings(body: PutNetworkSettingsBody, idempotencyKey: String? = null): PutNetworkSettingsResponse =
    runBlocking { this@putNetworkSettings.client.putNetworkSettings(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putOrgFxFeed]: Turn the FX feed on or off. PUT /v1/org/fx-feed */
fun ReferalliBlockingClient.putOrgFxFeed(body: PutOrgFxFeedBody, idempotencyKey: String? = null): PutOrgFxFeedResponse =
    runBlocking { this@putOrgFxFeed.client.putOrgFxFeed(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putOrgPayoutSchedule]: Set the org payout schedule. PUT /v1/org/payout-schedule */
fun ReferalliBlockingClient.putOrgPayoutSchedule(body: PutOrgPayoutScheduleBody, idempotencyKey: String? = null): PutOrgPayoutScheduleResponse =
    runBlocking { this@putOrgPayoutSchedule.client.putOrgPayoutSchedule(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putOrgReferralParams]: Set referral query parameters. PUT /v1/org/referral-params */
fun ReferalliBlockingClient.putOrgReferralParams(body: PutOrgReferralParamsBody, idempotencyKey: String? = null): GetOrgReferralParamsResponse =
    runBlocking { this@putOrgReferralParams.client.putOrgReferralParams(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putOrgRetention]: Set the data retention policy. PUT /v1/org/retention */
fun ReferalliBlockingClient.putOrgRetention(body: PutOrgRetentionBody, idempotencyKey: String? = null): Retention =
    runBlocking { this@putOrgRetention.client.putOrgRetention(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putOrgTaxFiling]: Connect a 1099 filing provider. PUT /v1/org/tax-filing */
fun ReferalliBlockingClient.putOrgTaxFiling(body: PutOrgTaxFilingBody, idempotencyKey: String? = null): PutOrgTaxFilingResponse =
    runBlocking { this@putOrgTaxFiling.client.putOrgTaxFiling(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putOrgTaxProfile]: Update the tax profile. PUT /v1/org/tax-profile */
fun ReferalliBlockingClient.putOrgTaxProfile(body: PutOrgTaxProfileBody, idempotencyKey: String? = null): TaxProfile =
    runBlocking { this@putOrgTaxProfile.client.putOrgTaxProfile(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putPartnerLocale]: Set my email language (partner). PUT /v1/partner/locale */
fun ReferalliBlockingClient.putPartnerLocale(body: PutPartnerLocaleBody, idempotencyKey: String? = null): PutPartnerLocaleResponse =
    runBlocking { this@putPartnerLocale.client.putPartnerLocale(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putPartnerOrgsOrgIdPayoutProfile]: Set my payout details. PUT /v1/partner/orgs/{orgId}/payout-profile */
fun ReferalliBlockingClient.putPartnerOrgsOrgIdPayoutProfile(orgId: String, body: PutPartnerOrgsOrgIdPayoutProfileBody, idempotencyKey: String? = null): PutPartnerOrgsOrgIdPayoutProfileResponse =
    runBlocking { this@putPartnerOrgsOrgIdPayoutProfile.client.putPartnerOrgsOrgIdPayoutProfile(orgId = orgId, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putPartnerOrgsOrgIdPostback]: Set my conversion postback. PUT /v1/partner/orgs/{orgId}/postback */
fun ReferalliBlockingClient.putPartnerOrgsOrgIdPostback(orgId: String, body: PutPartnerOrgsOrgIdPostbackBody, idempotencyKey: String? = null): PutPartnerOrgsOrgIdPostbackResponse =
    runBlocking { this@putPartnerOrgsOrgIdPostback.client.putPartnerOrgsOrgIdPostback(orgId = orgId, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putPartnerOrgsOrgIdVat]: Set my VAT number. PUT /v1/partner/orgs/{orgId}/vat */
fun ReferalliBlockingClient.putPartnerOrgsOrgIdVat(orgId: String, body: PutPartnerOrgsOrgIdVatBody, idempotencyKey: String? = null): PutPartnersIdVatResponse =
    runBlocking { this@putPartnerOrgsOrgIdVat.client.putPartnerOrgsOrgIdVat(orgId = orgId, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putPartnerProfile]: Update my creator profile. PUT /v1/partner/profile */
fun ReferalliBlockingClient.putPartnerProfile(body: PutPartnerProfileBody, idempotencyKey: String? = null): Ok =
    runBlocking { this@putPartnerProfile.client.putPartnerProfile(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putPartnersIdPayoutProfile]: Set a partner's payout profile. PUT /v1/partners/{id}/payout-profile */
fun ReferalliBlockingClient.putPartnersIdPayoutProfile(id: String, body: PutPartnersIdPayoutProfileBody, idempotencyKey: String? = null): PutPartnersIdPayoutProfileResponse =
    runBlocking { this@putPartnersIdPayoutProfile.client.putPartnersIdPayoutProfile(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putPartnersIdVat]: Set a partner's VAT number. PUT /v1/partners/{id}/vat */
fun ReferalliBlockingClient.putPartnersIdVat(id: String, body: PutPartnersIdVatBody, idempotencyKey: String? = null): PutPartnersIdVatResponse =
    runBlocking { this@putPartnersIdVat.client.putPartnersIdVat(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putPayoutConnectionsProvider]: Connect a payout provider. PUT /v1/payout-connections/{provider} */
fun ReferalliBlockingClient.putPayoutConnectionsProvider(provider: String, body: JsonValue, idempotencyKey: String? = null): PutPayoutConnectionsProviderResponse =
    runBlocking { this@putPayoutConnectionsProvider.client.putPayoutConnectionsProvider(provider = provider, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putProfitabilityProductsProductRef]: Set a product margin. PUT /v1/profitability/products/{productRef} */
fun ReferalliBlockingClient.putProfitabilityProductsProductRef(productRef: String, body: PutProfitabilityProductsProductRefBody, idempotencyKey: String? = null): GetProfitabilityProductsProductRefResponse =
    runBlocking { this@putProfitabilityProductsProductRef.client.putProfitabilityProductsProductRef(productRef = productRef, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putProfitabilitySettings]: Update profitability settings. PUT /v1/profitability/settings */
fun ReferalliBlockingClient.putProfitabilitySettings(body: PutProfitabilitySettingsBody, idempotencyKey: String? = null): GetProfitabilitySettingsResponse =
    runBlocking { this@putProfitabilitySettings.client.putProfitabilitySettings(body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putProgramsIdAutopricing]: Configure autopricing. PUT /v1/programs/{id}/autopricing */
fun ReferalliBlockingClient.putProgramsIdAutopricing(id: String, body: PutProgramsIdAutopricingBody, idempotencyKey: String? = null): PutProgramsIdAutopricingResponse =
    runBlocking { this@putProgramsIdAutopricing.client.putProgramsIdAutopricing(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putProgramsIdIncrementality]: Set the incrementality holdout. PUT /v1/programs/{id}/incrementality */
fun ReferalliBlockingClient.putProgramsIdIncrementality(id: String, body: PutProgramsIdIncrementalityBody, idempotencyKey: String? = null): PutProgramsIdIncrementalityResponse =
    runBlocking { this@putProgramsIdIncrementality.client.putProgramsIdIncrementality(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putProgramsIdNegotiationPolicy]: Set the agent negotiation policy. PUT /v1/programs/{id}/negotiation-policy */
fun ReferalliBlockingClient.putProgramsIdNegotiationPolicy(id: String, body: PutProgramsIdNegotiationPolicyBody, idempotencyKey: String? = null): PutProgramsIdNegotiationPolicyResponse =
    runBlocking { this@putProgramsIdNegotiationPolicy.client.putProgramsIdNegotiationPolicy(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putProgramsIdPartnersPartnerIdGroup]: Set a partner's group. PUT /v1/programs/{id}/partners/{partnerId}/group */
fun ReferalliBlockingClient.putProgramsIdPartnersPartnerIdGroup(id: String, partnerId: String, body: PutProgramsIdPartnersPartnerIdGroupBody, idempotencyKey: String? = null): PutProgramsIdPartnersPartnerIdGroupResponse =
    runBlocking { this@putProgramsIdPartnersPartnerIdGroup.client.putProgramsIdPartnersPartnerIdGroup(id = id, partnerId = partnerId, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putProgramsIdPayoutSchedule]: Set a program's payout schedule. PUT /v1/programs/{id}/payout-schedule */
fun ReferalliBlockingClient.putProgramsIdPayoutSchedule(id: String, body: PutProgramsIdPayoutScheduleBody, idempotencyKey: String? = null): PutProgramsIdPayoutScheduleResponse =
    runBlocking { this@putProgramsIdPayoutSchedule.client.putProgramsIdPayoutSchedule(id = id, body = body, idempotencyKey = idempotencyKey) }

/** Blocking [ReferalliClient.putProgramsIdRefereeReward]: Set the referee reward. PUT /v1/programs/{id}/referee-reward */
fun ReferalliBlockingClient.putProgramsIdRefereeReward(id: String, body: PutProgramsIdRefereeRewardBody, idempotencyKey: String? = null): PutProgramsIdRefereeRewardResponse =
    runBlocking { this@putProgramsIdRefereeReward.client.putProgramsIdRefereeReward(id = id, body = body, idempotencyKey = idempotencyKey) }
