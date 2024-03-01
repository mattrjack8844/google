// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/export_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface OutputResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.OutputResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The BigQuery location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.BigQueryOutputResult bigquery_result = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.BigQueryOutputResult> 
      getBigqueryResultList();
  /**
   * <pre>
   * The BigQuery location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.BigQueryOutputResult bigquery_result = 1;</code>
   */
  com.google.cloud.retail.v2alpha.BigQueryOutputResult getBigqueryResult(int index);
  /**
   * <pre>
   * The BigQuery location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.BigQueryOutputResult bigquery_result = 1;</code>
   */
  int getBigqueryResultCount();
  /**
   * <pre>
   * The BigQuery location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.BigQueryOutputResult bigquery_result = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.BigQueryOutputResultOrBuilder> 
      getBigqueryResultOrBuilderList();
  /**
   * <pre>
   * The BigQuery location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.BigQueryOutputResult bigquery_result = 1;</code>
   */
  com.google.cloud.retail.v2alpha.BigQueryOutputResultOrBuilder getBigqueryResultOrBuilder(
      int index);

  /**
   * <pre>
   * The Google Cloud Storage location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.GcsOutputResult gcs_result = 2;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.GcsOutputResult> 
      getGcsResultList();
  /**
   * <pre>
   * The Google Cloud Storage location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.GcsOutputResult gcs_result = 2;</code>
   */
  com.google.cloud.retail.v2alpha.GcsOutputResult getGcsResult(int index);
  /**
   * <pre>
   * The Google Cloud Storage location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.GcsOutputResult gcs_result = 2;</code>
   */
  int getGcsResultCount();
  /**
   * <pre>
   * The Google Cloud Storage location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.GcsOutputResult gcs_result = 2;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.GcsOutputResultOrBuilder> 
      getGcsResultOrBuilderList();
  /**
   * <pre>
   * The Google Cloud Storage location where the result is stored.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.GcsOutputResult gcs_result = 2;</code>
   */
  com.google.cloud.retail.v2alpha.GcsOutputResultOrBuilder getGcsResultOrBuilder(
      int index);
}
