// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/export_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2alpha;

public interface ExportProductsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ExportProductsResponse)
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
   * This field is never set.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ExportErrorsConfig errors_config = 2;</code>
   * @return Whether the errorsConfig field is set.
   */
  boolean hasErrorsConfig();
  /**
   * <pre>
   * This field is never set.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ExportErrorsConfig errors_config = 2;</code>
   * @return The errorsConfig.
   */
  com.google.cloud.retail.v2alpha.ExportErrorsConfig getErrorsConfig();
  /**
   * <pre>
   * This field is never set.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ExportErrorsConfig errors_config = 2;</code>
   */
  com.google.cloud.retail.v2alpha.ExportErrorsConfigOrBuilder getErrorsConfigOrBuilder();

  /**
   * <pre>
   * Output result indicating where the data were exported to.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.OutputResult output_result = 3;</code>
   * @return Whether the outputResult field is set.
   */
  boolean hasOutputResult();
  /**
   * <pre>
   * Output result indicating where the data were exported to.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.OutputResult output_result = 3;</code>
   * @return The outputResult.
   */
  com.google.cloud.retail.v2alpha.OutputResult getOutputResult();
  /**
   * <pre>
   * Output result indicating where the data were exported to.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.OutputResult output_result = 3;</code>
   */
  com.google.cloud.retail.v2alpha.OutputResultOrBuilder getOutputResultOrBuilder();
}
