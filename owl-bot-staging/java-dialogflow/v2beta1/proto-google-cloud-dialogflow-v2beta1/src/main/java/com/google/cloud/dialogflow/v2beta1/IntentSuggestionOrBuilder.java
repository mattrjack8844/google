// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

public interface IntentSuggestionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.IntentSuggestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The display name of the intent.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The display name of the intent.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The unique identifier of this
   * [intent][google.cloud.dialogflow.v2beta1.Intent]. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent
   * ID&gt;`.
   * </pre>
   *
   * <code>string intent_v2 = 2;</code>
   * @return Whether the intentV2 field is set.
   */
  boolean hasIntentV2();
  /**
   * <pre>
   * The unique identifier of this
   * [intent][google.cloud.dialogflow.v2beta1.Intent]. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent
   * ID&gt;`.
   * </pre>
   *
   * <code>string intent_v2 = 2;</code>
   * @return The intentV2.
   */
  java.lang.String getIntentV2();
  /**
   * <pre>
   * The unique identifier of this
   * [intent][google.cloud.dialogflow.v2beta1.Intent]. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/intents/&lt;Intent
   * ID&gt;`.
   * </pre>
   *
   * <code>string intent_v2 = 2;</code>
   * @return The bytes for intentV2.
   */
  com.google.protobuf.ByteString
      getIntentV2Bytes();

  /**
   * <pre>
   * Human readable description for better understanding an intent like its
   * scope, content, result etc. Maximum character limit: 140 characters.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human readable description for better understanding an intent like its
   * scope, content, result etc. Maximum character limit: 140 characters.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  com.google.cloud.dialogflow.v2beta1.IntentSuggestion.IntentCase getIntentCase();
}
