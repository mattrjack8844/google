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
// source: google/cloud/contentwarehouse/v1/filters.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * To support the custom weighting across document schemas.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.CustomWeightsMetadata}
 */
public final class CustomWeightsMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.CustomWeightsMetadata)
    CustomWeightsMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CustomWeightsMetadata.newBuilder() to construct.
  private CustomWeightsMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CustomWeightsMetadata() {
    weightedSchemaProperties_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CustomWeightsMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.FiltersProto
        .internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.FiltersProto
        .internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata.class,
            com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata.Builder.class);
  }

  public static final int WEIGHTED_SCHEMA_PROPERTIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty>
      weightedSchemaProperties_;
  /**
   *
   *
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty>
      getWeightedSchemaPropertiesList() {
    return weightedSchemaProperties_;
  }
  /**
   *
   *
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder>
      getWeightedSchemaPropertiesOrBuilderList() {
    return weightedSchemaProperties_;
  }
  /**
   *
   *
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
   * </code>
   */
  @java.lang.Override
  public int getWeightedSchemaPropertiesCount() {
    return weightedSchemaProperties_.size();
  }
  /**
   *
   *
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty getWeightedSchemaProperties(
      int index) {
    return weightedSchemaProperties_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder
      getWeightedSchemaPropertiesOrBuilder(int index) {
    return weightedSchemaProperties_.get(index);
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
    for (int i = 0; i < weightedSchemaProperties_.size(); i++) {
      output.writeMessage(1, weightedSchemaProperties_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < weightedSchemaProperties_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, weightedSchemaProperties_.get(i));
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata other =
        (com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata) obj;

    if (!getWeightedSchemaPropertiesList().equals(other.getWeightedSchemaPropertiesList()))
      return false;
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
    if (getWeightedSchemaPropertiesCount() > 0) {
      hash = (37 * hash) + WEIGHTED_SCHEMA_PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getWeightedSchemaPropertiesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata parseFrom(
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
      com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata prototype) {
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
   * To support the custom weighting across document schemas.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.CustomWeightsMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.CustomWeightsMetadata)
      com.google.cloud.contentwarehouse.v1.CustomWeightsMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.FiltersProto
          .internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.FiltersProto
          .internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata.class,
              com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (weightedSchemaPropertiesBuilder_ == null) {
        weightedSchemaProperties_ = java.util.Collections.emptyList();
      } else {
        weightedSchemaProperties_ = null;
        weightedSchemaPropertiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.FiltersProto
          .internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata build() {
      com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata buildPartial() {
      com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata result =
          new com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata result) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          weightedSchemaProperties_ =
              java.util.Collections.unmodifiableList(weightedSchemaProperties_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.weightedSchemaProperties_ = weightedSchemaProperties_;
      } else {
        result.weightedSchemaProperties_ = weightedSchemaPropertiesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata result) {
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata other) {
      if (other == com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata.getDefaultInstance())
        return this;
      if (weightedSchemaPropertiesBuilder_ == null) {
        if (!other.weightedSchemaProperties_.isEmpty()) {
          if (weightedSchemaProperties_.isEmpty()) {
            weightedSchemaProperties_ = other.weightedSchemaProperties_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWeightedSchemaPropertiesIsMutable();
            weightedSchemaProperties_.addAll(other.weightedSchemaProperties_);
          }
          onChanged();
        }
      } else {
        if (!other.weightedSchemaProperties_.isEmpty()) {
          if (weightedSchemaPropertiesBuilder_.isEmpty()) {
            weightedSchemaPropertiesBuilder_.dispose();
            weightedSchemaPropertiesBuilder_ = null;
            weightedSchemaProperties_ = other.weightedSchemaProperties_;
            bitField0_ = (bitField0_ & ~0x00000001);
            weightedSchemaPropertiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getWeightedSchemaPropertiesFieldBuilder()
                    : null;
          } else {
            weightedSchemaPropertiesBuilder_.addAllMessages(other.weightedSchemaProperties_);
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
                com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty m =
                    input.readMessage(
                        com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.parser(),
                        extensionRegistry);
                if (weightedSchemaPropertiesBuilder_ == null) {
                  ensureWeightedSchemaPropertiesIsMutable();
                  weightedSchemaProperties_.add(m);
                } else {
                  weightedSchemaPropertiesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty>
        weightedSchemaProperties_ = java.util.Collections.emptyList();

    private void ensureWeightedSchemaPropertiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        weightedSchemaProperties_ =
            new java.util.ArrayList<com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty>(
                weightedSchemaProperties_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty,
            com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder,
            com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder>
        weightedSchemaPropertiesBuilder_;

    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty>
        getWeightedSchemaPropertiesList() {
      if (weightedSchemaPropertiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(weightedSchemaProperties_);
      } else {
        return weightedSchemaPropertiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public int getWeightedSchemaPropertiesCount() {
      if (weightedSchemaPropertiesBuilder_ == null) {
        return weightedSchemaProperties_.size();
      } else {
        return weightedSchemaPropertiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty getWeightedSchemaProperties(
        int index) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        return weightedSchemaProperties_.get(index);
      } else {
        return weightedSchemaPropertiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder setWeightedSchemaProperties(
        int index, com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty value) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeightedSchemaPropertiesIsMutable();
        weightedSchemaProperties_.set(index, value);
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder setWeightedSchemaProperties(
        int index,
        com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder builderForValue) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        ensureWeightedSchemaPropertiesIsMutable();
        weightedSchemaProperties_.set(index, builderForValue.build());
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder addWeightedSchemaProperties(
        com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty value) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeightedSchemaPropertiesIsMutable();
        weightedSchemaProperties_.add(value);
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder addWeightedSchemaProperties(
        int index, com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty value) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeightedSchemaPropertiesIsMutable();
        weightedSchemaProperties_.add(index, value);
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder addWeightedSchemaProperties(
        com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder builderForValue) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        ensureWeightedSchemaPropertiesIsMutable();
        weightedSchemaProperties_.add(builderForValue.build());
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder addWeightedSchemaProperties(
        int index,
        com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder builderForValue) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        ensureWeightedSchemaPropertiesIsMutable();
        weightedSchemaProperties_.add(index, builderForValue.build());
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder addAllWeightedSchemaProperties(
        java.lang.Iterable<? extends com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty>
            values) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        ensureWeightedSchemaPropertiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, weightedSchemaProperties_);
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder clearWeightedSchemaProperties() {
      if (weightedSchemaPropertiesBuilder_ == null) {
        weightedSchemaProperties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public Builder removeWeightedSchemaProperties(int index) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        ensureWeightedSchemaPropertiesIsMutable();
        weightedSchemaProperties_.remove(index);
        onChanged();
      } else {
        weightedSchemaPropertiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder
        getWeightedSchemaPropertiesBuilder(int index) {
      return getWeightedSchemaPropertiesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder
        getWeightedSchemaPropertiesOrBuilder(int index) {
      if (weightedSchemaPropertiesBuilder_ == null) {
        return weightedSchemaProperties_.get(index);
      } else {
        return weightedSchemaPropertiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder>
        getWeightedSchemaPropertiesOrBuilderList() {
      if (weightedSchemaPropertiesBuilder_ != null) {
        return weightedSchemaPropertiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(weightedSchemaProperties_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder
        addWeightedSchemaPropertiesBuilder() {
      return getWeightedSchemaPropertiesFieldBuilder()
          .addBuilder(
              com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder
        addWeightedSchemaPropertiesBuilder(int index) {
      return getWeightedSchemaPropertiesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of schema and property name. Allows a maximum of 10 schemas to be
     * specified for relevance boosting.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder>
        getWeightedSchemaPropertiesBuilderList() {
      return getWeightedSchemaPropertiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty,
            com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder,
            com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder>
        getWeightedSchemaPropertiesFieldBuilder() {
      if (weightedSchemaPropertiesBuilder_ == null) {
        weightedSchemaPropertiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty,
                com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty.Builder,
                com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder>(
                weightedSchemaProperties_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        weightedSchemaProperties_ = null;
      }
      return weightedSchemaPropertiesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.CustomWeightsMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.CustomWeightsMetadata)
  private static final com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata();
  }

  public static com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomWeightsMetadata> PARSER =
      new com.google.protobuf.AbstractParser<CustomWeightsMetadata>() {
        @java.lang.Override
        public CustomWeightsMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomWeightsMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomWeightsMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.CustomWeightsMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
