// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v2;

public interface DeletePhraseSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.DeletePhraseSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the PhraseSet to delete.
   * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the PhraseSet to delete.
   * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set, validate the request and preview the deleted PhraseSet, but do not
   * actually delete it.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * If set to true, and the PhraseSet is not found, the request will succeed
   * and  be a no-op (no Operation is recorded in this case).
   * </pre>
   *
   * <code>bool allow_missing = 4;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields. This may be sent on update, undelete, and delete requests to ensure
   * the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 3;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields. This may be sent on update, undelete, and delete requests to ensure
   * the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 3;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}
