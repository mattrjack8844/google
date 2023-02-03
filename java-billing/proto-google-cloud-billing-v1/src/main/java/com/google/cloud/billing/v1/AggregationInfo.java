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
// source: google/cloud/billing/v1/cloud_catalog.proto

package com.google.cloud.billing.v1;

/**
 *
 *
 * <pre>
 * Represents the aggregation level and interval for pricing of a single SKU.
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.v1.AggregationInfo}
 */
public final class AggregationInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.v1.AggregationInfo)
    AggregationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AggregationInfo.newBuilder() to construct.
  private AggregationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AggregationInfo() {
    aggregationLevel_ = 0;
    aggregationInterval_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AggregationInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.billing.v1.CloudCatalogProto
        .internal_static_google_cloud_billing_v1_AggregationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.v1.CloudCatalogProto
        .internal_static_google_cloud_billing_v1_AggregationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.v1.AggregationInfo.class,
            com.google.cloud.billing.v1.AggregationInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The level at which usage is aggregated to compute cost.
   * Example: "ACCOUNT" aggregation level indicates that usage for tiered
   * pricing is aggregated across all projects in a single account.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.billing.v1.AggregationInfo.AggregationLevel}
   */
  public enum AggregationLevel implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>AGGREGATION_LEVEL_UNSPECIFIED = 0;</code> */
    AGGREGATION_LEVEL_UNSPECIFIED(0),
    /** <code>ACCOUNT = 1;</code> */
    ACCOUNT(1),
    /** <code>PROJECT = 2;</code> */
    PROJECT(2),
    UNRECOGNIZED(-1),
    ;

    /** <code>AGGREGATION_LEVEL_UNSPECIFIED = 0;</code> */
    public static final int AGGREGATION_LEVEL_UNSPECIFIED_VALUE = 0;
    /** <code>ACCOUNT = 1;</code> */
    public static final int ACCOUNT_VALUE = 1;
    /** <code>PROJECT = 2;</code> */
    public static final int PROJECT_VALUE = 2;

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
    public static AggregationLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AggregationLevel forNumber(int value) {
      switch (value) {
        case 0:
          return AGGREGATION_LEVEL_UNSPECIFIED;
        case 1:
          return ACCOUNT;
        case 2:
          return PROJECT;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AggregationLevel> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AggregationLevel>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AggregationLevel>() {
              public AggregationLevel findValueByNumber(int number) {
                return AggregationLevel.forNumber(number);
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
      return com.google.cloud.billing.v1.AggregationInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final AggregationLevel[] VALUES = values();

    public static AggregationLevel valueOf(
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

    private AggregationLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.billing.v1.AggregationInfo.AggregationLevel)
  }

  /**
   *
   *
   * <pre>
   * The interval at which usage is aggregated to compute cost.
   * Example: "MONTHLY" aggregation interval indicates that usage for tiered
   * pricing is aggregated every month.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.billing.v1.AggregationInfo.AggregationInterval}
   */
  public enum AggregationInterval implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>AGGREGATION_INTERVAL_UNSPECIFIED = 0;</code> */
    AGGREGATION_INTERVAL_UNSPECIFIED(0),
    /** <code>DAILY = 1;</code> */
    DAILY(1),
    /** <code>MONTHLY = 2;</code> */
    MONTHLY(2),
    UNRECOGNIZED(-1),
    ;

    /** <code>AGGREGATION_INTERVAL_UNSPECIFIED = 0;</code> */
    public static final int AGGREGATION_INTERVAL_UNSPECIFIED_VALUE = 0;
    /** <code>DAILY = 1;</code> */
    public static final int DAILY_VALUE = 1;
    /** <code>MONTHLY = 2;</code> */
    public static final int MONTHLY_VALUE = 2;

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
    public static AggregationInterval valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AggregationInterval forNumber(int value) {
      switch (value) {
        case 0:
          return AGGREGATION_INTERVAL_UNSPECIFIED;
        case 1:
          return DAILY;
        case 2:
          return MONTHLY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AggregationInterval>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AggregationInterval>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AggregationInterval>() {
              public AggregationInterval findValueByNumber(int number) {
                return AggregationInterval.forNumber(number);
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
      return com.google.cloud.billing.v1.AggregationInfo.getDescriptor().getEnumTypes().get(1);
    }

    private static final AggregationInterval[] VALUES = values();

    public static AggregationInterval valueOf(
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

    private AggregationInterval(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.billing.v1.AggregationInfo.AggregationInterval)
  }

  public static final int AGGREGATION_LEVEL_FIELD_NUMBER = 1;
  private int aggregationLevel_ = 0;
  /**
   * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
   *
   * @return The enum numeric value on the wire for aggregationLevel.
   */
  @java.lang.Override
  public int getAggregationLevelValue() {
    return aggregationLevel_;
  }
  /**
   * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
   *
   * @return The aggregationLevel.
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.AggregationInfo.AggregationLevel getAggregationLevel() {
    com.google.cloud.billing.v1.AggregationInfo.AggregationLevel result =
        com.google.cloud.billing.v1.AggregationInfo.AggregationLevel.forNumber(aggregationLevel_);
    return result == null
        ? com.google.cloud.billing.v1.AggregationInfo.AggregationLevel.UNRECOGNIZED
        : result;
  }

  public static final int AGGREGATION_INTERVAL_FIELD_NUMBER = 2;
  private int aggregationInterval_ = 0;
  /**
   * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for aggregationInterval.
   */
  @java.lang.Override
  public int getAggregationIntervalValue() {
    return aggregationInterval_;
  }
  /**
   * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
   * </code>
   *
   * @return The aggregationInterval.
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.AggregationInfo.AggregationInterval getAggregationInterval() {
    com.google.cloud.billing.v1.AggregationInfo.AggregationInterval result =
        com.google.cloud.billing.v1.AggregationInfo.AggregationInterval.forNumber(
            aggregationInterval_);
    return result == null
        ? com.google.cloud.billing.v1.AggregationInfo.AggregationInterval.UNRECOGNIZED
        : result;
  }

  public static final int AGGREGATION_COUNT_FIELD_NUMBER = 3;
  private int aggregationCount_ = 0;
  /**
   *
   *
   * <pre>
   * The number of intervals to aggregate over.
   * Example: If aggregation_level is "DAILY" and aggregation_count is 14,
   * aggregation will be over 14 days.
   * </pre>
   *
   * <code>int32 aggregation_count = 3;</code>
   *
   * @return The aggregationCount.
   */
  @java.lang.Override
  public int getAggregationCount() {
    return aggregationCount_;
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
    if (aggregationLevel_
        != com.google.cloud.billing.v1.AggregationInfo.AggregationLevel
            .AGGREGATION_LEVEL_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, aggregationLevel_);
    }
    if (aggregationInterval_
        != com.google.cloud.billing.v1.AggregationInfo.AggregationInterval
            .AGGREGATION_INTERVAL_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, aggregationInterval_);
    }
    if (aggregationCount_ != 0) {
      output.writeInt32(3, aggregationCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aggregationLevel_
        != com.google.cloud.billing.v1.AggregationInfo.AggregationLevel
            .AGGREGATION_LEVEL_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, aggregationLevel_);
    }
    if (aggregationInterval_
        != com.google.cloud.billing.v1.AggregationInfo.AggregationInterval
            .AGGREGATION_INTERVAL_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, aggregationInterval_);
    }
    if (aggregationCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, aggregationCount_);
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
    if (!(obj instanceof com.google.cloud.billing.v1.AggregationInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.v1.AggregationInfo other =
        (com.google.cloud.billing.v1.AggregationInfo) obj;

    if (aggregationLevel_ != other.aggregationLevel_) return false;
    if (aggregationInterval_ != other.aggregationInterval_) return false;
    if (getAggregationCount() != other.getAggregationCount()) return false;
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
    hash = (37 * hash) + AGGREGATION_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + aggregationLevel_;
    hash = (37 * hash) + AGGREGATION_INTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + aggregationInterval_;
    hash = (37 * hash) + AGGREGATION_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAggregationCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.AggregationInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.billing.v1.AggregationInfo prototype) {
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
   * Represents the aggregation level and interval for pricing of a single SKU.
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.v1.AggregationInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.v1.AggregationInfo)
      com.google.cloud.billing.v1.AggregationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.billing.v1.CloudCatalogProto
          .internal_static_google_cloud_billing_v1_AggregationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.v1.CloudCatalogProto
          .internal_static_google_cloud_billing_v1_AggregationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.v1.AggregationInfo.class,
              com.google.cloud.billing.v1.AggregationInfo.Builder.class);
    }

    // Construct using com.google.cloud.billing.v1.AggregationInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      aggregationLevel_ = 0;
      aggregationInterval_ = 0;
      aggregationCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.billing.v1.CloudCatalogProto
          .internal_static_google_cloud_billing_v1_AggregationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.AggregationInfo getDefaultInstanceForType() {
      return com.google.cloud.billing.v1.AggregationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.AggregationInfo build() {
      com.google.cloud.billing.v1.AggregationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.AggregationInfo buildPartial() {
      com.google.cloud.billing.v1.AggregationInfo result =
          new com.google.cloud.billing.v1.AggregationInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.billing.v1.AggregationInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.aggregationLevel_ = aggregationLevel_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.aggregationInterval_ = aggregationInterval_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.aggregationCount_ = aggregationCount_;
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
      if (other instanceof com.google.cloud.billing.v1.AggregationInfo) {
        return mergeFrom((com.google.cloud.billing.v1.AggregationInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.v1.AggregationInfo other) {
      if (other == com.google.cloud.billing.v1.AggregationInfo.getDefaultInstance()) return this;
      if (other.aggregationLevel_ != 0) {
        setAggregationLevelValue(other.getAggregationLevelValue());
      }
      if (other.aggregationInterval_ != 0) {
        setAggregationIntervalValue(other.getAggregationIntervalValue());
      }
      if (other.getAggregationCount() != 0) {
        setAggregationCount(other.getAggregationCount());
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
                aggregationLevel_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                aggregationInterval_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                aggregationCount_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private int aggregationLevel_ = 0;
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
     *
     * @return The enum numeric value on the wire for aggregationLevel.
     */
    @java.lang.Override
    public int getAggregationLevelValue() {
      return aggregationLevel_;
    }
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
     *
     * @param value The enum numeric value on the wire for aggregationLevel to set.
     * @return This builder for chaining.
     */
    public Builder setAggregationLevelValue(int value) {
      aggregationLevel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
     *
     * @return The aggregationLevel.
     */
    @java.lang.Override
    public com.google.cloud.billing.v1.AggregationInfo.AggregationLevel getAggregationLevel() {
      com.google.cloud.billing.v1.AggregationInfo.AggregationLevel result =
          com.google.cloud.billing.v1.AggregationInfo.AggregationLevel.forNumber(aggregationLevel_);
      return result == null
          ? com.google.cloud.billing.v1.AggregationInfo.AggregationLevel.UNRECOGNIZED
          : result;
    }
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
     *
     * @param value The aggregationLevel to set.
     * @return This builder for chaining.
     */
    public Builder setAggregationLevel(
        com.google.cloud.billing.v1.AggregationInfo.AggregationLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      aggregationLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationLevel aggregation_level = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAggregationLevel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      aggregationLevel_ = 0;
      onChanged();
      return this;
    }

    private int aggregationInterval_ = 0;
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for aggregationInterval.
     */
    @java.lang.Override
    public int getAggregationIntervalValue() {
      return aggregationInterval_;
    }
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for aggregationInterval to set.
     * @return This builder for chaining.
     */
    public Builder setAggregationIntervalValue(int value) {
      aggregationInterval_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
     * </code>
     *
     * @return The aggregationInterval.
     */
    @java.lang.Override
    public com.google.cloud.billing.v1.AggregationInfo.AggregationInterval
        getAggregationInterval() {
      com.google.cloud.billing.v1.AggregationInfo.AggregationInterval result =
          com.google.cloud.billing.v1.AggregationInfo.AggregationInterval.forNumber(
              aggregationInterval_);
      return result == null
          ? com.google.cloud.billing.v1.AggregationInfo.AggregationInterval.UNRECOGNIZED
          : result;
    }
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
     * </code>
     *
     * @param value The aggregationInterval to set.
     * @return This builder for chaining.
     */
    public Builder setAggregationInterval(
        com.google.cloud.billing.v1.AggregationInfo.AggregationInterval value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      aggregationInterval_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.billing.v1.AggregationInfo.AggregationInterval aggregation_interval = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAggregationInterval() {
      bitField0_ = (bitField0_ & ~0x00000002);
      aggregationInterval_ = 0;
      onChanged();
      return this;
    }

    private int aggregationCount_;
    /**
     *
     *
     * <pre>
     * The number of intervals to aggregate over.
     * Example: If aggregation_level is "DAILY" and aggregation_count is 14,
     * aggregation will be over 14 days.
     * </pre>
     *
     * <code>int32 aggregation_count = 3;</code>
     *
     * @return The aggregationCount.
     */
    @java.lang.Override
    public int getAggregationCount() {
      return aggregationCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of intervals to aggregate over.
     * Example: If aggregation_level is "DAILY" and aggregation_count is 14,
     * aggregation will be over 14 days.
     * </pre>
     *
     * <code>int32 aggregation_count = 3;</code>
     *
     * @param value The aggregationCount to set.
     * @return This builder for chaining.
     */
    public Builder setAggregationCount(int value) {

      aggregationCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of intervals to aggregate over.
     * Example: If aggregation_level is "DAILY" and aggregation_count is 14,
     * aggregation will be over 14 days.
     * </pre>
     *
     * <code>int32 aggregation_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAggregationCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      aggregationCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.billing.v1.AggregationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.v1.AggregationInfo)
  private static final com.google.cloud.billing.v1.AggregationInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.v1.AggregationInfo();
  }

  public static com.google.cloud.billing.v1.AggregationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AggregationInfo> PARSER =
      new com.google.protobuf.AbstractParser<AggregationInfo>() {
        @java.lang.Override
        public AggregationInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<AggregationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AggregationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.v1.AggregationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
