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
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

public interface StreamingAnalyzeContentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the participant this text comes from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>
   * string participant = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The participant.
   */
  java.lang.String getParticipant();
  /**
   *
   *
   * <pre>
   * Required. The name of the participant this text comes from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>
   * string participant = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for participant.
   */
  com.google.protobuf.ByteString getParticipantBytes();

  /**
   *
   *
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig audio_config = 2;</code>
   *
   * @return Whether the audioConfig field is set.
   */
  boolean hasAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig audio_config = 2;</code>
   *
   * @return The audioConfig.
   */
  com.google.cloud.dialogflow.v2beta1.InputAudioConfig getAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig audio_config = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.InputAudioConfigOrBuilder getAudioConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputTextConfig text_config = 3;</code>
   *
   * @return Whether the textConfig field is set.
   */
  boolean hasTextConfig();
  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputTextConfig text_config = 3;</code>
   *
   * @return The textConfig.
   */
  com.google.cloud.dialogflow.v2beta1.InputTextConfig getTextConfig();
  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputTextConfig text_config = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.InputTextConfigOrBuilder getTextConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Speech synthesis configuration.
   * The speech synthesis settings for a virtual agent that may be configured
   * for the associated conversation profile are not used when calling
   * StreamingAnalyzeContent. If this configuration is not supplied, speech
   * synthesis is disabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig reply_audio_config = 4;</code>
   *
   * @return Whether the replyAudioConfig field is set.
   */
  boolean hasReplyAudioConfig();
  /**
   *
   *
   * <pre>
   * Speech synthesis configuration.
   * The speech synthesis settings for a virtual agent that may be configured
   * for the associated conversation profile are not used when calling
   * StreamingAnalyzeContent. If this configuration is not supplied, speech
   * synthesis is disabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig reply_audio_config = 4;</code>
   *
   * @return The replyAudioConfig.
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfig getReplyAudioConfig();
  /**
   *
   *
   * <pre>
   * Speech synthesis configuration.
   * The speech synthesis settings for a virtual agent that may be configured
   * for the associated conversation profile are not used when calling
   * StreamingAnalyzeContent. If this configuration is not supplied, speech
   * synthesis is disabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig reply_audio_config = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfigOrBuilder getReplyAudioConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The input audio content to be recognized. Must be sent if `audio_config`
   * is set in the first message. The complete audio over all streaming
   * messages must not exceed 1 minute.
   * </pre>
   *
   * <code>bytes input_audio = 5;</code>
   *
   * @return Whether the inputAudio field is set.
   */
  boolean hasInputAudio();
  /**
   *
   *
   * <pre>
   * The input audio content to be recognized. Must be sent if `audio_config`
   * is set in the first message. The complete audio over all streaming
   * messages must not exceed 1 minute.
   * </pre>
   *
   * <code>bytes input_audio = 5;</code>
   *
   * @return The inputAudio.
   */
  com.google.protobuf.ByteString getInputAudio();

  /**
   *
   *
   * <pre>
   * The UTF-8 encoded natural language text to be processed. Must be sent if
   * `text_config` is set in the first message. Text length must not exceed
   * 256 bytes for virtual agent interactions. The `input_text` field can be
   * only sent once.
   * </pre>
   *
   * <code>string input_text = 6;</code>
   *
   * @return Whether the inputText field is set.
   */
  boolean hasInputText();
  /**
   *
   *
   * <pre>
   * The UTF-8 encoded natural language text to be processed. Must be sent if
   * `text_config` is set in the first message. Text length must not exceed
   * 256 bytes for virtual agent interactions. The `input_text` field can be
   * only sent once.
   * </pre>
   *
   * <code>string input_text = 6;</code>
   *
   * @return The inputText.
   */
  java.lang.String getInputText();
  /**
   *
   *
   * <pre>
   * The UTF-8 encoded natural language text to be processed. Must be sent if
   * `text_config` is set in the first message. Text length must not exceed
   * 256 bytes for virtual agent interactions. The `input_text` field can be
   * only sent once.
   * </pre>
   *
   * <code>string input_text = 6;</code>
   *
   * @return The bytes for inputText.
   */
  com.google.protobuf.ByteString getInputTextBytes();

  /**
   *
   *
   * <pre>
   * The DTMF digits used to invoke intent and fill in parameter value.
   *
   * This input is ignored if the previous response indicated that DTMF input
   * is not accepted.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents input_dtmf = 9;</code>
   *
   * @return Whether the inputDtmf field is set.
   */
  boolean hasInputDtmf();
  /**
   *
   *
   * <pre>
   * The DTMF digits used to invoke intent and fill in parameter value.
   *
   * This input is ignored if the previous response indicated that DTMF input
   * is not accepted.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents input_dtmf = 9;</code>
   *
   * @return The inputDtmf.
   */
  com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents getInputDtmf();
  /**
   *
   *
   * <pre>
   * The DTMF digits used to invoke intent and fill in parameter value.
   *
   * This input is ignored if the previous response indicated that DTMF input
   * is not accepted.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents input_dtmf = 9;</code>
   */
  com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEventsOrBuilder getInputDtmfOrBuilder();

  /**
   *
   *
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 7;</code>
   *
   * @return Whether the queryParams field is set.
   */
  boolean hasQueryParams();
  /**
   *
   *
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 7;</code>
   *
   * @return The queryParams.
   */
  com.google.cloud.dialogflow.v2beta1.QueryParameters getQueryParams();
  /**
   *
   *
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 7;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 8;</code>
   *
   * @return Whether the assistQueryParams field is set.
   */
  boolean hasAssistQueryParams();
  /**
   *
   *
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 8;</code>
   *
   * @return The assistQueryParams.
   */
  com.google.cloud.dialogflow.v2beta1.AssistQueryParameters getAssistQueryParams();
  /**
   *
   *
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 8;</code>
   */
  com.google.cloud.dialogflow.v2beta1.AssistQueryParametersOrBuilder
      getAssistQueryParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional parameters to be put into Dialogflow CX session parameters. To
   * remove a parameter from the session, clients should explicitly set the
   * parameter value to null.
   *
   * Note: this field should only be used if you are connecting to a Dialogflow
   * CX agent.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_parameters = 13;</code>
   *
   * @return Whether the cxParameters field is set.
   */
  boolean hasCxParameters();
  /**
   *
   *
   * <pre>
   * Additional parameters to be put into Dialogflow CX session parameters. To
   * remove a parameter from the session, clients should explicitly set the
   * parameter value to null.
   *
   * Note: this field should only be used if you are connecting to a Dialogflow
   * CX agent.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_parameters = 13;</code>
   *
   * @return The cxParameters.
   */
  com.google.protobuf.Struct getCxParameters();
  /**
   *
   *
   * <pre>
   * Additional parameters to be put into Dialogflow CX session parameters. To
   * remove a parameter from the session, clients should explicitly set the
   * parameter value to null.
   *
   * Note: this field should only be used if you are connecting to a Dialogflow
   * CX agent.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_parameters = 13;</code>
   */
  com.google.protobuf.StructOrBuilder getCxParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * The unique identifier of the CX page to override the `current_page` in the
   * session.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   *
   * If `cx_current_page` is specified, the previous state of the session will
   * be ignored by Dialogflow CX, including the [previous
   * page][QueryResult.current_page] and the [previous session
   * parameters][QueryResult.parameters]. In most cases, `cx_current_page` and
   * `cx_parameters` should be configured together to direct a session to a
   * specific state.
   *
   * Note: this field should only be used if you are connecting to a Dialogflow
   * CX agent.
   * </pre>
   *
   * <code>string cx_current_page = 15;</code>
   *
   * @return The cxCurrentPage.
   */
  java.lang.String getCxCurrentPage();
  /**
   *
   *
   * <pre>
   * The unique identifier of the CX page to override the `current_page` in the
   * session.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   *
   * If `cx_current_page` is specified, the previous state of the session will
   * be ignored by Dialogflow CX, including the [previous
   * page][QueryResult.current_page] and the [previous session
   * parameters][QueryResult.parameters]. In most cases, `cx_current_page` and
   * `cx_parameters` should be configured together to direct a session to a
   * specific state.
   *
   * Note: this field should only be used if you are connecting to a Dialogflow
   * CX agent.
   * </pre>
   *
   * <code>string cx_current_page = 15;</code>
   *
   * @return The bytes for cxCurrentPage.
   */
  com.google.protobuf.ByteString getCxCurrentPageBytes();

  /**
   *
   *
   * <pre>
   * Enable partial virtual agent responses. If this flag is not enabled,
   * response stream still contains only one final response even if some
   * `Fulfillment`s in Dialogflow virtual agent have been configured to return
   * partial responses.
   * </pre>
   *
   * <code>bool enable_partial_automated_agent_reply = 12;</code>
   *
   * @return The enablePartialAutomatedAgentReply.
   */
  boolean getEnablePartialAutomatedAgentReply();

  /**
   *
   *
   * <pre>
   * if true, `StreamingAnalyzeContentResponse.debugging_info` will get
   * populated.
   * </pre>
   *
   * <code>bool enable_debugging_info = 19;</code>
   *
   * @return The enableDebuggingInfo.
   */
  boolean getEnableDebuggingInfo();

  com.google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest.ConfigCase getConfigCase();

  com.google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest.InputCase getInputCase();
}
