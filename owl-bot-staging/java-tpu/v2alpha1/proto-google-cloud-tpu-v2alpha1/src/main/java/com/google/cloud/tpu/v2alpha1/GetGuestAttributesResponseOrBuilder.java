// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

public interface GetGuestAttributesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.GetGuestAttributesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  java.util.List<com.google.cloud.tpu.v2alpha1.GuestAttributes> 
      getGuestAttributesList();
  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.GuestAttributes getGuestAttributes(int index);
  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  int getGuestAttributesCount();
  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder> 
      getGuestAttributesOrBuilderList();
  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder getGuestAttributesOrBuilder(
      int index);
}
