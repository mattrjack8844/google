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
// source: google/api/serviceusage/v1/serviceusage.proto

// Protobuf Java Version: 3.25.2
package com.google.api.serviceusage.v1;

/**
 *
 *
 * <pre>
 * Request message for the `DisableService` method.
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1.DisableServiceRequest}
 */
public final class DisableServiceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1.DisableServiceRequest)
    DisableServiceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DisableServiceRequest.newBuilder() to construct.
  private DisableServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DisableServiceRequest() {
    name_ = "";
    checkIfServiceHasUsage_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DisableServiceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.serviceusage.v1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1_DisableServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1_DisableServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1.DisableServiceRequest.class,
            com.google.api.serviceusage.v1.DisableServiceRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enum to determine if service usage should be checked when disabling a
   * service.
   * </pre>
   *
   * Protobuf enum {@code google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage}
   */
  public enum CheckIfServiceHasUsage implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * When unset, the default behavior is used, which is SKIP.
     * </pre>
     *
     * <code>CHECK_IF_SERVICE_HAS_USAGE_UNSPECIFIED = 0;</code>
     */
    CHECK_IF_SERVICE_HAS_USAGE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * If set, skip checking service usage when disabling a service.
     * </pre>
     *
     * <code>SKIP = 1;</code>
     */
    SKIP(1),
    /**
     *
     *
     * <pre>
     * If set, service usage is checked when disabling the service. If a
     * service, or its dependents, has usage in the last 30 days, the request
     * returns a FAILED_PRECONDITION error.
     * </pre>
     *
     * <code>CHECK = 2;</code>
     */
    CHECK(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * When unset, the default behavior is used, which is SKIP.
     * </pre>
     *
     * <code>CHECK_IF_SERVICE_HAS_USAGE_UNSPECIFIED = 0;</code>
     */
    public static final int CHECK_IF_SERVICE_HAS_USAGE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * If set, skip checking service usage when disabling a service.
     * </pre>
     *
     * <code>SKIP = 1;</code>
     */
    public static final int SKIP_VALUE = 1;
    /**
     *
     *
     * <pre>
     * If set, service usage is checked when disabling the service. If a
     * service, or its dependents, has usage in the last 30 days, the request
     * returns a FAILED_PRECONDITION error.
     * </pre>
     *
     * <code>CHECK = 2;</code>
     */
    public static final int CHECK_VALUE = 2;

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
    public static CheckIfServiceHasUsage valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CheckIfServiceHasUsage forNumber(int value) {
      switch (value) {
        case 0:
          return CHECK_IF_SERVICE_HAS_USAGE_UNSPECIFIED;
        case 1:
          return SKIP;
        case 2:
          return CHECK;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CheckIfServiceHasUsage>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<CheckIfServiceHasUsage>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CheckIfServiceHasUsage>() {
              public CheckIfServiceHasUsage findValueByNumber(int number) {
                return CheckIfServiceHasUsage.forNumber(number);
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
      return com.google.api.serviceusage.v1.DisableServiceRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final CheckIfServiceHasUsage[] VALUES = values();

    public static CheckIfServiceHasUsage valueOf(
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

    private CheckIfServiceHasUsage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name of the consumer and service to disable the service on.
   *
   * The enable and disable methods currently only support projects.
   *
   * An example name would be:
   * `projects/123/services/serviceusage.googleapis.com` where `123` is the
   * project number.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the consumer and service to disable the service on.
   *
   * The enable and disable methods currently only support projects.
   *
   * An example name would be:
   * `projects/123/services/serviceusage.googleapis.com` where `123` is the
   * project number.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISABLE_DEPENDENT_SERVICES_FIELD_NUMBER = 2;
  private boolean disableDependentServices_ = false;
  /**
   *
   *
   * <pre>
   * Indicates if services that are enabled and which depend on this service
   * should also be disabled. If not set, an error will be generated if any
   * enabled services depend on the service to be disabled. When set, the
   * service, and any enabled services that depend on it, will be disabled
   * together.
   * </pre>
   *
   * <code>bool disable_dependent_services = 2;</code>
   *
   * @return The disableDependentServices.
   */
  @java.lang.Override
  public boolean getDisableDependentServices() {
    return disableDependentServices_;
  }

  public static final int CHECK_IF_SERVICE_HAS_USAGE_FIELD_NUMBER = 3;
  private int checkIfServiceHasUsage_ = 0;
  /**
   *
   *
   * <pre>
   * Defines the behavior for checking service usage when disabling a service.
   * </pre>
   *
   * <code>
   * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for checkIfServiceHasUsage.
   */
  @java.lang.Override
  public int getCheckIfServiceHasUsageValue() {
    return checkIfServiceHasUsage_;
  }
  /**
   *
   *
   * <pre>
   * Defines the behavior for checking service usage when disabling a service.
   * </pre>
   *
   * <code>
   * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
   * </code>
   *
   * @return The checkIfServiceHasUsage.
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage
      getCheckIfServiceHasUsage() {
    com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage result =
        com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage.forNumber(
            checkIfServiceHasUsage_);
    return result == null
        ? com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage.UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (disableDependentServices_ != false) {
      output.writeBool(2, disableDependentServices_);
    }
    if (checkIfServiceHasUsage_
        != com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage
            .CHECK_IF_SERVICE_HAS_USAGE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, checkIfServiceHasUsage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (disableDependentServices_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, disableDependentServices_);
    }
    if (checkIfServiceHasUsage_
        != com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage
            .CHECK_IF_SERVICE_HAS_USAGE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, checkIfServiceHasUsage_);
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
    if (!(obj instanceof com.google.api.serviceusage.v1.DisableServiceRequest)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1.DisableServiceRequest other =
        (com.google.api.serviceusage.v1.DisableServiceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (getDisableDependentServices() != other.getDisableDependentServices()) return false;
    if (checkIfServiceHasUsage_ != other.checkIfServiceHasUsage_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DISABLE_DEPENDENT_SERVICES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDisableDependentServices());
    hash = (37 * hash) + CHECK_IF_SERVICE_HAS_USAGE_FIELD_NUMBER;
    hash = (53 * hash) + checkIfServiceHasUsage_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest parseFrom(
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

  public static Builder newBuilder(com.google.api.serviceusage.v1.DisableServiceRequest prototype) {
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
   * Request message for the `DisableService` method.
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1.DisableServiceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1.DisableServiceRequest)
      com.google.api.serviceusage.v1.DisableServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.serviceusage.v1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1_DisableServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1_DisableServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1.DisableServiceRequest.class,
              com.google.api.serviceusage.v1.DisableServiceRequest.Builder.class);
    }

    // Construct using com.google.api.serviceusage.v1.DisableServiceRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      disableDependentServices_ = false;
      checkIfServiceHasUsage_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.serviceusage.v1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1_DisableServiceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.DisableServiceRequest getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1.DisableServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.DisableServiceRequest build() {
      com.google.api.serviceusage.v1.DisableServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.DisableServiceRequest buildPartial() {
      com.google.api.serviceusage.v1.DisableServiceRequest result =
          new com.google.api.serviceusage.v1.DisableServiceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.serviceusage.v1.DisableServiceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.disableDependentServices_ = disableDependentServices_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.checkIfServiceHasUsage_ = checkIfServiceHasUsage_;
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
      if (other instanceof com.google.api.serviceusage.v1.DisableServiceRequest) {
        return mergeFrom((com.google.api.serviceusage.v1.DisableServiceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.serviceusage.v1.DisableServiceRequest other) {
      if (other == com.google.api.serviceusage.v1.DisableServiceRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getDisableDependentServices() != false) {
        setDisableDependentServices(other.getDisableDependentServices());
      }
      if (other.checkIfServiceHasUsage_ != 0) {
        setCheckIfServiceHasUsageValue(other.getCheckIfServiceHasUsageValue());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                disableDependentServices_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                checkIfServiceHasUsage_ = input.readEnum();
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of the consumer and service to disable the service on.
     *
     * The enable and disable methods currently only support projects.
     *
     * An example name would be:
     * `projects/123/services/serviceusage.googleapis.com` where `123` is the
     * project number.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the consumer and service to disable the service on.
     *
     * The enable and disable methods currently only support projects.
     *
     * An example name would be:
     * `projects/123/services/serviceusage.googleapis.com` where `123` is the
     * project number.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the consumer and service to disable the service on.
     *
     * The enable and disable methods currently only support projects.
     *
     * An example name would be:
     * `projects/123/services/serviceusage.googleapis.com` where `123` is the
     * project number.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the consumer and service to disable the service on.
     *
     * The enable and disable methods currently only support projects.
     *
     * An example name would be:
     * `projects/123/services/serviceusage.googleapis.com` where `123` is the
     * project number.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the consumer and service to disable the service on.
     *
     * The enable and disable methods currently only support projects.
     *
     * An example name would be:
     * `projects/123/services/serviceusage.googleapis.com` where `123` is the
     * project number.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean disableDependentServices_;
    /**
     *
     *
     * <pre>
     * Indicates if services that are enabled and which depend on this service
     * should also be disabled. If not set, an error will be generated if any
     * enabled services depend on the service to be disabled. When set, the
     * service, and any enabled services that depend on it, will be disabled
     * together.
     * </pre>
     *
     * <code>bool disable_dependent_services = 2;</code>
     *
     * @return The disableDependentServices.
     */
    @java.lang.Override
    public boolean getDisableDependentServices() {
      return disableDependentServices_;
    }
    /**
     *
     *
     * <pre>
     * Indicates if services that are enabled and which depend on this service
     * should also be disabled. If not set, an error will be generated if any
     * enabled services depend on the service to be disabled. When set, the
     * service, and any enabled services that depend on it, will be disabled
     * together.
     * </pre>
     *
     * <code>bool disable_dependent_services = 2;</code>
     *
     * @param value The disableDependentServices to set.
     * @return This builder for chaining.
     */
    public Builder setDisableDependentServices(boolean value) {

      disableDependentServices_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates if services that are enabled and which depend on this service
     * should also be disabled. If not set, an error will be generated if any
     * enabled services depend on the service to be disabled. When set, the
     * service, and any enabled services that depend on it, will be disabled
     * together.
     * </pre>
     *
     * <code>bool disable_dependent_services = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisableDependentServices() {
      bitField0_ = (bitField0_ & ~0x00000002);
      disableDependentServices_ = false;
      onChanged();
      return this;
    }

    private int checkIfServiceHasUsage_ = 0;
    /**
     *
     *
     * <pre>
     * Defines the behavior for checking service usage when disabling a service.
     * </pre>
     *
     * <code>
     * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
     * </code>
     *
     * @return The enum numeric value on the wire for checkIfServiceHasUsage.
     */
    @java.lang.Override
    public int getCheckIfServiceHasUsageValue() {
      return checkIfServiceHasUsage_;
    }
    /**
     *
     *
     * <pre>
     * Defines the behavior for checking service usage when disabling a service.
     * </pre>
     *
     * <code>
     * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
     * </code>
     *
     * @param value The enum numeric value on the wire for checkIfServiceHasUsage to set.
     * @return This builder for chaining.
     */
    public Builder setCheckIfServiceHasUsageValue(int value) {
      checkIfServiceHasUsage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the behavior for checking service usage when disabling a service.
     * </pre>
     *
     * <code>
     * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
     * </code>
     *
     * @return The checkIfServiceHasUsage.
     */
    @java.lang.Override
    public com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage
        getCheckIfServiceHasUsage() {
      com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage result =
          com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage.forNumber(
              checkIfServiceHasUsage_);
      return result == null
          ? com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Defines the behavior for checking service usage when disabling a service.
     * </pre>
     *
     * <code>
     * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
     * </code>
     *
     * @param value The checkIfServiceHasUsage to set.
     * @return This builder for chaining.
     */
    public Builder setCheckIfServiceHasUsage(
        com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      checkIfServiceHasUsage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the behavior for checking service usage when disabling a service.
     * </pre>
     *
     * <code>
     * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCheckIfServiceHasUsage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      checkIfServiceHasUsage_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1.DisableServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1.DisableServiceRequest)
  private static final com.google.api.serviceusage.v1.DisableServiceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1.DisableServiceRequest();
  }

  public static com.google.api.serviceusage.v1.DisableServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisableServiceRequest> PARSER =
      new com.google.protobuf.AbstractParser<DisableServiceRequest>() {
        @java.lang.Override
        public DisableServiceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DisableServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisableServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1.DisableServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
