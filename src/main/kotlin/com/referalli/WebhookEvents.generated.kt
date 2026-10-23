// Code generated from the Referalli OpenAPI document. DO NOT EDIT.
// Changes belong in the generator, which overwrites this file.

package com.referalli

/** Every webhook topic the API publishes. */
object WebhookTopic {
    /** `billing_event.recorded`: A billing event was recorded */
    const val BILLING_EVENT_RECORDED = "billing_event.recorded"
    /** `click.recorded`: A tracked click was recorded */
    const val CLICK_RECORDED = "click.recorded"
    /** `commission.earned`: A commission line was earned */
    const val COMMISSION_EARNED = "commission.earned"
    /** `commission.reversed`: A commission line was reversed */
    const val COMMISSION_REVERSED = "commission.reversed"
    /** `commission.settled`: A commission line was settled by the merchant */
    const val COMMISSION_SETTLED = "commission.settled"
    /** `credit.redeemed`: A referee reward was redeemed */
    const val CREDIT_REDEEMED = "credit.redeemed"
    /** `customer.aliased`: A customer's id changed */
    const val CUSTOMER_ALIASED = "customer.aliased"
    /** `deal.submitted`: A partner registered a deal */
    const val DEAL_SUBMITTED = "deal.submitted"
    /** `dispute.resolved`: A partner dispute was resolved */
    const val DISPUTE_RESOLVED = "dispute.resolved"
    /** `fraud.case_opened`: A fraud case was opened */
    const val FRAUD_CASE_OPENED = "fraud.case_opened"
    /** `partner.applied`: A partner applied to a program */
    const val PARTNER_APPLIED = "partner.applied"
    /** `partner.approved`: A partner was approved */
    const val PARTNER_APPROVED = "partner.approved"
    /** `partner.enrolled`: A partner was enrolled */
    const val PARTNER_ENROLLED = "partner.enrolled"
    /** `partner.level_up`: A partner reached a new level */
    const val PARTNER_LEVEL_UP = "partner.level_up"
    /** `payout.cancelled`: A payout was cancelled */
    const val PAYOUT_CANCELLED = "payout.cancelled"
    /** `payout.failed`: A payout failed */
    const val PAYOUT_FAILED = "payout.failed"
    /** `payout.scheduled`: A payout was created in a run */
    const val PAYOUT_SCHEDULED = "payout.scheduled"
    /** `payout.sent`: A payout was paid */
    const val PAYOUT_SENT = "payout.sent"
    /** `payout.submitted`: A payout was submitted to the provider */
    const val PAYOUT_SUBMITTED = "payout.submitted"
    /** `privacy.request_completed`: A data-subject request finished */
    const val PRIVACY_REQUEST_COMPLETED = "privacy.request_completed"
    /** `referee_reward.earned`: A referred customer earned their reward */
    const val REFEREE_REWARD_EARNED = "referee_reward.earned"
    /** `referral.approved`: A held referral was approved */
    const val REFERRAL_APPROVED = "referral.approved"
    /** `referral.created`: A customer was attributed to a partner */
    const val REFERRAL_CREATED = "referral.created"
    /** `referral.held`: A referral was held for review */
    const val REFERRAL_HELD = "referral.held"
    /** `referral.paused`: A referral was paused */
    const val REFERRAL_PAUSED = "referral.paused"
    /** `referral.reassigned`: A referral moved to another partner */
    const val REFERRAL_REASSIGNED = "referral.reassigned"
    /** `referral.rejected`: A self-referral was refused */
    const val REFERRAL_REJECTED = "referral.rejected"
    /** `referral.resumed`: A paused referral was resumed */
    const val REFERRAL_RESUMED = "referral.resumed"
    /** `referral.voided`: A referral was voided */
    const val REFERRAL_VOIDED = "referral.voided"
    /** `roi.pattern_detected`: A value pattern changed */
    const val ROI_PATTERN_DETECTED = "roi.pattern_detected"
    /** `roi.payback_reached`: A credit grant paid back */
    const val ROI_PAYBACK_REACHED = "roi.payback_reached"
    /** `tax.form_delivered`: A tax form was delivered to a partner */
    const val TAX_FORM_DELIVERED = "tax.form_delivered"
    /** `webhook_endpoint.disabled`: A failing webhook endpoint was disabled */
    const val WEBHOOK_ENDPOINT_DISABLED = "webhook_endpoint.disabled"

