// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.iam.credentials.v1;

public interface GenerateIdentityBindingAccessTokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The OAuth 2.0 access token.
   * </pre>
   *
   * <code>string access_token = 1;</code>
   */
  java.lang.String getAccessToken();
  /**
   * <pre>
   * The OAuth 2.0 access token.
   * </pre>
   *
   * <code>string access_token = 1;</code>
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <pre>
   * Token expiration time.
   * The expiration time is always set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  boolean hasExpireTime();
  /**
   * <pre>
   * Token expiration time.
   * The expiration time is always set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   * <pre>
   * Token expiration time.
   * The expiration time is always set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();
}
