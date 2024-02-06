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
// source: google/cloud/dataproc/v1/sessions.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Jupyter configuration for an interactive session.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.JupyterConfig}
 */
public final class JupyterConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.JupyterConfig)
    JupyterConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use JupyterConfig.newBuilder() to construct.
  private JupyterConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private JupyterConfig() {
    kernel_ = 0;
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new JupyterConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.SessionsProto
        .internal_static_google_cloud_dataproc_v1_JupyterConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.SessionsProto
        .internal_static_google_cloud_dataproc_v1_JupyterConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.JupyterConfig.class,
            com.google.cloud.dataproc.v1.JupyterConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Jupyter kernel types.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dataproc.v1.JupyterConfig.Kernel}
   */
  public enum Kernel implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The kernel is unknown.
     * </pre>
     *
     * <code>KERNEL_UNSPECIFIED = 0;</code>
     */
    KERNEL_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Python kernel.
     * </pre>
     *
     * <code>PYTHON = 1;</code>
     */
    PYTHON(1),
    /**
     *
     *
     * <pre>
     * Scala kernel.
     * </pre>
     *
     * <code>SCALA = 2;</code>
     */
    SCALA(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The kernel is unknown.
     * </pre>
     *
     * <code>KERNEL_UNSPECIFIED = 0;</code>
     */
    public static final int KERNEL_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Python kernel.
     * </pre>
     *
     * <code>PYTHON = 1;</code>
     */
    public static final int PYTHON_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Scala kernel.
     * </pre>
     *
     * <code>SCALA = 2;</code>
     */
    public static final int SCALA_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Kernel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Kernel forNumber(int value) {
      switch (value) {
        case 0:
          return KERNEL_UNSPECIFIED;
        case 1:
          return PYTHON;
        case 2:
          return SCALA;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Kernel> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Kernel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Kernel>() {
          public Kernel findValueByNumber(int number) {
            return Kernel.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.JupyterConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Kernel[] VALUES = values();

    public static Kernel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Kernel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dataproc.v1.JupyterConfig.Kernel)
  }

  public static final int KERNEL_FIELD_NUMBER = 1;
  private int kernel_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Kernel
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JupyterConfig.Kernel kernel = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for kernel.
   */
  @java.lang.Override
  public int getKernelValue() {
    return kernel_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Kernel
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JupyterConfig.Kernel kernel = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The kernel.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.JupyterConfig.Kernel getKernel() {
    com.google.cloud.dataproc.v1.JupyterConfig.Kernel result =
        com.google.cloud.dataproc.v1.JupyterConfig.Kernel.forNumber(kernel_);
    return result == null ? com.google.cloud.dataproc.v1.JupyterConfig.Kernel.UNRECOGNIZED : result;
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Display name, shown in the Jupyter kernelspec card.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Display name, shown in the Jupyter kernelspec card.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (kernel_
        != com.google.cloud.dataproc.v1.JupyterConfig.Kernel.KERNEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, kernel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kernel_
        != com.google.cloud.dataproc.v1.JupyterConfig.Kernel.KERNEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, kernel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.JupyterConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.JupyterConfig other =
        (com.google.cloud.dataproc.v1.JupyterConfig) obj;

    if (kernel_ != other.kernel_) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
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
    hash = (37 * hash) + KERNEL_FIELD_NUMBER;
    hash = (53 * hash) + kernel_;
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.JupyterConfig prototype) {
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
   * Jupyter configuration for an interactive session.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.JupyterConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.JupyterConfig)
      com.google.cloud.dataproc.v1.JupyterConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.SessionsProto
          .internal_static_google_cloud_dataproc_v1_JupyterConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.SessionsProto
          .internal_static_google_cloud_dataproc_v1_JupyterConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.JupyterConfig.class,
              com.google.cloud.dataproc.v1.JupyterConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.JupyterConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kernel_ = 0;
      displayName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.SessionsProto
          .internal_static_google_cloud_dataproc_v1_JupyterConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.JupyterConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.JupyterConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.JupyterConfig build() {
      com.google.cloud.dataproc.v1.JupyterConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.JupyterConfig buildPartial() {
      com.google.cloud.dataproc.v1.JupyterConfig result =
          new com.google.cloud.dataproc.v1.JupyterConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.JupyterConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kernel_ = kernel_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayName_ = displayName_;
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
      if (other instanceof com.google.cloud.dataproc.v1.JupyterConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.JupyterConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.JupyterConfig other) {
      if (other == com.google.cloud.dataproc.v1.JupyterConfig.getDefaultInstance()) return this;
      if (other.kernel_ != 0) {
        setKernelValue(other.getKernelValue());
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000002;
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
            case 8:
              {
                kernel_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                displayName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private int kernel_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Kernel
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.JupyterConfig.Kernel kernel = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for kernel.
     */
    @java.lang.Override
    public int getKernelValue() {
      return kernel_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Kernel
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.JupyterConfig.Kernel kernel = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for kernel to set.
     * @return This builder for chaining.
     */
    public Builder setKernelValue(int value) {
      kernel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Kernel
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.JupyterConfig.Kernel kernel = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The kernel.
     */
    @java.lang.Override
    public com.google.cloud.dataproc.v1.JupyterConfig.Kernel getKernel() {
      com.google.cloud.dataproc.v1.JupyterConfig.Kernel result =
          com.google.cloud.dataproc.v1.JupyterConfig.Kernel.forNumber(kernel_);
      return result == null
          ? com.google.cloud.dataproc.v1.JupyterConfig.Kernel.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Kernel
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.JupyterConfig.Kernel kernel = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The kernel to set.
     * @return This builder for chaining.
     */
    public Builder setKernel(com.google.cloud.dataproc.v1.JupyterConfig.Kernel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kernel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Kernel
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.JupyterConfig.Kernel kernel = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKernel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kernel_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Display name, shown in the Jupyter kernelspec card.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Display name, shown in the Jupyter kernelspec card.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Display name, shown in the Jupyter kernelspec card.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      displayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Display name, shown in the Jupyter kernelspec card.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Display name, shown in the Jupyter kernelspec card.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      displayName_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.JupyterConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.JupyterConfig)
  private static final com.google.cloud.dataproc.v1.JupyterConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.JupyterConfig();
  }

  public static com.google.cloud.dataproc.v1.JupyterConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JupyterConfig> PARSER =
      new com.google.protobuf.AbstractParser<JupyterConfig>() {
        @java.lang.Override
        public JupyterConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<JupyterConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JupyterConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.JupyterConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
