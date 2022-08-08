// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface MoveAnalysisOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.MoveAnalysis)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user friendly display name of the analysis. E.g. IAM, Organization
   * Policy etc.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The user friendly display name of the analysis. E.g. IAM, Organization
   * Policy etc.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Analysis result of moving the target resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
   * @return Whether the analysis field is set.
   */
  boolean hasAnalysis();
  /**
   * <pre>
   * Analysis result of moving the target resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
   * @return The analysis.
   */
  com.google.cloud.asset.v1.MoveAnalysisResult getAnalysis();
  /**
   * <pre>
   * Analysis result of moving the target resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
   */
  com.google.cloud.asset.v1.MoveAnalysisResultOrBuilder getAnalysisOrBuilder();

  /**
   * <pre>
   * Description of error encountered when performing the analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Description of error encountered when performing the analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * Description of error encountered when performing the analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  public com.google.cloud.asset.v1.MoveAnalysis.ResultCase getResultCase();
}
