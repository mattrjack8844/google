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
// source: google/cloud/retail/v2alpha/product_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface ListProductsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ListProductsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The [Product][google.cloud.retail.v2alpha.Product]s.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.Product> getProductsList();
  /**
   *
   *
   * <pre>
   * The [Product][google.cloud.retail.v2alpha.Product]s.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1;</code>
   */
  com.google.cloud.retail.v2alpha.Product getProducts(int index);
  /**
   *
   *
   * <pre>
   * The [Product][google.cloud.retail.v2alpha.Product]s.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1;</code>
   */
  int getProductsCount();
  /**
   *
   *
   * <pre>
   * The [Product][google.cloud.retail.v2alpha.Product]s.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.ProductOrBuilder>
      getProductsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The [Product][google.cloud.retail.v2alpha.Product]s.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Product products = 1;</code>
   */
  com.google.cloud.retail.v2alpha.ProductOrBuilder getProductsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [ListProductsRequest.page_token][google.cloud.retail.v2alpha.ListProductsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [ListProductsRequest.page_token][google.cloud.retail.v2alpha.ListProductsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total count of matched [Product][google.cloud.retail.v2alpha.Product]s
   * irrespective of pagination. The total number of
   * [Product][google.cloud.retail.v2alpha.Product]s returned by pagination may
   * be less than the
   * [total_size][google.cloud.retail.v2alpha.ListProductsResponse.total_size]
   * that matches.
   *
   * This field is ignored if
   * [ListProductsRequest.require_total_size][google.cloud.retail.v2alpha.ListProductsRequest.require_total_size]
   * is not set or
   * [ListProductsRequest.page_token][google.cloud.retail.v2alpha.ListProductsRequest.page_token]
   * is not empty.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
