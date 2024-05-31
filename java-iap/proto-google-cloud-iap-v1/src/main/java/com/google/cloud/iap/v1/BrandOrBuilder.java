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

public interface BrandOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iap.v1.Brand)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Identifier of the brand.
   * NOTE: GCP project number achieves the same brand identification purpose as
   * only one brand per project can be created.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Identifier of the brand.
   * NOTE: GCP project number achieves the same brand identification purpose as
   * only one brand per project can be created.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Support email displayed on the OAuth consent screen.
   * </pre>
   *
   * <code>string support_email = 2;</code>
   *
   * @return The supportEmail.
   */
  java.lang.String getSupportEmail();
  /**
   *
   *
   * <pre>
   * Support email displayed on the OAuth consent screen.
   * </pre>
   *
   * <code>string support_email = 2;</code>
   *
   * @return The bytes for supportEmail.
   */
  com.google.protobuf.ByteString getSupportEmailBytes();

  /**
   *
   *
   * <pre>
   * Application name displayed on OAuth consent screen.
   * </pre>
   *
   * <code>string application_title = 3;</code>
   *
   * @return The applicationTitle.
   */
  java.lang.String getApplicationTitle();
  /**
   *
   *
   * <pre>
   * Application name displayed on OAuth consent screen.
   * </pre>
   *
   * <code>string application_title = 3;</code>
   *
   * @return The bytes for applicationTitle.
   */
  com.google.protobuf.ByteString getApplicationTitleBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether the brand is only intended for usage inside the
   * G Suite organization only.
   * </pre>
   *
   * <code>bool org_internal_only = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The orgInternalOnly.
   */
  boolean getOrgInternalOnly();
}
