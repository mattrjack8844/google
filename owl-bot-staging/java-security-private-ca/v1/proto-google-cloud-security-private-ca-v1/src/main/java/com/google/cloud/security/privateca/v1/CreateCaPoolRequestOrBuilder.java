// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1;

public interface CreateCaPoolRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.CreateCaPoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the location associated with the
   * [CaPool][google.cloud.security.privateca.v1.CaPool], in the format
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the location associated with the
   * [CaPool][google.cloud.security.privateca.v1.CaPool], in the format
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string ca_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The caPoolId.
   */
  java.lang.String getCaPoolId();
  /**
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string ca_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for caPoolId.
   */
  com.google.protobuf.ByteString
      getCaPoolIdBytes();

  /**
   * <pre>
   * Required. A [CaPool][google.cloud.security.privateca.v1.CaPool] with
   * initial field values.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.CaPool ca_pool = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the caPool field is set.
   */
  boolean hasCaPool();
  /**
   * <pre>
   * Required. A [CaPool][google.cloud.security.privateca.v1.CaPool] with
   * initial field values.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.CaPool ca_pool = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The caPool.
   */
  com.google.cloud.security.privateca.v1.CaPool getCaPool();
  /**
   * <pre>
   * Required. A [CaPool][google.cloud.security.privateca.v1.CaPool] with
   * initial field values.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1.CaPool ca_pool = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.security.privateca.v1.CaPoolOrBuilder getCaPoolOrBuilder();

  /**
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that
   * if you must retry your request, the server will know to ignore the request
   * if it has already been completed. The server will guarantee that for at
   * least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that
   * if you must retry your request, the server will know to ignore the request
   * if it has already been completed. The server will guarantee that for at
   * least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
