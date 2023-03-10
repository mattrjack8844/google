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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

public interface CreateEntryGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateEntryGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project this entry group is in. Example:
   * * projects/{project_id}/locations/{location}
   * Note that this EntryGroup and its child resources may not actually be
   * stored in the location in this name.
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
   * Required. The name of the project this entry group is in. Example:
   * * projects/{project_id}/locations/{location}
   * Note that this EntryGroup and its child resources may not actually be
   * stored in the location in this name.
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
   * Required. The id of the entry group to create.
   * The id must begin with a letter or underscore, contain only English
   * letters, numbers and underscores, and be at most 64 characters.
   * </pre>
   *
   * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entryGroupId.
   */
  java.lang.String getEntryGroupId();
  /**
   *
   *
   * <pre>
   * Required. The id of the entry group to create.
   * The id must begin with a letter or underscore, contain only English
   * letters, numbers and underscores, and be at most 64 characters.
   * </pre>
   *
   * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entryGroupId.
   */
  com.google.protobuf.ByteString getEntryGroupIdBytes();

  /**
   *
   *
   * <pre>
   * The entry group to create. Defaults to an empty entry group.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryGroup entry_group = 2;</code>
   *
   * @return Whether the entryGroup field is set.
   */
  boolean hasEntryGroup();
  /**
   *
   *
   * <pre>
   * The entry group to create. Defaults to an empty entry group.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryGroup entry_group = 2;</code>
   *
   * @return The entryGroup.
   */
  com.google.cloud.datacatalog.v1beta1.EntryGroup getEntryGroup();
  /**
   *
   *
   * <pre>
   * The entry group to create. Defaults to an empty entry group.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryGroup entry_group = 2;</code>
   */
  com.google.cloud.datacatalog.v1beta1.EntryGroupOrBuilder getEntryGroupOrBuilder();
}
