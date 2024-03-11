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
// source: google/cloud/aiplatform/v1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Metadata describes the input video content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.VideoMetadata}
 */
public final class VideoMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.VideoMetadata)
    VideoMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoMetadata.newBuilder() to construct.
  private VideoMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ContentProto
        .internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ContentProto
        .internal_static_google_cloud_aiplatform_v1_VideoMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.VideoMetadata.class,
            com.google.cloud.aiplatform.v1.VideoMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int START_OFFSET_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration startOffset_;
  /**
   *
   *
   * <pre>
   * Optional. The start offset of the video.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the startOffset field is set.
   */
  @java.lang.Override
  public boolean hasStartOffset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The start offset of the video.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The startOffset.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getStartOffset() {
    return startOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startOffset_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The start offset of the video.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getStartOffsetOrBuilder() {
    return startOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startOffset_;
  }

  public static final int END_OFFSET_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration endOffset_;
  /**
   *
   *
   * <pre>
   * Optional. The end offset of the video.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the endOffset field is set.
   */
  @java.lang.Override
  public boolean hasEndOffset() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The end offset of the video.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The endOffset.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getEndOffset() {
    return endOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endOffset_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The end offset of the video.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getEndOffsetOrBuilder() {
    return endOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endOffset_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getStartOffset());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getEndOffset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStartOffset());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEndOffset());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.VideoMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.VideoMetadata other =
        (com.google.cloud.aiplatform.v1.VideoMetadata) obj;

    if (hasStartOffset() != other.hasStartOffset()) return false;
    if (hasStartOffset()) {
      if (!getStartOffset().equals(other.getStartOffset())) return false;
    }
    if (hasEndOffset() != other.hasEndOffset()) return false;
    if (hasEndOffset()) {
      if (!getEndOffset().equals(other.getEndOffset())) return false;
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
    if (hasStartOffset()) {
      hash = (37 * hash) + START_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getStartOffset().hashCode();
    }
    if (hasEndOffset()) {
      hash = (37 * hash) + END_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getEndOffset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.VideoMetadata prototype) {
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
   * Metadata describes the input video content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.VideoMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.VideoMetadata)
      com.google.cloud.aiplatform.v1.VideoMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_VideoMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.VideoMetadata.class,
              com.google.cloud.aiplatform.v1.VideoMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.VideoMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getStartOffsetFieldBuilder();
        getEndOffsetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      startOffset_ = null;
      if (startOffsetBuilder_ != null) {
        startOffsetBuilder_.dispose();
        startOffsetBuilder_ = null;
      }
      endOffset_ = null;
      if (endOffsetBuilder_ != null) {
        endOffsetBuilder_.dispose();
        endOffsetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.VideoMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.VideoMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.VideoMetadata build() {
      com.google.cloud.aiplatform.v1.VideoMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.VideoMetadata buildPartial() {
      com.google.cloud.aiplatform.v1.VideoMetadata result =
          new com.google.cloud.aiplatform.v1.VideoMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.VideoMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startOffset_ =
            startOffsetBuilder_ == null ? startOffset_ : startOffsetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endOffset_ = endOffsetBuilder_ == null ? endOffset_ : endOffsetBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.aiplatform.v1.VideoMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1.VideoMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.VideoMetadata other) {
      if (other == com.google.cloud.aiplatform.v1.VideoMetadata.getDefaultInstance()) return this;
      if (other.hasStartOffset()) {
        mergeStartOffset(other.getStartOffset());
      }
      if (other.hasEndOffset()) {
        mergeEndOffset(other.getEndOffset());
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
                input.readMessage(getStartOffsetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEndOffsetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private com.google.protobuf.Duration startOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        startOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the startOffset field is set.
     */
    public boolean hasStartOffset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The startOffset.
     */
    public com.google.protobuf.Duration getStartOffset() {
      if (startOffsetBuilder_ == null) {
        return startOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : startOffset_;
      } else {
        return startOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setStartOffset(com.google.protobuf.Duration value) {
      if (startOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startOffset_ = value;
      } else {
        startOffsetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setStartOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (startOffsetBuilder_ == null) {
        startOffset_ = builderForValue.build();
      } else {
        startOffsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeStartOffset(com.google.protobuf.Duration value) {
      if (startOffsetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && startOffset_ != null
            && startOffset_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getStartOffsetBuilder().mergeFrom(value);
        } else {
          startOffset_ = value;
        }
      } else {
        startOffsetBuilder_.mergeFrom(value);
      }
      if (startOffset_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearStartOffset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startOffset_ = null;
      if (startOffsetBuilder_ != null) {
        startOffsetBuilder_.dispose();
        startOffsetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.Duration.Builder getStartOffsetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.DurationOrBuilder getStartOffsetOrBuilder() {
      if (startOffsetBuilder_ != null) {
        return startOffsetBuilder_.getMessageOrBuilder();
      } else {
        return startOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : startOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The start offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getStartOffsetFieldBuilder() {
      if (startOffsetBuilder_ == null) {
        startOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getStartOffset(), getParentForChildren(), isClean());
        startOffset_ = null;
      }
      return startOffsetBuilder_;
    }

    private com.google.protobuf.Duration endOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        endOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the endOffset field is set.
     */
    public boolean hasEndOffset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The endOffset.
     */
    public com.google.protobuf.Duration getEndOffset() {
      if (endOffsetBuilder_ == null) {
        return endOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endOffset_;
      } else {
        return endOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setEndOffset(com.google.protobuf.Duration value) {
      if (endOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endOffset_ = value;
      } else {
        endOffsetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setEndOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (endOffsetBuilder_ == null) {
        endOffset_ = builderForValue.build();
      } else {
        endOffsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeEndOffset(com.google.protobuf.Duration value) {
      if (endOffsetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && endOffset_ != null
            && endOffset_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getEndOffsetBuilder().mergeFrom(value);
        } else {
          endOffset_ = value;
        }
      } else {
        endOffsetBuilder_.mergeFrom(value);
      }
      if (endOffset_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearEndOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endOffset_ = null;
      if (endOffsetBuilder_ != null) {
        endOffsetBuilder_.dispose();
        endOffsetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.Duration.Builder getEndOffsetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.DurationOrBuilder getEndOffsetOrBuilder() {
      if (endOffsetBuilder_ != null) {
        return endOffsetBuilder_.getMessageOrBuilder();
      } else {
        return endOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The end offset of the video.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getEndOffsetFieldBuilder() {
      if (endOffsetBuilder_ == null) {
        endOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getEndOffset(), getParentForChildren(), isClean());
        endOffset_ = null;
      }
      return endOffsetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.VideoMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.VideoMetadata)
  private static final com.google.cloud.aiplatform.v1.VideoMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.VideoMetadata();
  }

  public static com.google.cloud.aiplatform.v1.VideoMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoMetadata> PARSER =
      new com.google.protobuf.AbstractParser<VideoMetadata>() {
        @java.lang.Override
        public VideoMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.VideoMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
