// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/memcache/v1beta2/cloud_memcache.proto

package com.google.cloud.memcache.v1beta2;

/**
 * <pre>
 * Request for [CreateInstance][google.cloud.memcache.v1beta2.CloudMemcache.CreateInstance].
 * </pre>
 *
 * Protobuf type {@code google.cloud.memcache.v1beta2.CreateInstanceRequest}
 */
public final class CreateInstanceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.memcache.v1beta2.CreateInstanceRequest)
    CreateInstanceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateInstanceRequest.newBuilder() to construct.
  private CreateInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateInstanceRequest() {
    parent_ = "";
    instanceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateInstanceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.memcache.v1beta2.CloudMemcacheProto.internal_static_google_cloud_memcache_v1beta2_CreateInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.memcache.v1beta2.CloudMemcacheProto.internal_static_google_cloud_memcache_v1beta2_CreateInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.memcache.v1beta2.CreateInstanceRequest.class, com.google.cloud.memcache.v1beta2.CreateInstanceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}`
   * where `location_id` refers to a GCP region
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}`
   * where `location_id` refers to a GCP region
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object instanceId_;
  /**
   * <pre>
   * Required. The logical name of the Memcached instance in the user
   * project with the following restrictions:
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the user project / location.
   * If any of the above are not met, the API raises an invalid argument error.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceId.
   */
  @java.lang.Override
  public java.lang.String getInstanceId() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The logical name of the Memcached instance in the user
   * project with the following restrictions:
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the user project / location.
   * If any of the above are not met, the API raises an invalid argument error.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstanceIdBytes() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;
  private com.google.cloud.memcache.v1beta2.Instance resource_;
  /**
   * <pre>
   * Required. A Memcached [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <pre>
   * Required. A Memcached [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  @java.lang.Override
  public com.google.cloud.memcache.v1beta2.Instance getResource() {
    return resource_ == null ? com.google.cloud.memcache.v1beta2.Instance.getDefaultInstance() : resource_;
  }
  /**
   * <pre>
   * Required. A Memcached [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.memcache.v1beta2.InstanceOrBuilder getResourceOrBuilder() {
    return getResource();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instanceId_);
    }
    if (resource_ != null) {
      output.writeMessage(3, getResource());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instanceId_);
    }
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResource());
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
    if (!(obj instanceof com.google.cloud.memcache.v1beta2.CreateInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.memcache.v1beta2.CreateInstanceRequest other = (com.google.cloud.memcache.v1beta2.CreateInstanceRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getInstanceId()
        .equals(other.getInstanceId())) return false;
    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource()
          .equals(other.getResource())) return false;
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
    hash = (37 * hash) + INSTANCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceId().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.memcache.v1beta2.CreateInstanceRequest prototype) {
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
   * Request for [CreateInstance][google.cloud.memcache.v1beta2.CloudMemcache.CreateInstance].
   * </pre>
   *
   * Protobuf type {@code google.cloud.memcache.v1beta2.CreateInstanceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.memcache.v1beta2.CreateInstanceRequest)
      com.google.cloud.memcache.v1beta2.CreateInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto.internal_static_google_cloud_memcache_v1beta2_CreateInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto.internal_static_google_cloud_memcache_v1beta2_CreateInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.memcache.v1beta2.CreateInstanceRequest.class, com.google.cloud.memcache.v1beta2.CreateInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.memcache.v1beta2.CreateInstanceRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      instanceId_ = "";

      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto.internal_static_google_cloud_memcache_v1beta2_CreateInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.CreateInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.memcache.v1beta2.CreateInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.CreateInstanceRequest build() {
      com.google.cloud.memcache.v1beta2.CreateInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.CreateInstanceRequest buildPartial() {
      com.google.cloud.memcache.v1beta2.CreateInstanceRequest result = new com.google.cloud.memcache.v1beta2.CreateInstanceRequest(this);
      result.parent_ = parent_;
      result.instanceId_ = instanceId_;
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
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
      if (other instanceof com.google.cloud.memcache.v1beta2.CreateInstanceRequest) {
        return mergeFrom((com.google.cloud.memcache.v1beta2.CreateInstanceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.memcache.v1beta2.CreateInstanceRequest other) {
      if (other == com.google.cloud.memcache.v1beta2.CreateInstanceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getInstanceId().isEmpty()) {
        instanceId_ = other.instanceId_;
        onChanged();
      }
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              instanceId_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getResourceFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the instance location using the form:
     *     `projects/{project_id}/locations/{location_id}`
     * where `location_id` refers to a GCP region
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object instanceId_ = "";
    /**
     * <pre>
     * Required. The logical name of the Memcached instance in the user
     * project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the user project / location.
     * If any of the above are not met, the API raises an invalid argument error.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The instanceId.
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The logical name of the Memcached instance in the user
     * project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the user project / location.
     * If any of the above are not met, the API raises an invalid argument error.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for instanceId.
     */
    public com.google.protobuf.ByteString
        getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The logical name of the Memcached instance in the user
     * project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the user project / location.
     * If any of the above are not met, the API raises an invalid argument error.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The logical name of the Memcached instance in the user
     * project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the user project / location.
     * If any of the above are not met, the API raises an invalid argument error.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearInstanceId() {
      
      instanceId_ = getDefaultInstance().getInstanceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The logical name of the Memcached instance in the user
     * project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the user project / location.
     * If any of the above are not met, the API raises an invalid argument error.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.memcache.v1beta2.Instance resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.memcache.v1beta2.Instance, com.google.cloud.memcache.v1beta2.Instance.Builder, com.google.cloud.memcache.v1beta2.InstanceOrBuilder> resourceBuilder_;
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The resource.
     */
    public com.google.cloud.memcache.v1beta2.Instance getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.google.cloud.memcache.v1beta2.Instance.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setResource(com.google.cloud.memcache.v1beta2.Instance value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setResource(
        com.google.cloud.memcache.v1beta2.Instance.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeResource(com.google.cloud.memcache.v1beta2.Instance value) {
      if (resourceBuilder_ == null) {
        if (resource_ != null) {
          resource_ =
            com.google.cloud.memcache.v1beta2.Instance.newBuilder(resource_).mergeFrom(value).buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.memcache.v1beta2.Instance.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.memcache.v1beta2.InstanceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.google.cloud.memcache.v1beta2.Instance.getDefaultInstance() : resource_;
      }
    }
    /**
     * <pre>
     * Required. A Memcached [Instance] resource
     * </pre>
     *
     * <code>.google.cloud.memcache.v1beta2.Instance resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.memcache.v1beta2.Instance, com.google.cloud.memcache.v1beta2.Instance.Builder, com.google.cloud.memcache.v1beta2.InstanceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.memcache.v1beta2.Instance, com.google.cloud.memcache.v1beta2.Instance.Builder, com.google.cloud.memcache.v1beta2.InstanceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.memcache.v1beta2.CreateInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.memcache.v1beta2.CreateInstanceRequest)
  private static final com.google.cloud.memcache.v1beta2.CreateInstanceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.memcache.v1beta2.CreateInstanceRequest();
  }

  public static com.google.cloud.memcache.v1beta2.CreateInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateInstanceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateInstanceRequest>() {
    @java.lang.Override
    public CreateInstanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.memcache.v1beta2.CreateInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

