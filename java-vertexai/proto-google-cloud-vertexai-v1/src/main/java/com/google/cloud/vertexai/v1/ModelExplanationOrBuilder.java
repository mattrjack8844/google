/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/vertexai/v1/explanation.proto

package com.google.cloud.vertexai.v1;

public interface ModelExplanationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.ModelExplanation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Aggregated attributions explaining the Model's prediction
   * outputs over the set of instances. The attributions are grouped by outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.vertexai.v1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * The
   * [baselineOutputValue][google.cloud.vertexai.v1.Attribution.baseline_output_value],
   * [instanceOutputValue][google.cloud.vertexai.v1.Attribution.instance_output_value]
   * and
   * [featureAttributions][google.cloud.vertexai.v1.Attribution.feature_attributions]
   * fields are averaged over the test data.
   *
   * NOTE: Currently AutoML tabular classification Models produce only one
   * attribution, which averages attributions over all the classes it predicts.
   * [Attribution.approximation_error][google.cloud.vertexai.v1.Attribution.approximation_error]
   * is not populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.Attribution mean_attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.vertexai.v1.Attribution> getMeanAttributionsList();
  /**
   *
   *
   * <pre>
   * Output only. Aggregated attributions explaining the Model's prediction
   * outputs over the set of instances. The attributions are grouped by outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.vertexai.v1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * The
   * [baselineOutputValue][google.cloud.vertexai.v1.Attribution.baseline_output_value],
   * [instanceOutputValue][google.cloud.vertexai.v1.Attribution.instance_output_value]
   * and
   * [featureAttributions][google.cloud.vertexai.v1.Attribution.feature_attributions]
   * fields are averaged over the test data.
   *
   * NOTE: Currently AutoML tabular classification Models produce only one
   * attribution, which averages attributions over all the classes it predicts.
   * [Attribution.approximation_error][google.cloud.vertexai.v1.Attribution.approximation_error]
   * is not populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.Attribution mean_attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vertexai.v1.Attribution getMeanAttributions(int index);
  /**
   *
   *
   * <pre>
   * Output only. Aggregated attributions explaining the Model's prediction
   * outputs over the set of instances. The attributions are grouped by outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.vertexai.v1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * The
   * [baselineOutputValue][google.cloud.vertexai.v1.Attribution.baseline_output_value],
   * [instanceOutputValue][google.cloud.vertexai.v1.Attribution.instance_output_value]
   * and
   * [featureAttributions][google.cloud.vertexai.v1.Attribution.feature_attributions]
   * fields are averaged over the test data.
   *
   * NOTE: Currently AutoML tabular classification Models produce only one
   * attribution, which averages attributions over all the classes it predicts.
   * [Attribution.approximation_error][google.cloud.vertexai.v1.Attribution.approximation_error]
   * is not populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.Attribution mean_attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getMeanAttributionsCount();
  /**
   *
   *
   * <pre>
   * Output only. Aggregated attributions explaining the Model's prediction
   * outputs over the set of instances. The attributions are grouped by outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.vertexai.v1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * The
   * [baselineOutputValue][google.cloud.vertexai.v1.Attribution.baseline_output_value],
   * [instanceOutputValue][google.cloud.vertexai.v1.Attribution.instance_output_value]
   * and
   * [featureAttributions][google.cloud.vertexai.v1.Attribution.feature_attributions]
   * fields are averaged over the test data.
   *
   * NOTE: Currently AutoML tabular classification Models produce only one
   * attribution, which averages attributions over all the classes it predicts.
   * [Attribution.approximation_error][google.cloud.vertexai.v1.Attribution.approximation_error]
   * is not populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.Attribution mean_attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.vertexai.v1.AttributionOrBuilder>
      getMeanAttributionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Aggregated attributions explaining the Model's prediction
   * outputs over the set of instances. The attributions are grouped by outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.vertexai.v1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * The
   * [baselineOutputValue][google.cloud.vertexai.v1.Attribution.baseline_output_value],
   * [instanceOutputValue][google.cloud.vertexai.v1.Attribution.instance_output_value]
   * and
   * [featureAttributions][google.cloud.vertexai.v1.Attribution.feature_attributions]
   * fields are averaged over the test data.
   *
   * NOTE: Currently AutoML tabular classification Models produce only one
   * attribution, which averages attributions over all the classes it predicts.
   * [Attribution.approximation_error][google.cloud.vertexai.v1.Attribution.approximation_error]
   * is not populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.Attribution mean_attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vertexai.v1.AttributionOrBuilder getMeanAttributionsOrBuilder(int index);
}
