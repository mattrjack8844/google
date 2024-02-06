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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Results of listing instructions under a project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ListInstructionsResponse}
 */
public final class ListInstructionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ListInstructionsResponse)
    ListInstructionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListInstructionsResponse.newBuilder() to construct.
  private ListInstructionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListInstructionsResponse() {
    instructions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListInstructionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ListInstructionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ListInstructionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse.class,
            com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse.Builder.class);
  }

  public static final int INSTRUCTIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datalabeling.v1beta1.Instruction> instructions_;
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datalabeling.v1beta1.Instruction> getInstructionsList() {
    return instructions_;
  }
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder>
      getInstructionsOrBuilderList() {
    return instructions_;
  }
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  @java.lang.Override
  public int getInstructionsCount() {
    return instructions_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.Instruction getInstructions(int index) {
    return instructions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of Instructions to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder getInstructionsOrBuilder(
      int index) {
    return instructions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < instructions_.size(); i++) {
      output.writeMessage(1, instructions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < instructions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, instructions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse other =
        (com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse) obj;

    if (!getInstructionsList().equals(other.getInstructionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getInstructionsCount() > 0) {
      hash = (37 * hash) + INSTRUCTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getInstructionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse prototype) {
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
   * Results of listing instructions under a project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ListInstructionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ListInstructionsResponse)
      com.google.cloud.datalabeling.v1beta1.ListInstructionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListInstructionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListInstructionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse.class,
              com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (instructionsBuilder_ == null) {
        instructions_ = java.util.Collections.emptyList();
      } else {
        instructions_ = null;
        instructionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListInstructionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse build() {
      com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse result =
          new com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse result) {
      if (instructionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          instructions_ = java.util.Collections.unmodifiableList(instructions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instructions_ = instructions_;
      } else {
        result.instructions_ = instructionsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse.getDefaultInstance())
        return this;
      if (instructionsBuilder_ == null) {
        if (!other.instructions_.isEmpty()) {
          if (instructions_.isEmpty()) {
            instructions_ = other.instructions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstructionsIsMutable();
            instructions_.addAll(other.instructions_);
          }
          onChanged();
        }
      } else {
        if (!other.instructions_.isEmpty()) {
          if (instructionsBuilder_.isEmpty()) {
            instructionsBuilder_.dispose();
            instructionsBuilder_ = null;
            instructions_ = other.instructions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instructionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getInstructionsFieldBuilder()
                    : null;
          } else {
            instructionsBuilder_.addAllMessages(other.instructions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.datalabeling.v1beta1.Instruction m =
                    input.readMessage(
                        com.google.cloud.datalabeling.v1beta1.Instruction.parser(),
                        extensionRegistry);
                if (instructionsBuilder_ == null) {
                  ensureInstructionsIsMutable();
                  instructions_.add(m);
                } else {
                  instructionsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.datalabeling.v1beta1.Instruction> instructions_ =
        java.util.Collections.emptyList();

    private void ensureInstructionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instructions_ =
            new java.util.ArrayList<com.google.cloud.datalabeling.v1beta1.Instruction>(
                instructions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.Instruction,
            com.google.cloud.datalabeling.v1beta1.Instruction.Builder,
            com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder>
        instructionsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.Instruction> getInstructionsList() {
      if (instructionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instructions_);
      } else {
        return instructionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public int getInstructionsCount() {
      if (instructionsBuilder_ == null) {
        return instructions_.size();
      } else {
        return instructionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.Instruction getInstructions(int index) {
      if (instructionsBuilder_ == null) {
        return instructions_.get(index);
      } else {
        return instructionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder setInstructions(
        int index, com.google.cloud.datalabeling.v1beta1.Instruction value) {
      if (instructionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstructionsIsMutable();
        instructions_.set(index, value);
        onChanged();
      } else {
        instructionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder setInstructions(
        int index, com.google.cloud.datalabeling.v1beta1.Instruction.Builder builderForValue) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        instructions_.set(index, builderForValue.build());
        onChanged();
      } else {
        instructionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder addInstructions(com.google.cloud.datalabeling.v1beta1.Instruction value) {
      if (instructionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstructionsIsMutable();
        instructions_.add(value);
        onChanged();
      } else {
        instructionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder addInstructions(
        int index, com.google.cloud.datalabeling.v1beta1.Instruction value) {
      if (instructionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstructionsIsMutable();
        instructions_.add(index, value);
        onChanged();
      } else {
        instructionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder addInstructions(
        com.google.cloud.datalabeling.v1beta1.Instruction.Builder builderForValue) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        instructions_.add(builderForValue.build());
        onChanged();
      } else {
        instructionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder addInstructions(
        int index, com.google.cloud.datalabeling.v1beta1.Instruction.Builder builderForValue) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        instructions_.add(index, builderForValue.build());
        onChanged();
      } else {
        instructionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder addAllInstructions(
        java.lang.Iterable<? extends com.google.cloud.datalabeling.v1beta1.Instruction> values) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, instructions_);
        onChanged();
      } else {
        instructionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder clearInstructions() {
      if (instructionsBuilder_ == null) {
        instructions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instructionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public Builder removeInstructions(int index) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        instructions_.remove(index);
        onChanged();
      } else {
        instructionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.Instruction.Builder getInstructionsBuilder(
        int index) {
      return getInstructionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder getInstructionsOrBuilder(
        int index) {
      if (instructionsBuilder_ == null) {
        return instructions_.get(index);
      } else {
        return instructionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder>
        getInstructionsOrBuilderList() {
      if (instructionsBuilder_ != null) {
        return instructionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instructions_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.Instruction.Builder addInstructionsBuilder() {
      return getInstructionsFieldBuilder()
          .addBuilder(com.google.cloud.datalabeling.v1beta1.Instruction.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.Instruction.Builder addInstructionsBuilder(
        int index) {
      return getInstructionsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.datalabeling.v1beta1.Instruction.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Instructions to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Instruction instructions = 1;</code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.Instruction.Builder>
        getInstructionsBuilderList() {
      return getInstructionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.Instruction,
            com.google.cloud.datalabeling.v1beta1.Instruction.Builder,
            com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder>
        getInstructionsFieldBuilder() {
      if (instructionsBuilder_ == null) {
        instructionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.Instruction,
                com.google.cloud.datalabeling.v1beta1.Instruction.Builder,
                com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder>(
                instructions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        instructions_ = null;
      }
      return instructionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ListInstructionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ListInstructionsResponse)
  private static final com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse();
  }

  public static com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInstructionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListInstructionsResponse>() {
        @java.lang.Override
        public ListInstructionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListInstructionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInstructionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
