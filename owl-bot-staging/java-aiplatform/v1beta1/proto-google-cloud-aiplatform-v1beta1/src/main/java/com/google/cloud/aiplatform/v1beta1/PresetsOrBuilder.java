// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PresetsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Presets)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Preset option controlling parameters for query speed-precision trade-off
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Presets.Query query = 1;</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <pre>
   * Preset option controlling parameters for query speed-precision trade-off
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Presets.Query query = 1;</code>
   * @return The enum numeric value on the wire for query.
   */
  int getQueryValue();
  /**
   * <pre>
   * Preset option controlling parameters for query speed-precision trade-off
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Presets.Query query = 1;</code>
   * @return The query.
   */
  com.google.cloud.aiplatform.v1beta1.Presets.Query getQuery();

  /**
   * <pre>
   * Preset option controlling parameters for different modalities
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Presets.Modality modality = 2;</code>
   * @return The enum numeric value on the wire for modality.
   */
  int getModalityValue();
  /**
   * <pre>
   * Preset option controlling parameters for different modalities
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Presets.Modality modality = 2;</code>
   * @return The modality.
   */
  com.google.cloud.aiplatform.v1beta1.Presets.Modality getModality();
}
