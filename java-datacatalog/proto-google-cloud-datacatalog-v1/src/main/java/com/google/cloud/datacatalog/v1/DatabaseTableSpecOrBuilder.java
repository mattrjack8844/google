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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface DatabaseTableSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.DatabaseTableSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of this table.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Type of this table.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.datacatalog.v1.DatabaseTableSpec.TableType getType();

  /**
   *
   *
   * <pre>
   * Output only. Fields specific to a Dataplex table and present only in the
   * Dataplex table entries.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataplexTable field is set.
   */
  boolean hasDataplexTable();
  /**
   *
   *
   * <pre>
   * Output only. Fields specific to a Dataplex table and present only in the
   * Dataplex table entries.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataplexTable.
   */
  com.google.cloud.datacatalog.v1.DataplexTableSpec getDataplexTable();
  /**
   *
   *
   * <pre>
   * Output only. Fields specific to a Dataplex table and present only in the
   * Dataplex table entries.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.DataplexTableSpec dataplex_table = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.v1.DataplexTableSpecOrBuilder getDataplexTableOrBuilder();

  /**
   *
   *
   * <pre>
   * Spec what aplies to tables that are actually views.
   * Not set for "real" tables.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.DatabaseViewSpec database_view_spec = 3;
   * </code>
   *
   * @return Whether the databaseViewSpec field is set.
   */
  boolean hasDatabaseViewSpec();
  /**
   *
   *
   * <pre>
   * Spec what aplies to tables that are actually views.
   * Not set for "real" tables.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.DatabaseViewSpec database_view_spec = 3;
   * </code>
   *
   * @return The databaseViewSpec.
   */
  com.google.cloud.datacatalog.v1.DatabaseTableSpec.DatabaseViewSpec getDatabaseViewSpec();
  /**
   *
   *
   * <pre>
   * Spec what aplies to tables that are actually views.
   * Not set for "real" tables.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec.DatabaseViewSpec database_view_spec = 3;
   * </code>
   */
  com.google.cloud.datacatalog.v1.DatabaseTableSpec.DatabaseViewSpecOrBuilder
      getDatabaseViewSpecOrBuilder();
}
