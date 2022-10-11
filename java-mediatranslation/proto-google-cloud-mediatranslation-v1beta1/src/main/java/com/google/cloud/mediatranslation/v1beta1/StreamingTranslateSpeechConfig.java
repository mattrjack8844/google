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
// source: google/cloud/mediatranslation/v1beta1/media_translation.proto

package com.google.cloud.mediatranslation.v1beta1;

/**
 *
 *
 * <pre>
 * Config used for streaming translation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig}
 */
public final class StreamingTranslateSpeechConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig)
    StreamingTranslateSpeechConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamingTranslateSpeechConfig.newBuilder() to construct.
  private StreamingTranslateSpeechConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamingTranslateSpeechConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamingTranslateSpeechConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.mediatranslation.v1beta1.MediaTranslationProto
        .internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.mediatranslation.v1beta1.MediaTranslationProto
        .internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig.class,
            com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig.Builder.class);
  }

  public static final int AUDIO_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audioConfig_;
  /**
   *
   *
   * <pre>
   * Required. The common config for all the following audio contents.
   * </pre>
   *
   * <code>
   * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the audioConfig field is set.
   */
  @java.lang.Override
  public boolean hasAudioConfig() {
    return audioConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The common config for all the following audio contents.
   * </pre>
   *
   * <code>
   * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The audioConfig.
   */
  @java.lang.Override
  public com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig getAudioConfig() {
    return audioConfig_ == null
        ? com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.getDefaultInstance()
        : audioConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The common config for all the following audio contents.
   * </pre>
   *
   * <code>
   * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfigOrBuilder
      getAudioConfigOrBuilder() {
    return getAudioConfig();
  }

  public static final int SINGLE_UTTERANCE_FIELD_NUMBER = 2;
  private boolean singleUtterance_;
  /**
   *
   *
   * <pre>
   * Optional. If `false` or omitted, the system performs
   * continuous translation (continuing to wait for and process audio even if
   * the user pauses speaking) until the client closes the input stream (gRPC
   * API) or until the maximum time limit has been reached. May return multiple
   * `StreamingTranslateSpeechResult`s with the `is_final` flag set to `true`.
   * If `true`, the speech translator will detect a single spoken utterance.
   * When it detects that the user has paused or stopped speaking, it will
   * return an `END_OF_SINGLE_UTTERANCE` event and cease translation.
   * When the client receives 'END_OF_SINGLE_UTTERANCE' event, the client should
   * stop sending the requests. However, clients should keep receiving remaining
   * responses until the stream is terminated. To construct the complete
   * sentence in a streaming way, one should override (if 'is_final' of previous
   * response is false), or append (if 'is_final' of previous response is true).
   * </pre>
   *
   * <code>bool single_utterance = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The singleUtterance.
   */
  @java.lang.Override
  public boolean getSingleUtterance() {
    return singleUtterance_;
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
    if (audioConfig_ != null) {
      output.writeMessage(1, getAudioConfig());
    }
    if (singleUtterance_ != false) {
      output.writeBool(2, singleUtterance_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAudioConfig());
    }
    if (singleUtterance_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, singleUtterance_);
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
    if (!(obj
        instanceof com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig other =
        (com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig) obj;

    if (hasAudioConfig() != other.hasAudioConfig()) return false;
    if (hasAudioConfig()) {
      if (!getAudioConfig().equals(other.getAudioConfig())) return false;
    }
    if (getSingleUtterance() != other.getSingleUtterance()) return false;
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
    if (hasAudioConfig()) {
      hash = (37 * hash) + AUDIO_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAudioConfig().hashCode();
    }
    hash = (37 * hash) + SINGLE_UTTERANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSingleUtterance());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig parseFrom(
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
      com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig prototype) {
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
   * Config used for streaming translation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig)
      com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.mediatranslation.v1beta1.MediaTranslationProto
          .internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.mediatranslation.v1beta1.MediaTranslationProto
          .internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig.class,
              com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (audioConfigBuilder_ == null) {
        audioConfig_ = null;
      } else {
        audioConfig_ = null;
        audioConfigBuilder_ = null;
      }
      singleUtterance_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.mediatranslation.v1beta1.MediaTranslationProto
          .internal_static_google_cloud_mediatranslation_v1beta1_StreamingTranslateSpeechConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig
        getDefaultInstanceForType() {
      return com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig build() {
      com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig buildPartial() {
      com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig result =
          new com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig(this);
      if (audioConfigBuilder_ == null) {
        result.audioConfig_ = audioConfig_;
      } else {
        result.audioConfig_ = audioConfigBuilder_.build();
      }
      result.singleUtterance_ = singleUtterance_;
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
      if (other
          instanceof com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig) {
        return mergeFrom(
            (com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig other) {
      if (other
          == com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig
              .getDefaultInstance()) return this;
      if (other.hasAudioConfig()) {
        mergeAudioConfig(other.getAudioConfig());
      }
      if (other.getSingleUtterance() != false) {
        setSingleUtterance(other.getSingleUtterance());
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
                input.readMessage(getAudioConfigFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 16:
              {
                singleUtterance_ = input.readBool();

                break;
              } // case 16
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

    private com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audioConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig,
            com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.Builder,
            com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfigOrBuilder>
        audioConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the audioConfig field is set.
     */
    public boolean hasAudioConfig() {
      return audioConfigBuilder_ != null || audioConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The audioConfig.
     */
    public com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig getAudioConfig() {
      if (audioConfigBuilder_ == null) {
        return audioConfig_ == null
            ? com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.getDefaultInstance()
            : audioConfig_;
      } else {
        return audioConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAudioConfig(
        com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig value) {
      if (audioConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audioConfig_ = value;
        onChanged();
      } else {
        audioConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAudioConfig(
        com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.Builder builderForValue) {
      if (audioConfigBuilder_ == null) {
        audioConfig_ = builderForValue.build();
        onChanged();
      } else {
        audioConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAudioConfig(
        com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig value) {
      if (audioConfigBuilder_ == null) {
        if (audioConfig_ != null) {
          audioConfig_ =
              com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.newBuilder(
                      audioConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          audioConfig_ = value;
        }
        onChanged();
      } else {
        audioConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAudioConfig() {
      if (audioConfigBuilder_ == null) {
        audioConfig_ = null;
        onChanged();
      } else {
        audioConfig_ = null;
        audioConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.Builder
        getAudioConfigBuilder() {

      onChanged();
      return getAudioConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfigOrBuilder
        getAudioConfigOrBuilder() {
      if (audioConfigBuilder_ != null) {
        return audioConfigBuilder_.getMessageOrBuilder();
      } else {
        return audioConfig_ == null
            ? com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.getDefaultInstance()
            : audioConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The common config for all the following audio contents.
     * </pre>
     *
     * <code>
     * .google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig audio_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig,
            com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.Builder,
            com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfigOrBuilder>
        getAudioConfigFieldBuilder() {
      if (audioConfigBuilder_ == null) {
        audioConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig,
                com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig.Builder,
                com.google.cloud.mediatranslation.v1beta1.TranslateSpeechConfigOrBuilder>(
                getAudioConfig(), getParentForChildren(), isClean());
        audioConfig_ = null;
      }
      return audioConfigBuilder_;
    }

    private boolean singleUtterance_;
    /**
     *
     *
     * <pre>
     * Optional. If `false` or omitted, the system performs
     * continuous translation (continuing to wait for and process audio even if
     * the user pauses speaking) until the client closes the input stream (gRPC
     * API) or until the maximum time limit has been reached. May return multiple
     * `StreamingTranslateSpeechResult`s with the `is_final` flag set to `true`.
     * If `true`, the speech translator will detect a single spoken utterance.
     * When it detects that the user has paused or stopped speaking, it will
     * return an `END_OF_SINGLE_UTTERANCE` event and cease translation.
     * When the client receives 'END_OF_SINGLE_UTTERANCE' event, the client should
     * stop sending the requests. However, clients should keep receiving remaining
     * responses until the stream is terminated. To construct the complete
     * sentence in a streaming way, one should override (if 'is_final' of previous
     * response is false), or append (if 'is_final' of previous response is true).
     * </pre>
     *
     * <code>bool single_utterance = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The singleUtterance.
     */
    @java.lang.Override
    public boolean getSingleUtterance() {
      return singleUtterance_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If `false` or omitted, the system performs
     * continuous translation (continuing to wait for and process audio even if
     * the user pauses speaking) until the client closes the input stream (gRPC
     * API) or until the maximum time limit has been reached. May return multiple
     * `StreamingTranslateSpeechResult`s with the `is_final` flag set to `true`.
     * If `true`, the speech translator will detect a single spoken utterance.
     * When it detects that the user has paused or stopped speaking, it will
     * return an `END_OF_SINGLE_UTTERANCE` event and cease translation.
     * When the client receives 'END_OF_SINGLE_UTTERANCE' event, the client should
     * stop sending the requests. However, clients should keep receiving remaining
     * responses until the stream is terminated. To construct the complete
     * sentence in a streaming way, one should override (if 'is_final' of previous
     * response is false), or append (if 'is_final' of previous response is true).
     * </pre>
     *
     * <code>bool single_utterance = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The singleUtterance to set.
     * @return This builder for chaining.
     */
    public Builder setSingleUtterance(boolean value) {

      singleUtterance_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If `false` or omitted, the system performs
     * continuous translation (continuing to wait for and process audio even if
     * the user pauses speaking) until the client closes the input stream (gRPC
     * API) or until the maximum time limit has been reached. May return multiple
     * `StreamingTranslateSpeechResult`s with the `is_final` flag set to `true`.
     * If `true`, the speech translator will detect a single spoken utterance.
     * When it detects that the user has paused or stopped speaking, it will
     * return an `END_OF_SINGLE_UTTERANCE` event and cease translation.
     * When the client receives 'END_OF_SINGLE_UTTERANCE' event, the client should
     * stop sending the requests. However, clients should keep receiving remaining
     * responses until the stream is terminated. To construct the complete
     * sentence in a streaming way, one should override (if 'is_final' of previous
     * response is false), or append (if 'is_final' of previous response is true).
     * </pre>
     *
     * <code>bool single_utterance = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSingleUtterance() {

      singleUtterance_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig)
  private static final com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig();
  }

  public static com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingTranslateSpeechConfig> PARSER =
      new com.google.protobuf.AbstractParser<StreamingTranslateSpeechConfig>() {
        @java.lang.Override
        public StreamingTranslateSpeechConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamingTranslateSpeechConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingTranslateSpeechConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
