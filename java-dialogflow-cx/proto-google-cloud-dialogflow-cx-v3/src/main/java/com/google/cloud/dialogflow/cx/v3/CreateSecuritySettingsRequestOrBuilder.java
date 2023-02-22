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
// source: google/cloud/dialogflow/cx/v3/security_settings.proto

package com.google.cloud.dialogflow.cx.v3;

public interface CreateSecuritySettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The location to create an
   * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Required. The location to create an
   * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Required. The security settings to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the securitySettings field is set.
   */
  boolean hasSecuritySettings();
  /**
   *
   *
   * <pre>
   * Required. The security settings to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The securitySettings.
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettings getSecuritySettings();
  /**
   *
   *
   * <pre>
   * Required. The security settings to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.SecuritySettingsOrBuilder getSecuritySettingsOrBuilder();
}
