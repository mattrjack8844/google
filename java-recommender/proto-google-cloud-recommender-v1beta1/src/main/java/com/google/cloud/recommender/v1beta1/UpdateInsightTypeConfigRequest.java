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
// source: google/cloud/recommender/v1beta1/recommender_service.proto

package com.google.cloud.recommender.v1beta1;

/**
 *
 *
 * <pre>
 * Request for the `UpdateInsightTypeConfig` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest}
 */
public final class UpdateInsightTypeConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest)
    UpdateInsightTypeConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateInsightTypeConfigRequest.newBuilder() to construct.
  private UpdateInsightTypeConfigRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateInsightTypeConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateInsightTypeConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1beta1.RecommenderProto
        .internal_static_google_cloud_recommender_v1beta1_UpdateInsightTypeConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.RecommenderProto
        .internal_static_google_cloud_recommender_v1beta1_UpdateInsightTypeConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest.class,
            com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest.Builder.class);
  }

  public static final int INSIGHT_TYPE_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.recommender.v1beta1.InsightTypeConfig insightTypeConfig_;
  /**
   *
   *
   * <pre>
   * Required. The InsightTypeConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the insightTypeConfig field is set.
   */
  @java.lang.Override
  public boolean hasInsightTypeConfig() {
    return insightTypeConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The InsightTypeConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The insightTypeConfig.
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.InsightTypeConfig getInsightTypeConfig() {
    return insightTypeConfig_ == null
        ? com.google.cloud.recommender.v1beta1.InsightTypeConfig.getDefaultInstance()
        : insightTypeConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The InsightTypeConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.InsightTypeConfigOrBuilder
      getInsightTypeConfigOrBuilder() {
    return getInsightTypeConfig();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_;
  /**
   *
   *
   * <pre>
   * If true, validate the request and preview the change, but do not actually
   * update it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
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
    if (insightTypeConfig_ != null) {
      output.writeMessage(1, getInsightTypeConfig());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (insightTypeConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInsightTypeConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest other =
        (com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest) obj;

    if (hasInsightTypeConfig() != other.hasInsightTypeConfig()) return false;
    if (hasInsightTypeConfig()) {
      if (!getInsightTypeConfig().equals(other.getInsightTypeConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasInsightTypeConfig()) {
      hash = (37 * hash) + INSIGHT_TYPE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInsightTypeConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest parseFrom(
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
      com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest prototype) {
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
   * Request for the `UpdateInsightTypeConfig` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest)
      com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_UpdateInsightTypeConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_UpdateInsightTypeConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest.class,
              com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (insightTypeConfigBuilder_ == null) {
        insightTypeConfig_ = null;
      } else {
        insightTypeConfig_ = null;
        insightTypeConfigBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_UpdateInsightTypeConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest build() {
      com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest buildPartial() {
      com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest result =
          new com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest(this);
      if (insightTypeConfigBuilder_ == null) {
        result.insightTypeConfig_ = insightTypeConfig_;
      } else {
        result.insightTypeConfig_ = insightTypeConfigBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest) {
        return mergeFrom(
            (com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest other) {
      if (other
          == com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest
              .getDefaultInstance()) return this;
      if (other.hasInsightTypeConfig()) {
        mergeInsightTypeConfig(other.getInsightTypeConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(
                    getInsightTypeConfigFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();

                break;
              } // case 24
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

    private com.google.cloud.recommender.v1beta1.InsightTypeConfig insightTypeConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.recommender.v1beta1.InsightTypeConfig,
            com.google.cloud.recommender.v1beta1.InsightTypeConfig.Builder,
            com.google.cloud.recommender.v1beta1.InsightTypeConfigOrBuilder>
        insightTypeConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the insightTypeConfig field is set.
     */
    public boolean hasInsightTypeConfig() {
      return insightTypeConfigBuilder_ != null || insightTypeConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The insightTypeConfig.
     */
    public com.google.cloud.recommender.v1beta1.InsightTypeConfig getInsightTypeConfig() {
      if (insightTypeConfigBuilder_ == null) {
        return insightTypeConfig_ == null
            ? com.google.cloud.recommender.v1beta1.InsightTypeConfig.getDefaultInstance()
            : insightTypeConfig_;
      } else {
        return insightTypeConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInsightTypeConfig(
        com.google.cloud.recommender.v1beta1.InsightTypeConfig value) {
      if (insightTypeConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        insightTypeConfig_ = value;
        onChanged();
      } else {
        insightTypeConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInsightTypeConfig(
        com.google.cloud.recommender.v1beta1.InsightTypeConfig.Builder builderForValue) {
      if (insightTypeConfigBuilder_ == null) {
        insightTypeConfig_ = builderForValue.build();
        onChanged();
      } else {
        insightTypeConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeInsightTypeConfig(
        com.google.cloud.recommender.v1beta1.InsightTypeConfig value) {
      if (insightTypeConfigBuilder_ == null) {
        if (insightTypeConfig_ != null) {
          insightTypeConfig_ =
              com.google.cloud.recommender.v1beta1.InsightTypeConfig.newBuilder(insightTypeConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          insightTypeConfig_ = value;
        }
        onChanged();
      } else {
        insightTypeConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearInsightTypeConfig() {
      if (insightTypeConfigBuilder_ == null) {
        insightTypeConfig_ = null;
        onChanged();
      } else {
        insightTypeConfig_ = null;
        insightTypeConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.recommender.v1beta1.InsightTypeConfig.Builder
        getInsightTypeConfigBuilder() {

      onChanged();
      return getInsightTypeConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.recommender.v1beta1.InsightTypeConfigOrBuilder
        getInsightTypeConfigOrBuilder() {
      if (insightTypeConfigBuilder_ != null) {
        return insightTypeConfigBuilder_.getMessageOrBuilder();
      } else {
        return insightTypeConfig_ == null
            ? com.google.cloud.recommender.v1beta1.InsightTypeConfig.getDefaultInstance()
            : insightTypeConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The InsightTypeConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1beta1.InsightTypeConfig insight_type_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.recommender.v1beta1.InsightTypeConfig,
            com.google.cloud.recommender.v1beta1.InsightTypeConfig.Builder,
            com.google.cloud.recommender.v1beta1.InsightTypeConfigOrBuilder>
        getInsightTypeConfigFieldBuilder() {
      if (insightTypeConfigBuilder_ == null) {
        insightTypeConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.recommender.v1beta1.InsightTypeConfig,
                com.google.cloud.recommender.v1beta1.InsightTypeConfig.Builder,
                com.google.cloud.recommender.v1beta1.InsightTypeConfigOrBuilder>(
                getInsightTypeConfig(), getParentForChildren(), isClean());
        insightTypeConfig_ = null;
      }
      return insightTypeConfigBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * If true, validate the request and preview the change, but do not actually
     * update it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
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
     * If true, validate the request and preview the change, but do not actually
     * update it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, validate the request and preview the change, but do not actually
     * update it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {

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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest)
  private static final com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest();
  }

  public static com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateInsightTypeConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateInsightTypeConfigRequest>() {
        @java.lang.Override
        public UpdateInsightTypeConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateInsightTypeConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateInsightTypeConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.UpdateInsightTypeConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
