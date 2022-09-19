/*
 * Copyright 2020 Google LLC
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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface ListCustomDimensionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ListCustomDimensionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomDimension custom_dimensions = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.CustomDimension> getCustomDimensionsList();
  /**
   *
   *
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomDimension custom_dimensions = 1;</code>
   */
  com.google.analytics.admin.v1alpha.CustomDimension getCustomDimensions(int index);
  /**
   *
   *
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomDimension custom_dimensions = 1;</code>
   */
  int getCustomDimensionsCount();
  /**
   *
   *
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomDimension custom_dimensions = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.CustomDimensionOrBuilder>
      getCustomDimensionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of CustomDimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomDimension custom_dimensions = 1;</code>
   */
  com.google.analytics.admin.v1alpha.CustomDimensionOrBuilder getCustomDimensionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
