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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface MigrationErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.MigrationError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The error code.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.MigrationError.ErrorCode code = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * Output only. The error code.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.MigrationError.ErrorCode code = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The code.
   */
  com.google.cloud.vmmigration.v1.MigrationError.ErrorCode getCode();

  /**
   *
   *
   * <pre>
   * Output only. The localized error message.
   * </pre>
   *
   * <code>
   * .google.rpc.LocalizedMessage error_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the errorMessage field is set.
   */
  boolean hasErrorMessage();
  /**
   *
   *
   * <pre>
   * Output only. The localized error message.
   * </pre>
   *
   * <code>
   * .google.rpc.LocalizedMessage error_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The errorMessage.
   */
  com.google.rpc.LocalizedMessage getErrorMessage();
  /**
   *
   *
   * <pre>
   * Output only. The localized error message.
   * </pre>
   *
   * <code>
   * .google.rpc.LocalizedMessage error_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.LocalizedMessageOrBuilder getErrorMessageOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Suggested action for solving the error.
   * </pre>
   *
   * <code>
   * .google.rpc.LocalizedMessage action_item = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the actionItem field is set.
   */
  boolean hasActionItem();
  /**
   *
   *
   * <pre>
   * Output only. Suggested action for solving the error.
   * </pre>
   *
   * <code>
   * .google.rpc.LocalizedMessage action_item = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The actionItem.
   */
  com.google.rpc.LocalizedMessage getActionItem();
  /**
   *
   *
   * <pre>
   * Output only. Suggested action for solving the error.
   * </pre>
   *
   * <code>
   * .google.rpc.LocalizedMessage action_item = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.LocalizedMessageOrBuilder getActionItemOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. URL(s) pointing to additional information on handling the
   * current error.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Help.Link help_links = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.rpc.Help.Link> getHelpLinksList();
  /**
   *
   *
   * <pre>
   * Output only. URL(s) pointing to additional information on handling the
   * current error.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Help.Link help_links = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.Help.Link getHelpLinks(int index);
  /**
   *
   *
   * <pre>
   * Output only. URL(s) pointing to additional information on handling the
   * current error.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Help.Link help_links = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getHelpLinksCount();
  /**
   *
   *
   * <pre>
   * Output only. URL(s) pointing to additional information on handling the
   * current error.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Help.Link help_links = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.rpc.Help.LinkOrBuilder> getHelpLinksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. URL(s) pointing to additional information on handling the
   * current error.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Help.Link help_links = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.Help.LinkOrBuilder getHelpLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The time the error occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp error_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the errorTime field is set.
   */
  boolean hasErrorTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the error occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp error_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The errorTime.
   */
  com.google.protobuf.Timestamp getErrorTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the error occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp error_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getErrorTimeOrBuilder();
}
