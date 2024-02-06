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
// source: google/cloud/datacatalog/v1beta1/policytagmanagerserialization.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1beta1;

public interface InlineSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.InlineSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Taxonomies to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.datacatalog.v1beta1.SerializedTaxonomy> getTaxonomiesList();
  /**
   *
   *
   * <pre>
   * Required. Taxonomies to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.SerializedTaxonomy getTaxonomies(int index);
  /**
   *
   *
   * <pre>
   * Required. Taxonomies to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getTaxonomiesCount();
  /**
   *
   *
   * <pre>
   * Required. Taxonomies to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1beta1.SerializedTaxonomyOrBuilder>
      getTaxonomiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Taxonomies to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.SerializedTaxonomyOrBuilder getTaxonomiesOrBuilder(
      int index);
}
