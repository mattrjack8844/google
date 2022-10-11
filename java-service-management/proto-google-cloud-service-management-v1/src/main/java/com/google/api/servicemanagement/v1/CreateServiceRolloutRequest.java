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
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 *
 *
 * <pre>
 * Request message for 'CreateServiceRollout'
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceRolloutRequest}
 */
public final class CreateServiceRolloutRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
    CreateServiceRolloutRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateServiceRolloutRequest.newBuilder() to construct.
  private CreateServiceRolloutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateServiceRolloutRequest() {
    serviceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateServiceRolloutRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.class,
            com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   *
   *
   * <pre>
   * Required. The name of the service.  See the
   * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
   * example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the service.  See the
   * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
   * example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLLOUT_FIELD_NUMBER = 2;
  private com.google.api.servicemanagement.v1.Rollout rollout_;
  /**
   *
   *
   * <pre>
   * Required. The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rollout field is set.
   */
  @java.lang.Override
  public boolean hasRollout() {
    return rollout_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rollout.
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.Rollout getRollout() {
    return rollout_ == null
        ? com.google.api.servicemanagement.v1.Rollout.getDefaultInstance()
        : rollout_;
  }
  /**
   *
   *
   * <pre>
   * Required. The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.RolloutOrBuilder getRolloutOrBuilder() {
    return getRollout();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (rollout_ != null) {
      output.writeMessage(2, getRollout());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (rollout_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRollout());
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
    if (!(obj instanceof com.google.api.servicemanagement.v1.CreateServiceRolloutRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.CreateServiceRolloutRequest other =
        (com.google.api.servicemanagement.v1.CreateServiceRolloutRequest) obj;

    if (!getServiceName().equals(other.getServiceName())) return false;
    if (hasRollout() != other.hasRollout()) return false;
    if (hasRollout()) {
      if (!getRollout().equals(other.getRollout())) return false;
    }
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
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    if (hasRollout()) {
      hash = (37 * hash) + ROLLOUT_FIELD_NUMBER;
      hash = (53 * hash) + getRollout().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
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
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequest prototype) {
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
   * Request message for 'CreateServiceRollout'
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceRolloutRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.class,
              com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      serviceName_ = "";

      if (rolloutBuilder_ == null) {
        rollout_ = null;
      } else {
        rollout_ = null;
        rolloutBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.CreateServiceRolloutRequest
        getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.CreateServiceRolloutRequest build() {
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.CreateServiceRolloutRequest buildPartial() {
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequest result =
          new com.google.api.servicemanagement.v1.CreateServiceRolloutRequest(this);
      result.serviceName_ = serviceName_;
      if (rolloutBuilder_ == null) {
        result.rollout_ = rollout_;
      } else {
        result.rollout_ = rolloutBuilder_.build();
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
      if (other instanceof com.google.api.servicemanagement.v1.CreateServiceRolloutRequest) {
        return mergeFrom((com.google.api.servicemanagement.v1.CreateServiceRolloutRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.api.servicemanagement.v1.CreateServiceRolloutRequest other) {
      if (other
          == com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.getDefaultInstance())
        return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (other.hasRollout()) {
        mergeRollout(other.getRollout());
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
                serviceName_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getRolloutFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object serviceName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for serviceName.
     */
    public com.google.protobuf.ByteString getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {

      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceName_ = value;
      onChanged();
      return this;
    }

    private com.google.api.servicemanagement.v1.Rollout rollout_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.servicemanagement.v1.Rollout,
            com.google.api.servicemanagement.v1.Rollout.Builder,
            com.google.api.servicemanagement.v1.RolloutOrBuilder>
        rolloutBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the rollout field is set.
     */
    public boolean hasRollout() {
      return rolloutBuilder_ != null || rollout_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The rollout.
     */
    public com.google.api.servicemanagement.v1.Rollout getRollout() {
      if (rolloutBuilder_ == null) {
        return rollout_ == null
            ? com.google.api.servicemanagement.v1.Rollout.getDefaultInstance()
            : rollout_;
      } else {
        return rolloutBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRollout(com.google.api.servicemanagement.v1.Rollout value) {
      if (rolloutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rollout_ = value;
        onChanged();
      } else {
        rolloutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRollout(com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      if (rolloutBuilder_ == null) {
        rollout_ = builderForValue.build();
        onChanged();
      } else {
        rolloutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRollout(com.google.api.servicemanagement.v1.Rollout value) {
      if (rolloutBuilder_ == null) {
        if (rollout_ != null) {
          rollout_ =
              com.google.api.servicemanagement.v1.Rollout.newBuilder(rollout_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          rollout_ = value;
        }
        onChanged();
      } else {
        rolloutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRollout() {
      if (rolloutBuilder_ == null) {
        rollout_ = null;
        onChanged();
      } else {
        rollout_ = null;
        rolloutBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.api.servicemanagement.v1.Rollout.Builder getRolloutBuilder() {

      onChanged();
      return getRolloutFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.api.servicemanagement.v1.RolloutOrBuilder getRolloutOrBuilder() {
      if (rolloutBuilder_ != null) {
        return rolloutBuilder_.getMessageOrBuilder();
      } else {
        return rollout_ == null
            ? com.google.api.servicemanagement.v1.Rollout.getDefaultInstance()
            : rollout_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.Rollout rollout = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.servicemanagement.v1.Rollout,
            com.google.api.servicemanagement.v1.Rollout.Builder,
            com.google.api.servicemanagement.v1.RolloutOrBuilder>
        getRolloutFieldBuilder() {
      if (rolloutBuilder_ == null) {
        rolloutBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.servicemanagement.v1.Rollout,
                com.google.api.servicemanagement.v1.Rollout.Builder,
                com.google.api.servicemanagement.v1.RolloutOrBuilder>(
                getRollout(), getParentForChildren(), isClean());
        rollout_ = null;
      }
      return rolloutBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
  private static final com.google.api.servicemanagement.v1.CreateServiceRolloutRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.CreateServiceRolloutRequest();
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceRolloutRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateServiceRolloutRequest>() {
        @java.lang.Override
        public CreateServiceRolloutRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateServiceRolloutRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceRolloutRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.CreateServiceRolloutRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
