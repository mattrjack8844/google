// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Segment of the content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.Segment}
 */
public final class Segment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.Segment)
    SegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Segment.newBuilder() to construct.
  private Segment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Segment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Segment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ContentProto.internal_static_google_cloud_aiplatform_v1beta1_Segment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ContentProto.internal_static_google_cloud_aiplatform_v1beta1_Segment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.Segment.class, com.google.cloud.aiplatform.v1beta1.Segment.Builder.class);
  }

  public static final int PART_INDEX_FIELD_NUMBER = 1;
  private int partIndex_ = 0;
  /**
   * <pre>
   * Output only. The index of a Part object within its parent Content object.
   * </pre>
   *
   * <code>int32 part_index = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The partIndex.
   */
  @java.lang.Override
  public int getPartIndex() {
    return partIndex_;
  }

  public static final int START_INDEX_FIELD_NUMBER = 2;
  private int startIndex_ = 0;
  /**
   * <pre>
   * Output only. Start index in the given Part, measured in bytes. Offset from
   * the start of the Part, inclusive, starting at zero.
   * </pre>
   *
   * <code>int32 start_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startIndex.
   */
  @java.lang.Override
  public int getStartIndex() {
    return startIndex_;
  }

  public static final int END_INDEX_FIELD_NUMBER = 3;
  private int endIndex_ = 0;
  /**
   * <pre>
   * Output only. End index in the given Part, measured in bytes. Offset from
   * the start of the Part, exclusive, starting at zero.
   * </pre>
   *
   * <code>int32 end_index = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endIndex.
   */
  @java.lang.Override
  public int getEndIndex() {
    return endIndex_;
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
    if (partIndex_ != 0) {
      output.writeInt32(1, partIndex_);
    }
    if (startIndex_ != 0) {
      output.writeInt32(2, startIndex_);
    }
    if (endIndex_ != 0) {
      output.writeInt32(3, endIndex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, partIndex_);
    }
    if (startIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, startIndex_);
    }
    if (endIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, endIndex_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.Segment)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.Segment other = (com.google.cloud.aiplatform.v1beta1.Segment) obj;

    if (getPartIndex()
        != other.getPartIndex()) return false;
    if (getStartIndex()
        != other.getStartIndex()) return false;
    if (getEndIndex()
        != other.getEndIndex()) return false;
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
    hash = (37 * hash) + PART_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getPartIndex();
    hash = (37 * hash) + START_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getStartIndex();
    hash = (37 * hash) + END_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getEndIndex();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Segment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.Segment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.Segment parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.Segment prototype) {
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
   * Segment of the content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.Segment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.Segment)
      com.google.cloud.aiplatform.v1beta1.SegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto.internal_static_google_cloud_aiplatform_v1beta1_Segment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto.internal_static_google_cloud_aiplatform_v1beta1_Segment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.Segment.class, com.google.cloud.aiplatform.v1beta1.Segment.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.Segment.newBuilder()
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
      partIndex_ = 0;
      startIndex_ = 0;
      endIndex_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto.internal_static_google_cloud_aiplatform_v1beta1_Segment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Segment getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.Segment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Segment build() {
      com.google.cloud.aiplatform.v1beta1.Segment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Segment buildPartial() {
      com.google.cloud.aiplatform.v1beta1.Segment result = new com.google.cloud.aiplatform.v1beta1.Segment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.Segment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.partIndex_ = partIndex_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startIndex_ = startIndex_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endIndex_ = endIndex_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.Segment) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.Segment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.Segment other) {
      if (other == com.google.cloud.aiplatform.v1beta1.Segment.getDefaultInstance()) return this;
      if (other.getPartIndex() != 0) {
        setPartIndex(other.getPartIndex());
      }
      if (other.getStartIndex() != 0) {
        setStartIndex(other.getStartIndex());
      }
      if (other.getEndIndex() != 0) {
        setEndIndex(other.getEndIndex());
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
              partIndex_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              startIndex_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              endIndex_ = input.readInt32();
              bitField0_ |= 0x00000004;
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

    private int partIndex_ ;
    /**
     * <pre>
     * Output only. The index of a Part object within its parent Content object.
     * </pre>
     *
     * <code>int32 part_index = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The partIndex.
     */
    @java.lang.Override
    public int getPartIndex() {
      return partIndex_;
    }
    /**
     * <pre>
     * Output only. The index of a Part object within its parent Content object.
     * </pre>
     *
     * <code>int32 part_index = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The partIndex to set.
     * @return This builder for chaining.
     */
    public Builder setPartIndex(int value) {

      partIndex_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The index of a Part object within its parent Content object.
     * </pre>
     *
     * <code>int32 part_index = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearPartIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      partIndex_ = 0;
      onChanged();
      return this;
    }

    private int startIndex_ ;
    /**
     * <pre>
     * Output only. Start index in the given Part, measured in bytes. Offset from
     * the start of the Part, inclusive, starting at zero.
     * </pre>
     *
     * <code>int32 start_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The startIndex.
     */
    @java.lang.Override
    public int getStartIndex() {
      return startIndex_;
    }
    /**
     * <pre>
     * Output only. Start index in the given Part, measured in bytes. Offset from
     * the start of the Part, inclusive, starting at zero.
     * </pre>
     *
     * <code>int32 start_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The startIndex to set.
     * @return This builder for chaining.
     */
    public Builder setStartIndex(int value) {

      startIndex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Start index in the given Part, measured in bytes. Offset from
     * the start of the Part, inclusive, starting at zero.
     * </pre>
     *
     * <code>int32 start_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startIndex_ = 0;
      onChanged();
      return this;
    }

    private int endIndex_ ;
    /**
     * <pre>
     * Output only. End index in the given Part, measured in bytes. Offset from
     * the start of the Part, exclusive, starting at zero.
     * </pre>
     *
     * <code>int32 end_index = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The endIndex.
     */
    @java.lang.Override
    public int getEndIndex() {
      return endIndex_;
    }
    /**
     * <pre>
     * Output only. End index in the given Part, measured in bytes. Offset from
     * the start of the Part, exclusive, starting at zero.
     * </pre>
     *
     * <code>int32 end_index = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The endIndex to set.
     * @return This builder for chaining.
     */
    public Builder setEndIndex(int value) {

      endIndex_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. End index in the given Part, measured in bytes. Offset from
     * the start of the Part, exclusive, starting at zero.
     * </pre>
     *
     * <code>int32 end_index = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearEndIndex() {
      bitField0_ = (bitField0_ & ~0x00000004);
      endIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.Segment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.Segment)
  private static final com.google.cloud.aiplatform.v1beta1.Segment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.Segment();
  }

  public static com.google.cloud.aiplatform.v1beta1.Segment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Segment>
      PARSER = new com.google.protobuf.AbstractParser<Segment>() {
    @java.lang.Override
    public Segment parsePartialFrom(
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

  public static com.google.protobuf.Parser<Segment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Segment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Segment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

