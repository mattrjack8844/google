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
// source: google/dataflow/v1beta3/templates.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

public interface LaunchFlexTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.LaunchFlexTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Parameter to launch a job form Flex Template.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.LaunchFlexTemplateParameter launch_parameter = 2;</code>
   *
   * @return Whether the launchParameter field is set.
   */
  boolean hasLaunchParameter();
  /**
   *
   *
   * <pre>
   * Required. Parameter to launch a job form Flex Template.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.LaunchFlexTemplateParameter launch_parameter = 2;</code>
   *
   * @return The launchParameter.
   */
  com.google.dataflow.v1beta3.LaunchFlexTemplateParameter getLaunchParameter();
  /**
   *
   *
   * <pre>
   * Required. Parameter to launch a job form Flex Template.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.LaunchFlexTemplateParameter launch_parameter = 2;</code>
   */
  com.google.dataflow.v1beta3.LaunchFlexTemplateParameterOrBuilder getLaunchParameterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
   * which to direct the request. E.g., us-central1, us-west1.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Required. The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
   * which to direct the request. E.g., us-central1, us-west1.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * If true, the request is validated but not actually executed.
   * Defaults to false.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
