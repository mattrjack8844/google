// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/adaptive_mt.proto

package com.google.cloud.translate.v3;

public interface ListAdaptiveMtDatasetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.ListAdaptiveMtDatasetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. A list of Adaptive MT datasets.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_datasets = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.translate.v3.AdaptiveMtDataset> 
      getAdaptiveMtDatasetsList();
  /**
   * <pre>
   * Output only. A list of Adaptive MT datasets.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_datasets = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.translate.v3.AdaptiveMtDataset getAdaptiveMtDatasets(int index);
  /**
   * <pre>
   * Output only. A list of Adaptive MT datasets.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_datasets = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAdaptiveMtDatasetsCount();
  /**
   * <pre>
   * Output only. A list of Adaptive MT datasets.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_datasets = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.AdaptiveMtDatasetOrBuilder> 
      getAdaptiveMtDatasetsOrBuilderList();
  /**
   * <pre>
   * Output only. A list of Adaptive MT datasets.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.AdaptiveMtDataset adaptive_mt_datasets = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.translate.v3.AdaptiveMtDatasetOrBuilder getAdaptiveMtDatasetsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. A token to retrieve a page of results. Pass this value in the
   * [ListAdaptiveMtDatasetsRequest.page_token] field in the subsequent call to
   * `ListAdaptiveMtDatasets` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Optional. A token to retrieve a page of results. Pass this value in the
   * [ListAdaptiveMtDatasetsRequest.page_token] field in the subsequent call to
   * `ListAdaptiveMtDatasets` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
