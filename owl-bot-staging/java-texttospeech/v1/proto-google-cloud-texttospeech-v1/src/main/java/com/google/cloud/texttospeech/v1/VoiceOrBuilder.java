// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1/cloud_tts.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.texttospeech.v1;

public interface VoiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.Voice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The languages that this voice supports, expressed as
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
   * "en-US", "es-419", "cmn-tw").
   * </pre>
   *
   * <code>repeated string language_codes = 1;</code>
   * @return A list containing the languageCodes.
   */
  java.util.List<java.lang.String>
      getLanguageCodesList();
  /**
   * <pre>
   * The languages that this voice supports, expressed as
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
   * "en-US", "es-419", "cmn-tw").
   * </pre>
   *
   * <code>repeated string language_codes = 1;</code>
   * @return The count of languageCodes.
   */
  int getLanguageCodesCount();
  /**
   * <pre>
   * The languages that this voice supports, expressed as
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
   * "en-US", "es-419", "cmn-tw").
   * </pre>
   *
   * <code>repeated string language_codes = 1;</code>
   * @param index The index of the element to return.
   * @return The languageCodes at the given index.
   */
  java.lang.String getLanguageCodes(int index);
  /**
   * <pre>
   * The languages that this voice supports, expressed as
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
   * "en-US", "es-419", "cmn-tw").
   * </pre>
   *
   * <code>repeated string language_codes = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageCodes at the given index.
   */
  com.google.protobuf.ByteString
      getLanguageCodesBytes(int index);

  /**
   * <pre>
   * The name of this voice.  Each distinct voice has a unique name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of this voice.  Each distinct voice has a unique name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The gender of this voice.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
   * @return The enum numeric value on the wire for ssmlGender.
   */
  int getSsmlGenderValue();
  /**
   * <pre>
   * The gender of this voice.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
   * @return The ssmlGender.
   */
  com.google.cloud.texttospeech.v1.SsmlVoiceGender getSsmlGender();

  /**
   * <pre>
   * The natural sample rate (in hertz) for this voice.
   * </pre>
   *
   * <code>int32 natural_sample_rate_hertz = 4;</code>
   * @return The naturalSampleRateHertz.
   */
  int getNaturalSampleRateHertz();
}
