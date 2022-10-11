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
// source: google/cloud/domains/v1/domains.proto

package com.google.cloud.domains.v1;

/**
 *
 *
 * <pre>
 * Request for the `UpdateRegistration` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.domains.v1.UpdateRegistrationRequest}
 */
public final class UpdateRegistrationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.domains.v1.UpdateRegistrationRequest)
    UpdateRegistrationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateRegistrationRequest.newBuilder() to construct.
  private UpdateRegistrationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateRegistrationRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateRegistrationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.domains.v1.DomainsProto
        .internal_static_google_cloud_domains_v1_UpdateRegistrationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.domains.v1.DomainsProto
        .internal_static_google_cloud_domains_v1_UpdateRegistrationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.domains.v1.UpdateRegistrationRequest.class,
            com.google.cloud.domains.v1.UpdateRegistrationRequest.Builder.class);
  }

  public static final int REGISTRATION_FIELD_NUMBER = 1;
  private com.google.cloud.domains.v1.Registration registration_;
  /**
   *
   *
   * <pre>
   * Fields of the `Registration` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
   *
   * @return Whether the registration field is set.
   */
  @java.lang.Override
  public boolean hasRegistration() {
    return registration_ != null;
  }
  /**
   *
   *
   * <pre>
   * Fields of the `Registration` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
   *
   * @return The registration.
   */
  @java.lang.Override
  public com.google.cloud.domains.v1.Registration getRegistration() {
    return registration_ == null
        ? com.google.cloud.domains.v1.Registration.getDefaultInstance()
        : registration_;
  }
  /**
   *
   *
   * <pre>
   * Fields of the `Registration` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.domains.v1.RegistrationOrBuilder getRegistrationOrBuilder() {
    return getRegistration();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the labels are being updated, the `update_mask` is
   * `"labels"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the labels are being updated, the `update_mask` is
   * `"labels"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the labels are being updated, the `update_mask` is
   * `"labels"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (registration_ != null) {
      output.writeMessage(1, getRegistration());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (registration_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRegistration());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.domains.v1.UpdateRegistrationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.domains.v1.UpdateRegistrationRequest other =
        (com.google.cloud.domains.v1.UpdateRegistrationRequest) obj;

    if (hasRegistration() != other.hasRegistration()) return false;
    if (hasRegistration()) {
      if (!getRegistration().equals(other.getRegistration())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasRegistration()) {
      hash = (37 * hash) + REGISTRATION_FIELD_NUMBER;
      hash = (53 * hash) + getRegistration().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest parseFrom(
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
      com.google.cloud.domains.v1.UpdateRegistrationRequest prototype) {
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
   * Request for the `UpdateRegistration` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.domains.v1.UpdateRegistrationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.domains.v1.UpdateRegistrationRequest)
      com.google.cloud.domains.v1.UpdateRegistrationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.domains.v1.DomainsProto
          .internal_static_google_cloud_domains_v1_UpdateRegistrationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.domains.v1.DomainsProto
          .internal_static_google_cloud_domains_v1_UpdateRegistrationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.domains.v1.UpdateRegistrationRequest.class,
              com.google.cloud.domains.v1.UpdateRegistrationRequest.Builder.class);
    }

    // Construct using com.google.cloud.domains.v1.UpdateRegistrationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (registrationBuilder_ == null) {
        registration_ = null;
      } else {
        registration_ = null;
        registrationBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.domains.v1.DomainsProto
          .internal_static_google_cloud_domains_v1_UpdateRegistrationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1.UpdateRegistrationRequest getDefaultInstanceForType() {
      return com.google.cloud.domains.v1.UpdateRegistrationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.domains.v1.UpdateRegistrationRequest build() {
      com.google.cloud.domains.v1.UpdateRegistrationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1.UpdateRegistrationRequest buildPartial() {
      com.google.cloud.domains.v1.UpdateRegistrationRequest result =
          new com.google.cloud.domains.v1.UpdateRegistrationRequest(this);
      if (registrationBuilder_ == null) {
        result.registration_ = registration_;
      } else {
        result.registration_ = registrationBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.domains.v1.UpdateRegistrationRequest) {
        return mergeFrom((com.google.cloud.domains.v1.UpdateRegistrationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.domains.v1.UpdateRegistrationRequest other) {
      if (other == com.google.cloud.domains.v1.UpdateRegistrationRequest.getDefaultInstance())
        return this;
      if (other.hasRegistration()) {
        mergeRegistration(other.getRegistration());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getRegistrationFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.domains.v1.Registration registration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.domains.v1.Registration,
            com.google.cloud.domains.v1.Registration.Builder,
            com.google.cloud.domains.v1.RegistrationOrBuilder>
        registrationBuilder_;
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     *
     * @return Whether the registration field is set.
     */
    public boolean hasRegistration() {
      return registrationBuilder_ != null || registration_ != null;
    }
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     *
     * @return The registration.
     */
    public com.google.cloud.domains.v1.Registration getRegistration() {
      if (registrationBuilder_ == null) {
        return registration_ == null
            ? com.google.cloud.domains.v1.Registration.getDefaultInstance()
            : registration_;
      } else {
        return registrationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     */
    public Builder setRegistration(com.google.cloud.domains.v1.Registration value) {
      if (registrationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        registration_ = value;
        onChanged();
      } else {
        registrationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     */
    public Builder setRegistration(
        com.google.cloud.domains.v1.Registration.Builder builderForValue) {
      if (registrationBuilder_ == null) {
        registration_ = builderForValue.build();
        onChanged();
      } else {
        registrationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     */
    public Builder mergeRegistration(com.google.cloud.domains.v1.Registration value) {
      if (registrationBuilder_ == null) {
        if (registration_ != null) {
          registration_ =
              com.google.cloud.domains.v1.Registration.newBuilder(registration_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          registration_ = value;
        }
        onChanged();
      } else {
        registrationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     */
    public Builder clearRegistration() {
      if (registrationBuilder_ == null) {
        registration_ = null;
        onChanged();
      } else {
        registration_ = null;
        registrationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     */
    public com.google.cloud.domains.v1.Registration.Builder getRegistrationBuilder() {

      onChanged();
      return getRegistrationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     */
    public com.google.cloud.domains.v1.RegistrationOrBuilder getRegistrationOrBuilder() {
      if (registrationBuilder_ != null) {
        return registrationBuilder_.getMessageOrBuilder();
      } else {
        return registration_ == null
            ? com.google.cloud.domains.v1.Registration.getDefaultInstance()
            : registration_;
      }
    }
    /**
     *
     *
     * <pre>
     * Fields of the `Registration` to update.
     * </pre>
     *
     * <code>.google.cloud.domains.v1.Registration registration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.domains.v1.Registration,
            com.google.cloud.domains.v1.Registration.Builder,
            com.google.cloud.domains.v1.RegistrationOrBuilder>
        getRegistrationFieldBuilder() {
      if (registrationBuilder_ == null) {
        registrationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.domains.v1.Registration,
                com.google.cloud.domains.v1.Registration.Builder,
                com.google.cloud.domains.v1.RegistrationOrBuilder>(
                getRegistration(), getParentForChildren(), isClean());
        registration_ = null;
      }
      return registrationBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The field mask describing which fields to update as a comma-separated list.
     * For example, if only the labels are being updated, the `update_mask` is
     * `"labels"`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.domains.v1.UpdateRegistrationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.domains.v1.UpdateRegistrationRequest)
  private static final com.google.cloud.domains.v1.UpdateRegistrationRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.domains.v1.UpdateRegistrationRequest();
  }

  public static com.google.cloud.domains.v1.UpdateRegistrationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRegistrationRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateRegistrationRequest>() {
        @java.lang.Override
        public UpdateRegistrationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateRegistrationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRegistrationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.domains.v1.UpdateRegistrationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
