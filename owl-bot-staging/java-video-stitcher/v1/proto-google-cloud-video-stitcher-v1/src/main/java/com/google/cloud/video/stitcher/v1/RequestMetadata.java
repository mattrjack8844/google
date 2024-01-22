// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/ad_tag_details.proto

package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Metadata for an ad request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.RequestMetadata}
 */
public final class RequestMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.RequestMetadata)
    RequestMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestMetadata.newBuilder() to construct.
  private RequestMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.AdTagDetailsProto.internal_static_google_cloud_video_stitcher_v1_RequestMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.AdTagDetailsProto.internal_static_google_cloud_video_stitcher_v1_RequestMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.RequestMetadata.class, com.google.cloud.video.stitcher.v1.RequestMetadata.Builder.class);
  }

  public static final int HEADERS_FIELD_NUMBER = 1;
  private com.google.protobuf.Struct headers_;
  /**
   * <pre>
   * The HTTP headers of the ad request.
   * </pre>
   *
   * <code>.google.protobuf.Struct headers = 1;</code>
   * @return Whether the headers field is set.
   */
  @java.lang.Override
  public boolean hasHeaders() {
    return headers_ != null;
  }
  /**
   * <pre>
   * The HTTP headers of the ad request.
   * </pre>
   *
   * <code>.google.protobuf.Struct headers = 1;</code>
   * @return The headers.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getHeaders() {
    return headers_ == null ? com.google.protobuf.Struct.getDefaultInstance() : headers_;
  }
  /**
   * <pre>
   * The HTTP headers of the ad request.
   * </pre>
   *
   * <code>.google.protobuf.Struct headers = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getHeadersOrBuilder() {
    return headers_ == null ? com.google.protobuf.Struct.getDefaultInstance() : headers_;
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
    if (headers_ != null) {
      output.writeMessage(1, getHeaders());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (headers_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeaders());
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.RequestMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.RequestMetadata other = (com.google.cloud.video.stitcher.v1.RequestMetadata) obj;

    if (hasHeaders() != other.hasHeaders()) return false;
    if (hasHeaders()) {
      if (!getHeaders()
          .equals(other.getHeaders())) return false;
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
    if (hasHeaders()) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getHeaders().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.RequestMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.RequestMetadata prototype) {
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
   * Metadata for an ad request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.RequestMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.RequestMetadata)
      com.google.cloud.video.stitcher.v1.RequestMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto.internal_static_google_cloud_video_stitcher_v1_RequestMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto.internal_static_google_cloud_video_stitcher_v1_RequestMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.RequestMetadata.class, com.google.cloud.video.stitcher.v1.RequestMetadata.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.RequestMetadata.newBuilder()
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
      headers_ = null;
      if (headersBuilder_ != null) {
        headersBuilder_.dispose();
        headersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto.internal_static_google_cloud_video_stitcher_v1_RequestMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.RequestMetadata getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.RequestMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.RequestMetadata build() {
      com.google.cloud.video.stitcher.v1.RequestMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.RequestMetadata buildPartial() {
      com.google.cloud.video.stitcher.v1.RequestMetadata result = new com.google.cloud.video.stitcher.v1.RequestMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.RequestMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.headers_ = headersBuilder_ == null
            ? headers_
            : headersBuilder_.build();
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
      if (other instanceof com.google.cloud.video.stitcher.v1.RequestMetadata) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.RequestMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.RequestMetadata other) {
      if (other == com.google.cloud.video.stitcher.v1.RequestMetadata.getDefaultInstance()) return this;
      if (other.hasHeaders()) {
        mergeHeaders(other.getHeaders());
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
              input.readMessage(
                  getHeadersFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.google.protobuf.Struct headers_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> headersBuilder_;
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     * @return Whether the headers field is set.
     */
    public boolean hasHeaders() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     * @return The headers.
     */
    public com.google.protobuf.Struct getHeaders() {
      if (headersBuilder_ == null) {
        return headers_ == null ? com.google.protobuf.Struct.getDefaultInstance() : headers_;
      } else {
        return headersBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     */
    public Builder setHeaders(com.google.protobuf.Struct value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        headers_ = value;
      } else {
        headersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     */
    public Builder setHeaders(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (headersBuilder_ == null) {
        headers_ = builderForValue.build();
      } else {
        headersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     */
    public Builder mergeHeaders(com.google.protobuf.Struct value) {
      if (headersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          headers_ != null &&
          headers_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getHeadersBuilder().mergeFrom(value);
        } else {
          headers_ = value;
        }
      } else {
        headersBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     */
    public Builder clearHeaders() {
      bitField0_ = (bitField0_ & ~0x00000001);
      headers_ = null;
      if (headersBuilder_ != null) {
        headersBuilder_.dispose();
        headersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     */
    public com.google.protobuf.Struct.Builder getHeadersBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHeadersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     */
    public com.google.protobuf.StructOrBuilder getHeadersOrBuilder() {
      if (headersBuilder_ != null) {
        return headersBuilder_.getMessageOrBuilder();
      } else {
        return headers_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : headers_;
      }
    }
    /**
     * <pre>
     * The HTTP headers of the ad request.
     * </pre>
     *
     * <code>.google.protobuf.Struct headers = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getHeadersFieldBuilder() {
      if (headersBuilder_ == null) {
        headersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getHeaders(),
                getParentForChildren(),
                isClean());
        headers_ = null;
      }
      return headersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.RequestMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.RequestMetadata)
  private static final com.google.cloud.video.stitcher.v1.RequestMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.RequestMetadata();
  }

  public static com.google.cloud.video.stitcher.v1.RequestMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestMetadata>
      PARSER = new com.google.protobuf.AbstractParser<RequestMetadata>() {
    @java.lang.Override
    public RequestMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<RequestMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.RequestMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

