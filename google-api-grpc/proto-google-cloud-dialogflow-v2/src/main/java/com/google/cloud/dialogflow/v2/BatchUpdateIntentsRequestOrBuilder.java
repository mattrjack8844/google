// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/intent.proto

package com.google.cloud.dialogflow.v2;

public interface BatchUpdateIntentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.BatchUpdateIntentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the agent to update or create intents in.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the agent to update or create intents in.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing intents to update or
   * create. The file format can either be a serialized proto (of IntentBatch
   * type) or JSON object. Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string intent_batch_uri = 2;</code>
   */
  java.lang.String getIntentBatchUri();
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing intents to update or
   * create. The file format can either be a serialized proto (of IntentBatch
   * type) or JSON object. Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string intent_batch_uri = 2;</code>
   */
  com.google.protobuf.ByteString getIntentBatchUriBytes();

  /**
   *
   *
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.IntentBatch intent_batch_inline = 3;</code>
   */
  boolean hasIntentBatchInline();
  /**
   *
   *
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.IntentBatch intent_batch_inline = 3;</code>
   */
  com.google.cloud.dialogflow.v2.IntentBatch getIntentBatchInline();
  /**
   *
   *
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.IntentBatch intent_batch_inline = 3;</code>
   */
  com.google.cloud.dialogflow.v2.IntentBatchOrBuilder getIntentBatchInlineOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intents`. If not specified, the agent's default language is
   * used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intents`. If not specified, the agent's default language is
   * used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.IntentView intent_view = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getIntentViewValue();
  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.IntentView intent_view = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.IntentView getIntentView();

  public com.google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.IntentBatchCase
      getIntentBatchCase();
}
