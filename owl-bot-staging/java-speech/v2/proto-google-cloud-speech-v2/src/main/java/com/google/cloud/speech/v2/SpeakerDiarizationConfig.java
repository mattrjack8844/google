// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 * <pre>
 * Configuration to enable speaker diarization.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.SpeakerDiarizationConfig}
 */
public final class SpeakerDiarizationConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.SpeakerDiarizationConfig)
    SpeakerDiarizationConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpeakerDiarizationConfig.newBuilder() to construct.
  private SpeakerDiarizationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeakerDiarizationConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpeakerDiarizationConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_SpeakerDiarizationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_SpeakerDiarizationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.SpeakerDiarizationConfig.class, com.google.cloud.speech.v2.SpeakerDiarizationConfig.Builder.class);
  }

  public static final int MIN_SPEAKER_COUNT_FIELD_NUMBER = 2;
  private int minSpeakerCount_ = 0;
  /**
   * <pre>
   * Required. Minimum number of speakers in the conversation. This range gives
   * you more flexibility by allowing the system to automatically determine the
   * correct number of speakers. If not set, the default value is 2.
   * To fix the number of speakers detected in the audio, set
   * `min_speaker_count` = `max_speaker_count`.
   * </pre>
   *
   * <code>int32 min_speaker_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The minSpeakerCount.
   */
  @java.lang.Override
  public int getMinSpeakerCount() {
    return minSpeakerCount_;
  }

  public static final int MAX_SPEAKER_COUNT_FIELD_NUMBER = 3;
  private int maxSpeakerCount_ = 0;
  /**
   * <pre>
   * Required. Maximum number of speakers in the conversation. Valid values are:
   * 1-6. Must be &gt;= `min_speaker_count`. This range gives you more flexibility
   * by allowing the system to automatically determine the correct number of
   * speakers.
   * </pre>
   *
   * <code>int32 max_speaker_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The maxSpeakerCount.
   */
  @java.lang.Override
  public int getMaxSpeakerCount() {
    return maxSpeakerCount_;
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
    if (minSpeakerCount_ != 0) {
      output.writeInt32(2, minSpeakerCount_);
    }
    if (maxSpeakerCount_ != 0) {
      output.writeInt32(3, maxSpeakerCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minSpeakerCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minSpeakerCount_);
    }
    if (maxSpeakerCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxSpeakerCount_);
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
    if (!(obj instanceof com.google.cloud.speech.v2.SpeakerDiarizationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.SpeakerDiarizationConfig other = (com.google.cloud.speech.v2.SpeakerDiarizationConfig) obj;

    if (getMinSpeakerCount()
        != other.getMinSpeakerCount()) return false;
    if (getMaxSpeakerCount()
        != other.getMaxSpeakerCount()) return false;
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
    hash = (37 * hash) + MIN_SPEAKER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinSpeakerCount();
    hash = (37 * hash) + MAX_SPEAKER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxSpeakerCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v2.SpeakerDiarizationConfig prototype) {
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
   * Configuration to enable speaker diarization.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.SpeakerDiarizationConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.SpeakerDiarizationConfig)
      com.google.cloud.speech.v2.SpeakerDiarizationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_SpeakerDiarizationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_SpeakerDiarizationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.SpeakerDiarizationConfig.class, com.google.cloud.speech.v2.SpeakerDiarizationConfig.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.SpeakerDiarizationConfig.newBuilder()
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
      minSpeakerCount_ = 0;
      maxSpeakerCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_SpeakerDiarizationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.SpeakerDiarizationConfig getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.SpeakerDiarizationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.SpeakerDiarizationConfig build() {
      com.google.cloud.speech.v2.SpeakerDiarizationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.SpeakerDiarizationConfig buildPartial() {
      com.google.cloud.speech.v2.SpeakerDiarizationConfig result = new com.google.cloud.speech.v2.SpeakerDiarizationConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v2.SpeakerDiarizationConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minSpeakerCount_ = minSpeakerCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxSpeakerCount_ = maxSpeakerCount_;
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
      if (other instanceof com.google.cloud.speech.v2.SpeakerDiarizationConfig) {
        return mergeFrom((com.google.cloud.speech.v2.SpeakerDiarizationConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.SpeakerDiarizationConfig other) {
      if (other == com.google.cloud.speech.v2.SpeakerDiarizationConfig.getDefaultInstance()) return this;
      if (other.getMinSpeakerCount() != 0) {
        setMinSpeakerCount(other.getMinSpeakerCount());
      }
      if (other.getMaxSpeakerCount() != 0) {
        setMaxSpeakerCount(other.getMaxSpeakerCount());
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
            case 16: {
              minSpeakerCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 24: {
              maxSpeakerCount_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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

    private int minSpeakerCount_ ;
    /**
     * <pre>
     * Required. Minimum number of speakers in the conversation. This range gives
     * you more flexibility by allowing the system to automatically determine the
     * correct number of speakers. If not set, the default value is 2.
     * To fix the number of speakers detected in the audio, set
     * `min_speaker_count` = `max_speaker_count`.
     * </pre>
     *
     * <code>int32 min_speaker_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The minSpeakerCount.
     */
    @java.lang.Override
    public int getMinSpeakerCount() {
      return minSpeakerCount_;
    }
    /**
     * <pre>
     * Required. Minimum number of speakers in the conversation. This range gives
     * you more flexibility by allowing the system to automatically determine the
     * correct number of speakers. If not set, the default value is 2.
     * To fix the number of speakers detected in the audio, set
     * `min_speaker_count` = `max_speaker_count`.
     * </pre>
     *
     * <code>int32 min_speaker_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The minSpeakerCount to set.
     * @return This builder for chaining.
     */
    public Builder setMinSpeakerCount(int value) {
      
      minSpeakerCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Minimum number of speakers in the conversation. This range gives
     * you more flexibility by allowing the system to automatically determine the
     * correct number of speakers. If not set, the default value is 2.
     * To fix the number of speakers detected in the audio, set
     * `min_speaker_count` = `max_speaker_count`.
     * </pre>
     *
     * <code>int32 min_speaker_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinSpeakerCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minSpeakerCount_ = 0;
      onChanged();
      return this;
    }

    private int maxSpeakerCount_ ;
    /**
     * <pre>
     * Required. Maximum number of speakers in the conversation. Valid values are:
     * 1-6. Must be &gt;= `min_speaker_count`. This range gives you more flexibility
     * by allowing the system to automatically determine the correct number of
     * speakers.
     * </pre>
     *
     * <code>int32 max_speaker_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The maxSpeakerCount.
     */
    @java.lang.Override
    public int getMaxSpeakerCount() {
      return maxSpeakerCount_;
    }
    /**
     * <pre>
     * Required. Maximum number of speakers in the conversation. Valid values are:
     * 1-6. Must be &gt;= `min_speaker_count`. This range gives you more flexibility
     * by allowing the system to automatically determine the correct number of
     * speakers.
     * </pre>
     *
     * <code>int32 max_speaker_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The maxSpeakerCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSpeakerCount(int value) {
      
      maxSpeakerCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Maximum number of speakers in the conversation. Valid values are:
     * 1-6. Must be &gt;= `min_speaker_count`. This range gives you more flexibility
     * by allowing the system to automatically determine the correct number of
     * speakers.
     * </pre>
     *
     * <code>int32 max_speaker_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxSpeakerCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxSpeakerCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.SpeakerDiarizationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.SpeakerDiarizationConfig)
  private static final com.google.cloud.speech.v2.SpeakerDiarizationConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.SpeakerDiarizationConfig();
  }

  public static com.google.cloud.speech.v2.SpeakerDiarizationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeakerDiarizationConfig>
      PARSER = new com.google.protobuf.AbstractParser<SpeakerDiarizationConfig>() {
    @java.lang.Override
    public SpeakerDiarizationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpeakerDiarizationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeakerDiarizationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.SpeakerDiarizationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

