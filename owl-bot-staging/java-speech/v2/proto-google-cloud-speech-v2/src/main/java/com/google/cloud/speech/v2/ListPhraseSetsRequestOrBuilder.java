// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface ListPhraseSetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.ListPhraseSetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location of PhraseSet resources to list. The
   * expected format is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location of PhraseSet resources to list. The
   * expected format is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of PhraseSets to return. The service may return fewer
   * than this value. If unspecified, at most 5 PhraseSets will be returned.
   * The maximum value is 100; values above 100 will be coerced to 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous
   * [ListPhraseSets][google.cloud.speech.v2.Speech.ListPhraseSets] call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [ListPhraseSets][google.cloud.speech.v2.Speech.ListPhraseSets] must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous
   * [ListPhraseSets][google.cloud.speech.v2.Speech.ListPhraseSets] call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [ListPhraseSets][google.cloud.speech.v2.Speech.ListPhraseSets] must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Whether, or not, to show resources that have been deleted.
   * </pre>
   *
   * <code>bool show_deleted = 4;</code>
   * @return The showDeleted.
   */
  boolean getShowDeleted();
}
