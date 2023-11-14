// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/index_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface NearestNeighborSearchOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The validation stats of the content (per file) to be inserted or
   * updated on the Matching Engine Index resource. Populated if
   * contentsDeltaUri is provided as part of
   * [Index.metadata][google.cloud.aiplatform.v1beta1.Index.metadata]. Please
   * note that, currently for those files that are broken or has unsupported
   * file format, we will not have the stats for those files.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStats content_validation_stats = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStats> 
      getContentValidationStatsList();
  /**
   * <pre>
   * The validation stats of the content (per file) to be inserted or
   * updated on the Matching Engine Index resource. Populated if
   * contentsDeltaUri is provided as part of
   * [Index.metadata][google.cloud.aiplatform.v1beta1.Index.metadata]. Please
   * note that, currently for those files that are broken or has unsupported
   * file format, we will not have the stats for those files.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStats content_validation_stats = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStats getContentValidationStats(int index);
  /**
   * <pre>
   * The validation stats of the content (per file) to be inserted or
   * updated on the Matching Engine Index resource. Populated if
   * contentsDeltaUri is provided as part of
   * [Index.metadata][google.cloud.aiplatform.v1beta1.Index.metadata]. Please
   * note that, currently for those files that are broken or has unsupported
   * file format, we will not have the stats for those files.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStats content_validation_stats = 1;</code>
   */
  int getContentValidationStatsCount();
  /**
   * <pre>
   * The validation stats of the content (per file) to be inserted or
   * updated on the Matching Engine Index resource. Populated if
   * contentsDeltaUri is provided as part of
   * [Index.metadata][google.cloud.aiplatform.v1beta1.Index.metadata]. Please
   * note that, currently for those files that are broken or has unsupported
   * file format, we will not have the stats for those files.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStats content_validation_stats = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStatsOrBuilder> 
      getContentValidationStatsOrBuilderList();
  /**
   * <pre>
   * The validation stats of the content (per file) to be inserted or
   * updated on the Matching Engine Index resource. Populated if
   * contentsDeltaUri is provided as part of
   * [Index.metadata][google.cloud.aiplatform.v1beta1.Index.metadata]. Please
   * note that, currently for those files that are broken or has unsupported
   * file format, we will not have the stats for those files.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStats content_validation_stats = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata.ContentValidationStatsOrBuilder getContentValidationStatsOrBuilder(
      int index);

  /**
   * <pre>
   * The ingested data size in bytes.
   * </pre>
   *
   * <code>int64 data_bytes_count = 2;</code>
   * @return The dataBytesCount.
   */
  long getDataBytesCount();
}
