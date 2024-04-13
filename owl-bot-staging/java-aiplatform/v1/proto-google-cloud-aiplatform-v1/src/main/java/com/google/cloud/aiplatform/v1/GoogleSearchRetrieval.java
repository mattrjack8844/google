// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Tool to retrieve public web data for grounding, powered by Google.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.GoogleSearchRetrieval}
 */
public final class GoogleSearchRetrieval extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.GoogleSearchRetrieval)
    GoogleSearchRetrievalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GoogleSearchRetrieval.newBuilder() to construct.
  private GoogleSearchRetrieval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GoogleSearchRetrieval() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GoogleSearchRetrieval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.ToolProto.internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ToolProto.internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.GoogleSearchRetrieval.class, com.google.cloud.aiplatform.v1.GoogleSearchRetrieval.Builder.class);
  }

  public static final int DISABLE_ATTRIBUTION_FIELD_NUMBER = 1;
  private boolean disableAttribution_ = false;
  /**
   * <pre>
   * Optional. Disable using the result from this tool in detecting grounding
   * attribution. This does not affect how the result is given to the model for
   * generation.
   * </pre>
   *
   * <code>bool disable_attribution = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The disableAttribution.
   */
  @java.lang.Override
  public boolean getDisableAttribution() {
    return disableAttribution_;
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
    if (disableAttribution_ != false) {
      output.writeBool(1, disableAttribution_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (disableAttribution_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, disableAttribution_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.GoogleSearchRetrieval)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.GoogleSearchRetrieval other = (com.google.cloud.aiplatform.v1.GoogleSearchRetrieval) obj;

    if (getDisableAttribution()
        != other.getDisableAttribution()) return false;
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
    hash = (37 * hash) + DISABLE_ATTRIBUTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisableAttribution());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.GoogleSearchRetrieval prototype) {
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
   * Tool to retrieve public web data for grounding, powered by Google.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.GoogleSearchRetrieval}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.GoogleSearchRetrieval)
      com.google.cloud.aiplatform.v1.GoogleSearchRetrievalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ToolProto.internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ToolProto.internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.GoogleSearchRetrieval.class, com.google.cloud.aiplatform.v1.GoogleSearchRetrieval.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.GoogleSearchRetrieval.newBuilder()
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
      disableAttribution_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ToolProto.internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.GoogleSearchRetrieval getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.GoogleSearchRetrieval.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.GoogleSearchRetrieval build() {
      com.google.cloud.aiplatform.v1.GoogleSearchRetrieval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.GoogleSearchRetrieval buildPartial() {
      com.google.cloud.aiplatform.v1.GoogleSearchRetrieval result = new com.google.cloud.aiplatform.v1.GoogleSearchRetrieval(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.GoogleSearchRetrieval result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.disableAttribution_ = disableAttribution_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.GoogleSearchRetrieval) {
        return mergeFrom((com.google.cloud.aiplatform.v1.GoogleSearchRetrieval)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.GoogleSearchRetrieval other) {
      if (other == com.google.cloud.aiplatform.v1.GoogleSearchRetrieval.getDefaultInstance()) return this;
      if (other.getDisableAttribution() != false) {
        setDisableAttribution(other.getDisableAttribution());
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
              disableAttribution_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean disableAttribution_ ;
    /**
     * <pre>
     * Optional. Disable using the result from this tool in detecting grounding
     * attribution. This does not affect how the result is given to the model for
     * generation.
     * </pre>
     *
     * <code>bool disable_attribution = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The disableAttribution.
     */
    @java.lang.Override
    public boolean getDisableAttribution() {
      return disableAttribution_;
    }
    /**
     * <pre>
     * Optional. Disable using the result from this tool in detecting grounding
     * attribution. This does not affect how the result is given to the model for
     * generation.
     * </pre>
     *
     * <code>bool disable_attribution = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The disableAttribution to set.
     * @return This builder for chaining.
     */
    public Builder setDisableAttribution(boolean value) {

      disableAttribution_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Disable using the result from this tool in detecting grounding
     * attribution. This does not affect how the result is given to the model for
     * generation.
     * </pre>
     *
     * <code>bool disable_attribution = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisableAttribution() {
      bitField0_ = (bitField0_ & ~0x00000001);
      disableAttribution_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.GoogleSearchRetrieval)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.GoogleSearchRetrieval)
  private static final com.google.cloud.aiplatform.v1.GoogleSearchRetrieval DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.GoogleSearchRetrieval();
  }

  public static com.google.cloud.aiplatform.v1.GoogleSearchRetrieval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleSearchRetrieval>
      PARSER = new com.google.protobuf.AbstractParser<GoogleSearchRetrieval>() {
    @java.lang.Override
    public GoogleSearchRetrieval parsePartialFrom(
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

  public static com.google.protobuf.Parser<GoogleSearchRetrieval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleSearchRetrieval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GoogleSearchRetrieval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

