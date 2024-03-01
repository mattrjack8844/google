// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securityposture.v1;

public interface ListPosturesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.ListPosturesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of Posture.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture postures = 1;</code>
   */
  java.util.List<com.google.cloud.securityposture.v1.Posture> 
      getPosturesList();
  /**
   * <pre>
   * The list of Posture.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture postures = 1;</code>
   */
  com.google.cloud.securityposture.v1.Posture getPostures(int index);
  /**
   * <pre>
   * The list of Posture.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture postures = 1;</code>
   */
  int getPosturesCount();
  /**
   * <pre>
   * The list of Posture.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture postures = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securityposture.v1.PostureOrBuilder> 
      getPosturesOrBuilderList();
  /**
   * <pre>
   * The list of Posture.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture postures = 1;</code>
   */
  com.google.cloud.securityposture.v1.PostureOrBuilder getPosturesOrBuilder(
      int index);

  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
