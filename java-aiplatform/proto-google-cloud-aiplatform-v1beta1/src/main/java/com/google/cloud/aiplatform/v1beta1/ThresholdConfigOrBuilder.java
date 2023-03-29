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
// source: google/cloud/aiplatform/v1beta1/model_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ThresholdConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ThresholdConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specify a threshold value that can trigger the alert.
   * If this threshold config is for feature distribution distance:
   *   1. For categorical feature, the distribution distance is calculated by
   *      L-inifinity norm.
   *   2. For numerical feature, the distribution distance is calculated by
   *      Jensen–Shannon divergence.
   * Each feature must have a non-zero threshold if they need to be monitored.
   * Otherwise no alert will be triggered for that feature.
   * </pre>
   *
   * <code>double value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * Specify a threshold value that can trigger the alert.
   * If this threshold config is for feature distribution distance:
   *   1. For categorical feature, the distribution distance is calculated by
   *      L-inifinity norm.
   *   2. For numerical feature, the distribution distance is calculated by
   *      Jensen–Shannon divergence.
   * Each feature must have a non-zero threshold if they need to be monitored.
   * Otherwise no alert will be triggered for that feature.
   * </pre>
   *
   * <code>double value = 1;</code>
   *
   * @return The value.
   */
  double getValue();

  public com.google.cloud.aiplatform.v1beta1.ThresholdConfig.ThresholdCase getThresholdCase();
}
