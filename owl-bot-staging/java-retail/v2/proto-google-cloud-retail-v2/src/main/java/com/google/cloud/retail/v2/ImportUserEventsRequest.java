// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/import_config.proto

package com.google.cloud.retail.v2;

/**
 * <pre>
 * Request message for the ImportUserEvents request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.ImportUserEventsRequest}
 */
public final class ImportUserEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.ImportUserEventsRequest)
    ImportUserEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportUserEventsRequest.newBuilder() to construct.
  private ImportUserEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportUserEventsRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportUserEventsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2.ImportConfigProto.internal_static_google_cloud_retail_v2_ImportUserEventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.ImportConfigProto.internal_static_google_cloud_retail_v2_ImportUserEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.ImportUserEventsRequest.class, com.google.cloud.retail.v2.ImportUserEventsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. `projects/1234/locations/global/catalogs/default_catalog`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. `projects/1234/locations/global/catalogs/default_catalog`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.retail.v2.UserEventInputConfig inputConfig_;
  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the inputConfig field is set.
   */
  @java.lang.Override
  public boolean hasInputConfig() {
    return inputConfig_ != null;
  }
  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inputConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.UserEventInputConfig getInputConfig() {
    return inputConfig_ == null ? com.google.cloud.retail.v2.UserEventInputConfig.getDefaultInstance() : inputConfig_;
  }
  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.UserEventInputConfigOrBuilder getInputConfigOrBuilder() {
    return inputConfig_ == null ? com.google.cloud.retail.v2.UserEventInputConfig.getDefaultInstance() : inputConfig_;
  }

  public static final int ERRORS_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.retail.v2.ImportErrorsConfig errorsConfig_;
  /**
   * <pre>
   * The desired location of errors incurred during the Import. Cannot be set
   * for inline user event imports.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   * @return Whether the errorsConfig field is set.
   */
  @java.lang.Override
  public boolean hasErrorsConfig() {
    return errorsConfig_ != null;
  }
  /**
   * <pre>
   * The desired location of errors incurred during the Import. Cannot be set
   * for inline user event imports.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   * @return The errorsConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ImportErrorsConfig getErrorsConfig() {
    return errorsConfig_ == null ? com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance() : errorsConfig_;
  }
  /**
   * <pre>
   * The desired location of errors incurred during the Import. Cannot be set
   * for inline user event imports.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder getErrorsConfigOrBuilder() {
    return errorsConfig_ == null ? com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance() : errorsConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (inputConfig_ != null) {
      output.writeMessage(2, getInputConfig());
    }
    if (errorsConfig_ != null) {
      output.writeMessage(3, getErrorsConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (inputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInputConfig());
    }
    if (errorsConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getErrorsConfig());
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
    if (!(obj instanceof com.google.cloud.retail.v2.ImportUserEventsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.ImportUserEventsRequest other = (com.google.cloud.retail.v2.ImportUserEventsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig()
          .equals(other.getInputConfig())) return false;
    }
    if (hasErrorsConfig() != other.hasErrorsConfig()) return false;
    if (hasErrorsConfig()) {
      if (!getErrorsConfig()
          .equals(other.getErrorsConfig())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    if (hasErrorsConfig()) {
      hash = (37 * hash) + ERRORS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.ImportUserEventsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2.ImportUserEventsRequest prototype) {
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
   * Request message for the ImportUserEvents request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.ImportUserEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.ImportUserEventsRequest)
      com.google.cloud.retail.v2.ImportUserEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2.ImportConfigProto.internal_static_google_cloud_retail_v2_ImportUserEventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.ImportConfigProto.internal_static_google_cloud_retail_v2_ImportUserEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.ImportUserEventsRequest.class, com.google.cloud.retail.v2.ImportUserEventsRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.ImportUserEventsRequest.newBuilder()
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
      parent_ = "";
      inputConfig_ = null;
      if (inputConfigBuilder_ != null) {
        inputConfigBuilder_.dispose();
        inputConfigBuilder_ = null;
      }
      errorsConfig_ = null;
      if (errorsConfigBuilder_ != null) {
        errorsConfigBuilder_.dispose();
        errorsConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2.ImportConfigProto.internal_static_google_cloud_retail_v2_ImportUserEventsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ImportUserEventsRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.ImportUserEventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ImportUserEventsRequest build() {
      com.google.cloud.retail.v2.ImportUserEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ImportUserEventsRequest buildPartial() {
      com.google.cloud.retail.v2.ImportUserEventsRequest result = new com.google.cloud.retail.v2.ImportUserEventsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2.ImportUserEventsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.inputConfig_ = inputConfigBuilder_ == null
            ? inputConfig_
            : inputConfigBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.errorsConfig_ = errorsConfigBuilder_ == null
            ? errorsConfig_
            : errorsConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.retail.v2.ImportUserEventsRequest) {
        return mergeFrom((com.google.cloud.retail.v2.ImportUserEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.ImportUserEventsRequest other) {
      if (other == com.google.cloud.retail.v2.ImportUserEventsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
      }
      if (other.hasErrorsConfig()) {
        mergeErrorsConfig(other.getErrorsConfig());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getInputConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getErrorsConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. `projects/1234/locations/global/catalogs/default_catalog`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. `projects/1234/locations/global/catalogs/default_catalog`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. `projects/1234/locations/global/catalogs/default_catalog`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. `projects/1234/locations/global/catalogs/default_catalog`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. `projects/1234/locations/global/catalogs/default_catalog`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.retail.v2.UserEventInputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2.UserEventInputConfig, com.google.cloud.retail.v2.UserEventInputConfig.Builder, com.google.cloud.retail.v2.UserEventInputConfigOrBuilder> inputConfigBuilder_;
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the inputConfig field is set.
     */
    public boolean hasInputConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The inputConfig.
     */
    public com.google.cloud.retail.v2.UserEventInputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null ? com.google.cloud.retail.v2.UserEventInputConfig.getDefaultInstance() : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInputConfig(com.google.cloud.retail.v2.UserEventInputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputConfig_ = value;
      } else {
        inputConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInputConfig(
        com.google.cloud.retail.v2.UserEventInputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = builderForValue.build();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeInputConfig(com.google.cloud.retail.v2.UserEventInputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          inputConfig_ != null &&
          inputConfig_ != com.google.cloud.retail.v2.UserEventInputConfig.getDefaultInstance()) {
          getInputConfigBuilder().mergeFrom(value);
        } else {
          inputConfig_ = value;
        }
      } else {
        inputConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearInputConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2.UserEventInputConfig.Builder getInputConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2.UserEventInputConfigOrBuilder getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null ?
            com.google.cloud.retail.v2.UserEventInputConfig.getDefaultInstance() : inputConfig_;
      }
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2.UserEventInputConfig, com.google.cloud.retail.v2.UserEventInputConfig.Builder, com.google.cloud.retail.v2.UserEventInputConfigOrBuilder> 
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2.UserEventInputConfig, com.google.cloud.retail.v2.UserEventInputConfig.Builder, com.google.cloud.retail.v2.UserEventInputConfigOrBuilder>(
                getInputConfig(),
                getParentForChildren(),
                isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
    }

    private com.google.cloud.retail.v2.ImportErrorsConfig errorsConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2.ImportErrorsConfig, com.google.cloud.retail.v2.ImportErrorsConfig.Builder, com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder> errorsConfigBuilder_;
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     * @return Whether the errorsConfig field is set.
     */
    public boolean hasErrorsConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     * @return The errorsConfig.
     */
    public com.google.cloud.retail.v2.ImportErrorsConfig getErrorsConfig() {
      if (errorsConfigBuilder_ == null) {
        return errorsConfig_ == null ? com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance() : errorsConfig_;
      } else {
        return errorsConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     */
    public Builder setErrorsConfig(com.google.cloud.retail.v2.ImportErrorsConfig value) {
      if (errorsConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errorsConfig_ = value;
      } else {
        errorsConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     */
    public Builder setErrorsConfig(
        com.google.cloud.retail.v2.ImportErrorsConfig.Builder builderForValue) {
      if (errorsConfigBuilder_ == null) {
        errorsConfig_ = builderForValue.build();
      } else {
        errorsConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     */
    public Builder mergeErrorsConfig(com.google.cloud.retail.v2.ImportErrorsConfig value) {
      if (errorsConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          errorsConfig_ != null &&
          errorsConfig_ != com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance()) {
          getErrorsConfigBuilder().mergeFrom(value);
        } else {
          errorsConfig_ = value;
        }
      } else {
        errorsConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     */
    public Builder clearErrorsConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      errorsConfig_ = null;
      if (errorsConfigBuilder_ != null) {
        errorsConfigBuilder_.dispose();
        errorsConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     */
    public com.google.cloud.retail.v2.ImportErrorsConfig.Builder getErrorsConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getErrorsConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     */
    public com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder getErrorsConfigOrBuilder() {
      if (errorsConfigBuilder_ != null) {
        return errorsConfigBuilder_.getMessageOrBuilder();
      } else {
        return errorsConfig_ == null ?
            com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance() : errorsConfig_;
      }
    }
    /**
     * <pre>
     * The desired location of errors incurred during the Import. Cannot be set
     * for inline user event imports.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2.ImportErrorsConfig, com.google.cloud.retail.v2.ImportErrorsConfig.Builder, com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder> 
        getErrorsConfigFieldBuilder() {
      if (errorsConfigBuilder_ == null) {
        errorsConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2.ImportErrorsConfig, com.google.cloud.retail.v2.ImportErrorsConfig.Builder, com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder>(
                getErrorsConfig(),
                getParentForChildren(),
                isClean());
        errorsConfig_ = null;
      }
      return errorsConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.ImportUserEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.ImportUserEventsRequest)
  private static final com.google.cloud.retail.v2.ImportUserEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.ImportUserEventsRequest();
  }

  public static com.google.cloud.retail.v2.ImportUserEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportUserEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImportUserEventsRequest>() {
    @java.lang.Override
    public ImportUserEventsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportUserEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportUserEventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.ImportUserEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

