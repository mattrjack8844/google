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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycentermanagement.v1;

/**
 *
 *
 * <pre>
 * Message for deleting a EventThreatDetectionCustomModule
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest}
 */
public final class DeleteEventThreatDetectionCustomModuleRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest)
    DeleteEventThreatDetectionCustomModuleRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeleteEventThreatDetectionCustomModuleRequest.newBuilder() to construct.
  private DeleteEventThreatDetectionCustomModuleRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteEventThreatDetectionCustomModuleRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteEventThreatDetectionCustomModuleRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementProto
        .internal_static_google_cloud_securitycentermanagement_v1_DeleteEventThreatDetectionCustomModuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementProto
        .internal_static_google_cloud_securitycentermanagement_v1_DeleteEventThreatDetectionCustomModuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycentermanagement.v1
                .DeleteEventThreatDetectionCustomModuleRequest.class,
            com.google.cloud.securitycentermanagement.v1
                .DeleteEventThreatDetectionCustomModuleRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the ETD custom module.
   *
   * Its format is:
   *
   *   * "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
   *   * "folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
   *   * "projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. The resource name of the ETD custom module.
   *
   * Its format is:
   *
   *   * "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
   *   * "folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
   *   * "projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 2;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * Optional. When set to true, only validations (including IAM checks) will
   * done for the request (module will not be deleted). An OK response indicates
   * the request is valid while an error response indicates the request is
   * invalid. Note that a subsequent request to actually delete the module could
   * still fail because 1. the state could have changed (e.g. IAM permission
   * lost) or
   * 2. A failure occurred while trying to delete the module.
   * </pre>
   *
   * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (validateOnly_ != false) {
      output.writeBool(2, validateOnly_);
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
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, validateOnly_);
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
    if (!(obj
        instanceof
        com.google.cloud.securitycentermanagement.v1
            .DeleteEventThreatDetectionCustomModuleRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest
        other =
            (com.google.cloud.securitycentermanagement.v1
                    .DeleteEventThreatDetectionCustomModuleRequest)
                obj;

    if (!getName().equals(other.getName())) return false;
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      parseFrom(
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
      com.google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest
          prototype) {
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
   * Message for deleting a EventThreatDetectionCustomModule
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest)
      com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementProto
          .internal_static_google_cloud_securitycentermanagement_v1_DeleteEventThreatDetectionCustomModuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementProto
          .internal_static_google_cloud_securitycentermanagement_v1_DeleteEventThreatDetectionCustomModuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycentermanagement.v1
                  .DeleteEventThreatDetectionCustomModuleRequest.class,
              com.google.cloud.securitycentermanagement.v1
                  .DeleteEventThreatDetectionCustomModuleRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementProto
          .internal_static_google_cloud_securitycentermanagement_v1_DeleteEventThreatDetectionCustomModuleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycentermanagement.v1
            .DeleteEventThreatDetectionCustomModuleRequest
        getDefaultInstanceForType() {
      return com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycentermanagement.v1
            .DeleteEventThreatDetectionCustomModuleRequest
        build() {
      com.google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycentermanagement.v1
            .DeleteEventThreatDetectionCustomModuleRequest
        buildPartial() {
      com.google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest
          result =
              new com.google.cloud.securitycentermanagement.v1
                  .DeleteEventThreatDetectionCustomModuleRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest
            result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other
          instanceof
          com.google.cloud.securitycentermanagement.v1
              .DeleteEventThreatDetectionCustomModuleRequest) {
        return mergeFrom(
            (com.google.cloud.securitycentermanagement.v1
                    .DeleteEventThreatDetectionCustomModuleRequest)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest
            other) {
      if (other
          == com.google.cloud.securitycentermanagement.v1
              .DeleteEventThreatDetectionCustomModuleRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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
     * Required. The resource name of the ETD custom module.
     *
     * Its format is:
     *
     *   * "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The resource name of the ETD custom module.
     *
     * Its format is:
     *
     *   * "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The resource name of the ETD custom module.
     *
     * Its format is:
     *
     *   * "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The resource name of the ETD custom module.
     *
     * Its format is:
     *
     *   * "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The resource name of the ETD custom module.
     *
     * Its format is:
     *
     *   * "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     *   * "projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}".
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. When set to true, only validations (including IAM checks) will
     * done for the request (module will not be deleted). An OK response indicates
     * the request is valid while an error response indicates the request is
     * invalid. Note that a subsequent request to actually delete the module could
     * still fail because 1. the state could have changed (e.g. IAM permission
     * lost) or
     * 2. A failure occurred while trying to delete the module.
     * </pre>
     *
     * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * Optional. When set to true, only validations (including IAM checks) will
     * done for the request (module will not be deleted). An OK response indicates
     * the request is valid while an error response indicates the request is
     * invalid. Note that a subsequent request to actually delete the module could
     * still fail because 1. the state could have changed (e.g. IAM permission
     * lost) or
     * 2. A failure occurred while trying to delete the module.
     * </pre>
     *
     * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. When set to true, only validations (including IAM checks) will
     * done for the request (module will not be deleted). An OK response indicates
     * the request is valid while an error response indicates the request is
     * invalid. Note that a subsequent request to actually delete the module could
     * still fail because 1. the state could have changed (e.g. IAM permission
     * lost) or
     * 2. A failure occurred while trying to delete the module.
     * </pre>
     *
     * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest)
  private static final com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.securitycentermanagement.v1
            .DeleteEventThreatDetectionCustomModuleRequest();
  }

  public static com.google.cloud.securitycentermanagement.v1
          .DeleteEventThreatDetectionCustomModuleRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteEventThreatDetectionCustomModuleRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<DeleteEventThreatDetectionCustomModuleRequest>() {
            @java.lang.Override
            public DeleteEventThreatDetectionCustomModuleRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<DeleteEventThreatDetectionCustomModuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteEventThreatDetectionCustomModuleRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
