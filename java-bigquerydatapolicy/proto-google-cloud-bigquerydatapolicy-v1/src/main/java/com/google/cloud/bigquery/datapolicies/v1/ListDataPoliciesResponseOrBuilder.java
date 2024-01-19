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
// source: google/cloud/bigquery/datapolicies/v1/datapolicy.proto

package com.google.cloud.bigquery.datapolicies.v1;

public interface ListDataPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  java.util.List<com.google.cloud.bigquery.datapolicies.v1.DataPolicy> getDataPoliciesList();
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  com.google.cloud.bigquery.datapolicies.v1.DataPolicy getDataPolicies(int index);
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  int getDataPoliciesCount();
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder>
      getDataPoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder getDataPoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token used to retrieve the next page of results, or empty if there are no
   * more results.
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
   * Token used to retrieve the next page of results, or empty if there are no
   * more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
