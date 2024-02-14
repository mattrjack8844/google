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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.PreconfiguredWafSet}
 */
public final class PreconfiguredWafSet extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.PreconfiguredWafSet)
    PreconfiguredWafSetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PreconfiguredWafSet.newBuilder() to construct.
  private PreconfiguredWafSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PreconfiguredWafSet() {
    expressionSets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PreconfiguredWafSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_PreconfiguredWafSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_PreconfiguredWafSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.PreconfiguredWafSet.class,
            com.google.cloud.compute.v1.PreconfiguredWafSet.Builder.class);
  }

  public static final int EXPRESSION_SETS_FIELD_NUMBER = 474011032;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.WafExpressionSet> expressionSets_;
  /**
   *
   *
   * <pre>
   * List of entities that are currently supported for WAF rules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.WafExpressionSet> getExpressionSetsList() {
    return expressionSets_;
  }
  /**
   *
   *
   * <pre>
   * List of entities that are currently supported for WAF rules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.WafExpressionSetOrBuilder>
      getExpressionSetsOrBuilderList() {
    return expressionSets_;
  }
  /**
   *
   *
   * <pre>
   * List of entities that are currently supported for WAF rules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
   */
  @java.lang.Override
  public int getExpressionSetsCount() {
    return expressionSets_.size();
  }
  /**
   *
   *
   * <pre>
   * List of entities that are currently supported for WAF rules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WafExpressionSet getExpressionSets(int index) {
    return expressionSets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of entities that are currently supported for WAF rules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WafExpressionSetOrBuilder getExpressionSetsOrBuilder(
      int index) {
    return expressionSets_.get(index);
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
    for (int i = 0; i < expressionSets_.size(); i++) {
      output.writeMessage(474011032, expressionSets_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < expressionSets_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              474011032, expressionSets_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.PreconfiguredWafSet)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.PreconfiguredWafSet other =
        (com.google.cloud.compute.v1.PreconfiguredWafSet) obj;

    if (!getExpressionSetsList().equals(other.getExpressionSetsList())) return false;
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
    if (getExpressionSetsCount() > 0) {
      hash = (37 * hash) + EXPRESSION_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getExpressionSetsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.PreconfiguredWafSet prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.PreconfiguredWafSet}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.PreconfiguredWafSet)
      com.google.cloud.compute.v1.PreconfiguredWafSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PreconfiguredWafSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PreconfiguredWafSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.PreconfiguredWafSet.class,
              com.google.cloud.compute.v1.PreconfiguredWafSet.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.PreconfiguredWafSet.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (expressionSetsBuilder_ == null) {
        expressionSets_ = java.util.Collections.emptyList();
      } else {
        expressionSets_ = null;
        expressionSetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PreconfiguredWafSet_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreconfiguredWafSet getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.PreconfiguredWafSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreconfiguredWafSet build() {
      com.google.cloud.compute.v1.PreconfiguredWafSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreconfiguredWafSet buildPartial() {
      com.google.cloud.compute.v1.PreconfiguredWafSet result =
          new com.google.cloud.compute.v1.PreconfiguredWafSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.PreconfiguredWafSet result) {
      if (expressionSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          expressionSets_ = java.util.Collections.unmodifiableList(expressionSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.expressionSets_ = expressionSets_;
      } else {
        result.expressionSets_ = expressionSetsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.PreconfiguredWafSet result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.PreconfiguredWafSet) {
        return mergeFrom((com.google.cloud.compute.v1.PreconfiguredWafSet) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.PreconfiguredWafSet other) {
      if (other == com.google.cloud.compute.v1.PreconfiguredWafSet.getDefaultInstance())
        return this;
      if (expressionSetsBuilder_ == null) {
        if (!other.expressionSets_.isEmpty()) {
          if (expressionSets_.isEmpty()) {
            expressionSets_ = other.expressionSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExpressionSetsIsMutable();
            expressionSets_.addAll(other.expressionSets_);
          }
          onChanged();
        }
      } else {
        if (!other.expressionSets_.isEmpty()) {
          if (expressionSetsBuilder_.isEmpty()) {
            expressionSetsBuilder_.dispose();
            expressionSetsBuilder_ = null;
            expressionSets_ = other.expressionSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            expressionSetsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getExpressionSetsFieldBuilder()
                    : null;
          } else {
            expressionSetsBuilder_.addAllMessages(other.expressionSets_);
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
            case -502879038:
              {
                com.google.cloud.compute.v1.WafExpressionSet m =
                    input.readMessage(
                        com.google.cloud.compute.v1.WafExpressionSet.parser(), extensionRegistry);
                if (expressionSetsBuilder_ == null) {
                  ensureExpressionSetsIsMutable();
                  expressionSets_.add(m);
                } else {
                  expressionSetsBuilder_.addMessage(m);
                }
                break;
              } // case -502879038
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

    private java.util.List<com.google.cloud.compute.v1.WafExpressionSet> expressionSets_ =
        java.util.Collections.emptyList();

    private void ensureExpressionSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        expressionSets_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.WafExpressionSet>(expressionSets_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.WafExpressionSet,
            com.google.cloud.compute.v1.WafExpressionSet.Builder,
            com.google.cloud.compute.v1.WafExpressionSetOrBuilder>
        expressionSetsBuilder_;

    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.WafExpressionSet> getExpressionSetsList() {
      if (expressionSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(expressionSets_);
      } else {
        return expressionSetsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public int getExpressionSetsCount() {
      if (expressionSetsBuilder_ == null) {
        return expressionSets_.size();
      } else {
        return expressionSetsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public com.google.cloud.compute.v1.WafExpressionSet getExpressionSets(int index) {
      if (expressionSetsBuilder_ == null) {
        return expressionSets_.get(index);
      } else {
        return expressionSetsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder setExpressionSets(
        int index, com.google.cloud.compute.v1.WafExpressionSet value) {
      if (expressionSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionSetsIsMutable();
        expressionSets_.set(index, value);
        onChanged();
      } else {
        expressionSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder setExpressionSets(
        int index, com.google.cloud.compute.v1.WafExpressionSet.Builder builderForValue) {
      if (expressionSetsBuilder_ == null) {
        ensureExpressionSetsIsMutable();
        expressionSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        expressionSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder addExpressionSets(com.google.cloud.compute.v1.WafExpressionSet value) {
      if (expressionSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionSetsIsMutable();
        expressionSets_.add(value);
        onChanged();
      } else {
        expressionSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder addExpressionSets(
        int index, com.google.cloud.compute.v1.WafExpressionSet value) {
      if (expressionSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionSetsIsMutable();
        expressionSets_.add(index, value);
        onChanged();
      } else {
        expressionSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder addExpressionSets(
        com.google.cloud.compute.v1.WafExpressionSet.Builder builderForValue) {
      if (expressionSetsBuilder_ == null) {
        ensureExpressionSetsIsMutable();
        expressionSets_.add(builderForValue.build());
        onChanged();
      } else {
        expressionSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder addExpressionSets(
        int index, com.google.cloud.compute.v1.WafExpressionSet.Builder builderForValue) {
      if (expressionSetsBuilder_ == null) {
        ensureExpressionSetsIsMutable();
        expressionSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        expressionSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder addAllExpressionSets(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.WafExpressionSet> values) {
      if (expressionSetsBuilder_ == null) {
        ensureExpressionSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, expressionSets_);
        onChanged();
      } else {
        expressionSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder clearExpressionSets() {
      if (expressionSetsBuilder_ == null) {
        expressionSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        expressionSetsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public Builder removeExpressionSets(int index) {
      if (expressionSetsBuilder_ == null) {
        ensureExpressionSetsIsMutable();
        expressionSets_.remove(index);
        onChanged();
      } else {
        expressionSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public com.google.cloud.compute.v1.WafExpressionSet.Builder getExpressionSetsBuilder(
        int index) {
      return getExpressionSetsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public com.google.cloud.compute.v1.WafExpressionSetOrBuilder getExpressionSetsOrBuilder(
        int index) {
      if (expressionSetsBuilder_ == null) {
        return expressionSets_.get(index);
      } else {
        return expressionSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.WafExpressionSetOrBuilder>
        getExpressionSetsOrBuilderList() {
      if (expressionSetsBuilder_ != null) {
        return expressionSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(expressionSets_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public com.google.cloud.compute.v1.WafExpressionSet.Builder addExpressionSetsBuilder() {
      return getExpressionSetsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.WafExpressionSet.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public com.google.cloud.compute.v1.WafExpressionSet.Builder addExpressionSetsBuilder(
        int index) {
      return getExpressionSetsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.WafExpressionSet.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of entities that are currently supported for WAF rules.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.WafExpressionSet expression_sets = 474011032;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.WafExpressionSet.Builder>
        getExpressionSetsBuilderList() {
      return getExpressionSetsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.WafExpressionSet,
            com.google.cloud.compute.v1.WafExpressionSet.Builder,
            com.google.cloud.compute.v1.WafExpressionSetOrBuilder>
        getExpressionSetsFieldBuilder() {
      if (expressionSetsBuilder_ == null) {
        expressionSetsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.WafExpressionSet,
                com.google.cloud.compute.v1.WafExpressionSet.Builder,
                com.google.cloud.compute.v1.WafExpressionSetOrBuilder>(
                expressionSets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        expressionSets_ = null;
      }
      return expressionSetsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.PreconfiguredWafSet)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.PreconfiguredWafSet)
  private static final com.google.cloud.compute.v1.PreconfiguredWafSet DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.PreconfiguredWafSet();
  }

  public static com.google.cloud.compute.v1.PreconfiguredWafSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreconfiguredWafSet> PARSER =
      new com.google.protobuf.AbstractParser<PreconfiguredWafSet>() {
        @java.lang.Override
        public PreconfiguredWafSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<PreconfiguredWafSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreconfiguredWafSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.PreconfiguredWafSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
