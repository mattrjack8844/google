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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

public interface RemoveFromFolderActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.RemoveFromFolderAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Condition of the action to be executed.
   * </pre>
   *
   * <code>string condition = 1;</code>
   *
   * @return The condition.
   */
  java.lang.String getCondition();
  /**
   *
   *
   * <pre>
   * Condition of the action to be executed.
   * </pre>
   *
   * <code>string condition = 1;</code>
   *
   * @return The bytes for condition.
   */
  com.google.protobuf.ByteString getConditionBytes();

  /**
   *
   *
   * <pre>
   * Name of the folder under which new document is to be added.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The folder.
   */
  java.lang.String getFolder();
  /**
   *
   *
   * <pre>
   * Name of the folder under which new document is to be added.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for folder.
   */
  com.google.protobuf.ByteString getFolderBytes();
}
