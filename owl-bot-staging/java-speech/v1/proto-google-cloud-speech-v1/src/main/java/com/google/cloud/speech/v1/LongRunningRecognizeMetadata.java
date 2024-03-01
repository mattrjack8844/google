// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.speech.v1;

/**
 * <pre>
 * Describes the progress of a long-running `LongRunningRecognize` call. It is
 * included in the `metadata` field of the `Operation` returned by the
 * `GetOperation` call of the `google::longrunning::Operations` service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.LongRunningRecognizeMetadata}
 */
public final class LongRunningRecognizeMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.LongRunningRecognizeMetadata)
    LongRunningRecognizeMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LongRunningRecognizeMetadata.newBuilder() to construct.
  private LongRunningRecognizeMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LongRunningRecognizeMetadata() {
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LongRunningRecognizeMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.LongRunningRecognizeMetadata.class, com.google.cloud.speech.v1.LongRunningRecognizeMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int PROGRESS_PERCENT_FIELD_NUMBER = 1;
  private int progressPercent_ = 0;
  /**
   * <pre>
   * Approximate percentage of audio processed thus far. Guaranteed to be 100
   * when the audio is fully processed and the results are available.
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   * @return The progressPercent.
   */
  @java.lang.Override
  public int getProgressPercent() {
    return progressPercent_;
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp startTime_;
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }

  public static final int LAST_UPDATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp lastUpdateTime_;
  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
   * @return Whether the lastUpdateTime field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdateTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
   * @return The lastUpdateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastUpdateTime() {
    return lastUpdateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdateTime_;
  }
  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder() {
    return lastUpdateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdateTime_;
  }

  public static final int URI_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * Output only. The URI of the audio file being transcribed. Empty if the
   * audio was sent as byte content.
   * </pre>
   *
   * <code>string uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. The URI of the audio file being transcribed. Empty if the
   * audio was sent as byte content.
   * </pre>
   *
   * <code>string uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
    if (progressPercent_ != 0) {
      output.writeInt32(1, progressPercent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getStartTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getLastUpdateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (progressPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, progressPercent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStartTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLastUpdateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uri_);
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
    if (!(obj instanceof com.google.cloud.speech.v1.LongRunningRecognizeMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.LongRunningRecognizeMetadata other = (com.google.cloud.speech.v1.LongRunningRecognizeMetadata) obj;

    if (getProgressPercent()
        != other.getProgressPercent()) return false;
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
    }
    if (hasLastUpdateTime() != other.hasLastUpdateTime()) return false;
    if (hasLastUpdateTime()) {
      if (!getLastUpdateTime()
          .equals(other.getLastUpdateTime())) return false;
    }
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
    hash = (37 * hash) + PROGRESS_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getProgressPercent();
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasLastUpdateTime()) {
      hash = (37 * hash) + LAST_UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdateTime().hashCode();
    }
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1.LongRunningRecognizeMetadata prototype) {
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
   * Describes the progress of a long-running `LongRunningRecognize` call. It is
   * included in the `metadata` field of the `Operation` returned by the
   * `GetOperation` call of the `google::longrunning::Operations` service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.LongRunningRecognizeMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.LongRunningRecognizeMetadata)
      com.google.cloud.speech.v1.LongRunningRecognizeMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.LongRunningRecognizeMetadata.class, com.google.cloud.speech.v1.LongRunningRecognizeMetadata.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.LongRunningRecognizeMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStartTimeFieldBuilder();
        getLastUpdateTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      progressPercent_ = 0;
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      lastUpdateTime_ = null;
      if (lastUpdateTimeBuilder_ != null) {
        lastUpdateTimeBuilder_.dispose();
        lastUpdateTimeBuilder_ = null;
      }
      uri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.LongRunningRecognizeMetadata getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.LongRunningRecognizeMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.LongRunningRecognizeMetadata build() {
      com.google.cloud.speech.v1.LongRunningRecognizeMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.LongRunningRecognizeMetadata buildPartial() {
      com.google.cloud.speech.v1.LongRunningRecognizeMetadata result = new com.google.cloud.speech.v1.LongRunningRecognizeMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v1.LongRunningRecognizeMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.progressPercent_ = progressPercent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startTime_ = startTimeBuilder_ == null
            ? startTime_
            : startTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lastUpdateTime_ = lastUpdateTimeBuilder_ == null
            ? lastUpdateTime_
            : lastUpdateTimeBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
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
      if (other instanceof com.google.cloud.speech.v1.LongRunningRecognizeMetadata) {
        return mergeFrom((com.google.cloud.speech.v1.LongRunningRecognizeMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.LongRunningRecognizeMetadata other) {
      if (other == com.google.cloud.speech.v1.LongRunningRecognizeMetadata.getDefaultInstance()) return this;
      if (other.getProgressPercent() != 0) {
        setProgressPercent(other.getProgressPercent());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasLastUpdateTime()) {
        mergeLastUpdateTime(other.getLastUpdateTime());
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000008;
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
            case 8: {
              progressPercent_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getStartTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getLastUpdateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
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
    private int bitField0_;

    private int progressPercent_ ;
    /**
     * <pre>
     * Approximate percentage of audio processed thus far. Guaranteed to be 100
     * when the audio is fully processed and the results are available.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     * @return The progressPercent.
     */
    @java.lang.Override
    public int getProgressPercent() {
      return progressPercent_;
    }
    /**
     * <pre>
     * Approximate percentage of audio processed thus far. Guaranteed to be 100
     * when the audio is fully processed and the results are available.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
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
     * <pre>
     * Approximate percentage of audio processed thus far. Guaranteed to be 100
     * when the audio is fully processed and the results are available.
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgressPercent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      progressPercent_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
      } else {
        startTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          startTime_ != null &&
          startTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartTimeBuilder().mergeFrom(value);
        } else {
          startTime_ = value;
        }
      } else {
        startTimeBuilder_.mergeFrom(value);
      }
      if (startTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp lastUpdateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastUpdateTimeBuilder_;
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     * @return Whether the lastUpdateTime field is set.
     */
    public boolean hasLastUpdateTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     * @return The lastUpdateTime.
     */
    public com.google.protobuf.Timestamp getLastUpdateTime() {
      if (lastUpdateTimeBuilder_ == null) {
        return lastUpdateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdateTime_;
      } else {
        return lastUpdateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public Builder setLastUpdateTime(com.google.protobuf.Timestamp value) {
      if (lastUpdateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdateTime_ = value;
      } else {
        lastUpdateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public Builder setLastUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTime_ = builderForValue.build();
      } else {
        lastUpdateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public Builder mergeLastUpdateTime(com.google.protobuf.Timestamp value) {
      if (lastUpdateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          lastUpdateTime_ != null &&
          lastUpdateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastUpdateTimeBuilder().mergeFrom(value);
        } else {
          lastUpdateTime_ = value;
        }
      } else {
        lastUpdateTimeBuilder_.mergeFrom(value);
      }
      if (lastUpdateTime_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public Builder clearLastUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lastUpdateTime_ = null;
      if (lastUpdateTimeBuilder_ != null) {
        lastUpdateTimeBuilder_.dispose();
        lastUpdateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastUpdateTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLastUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder() {
      if (lastUpdateTimeBuilder_ != null) {
        return lastUpdateTimeBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdateTime_;
      }
    }
    /**
     * <pre>
     * Time of the most recent processing update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_update_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastUpdateTimeFieldBuilder() {
      if (lastUpdateTimeBuilder_ == null) {
        lastUpdateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastUpdateTime(),
                getParentForChildren(),
                isClean());
        lastUpdateTime_ = null;
      }
      return lastUpdateTimeBuilder_;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * Output only. The URI of the audio file being transcribed. Empty if the
     * audio was sent as byte content.
     * </pre>
     *
     * <code>string uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The URI of the audio file being transcribed. Empty if the
     * audio was sent as byte content.
     * </pre>
     *
     * <code>string uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The URI of the audio file being transcribed. Empty if the
     * audio was sent as byte content.
     * </pre>
     *
     * <code>string uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The URI of the audio file being transcribed. Empty if the
     * audio was sent as byte content.
     * </pre>
     *
     * <code>string uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The URI of the audio file being transcribed. Empty if the
     * audio was sent as byte content.
     * </pre>
     *
     * <code>string uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.LongRunningRecognizeMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.LongRunningRecognizeMetadata)
  private static final com.google.cloud.speech.v1.LongRunningRecognizeMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.LongRunningRecognizeMetadata();
  }

  public static com.google.cloud.speech.v1.LongRunningRecognizeMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LongRunningRecognizeMetadata>
      PARSER = new com.google.protobuf.AbstractParser<LongRunningRecognizeMetadata>() {
    @java.lang.Override
    public LongRunningRecognizeMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<LongRunningRecognizeMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LongRunningRecognizeMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1.LongRunningRecognizeMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

