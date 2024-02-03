/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1beta1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1beta1;

/**
 *
 *
 * <pre>
 * A [ReusableConfigWrapper][google.cloud.security.privateca.v1beta1.ReusableConfigWrapper] describes values that may assist in creating an
 * X.509 certificate, or a reference to a pre-defined set of values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.privateca.v1beta1.ReusableConfigWrapper}
 */
public final class ReusableConfigWrapper extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.privateca.v1beta1.ReusableConfigWrapper)
    ReusableConfigWrapperOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReusableConfigWrapper.newBuilder() to construct.
  private ReusableConfigWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReusableConfigWrapper() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReusableConfigWrapper();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.security.privateca.v1beta1.PrivateCaResourcesProto
        .internal_static_google_cloud_security_privateca_v1beta1_ReusableConfigWrapper_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.privateca.v1beta1.PrivateCaResourcesProto
        .internal_static_google_cloud_security_privateca_v1beta1_ReusableConfigWrapper_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper.class,
            com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper.Builder.class);
  }

  private int configValuesCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object configValues_;

  public enum ConfigValuesCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    REUSABLE_CONFIG(1),
    REUSABLE_CONFIG_VALUES(2),
    CONFIGVALUES_NOT_SET(0);
    private final int value;

    private ConfigValuesCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConfigValuesCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConfigValuesCase forNumber(int value) {
      switch (value) {
        case 1:
          return REUSABLE_CONFIG;
        case 2:
          return REUSABLE_CONFIG_VALUES;
        case 0:
          return CONFIGVALUES_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ConfigValuesCase getConfigValuesCase() {
    return ConfigValuesCase.forNumber(configValuesCase_);
  }

  public static final int REUSABLE_CONFIG_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
   * </pre>
   *
   * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the reusableConfig field is set.
   */
  public boolean hasReusableConfig() {
    return configValuesCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
   * </pre>
   *
   * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The reusableConfig.
   */
  public java.lang.String getReusableConfig() {
    java.lang.Object ref = "";
    if (configValuesCase_ == 1) {
      ref = configValues_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (configValuesCase_ == 1) {
        configValues_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
   * </pre>
   *
   * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for reusableConfig.
   */
  public com.google.protobuf.ByteString getReusableConfigBytes() {
    java.lang.Object ref = "";
    if (configValuesCase_ == 1) {
      ref = configValues_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (configValuesCase_ == 1) {
        configValues_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REUSABLE_CONFIG_VALUES_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the reusableConfigValues field is set.
   */
  @java.lang.Override
  public boolean hasReusableConfigValues() {
    return configValuesCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The reusableConfigValues.
   */
  @java.lang.Override
  public com.google.cloud.security.privateca.v1beta1.ReusableConfigValues
      getReusableConfigValues() {
    if (configValuesCase_ == 2) {
      return (com.google.cloud.security.privateca.v1beta1.ReusableConfigValues) configValues_;
    }
    return com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.security.privateca.v1beta1.ReusableConfigValuesOrBuilder
      getReusableConfigValuesOrBuilder() {
    if (configValuesCase_ == 2) {
      return (com.google.cloud.security.privateca.v1beta1.ReusableConfigValues) configValues_;
    }
    return com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.getDefaultInstance();
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
    if (configValuesCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, configValues_);
    }
    if (configValuesCase_ == 2) {
      output.writeMessage(
          2, (com.google.cloud.security.privateca.v1beta1.ReusableConfigValues) configValues_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configValuesCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, configValues_);
    }
    if (configValuesCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.security.privateca.v1beta1.ReusableConfigValues) configValues_);
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
    if (!(obj instanceof com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper)) {
      return super.equals(obj);
    }
    com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper other =
        (com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper) obj;

    if (!getConfigValuesCase().equals(other.getConfigValuesCase())) return false;
    switch (configValuesCase_) {
      case 1:
        if (!getReusableConfig().equals(other.getReusableConfig())) return false;
        break;
      case 2:
        if (!getReusableConfigValues().equals(other.getReusableConfigValues())) return false;
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
    switch (configValuesCase_) {
      case 1:
        hash = (37 * hash) + REUSABLE_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getReusableConfig().hashCode();
        break;
      case 2:
        hash = (37 * hash) + REUSABLE_CONFIG_VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getReusableConfigValues().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper parseFrom(
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
      com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper prototype) {
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
   * A [ReusableConfigWrapper][google.cloud.security.privateca.v1beta1.ReusableConfigWrapper] describes values that may assist in creating an
   * X.509 certificate, or a reference to a pre-defined set of values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.privateca.v1beta1.ReusableConfigWrapper}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.privateca.v1beta1.ReusableConfigWrapper)
      com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapperOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.security.privateca.v1beta1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1beta1_ReusableConfigWrapper_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.privateca.v1beta1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1beta1_ReusableConfigWrapper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper.class,
              com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper.Builder.class);
    }

    // Construct using
    // com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (reusableConfigValuesBuilder_ != null) {
        reusableConfigValuesBuilder_.clear();
      }
      configValuesCase_ = 0;
      configValues_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.security.privateca.v1beta1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1beta1_ReusableConfigWrapper_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper
        getDefaultInstanceForType() {
      return com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper build() {
      com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper buildPartial() {
      com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper result =
          new com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper result) {
      result.configValuesCase_ = configValuesCase_;
      result.configValues_ = this.configValues_;
      if (configValuesCase_ == 2 && reusableConfigValuesBuilder_ != null) {
        result.configValues_ = reusableConfigValuesBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper) {
        return mergeFrom((com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper other) {
      if (other
          == com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper.getDefaultInstance())
        return this;
      switch (other.getConfigValuesCase()) {
        case REUSABLE_CONFIG:
          {
            configValuesCase_ = 1;
            configValues_ = other.configValues_;
            onChanged();
            break;
          }
        case REUSABLE_CONFIG_VALUES:
          {
            mergeReusableConfigValues(other.getReusableConfigValues());
            break;
          }
        case CONFIGVALUES_NOT_SET:
          {
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                configValuesCase_ = 1;
                configValues_ = s;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getReusableConfigValuesFieldBuilder().getBuilder(), extensionRegistry);
                configValuesCase_ = 2;
                break;
              } // case 18
            default:
              {
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

    private int configValuesCase_ = 0;
    private java.lang.Object configValues_;

    public ConfigValuesCase getConfigValuesCase() {
      return ConfigValuesCase.forNumber(configValuesCase_);
    }

    public Builder clearConfigValues() {
      configValuesCase_ = 0;
      configValues_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
     * </pre>
     *
     * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the reusableConfig field is set.
     */
    @java.lang.Override
    public boolean hasReusableConfig() {
      return configValuesCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
     * </pre>
     *
     * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The reusableConfig.
     */
    @java.lang.Override
    public java.lang.String getReusableConfig() {
      java.lang.Object ref = "";
      if (configValuesCase_ == 1) {
        ref = configValues_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (configValuesCase_ == 1) {
          configValues_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
     * </pre>
     *
     * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for reusableConfig.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getReusableConfigBytes() {
      java.lang.Object ref = "";
      if (configValuesCase_ == 1) {
        ref = configValues_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (configValuesCase_ == 1) {
          configValues_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
     * </pre>
     *
     * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The reusableConfig to set.
     * @return This builder for chaining.
     */
    public Builder setReusableConfig(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      configValuesCase_ = 1;
      configValues_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
     * </pre>
     *
     * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReusableConfig() {
      if (configValuesCase_ == 1) {
        configValuesCase_ = 0;
        configValues_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A resource path to a [ReusableConfig][google.cloud.security.privateca.v1beta1.ReusableConfig] in the format
     * `projects/&#42;&#47;locations/&#42;&#47;reusableConfigs/&#42;`.
     * </pre>
     *
     * <code>string reusable_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for reusableConfig to set.
     * @return This builder for chaining.
     */
    public Builder setReusableConfigBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      configValuesCase_ = 1;
      configValues_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.security.privateca.v1beta1.ReusableConfigValues,
            com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.Builder,
            com.google.cloud.security.privateca.v1beta1.ReusableConfigValuesOrBuilder>
        reusableConfigValuesBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the reusableConfigValues field is set.
     */
    @java.lang.Override
    public boolean hasReusableConfigValues() {
      return configValuesCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The reusableConfigValues.
     */
    @java.lang.Override
    public com.google.cloud.security.privateca.v1beta1.ReusableConfigValues
        getReusableConfigValues() {
      if (reusableConfigValuesBuilder_ == null) {
        if (configValuesCase_ == 2) {
          return (com.google.cloud.security.privateca.v1beta1.ReusableConfigValues) configValues_;
        }
        return com.google.cloud.security.privateca.v1beta1.ReusableConfigValues
            .getDefaultInstance();
      } else {
        if (configValuesCase_ == 2) {
          return reusableConfigValuesBuilder_.getMessage();
        }
        return com.google.cloud.security.privateca.v1beta1.ReusableConfigValues
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReusableConfigValues(
        com.google.cloud.security.privateca.v1beta1.ReusableConfigValues value) {
      if (reusableConfigValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configValues_ = value;
        onChanged();
      } else {
        reusableConfigValuesBuilder_.setMessage(value);
      }
      configValuesCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReusableConfigValues(
        com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.Builder builderForValue) {
      if (reusableConfigValuesBuilder_ == null) {
        configValues_ = builderForValue.build();
        onChanged();
      } else {
        reusableConfigValuesBuilder_.setMessage(builderForValue.build());
      }
      configValuesCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReusableConfigValues(
        com.google.cloud.security.privateca.v1beta1.ReusableConfigValues value) {
      if (reusableConfigValuesBuilder_ == null) {
        if (configValuesCase_ == 2
            && configValues_
                != com.google.cloud.security.privateca.v1beta1.ReusableConfigValues
                    .getDefaultInstance()) {
          configValues_ =
              com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.newBuilder(
                      (com.google.cloud.security.privateca.v1beta1.ReusableConfigValues)
                          configValues_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          configValues_ = value;
        }
        onChanged();
      } else {
        if (configValuesCase_ == 2) {
          reusableConfigValuesBuilder_.mergeFrom(value);
        } else {
          reusableConfigValuesBuilder_.setMessage(value);
        }
      }
      configValuesCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReusableConfigValues() {
      if (reusableConfigValuesBuilder_ == null) {
        if (configValuesCase_ == 2) {
          configValuesCase_ = 0;
          configValues_ = null;
          onChanged();
        }
      } else {
        if (configValuesCase_ == 2) {
          configValuesCase_ = 0;
          configValues_ = null;
        }
        reusableConfigValuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.Builder
        getReusableConfigValuesBuilder() {
      return getReusableConfigValuesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.security.privateca.v1beta1.ReusableConfigValuesOrBuilder
        getReusableConfigValuesOrBuilder() {
      if ((configValuesCase_ == 2) && (reusableConfigValuesBuilder_ != null)) {
        return reusableConfigValuesBuilder_.getMessageOrBuilder();
      } else {
        if (configValuesCase_ == 2) {
          return (com.google.cloud.security.privateca.v1beta1.ReusableConfigValues) configValues_;
        }
        return com.google.cloud.security.privateca.v1beta1.ReusableConfigValues
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A user-specified inline [ReusableConfigValues][google.cloud.security.privateca.v1beta1.ReusableConfigValues].
     * </pre>
     *
     * <code>
     * .google.cloud.security.privateca.v1beta1.ReusableConfigValues reusable_config_values = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.security.privateca.v1beta1.ReusableConfigValues,
            com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.Builder,
            com.google.cloud.security.privateca.v1beta1.ReusableConfigValuesOrBuilder>
        getReusableConfigValuesFieldBuilder() {
      if (reusableConfigValuesBuilder_ == null) {
        if (!(configValuesCase_ == 2)) {
          configValues_ =
              com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.getDefaultInstance();
        }
        reusableConfigValuesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.security.privateca.v1beta1.ReusableConfigValues,
                com.google.cloud.security.privateca.v1beta1.ReusableConfigValues.Builder,
                com.google.cloud.security.privateca.v1beta1.ReusableConfigValuesOrBuilder>(
                (com.google.cloud.security.privateca.v1beta1.ReusableConfigValues) configValues_,
                getParentForChildren(),
                isClean());
        configValues_ = null;
      }
      configValuesCase_ = 2;
      onChanged();
      return reusableConfigValuesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.security.privateca.v1beta1.ReusableConfigWrapper)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.privateca.v1beta1.ReusableConfigWrapper)
  private static final com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper();
  }

  public static com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReusableConfigWrapper> PARSER =
      new com.google.protobuf.AbstractParser<ReusableConfigWrapper>() {
        @java.lang.Override
        public ReusableConfigWrapper parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReusableConfigWrapper> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReusableConfigWrapper> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.privateca.v1beta1.ReusableConfigWrapper
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
