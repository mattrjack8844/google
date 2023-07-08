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
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public interface AutomatedAgentReplyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.AutomatedAgentReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Response of the Dialogflow
   * [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent]
   * call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
   *
   * @return Whether the detectIntentResponse field is set.
   */
  boolean hasDetectIntentResponse();
  /**
   *
   *
   * <pre>
   * Response of the Dialogflow
   * [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent]
   * call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
   *
   * @return The detectIntentResponse.
   */
  com.google.cloud.dialogflow.v2.DetectIntentResponse getDetectIntentResponse();
  /**
   *
   *
   * <pre>
   * Response of the Dialogflow
   * [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent]
   * call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
   */
  com.google.cloud.dialogflow.v2.DetectIntentResponseOrBuilder getDetectIntentResponseOrBuilder();

  /**
   *
   *
   * <pre>
   * AutomatedAgentReply type.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
   * </code>
   *
   * @return The enum numeric value on the wire for automatedAgentReplyType.
   */
  int getAutomatedAgentReplyTypeValue();
  /**
   *
   *
   * <pre>
   * AutomatedAgentReply type.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
   * </code>
   *
   * @return The automatedAgentReplyType.
   */
  com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType
      getAutomatedAgentReplyType();

  /**
   *
   *
   * <pre>
   * Indicates whether the partial automated agent reply is interruptible when a
   * later reply message arrives. e.g. if the agent specified some music as
   * partial response, it can be cancelled.
   * </pre>
   *
   * <code>bool allow_cancellation = 8;</code>
   *
   * @return The allowCancellation.
   */
  boolean getAllowCancellation();

  /**
   *
   *
   * <pre>
   * The unique identifier of the current Dialogflow CX conversation page.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string cx_current_page = 11;</code>
   *
   * @return The cxCurrentPage.
   */
  java.lang.String getCxCurrentPage();
  /**
   *
   *
   * <pre>
   * The unique identifier of the current Dialogflow CX conversation page.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string cx_current_page = 11;</code>
   *
   * @return The bytes for cxCurrentPage.
   */
  com.google.protobuf.ByteString getCxCurrentPageBytes();
}
