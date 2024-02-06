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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1beta1;

/**
 *
 *
 * <pre>
 * Represents a Dataform Git commit.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.CommitMetadata}
 */
public final class CommitMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.CommitMetadata)
    CommitMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CommitMetadata.newBuilder() to construct.
  private CommitMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CommitMetadata() {
    commitMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CommitMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_CommitMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_CommitMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.CommitMetadata.class,
            com.google.cloud.dataform.v1beta1.CommitMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int AUTHOR_FIELD_NUMBER = 1;
  private com.google.cloud.dataform.v1beta1.CommitAuthor author_;
  /**
   *
   *
   * <pre>
   * Required. The commit's author.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the author field is set.
   */
  @java.lang.Override
  public boolean hasAuthor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The commit's author.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The author.
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.CommitAuthor getAuthor() {
    return author_ == null
        ? com.google.cloud.dataform.v1beta1.CommitAuthor.getDefaultInstance()
        : author_;
  }
  /**
   *
   *
   * <pre>
   * Required. The commit's author.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.CommitAuthorOrBuilder getAuthorOrBuilder() {
    return author_ == null
        ? com.google.cloud.dataform.v1beta1.CommitAuthor.getDefaultInstance()
        : author_;
  }

  public static final int COMMIT_MESSAGE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object commitMessage_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The commit's message.
   * </pre>
   *
   * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The commitMessage.
   */
  @java.lang.Override
  public java.lang.String getCommitMessage() {
    java.lang.Object ref = commitMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commitMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The commit's message.
   * </pre>
   *
   * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for commitMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCommitMessageBytes() {
    java.lang.Object ref = commitMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      commitMessage_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getAuthor());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commitMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, commitMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAuthor());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commitMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, commitMessage_);
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.CommitMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.CommitMetadata other =
        (com.google.cloud.dataform.v1beta1.CommitMetadata) obj;

    if (hasAuthor() != other.hasAuthor()) return false;
    if (hasAuthor()) {
      if (!getAuthor().equals(other.getAuthor())) return false;
    }
    if (!getCommitMessage().equals(other.getCommitMessage())) return false;
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
    if (hasAuthor()) {
      hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
      hash = (53 * hash) + getAuthor().hashCode();
    }
    hash = (37 * hash) + COMMIT_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getCommitMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataform.v1beta1.CommitMetadata prototype) {
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
   * Represents a Dataform Git commit.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.CommitMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.CommitMetadata)
      com.google.cloud.dataform.v1beta1.CommitMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CommitMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CommitMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.CommitMetadata.class,
              com.google.cloud.dataform.v1beta1.CommitMetadata.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.CommitMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAuthorFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      author_ = null;
      if (authorBuilder_ != null) {
        authorBuilder_.dispose();
        authorBuilder_ = null;
      }
      commitMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CommitMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CommitMetadata getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.CommitMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CommitMetadata build() {
      com.google.cloud.dataform.v1beta1.CommitMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CommitMetadata buildPartial() {
      com.google.cloud.dataform.v1beta1.CommitMetadata result =
          new com.google.cloud.dataform.v1beta1.CommitMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataform.v1beta1.CommitMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.author_ = authorBuilder_ == null ? author_ : authorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.commitMessage_ = commitMessage_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.dataform.v1beta1.CommitMetadata) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.CommitMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1beta1.CommitMetadata other) {
      if (other == com.google.cloud.dataform.v1beta1.CommitMetadata.getDefaultInstance())
        return this;
      if (other.hasAuthor()) {
        mergeAuthor(other.getAuthor());
      }
      if (!other.getCommitMessage().isEmpty()) {
        commitMessage_ = other.commitMessage_;
        bitField0_ |= 0x00000002;
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
                input.readMessage(getAuthorFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                commitMessage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private com.google.cloud.dataform.v1beta1.CommitAuthor author_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.CommitAuthor,
            com.google.cloud.dataform.v1beta1.CommitAuthor.Builder,
            com.google.cloud.dataform.v1beta1.CommitAuthorOrBuilder>
        authorBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the author field is set.
     */
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The author.
     */
    public com.google.cloud.dataform.v1beta1.CommitAuthor getAuthor() {
      if (authorBuilder_ == null) {
        return author_ == null
            ? com.google.cloud.dataform.v1beta1.CommitAuthor.getDefaultInstance()
            : author_;
      } else {
        return authorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAuthor(com.google.cloud.dataform.v1beta1.CommitAuthor value) {
      if (authorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        author_ = value;
      } else {
        authorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAuthor(
        com.google.cloud.dataform.v1beta1.CommitAuthor.Builder builderForValue) {
      if (authorBuilder_ == null) {
        author_ = builderForValue.build();
      } else {
        authorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAuthor(com.google.cloud.dataform.v1beta1.CommitAuthor value) {
      if (authorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && author_ != null
            && author_ != com.google.cloud.dataform.v1beta1.CommitAuthor.getDefaultInstance()) {
          getAuthorBuilder().mergeFrom(value);
        } else {
          author_ = value;
        }
      } else {
        authorBuilder_.mergeFrom(value);
      }
      if (author_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAuthor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      author_ = null;
      if (authorBuilder_ != null) {
        authorBuilder_.dispose();
        authorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1beta1.CommitAuthor.Builder getAuthorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAuthorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1beta1.CommitAuthorOrBuilder getAuthorOrBuilder() {
      if (authorBuilder_ != null) {
        return authorBuilder_.getMessageOrBuilder();
      } else {
        return author_ == null
            ? com.google.cloud.dataform.v1beta1.CommitAuthor.getDefaultInstance()
            : author_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The commit's author.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CommitAuthor author = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.CommitAuthor,
            com.google.cloud.dataform.v1beta1.CommitAuthor.Builder,
            com.google.cloud.dataform.v1beta1.CommitAuthorOrBuilder>
        getAuthorFieldBuilder() {
      if (authorBuilder_ == null) {
        authorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataform.v1beta1.CommitAuthor,
                com.google.cloud.dataform.v1beta1.CommitAuthor.Builder,
                com.google.cloud.dataform.v1beta1.CommitAuthorOrBuilder>(
                getAuthor(), getParentForChildren(), isClean());
        author_ = null;
      }
      return authorBuilder_;
    }

    private java.lang.Object commitMessage_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The commit's message.
     * </pre>
     *
     * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The commitMessage.
     */
    public java.lang.String getCommitMessage() {
      java.lang.Object ref = commitMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commitMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The commit's message.
     * </pre>
     *
     * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for commitMessage.
     */
    public com.google.protobuf.ByteString getCommitMessageBytes() {
      java.lang.Object ref = commitMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        commitMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The commit's message.
     * </pre>
     *
     * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The commitMessage to set.
     * @return This builder for chaining.
     */
    public Builder setCommitMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      commitMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The commit's message.
     * </pre>
     *
     * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCommitMessage() {
      commitMessage_ = getDefaultInstance().getCommitMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The commit's message.
     * </pre>
     *
     * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for commitMessage to set.
     * @return This builder for chaining.
     */
    public Builder setCommitMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      commitMessage_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.CommitMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.CommitMetadata)
  private static final com.google.cloud.dataform.v1beta1.CommitMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.CommitMetadata();
  }

  public static com.google.cloud.dataform.v1beta1.CommitMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitMetadata> PARSER =
      new com.google.protobuf.AbstractParser<CommitMetadata>() {
        @java.lang.Override
        public CommitMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommitMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.CommitMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
