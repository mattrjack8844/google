// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1alpha;

/**
 *
 *
 * <pre>
 * Request for the `UpdateScanConfigRequest` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest}
 */
public final class UpdateScanConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest)
    UpdateScanConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateScanConfigRequest.newBuilder() to construct.
  private UpdateScanConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateScanConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateScanConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateScanConfigRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 18:
            {
              com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder subBuilder = null;
              if (scanConfig_ != null) {
                subBuilder = scanConfig_.toBuilder();
              }
              scanConfig_ =
                  input.readMessage(
                      com.google.cloud.websecurityscanner.v1alpha.ScanConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(scanConfig_);
                scanConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_UpdateScanConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_UpdateScanConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest.class,
            com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest.Builder.class);
  }

  public static final int SCAN_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.websecurityscanner.v1alpha.ScanConfig scanConfig_;
  /**
   *
   *
   * <pre>
   * Required.
   * The ScanConfig to be updated. The name field must be set to identify the
   * resource to be updated. The values of fields not covered by the mask
   * will be ignored.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
   */
  public boolean hasScanConfig() {
    return scanConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The ScanConfig to be updated. The name field must be set to identify the
   * resource to be updated. The values of fields not covered by the mask
   * will be ignored.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
   */
  public com.google.cloud.websecurityscanner.v1alpha.ScanConfig getScanConfig() {
    return scanConfig_ == null
        ? com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance()
        : scanConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The ScanConfig to be updated. The name field must be set to identify the
   * resource to be updated. The values of fields not covered by the mask
   * will be ignored.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
   */
  public com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder getScanConfigOrBuilder() {
    return getScanConfig();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required.
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (scanConfig_ != null) {
      output.writeMessage(2, getScanConfig());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scanConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getScanConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest other =
        (com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest) obj;

    if (hasScanConfig() != other.hasScanConfig()) return false;
    if (hasScanConfig()) {
      if (!getScanConfig().equals(other.getScanConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasScanConfig()) {
      hash = (37 * hash) + SCAN_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getScanConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest prototype) {
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
   * Request for the `UpdateScanConfigRequest` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest)
      com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_UpdateScanConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_UpdateScanConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest.class,
              com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest.newBuilder()
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
      if (scanConfigBuilder_ == null) {
        scanConfig_ = null;
      } else {
        scanConfig_ = null;
        scanConfigBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_UpdateScanConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest build() {
      com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest buildPartial() {
      com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest result =
          new com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest(this);
      if (scanConfigBuilder_ == null) {
        result.scanConfig_ = scanConfig_;
      } else {
        result.scanConfig_ = scanConfigBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest) {
        return mergeFrom(
            (com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest other) {
      if (other
          == com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest
              .getDefaultInstance()) return this;
      if (other.hasScanConfig()) {
        mergeScanConfig(other.getScanConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.websecurityscanner.v1alpha.ScanConfig scanConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>
        scanConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    public boolean hasScanConfig() {
      return scanConfigBuilder_ != null || scanConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfig getScanConfig() {
      if (scanConfigBuilder_ == null) {
        return scanConfig_ == null
            ? com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance()
            : scanConfig_;
      } else {
        return scanConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    public Builder setScanConfig(com.google.cloud.websecurityscanner.v1alpha.ScanConfig value) {
      if (scanConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scanConfig_ = value;
        onChanged();
      } else {
        scanConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    public Builder setScanConfig(
        com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder builderForValue) {
      if (scanConfigBuilder_ == null) {
        scanConfig_ = builderForValue.build();
        onChanged();
      } else {
        scanConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    public Builder mergeScanConfig(com.google.cloud.websecurityscanner.v1alpha.ScanConfig value) {
      if (scanConfigBuilder_ == null) {
        if (scanConfig_ != null) {
          scanConfig_ =
              com.google.cloud.websecurityscanner.v1alpha.ScanConfig.newBuilder(scanConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          scanConfig_ = value;
        }
        onChanged();
      } else {
        scanConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    public Builder clearScanConfig() {
      if (scanConfigBuilder_ == null) {
        scanConfig_ = null;
        onChanged();
      } else {
        scanConfig_ = null;
        scanConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder getScanConfigBuilder() {

      onChanged();
      return getScanConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder
        getScanConfigOrBuilder() {
      if (scanConfigBuilder_ != null) {
        return scanConfigBuilder_.getMessageOrBuilder();
      } else {
        return scanConfig_ == null
            ? com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance()
            : scanConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The ScanConfig to be updated. The name field must be set to identify the
     * resource to be updated. The values of fields not covered by the mask
     * will be ignored.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>
        getScanConfigFieldBuilder() {
      if (scanConfigBuilder_ == null) {
        scanConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
                com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
                com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>(
                getScanConfig(), getParentForChildren(), isClean());
        scanConfig_ = null;
      }
      return scanConfigBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest)
  private static final com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest();
  }

  public static com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateScanConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateScanConfigRequest>() {
        @java.lang.Override
        public UpdateScanConfigRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateScanConfigRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateScanConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateScanConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
