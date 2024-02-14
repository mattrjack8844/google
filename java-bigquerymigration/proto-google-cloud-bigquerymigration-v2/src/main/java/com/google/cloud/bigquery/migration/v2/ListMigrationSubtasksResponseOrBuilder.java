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
// source: google/cloud/bigquery/migration/v2/migration_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.migration.v2;

public interface ListMigrationSubtasksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.ListMigrationSubtasksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationSubtask migration_subtasks = 1;
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2.MigrationSubtask>
      getMigrationSubtasksList();
  /**
   *
   *
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationSubtask migration_subtasks = 1;
   * </code>
   */
  com.google.cloud.bigquery.migration.v2.MigrationSubtask getMigrationSubtasks(int index);
  /**
   *
   *
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationSubtask migration_subtasks = 1;
   * </code>
   */
  int getMigrationSubtasksCount();
  /**
   *
   *
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationSubtask migration_subtasks = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2.MigrationSubtaskOrBuilder>
      getMigrationSubtasksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationSubtask migration_subtasks = 1;
   * </code>
   */
  com.google.cloud.bigquery.migration.v2.MigrationSubtaskOrBuilder getMigrationSubtasksOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
