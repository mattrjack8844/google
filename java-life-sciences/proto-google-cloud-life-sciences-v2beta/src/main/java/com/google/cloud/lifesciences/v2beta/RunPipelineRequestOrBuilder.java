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
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

public interface RunPipelineRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.RunPipelineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project and location that this request should be executed against.
   * </pre>
   *
   * <code>string parent = 4;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The project and location that this request should be executed against.
   * </pre>
   *
   * <code>string parent = 4;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The description of the pipeline to run.
   * </pre>
   *
   * <code>
   * .google.cloud.lifesciences.v2beta.Pipeline pipeline = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pipeline field is set.
   */
  boolean hasPipeline();
  /**
   *
   *
   * <pre>
   * Required. The description of the pipeline to run.
   * </pre>
   *
   * <code>
   * .google.cloud.lifesciences.v2beta.Pipeline pipeline = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pipeline.
   */
  com.google.cloud.lifesciences.v2beta.Pipeline getPipeline();
  /**
   *
   *
   * <pre>
   * Required. The description of the pipeline to run.
   * </pre>
   *
   * <code>
   * .google.cloud.lifesciences.v2beta.Pipeline pipeline = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.lifesciences.v2beta.PipelineOrBuilder getPipelineOrBuilder();

  /**
   *
   *
   * <pre>
   * User-defined labels to associate with the returned operation. These
   * labels are not propagated to any Google Cloud Platform resources used by
   * the operation, and can be modified at any time.
   * To associate labels with resources created while executing the operation,
   * see the appropriate resource message (for example, `VirtualMachine`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * User-defined labels to associate with the returned operation. These
   * labels are not propagated to any Google Cloud Platform resources used by
   * the operation, and can be modified at any time.
   * To associate labels with resources created while executing the operation,
   * see the appropriate resource message (for example, `VirtualMachine`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * User-defined labels to associate with the returned operation. These
   * labels are not propagated to any Google Cloud Platform resources used by
   * the operation, and can be modified at any time.
   * To associate labels with resources created while executing the operation,
   * see the appropriate resource message (for example, `VirtualMachine`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * User-defined labels to associate with the returned operation. These
   * labels are not propagated to any Google Cloud Platform resources used by
   * the operation, and can be modified at any time.
   * To associate labels with resources created while executing the operation,
   * see the appropriate resource message (for example, `VirtualMachine`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * User-defined labels to associate with the returned operation. These
   * labels are not propagated to any Google Cloud Platform resources used by
   * the operation, and can be modified at any time.
   * To associate labels with resources created while executing the operation,
   * see the appropriate resource message (for example, `VirtualMachine`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The name of an existing Pub/Sub topic.  The server will publish
   * messages to this topic whenever the status of the operation changes.
   * The Life Sciences Service Agent account must have publisher permissions to
   * the specified topic or notifications will not be sent.
   * </pre>
   *
   * <code>string pub_sub_topic = 3;</code>
   *
   * @return The pubSubTopic.
   */
  java.lang.String getPubSubTopic();
  /**
   *
   *
   * <pre>
   * The name of an existing Pub/Sub topic.  The server will publish
   * messages to this topic whenever the status of the operation changes.
   * The Life Sciences Service Agent account must have publisher permissions to
   * the specified topic or notifications will not be sent.
   * </pre>
   *
   * <code>string pub_sub_topic = 3;</code>
   *
   * @return The bytes for pubSubTopic.
   */
  com.google.protobuf.ByteString getPubSubTopicBytes();
}
