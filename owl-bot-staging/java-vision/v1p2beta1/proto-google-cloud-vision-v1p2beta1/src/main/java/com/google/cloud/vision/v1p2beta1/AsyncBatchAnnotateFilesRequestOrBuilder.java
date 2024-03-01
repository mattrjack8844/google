// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vision.v1p2beta1;

public interface AsyncBatchAnnotateFilesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest> 
      getRequestsList();
  /**
   * <pre>
   * Required. Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest getRequests(int index);
  /**
   * <pre>
   * Required. Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getRequestsCount();
  /**
   * <pre>
   * Required. Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <pre>
   * Required. Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequestOrBuilder getRequestsOrBuilder(
      int index);
}
