// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.videointelligence.v1;

public interface TextDetectionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.TextDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   *
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @return A list containing the languageHints.
   */
  java.util.List<java.lang.String>
      getLanguageHintsList();
  /**
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   *
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @return The count of languageHints.
   */
  int getLanguageHintsCount();
  /**
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   *
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @param index The index of the element to return.
   * @return The languageHints at the given index.
   */
  java.lang.String getLanguageHints(int index);
  /**
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   *
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageHints at the given index.
   */
  com.google.protobuf.ByteString
      getLanguageHintsBytes(int index);

  /**
   * <pre>
   * Model to use for text detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 2;</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Model to use for text detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 2;</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();
}
