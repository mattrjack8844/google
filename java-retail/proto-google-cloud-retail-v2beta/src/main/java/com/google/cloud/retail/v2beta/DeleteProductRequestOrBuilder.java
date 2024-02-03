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
// source: google/cloud/retail/v2beta/product_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public interface DeleteProductRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.DeleteProductRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2beta.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to delete the
   * [Product][google.cloud.retail.v2beta.Product], regardless of whether or not
   * it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Product][google.cloud.retail.v2beta.Product] to delete does not
   * exist, a NOT_FOUND error is returned.
   *
   * The [Product][google.cloud.retail.v2beta.Product] to delete can neither be
   * a
   * [Product.Type.COLLECTION][google.cloud.retail.v2beta.Product.Type.COLLECTION]
   * [Product][google.cloud.retail.v2beta.Product] member nor a
   * [Product.Type.PRIMARY][google.cloud.retail.v2beta.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2beta.Product] with more than one
   * [variants][google.cloud.retail.v2beta.Product.Type.VARIANT]. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * All inventory information for the named
   * [Product][google.cloud.retail.v2beta.Product] will be deleted.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2beta.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to delete the
   * [Product][google.cloud.retail.v2beta.Product], regardless of whether or not
   * it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Product][google.cloud.retail.v2beta.Product] to delete does not
   * exist, a NOT_FOUND error is returned.
   *
   * The [Product][google.cloud.retail.v2beta.Product] to delete can neither be
   * a
   * [Product.Type.COLLECTION][google.cloud.retail.v2beta.Product.Type.COLLECTION]
   * [Product][google.cloud.retail.v2beta.Product] member nor a
   * [Product.Type.PRIMARY][google.cloud.retail.v2beta.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2beta.Product] with more than one
   * [variants][google.cloud.retail.v2beta.Product.Type.VARIANT]. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * All inventory information for the named
   * [Product][google.cloud.retail.v2beta.Product] will be deleted.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
