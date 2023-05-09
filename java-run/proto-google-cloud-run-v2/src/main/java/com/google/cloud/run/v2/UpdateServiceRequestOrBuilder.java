/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/run/v2/service.proto

package com.google.cloud.run.v2;

public interface UpdateServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.UpdateServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Service to be updated.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Service service = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * Required. The Service to be updated.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Service service = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The service.
   */
  com.google.cloud.run.v2.Service getService();
  /**
   *
   *
   * <pre>
   * Required. The Service to be updated.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Service service = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.run.v2.ServiceOrBuilder getServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates that the request should be validated and default values
   * populated, without persisting the request or updating any resources.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * If set to true, and if the Service does not exist, it will create a new
   * one. The caller must have 'run.services.create' permissions if this is set
   * to true and the Service does not exist.
   * </pre>
   *
   * <code>bool allow_missing = 4;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
