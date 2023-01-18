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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ExplanationSpecOverrideOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExplanationSpecOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parameters to be overridden. Note that the
   * [method][google.cloud.aiplatform.v1beta1.ExplanationParameters.method]
   * cannot be changed. If not specified, no parameter is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The parameters to be overridden. Note that the
   * [method][google.cloud.aiplatform.v1beta1.ExplanationParameters.method]
   * cannot be changed. If not specified, no parameter is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1;</code>
   *
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationParameters getParameters();
  /**
   *
   *
   * <pre>
   * The parameters to be overridden. Note that the
   * [method][google.cloud.aiplatform.v1beta1.ExplanationParameters.method]
   * cannot be changed. If not specified, no parameter is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder getParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadataOverride metadata = 2;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadataOverride metadata = 2;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOverride getMetadata();
  /**
   *
   *
   * <pre>
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadataOverride metadata = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOverrideOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The example-based explanations parameter overrides.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExamplesOverride examples_override = 3;</code>
   *
   * @return Whether the examplesOverride field is set.
   */
  boolean hasExamplesOverride();
  /**
   *
   *
   * <pre>
   * The example-based explanations parameter overrides.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExamplesOverride examples_override = 3;</code>
   *
   * @return The examplesOverride.
   */
  com.google.cloud.aiplatform.v1beta1.ExamplesOverride getExamplesOverride();
  /**
   *
   *
   * <pre>
   * The example-based explanations parameter overrides.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExamplesOverride examples_override = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExamplesOverrideOrBuilder getExamplesOverrideOrBuilder();
}
