// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface ImportMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ImportMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Operation create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Operation create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Operation create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Operation last update time. If the operation is done, this is also the
   * finish time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Operation last update time. If the operation is done, this is also the
   * finish time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Operation last update time. If the operation is done, this is also the
   * finish time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Count of entries that were processed successfully.
   * </pre>
   *
   * <code>int64 success_count = 3;</code>
   * @return The successCount.
   */
  long getSuccessCount();

  /**
   * <pre>
   * Count of entries that encountered errors while processing.
   * </pre>
   *
   * <code>int64 failure_count = 4;</code>
   * @return The failureCount.
   */
  long getFailureCount();

  /**
   * <pre>
   * Deprecated. This field is never set.
   * </pre>
   *
   * <code>string request_id = 5 [deprecated = true];</code>
   * @deprecated google.cloud.retail.v2alpha.ImportMetadata.request_id is deprecated.
   *     See google/cloud/retail/v2alpha/import_config.proto;l=339
   * @return The requestId.
   */
  @java.lang.Deprecated java.lang.String getRequestId();
  /**
   * <pre>
   * Deprecated. This field is never set.
   * </pre>
   *
   * <code>string request_id = 5 [deprecated = true];</code>
   * @deprecated google.cloud.retail.v2alpha.ImportMetadata.request_id is deprecated.
   *     See google/cloud/retail/v2alpha/import_config.proto;l=339
   * @return The bytes for requestId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Pub/Sub topic for receiving notification. If this field is set,
   * when the import is finished, a notification is sent to
   * specified Pub/Sub topic. The message data is JSON string of a
   * [Operation][google.longrunning.Operation].
   * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string notification_pubsub_topic = 6;</code>
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
   * <code>string notification_pubsub_topic = 6;</code>
   * @return The bytes for notificationPubsubTopic.
   */
  com.google.protobuf.ByteString
      getNotificationPubsubTopicBytes();

  /**
   * <pre>
   * Metadata related to transform user events.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.TransformedUserEventsMetadata transformed_user_events_metadata = 7;</code>
   * @return Whether the transformedUserEventsMetadata field is set.
   */
  boolean hasTransformedUserEventsMetadata();
  /**
   * <pre>
   * Metadata related to transform user events.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.TransformedUserEventsMetadata transformed_user_events_metadata = 7;</code>
   * @return The transformedUserEventsMetadata.
   */
  com.google.cloud.retail.v2alpha.TransformedUserEventsMetadata getTransformedUserEventsMetadata();
  /**
   * <pre>
   * Metadata related to transform user events.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.TransformedUserEventsMetadata transformed_user_events_metadata = 7;</code>
   */
  com.google.cloud.retail.v2alpha.TransformedUserEventsMetadataOrBuilder getTransformedUserEventsMetadataOrBuilder();
}
