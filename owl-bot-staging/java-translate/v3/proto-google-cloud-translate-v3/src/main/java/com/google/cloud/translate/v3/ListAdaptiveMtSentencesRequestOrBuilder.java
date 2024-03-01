// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/adaptive_mt.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.translate.v3;

public interface ListAdaptiveMtSentencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.ListAdaptiveMtSentencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the project from which to list the Adaptive
   * MT files. The following format lists all sentences under a file.
   * `projects/{project}/locations/{location}/adaptiveMtDatasets/{dataset}/adaptiveMtFiles/{file}`
   * The following format lists all sentences within a dataset.
   * `projects/{project}/locations/{location}/adaptiveMtDatasets/{dataset}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the project from which to list the Adaptive
   * MT files. The following format lists all sentences under a file.
   * `projects/{project}/locations/{location}/adaptiveMtDatasets/{dataset}/adaptiveMtFiles/{file}`
   * The following format lists all sentences within a dataset.
   * `projects/{project}/locations/{location}/adaptiveMtDatasets/{dataset}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * Typically, this is the value of
   * ListAdaptiveMtSentencesRequest.next_page_token returned from the
   * previous call to `ListTranslationMemories` method. The first page is
   * returned if `page_token` is empty or missing.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * Typically, this is the value of
   * ListAdaptiveMtSentencesRequest.next_page_token returned from the
   * previous call to `ListTranslationMemories` method. The first page is
   * returned if `page_token` is empty or missing.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
