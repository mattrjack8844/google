/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface SentenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.Sentence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   *
   * @return The text.
   */
  com.google.cloud.language.v1.TextSpan getText();
  /**
   *
   *
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
   *
   * @return Whether the sentiment field is set.
   */
  boolean hasSentiment();
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
   *
   * @return The sentiment.
   */
  com.google.cloud.language.v1.Sentiment getSentiment();
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment sentiment = 2;</code>
   */
  com.google.cloud.language.v1.SentimentOrBuilder getSentimentOrBuilder();
}
