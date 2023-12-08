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
// source: google/cloud/vertexai/v1beta1/endpoint_service.proto

package com.google.cloud.vertexai.v1beta1;

public interface CreateEndpointRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.CreateEndpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the Endpoint in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location to create the Endpoint in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The Endpoint to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.Endpoint endpoint = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The Endpoint to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.Endpoint endpoint = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The endpoint.
   */
  com.google.cloud.vertexai.v1beta1.Endpoint getEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The Endpoint to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.Endpoint endpoint = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.vertexai.v1beta1.EndpointOrBuilder getEndpointOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. The ID to use for endpoint, which will become the final
   * component of the endpoint resource name.
   * If not provided, Vertex AI will generate a value for this ID.
   *
   * If the first character is a letter, this value may be up to 63 characters,
   * and valid characters are `[a-z0-9-]`. The last character must be a letter
   * or number.
   *
   * If the first character is a number, this value may be up to 9 characters,
   * and valid characters are `[0-9]` with no leading zeros.
   *
   * When using HTTP/JSON, this field is populated
   * based on a query string argument, such as `?endpoint_id=12345`. This is the
   * fallback for fields that are not included in either the URI or the body.
   * </pre>
   *
   * <code>string endpoint_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The endpointId.
   */
  java.lang.String getEndpointId();
  /**
   *
   *
   * <pre>
   * Immutable. The ID to use for endpoint, which will become the final
   * component of the endpoint resource name.
   * If not provided, Vertex AI will generate a value for this ID.
   *
   * If the first character is a letter, this value may be up to 63 characters,
   * and valid characters are `[a-z0-9-]`. The last character must be a letter
   * or number.
   *
   * If the first character is a number, this value may be up to 9 characters,
   * and valid characters are `[0-9]` with no leading zeros.
   *
   * When using HTTP/JSON, this field is populated
   * based on a query string argument, such as `?endpoint_id=12345`. This is the
   * fallback for fields that are not included in either the URI or the body.
   * </pre>
   *
   * <code>string endpoint_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for endpointId.
   */
  com.google.protobuf.ByteString getEndpointIdBytes();
}
