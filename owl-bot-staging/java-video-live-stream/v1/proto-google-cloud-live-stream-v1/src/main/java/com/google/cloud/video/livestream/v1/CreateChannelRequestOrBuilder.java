// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/service.proto

package com.google.cloud.video.livestream.v1;

public interface CreateChannelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.CreateChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent location for the resource, in the form of:
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent location for the resource, in the form of:
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The channel resource to be created.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Channel channel = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the channel field is set.
   */
  boolean hasChannel();
  /**
   * <pre>
   * Required. The channel resource to be created.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Channel channel = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The channel.
   */
  com.google.cloud.video.livestream.v1.Channel getChannel();
  /**
   * <pre>
   * Required. The channel resource to be created.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Channel channel = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.livestream.v1.ChannelOrBuilder getChannelOrBuilder();

  /**
   * <pre>
   * Required. The ID of the channel resource to be created.
   * This value must be 1-63 characters, begin and end with `[a-z0-9]`,
   * could contain dashes (-) in between.
   * </pre>
   *
   * <code>string channel_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * Required. The ID of the channel resource to be created.
   * This value must be 1-63 characters, begin and end with `[a-z0-9]`,
   * could contain dashes (-) in between.
   * </pre>
   *
   * <code>string channel_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <pre>
   * A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported `(00000000-0000-0000-0000-000000000000)`.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported `(00000000-0000-0000-0000-000000000000)`.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
