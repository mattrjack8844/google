// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface StatusConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.StatusCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Machine-friendly representation of the condition
   * </pre>
   *
   * <code>.google.container.v1beta1.StatusCondition.Code code = 1;</code>
   */
  int getCodeValue();
  /**
   * <pre>
   * Machine-friendly representation of the condition
   * </pre>
   *
   * <code>.google.container.v1beta1.StatusCondition.Code code = 1;</code>
   */
  com.google.container.v1beta1.StatusCondition.Code getCode();

  /**
   * <pre>
   * Human-friendly representation of the condition
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Human-friendly representation of the condition
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
