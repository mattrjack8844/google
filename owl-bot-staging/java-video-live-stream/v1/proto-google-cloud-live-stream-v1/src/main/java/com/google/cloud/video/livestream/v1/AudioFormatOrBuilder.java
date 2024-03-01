// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.livestream.v1;

public interface AudioFormatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.AudioFormat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Audio codec used in this audio stream.
   * </pre>
   *
   * <code>string codec = 1;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <pre>
   * Audio codec used in this audio stream.
   * </pre>
   *
   * <code>string codec = 1;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <pre>
   * The number of audio channels.
   * </pre>
   *
   * <code>int32 channel_count = 2;</code>
   * @return The channelCount.
   */
  int getChannelCount();

  /**
   * <pre>
   * A list of channel names specifying the layout of the audio channels.
   * </pre>
   *
   * <code>repeated string channel_layout = 3;</code>
   * @return A list containing the channelLayout.
   */
  java.util.List<java.lang.String>
      getChannelLayoutList();
  /**
   * <pre>
   * A list of channel names specifying the layout of the audio channels.
   * </pre>
   *
   * <code>repeated string channel_layout = 3;</code>
   * @return The count of channelLayout.
   */
  int getChannelLayoutCount();
  /**
   * <pre>
   * A list of channel names specifying the layout of the audio channels.
   * </pre>
   *
   * <code>repeated string channel_layout = 3;</code>
   * @param index The index of the element to return.
   * @return The channelLayout at the given index.
   */
  java.lang.String getChannelLayout(int index);
  /**
   * <pre>
   * A list of channel names specifying the layout of the audio channels.
   * </pre>
   *
   * <code>repeated string channel_layout = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the channelLayout at the given index.
   */
  com.google.protobuf.ByteString
      getChannelLayoutBytes(int index);
}
