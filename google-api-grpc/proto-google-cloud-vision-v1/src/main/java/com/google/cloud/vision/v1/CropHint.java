// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

/**
 *
 *
 * <pre>
 * Single crop hint that is used to generate a new crop when serving an image.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.CropHint}
 */
public final class CropHint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.CropHint)
    CropHintOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CropHint.newBuilder() to construct.
  private CropHint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CropHint() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CropHint(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              com.google.cloud.vision.v1.BoundingPoly.Builder subBuilder = null;
              if (boundingPoly_ != null) {
                subBuilder = boundingPoly_.toBuilder();
              }
              boundingPoly_ =
                  input.readMessage(
                      com.google.cloud.vision.v1.BoundingPoly.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(boundingPoly_);
                boundingPoly_ = subBuilder.buildPartial();
              }

              break;
            }
          case 21:
            {
              confidence_ = input.readFloat();
              break;
            }
          case 29:
            {
              importanceFraction_ = input.readFloat();
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_CropHint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_CropHint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.CropHint.class,
            com.google.cloud.vision.v1.CropHint.Builder.class);
  }

  public static final int BOUNDING_POLY_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1.BoundingPoly boundingPoly_;
  /**
   *
   *
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
   */
  public boolean hasBoundingPoly() {
    return boundingPoly_ != null;
  }
  /**
   *
   *
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
   */
  public com.google.cloud.vision.v1.BoundingPoly getBoundingPoly() {
    return boundingPoly_ == null
        ? com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance()
        : boundingPoly_;
  }
  /**
   *
   *
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
   */
  public com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingPolyOrBuilder() {
    return getBoundingPoly();
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private float confidence_;
  /**
   *
   *
   * <pre>
   * Confidence of this being a salient region.  Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  public float getConfidence() {
    return confidence_;
  }

  public static final int IMPORTANCE_FRACTION_FIELD_NUMBER = 3;
  private float importanceFraction_;
  /**
   *
   *
   * <pre>
   * Fraction of importance of this salient region with respect to the original
   * image.
   * </pre>
   *
   * <code>float importance_fraction = 3;</code>
   */
  public float getImportanceFraction() {
    return importanceFraction_;
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
    if (boundingPoly_ != null) {
      output.writeMessage(1, getBoundingPoly());
    }
    if (confidence_ != 0F) {
      output.writeFloat(2, confidence_);
    }
    if (importanceFraction_ != 0F) {
      output.writeFloat(3, importanceFraction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (boundingPoly_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getBoundingPoly());
    }
    if (confidence_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, confidence_);
    }
    if (importanceFraction_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, importanceFraction_);
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
    if (!(obj instanceof com.google.cloud.vision.v1.CropHint)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.CropHint other = (com.google.cloud.vision.v1.CropHint) obj;

    if (hasBoundingPoly() != other.hasBoundingPoly()) return false;
    if (hasBoundingPoly()) {
      if (!getBoundingPoly().equals(other.getBoundingPoly())) return false;
    }
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(other.getConfidence())) return false;
    if (java.lang.Float.floatToIntBits(getImportanceFraction())
        != java.lang.Float.floatToIntBits(other.getImportanceFraction())) return false;
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
    if (hasBoundingPoly()) {
      hash = (37 * hash) + BOUNDING_POLY_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingPoly().hashCode();
    }
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidence());
    hash = (37 * hash) + IMPORTANCE_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getImportanceFraction());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CropHint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CropHint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CropHint parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1.CropHint prototype) {
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
   * Single crop hint that is used to generate a new crop when serving an image.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.CropHint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.CropHint)
      com.google.cloud.vision.v1.CropHintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_CropHint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_CropHint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.CropHint.class,
              com.google.cloud.vision.v1.CropHint.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.CropHint.newBuilder()
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
      if (boundingPolyBuilder_ == null) {
        boundingPoly_ = null;
      } else {
        boundingPoly_ = null;
        boundingPolyBuilder_ = null;
      }
      confidence_ = 0F;

      importanceFraction_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_CropHint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CropHint getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.CropHint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CropHint build() {
      com.google.cloud.vision.v1.CropHint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CropHint buildPartial() {
      com.google.cloud.vision.v1.CropHint result = new com.google.cloud.vision.v1.CropHint(this);
      if (boundingPolyBuilder_ == null) {
        result.boundingPoly_ = boundingPoly_;
      } else {
        result.boundingPoly_ = boundingPolyBuilder_.build();
      }
      result.confidence_ = confidence_;
      result.importanceFraction_ = importanceFraction_;
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
      if (other instanceof com.google.cloud.vision.v1.CropHint) {
        return mergeFrom((com.google.cloud.vision.v1.CropHint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.CropHint other) {
      if (other == com.google.cloud.vision.v1.CropHint.getDefaultInstance()) return this;
      if (other.hasBoundingPoly()) {
        mergeBoundingPoly(other.getBoundingPoly());
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
      }
      if (other.getImportanceFraction() != 0F) {
        setImportanceFraction(other.getImportanceFraction());
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
      com.google.cloud.vision.v1.CropHint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1.CropHint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.vision.v1.BoundingPoly boundingPoly_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.BoundingPoly,
            com.google.cloud.vision.v1.BoundingPoly.Builder,
            com.google.cloud.vision.v1.BoundingPolyOrBuilder>
        boundingPolyBuilder_;
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    public boolean hasBoundingPoly() {
      return boundingPolyBuilder_ != null || boundingPoly_ != null;
    }
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    public com.google.cloud.vision.v1.BoundingPoly getBoundingPoly() {
      if (boundingPolyBuilder_ == null) {
        return boundingPoly_ == null
            ? com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance()
            : boundingPoly_;
      } else {
        return boundingPolyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    public Builder setBoundingPoly(com.google.cloud.vision.v1.BoundingPoly value) {
      if (boundingPolyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        boundingPoly_ = value;
        onChanged();
      } else {
        boundingPolyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    public Builder setBoundingPoly(
        com.google.cloud.vision.v1.BoundingPoly.Builder builderForValue) {
      if (boundingPolyBuilder_ == null) {
        boundingPoly_ = builderForValue.build();
        onChanged();
      } else {
        boundingPolyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    public Builder mergeBoundingPoly(com.google.cloud.vision.v1.BoundingPoly value) {
      if (boundingPolyBuilder_ == null) {
        if (boundingPoly_ != null) {
          boundingPoly_ =
              com.google.cloud.vision.v1.BoundingPoly.newBuilder(boundingPoly_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          boundingPoly_ = value;
        }
        onChanged();
      } else {
        boundingPolyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    public Builder clearBoundingPoly() {
      if (boundingPolyBuilder_ == null) {
        boundingPoly_ = null;
        onChanged();
      } else {
        boundingPoly_ = null;
        boundingPolyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    public com.google.cloud.vision.v1.BoundingPoly.Builder getBoundingPolyBuilder() {

      onChanged();
      return getBoundingPolyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    public com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingPolyOrBuilder() {
      if (boundingPolyBuilder_ != null) {
        return boundingPolyBuilder_.getMessageOrBuilder();
      } else {
        return boundingPoly_ == null
            ? com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance()
            : boundingPoly_;
      }
    }
    /**
     *
     *
     * <pre>
     * The bounding polygon for the crop region. The coordinates of the bounding
     * box are in the original image's scale.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.BoundingPoly,
            com.google.cloud.vision.v1.BoundingPoly.Builder,
            com.google.cloud.vision.v1.BoundingPolyOrBuilder>
        getBoundingPolyFieldBuilder() {
      if (boundingPolyBuilder_ == null) {
        boundingPolyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1.BoundingPoly,
                com.google.cloud.vision.v1.BoundingPoly.Builder,
                com.google.cloud.vision.v1.BoundingPolyOrBuilder>(
                getBoundingPoly(), getParentForChildren(), isClean());
        boundingPoly_ = null;
      }
      return boundingPolyBuilder_;
    }

    private float confidence_;
    /**
     *
     *
     * <pre>
     * Confidence of this being a salient region.  Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public float getConfidence() {
      return confidence_;
    }
    /**
     *
     *
     * <pre>
     * Confidence of this being a salient region.  Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Confidence of this being a salient region.  Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public Builder clearConfidence() {

      confidence_ = 0F;
      onChanged();
      return this;
    }

    private float importanceFraction_;
    /**
     *
     *
     * <pre>
     * Fraction of importance of this salient region with respect to the original
     * image.
     * </pre>
     *
     * <code>float importance_fraction = 3;</code>
     */
    public float getImportanceFraction() {
      return importanceFraction_;
    }
    /**
     *
     *
     * <pre>
     * Fraction of importance of this salient region with respect to the original
     * image.
     * </pre>
     *
     * <code>float importance_fraction = 3;</code>
     */
    public Builder setImportanceFraction(float value) {

      importanceFraction_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fraction of importance of this salient region with respect to the original
     * image.
     * </pre>
     *
     * <code>float importance_fraction = 3;</code>
     */
    public Builder clearImportanceFraction() {

      importanceFraction_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.CropHint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.CropHint)
  private static final com.google.cloud.vision.v1.CropHint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.CropHint();
  }

  public static com.google.cloud.vision.v1.CropHint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CropHint> PARSER =
      new com.google.protobuf.AbstractParser<CropHint>() {
        @java.lang.Override
        public CropHint parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CropHint(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CropHint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CropHint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.CropHint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
