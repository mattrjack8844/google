/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/bigquery/biglake/v1/metastore.proto

package com.google.cloud.bigquery.biglake.v1;

public interface CreateCatalogRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.biglake.v1.CreateCatalogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this catalog will be created.
   * Format: projects/{project_id_or_number}/locations/{location_id}
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
   * Required. The parent resource where this catalog will be created.
   * Format: projects/{project_id_or_number}/locations/{location_id}
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
   * Required. The catalog to create.
   * The `name` field does not need to be provided.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Catalog catalog = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the catalog field is set.
   */
  boolean hasCatalog();
  /**
   *
   *
   * <pre>
   * Required. The catalog to create.
   * The `name` field does not need to be provided.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Catalog catalog = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The catalog.
   */
  com.google.cloud.bigquery.biglake.v1.Catalog getCatalog();
  /**
   *
   *
   * <pre>
   * Required. The catalog to create.
   * The `name` field does not need to be provided.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Catalog catalog = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.biglake.v1.CatalogOrBuilder getCatalogOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the catalog, which will become the final
   * component of the catalog's resource name.
   * </pre>
   *
   * <code>string catalog_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The catalogId.
   */
  java.lang.String getCatalogId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the catalog, which will become the final
   * component of the catalog's resource name.
   * </pre>
   *
   * <code>string catalog_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for catalogId.
   */
  com.google.protobuf.ByteString getCatalogIdBytes();
}
