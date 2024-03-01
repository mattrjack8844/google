// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vision.v1p3beta1;

/**
 * <pre>
 * Response to a single file annotation request. A file may contain one or more
 * images, which individually have their own responses.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.AnnotateFileResponse}
 */
public final class AnnotateFileResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.AnnotateFileResponse)
    AnnotateFileResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnnotateFileResponse.newBuilder() to construct.
  private AnnotateFileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnnotateFileResponse() {
    responses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnnotateFileResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_AnnotateFileResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_AnnotateFileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.AnnotateFileResponse.class, com.google.cloud.vision.v1p3beta1.AnnotateFileResponse.Builder.class);
  }

  private int bitField0_;
  public static final int INPUT_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1p3beta1.InputConfig inputConfig_;
  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
   * @return Whether the inputConfig field is set.
   */
  @java.lang.Override
  public boolean hasInputConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
   * @return The inputConfig.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.InputConfig getInputConfig() {
    return inputConfig_ == null ? com.google.cloud.vision.v1p3beta1.InputConfig.getDefaultInstance() : inputConfig_;
  }
  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
    return inputConfig_ == null ? com.google.cloud.vision.v1p3beta1.InputConfig.getDefaultInstance() : inputConfig_;
  }

  public static final int RESPONSES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageResponse> responses_;
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageResponse> getResponsesList() {
    return responses_;
  }
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder> 
      getResponsesOrBuilderList() {
    return responses_;
  }
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
   */
  @java.lang.Override
  public int getResponsesCount() {
    return responses_.size();
  }
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.AnnotateImageResponse getResponses(int index) {
    return responses_.get(index);
  }
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder getResponsesOrBuilder(
      int index) {
    return responses_.get(index);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getInputConfig());
    }
    for (int i = 0; i < responses_.size(); i++) {
      output.writeMessage(2, responses_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInputConfig());
    }
    for (int i = 0; i < responses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, responses_.get(i));
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
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.AnnotateFileResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.AnnotateFileResponse other = (com.google.cloud.vision.v1p3beta1.AnnotateFileResponse) obj;

    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig()
          .equals(other.getInputConfig())) return false;
    }
    if (!getResponsesList()
        .equals(other.getResponsesList())) return false;
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
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    if (getResponsesCount() > 0) {
      hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getResponsesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1p3beta1.AnnotateFileResponse prototype) {
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
   * Response to a single file annotation request. A file may contain one or more
   * images, which individually have their own responses.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.AnnotateFileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.AnnotateFileResponse)
      com.google.cloud.vision.v1p3beta1.AnnotateFileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_AnnotateFileResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_AnnotateFileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.AnnotateFileResponse.class, com.google.cloud.vision.v1p3beta1.AnnotateFileResponse.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.AnnotateFileResponse.newBuilder()
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
        getInputConfigFieldBuilder();
        getResponsesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      inputConfig_ = null;
      if (inputConfigBuilder_ != null) {
        inputConfigBuilder_.dispose();
        inputConfigBuilder_ = null;
      }
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
      } else {
        responses_ = null;
        responsesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_AnnotateFileResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.AnnotateFileResponse getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.AnnotateFileResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.AnnotateFileResponse build() {
      com.google.cloud.vision.v1p3beta1.AnnotateFileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.AnnotateFileResponse buildPartial() {
      com.google.cloud.vision.v1p3beta1.AnnotateFileResponse result = new com.google.cloud.vision.v1p3beta1.AnnotateFileResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.vision.v1p3beta1.AnnotateFileResponse result) {
      if (responsesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          responses_ = java.util.Collections.unmodifiableList(responses_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.responses_ = responses_;
      } else {
        result.responses_ = responsesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.vision.v1p3beta1.AnnotateFileResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inputConfig_ = inputConfigBuilder_ == null
            ? inputConfig_
            : inputConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.vision.v1p3beta1.AnnotateFileResponse) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.AnnotateFileResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.AnnotateFileResponse other) {
      if (other == com.google.cloud.vision.v1p3beta1.AnnotateFileResponse.getDefaultInstance()) return this;
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
      }
      if (responsesBuilder_ == null) {
        if (!other.responses_.isEmpty()) {
          if (responses_.isEmpty()) {
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureResponsesIsMutable();
            responses_.addAll(other.responses_);
          }
          onChanged();
        }
      } else {
        if (!other.responses_.isEmpty()) {
          if (responsesBuilder_.isEmpty()) {
            responsesBuilder_.dispose();
            responsesBuilder_ = null;
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000002);
            responsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResponsesFieldBuilder() : null;
          } else {
            responsesBuilder_.addAllMessages(other.responses_);
          }
        }
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
                  getInputConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.cloud.vision.v1p3beta1.AnnotateImageResponse m =
                  input.readMessage(
                      com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.parser(),
                      extensionRegistry);
              if (responsesBuilder_ == null) {
                ensureResponsesIsMutable();
                responses_.add(m);
              } else {
                responsesBuilder_.addMessage(m);
              }
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

    private com.google.cloud.vision.v1p3beta1.InputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1p3beta1.InputConfig, com.google.cloud.vision.v1p3beta1.InputConfig.Builder, com.google.cloud.vision.v1p3beta1.InputConfigOrBuilder> inputConfigBuilder_;
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     * @return Whether the inputConfig field is set.
     */
    public boolean hasInputConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     * @return The inputConfig.
     */
    public com.google.cloud.vision.v1p3beta1.InputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null ? com.google.cloud.vision.v1p3beta1.InputConfig.getDefaultInstance() : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     */
    public Builder setInputConfig(com.google.cloud.vision.v1p3beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputConfig_ = value;
      } else {
        inputConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     */
    public Builder setInputConfig(
        com.google.cloud.vision.v1p3beta1.InputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = builderForValue.build();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     */
    public Builder mergeInputConfig(com.google.cloud.vision.v1p3beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          inputConfig_ != null &&
          inputConfig_ != com.google.cloud.vision.v1p3beta1.InputConfig.getDefaultInstance()) {
          getInputConfigBuilder().mergeFrom(value);
        } else {
          inputConfig_ = value;
        }
      } else {
        inputConfigBuilder_.mergeFrom(value);
      }
      if (inputConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     */
    public Builder clearInputConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      inputConfig_ = null;
      if (inputConfigBuilder_ != null) {
        inputConfigBuilder_.dispose();
        inputConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.InputConfig.Builder getInputConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null ?
            com.google.cloud.vision.v1p3beta1.InputConfig.getDefaultInstance() : inputConfig_;
      }
    }
    /**
     * <pre>
     * Information about the file for which this response is generated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p3beta1.InputConfig input_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1p3beta1.InputConfig, com.google.cloud.vision.v1p3beta1.InputConfig.Builder, com.google.cloud.vision.v1p3beta1.InputConfigOrBuilder> 
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.InputConfig, com.google.cloud.vision.v1p3beta1.InputConfig.Builder, com.google.cloud.vision.v1p3beta1.InputConfigOrBuilder>(
                getInputConfig(),
                getParentForChildren(),
                isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
    }

    private java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageResponse> responses_ =
      java.util.Collections.emptyList();
    private void ensureResponsesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        responses_ = new java.util.ArrayList<com.google.cloud.vision.v1p3beta1.AnnotateImageResponse>(responses_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1p3beta1.AnnotateImageResponse, com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder, com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder> responsesBuilder_;

    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageResponse> getResponsesList() {
      if (responsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(responses_);
      } else {
        return responsesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public int getResponsesCount() {
      if (responsesBuilder_ == null) {
        return responses_.size();
      } else {
        return responsesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageResponse getResponses(int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);
      } else {
        return responsesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder setResponses(
        int index, com.google.cloud.vision.v1p3beta1.AnnotateImageResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.set(index, value);
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder setResponses(
        int index, com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.set(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder addResponses(com.google.cloud.vision.v1p3beta1.AnnotateImageResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder addResponses(
        int index, com.google.cloud.vision.v1p3beta1.AnnotateImageResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(index, value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder addResponses(
        com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder addResponses(
        int index, com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder addAllResponses(
        java.lang.Iterable<? extends com.google.cloud.vision.v1p3beta1.AnnotateImageResponse> values) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, responses_);
        onChanged();
      } else {
        responsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder clearResponses() {
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public Builder removeResponses(int index) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.remove(index);
        onChanged();
      } else {
        responsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder getResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder getResponsesOrBuilder(
        int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);  } else {
        return responsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder> 
         getResponsesOrBuilderList() {
      if (responsesBuilder_ != null) {
        return responsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(responses_);
      }
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder addResponsesBuilder() {
      return getResponsesFieldBuilder().addBuilder(
          com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder addResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().addBuilder(
          index, com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * Individual responses to images found within the file.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 2;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder> 
         getResponsesBuilderList() {
      return getResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1p3beta1.AnnotateImageResponse, com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder, com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder> 
        getResponsesFieldBuilder() {
      if (responsesBuilder_ == null) {
        responsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.AnnotateImageResponse, com.google.cloud.vision.v1p3beta1.AnnotateImageResponse.Builder, com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder>(
                responses_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        responses_ = null;
      }
      return responsesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.AnnotateFileResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.AnnotateFileResponse)
  private static final com.google.cloud.vision.v1p3beta1.AnnotateFileResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.AnnotateFileResponse();
  }

  public static com.google.cloud.vision.v1p3beta1.AnnotateFileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotateFileResponse>
      PARSER = new com.google.protobuf.AbstractParser<AnnotateFileResponse>() {
    @java.lang.Override
    public AnnotateFileResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnnotateFileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotateFileResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.AnnotateFileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

