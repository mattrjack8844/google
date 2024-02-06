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
// source: google/cloud/datastream/v1/datastream_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1;

public interface MysqlDatabaseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.MysqlDatabase)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Database name.
   * </pre>
   *
   * <code>string database = 1;</code>
   *
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   *
   *
   * <pre>
   * Database name.
   * </pre>
   *
   * <code>string database = 1;</code>
   *
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString getDatabaseBytes();

  /**
   *
   *
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  java.util.List<com.google.cloud.datastream.v1.MysqlTable> getMysqlTablesList();
  /**
   *
   *
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  com.google.cloud.datastream.v1.MysqlTable getMysqlTables(int index);
  /**
   *
   *
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  int getMysqlTablesCount();
  /**
   *
   *
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.MysqlTableOrBuilder>
      getMysqlTablesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Tables in the database.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlTable mysql_tables = 2;</code>
   */
  com.google.cloud.datastream.v1.MysqlTableOrBuilder getMysqlTablesOrBuilder(int index);
}
