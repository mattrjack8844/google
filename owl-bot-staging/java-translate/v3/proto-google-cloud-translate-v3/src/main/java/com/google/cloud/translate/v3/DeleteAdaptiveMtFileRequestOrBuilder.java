// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/adaptive_mt.proto

package com.google.cloud.translate.v3;

public interface DeleteAdaptiveMtFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.DeleteAdaptiveMtFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the file to delete, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/adaptiveMtDatasets/{dataset}/adaptiveMtFiles/{file}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the file to delete, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/adaptiveMtDatasets/{dataset}/adaptiveMtFiles/{file}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
