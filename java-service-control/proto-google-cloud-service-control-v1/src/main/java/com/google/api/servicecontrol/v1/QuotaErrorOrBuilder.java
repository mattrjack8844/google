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
// source: google/api/servicecontrol/v1/quota_controller.proto

// Protobuf Java Version: 3.25.2
package com.google.api.servicecontrol.v1;

public interface QuotaErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.QuotaError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Error code.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.QuotaError.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * Error code.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.QuotaError.Code code = 1;</code>
   *
   * @return The code.
   */
  com.google.api.servicecontrol.v1.QuotaError.Code getCode();

  /**
   *
   *
   * <pre>
   * Subject to whom this error applies. See the specific enum for more details
   * on this field. For example, "clientip:&lt;ip address of client&gt;" or
   * "project:&lt;Google developer project id&gt;".
   * </pre>
   *
   * <code>string subject = 2;</code>
   *
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   *
   *
   * <pre>
   * Subject to whom this error applies. See the specific enum for more details
   * on this field. For example, "clientip:&lt;ip address of client&gt;" or
   * "project:&lt;Google developer project id&gt;".
   * </pre>
   *
   * <code>string subject = 2;</code>
   *
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString getSubjectBytes();

  /**
   *
   *
   * <pre>
   * Free-form text that provides details on the cause of the error.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Free-form text that provides details on the cause of the error.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Contains additional information about the quota error.
   * If available, `status.code` will be non zero.
   * </pre>
   *
   * <code>.google.rpc.Status status = 4;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Contains additional information about the quota error.
   * If available, `status.code` will be non zero.
   * </pre>
   *
   * <code>.google.rpc.Status status = 4;</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   *
   *
   * <pre>
   * Contains additional information about the quota error.
   * If available, `status.code` will be non zero.
   * </pre>
   *
   * <code>.google.rpc.Status status = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();
}
