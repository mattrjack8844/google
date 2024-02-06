/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/datacatalog/v1beta1/usage.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1beta1;

public interface UsageStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.UsageStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of times that the underlying entry was successfully used.
   * </pre>
   *
   * <code>float total_completions = 1;</code>
   *
   * @return The totalCompletions.
   */
  float getTotalCompletions();

  /**
   *
   *
   * <pre>
   * The number of times that the underlying entry was attempted to be used
   * but failed.
   * </pre>
   *
   * <code>float total_failures = 2;</code>
   *
   * @return The totalFailures.
   */
  float getTotalFailures();

  /**
   *
   *
   * <pre>
   * The number of times that the underlying entry was attempted to be used
   * but was cancelled by the user.
   * </pre>
   *
   * <code>float total_cancellations = 3;</code>
   *
   * @return The totalCancellations.
   */
  float getTotalCancellations();

  /**
   *
   *
   * <pre>
   * Total time spent (in milliseconds) during uses the resulted in completions.
   * </pre>
   *
   * <code>float total_execution_time_for_completions_millis = 4;</code>
   *
   * @return The totalExecutionTimeForCompletionsMillis.
   */
  float getTotalExecutionTimeForCompletionsMillis();
}
