// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/service.proto

package com.google.cloud.servicedirectory.v1beta1;

public interface ServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1beta1.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name for the service in the format
   * `projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;&#47;services/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The resource name for the service in the format
   * `projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;&#47;services/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Metadata for the service. This data can be consumed by service
   * clients.
   * Restrictions:
   * *   The entire metadata dictionary may contain up to 2000 characters,
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
   * *   The `(*.)google.com/` and `(*.)googleapis.com/` prefixes are reserved
   *     for system metadata managed by Service Directory. If the user tries
   *     to write to these keyspaces, those entries are silently ignored by
   *     the system
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Optional. Metadata for the service. This data can be consumed by service
   * clients.
   * Restrictions:
   * *   The entire metadata dictionary may contain up to 2000 characters,
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
   * *   The `(*.)google.com/` and `(*.)googleapis.com/` prefixes are reserved
   *     for system metadata managed by Service Directory. If the user tries
   *     to write to these keyspaces, those entries are silently ignored by
   *     the system
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Metadata for the service. This data can be consumed by service
   * clients.
   * Restrictions:
   * *   The entire metadata dictionary may contain up to 2000 characters,
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
   * *   The `(*.)google.com/` and `(*.)googleapis.com/` prefixes are reserved
   *     for system metadata managed by Service Directory. If the user tries
   *     to write to these keyspaces, those entries are silently ignored by
   *     the system
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * Optional. Metadata for the service. This data can be consumed by service
   * clients.
   * Restrictions:
   * *   The entire metadata dictionary may contain up to 2000 characters,
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
   * *   The `(*.)google.com/` and `(*.)googleapis.com/` prefixes are reserved
   *     for system metadata managed by Service Directory. If the user tries
   *     to write to these keyspaces, those entries are silently ignored by
   *     the system
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Metadata for the service. This data can be consumed by service
   * clients.
   * Restrictions:
   * *   The entire metadata dictionary may contain up to 2000 characters,
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
   * *   The `(*.)google.com/` and `(*.)googleapis.com/` prefixes are reserved
   *     for system metadata managed by Service Directory. If the user tries
   *     to write to these keyspaces, those entries are silently ignored by
   *     the system
   * Note: This field is equivalent to the `annotations` field in the v1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1beta1.LookupService.ResolveService]. Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1beta1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.servicedirectory.v1beta1.Endpoint> 
      getEndpointsList();
  /**
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1beta1.LookupService.ResolveService]. Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1beta1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.servicedirectory.v1beta1.Endpoint getEndpoints(int index);
  /**
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1beta1.LookupService.ResolveService]. Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1beta1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1beta1.LookupService.ResolveService]. Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1beta1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.servicedirectory.v1beta1.EndpointOrBuilder> 
      getEndpointsOrBuilderList();
  /**
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1beta1.LookupService.ResolveService]. Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1beta1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1beta1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.servicedirectory.v1beta1.EndpointOrBuilder getEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The timestamp when the service was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when the service was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The timestamp when the service was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The timestamp when the service was last updated. Note: endpoints being
   * created/deleted/updated within the service are not considered service
   * updates for the purpose of this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp when the service was last updated. Note: endpoints being
   * created/deleted/updated within the service are not considered service
   * updates for the purpose of this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp when the service was last updated. Note: endpoints being
   * created/deleted/updated within the service are not considered service
   * updates for the purpose of this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
