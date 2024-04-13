// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_online_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface WriteFeatureValuesPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.WriteFeatureValuesPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the entity.
   * </pre>
   *
   * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * Required. The ID of the entity.
   * </pre>
   *
   * <code>string entity_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value.
   * Up to 100,000 `feature_values` entries may be written across all payloads.
   * The feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getFeatureValuesCount();
  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value.
   * Up to 100,000 `feature_values` entries may be written across all payloads.
   * The feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean containsFeatureValues(
      java.lang.String key);
  /**
   * Use {@link #getFeatureValuesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>
  getFeatureValues();
  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value.
   * Up to 100,000 `feature_values` entries may be written across all payloads.
   * The feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.FeatureValue>
  getFeatureValuesMap();
  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value.
   * Up to 100,000 `feature_values` entries may be written across all payloads.
   * The feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  /* nullable */
com.google.cloud.aiplatform.v1beta1.FeatureValue getFeatureValuesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.aiplatform.v1beta1.FeatureValue defaultValue);
  /**
   * <pre>
   * Required. Feature values to be written, mapping from Feature ID to value.
   * Up to 100,000 `feature_values` entries may be written across all payloads.
   * The feature generation time, aligned by days, must be no older than five
   * years (1825 days) and no later than one year (366 days) in the future.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.aiplatform.v1beta1.FeatureValue&gt; feature_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureValue getFeatureValuesOrThrow(
      java.lang.String key);
}