    /** Every topic. */
    val ALL: List<String> = listOf("billing_event.recorded", "click.recorded", "commission.earned", "commission.reversed", "commission.settled", "credit.redeemed", "customer.aliased", "deal.submitted", "dispute.resolved", "fraud.case_opened", "partner.applied", "partner.approved", "partner.enrolled", "partner.level_up", "payout.cancelled", "payout.failed", "payout.scheduled", "payout.sent", "payout.submitted", "privacy.request_completed", "referee_reward.earned", "referral.approved", "referral.created", "referral.held", "referral.paused", "referral.reassigned", "referral.rejected", "referral.resumed", "referral.voided", "roi.pattern_detected", "roi.payback_reached", "tax.form_delivered", "webhook_endpoint.disabled")
}

/** A webhook event's payload, typed by topic. [Unknown] is a topic this SDK predates. */
sealed class WebhookPayload {
    /** `billing_event.recorded` */
    data class BillingEventRecorded(val data: BillingEventRecordedEventData) : WebhookPayload()
    /** `click.recorded` */
    data class ClickRecorded(val data: ClickRecordedEventData) : WebhookPayload()
    /** `commission.earned` */
    data class CommissionEarned(val data: CommissionEarnedEventData) : WebhookPayload()
    /** `commission.reversed` */
    data class CommissionReversed(val data: CommissionReversedEventData) : WebhookPayload()
    /** `commission.settled` */
    data class CommissionSettled(val data: CommissionSettledEventData) : WebhookPayload()
    /** `credit.redeemed` */
    data class CreditRedeemed(val data: CreditRedeemedEventData) : WebhookPayload()
    /** `customer.aliased` */
    data class CustomerAliased(val data: CustomerAliasedEventData) : WebhookPayload()
    /** `deal.submitted` */
    data class DealSubmitted(val data: DealSubmittedEventData) : WebhookPayload()
    /** `dispute.resolved` */
    data class DisputeResolved(val data: DisputeResolvedEventData) : WebhookPayload()
    /** `fraud.case_opened` */
    data class FraudCaseOpened(val data: FraudCaseOpenedEventData) : WebhookPayload()
    /** `partner.applied` */
    data class PartnerApplied(val data: PartnerAppliedEventData) : WebhookPayload()
    /** `partner.approved` */
    data class PartnerApproved(val data: PartnerApprovedEventData) : WebhookPayload()
    /** `partner.enrolled` */
    data class PartnerEnrolled(val data: PartnerEnrolledEventData) : WebhookPayload()
    /** `partner.level_up` */
    data class PartnerLevelUp(val data: PartnerLevelUpEventData) : WebhookPayload()
    /** `payout.cancelled` */
    data class PayoutCancelled(val data: PayoutCancelledEventData) : WebhookPayload()
    /** `payout.failed` */
    data class PayoutFailed(val data: PayoutFailedEventData) : WebhookPayload()
    /** `payout.scheduled` */
    data class PayoutScheduled(val data: PayoutScheduledEventData) : WebhookPayload()
    /** `payout.sent` */
    data class PayoutSent(val data: PayoutSentEventData) : WebhookPayload()
    /** `payout.submitted` */
    data class PayoutSubmitted(val data: PayoutSubmittedEventData) : WebhookPayload()
    /** `privacy.request_completed` */
    data class PrivacyRequestCompleted(val data: PrivacyRequestCompletedEventData) : WebhookPayload()
    /** `referee_reward.earned` */
    data class RefereeRewardEarned(val data: RefereeRewardEarnedEventData) : WebhookPayload()
    /** `referral.approved` */
    data class ReferralApproved(val data: ReferralApprovedEventData) : WebhookPayload()
    /** `referral.created` */
    data class ReferralCreated(val data: ReferralCreatedEventData) : WebhookPayload()
    /** `referral.held` */
    data class ReferralHeld(val data: ReferralHeldEventData) : WebhookPayload()
    /** `referral.paused` */
    data class ReferralPaused(val data: ReferralPausedEventData) : WebhookPayload()
    /** `referral.reassigned` */
    data class ReferralReassigned(val data: ReferralReassignedEventData) : WebhookPayload()
    /** `referral.rejected` */
    data class ReferralRejected(val data: ReferralRejectedEventData) : WebhookPayload()
    /** `referral.resumed` */
    data class ReferralResumed(val data: ReferralResumedEventData) : WebhookPayload()
    /** `referral.voided` */
    data class ReferralVoided(val data: ReferralVoidedEventData) : WebhookPayload()
    /** `roi.pattern_detected` */
    data class RoiPatternDetected(val data: RoiPatternDetectedEventData) : WebhookPayload()
    /** `roi.payback_reached` */
    data class RoiPaybackReached(val data: RoiPaybackReachedEventData) : WebhookPayload()
    /** `tax.form_delivered` */
    data class TaxFormDelivered(val data: TaxFormDeliveredEventData) : WebhookPayload()
    /** `webhook_endpoint.disabled` */
    data class WebhookEndpointDisabled(val data: WebhookEndpointDisabledEventData) : WebhookPayload()
    data class Unknown(val topic: String, val data: JsonValue) : WebhookPayload()

