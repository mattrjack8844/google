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

public interface CreateCertificateAuthorityRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.CreateCertificateAuthorityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [CaPool][google.cloud.security.privateca.v1.CaPool] associated with the
   * [CertificateAuthorities][google.cloud.security.privateca.v1.CertificateAuthority],
   * in the format `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
   * Required. The resource name of the
   * [CaPool][google.cloud.security.privateca.v1.CaPool] associated with the
   * [CertificateAuthorities][google.cloud.security.privateca.v1.CertificateAuthority],
   * in the format `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;`.
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
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string certificate_authority_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The certificateAuthorityId.
   */
  java.lang.String getCertificateAuthorityId();
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string certificate_authority_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for certificateAuthorityId.
   */
  com.google.protobuf.ByteString getCertificateAuthorityIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateAuthority certificate_authority = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the certificateAuthority field is set.
   */
  boolean hasCertificateAuthority();
  /**
   *
   *
   * <pre>
   * Required. A
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateAuthority certificate_authority = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The certificateAuthority.
   */
  com.google.cloud.security.privateca.v1.CertificateAuthority getCertificateAuthority();
  /**
   *
   *
   * <pre>
   * Required. A
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateAuthority certificate_authority = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.security.privateca.v1.CertificateAuthorityOrBuilder
      getCertificateAuthorityOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that
   * if you must retry your request, the server will know to ignore the request
   * if it has already been completed. The server will guarantee that for at
   * least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that
   * if you must retry your request, the server will know to ignore the request
   * if it has already been completed. The server will guarantee that for at
   * least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
