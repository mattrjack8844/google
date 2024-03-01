// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmwareengine.v1;

public interface HcxActivationKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.HcxActivationKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of this HcxActivationKey.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1/privateClouds/my-cloud/hcxActivationKeys/my-key`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of this HcxActivationKey.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1/privateClouds/my-cloud/hcxActivationKeys/my-key`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Creation time of HCX activation key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Creation time of HCX activation key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Creation time of HCX activation key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. State of HCX activation key.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.HcxActivationKey.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of HCX activation key.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.HcxActivationKey.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.vmwareengine.v1.HcxActivationKey.State getState();

  /**
   * <pre>
   * Output only. HCX activation key.
   * </pre>
   *
   * <code>string activation_key = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The activationKey.
   */
  java.lang.String getActivationKey();
  /**
   * <pre>
   * Output only. HCX activation key.
   * </pre>
   *
   * <code>string activation_key = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for activationKey.
   */
  com.google.protobuf.ByteString
      getActivationKeyBytes();

  /**
   * <pre>
   * Output only. System-generated unique identifier for the resource.
   * </pre>
   *
   * <code>string uid = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Output only. System-generated unique identifier for the resource.
   * </pre>
   *
   * <code>string uid = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();
}