    companion object {
        fun decode(topic: String, data: JsonValue): WebhookPayload =
            when (topic) {
                "billing_event.recorded" -> BillingEventRecorded(BillingEventRecordedEventData.fromJson(data))
                "click.recorded" -> ClickRecorded(ClickRecordedEventData.fromJson(data))
                "commission.earned" -> CommissionEarned(CommissionEarnedEventData.fromJson(data))
                "commission.reversed" -> CommissionReversed(CommissionReversedEventData.fromJson(data))
                "commission.settled" -> CommissionSettled(CommissionSettledEventData.fromJson(data))
                "credit.redeemed" -> CreditRedeemed(CreditRedeemedEventData.fromJson(data))
                "customer.aliased" -> CustomerAliased(CustomerAliasedEventData.fromJson(data))
                "deal.submitted" -> DealSubmitted(DealSubmittedEventData.fromJson(data))
                "dispute.resolved" -> DisputeResolved(DisputeResolvedEventData.fromJson(data))
                "fraud.case_opened" -> FraudCaseOpened(FraudCaseOpenedEventData.fromJson(data))
                "partner.applied" -> PartnerApplied(PartnerAppliedEventData.fromJson(data))
                "partner.approved" -> PartnerApproved(PartnerApprovedEventData.fromJson(data))
                "partner.enrolled" -> PartnerEnrolled(PartnerEnrolledEventData.fromJson(data))
                "partner.level_up" -> PartnerLevelUp(PartnerLevelUpEventData.fromJson(data))
                "payout.cancelled" -> PayoutCancelled(PayoutCancelledEventData.fromJson(data))
                "payout.failed" -> PayoutFailed(PayoutFailedEventData.fromJson(data))
                "payout.scheduled" -> PayoutScheduled(PayoutScheduledEventData.fromJson(data))
                "payout.sent" -> PayoutSent(PayoutSentEventData.fromJson(data))
                "payout.submitted" -> PayoutSubmitted(PayoutSubmittedEventData.fromJson(data))
                "privacy.request_completed" -> PrivacyRequestCompleted(PrivacyRequestCompletedEventData.fromJson(data))
                "referee_reward.earned" -> RefereeRewardEarned(RefereeRewardEarnedEventData.fromJson(data))
                "referral.approved" -> ReferralApproved(ReferralApprovedEventData.fromJson(data))
                "referral.created" -> ReferralCreated(ReferralCreatedEventData.fromJson(data))
                "referral.held" -> ReferralHeld(ReferralHeldEventData.fromJson(data))
                "referral.paused" -> ReferralPaused(ReferralPausedEventData.fromJson(data))
                "referral.reassigned" -> ReferralReassigned(ReferralReassignedEventData.fromJson(data))
                "referral.rejected" -> ReferralRejected(ReferralRejectedEventData.fromJson(data))
                "referral.resumed" -> ReferralResumed(ReferralResumedEventData.fromJson(data))
                "referral.voided" -> ReferralVoided(ReferralVoidedEventData.fromJson(data))
                "roi.pattern_detected" -> RoiPatternDetected(RoiPatternDetectedEventData.fromJson(data))
                "roi.payback_reached" -> RoiPaybackReached(RoiPaybackReachedEventData.fromJson(data))
                "tax.form_delivered" -> TaxFormDelivered(TaxFormDeliveredEventData.fromJson(data))
                "webhook_endpoint.disabled" -> WebhookEndpointDisabled(WebhookEndpointDisabledEventData.fromJson(data))
                else -> Unknown(topic, data)
            }
    }
}
