// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.iam.credentials.v1;

public interface SignJwtResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.SignJwtResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the key used to sign the JWT.
   * </pre>
   *
   * <code>string key_id = 1;</code>
   */
  java.lang.String getKeyId();
  /**
   * <pre>
   * The ID of the key used to sign the JWT.
   * </pre>
   *
   * <code>string key_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyIdBytes();

  /**
   * <pre>
   * The signed JWT.
   * </pre>
   *
   * <code>string signed_jwt = 2;</code>
   */
  java.lang.String getSignedJwt();
  /**
   * <pre>
   * The signed JWT.
   * </pre>
   *
   * <code>string signed_jwt = 2;</code>
   */
  com.google.protobuf.ByteString
      getSignedJwtBytes();
}
