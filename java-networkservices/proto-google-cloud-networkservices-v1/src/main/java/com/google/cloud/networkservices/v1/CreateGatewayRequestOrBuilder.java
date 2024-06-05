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
// source: google/cloud/networkservices/v1/gateway.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkservices.v1;

public interface CreateGatewayRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.CreateGatewayRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the Gateway. Must be in the
   * format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the Gateway. Must be in the
   * format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Short name of the Gateway resource to be created.
   * </pre>
   *
   * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The gatewayId.
   */
  java.lang.String getGatewayId();
  /**
   *
   *
   * <pre>
   * Required. Short name of the Gateway resource to be created.
   * </pre>
   *
   * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for gatewayId.
   */
  com.google.protobuf.ByteString getGatewayIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Gateway resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.Gateway gateway = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gateway field is set.
   */
  boolean hasGateway();
  /**
   *
   *
   * <pre>
   * Required. Gateway resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.Gateway gateway = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gateway.
   */
  com.google.cloud.networkservices.v1.Gateway getGateway();
  /**
   *
   *
   * <pre>
   * Required. Gateway resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.Gateway gateway = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.GatewayOrBuilder getGatewayOrBuilder();
}
