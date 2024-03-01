// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1beta1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1beta1;

public interface CreateCertificateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.CreateCertificateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the location and [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]
   * associated with the [Certificate][google.cloud.security.privateca.v1beta1.Certificate], in the format
   * `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the location and [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]
   * associated with the [Certificate][google.cloud.security.privateca.v1beta1.Certificate], in the format
   * `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`. This field is required when using a
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] in the Enterprise [CertificateAuthority.Tier][google.cloud.security.privateca.v1beta1.CertificateAuthority.Tier],
   * but is optional and its value is ignored otherwise.
   * </pre>
   *
   * <code>string certificate_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The certificateId.
   */
  java.lang.String getCertificateId();
  /**
   * <pre>
   * Optional. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`. This field is required when using a
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] in the Enterprise [CertificateAuthority.Tier][google.cloud.security.privateca.v1beta1.CertificateAuthority.Tier],
   * but is optional and its value is ignored otherwise.
   * </pre>
   *
   * <code>string certificate_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for certificateId.
   */
  com.google.protobuf.ByteString
      getCertificateIdBytes();

  /**
   * <pre>
   * Required. A [Certificate][google.cloud.security.privateca.v1beta1.Certificate] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1beta1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the certificate field is set.
   */
  boolean hasCertificate();
  /**
   * <pre>
   * Required. A [Certificate][google.cloud.security.privateca.v1beta1.Certificate] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1beta1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The certificate.
   */
  com.google.cloud.security.privateca.v1beta1.Certificate getCertificate();
  /**
   * <pre>
   * Required. A [Certificate][google.cloud.security.privateca.v1beta1.Certificate] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1beta1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateOrBuilder getCertificateOrBuilder();

  /**
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that if you must
   * retry your request, the server will know to ignore the request if it has
   * already been completed. The server will guarantee that for at least 60
   * minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that if you must
   * retry your request, the server will know to ignore the request if it has
   * already been completed. The server will guarantee that for at least 60
   * minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
