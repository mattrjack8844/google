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
// source: google/shopping/css/v1/css_product_inputs.proto

// Protobuf Java Version: 3.25.2
package com.google.shopping.css.v1;

public interface DeleteCssProductInputRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.css.v1.DeleteCssProductInputRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the CSS product input resource to delete.
   * Format: accounts/{account}/cssProductInputs/{css_product_input}
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
   * Required. The name of the CSS product input resource to delete.
   * Format: accounts/{account}/cssProductInputs/{css_product_input}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The Content API Supplemental Feed ID.
   * The field must not be set if the action applies to a primary feed.
   * If the field is set, then product action applies to a supplemental feed
   * instead of primary Content API feed.
   * </pre>
   *
   * <code>optional int64 supplemental_feed_id = 2;</code>
   *
   * @return Whether the supplementalFeedId field is set.
   */
  boolean hasSupplementalFeedId();
  /**
   *
   *
   * <pre>
   * The Content API Supplemental Feed ID.
   * The field must not be set if the action applies to a primary feed.
   * If the field is set, then product action applies to a supplemental feed
   * instead of primary Content API feed.
   * </pre>
   *
   * <code>optional int64 supplemental_feed_id = 2;</code>
   *
   * @return The supplementalFeedId.
   */
  long getSupplementalFeedId();
}
