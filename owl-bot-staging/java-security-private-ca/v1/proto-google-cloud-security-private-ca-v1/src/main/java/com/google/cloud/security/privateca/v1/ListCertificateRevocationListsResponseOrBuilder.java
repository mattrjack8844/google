// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1;

public interface ListCertificateRevocationListsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.ListCertificateRevocationListsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of
   * [CertificateRevocationLists][google.cloud.security.privateca.v1.CertificateRevocationList].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.CertificateRevocationList certificate_revocation_lists = 1;</code>
   */
  java.util.List<com.google.cloud.security.privateca.v1.CertificateRevocationList> 
      getCertificateRevocationListsList();
  /**
   * <pre>
   * The list of
   * [CertificateRevocationLists][google.cloud.security.privateca.v1.CertificateRevocationList].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.CertificateRevocationList certificate_revocation_lists = 1;</code>
   */
  com.google.cloud.security.privateca.v1.CertificateRevocationList getCertificateRevocationLists(int index);
  /**
   * <pre>
   * The list of
   * [CertificateRevocationLists][google.cloud.security.privateca.v1.CertificateRevocationList].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.CertificateRevocationList certificate_revocation_lists = 1;</code>
   */
  int getCertificateRevocationListsCount();
  /**
   * <pre>
   * The list of
   * [CertificateRevocationLists][google.cloud.security.privateca.v1.CertificateRevocationList].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.CertificateRevocationList certificate_revocation_lists = 1;</code>
   */
  java.util.List<? extends com.google.cloud.security.privateca.v1.CertificateRevocationListOrBuilder> 
      getCertificateRevocationListsOrBuilderList();
  /**
   * <pre>
   * The list of
   * [CertificateRevocationLists][google.cloud.security.privateca.v1.CertificateRevocationList].
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.CertificateRevocationList certificate_revocation_lists = 1;</code>
   */
  com.google.cloud.security.privateca.v1.CertificateRevocationListOrBuilder getCertificateRevocationListsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListCertificateRevocationListsRequest.next_page_token][] to retrieve the
   * next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListCertificateRevocationListsRequest.next_page_token][] to retrieve the
   * next page of results.
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
