/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/tool.proto

package com.google.cloud.aiplatform.v1beta1;

public interface FunctionResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FunctionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name] and [FunctionCall.name].
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
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name] and [FunctionCall.name].
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
   * Required. The function response in JSON object format.
   * </pre>
   *
   * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   *
   *
   * <pre>
   * Required. The function response in JSON object format.
   * </pre>
   *
   * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The response.
   */
  com.google.protobuf.Struct getResponse();
  /**
   *
   *
   * <pre>
   * Required. The function response in JSON object format.
   * </pre>
   *
   * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.StructOrBuilder getResponseOrBuilder();
}
