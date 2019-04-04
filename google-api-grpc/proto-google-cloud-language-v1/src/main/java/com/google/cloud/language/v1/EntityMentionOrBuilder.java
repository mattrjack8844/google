// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface EntityMentionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.EntityMention)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v1.TextSpan getText();
  /**
   *
   *
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.language.v1.EntityMention.Type type = 2;</code>
   */
  com.google.cloud.language.v1.EntityMention.Type getType();

  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the sentiment expressed for this mention of
   * the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
   */
  boolean hasSentiment();
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the sentiment expressed for this mention of
   * the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
   */
  com.google.cloud.language.v1.Sentiment getSentiment();
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the sentiment expressed for this mention of
   * the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 3;</code>
   */
  com.google.cloud.language.v1.SentimentOrBuilder getSentimentOrBuilder();
}
