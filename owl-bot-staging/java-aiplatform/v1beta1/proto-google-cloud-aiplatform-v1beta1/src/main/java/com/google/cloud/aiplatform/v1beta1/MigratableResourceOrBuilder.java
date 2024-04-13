// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/migratable_resource.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface MigratableResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.MigratableResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Represents one Version in ml.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.MlEngineModelVersion ml_engine_model_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the mlEngineModelVersion field is set.
   */
  boolean hasMlEngineModelVersion();
  /**
   * <pre>
   * Output only. Represents one Version in ml.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.MlEngineModelVersion ml_engine_model_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The mlEngineModelVersion.
   */
  com.google.cloud.aiplatform.v1beta1.MigratableResource.MlEngineModelVersion getMlEngineModelVersion();
  /**
   * <pre>
   * Output only. Represents one Version in ml.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.MlEngineModelVersion ml_engine_model_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.MigratableResource.MlEngineModelVersionOrBuilder getMlEngineModelVersionOrBuilder();

  /**
   * <pre>
   * Output only. Represents one Model in automl.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlModel automl_model = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the automlModel field is set.
   */
  boolean hasAutomlModel();
  /**
   * <pre>
   * Output only. Represents one Model in automl.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlModel automl_model = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The automlModel.
   */
  com.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlModel getAutomlModel();
  /**
   * <pre>
   * Output only. Represents one Model in automl.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlModel automl_model = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlModelOrBuilder getAutomlModelOrBuilder();

  /**
   * <pre>
   * Output only. Represents one Dataset in automl.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlDataset automl_dataset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the automlDataset field is set.
   */
  boolean hasAutomlDataset();
  /**
   * <pre>
   * Output only. Represents one Dataset in automl.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlDataset automl_dataset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The automlDataset.
   */
  com.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlDataset getAutomlDataset();
  /**
   * <pre>
   * Output only. Represents one Dataset in automl.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlDataset automl_dataset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.MigratableResource.AutomlDatasetOrBuilder getAutomlDatasetOrBuilder();

  /**
   * <pre>
   * Output only. Represents one Dataset in datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.DataLabelingDataset data_labeling_dataset = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the dataLabelingDataset field is set.
   */
  boolean hasDataLabelingDataset();
  /**
   * <pre>
   * Output only. Represents one Dataset in datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.DataLabelingDataset data_labeling_dataset = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dataLabelingDataset.
   */
  com.google.cloud.aiplatform.v1beta1.MigratableResource.DataLabelingDataset getDataLabelingDataset();
  /**
   * <pre>
   * Output only. Represents one Dataset in datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MigratableResource.DataLabelingDataset data_labeling_dataset = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.MigratableResource.DataLabelingDatasetOrBuilder getDataLabelingDatasetOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when the last migration attempt on this
   * MigratableResource started. Will not be set if there's no migration attempt
   * on this MigratableResource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_migrate_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the lastMigrateTime field is set.
   */
  boolean hasLastMigrateTime();
  /**
   * <pre>
   * Output only. Timestamp when the last migration attempt on this
   * MigratableResource started. Will not be set if there's no migration attempt
   * on this MigratableResource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_migrate_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lastMigrateTime.
   */
  com.google.protobuf.Timestamp getLastMigrateTime();
  /**
   * <pre>
   * Output only. Timestamp when the last migration attempt on this
   * MigratableResource started. Will not be set if there's no migration attempt
   * on this MigratableResource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_migrate_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastMigrateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this MigratableResource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the lastUpdateTime field is set.
   */
  boolean hasLastUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this MigratableResource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lastUpdateTime.
   */
  com.google.protobuf.Timestamp getLastUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this MigratableResource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder();

  com.google.cloud.aiplatform.v1beta1.MigratableResource.ResourceCase getResourceCase();
}
