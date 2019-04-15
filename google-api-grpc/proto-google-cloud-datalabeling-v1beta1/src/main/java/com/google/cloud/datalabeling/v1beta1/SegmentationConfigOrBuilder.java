// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

public interface SegmentationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.SegmentationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name. format:
   * projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}
   * </pre>
   *
   * <code>string annotation_spec_set = 1;</code>
   */
  java.lang.String getAnnotationSpecSet();
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name. format:
   * projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}
   * </pre>
   *
   * <code>string annotation_spec_set = 1;</code>
   */
  com.google.protobuf.ByteString getAnnotationSpecSetBytes();

  /**
   *
   *
   * <pre>
   * Instruction message showed on labelers UI.
   * </pre>
   *
   * <code>string instruction_message = 2;</code>
   */
  java.lang.String getInstructionMessage();
  /**
   *
   *
   * <pre>
   * Instruction message showed on labelers UI.
   * </pre>
   *
   * <code>string instruction_message = 2;</code>
   */
  com.google.protobuf.ByteString getInstructionMessageBytes();
}
