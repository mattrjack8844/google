/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v2;

/**
 *
 *
 * <pre>
 * Metadata about transcription for a single file (for example, progress
 * percent).
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata}
 */
public final class BatchRecognizeTranscriptionMetadata
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata)
    BatchRecognizeTranscriptionMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRecognizeTranscriptionMetadata.newBuilder() to construct.
  private BatchRecognizeTranscriptionMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRecognizeTranscriptionMetadata() {
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRecognizeTranscriptionMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_BatchRecognizeTranscriptionMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_BatchRecognizeTranscriptionMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata.class,
            com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int PROGRESS_PERCENT_FIELD_NUMBER = 1;
  private int progressPercent_ = 0;
  /**
   *
   *
   * <pre>
   * How much of the file has been transcribed so far.
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   *
   * @return The progressPercent.
   */
  @java.lang.Override
  public int getProgressPercent() {
    return progressPercent_;
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private com.google.rpc.Status error_;
  /**
   *
   *
   * <pre>
   * Error if one was encountered.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   *
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Error if one was encountered.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public com.google.rpc.Status getError() {
    return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
  }
  /**
   *
   *
   * <pre>
   * Error if one was encountered.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
  }

  public static final int URI_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   *
   *
   * <pre>
   * The Cloud Storage URI to which recognition results will be written.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The Cloud Storage URI to which recognition results will be written.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (progressPercent_ != 0) {
      output.writeInt32(1, progressPercent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getError());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (progressPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, progressPercent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getError());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uri_);
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
    if (!(obj instanceof com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata other =
        (com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata) obj;

    if (getProgressPercent() != other.getProgressPercent()) return false;
    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError().equals(other.getError())) return false;
    }
    if (!getUri().equals(other.getUri())) return false;
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
    hash = (37 * hash) + PROGRESS_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getProgressPercent();
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata parseFrom(
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
      com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata prototype) {
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
   * Metadata about transcription for a single file (for example, progress
   * percent).
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata)
      com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_BatchRecognizeTranscriptionMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_BatchRecognizeTranscriptionMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata.class,
              com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getErrorFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      progressPercent_ = 0;
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      uri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_BatchRecognizeTranscriptionMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata build() {
      com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata buildPartial() {
      com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata result =
          new com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.progressPercent_ = progressPercent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.error_ = errorBuilder_ == null ? error_ : errorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uri_ = uri_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata) {
        return mergeFrom((com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata other) {
      if (other
          == com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata.getDefaultInstance())
        return this;
      if (other.getProgressPercent() != 0) {
        setProgressPercent(other.getProgressPercent());
      }
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000004;
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
            case 8:
              {
                progressPercent_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getErrorFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                uri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private int bitField0_;

    private int progressPercent_;
    /**
     *
     *
     * <pre>
     * How much of the file has been transcribed so far.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     *
     * @return The progressPercent.
     */
    @java.lang.Override
    public int getProgressPercent() {
      return progressPercent_;
    }
    /**
     *
     *
     * <pre>
     * How much of the file has been transcribed so far.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     *
     * @param value The progressPercent to set.
     * @return This builder for chaining.
     */
    public Builder setProgressPercent(int value) {

      progressPercent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How much of the file has been transcribed so far.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProgressPercent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      progressPercent_ = 0;
      onChanged();
      return this;
    }

    private com.google.rpc.Status error_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        errorBuilder_;
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     *
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     *
     * @return The error.
     */
    public com.google.rpc.Status getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public Builder setError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public Builder setError(com.google.rpc.Status.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public Builder mergeError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && error_ != null
            && error_ != com.google.rpc.Status.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      if (error_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000002);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public com.google.rpc.Status.Builder getErrorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
      }
    }
    /**
     *
     *
     * <pre>
     * Error if one was encountered.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(getError(), getParentForChildren(), isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * The Cloud Storage URI to which recognition results will be written.
     * </pre>
     *
     * <code>string uri = 3;</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage URI to which recognition results will be written.
     * </pre>
     *
     * <code>string uri = 3;</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage URI to which recognition results will be written.
     * </pre>
     *
     * <code>string uri = 3;</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage URI to which recognition results will be written.
     * </pre>
     *
     * <code>string uri = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage URI to which recognition results will be written.
     * </pre>
     *
     * <code>string uri = 3;</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata)
  private static final com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata();
  }

  public static com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRecognizeTranscriptionMetadata> PARSER =
      new com.google.protobuf.AbstractParser<BatchRecognizeTranscriptionMetadata>() {
        @java.lang.Override
        public BatchRecognizeTranscriptionMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchRecognizeTranscriptionMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRecognizeTranscriptionMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
