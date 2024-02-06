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
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datafusion.v1beta1;

/**
 *
 *
 * <pre>
 * Identifies Data Fusion accelerators for an instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datafusion.v1beta1.Accelerator}
 */
public final class Accelerator extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datafusion.v1beta1.Accelerator)
    AcceleratorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Accelerator.newBuilder() to construct.
  private Accelerator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Accelerator() {
    acceleratorType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Accelerator();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1
        .internal_static_google_cloud_datafusion_v1beta1_Accelerator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1
        .internal_static_google_cloud_datafusion_v1beta1_Accelerator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datafusion.v1beta1.Accelerator.class,
            com.google.cloud.datafusion.v1beta1.Accelerator.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Each type represents an Accelerator (Add-On) supported by Cloud Data Fusion
   * service.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType}
   */
  public enum AcceleratorType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value, if unspecified.
     * </pre>
     *
     * <code>ACCELERATOR_TYPE_UNSPECIFIED = 0;</code>
     */
    ACCELERATOR_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Change Data Capture accelerator for CDF.
     * </pre>
     *
     * <code>CDC = 1;</code>
     */
    CDC(1),
    /**
     *
     *
     * <pre>
     * Cloud Healthcare accelerator for CDF. This accelerator is to enable Cloud
     * Healthcare specific CDF plugins developed by Healthcare team.
     * </pre>
     *
     * <code>HEALTHCARE = 2;</code>
     */
    HEALTHCARE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value, if unspecified.
     * </pre>
     *
     * <code>ACCELERATOR_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int ACCELERATOR_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Change Data Capture accelerator for CDF.
     * </pre>
     *
     * <code>CDC = 1;</code>
     */
    public static final int CDC_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Cloud Healthcare accelerator for CDF. This accelerator is to enable Cloud
     * Healthcare specific CDF plugins developed by Healthcare team.
     * </pre>
     *
     * <code>HEALTHCARE = 2;</code>
     */
    public static final int HEALTHCARE_VALUE = 2;

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
    public static AcceleratorType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AcceleratorType forNumber(int value) {
      switch (value) {
        case 0:
          return ACCELERATOR_TYPE_UNSPECIFIED;
        case 1:
          return CDC;
        case 2:
          return HEALTHCARE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AcceleratorType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AcceleratorType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AcceleratorType>() {
              public AcceleratorType findValueByNumber(int number) {
                return AcceleratorType.forNumber(number);
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
      return com.google.cloud.datafusion.v1beta1.Accelerator.getDescriptor().getEnumTypes().get(0);
    }

    private static final AcceleratorType[] VALUES = values();

    public static AcceleratorType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AcceleratorType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType)
  }

  public static final int ACCELERATOR_TYPE_FIELD_NUMBER = 1;
  private int acceleratorType_ = 0;
  /**
   *
   *
   * <pre>
   * The type of an accelator for a CDF instance.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType accelerator_type = 1;</code>
   *
   * @return The enum numeric value on the wire for acceleratorType.
   */
  @java.lang.Override
  public int getAcceleratorTypeValue() {
    return acceleratorType_;
  }
  /**
   *
   *
   * <pre>
   * The type of an accelator for a CDF instance.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType accelerator_type = 1;</code>
   *
   * @return The acceleratorType.
   */
  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType getAcceleratorType() {
    com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType result =
        com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType.forNumber(acceleratorType_);
    return result == null
        ? com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType.UNRECOGNIZED
        : result;
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
    if (acceleratorType_
        != com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType
            .ACCELERATOR_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, acceleratorType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (acceleratorType_
        != com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType
            .ACCELERATOR_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, acceleratorType_);
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
    if (!(obj instanceof com.google.cloud.datafusion.v1beta1.Accelerator)) {
      return super.equals(obj);
    }
    com.google.cloud.datafusion.v1beta1.Accelerator other =
        (com.google.cloud.datafusion.v1beta1.Accelerator) obj;

    if (acceleratorType_ != other.acceleratorType_) return false;
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
    hash = (37 * hash) + ACCELERATOR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + acceleratorType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datafusion.v1beta1.Accelerator prototype) {
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
   * Identifies Data Fusion accelerators for an instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datafusion.v1beta1.Accelerator}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datafusion.v1beta1.Accelerator)
      com.google.cloud.datafusion.v1beta1.AcceleratorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_Accelerator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_Accelerator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datafusion.v1beta1.Accelerator.class,
              com.google.cloud.datafusion.v1beta1.Accelerator.Builder.class);
    }

    // Construct using com.google.cloud.datafusion.v1beta1.Accelerator.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      acceleratorType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_Accelerator_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Accelerator getDefaultInstanceForType() {
      return com.google.cloud.datafusion.v1beta1.Accelerator.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Accelerator build() {
      com.google.cloud.datafusion.v1beta1.Accelerator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Accelerator buildPartial() {
      com.google.cloud.datafusion.v1beta1.Accelerator result =
          new com.google.cloud.datafusion.v1beta1.Accelerator(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datafusion.v1beta1.Accelerator result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.acceleratorType_ = acceleratorType_;
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
      if (other instanceof com.google.cloud.datafusion.v1beta1.Accelerator) {
        return mergeFrom((com.google.cloud.datafusion.v1beta1.Accelerator) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datafusion.v1beta1.Accelerator other) {
      if (other == com.google.cloud.datafusion.v1beta1.Accelerator.getDefaultInstance())
        return this;
      if (other.acceleratorType_ != 0) {
        setAcceleratorTypeValue(other.getAcceleratorTypeValue());
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
                acceleratorType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int acceleratorType_ = 0;
    /**
     *
     *
     * <pre>
     * The type of an accelator for a CDF instance.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType accelerator_type = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for acceleratorType.
     */
    @java.lang.Override
    public int getAcceleratorTypeValue() {
      return acceleratorType_;
    }
    /**
     *
     *
     * <pre>
     * The type of an accelator for a CDF instance.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType accelerator_type = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorTypeValue(int value) {
      acceleratorType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of an accelator for a CDF instance.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType accelerator_type = 1;
     * </code>
     *
     * @return The acceleratorType.
     */
    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType getAcceleratorType() {
      com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType result =
          com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType.forNumber(
              acceleratorType_);
      return result == null
          ? com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of an accelator for a CDF instance.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType accelerator_type = 1;
     * </code>
     *
     * @param value The acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorType(
        com.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      acceleratorType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of an accelator for a CDF instance.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType accelerator_type = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      acceleratorType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datafusion.v1beta1.Accelerator)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datafusion.v1beta1.Accelerator)
  private static final com.google.cloud.datafusion.v1beta1.Accelerator DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datafusion.v1beta1.Accelerator();
  }

  public static com.google.cloud.datafusion.v1beta1.Accelerator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Accelerator> PARSER =
      new com.google.protobuf.AbstractParser<Accelerator>() {
        @java.lang.Override
        public Accelerator parsePartialFrom(
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

  public static com.google.protobuf.Parser<Accelerator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Accelerator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.Accelerator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
