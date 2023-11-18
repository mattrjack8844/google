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
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface SubmitAnswerFeedbackRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.SubmitAnswerFeedbackRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the session the feedback was sent to.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The name of the session the feedback was sent to.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Required. ID of the response to update its feedback. This is the same as
   * DetectIntentResponse.response_id.
   * </pre>
   *
   * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The responseId.
   */
  java.lang.String getResponseId();
  /**
   *
   *
   * <pre>
   * Required. ID of the response to update its feedback. This is the same as
   * DetectIntentResponse.response_id.
   * </pre>
   *
   * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for responseId.
   */
  com.google.protobuf.ByteString getResponseIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Feedback provided for a bot answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.AnswerFeedback answer_feedback = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the answerFeedback field is set.
   */
  boolean hasAnswerFeedback();
  /**
   *
   *
   * <pre>
   * Required. Feedback provided for a bot answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.AnswerFeedback answer_feedback = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The answerFeedback.
   */
  com.google.cloud.dialogflow.cx.v3beta1.AnswerFeedback getAnswerFeedback();
  /**
   *
   *
   * <pre>
   * Required. Feedback provided for a bot answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.AnswerFeedback answer_feedback = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.AnswerFeedbackOrBuilder getAnswerFeedbackOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields to update. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields to update. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields to update. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
