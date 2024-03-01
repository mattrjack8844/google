// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmwareengine.v1;

public interface ListNodesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.ListNodesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.Node nodes = 1;</code>
   */
  java.util.List<com.google.cloud.vmwareengine.v1.Node> 
      getNodesList();
  /**
   * <pre>
   * The nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.Node nodes = 1;</code>
   */
  com.google.cloud.vmwareengine.v1.Node getNodes(int index);
  /**
   * <pre>
   * The nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.Node nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * The nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.Node nodes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vmwareengine.v1.NodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <pre>
   * The nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.Node nodes = 1;</code>
   */
  com.google.cloud.vmwareengine.v1.NodeOrBuilder getNodesOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
