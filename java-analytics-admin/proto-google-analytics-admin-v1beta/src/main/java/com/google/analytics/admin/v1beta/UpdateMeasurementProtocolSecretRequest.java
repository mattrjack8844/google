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
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * Request message for UpdateMeasurementProtocolSecret RPC
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest}
 */
public final class UpdateMeasurementProtocolSecretRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest)
    UpdateMeasurementProtocolSecretRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateMeasurementProtocolSecretRequest.newBuilder() to construct.
  private UpdateMeasurementProtocolSecretRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateMeasurementProtocolSecretRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateMeasurementProtocolSecretRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1beta_UpdateMeasurementProtocolSecretRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1beta_UpdateMeasurementProtocolSecretRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest.class,
            com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest.Builder.class);
  }

  public static final int MEASUREMENT_PROTOCOL_SECRET_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1beta.MeasurementProtocolSecret measurementProtocolSecret_;
  /**
   *
   *
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the measurementProtocolSecret field is set.
   */
  @java.lang.Override
  public boolean hasMeasurementProtocolSecret() {
    return measurementProtocolSecret_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The measurementProtocolSecret.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.MeasurementProtocolSecret
      getMeasurementProtocolSecret() {
    return measurementProtocolSecret_ == null
        ? com.google.analytics.admin.v1beta.MeasurementProtocolSecret.getDefaultInstance()
        : measurementProtocolSecret_;
  }
  /**
   *
   *
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.MeasurementProtocolSecretOrBuilder
      getMeasurementProtocolSecretOrBuilder() {
    return getMeasurementProtocolSecret();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
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
   * The list of fields to be updated. Omitted fields will not be updated.
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
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (measurementProtocolSecret_ != null) {
      output.writeMessage(1, getMeasurementProtocolSecret());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (measurementProtocolSecret_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, getMeasurementProtocolSecret());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj
        instanceof com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest other =
        (com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest) obj;

    if (hasMeasurementProtocolSecret() != other.hasMeasurementProtocolSecret()) return false;
    if (hasMeasurementProtocolSecret()) {
      if (!getMeasurementProtocolSecret().equals(other.getMeasurementProtocolSecret()))
        return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasMeasurementProtocolSecret()) {
      hash = (37 * hash) + MEASUREMENT_PROTOCOL_SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getMeasurementProtocolSecret().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest parseFrom(
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
      com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest prototype) {
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
   * Request message for UpdateMeasurementProtocolSecret RPC
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest)
      com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_UpdateMeasurementProtocolSecretRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_UpdateMeasurementProtocolSecretRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest.class,
              com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (measurementProtocolSecretBuilder_ == null) {
        measurementProtocolSecret_ = null;
      } else {
        measurementProtocolSecret_ = null;
        measurementProtocolSecretBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_UpdateMeasurementProtocolSecretRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest build() {
      com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest buildPartial() {
      com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest result =
          new com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest(this);
      if (measurementProtocolSecretBuilder_ == null) {
        result.measurementProtocolSecret_ = measurementProtocolSecret_;
      } else {
        result.measurementProtocolSecret_ = measurementProtocolSecretBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other
          instanceof com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest) {
        return mergeFrom(
            (com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest other) {
      if (other
          == com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest
              .getDefaultInstance()) return this;
      if (other.hasMeasurementProtocolSecret()) {
        mergeMeasurementProtocolSecret(other.getMeasurementProtocolSecret());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                    getMeasurementProtocolSecretFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.analytics.admin.v1beta.MeasurementProtocolSecret measurementProtocolSecret_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1beta.MeasurementProtocolSecret,
            com.google.analytics.admin.v1beta.MeasurementProtocolSecret.Builder,
            com.google.analytics.admin.v1beta.MeasurementProtocolSecretOrBuilder>
        measurementProtocolSecretBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the measurementProtocolSecret field is set.
     */
    public boolean hasMeasurementProtocolSecret() {
      return measurementProtocolSecretBuilder_ != null || measurementProtocolSecret_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The measurementProtocolSecret.
     */
    public com.google.analytics.admin.v1beta.MeasurementProtocolSecret
        getMeasurementProtocolSecret() {
      if (measurementProtocolSecretBuilder_ == null) {
        return measurementProtocolSecret_ == null
            ? com.google.analytics.admin.v1beta.MeasurementProtocolSecret.getDefaultInstance()
            : measurementProtocolSecret_;
      } else {
        return measurementProtocolSecretBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMeasurementProtocolSecret(
        com.google.analytics.admin.v1beta.MeasurementProtocolSecret value) {
      if (measurementProtocolSecretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        measurementProtocolSecret_ = value;
        onChanged();
      } else {
        measurementProtocolSecretBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMeasurementProtocolSecret(
        com.google.analytics.admin.v1beta.MeasurementProtocolSecret.Builder builderForValue) {
      if (measurementProtocolSecretBuilder_ == null) {
        measurementProtocolSecret_ = builderForValue.build();
        onChanged();
      } else {
        measurementProtocolSecretBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMeasurementProtocolSecret(
        com.google.analytics.admin.v1beta.MeasurementProtocolSecret value) {
      if (measurementProtocolSecretBuilder_ == null) {
        if (measurementProtocolSecret_ != null) {
          measurementProtocolSecret_ =
              com.google.analytics.admin.v1beta.MeasurementProtocolSecret.newBuilder(
                      measurementProtocolSecret_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          measurementProtocolSecret_ = value;
        }
        onChanged();
      } else {
        measurementProtocolSecretBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMeasurementProtocolSecret() {
      if (measurementProtocolSecretBuilder_ == null) {
        measurementProtocolSecret_ = null;
        onChanged();
      } else {
        measurementProtocolSecret_ = null;
        measurementProtocolSecretBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1beta.MeasurementProtocolSecret.Builder
        getMeasurementProtocolSecretBuilder() {

      onChanged();
      return getMeasurementProtocolSecretFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1beta.MeasurementProtocolSecretOrBuilder
        getMeasurementProtocolSecretOrBuilder() {
      if (measurementProtocolSecretBuilder_ != null) {
        return measurementProtocolSecretBuilder_.getMessageOrBuilder();
      } else {
        return measurementProtocolSecret_ == null
            ? com.google.analytics.admin.v1beta.MeasurementProtocolSecret.getDefaultInstance()
            : measurementProtocolSecret_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement protocol secret to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1beta.MeasurementProtocolSecret,
            com.google.analytics.admin.v1beta.MeasurementProtocolSecret.Builder,
            com.google.analytics.admin.v1beta.MeasurementProtocolSecretOrBuilder>
        getMeasurementProtocolSecretFieldBuilder() {
      if (measurementProtocolSecretBuilder_ == null) {
        measurementProtocolSecretBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1beta.MeasurementProtocolSecret,
                com.google.analytics.admin.v1beta.MeasurementProtocolSecret.Builder,
                com.google.analytics.admin.v1beta.MeasurementProtocolSecretOrBuilder>(
                getMeasurementProtocolSecret(), getParentForChildren(), isClean());
        measurementProtocolSecret_ = null;
      }
      return measurementProtocolSecretBuilder_;
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
     * The list of fields to be updated. Omitted fields will not be updated.
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
     * The list of fields to be updated. Omitted fields will not be updated.
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
     * The list of fields to be updated. Omitted fields will not be updated.
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
     * The list of fields to be updated. Omitted fields will not be updated.
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
     * The list of fields to be updated. Omitted fields will not be updated.
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
     * The list of fields to be updated. Omitted fields will not be updated.
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
     * The list of fields to be updated. Omitted fields will not be updated.
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
     * The list of fields to be updated. Omitted fields will not be updated.
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
     * The list of fields to be updated. Omitted fields will not be updated.
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest)
  private static final com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest();
  }

  public static com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMeasurementProtocolSecretRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateMeasurementProtocolSecretRequest>() {
        @java.lang.Override
        public UpdateMeasurementProtocolSecretRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateMeasurementProtocolSecretRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMeasurementProtocolSecretRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
