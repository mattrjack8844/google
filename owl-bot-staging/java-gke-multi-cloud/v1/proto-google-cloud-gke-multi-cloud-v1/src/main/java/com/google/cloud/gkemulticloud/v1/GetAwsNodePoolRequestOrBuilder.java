// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface GetAwsNodePoolRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.GetAwsNodePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the
   * [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool] resource to
   * describe.
   * `AwsNodePool` names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/awsClusters/&lt;cluster-id&gt;/awsNodePools/&lt;node-pool-id&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the
   * [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool] resource to
   * describe.
   * `AwsNodePool` names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/awsClusters/&lt;cluster-id&gt;/awsNodePools/&lt;node-pool-id&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
