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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface ServiceSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ServiceSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specification that applies to Instance entries of `CLOUD_BIGTABLE`
   * system.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudBigtableInstanceSpec cloud_bigtable_instance_spec = 1;
   * </code>
   *
   * @return Whether the cloudBigtableInstanceSpec field is set.
   */
  boolean hasCloudBigtableInstanceSpec();
  /**
   *
   *
   * <pre>
   * Specification that applies to Instance entries of `CLOUD_BIGTABLE`
   * system.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudBigtableInstanceSpec cloud_bigtable_instance_spec = 1;
   * </code>
   *
   * @return The cloudBigtableInstanceSpec.
   */
  com.google.cloud.datacatalog.v1.CloudBigtableInstanceSpec getCloudBigtableInstanceSpec();
  /**
   *
   *
   * <pre>
   * Specification that applies to Instance entries of `CLOUD_BIGTABLE`
   * system.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudBigtableInstanceSpec cloud_bigtable_instance_spec = 1;
   * </code>
   */
  com.google.cloud.datacatalog.v1.CloudBigtableInstanceSpecOrBuilder
      getCloudBigtableInstanceSpecOrBuilder();

  com.google.cloud.datacatalog.v1.ServiceSpec.SystemSpecCase getSystemSpecCase();
}
