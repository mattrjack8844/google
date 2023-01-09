// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/common.proto

package com.google.cloud.gkebackup.v1;

public interface EncryptionKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.EncryptionKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Google Cloud KMS encryption key. Format:
   * projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
   * </pre>
   *
   * <code>string gcp_kms_encryption_key = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The gcpKmsEncryptionKey.
   */
  java.lang.String getGcpKmsEncryptionKey();
  /**
   * <pre>
   * Google Cloud KMS encryption key. Format:
   * projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
   * </pre>
   *
   * <code>string gcp_kms_encryption_key = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for gcpKmsEncryptionKey.
   */
  com.google.protobuf.ByteString
      getGcpKmsEncryptionKeyBytes();
}
