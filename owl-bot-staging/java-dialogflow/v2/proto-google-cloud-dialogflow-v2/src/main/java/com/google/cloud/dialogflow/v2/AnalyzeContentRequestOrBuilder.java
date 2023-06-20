// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public interface AnalyzeContentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.AnalyzeContentRequest)
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
   * <code>.google.cloud.dialogflow.v2.TextInput text_input = 6;</code>
   * @return Whether the textInput field is set.
   */
  boolean hasTextInput();
  /**
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.TextInput text_input = 6;</code>
   * @return The textInput.
   */
  com.google.cloud.dialogflow.v2.TextInput getTextInput();
  /**
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.TextInput text_input = 6;</code>
   */
  com.google.cloud.dialogflow.v2.TextInputOrBuilder getTextInputOrBuilder();

  /**
   * <pre>
   * An input event to send to Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput event_input = 8;</code>
   * @return Whether the eventInput field is set.
   */
  boolean hasEventInput();
  /**
   * <pre>
   * An input event to send to Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput event_input = 8;</code>
   * @return The eventInput.
   */
  com.google.cloud.dialogflow.v2.EventInput getEventInput();
  /**
   * <pre>
   * An input event to send to Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput event_input = 8;</code>
   */
  com.google.cloud.dialogflow.v2.EventInputOrBuilder getEventInputOrBuilder();

  /**
   * <pre>
   * Speech synthesis configuration.
   * The speech synthesis settings for a virtual agent that may be configured
   * for the associated conversation profile are not used when calling
   * AnalyzeContent. If this configuration is not supplied, speech synthesis
   * is disabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig reply_audio_config = 5;</code>
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
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig reply_audio_config = 5;</code>
   * @return The replyAudioConfig.
   */
  com.google.cloud.dialogflow.v2.OutputAudioConfig getReplyAudioConfig();
  /**
   * <pre>
   * Speech synthesis configuration.
   * The speech synthesis settings for a virtual agent that may be configured
   * for the associated conversation profile are not used when calling
   * AnalyzeContent. If this configuration is not supplied, speech synthesis
   * is disabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig reply_audio_config = 5;</code>
   */
  com.google.cloud.dialogflow.v2.OutputAudioConfigOrBuilder getReplyAudioConfigOrBuilder();

  /**
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryParameters query_params = 9;</code>
   * @return Whether the queryParams field is set.
   */
  boolean hasQueryParams();
  /**
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryParameters query_params = 9;</code>
   * @return The queryParams.
   */
  com.google.cloud.dialogflow.v2.QueryParameters getQueryParams();
  /**
   * <pre>
   * Parameters for a Dialogflow virtual-agent query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryParameters query_params = 9;</code>
   */
  com.google.cloud.dialogflow.v2.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AssistQueryParameters assist_query_params = 14;</code>
   * @return Whether the assistQueryParams field is set.
   */
  boolean hasAssistQueryParams();
  /**
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AssistQueryParameters assist_query_params = 14;</code>
   * @return The assistQueryParams.
   */
  com.google.cloud.dialogflow.v2.AssistQueryParameters getAssistQueryParams();
  /**
   * <pre>
   * Parameters for a human assist query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AssistQueryParameters assist_query_params = 14;</code>
   */
  com.google.cloud.dialogflow.v2.AssistQueryParametersOrBuilder getAssistQueryParamsOrBuilder();

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

  com.google.cloud.dialogflow.v2.AnalyzeContentRequest.InputCase getInputCase();
}
