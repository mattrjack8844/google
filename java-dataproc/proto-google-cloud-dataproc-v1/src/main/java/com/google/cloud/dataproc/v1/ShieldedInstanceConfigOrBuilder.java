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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface ShieldedInstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ShieldedInstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Defines whether instances have Secure Boot enabled.
   * </pre>
   *
   * <code>optional bool enable_secure_boot = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the enableSecureBoot field is set.
   */
  boolean hasEnableSecureBoot();
  /**
   *
   *
   * <pre>
   * Optional. Defines whether instances have Secure Boot enabled.
   * </pre>
   *
   * <code>optional bool enable_secure_boot = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableSecureBoot.
   */
  boolean getEnableSecureBoot();

  /**
   *
   *
   * <pre>
   * Optional. Defines whether instances have the vTPM enabled.
   * </pre>
   *
   * <code>optional bool enable_vtpm = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the enableVtpm field is set.
   */
  boolean hasEnableVtpm();
  /**
   *
   *
   * <pre>
   * Optional. Defines whether instances have the vTPM enabled.
   * </pre>
   *
   * <code>optional bool enable_vtpm = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableVtpm.
   */
  boolean getEnableVtpm();

  /**
   *
   *
   * <pre>
   * Optional. Defines whether instances have integrity monitoring enabled.
   * </pre>
   *
   * <code>optional bool enable_integrity_monitoring = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the enableIntegrityMonitoring field is set.
   */
  boolean hasEnableIntegrityMonitoring();
  /**
   *
   *
   * <pre>
   * Optional. Defines whether instances have integrity monitoring enabled.
   * </pre>
   *
   * <code>optional bool enable_integrity_monitoring = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enableIntegrityMonitoring.
   */
  boolean getEnableIntegrityMonitoring();
}
