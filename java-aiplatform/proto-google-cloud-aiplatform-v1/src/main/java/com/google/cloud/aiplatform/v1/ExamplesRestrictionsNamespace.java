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
// source: google/cloud/aiplatform/v1/explanation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Restrictions namespace for example-based explanations overrides.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace}
 */
public final class ExamplesRestrictionsNamespace extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace)
    ExamplesRestrictionsNamespaceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExamplesRestrictionsNamespace.newBuilder() to construct.
  private ExamplesRestrictionsNamespace(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExamplesRestrictionsNamespace() {
    namespaceName_ = "";
    allow_ = com.google.protobuf.LazyStringArrayList.emptyList();
    deny_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExamplesRestrictionsNamespace();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1_ExamplesRestrictionsNamespace_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1_ExamplesRestrictionsNamespace_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace.class,
            com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace.Builder.class);
  }

  public static final int NAMESPACE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object namespaceName_ = "";
  /**
   *
   *
   * <pre>
   * The namespace name.
   * </pre>
   *
   * <code>string namespace_name = 1;</code>
   *
   * @return The namespaceName.
   */
  @java.lang.Override
  public java.lang.String getNamespaceName() {
    java.lang.Object ref = namespaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespaceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The namespace name.
   * </pre>
   *
   * <code>string namespace_name = 1;</code>
   *
   * @return The bytes for namespaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNamespaceNameBytes() {
    java.lang.Object ref = namespaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      namespaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALLOW_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList allow_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The list of allowed tags.
   * </pre>
   *
   * <code>repeated string allow = 2;</code>
   *
   * @return A list containing the allow.
   */
  public com.google.protobuf.ProtocolStringList getAllowList() {
    return allow_;
  }
  /**
   *
   *
   * <pre>
   * The list of allowed tags.
   * </pre>
   *
   * <code>repeated string allow = 2;</code>
   *
   * @return The count of allow.
   */
  public int getAllowCount() {
    return allow_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of allowed tags.
   * </pre>
   *
   * <code>repeated string allow = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The allow at the given index.
   */
  public java.lang.String getAllow(int index) {
    return allow_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of allowed tags.
   * </pre>
   *
   * <code>repeated string allow = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allow at the given index.
   */
  public com.google.protobuf.ByteString getAllowBytes(int index) {
    return allow_.getByteString(index);
  }

  public static final int DENY_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList deny_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The list of deny tags.
   * </pre>
   *
   * <code>repeated string deny = 3;</code>
   *
   * @return A list containing the deny.
   */
  public com.google.protobuf.ProtocolStringList getDenyList() {
    return deny_;
  }
  /**
   *
   *
   * <pre>
   * The list of deny tags.
   * </pre>
   *
   * <code>repeated string deny = 3;</code>
   *
   * @return The count of deny.
   */
  public int getDenyCount() {
    return deny_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of deny tags.
   * </pre>
   *
   * <code>repeated string deny = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The deny at the given index.
   */
  public java.lang.String getDeny(int index) {
    return deny_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of deny tags.
   * </pre>
   *
   * <code>repeated string deny = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the deny at the given index.
   */
  public com.google.protobuf.ByteString getDenyBytes(int index) {
    return deny_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespaceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespaceName_);
    }
    for (int i = 0; i < allow_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, allow_.getRaw(i));
    }
    for (int i = 0; i < deny_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deny_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespaceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespaceName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < allow_.size(); i++) {
        dataSize += computeStringSizeNoTag(allow_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < deny_.size(); i++) {
        dataSize += computeStringSizeNoTag(deny_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDenyList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace other =
        (com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace) obj;

    if (!getNamespaceName().equals(other.getNamespaceName())) return false;
    if (!getAllowList().equals(other.getAllowList())) return false;
    if (!getDenyList().equals(other.getDenyList())) return false;
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
    hash = (37 * hash) + NAMESPACE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getNamespaceName().hashCode();
    if (getAllowCount() > 0) {
      hash = (37 * hash) + ALLOW_FIELD_NUMBER;
      hash = (53 * hash) + getAllowList().hashCode();
    }
    if (getDenyCount() > 0) {
      hash = (37 * hash) + DENY_FIELD_NUMBER;
      hash = (53 * hash) + getDenyList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace parseFrom(
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
      com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace prototype) {
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
   * Restrictions namespace for example-based explanations overrides.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace)
      com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespaceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_ExamplesRestrictionsNamespace_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_ExamplesRestrictionsNamespace_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace.class,
              com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      namespaceName_ = "";
      allow_ = com.google.protobuf.LazyStringArrayList.emptyList();
      deny_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_ExamplesRestrictionsNamespace_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace build() {
      com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace buildPartial() {
      com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace result =
          new com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.namespaceName_ = namespaceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        allow_.makeImmutable();
        result.allow_ = allow_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        deny_.makeImmutable();
        result.deny_ = deny_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace other) {
      if (other
          == com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace.getDefaultInstance())
        return this;
      if (!other.getNamespaceName().isEmpty()) {
        namespaceName_ = other.namespaceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.allow_.isEmpty()) {
        if (allow_.isEmpty()) {
          allow_ = other.allow_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAllowIsMutable();
          allow_.addAll(other.allow_);
        }
        onChanged();
      }
      if (!other.deny_.isEmpty()) {
        if (deny_.isEmpty()) {
          deny_ = other.deny_;
          bitField0_ |= 0x00000004;
        } else {
          ensureDenyIsMutable();
          deny_.addAll(other.deny_);
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
            case 10:
              {
                namespaceName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureAllowIsMutable();
                allow_.add(s);
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureDenyIsMutable();
                deny_.add(s);
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

    private java.lang.Object namespaceName_ = "";
    /**
     *
     *
     * <pre>
     * The namespace name.
     * </pre>
     *
     * <code>string namespace_name = 1;</code>
     *
     * @return The namespaceName.
     */
    public java.lang.String getNamespaceName() {
      java.lang.Object ref = namespaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The namespace name.
     * </pre>
     *
     * <code>string namespace_name = 1;</code>
     *
     * @return The bytes for namespaceName.
     */
    public com.google.protobuf.ByteString getNamespaceNameBytes() {
      java.lang.Object ref = namespaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The namespace name.
     * </pre>
     *
     * <code>string namespace_name = 1;</code>
     *
     * @param value The namespaceName to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      namespaceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The namespace name.
     * </pre>
     *
     * <code>string namespace_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNamespaceName() {
      namespaceName_ = getDefaultInstance().getNamespaceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The namespace name.
     * </pre>
     *
     * <code>string namespace_name = 1;</code>
     *
     * @param value The bytes for namespaceName to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      namespaceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList allow_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureAllowIsMutable() {
      if (!allow_.isModifiable()) {
        allow_ = new com.google.protobuf.LazyStringArrayList(allow_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @return A list containing the allow.
     */
    public com.google.protobuf.ProtocolStringList getAllowList() {
      allow_.makeImmutable();
      return allow_;
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @return The count of allow.
     */
    public int getAllowCount() {
      return allow_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The allow at the given index.
     */
    public java.lang.String getAllow(int index) {
      return allow_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the allow at the given index.
     */
    public com.google.protobuf.ByteString getAllowBytes(int index) {
      return allow_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The allow to set.
     * @return This builder for chaining.
     */
    public Builder setAllow(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowIsMutable();
      allow_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @param value The allow to add.
     * @return This builder for chaining.
     */
    public Builder addAllow(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowIsMutable();
      allow_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @param values The allow to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllow(java.lang.Iterable<java.lang.String> values) {
      ensureAllowIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allow_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllow() {
      allow_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of allowed tags.
     * </pre>
     *
     * <code>repeated string allow = 2;</code>
     *
     * @param value The bytes of the allow to add.
     * @return This builder for chaining.
     */
    public Builder addAllowBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAllowIsMutable();
      allow_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList deny_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureDenyIsMutable() {
      if (!deny_.isModifiable()) {
        deny_ = new com.google.protobuf.LazyStringArrayList(deny_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @return A list containing the deny.
     */
    public com.google.protobuf.ProtocolStringList getDenyList() {
      deny_.makeImmutable();
      return deny_;
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @return The count of deny.
     */
    public int getDenyCount() {
      return deny_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The deny at the given index.
     */
    public java.lang.String getDeny(int index) {
      return deny_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the deny at the given index.
     */
    public com.google.protobuf.ByteString getDenyBytes(int index) {
      return deny_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The deny to set.
     * @return This builder for chaining.
     */
    public Builder setDeny(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDenyIsMutable();
      deny_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @param value The deny to add.
     * @return This builder for chaining.
     */
    public Builder addDeny(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDenyIsMutable();
      deny_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @param values The deny to add.
     * @return This builder for chaining.
     */
    public Builder addAllDeny(java.lang.Iterable<java.lang.String> values) {
      ensureDenyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, deny_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeny() {
      deny_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of deny tags.
     * </pre>
     *
     * <code>repeated string deny = 3;</code>
     *
     * @param value The bytes of the deny to add.
     * @return This builder for chaining.
     */
    public Builder addDenyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureDenyIsMutable();
      deny_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace)
  private static final com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace();
  }

  public static com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExamplesRestrictionsNamespace> PARSER =
      new com.google.protobuf.AbstractParser<ExamplesRestrictionsNamespace>() {
        @java.lang.Override
        public ExamplesRestrictionsNamespace parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExamplesRestrictionsNamespace> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExamplesRestrictionsNamespace> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
