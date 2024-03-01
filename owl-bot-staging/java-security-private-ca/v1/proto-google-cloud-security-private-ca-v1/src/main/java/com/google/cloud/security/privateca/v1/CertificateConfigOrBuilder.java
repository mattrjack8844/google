// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1;

public interface CertificateConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.CertificateConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Specifies some of the values in a certificate that are related to
   * the subject.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.CertificateConfig.SubjectConfig subject_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the subjectConfig field is set.
   */
  boolean hasSubjectConfig();
  /**
   * <pre>
   * Required. Specifies some of the values in a certificate that are related to
   * the subject.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.CertificateConfig.SubjectConfig subject_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subjectConfig.
   */
  com.google.cloud.security.privateca.v1.CertificateConfig.SubjectConfig getSubjectConfig();
  /**
   * <pre>
   * Required. Specifies some of the values in a certificate that are related to
   * the subject.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.CertificateConfig.SubjectConfig subject_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.security.privateca.v1.CertificateConfig.SubjectConfigOrBuilder getSubjectConfigOrBuilder();

  /**
   * <pre>
   * Required. Describes how some of the technical X.509 fields in a certificate
   * should be populated.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.X509Parameters x509_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the x509Config field is set.
   */
  boolean hasX509Config();
  /**
   * <pre>
   * Required. Describes how some of the technical X.509 fields in a certificate
   * should be populated.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.X509Parameters x509_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The x509Config.
   */
  com.google.cloud.security.privateca.v1.X509Parameters getX509Config();
  /**
   * <pre>
   * Required. Describes how some of the technical X.509 fields in a certificate
   * should be populated.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.X509Parameters x509_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.security.privateca.v1.X509ParametersOrBuilder getX509ConfigOrBuilder();

  /**
   * <pre>
   * Optional. The public key that corresponds to this config. This is, for
   * example, used when issuing
   * [Certificates][google.cloud.security.privateca.v1.Certificate], but not
   * when creating a self-signed
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * or
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * CSR.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.PublicKey public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the publicKey field is set.
   */
  boolean hasPublicKey();
  /**
   * <pre>
   * Optional. The public key that corresponds to this config. This is, for
   * example, used when issuing
   * [Certificates][google.cloud.security.privateca.v1.Certificate], but not
   * when creating a self-signed
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * or
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * CSR.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.PublicKey public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The publicKey.
   */
  com.google.cloud.security.privateca.v1.PublicKey getPublicKey();
  /**
   * <pre>
   * Optional. The public key that corresponds to this config. This is, for
   * example, used when issuing
   * [Certificates][google.cloud.security.privateca.v1.Certificate], but not
   * when creating a self-signed
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * or
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * CSR.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.PublicKey public_key = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.security.privateca.v1.PublicKeyOrBuilder getPublicKeyOrBuilder();
}
