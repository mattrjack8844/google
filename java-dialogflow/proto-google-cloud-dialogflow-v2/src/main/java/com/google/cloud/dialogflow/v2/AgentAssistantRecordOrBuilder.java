/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dialogflow/v2/answer_record.proto

package com.google.cloud.dialogflow.v2;

public interface AgentAssistantRecordOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.AgentAssistantRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The article suggestion answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the articleSuggestionAnswer field is set.
   */
  boolean hasArticleSuggestionAnswer();
  /**
   *
   *
   * <pre>
   * Output only. The article suggestion answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The articleSuggestionAnswer.
   */
  com.google.cloud.dialogflow.v2.ArticleAnswer getArticleSuggestionAnswer();
  /**
   *
   *
   * <pre>
   * Output only. The article suggestion answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2.ArticleAnswerOrBuilder getArticleSuggestionAnswerOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The FAQ answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the faqAnswer field is set.
   */
  boolean hasFaqAnswer();
  /**
   *
   *
   * <pre>
   * Output only. The FAQ answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The faqAnswer.
   */
  com.google.cloud.dialogflow.v2.FaqAnswer getFaqAnswer();
  /**
   *
   *
   * <pre>
   * Output only. The FAQ answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2.FaqAnswerOrBuilder getFaqAnswerOrBuilder();

  com.google.cloud.dialogflow.v2.AgentAssistantRecord.AnswerCase getAnswerCase();
}
