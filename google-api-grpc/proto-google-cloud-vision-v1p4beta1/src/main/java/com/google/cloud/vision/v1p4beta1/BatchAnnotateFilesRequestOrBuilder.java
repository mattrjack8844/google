// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

public interface BatchAnnotateFilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.BatchAnnotateFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateFileRequest requests = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p4beta1.AnnotateFileRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateFileRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.AnnotateFileRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateFileRequest requests = 1;</code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateFileRequest requests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p4beta1.AnnotateFileRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateFileRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.AnnotateFileRequestOrBuilder getRequestsOrBuilder(int index);
}
