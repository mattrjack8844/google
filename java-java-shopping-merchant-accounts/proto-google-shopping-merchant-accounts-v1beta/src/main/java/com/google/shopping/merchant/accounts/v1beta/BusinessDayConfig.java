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
// source: google/shopping/merchant/accounts/v1beta/shippingsettings.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.accounts.v1beta;

/**
 *
 *
 * <pre>
 * Business days of the warehouse.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.accounts.v1beta.BusinessDayConfig}
 */
public final class BusinessDayConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.accounts.v1beta.BusinessDayConfig)
    BusinessDayConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BusinessDayConfig.newBuilder() to construct.
  private BusinessDayConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BusinessDayConfig() {
    businessDays_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BusinessDayConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_BusinessDayConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_BusinessDayConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.class,
            com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Builder.class);
  }

  /** Protobuf enum {@code google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday} */
  public enum Weekday implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>WEEKDAY_UNSPECIFIED = 0;</code> */
    WEEKDAY_UNSPECIFIED(0),
    /** <code>MONDAY = 1;</code> */
    MONDAY(1),
    /** <code>TUESDAY = 2;</code> */
    TUESDAY(2),
    /** <code>WEDNESDAY = 3;</code> */
    WEDNESDAY(3),
    /** <code>THURSDAY = 4;</code> */
    THURSDAY(4),
    /** <code>FRIDAY = 5;</code> */
    FRIDAY(5),
    /** <code>SATURDAY = 6;</code> */
    SATURDAY(6),
    /** <code>SUNDAY = 7;</code> */
    SUNDAY(7),
    UNRECOGNIZED(-1),
    ;

    /** <code>WEEKDAY_UNSPECIFIED = 0;</code> */
    public static final int WEEKDAY_UNSPECIFIED_VALUE = 0;
    /** <code>MONDAY = 1;</code> */
    public static final int MONDAY_VALUE = 1;
    /** <code>TUESDAY = 2;</code> */
    public static final int TUESDAY_VALUE = 2;
    /** <code>WEDNESDAY = 3;</code> */
    public static final int WEDNESDAY_VALUE = 3;
    /** <code>THURSDAY = 4;</code> */
    public static final int THURSDAY_VALUE = 4;
    /** <code>FRIDAY = 5;</code> */
    public static final int FRIDAY_VALUE = 5;
    /** <code>SATURDAY = 6;</code> */
    public static final int SATURDAY_VALUE = 6;
    /** <code>SUNDAY = 7;</code> */
    public static final int SUNDAY_VALUE = 7;

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
    public static Weekday valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Weekday forNumber(int value) {
      switch (value) {
        case 0:
          return WEEKDAY_UNSPECIFIED;
        case 1:
          return MONDAY;
        case 2:
          return TUESDAY;
        case 3:
          return WEDNESDAY;
        case 4:
          return THURSDAY;
        case 5:
          return FRIDAY;
        case 6:
          return SATURDAY;
        case 7:
          return SUNDAY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Weekday> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Weekday> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Weekday>() {
          public Weekday findValueByNumber(int number) {
            return Weekday.forNumber(number);
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
      return com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Weekday[] VALUES = values();

    public static Weekday valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Weekday(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday)
  }

  public static final int BUSINESS_DAYS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> businessDays_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday>
      businessDays_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer,
              com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday>() {
            public com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday convert(
                java.lang.Integer from) {
              com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday result =
                  com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday.forNumber(
                      from);
              return result == null
                  ? com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday
                      .UNRECOGNIZED
                  : result;
            }
          };
  /**
   *
   *
   * <pre>
   * Required. Regular business days.
   * May not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the businessDays.
   */
  @java.lang.Override
  public java.util.List<com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday>
      getBusinessDaysList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday>(
        businessDays_, businessDays_converter_);
  }
  /**
   *
   *
   * <pre>
   * Required. Regular business days.
   * May not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of businessDays.
   */
  @java.lang.Override
  public int getBusinessDaysCount() {
    return businessDays_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Regular business days.
   * May not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The businessDays at the given index.
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday getBusinessDays(
      int index) {
    return businessDays_converter_.convert(businessDays_.get(index));
  }
  /**
   *
   *
   * <pre>
   * Required. Regular business days.
   * May not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for businessDays.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getBusinessDaysValueList() {
    return businessDays_;
  }
  /**
   *
   *
   * <pre>
   * Required. Regular business days.
   * May not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of businessDays at the given index.
   */
  @java.lang.Override
  public int getBusinessDaysValue(int index) {
    return businessDays_.get(index);
  }

  private int businessDaysMemoizedSerializedSize;

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
    getSerializedSize();
    if (getBusinessDaysList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(businessDaysMemoizedSerializedSize);
    }
    for (int i = 0; i < businessDays_.size(); i++) {
      output.writeEnumNoTag(businessDays_.get(i));
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
      for (int i = 0; i < businessDays_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(businessDays_.get(i));
      }
      size += dataSize;
      if (!getBusinessDaysList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      businessDaysMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig other =
        (com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig) obj;

    if (!businessDays_.equals(other.businessDays_)) return false;
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
    if (getBusinessDaysCount() > 0) {
      hash = (37 * hash) + BUSINESS_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + businessDays_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig parseFrom(
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
      com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig prototype) {
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
   * Business days of the warehouse.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.accounts.v1beta.BusinessDayConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.accounts.v1beta.BusinessDayConfig)
      com.google.shopping.merchant.accounts.v1beta.BusinessDayConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_BusinessDayConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_BusinessDayConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.class,
              com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Builder.class);
    }

    // Construct using com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      businessDays_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_BusinessDayConfig_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig build() {
      com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig buildPartial() {
      com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig result =
          new com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        businessDays_ = java.util.Collections.unmodifiableList(businessDays_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.businessDays_ = businessDays_;
    }

    private void buildPartial0(
        com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig) {
        return mergeFrom((com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig other) {
      if (other
          == com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.getDefaultInstance())
        return this;
      if (!other.businessDays_.isEmpty()) {
        if (businessDays_.isEmpty()) {
          businessDays_ = other.businessDays_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBusinessDaysIsMutable();
          businessDays_.addAll(other.businessDays_);
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
            case 8:
              {
                int tmpRaw = input.readEnum();
                ensureBusinessDaysIsMutable();
                businessDays_.add(tmpRaw);
                break;
              } // case 8
            case 10:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureBusinessDaysIsMutable();
                  businessDays_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
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

    private java.util.List<java.lang.Integer> businessDays_ = java.util.Collections.emptyList();

    private void ensureBusinessDaysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        businessDays_ = new java.util.ArrayList<java.lang.Integer>(businessDays_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return A list containing the businessDays.
     */
    public java.util.List<com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday>
        getBusinessDaysList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer,
          com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday>(
          businessDays_, businessDays_converter_);
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The count of businessDays.
     */
    public int getBusinessDaysCount() {
      return businessDays_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param index The index of the element to return.
     * @return The businessDays at the given index.
     */
    public com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday getBusinessDays(
        int index) {
      return businessDays_converter_.convert(businessDays_.get(index));
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The businessDays to set.
     * @return This builder for chaining.
     */
    public Builder setBusinessDays(
        int index, com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBusinessDaysIsMutable();
      businessDays_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The businessDays to add.
     * @return This builder for chaining.
     */
    public Builder addBusinessDays(
        com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBusinessDaysIsMutable();
      businessDays_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param values The businessDays to add.
     * @return This builder for chaining.
     */
    public Builder addAllBusinessDays(
        java.lang.Iterable<
                ? extends com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday>
            values) {
      ensureBusinessDaysIsMutable();
      for (com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday value : values) {
        businessDays_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBusinessDays() {
      businessDays_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for businessDays.
     */
    public java.util.List<java.lang.Integer> getBusinessDaysValueList() {
      return java.util.Collections.unmodifiableList(businessDays_);
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of businessDays at the given index.
     */
    public int getBusinessDaysValue(int index) {
      return businessDays_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for businessDays to set.
     * @return This builder for chaining.
     */
    public Builder setBusinessDaysValue(int index, int value) {
      ensureBusinessDaysIsMutable();
      businessDays_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for businessDays to add.
     * @return This builder for chaining.
     */
    public Builder addBusinessDaysValue(int value) {
      ensureBusinessDaysIsMutable();
      businessDays_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Regular business days.
     * May not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.BusinessDayConfig.Weekday business_days = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param values The enum numeric values on the wire for businessDays to add.
     * @return This builder for chaining.
     */
    public Builder addAllBusinessDaysValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureBusinessDaysIsMutable();
      for (int value : values) {
        businessDays_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.accounts.v1beta.BusinessDayConfig)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.accounts.v1beta.BusinessDayConfig)
  private static final com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig();
  }

  public static com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusinessDayConfig> PARSER =
      new com.google.protobuf.AbstractParser<BusinessDayConfig>() {
        @java.lang.Override
        public BusinessDayConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<BusinessDayConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusinessDayConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.BusinessDayConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
