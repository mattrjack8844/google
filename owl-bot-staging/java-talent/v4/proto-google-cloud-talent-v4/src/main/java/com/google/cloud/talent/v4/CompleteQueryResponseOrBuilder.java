// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/completion_service.proto

package com.google.cloud.talent.v4;

public interface CompleteQueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.CompleteQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Results of the matching job/company candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompleteQueryResponse.CompletionResult completion_results = 1;</code>
   */
  java.util.List<com.google.cloud.talent.v4.CompleteQueryResponse.CompletionResult> 
      getCompletionResultsList();
  /**
   * <pre>
   * Results of the matching job/company candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompleteQueryResponse.CompletionResult completion_results = 1;</code>
   */
  com.google.cloud.talent.v4.CompleteQueryResponse.CompletionResult getCompletionResults(int index);
  /**
   * <pre>
   * Results of the matching job/company candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompleteQueryResponse.CompletionResult completion_results = 1;</code>
   */
  int getCompletionResultsCount();
  /**
   * <pre>
   * Results of the matching job/company candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompleteQueryResponse.CompletionResult completion_results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4.CompleteQueryResponse.CompletionResultOrBuilder> 
      getCompletionResultsOrBuilderList();
  /**
   * <pre>
   * Results of the matching job/company candidates.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.CompleteQueryResponse.CompletionResult completion_results = 1;</code>
   */
  com.google.cloud.talent.v4.CompleteQueryResponse.CompletionResultOrBuilder getCompletionResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 2;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 2;</code>
   * @return The metadata.
   */
  com.google.cloud.talent.v4.ResponseMetadata getMetadata();
  /**
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 2;</code>
   */
  com.google.cloud.talent.v4.ResponseMetadataOrBuilder getMetadataOrBuilder();
}
