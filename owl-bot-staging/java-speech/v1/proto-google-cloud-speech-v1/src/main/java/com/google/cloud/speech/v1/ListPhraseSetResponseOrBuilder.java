// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1;

public interface ListPhraseSetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.ListPhraseSetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The phrase set.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v1.PhraseSet> 
      getPhraseSetsList();
  /**
   * <pre>
   * The phrase set.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  com.google.cloud.speech.v1.PhraseSet getPhraseSets(int index);
  /**
   * <pre>
   * The phrase set.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  int getPhraseSetsCount();
  /**
   * <pre>
   * The phrase set.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.PhraseSetOrBuilder> 
      getPhraseSetsOrBuilderList();
  /**
   * <pre>
   * The phrase set.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  com.google.cloud.speech.v1.PhraseSetOrBuilder getPhraseSetsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
