// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/persistent_resource_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface CreatePersistentResourceOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreatePersistentResourceOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Operation metadata for PersistentResource.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   * <pre>
   * Operation metadata for PersistentResource.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata();
  /**
   * <pre>
   * Operation metadata for PersistentResource.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder();

  /**
   * <pre>
   * Progress Message for Create LRO
   * </pre>
   *
   * <code>string progress_message = 2;</code>
   * @return The progressMessage.
   */
  java.lang.String getProgressMessage();
  /**
   * <pre>
   * Progress Message for Create LRO
   * </pre>
   *
   * <code>string progress_message = 2;</code>
   * @return The bytes for progressMessage.
   */
  com.google.protobuf.ByteString
      getProgressMessageBytes();
}
