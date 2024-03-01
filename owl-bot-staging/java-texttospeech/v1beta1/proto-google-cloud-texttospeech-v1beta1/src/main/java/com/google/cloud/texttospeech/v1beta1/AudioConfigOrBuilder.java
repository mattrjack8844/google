// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.texttospeech.v1beta1;

public interface AudioConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1beta1.AudioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The format of the audio byte stream.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.AudioEncoding audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for audioEncoding.
   */
  int getAudioEncodingValue();
  /**
   * <pre>
   * Required. The format of the audio byte stream.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.AudioEncoding audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The audioEncoding.
   */
  com.google.cloud.texttospeech.v1beta1.AudioEncoding getAudioEncoding();

  /**
   * <pre>
   * Optional. Input only. Speaking rate/speed, in the range [0.25, 4.0]. 1.0 is
   * the normal native speed supported by the specific voice. 2.0 is twice as
   * fast, and 0.5 is half as fast. If unset(0.0), defaults to the native 1.0
   * speed. Any other values &lt; 0.25 or &gt; 4.0 will return an error.
   * </pre>
   *
   * <code>double speaking_rate = 2 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The speakingRate.
   */
  double getSpeakingRate();

  /**
   * <pre>
   * Optional. Input only. Speaking pitch, in the range [-20.0, 20.0]. 20 means
   * increase 20 semitones from the original pitch. -20 means decrease 20
   * semitones from the original pitch.
   * </pre>
   *
   * <code>double pitch = 3 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pitch.
   */
  double getPitch();

  /**
   * <pre>
   * Optional. Input only. Volume gain (in dB) of the normal native volume
   * supported by the specific voice, in the range [-96.0, 16.0]. If unset, or
   * set to a value of 0.0 (dB), will play at normal native signal amplitude. A
   * value of -6.0 (dB) will play at approximately half the amplitude of the
   * normal native signal amplitude. A value of +6.0 (dB) will play at
   * approximately twice the amplitude of the normal native signal amplitude.
   * Strongly recommend not to exceed +10 (dB) as there's usually no effective
   * increase in loudness for any value greater than that.
   * </pre>
   *
   * <code>double volume_gain_db = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The volumeGainDb.
   */
  double getVolumeGainDb();

  /**
   * <pre>
   * Optional. The synthesis sample rate (in hertz) for this audio. When this is
   * specified in SynthesizeSpeechRequest, if this is different from the voice's
   * natural sample rate, then the synthesizer will honor this request by
   * converting to the desired sample rate (which might result in worse audio
   * quality), unless the specified sample rate is not supported for the
   * encoding chosen, in which case it will fail the request and return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT].
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   * <pre>
   * Optional. Input only. An identifier which selects 'audio effects' profiles
   * that are applied on (post synthesized) text to speech. Effects are applied
   * on top of each other in the order they are given. See
   * [audio
   * profiles](https://cloud.google.com/text-to-speech/docs/audio-profiles) for
   * current supported profile ids.
   * </pre>
   *
   * <code>repeated string effects_profile_id = 6 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the effectsProfileId.
   */
  java.util.List<java.lang.String>
      getEffectsProfileIdList();
  /**
   * <pre>
   * Optional. Input only. An identifier which selects 'audio effects' profiles
   * that are applied on (post synthesized) text to speech. Effects are applied
   * on top of each other in the order they are given. See
   * [audio
   * profiles](https://cloud.google.com/text-to-speech/docs/audio-profiles) for
   * current supported profile ids.
   * </pre>
   *
   * <code>repeated string effects_profile_id = 6 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of effectsProfileId.
   */
  int getEffectsProfileIdCount();
  /**
   * <pre>
   * Optional. Input only. An identifier which selects 'audio effects' profiles
   * that are applied on (post synthesized) text to speech. Effects are applied
   * on top of each other in the order they are given. See
   * [audio
   * profiles](https://cloud.google.com/text-to-speech/docs/audio-profiles) for
   * current supported profile ids.
   * </pre>
   *
   * <code>repeated string effects_profile_id = 6 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The effectsProfileId at the given index.
   */
  java.lang.String getEffectsProfileId(int index);
  /**
   * <pre>
   * Optional. Input only. An identifier which selects 'audio effects' profiles
   * that are applied on (post synthesized) text to speech. Effects are applied
   * on top of each other in the order they are given. See
   * [audio
   * profiles](https://cloud.google.com/text-to-speech/docs/audio-profiles) for
   * current supported profile ids.
   * </pre>
   *
   * <code>repeated string effects_profile_id = 6 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the effectsProfileId at the given index.
   */
  com.google.protobuf.ByteString
      getEffectsProfileIdBytes(int index);
}
