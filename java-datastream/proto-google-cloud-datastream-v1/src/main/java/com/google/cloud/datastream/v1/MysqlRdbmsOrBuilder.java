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

public interface MysqlRdbmsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.MysqlRdbms)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlDatabase mysql_databases = 1;</code>
   */
  java.util.List<com.google.cloud.datastream.v1.MysqlDatabase> getMysqlDatabasesList();
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlDatabase mysql_databases = 1;</code>
   */
  com.google.cloud.datastream.v1.MysqlDatabase getMysqlDatabases(int index);
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlDatabase mysql_databases = 1;</code>
   */
  int getMysqlDatabasesCount();
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlDatabase mysql_databases = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.MysqlDatabaseOrBuilder>
      getMysqlDatabasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlDatabase mysql_databases = 1;</code>
   */
  com.google.cloud.datastream.v1.MysqlDatabaseOrBuilder getMysqlDatabasesOrBuilder(int index);
}
