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
// source: google/cloud/security/privateca/v1beta1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1beta1;

public interface ListReusableConfigsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.ListReusableConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of [ReusableConfigs][google.cloud.security.privateca.v1beta1.ReusableConfig].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.ReusableConfig reusable_configs = 1;
   * </code>
   */
  java.util.List<com.google.cloud.security.privateca.v1beta1.ReusableConfig>
      getReusableConfigsList();
  /**
   *
   *
   * <pre>
   * The list of [ReusableConfigs][google.cloud.security.privateca.v1beta1.ReusableConfig].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.ReusableConfig reusable_configs = 1;
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.ReusableConfig getReusableConfigs(int index);
  /**
   *
   *
   * <pre>
   * The list of [ReusableConfigs][google.cloud.security.privateca.v1beta1.ReusableConfig].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.ReusableConfig reusable_configs = 1;
   * </code>
   */
  int getReusableConfigsCount();
  /**
   *
   *
   * <pre>
   * The list of [ReusableConfigs][google.cloud.security.privateca.v1beta1.ReusableConfig].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.ReusableConfig reusable_configs = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.security.privateca.v1beta1.ReusableConfigOrBuilder>
      getReusableConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of [ReusableConfigs][google.cloud.security.privateca.v1beta1.ReusableConfig].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.ReusableConfig reusable_configs = 1;
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.ReusableConfigOrBuilder getReusableConfigsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListReusableConfigsRequest.next_page_token][] to retrieve
   * the next page of results.
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
   * A token to retrieve next page of results. Pass this value in
   * [ListReusableConfigsRequest.next_page_token][] to retrieve
   * the next page of results.
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
   * A list of locations (e.g. "us-west1") that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * A list of locations (e.g. "us-west1") that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * A list of locations (e.g. "us-west1") that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * A list of locations (e.g. "us-west1") that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
