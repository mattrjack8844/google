/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Auxiliary services configuration for a Cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.AuxiliaryServicesConfig}
 */
public final class AuxiliaryServicesConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.AuxiliaryServicesConfig)
    AuxiliaryServicesConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AuxiliaryServicesConfig.newBuilder() to construct.
  private AuxiliaryServicesConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AuxiliaryServicesConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AuxiliaryServicesConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AuxiliaryServicesConfig(
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
          case 10:
            {
              com.google.cloud.dataproc.v1.MetastoreConfig.Builder subBuilder = null;
              if (metastoreConfig_ != null) {
                subBuilder = metastoreConfig_.toBuilder();
              }
              metastoreConfig_ =
                  input.readMessage(
                      com.google.cloud.dataproc.v1.MetastoreConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(metastoreConfig_);
                metastoreConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder subBuilder = null;
              if (sparkHistoryServerConfig_ != null) {
                subBuilder = sparkHistoryServerConfig_.toBuilder();
              }
              sparkHistoryServerConfig_ =
                  input.readMessage(
                      com.google.cloud.dataproc.v1.SparkHistoryServerConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sparkHistoryServerConfig_);
                sparkHistoryServerConfig_ = subBuilder.buildPartial();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_AuxiliaryServicesConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_AuxiliaryServicesConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.AuxiliaryServicesConfig.class,
            com.google.cloud.dataproc.v1.AuxiliaryServicesConfig.Builder.class);
  }

  public static final int METASTORE_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1.MetastoreConfig metastoreConfig_;
  /**
   *
   *
   * <pre>
   * Optional. The Hive Metastore configuration for this workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the metastoreConfig field is set.
   */
  @java.lang.Override
  public boolean hasMetastoreConfig() {
    return metastoreConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. The Hive Metastore configuration for this workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The metastoreConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.MetastoreConfig getMetastoreConfig() {
    return metastoreConfig_ == null
        ? com.google.cloud.dataproc.v1.MetastoreConfig.getDefaultInstance()
        : metastoreConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The Hive Metastore configuration for this workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.MetastoreConfigOrBuilder getMetastoreConfigOrBuilder() {
    return getMetastoreConfig();
  }

  public static final int SPARK_HISTORY_SERVER_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.dataproc.v1.SparkHistoryServerConfig sparkHistoryServerConfig_;
  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkHistoryServerConfig field is set.
   */
  @java.lang.Override
  public boolean hasSparkHistoryServerConfig() {
    return sparkHistoryServerConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkHistoryServerConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.SparkHistoryServerConfig getSparkHistoryServerConfig() {
    return sparkHistoryServerConfig_ == null
        ? com.google.cloud.dataproc.v1.SparkHistoryServerConfig.getDefaultInstance()
        : sparkHistoryServerConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder
      getSparkHistoryServerConfigOrBuilder() {
    return getSparkHistoryServerConfig();
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
    if (metastoreConfig_ != null) {
      output.writeMessage(1, getMetastoreConfig());
    }
    if (sparkHistoryServerConfig_ != null) {
      output.writeMessage(2, getSparkHistoryServerConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metastoreConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetastoreConfig());
    }
    if (sparkHistoryServerConfig_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getSparkHistoryServerConfig());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.AuxiliaryServicesConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.AuxiliaryServicesConfig other =
        (com.google.cloud.dataproc.v1.AuxiliaryServicesConfig) obj;

    if (hasMetastoreConfig() != other.hasMetastoreConfig()) return false;
    if (hasMetastoreConfig()) {
      if (!getMetastoreConfig().equals(other.getMetastoreConfig())) return false;
    }
    if (hasSparkHistoryServerConfig() != other.hasSparkHistoryServerConfig()) return false;
    if (hasSparkHistoryServerConfig()) {
      if (!getSparkHistoryServerConfig().equals(other.getSparkHistoryServerConfig())) return false;
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
    if (hasMetastoreConfig()) {
      hash = (37 * hash) + METASTORE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getMetastoreConfig().hashCode();
    }
    if (hasSparkHistoryServerConfig()) {
      hash = (37 * hash) + SPARK_HISTORY_SERVER_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSparkHistoryServerConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.AuxiliaryServicesConfig prototype) {
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
   * Auxiliary services configuration for a Cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.AuxiliaryServicesConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.AuxiliaryServicesConfig)
      com.google.cloud.dataproc.v1.AuxiliaryServicesConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_AuxiliaryServicesConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_AuxiliaryServicesConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.AuxiliaryServicesConfig.class,
              com.google.cloud.dataproc.v1.AuxiliaryServicesConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.AuxiliaryServicesConfig.newBuilder()
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
      if (metastoreConfigBuilder_ == null) {
        metastoreConfig_ = null;
      } else {
        metastoreConfig_ = null;
        metastoreConfigBuilder_ = null;
      }
      if (sparkHistoryServerConfigBuilder_ == null) {
        sparkHistoryServerConfig_ = null;
      } else {
        sparkHistoryServerConfig_ = null;
        sparkHistoryServerConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_AuxiliaryServicesConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.AuxiliaryServicesConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.AuxiliaryServicesConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.AuxiliaryServicesConfig build() {
      com.google.cloud.dataproc.v1.AuxiliaryServicesConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.AuxiliaryServicesConfig buildPartial() {
      com.google.cloud.dataproc.v1.AuxiliaryServicesConfig result =
          new com.google.cloud.dataproc.v1.AuxiliaryServicesConfig(this);
      if (metastoreConfigBuilder_ == null) {
        result.metastoreConfig_ = metastoreConfig_;
      } else {
        result.metastoreConfig_ = metastoreConfigBuilder_.build();
      }
      if (sparkHistoryServerConfigBuilder_ == null) {
        result.sparkHistoryServerConfig_ = sparkHistoryServerConfig_;
      } else {
        result.sparkHistoryServerConfig_ = sparkHistoryServerConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1.AuxiliaryServicesConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.AuxiliaryServicesConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.AuxiliaryServicesConfig other) {
      if (other == com.google.cloud.dataproc.v1.AuxiliaryServicesConfig.getDefaultInstance())
        return this;
      if (other.hasMetastoreConfig()) {
        mergeMetastoreConfig(other.getMetastoreConfig());
      }
      if (other.hasSparkHistoryServerConfig()) {
        mergeSparkHistoryServerConfig(other.getSparkHistoryServerConfig());
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
      com.google.cloud.dataproc.v1.AuxiliaryServicesConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataproc.v1.AuxiliaryServicesConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dataproc.v1.MetastoreConfig metastoreConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.MetastoreConfig,
            com.google.cloud.dataproc.v1.MetastoreConfig.Builder,
            com.google.cloud.dataproc.v1.MetastoreConfigOrBuilder>
        metastoreConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the metastoreConfig field is set.
     */
    public boolean hasMetastoreConfig() {
      return metastoreConfigBuilder_ != null || metastoreConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The metastoreConfig.
     */
    public com.google.cloud.dataproc.v1.MetastoreConfig getMetastoreConfig() {
      if (metastoreConfigBuilder_ == null) {
        return metastoreConfig_ == null
            ? com.google.cloud.dataproc.v1.MetastoreConfig.getDefaultInstance()
            : metastoreConfig_;
      } else {
        return metastoreConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setMetastoreConfig(com.google.cloud.dataproc.v1.MetastoreConfig value) {
      if (metastoreConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metastoreConfig_ = value;
        onChanged();
      } else {
        metastoreConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setMetastoreConfig(
        com.google.cloud.dataproc.v1.MetastoreConfig.Builder builderForValue) {
      if (metastoreConfigBuilder_ == null) {
        metastoreConfig_ = builderForValue.build();
        onChanged();
      } else {
        metastoreConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeMetastoreConfig(com.google.cloud.dataproc.v1.MetastoreConfig value) {
      if (metastoreConfigBuilder_ == null) {
        if (metastoreConfig_ != null) {
          metastoreConfig_ =
              com.google.cloud.dataproc.v1.MetastoreConfig.newBuilder(metastoreConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          metastoreConfig_ = value;
        }
        onChanged();
      } else {
        metastoreConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearMetastoreConfig() {
      if (metastoreConfigBuilder_ == null) {
        metastoreConfig_ = null;
        onChanged();
      } else {
        metastoreConfig_ = null;
        metastoreConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.MetastoreConfig.Builder getMetastoreConfigBuilder() {

      onChanged();
      return getMetastoreConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.MetastoreConfigOrBuilder getMetastoreConfigOrBuilder() {
      if (metastoreConfigBuilder_ != null) {
        return metastoreConfigBuilder_.getMessageOrBuilder();
      } else {
        return metastoreConfig_ == null
            ? com.google.cloud.dataproc.v1.MetastoreConfig.getDefaultInstance()
            : metastoreConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Hive Metastore configuration for this workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.MetastoreConfig,
            com.google.cloud.dataproc.v1.MetastoreConfig.Builder,
            com.google.cloud.dataproc.v1.MetastoreConfigOrBuilder>
        getMetastoreConfigFieldBuilder() {
      if (metastoreConfigBuilder_ == null) {
        metastoreConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.MetastoreConfig,
                com.google.cloud.dataproc.v1.MetastoreConfig.Builder,
                com.google.cloud.dataproc.v1.MetastoreConfigOrBuilder>(
                getMetastoreConfig(), getParentForChildren(), isClean());
        metastoreConfig_ = null;
      }
      return metastoreConfigBuilder_;
    }

    private com.google.cloud.dataproc.v1.SparkHistoryServerConfig sparkHistoryServerConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.SparkHistoryServerConfig,
            com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder,
            com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder>
        sparkHistoryServerConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the sparkHistoryServerConfig field is set.
     */
    public boolean hasSparkHistoryServerConfig() {
      return sparkHistoryServerConfigBuilder_ != null || sparkHistoryServerConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The sparkHistoryServerConfig.
     */
    public com.google.cloud.dataproc.v1.SparkHistoryServerConfig getSparkHistoryServerConfig() {
      if (sparkHistoryServerConfigBuilder_ == null) {
        return sparkHistoryServerConfig_ == null
            ? com.google.cloud.dataproc.v1.SparkHistoryServerConfig.getDefaultInstance()
            : sparkHistoryServerConfig_;
      } else {
        return sparkHistoryServerConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSparkHistoryServerConfig(
        com.google.cloud.dataproc.v1.SparkHistoryServerConfig value) {
      if (sparkHistoryServerConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sparkHistoryServerConfig_ = value;
        onChanged();
      } else {
        sparkHistoryServerConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSparkHistoryServerConfig(
        com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder builderForValue) {
      if (sparkHistoryServerConfigBuilder_ == null) {
        sparkHistoryServerConfig_ = builderForValue.build();
        onChanged();
      } else {
        sparkHistoryServerConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeSparkHistoryServerConfig(
        com.google.cloud.dataproc.v1.SparkHistoryServerConfig value) {
      if (sparkHistoryServerConfigBuilder_ == null) {
        if (sparkHistoryServerConfig_ != null) {
          sparkHistoryServerConfig_ =
              com.google.cloud.dataproc.v1.SparkHistoryServerConfig.newBuilder(
                      sparkHistoryServerConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          sparkHistoryServerConfig_ = value;
        }
        onChanged();
      } else {
        sparkHistoryServerConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearSparkHistoryServerConfig() {
      if (sparkHistoryServerConfigBuilder_ == null) {
        sparkHistoryServerConfig_ = null;
        onChanged();
      } else {
        sparkHistoryServerConfig_ = null;
        sparkHistoryServerConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder
        getSparkHistoryServerConfigBuilder() {

      onChanged();
      return getSparkHistoryServerConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder
        getSparkHistoryServerConfigOrBuilder() {
      if (sparkHistoryServerConfigBuilder_ != null) {
        return sparkHistoryServerConfigBuilder_.getMessageOrBuilder();
      } else {
        return sparkHistoryServerConfig_ == null
            ? com.google.cloud.dataproc.v1.SparkHistoryServerConfig.getDefaultInstance()
            : sparkHistoryServerConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.SparkHistoryServerConfig,
            com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder,
            com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder>
        getSparkHistoryServerConfigFieldBuilder() {
      if (sparkHistoryServerConfigBuilder_ == null) {
        sparkHistoryServerConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.SparkHistoryServerConfig,
                com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder,
                com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder>(
                getSparkHistoryServerConfig(), getParentForChildren(), isClean());
        sparkHistoryServerConfig_ = null;
      }
      return sparkHistoryServerConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.AuxiliaryServicesConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.AuxiliaryServicesConfig)
  private static final com.google.cloud.dataproc.v1.AuxiliaryServicesConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.AuxiliaryServicesConfig();
  }

  public static com.google.cloud.dataproc.v1.AuxiliaryServicesConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuxiliaryServicesConfig> PARSER =
      new com.google.protobuf.AbstractParser<AuxiliaryServicesConfig>() {
        @java.lang.Override
        public AuxiliaryServicesConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AuxiliaryServicesConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AuxiliaryServicesConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuxiliaryServicesConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.AuxiliaryServicesConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
