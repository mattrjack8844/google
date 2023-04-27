// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/migration_service.proto

package com.google.cloud.aiplatform.v1;

public interface SearchMigratableResourcesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SearchMigratableResourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The location that the migratable resources should be searched
   * from. It's the Vertex AI location that the resources can be migrated to,
   * not the resources' original location. Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The location that the migratable resources should be searched
   * from. It's the Vertex AI location that the resources can be migrated to,
   * not the resources' original location. Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The standard page size.
   * The default and maximum value is 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The standard page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The standard page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * A filter for your search. You can use the following types of filters:
   * *   Resource type filters. The following strings filter for a specific type
   *     of [MigratableResource][google.cloud.aiplatform.v1.MigratableResource]:
   *     *   `ml_engine_model_version:*`
   *     *   `automl_model:*`
   *     *   `automl_dataset:*`
   *     *   `data_labeling_dataset:*`
   * *   "Migrated or not" filters. The following strings filter for resources
   *     that either have or have not already been migrated:
   *     *   `last_migrate_time:*` filters for migrated resources.
   *     *   `NOT last_migrate_time:*` filters for not yet migrated resources.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * A filter for your search. You can use the following types of filters:
   * *   Resource type filters. The following strings filter for a specific type
   *     of [MigratableResource][google.cloud.aiplatform.v1.MigratableResource]:
   *     *   `ml_engine_model_version:*`
   *     *   `automl_model:*`
   *     *   `automl_dataset:*`
   *     *   `data_labeling_dataset:*`
   * *   "Migrated or not" filters. The following strings filter for resources
   *     that either have or have not already been migrated:
   *     *   `last_migrate_time:*` filters for migrated resources.
   *     *   `NOT last_migrate_time:*` filters for not yet migrated resources.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
