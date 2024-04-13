// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Response message for
 * [FeaturestoreService.ImportFeatureValues][google.cloud.aiplatform.v1beta1.FeaturestoreService.ImportFeatureValues].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse}
 */
public final class ImportFeatureValuesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse)
    ImportFeatureValuesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportFeatureValuesResponse.newBuilder() to construct.
  private ImportFeatureValuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportFeatureValuesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportFeatureValuesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse.class, com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse.Builder.class);
  }

  public static final int IMPORTED_ENTITY_COUNT_FIELD_NUMBER = 1;
  private long importedEntityCount_ = 0L;
  /**
   * <pre>
   * Number of entities that have been imported by the operation.
   * </pre>
   *
   * <code>int64 imported_entity_count = 1;</code>
   * @return The importedEntityCount.
   */
  @java.lang.Override
  public long getImportedEntityCount() {
    return importedEntityCount_;
  }

  public static final int IMPORTED_FEATURE_VALUE_COUNT_FIELD_NUMBER = 2;
  private long importedFeatureValueCount_ = 0L;
  /**
   * <pre>
   * Number of Feature values that have been imported by the operation.
   * </pre>
   *
   * <code>int64 imported_feature_value_count = 2;</code>
   * @return The importedFeatureValueCount.
   */
  @java.lang.Override
  public long getImportedFeatureValueCount() {
    return importedFeatureValueCount_;
  }

  public static final int INVALID_ROW_COUNT_FIELD_NUMBER = 6;
  private long invalidRowCount_ = 0L;
  /**
   * <pre>
   * The number of rows in input source that weren't imported due to either
   * * Not having any featureValues.
   * * Having a null entityId.
   * * Having a null timestamp.
   * * Not being parsable (applicable for CSV sources).
   * </pre>
   *
   * <code>int64 invalid_row_count = 6;</code>
   * @return The invalidRowCount.
   */
  @java.lang.Override
  public long getInvalidRowCount() {
    return invalidRowCount_;
  }

  public static final int TIMESTAMP_OUTSIDE_RETENTION_ROWS_COUNT_FIELD_NUMBER = 4;
  private long timestampOutsideRetentionRowsCount_ = 0L;
  /**
   * <pre>
   * The number rows that weren't ingested due to having feature timestamps
   * outside the retention boundary.
   * </pre>
   *
   * <code>int64 timestamp_outside_retention_rows_count = 4;</code>
   * @return The timestampOutsideRetentionRowsCount.
   */
  @java.lang.Override
  public long getTimestampOutsideRetentionRowsCount() {
    return timestampOutsideRetentionRowsCount_;
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
    if (importedEntityCount_ != 0L) {
      output.writeInt64(1, importedEntityCount_);
    }
    if (importedFeatureValueCount_ != 0L) {
      output.writeInt64(2, importedFeatureValueCount_);
    }
    if (timestampOutsideRetentionRowsCount_ != 0L) {
      output.writeInt64(4, timestampOutsideRetentionRowsCount_);
    }
    if (invalidRowCount_ != 0L) {
      output.writeInt64(6, invalidRowCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (importedEntityCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, importedEntityCount_);
    }
    if (importedFeatureValueCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, importedFeatureValueCount_);
    }
    if (timestampOutsideRetentionRowsCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, timestampOutsideRetentionRowsCount_);
    }
    if (invalidRowCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, invalidRowCount_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse other = (com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse) obj;

    if (getImportedEntityCount()
        != other.getImportedEntityCount()) return false;
    if (getImportedFeatureValueCount()
        != other.getImportedFeatureValueCount()) return false;
    if (getInvalidRowCount()
        != other.getInvalidRowCount()) return false;
    if (getTimestampOutsideRetentionRowsCount()
        != other.getTimestampOutsideRetentionRowsCount()) return false;
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
    hash = (37 * hash) + IMPORTED_ENTITY_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getImportedEntityCount());
    hash = (37 * hash) + IMPORTED_FEATURE_VALUE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getImportedFeatureValueCount());
    hash = (37 * hash) + INVALID_ROW_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInvalidRowCount());
    hash = (37 * hash) + TIMESTAMP_OUTSIDE_RETENTION_ROWS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestampOutsideRetentionRowsCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse prototype) {
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
   * Response message for
   * [FeaturestoreService.ImportFeatureValues][google.cloud.aiplatform.v1beta1.FeaturestoreService.ImportFeatureValues].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse)
      com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse.class, com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse.newBuilder()
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
      importedEntityCount_ = 0L;
      importedFeatureValueCount_ = 0L;
      invalidRowCount_ = 0L;
      timestampOutsideRetentionRowsCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ImportFeatureValuesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse build() {
      com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse result = new com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.importedEntityCount_ = importedEntityCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.importedFeatureValueCount_ = importedFeatureValueCount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.invalidRowCount_ = invalidRowCount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.timestampOutsideRetentionRowsCount_ = timestampOutsideRetentionRowsCount_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse.getDefaultInstance()) return this;
      if (other.getImportedEntityCount() != 0L) {
        setImportedEntityCount(other.getImportedEntityCount());
      }
      if (other.getImportedFeatureValueCount() != 0L) {
        setImportedFeatureValueCount(other.getImportedFeatureValueCount());
      }
      if (other.getInvalidRowCount() != 0L) {
        setInvalidRowCount(other.getInvalidRowCount());
      }
      if (other.getTimestampOutsideRetentionRowsCount() != 0L) {
        setTimestampOutsideRetentionRowsCount(other.getTimestampOutsideRetentionRowsCount());
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
              importedEntityCount_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              importedFeatureValueCount_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 32: {
              timestampOutsideRetentionRowsCount_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 48: {
              invalidRowCount_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 48
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

    private long importedEntityCount_ ;
    /**
     * <pre>
     * Number of entities that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_entity_count = 1;</code>
     * @return The importedEntityCount.
     */
    @java.lang.Override
    public long getImportedEntityCount() {
      return importedEntityCount_;
    }
    /**
     * <pre>
     * Number of entities that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_entity_count = 1;</code>
     * @param value The importedEntityCount to set.
     * @return This builder for chaining.
     */
    public Builder setImportedEntityCount(long value) {

      importedEntityCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of entities that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_entity_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImportedEntityCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      importedEntityCount_ = 0L;
      onChanged();
      return this;
    }

    private long importedFeatureValueCount_ ;
    /**
     * <pre>
     * Number of Feature values that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_feature_value_count = 2;</code>
     * @return The importedFeatureValueCount.
     */
    @java.lang.Override
    public long getImportedFeatureValueCount() {
      return importedFeatureValueCount_;
    }
    /**
     * <pre>
     * Number of Feature values that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_feature_value_count = 2;</code>
     * @param value The importedFeatureValueCount to set.
     * @return This builder for chaining.
     */
    public Builder setImportedFeatureValueCount(long value) {

      importedFeatureValueCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of Feature values that have been imported by the operation.
     * </pre>
     *
     * <code>int64 imported_feature_value_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImportedFeatureValueCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      importedFeatureValueCount_ = 0L;
      onChanged();
      return this;
    }

    private long invalidRowCount_ ;
    /**
     * <pre>
     * The number of rows in input source that weren't imported due to either
     * * Not having any featureValues.
     * * Having a null entityId.
     * * Having a null timestamp.
     * * Not being parsable (applicable for CSV sources).
     * </pre>
     *
     * <code>int64 invalid_row_count = 6;</code>
     * @return The invalidRowCount.
     */
    @java.lang.Override
    public long getInvalidRowCount() {
      return invalidRowCount_;
    }
    /**
     * <pre>
     * The number of rows in input source that weren't imported due to either
     * * Not having any featureValues.
     * * Having a null entityId.
     * * Having a null timestamp.
     * * Not being parsable (applicable for CSV sources).
     * </pre>
     *
     * <code>int64 invalid_row_count = 6;</code>
     * @param value The invalidRowCount to set.
     * @return This builder for chaining.
     */
    public Builder setInvalidRowCount(long value) {

      invalidRowCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of rows in input source that weren't imported due to either
     * * Not having any featureValues.
     * * Having a null entityId.
     * * Having a null timestamp.
     * * Not being parsable (applicable for CSV sources).
     * </pre>
     *
     * <code>int64 invalid_row_count = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearInvalidRowCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      invalidRowCount_ = 0L;
      onChanged();
      return this;
    }

    private long timestampOutsideRetentionRowsCount_ ;
    /**
     * <pre>
     * The number rows that weren't ingested due to having feature timestamps
     * outside the retention boundary.
     * </pre>
     *
     * <code>int64 timestamp_outside_retention_rows_count = 4;</code>
     * @return The timestampOutsideRetentionRowsCount.
     */
    @java.lang.Override
    public long getTimestampOutsideRetentionRowsCount() {
      return timestampOutsideRetentionRowsCount_;
    }
    /**
     * <pre>
     * The number rows that weren't ingested due to having feature timestamps
     * outside the retention boundary.
     * </pre>
     *
     * <code>int64 timestamp_outside_retention_rows_count = 4;</code>
     * @param value The timestampOutsideRetentionRowsCount to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampOutsideRetentionRowsCount(long value) {

      timestampOutsideRetentionRowsCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number rows that weren't ingested due to having feature timestamps
     * outside the retention boundary.
     * </pre>
     *
     * <code>int64 timestamp_outside_retention_rows_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestampOutsideRetentionRowsCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      timestampOutsideRetentionRowsCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportFeatureValuesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ImportFeatureValuesResponse>() {
    @java.lang.Override
    public ImportFeatureValuesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportFeatureValuesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportFeatureValuesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ImportFeatureValuesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

