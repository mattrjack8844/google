// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public interface ImportUserEventsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.ImportUserEventsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  java.util.List<com.google.rpc.Status> 
      getErrorSamplesList();
  /**
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  com.google.rpc.Status getErrorSamples(int index);
  /**
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  int getErrorSamplesCount();
  /**
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getErrorSamplesOrBuilderList();
  /**
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(
      int index);

  /**
   * <pre>
   * Echoes the destination for the complete errors if this field was set in
   * the request.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.ImportErrorsConfig errors_config = 2;</code>
   * @return Whether the errorsConfig field is set.
   */
  boolean hasErrorsConfig();
  /**
   * <pre>
   * Echoes the destination for the complete errors if this field was set in
   * the request.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.ImportErrorsConfig errors_config = 2;</code>
   * @return The errorsConfig.
   */
  com.google.cloud.retail.v2beta.ImportErrorsConfig getErrorsConfig();
  /**
   * <pre>
   * Echoes the destination for the complete errors if this field was set in
   * the request.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.ImportErrorsConfig errors_config = 2;</code>
   */
  com.google.cloud.retail.v2beta.ImportErrorsConfigOrBuilder getErrorsConfigOrBuilder();

  /**
   * <pre>
   * Aggregated statistics of user event import status.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.UserEventImportSummary import_summary = 3;</code>
   * @return Whether the importSummary field is set.
   */
  boolean hasImportSummary();
  /**
   * <pre>
   * Aggregated statistics of user event import status.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.UserEventImportSummary import_summary = 3;</code>
   * @return The importSummary.
   */
  com.google.cloud.retail.v2beta.UserEventImportSummary getImportSummary();
  /**
   * <pre>
   * Aggregated statistics of user event import status.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.UserEventImportSummary import_summary = 3;</code>
   */
  com.google.cloud.retail.v2beta.UserEventImportSummaryOrBuilder getImportSummaryOrBuilder();
}
