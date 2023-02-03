// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

/**
 * <pre>
 * A document translation request input config.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.DocumentInputConfig}
 */
public final class DocumentInputConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.DocumentInputConfig)
    DocumentInputConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocumentInputConfig.newBuilder() to construct.
  private DocumentInputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentInputConfig() {
    mimeType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DocumentInputConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_DocumentInputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_DocumentInputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.DocumentInputConfig.class, com.google.cloud.translate.v3.DocumentInputConfig.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONTENT(1),
    GCS_SOURCE(2),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1: return CONTENT;
        case 2: return GCS_SOURCE;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Document's content represented as a stream of bytes.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return sourceCase_ == 1;
  }
  /**
   * <pre>
   * Document's content represented as a stream of bytes.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   * @return The content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContent() {
    if (sourceCase_ == 1) {
      return (com.google.protobuf.ByteString) source_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Google Cloud Storage location. This must be a single file.
   * For example: gs://example_bucket/example_file.pdf
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return sourceCase_ == 2;
  }
  /**
   * <pre>
   * Google Cloud Storage location. This must be a single file.
   * For example: gs://example_bucket/example_file.pdf
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.GcsSource getGcsSource() {
    if (sourceCase_ == 2) {
       return (com.google.cloud.translate.v3.GcsSource) source_;
    }
    return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
  }
  /**
   * <pre>
   * Google Cloud Storage location. This must be a single file.
   * For example: gs://example_bucket/example_file.pdf
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    if (sourceCase_ == 2) {
       return (com.google.cloud.translate.v3.GcsSource) source_;
    }
    return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object mimeType_ = "";
  /**
   * <pre>
   * Specifies the input document's mime_type.
   * If not specified it will be determined using the file extension for
   * gcs_source provided files. For a file provided through bytes content the
   * mime_type must be provided.
   * Currently supported mime types are:
   * - application/pdf
   * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   * </pre>
   *
   * <code>string mime_type = 4;</code>
   * @return The mimeType.
   */
  @java.lang.Override
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the input document's mime_type.
   * If not specified it will be determined using the file extension for
   * gcs_source provided files. For a file provided through bytes content the
   * mime_type must be provided.
   * Currently supported mime types are:
   * - application/pdf
   * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   * </pre>
   *
   * <code>string mime_type = 4;</code>
   * @return The bytes for mimeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mimeType_ = b;
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
    if (sourceCase_ == 1) {
      output.writeBytes(
          1, (com.google.protobuf.ByteString) source_);
    }
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.translate.v3.GcsSource) source_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, mimeType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            1, (com.google.protobuf.ByteString) source_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.translate.v3.GcsSource) source_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, mimeType_);
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
    if (!(obj instanceof com.google.cloud.translate.v3.DocumentInputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.DocumentInputConfig other = (com.google.cloud.translate.v3.DocumentInputConfig) obj;

    if (!getMimeType()
        .equals(other.getMimeType())) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getContent()
            .equals(other.getContent())) return false;
        break;
      case 2:
        if (!getGcsSource()
            .equals(other.getGcsSource())) return false;
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
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
        break;
      case 2:
        hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcsSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.DocumentInputConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.translate.v3.DocumentInputConfig prototype) {
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
   * A document translation request input config.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.DocumentInputConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.DocumentInputConfig)
      com.google.cloud.translate.v3.DocumentInputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_DocumentInputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_DocumentInputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.DocumentInputConfig.class, com.google.cloud.translate.v3.DocumentInputConfig.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.DocumentInputConfig.newBuilder()
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
      if (gcsSourceBuilder_ != null) {
        gcsSourceBuilder_.clear();
      }
      mimeType_ = "";
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_DocumentInputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DocumentInputConfig getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.DocumentInputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DocumentInputConfig build() {
      com.google.cloud.translate.v3.DocumentInputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DocumentInputConfig buildPartial() {
      com.google.cloud.translate.v3.DocumentInputConfig result = new com.google.cloud.translate.v3.DocumentInputConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.translate.v3.DocumentInputConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mimeType_ = mimeType_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.translate.v3.DocumentInputConfig result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
      if (sourceCase_ == 2 &&
          gcsSourceBuilder_ != null) {
        result.source_ = gcsSourceBuilder_.build();
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
      if (other instanceof com.google.cloud.translate.v3.DocumentInputConfig) {
        return mergeFrom((com.google.cloud.translate.v3.DocumentInputConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.DocumentInputConfig other) {
      if (other == com.google.cloud.translate.v3.DocumentInputConfig.getDefaultInstance()) return this;
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      switch (other.getSourceCase()) {
        case CONTENT: {
          setContent(other.getContent());
          break;
        }
        case GCS_SOURCE: {
          mergeGcsSource(other.getGcsSource());
          break;
        }
        case SOURCE_NOT_SET: {
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
            case 10: {
              source_ = input.readBytes();
              sourceCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getGcsSourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              sourceCase_ = 2;
              break;
            } // case 18
            case 34: {
              mimeType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * Document's content represented as a stream of bytes.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return sourceCase_ == 1;
    }
    /**
     * <pre>
     * Document's content represented as a stream of bytes.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     * @return The content.
     */
    public com.google.protobuf.ByteString getContent() {
      if (sourceCase_ == 1) {
        return (com.google.protobuf.ByteString) source_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Document's content represented as a stream of bytes.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      sourceCase_ = 1;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Document's content represented as a stream of bytes.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      if (sourceCase_ == 1) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.translate.v3.GcsSource, com.google.cloud.translate.v3.GcsSource.Builder, com.google.cloud.translate.v3.GcsSourceOrBuilder> gcsSourceBuilder_;
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     * @return Whether the gcsSource field is set.
     */
    @java.lang.Override
    public boolean hasGcsSource() {
      return sourceCase_ == 2;
    }
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     * @return The gcsSource.
     */
    @java.lang.Override
    public com.google.cloud.translate.v3.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.google.cloud.translate.v3.GcsSource) source_;
        }
        return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return gcsSourceBuilder_.getMessage();
        }
        return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     */
    public Builder setGcsSource(com.google.cloud.translate.v3.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     */
    public Builder setGcsSource(
        com.google.cloud.translate.v3.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.translate.v3.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 2 &&
            source_ != com.google.cloud.translate.v3.GcsSource.getDefaultInstance()) {
          source_ = com.google.cloud.translate.v3.GcsSource.newBuilder((com.google.cloud.translate.v3.GcsSource) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          gcsSourceBuilder_.mergeFrom(value);
        } else {
          gcsSourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsSourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     */
    public com.google.cloud.translate.v3.GcsSource.Builder getGcsSourceBuilder() {
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.translate.v3.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if ((sourceCase_ == 2) && (gcsSourceBuilder_ != null)) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.google.cloud.translate.v3.GcsSource) source_;
        }
        return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Google Cloud Storage location. This must be a single file.
     * For example: gs://example_bucket/example_file.pdf
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.translate.v3.GcsSource, com.google.cloud.translate.v3.GcsSource.Builder, com.google.cloud.translate.v3.GcsSourceOrBuilder> 
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
        }
        gcsSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.translate.v3.GcsSource, com.google.cloud.translate.v3.GcsSource.Builder, com.google.cloud.translate.v3.GcsSourceOrBuilder>(
                (com.google.cloud.translate.v3.GcsSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();
      return gcsSourceBuilder_;
    }

    private java.lang.Object mimeType_ = "";
    /**
     * <pre>
     * Specifies the input document's mime_type.
     * If not specified it will be determined using the file extension for
     * gcs_source provided files. For a file provided through bytes content the
     * mime_type must be provided.
     * Currently supported mime types are:
     * - application/pdf
     * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
     * - application/vnd.openxmlformats-officedocument.presentationml.presentation
     * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
     * </pre>
     *
     * <code>string mime_type = 4;</code>
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the input document's mime_type.
     * If not specified it will be determined using the file extension for
     * gcs_source provided files. For a file provided through bytes content the
     * mime_type must be provided.
     * Currently supported mime types are:
     * - application/pdf
     * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
     * - application/vnd.openxmlformats-officedocument.presentationml.presentation
     * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
     * </pre>
     *
     * <code>string mime_type = 4;</code>
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString
        getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the input document's mime_type.
     * If not specified it will be determined using the file extension for
     * gcs_source provided files. For a file provided through bytes content the
     * mime_type must be provided.
     * Currently supported mime types are:
     * - application/pdf
     * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
     * - application/vnd.openxmlformats-officedocument.presentationml.presentation
     * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
     * </pre>
     *
     * <code>string mime_type = 4;</code>
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      mimeType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the input document's mime_type.
     * If not specified it will be determined using the file extension for
     * gcs_source provided files. For a file provided through bytes content the
     * mime_type must be provided.
     * Currently supported mime types are:
     * - application/pdf
     * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
     * - application/vnd.openxmlformats-officedocument.presentationml.presentation
     * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
     * </pre>
     *
     * <code>string mime_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {
      mimeType_ = getDefaultInstance().getMimeType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the input document's mime_type.
     * If not specified it will be determined using the file extension for
     * gcs_source provided files. For a file provided through bytes content the
     * mime_type must be provided.
     * Currently supported mime types are:
     * - application/pdf
     * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
     * - application/vnd.openxmlformats-officedocument.presentationml.presentation
     * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
     * </pre>
     *
     * <code>string mime_type = 4;</code>
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      mimeType_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.DocumentInputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.DocumentInputConfig)
  private static final com.google.cloud.translate.v3.DocumentInputConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.DocumentInputConfig();
  }

  public static com.google.cloud.translate.v3.DocumentInputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentInputConfig>
      PARSER = new com.google.protobuf.AbstractParser<DocumentInputConfig>() {
    @java.lang.Override
    public DocumentInputConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentInputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentInputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.DocumentInputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

