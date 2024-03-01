// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1beta1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1beta1;

public interface ListCertificateAuthoritiesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.ListCertificateAuthoritiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of [CertificateAuthorities][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.CertificateAuthority certificate_authorities = 1;</code>
   */
  java.util.List<com.google.cloud.security.privateca.v1beta1.CertificateAuthority> 
      getCertificateAuthoritiesList();
  /**
   * <pre>
   * The list of [CertificateAuthorities][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.CertificateAuthority certificate_authorities = 1;</code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority getCertificateAuthorities(int index);
  /**
   * <pre>
   * The list of [CertificateAuthorities][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.CertificateAuthority certificate_authorities = 1;</code>
   */
  int getCertificateAuthoritiesCount();
  /**
   * <pre>
   * The list of [CertificateAuthorities][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.CertificateAuthority certificate_authorities = 1;</code>
   */
  java.util.List<? extends com.google.cloud.security.privateca.v1beta1.CertificateAuthorityOrBuilder> 
      getCertificateAuthoritiesOrBuilderList();
  /**
   * <pre>
   * The list of [CertificateAuthorities][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1beta1.CertificateAuthority certificate_authorities = 1;</code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthorityOrBuilder getCertificateAuthoritiesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListCertificateAuthoritiesRequest.next_page_token][] to retrieve the next
   * page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListCertificateAuthoritiesRequest.next_page_token][] to retrieve the next
   * page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * A list of locations (e.g. "us-west1") that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * A list of locations (e.g. "us-west1") that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * A list of locations (e.g. "us-west1") that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * A list of locations (e.g. "us-west1") that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
