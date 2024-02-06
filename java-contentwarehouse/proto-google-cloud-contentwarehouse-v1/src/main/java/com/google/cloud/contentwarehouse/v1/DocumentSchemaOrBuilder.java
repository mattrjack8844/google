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
// source: google/cloud/contentwarehouse/v1/document_schema.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

public interface DocumentSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.DocumentSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the document schema.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   *
   * The name is ignored when creating a document schema.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the document schema.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   *
   * The name is ignored when creating a document schema.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Name of the schema given by the user. Must be unique per project.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Name of the schema given by the user. Must be unique per project.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Document details.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 3;
   * </code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.PropertyDefinition>
      getPropertyDefinitionsList();
  /**
   *
   *
   * <pre>
   * Document details.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 3;
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.PropertyDefinition getPropertyDefinitions(int index);
  /**
   *
   *
   * <pre>
   * Document details.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 3;
   * </code>
   */
  int getPropertyDefinitionsCount();
  /**
   *
   *
   * <pre>
   * Document details.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.PropertyDefinitionOrBuilder>
      getPropertyDefinitionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Document details.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 3;
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.PropertyDefinitionOrBuilder getPropertyDefinitionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Document Type, true refers the document is a folder, otherwise it is
   * a typical document.
   * </pre>
   *
   * <code>bool document_is_folder = 4;</code>
   *
   * @return The documentIsFolder.
   */
  boolean getDocumentIsFolder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document schema is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the document schema is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the document schema is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document schema is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the document schema is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the document schema is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Schema description.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Schema description.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
