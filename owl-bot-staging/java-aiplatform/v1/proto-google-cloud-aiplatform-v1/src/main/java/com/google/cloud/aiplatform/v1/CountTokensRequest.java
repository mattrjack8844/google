// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for [PredictionService.CountTokens][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CountTokensRequest}
 */
public final class CountTokensRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CountTokensRequest)
    CountTokensRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CountTokensRequest.newBuilder() to construct.
  private CountTokensRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CountTokensRequest() {
    endpoint_ = "";
    instances_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CountTokensRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.PredictionServiceProto.internal_static_google_cloud_aiplatform_v1_CountTokensRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.PredictionServiceProto.internal_static_google_cloud_aiplatform_v1_CountTokensRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CountTokensRequest.class, com.google.cloud.aiplatform.v1.CountTokensRequest.Builder.class);
  }

  public static final int ENDPOINT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object endpoint_ = "";
  /**
   * <pre>
   * Required. The name of the Endpoint requested to perform token counting.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The endpoint.
   */
  @java.lang.Override
  public java.lang.String getEndpoint() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpoint_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the Endpoint requested to perform token counting.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for endpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndpointBytes() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Value> instances_;
  /**
   * <pre>
   * Required. The instances that are the input to token counting call.
   * Schema is identical to the prediction schema of the underlying model.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Value> getInstancesList() {
    return instances_;
  }
  /**
   * <pre>
   * Required. The instances that are the input to token counting call.
   * Schema is identical to the prediction schema of the underlying model.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.ValueOrBuilder> 
      getInstancesOrBuilderList() {
    return instances_;
  }
  /**
   * <pre>
   * Required. The instances that are the input to token counting call.
   * Schema is identical to the prediction schema of the underlying model.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getInstancesCount() {
    return instances_.size();
  }
  /**
   * <pre>
   * Required. The instances that are the input to token counting call.
   * Schema is identical to the prediction schema of the underlying model.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Value getInstances(int index) {
    return instances_.get(index);
  }
  /**
   * <pre>
   * Required. The instances that are the input to token counting call.
   * Schema is identical to the prediction schema of the underlying model.
   * </pre>
   *
   * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ValueOrBuilder getInstancesOrBuilder(
      int index) {
    return instances_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, endpoint_);
    }
    for (int i = 0; i < instances_.size(); i++) {
      output.writeMessage(2, instances_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, endpoint_);
    }
    for (int i = 0; i < instances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, instances_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CountTokensRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CountTokensRequest other = (com.google.cloud.aiplatform.v1.CountTokensRequest) obj;

    if (!getEndpoint()
        .equals(other.getEndpoint())) return false;
    if (!getInstancesList()
        .equals(other.getInstancesList())) return false;
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
    hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getEndpoint().hashCode();
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CountTokensRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CountTokensRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for [PredictionService.CountTokens][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CountTokensRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CountTokensRequest)
      com.google.cloud.aiplatform.v1.CountTokensRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto.internal_static_google_cloud_aiplatform_v1_CountTokensRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto.internal_static_google_cloud_aiplatform_v1_CountTokensRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CountTokensRequest.class, com.google.cloud.aiplatform.v1.CountTokensRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CountTokensRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      endpoint_ = "";
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
      } else {
        instances_ = null;
        instancesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto.internal_static_google_cloud_aiplatform_v1_CountTokensRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CountTokensRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CountTokensRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CountTokensRequest build() {
      com.google.cloud.aiplatform.v1.CountTokensRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CountTokensRequest buildPartial() {
      com.google.cloud.aiplatform.v1.CountTokensRequest result = new com.google.cloud.aiplatform.v1.CountTokensRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1.CountTokensRequest result) {
      if (instancesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          instances_ = java.util.Collections.unmodifiableList(instances_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.instances_ = instances_;
      } else {
        result.instances_ = instancesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.CountTokensRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endpoint_ = endpoint_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1.CountTokensRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CountTokensRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CountTokensRequest other) {
      if (other == com.google.cloud.aiplatform.v1.CountTokensRequest.getDefaultInstance()) return this;
      if (!other.getEndpoint().isEmpty()) {
        endpoint_ = other.endpoint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (instancesBuilder_ == null) {
        if (!other.instances_.isEmpty()) {
          if (instances_.isEmpty()) {
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureInstancesIsMutable();
            instances_.addAll(other.instances_);
          }
          onChanged();
        }
      } else {
        if (!other.instances_.isEmpty()) {
          if (instancesBuilder_.isEmpty()) {
            instancesBuilder_.dispose();
            instancesBuilder_ = null;
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000002);
            instancesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInstancesFieldBuilder() : null;
          } else {
            instancesBuilder_.addAllMessages(other.instances_);
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
            case 10: {
              endpoint_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.Value m =
                  input.readMessage(
                      com.google.protobuf.Value.parser(),
                      extensionRegistry);
              if (instancesBuilder_ == null) {
                ensureInstancesIsMutable();
                instances_.add(m);
              } else {
                instancesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
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

    private java.lang.Object endpoint_ = "";
    /**
     * <pre>
     * Required. The name of the Endpoint requested to perform token counting.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The endpoint.
     */
    public java.lang.String getEndpoint() {
      java.lang.Object ref = endpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Endpoint requested to perform token counting.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for endpoint.
     */
    public com.google.protobuf.ByteString
        getEndpointBytes() {
      java.lang.Object ref = endpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Endpoint requested to perform token counting.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpoint(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Endpoint requested to perform token counting.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearEndpoint() {
      endpoint_ = getDefaultInstance().getEndpoint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Endpoint requested to perform token counting.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.Value> instances_ =
      java.util.Collections.emptyList();
    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        instances_ = new java.util.ArrayList<com.google.protobuf.Value>(instances_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> instancesBuilder_;

    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.protobuf.Value> getInstancesList() {
      if (instancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instances_);
      } else {
        return instancesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getInstancesCount() {
      if (instancesBuilder_ == null) {
        return instances_.size();
      } else {
        return instancesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.Value getInstances(int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);
      } else {
        return instancesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInstances(
        int index, com.google.protobuf.Value value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.set(index, value);
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInstances(
        int index, com.google.protobuf.Value.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.set(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addInstances(com.google.protobuf.Value value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addInstances(
        int index, com.google.protobuf.Value value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(index, value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addInstances(
        com.google.protobuf.Value.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addInstances(
        int index, com.google.protobuf.Value.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllInstances(
        java.lang.Iterable<? extends com.google.protobuf.Value> values) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, instances_);
        onChanged();
      } else {
        instancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearInstances() {
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        instancesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeInstances(int index) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.remove(index);
        onChanged();
      } else {
        instancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.Value.Builder getInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ValueOrBuilder getInstancesOrBuilder(
        int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);  } else {
        return instancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.protobuf.ValueOrBuilder> 
         getInstancesOrBuilderList() {
      if (instancesBuilder_ != null) {
        return instancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instances_);
      }
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.Value.Builder addInstancesBuilder() {
      return getInstancesFieldBuilder().addBuilder(
          com.google.protobuf.Value.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.Value.Builder addInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().addBuilder(
          index, com.google.protobuf.Value.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The instances that are the input to token counting call.
     * Schema is identical to the prediction schema of the underlying model.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.protobuf.Value.Builder> 
         getInstancesBuilderList() {
      return getInstancesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> 
        getInstancesFieldBuilder() {
      if (instancesBuilder_ == null) {
        instancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder>(
                instances_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        instances_ = null;
      }
      return instancesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CountTokensRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CountTokensRequest)
  private static final com.google.cloud.aiplatform.v1.CountTokensRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CountTokensRequest();
  }

  public static com.google.cloud.aiplatform.v1.CountTokensRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CountTokensRequest>
      PARSER = new com.google.protobuf.AbstractParser<CountTokensRequest>() {
    @java.lang.Override
    public CountTokensRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CountTokensRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CountTokensRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CountTokensRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

