// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/operations.proto

package com.google.cloud.datalabeling.v1beta1;

public interface CreateInstructionMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.CreateInstructionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the created Instruction.
   * projects/{project_id}/instructions/{instruction_id}
   * </pre>
   *
   * <code>string instruction = 1;</code>
   */
  java.lang.String getInstruction();
  /**
   *
   *
   * <pre>
   * Output only. The name of the created Instruction.
   * projects/{project_id}/instructions/{instruction_id}
   * </pre>
   *
   * <code>string instruction = 1;</code>
   */
  com.google.protobuf.ByteString getInstructionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<com.google.rpc.Status> getPartialFailuresList();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.Status getPartialFailures(int index);
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  int getPartialFailuresCount();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getPartialFailuresOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(int index);
}
