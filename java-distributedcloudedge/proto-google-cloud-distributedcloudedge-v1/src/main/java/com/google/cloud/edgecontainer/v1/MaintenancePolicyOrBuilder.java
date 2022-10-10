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
// source: google/cloud/edgecontainer/v1/resources.proto

package com.google.cloud.edgecontainer.v1;

public interface MaintenancePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.MaintenancePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.MaintenanceWindow window = 1;</code>
   *
   * @return Whether the window field is set.
   */
  boolean hasWindow();
  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.MaintenanceWindow window = 1;</code>
   *
   * @return The window.
   */
  com.google.cloud.edgecontainer.v1.MaintenanceWindow getWindow();
  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.MaintenanceWindow window = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.MaintenanceWindowOrBuilder getWindowOrBuilder();
}
