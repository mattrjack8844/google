// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/user_event_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface WriteUserEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.WriteUserEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the userEvent field is set.
   */
  boolean hasUserEvent();
  /**
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The userEvent.
   */
  com.google.cloud.retail.v2.UserEvent getUserEvent();
  /**
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.UserEventOrBuilder getUserEventOrBuilder();

  /**
   * <pre>
   * If set to true, the user event will be written asynchronously after
   * validation, and the API will respond without waiting for the write.
   * Therefore, silent failures can occur even if the API returns success. In
   * case of silent failures, error messages can be found in Stackdriver logs.
   * </pre>
   *
   * <code>bool write_async = 3;</code>
   * @return The writeAsync.
   */
  boolean getWriteAsync();
}
