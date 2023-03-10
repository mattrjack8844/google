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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface AnalyzeDataSourceRiskDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric requested_privacy_metric = 1;</code>
   *
   * @return Whether the requestedPrivacyMetric field is set.
   */
  boolean hasRequestedPrivacyMetric();
  /**
   *
   *
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric requested_privacy_metric = 1;</code>
   *
   * @return The requestedPrivacyMetric.
   */
  com.google.privacy.dlp.v2.PrivacyMetric getRequestedPrivacyMetric();
  /**
   *
   *
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric requested_privacy_metric = 1;</code>
   */
  com.google.privacy.dlp.v2.PrivacyMetricOrBuilder getRequestedPrivacyMetricOrBuilder();

  /**
   *
   *
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable requested_source_table = 2;</code>
   *
   * @return Whether the requestedSourceTable field is set.
   */
  boolean hasRequestedSourceTable();
  /**
   *
   *
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable requested_source_table = 2;</code>
   *
   * @return The requestedSourceTable.
   */
  com.google.privacy.dlp.v2.BigQueryTable getRequestedSourceTable();
  /**
   *
   *
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable requested_source_table = 2;</code>
   */
  com.google.privacy.dlp.v2.BigQueryTableOrBuilder getRequestedSourceTableOrBuilder();

  /**
   *
   *
   * <pre>
   * Numerical stats result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResult numerical_stats_result = 3;
   * </code>
   *
   * @return Whether the numericalStatsResult field is set.
   */
  boolean hasNumericalStatsResult();
  /**
   *
   *
   * <pre>
   * Numerical stats result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResult numerical_stats_result = 3;
   * </code>
   *
   * @return The numericalStatsResult.
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResult
      getNumericalStatsResult();
  /**
   *
   *
   * <pre>
   * Numerical stats result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResult numerical_stats_result = 3;
   * </code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResultOrBuilder
      getNumericalStatsResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Categorical stats result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResult categorical_stats_result = 4;
   * </code>
   *
   * @return Whether the categoricalStatsResult field is set.
   */
  boolean hasCategoricalStatsResult();
  /**
   *
   *
   * <pre>
   * Categorical stats result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResult categorical_stats_result = 4;
   * </code>
   *
   * @return The categoricalStatsResult.
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResult
      getCategoricalStatsResult();
  /**
   *
   *
   * <pre>
   * Categorical stats result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResult categorical_stats_result = 4;
   * </code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResultOrBuilder
      getCategoricalStatsResultOrBuilder();

  /**
   *
   *
   * <pre>
   * K-anonymity result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResult k_anonymity_result = 5;
   * </code>
   *
   * @return Whether the kAnonymityResult field is set.
   */
  boolean hasKAnonymityResult();
  /**
   *
   *
   * <pre>
   * K-anonymity result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResult k_anonymity_result = 5;
   * </code>
   *
   * @return The kAnonymityResult.
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResult getKAnonymityResult();
  /**
   *
   *
   * <pre>
   * K-anonymity result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResult k_anonymity_result = 5;
   * </code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResultOrBuilder
      getKAnonymityResultOrBuilder();

  /**
   *
   *
   * <pre>
   * L-divesity result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResult l_diversity_result = 6;
   * </code>
   *
   * @return Whether the lDiversityResult field is set.
   */
  boolean hasLDiversityResult();
  /**
   *
   *
   * <pre>
   * L-divesity result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResult l_diversity_result = 6;
   * </code>
   *
   * @return The lDiversityResult.
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResult getLDiversityResult();
  /**
   *
   *
   * <pre>
   * L-divesity result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResult l_diversity_result = 6;
   * </code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResultOrBuilder
      getLDiversityResultOrBuilder();

  /**
   *
   *
   * <pre>
   * K-map result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResult k_map_estimation_result = 7;
   * </code>
   *
   * @return Whether the kMapEstimationResult field is set.
   */
  boolean hasKMapEstimationResult();
  /**
   *
   *
   * <pre>
   * K-map result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResult k_map_estimation_result = 7;
   * </code>
   *
   * @return The kMapEstimationResult.
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResult
      getKMapEstimationResult();
  /**
   *
   *
   * <pre>
   * K-map result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResult k_map_estimation_result = 7;
   * </code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResultOrBuilder
      getKMapEstimationResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Delta-presence result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.DeltaPresenceEstimationResult delta_presence_estimation_result = 9;
   * </code>
   *
   * @return Whether the deltaPresenceEstimationResult field is set.
   */
  boolean hasDeltaPresenceEstimationResult();
  /**
   *
   *
   * <pre>
   * Delta-presence result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.DeltaPresenceEstimationResult delta_presence_estimation_result = 9;
   * </code>
   *
   * @return The deltaPresenceEstimationResult.
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.DeltaPresenceEstimationResult
      getDeltaPresenceEstimationResult();
  /**
   *
   *
   * <pre>
   * Delta-presence result
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.DeltaPresenceEstimationResult delta_presence_estimation_result = 9;
   * </code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.DeltaPresenceEstimationResultOrBuilder
      getDeltaPresenceEstimationResultOrBuilder();

  /**
   *
   *
   * <pre>
   * The configuration used for this job.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.RequestedRiskAnalysisOptions requested_options = 10;
   * </code>
   *
   * @return Whether the requestedOptions field is set.
   */
  boolean hasRequestedOptions();
  /**
   *
   *
   * <pre>
   * The configuration used for this job.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.RequestedRiskAnalysisOptions requested_options = 10;
   * </code>
   *
   * @return The requestedOptions.
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.RequestedRiskAnalysisOptions
      getRequestedOptions();
  /**
   *
   *
   * <pre>
   * The configuration used for this job.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.RequestedRiskAnalysisOptions requested_options = 10;
   * </code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.RequestedRiskAnalysisOptionsOrBuilder
      getRequestedOptionsOrBuilder();

  public com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.ResultCase getResultCase();
}
