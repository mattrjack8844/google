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
// source: google/cloud/vertexai/v1beta1/machine_resources.proto

package com.google.cloud.vertexai.v1beta1;

public interface ResourcesConsumedOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.ResourcesConsumed)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The number of replica hours used. Note that many replicas may
   * run in parallel, and additionally any given work may be queued for some
   * time. Therefore this value is not strictly related to wall time.
   * </pre>
   *
   * <code>double replica_hours = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The replicaHours.
   */
  double getReplicaHours();
}
