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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

public interface ApproveBuildRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.ApproveBuildRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the target build.
   * For example: "projects/{$project_id}/builds/{$build_id}"
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
   * Required. Name of the target build.
   * For example: "projects/{$project_id}/builds/{$build_id}"
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
   * Approval decision and metadata.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
   *
   * @return Whether the approvalResult field is set.
   */
  boolean hasApprovalResult();
  /**
   *
   *
   * <pre>
   * Approval decision and metadata.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
   *
   * @return The approvalResult.
   */
  com.google.cloudbuild.v1.ApprovalResult getApprovalResult();
  /**
   *
   *
   * <pre>
   * Approval decision and metadata.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult approval_result = 2;</code>
   */
  com.google.cloudbuild.v1.ApprovalResultOrBuilder getApprovalResultOrBuilder();
}
