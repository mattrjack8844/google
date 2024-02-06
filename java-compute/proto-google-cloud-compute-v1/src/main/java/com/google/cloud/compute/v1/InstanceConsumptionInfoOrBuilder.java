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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface InstanceConsumptionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceConsumptionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of virtual CPUs that are available to the instance.
   * </pre>
   *
   * <code>optional int32 guest_cpus = 393356754;</code>
   *
   * @return Whether the guestCpus field is set.
   */
  boolean hasGuestCpus();
  /**
   *
   *
   * <pre>
   * The number of virtual CPUs that are available to the instance.
   * </pre>
   *
   * <code>optional int32 guest_cpus = 393356754;</code>
   *
   * @return The guestCpus.
   */
  int getGuestCpus();

  /**
   *
   *
   * <pre>
   * The amount of local SSD storage available to the instance, defined in GiB.
   * </pre>
   *
   * <code>optional int32 local_ssd_gb = 329237578;</code>
   *
   * @return Whether the localSsdGb field is set.
   */
  boolean hasLocalSsdGb();
  /**
   *
   *
   * <pre>
   * The amount of local SSD storage available to the instance, defined in GiB.
   * </pre>
   *
   * <code>optional int32 local_ssd_gb = 329237578;</code>
   *
   * @return The localSsdGb.
   */
  int getLocalSsdGb();

  /**
   *
   *
   * <pre>
   * The amount of physical memory available to the instance, defined in MiB.
   * </pre>
   *
   * <code>optional int32 memory_mb = 116001171;</code>
   *
   * @return Whether the memoryMb field is set.
   */
  boolean hasMemoryMb();
  /**
   *
   *
   * <pre>
   * The amount of physical memory available to the instance, defined in MiB.
   * </pre>
   *
   * <code>optional int32 memory_mb = 116001171;</code>
   *
   * @return The memoryMb.
   */
  int getMemoryMb();

  /**
   *
   *
   * <pre>
   * The minimal guaranteed number of virtual CPUs that are reserved.
   * </pre>
   *
   * <code>optional int32 min_node_cpus = 317231675;</code>
   *
   * @return Whether the minNodeCpus field is set.
   */
  boolean hasMinNodeCpus();
  /**
   *
   *
   * <pre>
   * The minimal guaranteed number of virtual CPUs that are reserved.
   * </pre>
   *
   * <code>optional int32 min_node_cpus = 317231675;</code>
   *
   * @return The minNodeCpus.
   */
  int getMinNodeCpus();
}
