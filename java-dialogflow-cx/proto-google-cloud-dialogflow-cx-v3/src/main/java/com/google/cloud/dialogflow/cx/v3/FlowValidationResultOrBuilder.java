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
// source: google/cloud/dialogflow/cx/v3/flow.proto

package com.google.cloud.dialogflow.cx.v3;

public interface FlowValidationResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.FlowValidationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the flow validation result.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/validationResult`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the flow validation result.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/validationResult`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Contains all validation messages.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ValidationMessage validation_messages = 2;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.ValidationMessage> getValidationMessagesList();
  /**
   *
   *
   * <pre>
   * Contains all validation messages.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ValidationMessage validation_messages = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ValidationMessage getValidationMessages(int index);
  /**
   *
   *
   * <pre>
   * Contains all validation messages.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ValidationMessage validation_messages = 2;</code>
   */
  int getValidationMessagesCount();
  /**
   *
   *
   * <pre>
   * Contains all validation messages.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ValidationMessage validation_messages = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ValidationMessageOrBuilder>
      getValidationMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contains all validation messages.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ValidationMessage validation_messages = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ValidationMessageOrBuilder getValidationMessagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Last time the flow was validated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Last time the flow was validated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Last time the flow was validated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
