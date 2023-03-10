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
// source: google/cloud/automl/v1/io.proto

package com.google.cloud.automl.v1;

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * For [AutoMl.ImportData][google.cloud.automl.v1.AutoMl.ImportData], `gcs_source` points to a CSV file with
   * a structure described in [InputConfig][google.cloud.automl.v1.InputConfig].
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * For [AutoMl.ImportData][google.cloud.automl.v1.AutoMl.ImportData], `gcs_source` points to a CSV file with
   * a structure described in [InputConfig][google.cloud.automl.v1.InputConfig].
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.automl.v1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * For [AutoMl.ImportData][google.cloud.automl.v1.AutoMl.ImportData], `gcs_source` points to a CSV file with
   * a structure described in [InputConfig][google.cloud.automl.v1.InputConfig].
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.automl.v1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   * &lt;h4&gt;AutoML Tables&lt;/h4&gt;
   * `schema_inference_version`
   * : (integer) This value must be supplied.
   *   The version of the
   *   algorithm to use for the initial inference of the
   *   column data types of the imported table. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  int getParamsCount();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   * &lt;h4&gt;AutoML Tables&lt;/h4&gt;
   * `schema_inference_version`
   * : (integer) This value must be supplied.
   *   The version of the
   *   algorithm to use for the initial inference of the
   *   column data types of the imported table. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  boolean containsParams(java.lang.String key);
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParams();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   * &lt;h4&gt;AutoML Tables&lt;/h4&gt;
   * `schema_inference_version`
   * : (integer) This value must be supplied.
   *   The version of the
   *   algorithm to use for the initial inference of the
   *   column data types of the imported table. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParamsMap();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   * &lt;h4&gt;AutoML Tables&lt;/h4&gt;
   * `schema_inference_version`
   * : (integer) This value must be supplied.
   *   The version of the
   *   algorithm to use for the initial inference of the
   *   column data types of the imported table. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  /* nullable */
  java.lang.String getParamsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   * &lt;h4&gt;AutoML Tables&lt;/h4&gt;
   * `schema_inference_version`
   * : (integer) This value must be supplied.
   *   The version of the
   *   algorithm to use for the initial inference of the
   *   column data types of the imported table. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  java.lang.String getParamsOrThrow(java.lang.String key);

  public com.google.cloud.automl.v1.InputConfig.SourceCase getSourceCase();
}
