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

public interface StartupConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.StartupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The config setting to enable cluster creation/ updation to be
   * successful only after required_registration_fraction of instances are up
   * and running. This configuration is applicable to only secondary workers for
   * now. The cluster will fail if required_registration_fraction of instances
   * are not available. This will include instance creation, agent registration,
   * and service registration (if enabled).
   * </pre>
   *
   * <code>
   * optional double required_registration_fraction = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the requiredRegistrationFraction field is set.
   */
  boolean hasRequiredRegistrationFraction();
  /**
   *
   *
   * <pre>
   * Optional. The config setting to enable cluster creation/ updation to be
   * successful only after required_registration_fraction of instances are up
   * and running. This configuration is applicable to only secondary workers for
   * now. The cluster will fail if required_registration_fraction of instances
   * are not available. This will include instance creation, agent registration,
   * and service registration (if enabled).
   * </pre>
   *
   * <code>
   * optional double required_registration_fraction = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The requiredRegistrationFraction.
   */
  double getRequiredRegistrationFraction();
}
