// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/import_config.proto

package com.google.cloud.retail.v2alpha;

public interface ImportCompletionDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ImportCompletionDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The catalog which the suggestions dataset belongs to.
   * Format: `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The catalog which the suggestions dataset belongs to.
   * Format: `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inputConfig.
   */
  com.google.cloud.retail.v2alpha.CompletionDataInputConfig getInputConfig();
  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2alpha.CompletionDataInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   * <pre>
   * Pub/Sub topic for receiving notification. If this field is set,
   * when the import is finished, a notification is sent to
   * specified Pub/Sub topic. The message data is JSON string of a
   * [Operation][google.longrunning.Operation].
   * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string notification_pubsub_topic = 3;</code>
   * @return The notificationPubsubTopic.
   */
  java.lang.String getNotificationPubsubTopic();
  /**
   * <pre>
   * Pub/Sub topic for receiving notification. If this field is set,
   * when the import is finished, a notification is sent to
   * specified Pub/Sub topic. The message data is JSON string of a
   * [Operation][google.longrunning.Operation].
   * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string notification_pubsub_topic = 3;</code>
   * @return The bytes for notificationPubsubTopic.
   */
  com.google.protobuf.ByteString
      getNotificationPubsubTopicBytes();
}
