// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/storageinsights/v1/storageinsights.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.storageinsights.v1;

/**
 * <pre>
 * Options to store reports in storage systems.
 * Next ID: 3
 * </pre>
 *
 * Protobuf type {@code google.cloud.storageinsights.v1.CloudStorageDestinationOptions}
 */
public final class CloudStorageDestinationOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.storageinsights.v1.CloudStorageDestinationOptions)
    CloudStorageDestinationOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudStorageDestinationOptions.newBuilder() to construct.
  private CloudStorageDestinationOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudStorageDestinationOptions() {
    bucket_ = "";
    destinationPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloudStorageDestinationOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.storageinsights.v1.V1Proto.internal_static_google_cloud_storageinsights_v1_CloudStorageDestinationOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.storageinsights.v1.V1Proto.internal_static_google_cloud_storageinsights_v1_CloudStorageDestinationOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions.class, com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions.Builder.class);
  }

  public static final int BUCKET_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bucket_ = "";
  /**
   * <pre>
   * Destination bucket.
   * </pre>
   *
   * <code>string bucket = 1;</code>
   * @return The bucket.
   */
  @java.lang.Override
  public java.lang.String getBucket() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucket_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Destination bucket.
   * </pre>
   *
   * <code>string bucket = 1;</code>
   * @return The bytes for bucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBucketBytes() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_PATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationPath_ = "";
  /**
   * <pre>
   * Destination path is the path in the bucket where the report should be
   * generated.
   * </pre>
   *
   * <code>string destination_path = 2;</code>
   * @return The destinationPath.
   */
  @java.lang.Override
  public java.lang.String getDestinationPath() {
    java.lang.Object ref = destinationPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Destination path is the path in the bucket where the report should be
   * generated.
   * </pre>
   *
   * <code>string destination_path = 2;</code>
   * @return The bytes for destinationPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestinationPathBytes() {
    java.lang.Object ref = destinationPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationPath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destinationPath_);
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
    if (!(obj instanceof com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions other = (com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions) obj;

    if (!getBucket()
        .equals(other.getBucket())) return false;
    if (!getDestinationPath()
        .equals(other.getDestinationPath())) return false;
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
    hash = (37 * hash) + BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getBucket().hashCode();
    hash = (37 * hash) + DESTINATION_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions parseFrom(
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
  public static Builder newBuilder(com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions prototype) {
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
   * Options to store reports in storage systems.
   * Next ID: 3
   * </pre>
   *
   * Protobuf type {@code google.cloud.storageinsights.v1.CloudStorageDestinationOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.storageinsights.v1.CloudStorageDestinationOptions)
      com.google.cloud.storageinsights.v1.CloudStorageDestinationOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.storageinsights.v1.V1Proto.internal_static_google_cloud_storageinsights_v1_CloudStorageDestinationOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.storageinsights.v1.V1Proto.internal_static_google_cloud_storageinsights_v1_CloudStorageDestinationOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions.class, com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions.Builder.class);
    }

    // Construct using com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions.newBuilder()
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
      bucket_ = "";
      destinationPath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.storageinsights.v1.V1Proto.internal_static_google_cloud_storageinsights_v1_CloudStorageDestinationOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions getDefaultInstanceForType() {
      return com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions build() {
      com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions buildPartial() {
      com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions result = new com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bucket_ = bucket_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.destinationPath_ = destinationPath_;
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
      if (other instanceof com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions) {
        return mergeFrom((com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions other) {
      if (other == com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions.getDefaultInstance()) return this;
      if (!other.getBucket().isEmpty()) {
        bucket_ = other.bucket_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDestinationPath().isEmpty()) {
        destinationPath_ = other.destinationPath_;
        bitField0_ |= 0x00000002;
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
              bucket_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              destinationPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object bucket_ = "";
    /**
     * <pre>
     * Destination bucket.
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @return The bucket.
     */
    public java.lang.String getBucket() {
      java.lang.Object ref = bucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Destination bucket.
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @return The bytes for bucket.
     */
    public com.google.protobuf.ByteString
        getBucketBytes() {
      java.lang.Object ref = bucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Destination bucket.
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @param value The bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucket(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bucket_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Destination bucket.
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBucket() {
      bucket_ = getDefaultInstance().getBucket();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Destination bucket.
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @param value The bytes for bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bucket_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object destinationPath_ = "";
    /**
     * <pre>
     * Destination path is the path in the bucket where the report should be
     * generated.
     * </pre>
     *
     * <code>string destination_path = 2;</code>
     * @return The destinationPath.
     */
    public java.lang.String getDestinationPath() {
      java.lang.Object ref = destinationPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Destination path is the path in the bucket where the report should be
     * generated.
     * </pre>
     *
     * <code>string destination_path = 2;</code>
     * @return The bytes for destinationPath.
     */
    public com.google.protobuf.ByteString
        getDestinationPathBytes() {
      java.lang.Object ref = destinationPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Destination path is the path in the bucket where the report should be
     * generated.
     * </pre>
     *
     * <code>string destination_path = 2;</code>
     * @param value The destinationPath to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      destinationPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Destination path is the path in the bucket where the report should be
     * generated.
     * </pre>
     *
     * <code>string destination_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationPath() {
      destinationPath_ = getDefaultInstance().getDestinationPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Destination path is the path in the bucket where the report should be
     * generated.
     * </pre>
     *
     * <code>string destination_path = 2;</code>
     * @param value The bytes for destinationPath to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      destinationPath_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.storageinsights.v1.CloudStorageDestinationOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.storageinsights.v1.CloudStorageDestinationOptions)
  private static final com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions();
  }

  public static com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudStorageDestinationOptions>
      PARSER = new com.google.protobuf.AbstractParser<CloudStorageDestinationOptions>() {
    @java.lang.Override
    public CloudStorageDestinationOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudStorageDestinationOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudStorageDestinationOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.storageinsights.v1.CloudStorageDestinationOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

