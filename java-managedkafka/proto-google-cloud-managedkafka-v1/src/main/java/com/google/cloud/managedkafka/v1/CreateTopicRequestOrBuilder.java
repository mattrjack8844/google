/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/managedkafka/v1/managed_kafka.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.managedkafka.v1;

public interface CreateTopicRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedkafka.v1.CreateTopicRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent cluster in which to create the topic.
   * Structured like
   * `projects/{project}/locations/{location}/clusters/{cluster}`.
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
   * Required. The parent cluster in which to create the topic.
   * Structured like
   * `projects/{project}/locations/{location}/clusters/{cluster}`.
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
   * Required. The ID to use for the topic, which will become the final
   * component of the topic's name.
   *
   * This value is structured like: `my-topic-name`.
   * </pre>
   *
   * <code>string topic_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The topicId.
   */
  java.lang.String getTopicId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the topic, which will become the final
   * component of the topic's name.
   *
   * This value is structured like: `my-topic-name`.
   * </pre>
   *
   * <code>string topic_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for topicId.
   */
  com.google.protobuf.ByteString getTopicIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Configuration of the topic to create. Its `name` field is
   * ignored.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Topic topic = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   *
   *
   * <pre>
   * Required. Configuration of the topic to create. Its `name` field is
   * ignored.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Topic topic = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The topic.
   */
  com.google.cloud.managedkafka.v1.Topic getTopic();
  /**
   *
   *
   * <pre>
   * Required. Configuration of the topic to create. Its `name` field is
   * ignored.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Topic topic = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.managedkafka.v1.TopicOrBuilder getTopicOrBuilder();
}
