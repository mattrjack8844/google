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
// source: google/cloud/billing/v1/cloud_catalog.proto

package com.google.cloud.billing.v1;

public interface GeoTaxonomyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.GeoTaxonomy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of Geo Taxonomy: GLOBAL, REGIONAL, or MULTI_REGIONAL.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.GeoTaxonomy.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of Geo Taxonomy: GLOBAL, REGIONAL, or MULTI_REGIONAL.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.GeoTaxonomy.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.billing.v1.GeoTaxonomy.Type getType();

  /**
   *
   *
   * <pre>
   * The list of regions associated with a sku. Empty for Global skus, which are
   * associated with all Google Cloud regions.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @return A list containing the regions.
   */
  java.util.List<java.lang.String> getRegionsList();
  /**
   *
   *
   * <pre>
   * The list of regions associated with a sku. Empty for Global skus, which are
   * associated with all Google Cloud regions.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @return The count of regions.
   */
  int getRegionsCount();
  /**
   *
   *
   * <pre>
   * The list of regions associated with a sku. Empty for Global skus, which are
   * associated with all Google Cloud regions.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The regions at the given index.
   */
  java.lang.String getRegions(int index);
  /**
   *
   *
   * <pre>
   * The list of regions associated with a sku. Empty for Global skus, which are
   * associated with all Google Cloud regions.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the regions at the given index.
   */
  com.google.protobuf.ByteString getRegionsBytes(int index);
}
