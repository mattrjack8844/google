// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface QueryResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.QueryResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The original conversational query text:
   * - If natural language text was provided as input, `query_text` contains
   *   a copy of the input.
   * - If natural language speech audio was provided as input, `query_text`
   *   contains the speech recognition result. If speech recognizer produced
   *   multiple alternatives, a particular one is picked.
   * - If automatic spell correction is enabled, `query_text` will contain the
   *   corrected user input.
   * </pre>
   *
   * <code>string query_text = 1;</code>
   */
  java.lang.String getQueryText();
  /**
   *
   *
   * <pre>
   * The original conversational query text:
   * - If natural language text was provided as input, `query_text` contains
   *   a copy of the input.
   * - If natural language speech audio was provided as input, `query_text`
   *   contains the speech recognition result. If speech recognizer produced
   *   multiple alternatives, a particular one is picked.
   * - If automatic spell correction is enabled, `query_text` will contain the
   *   corrected user input.
   * </pre>
   *
   * <code>string query_text = 1;</code>
   */
  com.google.protobuf.ByteString getQueryTextBytes();

  /**
   *
   *
   * <pre>
   * The language that was triggered during intent detection.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 15;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language that was triggered during intent detection.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 15;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The Speech recognition confidence between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. The default of 0.0 is a sentinel value indicating that confidence
   * was not set.
   * This field is not guaranteed to be accurate or set. In particular this
   * field isn't set for StreamingDetectIntent since the streaming endpoint has
   * separate confidence estimates per portion of the audio in
   * StreamingRecognitionResult.
   * </pre>
   *
   * <code>float speech_recognition_confidence = 2;</code>
   */
  float getSpeechRecognitionConfidence();

  /**
   *
   *
   * <pre>
   * The action name from the matched intent.
   * </pre>
   *
   * <code>string action = 3;</code>
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * The action name from the matched intent.
   * </pre>
   *
   * <code>string action = 3;</code>
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * The collection of extracted parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 4;</code>
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The collection of extracted parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 4;</code>
   */
  com.google.protobuf.Struct getParameters();
  /**
   *
   *
   * <pre>
   * The collection of extracted parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * This field is set to:
   * - `false` if the matched intent has required parameters and not all of
   *    the required parameter values have been collected.
   * - `true` if all required parameter values have been collected, or if the
   *    matched intent doesn't contain any required parameters.
   * </pre>
   *
   * <code>bool all_required_params_present = 5;</code>
   */
  boolean getAllRequiredParamsPresent();

  /**
   *
   *
   * <pre>
   * The text to be pronounced to the user or shown on the screen.
   * Note: This is a legacy field, `fulfillment_messages` should be preferred.
   * </pre>
   *
   * <code>string fulfillment_text = 6;</code>
   */
  java.lang.String getFulfillmentText();
  /**
   *
   *
   * <pre>
   * The text to be pronounced to the user or shown on the screen.
   * Note: This is a legacy field, `fulfillment_messages` should be preferred.
   * </pre>
   *
   * <code>string fulfillment_text = 6;</code>
   */
  com.google.protobuf.ByteString getFulfillmentTextBytes();

  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Message> getFulfillmentMessagesList();
  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.Message getFulfillmentMessages(int index);
  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  int getFulfillmentMessagesCount();
  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder>
      getFulfillmentMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder getFulfillmentMessagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `source` field returned in the webhook response.
   * </pre>
   *
   * <code>string webhook_source = 8;</code>
   */
  java.lang.String getWebhookSource();
  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `source` field returned in the webhook response.
   * </pre>
   *
   * <code>string webhook_source = 8;</code>
   */
  com.google.protobuf.ByteString getWebhookSourceBytes();

  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `payload` field returned in the webhook response.
   * </pre>
   *
   * <code>.google.protobuf.Struct webhook_payload = 9;</code>
   */
  boolean hasWebhookPayload();
  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `payload` field returned in the webhook response.
   * </pre>
   *
   * <code>.google.protobuf.Struct webhook_payload = 9;</code>
   */
  com.google.protobuf.Struct getWebhookPayload();
  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `payload` field returned in the webhook response.
   * </pre>
   *
   * <code>.google.protobuf.Struct webhook_payload = 9;</code>
   */
  com.google.protobuf.StructOrBuilder getWebhookPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Context> getOutputContextsList();
  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Context getOutputContexts(int index);
  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  int getOutputContextsCount();
  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ContextOrBuilder>
      getOutputContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getOutputContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The intent that matched the conversational query. Some, not
   * all fields are filled in this message, including but not limited to:
   * `name`, `display_name` and `webhook_state`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 11;</code>
   */
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * The intent that matched the conversational query. Some, not
   * all fields are filled in this message, including but not limited to:
   * `name`, `display_name` and `webhook_state`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 11;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent getIntent();
  /**
   *
   *
   * <pre>
   * The intent that matched the conversational query. Some, not
   * all fields are filled in this message, including but not limited to:
   * `name`, `display_name` and `webhook_state`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 11;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * The intent detection confidence. Values range from 0.0
   * (completely uncertain) to 1.0 (completely certain).
   * If there are `multiple knowledge_answers` messages, this value is set to
   * the greatest `knowledgeAnswers.match_confidence` value in the list.
   * </pre>
   *
   * <code>float intent_detection_confidence = 12;</code>
   */
  float getIntentDetectionConfidence();

  /**
   *
   *
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The string keys of the Struct's fields map can change
   * without notice.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 14;</code>
   */
  boolean hasDiagnosticInfo();
  /**
   *
   *
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The string keys of the Struct's fields map can change
   * without notice.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 14;</code>
   */
  com.google.protobuf.Struct getDiagnosticInfo();
  /**
   *
   *
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The string keys of the Struct's fields map can change
   * without notice.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 14;</code>
   */
  com.google.protobuf.StructOrBuilder getDiagnosticInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The sentiment analysis result, which depends on the
   * `sentiment_analysis_request_config` specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   */
  boolean hasSentimentAnalysisResult();
  /**
   *
   *
   * <pre>
   * The sentiment analysis result, which depends on the
   * `sentiment_analysis_request_config` specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult getSentimentAnalysisResult();
  /**
   *
   *
   * <pre>
   * The sentiment analysis result, which depends on the
   * `sentiment_analysis_request_config` specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResultOrBuilder
      getSentimentAnalysisResultOrBuilder();

  /**
   *
   *
   * <pre>
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeAnswers knowledge_answers = 18;</code>
   */
  boolean hasKnowledgeAnswers();
  /**
   *
   *
   * <pre>
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeAnswers knowledge_answers = 18;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeAnswers getKnowledgeAnswers();
  /**
   *
   *
   * <pre>
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeAnswers knowledge_answers = 18;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeAnswersOrBuilder getKnowledgeAnswersOrBuilder();
}
