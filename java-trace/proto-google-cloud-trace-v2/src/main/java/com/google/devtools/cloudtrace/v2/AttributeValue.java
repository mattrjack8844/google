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
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

/**
 *
 *
 * <pre>
 * The allowed types for [VALUE] in a `[KEY]:[VALUE]` attribute.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v2.AttributeValue}
 */
public final class AttributeValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v2.AttributeValue)
    AttributeValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AttributeValue.newBuilder() to construct.
  private AttributeValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AttributeValue() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AttributeValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AttributeValue(
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
              com.google.devtools.cloudtrace.v2.TruncatableString.Builder subBuilder = null;
              if (valueCase_ == 1) {
                subBuilder =
                    ((com.google.devtools.cloudtrace.v2.TruncatableString) value_).toBuilder();
              }
              value_ =
                  input.readMessage(
                      com.google.devtools.cloudtrace.v2.TruncatableString.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.devtools.cloudtrace.v2.TruncatableString) value_);
                value_ = subBuilder.buildPartial();
              }
              valueCase_ = 1;
              break;
            }
          case 16:
            {
              valueCase_ = 2;
              value_ = input.readInt64();
              break;
            }
          case 24:
            {
              valueCase_ = 3;
              value_ = input.readBool();
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
    return com.google.devtools.cloudtrace.v2.TraceProto
        .internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v2.TraceProto
        .internal_static_google_devtools_cloudtrace_v2_AttributeValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v2.AttributeValue.class,
            com.google.devtools.cloudtrace.v2.AttributeValue.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;

  public enum ValueCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STRING_VALUE(1),
    INT_VALUE(2),
    BOOL_VALUE(3),
    VALUE_NOT_SET(0);
    private final int value;

    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1:
          return STRING_VALUE;
        case 2:
          return INT_VALUE;
        case 3:
          return BOOL_VALUE;
        case 0:
          return VALUE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase getValueCase() {
    return ValueCase.forNumber(valueCase_);
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   *
   * @return Whether the stringValue field is set.
   */
  public boolean hasStringValue() {
    return valueCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   *
   * @return The stringValue.
   */
  public com.google.devtools.cloudtrace.v2.TruncatableString getStringValue() {
    if (valueCase_ == 1) {
      return (com.google.devtools.cloudtrace.v2.TruncatableString) value_;
    }
    return com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   */
  public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getStringValueOrBuilder() {
    if (valueCase_ == 1) {
      return (com.google.devtools.cloudtrace.v2.TruncatableString) value_;
    }
    return com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance();
  }

  public static final int INT_VALUE_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A 64-bit signed integer.
   * </pre>
   *
   * <code>int64 int_value = 2;</code>
   *
   * @return The intValue.
   */
  public long getIntValue() {
    if (valueCase_ == 2) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * A Boolean value represented by `true` or `false`.
   * </pre>
   *
   * <code>bool bool_value = 3;</code>
   *
   * @return The boolValue.
   */
  public boolean getBoolValue() {
    if (valueCase_ == 3) {
      return (java.lang.Boolean) value_;
    }
    return false;
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
    if (valueCase_ == 1) {
      output.writeMessage(1, (com.google.devtools.cloudtrace.v2.TruncatableString) value_);
    }
    if (valueCase_ == 2) {
      output.writeInt64(2, (long) ((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      output.writeBool(3, (boolean) ((java.lang.Boolean) value_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.devtools.cloudtrace.v2.TruncatableString) value_);
    }
    if (valueCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              2, (long) ((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              3, (boolean) ((java.lang.Boolean) value_));
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v2.AttributeValue)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v2.AttributeValue other =
        (com.google.devtools.cloudtrace.v2.AttributeValue) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (!getStringValue().equals(other.getStringValue())) return false;
        break;
      case 2:
        if (getIntValue() != other.getIntValue()) return false;
        break;
      case 3:
        if (getBoolValue() != other.getBoolValue()) return false;
        break;
      case 0:
      default:
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
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 2:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getIntValue());
        break;
      case 3:
        hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getBoolValue());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue parseFrom(
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

  public static Builder newBuilder(com.google.devtools.cloudtrace.v2.AttributeValue prototype) {
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
   * The allowed types for [VALUE] in a `[KEY]:[VALUE]` attribute.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v2.AttributeValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v2.AttributeValue)
      com.google.devtools.cloudtrace.v2.AttributeValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.cloudtrace.v2.TraceProto
          .internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v2.TraceProto
          .internal_static_google_devtools_cloudtrace_v2_AttributeValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v2.AttributeValue.class,
              com.google.devtools.cloudtrace.v2.AttributeValue.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v2.AttributeValue.newBuilder()
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
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.cloudtrace.v2.TraceProto
          .internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.AttributeValue getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v2.AttributeValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.AttributeValue build() {
      com.google.devtools.cloudtrace.v2.AttributeValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.AttributeValue buildPartial() {
      com.google.devtools.cloudtrace.v2.AttributeValue result =
          new com.google.devtools.cloudtrace.v2.AttributeValue(this);
      if (valueCase_ == 1) {
        if (stringValueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = stringValueBuilder_.build();
        }
      }
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      result.valueCase_ = valueCase_;
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
      if (other instanceof com.google.devtools.cloudtrace.v2.AttributeValue) {
        return mergeFrom((com.google.devtools.cloudtrace.v2.AttributeValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v2.AttributeValue other) {
      if (other == com.google.devtools.cloudtrace.v2.AttributeValue.getDefaultInstance())
        return this;
      switch (other.getValueCase()) {
        case STRING_VALUE:
          {
            mergeStringValue(other.getStringValue());
            break;
          }
        case INT_VALUE:
          {
            setIntValue(other.getIntValue());
            break;
          }
        case BOOL_VALUE:
          {
            setBoolValue(other.getBoolValue());
            break;
          }
        case VALUE_NOT_SET:
          {
            break;
          }
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
      com.google.devtools.cloudtrace.v2.AttributeValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.cloudtrace.v2.AttributeValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int valueCase_ = 0;
    private java.lang.Object value_;

    public ValueCase getValueCase() {
      return ValueCase.forNumber(valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.TruncatableString,
            com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
            com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>
        stringValueBuilder_;
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     *
     * @return Whether the stringValue field is set.
     */
    public boolean hasStringValue() {
      return valueCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     *
     * @return The stringValue.
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString getStringValue() {
      if (stringValueBuilder_ == null) {
        if (valueCase_ == 1) {
          return (com.google.devtools.cloudtrace.v2.TruncatableString) value_;
        }
        return com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance();
      } else {
        if (valueCase_ == 1) {
          return stringValueBuilder_.getMessage();
        }
        return com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     */
    public Builder setStringValue(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (stringValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        stringValueBuilder_.setMessage(value);
      }
      valueCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     */
    public Builder setStringValue(
        com.google.devtools.cloudtrace.v2.TruncatableString.Builder builderForValue) {
      if (stringValueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        stringValueBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     */
    public Builder mergeStringValue(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (stringValueBuilder_ == null) {
        if (valueCase_ == 1
            && value_ != com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()) {
          value_ =
              com.google.devtools.cloudtrace.v2.TruncatableString.newBuilder(
                      (com.google.devtools.cloudtrace.v2.TruncatableString) value_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 1) {
          stringValueBuilder_.mergeFrom(value);
        }
        stringValueBuilder_.setMessage(value);
      }
      valueCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     */
    public Builder clearStringValue() {
      if (stringValueBuilder_ == null) {
        if (valueCase_ == 1) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 1) {
          valueCase_ = 0;
          value_ = null;
        }
        stringValueBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString.Builder getStringValueBuilder() {
      return getStringValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getStringValueOrBuilder() {
      if ((valueCase_ == 1) && (stringValueBuilder_ != null)) {
        return stringValueBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 1) {
          return (com.google.devtools.cloudtrace.v2.TruncatableString) value_;
        }
        return com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A string up to 256 bytes long.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.TruncatableString,
            com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
            com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>
        getStringValueFieldBuilder() {
      if (stringValueBuilder_ == null) {
        if (!(valueCase_ == 1)) {
          value_ = com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance();
        }
        stringValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.cloudtrace.v2.TruncatableString,
                com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
                com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>(
                (com.google.devtools.cloudtrace.v2.TruncatableString) value_,
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      valueCase_ = 1;
      onChanged();
      ;
      return stringValueBuilder_;
    }

    /**
     *
     *
     * <pre>
     * A 64-bit signed integer.
     * </pre>
     *
     * <code>int64 int_value = 2;</code>
     *
     * @return The intValue.
     */
    public long getIntValue() {
      if (valueCase_ == 2) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     *
     *
     * <pre>
     * A 64-bit signed integer.
     * </pre>
     *
     * <code>int64 int_value = 2;</code>
     *
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(long value) {
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A 64-bit signed integer.
     * </pre>
     *
     * <code>int64 int_value = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A Boolean value represented by `true` or `false`.
     * </pre>
     *
     * <code>bool bool_value = 3;</code>
     *
     * @return The boolValue.
     */
    public boolean getBoolValue() {
      if (valueCase_ == 3) {
        return (java.lang.Boolean) value_;
      }
      return false;
    }
    /**
     *
     *
     * <pre>
     * A Boolean value represented by `true` or `false`.
     * </pre>
     *
     * <code>bool bool_value = 3;</code>
     *
     * @param value The boolValue to set.
     * @return This builder for chaining.
     */
    public Builder setBoolValue(boolean value) {
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Boolean value represented by `true` or `false`.
     * </pre>
     *
     * <code>bool bool_value = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBoolValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v2.AttributeValue)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v2.AttributeValue)
  private static final com.google.devtools.cloudtrace.v2.AttributeValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v2.AttributeValue();
  }

  public static com.google.devtools.cloudtrace.v2.AttributeValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttributeValue> PARSER =
      new com.google.protobuf.AbstractParser<AttributeValue>() {
        @java.lang.Override
        public AttributeValue parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AttributeValue(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AttributeValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttributeValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.AttributeValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
