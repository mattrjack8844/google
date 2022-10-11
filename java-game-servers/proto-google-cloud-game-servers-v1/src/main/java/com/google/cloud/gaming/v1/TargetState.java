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
// source: google/cloud/gaming/v1/common.proto

package com.google.cloud.gaming.v1;

/**
 *
 *
 * <pre>
 * Encapsulates the Target state.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1.TargetState}
 */
public final class TargetState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1.TargetState)
    TargetStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TargetState.newBuilder() to construct.
  private TargetState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetState() {
    details_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1.Common
        .internal_static_google_cloud_gaming_v1_TargetState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1.Common
        .internal_static_google_cloud_gaming_v1_TargetState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1.TargetState.class,
            com.google.cloud.gaming.v1.TargetState.Builder.class);
  }

  public static final int DETAILS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.gaming.v1.TargetDetails> details_;
  /**
   *
   *
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gaming.v1.TargetDetails> getDetailsList() {
    return details_;
  }
  /**
   *
   *
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gaming.v1.TargetDetailsOrBuilder>
      getDetailsOrBuilderList() {
    return details_;
  }
  /**
   *
   *
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  @java.lang.Override
  public int getDetailsCount() {
    return details_.size();
  }
  /**
   *
   *
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1.TargetDetails getDetails(int index) {
    return details_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1.TargetDetailsOrBuilder getDetailsOrBuilder(int index) {
    return details_.get(index);
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
    for (int i = 0; i < details_.size(); i++) {
      output.writeMessage(1, details_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < details_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, details_.get(i));
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
    if (!(obj instanceof com.google.cloud.gaming.v1.TargetState)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1.TargetState other = (com.google.cloud.gaming.v1.TargetState) obj;

    if (!getDetailsList().equals(other.getDetailsList())) return false;
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
    if (getDetailsCount() > 0) {
      hash = (37 * hash) + DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getDetailsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.TargetState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.TargetState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.TargetState parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gaming.v1.TargetState prototype) {
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
   * Encapsulates the Target state.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1.TargetState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1.TargetState)
      com.google.cloud.gaming.v1.TargetStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1.Common
          .internal_static_google_cloud_gaming_v1_TargetState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1.Common
          .internal_static_google_cloud_gaming_v1_TargetState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1.TargetState.class,
              com.google.cloud.gaming.v1.TargetState.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1.TargetState.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (detailsBuilder_ == null) {
        details_ = java.util.Collections.emptyList();
      } else {
        details_ = null;
        detailsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1.Common
          .internal_static_google_cloud_gaming_v1_TargetState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.TargetState getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1.TargetState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.TargetState build() {
      com.google.cloud.gaming.v1.TargetState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.TargetState buildPartial() {
      com.google.cloud.gaming.v1.TargetState result =
          new com.google.cloud.gaming.v1.TargetState(this);
      int from_bitField0_ = bitField0_;
      if (detailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          details_ = java.util.Collections.unmodifiableList(details_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.details_ = details_;
      } else {
        result.details_ = detailsBuilder_.build();
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
      if (other instanceof com.google.cloud.gaming.v1.TargetState) {
        return mergeFrom((com.google.cloud.gaming.v1.TargetState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1.TargetState other) {
      if (other == com.google.cloud.gaming.v1.TargetState.getDefaultInstance()) return this;
      if (detailsBuilder_ == null) {
        if (!other.details_.isEmpty()) {
          if (details_.isEmpty()) {
            details_ = other.details_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDetailsIsMutable();
            details_.addAll(other.details_);
          }
          onChanged();
        }
      } else {
        if (!other.details_.isEmpty()) {
          if (detailsBuilder_.isEmpty()) {
            detailsBuilder_.dispose();
            detailsBuilder_ = null;
            details_ = other.details_;
            bitField0_ = (bitField0_ & ~0x00000001);
            detailsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDetailsFieldBuilder()
                    : null;
          } else {
            detailsBuilder_.addAllMessages(other.details_);
          }
        }
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
                com.google.cloud.gaming.v1.TargetDetails m =
                    input.readMessage(
                        com.google.cloud.gaming.v1.TargetDetails.parser(), extensionRegistry);
                if (detailsBuilder_ == null) {
                  ensureDetailsIsMutable();
                  details_.add(m);
                } else {
                  detailsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.gaming.v1.TargetDetails> details_ =
        java.util.Collections.emptyList();

    private void ensureDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        details_ = new java.util.ArrayList<com.google.cloud.gaming.v1.TargetDetails>(details_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gaming.v1.TargetDetails,
            com.google.cloud.gaming.v1.TargetDetails.Builder,
            com.google.cloud.gaming.v1.TargetDetailsOrBuilder>
        detailsBuilder_;

    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public java.util.List<com.google.cloud.gaming.v1.TargetDetails> getDetailsList() {
      if (detailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(details_);
      } else {
        return detailsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public int getDetailsCount() {
      if (detailsBuilder_ == null) {
        return details_.size();
      } else {
        return detailsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public com.google.cloud.gaming.v1.TargetDetails getDetails(int index) {
      if (detailsBuilder_ == null) {
        return details_.get(index);
      } else {
        return detailsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder setDetails(int index, com.google.cloud.gaming.v1.TargetDetails value) {
      if (detailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailsIsMutable();
        details_.set(index, value);
        onChanged();
      } else {
        detailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder setDetails(
        int index, com.google.cloud.gaming.v1.TargetDetails.Builder builderForValue) {
      if (detailsBuilder_ == null) {
        ensureDetailsIsMutable();
        details_.set(index, builderForValue.build());
        onChanged();
      } else {
        detailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder addDetails(com.google.cloud.gaming.v1.TargetDetails value) {
      if (detailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailsIsMutable();
        details_.add(value);
        onChanged();
      } else {
        detailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder addDetails(int index, com.google.cloud.gaming.v1.TargetDetails value) {
      if (detailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDetailsIsMutable();
        details_.add(index, value);
        onChanged();
      } else {
        detailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder addDetails(com.google.cloud.gaming.v1.TargetDetails.Builder builderForValue) {
      if (detailsBuilder_ == null) {
        ensureDetailsIsMutable();
        details_.add(builderForValue.build());
        onChanged();
      } else {
        detailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder addDetails(
        int index, com.google.cloud.gaming.v1.TargetDetails.Builder builderForValue) {
      if (detailsBuilder_ == null) {
        ensureDetailsIsMutable();
        details_.add(index, builderForValue.build());
        onChanged();
      } else {
        detailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder addAllDetails(
        java.lang.Iterable<? extends com.google.cloud.gaming.v1.TargetDetails> values) {
      if (detailsBuilder_ == null) {
        ensureDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, details_);
        onChanged();
      } else {
        detailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder clearDetails() {
      if (detailsBuilder_ == null) {
        details_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        detailsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public Builder removeDetails(int index) {
      if (detailsBuilder_ == null) {
        ensureDetailsIsMutable();
        details_.remove(index);
        onChanged();
      } else {
        detailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public com.google.cloud.gaming.v1.TargetDetails.Builder getDetailsBuilder(int index) {
      return getDetailsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public com.google.cloud.gaming.v1.TargetDetailsOrBuilder getDetailsOrBuilder(int index) {
      if (detailsBuilder_ == null) {
        return details_.get(index);
      } else {
        return detailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gaming.v1.TargetDetailsOrBuilder>
        getDetailsOrBuilderList() {
      if (detailsBuilder_ != null) {
        return detailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(details_);
      }
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public com.google.cloud.gaming.v1.TargetDetails.Builder addDetailsBuilder() {
      return getDetailsFieldBuilder()
          .addBuilder(com.google.cloud.gaming.v1.TargetDetails.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public com.google.cloud.gaming.v1.TargetDetails.Builder addDetailsBuilder(int index) {
      return getDetailsFieldBuilder()
          .addBuilder(index, com.google.cloud.gaming.v1.TargetDetails.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Details about Agones fleets.
     * </pre>
     *
     * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
     */
    public java.util.List<com.google.cloud.gaming.v1.TargetDetails.Builder>
        getDetailsBuilderList() {
      return getDetailsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gaming.v1.TargetDetails,
            com.google.cloud.gaming.v1.TargetDetails.Builder,
            com.google.cloud.gaming.v1.TargetDetailsOrBuilder>
        getDetailsFieldBuilder() {
      if (detailsBuilder_ == null) {
        detailsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.gaming.v1.TargetDetails,
                com.google.cloud.gaming.v1.TargetDetails.Builder,
                com.google.cloud.gaming.v1.TargetDetailsOrBuilder>(
                details_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        details_ = null;
      }
      return detailsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1.TargetState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1.TargetState)
  private static final com.google.cloud.gaming.v1.TargetState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1.TargetState();
  }

  public static com.google.cloud.gaming.v1.TargetState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetState> PARSER =
      new com.google.protobuf.AbstractParser<TargetState>() {
        @java.lang.Override
        public TargetState parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1.TargetState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
