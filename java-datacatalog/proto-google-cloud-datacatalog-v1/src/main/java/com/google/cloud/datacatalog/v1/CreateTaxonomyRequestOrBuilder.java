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

public interface CreateTaxonomyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.CreateTaxonomyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the project that the taxonomy will belong to.
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
   * Required. Resource name of the project that the taxonomy will belong to.
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
   * The taxonomy to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 2;</code>
   *
   * @return Whether the taxonomy field is set.
   */
  boolean hasTaxonomy();
  /**
   *
   *
   * <pre>
   * The taxonomy to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 2;</code>
   *
   * @return The taxonomy.
   */
  com.google.cloud.datacatalog.v1.Taxonomy getTaxonomy();
  /**
   *
   *
   * <pre>
   * The taxonomy to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Taxonomy taxonomy = 2;</code>
   */
  com.google.cloud.datacatalog.v1.TaxonomyOrBuilder getTaxonomyOrBuilder();
}
