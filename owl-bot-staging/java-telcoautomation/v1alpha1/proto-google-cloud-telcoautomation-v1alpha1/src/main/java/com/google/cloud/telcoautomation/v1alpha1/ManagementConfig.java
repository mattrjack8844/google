// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1alpha1;

/**
 * <pre>
 * Configuration of the cluster management
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.ManagementConfig}
 */
public final class ManagementConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1alpha1.ManagementConfig)
    ManagementConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManagementConfig.newBuilder() to construct.
  private ManagementConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManagementConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManagementConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ManagementConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ManagementConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1alpha1.ManagementConfig.class, com.google.cloud.telcoautomation.v1alpha1.ManagementConfig.Builder.class);
  }

  private int oneofConfigCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object oneofConfig_;
  public enum OneofConfigCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STANDARD_MANAGEMENT_CONFIG(1),
    FULL_MANAGEMENT_CONFIG(2),
    ONEOFCONFIG_NOT_SET(0);
    private final int value;
    private OneofConfigCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OneofConfigCase valueOf(int value) {
      return forNumber(value);
    }

    public static OneofConfigCase forNumber(int value) {
      switch (value) {
        case 1: return STANDARD_MANAGEMENT_CONFIG;
        case 2: return FULL_MANAGEMENT_CONFIG;
        case 0: return ONEOFCONFIG_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OneofConfigCase
  getOneofConfigCase() {
    return OneofConfigCase.forNumber(
        oneofConfigCase_);
  }

  public static final int STANDARD_MANAGEMENT_CONFIG_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Configuration of the standard (GKE) cluster management
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
   * @return Whether the standardManagementConfig field is set.
   */
  @java.lang.Override
  public boolean hasStandardManagementConfig() {
    return oneofConfigCase_ == 1;
  }
  /**
   * <pre>
   * Configuration of the standard (GKE) cluster management
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
   * @return The standardManagementConfig.
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig getStandardManagementConfig() {
    if (oneofConfigCase_ == 1) {
       return (com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig) oneofConfig_;
    }
    return com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * Configuration of the standard (GKE) cluster management
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfigOrBuilder getStandardManagementConfigOrBuilder() {
    if (oneofConfigCase_ == 1) {
       return (com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig) oneofConfig_;
    }
    return com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.getDefaultInstance();
  }

  public static final int FULL_MANAGEMENT_CONFIG_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Configuration of the full (Autopilot) cluster management. Full cluster
   * management is a preview feature.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
   * @return Whether the fullManagementConfig field is set.
   */
  @java.lang.Override
  public boolean hasFullManagementConfig() {
    return oneofConfigCase_ == 2;
  }
  /**
   * <pre>
   * Configuration of the full (Autopilot) cluster management. Full cluster
   * management is a preview feature.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
   * @return The fullManagementConfig.
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig getFullManagementConfig() {
    if (oneofConfigCase_ == 2) {
       return (com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig) oneofConfig_;
    }
    return com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * Configuration of the full (Autopilot) cluster management. Full cluster
   * management is a preview feature.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.FullManagementConfigOrBuilder getFullManagementConfigOrBuilder() {
    if (oneofConfigCase_ == 2) {
       return (com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig) oneofConfig_;
    }
    return com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.getDefaultInstance();
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
    if (oneofConfigCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig) oneofConfig_);
    }
    if (oneofConfigCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig) oneofConfig_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oneofConfigCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig) oneofConfig_);
    }
    if (oneofConfigCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig) oneofConfig_);
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
    if (!(obj instanceof com.google.cloud.telcoautomation.v1alpha1.ManagementConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1alpha1.ManagementConfig other = (com.google.cloud.telcoautomation.v1alpha1.ManagementConfig) obj;

    if (!getOneofConfigCase().equals(other.getOneofConfigCase())) return false;
    switch (oneofConfigCase_) {
      case 1:
        if (!getStandardManagementConfig()
            .equals(other.getStandardManagementConfig())) return false;
        break;
      case 2:
        if (!getFullManagementConfig()
            .equals(other.getFullManagementConfig())) return false;
        break;
      case 0:
      default:
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
    switch (oneofConfigCase_) {
      case 1:
        hash = (37 * hash) + STANDARD_MANAGEMENT_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getStandardManagementConfig().hashCode();
        break;
      case 2:
        hash = (37 * hash) + FULL_MANAGEMENT_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getFullManagementConfig().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.telcoautomation.v1alpha1.ManagementConfig prototype) {
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
   * Configuration of the cluster management
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.ManagementConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1alpha1.ManagementConfig)
      com.google.cloud.telcoautomation.v1alpha1.ManagementConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ManagementConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ManagementConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1alpha1.ManagementConfig.class, com.google.cloud.telcoautomation.v1alpha1.ManagementConfig.Builder.class);
    }

    // Construct using com.google.cloud.telcoautomation.v1alpha1.ManagementConfig.newBuilder()
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
      if (standardManagementConfigBuilder_ != null) {
        standardManagementConfigBuilder_.clear();
      }
      if (fullManagementConfigBuilder_ != null) {
        fullManagementConfigBuilder_.clear();
      }
      oneofConfigCase_ = 0;
      oneofConfig_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_ManagementConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.ManagementConfig getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1alpha1.ManagementConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.ManagementConfig build() {
      com.google.cloud.telcoautomation.v1alpha1.ManagementConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.ManagementConfig buildPartial() {
      com.google.cloud.telcoautomation.v1alpha1.ManagementConfig result = new com.google.cloud.telcoautomation.v1alpha1.ManagementConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.telcoautomation.v1alpha1.ManagementConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.telcoautomation.v1alpha1.ManagementConfig result) {
      result.oneofConfigCase_ = oneofConfigCase_;
      result.oneofConfig_ = this.oneofConfig_;
      if (oneofConfigCase_ == 1 &&
          standardManagementConfigBuilder_ != null) {
        result.oneofConfig_ = standardManagementConfigBuilder_.build();
      }
      if (oneofConfigCase_ == 2 &&
          fullManagementConfigBuilder_ != null) {
        result.oneofConfig_ = fullManagementConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.telcoautomation.v1alpha1.ManagementConfig) {
        return mergeFrom((com.google.cloud.telcoautomation.v1alpha1.ManagementConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.telcoautomation.v1alpha1.ManagementConfig other) {
      if (other == com.google.cloud.telcoautomation.v1alpha1.ManagementConfig.getDefaultInstance()) return this;
      switch (other.getOneofConfigCase()) {
        case STANDARD_MANAGEMENT_CONFIG: {
          mergeStandardManagementConfig(other.getStandardManagementConfig());
          break;
        }
        case FULL_MANAGEMENT_CONFIG: {
          mergeFullManagementConfig(other.getFullManagementConfig());
          break;
        }
        case ONEOFCONFIG_NOT_SET: {
          break;
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
                  getStandardManagementConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              oneofConfigCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFullManagementConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              oneofConfigCase_ = 2;
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
    private int oneofConfigCase_ = 0;
    private java.lang.Object oneofConfig_;
    public OneofConfigCase
        getOneofConfigCase() {
      return OneofConfigCase.forNumber(
          oneofConfigCase_);
    }

    public Builder clearOneofConfig() {
      oneofConfigCase_ = 0;
      oneofConfig_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig, com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.Builder, com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfigOrBuilder> standardManagementConfigBuilder_;
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     * @return Whether the standardManagementConfig field is set.
     */
    @java.lang.Override
    public boolean hasStandardManagementConfig() {
      return oneofConfigCase_ == 1;
    }
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     * @return The standardManagementConfig.
     */
    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig getStandardManagementConfig() {
      if (standardManagementConfigBuilder_ == null) {
        if (oneofConfigCase_ == 1) {
          return (com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig) oneofConfig_;
        }
        return com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.getDefaultInstance();
      } else {
        if (oneofConfigCase_ == 1) {
          return standardManagementConfigBuilder_.getMessage();
        }
        return com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     */
    public Builder setStandardManagementConfig(com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig value) {
      if (standardManagementConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneofConfig_ = value;
        onChanged();
      } else {
        standardManagementConfigBuilder_.setMessage(value);
      }
      oneofConfigCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     */
    public Builder setStandardManagementConfig(
        com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.Builder builderForValue) {
      if (standardManagementConfigBuilder_ == null) {
        oneofConfig_ = builderForValue.build();
        onChanged();
      } else {
        standardManagementConfigBuilder_.setMessage(builderForValue.build());
      }
      oneofConfigCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     */
    public Builder mergeStandardManagementConfig(com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig value) {
      if (standardManagementConfigBuilder_ == null) {
        if (oneofConfigCase_ == 1 &&
            oneofConfig_ != com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.getDefaultInstance()) {
          oneofConfig_ = com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.newBuilder((com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig) oneofConfig_)
              .mergeFrom(value).buildPartial();
        } else {
          oneofConfig_ = value;
        }
        onChanged();
      } else {
        if (oneofConfigCase_ == 1) {
          standardManagementConfigBuilder_.mergeFrom(value);
        } else {
          standardManagementConfigBuilder_.setMessage(value);
        }
      }
      oneofConfigCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     */
    public Builder clearStandardManagementConfig() {
      if (standardManagementConfigBuilder_ == null) {
        if (oneofConfigCase_ == 1) {
          oneofConfigCase_ = 0;
          oneofConfig_ = null;
          onChanged();
        }
      } else {
        if (oneofConfigCase_ == 1) {
          oneofConfigCase_ = 0;
          oneofConfig_ = null;
        }
        standardManagementConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.Builder getStandardManagementConfigBuilder() {
      return getStandardManagementConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfigOrBuilder getStandardManagementConfigOrBuilder() {
      if ((oneofConfigCase_ == 1) && (standardManagementConfigBuilder_ != null)) {
        return standardManagementConfigBuilder_.getMessageOrBuilder();
      } else {
        if (oneofConfigCase_ == 1) {
          return (com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig) oneofConfig_;
        }
        return com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Configuration of the standard (GKE) cluster management
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig, com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.Builder, com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfigOrBuilder> 
        getStandardManagementConfigFieldBuilder() {
      if (standardManagementConfigBuilder_ == null) {
        if (!(oneofConfigCase_ == 1)) {
          oneofConfig_ = com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.getDefaultInstance();
        }
        standardManagementConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig, com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig.Builder, com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfigOrBuilder>(
                (com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig) oneofConfig_,
                getParentForChildren(),
                isClean());
        oneofConfig_ = null;
      }
      oneofConfigCase_ = 1;
      onChanged();
      return standardManagementConfigBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig, com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.Builder, com.google.cloud.telcoautomation.v1alpha1.FullManagementConfigOrBuilder> fullManagementConfigBuilder_;
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     * @return Whether the fullManagementConfig field is set.
     */
    @java.lang.Override
    public boolean hasFullManagementConfig() {
      return oneofConfigCase_ == 2;
    }
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     * @return The fullManagementConfig.
     */
    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig getFullManagementConfig() {
      if (fullManagementConfigBuilder_ == null) {
        if (oneofConfigCase_ == 2) {
          return (com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig) oneofConfig_;
        }
        return com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.getDefaultInstance();
      } else {
        if (oneofConfigCase_ == 2) {
          return fullManagementConfigBuilder_.getMessage();
        }
        return com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     */
    public Builder setFullManagementConfig(com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig value) {
      if (fullManagementConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneofConfig_ = value;
        onChanged();
      } else {
        fullManagementConfigBuilder_.setMessage(value);
      }
      oneofConfigCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     */
    public Builder setFullManagementConfig(
        com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.Builder builderForValue) {
      if (fullManagementConfigBuilder_ == null) {
        oneofConfig_ = builderForValue.build();
        onChanged();
      } else {
        fullManagementConfigBuilder_.setMessage(builderForValue.build());
      }
      oneofConfigCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     */
    public Builder mergeFullManagementConfig(com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig value) {
      if (fullManagementConfigBuilder_ == null) {
        if (oneofConfigCase_ == 2 &&
            oneofConfig_ != com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.getDefaultInstance()) {
          oneofConfig_ = com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.newBuilder((com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig) oneofConfig_)
              .mergeFrom(value).buildPartial();
        } else {
          oneofConfig_ = value;
        }
        onChanged();
      } else {
        if (oneofConfigCase_ == 2) {
          fullManagementConfigBuilder_.mergeFrom(value);
        } else {
          fullManagementConfigBuilder_.setMessage(value);
        }
      }
      oneofConfigCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     */
    public Builder clearFullManagementConfig() {
      if (fullManagementConfigBuilder_ == null) {
        if (oneofConfigCase_ == 2) {
          oneofConfigCase_ = 0;
          oneofConfig_ = null;
          onChanged();
        }
      } else {
        if (oneofConfigCase_ == 2) {
          oneofConfigCase_ = 0;
          oneofConfig_ = null;
        }
        fullManagementConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.Builder getFullManagementConfigBuilder() {
      return getFullManagementConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.FullManagementConfigOrBuilder getFullManagementConfigOrBuilder() {
      if ((oneofConfigCase_ == 2) && (fullManagementConfigBuilder_ != null)) {
        return fullManagementConfigBuilder_.getMessageOrBuilder();
      } else {
        if (oneofConfigCase_ == 2) {
          return (com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig) oneofConfig_;
        }
        return com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Configuration of the full (Autopilot) cluster management. Full cluster
     * management is a preview feature.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig, com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.Builder, com.google.cloud.telcoautomation.v1alpha1.FullManagementConfigOrBuilder> 
        getFullManagementConfigFieldBuilder() {
      if (fullManagementConfigBuilder_ == null) {
        if (!(oneofConfigCase_ == 2)) {
          oneofConfig_ = com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.getDefaultInstance();
        }
        fullManagementConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig, com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig.Builder, com.google.cloud.telcoautomation.v1alpha1.FullManagementConfigOrBuilder>(
                (com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig) oneofConfig_,
                getParentForChildren(),
                isClean());
        oneofConfig_ = null;
      }
      oneofConfigCase_ = 2;
      onChanged();
      return fullManagementConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1alpha1.ManagementConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1alpha1.ManagementConfig)
  private static final com.google.cloud.telcoautomation.v1alpha1.ManagementConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.telcoautomation.v1alpha1.ManagementConfig();
  }

  public static com.google.cloud.telcoautomation.v1alpha1.ManagementConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagementConfig>
      PARSER = new com.google.protobuf.AbstractParser<ManagementConfig>() {
    @java.lang.Override
    public ManagementConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManagementConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagementConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.ManagementConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

