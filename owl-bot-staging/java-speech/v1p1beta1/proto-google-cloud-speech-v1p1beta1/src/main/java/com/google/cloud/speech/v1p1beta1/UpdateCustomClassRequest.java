// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1p1beta1;

/**
 * <pre>
 * Message sent by the client for the `UpdateCustomClass` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1p1beta1.UpdateCustomClassRequest}
 */
public final class UpdateCustomClassRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1p1beta1.UpdateCustomClassRequest)
    UpdateCustomClassRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCustomClassRequest.newBuilder() to construct.
  private UpdateCustomClassRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCustomClassRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCustomClassRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest.class, com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest.Builder.class);
  }

  public static final int CUSTOM_CLASS_FIELD_NUMBER = 1;
  private com.google.cloud.speech.v1p1beta1.CustomClass customClass_;
  /**
   * <pre>
   * Required. The custom class to update.
   *
   * The custom class's `name` field is used to identify the custom class to be
   * updated. Format:
   *
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`
   *
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customClass field is set.
   */
  @java.lang.Override
  public boolean hasCustomClass() {
    return customClass_ != null;
  }
  /**
   * <pre>
   * Required. The custom class to update.
   *
   * The custom class's `name` field is used to identify the custom class to be
   * updated. Format:
   *
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`
   *
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customClass.
   */
  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.CustomClass getCustomClass() {
    return customClass_ == null ? com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance() : customClass_;
  }
  /**
   * <pre>
   * Required. The custom class to update.
   *
   * The custom class's `name` field is used to identify the custom class to be
   * updated. Format:
   *
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`
   *
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder getCustomClassOrBuilder() {
    return customClass_ == null ? com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance() : customClass_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The list of fields to be updated.
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
   * The list of fields to be updated.
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
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (customClass_ != null) {
      output.writeMessage(1, getCustomClass());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customClass_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCustomClass());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest other = (com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest) obj;

    if (hasCustomClass() != other.hasCustomClass()) return false;
    if (hasCustomClass()) {
      if (!getCustomClass()
          .equals(other.getCustomClass())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasCustomClass()) {
      hash = (37 * hash) + CUSTOM_CLASS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomClass().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest prototype) {
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
   * Message sent by the client for the `UpdateCustomClass` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1p1beta1.UpdateCustomClassRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1p1beta1.UpdateCustomClassRequest)
      com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest.class, com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest.newBuilder()
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
      customClass_ = null;
      if (customClassBuilder_ != null) {
        customClassBuilder_.dispose();
        customClassBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1p1beta1.SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest getDefaultInstanceForType() {
      return com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest build() {
      com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest buildPartial() {
      com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest result = new com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customClass_ = customClassBuilder_ == null
            ? customClass_
            : customClassBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest) {
        return mergeFrom((com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest other) {
      if (other == com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest.getDefaultInstance()) return this;
      if (other.hasCustomClass()) {
        mergeCustomClass(other.getCustomClass());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getCustomClassFieldBuilder().getBuilder(),
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

    private com.google.cloud.speech.v1p1beta1.CustomClass customClass_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v1p1beta1.CustomClass, com.google.cloud.speech.v1p1beta1.CustomClass.Builder, com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder> customClassBuilder_;
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the customClass field is set.
     */
    public boolean hasCustomClass() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customClass.
     */
    public com.google.cloud.speech.v1p1beta1.CustomClass getCustomClass() {
      if (customClassBuilder_ == null) {
        return customClass_ == null ? com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance() : customClass_;
      } else {
        return customClassBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomClass(com.google.cloud.speech.v1p1beta1.CustomClass value) {
      if (customClassBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customClass_ = value;
      } else {
        customClassBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomClass(
        com.google.cloud.speech.v1p1beta1.CustomClass.Builder builderForValue) {
      if (customClassBuilder_ == null) {
        customClass_ = builderForValue.build();
      } else {
        customClassBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCustomClass(com.google.cloud.speech.v1p1beta1.CustomClass value) {
      if (customClassBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          customClass_ != null &&
          customClass_ != com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance()) {
          getCustomClassBuilder().mergeFrom(value);
        } else {
          customClass_ = value;
        }
      } else {
        customClassBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCustomClass() {
      bitField0_ = (bitField0_ & ~0x00000001);
      customClass_ = null;
      if (customClassBuilder_ != null) {
        customClassBuilder_.dispose();
        customClassBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.speech.v1p1beta1.CustomClass.Builder getCustomClassBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCustomClassFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder getCustomClassOrBuilder() {
      if (customClassBuilder_ != null) {
        return customClassBuilder_.getMessageOrBuilder();
      } else {
        return customClass_ == null ?
            com.google.cloud.speech.v1p1beta1.CustomClass.getDefaultInstance() : customClass_;
      }
    }
    /**
     * <pre>
     * Required. The custom class to update.
     *
     * The custom class's `name` field is used to identify the custom class to be
     * updated. Format:
     *
     * `projects/{project}/locations/{location}/customClasses/{custom_class}`
     *
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>.google.cloud.speech.v1p1beta1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v1p1beta1.CustomClass, com.google.cloud.speech.v1p1beta1.CustomClass.Builder, com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder> 
        getCustomClassFieldBuilder() {
      if (customClassBuilder_ == null) {
        customClassBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1p1beta1.CustomClass, com.google.cloud.speech.v1p1beta1.CustomClass.Builder, com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder>(
                getCustomClass(),
                getParentForChildren(),
                isClean());
        customClass_ = null;
      }
      return customClassBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1p1beta1.UpdateCustomClassRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1p1beta1.UpdateCustomClassRequest)
  private static final com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest();
  }

  public static com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCustomClassRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCustomClassRequest>() {
    @java.lang.Override
    public UpdateCustomClassRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateCustomClassRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCustomClassRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

