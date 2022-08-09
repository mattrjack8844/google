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
// source: google/cloud/securitycenter/v1/iam_binding.proto

package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Represents a particular IAM binding, which captures a member's role addition,
 * removal, or state.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.IamBinding}
 */
public final class IamBinding extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.IamBinding)
    IamBindingOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IamBinding.newBuilder() to construct.
  private IamBinding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IamBinding() {
    action_ = 0;
    role_ = "";
    member_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IamBinding();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private IamBinding(
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

              action_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              role_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              member_ = s;
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
    return com.google.cloud.securitycenter.v1.IamBindingProto
        .internal_static_google_cloud_securitycenter_v1_IamBinding_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.IamBindingProto
        .internal_static_google_cloud_securitycenter_v1_IamBinding_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.IamBinding.class,
            com.google.cloud.securitycenter.v1.IamBinding.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The type of action performed on a Binding in a policy.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.securitycenter.v1.IamBinding.Action}
   */
  public enum Action implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>ACTION_UNSPECIFIED = 0;</code>
     */
    ACTION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Addition of a Binding.
     * </pre>
     *
     * <code>ADD = 1;</code>
     */
    ADD(1),
    /**
     *
     *
     * <pre>
     * Removal of a Binding.
     * </pre>
     *
     * <code>REMOVE = 2;</code>
     */
    REMOVE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>ACTION_UNSPECIFIED = 0;</code>
     */
    public static final int ACTION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Addition of a Binding.
     * </pre>
     *
     * <code>ADD = 1;</code>
     */
    public static final int ADD_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Removal of a Binding.
     * </pre>
     *
     * <code>REMOVE = 2;</code>
     */
    public static final int REMOVE_VALUE = 2;

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
    public static Action valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Action forNumber(int value) {
      switch (value) {
        case 0:
          return ACTION_UNSPECIFIED;
        case 1:
          return ADD;
        case 2:
          return REMOVE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Action> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Action> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Action>() {
          public Action findValueByNumber(int number) {
            return Action.forNumber(number);
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
      return com.google.cloud.securitycenter.v1.IamBinding.getDescriptor().getEnumTypes().get(0);
    }

    private static final Action[] VALUES = values();

    public static Action valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Action(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.securitycenter.v1.IamBinding.Action)
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_;
  /**
   *
   *
   * <pre>
   * The action that was performed on a Binding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.IamBinding.Action action = 1;</code>
   *
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override
  public int getActionValue() {
    return action_;
  }
  /**
   *
   *
   * <pre>
   * The action that was performed on a Binding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.IamBinding.Action action = 1;</code>
   *
   * @return The action.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.IamBinding.Action getAction() {
    @SuppressWarnings("deprecation")
    com.google.cloud.securitycenter.v1.IamBinding.Action result =
        com.google.cloud.securitycenter.v1.IamBinding.Action.valueOf(action_);
    return result == null
        ? com.google.cloud.securitycenter.v1.IamBinding.Action.UNRECOGNIZED
        : result;
  }

  public static final int ROLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object role_;
  /**
   *
   *
   * <pre>
   * Role that is assigned to "members".
   * For example, "roles/viewer", "roles/editor", or "roles/owner".
   * </pre>
   *
   * <code>string role = 2;</code>
   *
   * @return The role.
   */
  @java.lang.Override
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      role_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Role that is assigned to "members".
   * For example, "roles/viewer", "roles/editor", or "roles/owner".
   * </pre>
   *
   * <code>string role = 2;</code>
   *
   * @return The bytes for role.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      role_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEMBER_FIELD_NUMBER = 3;
  private volatile java.lang.Object member_;
  /**
   *
   *
   * <pre>
   * A single identity requesting access for a Cloud Platform resource,
   * e.g. "foo&#64;google.com".
   * </pre>
   *
   * <code>string member = 3;</code>
   *
   * @return The member.
   */
  @java.lang.Override
  public java.lang.String getMember() {
    java.lang.Object ref = member_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      member_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A single identity requesting access for a Cloud Platform resource,
   * e.g. "foo&#64;google.com".
   * </pre>
   *
   * <code>string member = 3;</code>
   *
   * @return The bytes for member.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMemberBytes() {
    java.lang.Object ref = member_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      member_ = b;
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
    if (action_
        != com.google.cloud.securitycenter.v1.IamBinding.Action.ACTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, role_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(member_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, member_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_
        != com.google.cloud.securitycenter.v1.IamBinding.Action.ACTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, role_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(member_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, member_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.IamBinding)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.IamBinding other =
        (com.google.cloud.securitycenter.v1.IamBinding) obj;

    if (action_ != other.action_) return false;
    if (!getRole().equals(other.getRole())) return false;
    if (!getMember().equals(other.getMember())) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getRole().hashCode();
    hash = (37 * hash) + MEMBER_FIELD_NUMBER;
    hash = (53 * hash) + getMember().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.IamBinding parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v1.IamBinding prototype) {
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
   * Represents a particular IAM binding, which captures a member's role addition,
   * removal, or state.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.IamBinding}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.IamBinding)
      com.google.cloud.securitycenter.v1.IamBindingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.IamBindingProto
          .internal_static_google_cloud_securitycenter_v1_IamBinding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.IamBindingProto
          .internal_static_google_cloud_securitycenter_v1_IamBinding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.IamBinding.class,
              com.google.cloud.securitycenter.v1.IamBinding.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.IamBinding.newBuilder()
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
      action_ = 0;

      role_ = "";

      member_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.IamBindingProto
          .internal_static_google_cloud_securitycenter_v1_IamBinding_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.IamBinding getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.IamBinding.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.IamBinding build() {
      com.google.cloud.securitycenter.v1.IamBinding result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.IamBinding buildPartial() {
      com.google.cloud.securitycenter.v1.IamBinding result =
          new com.google.cloud.securitycenter.v1.IamBinding(this);
      result.action_ = action_;
      result.role_ = role_;
      result.member_ = member_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.IamBinding) {
        return mergeFrom((com.google.cloud.securitycenter.v1.IamBinding) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.IamBinding other) {
      if (other == com.google.cloud.securitycenter.v1.IamBinding.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (!other.getRole().isEmpty()) {
        role_ = other.role_;
        onChanged();
      }
      if (!other.getMember().isEmpty()) {
        member_ = other.member_;
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
      com.google.cloud.securitycenter.v1.IamBinding parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.securitycenter.v1.IamBinding) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int action_ = 0;
    /**
     *
     *
     * <pre>
     * The action that was performed on a Binding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.IamBinding.Action action = 1;</code>
     *
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override
    public int getActionValue() {
      return action_;
    }
    /**
     *
     *
     * <pre>
     * The action that was performed on a Binding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.IamBinding.Action action = 1;</code>
     *
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {

      action_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The action that was performed on a Binding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.IamBinding.Action action = 1;</code>
     *
     * @return The action.
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v1.IamBinding.Action getAction() {
      @SuppressWarnings("deprecation")
      com.google.cloud.securitycenter.v1.IamBinding.Action result =
          com.google.cloud.securitycenter.v1.IamBinding.Action.valueOf(action_);
      return result == null
          ? com.google.cloud.securitycenter.v1.IamBinding.Action.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The action that was performed on a Binding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.IamBinding.Action action = 1;</code>
     *
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.google.cloud.securitycenter.v1.IamBinding.Action value) {
      if (value == null) {
        throw new NullPointerException();
      }

      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The action that was performed on a Binding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.IamBinding.Action action = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAction() {

      action_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object role_ = "";
    /**
     *
     *
     * <pre>
     * Role that is assigned to "members".
     * For example, "roles/viewer", "roles/editor", or "roles/owner".
     * </pre>
     *
     * <code>string role = 2;</code>
     *
     * @return The role.
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Role that is assigned to "members".
     * For example, "roles/viewer", "roles/editor", or "roles/owner".
     * </pre>
     *
     * <code>string role = 2;</code>
     *
     * @return The bytes for role.
     */
    public com.google.protobuf.ByteString getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Role that is assigned to "members".
     * For example, "roles/viewer", "roles/editor", or "roles/owner".
     * </pre>
     *
     * <code>string role = 2;</code>
     *
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      role_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Role that is assigned to "members".
     * For example, "roles/viewer", "roles/editor", or "roles/owner".
     * </pre>
     *
     * <code>string role = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRole() {

      role_ = getDefaultInstance().getRole();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Role that is assigned to "members".
     * For example, "roles/viewer", "roles/editor", or "roles/owner".
     * </pre>
     *
     * <code>string role = 2;</code>
     *
     * @param value The bytes for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      role_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object member_ = "";
    /**
     *
     *
     * <pre>
     * A single identity requesting access for a Cloud Platform resource,
     * e.g. "foo&#64;google.com".
     * </pre>
     *
     * <code>string member = 3;</code>
     *
     * @return The member.
     */
    public java.lang.String getMember() {
      java.lang.Object ref = member_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        member_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A single identity requesting access for a Cloud Platform resource,
     * e.g. "foo&#64;google.com".
     * </pre>
     *
     * <code>string member = 3;</code>
     *
     * @return The bytes for member.
     */
    public com.google.protobuf.ByteString getMemberBytes() {
      java.lang.Object ref = member_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        member_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A single identity requesting access for a Cloud Platform resource,
     * e.g. "foo&#64;google.com".
     * </pre>
     *
     * <code>string member = 3;</code>
     *
     * @param value The member to set.
     * @return This builder for chaining.
     */
    public Builder setMember(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      member_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A single identity requesting access for a Cloud Platform resource,
     * e.g. "foo&#64;google.com".
     * </pre>
     *
     * <code>string member = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMember() {

      member_ = getDefaultInstance().getMember();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A single identity requesting access for a Cloud Platform resource,
     * e.g. "foo&#64;google.com".
     * </pre>
     *
     * <code>string member = 3;</code>
     *
     * @param value The bytes for member to set.
     * @return This builder for chaining.
     */
    public Builder setMemberBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      member_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.IamBinding)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.IamBinding)
  private static final com.google.cloud.securitycenter.v1.IamBinding DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.IamBinding();
  }

  public static com.google.cloud.securitycenter.v1.IamBinding getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IamBinding> PARSER =
      new com.google.protobuf.AbstractParser<IamBinding>() {
        @java.lang.Override
        public IamBinding parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new IamBinding(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<IamBinding> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IamBinding> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.IamBinding getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
