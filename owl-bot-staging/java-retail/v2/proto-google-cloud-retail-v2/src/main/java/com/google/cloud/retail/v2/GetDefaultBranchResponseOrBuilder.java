// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/catalog_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface GetDefaultBranchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.GetDefaultBranchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Full resource name of the branch id currently set as default branch.
   * </pre>
   *
   * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The branch.
   */
  java.lang.String getBranch();
  /**
   * <pre>
   * Full resource name of the branch id currently set as default branch.
   * </pre>
   *
   * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for branch.
   */
  com.google.protobuf.ByteString
      getBranchBytes();

  /**
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   * @return Whether the setTime field is set.
   */
  boolean hasSetTime();
  /**
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   * @return The setTime.
   */
  com.google.protobuf.Timestamp getSetTime();
  /**
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSetTimeOrBuilder();

  /**
   * <pre>
   * This corresponds to
   * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
   * field, when this branch was set as default.
   * </pre>
   *
   * <code>string note = 3;</code>
   * @return The note.
   */
  java.lang.String getNote();
  /**
   * <pre>
   * This corresponds to
   * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
   * field, when this branch was set as default.
   * </pre>
   *
   * <code>string note = 3;</code>
   * @return The bytes for note.
   */
  com.google.protobuf.ByteString
      getNoteBytes();
}
