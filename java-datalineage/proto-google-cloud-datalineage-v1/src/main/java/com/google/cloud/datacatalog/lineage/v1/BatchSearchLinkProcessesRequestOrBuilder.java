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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

public interface BatchSearchLinkProcessesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.BatchSearchLinkProcessesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project and location where you want to search.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project and location where you want to search.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. An array of links to check for their associated LineageProcesses.
   * The maximum number of items in this array is 100.
   * If the request contains more than 100 links, it returns the
   * `INVALID_ARGUMENT` error.
   * Format: `projects/{project}/locations/{location}/links/{link}`.
   * </pre>
   *
   * <code>repeated string links = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the links.
   */
  java.util.List<java.lang.String> getLinksList();
  /**
   *
   *
   * <pre>
   * Required. An array of links to check for their associated LineageProcesses.
   * The maximum number of items in this array is 100.
   * If the request contains more than 100 links, it returns the
   * `INVALID_ARGUMENT` error.
   * Format: `projects/{project}/locations/{location}/links/{link}`.
   * </pre>
   *
   * <code>repeated string links = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of links.
   */
  int getLinksCount();
  /**
   *
   *
   * <pre>
   * Required. An array of links to check for their associated LineageProcesses.
   * The maximum number of items in this array is 100.
   * If the request contains more than 100 links, it returns the
   * `INVALID_ARGUMENT` error.
   * Format: `projects/{project}/locations/{location}/links/{link}`.
   * </pre>
   *
   * <code>repeated string links = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The links at the given index.
   */
  java.lang.String getLinks(int index);
  /**
   *
   *
   * <pre>
   * Required. An array of links to check for their associated LineageProcesses.
   * The maximum number of items in this array is 100.
   * If the request contains more than 100 links, it returns the
   * `INVALID_ARGUMENT` error.
   * Format: `projects/{project}/locations/{location}/links/{link}`.
   * </pre>
   *
   * <code>repeated string links = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the links at the given index.
   */
  com.google.protobuf.ByteString getLinksBytes(int index);

  /**
   *
   *
   * <pre>
   * The maximum number of processes to return in a single page of the response.
   * A page may contain fewer results than this value.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The page token received from a previous `BatchSearchLinkProcesses` call.
   * Use it to get the next page.
   * When requesting subsequent pages of a response, remember that
   * all parameters must match the values you provided
   * in the original request.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The page token received from a previous `BatchSearchLinkProcesses` call.
   * Use it to get the next page.
   * When requesting subsequent pages of a response, remember that
   * all parameters must match the values you provided
   * in the original request.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
