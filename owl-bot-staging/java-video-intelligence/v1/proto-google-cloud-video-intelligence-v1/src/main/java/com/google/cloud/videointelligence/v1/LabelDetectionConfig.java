// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.videointelligence.v1;

/**
 * <pre>
 * Config for LABEL_DETECTION.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.LabelDetectionConfig}
 */
public final class LabelDetectionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.LabelDetectionConfig)
    LabelDetectionConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LabelDetectionConfig.newBuilder() to construct.
  private LabelDetectionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LabelDetectionConfig() {
    labelDetectionMode_ = 0;
    model_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LabelDetectionConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_LabelDetectionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_LabelDetectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.LabelDetectionConfig.class, com.google.cloud.videointelligence.v1.LabelDetectionConfig.Builder.class);
  }

  public static final int LABEL_DETECTION_MODE_FIELD_NUMBER = 1;
  private int labelDetectionMode_ = 0;
  /**
   * <pre>
   * What labels should be detected with LABEL_DETECTION, in addition to
   * video-level labels or segment-level labels.
   * If unspecified, defaults to `SHOT_MODE`.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
   * @return The enum numeric value on the wire for labelDetectionMode.
   */
  @java.lang.Override public int getLabelDetectionModeValue() {
    return labelDetectionMode_;
  }
  /**
   * <pre>
   * What labels should be detected with LABEL_DETECTION, in addition to
   * video-level labels or segment-level labels.
   * If unspecified, defaults to `SHOT_MODE`.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
   * @return The labelDetectionMode.
   */
  @java.lang.Override public com.google.cloud.videointelligence.v1.LabelDetectionMode getLabelDetectionMode() {
    com.google.cloud.videointelligence.v1.LabelDetectionMode result = com.google.cloud.videointelligence.v1.LabelDetectionMode.forNumber(labelDetectionMode_);
    return result == null ? com.google.cloud.videointelligence.v1.LabelDetectionMode.UNRECOGNIZED : result;
  }

  public static final int STATIONARY_CAMERA_FIELD_NUMBER = 2;
  private boolean stationaryCamera_ = false;
  /**
   * <pre>
   * Whether the video has been shot from a stationary (i.e., non-moving)
   * camera. When set to true, might improve detection accuracy for moving
   * objects. Should be used with `SHOT_AND_FRAME_MODE` enabled.
   * </pre>
   *
   * <code>bool stationary_camera = 2;</code>
   * @return The stationaryCamera.
   */
  @java.lang.Override
  public boolean getStationaryCamera() {
    return stationaryCamera_;
  }

  public static final int MODEL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object model_ = "";
  /**
   * <pre>
   * Model to use for label detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Model to use for label detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FRAME_CONFIDENCE_THRESHOLD_FIELD_NUMBER = 4;
  private float frameConfidenceThreshold_ = 0F;
  /**
   * <pre>
   * The confidence threshold we perform filtering on the labels from
   * frame-level detection. If not set, it is set to 0.4 by default. The valid
   * range for this threshold is [0.1, 0.9]. Any value set outside of this
   * range will be clipped.
   * Note: For best results, follow the default threshold. We will update
   * the default threshold everytime when we release a new model.
   * </pre>
   *
   * <code>float frame_confidence_threshold = 4;</code>
   * @return The frameConfidenceThreshold.
   */
  @java.lang.Override
  public float getFrameConfidenceThreshold() {
    return frameConfidenceThreshold_;
  }

  public static final int VIDEO_CONFIDENCE_THRESHOLD_FIELD_NUMBER = 5;
  private float videoConfidenceThreshold_ = 0F;
  /**
   * <pre>
   * The confidence threshold we perform filtering on the labels from
   * video-level and shot-level detections. If not set, it's set to 0.3 by
   * default. The valid range for this threshold is [0.1, 0.9]. Any value set
   * outside of this range will be clipped.
   * Note: For best results, follow the default threshold. We will update
   * the default threshold everytime when we release a new model.
   * </pre>
   *
   * <code>float video_confidence_threshold = 5;</code>
   * @return The videoConfidenceThreshold.
   */
  @java.lang.Override
  public float getVideoConfidenceThreshold() {
    return videoConfidenceThreshold_;
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
    if (labelDetectionMode_ != com.google.cloud.videointelligence.v1.LabelDetectionMode.LABEL_DETECTION_MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, labelDetectionMode_);
    }
    if (stationaryCamera_ != false) {
      output.writeBool(2, stationaryCamera_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, model_);
    }
    if (java.lang.Float.floatToRawIntBits(frameConfidenceThreshold_) != 0) {
      output.writeFloat(4, frameConfidenceThreshold_);
    }
    if (java.lang.Float.floatToRawIntBits(videoConfidenceThreshold_) != 0) {
      output.writeFloat(5, videoConfidenceThreshold_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (labelDetectionMode_ != com.google.cloud.videointelligence.v1.LabelDetectionMode.LABEL_DETECTION_MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, labelDetectionMode_);
    }
    if (stationaryCamera_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, stationaryCamera_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, model_);
    }
    if (java.lang.Float.floatToRawIntBits(frameConfidenceThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, frameConfidenceThreshold_);
    }
    if (java.lang.Float.floatToRawIntBits(videoConfidenceThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, videoConfidenceThreshold_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1.LabelDetectionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.LabelDetectionConfig other = (com.google.cloud.videointelligence.v1.LabelDetectionConfig) obj;

    if (labelDetectionMode_ != other.labelDetectionMode_) return false;
    if (getStationaryCamera()
        != other.getStationaryCamera()) return false;
    if (!getModel()
        .equals(other.getModel())) return false;
    if (java.lang.Float.floatToIntBits(getFrameConfidenceThreshold())
        != java.lang.Float.floatToIntBits(
            other.getFrameConfidenceThreshold())) return false;
    if (java.lang.Float.floatToIntBits(getVideoConfidenceThreshold())
        != java.lang.Float.floatToIntBits(
            other.getVideoConfidenceThreshold())) return false;
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
    hash = (37 * hash) + LABEL_DETECTION_MODE_FIELD_NUMBER;
    hash = (53 * hash) + labelDetectionMode_;
    hash = (37 * hash) + STATIONARY_CAMERA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStationaryCamera());
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + FRAME_CONFIDENCE_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFrameConfidenceThreshold());
    hash = (37 * hash) + VIDEO_CONFIDENCE_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getVideoConfidenceThreshold());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1.LabelDetectionConfig prototype) {
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
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.LabelDetectionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.LabelDetectionConfig)
      com.google.cloud.videointelligence.v1.LabelDetectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_LabelDetectionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_LabelDetectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.LabelDetectionConfig.class, com.google.cloud.videointelligence.v1.LabelDetectionConfig.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.LabelDetectionConfig.newBuilder()
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
      labelDetectionMode_ = 0;
      stationaryCamera_ = false;
      model_ = "";
      frameConfidenceThreshold_ = 0F;
      videoConfidenceThreshold_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_LabelDetectionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.LabelDetectionConfig getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.LabelDetectionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.LabelDetectionConfig build() {
      com.google.cloud.videointelligence.v1.LabelDetectionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.LabelDetectionConfig buildPartial() {
      com.google.cloud.videointelligence.v1.LabelDetectionConfig result = new com.google.cloud.videointelligence.v1.LabelDetectionConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1.LabelDetectionConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.labelDetectionMode_ = labelDetectionMode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stationaryCamera_ = stationaryCamera_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.model_ = model_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.frameConfidenceThreshold_ = frameConfidenceThreshold_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.videoConfidenceThreshold_ = videoConfidenceThreshold_;
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
      if (other instanceof com.google.cloud.videointelligence.v1.LabelDetectionConfig) {
        return mergeFrom((com.google.cloud.videointelligence.v1.LabelDetectionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.LabelDetectionConfig other) {
      if (other == com.google.cloud.videointelligence.v1.LabelDetectionConfig.getDefaultInstance()) return this;
      if (other.labelDetectionMode_ != 0) {
        setLabelDetectionModeValue(other.getLabelDetectionModeValue());
      }
      if (other.getStationaryCamera() != false) {
        setStationaryCamera(other.getStationaryCamera());
      }
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getFrameConfidenceThreshold() != 0F) {
        setFrameConfidenceThreshold(other.getFrameConfidenceThreshold());
      }
      if (other.getVideoConfidenceThreshold() != 0F) {
        setVideoConfidenceThreshold(other.getVideoConfidenceThreshold());
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
              labelDetectionMode_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              stationaryCamera_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              model_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 37: {
              frameConfidenceThreshold_ = input.readFloat();
              bitField0_ |= 0x00000008;
              break;
            } // case 37
            case 45: {
              videoConfidenceThreshold_ = input.readFloat();
              bitField0_ |= 0x00000010;
              break;
            } // case 45
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

    private int labelDetectionMode_ = 0;
    /**
     * <pre>
     * What labels should be detected with LABEL_DETECTION, in addition to
     * video-level labels or segment-level labels.
     * If unspecified, defaults to `SHOT_MODE`.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
     * @return The enum numeric value on the wire for labelDetectionMode.
     */
    @java.lang.Override public int getLabelDetectionModeValue() {
      return labelDetectionMode_;
    }
    /**
     * <pre>
     * What labels should be detected with LABEL_DETECTION, in addition to
     * video-level labels or segment-level labels.
     * If unspecified, defaults to `SHOT_MODE`.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
     * @param value The enum numeric value on the wire for labelDetectionMode to set.
     * @return This builder for chaining.
     */
    public Builder setLabelDetectionModeValue(int value) {
      labelDetectionMode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * What labels should be detected with LABEL_DETECTION, in addition to
     * video-level labels or segment-level labels.
     * If unspecified, defaults to `SHOT_MODE`.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
     * @return The labelDetectionMode.
     */
    @java.lang.Override
    public com.google.cloud.videointelligence.v1.LabelDetectionMode getLabelDetectionMode() {
      com.google.cloud.videointelligence.v1.LabelDetectionMode result = com.google.cloud.videointelligence.v1.LabelDetectionMode.forNumber(labelDetectionMode_);
      return result == null ? com.google.cloud.videointelligence.v1.LabelDetectionMode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * What labels should be detected with LABEL_DETECTION, in addition to
     * video-level labels or segment-level labels.
     * If unspecified, defaults to `SHOT_MODE`.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
     * @param value The labelDetectionMode to set.
     * @return This builder for chaining.
     */
    public Builder setLabelDetectionMode(com.google.cloud.videointelligence.v1.LabelDetectionMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      labelDetectionMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * What labels should be detected with LABEL_DETECTION, in addition to
     * video-level labels or segment-level labels.
     * If unspecified, defaults to `SHOT_MODE`.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLabelDetectionMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      labelDetectionMode_ = 0;
      onChanged();
      return this;
    }

    private boolean stationaryCamera_ ;
    /**
     * <pre>
     * Whether the video has been shot from a stationary (i.e., non-moving)
     * camera. When set to true, might improve detection accuracy for moving
     * objects. Should be used with `SHOT_AND_FRAME_MODE` enabled.
     * </pre>
     *
     * <code>bool stationary_camera = 2;</code>
     * @return The stationaryCamera.
     */
    @java.lang.Override
    public boolean getStationaryCamera() {
      return stationaryCamera_;
    }
    /**
     * <pre>
     * Whether the video has been shot from a stationary (i.e., non-moving)
     * camera. When set to true, might improve detection accuracy for moving
     * objects. Should be used with `SHOT_AND_FRAME_MODE` enabled.
     * </pre>
     *
     * <code>bool stationary_camera = 2;</code>
     * @param value The stationaryCamera to set.
     * @return This builder for chaining.
     */
    public Builder setStationaryCamera(boolean value) {

      stationaryCamera_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the video has been shot from a stationary (i.e., non-moving)
     * camera. When set to true, might improve detection accuracy for moving
     * objects. Should be used with `SHOT_AND_FRAME_MODE` enabled.
     * </pre>
     *
     * <code>bool stationary_camera = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStationaryCamera() {
      bitField0_ = (bitField0_ & ~0x00000002);
      stationaryCamera_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <pre>
     * Model to use for label detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Model to use for label detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Model to use for label detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      model_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model to use for label detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      model_ = getDefaultInstance().getModel();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model to use for label detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      model_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private float frameConfidenceThreshold_ ;
    /**
     * <pre>
     * The confidence threshold we perform filtering on the labels from
     * frame-level detection. If not set, it is set to 0.4 by default. The valid
     * range for this threshold is [0.1, 0.9]. Any value set outside of this
     * range will be clipped.
     * Note: For best results, follow the default threshold. We will update
     * the default threshold everytime when we release a new model.
     * </pre>
     *
     * <code>float frame_confidence_threshold = 4;</code>
     * @return The frameConfidenceThreshold.
     */
    @java.lang.Override
    public float getFrameConfidenceThreshold() {
      return frameConfidenceThreshold_;
    }
    /**
     * <pre>
     * The confidence threshold we perform filtering on the labels from
     * frame-level detection. If not set, it is set to 0.4 by default. The valid
     * range for this threshold is [0.1, 0.9]. Any value set outside of this
     * range will be clipped.
     * Note: For best results, follow the default threshold. We will update
     * the default threshold everytime when we release a new model.
     * </pre>
     *
     * <code>float frame_confidence_threshold = 4;</code>
     * @param value The frameConfidenceThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setFrameConfidenceThreshold(float value) {

      frameConfidenceThreshold_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The confidence threshold we perform filtering on the labels from
     * frame-level detection. If not set, it is set to 0.4 by default. The valid
     * range for this threshold is [0.1, 0.9]. Any value set outside of this
     * range will be clipped.
     * Note: For best results, follow the default threshold. We will update
     * the default threshold everytime when we release a new model.
     * </pre>
     *
     * <code>float frame_confidence_threshold = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrameConfidenceThreshold() {
      bitField0_ = (bitField0_ & ~0x00000008);
      frameConfidenceThreshold_ = 0F;
      onChanged();
      return this;
    }

    private float videoConfidenceThreshold_ ;
    /**
     * <pre>
     * The confidence threshold we perform filtering on the labels from
     * video-level and shot-level detections. If not set, it's set to 0.3 by
     * default. The valid range for this threshold is [0.1, 0.9]. Any value set
     * outside of this range will be clipped.
     * Note: For best results, follow the default threshold. We will update
     * the default threshold everytime when we release a new model.
     * </pre>
     *
     * <code>float video_confidence_threshold = 5;</code>
     * @return The videoConfidenceThreshold.
     */
    @java.lang.Override
    public float getVideoConfidenceThreshold() {
      return videoConfidenceThreshold_;
    }
    /**
     * <pre>
     * The confidence threshold we perform filtering on the labels from
     * video-level and shot-level detections. If not set, it's set to 0.3 by
     * default. The valid range for this threshold is [0.1, 0.9]. Any value set
     * outside of this range will be clipped.
     * Note: For best results, follow the default threshold. We will update
     * the default threshold everytime when we release a new model.
     * </pre>
     *
     * <code>float video_confidence_threshold = 5;</code>
     * @param value The videoConfidenceThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setVideoConfidenceThreshold(float value) {

      videoConfidenceThreshold_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The confidence threshold we perform filtering on the labels from
     * video-level and shot-level detections. If not set, it's set to 0.3 by
     * default. The valid range for this threshold is [0.1, 0.9]. Any value set
     * outside of this range will be clipped.
     * Note: For best results, follow the default threshold. We will update
     * the default threshold everytime when we release a new model.
     * </pre>
     *
     * <code>float video_confidence_threshold = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearVideoConfidenceThreshold() {
      bitField0_ = (bitField0_ & ~0x00000010);
      videoConfidenceThreshold_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.LabelDetectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.LabelDetectionConfig)
  private static final com.google.cloud.videointelligence.v1.LabelDetectionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.LabelDetectionConfig();
  }

  public static com.google.cloud.videointelligence.v1.LabelDetectionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelDetectionConfig>
      PARSER = new com.google.protobuf.AbstractParser<LabelDetectionConfig>() {
    @java.lang.Override
    public LabelDetectionConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LabelDetectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelDetectionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.LabelDetectionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

