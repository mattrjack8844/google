// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/answer_record.proto

package com.google.cloud.dialogflow.v2;

public interface AnswerFeedbackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.AnswerFeedback)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The correctness level of the specific answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
   * @return The enum numeric value on the wire for correctnessLevel.
   */
  int getCorrectnessLevelValue();
  /**
   * <pre>
   * The correctness level of the specific answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
   * @return The correctnessLevel.
   */
  com.google.cloud.dialogflow.v2.AnswerFeedback.CorrectnessLevel getCorrectnessLevel();

  /**
   * <pre>
   * Detail feedback of agent assist suggestions.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AgentAssistantFeedback agent_assistant_detail_feedback = 2;</code>
   * @return Whether the agentAssistantDetailFeedback field is set.
   */
  boolean hasAgentAssistantDetailFeedback();
  /**
   * <pre>
   * Detail feedback of agent assist suggestions.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AgentAssistantFeedback agent_assistant_detail_feedback = 2;</code>
   * @return The agentAssistantDetailFeedback.
   */
  com.google.cloud.dialogflow.v2.AgentAssistantFeedback getAgentAssistantDetailFeedback();
  /**
   * <pre>
   * Detail feedback of agent assist suggestions.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AgentAssistantFeedback agent_assistant_detail_feedback = 2;</code>
   */
  com.google.cloud.dialogflow.v2.AgentAssistantFeedbackOrBuilder getAgentAssistantDetailFeedbackOrBuilder();

  /**
   * <pre>
   * Indicates whether the answer/item was clicked by the human agent
   * or not. Default to false.
   * For knowledge search and knowledge assist, the answer record is considered
   * to be clicked if the answer was copied or any URI was clicked.
   * </pre>
   *
   * <code>bool clicked = 3;</code>
   * @return The clicked.
   */
  boolean getClicked();

  /**
   * <pre>
   * Time when the answer/item was clicked.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp click_time = 5;</code>
   * @return Whether the clickTime field is set.
   */
  boolean hasClickTime();
  /**
   * <pre>
   * Time when the answer/item was clicked.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp click_time = 5;</code>
   * @return The clickTime.
   */
  com.google.protobuf.Timestamp getClickTime();
  /**
   * <pre>
   * Time when the answer/item was clicked.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp click_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getClickTimeOrBuilder();

  /**
   * <pre>
   * Indicates whether the answer/item was displayed to the human
   * agent in the agent desktop UI. Default to false.
   * </pre>
   *
   * <code>bool displayed = 4;</code>
   * @return The displayed.
   */
  boolean getDisplayed();

  /**
   * <pre>
   * Time when the answer/item was displayed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp display_time = 6;</code>
   * @return Whether the displayTime field is set.
   */
  boolean hasDisplayTime();
  /**
   * <pre>
   * Time when the answer/item was displayed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp display_time = 6;</code>
   * @return The displayTime.
   */
  com.google.protobuf.Timestamp getDisplayTime();
  /**
   * <pre>
   * Time when the answer/item was displayed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp display_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDisplayTimeOrBuilder();

  com.google.cloud.dialogflow.v2.AnswerFeedback.DetailFeedbackCase getDetailFeedbackCase();
}
