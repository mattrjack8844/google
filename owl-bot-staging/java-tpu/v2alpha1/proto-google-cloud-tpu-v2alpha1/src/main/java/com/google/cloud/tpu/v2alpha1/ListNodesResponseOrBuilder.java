// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.tpu.v2alpha1;

public interface ListNodesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.ListNodesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.Node nodes = 1;</code>
   */
  java.util.List<com.google.cloud.tpu.v2alpha1.Node> 
      getNodesList();
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.Node nodes = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.Node getNodes(int index);
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.Node nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.Node nodes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2alpha1.NodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.Node nodes = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.NodeOrBuilder getNodesOrBuilder(
      int index);

  /**
   * <pre>
   * The next page token or empty if none.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The next page token or empty if none.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
