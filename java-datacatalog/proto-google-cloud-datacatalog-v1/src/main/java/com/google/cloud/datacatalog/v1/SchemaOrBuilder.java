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
// source: google/cloud/datacatalog/v1/schema.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface SchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unified GoogleSQL-like schema of columns.
   *
   * The overall maximum number of columns and nested columns is 10,000.
   * The maximum nested depth is 15 levels.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema columns = 2;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.ColumnSchema> getColumnsList();
  /**
   *
   *
   * <pre>
   * The unified GoogleSQL-like schema of columns.
   *
   * The overall maximum number of columns and nested columns is 10,000.
   * The maximum nested depth is 15 levels.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema columns = 2;</code>
   */
  com.google.cloud.datacatalog.v1.ColumnSchema getColumns(int index);
  /**
   *
   *
   * <pre>
   * The unified GoogleSQL-like schema of columns.
   *
   * The overall maximum number of columns and nested columns is 10,000.
   * The maximum nested depth is 15 levels.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema columns = 2;</code>
   */
  int getColumnsCount();
  /**
   *
   *
   * <pre>
   * The unified GoogleSQL-like schema of columns.
   *
   * The overall maximum number of columns and nested columns is 10,000.
   * The maximum nested depth is 15 levels.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema columns = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.ColumnSchemaOrBuilder>
      getColumnsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The unified GoogleSQL-like schema of columns.
   *
   * The overall maximum number of columns and nested columns is 10,000.
   * The maximum nested depth is 15 levels.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema columns = 2;</code>
   */
  com.google.cloud.datacatalog.v1.ColumnSchemaOrBuilder getColumnsOrBuilder(int index);
}
