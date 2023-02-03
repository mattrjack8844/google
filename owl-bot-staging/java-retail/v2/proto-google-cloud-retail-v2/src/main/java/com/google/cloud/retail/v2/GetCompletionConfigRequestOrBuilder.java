// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/catalog_service.proto

package com.google.cloud.retail.v2;

public interface GetCompletionConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.GetCompletionConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Full CompletionConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/completionConfig`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Full CompletionConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/completionConfig`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
