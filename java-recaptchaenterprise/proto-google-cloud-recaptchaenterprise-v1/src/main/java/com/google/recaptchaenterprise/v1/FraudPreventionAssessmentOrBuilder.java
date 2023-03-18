/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface FraudPreventionAssessmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Probability (0-1) of this transaction being fraudulent. Summarizes the
   * combined risk of attack vectors below.
   * </pre>
   *
   * <code>float transaction_risk = 1;</code>
   *
   * @return The transactionRisk.
   */
  float getTransactionRisk();

  /**
   *
   *
   * <pre>
   * Assessment of this transaction for risk of a stolen instrument.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment.StolenInstrumentVerdict stolen_instrument_verdict = 2;
   * </code>
   *
   * @return Whether the stolenInstrumentVerdict field is set.
   */
  boolean hasStolenInstrumentVerdict();
  /**
   *
   *
   * <pre>
   * Assessment of this transaction for risk of a stolen instrument.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment.StolenInstrumentVerdict stolen_instrument_verdict = 2;
   * </code>
   *
   * @return The stolenInstrumentVerdict.
   */
  com.google.recaptchaenterprise.v1.FraudPreventionAssessment.StolenInstrumentVerdict
      getStolenInstrumentVerdict();
  /**
   *
   *
   * <pre>
   * Assessment of this transaction for risk of a stolen instrument.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment.StolenInstrumentVerdict stolen_instrument_verdict = 2;
   * </code>
   */
  com.google.recaptchaenterprise.v1.FraudPreventionAssessment.StolenInstrumentVerdictOrBuilder
      getStolenInstrumentVerdictOrBuilder();

  /**
   *
   *
   * <pre>
   * Assessment of this transaction for risk of being part of a card testing
   * attack.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment.CardTestingVerdict card_testing_verdict = 3;
   * </code>
   *
   * @return Whether the cardTestingVerdict field is set.
   */
  boolean hasCardTestingVerdict();
  /**
   *
   *
   * <pre>
   * Assessment of this transaction for risk of being part of a card testing
   * attack.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment.CardTestingVerdict card_testing_verdict = 3;
   * </code>
   *
   * @return The cardTestingVerdict.
   */
  com.google.recaptchaenterprise.v1.FraudPreventionAssessment.CardTestingVerdict
      getCardTestingVerdict();
  /**
   *
   *
   * <pre>
   * Assessment of this transaction for risk of being part of a card testing
   * attack.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment.CardTestingVerdict card_testing_verdict = 3;
   * </code>
   */
  com.google.recaptchaenterprise.v1.FraudPreventionAssessment.CardTestingVerdictOrBuilder
      getCardTestingVerdictOrBuilder();
}
