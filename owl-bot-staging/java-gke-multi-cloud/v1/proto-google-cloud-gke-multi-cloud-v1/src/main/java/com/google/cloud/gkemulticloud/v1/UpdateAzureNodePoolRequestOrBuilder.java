// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface UpdateAzureNodePoolRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.UpdateAzureNodePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
   * resource to update.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pool = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the azureNodePool field is set.
   */
  boolean hasAzureNodePool();
  /**
   * <pre>
   * Required. The [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
   * resource to update.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pool = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The azureNodePool.
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePool getAzureNodePool();
  /**
   * <pre>
   * Required. The [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
   * resource to update.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pool = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder getAzureNodePoolOrBuilder();

  /**
   * <pre>
   * If set, only validate the request, but don't actually update the node pool.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]:
   *  *.  `annotations`.
   *  *   `version`.
   *  *   `autoscaling.min_node_count`.
   *  *   `autoscaling.max_node_count`.
   *  *   `config.ssh_config.authorized_key`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]:
   *  *.  `annotations`.
   *  *   `version`.
   *  *   `autoscaling.min_node_count`.
   *  *   `autoscaling.max_node_count`.
   *  *   `config.ssh_config.authorized_key`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]:
   *  *.  `annotations`.
   *  *   `version`.
   *  *   `autoscaling.min_node_count`.
   *  *   `autoscaling.max_node_count`.
   *  *   `config.ssh_config.authorized_key`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
