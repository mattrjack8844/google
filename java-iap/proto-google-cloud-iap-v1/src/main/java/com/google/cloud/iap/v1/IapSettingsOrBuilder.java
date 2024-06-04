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
// source: google/cloud/iap/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.iap.v1;

public interface IapSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iap.v1.IapSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the IAP protected resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the IAP protected resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Top level wrapper for all access related setting in IAP
   * </pre>
   *
   * <code>.google.cloud.iap.v1.AccessSettings access_settings = 5;</code>
   *
   * @return Whether the accessSettings field is set.
   */
  boolean hasAccessSettings();
  /**
   *
   *
   * <pre>
   * Top level wrapper for all access related setting in IAP
   * </pre>
   *
   * <code>.google.cloud.iap.v1.AccessSettings access_settings = 5;</code>
   *
   * @return The accessSettings.
   */
  com.google.cloud.iap.v1.AccessSettings getAccessSettings();
  /**
   *
   *
   * <pre>
   * Top level wrapper for all access related setting in IAP
   * </pre>
   *
   * <code>.google.cloud.iap.v1.AccessSettings access_settings = 5;</code>
   */
  com.google.cloud.iap.v1.AccessSettingsOrBuilder getAccessSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Top level wrapper for all application related settings in IAP
   * </pre>
   *
   * <code>.google.cloud.iap.v1.ApplicationSettings application_settings = 6;</code>
   *
   * @return Whether the applicationSettings field is set.
   */
  boolean hasApplicationSettings();
  /**
   *
   *
   * <pre>
   * Top level wrapper for all application related settings in IAP
   * </pre>
   *
   * <code>.google.cloud.iap.v1.ApplicationSettings application_settings = 6;</code>
   *
   * @return The applicationSettings.
   */
  com.google.cloud.iap.v1.ApplicationSettings getApplicationSettings();
  /**
   *
   *
   * <pre>
   * Top level wrapper for all application related settings in IAP
   * </pre>
   *
   * <code>.google.cloud.iap.v1.ApplicationSettings application_settings = 6;</code>
   */
  com.google.cloud.iap.v1.ApplicationSettingsOrBuilder getApplicationSettingsOrBuilder();
}
