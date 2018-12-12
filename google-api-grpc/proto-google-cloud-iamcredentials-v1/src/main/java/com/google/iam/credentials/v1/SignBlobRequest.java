// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.iam.credentials.v1;

/**
 * Protobuf type {@code google.iam.credentials.v1.SignBlobRequest}
 */
public  final class SignBlobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.credentials.v1.SignBlobRequest)
    SignBlobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignBlobRequest.newBuilder() to construct.
  private SignBlobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignBlobRequest() {
    name_ = "";
    delegates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SignBlobRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              delegates_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            delegates_.add(s);
            break;
          }
          case 42: {

            payload_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        delegates_ = delegates_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.iam.credentials.v1.IAMCredentialsCommonProto.internal_static_google_iam_credentials_v1_SignBlobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.credentials.v1.IAMCredentialsCommonProto.internal_static_google_iam_credentials_v1_SignBlobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.credentials.v1.SignBlobRequest.class, com.google.iam.credentials.v1.SignBlobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELEGATES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList delegates_;
  /**
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getDelegatesList() {
    return delegates_;
  }
  /**
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   */
  public int getDelegatesCount() {
    return delegates_.size();
  }
  /**
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   */
  public java.lang.String getDelegates(int index) {
    return delegates_.get(index);
  }
  /**
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDelegatesBytes(int index) {
    return delegates_.getByteString(index);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString payload_;
  /**
   * <pre>
   * The bytes to sign.
   * </pre>
   *
   * <code>bytes payload = 5;</code>
   */
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < delegates_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, delegates_.getRaw(i));
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(5, payload_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < delegates_.size(); i++) {
        dataSize += computeStringSizeNoTag(delegates_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDelegatesList().size();
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, payload_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.iam.credentials.v1.SignBlobRequest)) {
      return super.equals(obj);
    }
    com.google.iam.credentials.v1.SignBlobRequest other = (com.google.iam.credentials.v1.SignBlobRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getDelegatesList()
        .equals(other.getDelegatesList());
    result = result && getPayload()
        .equals(other.getPayload());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getDelegatesCount() > 0) {
      hash = (37 * hash) + DELEGATES_FIELD_NUMBER;
      hash = (53 * hash) + getDelegatesList().hashCode();
    }
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.credentials.v1.SignBlobRequest parseFrom(
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
  public static Builder newBuilder(com.google.iam.credentials.v1.SignBlobRequest prototype) {
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
   * Protobuf type {@code google.iam.credentials.v1.SignBlobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.credentials.v1.SignBlobRequest)
      com.google.iam.credentials.v1.SignBlobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.credentials.v1.IAMCredentialsCommonProto.internal_static_google_iam_credentials_v1_SignBlobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.credentials.v1.IAMCredentialsCommonProto.internal_static_google_iam_credentials_v1_SignBlobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.credentials.v1.SignBlobRequest.class, com.google.iam.credentials.v1.SignBlobRequest.Builder.class);
    }

    // Construct using com.google.iam.credentials.v1.SignBlobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      delegates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      payload_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.credentials.v1.IAMCredentialsCommonProto.internal_static_google_iam_credentials_v1_SignBlobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.credentials.v1.SignBlobRequest getDefaultInstanceForType() {
      return com.google.iam.credentials.v1.SignBlobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.credentials.v1.SignBlobRequest build() {
      com.google.iam.credentials.v1.SignBlobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.credentials.v1.SignBlobRequest buildPartial() {
      com.google.iam.credentials.v1.SignBlobRequest result = new com.google.iam.credentials.v1.SignBlobRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        delegates_ = delegates_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.delegates_ = delegates_;
      result.payload_ = payload_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.iam.credentials.v1.SignBlobRequest) {
        return mergeFrom((com.google.iam.credentials.v1.SignBlobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.credentials.v1.SignBlobRequest other) {
      if (other == com.google.iam.credentials.v1.SignBlobRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.delegates_.isEmpty()) {
        if (delegates_.isEmpty()) {
          delegates_ = other.delegates_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDelegatesIsMutable();
          delegates_.addAll(other.delegates_);
        }
        onChanged();
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.iam.credentials.v1.SignBlobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.credentials.v1.SignBlobRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The resource name of the service account for which the credentials
     * are requested, in the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the service account for which the credentials
     * are requested, in the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the service account for which the credentials
     * are requested, in the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the service account for which the credentials
     * are requested, in the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the service account for which the credentials
     * are requested, in the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList delegates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDelegatesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        delegates_ = new com.google.protobuf.LazyStringArrayList(delegates_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getDelegatesList() {
      return delegates_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public int getDelegatesCount() {
      return delegates_.size();
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public java.lang.String getDelegates(int index) {
      return delegates_.get(index);
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDelegatesBytes(int index) {
      return delegates_.getByteString(index);
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public Builder setDelegates(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDelegatesIsMutable();
      delegates_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public Builder addDelegates(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDelegatesIsMutable();
      delegates_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public Builder addAllDelegates(
        java.lang.Iterable<java.lang.String> values) {
      ensureDelegatesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, delegates_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public Builder clearDelegates() {
      delegates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sequence of service accounts in a delegation chain. Each service
     * account must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on its next service account in the chain. The last service account in the
     * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
     * on the service account that is specified in the `name` field of the
     * request.
     * The delegates must have the following format:
     * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
     * </pre>
     *
     * <code>repeated string delegates = 3;</code>
     */
    public Builder addDelegatesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDelegatesIsMutable();
      delegates_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The bytes to sign.
     * </pre>
     *
     * <code>bytes payload = 5;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <pre>
     * The bytes to sign.
     * </pre>
     *
     * <code>bytes payload = 5;</code>
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The bytes to sign.
     * </pre>
     *
     * <code>bytes payload = 5;</code>
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.iam.credentials.v1.SignBlobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.credentials.v1.SignBlobRequest)
  private static final com.google.iam.credentials.v1.SignBlobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.credentials.v1.SignBlobRequest();
  }

  public static com.google.iam.credentials.v1.SignBlobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignBlobRequest>
      PARSER = new com.google.protobuf.AbstractParser<SignBlobRequest>() {
    @java.lang.Override
    public SignBlobRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SignBlobRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SignBlobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignBlobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.credentials.v1.SignBlobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

