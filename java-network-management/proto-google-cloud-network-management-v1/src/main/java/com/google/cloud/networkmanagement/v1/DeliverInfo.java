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
// source: google/cloud/networkmanagement/v1/trace.proto

package com.google.cloud.networkmanagement.v1;

/**
 *
 *
 * <pre>
 * Details of the final state "deliver" and associated resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkmanagement.v1.DeliverInfo}
 */
public final class DeliverInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkmanagement.v1.DeliverInfo)
    DeliverInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeliverInfo.newBuilder() to construct.
  private DeliverInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeliverInfo() {
    target_ = 0;
    resourceUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeliverInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DeliverInfo(
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
          case 8:
            {
              int rawValue = input.readEnum();

              target_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              resourceUri_ = s;
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
    return com.google.cloud.networkmanagement.v1.TraceProto
        .internal_static_google_cloud_networkmanagement_v1_DeliverInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkmanagement.v1.TraceProto
        .internal_static_google_cloud_networkmanagement_v1_DeliverInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkmanagement.v1.DeliverInfo.class,
            com.google.cloud.networkmanagement.v1.DeliverInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Deliver target types:
   * </pre>
   *
   * Protobuf enum {@code google.cloud.networkmanagement.v1.DeliverInfo.Target}
   */
  public enum Target implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Target not specified.
     * </pre>
     *
     * <code>TARGET_UNSPECIFIED = 0;</code>
     */
    TARGET_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Target is a Compute Engine instance.
     * </pre>
     *
     * <code>INSTANCE = 1;</code>
     */
    INSTANCE(1),
    /**
     *
     *
     * <pre>
     * Target is the internet.
     * </pre>
     *
     * <code>INTERNET = 2;</code>
     */
    INTERNET(2),
    /**
     *
     *
     * <pre>
     * Target is a Google API.
     * </pre>
     *
     * <code>GOOGLE_API = 3;</code>
     */
    GOOGLE_API(3),
    /**
     *
     *
     * <pre>
     * Target is a Google Kubernetes Engine cluster master.
     * </pre>
     *
     * <code>GKE_MASTER = 4;</code>
     */
    GKE_MASTER(4),
    /**
     *
     *
     * <pre>
     * Target is a Cloud SQL instance.
     * </pre>
     *
     * <code>CLOUD_SQL_INSTANCE = 5;</code>
     */
    CLOUD_SQL_INSTANCE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Target not specified.
     * </pre>
     *
     * <code>TARGET_UNSPECIFIED = 0;</code>
     */
    public static final int TARGET_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Target is a Compute Engine instance.
     * </pre>
     *
     * <code>INSTANCE = 1;</code>
     */
    public static final int INSTANCE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Target is the internet.
     * </pre>
     *
     * <code>INTERNET = 2;</code>
     */
    public static final int INTERNET_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Target is a Google API.
     * </pre>
     *
     * <code>GOOGLE_API = 3;</code>
     */
    public static final int GOOGLE_API_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Target is a Google Kubernetes Engine cluster master.
     * </pre>
     *
     * <code>GKE_MASTER = 4;</code>
     */
    public static final int GKE_MASTER_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Target is a Cloud SQL instance.
     * </pre>
     *
     * <code>CLOUD_SQL_INSTANCE = 5;</code>
     */
    public static final int CLOUD_SQL_INSTANCE_VALUE = 5;

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
    public static Target valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Target forNumber(int value) {
      switch (value) {
        case 0:
          return TARGET_UNSPECIFIED;
        case 1:
          return INSTANCE;
        case 2:
          return INTERNET;
        case 3:
          return GOOGLE_API;
        case 4:
          return GKE_MASTER;
        case 5:
          return CLOUD_SQL_INSTANCE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Target> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Target> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Target>() {
          public Target findValueByNumber(int number) {
            return Target.forNumber(number);
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
      return com.google.cloud.networkmanagement.v1.DeliverInfo.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Target[] VALUES = values();

    public static Target valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Target(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.networkmanagement.v1.DeliverInfo.Target)
  }

  public static final int TARGET_FIELD_NUMBER = 1;
  private int target_;
  /**
   *
   *
   * <pre>
   * Target type where the packet is delivered to.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.DeliverInfo.Target target = 1;</code>
   *
   * @return The enum numeric value on the wire for target.
   */
  @java.lang.Override
  public int getTargetValue() {
    return target_;
  }
  /**
   *
   *
   * <pre>
   * Target type where the packet is delivered to.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.DeliverInfo.Target target = 1;</code>
   *
   * @return The target.
   */
  @java.lang.Override
  public com.google.cloud.networkmanagement.v1.DeliverInfo.Target getTarget() {
    @SuppressWarnings("deprecation")
    com.google.cloud.networkmanagement.v1.DeliverInfo.Target result =
        com.google.cloud.networkmanagement.v1.DeliverInfo.Target.valueOf(target_);
    return result == null
        ? com.google.cloud.networkmanagement.v1.DeliverInfo.Target.UNRECOGNIZED
        : result;
  }

  public static final int RESOURCE_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceUri_;
  /**
   *
   *
   * <pre>
   * URI of the resource that the packet is delivered to.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   *
   * @return The resourceUri.
   */
  @java.lang.Override
  public java.lang.String getResourceUri() {
    java.lang.Object ref = resourceUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URI of the resource that the packet is delivered to.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   *
   * @return The bytes for resourceUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceUriBytes() {
    java.lang.Object ref = resourceUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceUri_ = b;
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
    if (target_
        != com.google.cloud.networkmanagement.v1.DeliverInfo.Target.TARGET_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, target_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (target_
        != com.google.cloud.networkmanagement.v1.DeliverInfo.Target.TARGET_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, target_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceUri_);
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
    if (!(obj instanceof com.google.cloud.networkmanagement.v1.DeliverInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.networkmanagement.v1.DeliverInfo other =
        (com.google.cloud.networkmanagement.v1.DeliverInfo) obj;

    if (target_ != other.target_) return false;
    if (!getResourceUri().equals(other.getResourceUri())) return false;
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
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + target_;
    hash = (37 * hash) + RESOURCE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getResourceUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.networkmanagement.v1.DeliverInfo prototype) {
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
   * Details of the final state "deliver" and associated resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkmanagement.v1.DeliverInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkmanagement.v1.DeliverInfo)
      com.google.cloud.networkmanagement.v1.DeliverInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkmanagement.v1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1_DeliverInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkmanagement.v1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1_DeliverInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkmanagement.v1.DeliverInfo.class,
              com.google.cloud.networkmanagement.v1.DeliverInfo.Builder.class);
    }

    // Construct using com.google.cloud.networkmanagement.v1.DeliverInfo.newBuilder()
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
      target_ = 0;

      resourceUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkmanagement.v1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1_DeliverInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1.DeliverInfo getDefaultInstanceForType() {
      return com.google.cloud.networkmanagement.v1.DeliverInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1.DeliverInfo build() {
      com.google.cloud.networkmanagement.v1.DeliverInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1.DeliverInfo buildPartial() {
      com.google.cloud.networkmanagement.v1.DeliverInfo result =
          new com.google.cloud.networkmanagement.v1.DeliverInfo(this);
      result.target_ = target_;
      result.resourceUri_ = resourceUri_;
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
      if (other instanceof com.google.cloud.networkmanagement.v1.DeliverInfo) {
        return mergeFrom((com.google.cloud.networkmanagement.v1.DeliverInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkmanagement.v1.DeliverInfo other) {
      if (other == com.google.cloud.networkmanagement.v1.DeliverInfo.getDefaultInstance())
        return this;
      if (other.target_ != 0) {
        setTargetValue(other.getTargetValue());
      }
      if (!other.getResourceUri().isEmpty()) {
        resourceUri_ = other.resourceUri_;
        onChanged();
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
      com.google.cloud.networkmanagement.v1.DeliverInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.networkmanagement.v1.DeliverInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int target_ = 0;
    /**
     *
     *
     * <pre>
     * Target type where the packet is delivered to.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1.DeliverInfo.Target target = 1;</code>
     *
     * @return The enum numeric value on the wire for target.
     */
    @java.lang.Override
    public int getTargetValue() {
      return target_;
    }
    /**
     *
     *
     * <pre>
     * Target type where the packet is delivered to.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1.DeliverInfo.Target target = 1;</code>
     *
     * @param value The enum numeric value on the wire for target to set.
     * @return This builder for chaining.
     */
    public Builder setTargetValue(int value) {

      target_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target type where the packet is delivered to.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1.DeliverInfo.Target target = 1;</code>
     *
     * @return The target.
     */
    @java.lang.Override
    public com.google.cloud.networkmanagement.v1.DeliverInfo.Target getTarget() {
      @SuppressWarnings("deprecation")
      com.google.cloud.networkmanagement.v1.DeliverInfo.Target result =
          com.google.cloud.networkmanagement.v1.DeliverInfo.Target.valueOf(target_);
      return result == null
          ? com.google.cloud.networkmanagement.v1.DeliverInfo.Target.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Target type where the packet is delivered to.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1.DeliverInfo.Target target = 1;</code>
     *
     * @param value The target to set.
     * @return This builder for chaining.
     */
    public Builder setTarget(com.google.cloud.networkmanagement.v1.DeliverInfo.Target value) {
      if (value == null) {
        throw new NullPointerException();
      }

      target_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target type where the packet is delivered to.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1.DeliverInfo.Target target = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTarget() {

      target_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object resourceUri_ = "";
    /**
     *
     *
     * <pre>
     * URI of the resource that the packet is delivered to.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @return The resourceUri.
     */
    public java.lang.String getResourceUri() {
      java.lang.Object ref = resourceUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of the resource that the packet is delivered to.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @return The bytes for resourceUri.
     */
    public com.google.protobuf.ByteString getResourceUriBytes() {
      java.lang.Object ref = resourceUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of the resource that the packet is delivered to.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @param value The resourceUri to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resourceUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of the resource that the packet is delivered to.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceUri() {

      resourceUri_ = getDefaultInstance().getResourceUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of the resource that the packet is delivered to.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @param value The bytes for resourceUri to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resourceUri_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkmanagement.v1.DeliverInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkmanagement.v1.DeliverInfo)
  private static final com.google.cloud.networkmanagement.v1.DeliverInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkmanagement.v1.DeliverInfo();
  }

  public static com.google.cloud.networkmanagement.v1.DeliverInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeliverInfo> PARSER =
      new com.google.protobuf.AbstractParser<DeliverInfo>() {
        @java.lang.Override
        public DeliverInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DeliverInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DeliverInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeliverInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkmanagement.v1.DeliverInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
