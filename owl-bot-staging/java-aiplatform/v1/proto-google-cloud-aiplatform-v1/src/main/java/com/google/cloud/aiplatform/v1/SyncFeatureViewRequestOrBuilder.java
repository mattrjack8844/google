// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/feature_online_store_admin_service.proto

package com.google.cloud.aiplatform.v1;

public interface SyncFeatureViewRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SyncFeatureViewRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}`
   * </pre>
   *
   * <code>string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The featureView.
   */
  java.lang.String getFeatureView();
  /**
   * <pre>
   * Required. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}`
   * </pre>
   *
   * <code>string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for featureView.
   */
  com.google.protobuf.ByteString
      getFeatureViewBytes();
}
