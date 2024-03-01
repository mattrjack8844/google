// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.transcoder.v1;

public interface AudioStreamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.AudioStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The codec for this audio stream. The default is `aac`.
   *
   * Supported audio codecs:
   *
   * - `aac`
   * - `aac-he`
   * - `aac-he-v2`
   * - `mp3`
   * - `ac3`
   * - `eac3`
   * </pre>
   *
   * <code>string codec = 1;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <pre>
   * The codec for this audio stream. The default is `aac`.
   *
   * Supported audio codecs:
   *
   * - `aac`
   * - `aac-he`
   * - `aac-he-v2`
   * - `mp3`
   * - `ac3`
   * - `eac3`
   * </pre>
   *
   * <code>string codec = 1;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <pre>
   * Required. Audio bitrate in bits per second. Must be between 1 and
   * 10,000,000.
   * </pre>
   *
   * <code>int32 bitrate_bps = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bitrateBps.
   */
  int getBitrateBps();

  /**
   * <pre>
   * Number of audio channels. Must be between 1 and 6. The default is 2.
   * </pre>
   *
   * <code>int32 channel_count = 3;</code>
   * @return The channelCount.
   */
  int getChannelCount();

  /**
   * <pre>
   * A list of channel names specifying layout of the audio channels.
   * This only affects the metadata embedded in the container headers, if
   * supported by the specified format. The default is `["fl", "fr"]`.
   *
   * Supported channel names:
   *
   * - `fl` - Front left channel
   * - `fr` - Front right channel
   * - `sl` - Side left channel
   * - `sr` - Side right channel
   * - `fc` - Front center channel
   * - `lfe` - Low frequency
   * </pre>
   *
   * <code>repeated string channel_layout = 4;</code>
   * @return A list containing the channelLayout.
   */
  java.util.List<java.lang.String>
      getChannelLayoutList();
  /**
   * <pre>
   * A list of channel names specifying layout of the audio channels.
   * This only affects the metadata embedded in the container headers, if
   * supported by the specified format. The default is `["fl", "fr"]`.
   *
   * Supported channel names:
   *
   * - `fl` - Front left channel
   * - `fr` - Front right channel
   * - `sl` - Side left channel
   * - `sr` - Side right channel
   * - `fc` - Front center channel
   * - `lfe` - Low frequency
   * </pre>
   *
   * <code>repeated string channel_layout = 4;</code>
   * @return The count of channelLayout.
   */
  int getChannelLayoutCount();
  /**
   * <pre>
   * A list of channel names specifying layout of the audio channels.
   * This only affects the metadata embedded in the container headers, if
   * supported by the specified format. The default is `["fl", "fr"]`.
   *
   * Supported channel names:
   *
   * - `fl` - Front left channel
   * - `fr` - Front right channel
   * - `sl` - Side left channel
   * - `sr` - Side right channel
   * - `fc` - Front center channel
   * - `lfe` - Low frequency
   * </pre>
   *
   * <code>repeated string channel_layout = 4;</code>
   * @param index The index of the element to return.
   * @return The channelLayout at the given index.
   */
  java.lang.String getChannelLayout(int index);
  /**
   * <pre>
   * A list of channel names specifying layout of the audio channels.
   * This only affects the metadata embedded in the container headers, if
   * supported by the specified format. The default is `["fl", "fr"]`.
   *
   * Supported channel names:
   *
   * - `fl` - Front left channel
   * - `fr` - Front right channel
   * - `sl` - Side left channel
   * - `sr` - Side right channel
   * - `fc` - Front center channel
   * - `lfe` - Low frequency
   * </pre>
   *
   * <code>repeated string channel_layout = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the channelLayout at the given index.
   */
  com.google.protobuf.ByteString
      getChannelLayoutBytes(int index);

  /**
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  java.util.List<com.google.cloud.video.transcoder.v1.AudioStream.AudioMapping> 
      getMappingList();
  /**
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  com.google.cloud.video.transcoder.v1.AudioStream.AudioMapping getMapping(int index);
  /**
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  int getMappingCount();
  /**
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  java.util.List<? extends com.google.cloud.video.transcoder.v1.AudioStream.AudioMappingOrBuilder> 
      getMappingOrBuilderList();
  /**
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  com.google.cloud.video.transcoder.v1.AudioStream.AudioMappingOrBuilder getMappingOrBuilder(
      int index);

  /**
   * <pre>
   * The audio sample rate in Hertz. The default is 48000 Hertz.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 6;</code>
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   * <pre>
   * The BCP-47 language code, such as `en-US` or `sr-Latn`. For more
   * information, see
   * https://www.unicode.org/reports/tr35/#Unicode_locale_identifier. Not
   * supported in MP4 files.
   * </pre>
   *
   * <code>string language_code = 7;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The BCP-47 language code, such as `en-US` or `sr-Latn`. For more
   * information, see
   * https://www.unicode.org/reports/tr35/#Unicode_locale_identifier. Not
   * supported in MP4 files.
   * </pre>
   *
   * <code>string language_code = 7;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * The name for this particular audio stream that
   * will be added to the HLS/DASH manifest. Not supported in MP4 files.
   * </pre>
   *
   * <code>string display_name = 8;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The name for this particular audio stream that
   * will be added to the HLS/DASH manifest. Not supported in MP4 files.
   * </pre>
   *
   * <code>string display_name = 8;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}
