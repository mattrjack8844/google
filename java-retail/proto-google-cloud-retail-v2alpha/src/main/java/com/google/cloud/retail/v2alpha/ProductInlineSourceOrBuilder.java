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
// source: google/cloud/retail/v2alpha/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface ProductInlineSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ProductInlineSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.Product> getProductsList();
  /**
   *
   *
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2alpha.Product getProducts(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getProductsCount();
  /**
   *
   *
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.ProductOrBuilder>
      getProductsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2alpha.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.Product products = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2alpha.ProductOrBuilder getProductsOrBuilder(int index);
}
