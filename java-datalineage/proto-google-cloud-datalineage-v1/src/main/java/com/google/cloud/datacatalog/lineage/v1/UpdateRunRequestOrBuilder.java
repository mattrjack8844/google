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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.lineage.v1;

public interface UpdateRunRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.UpdateRunRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The lineage run to update.
   *
   * The run's `name` field is used to identify the run to update.
   *
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}`.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Run run = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the run field is set.
   */
  boolean hasRun();
  /**
   *
   *
   * <pre>
   * Required. The lineage run to update.
   *
   * The run's `name` field is used to identify the run to update.
   *
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}`.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Run run = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The run.
   */
  com.google.cloud.datacatalog.lineage.v1.Run getRun();
  /**
   *
   *
   * <pre>
   * Required. The lineage run to update.
   *
   * The run's `name` field is used to identify the run to update.
   *
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}`.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Run run = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.lineage.v1.RunOrBuilder getRunOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to update. Currently not used. The whole message is
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to update. Currently not used. The whole message is
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to update. Currently not used. The whole message is
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true and the run is not found, the request creates it.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
