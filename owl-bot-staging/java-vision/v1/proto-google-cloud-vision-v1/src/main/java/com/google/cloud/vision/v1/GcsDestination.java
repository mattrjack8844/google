// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vision.v1;

/**
 * <pre>
 * The Google Cloud Storage location where the output will be written to.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.GcsDestination}
 */
public final class GcsDestination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.GcsDestination)
    GcsDestinationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsDestination.newBuilder() to construct.
  private GcsDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsDestination() {
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcsDestination();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_GcsDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_GcsDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.GcsDestination.class, com.google.cloud.vision.v1.GcsDestination.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * Google Cloud Storage URI prefix where the results will be stored. Results
   * will be in JSON format and preceded by its corresponding input URI prefix.
   * This field can either represent a gcs file prefix or gcs directory. In
   * either case, the uri should be unique because in order to get all of the
   * output files, you will need to do a wildcard gcs search on the uri prefix
   * you provide.
   *
   * Examples:
   *
   * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
   * will be created in gs://bucket-name/here/ and the names of the
   * output files will begin with "filenameprefix".
   *
   * *    Directory Prefix: gs://bucket-name/some/location/   The output files
   * will be created in gs://bucket-name/some/location/ and the names of the
   * output files could be anything because there was no filename prefix
   * specified.
   *
   * If multiple outputs, each response is still AnnotateFileResponse, each of
   * which contains some subset of the full list of AnnotateImageResponse.
   * Multiple outputs can happen if, for example, the output JSON is too large
   * and overflows into multiple sharded files.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Google Cloud Storage URI prefix where the results will be stored. Results
   * will be in JSON format and preceded by its corresponding input URI prefix.
   * This field can either represent a gcs file prefix or gcs directory. In
   * either case, the uri should be unique because in order to get all of the
   * output files, you will need to do a wildcard gcs search on the uri prefix
   * you provide.
   *
   * Examples:
   *
   * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
   * will be created in gs://bucket-name/here/ and the names of the
   * output files will begin with "filenameprefix".
   *
   * *    Directory Prefix: gs://bucket-name/some/location/   The output files
   * will be created in gs://bucket-name/some/location/ and the names of the
   * output files could be anything because there was no filename prefix
   * specified.
   *
   * If multiple outputs, each response is still AnnotateFileResponse, each of
   * which contains some subset of the full list of AnnotateImageResponse.
   * Multiple outputs can happen if, for example, the output JSON is too large
   * and overflows into multiple sharded files.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
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
    if (!(obj instanceof com.google.cloud.vision.v1.GcsDestination)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.GcsDestination other = (com.google.cloud.vision.v1.GcsDestination) obj;

    if (!getUri()
        .equals(other.getUri())) return false;
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
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.GcsDestination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.GcsDestination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.GcsDestination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.GcsDestination parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1.GcsDestination prototype) {
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
   * The Google Cloud Storage location where the output will be written to.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.GcsDestination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.GcsDestination)
      com.google.cloud.vision.v1.GcsDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_GcsDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_GcsDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.GcsDestination.class, com.google.cloud.vision.v1.GcsDestination.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.GcsDestination.newBuilder()
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
      uri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_GcsDestination_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.GcsDestination getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.GcsDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.GcsDestination build() {
      com.google.cloud.vision.v1.GcsDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.GcsDestination buildPartial() {
      com.google.cloud.vision.v1.GcsDestination result = new com.google.cloud.vision.v1.GcsDestination(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1.GcsDestination result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uri_ = uri_;
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
      if (other instanceof com.google.cloud.vision.v1.GcsDestination) {
        return mergeFrom((com.google.cloud.vision.v1.GcsDestination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.GcsDestination other) {
      if (other == com.google.cloud.vision.v1.GcsDestination.getDefaultInstance()) return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000001;
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
              uri_ = input.readStringRequireUtf8();
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

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     *
     * Examples:
     *
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     *
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     *
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     *
     * Examples:
     *
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     *
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     *
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     *
     * Examples:
     *
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     *
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     *
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     *
     * Examples:
     *
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     *
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     *
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     *
     * Examples:
     *
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     *
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     *
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.GcsDestination)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.GcsDestination)
  private static final com.google.cloud.vision.v1.GcsDestination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.GcsDestination();
  }

  public static com.google.cloud.vision.v1.GcsDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsDestination>
      PARSER = new com.google.protobuf.AbstractParser<GcsDestination>() {
    @java.lang.Override
    public GcsDestination parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.GcsDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

