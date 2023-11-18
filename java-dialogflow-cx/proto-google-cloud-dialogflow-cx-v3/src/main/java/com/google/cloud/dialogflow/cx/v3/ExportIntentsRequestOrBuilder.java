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
// source: google/cloud/dialogflow/cx/v3/intent.proto

package com.google.cloud.dialogflow.cx.v3;

public interface ExportIntentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ExportIntentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent agent to export intents.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;`.
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
   * Required. The name of the parent agent to export intents.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;`.
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
   * Required. The name of the intents to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>repeated string intents = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the intents.
   */
  java.util.List<java.lang.String> getIntentsList();
  /**
   *
   *
   * <pre>
   * Required. The name of the intents to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>repeated string intents = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of intents.
   */
  int getIntentsCount();
  /**
   *
   *
   * <pre>
   * Required. The name of the intents to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>repeated string intents = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The intents at the given index.
   */
  java.lang.String getIntents(int index);
  /**
   *
   *
   * <pre>
   * Required. The name of the intents to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>repeated string intents = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the intents at the given index.
   */
  com.google.protobuf.ByteString getIntentsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the
   * intents to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string intents_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the intentsUri field is set.
   */
  boolean hasIntentsUri();
  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the
   * intents to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string intents_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The intentsUri.
   */
  java.lang.String getIntentsUri();
  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the
   * intents to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string intents_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for intentsUri.
   */
  com.google.protobuf.ByteString getIntentsUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The option to return the serialized intents inline.
   * </pre>
   *
   * <code>bool intents_content_inline = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the intentsContentInline field is set.
   */
  boolean hasIntentsContentInline();
  /**
   *
   *
   * <pre>
   * Optional. The option to return the serialized intents inline.
   * </pre>
   *
   * <code>bool intents_content_inline = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The intentsContentInline.
   */
  boolean getIntentsContentInline();

  /**
   *
   *
   * <pre>
   * Optional. The data format of the exported intents. If not specified, `BLOB`
   * is assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ExportIntentsRequest.DataFormat data_format = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for dataFormat.
   */
  int getDataFormatValue();
  /**
   *
   *
   * <pre>
   * Optional. The data format of the exported intents. If not specified, `BLOB`
   * is assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ExportIntentsRequest.DataFormat data_format = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataFormat.
   */
  com.google.cloud.dialogflow.cx.v3.ExportIntentsRequest.DataFormat getDataFormat();

  com.google.cloud.dialogflow.cx.v3.ExportIntentsRequest.DestinationCase getDestinationCase();
}
