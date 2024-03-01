// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1/webrisk.proto

// Protobuf Java Version: 3.25.2
package com.google.webrisk.v1;

public interface SubmitUriMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.SubmitUriMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The state of the operation.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.SubmitUriMetadata.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The state of the operation.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.SubmitUriMetadata.State state = 1;</code>
   * @return The state.
   */
  com.google.webrisk.v1.SubmitUriMetadata.State getState();

  /**
   * <pre>
   * Creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Latest update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Latest update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Latest update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
