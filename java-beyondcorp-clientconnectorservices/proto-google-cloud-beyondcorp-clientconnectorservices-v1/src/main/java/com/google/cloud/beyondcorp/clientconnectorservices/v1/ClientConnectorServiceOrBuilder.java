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
// source:
// google/cloud/beyondcorp/clientconnectorservices/v1/client_connector_services_service.proto

package com.google.cloud.beyondcorp.clientconnectorservices.v1;

public interface ClientConnectorServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of resource. The name is ignored during creation.
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
   * Required. Name of resource. The name is ignored during creation.
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
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User-provided name.
   * The display name should follow certain format.
   * * Must be 6 to 30 characters in length.
   * * Can only contain lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. User-provided name.
   * The display name should follow certain format.
   * * Must be 6 to 30 characters in length.
   * * Can only contain lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The details of the ingress settings.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Ingress ingress = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the ingress field is set.
   */
  boolean hasIngress();
  /**
   *
   *
   * <pre>
   * Required. The details of the ingress settings.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Ingress ingress = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ingress.
   */
  com.google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Ingress
      getIngress();
  /**
   *
   *
   * <pre>
   * Required. The details of the ingress settings.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Ingress ingress = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.IngressOrBuilder
      getIngressOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The details of the egress settings.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Egress egress = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the egress field is set.
   */
  boolean hasEgress();
  /**
   *
   *
   * <pre>
   * Required. The details of the egress settings.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Egress egress = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The egress.
   */
  com.google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Egress getEgress();
  /**
   *
   *
   * <pre>
   * Required. The details of the egress settings.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Egress egress = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.EgressOrBuilder
      getEgressOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The operational state of the ClientConnectorService.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The operational state of the ClientConnectorService.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.State getState();
}
