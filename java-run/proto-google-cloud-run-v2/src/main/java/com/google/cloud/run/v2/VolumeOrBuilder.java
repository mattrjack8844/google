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
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

public interface VolumeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.Volume)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Volume's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Volume's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Secret represents a secret that should populate this volume.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SecretVolumeSource secret = 2;</code>
   *
   * @return Whether the secret field is set.
   */
  boolean hasSecret();
  /**
   *
   *
   * <pre>
   * Secret represents a secret that should populate this volume.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SecretVolumeSource secret = 2;</code>
   *
   * @return The secret.
   */
  com.google.cloud.run.v2.SecretVolumeSource getSecret();
  /**
   *
   *
   * <pre>
   * Secret represents a secret that should populate this volume.
   * </pre>
   *
   * <code>.google.cloud.run.v2.SecretVolumeSource secret = 2;</code>
   */
  com.google.cloud.run.v2.SecretVolumeSourceOrBuilder getSecretOrBuilder();

  /**
   *
   *
   * <pre>
   * For Cloud SQL volumes, contains the specific instances that should be
   * mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for
   * more information on how to connect Cloud SQL and Cloud Run.
   * </pre>
   *
   * <code>.google.cloud.run.v2.CloudSqlInstance cloud_sql_instance = 3;</code>
   *
   * @return Whether the cloudSqlInstance field is set.
   */
  boolean hasCloudSqlInstance();
  /**
   *
   *
   * <pre>
   * For Cloud SQL volumes, contains the specific instances that should be
   * mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for
   * more information on how to connect Cloud SQL and Cloud Run.
   * </pre>
   *
   * <code>.google.cloud.run.v2.CloudSqlInstance cloud_sql_instance = 3;</code>
   *
   * @return The cloudSqlInstance.
   */
  com.google.cloud.run.v2.CloudSqlInstance getCloudSqlInstance();
  /**
   *
   *
   * <pre>
   * For Cloud SQL volumes, contains the specific instances that should be
   * mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for
   * more information on how to connect Cloud SQL and Cloud Run.
   * </pre>
   *
   * <code>.google.cloud.run.v2.CloudSqlInstance cloud_sql_instance = 3;</code>
   */
  com.google.cloud.run.v2.CloudSqlInstanceOrBuilder getCloudSqlInstanceOrBuilder();

  public com.google.cloud.run.v2.Volume.VolumeTypeCase getVolumeTypeCase();
}
