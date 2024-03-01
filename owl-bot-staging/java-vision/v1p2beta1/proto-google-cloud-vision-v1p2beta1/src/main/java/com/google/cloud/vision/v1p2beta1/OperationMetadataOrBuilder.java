// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vision.v1p2beta1;

public interface OperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Current state of the batch operation.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.OperationMetadata.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Current state of the batch operation.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.OperationMetadata.State state = 1;</code>
   * @return The state.
   */
  com.google.cloud.vision.v1p2beta1.OperationMetadata.State getState();

  /**
   * <pre>
   * The time when the batch request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The time when the batch request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The time when the batch request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The time when the operation result was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The time when the operation result was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The time when the operation result was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
