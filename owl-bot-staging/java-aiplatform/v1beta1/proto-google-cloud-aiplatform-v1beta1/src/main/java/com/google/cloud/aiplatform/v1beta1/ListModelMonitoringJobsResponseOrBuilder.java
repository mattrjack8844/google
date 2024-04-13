// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_monitoring_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ListModelMonitoringJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListModelMonitoringJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of ModelMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringJob model_monitoring_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelMonitoringJob> 
      getModelMonitoringJobsList();
  /**
   * <pre>
   * A list of ModelMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringJob model_monitoring_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringJob getModelMonitoringJobs(int index);
  /**
   * <pre>
   * A list of ModelMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringJob model_monitoring_jobs = 1;</code>
   */
  int getModelMonitoringJobsCount();
  /**
   * <pre>
   * A list of ModelMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringJob model_monitoring_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelMonitoringJobOrBuilder> 
      getModelMonitoringJobsOrBuilderList();
  /**
   * <pre>
   * A list of ModelMonitoringJobs that matches the specified filter
   * in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringJob model_monitoring_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringJobOrBuilder getModelMonitoringJobsOrBuilder(
      int index);

  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
