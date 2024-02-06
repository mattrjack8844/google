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
// source: google/cloud/datafusion/v1/datafusion.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datafusion.v1;

public interface NetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the network in the customer project with which the Tenant Project
   * will be peered for executing pipelines. In case of shared VPC where the
   * network resides in another host project the network should specified in
   * the form of projects/{host-project-id}/global/networks/{network}
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Name of the network in the customer project with which the Tenant Project
   * will be peered for executing pipelines. In case of shared VPC where the
   * network resides in another host project the network should specified in
   * the form of projects/{host-project-id}/global/networks/{network}
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * The IP range in CIDR notation to use for the managed Data Fusion instance
   * nodes. This range must not overlap with any other ranges used in the
   * customer network.
   * </pre>
   *
   * <code>string ip_allocation = 2;</code>
   *
   * @return The ipAllocation.
   */
  java.lang.String getIpAllocation();
  /**
   *
   *
   * <pre>
   * The IP range in CIDR notation to use for the managed Data Fusion instance
   * nodes. This range must not overlap with any other ranges used in the
   * customer network.
   * </pre>
   *
   * <code>string ip_allocation = 2;</code>
   *
   * @return The bytes for ipAllocation.
   */
  com.google.protobuf.ByteString getIpAllocationBytes();
}
