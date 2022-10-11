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
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [FeaturestoreService.BatchCreateFeatures][google.cloud.aiplatform.v1beta1.FeaturestoreService.BatchCreateFeatures].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse}
 */
public final class BatchCreateFeaturesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse)
    BatchCreateFeaturesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateFeaturesResponse.newBuilder() to construct.
  private BatchCreateFeaturesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateFeaturesResponse() {
    features_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateFeaturesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_BatchCreateFeaturesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_BatchCreateFeaturesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse.class,
            com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse.Builder.class);
  }

  public static final int FEATURES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Feature> features_;
  /**
   *
   *
   * <pre>
   * The Features created.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Feature> getFeaturesList() {
    return features_;
  }
  /**
   *
   *
   * <pre>
   * The Features created.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
      getFeaturesOrBuilderList() {
    return features_;
  }
  /**
   *
   *
   * <pre>
   * The Features created.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public int getFeaturesCount() {
    return features_.size();
  }
  /**
   *
   *
   * <pre>
   * The Features created.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Feature getFeatures(int index) {
    return features_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The Features created.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder getFeaturesOrBuilder(int index) {
    return features_.get(index);
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
    for (int i = 0; i < features_.size(); i++) {
      output.writeMessage(1, features_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < features_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, features_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse other =
        (com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse) obj;

    if (!getFeaturesList().equals(other.getFeaturesList())) return false;
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
    if (getFeaturesCount() > 0) {
      hash = (37 * hash) + FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getFeaturesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse prototype) {
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
   * Response message for [FeaturestoreService.BatchCreateFeatures][google.cloud.aiplatform.v1beta1.FeaturestoreService.BatchCreateFeatures].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse)
      com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchCreateFeaturesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchCreateFeaturesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse.class,
              com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (featuresBuilder_ == null) {
        features_ = java.util.Collections.emptyList();
      } else {
        features_ = null;
        featuresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchCreateFeaturesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse build() {
      com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse result =
          new com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse(this);
      int from_bitField0_ = bitField0_;
      if (featuresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          features_ = java.util.Collections.unmodifiableList(features_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.features_ = features_;
      } else {
        result.features_ = featuresBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse.getDefaultInstance())
        return this;
      if (featuresBuilder_ == null) {
        if (!other.features_.isEmpty()) {
          if (features_.isEmpty()) {
            features_ = other.features_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeaturesIsMutable();
            features_.addAll(other.features_);
          }
          onChanged();
        }
      } else {
        if (!other.features_.isEmpty()) {
          if (featuresBuilder_.isEmpty()) {
            featuresBuilder_.dispose();
            featuresBuilder_ = null;
            features_ = other.features_;
            bitField0_ = (bitField0_ & ~0x00000001);
            featuresBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFeaturesFieldBuilder()
                    : null;
          } else {
            featuresBuilder_.addAllMessages(other.features_);
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
                com.google.cloud.aiplatform.v1beta1.Feature m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.Feature.parser(), extensionRegistry);
                if (featuresBuilder_ == null) {
                  ensureFeaturesIsMutable();
                  features_.add(m);
                } else {
                  featuresBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Feature> features_ =
        java.util.Collections.emptyList();

    private void ensureFeaturesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        features_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Feature>(features_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Feature,
            com.google.cloud.aiplatform.v1beta1.Feature.Builder,
            com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
        featuresBuilder_;

    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Feature> getFeaturesList() {
      if (featuresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(features_);
      } else {
        return featuresBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public int getFeaturesCount() {
      if (featuresBuilder_ == null) {
        return features_.size();
      } else {
        return featuresBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature getFeatures(int index) {
      if (featuresBuilder_ == null) {
        return features_.get(index);
      } else {
        return featuresBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder setFeatures(int index, com.google.cloud.aiplatform.v1beta1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.set(index, value);
        onChanged();
      } else {
        featuresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder setFeatures(
        int index, com.google.cloud.aiplatform.v1beta1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.set(index, builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addFeatures(com.google.cloud.aiplatform.v1beta1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.add(value);
        onChanged();
      } else {
        featuresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addFeatures(int index, com.google.cloud.aiplatform.v1beta1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.add(index, value);
        onChanged();
      } else {
        featuresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addFeatures(
        com.google.cloud.aiplatform.v1beta1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.add(builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addFeatures(
        int index, com.google.cloud.aiplatform.v1beta1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.add(index, builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addAllFeatures(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Feature> values) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, features_);
        onChanged();
      } else {
        featuresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder clearFeatures() {
      if (featuresBuilder_ == null) {
        features_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        featuresBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder removeFeatures(int index) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.remove(index);
        onChanged();
      } else {
        featuresBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature.Builder getFeaturesBuilder(int index) {
      return getFeaturesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder getFeaturesOrBuilder(int index) {
      if (featuresBuilder_ == null) {
        return features_.get(index);
      } else {
        return featuresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
        getFeaturesOrBuilderList() {
      if (featuresBuilder_ != null) {
        return featuresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(features_);
      }
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature.Builder addFeaturesBuilder() {
      return getFeaturesFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature.Builder addFeaturesBuilder(int index) {
      return getFeaturesFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The Features created.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Feature.Builder>
        getFeaturesBuilderList() {
      return getFeaturesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Feature,
            com.google.cloud.aiplatform.v1beta1.Feature.Builder,
            com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
        getFeaturesFieldBuilder() {
      if (featuresBuilder_ == null) {
        featuresBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Feature,
                com.google.cloud.aiplatform.v1beta1.Feature.Builder,
                com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>(
                features_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        features_ = null;
      }
      return featuresBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse)
  private static final com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateFeaturesResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateFeaturesResponse>() {
        @java.lang.Override
        public BatchCreateFeaturesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateFeaturesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateFeaturesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.BatchCreateFeaturesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
