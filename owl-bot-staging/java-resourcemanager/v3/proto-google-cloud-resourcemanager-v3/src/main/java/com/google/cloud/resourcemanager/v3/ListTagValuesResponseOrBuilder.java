// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/tag_values.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.resourcemanager.v3;

public interface ListTagValuesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.ListTagValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  java.util.List<com.google.cloud.resourcemanager.v3.TagValue> 
      getTagValuesList();
  /**
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.TagValue getTagValues(int index);
  /**
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  int getTagValuesCount();
  /**
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  java.util.List<? extends com.google.cloud.resourcemanager.v3.TagValueOrBuilder> 
      getTagValuesOrBuilderList();
  /**
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.TagValueOrBuilder getTagValuesOrBuilder(
      int index);

  /**
   * <pre>
   * A pagination token returned from a previous call to `ListTagValues`
   * that indicates from where listing should continue. This is currently not
   * used, but the server may at any point start supplying a valid token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A pagination token returned from a previous call to `ListTagValues`
   * that indicates from where listing should continue. This is currently not
   * used, but the server may at any point start supplying a valid token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
