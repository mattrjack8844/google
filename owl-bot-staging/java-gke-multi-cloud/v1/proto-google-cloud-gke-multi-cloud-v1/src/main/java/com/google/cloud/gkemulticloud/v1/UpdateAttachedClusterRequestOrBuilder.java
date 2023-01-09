// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/attached_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface UpdateAttachedClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.UpdateAttachedClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * to update.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AttachedCluster attached_cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the attachedCluster field is set.
   */
  boolean hasAttachedCluster();
  /**
   * <pre>
   * Required. The
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * to update.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AttachedCluster attached_cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The attachedCluster.
   */
  com.google.cloud.gkemulticloud.v1.AttachedCluster getAttachedCluster();
  /**
   * <pre>
   * Required. The
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * to update.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AttachedCluster attached_cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkemulticloud.v1.AttachedClusterOrBuilder getAttachedClusterOrBuilder();

  /**
   * <pre>
   * If set, only validate the request, but do not actually update the cluster.
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
   * fields from
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster]:
   *  *   `description`.
   *  *   `annotations`.
   *  *   `platform_version`.
   *  *   `authorization.admin_users`.
   *  *   `logging_config.component_config.enable_components`.
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
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
   * fields from
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster]:
   *  *   `description`.
   *  *   `annotations`.
   *  *   `platform_version`.
   *  *   `authorization.admin_users`.
   *  *   `logging_config.component_config.enable_components`.
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
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
   * fields from
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster]:
   *  *   `description`.
   *  *   `annotations`.
   *  *   `platform_version`.
   *  *   `authorization.admin_users`.
   *  *   `logging_config.component_config.enable_components`.
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
