// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/endpoint.proto

package com.google.cloud.servicedirectory.v1beta1;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1beta1.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name for the endpoint in the format
   * `projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;&#47;services/&#42;&#47;endpoints/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The resource name for the endpoint in the format
   * `projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;&#47;services/&#42;&#47;endpoints/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. An IPv4 or IPv6 address. Service Directory rejects bad addresses
   * like:
   *
   * *   `8.8.8`
   * *   `8.8.8.8:53`
   * *   `test:bad:address`
   * *   `[::1]`
   * *   `[::1]:8080`
   *
   * Limited to 45 characters.
   * </pre>
   *
   * <code>string address = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Optional. An IPv4 or IPv6 address. Service Directory rejects bad addresses
   * like:
   *
   * *   `8.8.8`
   * *   `8.8.8.8:53`
   * *   `test:bad:address`
   * *   `[::1]`
   * *   `[::1]:8080`
   *
   * Limited to 45 characters.
   * </pre>
   *
   * <code>string address = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * Optional. Service Directory rejects values outside of `[0, 65535]`.
   * </pre>
   *
   * <code>int32 port = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The port.
   */
  int getPort();

  /**
   * <pre>
   * Optional. Metadata for the endpoint. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire metadata dictionary may contain up to 512 characters,
   *     spread accoss all key-value pairs. Metadata that goes beyond this
   *     limit are rejected
   * *   Valid metadata keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Metadata that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Optional. Metadata for the endpoint. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire metadata dictionary may contain up to 512 characters,
   *     spread accoss all key-value pairs. Metadata that goes beyond this
   *     limit are rejected
   * *   Valid metadata keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Metadata that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * Optional. Metadata for the endpoint. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire metadata dictionary may contain up to 512 characters,
   *     spread accoss all key-value pairs. Metadata that goes beyond this
   *     limit are rejected
   * *   Valid metadata keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Metadata that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * Optional. Metadata for the endpoint. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire metadata dictionary may contain up to 512 characters,
   *     spread accoss all key-value pairs. Metadata that goes beyond this
   *     limit are rejected
   * *   Valid metadata keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Metadata that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Metadata for the endpoint. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire metadata dictionary may contain up to 512 characters,
   *     spread accoss all key-value pairs. Metadata that goes beyond this
   *     limit are rejected
   * *   Valid metadata keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Metadata that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Immutable. The Google Compute Engine network (VPC) of the endpoint in the
   * format `projects/&lt;project number&gt;/locations/global/networks/&#42;`.
   *
   * The project must be specified by project number (project id is rejected).
   * Incorrectly formatted networks are rejected, but no other validation
   * is performed on this field (ex. network or project existence, reachability,
   * or permissions).
   * </pre>
   *
   * <code>string network = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * Immutable. The Google Compute Engine network (VPC) of the endpoint in the
   * format `projects/&lt;project number&gt;/locations/global/networks/&#42;`.
   *
   * The project must be specified by project number (project id is rejected).
   * Incorrectly formatted networks are rejected, but no other validation
   * is performed on this field (ex. network or project existence, reachability,
   * or permissions).
   * </pre>
   *
   * <code>string network = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * Output only. The timestamp when the endpoint was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when the endpoint was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when the endpoint was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The timestamp when the endpoint was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp when the endpoint was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp when the endpoint was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. A globally unique identifier (in UUID4 format) for this
   * endpoint.
   * </pre>
   *
   * <code>string uid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Output only. A globally unique identifier (in UUID4 format) for this
   * endpoint.
   * </pre>
   *
   * <code>string uid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();
}
