/*
 * Copyright 2020 Google LLC
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
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * A `DistributionCut` defines a `TimeSeries` and thresholds used for measuring
 * good service and total service. The `TimeSeries` must have `ValueType =
 * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`. The
 * computed `good_service` will be the estimated count of values in the
 * `Distribution` that fall within the specified `min` and `max`.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.DistributionCut}
 */
public final class DistributionCut extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.DistributionCut)
    DistributionCutOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DistributionCut.newBuilder() to construct.
  private DistributionCut(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DistributionCut() {
    distributionFilter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DistributionCut();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DistributionCut(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              distributionFilter_ = s;
              break;
            }
          case 42:
            {
              com.google.monitoring.v3.Range.Builder subBuilder = null;
              if (range_ != null) {
                subBuilder = range_.toBuilder();
              }
              range_ =
                  input.readMessage(com.google.monitoring.v3.Range.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(range_);
                range_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.ServiceMonitoringProto
        .internal_static_google_monitoring_v3_DistributionCut_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.ServiceMonitoringProto
        .internal_static_google_monitoring_v3_DistributionCut_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.DistributionCut.class,
            com.google.monitoring.v3.DistributionCut.Builder.class);
  }

  public static final int DISTRIBUTION_FILTER_FIELD_NUMBER = 4;
  private volatile java.lang.Object distributionFilter_;
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` aggregating values. Must have `ValueType =
   * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string distribution_filter = 4;</code>
   *
   * @return The distributionFilter.
   */
  @java.lang.Override
  public java.lang.String getDistributionFilter() {
    java.lang.Object ref = distributionFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      distributionFilter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` aggregating values. Must have `ValueType =
   * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string distribution_filter = 4;</code>
   *
   * @return The bytes for distributionFilter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDistributionFilterBytes() {
    java.lang.Object ref = distributionFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      distributionFilter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RANGE_FIELD_NUMBER = 5;
  private com.google.monitoring.v3.Range range_;
  /**
   *
   *
   * <pre>
   * Range of values considered "good." For a one-sided range, set one bound to
   * an infinite value.
   * </pre>
   *
   * <code>.google.monitoring.v3.Range range = 5;</code>
   *
   * @return Whether the range field is set.
   */
  @java.lang.Override
  public boolean hasRange() {
    return range_ != null;
  }
  /**
   *
   *
   * <pre>
   * Range of values considered "good." For a one-sided range, set one bound to
   * an infinite value.
   * </pre>
   *
   * <code>.google.monitoring.v3.Range range = 5;</code>
   *
   * @return The range.
   */
  @java.lang.Override
  public com.google.monitoring.v3.Range getRange() {
    return range_ == null ? com.google.monitoring.v3.Range.getDefaultInstance() : range_;
  }
  /**
   *
   *
   * <pre>
   * Range of values considered "good." For a one-sided range, set one bound to
   * an infinite value.
   * </pre>
   *
   * <code>.google.monitoring.v3.Range range = 5;</code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.RangeOrBuilder getRangeOrBuilder() {
    return getRange();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(distributionFilter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, distributionFilter_);
    }
    if (range_ != null) {
      output.writeMessage(5, getRange());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(distributionFilter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, distributionFilter_);
    }
    if (range_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getRange());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.DistributionCut)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.DistributionCut other = (com.google.monitoring.v3.DistributionCut) obj;

    if (!getDistributionFilter().equals(other.getDistributionFilter())) return false;
    if (hasRange() != other.hasRange()) return false;
    if (hasRange()) {
      if (!getRange().equals(other.getRange())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DISTRIBUTION_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getDistributionFilter().hashCode();
    if (hasRange()) {
      hash = (37 * hash) + RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getRange().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.DistributionCut parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.DistributionCut parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.DistributionCut parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.DistributionCut prototype) {
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
  /**
   *
   *
   * <pre>
   * A `DistributionCut` defines a `TimeSeries` and thresholds used for measuring
   * good service and total service. The `TimeSeries` must have `ValueType =
   * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`. The
   * computed `good_service` will be the estimated count of values in the
   * `Distribution` that fall within the specified `min` and `max`.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.DistributionCut}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.DistributionCut)
      com.google.monitoring.v3.DistributionCutOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_DistributionCut_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_DistributionCut_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.DistributionCut.class,
              com.google.monitoring.v3.DistributionCut.Builder.class);
    }

    // Construct using com.google.monitoring.v3.DistributionCut.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      distributionFilter_ = "";

      if (rangeBuilder_ == null) {
        range_ = null;
      } else {
        range_ = null;
        rangeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_DistributionCut_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.DistributionCut getDefaultInstanceForType() {
      return com.google.monitoring.v3.DistributionCut.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.DistributionCut build() {
      com.google.monitoring.v3.DistributionCut result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.DistributionCut buildPartial() {
      com.google.monitoring.v3.DistributionCut result =
          new com.google.monitoring.v3.DistributionCut(this);
      result.distributionFilter_ = distributionFilter_;
      if (rangeBuilder_ == null) {
        result.range_ = range_;
      } else {
        result.range_ = rangeBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.monitoring.v3.DistributionCut) {
        return mergeFrom((com.google.monitoring.v3.DistributionCut) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.DistributionCut other) {
      if (other == com.google.monitoring.v3.DistributionCut.getDefaultInstance()) return this;
      if (!other.getDistributionFilter().isEmpty()) {
        distributionFilter_ = other.distributionFilter_;
        onChanged();
      }
      if (other.hasRange()) {
        mergeRange(other.getRange());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.monitoring.v3.DistributionCut parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.DistributionCut) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object distributionFilter_ = "";
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` aggregating values. Must have `ValueType =
     * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string distribution_filter = 4;</code>
     *
     * @return The distributionFilter.
     */
    public java.lang.String getDistributionFilter() {
      java.lang.Object ref = distributionFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        distributionFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` aggregating values. Must have `ValueType =
     * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string distribution_filter = 4;</code>
     *
     * @return The bytes for distributionFilter.
     */
    public com.google.protobuf.ByteString getDistributionFilterBytes() {
      java.lang.Object ref = distributionFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        distributionFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` aggregating values. Must have `ValueType =
     * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string distribution_filter = 4;</code>
     *
     * @param value The distributionFilter to set.
     * @return This builder for chaining.
     */
    public Builder setDistributionFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      distributionFilter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` aggregating values. Must have `ValueType =
     * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string distribution_filter = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDistributionFilter() {

      distributionFilter_ = getDefaultInstance().getDistributionFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` aggregating values. Must have `ValueType =
     * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string distribution_filter = 4;</code>
     *
     * @param value The bytes for distributionFilter to set.
     * @return This builder for chaining.
     */
    public Builder setDistributionFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      distributionFilter_ = value;
      onChanged();
      return this;
    }

    private com.google.monitoring.v3.Range range_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.Range,
            com.google.monitoring.v3.Range.Builder,
            com.google.monitoring.v3.RangeOrBuilder>
        rangeBuilder_;
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     *
     * @return Whether the range field is set.
     */
    public boolean hasRange() {
      return rangeBuilder_ != null || range_ != null;
    }
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     *
     * @return The range.
     */
    public com.google.monitoring.v3.Range getRange() {
      if (rangeBuilder_ == null) {
        return range_ == null ? com.google.monitoring.v3.Range.getDefaultInstance() : range_;
      } else {
        return rangeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     */
    public Builder setRange(com.google.monitoring.v3.Range value) {
      if (rangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        range_ = value;
        onChanged();
      } else {
        rangeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     */
    public Builder setRange(com.google.monitoring.v3.Range.Builder builderForValue) {
      if (rangeBuilder_ == null) {
        range_ = builderForValue.build();
        onChanged();
      } else {
        rangeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     */
    public Builder mergeRange(com.google.monitoring.v3.Range value) {
      if (rangeBuilder_ == null) {
        if (range_ != null) {
          range_ =
              com.google.monitoring.v3.Range.newBuilder(range_).mergeFrom(value).buildPartial();
        } else {
          range_ = value;
        }
        onChanged();
      } else {
        rangeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     */
    public Builder clearRange() {
      if (rangeBuilder_ == null) {
        range_ = null;
        onChanged();
      } else {
        range_ = null;
        rangeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     */
    public com.google.monitoring.v3.Range.Builder getRangeBuilder() {

      onChanged();
      return getRangeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     */
    public com.google.monitoring.v3.RangeOrBuilder getRangeOrBuilder() {
      if (rangeBuilder_ != null) {
        return rangeBuilder_.getMessageOrBuilder();
      } else {
        return range_ == null ? com.google.monitoring.v3.Range.getDefaultInstance() : range_;
      }
    }
    /**
     *
     *
     * <pre>
     * Range of values considered "good." For a one-sided range, set one bound to
     * an infinite value.
     * </pre>
     *
     * <code>.google.monitoring.v3.Range range = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.Range,
            com.google.monitoring.v3.Range.Builder,
            com.google.monitoring.v3.RangeOrBuilder>
        getRangeFieldBuilder() {
      if (rangeBuilder_ == null) {
        rangeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.Range,
                com.google.monitoring.v3.Range.Builder,
                com.google.monitoring.v3.RangeOrBuilder>(
                getRange(), getParentForChildren(), isClean());
        range_ = null;
      }
      return rangeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.DistributionCut)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.DistributionCut)
  private static final com.google.monitoring.v3.DistributionCut DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.DistributionCut();
  }

  public static com.google.monitoring.v3.DistributionCut getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DistributionCut> PARSER =
      new com.google.protobuf.AbstractParser<DistributionCut>() {
        @java.lang.Override
        public DistributionCut parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DistributionCut(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DistributionCut> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DistributionCut> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.DistributionCut getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
