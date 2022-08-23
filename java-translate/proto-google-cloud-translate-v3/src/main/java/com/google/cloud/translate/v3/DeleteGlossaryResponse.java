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
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

/**
 *
 *
 * <pre>
 * Stored in the
 * [google.longrunning.Operation.response][google.longrunning.Operation.response]
 * field returned by DeleteGlossary.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.DeleteGlossaryResponse}
 */
public final class DeleteGlossaryResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.DeleteGlossaryResponse)
    DeleteGlossaryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeleteGlossaryResponse.newBuilder() to construct.
  private DeleteGlossaryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteGlossaryResponse() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteGlossaryResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DeleteGlossaryResponse(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (submitTime_ != null) {
                subBuilder = submitTime_.toBuilder();
              }
              submitTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(submitTime_);
                submitTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (endTime_ != null) {
                subBuilder = endTime_.toBuilder();
              }
              endTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endTime_);
                endTime_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_DeleteGlossaryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_DeleteGlossaryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.DeleteGlossaryResponse.class,
            com.google.cloud.translate.v3.DeleteGlossaryResponse.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The name of the deleted glossary.
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
   * The name of the deleted glossary.
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

  public static final int SUBMIT_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp submitTime_;
  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   *
   * @return Whether the submitTime field is set.
   */
  @java.lang.Override
  public boolean hasSubmitTime() {
    return submitTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   *
   * @return The submitTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getSubmitTime() {
    return submitTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
  }
  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder() {
    return getSubmitTime();
  }

  public static final int END_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp endTime_;
  /**
   *
   *
   * <pre>
   * The time when the glossary deletion is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   *
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time when the glossary deletion is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   *
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   *
   *
   * <pre>
   * The time when the glossary deletion is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return getEndTime();
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
    if (submitTime_ != null) {
      output.writeMessage(2, getSubmitTime());
    }
    if (endTime_ != null) {
      output.writeMessage(3, getEndTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (submitTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSubmitTime());
    }
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getEndTime());
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
    if (!(obj instanceof com.google.cloud.translate.v3.DeleteGlossaryResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.DeleteGlossaryResponse other =
        (com.google.cloud.translate.v3.DeleteGlossaryResponse) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasSubmitTime() != other.hasSubmitTime()) return false;
    if (hasSubmitTime()) {
      if (!getSubmitTime().equals(other.getSubmitTime())) return false;
    }
    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime().equals(other.getEndTime())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasSubmitTime()) {
      hash = (37 * hash) + SUBMIT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSubmitTime().hashCode();
    }
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.translate.v3.DeleteGlossaryResponse prototype) {
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
   * Stored in the
   * [google.longrunning.Operation.response][google.longrunning.Operation.response]
   * field returned by DeleteGlossary.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.DeleteGlossaryResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.DeleteGlossaryResponse)
      com.google.cloud.translate.v3.DeleteGlossaryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_DeleteGlossaryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_DeleteGlossaryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.DeleteGlossaryResponse.class,
              com.google.cloud.translate.v3.DeleteGlossaryResponse.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.DeleteGlossaryResponse.newBuilder()
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
      name_ = "";

      if (submitTimeBuilder_ == null) {
        submitTime_ = null;
      } else {
        submitTime_ = null;
        submitTimeBuilder_ = null;
      }
      if (endTimeBuilder_ == null) {
        endTime_ = null;
      } else {
        endTime_ = null;
        endTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_DeleteGlossaryResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DeleteGlossaryResponse getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.DeleteGlossaryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DeleteGlossaryResponse build() {
      com.google.cloud.translate.v3.DeleteGlossaryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DeleteGlossaryResponse buildPartial() {
      com.google.cloud.translate.v3.DeleteGlossaryResponse result =
          new com.google.cloud.translate.v3.DeleteGlossaryResponse(this);
      result.name_ = name_;
      if (submitTimeBuilder_ == null) {
        result.submitTime_ = submitTime_;
      } else {
        result.submitTime_ = submitTimeBuilder_.build();
      }
      if (endTimeBuilder_ == null) {
        result.endTime_ = endTime_;
      } else {
        result.endTime_ = endTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.translate.v3.DeleteGlossaryResponse) {
        return mergeFrom((com.google.cloud.translate.v3.DeleteGlossaryResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.DeleteGlossaryResponse other) {
      if (other == com.google.cloud.translate.v3.DeleteGlossaryResponse.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasSubmitTime()) {
        mergeSubmitTime(other.getSubmitTime());
      }
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
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
      com.google.cloud.translate.v3.DeleteGlossaryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.translate.v3.DeleteGlossaryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name of the deleted glossary.
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
     * The name of the deleted glossary.
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
     * The name of the deleted glossary.
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the deleted glossary.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the deleted glossary.
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
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp submitTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        submitTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     *
     * @return Whether the submitTime field is set.
     */
    public boolean hasSubmitTime() {
      return submitTimeBuilder_ != null || submitTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     *
     * @return The submitTime.
     */
    public com.google.protobuf.Timestamp getSubmitTime() {
      if (submitTimeBuilder_ == null) {
        return submitTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : submitTime_;
      } else {
        return submitTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     */
    public Builder setSubmitTime(com.google.protobuf.Timestamp value) {
      if (submitTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        submitTime_ = value;
        onChanged();
      } else {
        submitTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     */
    public Builder setSubmitTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (submitTimeBuilder_ == null) {
        submitTime_ = builderForValue.build();
        onChanged();
      } else {
        submitTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     */
    public Builder mergeSubmitTime(com.google.protobuf.Timestamp value) {
      if (submitTimeBuilder_ == null) {
        if (submitTime_ != null) {
          submitTime_ =
              com.google.protobuf.Timestamp.newBuilder(submitTime_).mergeFrom(value).buildPartial();
        } else {
          submitTime_ = value;
        }
        onChanged();
      } else {
        submitTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     */
    public Builder clearSubmitTime() {
      if (submitTimeBuilder_ == null) {
        submitTime_ = null;
        onChanged();
      } else {
        submitTime_ = null;
        submitTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getSubmitTimeBuilder() {

      onChanged();
      return getSubmitTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder() {
      if (submitTimeBuilder_ != null) {
        return submitTimeBuilder_.getMessageOrBuilder();
      } else {
        return submitTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : submitTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the operation was submitted to the server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getSubmitTimeFieldBuilder() {
      if (submitTimeBuilder_ == null) {
        submitTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getSubmitTime(), getParentForChildren(), isClean());
        submitTime_ = null;
      }
      return submitTimeBuilder_;
    }

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        endTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     *
     * @return Whether the endTime field is set.
     */
    public boolean hasEndTime() {
      return endTimeBuilder_ != null || endTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     *
     * @return The endTime.
     */
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
        onChanged();
      } else {
        endTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
        onChanged();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (endTime_ != null) {
          endTime_ =
              com.google.protobuf.Timestamp.newBuilder(endTime_).mergeFrom(value).buildPartial();
        } else {
          endTime_ = value;
        }
        onChanged();
      } else {
        endTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public Builder clearEndTime() {
      if (endTimeBuilder_ == null) {
        endTime_ = null;
        onChanged();
      } else {
        endTime_ = null;
        endTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {

      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the glossary deletion is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getEndTime(), getParentForChildren(), isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.DeleteGlossaryResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.DeleteGlossaryResponse)
  private static final com.google.cloud.translate.v3.DeleteGlossaryResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.DeleteGlossaryResponse();
  }

  public static com.google.cloud.translate.v3.DeleteGlossaryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteGlossaryResponse> PARSER =
      new com.google.protobuf.AbstractParser<DeleteGlossaryResponse>() {
        @java.lang.Override
        public DeleteGlossaryResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DeleteGlossaryResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DeleteGlossaryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteGlossaryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.DeleteGlossaryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
