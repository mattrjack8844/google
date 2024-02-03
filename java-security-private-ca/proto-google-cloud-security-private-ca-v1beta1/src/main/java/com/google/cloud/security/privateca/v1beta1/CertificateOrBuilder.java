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
// source: google/cloud/security/privateca/v1beta1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1beta1;

public interface CertificateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.Certificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource path for this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;&#47;certificates/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource path for this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;&#47;certificates/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. A pem-encoded X.509 certificate signing request (CSR).
   * </pre>
   *
   * <code>string pem_csr = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return Whether the pemCsr field is set.
   */
  boolean hasPemCsr();
  /**
   *
   *
   * <pre>
   * Immutable. A pem-encoded X.509 certificate signing request (CSR).
   * </pre>
   *
   * <code>string pem_csr = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The pemCsr.
   */
  java.lang.String getPemCsr();
  /**
   *
   *
   * <pre>
   * Immutable. A pem-encoded X.509 certificate signing request (CSR).
   * </pre>
   *
   * <code>string pem_csr = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for pemCsr.
   */
  com.google.protobuf.ByteString getPemCsrBytes();

  /**
   *
   *
   * <pre>
   * Immutable. A description of the certificate and key that does not require X.509 or
   * ASN.1.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateConfig config = 3 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Immutable. A description of the certificate and key that does not require X.509 or
   * ASN.1.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateConfig config = 3 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateConfig getConfig();
  /**
   *
   *
   * <pre>
   * Immutable. A description of the certificate and key that does not require X.509 or
   * ASN.1.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateConfig config = 3 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The desired lifetime of a certificate. Used to create the
   * "not_before_time" and "not_after_time" fields inside an X.509
   * certificate. Note that the lifetime may be truncated if it would extend
   * past the life of any certificate authority in the issuing chain.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration lifetime = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the lifetime field is set.
   */
  boolean hasLifetime();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The desired lifetime of a certificate. Used to create the
   * "not_before_time" and "not_after_time" fields inside an X.509
   * certificate. Note that the lifetime may be truncated if it would extend
   * past the life of any certificate authority in the issuing chain.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration lifetime = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The lifetime.
   */
  com.google.protobuf.Duration getLifetime();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The desired lifetime of a certificate. Used to create the
   * "not_before_time" and "not_after_time" fields inside an X.509
   * certificate. Note that the lifetime may be truncated if it would extend
   * past the life of any certificate authority in the issuing chain.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration lifetime = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getLifetimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Details regarding the revocation of this [Certificate][google.cloud.security.privateca.v1beta1.Certificate]. This
   * [Certificate][google.cloud.security.privateca.v1beta1.Certificate] is considered revoked if and only if this field is present.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.Certificate.RevocationDetails revocation_details = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the revocationDetails field is set.
   */
  boolean hasRevocationDetails();
  /**
   *
   *
   * <pre>
   * Output only. Details regarding the revocation of this [Certificate][google.cloud.security.privateca.v1beta1.Certificate]. This
   * [Certificate][google.cloud.security.privateca.v1beta1.Certificate] is considered revoked if and only if this field is present.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.Certificate.RevocationDetails revocation_details = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revocationDetails.
   */
  com.google.cloud.security.privateca.v1beta1.Certificate.RevocationDetails getRevocationDetails();
  /**
   *
   *
   * <pre>
   * Output only. Details regarding the revocation of this [Certificate][google.cloud.security.privateca.v1beta1.Certificate]. This
   * [Certificate][google.cloud.security.privateca.v1beta1.Certificate] is considered revoked if and only if this field is present.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.Certificate.RevocationDetails revocation_details = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.Certificate.RevocationDetailsOrBuilder
      getRevocationDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded, signed X.509 certificate.
   * </pre>
   *
   * <code>string pem_certificate = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pemCertificate.
   */
  java.lang.String getPemCertificate();
  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded, signed X.509 certificate.
   * </pre>
   *
   * <code>string pem_certificate = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for pemCertificate.
   */
  com.google.protobuf.ByteString getPemCertificateBytes();

  /**
   *
   *
   * <pre>
   * Output only. A structured description of the issued X.509 certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateDescription certificate_description = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the certificateDescription field is set.
   */
  boolean hasCertificateDescription();
  /**
   *
   *
   * <pre>
   * Output only. A structured description of the issued X.509 certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateDescription certificate_description = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The certificateDescription.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateDescription getCertificateDescription();
  /**
   *
   *
   * <pre>
   * Output only. A structured description of the issued X.509 certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateDescription certificate_description = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateDescriptionOrBuilder
      getCertificateDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The chain that may be used to verify the X.509 certificate. Expected to be
   * in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>repeated string pem_certificate_chain = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the pemCertificateChain.
   */
  java.util.List<java.lang.String> getPemCertificateChainList();
  /**
   *
   *
   * <pre>
   * Output only. The chain that may be used to verify the X.509 certificate. Expected to be
   * in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>repeated string pem_certificate_chain = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of pemCertificateChain.
   */
  int getPemCertificateChainCount();
  /**
   *
   *
   * <pre>
   * Output only. The chain that may be used to verify the X.509 certificate. Expected to be
   * in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>repeated string pem_certificate_chain = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The pemCertificateChain at the given index.
   */
  java.lang.String getPemCertificateChain(int index);
  /**
   *
   *
   * <pre>
   * Output only. The chain that may be used to verify the X.509 certificate. Expected to be
   * in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>repeated string pem_certificate_chain = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the pemCertificateChain at the given index.
   */
  com.google.protobuf.ByteString getPemCertificateChainBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The time at which this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  com.google.cloud.security.privateca.v1beta1.Certificate.CertificateConfigCase
      getCertificateConfigCase();
}
