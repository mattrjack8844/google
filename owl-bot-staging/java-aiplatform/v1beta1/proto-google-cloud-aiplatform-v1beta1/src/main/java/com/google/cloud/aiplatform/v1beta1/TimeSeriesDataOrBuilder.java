// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/tensorboard_data.proto

package com.google.cloud.aiplatform.v1beta1;

public interface TimeSeriesDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.TimeSeriesData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the TensorboardTimeSeries, which will become the final
   * component of the TensorboardTimeSeries' resource name
   * </pre>
   *
   * <code>string tensorboard_time_series_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tensorboardTimeSeriesId.
   */
  java.lang.String getTensorboardTimeSeriesId();
  /**
   * <pre>
   * Required. The ID of the TensorboardTimeSeries, which will become the final
   * component of the TensorboardTimeSeries' resource name
   * </pre>
   *
   * <code>string tensorboard_time_series_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for tensorboardTimeSeriesId.
   */
  com.google.protobuf.ByteString
      getTensorboardTimeSeriesIdBytes();

  /**
   * <pre>
   * Required. Immutable. The value type of this time series. All the values in
   * this time series data must match this value type.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TensorboardTimeSeries.ValueType value_type = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for valueType.
   */
  int getValueTypeValue();
  /**
   * <pre>
   * Required. Immutable. The value type of this time series. All the values in
   * this time series data must match this value type.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TensorboardTimeSeries.ValueType value_type = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The valueType.
   */
  com.google.cloud.aiplatform.v1beta1.TensorboardTimeSeries.ValueType getValueType();

  /**
   * <pre>
   * Required. Data points in this time series.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TimeSeriesDataPoint values = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.TimeSeriesDataPoint> 
      getValuesList();
  /**
   * <pre>
   * Required. Data points in this time series.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TimeSeriesDataPoint values = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.TimeSeriesDataPoint getValues(int index);
  /**
   * <pre>
   * Required. Data points in this time series.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TimeSeriesDataPoint values = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * Required. Data points in this time series.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TimeSeriesDataPoint values = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TimeSeriesDataPointOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * Required. Data points in this time series.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TimeSeriesDataPoint values = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.TimeSeriesDataPointOrBuilder getValuesOrBuilder(
      int index);
}
