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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for CreateCustomMetric RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateCustomMetricRequest}
 */
public final class CreateCustomMetricRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateCustomMetricRequest)
    CreateCustomMetricRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCustomMetricRequest.newBuilder() to construct.
  private CreateCustomMetricRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCustomMetricRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCustomMetricRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateCustomMetricRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateCustomMetricRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateCustomMetricRequest.class,
            com.google.analytics.admin.v1alpha.CreateCustomMetricRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOM_METRIC_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.CustomMetric customMetric_;
  /**
   *
   *
   * <pre>
   * Required. The CustomMetric to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the customMetric field is set.
   */
  @java.lang.Override
  public boolean hasCustomMetric() {
    return customMetric_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The CustomMetric to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The customMetric.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CustomMetric getCustomMetric() {
    return customMetric_ == null
        ? com.google.analytics.admin.v1alpha.CustomMetric.getDefaultInstance()
        : customMetric_;
  }
  /**
   *
   *
   * <pre>
   * Required. The CustomMetric to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CustomMetricOrBuilder getCustomMetricOrBuilder() {
    return getCustomMetric();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (customMetric_ != null) {
      output.writeMessage(2, getCustomMetric());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (customMetric_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCustomMetric());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateCustomMetricRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateCustomMetricRequest other =
        (com.google.analytics.admin.v1alpha.CreateCustomMetricRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasCustomMetric() != other.hasCustomMetric()) return false;
    if (hasCustomMetric()) {
      if (!getCustomMetric().equals(other.getCustomMetric())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasCustomMetric()) {
      hash = (37 * hash) + CUSTOM_METRIC_FIELD_NUMBER;
      hash = (53 * hash) + getCustomMetric().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.CreateCustomMetricRequest prototype) {
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
   * Request message for CreateCustomMetric RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateCustomMetricRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateCustomMetricRequest)
      com.google.analytics.admin.v1alpha.CreateCustomMetricRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateCustomMetricRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateCustomMetricRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateCustomMetricRequest.class,
              com.google.analytics.admin.v1alpha.CreateCustomMetricRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateCustomMetricRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (customMetricBuilder_ == null) {
        customMetric_ = null;
      } else {
        customMetric_ = null;
        customMetricBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateCustomMetricRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateCustomMetricRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateCustomMetricRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateCustomMetricRequest build() {
      com.google.analytics.admin.v1alpha.CreateCustomMetricRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateCustomMetricRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateCustomMetricRequest result =
          new com.google.analytics.admin.v1alpha.CreateCustomMetricRequest(this);
      result.parent_ = parent_;
      if (customMetricBuilder_ == null) {
        result.customMetric_ = customMetric_;
      } else {
        result.customMetric_ = customMetricBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateCustomMetricRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateCustomMetricRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.CreateCustomMetricRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.CreateCustomMetricRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasCustomMetric()) {
        mergeCustomMetric(other.getCustomMetric());
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
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getCustomMetricFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.CustomMetric customMetric_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.CustomMetric,
            com.google.analytics.admin.v1alpha.CustomMetric.Builder,
            com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>
        customMetricBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the customMetric field is set.
     */
    public boolean hasCustomMetric() {
      return customMetricBuilder_ != null || customMetric_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The customMetric.
     */
    public com.google.analytics.admin.v1alpha.CustomMetric getCustomMetric() {
      if (customMetricBuilder_ == null) {
        return customMetric_ == null
            ? com.google.analytics.admin.v1alpha.CustomMetric.getDefaultInstance()
            : customMetric_;
      } else {
        return customMetricBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCustomMetric(com.google.analytics.admin.v1alpha.CustomMetric value) {
      if (customMetricBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customMetric_ = value;
        onChanged();
      } else {
        customMetricBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCustomMetric(
        com.google.analytics.admin.v1alpha.CustomMetric.Builder builderForValue) {
      if (customMetricBuilder_ == null) {
        customMetric_ = builderForValue.build();
        onChanged();
      } else {
        customMetricBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCustomMetric(com.google.analytics.admin.v1alpha.CustomMetric value) {
      if (customMetricBuilder_ == null) {
        if (customMetric_ != null) {
          customMetric_ =
              com.google.analytics.admin.v1alpha.CustomMetric.newBuilder(customMetric_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          customMetric_ = value;
        }
        onChanged();
      } else {
        customMetricBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCustomMetric() {
      if (customMetricBuilder_ == null) {
        customMetric_ = null;
        onChanged();
      } else {
        customMetric_ = null;
        customMetricBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetric.Builder getCustomMetricBuilder() {

      onChanged();
      return getCustomMetricFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetricOrBuilder getCustomMetricOrBuilder() {
      if (customMetricBuilder_ != null) {
        return customMetricBuilder_.getMessageOrBuilder();
      } else {
        return customMetric_ == null
            ? com.google.analytics.admin.v1alpha.CustomMetric.getDefaultInstance()
            : customMetric_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomMetric to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.CustomMetric,
            com.google.analytics.admin.v1alpha.CustomMetric.Builder,
            com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>
        getCustomMetricFieldBuilder() {
      if (customMetricBuilder_ == null) {
        customMetricBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.CustomMetric,
                com.google.analytics.admin.v1alpha.CustomMetric.Builder,
                com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>(
                getCustomMetric(), getParentForChildren(), isClean());
        customMetric_ = null;
      }
      return customMetricBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateCustomMetricRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateCustomMetricRequest)
  private static final com.google.analytics.admin.v1alpha.CreateCustomMetricRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateCustomMetricRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomMetricRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomMetricRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCustomMetricRequest>() {
        @java.lang.Override
        public CreateCustomMetricRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomMetricRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomMetricRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateCustomMetricRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
