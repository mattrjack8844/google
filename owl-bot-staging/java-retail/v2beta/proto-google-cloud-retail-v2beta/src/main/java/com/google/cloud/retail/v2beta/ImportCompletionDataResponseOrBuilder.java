// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public interface ImportCompletionDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.ImportCompletionDataResponse)
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
}
