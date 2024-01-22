// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 * <pre>
 * Request message for the
 * [UpdateRecognizer][google.cloud.speech.v2.Speech.UpdateRecognizer] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.UpdateRecognizerRequest}
 */
public final class UpdateRecognizerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.UpdateRecognizerRequest)
    UpdateRecognizerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateRecognizerRequest.newBuilder() to construct.
  private UpdateRecognizerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateRecognizerRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateRecognizerRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_UpdateRecognizerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_UpdateRecognizerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.UpdateRecognizerRequest.class, com.google.cloud.speech.v2.UpdateRecognizerRequest.Builder.class);
  }

  public static final int RECOGNIZER_FIELD_NUMBER = 1;
  private com.google.cloud.speech.v2.Recognizer recognizer_;
  /**
   * <pre>
   * Required. The Recognizer to update.
   *
   * The Recognizer's `name` field is used to identify the Recognizer to update.
   * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the recognizer field is set.
   */
  @java.lang.Override
  public boolean hasRecognizer() {
    return recognizer_ != null;
  }
  /**
   * <pre>
   * Required. The Recognizer to update.
   *
   * The Recognizer's `name` field is used to identify the Recognizer to update.
   * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The recognizer.
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.Recognizer getRecognizer() {
    return recognizer_ == null ? com.google.cloud.speech.v2.Recognizer.getDefaultInstance() : recognizer_;
  }
  /**
   * <pre>
   * Required. The Recognizer to update.
   *
   * The Recognizer's `name` field is used to identify the Recognizer to update.
   * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.RecognizerOrBuilder getRecognizerOrBuilder() {
    return recognizer_ == null ? com.google.cloud.speech.v2.Recognizer.getDefaultInstance() : recognizer_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire Recognizer resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire Recognizer resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire Recognizer resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * If set, validate the request and preview the updated Recognizer, but do not
   * actually update it.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (recognizer_ != null) {
      output.writeMessage(1, getRecognizer());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recognizer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecognizer());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.speech.v2.UpdateRecognizerRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.UpdateRecognizerRequest other = (com.google.cloud.speech.v2.UpdateRecognizerRequest) obj;

    if (hasRecognizer() != other.hasRecognizer()) return false;
    if (hasRecognizer()) {
      if (!getRecognizer()
          .equals(other.getRecognizer())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    if (hasRecognizer()) {
      hash = (37 * hash) + RECOGNIZER_FIELD_NUMBER;
      hash = (53 * hash) + getRecognizer().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.UpdateRecognizerRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v2.UpdateRecognizerRequest prototype) {
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
   * Request message for the
   * [UpdateRecognizer][google.cloud.speech.v2.Speech.UpdateRecognizer] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.UpdateRecognizerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.UpdateRecognizerRequest)
      com.google.cloud.speech.v2.UpdateRecognizerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_UpdateRecognizerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_UpdateRecognizerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.UpdateRecognizerRequest.class, com.google.cloud.speech.v2.UpdateRecognizerRequest.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.UpdateRecognizerRequest.newBuilder()
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
      recognizer_ = null;
      if (recognizerBuilder_ != null) {
        recognizerBuilder_.dispose();
        recognizerBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_UpdateRecognizerRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.UpdateRecognizerRequest getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.UpdateRecognizerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.UpdateRecognizerRequest build() {
      com.google.cloud.speech.v2.UpdateRecognizerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.UpdateRecognizerRequest buildPartial() {
      com.google.cloud.speech.v2.UpdateRecognizerRequest result = new com.google.cloud.speech.v2.UpdateRecognizerRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v2.UpdateRecognizerRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recognizer_ = recognizerBuilder_ == null
            ? recognizer_
            : recognizerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.speech.v2.UpdateRecognizerRequest) {
        return mergeFrom((com.google.cloud.speech.v2.UpdateRecognizerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.UpdateRecognizerRequest other) {
      if (other == com.google.cloud.speech.v2.UpdateRecognizerRequest.getDefaultInstance()) return this;
      if (other.hasRecognizer()) {
        mergeRecognizer(other.getRecognizer());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
              input.readMessage(
                  getRecognizerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 32: {
              validateOnly_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
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

    private com.google.cloud.speech.v2.Recognizer recognizer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v2.Recognizer, com.google.cloud.speech.v2.Recognizer.Builder, com.google.cloud.speech.v2.RecognizerOrBuilder> recognizerBuilder_;
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the recognizer field is set.
     */
    public boolean hasRecognizer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The recognizer.
     */
    public com.google.cloud.speech.v2.Recognizer getRecognizer() {
      if (recognizerBuilder_ == null) {
        return recognizer_ == null ? com.google.cloud.speech.v2.Recognizer.getDefaultInstance() : recognizer_;
      } else {
        return recognizerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRecognizer(com.google.cloud.speech.v2.Recognizer value) {
      if (recognizerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recognizer_ = value;
      } else {
        recognizerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRecognizer(
        com.google.cloud.speech.v2.Recognizer.Builder builderForValue) {
      if (recognizerBuilder_ == null) {
        recognizer_ = builderForValue.build();
      } else {
        recognizerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeRecognizer(com.google.cloud.speech.v2.Recognizer value) {
      if (recognizerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          recognizer_ != null &&
          recognizer_ != com.google.cloud.speech.v2.Recognizer.getDefaultInstance()) {
          getRecognizerBuilder().mergeFrom(value);
        } else {
          recognizer_ = value;
        }
      } else {
        recognizerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearRecognizer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recognizer_ = null;
      if (recognizerBuilder_ != null) {
        recognizerBuilder_.dispose();
        recognizerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.speech.v2.Recognizer.Builder getRecognizerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRecognizerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.speech.v2.RecognizerOrBuilder getRecognizerOrBuilder() {
      if (recognizerBuilder_ != null) {
        return recognizerBuilder_.getMessageOrBuilder();
      } else {
        return recognizer_ == null ?
            com.google.cloud.speech.v2.Recognizer.getDefaultInstance() : recognizer_;
      }
    }
    /**
     * <pre>
     * Required. The Recognizer to update.
     *
     * The Recognizer's `name` field is used to identify the Recognizer to update.
     * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v2.Recognizer, com.google.cloud.speech.v2.Recognizer.Builder, com.google.cloud.speech.v2.RecognizerOrBuilder> 
        getRecognizerFieldBuilder() {
      if (recognizerBuilder_ == null) {
        recognizerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v2.Recognizer, com.google.cloud.speech.v2.Recognizer.Builder, com.google.cloud.speech.v2.RecognizerOrBuilder>(
                getRecognizer(),
                getParentForChildren(),
                isClean());
        recognizer_ = null;
      }
      return recognizerBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire Recognizer resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If set, validate the request and preview the updated Recognizer, but do not
     * actually update it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If set, validate the request and preview the updated Recognizer, but do not
     * actually update it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, validate the request and preview the updated Recognizer, but do not
     * actually update it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validateOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.UpdateRecognizerRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.UpdateRecognizerRequest)
  private static final com.google.cloud.speech.v2.UpdateRecognizerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.UpdateRecognizerRequest();
  }

  public static com.google.cloud.speech.v2.UpdateRecognizerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRecognizerRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRecognizerRequest>() {
    @java.lang.Override
    public UpdateRecognizerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateRecognizerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRecognizerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.UpdateRecognizerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

