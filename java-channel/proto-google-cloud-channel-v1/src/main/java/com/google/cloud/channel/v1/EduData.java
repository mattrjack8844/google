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
// source: google/cloud/channel/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Required Edu Attributes
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.EduData}
 */
public final class EduData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.EduData)
    EduDataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EduData.newBuilder() to construct.
  private EduData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EduData() {
    instituteType_ = 0;
    instituteSize_ = 0;
    website_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EduData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.CommonProto
        .internal_static_google_cloud_channel_v1_EduData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.CommonProto
        .internal_static_google_cloud_channel_v1_EduData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.EduData.class,
            com.google.cloud.channel.v1.EduData.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enum to specify the institute type.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.channel.v1.EduData.InstituteType}
   */
  public enum InstituteType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not used.
     * </pre>
     *
     * <code>INSTITUTE_TYPE_UNSPECIFIED = 0;</code>
     */
    INSTITUTE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Elementary/Secondary Schools &amp; Districts
     * </pre>
     *
     * <code>K12 = 1;</code>
     */
    K12(1),
    /**
     *
     *
     * <pre>
     * Higher Education Universities &amp; Colleges
     * </pre>
     *
     * <code>UNIVERSITY = 2;</code>
     */
    UNIVERSITY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not used.
     * </pre>
     *
     * <code>INSTITUTE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int INSTITUTE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Elementary/Secondary Schools &amp; Districts
     * </pre>
     *
     * <code>K12 = 1;</code>
     */
    public static final int K12_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Higher Education Universities &amp; Colleges
     * </pre>
     *
     * <code>UNIVERSITY = 2;</code>
     */
    public static final int UNIVERSITY_VALUE = 2;

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
    public static InstituteType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InstituteType forNumber(int value) {
      switch (value) {
        case 0:
          return INSTITUTE_TYPE_UNSPECIFIED;
        case 1:
          return K12;
        case 2:
          return UNIVERSITY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InstituteType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<InstituteType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InstituteType>() {
          public InstituteType findValueByNumber(int number) {
            return InstituteType.forNumber(number);
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
      return com.google.cloud.channel.v1.EduData.getDescriptor().getEnumTypes().get(0);
    }

    private static final InstituteType[] VALUES = values();

    public static InstituteType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private InstituteType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.EduData.InstituteType)
  }

  /**
   *
   *
   * <pre>
   * Number of students and staff the institute has.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.channel.v1.EduData.InstituteSize}
   */
  public enum InstituteSize implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not used.
     * </pre>
     *
     * <code>INSTITUTE_SIZE_UNSPECIFIED = 0;</code>
     */
    INSTITUTE_SIZE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * 1 - 100
     * </pre>
     *
     * <code>SIZE_1_100 = 1;</code>
     */
    SIZE_1_100(1),
    /**
     *
     *
     * <pre>
     * 101 - 500
     * </pre>
     *
     * <code>SIZE_101_500 = 2;</code>
     */
    SIZE_101_500(2),
    /**
     *
     *
     * <pre>
     * 501 - 1,000
     * </pre>
     *
     * <code>SIZE_501_1000 = 3;</code>
     */
    SIZE_501_1000(3),
    /**
     *
     *
     * <pre>
     * 1,001 - 2,000
     * </pre>
     *
     * <code>SIZE_1001_2000 = 4;</code>
     */
    SIZE_1001_2000(4),
    /**
     *
     *
     * <pre>
     * 2,001 - 5,000
     * </pre>
     *
     * <code>SIZE_2001_5000 = 5;</code>
     */
    SIZE_2001_5000(5),
    /**
     *
     *
     * <pre>
     * 5,001 - 10,000
     * </pre>
     *
     * <code>SIZE_5001_10000 = 6;</code>
     */
    SIZE_5001_10000(6),
    /**
     *
     *
     * <pre>
     * 10,001 +
     * </pre>
     *
     * <code>SIZE_10001_OR_MORE = 7;</code>
     */
    SIZE_10001_OR_MORE(7),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not used.
     * </pre>
     *
     * <code>INSTITUTE_SIZE_UNSPECIFIED = 0;</code>
     */
    public static final int INSTITUTE_SIZE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * 1 - 100
     * </pre>
     *
     * <code>SIZE_1_100 = 1;</code>
     */
    public static final int SIZE_1_100_VALUE = 1;
    /**
     *
     *
     * <pre>
     * 101 - 500
     * </pre>
     *
     * <code>SIZE_101_500 = 2;</code>
     */
    public static final int SIZE_101_500_VALUE = 2;
    /**
     *
     *
     * <pre>
     * 501 - 1,000
     * </pre>
     *
     * <code>SIZE_501_1000 = 3;</code>
     */
    public static final int SIZE_501_1000_VALUE = 3;
    /**
     *
     *
     * <pre>
     * 1,001 - 2,000
     * </pre>
     *
     * <code>SIZE_1001_2000 = 4;</code>
     */
    public static final int SIZE_1001_2000_VALUE = 4;
    /**
     *
     *
     * <pre>
     * 2,001 - 5,000
     * </pre>
     *
     * <code>SIZE_2001_5000 = 5;</code>
     */
    public static final int SIZE_2001_5000_VALUE = 5;
    /**
     *
     *
     * <pre>
     * 5,001 - 10,000
     * </pre>
     *
     * <code>SIZE_5001_10000 = 6;</code>
     */
    public static final int SIZE_5001_10000_VALUE = 6;
    /**
     *
     *
     * <pre>
     * 10,001 +
     * </pre>
     *
     * <code>SIZE_10001_OR_MORE = 7;</code>
     */
    public static final int SIZE_10001_OR_MORE_VALUE = 7;

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
    public static InstituteSize valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InstituteSize forNumber(int value) {
      switch (value) {
        case 0:
          return INSTITUTE_SIZE_UNSPECIFIED;
        case 1:
          return SIZE_1_100;
        case 2:
          return SIZE_101_500;
        case 3:
          return SIZE_501_1000;
        case 4:
          return SIZE_1001_2000;
        case 5:
          return SIZE_2001_5000;
        case 6:
          return SIZE_5001_10000;
        case 7:
          return SIZE_10001_OR_MORE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InstituteSize> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<InstituteSize> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InstituteSize>() {
          public InstituteSize findValueByNumber(int number) {
            return InstituteSize.forNumber(number);
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
      return com.google.cloud.channel.v1.EduData.getDescriptor().getEnumTypes().get(1);
    }

    private static final InstituteSize[] VALUES = values();

    public static InstituteSize valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private InstituteSize(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.EduData.InstituteSize)
  }

  public static final int INSTITUTE_TYPE_FIELD_NUMBER = 1;
  private int instituteType_ = 0;
  /**
   *
   *
   * <pre>
   * Designated institute type of customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
   *
   * @return The enum numeric value on the wire for instituteType.
   */
  @java.lang.Override
  public int getInstituteTypeValue() {
    return instituteType_;
  }
  /**
   *
   *
   * <pre>
   * Designated institute type of customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
   *
   * @return The instituteType.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.EduData.InstituteType getInstituteType() {
    com.google.cloud.channel.v1.EduData.InstituteType result =
        com.google.cloud.channel.v1.EduData.InstituteType.forNumber(instituteType_);
    return result == null ? com.google.cloud.channel.v1.EduData.InstituteType.UNRECOGNIZED : result;
  }

  public static final int INSTITUTE_SIZE_FIELD_NUMBER = 2;
  private int instituteSize_ = 0;
  /**
   *
   *
   * <pre>
   * Size of the institute.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
   *
   * @return The enum numeric value on the wire for instituteSize.
   */
  @java.lang.Override
  public int getInstituteSizeValue() {
    return instituteSize_;
  }
  /**
   *
   *
   * <pre>
   * Size of the institute.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
   *
   * @return The instituteSize.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.EduData.InstituteSize getInstituteSize() {
    com.google.cloud.channel.v1.EduData.InstituteSize result =
        com.google.cloud.channel.v1.EduData.InstituteSize.forNumber(instituteSize_);
    return result == null ? com.google.cloud.channel.v1.EduData.InstituteSize.UNRECOGNIZED : result;
  }

  public static final int WEBSITE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object website_ = "";
  /**
   *
   *
   * <pre>
   * Web address for the edu customer's institution.
   * </pre>
   *
   * <code>string website = 3;</code>
   *
   * @return The website.
   */
  @java.lang.Override
  public java.lang.String getWebsite() {
    java.lang.Object ref = website_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      website_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Web address for the edu customer's institution.
   * </pre>
   *
   * <code>string website = 3;</code>
   *
   * @return The bytes for website.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWebsiteBytes() {
    java.lang.Object ref = website_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      website_ = b;
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
    if (instituteType_
        != com.google.cloud.channel.v1.EduData.InstituteType.INSTITUTE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, instituteType_);
    }
    if (instituteSize_
        != com.google.cloud.channel.v1.EduData.InstituteSize.INSTITUTE_SIZE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, instituteSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(website_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, website_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (instituteType_
        != com.google.cloud.channel.v1.EduData.InstituteType.INSTITUTE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, instituteType_);
    }
    if (instituteSize_
        != com.google.cloud.channel.v1.EduData.InstituteSize.INSTITUTE_SIZE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, instituteSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(website_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, website_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.EduData)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.EduData other = (com.google.cloud.channel.v1.EduData) obj;

    if (instituteType_ != other.instituteType_) return false;
    if (instituteSize_ != other.instituteSize_) return false;
    if (!getWebsite().equals(other.getWebsite())) return false;
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
    hash = (37 * hash) + INSTITUTE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + instituteType_;
    hash = (37 * hash) + INSTITUTE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + instituteSize_;
    hash = (37 * hash) + WEBSITE_FIELD_NUMBER;
    hash = (53 * hash) + getWebsite().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.EduData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.EduData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.EduData parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.EduData prototype) {
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
   * Required Edu Attributes
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.EduData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.EduData)
      com.google.cloud.channel.v1.EduDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.CommonProto
          .internal_static_google_cloud_channel_v1_EduData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.CommonProto
          .internal_static_google_cloud_channel_v1_EduData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.EduData.class,
              com.google.cloud.channel.v1.EduData.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.EduData.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instituteType_ = 0;
      instituteSize_ = 0;
      website_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.CommonProto
          .internal_static_google_cloud_channel_v1_EduData_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.EduData getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.EduData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.EduData build() {
      com.google.cloud.channel.v1.EduData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.EduData buildPartial() {
      com.google.cloud.channel.v1.EduData result = new com.google.cloud.channel.v1.EduData(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.EduData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instituteType_ = instituteType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.instituteSize_ = instituteSize_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.website_ = website_;
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
      if (other instanceof com.google.cloud.channel.v1.EduData) {
        return mergeFrom((com.google.cloud.channel.v1.EduData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.EduData other) {
      if (other == com.google.cloud.channel.v1.EduData.getDefaultInstance()) return this;
      if (other.instituteType_ != 0) {
        setInstituteTypeValue(other.getInstituteTypeValue());
      }
      if (other.instituteSize_ != 0) {
        setInstituteSizeValue(other.getInstituteSizeValue());
      }
      if (!other.getWebsite().isEmpty()) {
        website_ = other.website_;
        bitField0_ |= 0x00000004;
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
                instituteType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                instituteSize_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                website_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private int instituteType_ = 0;
    /**
     *
     *
     * <pre>
     * Designated institute type of customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
     *
     * @return The enum numeric value on the wire for instituteType.
     */
    @java.lang.Override
    public int getInstituteTypeValue() {
      return instituteType_;
    }
    /**
     *
     *
     * <pre>
     * Designated institute type of customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for instituteType to set.
     * @return This builder for chaining.
     */
    public Builder setInstituteTypeValue(int value) {
      instituteType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Designated institute type of customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
     *
     * @return The instituteType.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.EduData.InstituteType getInstituteType() {
      com.google.cloud.channel.v1.EduData.InstituteType result =
          com.google.cloud.channel.v1.EduData.InstituteType.forNumber(instituteType_);
      return result == null
          ? com.google.cloud.channel.v1.EduData.InstituteType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Designated institute type of customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
     *
     * @param value The instituteType to set.
     * @return This builder for chaining.
     */
    public Builder setInstituteType(com.google.cloud.channel.v1.EduData.InstituteType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      instituteType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Designated institute type of customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteType institute_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstituteType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      instituteType_ = 0;
      onChanged();
      return this;
    }

    private int instituteSize_ = 0;
    /**
     *
     *
     * <pre>
     * Size of the institute.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
     *
     * @return The enum numeric value on the wire for instituteSize.
     */
    @java.lang.Override
    public int getInstituteSizeValue() {
      return instituteSize_;
    }
    /**
     *
     *
     * <pre>
     * Size of the institute.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
     *
     * @param value The enum numeric value on the wire for instituteSize to set.
     * @return This builder for chaining.
     */
    public Builder setInstituteSizeValue(int value) {
      instituteSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Size of the institute.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
     *
     * @return The instituteSize.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.EduData.InstituteSize getInstituteSize() {
      com.google.cloud.channel.v1.EduData.InstituteSize result =
          com.google.cloud.channel.v1.EduData.InstituteSize.forNumber(instituteSize_);
      return result == null
          ? com.google.cloud.channel.v1.EduData.InstituteSize.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Size of the institute.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
     *
     * @param value The instituteSize to set.
     * @return This builder for chaining.
     */
    public Builder setInstituteSize(com.google.cloud.channel.v1.EduData.InstituteSize value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      instituteSize_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Size of the institute.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EduData.InstituteSize institute_size = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstituteSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      instituteSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object website_ = "";
    /**
     *
     *
     * <pre>
     * Web address for the edu customer's institution.
     * </pre>
     *
     * <code>string website = 3;</code>
     *
     * @return The website.
     */
    public java.lang.String getWebsite() {
      java.lang.Object ref = website_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        website_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Web address for the edu customer's institution.
     * </pre>
     *
     * <code>string website = 3;</code>
     *
     * @return The bytes for website.
     */
    public com.google.protobuf.ByteString getWebsiteBytes() {
      java.lang.Object ref = website_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        website_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Web address for the edu customer's institution.
     * </pre>
     *
     * <code>string website = 3;</code>
     *
     * @param value The website to set.
     * @return This builder for chaining.
     */
    public Builder setWebsite(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      website_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Web address for the edu customer's institution.
     * </pre>
     *
     * <code>string website = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWebsite() {
      website_ = getDefaultInstance().getWebsite();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Web address for the edu customer's institution.
     * </pre>
     *
     * <code>string website = 3;</code>
     *
     * @param value The bytes for website to set.
     * @return This builder for chaining.
     */
    public Builder setWebsiteBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      website_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.EduData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.EduData)
  private static final com.google.cloud.channel.v1.EduData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.EduData();
  }

  public static com.google.cloud.channel.v1.EduData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EduData> PARSER =
      new com.google.protobuf.AbstractParser<EduData>() {
        @java.lang.Override
        public EduData parsePartialFrom(
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

  public static com.google.protobuf.Parser<EduData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EduData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.EduData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
