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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface AccountDefenderAssessmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the labels.
   */
  java.util.List<com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel>
      getLabelsList();
  /**
   *
   *
   * <pre>
   * Output only. Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Output only. Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel getLabels(
      int index);
  /**
   *
   *
   * <pre>
   * Output only. Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for labels.
   */
  java.util.List<java.lang.Integer> getLabelsValueList();
  /**
   *
   *
   * <pre>
   * Output only. Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of labels at the given index.
   */
  int getLabelsValue(int index);
}
