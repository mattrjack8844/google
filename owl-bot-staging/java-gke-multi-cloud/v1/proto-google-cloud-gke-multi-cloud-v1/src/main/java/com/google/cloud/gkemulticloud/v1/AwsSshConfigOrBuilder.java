// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AwsSshConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsSshConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the EC2 key pair used to login into cluster machines.
   * </pre>
   *
   * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The ec2KeyPair.
   */
  java.lang.String getEc2KeyPair();
  /**
   * <pre>
   * Required. The name of the EC2 key pair used to login into cluster machines.
   * </pre>
   *
   * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for ec2KeyPair.
   */
  com.google.protobuf.ByteString
      getEc2KeyPairBytes();
}
