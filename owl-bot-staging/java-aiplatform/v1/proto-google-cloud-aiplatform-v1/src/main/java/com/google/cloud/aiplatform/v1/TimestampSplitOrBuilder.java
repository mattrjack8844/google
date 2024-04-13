// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/training_pipeline.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface TimestampSplitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TimestampSplit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fraction of the input data that is to be used to train the Model.
   * </pre>
   *
   * <code>double training_fraction = 1;</code>
   * @return The trainingFraction.
   */
  double getTrainingFraction();

  /**
   * <pre>
   * The fraction of the input data that is to be used to validate the Model.
   * </pre>
   *
   * <code>double validation_fraction = 2;</code>
   * @return The validationFraction.
   */
  double getValidationFraction();

  /**
   * <pre>
   * The fraction of the input data that is to be used to evaluate the Model.
   * </pre>
   *
   * <code>double test_fraction = 3;</code>
   * @return The testFraction.
   */
  double getTestFraction();

  /**
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The values of the key (the values in the column) must be in RFC 3339
   * `date-time` format, where `time-offset` = `"Z"`
   * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
   * present or has an invalid value, that piece is ignored by the pipeline.
   * </pre>
   *
   * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The values of the key (the values in the column) must be in RFC 3339
   * `date-time` format, where `time-offset` = `"Z"`
   * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
   * present or has an invalid value, that piece is ignored by the pipeline.
   * </pre>
   *
   * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();
}
