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
// source: google/cloud/video/livestream/v1/resources.proto

package com.google.cloud.video.livestream.v1;

/**
 *
 *
 * <pre>
 * Properties of the audio stream.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.livestream.v1.AudioStreamProperty}
 */
public final class AudioStreamProperty extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.livestream.v1.AudioStreamProperty)
    AudioStreamPropertyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AudioStreamProperty.newBuilder() to construct.
  private AudioStreamProperty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AudioStreamProperty() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AudioStreamProperty();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_AudioStreamProperty_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_AudioStreamProperty_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.livestream.v1.AudioStreamProperty.class,
            com.google.cloud.video.livestream.v1.AudioStreamProperty.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private int index_;
  /**
   *
   *
   * <pre>
   * Index of this audio stream.
   * </pre>
   *
   * <code>int32 index = 1;</code>
   *
   * @return The index.
   */
  @java.lang.Override
  public int getIndex() {
    return index_;
  }

  public static final int AUDIO_FORMAT_FIELD_NUMBER = 2;
  private com.google.cloud.video.livestream.v1.AudioFormat audioFormat_;
  /**
   *
   *
   * <pre>
   * Properties of the audio format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
   *
   * @return Whether the audioFormat field is set.
   */
  @java.lang.Override
  public boolean hasAudioFormat() {
    return audioFormat_ != null;
  }
  /**
   *
   *
   * <pre>
   * Properties of the audio format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
   *
   * @return The audioFormat.
   */
  @java.lang.Override
  public com.google.cloud.video.livestream.v1.AudioFormat getAudioFormat() {
    return audioFormat_ == null
        ? com.google.cloud.video.livestream.v1.AudioFormat.getDefaultInstance()
        : audioFormat_;
  }
  /**
   *
   *
   * <pre>
   * Properties of the audio format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.livestream.v1.AudioFormatOrBuilder getAudioFormatOrBuilder() {
    return getAudioFormat();
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
    if (index_ != 0) {
      output.writeInt32(1, index_);
    }
    if (audioFormat_ != null) {
      output.writeMessage(2, getAudioFormat());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, index_);
    }
    if (audioFormat_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAudioFormat());
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
    if (!(obj instanceof com.google.cloud.video.livestream.v1.AudioStreamProperty)) {
      return super.equals(obj);
    }
    com.google.cloud.video.livestream.v1.AudioStreamProperty other =
        (com.google.cloud.video.livestream.v1.AudioStreamProperty) obj;

    if (getIndex() != other.getIndex()) return false;
    if (hasAudioFormat() != other.hasAudioFormat()) return false;
    if (hasAudioFormat()) {
      if (!getAudioFormat().equals(other.getAudioFormat())) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    if (hasAudioFormat()) {
      hash = (37 * hash) + AUDIO_FORMAT_FIELD_NUMBER;
      hash = (53 * hash) + getAudioFormat().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty parseFrom(
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
      com.google.cloud.video.livestream.v1.AudioStreamProperty prototype) {
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
   * Properties of the audio stream.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.livestream.v1.AudioStreamProperty}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.livestream.v1.AudioStreamProperty)
      com.google.cloud.video.livestream.v1.AudioStreamPropertyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_AudioStreamProperty_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_AudioStreamProperty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.livestream.v1.AudioStreamProperty.class,
              com.google.cloud.video.livestream.v1.AudioStreamProperty.Builder.class);
    }

    // Construct using com.google.cloud.video.livestream.v1.AudioStreamProperty.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      index_ = 0;

      if (audioFormatBuilder_ == null) {
        audioFormat_ = null;
      } else {
        audioFormat_ = null;
        audioFormatBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_AudioStreamProperty_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.AudioStreamProperty getDefaultInstanceForType() {
      return com.google.cloud.video.livestream.v1.AudioStreamProperty.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.AudioStreamProperty build() {
      com.google.cloud.video.livestream.v1.AudioStreamProperty result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.AudioStreamProperty buildPartial() {
      com.google.cloud.video.livestream.v1.AudioStreamProperty result =
          new com.google.cloud.video.livestream.v1.AudioStreamProperty(this);
      result.index_ = index_;
      if (audioFormatBuilder_ == null) {
        result.audioFormat_ = audioFormat_;
      } else {
        result.audioFormat_ = audioFormatBuilder_.build();
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
      if (other instanceof com.google.cloud.video.livestream.v1.AudioStreamProperty) {
        return mergeFrom((com.google.cloud.video.livestream.v1.AudioStreamProperty) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.livestream.v1.AudioStreamProperty other) {
      if (other == com.google.cloud.video.livestream.v1.AudioStreamProperty.getDefaultInstance())
        return this;
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.hasAudioFormat()) {
        mergeAudioFormat(other.getAudioFormat());
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
                index_ = input.readInt32();

                break;
              } // case 8
            case 18:
              {
                input.readMessage(getAudioFormatFieldBuilder().getBuilder(), extensionRegistry);

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

    private int index_;
    /**
     *
     *
     * <pre>
     * Index of this audio stream.
     * </pre>
     *
     * <code>int32 index = 1;</code>
     *
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }
    /**
     *
     *
     * <pre>
     * Index of this audio stream.
     * </pre>
     *
     * <code>int32 index = 1;</code>
     *
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {

      index_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Index of this audio stream.
     * </pre>
     *
     * <code>int32 index = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndex() {

      index_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.video.livestream.v1.AudioFormat audioFormat_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.livestream.v1.AudioFormat,
            com.google.cloud.video.livestream.v1.AudioFormat.Builder,
            com.google.cloud.video.livestream.v1.AudioFormatOrBuilder>
        audioFormatBuilder_;
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     *
     * @return Whether the audioFormat field is set.
     */
    public boolean hasAudioFormat() {
      return audioFormatBuilder_ != null || audioFormat_ != null;
    }
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     *
     * @return The audioFormat.
     */
    public com.google.cloud.video.livestream.v1.AudioFormat getAudioFormat() {
      if (audioFormatBuilder_ == null) {
        return audioFormat_ == null
            ? com.google.cloud.video.livestream.v1.AudioFormat.getDefaultInstance()
            : audioFormat_;
      } else {
        return audioFormatBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     */
    public Builder setAudioFormat(com.google.cloud.video.livestream.v1.AudioFormat value) {
      if (audioFormatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audioFormat_ = value;
        onChanged();
      } else {
        audioFormatBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     */
    public Builder setAudioFormat(
        com.google.cloud.video.livestream.v1.AudioFormat.Builder builderForValue) {
      if (audioFormatBuilder_ == null) {
        audioFormat_ = builderForValue.build();
        onChanged();
      } else {
        audioFormatBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     */
    public Builder mergeAudioFormat(com.google.cloud.video.livestream.v1.AudioFormat value) {
      if (audioFormatBuilder_ == null) {
        if (audioFormat_ != null) {
          audioFormat_ =
              com.google.cloud.video.livestream.v1.AudioFormat.newBuilder(audioFormat_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          audioFormat_ = value;
        }
        onChanged();
      } else {
        audioFormatBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     */
    public Builder clearAudioFormat() {
      if (audioFormatBuilder_ == null) {
        audioFormat_ = null;
        onChanged();
      } else {
        audioFormat_ = null;
        audioFormatBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     */
    public com.google.cloud.video.livestream.v1.AudioFormat.Builder getAudioFormatBuilder() {

      onChanged();
      return getAudioFormatFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     */
    public com.google.cloud.video.livestream.v1.AudioFormatOrBuilder getAudioFormatOrBuilder() {
      if (audioFormatBuilder_ != null) {
        return audioFormatBuilder_.getMessageOrBuilder();
      } else {
        return audioFormat_ == null
            ? com.google.cloud.video.livestream.v1.AudioFormat.getDefaultInstance()
            : audioFormat_;
      }
    }
    /**
     *
     *
     * <pre>
     * Properties of the audio format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.livestream.v1.AudioFormat,
            com.google.cloud.video.livestream.v1.AudioFormat.Builder,
            com.google.cloud.video.livestream.v1.AudioFormatOrBuilder>
        getAudioFormatFieldBuilder() {
      if (audioFormatBuilder_ == null) {
        audioFormatBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.video.livestream.v1.AudioFormat,
                com.google.cloud.video.livestream.v1.AudioFormat.Builder,
                com.google.cloud.video.livestream.v1.AudioFormatOrBuilder>(
                getAudioFormat(), getParentForChildren(), isClean());
        audioFormat_ = null;
      }
      return audioFormatBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.livestream.v1.AudioStreamProperty)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.livestream.v1.AudioStreamProperty)
  private static final com.google.cloud.video.livestream.v1.AudioStreamProperty DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.livestream.v1.AudioStreamProperty();
  }

  public static com.google.cloud.video.livestream.v1.AudioStreamProperty getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudioStreamProperty> PARSER =
      new com.google.protobuf.AbstractParser<AudioStreamProperty>() {
        @java.lang.Override
        public AudioStreamProperty parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudioStreamProperty> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudioStreamProperty> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.livestream.v1.AudioStreamProperty getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
