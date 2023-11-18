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
// source: google/cloud/dialogflow/cx/v3/agent.proto

package com.google.cloud.dialogflow.cx.v3;

public interface ExportAgentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ExportAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the agent to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the agent to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the agent
   * to. The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If
   * left unspecified, the serialized agent is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The agentUri.
   */
  java.lang.String getAgentUri();
  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the agent
   * to. The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If
   * left unspecified, the serialized agent is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for agentUri.
   */
  com.google.protobuf.ByteString getAgentUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The data format of the exported agent. If not specified, `BLOB`
   * is assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ExportAgentRequest.DataFormat data_format = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for dataFormat.
   */
  int getDataFormatValue();
  /**
   *
   *
   * <pre>
   * Optional. The data format of the exported agent. If not specified, `BLOB`
   * is assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ExportAgentRequest.DataFormat data_format = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataFormat.
   */
  com.google.cloud.dialogflow.cx.v3.ExportAgentRequest.DataFormat getDataFormat();

  /**
   *
   *
   * <pre>
   * Optional. Environment name. If not set, draft environment is assumed.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;`.
   * </pre>
   *
   * <code>
   * string environment = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The environment.
   */
  java.lang.String getEnvironment();
  /**
   *
   *
   * <pre>
   * Optional. Environment name. If not set, draft environment is assumed.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;`.
   * </pre>
   *
   * <code>
   * string environment = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString getEnvironmentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Git branch to export the agent to.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ExportAgentRequest.GitDestination git_destination = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gitDestination field is set.
   */
  boolean hasGitDestination();
  /**
   *
   *
   * <pre>
   * Optional. The Git branch to export the agent to.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ExportAgentRequest.GitDestination git_destination = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gitDestination.
   */
  com.google.cloud.dialogflow.cx.v3.ExportAgentRequest.GitDestination getGitDestination();
  /**
   *
   *
   * <pre>
   * Optional. The Git branch to export the agent to.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ExportAgentRequest.GitDestination git_destination = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.ExportAgentRequest.GitDestinationOrBuilder
      getGitDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Whether to include BigQuery Export setting.
   * </pre>
   *
   * <code>bool include_bigquery_export_settings = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The includeBigqueryExportSettings.
   */
  boolean getIncludeBigqueryExportSettings();
}
