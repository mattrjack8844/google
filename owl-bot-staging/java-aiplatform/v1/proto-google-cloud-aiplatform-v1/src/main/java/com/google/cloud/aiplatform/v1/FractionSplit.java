// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/training_pipeline.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Assigns the input data to training, validation, and test sets as per the
 * given fractions. Any of `training_fraction`, `validation_fraction` and
 * `test_fraction` may optionally be provided, they must sum to up to 1. If the
 * provided ones sum to less than 1, the remainder is assigned to sets as
 * decided by Vertex AI. If none of the fractions are set, by default roughly
 * 80% of data is used for training, 10% for validation, and 10% for test.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.FractionSplit}
 */
public final class FractionSplit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.FractionSplit)
    FractionSplitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FractionSplit.newBuilder() to construct.
  private FractionSplit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FractionSplit() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FractionSplit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_FractionSplit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_FractionSplit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.FractionSplit.class, com.google.cloud.aiplatform.v1.FractionSplit.Builder.class);
  }

  public static final int TRAINING_FRACTION_FIELD_NUMBER = 1;
  private double trainingFraction_ = 0D;
  /**
   * <pre>
   * The fraction of the input data that is to be used to train the Model.
   * </pre>
   *
   * <code>double training_fraction = 1;</code>
   * @return The trainingFraction.
   */
  @java.lang.Override
  public double getTrainingFraction() {
    return trainingFraction_;
  }

  public static final int VALIDATION_FRACTION_FIELD_NUMBER = 2;
  private double validationFraction_ = 0D;
  /**
   * <pre>
   * The fraction of the input data that is to be used to validate the Model.
   * </pre>
   *
   * <code>double validation_fraction = 2;</code>
   * @return The validationFraction.
   */
  @java.lang.Override
  public double getValidationFraction() {
    return validationFraction_;
  }

  public static final int TEST_FRACTION_FIELD_NUMBER = 3;
  private double testFraction_ = 0D;
  /**
   * <pre>
   * The fraction of the input data that is to be used to evaluate the Model.
   * </pre>
   *
   * <code>double test_fraction = 3;</code>
   * @return The testFraction.
   */
  @java.lang.Override
  public double getTestFraction() {
    return testFraction_;
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
    if (java.lang.Double.doubleToRawLongBits(trainingFraction_) != 0) {
      output.writeDouble(1, trainingFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(validationFraction_) != 0) {
      output.writeDouble(2, validationFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(testFraction_) != 0) {
      output.writeDouble(3, testFraction_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(trainingFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, trainingFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(validationFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, validationFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(testFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, testFraction_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.FractionSplit)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.FractionSplit other = (com.google.cloud.aiplatform.v1.FractionSplit) obj;

    if (java.lang.Double.doubleToLongBits(getTrainingFraction())
        != java.lang.Double.doubleToLongBits(
            other.getTrainingFraction())) return false;
    if (java.lang.Double.doubleToLongBits(getValidationFraction())
        != java.lang.Double.doubleToLongBits(
            other.getValidationFraction())) return false;
    if (java.lang.Double.doubleToLongBits(getTestFraction())
        != java.lang.Double.doubleToLongBits(
            other.getTestFraction())) return false;
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
    hash = (37 * hash) + TRAINING_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTrainingFraction()));
    hash = (37 * hash) + VALIDATION_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValidationFraction()));
    hash = (37 * hash) + TEST_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTestFraction()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.FractionSplit parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.FractionSplit prototype) {
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
   * Assigns the input data to training, validation, and test sets as per the
   * given fractions. Any of `training_fraction`, `validation_fraction` and
   * `test_fraction` may optionally be provided, they must sum to up to 1. If the
   * provided ones sum to less than 1, the remainder is assigned to sets as
   * decided by Vertex AI. If none of the fractions are set, by default roughly
   * 80% of data is used for training, 10% for validation, and 10% for test.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.FractionSplit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.FractionSplit)
      com.google.cloud.aiplatform.v1.FractionSplitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_FractionSplit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_FractionSplit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.FractionSplit.class, com.google.cloud.aiplatform.v1.FractionSplit.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.FractionSplit.newBuilder()
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
      trainingFraction_ = 0D;
      validationFraction_ = 0D;
      testFraction_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_FractionSplit_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FractionSplit getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.FractionSplit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FractionSplit build() {
      com.google.cloud.aiplatform.v1.FractionSplit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FractionSplit buildPartial() {
      com.google.cloud.aiplatform.v1.FractionSplit result = new com.google.cloud.aiplatform.v1.FractionSplit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.FractionSplit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trainingFraction_ = trainingFraction_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validationFraction_ = validationFraction_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.testFraction_ = testFraction_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.FractionSplit) {
        return mergeFrom((com.google.cloud.aiplatform.v1.FractionSplit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.FractionSplit other) {
      if (other == com.google.cloud.aiplatform.v1.FractionSplit.getDefaultInstance()) return this;
      if (other.getTrainingFraction() != 0D) {
        setTrainingFraction(other.getTrainingFraction());
      }
      if (other.getValidationFraction() != 0D) {
        setValidationFraction(other.getValidationFraction());
      }
      if (other.getTestFraction() != 0D) {
        setTestFraction(other.getTestFraction());
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
            case 9: {
              trainingFraction_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              validationFraction_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 25: {
              testFraction_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
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

    private double trainingFraction_ ;
    /**
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     * @return The trainingFraction.
     */
    @java.lang.Override
    public double getTrainingFraction() {
      return trainingFraction_;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     * @param value The trainingFraction to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingFraction(double value) {
      
      trainingFraction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainingFraction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      trainingFraction_ = 0D;
      onChanged();
      return this;
    }

    private double validationFraction_ ;
    /**
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     * @return The validationFraction.
     */
    @java.lang.Override
    public double getValidationFraction() {
      return validationFraction_;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     * @param value The validationFraction to set.
     * @return This builder for chaining.
     */
    public Builder setValidationFraction(double value) {
      
      validationFraction_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidationFraction() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validationFraction_ = 0D;
      onChanged();
      return this;
    }

    private double testFraction_ ;
    /**
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     * @return The testFraction.
     */
    @java.lang.Override
    public double getTestFraction() {
      return testFraction_;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     * @param value The testFraction to set.
     * @return This builder for chaining.
     */
    public Builder setTestFraction(double value) {
      
      testFraction_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTestFraction() {
      bitField0_ = (bitField0_ & ~0x00000004);
      testFraction_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.FractionSplit)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.FractionSplit)
  private static final com.google.cloud.aiplatform.v1.FractionSplit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.FractionSplit();
  }

  public static com.google.cloud.aiplatform.v1.FractionSplit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FractionSplit>
      PARSER = new com.google.protobuf.AbstractParser<FractionSplit>() {
    @java.lang.Override
    public FractionSplit parsePartialFrom(
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

  public static com.google.protobuf.Parser<FractionSplit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FractionSplit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FractionSplit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

