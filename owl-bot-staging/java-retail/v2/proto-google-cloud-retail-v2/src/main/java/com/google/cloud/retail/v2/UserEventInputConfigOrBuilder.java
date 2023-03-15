// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/import_config.proto

package com.google.cloud.retail.v2;

public interface UserEventInputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.UserEventInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEventInlineSource user_event_inline_source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the userEventInlineSource field is set.
   */
  boolean hasUserEventInlineSource();
  /**
   * <pre>
   * Required. The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEventInlineSource user_event_inline_source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The userEventInlineSource.
   */
  com.google.cloud.retail.v2.UserEventInlineSource getUserEventInlineSource();
  /**
   * <pre>
   * Required. The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEventInlineSource user_event_inline_source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.UserEventInlineSourceOrBuilder getUserEventInlineSourceOrBuilder();

  /**
   * <pre>
   * Required. Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.GcsSource gcs_source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   * <pre>
   * Required. Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.GcsSource gcs_source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gcsSource.
   */
  com.google.cloud.retail.v2.GcsSource getGcsSource();
  /**
   * <pre>
   * Required. Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.GcsSource gcs_source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   * <pre>
   * Required. BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.BigQuerySource big_query_source = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the bigQuerySource field is set.
   */
  boolean hasBigQuerySource();
  /**
   * <pre>
   * Required. BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.BigQuerySource big_query_source = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bigQuerySource.
   */
  com.google.cloud.retail.v2.BigQuerySource getBigQuerySource();
  /**
   * <pre>
   * Required. BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.BigQuerySource big_query_source = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.BigQuerySourceOrBuilder getBigQuerySourceOrBuilder();

  public com.google.cloud.retail.v2.UserEventInputConfig.SourceCase getSourceCase();
}
