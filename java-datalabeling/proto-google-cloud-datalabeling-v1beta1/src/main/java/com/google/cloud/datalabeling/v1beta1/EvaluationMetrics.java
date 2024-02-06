/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/evaluation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

/** Protobuf type {@code google.cloud.datalabeling.v1beta1.EvaluationMetrics} */
public final class EvaluationMetrics extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.EvaluationMetrics)
    EvaluationMetricsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EvaluationMetrics.newBuilder() to construct.
  private EvaluationMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EvaluationMetrics() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EvaluationMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.EvaluationMetrics.class,
            com.google.cloud.datalabeling.v1beta1.EvaluationMetrics.Builder.class);
  }

  private int metricsCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object metrics_;

  public enum MetricsCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CLASSIFICATION_METRICS(1),
    OBJECT_DETECTION_METRICS(2),
    METRICS_NOT_SET(0);
    private final int value;

    private MetricsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MetricsCase valueOf(int value) {
      return forNumber(value);
    }

    public static MetricsCase forNumber(int value) {
      switch (value) {
        case 1:
          return CLASSIFICATION_METRICS;
        case 2:
          return OBJECT_DETECTION_METRICS;
        case 0:
          return METRICS_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public MetricsCase getMetricsCase() {
    return MetricsCase.forNumber(metricsCase_);
  }

  public static final int CLASSIFICATION_METRICS_FIELD_NUMBER = 1;
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
   * </code>
   *
   * @return Whether the classificationMetrics field is set.
   */
  @java.lang.Override
  public boolean hasClassificationMetrics() {
    return metricsCase_ == 1;
  }
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
   * </code>
   *
   * @return The classificationMetrics.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ClassificationMetrics getClassificationMetrics() {
    if (metricsCase_ == 1) {
      return (com.google.cloud.datalabeling.v1beta1.ClassificationMetrics) metrics_;
    }
    return com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.getDefaultInstance();
  }
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ClassificationMetricsOrBuilder
      getClassificationMetricsOrBuilder() {
    if (metricsCase_ == 1) {
      return (com.google.cloud.datalabeling.v1beta1.ClassificationMetrics) metrics_;
    }
    return com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.getDefaultInstance();
  }

  public static final int OBJECT_DETECTION_METRICS_FIELD_NUMBER = 2;
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
   * </code>
   *
   * @return Whether the objectDetectionMetrics field is set.
   */
  @java.lang.Override
  public boolean hasObjectDetectionMetrics() {
    return metricsCase_ == 2;
  }
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
   * </code>
   *
   * @return The objectDetectionMetrics.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics getObjectDetectionMetrics() {
    if (metricsCase_ == 2) {
      return (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) metrics_;
    }
    return com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.getDefaultInstance();
  }
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetricsOrBuilder
      getObjectDetectionMetricsOrBuilder() {
    if (metricsCase_ == 2) {
      return (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) metrics_;
    }
    return com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (metricsCase_ == 1) {
      output.writeMessage(
          1, (com.google.cloud.datalabeling.v1beta1.ClassificationMetrics) metrics_);
    }
    if (metricsCase_ == 2) {
      output.writeMessage(
          2, (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) metrics_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metricsCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.datalabeling.v1beta1.ClassificationMetrics) metrics_);
    }
    if (metricsCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) metrics_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.EvaluationMetrics)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.EvaluationMetrics other =
        (com.google.cloud.datalabeling.v1beta1.EvaluationMetrics) obj;

    if (!getMetricsCase().equals(other.getMetricsCase())) return false;
    switch (metricsCase_) {
      case 1:
        if (!getClassificationMetrics().equals(other.getClassificationMetrics())) return false;
        break;
      case 2:
        if (!getObjectDetectionMetrics().equals(other.getObjectDetectionMetrics())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (metricsCase_) {
      case 1:
        hash = (37 * hash) + CLASSIFICATION_METRICS_FIELD_NUMBER;
        hash = (53 * hash) + getClassificationMetrics().hashCode();
        break;
      case 2:
        hash = (37 * hash) + OBJECT_DETECTION_METRICS_FIELD_NUMBER;
        hash = (53 * hash) + getObjectDetectionMetrics().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datalabeling.v1beta1.EvaluationMetrics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code google.cloud.datalabeling.v1beta1.EvaluationMetrics} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.EvaluationMetrics)
      com.google.cloud.datalabeling.v1beta1.EvaluationMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.EvaluationMetrics.class,
              com.google.cloud.datalabeling.v1beta1.EvaluationMetrics.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.EvaluationMetrics.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (classificationMetricsBuilder_ != null) {
        classificationMetricsBuilder_.clear();
      }
      if (objectDetectionMetricsBuilder_ != null) {
        objectDetectionMetricsBuilder_.clear();
      }
      metricsCase_ = 0;
      metrics_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationMetrics getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationMetrics build() {
      com.google.cloud.datalabeling.v1beta1.EvaluationMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationMetrics buildPartial() {
      com.google.cloud.datalabeling.v1beta1.EvaluationMetrics result =
          new com.google.cloud.datalabeling.v1beta1.EvaluationMetrics(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.EvaluationMetrics result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.datalabeling.v1beta1.EvaluationMetrics result) {
      result.metricsCase_ = metricsCase_;
      result.metrics_ = this.metrics_;
      if (metricsCase_ == 1 && classificationMetricsBuilder_ != null) {
        result.metrics_ = classificationMetricsBuilder_.build();
      }
      if (metricsCase_ == 2 && objectDetectionMetricsBuilder_ != null) {
        result.metrics_ = objectDetectionMetricsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.EvaluationMetrics) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.EvaluationMetrics) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.EvaluationMetrics other) {
      if (other == com.google.cloud.datalabeling.v1beta1.EvaluationMetrics.getDefaultInstance())
        return this;
      switch (other.getMetricsCase()) {
        case CLASSIFICATION_METRICS:
          {
            mergeClassificationMetrics(other.getClassificationMetrics());
            break;
          }
        case OBJECT_DETECTION_METRICS:
          {
            mergeObjectDetectionMetrics(other.getObjectDetectionMetrics());
            break;
          }
        case METRICS_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(
                    getClassificationMetricsFieldBuilder().getBuilder(), extensionRegistry);
                metricsCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getObjectDetectionMetricsFieldBuilder().getBuilder(), extensionRegistry);
                metricsCase_ = 2;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int metricsCase_ = 0;
    private java.lang.Object metrics_;

    public MetricsCase getMetricsCase() {
      return MetricsCase.forNumber(metricsCase_);
    }

    public Builder clearMetrics() {
      metricsCase_ = 0;
      metrics_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.ClassificationMetrics,
            com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.Builder,
            com.google.cloud.datalabeling.v1beta1.ClassificationMetricsOrBuilder>
        classificationMetricsBuilder_;
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     *
     * @return Whether the classificationMetrics field is set.
     */
    @java.lang.Override
    public boolean hasClassificationMetrics() {
      return metricsCase_ == 1;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     *
     * @return The classificationMetrics.
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ClassificationMetrics getClassificationMetrics() {
      if (classificationMetricsBuilder_ == null) {
        if (metricsCase_ == 1) {
          return (com.google.cloud.datalabeling.v1beta1.ClassificationMetrics) metrics_;
        }
        return com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.getDefaultInstance();
      } else {
        if (metricsCase_ == 1) {
          return classificationMetricsBuilder_.getMessage();
        }
        return com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.getDefaultInstance();
      }
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     */
    public Builder setClassificationMetrics(
        com.google.cloud.datalabeling.v1beta1.ClassificationMetrics value) {
      if (classificationMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metrics_ = value;
        onChanged();
      } else {
        classificationMetricsBuilder_.setMessage(value);
      }
      metricsCase_ = 1;
      return this;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     */
    public Builder setClassificationMetrics(
        com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.Builder builderForValue) {
      if (classificationMetricsBuilder_ == null) {
        metrics_ = builderForValue.build();
        onChanged();
      } else {
        classificationMetricsBuilder_.setMessage(builderForValue.build());
      }
      metricsCase_ = 1;
      return this;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     */
    public Builder mergeClassificationMetrics(
        com.google.cloud.datalabeling.v1beta1.ClassificationMetrics value) {
      if (classificationMetricsBuilder_ == null) {
        if (metricsCase_ == 1
            && metrics_
                != com.google.cloud.datalabeling.v1beta1.ClassificationMetrics
                    .getDefaultInstance()) {
          metrics_ =
              com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.newBuilder(
                      (com.google.cloud.datalabeling.v1beta1.ClassificationMetrics) metrics_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          metrics_ = value;
        }
        onChanged();
      } else {
        if (metricsCase_ == 1) {
          classificationMetricsBuilder_.mergeFrom(value);
        } else {
          classificationMetricsBuilder_.setMessage(value);
        }
      }
      metricsCase_ = 1;
      return this;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     */
    public Builder clearClassificationMetrics() {
      if (classificationMetricsBuilder_ == null) {
        if (metricsCase_ == 1) {
          metricsCase_ = 0;
          metrics_ = null;
          onChanged();
        }
      } else {
        if (metricsCase_ == 1) {
          metricsCase_ = 0;
          metrics_ = null;
        }
        classificationMetricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.Builder
        getClassificationMetricsBuilder() {
      return getClassificationMetricsFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ClassificationMetricsOrBuilder
        getClassificationMetricsOrBuilder() {
      if ((metricsCase_ == 1) && (classificationMetricsBuilder_ != null)) {
        return classificationMetricsBuilder_.getMessageOrBuilder();
      } else {
        if (metricsCase_ == 1) {
          return (com.google.cloud.datalabeling.v1beta1.ClassificationMetrics) metrics_;
        }
        return com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.getDefaultInstance();
      }
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.ClassificationMetrics,
            com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.Builder,
            com.google.cloud.datalabeling.v1beta1.ClassificationMetricsOrBuilder>
        getClassificationMetricsFieldBuilder() {
      if (classificationMetricsBuilder_ == null) {
        if (!(metricsCase_ == 1)) {
          metrics_ =
              com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.getDefaultInstance();
        }
        classificationMetricsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.ClassificationMetrics,
                com.google.cloud.datalabeling.v1beta1.ClassificationMetrics.Builder,
                com.google.cloud.datalabeling.v1beta1.ClassificationMetricsOrBuilder>(
                (com.google.cloud.datalabeling.v1beta1.ClassificationMetrics) metrics_,
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      metricsCase_ = 1;
      onChanged();
      return classificationMetricsBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics,
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.Builder,
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetricsOrBuilder>
        objectDetectionMetricsBuilder_;
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     *
     * @return Whether the objectDetectionMetrics field is set.
     */
    @java.lang.Override
    public boolean hasObjectDetectionMetrics() {
      return metricsCase_ == 2;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     *
     * @return The objectDetectionMetrics.
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics
        getObjectDetectionMetrics() {
      if (objectDetectionMetricsBuilder_ == null) {
        if (metricsCase_ == 2) {
          return (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) metrics_;
        }
        return com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.getDefaultInstance();
      } else {
        if (metricsCase_ == 2) {
          return objectDetectionMetricsBuilder_.getMessage();
        }
        return com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.getDefaultInstance();
      }
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     */
    public Builder setObjectDetectionMetrics(
        com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics value) {
      if (objectDetectionMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metrics_ = value;
        onChanged();
      } else {
        objectDetectionMetricsBuilder_.setMessage(value);
      }
      metricsCase_ = 2;
      return this;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     */
    public Builder setObjectDetectionMetrics(
        com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.Builder builderForValue) {
      if (objectDetectionMetricsBuilder_ == null) {
        metrics_ = builderForValue.build();
        onChanged();
      } else {
        objectDetectionMetricsBuilder_.setMessage(builderForValue.build());
      }
      metricsCase_ = 2;
      return this;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     */
    public Builder mergeObjectDetectionMetrics(
        com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics value) {
      if (objectDetectionMetricsBuilder_ == null) {
        if (metricsCase_ == 2
            && metrics_
                != com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics
                    .getDefaultInstance()) {
          metrics_ =
              com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.newBuilder(
                      (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) metrics_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          metrics_ = value;
        }
        onChanged();
      } else {
        if (metricsCase_ == 2) {
          objectDetectionMetricsBuilder_.mergeFrom(value);
        } else {
          objectDetectionMetricsBuilder_.setMessage(value);
        }
      }
      metricsCase_ = 2;
      return this;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     */
    public Builder clearObjectDetectionMetrics() {
      if (objectDetectionMetricsBuilder_ == null) {
        if (metricsCase_ == 2) {
          metricsCase_ = 0;
          metrics_ = null;
          onChanged();
        }
      } else {
        if (metricsCase_ == 2) {
          metricsCase_ = 0;
          metrics_ = null;
        }
        objectDetectionMetricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.Builder
        getObjectDetectionMetricsBuilder() {
      return getObjectDetectionMetricsFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetricsOrBuilder
        getObjectDetectionMetricsOrBuilder() {
      if ((metricsCase_ == 2) && (objectDetectionMetricsBuilder_ != null)) {
        return objectDetectionMetricsBuilder_.getMessageOrBuilder();
      } else {
        if (metricsCase_ == 2) {
          return (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) metrics_;
        }
        return com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.getDefaultInstance();
      }
    }
    /**
     * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics,
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.Builder,
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetricsOrBuilder>
        getObjectDetectionMetricsFieldBuilder() {
      if (objectDetectionMetricsBuilder_ == null) {
        if (!(metricsCase_ == 2)) {
          metrics_ =
              com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.getDefaultInstance();
        }
        objectDetectionMetricsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics,
                com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.Builder,
                com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetricsOrBuilder>(
                (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) metrics_,
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      metricsCase_ = 2;
      onChanged();
      return objectDetectionMetricsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.EvaluationMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.EvaluationMetrics)
  private static final com.google.cloud.datalabeling.v1beta1.EvaluationMetrics DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.EvaluationMetrics();
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvaluationMetrics> PARSER =
      new com.google.protobuf.AbstractParser<EvaluationMetrics>() {
        @java.lang.Override
        public EvaluationMetrics parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<EvaluationMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvaluationMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.EvaluationMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
