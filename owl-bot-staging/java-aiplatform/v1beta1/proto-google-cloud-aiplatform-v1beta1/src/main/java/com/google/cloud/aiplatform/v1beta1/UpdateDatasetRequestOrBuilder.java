// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UpdateDatasetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Dataset which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * Required. The Dataset which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataset.
   */
  com.google.cloud.aiplatform.v1beta1.Dataset getDataset();
  /**
   * <pre>
   * Required. The Dataset which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.DatasetOrBuilder getDatasetOrBuilder();

  /**
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
   *   * `display_name`
   *   * `description`
   *   * `labels`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
   *   * `display_name`
   *   * `description`
   *   * `labels`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
   *   * `display_name`
   *   * `description`
   *   * `labels`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
