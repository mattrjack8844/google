/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface ListImportJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ListImportJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.ImportJob import_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.kms.v1.ImportJob> getImportJobsList();
  /**
   *
   *
   * <pre>
   * The list of [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.ImportJob import_jobs = 1;</code>
   */
  com.google.cloud.kms.v1.ImportJob getImportJobs(int index);
  /**
   *
   *
   * <pre>
   * The list of [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.ImportJob import_jobs = 1;</code>
   */
  int getImportJobsCount();
  /**
   *
   *
   * <pre>
   * The list of [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.ImportJob import_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.kms.v1.ImportJobOrBuilder> getImportJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.ImportJob import_jobs = 1;</code>
   */
  com.google.cloud.kms.v1.ImportJobOrBuilder getImportJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListImportJobsRequest.page_token][google.cloud.kms.v1.ListImportJobsRequest.page_token] to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListImportJobsRequest.page_token][google.cloud.kms.v1.ListImportJobsRequest.page_token] to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of [ImportJobs][google.cloud.kms.v1.ImportJob] that matched the query.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   */
  int getTotalSize();
}
