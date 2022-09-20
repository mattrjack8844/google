// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/featurestore_online_service.proto

package com.google.cloud.aiplatform.v1;

public interface FeatureValueListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.FeatureValueList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureValue values = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.FeatureValue> 
      getValuesList();
  /**
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureValue values = 1;</code>
   */
  com.google.cloud.aiplatform.v1.FeatureValue getValues(int index);
  /**
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureValue values = 1;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureValue values = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.FeatureValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureValue values = 1;</code>
   */
  com.google.cloud.aiplatform.v1.FeatureValueOrBuilder getValuesOrBuilder(
      int index);
}
