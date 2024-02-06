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
// source: google/cloud/metastore/v1alpha/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1alpha;

public interface BackupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.Backup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The relative resource name of the backup, in the following form:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The relative resource name of the backup, in the following form:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the backup finished creating.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup finished creating.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup finished creating.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the backup.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.Backup.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the backup.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.Backup.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.metastore.v1alpha.Backup.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The revision of the service at the time of backup.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.Service service_revision = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the serviceRevision field is set.
   */
  boolean hasServiceRevision();
  /**
   *
   *
   * <pre>
   * Output only. The revision of the service at the time of backup.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.Service service_revision = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The serviceRevision.
   */
  com.google.cloud.metastore.v1alpha.Service getServiceRevision();
  /**
   *
   *
   * <pre>
   * Output only. The revision of the service at the time of backup.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.Service service_revision = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.metastore.v1alpha.ServiceOrBuilder getServiceRevisionOrBuilder();

  /**
   *
   *
   * <pre>
   * The description of the backup.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the backup.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Services that are restoring from the backup.
   * </pre>
   *
   * <code>repeated string restoring_services = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the restoringServices.
   */
  java.util.List<java.lang.String> getRestoringServicesList();
  /**
   *
   *
   * <pre>
   * Output only. Services that are restoring from the backup.
   * </pre>
   *
   * <code>repeated string restoring_services = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of restoringServices.
   */
  int getRestoringServicesCount();
  /**
   *
   *
   * <pre>
   * Output only. Services that are restoring from the backup.
   * </pre>
   *
   * <code>repeated string restoring_services = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The restoringServices at the given index.
   */
  java.lang.String getRestoringServices(int index);
  /**
   *
   *
   * <pre>
   * Output only. Services that are restoring from the backup.
   * </pre>
   *
   * <code>repeated string restoring_services = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the restoringServices at the given index.
   */
  com.google.protobuf.ByteString getRestoringServicesBytes(int index);
}
