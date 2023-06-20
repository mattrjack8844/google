// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

public interface AnalyzeContentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AnalyzeContentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the participant this text comes from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>string participant = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The participant.
   */
  java.lang.String getParticipant();
  /**
   * <pre>
   * Required. The name of the participant this text comes from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>string participant = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for participant.
   */
  com.google.protobuf.ByteString
      getParticipantBytes();

  /**
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TextInput text_input = 6;</code>
   * @return Whether the textInput field is set.
   */
  boolean hasTextInput();
  /**
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TextInput text_input = 6;</code>
   * @return The textInput.
   */
  com.google.cloud.dialogflow.v2beta1.TextInput getTextInput();
  /**
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.TextInput text_input = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.TextInputOrBuilder getTextInputOrBuilder();

  /**
   * <pre>
   * The natural language speech audio to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AudioInput audio_input = 7;</code>
   * @return Whether the audioInput field is set.
   */
  boolean hasAudioInput();
  /**
   * <pre>
   * The natural language speech audio to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AudioInput audio_input = 7;</code>
   * @return The audioInput.
   */
  com.google.cloud.dialogflow.v2beta1.AudioInput getAudioInput();
  /**
   * <pre>
   * The natural language speech audio to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AudioInput audio_input = 7;</code>
   */
  com.google.cloud.dialogflow.v2beta1.AudioInputOrBuilder getAudioInputOrBuilder();

  /**
   * <pre>
   * An input event to send to Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput event_input = 8;</code>
   * @return Whether the eventInput field is set.
   */
  boolean hasEventInput();
  /**
   * <pre>
   * An input event to send to Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput event_input = 8;</code>
   * @return The eventInput.
   */
  com.google.cloud.dialogflow.v2beta1.EventInput getEventInput();
  /**
   * <pre>
   * An input event to send to Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput event_input = 8;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EventInputOrBuilder getEventInputOrBuilder();

  /**
   * <pre>
   * An input representing the selection of a suggestion.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SuggestionInput suggestion_input = 12;</code>
   * @return Whether the suggestionInput field is set.
   */
  boolean hasSuggestionInput();
  /**
   * <pre>
   * An input representing the selection of a suggestion.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SuggestionInput suggestion_input = 12;</code>
   * @return The suggestionInput.
   */
  com.google.cloud.dialogflow.v2beta1.SuggestionInput getSuggestionInput();
  /**
   * <pre>
   * An input representing the selection of a suggestion.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SuggestionInput suggestion_input = 12;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SuggestionInputOrBuilder getSuggestionInputOrBuilder();

  /**
   * <pre>
   * Speech synthesis configuration.
   * The speech synthesis settings for a virtual agent that may be configured
   * for the associated conversation profile are not used when calling
   * AnalyzeContent. If this configuration is not supplied, speech synthesis
   * is disabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig reply_audio_config = 5;</code>
   * @return Whether the replyAudioConfig field is set.
   */
  boolean hasReplyAudioConfig();
  /**
   * <pre>
   * Speech synthesis configuration.
   * The speech synthesis settings for a virtual agent that may be configured
   * for the associated conversation profile are not used when calling
   * AnalyzeContent. If this configuration is not supplied, speech synthesis
   * is disabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig reply_audio_config = 5;</code>
   * @return The replyAudioConfig.
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfig getReplyAudioConfig();
  /**
   * <pre>
   * Speech synthesis configuration.
   * The speech synthesis settings for a virtual agent that may be configured
   * for the associated conversation profile are not used when calling
   * AnalyzeContent. If this configuration is not supplied, speech synthesis
   * is disabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig reply_audio_config = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfigOrBuilder getReplyAudioConfigOrBuilder();

  /**
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 9;</code>
   * @return Whether the queryParams field is set.
   */
  boolean hasQueryParams();
  /**
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 9;</code>
   * @return The queryParams.
   */
  com.google.cloud.dialogflow.v2beta1.QueryParameters getQueryParams();
  /**
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 9;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 14;</code>
   * @return Whether the assistQueryParams field is set.
   */
  boolean hasAssistQueryParams();
  /**
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 14;</code>
   * @return The assistQueryParams.
   */
  com.google.cloud.dialogflow.v2beta1.AssistQueryParameters getAssistQueryParams();
  /**
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AssistQueryParameters assist_query_params = 14;</code>
   */
  com.google.cloud.dialogflow.v2beta1.AssistQueryParametersOrBuilder getAssistQueryParamsOrBuilder();

  /**
   * <pre>
   * Additional parameters to be put into Dialogflow CX session parameters. To
   * remove a parameter from the session, clients should explicitly set the
   * parameter value to null.
   *
   * Note: this field should only be used if you are connecting to a Dialogflow
   * CX agent.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_parameters = 18;</code>
   * @return Whether the cxParameters field is set.
   */
  boolean hasCxParameters();
  /**
   * <pre>
   * Additional parameters to be put into Dialogflow CX session parameters. To
   * remove a parameter from the session, clients should explicitly set the
   * parameter value to null.
   *
   * Note: this field should only be used if you are connecting to a Dialogflow
   * CX agent.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_parameters = 18;</code>
   * @return The cxParameters.
   */
  com.google.protobuf.Struct getCxParameters();
  /**
   * <pre>
   * Additional parameters to be put into Dialogflow CX session parameters. To
   * remove a parameter from the session, clients should explicitly set the
   * parameter value to null.
   *
   * Note: this field should only be used if you are connecting to a Dialogflow
   * CX agent.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_parameters = 18;</code>
   */
  com.google.protobuf.StructOrBuilder getCxParametersOrBuilder();

  /**
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
   * <code>string cx_current_page = 20;</code>
   * @return The cxCurrentPage.
   */
  java.lang.String getCxCurrentPage();
  /**
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
   * <code>string cx_current_page = 20;</code>
   * @return The bytes for cxCurrentPage.
   */
  com.google.protobuf.ByteString
      getCxCurrentPageBytes();

  /**
   * <pre>
   * Optional. The send time of the message from end user or human agent's
   * perspective. It is used for identifying the same message under one
   * participant.
   *
   * Given two messages under the same participant:
   *  - If send time are different regardless of whether the content of the
   *  messages are exactly the same, the conversation will regard them as
   *  two distinct messages sent by the participant.
   *  - If send time is the same regardless of whether the content of the
   *  messages are exactly the same, the conversation will regard them as
   *  same message, and ignore the message received later.
   *
   * If the value is not provided, a new request will always be regarded as a
   * new message without any de-duplication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_send_time = 10;</code>
   * @return Whether the messageSendTime field is set.
   */
  boolean hasMessageSendTime();
  /**
   * <pre>
   * Optional. The send time of the message from end user or human agent's
   * perspective. It is used for identifying the same message under one
   * participant.
   *
   * Given two messages under the same participant:
   *  - If send time are different regardless of whether the content of the
   *  messages are exactly the same, the conversation will regard them as
   *  two distinct messages sent by the participant.
   *  - If send time is the same regardless of whether the content of the
   *  messages are exactly the same, the conversation will regard them as
   *  same message, and ignore the message received later.
   *
   * If the value is not provided, a new request will always be regarded as a
   * new message without any de-duplication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_send_time = 10;</code>
   * @return The messageSendTime.
   */
  com.google.protobuf.Timestamp getMessageSendTime();
  /**
   * <pre>
   * Optional. The send time of the message from end user or human agent's
   * perspective. It is used for identifying the same message under one
   * participant.
   *
   * Given two messages under the same participant:
   *  - If send time are different regardless of whether the content of the
   *  messages are exactly the same, the conversation will regard them as
   *  two distinct messages sent by the participant.
   *  - If send time is the same regardless of whether the content of the
   *  messages are exactly the same, the conversation will regard them as
   *  same message, and ignore the message received later.
   *
   * If the value is not provided, a new request will always be regarded as a
   * new message without any de-duplication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_send_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMessageSendTimeOrBuilder();

  /**
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters.
   * A random UUID is recommended.
   * This request is only idempotent if a `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 11;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters.
   * A random UUID is recommended.
   * This request is only idempotent if a `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 11;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  com.google.cloud.dialogflow.v2beta1.AnalyzeContentRequest.InputCase getInputCase();
}
