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

public interface VmEndpointNatMappingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VmEndpointNatMappings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the VM instance which the endpoint belongs to
   * </pre>
   *
   * <code>optional string instance_name = 227947509;</code>
   *
   * @return Whether the instanceName field is set.
   */
  boolean hasInstanceName();
  /**
   *
   *
   * <pre>
   * Name of the VM instance which the endpoint belongs to
   * </pre>
   *
   * <code>optional string instance_name = 227947509;</code>
   *
   * @return The instanceName.
   */
  java.lang.String getInstanceName();
  /**
   *
   *
   * <pre>
   * Name of the VM instance which the endpoint belongs to
   * </pre>
   *
   * <code>optional string instance_name = 227947509;</code>
   *
   * @return The bytes for instanceName.
   */
  com.google.protobuf.ByteString getInstanceNameBytes();

  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>
      getInterfaceNatMappingsList();
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings getInterfaceNatMappings(
      int index);
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  int getInterfaceNatMappingsCount();
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder>
      getInterfaceNatMappingsOrBuilderList();
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder
      getInterfaceNatMappingsOrBuilder(int index);
}
