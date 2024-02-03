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
// source: google/cloud/retail/v2alpha/control_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface UpdateControlRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.UpdateControlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the control field is set.
   */
  boolean hasControl();
  /**
   *
   *
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The control.
   */
  com.google.cloud.retail.v2alpha.Control getControl();
  /**
   *
   *
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2alpha.ControlOrBuilder getControlOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Control][google.cloud.retail.v2alpha.Control] to update. The following are
   * NOT supported:
   *
   * * [Control.name][google.cloud.retail.v2alpha.Control.name]
   *
   * If not set or empty, all supported fields are updated.
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
   * Indicates which fields in the provided
   * [Control][google.cloud.retail.v2alpha.Control] to update. The following are
   * NOT supported:
   *
   * * [Control.name][google.cloud.retail.v2alpha.Control.name]
   *
   * If not set or empty, all supported fields are updated.
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
   * Indicates which fields in the provided
   * [Control][google.cloud.retail.v2alpha.Control] to update. The following are
   * NOT supported:
   *
   * * [Control.name][google.cloud.retail.v2alpha.Control.name]
   *
   * If not set or empty, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
