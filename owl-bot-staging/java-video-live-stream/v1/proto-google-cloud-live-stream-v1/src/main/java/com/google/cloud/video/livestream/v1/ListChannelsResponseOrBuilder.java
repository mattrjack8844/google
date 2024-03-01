// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.livestream.v1;

public interface ListChannelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.ListChannelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of channels.
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Channel channels = 1;</code>
   */
  java.util.List<com.google.cloud.video.livestream.v1.Channel> 
      getChannelsList();
  /**
   * <pre>
   * A list of channels.
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Channel channels = 1;</code>
   */
  com.google.cloud.video.livestream.v1.Channel getChannels(int index);
  /**
   * <pre>
   * A list of channels.
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Channel channels = 1;</code>
   */
  int getChannelsCount();
  /**
   * <pre>
   * A list of channels.
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Channel channels = 1;</code>
   */
  java.util.List<? extends com.google.cloud.video.livestream.v1.ChannelOrBuilder> 
      getChannelsOrBuilderList();
  /**
   * <pre>
   * A list of channels.
   * </pre>
   *
   * <code>repeated .google.cloud.video.livestream.v1.Channel channels = 1;</code>
   */
  com.google.cloud.video.livestream.v1.ChannelOrBuilder getChannelsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
