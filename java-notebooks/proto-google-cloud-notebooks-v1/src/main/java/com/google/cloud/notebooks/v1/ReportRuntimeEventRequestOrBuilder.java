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
// source: google/cloud/notebooks/v1/managed_service.proto

package com.google.cloud.notebooks.v1;

public interface ReportRuntimeEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.ReportRuntimeEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The VM hardware token for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * </pre>
   *
   * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vmId.
   */
  java.lang.String getVmId();
  /**
   *
   *
   * <pre>
   * Required. The VM hardware token for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * </pre>
   *
   * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for vmId.
   */
  com.google.protobuf.ByteString getVmIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Event to be reported.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Event event = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   *
   *
   * <pre>
   * Required. The Event to be reported.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Event event = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The event.
   */
  com.google.cloud.notebooks.v1.Event getEvent();
  /**
   *
   *
   * <pre>
   * Required. The Event to be reported.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Event event = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.notebooks.v1.EventOrBuilder getEventOrBuilder();
}
