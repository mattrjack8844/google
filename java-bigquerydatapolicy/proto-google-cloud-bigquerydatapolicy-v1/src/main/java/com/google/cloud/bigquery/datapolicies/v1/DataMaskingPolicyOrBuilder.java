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
// source: google/cloud/bigquery/datapolicies/v1/datapolicy.proto

package com.google.cloud.bigquery.datapolicies.v1;

public interface DataMaskingPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A predefined masking expression.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
   * </code>
   *
   * @return Whether the predefinedExpression field is set.
   */
  boolean hasPredefinedExpression();
  /**
   *
   *
   * <pre>
   * A predefined masking expression.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for predefinedExpression.
   */
  int getPredefinedExpressionValue();
  /**
   *
   *
   * <pre>
   * A predefined masking expression.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
   * </code>
   *
   * @return The predefinedExpression.
   */
  com.google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy.PredefinedExpression
      getPredefinedExpression();

  /**
   *
   *
   * <pre>
   * The name of the BigQuery routine that contains the custom masking
   * routine, in the format of
   * `projects/{project_number}/datasets/{dataset_id}/routines/{routine_id}`.
   * </pre>
   *
   * <code>string routine = 3;</code>
   *
   * @return Whether the routine field is set.
   */
  boolean hasRoutine();
  /**
   *
   *
   * <pre>
   * The name of the BigQuery routine that contains the custom masking
   * routine, in the format of
   * `projects/{project_number}/datasets/{dataset_id}/routines/{routine_id}`.
   * </pre>
   *
   * <code>string routine = 3;</code>
   *
   * @return The routine.
   */
  java.lang.String getRoutine();
  /**
   *
   *
   * <pre>
   * The name of the BigQuery routine that contains the custom masking
   * routine, in the format of
   * `projects/{project_number}/datasets/{dataset_id}/routines/{routine_id}`.
   * </pre>
   *
   * <code>string routine = 3;</code>
   *
   * @return The bytes for routine.
   */
  com.google.protobuf.ByteString getRoutineBytes();

  com.google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy.MaskingExpressionCase
      getMaskingExpressionCase();
}
