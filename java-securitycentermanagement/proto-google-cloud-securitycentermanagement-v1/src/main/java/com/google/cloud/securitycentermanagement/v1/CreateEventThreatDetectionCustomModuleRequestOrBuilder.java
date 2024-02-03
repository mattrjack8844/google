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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycentermanagement.v1;

public interface CreateEventThreatDetectionCustomModuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.CreateEventThreatDetectionCustomModuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of parent for the module. Its format is
   * "organizations/{organization}/locations/{location}",
   * "folders/{folder}/locations/{location}",
   * or
   * "projects/{project}/locations/{location}"
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Name of parent for the module. Its format is
   * "organizations/{organization}/locations/{location}",
   * "folders/{folder}/locations/{location}",
   * or
   * "projects/{project}/locations/{location}"
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The module to create. The
   * event_threat_detection_custom_module.name will be ignored and server
   * generated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the eventThreatDetectionCustomModule field is set.
   */
  boolean hasEventThreatDetectionCustomModule();
  /**
   *
   *
   * <pre>
   * Required. The module to create. The
   * event_threat_detection_custom_module.name will be ignored and server
   * generated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The eventThreatDetectionCustomModule.
   */
  com.google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule
      getEventThreatDetectionCustomModule();
  /**
   *
   *
   * <pre>
   * Required. The module to create. The
   * event_threat_detection_custom_module.name will be ignored and server
   * generated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModuleOrBuilder
      getEventThreatDetectionCustomModuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. When set to true, only validations (including IAM checks) will
   * done for the request (no module will be created). An OK response indicates
   * the request is valid while an error response indicates the request is
   * invalid. Note that a subsequent request to actually create the module could
   * still fail because 1. the state could have changed (e.g. IAM permission
   * lost) or
   * 2. A failure occurred during creation of the module.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
