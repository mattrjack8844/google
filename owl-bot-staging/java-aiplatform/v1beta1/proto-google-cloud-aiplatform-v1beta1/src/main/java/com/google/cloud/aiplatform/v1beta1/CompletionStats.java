// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/completion_stats.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Success and error statistics of processing multiple entities
 * (for example, DataItems or structured data rows) in batch.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CompletionStats}
 */
public final class CompletionStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CompletionStats)
    CompletionStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompletionStats.newBuilder() to construct.
  private CompletionStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompletionStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompletionStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CompletionStats.class, com.google.cloud.aiplatform.v1beta1.CompletionStats.Builder.class);
  }

  public static final int SUCCESSFUL_COUNT_FIELD_NUMBER = 1;
  private long successfulCount_ = 0L;
  /**
   * <pre>
   * Output only. The number of entities that had been processed successfully.
   * </pre>
   *
   * <code>int64 successful_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The successfulCount.
   */
  @java.lang.Override
  public long getSuccessfulCount() {
    return successfulCount_;
  }

  public static final int FAILED_COUNT_FIELD_NUMBER = 2;
  private long failedCount_ = 0L;
  /**
   * <pre>
   * Output only. The number of entities for which any error was encountered.
   * </pre>
   *
   * <code>int64 failed_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failedCount.
   */
  @java.lang.Override
  public long getFailedCount() {
    return failedCount_;
  }

  public static final int INCOMPLETE_COUNT_FIELD_NUMBER = 3;
  private long incompleteCount_ = 0L;
  /**
   * <pre>
   * Output only. In cases when enough errors are encountered a job, pipeline,
   * or operation may be failed as a whole. Below is the number of entities for
   * which the processing had not been finished (either in successful or failed
   * state). Set to -1 if the number is unknown (for example, the operation
   * failed before the total entity number could be collected).
   * </pre>
   *
   * <code>int64 incomplete_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The incompleteCount.
   */
  @java.lang.Override
  public long getIncompleteCount() {
    return incompleteCount_;
  }

  public static final int SUCCESSFUL_FORECAST_POINT_COUNT_FIELD_NUMBER = 5;
  private long successfulForecastPointCount_ = 0L;
  /**
   * <pre>
   * Output only. The number of the successful forecast points that are
   * generated by the forecasting model. This is ONLY used by the forecasting
   * batch prediction.
   * </pre>
   *
   * <code>int64 successful_forecast_point_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The successfulForecastPointCount.
   */
  @java.lang.Override
  public long getSuccessfulForecastPointCount() {
    return successfulForecastPointCount_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (successfulCount_ != 0L) {
      output.writeInt64(1, successfulCount_);
    }
    if (failedCount_ != 0L) {
      output.writeInt64(2, failedCount_);
    }
    if (incompleteCount_ != 0L) {
      output.writeInt64(3, incompleteCount_);
    }
    if (successfulForecastPointCount_ != 0L) {
      output.writeInt64(5, successfulForecastPointCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (successfulCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, successfulCount_);
    }
    if (failedCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, failedCount_);
    }
    if (incompleteCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, incompleteCount_);
    }
    if (successfulForecastPointCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, successfulForecastPointCount_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CompletionStats)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CompletionStats other = (com.google.cloud.aiplatform.v1beta1.CompletionStats) obj;

    if (getSuccessfulCount()
        != other.getSuccessfulCount()) return false;
    if (getFailedCount()
        != other.getFailedCount()) return false;
    if (getIncompleteCount()
        != other.getIncompleteCount()) return false;
    if (getSuccessfulForecastPointCount()
        != other.getSuccessfulForecastPointCount()) return false;
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
    hash = (37 * hash) + SUCCESSFUL_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSuccessfulCount());
    hash = (37 * hash) + FAILED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFailedCount());
    hash = (37 * hash) + INCOMPLETE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIncompleteCount());
    hash = (37 * hash) + SUCCESSFUL_FORECAST_POINT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSuccessfulForecastPointCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CompletionStats parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.CompletionStats prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Success and error statistics of processing multiple entities
   * (for example, DataItems or structured data rows) in batch.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CompletionStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CompletionStats)
      com.google.cloud.aiplatform.v1beta1.CompletionStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CompletionStats.class, com.google.cloud.aiplatform.v1beta1.CompletionStats.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CompletionStats.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      successfulCount_ = 0L;
      failedCount_ = 0L;
      incompleteCount_ = 0L;
      successfulForecastPointCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CompletionStats getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CompletionStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CompletionStats build() {
      com.google.cloud.aiplatform.v1beta1.CompletionStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CompletionStats buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CompletionStats result = new com.google.cloud.aiplatform.v1beta1.CompletionStats(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.CompletionStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.successfulCount_ = successfulCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.failedCount_ = failedCount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.incompleteCount_ = incompleteCount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.successfulForecastPointCount_ = successfulForecastPointCount_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CompletionStats) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CompletionStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CompletionStats other) {
      if (other == com.google.cloud.aiplatform.v1beta1.CompletionStats.getDefaultInstance()) return this;
      if (other.getSuccessfulCount() != 0L) {
        setSuccessfulCount(other.getSuccessfulCount());
      }
      if (other.getFailedCount() != 0L) {
        setFailedCount(other.getFailedCount());
      }
      if (other.getIncompleteCount() != 0L) {
        setIncompleteCount(other.getIncompleteCount());
      }
      if (other.getSuccessfulForecastPointCount() != 0L) {
        setSuccessfulForecastPointCount(other.getSuccessfulForecastPointCount());
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
            case 8: {
              successfulCount_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              failedCount_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              incompleteCount_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 40: {
              successfulForecastPointCount_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 40
            default: {
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
    private int bitField0_;

    private long successfulCount_ ;
    /**
     * <pre>
     * Output only. The number of entities that had been processed successfully.
     * </pre>
     *
     * <code>int64 successful_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The successfulCount.
     */
    @java.lang.Override
    public long getSuccessfulCount() {
      return successfulCount_;
    }
    /**
     * <pre>
     * Output only. The number of entities that had been processed successfully.
     * </pre>
     *
     * <code>int64 successful_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The successfulCount to set.
     * @return This builder for chaining.
     */
    public Builder setSuccessfulCount(long value) {
      
      successfulCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The number of entities that had been processed successfully.
     * </pre>
     *
     * <code>int64 successful_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccessfulCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      successfulCount_ = 0L;
      onChanged();
      return this;
    }

    private long failedCount_ ;
    /**
     * <pre>
     * Output only. The number of entities for which any error was encountered.
     * </pre>
     *
     * <code>int64 failed_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The failedCount.
     */
    @java.lang.Override
    public long getFailedCount() {
      return failedCount_;
    }
    /**
     * <pre>
     * Output only. The number of entities for which any error was encountered.
     * </pre>
     *
     * <code>int64 failed_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The failedCount to set.
     * @return This builder for chaining.
     */
    public Builder setFailedCount(long value) {
      
      failedCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The number of entities for which any error was encountered.
     * </pre>
     *
     * <code>int64 failed_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      failedCount_ = 0L;
      onChanged();
      return this;
    }

    private long incompleteCount_ ;
    /**
     * <pre>
     * Output only. In cases when enough errors are encountered a job, pipeline,
     * or operation may be failed as a whole. Below is the number of entities for
     * which the processing had not been finished (either in successful or failed
     * state). Set to -1 if the number is unknown (for example, the operation
     * failed before the total entity number could be collected).
     * </pre>
     *
     * <code>int64 incomplete_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The incompleteCount.
     */
    @java.lang.Override
    public long getIncompleteCount() {
      return incompleteCount_;
    }
    /**
     * <pre>
     * Output only. In cases when enough errors are encountered a job, pipeline,
     * or operation may be failed as a whole. Below is the number of entities for
     * which the processing had not been finished (either in successful or failed
     * state). Set to -1 if the number is unknown (for example, the operation
     * failed before the total entity number could be collected).
     * </pre>
     *
     * <code>int64 incomplete_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The incompleteCount to set.
     * @return This builder for chaining.
     */
    public Builder setIncompleteCount(long value) {
      
      incompleteCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. In cases when enough errors are encountered a job, pipeline,
     * or operation may be failed as a whole. Below is the number of entities for
     * which the processing had not been finished (either in successful or failed
     * state). Set to -1 if the number is unknown (for example, the operation
     * failed before the total entity number could be collected).
     * </pre>
     *
     * <code>int64 incomplete_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncompleteCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      incompleteCount_ = 0L;
      onChanged();
      return this;
    }

    private long successfulForecastPointCount_ ;
    /**
     * <pre>
     * Output only. The number of the successful forecast points that are
     * generated by the forecasting model. This is ONLY used by the forecasting
     * batch prediction.
     * </pre>
     *
     * <code>int64 successful_forecast_point_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The successfulForecastPointCount.
     */
    @java.lang.Override
    public long getSuccessfulForecastPointCount() {
      return successfulForecastPointCount_;
    }
    /**
     * <pre>
     * Output only. The number of the successful forecast points that are
     * generated by the forecasting model. This is ONLY used by the forecasting
     * batch prediction.
     * </pre>
     *
     * <code>int64 successful_forecast_point_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The successfulForecastPointCount to set.
     * @return This builder for chaining.
     */
    public Builder setSuccessfulForecastPointCount(long value) {
      
      successfulForecastPointCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The number of the successful forecast points that are
     * generated by the forecasting model. This is ONLY used by the forecasting
     * batch prediction.
     * </pre>
     *
     * <code>int64 successful_forecast_point_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccessfulForecastPointCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      successfulForecastPointCount_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CompletionStats)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CompletionStats)
  private static final com.google.cloud.aiplatform.v1beta1.CompletionStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CompletionStats();
  }

  public static com.google.cloud.aiplatform.v1beta1.CompletionStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompletionStats>
      PARSER = new com.google.protobuf.AbstractParser<CompletionStats>() {
    @java.lang.Override
    public CompletionStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompletionStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompletionStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CompletionStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

