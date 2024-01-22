// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/resource.proto

package com.google.cloud.speech.v1p1beta1;

public interface PhraseSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.PhraseSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the phrase set.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the phrase set.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A list of word and phrases.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.PhraseSet.Phrase phrases = 2;</code>
   */
  java.util.List<com.google.cloud.speech.v1p1beta1.PhraseSet.Phrase> 
      getPhrasesList();
  /**
   * <pre>
   * A list of word and phrases.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.PhraseSet.Phrase phrases = 2;</code>
   */
  com.google.cloud.speech.v1p1beta1.PhraseSet.Phrase getPhrases(int index);
  /**
   * <pre>
   * A list of word and phrases.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.PhraseSet.Phrase phrases = 2;</code>
   */
  int getPhrasesCount();
  /**
   * <pre>
   * A list of word and phrases.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.PhraseSet.Phrase phrases = 2;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1p1beta1.PhraseSet.PhraseOrBuilder> 
      getPhrasesOrBuilderList();
  /**
   * <pre>
   * A list of word and phrases.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.PhraseSet.Phrase phrases = 2;</code>
   */
  com.google.cloud.speech.v1p1beta1.PhraseSet.PhraseOrBuilder getPhrasesOrBuilder(
      int index);

  /**
   * <pre>
   * Hint Boost. Positive value will increase the probability that a specific
   * phrase will be recognized over other similar sounding phrases. The higher
   * the boost, the higher the chance of false positive recognition as well.
   * Negative boost values would correspond to anti-biasing. Anti-biasing is not
   * enabled, so negative boost will simply be ignored. Though `boost` can
   * accept a wide range of positive values, most use cases are best served with
   * values between 0 (exclusive) and 20. We recommend using a binary search
   * approach to finding the optimal value for your use case as well as adding
   * phrases both with and without boost to your requests.
   * </pre>
   *
   * <code>float boost = 4;</code>
   * @return The boost.
   */
  float getBoost();
}
