// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.livestream.v1;

public interface ListAssetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.ListAssetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of Assets
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Asset assets = 1;</code>
   */
  java.util.List<com.google.cloud.video.livestream.v1.Asset> 
      getAssetsList();
  /**
   * <pre>
   * The list of Assets
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Asset assets = 1;</code>
   */
  com.google.cloud.video.livestream.v1.Asset getAssets(int index);
  /**
   * <pre>
   * The list of Assets
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Asset assets = 1;</code>
   */
  int getAssetsCount();
  /**
   * <pre>
   * The list of Assets
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Asset assets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.video.livestream.v1.AssetOrBuilder> 
      getAssetsOrBuilderList();
  /**
   * <pre>
   * The list of Assets
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Asset assets = 1;</code>
   */
  com.google.cloud.video.livestream.v1.AssetOrBuilder getAssetsOrBuilder(
      int index);

  /**
   * <pre>
   * The next_page_token value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The next_page_token value returned from a previous List request, if any.
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
