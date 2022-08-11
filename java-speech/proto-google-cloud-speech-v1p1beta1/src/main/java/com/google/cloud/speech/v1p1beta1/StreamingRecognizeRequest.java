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
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

/**
 *
 *
 * <pre>
 * The top-level message sent by the client for the `StreamingRecognize` method.
 * Multiple `StreamingRecognizeRequest` messages are sent. The first message
 * must contain a `streaming_config` message and must not contain
 * `audio_content`. All subsequent messages must contain `audio_content` and
 * must not contain a `streaming_config` message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1p1beta1.StreamingRecognizeRequest}
 */
public final class StreamingRecognizeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1p1beta1.StreamingRecognizeRequest)
    StreamingRecognizeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamingRecognizeRequest.newBuilder() to construct.
  private StreamingRecognizeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamingRecognizeRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamingRecognizeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StreamingRecognizeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.Builder subBuilder =
                  null;
              if (streamingRequestCase_ == 1) {
                subBuilder =
                    ((com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig)
                            streamingRequest_)
                        .toBuilder();
              }
              streamingRequest_ =
                  input.readMessage(
                      com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig)
                        streamingRequest_);
                streamingRequest_ = subBuilder.buildPartial();
              }
              streamingRequestCase_ = 1;
              break;
            }
          case 18:
            {
              streamingRequest_ = input.readBytes();
              streamingRequestCase_ = 2;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto
        .internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto
        .internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest.class,
            com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest.Builder.class);
  }

  private int streamingRequestCase_ = 0;
  private java.lang.Object streamingRequest_;

  public enum StreamingRequestCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STREAMING_CONFIG(1),
    AUDIO_CONTENT(2),
    STREAMINGREQUEST_NOT_SET(0);
    private final int value;

    private StreamingRequestCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StreamingRequestCase valueOf(int value) {
      return forNumber(value);
    }

    public static StreamingRequestCase forNumber(int value) {
      switch (value) {
        case 1:
          return STREAMING_CONFIG;
        case 2:
          return AUDIO_CONTENT;
        case 0:
          return STREAMINGREQUEST_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public StreamingRequestCase getStreamingRequestCase() {
    return StreamingRequestCase.forNumber(streamingRequestCase_);
  }

  public static final int STREAMING_CONFIG_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
   *
   * @return Whether the streamingConfig field is set.
   */
  @java.lang.Override
  public boolean hasStreamingConfig() {
    return streamingRequestCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
   *
   * @return The streamingConfig.
   */
  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig getStreamingConfig() {
    if (streamingRequestCase_ == 1) {
      return (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig) streamingRequest_;
    }
    return com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfigOrBuilder
      getStreamingConfigOrBuilder() {
    if (streamingRequestCase_ == 1) {
      return (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig) streamingRequest_;
    }
    return com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.getDefaultInstance();
  }

  public static final int AUDIO_CONTENT_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `StreamingRecognizeRequest` messages. The first
   * `StreamingRecognizeRequest` message must not contain `audio_content` data
   * and all subsequent `StreamingRecognizeRequest` messages must contain
   * `audio_content` data. The audio bytes must be encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
   * pure binary representation (not base64). See
   * [content limits](https://cloud.google.com/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>bytes audio_content = 2;</code>
   *
   * @return Whether the audioContent field is set.
   */
  @java.lang.Override
  public boolean hasAudioContent() {
    return streamingRequestCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `StreamingRecognizeRequest` messages. The first
   * `StreamingRecognizeRequest` message must not contain `audio_content` data
   * and all subsequent `StreamingRecognizeRequest` messages must contain
   * `audio_content` data. The audio bytes must be encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
   * pure binary representation (not base64). See
   * [content limits](https://cloud.google.com/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>bytes audio_content = 2;</code>
   *
   * @return The audioContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudioContent() {
    if (streamingRequestCase_ == 2) {
      return (com.google.protobuf.ByteString) streamingRequest_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (streamingRequestCase_ == 1) {
      output.writeMessage(
          1, (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig) streamingRequest_);
    }
    if (streamingRequestCase_ == 2) {
      output.writeBytes(2, (com.google.protobuf.ByteString) streamingRequest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (streamingRequestCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig) streamingRequest_);
    }
    if (streamingRequestCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              2, (com.google.protobuf.ByteString) streamingRequest_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest other =
        (com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest) obj;

    if (!getStreamingRequestCase().equals(other.getStreamingRequestCase())) return false;
    switch (streamingRequestCase_) {
      case 1:
        if (!getStreamingConfig().equals(other.getStreamingConfig())) return false;
        break;
      case 2:
        if (!getAudioContent().equals(other.getAudioContent())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (streamingRequestCase_) {
      case 1:
        hash = (37 * hash) + STREAMING_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getStreamingConfig().hashCode();
        break;
      case 2:
        hash = (37 * hash) + AUDIO_CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getAudioContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parseFrom(
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
      com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest prototype) {
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
   * The top-level message sent by the client for the `StreamingRecognize` method.
   * Multiple `StreamingRecognizeRequest` messages are sent. The first message
   * must contain a `streaming_config` message and must not contain
   * `audio_content`. All subsequent messages must contain `audio_content` and
   * must not contain a `streaming_config` message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1p1beta1.StreamingRecognizeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1p1beta1.StreamingRecognizeRequest)
      com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest.class,
              com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      streamingRequestCase_ = 0;
      streamingRequest_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest getDefaultInstanceForType() {
      return com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest build() {
      com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest buildPartial() {
      com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest result =
          new com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest(this);
      if (streamingRequestCase_ == 1) {
        if (streamingConfigBuilder_ == null) {
          result.streamingRequest_ = streamingRequest_;
        } else {
          result.streamingRequest_ = streamingConfigBuilder_.build();
        }
      }
      if (streamingRequestCase_ == 2) {
        result.streamingRequest_ = streamingRequest_;
      }
      result.streamingRequestCase_ = streamingRequestCase_;
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
      if (other instanceof com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest) {
        return mergeFrom((com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest other) {
      if (other == com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest.getDefaultInstance())
        return this;
      switch (other.getStreamingRequestCase()) {
        case STREAMING_CONFIG:
          {
            mergeStreamingConfig(other.getStreamingConfig());
            break;
          }
        case AUDIO_CONTENT:
          {
            setAudioContent(other.getAudioContent());
            break;
          }
        case STREAMINGREQUEST_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int streamingRequestCase_ = 0;
    private java.lang.Object streamingRequest_;

    public StreamingRequestCase getStreamingRequestCase() {
      return StreamingRequestCase.forNumber(streamingRequestCase_);
    }

    public Builder clearStreamingRequest() {
      streamingRequestCase_ = 0;
      streamingRequest_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig,
            com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.Builder,
            com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfigOrBuilder>
        streamingConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     *
     * @return Whether the streamingConfig field is set.
     */
    @java.lang.Override
    public boolean hasStreamingConfig() {
      return streamingRequestCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     *
     * @return The streamingConfig.
     */
    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig getStreamingConfig() {
      if (streamingConfigBuilder_ == null) {
        if (streamingRequestCase_ == 1) {
          return (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig) streamingRequest_;
        }
        return com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.getDefaultInstance();
      } else {
        if (streamingRequestCase_ == 1) {
          return streamingConfigBuilder_.getMessage();
        }
        return com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     */
    public Builder setStreamingConfig(
        com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig value) {
      if (streamingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        streamingRequest_ = value;
        onChanged();
      } else {
        streamingConfigBuilder_.setMessage(value);
      }
      streamingRequestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     */
    public Builder setStreamingConfig(
        com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.Builder builderForValue) {
      if (streamingConfigBuilder_ == null) {
        streamingRequest_ = builderForValue.build();
        onChanged();
      } else {
        streamingConfigBuilder_.setMessage(builderForValue.build());
      }
      streamingRequestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     */
    public Builder mergeStreamingConfig(
        com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig value) {
      if (streamingConfigBuilder_ == null) {
        if (streamingRequestCase_ == 1
            && streamingRequest_
                != com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig
                    .getDefaultInstance()) {
          streamingRequest_ =
              com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.newBuilder(
                      (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig)
                          streamingRequest_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          streamingRequest_ = value;
        }
        onChanged();
      } else {
        if (streamingRequestCase_ == 1) {
          streamingConfigBuilder_.mergeFrom(value);
        } else {
          streamingConfigBuilder_.setMessage(value);
        }
      }
      streamingRequestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     */
    public Builder clearStreamingConfig() {
      if (streamingConfigBuilder_ == null) {
        if (streamingRequestCase_ == 1) {
          streamingRequestCase_ = 0;
          streamingRequest_ = null;
          onChanged();
        }
      } else {
        if (streamingRequestCase_ == 1) {
          streamingRequestCase_ = 0;
          streamingRequest_ = null;
        }
        streamingConfigBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     */
    public com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.Builder
        getStreamingConfigBuilder() {
      return getStreamingConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfigOrBuilder
        getStreamingConfigOrBuilder() {
      if ((streamingRequestCase_ == 1) && (streamingConfigBuilder_ != null)) {
        return streamingConfigBuilder_.getMessageOrBuilder();
      } else {
        if (streamingRequestCase_ == 1) {
          return (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig) streamingRequest_;
        }
        return com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Provides information to the recognizer that specifies how to process the
     * request. The first `StreamingRecognizeRequest` message must contain a
     * `streaming_config`  message.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig,
            com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.Builder,
            com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfigOrBuilder>
        getStreamingConfigFieldBuilder() {
      if (streamingConfigBuilder_ == null) {
        if (!(streamingRequestCase_ == 1)) {
          streamingRequest_ =
              com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.getDefaultInstance();
        }
        streamingConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig,
                com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig.Builder,
                com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfigOrBuilder>(
                (com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig) streamingRequest_,
                getParentForChildren(),
                isClean());
        streamingRequest_ = null;
      }
      streamingRequestCase_ = 1;
      onChanged();
      ;
      return streamingConfigBuilder_;
    }

    /**
     *
     *
     * <pre>
     * The audio data to be recognized. Sequential chunks of audio data are sent
     * in sequential `StreamingRecognizeRequest` messages. The first
     * `StreamingRecognizeRequest` message must not contain `audio_content` data
     * and all subsequent `StreamingRecognizeRequest` messages must contain
     * `audio_content` data. The audio bytes must be encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
     * pure binary representation (not base64). See
     * [content limits](https://cloud.google.com/speech-to-text/quotas#content).
     * </pre>
     *
     * <code>bytes audio_content = 2;</code>
     *
     * @return Whether the audioContent field is set.
     */
    public boolean hasAudioContent() {
      return streamingRequestCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The audio data to be recognized. Sequential chunks of audio data are sent
     * in sequential `StreamingRecognizeRequest` messages. The first
     * `StreamingRecognizeRequest` message must not contain `audio_content` data
     * and all subsequent `StreamingRecognizeRequest` messages must contain
     * `audio_content` data. The audio bytes must be encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
     * pure binary representation (not base64). See
     * [content limits](https://cloud.google.com/speech-to-text/quotas#content).
     * </pre>
     *
     * <code>bytes audio_content = 2;</code>
     *
     * @return The audioContent.
     */
    public com.google.protobuf.ByteString getAudioContent() {
      if (streamingRequestCase_ == 2) {
        return (com.google.protobuf.ByteString) streamingRequest_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * The audio data to be recognized. Sequential chunks of audio data are sent
     * in sequential `StreamingRecognizeRequest` messages. The first
     * `StreamingRecognizeRequest` message must not contain `audio_content` data
     * and all subsequent `StreamingRecognizeRequest` messages must contain
     * `audio_content` data. The audio bytes must be encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
     * pure binary representation (not base64). See
     * [content limits](https://cloud.google.com/speech-to-text/quotas#content).
     * </pre>
     *
     * <code>bytes audio_content = 2;</code>
     *
     * @param value The audioContent to set.
     * @return This builder for chaining.
     */
    public Builder setAudioContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      streamingRequestCase_ = 2;
      streamingRequest_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The audio data to be recognized. Sequential chunks of audio data are sent
     * in sequential `StreamingRecognizeRequest` messages. The first
     * `StreamingRecognizeRequest` message must not contain `audio_content` data
     * and all subsequent `StreamingRecognizeRequest` messages must contain
     * `audio_content` data. The audio bytes must be encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
     * pure binary representation (not base64). See
     * [content limits](https://cloud.google.com/speech-to-text/quotas#content).
     * </pre>
     *
     * <code>bytes audio_content = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAudioContent() {
      if (streamingRequestCase_ == 2) {
        streamingRequestCase_ = 0;
        streamingRequest_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1p1beta1.StreamingRecognizeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1p1beta1.StreamingRecognizeRequest)
  private static final com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest();
  }

  public static com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingRecognizeRequest> PARSER =
      new com.google.protobuf.AbstractParser<StreamingRecognizeRequest>() {
        @java.lang.Override
        public StreamingRecognizeRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StreamingRecognizeRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StreamingRecognizeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingRecognizeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
