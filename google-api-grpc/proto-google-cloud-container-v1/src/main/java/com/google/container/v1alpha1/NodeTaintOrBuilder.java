// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

public interface NodeTaintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1alpha1.NodeTaint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key for taint.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Key for taint.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Value for taint.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Value for taint.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Effect for taint.
   * </pre>
   *
   * <code>.google.container.v1alpha1.NodeTaint.Effect effect = 3;</code>
   */
  int getEffectValue();
  /**
   * <pre>
   * Effect for taint.
   * </pre>
   *
   * <code>.google.container.v1alpha1.NodeTaint.Effect effect = 3;</code>
   */
  com.google.container.v1alpha1.NodeTaint.Effect getEffect();
}
