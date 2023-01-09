// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1beta1/image_versions.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

/**
 * <pre>
 * The ImageVersions in a project and location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse}
 */
public final class ListImageVersionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse)
    ListImageVersionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListImageVersionsResponse.newBuilder() to construct.
  private ListImageVersionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListImageVersionsResponse() {
    imageVersions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListImageVersionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse.class, com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse.Builder.class);
  }

  public static final int IMAGE_VERSIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion> imageVersions_;
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion> getImageVersionsList() {
    return imageVersions_;
  }
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder> 
      getImageVersionsOrBuilderList() {
    return imageVersions_;
  }
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  @java.lang.Override
  public int getImageVersionsCount() {
    return imageVersions_.size();
  }
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion getImageVersions(int index) {
    return imageVersions_.get(index);
  }
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder getImageVersionsOrBuilder(
      int index) {
    return imageVersions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The page token used to query for the next page if one exists.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The page token used to query for the next page if one exists.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < imageVersions_.size(); i++) {
      output.writeMessage(1, imageVersions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < imageVersions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, imageVersions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse other = (com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse) obj;

    if (!getImageVersionsList()
        .equals(other.getImageVersionsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getImageVersionsCount() > 0) {
      hash = (37 * hash) + IMAGE_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getImageVersionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse prototype) {
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
   * The ImageVersions in a project and location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse)
      com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse.class, com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (imageVersionsBuilder_ == null) {
        imageVersions_ = java.util.Collections.emptyList();
      } else {
        imageVersions_ = null;
        imageVersionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_ListImageVersionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse build() {
      com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse result = new com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (imageVersionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          imageVersions_ = java.util.Collections.unmodifiableList(imageVersions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.imageVersions_ = imageVersions_;
      } else {
        result.imageVersions_ = imageVersionsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse) {
        return mergeFrom((com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse other) {
      if (other == com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse.getDefaultInstance()) return this;
      if (imageVersionsBuilder_ == null) {
        if (!other.imageVersions_.isEmpty()) {
          if (imageVersions_.isEmpty()) {
            imageVersions_ = other.imageVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureImageVersionsIsMutable();
            imageVersions_.addAll(other.imageVersions_);
          }
          onChanged();
        }
      } else {
        if (!other.imageVersions_.isEmpty()) {
          if (imageVersionsBuilder_.isEmpty()) {
            imageVersionsBuilder_.dispose();
            imageVersionsBuilder_ = null;
            imageVersions_ = other.imageVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            imageVersionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getImageVersionsFieldBuilder() : null;
          } else {
            imageVersionsBuilder_.addAllMessages(other.imageVersions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
              com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion m =
                  input.readMessage(
                      com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.parser(),
                      extensionRegistry);
              if (imageVersionsBuilder_ == null) {
                ensureImageVersionsIsMutable();
                imageVersions_.add(m);
              } else {
                imageVersionsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion> imageVersions_ =
      java.util.Collections.emptyList();
    private void ensureImageVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        imageVersions_ = new java.util.ArrayList<com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion>(imageVersions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder> imageVersionsBuilder_;

    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public java.util.List<com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion> getImageVersionsList() {
      if (imageVersionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(imageVersions_);
      } else {
        return imageVersionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public int getImageVersionsCount() {
      if (imageVersionsBuilder_ == null) {
        return imageVersions_.size();
      } else {
        return imageVersionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion getImageVersions(int index) {
      if (imageVersionsBuilder_ == null) {
        return imageVersions_.get(index);
      } else {
        return imageVersionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder setImageVersions(
        int index, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion value) {
      if (imageVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImageVersionsIsMutable();
        imageVersions_.set(index, value);
        onChanged();
      } else {
        imageVersionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder setImageVersions(
        int index, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder builderForValue) {
      if (imageVersionsBuilder_ == null) {
        ensureImageVersionsIsMutable();
        imageVersions_.set(index, builderForValue.build());
        onChanged();
      } else {
        imageVersionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder addImageVersions(com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion value) {
      if (imageVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImageVersionsIsMutable();
        imageVersions_.add(value);
        onChanged();
      } else {
        imageVersionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder addImageVersions(
        int index, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion value) {
      if (imageVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImageVersionsIsMutable();
        imageVersions_.add(index, value);
        onChanged();
      } else {
        imageVersionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder addImageVersions(
        com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder builderForValue) {
      if (imageVersionsBuilder_ == null) {
        ensureImageVersionsIsMutable();
        imageVersions_.add(builderForValue.build());
        onChanged();
      } else {
        imageVersionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder addImageVersions(
        int index, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder builderForValue) {
      if (imageVersionsBuilder_ == null) {
        ensureImageVersionsIsMutable();
        imageVersions_.add(index, builderForValue.build());
        onChanged();
      } else {
        imageVersionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder addAllImageVersions(
        java.lang.Iterable<? extends com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion> values) {
      if (imageVersionsBuilder_ == null) {
        ensureImageVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, imageVersions_);
        onChanged();
      } else {
        imageVersionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder clearImageVersions() {
      if (imageVersionsBuilder_ == null) {
        imageVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        imageVersionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public Builder removeImageVersions(int index) {
      if (imageVersionsBuilder_ == null) {
        ensureImageVersionsIsMutable();
        imageVersions_.remove(index);
        onChanged();
      } else {
        imageVersionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder getImageVersionsBuilder(
        int index) {
      return getImageVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder getImageVersionsOrBuilder(
        int index) {
      if (imageVersionsBuilder_ == null) {
        return imageVersions_.get(index);  } else {
        return imageVersionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder> 
         getImageVersionsOrBuilderList() {
      if (imageVersionsBuilder_ != null) {
        return imageVersionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(imageVersions_);
      }
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder addImageVersionsBuilder() {
      return getImageVersionsFieldBuilder().addBuilder(
          com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder addImageVersionsBuilder(
        int index) {
      return getImageVersionsFieldBuilder().addBuilder(
          index, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of supported ImageVersions in a location.
     * </pre>
     *
     * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
     */
    public java.util.List<com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder> 
         getImageVersionsBuilderList() {
      return getImageVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder> 
        getImageVersionsFieldBuilder() {
      if (imageVersionsBuilder_ == null) {
        imageVersionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion.Builder, com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder>(
                imageVersions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        imageVersions_ = null;
      }
      return imageVersionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The page token used to query for the next page if one exists.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The page token used to query for the next page if one exists.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The page token used to query for the next page if one exists.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The page token used to query for the next page if one exists.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The page token used to query for the next page if one exists.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse)
  private static final com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse();
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListImageVersionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListImageVersionsResponse>() {
    @java.lang.Override
    public ListImageVersionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListImageVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListImageVersionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

