/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/billing/budgets/v1beta1/budget_model.proto

package com.google.cloud.billing.budgets.v1beta1;

public interface AllUpdatesRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1beta1.AllUpdatesRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Cloud Pub/Sub topic where budget related messages will be
   * published, in the form `projects/{project_id}/topics/{topic_id}`. Updates
   * are sent at regular intervals to the topic. Caller is expected to have
   * `pubsub.topics.setIamPolicy` permission on the topic when it's set for a
   * budget, otherwise, the API call will fail with PERMISSION_DENIED. See
   * https://cloud.google.com/pubsub/docs/access-control for more details on
   * Pub/Sub roles and permissions.
   * </pre>
   *
   * <code>string pubsub_topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getPubsubTopic();
  /**
   *
   *
   * <pre>
   * Required. The name of the Cloud Pub/Sub topic where budget related messages will be
   * published, in the form `projects/{project_id}/topics/{topic_id}`. Updates
   * are sent at regular intervals to the topic. Caller is expected to have
   * `pubsub.topics.setIamPolicy` permission on the topic when it's set for a
   * budget, otherwise, the API call will fail with PERMISSION_DENIED. See
   * https://cloud.google.com/pubsub/docs/access-control for more details on
   * Pub/Sub roles and permissions.
   * </pre>
   *
   * <code>string pubsub_topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getPubsubTopicBytes();

  /**
   *
   *
   * <pre>
   * Required. The schema version of the notification.
   * Only "1.0" is accepted. It represents the JSON schema as defined in
   * https://cloud.google.com/billing/docs/how-to/budgets#notification_format
   * </pre>
   *
   * <code>string schema_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getSchemaVersion();
  /**
   *
   *
   * <pre>
   * Required. The schema version of the notification.
   * Only "1.0" is accepted. It represents the JSON schema as defined in
   * https://cloud.google.com/billing/docs/how-to/budgets#notification_format
   * </pre>
   *
   * <code>string schema_version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getSchemaVersionBytes();
}
