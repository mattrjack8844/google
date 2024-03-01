// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v2;

public interface SpeechAdaptationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.SpeechAdaptation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet> 
      getPhraseSetsList();
  /**
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;</code>
   */
  com.google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet getPhraseSets(int index);
  /**
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;</code>
   */
  int getPhraseSetsCount();
  /**
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSetOrBuilder> 
      getPhraseSetsOrBuilderList();
  /**
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;</code>
   */
  com.google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSetOrBuilder getPhraseSetsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  java.util.List<com.google.cloud.speech.v2.CustomClass> 
      getCustomClassesList();
  /**
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  com.google.cloud.speech.v2.CustomClass getCustomClasses(int index);
  /**
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  int getCustomClassesCount();
  /**
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.CustomClassOrBuilder> 
      getCustomClassesOrBuilderList();
  /**
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  com.google.cloud.speech.v2.CustomClassOrBuilder getCustomClassesOrBuilder(
      int index);
}
