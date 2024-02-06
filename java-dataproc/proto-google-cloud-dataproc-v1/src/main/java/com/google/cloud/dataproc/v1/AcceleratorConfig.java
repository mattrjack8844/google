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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Specifies the type and number of accelerator cards attached to the instances
 * of an instance. See [GPUs on Compute
 * Engine](https://cloud.google.com/compute/docs/gpus/).
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.AcceleratorConfig}
 */
public final class AcceleratorConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.AcceleratorConfig)
    AcceleratorConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcceleratorConfig.newBuilder() to construct.
  private AcceleratorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcceleratorConfig() {
    acceleratorTypeUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcceleratorConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_AcceleratorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_AcceleratorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.AcceleratorConfig.class,
            com.google.cloud.dataproc.v1.AcceleratorConfig.Builder.class);
  }

  public static final int ACCELERATOR_TYPE_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object acceleratorTypeUri_ = "";
  /**
   *
   *
   * <pre>
   * Full URL, partial URI, or short name of the accelerator type resource to
   * expose to this instance. See
   * [Compute Engine
   * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/v1/acceleratorTypes).
   *
   * Examples:
   *
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
   * * `projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
   * * `nvidia-tesla-k80`
   *
   * **Auto Zone Exception**: If you are using the Dataproc
   * [Auto Zone
   * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
   * feature, you must use the short name of the accelerator type
   * resource, for example, `nvidia-tesla-k80`.
   * </pre>
   *
   * <code>string accelerator_type_uri = 1;</code>
   *
   * @return The acceleratorTypeUri.
   */
  @java.lang.Override
  public java.lang.String getAcceleratorTypeUri() {
    java.lang.Object ref = acceleratorTypeUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acceleratorTypeUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Full URL, partial URI, or short name of the accelerator type resource to
   * expose to this instance. See
   * [Compute Engine
   * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/v1/acceleratorTypes).
   *
   * Examples:
   *
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
   * * `projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
   * * `nvidia-tesla-k80`
   *
   * **Auto Zone Exception**: If you are using the Dataproc
   * [Auto Zone
   * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
   * feature, you must use the short name of the accelerator type
   * resource, for example, `nvidia-tesla-k80`.
   * </pre>
   *
   * <code>string accelerator_type_uri = 1;</code>
   *
   * @return The bytes for acceleratorTypeUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAcceleratorTypeUriBytes() {
    java.lang.Object ref = acceleratorTypeUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      acceleratorTypeUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCELERATOR_COUNT_FIELD_NUMBER = 2;
  private int acceleratorCount_ = 0;
  /**
   *
   *
   * <pre>
   * The number of the accelerator cards of this type exposed to this instance.
   * </pre>
   *
   * <code>int32 accelerator_count = 2;</code>
   *
   * @return The acceleratorCount.
   */
  @java.lang.Override
  public int getAcceleratorCount() {
    return acceleratorCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acceleratorTypeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, acceleratorTypeUri_);
    }
    if (acceleratorCount_ != 0) {
      output.writeInt32(2, acceleratorCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acceleratorTypeUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, acceleratorTypeUri_);
    }
    if (acceleratorCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, acceleratorCount_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.AcceleratorConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.AcceleratorConfig other =
        (com.google.cloud.dataproc.v1.AcceleratorConfig) obj;

    if (!getAcceleratorTypeUri().equals(other.getAcceleratorTypeUri())) return false;
    if (getAcceleratorCount() != other.getAcceleratorCount()) return false;
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
    hash = (37 * hash) + ACCELERATOR_TYPE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getAcceleratorTypeUri().hashCode();
    hash = (37 * hash) + ACCELERATOR_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAcceleratorCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.AcceleratorConfig prototype) {
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
   * Specifies the type and number of accelerator cards attached to the instances
   * of an instance. See [GPUs on Compute
   * Engine](https://cloud.google.com/compute/docs/gpus/).
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.AcceleratorConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.AcceleratorConfig)
      com.google.cloud.dataproc.v1.AcceleratorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_AcceleratorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.AcceleratorConfig.class,
              com.google.cloud.dataproc.v1.AcceleratorConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.AcceleratorConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      acceleratorTypeUri_ = "";
      acceleratorCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.AcceleratorConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.AcceleratorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.AcceleratorConfig build() {
      com.google.cloud.dataproc.v1.AcceleratorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.AcceleratorConfig buildPartial() {
      com.google.cloud.dataproc.v1.AcceleratorConfig result =
          new com.google.cloud.dataproc.v1.AcceleratorConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.AcceleratorConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.acceleratorTypeUri_ = acceleratorTypeUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.acceleratorCount_ = acceleratorCount_;
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
      if (other instanceof com.google.cloud.dataproc.v1.AcceleratorConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.AcceleratorConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.AcceleratorConfig other) {
      if (other == com.google.cloud.dataproc.v1.AcceleratorConfig.getDefaultInstance()) return this;
      if (!other.getAcceleratorTypeUri().isEmpty()) {
        acceleratorTypeUri_ = other.acceleratorTypeUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAcceleratorCount() != 0) {
        setAcceleratorCount(other.getAcceleratorCount());
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
                acceleratorTypeUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                acceleratorCount_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object acceleratorTypeUri_ = "";
    /**
     *
     *
     * <pre>
     * Full URL, partial URI, or short name of the accelerator type resource to
     * expose to this instance. See
     * [Compute Engine
     * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/v1/acceleratorTypes).
     *
     * Examples:
     *
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `nvidia-tesla-k80`
     *
     * **Auto Zone Exception**: If you are using the Dataproc
     * [Auto Zone
     * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     * feature, you must use the short name of the accelerator type
     * resource, for example, `nvidia-tesla-k80`.
     * </pre>
     *
     * <code>string accelerator_type_uri = 1;</code>
     *
     * @return The acceleratorTypeUri.
     */
    public java.lang.String getAcceleratorTypeUri() {
      java.lang.Object ref = acceleratorTypeUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acceleratorTypeUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full URL, partial URI, or short name of the accelerator type resource to
     * expose to this instance. See
     * [Compute Engine
     * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/v1/acceleratorTypes).
     *
     * Examples:
     *
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `nvidia-tesla-k80`
     *
     * **Auto Zone Exception**: If you are using the Dataproc
     * [Auto Zone
     * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     * feature, you must use the short name of the accelerator type
     * resource, for example, `nvidia-tesla-k80`.
     * </pre>
     *
     * <code>string accelerator_type_uri = 1;</code>
     *
     * @return The bytes for acceleratorTypeUri.
     */
    public com.google.protobuf.ByteString getAcceleratorTypeUriBytes() {
      java.lang.Object ref = acceleratorTypeUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        acceleratorTypeUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full URL, partial URI, or short name of the accelerator type resource to
     * expose to this instance. See
     * [Compute Engine
     * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/v1/acceleratorTypes).
     *
     * Examples:
     *
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `nvidia-tesla-k80`
     *
     * **Auto Zone Exception**: If you are using the Dataproc
     * [Auto Zone
     * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     * feature, you must use the short name of the accelerator type
     * resource, for example, `nvidia-tesla-k80`.
     * </pre>
     *
     * <code>string accelerator_type_uri = 1;</code>
     *
     * @param value The acceleratorTypeUri to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorTypeUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      acceleratorTypeUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full URL, partial URI, or short name of the accelerator type resource to
     * expose to this instance. See
     * [Compute Engine
     * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/v1/acceleratorTypes).
     *
     * Examples:
     *
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `nvidia-tesla-k80`
     *
     * **Auto Zone Exception**: If you are using the Dataproc
     * [Auto Zone
     * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     * feature, you must use the short name of the accelerator type
     * resource, for example, `nvidia-tesla-k80`.
     * </pre>
     *
     * <code>string accelerator_type_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorTypeUri() {
      acceleratorTypeUri_ = getDefaultInstance().getAcceleratorTypeUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full URL, partial URI, or short name of the accelerator type resource to
     * expose to this instance. See
     * [Compute Engine
     * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/v1/acceleratorTypes).
     *
     * Examples:
     *
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `projects/[project_id]/zones/[zone]/acceleratorTypes/nvidia-tesla-k80`
     * * `nvidia-tesla-k80`
     *
     * **Auto Zone Exception**: If you are using the Dataproc
     * [Auto Zone
     * Placement](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     * feature, you must use the short name of the accelerator type
     * resource, for example, `nvidia-tesla-k80`.
     * </pre>
     *
     * <code>string accelerator_type_uri = 1;</code>
     *
     * @param value The bytes for acceleratorTypeUri to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorTypeUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      acceleratorTypeUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int acceleratorCount_;
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards of this type exposed to this instance.
     * </pre>
     *
     * <code>int32 accelerator_count = 2;</code>
     *
     * @return The acceleratorCount.
     */
    @java.lang.Override
    public int getAcceleratorCount() {
      return acceleratorCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards of this type exposed to this instance.
     * </pre>
     *
     * <code>int32 accelerator_count = 2;</code>
     *
     * @param value The acceleratorCount to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorCount(int value) {

      acceleratorCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards of this type exposed to this instance.
     * </pre>
     *
     * <code>int32 accelerator_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      acceleratorCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.AcceleratorConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.AcceleratorConfig)
  private static final com.google.cloud.dataproc.v1.AcceleratorConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.AcceleratorConfig();
  }

  public static com.google.cloud.dataproc.v1.AcceleratorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceleratorConfig> PARSER =
      new com.google.protobuf.AbstractParser<AcceleratorConfig>() {
        @java.lang.Override
        public AcceleratorConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcceleratorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceleratorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.AcceleratorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
