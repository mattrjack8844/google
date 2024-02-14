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
// source: google/cloud/bigquery/connection/v1/connection.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.connection.v1;

public interface AwsAccessRoleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.AwsAccessRole)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
   * Connection.
   * </pre>
   *
   * <code>string iam_role_id = 1;</code>
   *
   * @return The iamRoleId.
   */
  java.lang.String getIamRoleId();
  /**
   *
   *
   * <pre>
   * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user
   * Connection.
   * </pre>
   *
   * <code>string iam_role_id = 1;</code>
   *
   * @return The bytes for iamRoleId.
   */
  com.google.protobuf.ByteString getIamRoleIdBytes();

  /**
   *
   *
   * <pre>
   * A unique Google-owned and Google-generated identity for the Connection.
   * This identity will be used to access the user's AWS IAM Role.
   * </pre>
   *
   * <code>string identity = 2;</code>
   *
   * @return The identity.
   */
  java.lang.String getIdentity();
  /**
   *
   *
   * <pre>
   * A unique Google-owned and Google-generated identity for the Connection.
   * This identity will be used to access the user's AWS IAM Role.
   * </pre>
   *
   * <code>string identity = 2;</code>
   *
   * @return The bytes for identity.
   */
  com.google.protobuf.ByteString getIdentityBytes();
}
