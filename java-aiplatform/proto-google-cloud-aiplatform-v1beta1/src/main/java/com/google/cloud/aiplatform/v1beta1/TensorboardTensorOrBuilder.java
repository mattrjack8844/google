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
// source: google/cloud/aiplatform/v1beta1/tensorboard_data.proto

package com.google.cloud.aiplatform.v1beta1;

public interface TensorboardTensorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.TensorboardTensor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Serialized form of
   * https://github.com/tensorflow/tensorflow/blob/master/tensorflow/core/framework/tensor.proto
   * </pre>
   *
   * <code>bytes value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  /**
   *
   *
   * <pre>
   * Optional. Version number of TensorProto used to serialize
   * [value][google.cloud.aiplatform.v1beta1.TensorboardTensor.value].
   * </pre>
   *
   * <code>int32 version_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The versionNumber.
   */
  int getVersionNumber();
}
