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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface ClusterStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ClusterStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The cluster's state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The cluster's state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dataproc.v1.ClusterStatus.State getState();

  /**
   *
   *
   * <pre>
   * Optional. Output only. Details of cluster's state.
   * </pre>
   *
   * <code>
   * string detail = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The detail.
   */
  java.lang.String getDetail();
  /**
   *
   *
   * <pre>
   * Optional. Output only. Details of cluster's state.
   * </pre>
   *
   * <code>
   * string detail = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString getDetailBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when this state was entered (see JSON representation of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the stateStartTime field is set.
   */
  boolean hasStateStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this state was entered (see JSON representation of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stateStartTime.
   */
  com.google.protobuf.Timestamp getStateStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this state was entered (see JSON representation of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStateStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Additional state information that includes
   * status reported by the agent.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterStatus.Substate substate = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for substate.
   */
  int getSubstateValue();
  /**
   *
   *
   * <pre>
   * Output only. Additional state information that includes
   * status reported by the agent.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterStatus.Substate substate = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The substate.
   */
  com.google.cloud.dataproc.v1.ClusterStatus.Substate getSubstate();
}
