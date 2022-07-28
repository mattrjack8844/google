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
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

public interface RolloutOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.Rollout)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Unique identifier of this Rollout. Must be no longer than 63
   * characters and only lower case letters, digits, '.', '_' and '-' are
   * allowed.
   * If not specified by client, the server will generate one. The generated id
   * will have the form of &lt;date&gt;&lt;revision number&gt;, where "date" is the create
   * date in ISO 8601 format.  "revision number" is a monotonically increasing
   * positive number that is reset every day for each service.
   * An example of the generated rollout_id is '2016-02-16r1'
   * </pre>
   *
   * <code>string rollout_id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rolloutId.
   */
  java.lang.String getRolloutId();
  /**
   *
   *
   * <pre>
   * Optional. Unique identifier of this Rollout. Must be no longer than 63
   * characters and only lower case letters, digits, '.', '_' and '-' are
   * allowed.
   * If not specified by client, the server will generate one. The generated id
   * will have the form of &lt;date&gt;&lt;revision number&gt;, where "date" is the create
   * date in ISO 8601 format.  "revision number" is a monotonically increasing
   * positive number that is reset every day for each service.
   * An example of the generated rollout_id is '2016-02-16r1'
   * </pre>
   *
   * <code>string rollout_id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for rolloutId.
   */
  com.google.protobuf.ByteString getRolloutIdBytes();

  /**
   *
   *
   * <pre>
   * Creation time of the rollout. Readonly.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Creation time of the rollout. Readonly.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Creation time of the rollout. Readonly.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The user who created the Rollout. Readonly.
   * </pre>
   *
   * <code>string created_by = 3;</code>
   *
   * @return The createdBy.
   */
  java.lang.String getCreatedBy();
  /**
   *
   *
   * <pre>
   * The user who created the Rollout. Readonly.
   * </pre>
   *
   * <code>string created_by = 3;</code>
   *
   * @return The bytes for createdBy.
   */
  com.google.protobuf.ByteString getCreatedByBytes();

  /**
   *
   *
   * <pre>
   * The status of this rollout. Readonly. In case of a failed rollout,
   * the system will automatically rollback to the current Rollout
   * version. Readonly.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.Rollout.RolloutStatus status = 4;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * The status of this rollout. Readonly. In case of a failed rollout,
   * the system will automatically rollback to the current Rollout
   * version. Readonly.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.Rollout.RolloutStatus status = 4;</code>
   *
   * @return The status.
   */
  com.google.api.servicemanagement.v1.Rollout.RolloutStatus getStatus();

  /**
   *
   *
   * <pre>
   * Google Service Control selects service configurations based on
   * traffic percentage.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout.TrafficPercentStrategy traffic_percent_strategy = 5;
   * </code>
   *
   * @return Whether the trafficPercentStrategy field is set.
   */
  boolean hasTrafficPercentStrategy();
  /**
   *
   *
   * <pre>
   * Google Service Control selects service configurations based on
   * traffic percentage.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout.TrafficPercentStrategy traffic_percent_strategy = 5;
   * </code>
   *
   * @return The trafficPercentStrategy.
   */
  com.google.api.servicemanagement.v1.Rollout.TrafficPercentStrategy getTrafficPercentStrategy();
  /**
   *
   *
   * <pre>
   * Google Service Control selects service configurations based on
   * traffic percentage.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout.TrafficPercentStrategy traffic_percent_strategy = 5;
   * </code>
   */
  com.google.api.servicemanagement.v1.Rollout.TrafficPercentStrategyOrBuilder
      getTrafficPercentStrategyOrBuilder();

  /**
   *
   *
   * <pre>
   * The strategy associated with a rollout to delete a `ManagedService`.
   * Readonly.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout.DeleteServiceStrategy delete_service_strategy = 200;
   * </code>
   *
   * @return Whether the deleteServiceStrategy field is set.
   */
  boolean hasDeleteServiceStrategy();
  /**
   *
   *
   * <pre>
   * The strategy associated with a rollout to delete a `ManagedService`.
   * Readonly.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout.DeleteServiceStrategy delete_service_strategy = 200;
   * </code>
   *
   * @return The deleteServiceStrategy.
   */
  com.google.api.servicemanagement.v1.Rollout.DeleteServiceStrategy getDeleteServiceStrategy();
  /**
   *
   *
   * <pre>
   * The strategy associated with a rollout to delete a `ManagedService`.
   * Readonly.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout.DeleteServiceStrategy delete_service_strategy = 200;
   * </code>
   */
  com.google.api.servicemanagement.v1.Rollout.DeleteServiceStrategyOrBuilder
      getDeleteServiceStrategyOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the service associated with this Rollout.
   * </pre>
   *
   * <code>string service_name = 8;</code>
   *
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   *
   *
   * <pre>
   * The name of the service associated with this Rollout.
   * </pre>
   *
   * <code>string service_name = 8;</code>
   *
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString getServiceNameBytes();

  public com.google.api.servicemanagement.v1.Rollout.StrategyCase getStrategyCase();
}
