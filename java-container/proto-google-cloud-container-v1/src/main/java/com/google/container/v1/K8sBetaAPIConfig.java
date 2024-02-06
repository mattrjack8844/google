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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * K8sBetaAPIConfig , configuration for beta APIs
 * </pre>
 *
 * Protobuf type {@code google.container.v1.K8sBetaAPIConfig}
 */
public final class K8sBetaAPIConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.K8sBetaAPIConfig)
    K8sBetaAPIConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use K8sBetaAPIConfig.newBuilder() to construct.
  private K8sBetaAPIConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private K8sBetaAPIConfig() {
    enabledApis_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new K8sBetaAPIConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_K8sBetaAPIConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_K8sBetaAPIConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.K8sBetaAPIConfig.class,
            com.google.container.v1.K8sBetaAPIConfig.Builder.class);
  }

  public static final int ENABLED_APIS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList enabledApis_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Enabled k8s beta APIs.
   * </pre>
   *
   * <code>repeated string enabled_apis = 1;</code>
   *
   * @return A list containing the enabledApis.
   */
  public com.google.protobuf.ProtocolStringList getEnabledApisList() {
    return enabledApis_;
  }
  /**
   *
   *
   * <pre>
   * Enabled k8s beta APIs.
   * </pre>
   *
   * <code>repeated string enabled_apis = 1;</code>
   *
   * @return The count of enabledApis.
   */
  public int getEnabledApisCount() {
    return enabledApis_.size();
  }
  /**
   *
   *
   * <pre>
   * Enabled k8s beta APIs.
   * </pre>
   *
   * <code>repeated string enabled_apis = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The enabledApis at the given index.
   */
  public java.lang.String getEnabledApis(int index) {
    return enabledApis_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Enabled k8s beta APIs.
   * </pre>
   *
   * <code>repeated string enabled_apis = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the enabledApis at the given index.
   */
  public com.google.protobuf.ByteString getEnabledApisBytes(int index) {
    return enabledApis_.getByteString(index);
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
    for (int i = 0; i < enabledApis_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, enabledApis_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < enabledApis_.size(); i++) {
        dataSize += computeStringSizeNoTag(enabledApis_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEnabledApisList().size();
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
    if (!(obj instanceof com.google.container.v1.K8sBetaAPIConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.K8sBetaAPIConfig other = (com.google.container.v1.K8sBetaAPIConfig) obj;

    if (!getEnabledApisList().equals(other.getEnabledApisList())) return false;
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
    if (getEnabledApisCount() > 0) {
      hash = (37 * hash) + ENABLED_APIS_FIELD_NUMBER;
      hash = (53 * hash) + getEnabledApisList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.K8sBetaAPIConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.K8sBetaAPIConfig prototype) {
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
   * K8sBetaAPIConfig , configuration for beta APIs
   * </pre>
   *
   * Protobuf type {@code google.container.v1.K8sBetaAPIConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.K8sBetaAPIConfig)
      com.google.container.v1.K8sBetaAPIConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_K8sBetaAPIConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_K8sBetaAPIConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.K8sBetaAPIConfig.class,
              com.google.container.v1.K8sBetaAPIConfig.Builder.class);
    }

    // Construct using com.google.container.v1.K8sBetaAPIConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabledApis_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_K8sBetaAPIConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.K8sBetaAPIConfig getDefaultInstanceForType() {
      return com.google.container.v1.K8sBetaAPIConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.K8sBetaAPIConfig build() {
      com.google.container.v1.K8sBetaAPIConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.K8sBetaAPIConfig buildPartial() {
      com.google.container.v1.K8sBetaAPIConfig result =
          new com.google.container.v1.K8sBetaAPIConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.K8sBetaAPIConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        enabledApis_.makeImmutable();
        result.enabledApis_ = enabledApis_;
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
      if (other instanceof com.google.container.v1.K8sBetaAPIConfig) {
        return mergeFrom((com.google.container.v1.K8sBetaAPIConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.K8sBetaAPIConfig other) {
      if (other == com.google.container.v1.K8sBetaAPIConfig.getDefaultInstance()) return this;
      if (!other.enabledApis_.isEmpty()) {
        if (enabledApis_.isEmpty()) {
          enabledApis_ = other.enabledApis_;
          bitField0_ |= 0x00000001;
        } else {
          ensureEnabledApisIsMutable();
          enabledApis_.addAll(other.enabledApis_);
        }
        onChanged();
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
                ensureEnabledApisIsMutable();
                enabledApis_.add(s);
                break;
              } // case 10
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

    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList enabledApis_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureEnabledApisIsMutable() {
      if (!enabledApis_.isModifiable()) {
        enabledApis_ = new com.google.protobuf.LazyStringArrayList(enabledApis_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @return A list containing the enabledApis.
     */
    public com.google.protobuf.ProtocolStringList getEnabledApisList() {
      enabledApis_.makeImmutable();
      return enabledApis_;
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @return The count of enabledApis.
     */
    public int getEnabledApisCount() {
      return enabledApis_.size();
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The enabledApis at the given index.
     */
    public java.lang.String getEnabledApis(int index) {
      return enabledApis_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the enabledApis at the given index.
     */
    public com.google.protobuf.ByteString getEnabledApisBytes(int index) {
      return enabledApis_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The enabledApis to set.
     * @return This builder for chaining.
     */
    public Builder setEnabledApis(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEnabledApisIsMutable();
      enabledApis_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @param value The enabledApis to add.
     * @return This builder for chaining.
     */
    public Builder addEnabledApis(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEnabledApisIsMutable();
      enabledApis_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @param values The enabledApis to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnabledApis(java.lang.Iterable<java.lang.String> values) {
      ensureEnabledApisIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, enabledApis_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabledApis() {
      enabledApis_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enabled k8s beta APIs.
     * </pre>
     *
     * <code>repeated string enabled_apis = 1;</code>
     *
     * @param value The bytes of the enabledApis to add.
     * @return This builder for chaining.
     */
    public Builder addEnabledApisBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureEnabledApisIsMutable();
      enabledApis_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.K8sBetaAPIConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.K8sBetaAPIConfig)
  private static final com.google.container.v1.K8sBetaAPIConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.K8sBetaAPIConfig();
  }

  public static com.google.container.v1.K8sBetaAPIConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<K8sBetaAPIConfig> PARSER =
      new com.google.protobuf.AbstractParser<K8sBetaAPIConfig>() {
        @java.lang.Override
        public K8sBetaAPIConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<K8sBetaAPIConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<K8sBetaAPIConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.K8sBetaAPIConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
