// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.texttospeech.v1beta1;

public interface SynthesizeSpeechResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The audio data bytes encoded as specified in the request, including the
   * header for encodings that are wrapped in containers (e.g. MP3, OGG_OPUS).
   * For LINEAR16 audio, we include the WAV header. Note: as
   * with all bytes fields, protobuffers use a pure binary representation,
   * whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes audio_content = 1;</code>
   * @return The audioContent.
   */
  com.google.protobuf.ByteString getAudioContent();

  /**
   * <pre>
   * A link between a position in the original request input and a corresponding
   * time in the output audio. It's only supported via `&lt;mark&gt;` of SSML input.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1beta1.Timepoint timepoints = 2;</code>
   */
  java.util.List<com.google.cloud.texttospeech.v1beta1.Timepoint> 
      getTimepointsList();
  /**
   * <pre>
   * A link between a position in the original request input and a corresponding
   * time in the output audio. It's only supported via `&lt;mark&gt;` of SSML input.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1beta1.Timepoint timepoints = 2;</code>
   */
  com.google.cloud.texttospeech.v1beta1.Timepoint getTimepoints(int index);
  /**
   * <pre>
   * A link between a position in the original request input and a corresponding
   * time in the output audio. It's only supported via `&lt;mark&gt;` of SSML input.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1beta1.Timepoint timepoints = 2;</code>
   */
  int getTimepointsCount();
  /**
   * <pre>
   * A link between a position in the original request input and a corresponding
   * time in the output audio. It's only supported via `&lt;mark&gt;` of SSML input.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1beta1.Timepoint timepoints = 2;</code>
   */
  java.util.List<? extends com.google.cloud.texttospeech.v1beta1.TimepointOrBuilder> 
      getTimepointsOrBuilderList();
  /**
   * <pre>
   * A link between a position in the original request input and a corresponding
   * time in the output audio. It's only supported via `&lt;mark&gt;` of SSML input.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1beta1.Timepoint timepoints = 2;</code>
   */
  com.google.cloud.texttospeech.v1beta1.TimepointOrBuilder getTimepointsOrBuilder(
      int index);

  /**
   * <pre>
   * The audio metadata of `audio_content`.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.AudioConfig audio_config = 4;</code>
   * @return Whether the audioConfig field is set.
   */
  boolean hasAudioConfig();
  /**
   * <pre>
   * The audio metadata of `audio_content`.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.AudioConfig audio_config = 4;</code>
   * @return The audioConfig.
   */
  com.google.cloud.texttospeech.v1beta1.AudioConfig getAudioConfig();
  /**
   * <pre>
   * The audio metadata of `audio_content`.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.AudioConfig audio_config = 4;</code>
   */
  com.google.cloud.texttospeech.v1beta1.AudioConfigOrBuilder getAudioConfigOrBuilder();
}
