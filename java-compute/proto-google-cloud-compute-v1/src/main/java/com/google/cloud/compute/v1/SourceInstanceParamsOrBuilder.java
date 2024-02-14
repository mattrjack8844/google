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

public interface SourceInstanceParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SourceInstanceParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.DiskInstantiationConfig> getDiskConfigsList();
  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  com.google.cloud.compute.v1.DiskInstantiationConfig getDiskConfigs(int index);
  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  int getDiskConfigsCount();
  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder>
      getDiskConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder getDiskConfigsOrBuilder(int index);
}
