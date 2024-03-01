// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmwareengine.v1;

public interface CreatePrivateCloudRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.CreatePrivateCloudRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the location to create the new
   * private cloud in. Resource names are schemeless URIs that follow the
   * conventions in https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1-a`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the location to create the new
   * private cloud in. Resource names are schemeless URIs that follow the
   * conventions in https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1-a`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The user-provided identifier of the private cloud to be created.
   * This identifier must be unique among each `PrivateCloud` within the parent
   * and becomes the final token in the name URI.
   * The identifier must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC 1034](https://datatracker.ietf.org/doc/html/rfc1034)
   * (section 3.5)
   * </pre>
   *
   * <code>string private_cloud_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The privateCloudId.
   */
  java.lang.String getPrivateCloudId();
  /**
   * <pre>
   * Required. The user-provided identifier of the private cloud to be created.
   * This identifier must be unique among each `PrivateCloud` within the parent
   * and becomes the final token in the name URI.
   * The identifier must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC 1034](https://datatracker.ietf.org/doc/html/rfc1034)
   * (section 3.5)
   * </pre>
   *
   * <code>string private_cloud_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for privateCloudId.
   */
  com.google.protobuf.ByteString
      getPrivateCloudIdBytes();

  /**
   * <pre>
   * Required. The initial description of the new private cloud.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.PrivateCloud private_cloud = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the privateCloud field is set.
   */
  boolean hasPrivateCloud();
  /**
   * <pre>
   * Required. The initial description of the new private cloud.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.PrivateCloud private_cloud = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The privateCloud.
   */
  com.google.cloud.vmwareengine.v1.PrivateCloud getPrivateCloud();
  /**
   * <pre>
   * Required. The initial description of the new private cloud.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.PrivateCloud private_cloud = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vmwareengine.v1.PrivateCloudOrBuilder getPrivateCloudOrBuilder();

  /**
   * <pre>
   * Optional. The request ID must be a valid UUID with the exception that zero
   * UUID is not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. The request ID must be a valid UUID with the exception that zero
   * UUID is not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Optional. True if you want the request to be validated and not executed;
   * false otherwise.
   * </pre>
   *
   * <code>bool validate_only = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
