// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 * <pre>
 * SSH configuration for AWS resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsSshConfig}
 */
public final class AwsSshConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AwsSshConfig)
    AwsSshConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AwsSshConfig.newBuilder() to construct.
  private AwsSshConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AwsSshConfig() {
    ec2KeyPair_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AwsSshConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsSshConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsSshConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AwsSshConfig.class, com.google.cloud.gkemulticloud.v1.AwsSshConfig.Builder.class);
  }

  public static final int EC2_KEY_PAIR_FIELD_NUMBER = 1;
  private volatile java.lang.Object ec2KeyPair_;
  /**
   * <pre>
   * Required. The name of the EC2 key pair used to login into cluster machines.
   * </pre>
   *
   * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The ec2KeyPair.
   */
  @java.lang.Override
  public java.lang.String getEc2KeyPair() {
    java.lang.Object ref = ec2KeyPair_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ec2KeyPair_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the EC2 key pair used to login into cluster machines.
   * </pre>
   *
   * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for ec2KeyPair.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEc2KeyPairBytes() {
    java.lang.Object ref = ec2KeyPair_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ec2KeyPair_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ec2KeyPair_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ec2KeyPair_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ec2KeyPair_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ec2KeyPair_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AwsSshConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AwsSshConfig other = (com.google.cloud.gkemulticloud.v1.AwsSshConfig) obj;

    if (!getEc2KeyPair()
        .equals(other.getEc2KeyPair())) return false;
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
    hash = (37 * hash) + EC2_KEY_PAIR_FIELD_NUMBER;
    hash = (53 * hash) + getEc2KeyPair().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.AwsSshConfig prototype) {
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
   * SSH configuration for AWS resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsSshConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AwsSshConfig)
      com.google.cloud.gkemulticloud.v1.AwsSshConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsSshConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsSshConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AwsSshConfig.class, com.google.cloud.gkemulticloud.v1.AwsSshConfig.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AwsSshConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ec2KeyPair_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsSshConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsSshConfig getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AwsSshConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsSshConfig build() {
      com.google.cloud.gkemulticloud.v1.AwsSshConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsSshConfig buildPartial() {
      com.google.cloud.gkemulticloud.v1.AwsSshConfig result = new com.google.cloud.gkemulticloud.v1.AwsSshConfig(this);
      result.ec2KeyPair_ = ec2KeyPair_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AwsSshConfig) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AwsSshConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AwsSshConfig other) {
      if (other == com.google.cloud.gkemulticloud.v1.AwsSshConfig.getDefaultInstance()) return this;
      if (!other.getEc2KeyPair().isEmpty()) {
        ec2KeyPair_ = other.ec2KeyPair_;
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
            case 10: {
              ec2KeyPair_ = input.readStringRequireUtf8();

              break;
            } // case 10
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

    private java.lang.Object ec2KeyPair_ = "";
    /**
     * <pre>
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * </pre>
     *
     * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The ec2KeyPair.
     */
    public java.lang.String getEc2KeyPair() {
      java.lang.Object ref = ec2KeyPair_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ec2KeyPair_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * </pre>
     *
     * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for ec2KeyPair.
     */
    public com.google.protobuf.ByteString
        getEc2KeyPairBytes() {
      java.lang.Object ref = ec2KeyPair_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ec2KeyPair_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * </pre>
     *
     * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The ec2KeyPair to set.
     * @return This builder for chaining.
     */
    public Builder setEc2KeyPair(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ec2KeyPair_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * </pre>
     *
     * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearEc2KeyPair() {
      
      ec2KeyPair_ = getDefaultInstance().getEc2KeyPair();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * </pre>
     *
     * <code>string ec2_key_pair = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for ec2KeyPair to set.
     * @return This builder for chaining.
     */
    public Builder setEc2KeyPairBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ec2KeyPair_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AwsSshConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AwsSshConfig)
  private static final com.google.cloud.gkemulticloud.v1.AwsSshConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AwsSshConfig();
  }

  public static com.google.cloud.gkemulticloud.v1.AwsSshConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsSshConfig>
      PARSER = new com.google.protobuf.AbstractParser<AwsSshConfig>() {
    @java.lang.Override
    public AwsSshConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AwsSshConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsSshConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsSshConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

