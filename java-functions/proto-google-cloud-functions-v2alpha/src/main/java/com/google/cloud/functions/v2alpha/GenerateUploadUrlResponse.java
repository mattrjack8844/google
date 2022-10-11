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
// source: google/cloud/functions/v2alpha/functions.proto

package com.google.cloud.functions.v2alpha;

/**
 *
 *
 * <pre>
 * Response of `GenerateSourceUploadUrl` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v2alpha.GenerateUploadUrlResponse}
 */
public final class GenerateUploadUrlResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v2alpha.GenerateUploadUrlResponse)
    GenerateUploadUrlResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateUploadUrlResponse.newBuilder() to construct.
  private GenerateUploadUrlResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateUploadUrlResponse() {
    uploadUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateUploadUrlResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.functions.v2alpha.FunctionsProto
        .internal_static_google_cloud_functions_v2alpha_GenerateUploadUrlResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v2alpha.FunctionsProto
        .internal_static_google_cloud_functions_v2alpha_GenerateUploadUrlResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse.class,
            com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse.Builder.class);
  }

  public static final int UPLOAD_URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object uploadUrl_;
  /**
   *
   *
   * <pre>
   * The generated Google Cloud Storage signed URL that should be used for a
   * function source code upload. The uploaded file should be a zip archive
   * which contains a function.
   * </pre>
   *
   * <code>string upload_url = 1;</code>
   *
   * @return The uploadUrl.
   */
  @java.lang.Override
  public java.lang.String getUploadUrl() {
    java.lang.Object ref = uploadUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uploadUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The generated Google Cloud Storage signed URL that should be used for a
   * function source code upload. The uploaded file should be a zip archive
   * which contains a function.
   * </pre>
   *
   * <code>string upload_url = 1;</code>
   *
   * @return The bytes for uploadUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUploadUrlBytes() {
    java.lang.Object ref = uploadUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uploadUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORAGE_SOURCE_FIELD_NUMBER = 2;
  private com.google.cloud.functions.v2alpha.StorageSource storageSource_;
  /**
   *
   *
   * <pre>
   * The location of the source code in the upload bucket.
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
   *
   * @return Whether the storageSource field is set.
   */
  @java.lang.Override
  public boolean hasStorageSource() {
    return storageSource_ != null;
  }
  /**
   *
   *
   * <pre>
   * The location of the source code in the upload bucket.
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
   *
   * @return The storageSource.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2alpha.StorageSource getStorageSource() {
    return storageSource_ == null
        ? com.google.cloud.functions.v2alpha.StorageSource.getDefaultInstance()
        : storageSource_;
  }
  /**
   *
   *
   * <pre>
   * The location of the source code in the upload bucket.
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.functions.v2alpha.StorageSourceOrBuilder getStorageSourceOrBuilder() {
    return getStorageSource();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uploadUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uploadUrl_);
    }
    if (storageSource_ != null) {
      output.writeMessage(2, getStorageSource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uploadUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uploadUrl_);
    }
    if (storageSource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStorageSource());
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
    if (!(obj instanceof com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse other =
        (com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse) obj;

    if (!getUploadUrl().equals(other.getUploadUrl())) return false;
    if (hasStorageSource() != other.hasStorageSource()) return false;
    if (hasStorageSource()) {
      if (!getStorageSource().equals(other.getStorageSource())) return false;
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
    hash = (37 * hash) + UPLOAD_URL_FIELD_NUMBER;
    hash = (53 * hash) + getUploadUrl().hashCode();
    if (hasStorageSource()) {
      hash = (37 * hash) + STORAGE_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getStorageSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse parseFrom(
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
      com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse prototype) {
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
   * Response of `GenerateSourceUploadUrl` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v2alpha.GenerateUploadUrlResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v2alpha.GenerateUploadUrlResponse)
      com.google.cloud.functions.v2alpha.GenerateUploadUrlResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.functions.v2alpha.FunctionsProto
          .internal_static_google_cloud_functions_v2alpha_GenerateUploadUrlResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v2alpha.FunctionsProto
          .internal_static_google_cloud_functions_v2alpha_GenerateUploadUrlResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse.class,
              com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse.Builder.class);
    }

    // Construct using com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      uploadUrl_ = "";

      if (storageSourceBuilder_ == null) {
        storageSource_ = null;
      } else {
        storageSource_ = null;
        storageSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.functions.v2alpha.FunctionsProto
          .internal_static_google_cloud_functions_v2alpha_GenerateUploadUrlResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse
        getDefaultInstanceForType() {
      return com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse build() {
      com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse buildPartial() {
      com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse result =
          new com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse(this);
      result.uploadUrl_ = uploadUrl_;
      if (storageSourceBuilder_ == null) {
        result.storageSource_ = storageSource_;
      } else {
        result.storageSource_ = storageSourceBuilder_.build();
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
      if (other instanceof com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse) {
        return mergeFrom((com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse other) {
      if (other
          == com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse.getDefaultInstance())
        return this;
      if (!other.getUploadUrl().isEmpty()) {
        uploadUrl_ = other.uploadUrl_;
        onChanged();
      }
      if (other.hasStorageSource()) {
        mergeStorageSource(other.getStorageSource());
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
                uploadUrl_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getStorageSourceFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object uploadUrl_ = "";
    /**
     *
     *
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     *
     * @return The uploadUrl.
     */
    public java.lang.String getUploadUrl() {
      java.lang.Object ref = uploadUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uploadUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     *
     * @return The bytes for uploadUrl.
     */
    public com.google.protobuf.ByteString getUploadUrlBytes() {
      java.lang.Object ref = uploadUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uploadUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     *
     * @param value The uploadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setUploadUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      uploadUrl_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUploadUrl() {

      uploadUrl_ = getDefaultInstance().getUploadUrl();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The generated Google Cloud Storage signed URL that should be used for a
     * function source code upload. The uploaded file should be a zip archive
     * which contains a function.
     * </pre>
     *
     * <code>string upload_url = 1;</code>
     *
     * @param value The bytes for uploadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setUploadUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      uploadUrl_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.functions.v2alpha.StorageSource storageSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2alpha.StorageSource,
            com.google.cloud.functions.v2alpha.StorageSource.Builder,
            com.google.cloud.functions.v2alpha.StorageSourceOrBuilder>
        storageSourceBuilder_;
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     *
     * @return Whether the storageSource field is set.
     */
    public boolean hasStorageSource() {
      return storageSourceBuilder_ != null || storageSource_ != null;
    }
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     *
     * @return The storageSource.
     */
    public com.google.cloud.functions.v2alpha.StorageSource getStorageSource() {
      if (storageSourceBuilder_ == null) {
        return storageSource_ == null
            ? com.google.cloud.functions.v2alpha.StorageSource.getDefaultInstance()
            : storageSource_;
      } else {
        return storageSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     */
    public Builder setStorageSource(com.google.cloud.functions.v2alpha.StorageSource value) {
      if (storageSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        storageSource_ = value;
        onChanged();
      } else {
        storageSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     */
    public Builder setStorageSource(
        com.google.cloud.functions.v2alpha.StorageSource.Builder builderForValue) {
      if (storageSourceBuilder_ == null) {
        storageSource_ = builderForValue.build();
        onChanged();
      } else {
        storageSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     */
    public Builder mergeStorageSource(com.google.cloud.functions.v2alpha.StorageSource value) {
      if (storageSourceBuilder_ == null) {
        if (storageSource_ != null) {
          storageSource_ =
              com.google.cloud.functions.v2alpha.StorageSource.newBuilder(storageSource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          storageSource_ = value;
        }
        onChanged();
      } else {
        storageSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     */
    public Builder clearStorageSource() {
      if (storageSourceBuilder_ == null) {
        storageSource_ = null;
        onChanged();
      } else {
        storageSource_ = null;
        storageSourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     */
    public com.google.cloud.functions.v2alpha.StorageSource.Builder getStorageSourceBuilder() {

      onChanged();
      return getStorageSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     */
    public com.google.cloud.functions.v2alpha.StorageSourceOrBuilder getStorageSourceOrBuilder() {
      if (storageSourceBuilder_ != null) {
        return storageSourceBuilder_.getMessageOrBuilder();
      } else {
        return storageSource_ == null
            ? com.google.cloud.functions.v2alpha.StorageSource.getDefaultInstance()
            : storageSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The location of the source code in the upload bucket.
     * Once the archive is uploaded using the `upload_url` use this field to
     * set the `function.build_config.source.storage_source`
     * during CreateFunction and UpdateFunction.
     * Generation defaults to 0, as Cloud Storage provides a new generation only
     * upon uploading a new object or version of an object.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2alpha.StorageSource,
            com.google.cloud.functions.v2alpha.StorageSource.Builder,
            com.google.cloud.functions.v2alpha.StorageSourceOrBuilder>
        getStorageSourceFieldBuilder() {
      if (storageSourceBuilder_ == null) {
        storageSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.functions.v2alpha.StorageSource,
                com.google.cloud.functions.v2alpha.StorageSource.Builder,
                com.google.cloud.functions.v2alpha.StorageSourceOrBuilder>(
                getStorageSource(), getParentForChildren(), isClean());
        storageSource_ = null;
      }
      return storageSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v2alpha.GenerateUploadUrlResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v2alpha.GenerateUploadUrlResponse)
  private static final com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse();
  }

  public static com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateUploadUrlResponse> PARSER =
      new com.google.protobuf.AbstractParser<GenerateUploadUrlResponse>() {
        @java.lang.Override
        public GenerateUploadUrlResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateUploadUrlResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateUploadUrlResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v2alpha.GenerateUploadUrlResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
