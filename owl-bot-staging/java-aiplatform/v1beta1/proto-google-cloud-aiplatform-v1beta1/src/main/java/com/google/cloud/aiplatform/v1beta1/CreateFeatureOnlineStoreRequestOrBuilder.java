// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/feature_online_store_admin_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface CreateFeatureOnlineStoreRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateFeatureOnlineStoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to create FeatureOnlineStores.
   * Format:
   * `projects/{project}/locations/{location}'`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location to create FeatureOnlineStores.
   * Format:
   * `projects/{project}/locations/{location}'`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The FeatureOnlineStore to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore feature_online_store = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the featureOnlineStore field is set.
   */
  boolean hasFeatureOnlineStore();
  /**
   * <pre>
   * Required. The FeatureOnlineStore to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore feature_online_store = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The featureOnlineStore.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore getFeatureOnlineStore();
  /**
   * <pre>
   * Required. The FeatureOnlineStore to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureOnlineStore feature_online_store = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStoreOrBuilder getFeatureOnlineStoreOrBuilder();

  /**
   * <pre>
   * Required. The ID to use for this FeatureOnlineStore, which will become the
   * final component of the FeatureOnlineStore's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within the project and location.
   * </pre>
   *
   * <code>string feature_online_store_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The featureOnlineStoreId.
   */
  java.lang.String getFeatureOnlineStoreId();
  /**
   * <pre>
   * Required. The ID to use for this FeatureOnlineStore, which will become the
   * final component of the FeatureOnlineStore's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within the project and location.
   * </pre>
   *
   * <code>string feature_online_store_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for featureOnlineStoreId.
   */
  com.google.protobuf.ByteString
      getFeatureOnlineStoreIdBytes();
}
