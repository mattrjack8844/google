// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/import.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 * <pre>
 * Google Cloud Storage location for input content.
 * format.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.GcsSource}
 */
public final class GcsSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.GcsSource)
    GcsSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsSource.newBuilder() to construct.
  private GcsSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsSource() {
    inputUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcsSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.GcsSource.class, com.google.cloud.recommendationengine.v1beta1.GcsSource.Builder.class);
  }

  public static final int INPUT_URIS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList inputUris_;
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the inputUris.
   */
  public com.google.protobuf.ProtocolStringList
      getInputUrisList() {
    return inputUris_;
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of inputUris.
   */
  public int getInputUrisCount() {
    return inputUris_.size();
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The inputUris at the given index.
   */
  public java.lang.String getInputUris(int index) {
    return inputUris_.get(index);
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the inputUris at the given index.
   */
  public com.google.protobuf.ByteString
      getInputUrisBytes(int index) {
    return inputUris_.getByteString(index);
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
    for (int i = 0; i < inputUris_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inputUris_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < inputUris_.size(); i++) {
        dataSize += computeStringSizeNoTag(inputUris_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getInputUrisList().size();
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
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.GcsSource)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.GcsSource other = (com.google.cloud.recommendationengine.v1beta1.GcsSource) obj;

    if (!getInputUrisList()
        .equals(other.getInputUrisList())) return false;
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
    if (getInputUrisCount() > 0) {
      hash = (37 * hash) + INPUT_URIS_FIELD_NUMBER;
      hash = (53 * hash) + getInputUrisList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.GcsSource parseFrom(
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
  public static Builder newBuilder(com.google.cloud.recommendationengine.v1beta1.GcsSource prototype) {
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
   * Google Cloud Storage location for input content.
   * format.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.GcsSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.GcsSource)
      com.google.cloud.recommendationengine.v1beta1.GcsSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.GcsSource.class, com.google.cloud.recommendationengine.v1beta1.GcsSource.Builder.class);
    }

    // Construct using com.google.cloud.recommendationengine.v1beta1.GcsSource.newBuilder()
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
      inputUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.GcsSource getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.GcsSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.GcsSource build() {
      com.google.cloud.recommendationengine.v1beta1.GcsSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.GcsSource buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.GcsSource result = new com.google.cloud.recommendationengine.v1beta1.GcsSource(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.recommendationengine.v1beta1.GcsSource result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        inputUris_ = inputUris_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.inputUris_ = inputUris_;
    }

    private void buildPartial0(com.google.cloud.recommendationengine.v1beta1.GcsSource result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.GcsSource) {
        return mergeFrom((com.google.cloud.recommendationengine.v1beta1.GcsSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommendationengine.v1beta1.GcsSource other) {
      if (other == com.google.cloud.recommendationengine.v1beta1.GcsSource.getDefaultInstance()) return this;
      if (!other.inputUris_.isEmpty()) {
        if (inputUris_.isEmpty()) {
          inputUris_ = other.inputUris_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureInputUrisIsMutable();
          inputUris_.addAll(other.inputUris_);
        }
        onChanged();
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureInputUrisIsMutable();
              inputUris_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringList inputUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureInputUrisIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inputUris_ = new com.google.protobuf.LazyStringArrayList(inputUris_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the inputUris.
     */
    public com.google.protobuf.ProtocolStringList
        getInputUrisList() {
      return inputUris_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of inputUris.
     */
    public int getInputUrisCount() {
      return inputUris_.size();
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The inputUris at the given index.
     */
    public java.lang.String getInputUris(int index) {
      return inputUris_.get(index);
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the inputUris at the given index.
     */
    public com.google.protobuf.ByteString
        getInputUrisBytes(int index) {
      return inputUris_.getByteString(index);
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The inputUris to set.
     * @return This builder for chaining.
     */
    public Builder setInputUris(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInputUrisIsMutable();
      inputUris_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The inputUris to add.
     * @return This builder for chaining.
     */
    public Builder addInputUris(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInputUrisIsMutable();
      inputUris_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The inputUris to add.
     * @return This builder for chaining.
     */
    public Builder addAllInputUris(
        java.lang.Iterable<java.lang.String> values) {
      ensureInputUrisIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, inputUris_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearInputUris() {
      inputUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs to input files. URI can be up to
     * 2000 characters long. URIs can match the full object path (for example,
     * `gs://bucket/directory/object.json`) or a pattern matching one or more
     * files, such as `gs://bucket/directory/&#42;.json`. A request can
     * contain at most 100 files, and each file can be up to 2 GB. See
     * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
     * for the expected file format and setup instructions.
     * </pre>
     *
     * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the inputUris to add.
     * @return This builder for chaining.
     */
    public Builder addInputUrisBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureInputUrisIsMutable();
      inputUris_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.GcsSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.GcsSource)
  private static final com.google.cloud.recommendationengine.v1beta1.GcsSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.GcsSource();
  }

  public static com.google.cloud.recommendationengine.v1beta1.GcsSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsSource>
      PARSER = new com.google.protobuf.AbstractParser<GcsSource>() {
    @java.lang.Override
    public GcsSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.GcsSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

