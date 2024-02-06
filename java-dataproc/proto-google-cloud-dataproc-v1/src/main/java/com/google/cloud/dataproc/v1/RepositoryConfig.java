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
// source: google/cloud/dataproc/v1/shared.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Configuration for dependency repositories
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.RepositoryConfig}
 */
public final class RepositoryConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.RepositoryConfig)
    RepositoryConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RepositoryConfig.newBuilder() to construct.
  private RepositoryConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RepositoryConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RepositoryConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.SharedProto
        .internal_static_google_cloud_dataproc_v1_RepositoryConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.SharedProto
        .internal_static_google_cloud_dataproc_v1_RepositoryConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.RepositoryConfig.class,
            com.google.cloud.dataproc.v1.RepositoryConfig.Builder.class);
  }

  private int bitField0_;
  public static final int PYPI_REPOSITORY_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1.PyPiRepositoryConfig pypiRepositoryConfig_;
  /**
   *
   *
   * <pre>
   * Optional. Configuration for PyPi repository.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the pypiRepositoryConfig field is set.
   */
  @java.lang.Override
  public boolean hasPypiRepositoryConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Configuration for PyPi repository.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The pypiRepositoryConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.PyPiRepositoryConfig getPypiRepositoryConfig() {
    return pypiRepositoryConfig_ == null
        ? com.google.cloud.dataproc.v1.PyPiRepositoryConfig.getDefaultInstance()
        : pypiRepositoryConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Configuration for PyPi repository.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.PyPiRepositoryConfigOrBuilder
      getPypiRepositoryConfigOrBuilder() {
    return pypiRepositoryConfig_ == null
        ? com.google.cloud.dataproc.v1.PyPiRepositoryConfig.getDefaultInstance()
        : pypiRepositoryConfig_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPypiRepositoryConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPypiRepositoryConfig());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.RepositoryConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.RepositoryConfig other =
        (com.google.cloud.dataproc.v1.RepositoryConfig) obj;

    if (hasPypiRepositoryConfig() != other.hasPypiRepositoryConfig()) return false;
    if (hasPypiRepositoryConfig()) {
      if (!getPypiRepositoryConfig().equals(other.getPypiRepositoryConfig())) return false;
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
    if (hasPypiRepositoryConfig()) {
      hash = (37 * hash) + PYPI_REPOSITORY_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getPypiRepositoryConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.RepositoryConfig prototype) {
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
   * Configuration for dependency repositories
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.RepositoryConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.RepositoryConfig)
      com.google.cloud.dataproc.v1.RepositoryConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_RepositoryConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_RepositoryConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.RepositoryConfig.class,
              com.google.cloud.dataproc.v1.RepositoryConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.RepositoryConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPypiRepositoryConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pypiRepositoryConfig_ = null;
      if (pypiRepositoryConfigBuilder_ != null) {
        pypiRepositoryConfigBuilder_.dispose();
        pypiRepositoryConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_RepositoryConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RepositoryConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.RepositoryConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RepositoryConfig build() {
      com.google.cloud.dataproc.v1.RepositoryConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RepositoryConfig buildPartial() {
      com.google.cloud.dataproc.v1.RepositoryConfig result =
          new com.google.cloud.dataproc.v1.RepositoryConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.RepositoryConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pypiRepositoryConfig_ =
            pypiRepositoryConfigBuilder_ == null
                ? pypiRepositoryConfig_
                : pypiRepositoryConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.dataproc.v1.RepositoryConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.RepositoryConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.RepositoryConfig other) {
      if (other == com.google.cloud.dataproc.v1.RepositoryConfig.getDefaultInstance()) return this;
      if (other.hasPypiRepositoryConfig()) {
        mergePypiRepositoryConfig(other.getPypiRepositoryConfig());
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
                input.readMessage(
                    getPypiRepositoryConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.dataproc.v1.PyPiRepositoryConfig pypiRepositoryConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.PyPiRepositoryConfig,
            com.google.cloud.dataproc.v1.PyPiRepositoryConfig.Builder,
            com.google.cloud.dataproc.v1.PyPiRepositoryConfigOrBuilder>
        pypiRepositoryConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the pypiRepositoryConfig field is set.
     */
    public boolean hasPypiRepositoryConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The pypiRepositoryConfig.
     */
    public com.google.cloud.dataproc.v1.PyPiRepositoryConfig getPypiRepositoryConfig() {
      if (pypiRepositoryConfigBuilder_ == null) {
        return pypiRepositoryConfig_ == null
            ? com.google.cloud.dataproc.v1.PyPiRepositoryConfig.getDefaultInstance()
            : pypiRepositoryConfig_;
      } else {
        return pypiRepositoryConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setPypiRepositoryConfig(
        com.google.cloud.dataproc.v1.PyPiRepositoryConfig value) {
      if (pypiRepositoryConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pypiRepositoryConfig_ = value;
      } else {
        pypiRepositoryConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setPypiRepositoryConfig(
        com.google.cloud.dataproc.v1.PyPiRepositoryConfig.Builder builderForValue) {
      if (pypiRepositoryConfigBuilder_ == null) {
        pypiRepositoryConfig_ = builderForValue.build();
      } else {
        pypiRepositoryConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergePypiRepositoryConfig(
        com.google.cloud.dataproc.v1.PyPiRepositoryConfig value) {
      if (pypiRepositoryConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && pypiRepositoryConfig_ != null
            && pypiRepositoryConfig_
                != com.google.cloud.dataproc.v1.PyPiRepositoryConfig.getDefaultInstance()) {
          getPypiRepositoryConfigBuilder().mergeFrom(value);
        } else {
          pypiRepositoryConfig_ = value;
        }
      } else {
        pypiRepositoryConfigBuilder_.mergeFrom(value);
      }
      if (pypiRepositoryConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearPypiRepositoryConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pypiRepositoryConfig_ = null;
      if (pypiRepositoryConfigBuilder_ != null) {
        pypiRepositoryConfigBuilder_.dispose();
        pypiRepositoryConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.PyPiRepositoryConfig.Builder
        getPypiRepositoryConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPypiRepositoryConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.PyPiRepositoryConfigOrBuilder
        getPypiRepositoryConfigOrBuilder() {
      if (pypiRepositoryConfigBuilder_ != null) {
        return pypiRepositoryConfigBuilder_.getMessageOrBuilder();
      } else {
        return pypiRepositoryConfig_ == null
            ? com.google.cloud.dataproc.v1.PyPiRepositoryConfig.getDefaultInstance()
            : pypiRepositoryConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration for PyPi repository.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.PyPiRepositoryConfig pypi_repository_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.PyPiRepositoryConfig,
            com.google.cloud.dataproc.v1.PyPiRepositoryConfig.Builder,
            com.google.cloud.dataproc.v1.PyPiRepositoryConfigOrBuilder>
        getPypiRepositoryConfigFieldBuilder() {
      if (pypiRepositoryConfigBuilder_ == null) {
        pypiRepositoryConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.PyPiRepositoryConfig,
                com.google.cloud.dataproc.v1.PyPiRepositoryConfig.Builder,
                com.google.cloud.dataproc.v1.PyPiRepositoryConfigOrBuilder>(
                getPypiRepositoryConfig(), getParentForChildren(), isClean());
        pypiRepositoryConfig_ = null;
      }
      return pypiRepositoryConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.RepositoryConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.RepositoryConfig)
  private static final com.google.cloud.dataproc.v1.RepositoryConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.RepositoryConfig();
  }

  public static com.google.cloud.dataproc.v1.RepositoryConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepositoryConfig> PARSER =
      new com.google.protobuf.AbstractParser<RepositoryConfig>() {
        @java.lang.Override
        public RepositoryConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<RepositoryConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepositoryConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.RepositoryConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
