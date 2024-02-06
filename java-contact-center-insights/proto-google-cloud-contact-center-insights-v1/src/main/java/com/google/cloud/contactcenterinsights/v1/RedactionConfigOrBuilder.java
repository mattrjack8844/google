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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contactcenterinsights.v1;

public interface RedactionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.RedactionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fully-qualified DLP deidentify template resource name.
   * Format:
   * `projects/{project}/deidentifyTemplates/{template}`
   * </pre>
   *
   * <code>string deidentify_template = 1;</code>
   *
   * @return The deidentifyTemplate.
   */
  java.lang.String getDeidentifyTemplate();
  /**
   *
   *
   * <pre>
   * The fully-qualified DLP deidentify template resource name.
   * Format:
   * `projects/{project}/deidentifyTemplates/{template}`
   * </pre>
   *
   * <code>string deidentify_template = 1;</code>
   *
   * @return The bytes for deidentifyTemplate.
   */
  com.google.protobuf.ByteString getDeidentifyTemplateBytes();

  /**
   *
   *
   * <pre>
   * The fully-qualified DLP inspect template resource name.
   * Format:
   * `projects/{project}/locations/{location}/inspectTemplates/{template}`
   * </pre>
   *
   * <code>string inspect_template = 2;</code>
   *
   * @return The inspectTemplate.
   */
  java.lang.String getInspectTemplate();
  /**
   *
   *
   * <pre>
   * The fully-qualified DLP inspect template resource name.
   * Format:
   * `projects/{project}/locations/{location}/inspectTemplates/{template}`
   * </pre>
   *
   * <code>string inspect_template = 2;</code>
   *
   * @return The bytes for inspectTemplate.
   */
  com.google.protobuf.ByteString getInspectTemplateBytes();
}
