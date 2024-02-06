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
// source: google/cloud/datacatalog/v1/policytagmanager.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface UpdateTaxonomyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.UpdateTaxonomyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The taxonomy to update. You can update only its description, display name,
   * and activated policy types.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
   *
   * @return Whether the taxonomy field is set.
   */
  boolean hasTaxonomy();
  /**
   *
   *
   * <pre>
   * The taxonomy to update. You can update only its description, display name,
   * and activated policy types.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
   *
   * @return The taxonomy.
   */
  com.google.cloud.datacatalog.v1.Taxonomy getTaxonomy();
  /**
   *
   *
   * <pre>
   * The taxonomy to update. You can update only its description, display name,
   * and activated policy types.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 1;</code>
   */
  com.google.cloud.datacatalog.v1.TaxonomyOrBuilder getTaxonomyOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies fields to update. If not set, defaults to all fields you can
   * update.
   *
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Specifies fields to update. If not set, defaults to all fields you can
   * update.
   *
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Specifies fields to update. If not set, defaults to all fields you can
   * update.
   *
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
