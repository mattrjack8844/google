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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1beta1;

public interface TargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.Target)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The action's database (Google Cloud project ID) .
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
   * The action's database (Google Cloud project ID) .
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
   * The action's schema (BigQuery dataset ID), within `database`.
   * </pre>
   *
   * <code>string schema = 2;</code>
   *
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   *
   *
   * <pre>
   * The action's schema (BigQuery dataset ID), within `database`.
   * </pre>
   *
   * <code>string schema = 2;</code>
   *
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString getSchemaBytes();

  /**
   *
   *
   * <pre>
   * The action's name, within `database` and `schema`.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The action's name, within `database` and `schema`.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
