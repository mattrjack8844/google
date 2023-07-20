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
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

package com.google.cloud.certificatemanager.v1;

public interface ListCertificateMapEntriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.certificatemanager.v1.ListCertificateMapEntriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of certificate map entries for the parent resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entries = 1;
   * </code>
   */
  java.util.List<com.google.cloud.certificatemanager.v1.CertificateMapEntry>
      getCertificateMapEntriesList();
  /**
   *
   *
   * <pre>
   * A list of certificate map entries for the parent resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entries = 1;
   * </code>
   */
  com.google.cloud.certificatemanager.v1.CertificateMapEntry getCertificateMapEntries(int index);
  /**
   *
   *
   * <pre>
   * A list of certificate map entries for the parent resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entries = 1;
   * </code>
   */
  int getCertificateMapEntriesCount();
  /**
   *
   *
   * <pre>
   * A list of certificate map entries for the parent resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entries = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.certificatemanager.v1.CertificateMapEntryOrBuilder>
      getCertificateMapEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of certificate map entries for the parent resource.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entries = 1;
   * </code>
   */
  com.google.cloud.certificatemanager.v1.CertificateMapEntryOrBuilder
      getCertificateMapEntriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `next_page_token` is included. To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
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
   * If there might be more results than those appearing in this response, then
   * `next_page_token` is included. To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
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
   * Locations that could not be reached.
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
   * Locations that could not be reached.
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
   * Locations that could not be reached.
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
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
