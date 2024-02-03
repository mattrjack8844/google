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
// source: google/cloud/security/privateca/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1;

public interface ListCertificatesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.ListCertificatesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the location associated with the
   * [Certificates][google.cloud.security.privateca.v1.Certificate], in the
   * format `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
   * Required. The resource name of the location associated with the
   * [Certificates][google.cloud.security.privateca.v1.Certificate], in the
   * format `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
   * Optional. Limit on the number of
   * [Certificates][google.cloud.security.privateca.v1.Certificate] to include
   * in the response. Further
   * [Certificates][google.cloud.security.privateca.v1.Certificate] can
   * subsequently be obtained by including the
   * [ListCertificatesResponse.next_page_token][google.cloud.security.privateca.v1.ListCertificatesResponse.next_page_token]
   * in a subsequent request. If unspecified, the server will pick an
   * appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Pagination token, returned earlier via
   * [ListCertificatesResponse.next_page_token][google.cloud.security.privateca.v1.ListCertificatesResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Pagination token, returned earlier via
   * [ListCertificatesResponse.next_page_token][google.cloud.security.privateca.v1.ListCertificatesResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Only include resources that match the filter in the response. For
   * details on supported filters and syntax, see [Certificates Filtering
   * documentation](https://cloud.google.com/certificate-authority-service/docs/sorting-filtering-certificates#filtering_support).
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Only include resources that match the filter in the response. For
   * details on supported filters and syntax, see [Certificates Filtering
   * documentation](https://cloud.google.com/certificate-authority-service/docs/sorting-filtering-certificates#filtering_support).
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specify how the results should be sorted. For details on
   * supported fields and syntax, see [Certificates Sorting
   * documentation](https://cloud.google.com/certificate-authority-service/docs/sorting-filtering-certificates#sorting_support).
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. Specify how the results should be sorted. For details on
   * supported fields and syntax, see [Certificates Sorting
   * documentation](https://cloud.google.com/certificate-authority-service/docs/sorting-filtering-certificates#sorting_support).
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
