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
// source: google/cloud/retail/v2/model_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface UpdateModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.UpdateModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The body of the updated [Model][google.cloud.retail.v2.Model].
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Model model = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   *
   *
   * <pre>
   * Required. The body of the updated [Model][google.cloud.retail.v2.Model].
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Model model = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The model.
   */
  com.google.cloud.retail.v2.Model getModel();
  /**
   *
   *
   * <pre>
   * Required. The body of the updated [Model][google.cloud.retail.v2.Model].
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Model model = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.ModelOrBuilder getModelOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Indicates which fields in the provided 'model' to
   * update. If not set, by default updates all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Indicates which fields in the provided 'model' to
   * update. If not set, by default updates all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Indicates which fields in the provided 'model' to
   * update. If not set, by default updates all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
