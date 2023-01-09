// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/common_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface NodeTaintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.NodeTaint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Key for the taint.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Required. Key for the taint.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Required. Value for the taint.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Required. Value for the taint.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Required. The taint effect.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.NodeTaint.Effect effect = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for effect.
   */
  int getEffectValue();
  /**
   * <pre>
   * Required. The taint effect.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.NodeTaint.Effect effect = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The effect.
   */
  com.google.cloud.gkemulticloud.v1.NodeTaint.Effect getEffect();
}
