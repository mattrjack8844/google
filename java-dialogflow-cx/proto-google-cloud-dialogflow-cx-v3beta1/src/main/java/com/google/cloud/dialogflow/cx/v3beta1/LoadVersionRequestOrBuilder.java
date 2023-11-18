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
// source: google/cloud/dialogflow/cx/v3beta1/version.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface LoadVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be
   * loaded to draft flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
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
   * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be
   * loaded to draft flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
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
   * This field is used to prevent accidental overwrite of other agent
   * resources, which can potentially impact other flow's behavior. If
   * `allow_override_agent_resources` is false, conflicted agent-level resources
   * will not be overridden (i.e. intents, entities, webhooks).
   * </pre>
   *
   * <code>bool allow_override_agent_resources = 2;</code>
   *
   * @return The allowOverrideAgentResources.
   */
  boolean getAllowOverrideAgentResources();
}
