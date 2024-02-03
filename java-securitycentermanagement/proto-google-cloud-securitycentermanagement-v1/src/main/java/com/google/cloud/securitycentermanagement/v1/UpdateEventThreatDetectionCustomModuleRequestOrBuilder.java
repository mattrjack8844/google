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

public interface UpdateEventThreatDetectionCustomModuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.UpdateEventThreatDetectionCustomModuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * EventThreatDetectionCustomModule resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * EventThreatDetectionCustomModule resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * EventThreatDetectionCustomModule resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The module being updated
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the eventThreatDetectionCustomModule field is set.
   */
  boolean hasEventThreatDetectionCustomModule();
  /**
   *
   *
   * <pre>
   * Required. The module being updated
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
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
   * Required. The module being updated
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModuleOrBuilder
      getEventThreatDetectionCustomModuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. When set to true, only validations (including IAM checks) will
   * done for the request (module will not be updated). An OK response indicates
   * the request is valid while an error response indicates the request is
   * invalid. Note that a subsequent request to actually update the module could
   * still fail because 1. the state could have changed (e.g. IAM permission
   * lost) or
   * 2. A failure occurred while trying to update the module.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
