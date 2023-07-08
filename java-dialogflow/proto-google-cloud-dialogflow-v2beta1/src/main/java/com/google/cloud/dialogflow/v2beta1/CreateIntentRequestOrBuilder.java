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
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface CreateIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.CreateIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent to create a intent for.
   * Supported formats:
   *
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The agent to create a intent for.
   * Supported formats:
   *
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Intent intent = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Intent intent = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The intent.
   */
  com.google.cloud.dialogflow.v2beta1.Intent getIntent();
  /**
   *
   *
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Intent intent = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
   *
   * @return The enum numeric value on the wire for intentView.
   */
  int getIntentViewValue();
  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
   *
   * @return The intentView.
   */
  com.google.cloud.dialogflow.v2beta1.IntentView getIntentView();
}
