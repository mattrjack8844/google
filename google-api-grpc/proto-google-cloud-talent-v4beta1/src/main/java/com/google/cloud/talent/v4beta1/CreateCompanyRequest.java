// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company_service.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * The Request of the CreateCompany method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.CreateCompanyRequest}
 */
public final class CreateCompanyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.CreateCompanyRequest)
    CreateCompanyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCompanyRequest.newBuilder() to construct.
  private CreateCompanyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCompanyRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateCompanyRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.talent.v4beta1.Company.Builder subBuilder = null;
              if (company_ != null) {
                subBuilder = company_.toBuilder();
              }
              company_ =
                  input.readMessage(
                      com.google.cloud.talent.v4beta1.Company.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(company_);
                company_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.CompanyServiceProto
        .internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.CompanyServiceProto
        .internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.CreateCompanyRequest.class,
            com.google.cloud.talent.v4beta1.CreateCompanyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required.
   * Resource name of the tenant under which the company is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/api-test-project/tenant/foo".
   * Tenant id is optional and a default tenant is created if unspecified, for
   * example, "projects/api-test-project".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
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
   * Required.
   * Resource name of the tenant under which the company is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/api-test-project/tenant/foo".
   * Tenant id is optional and a default tenant is created if unspecified, for
   * example, "projects/api-test-project".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
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

  public static final int COMPANY_FIELD_NUMBER = 2;
  private com.google.cloud.talent.v4beta1.Company company_;
  /**
   *
   *
   * <pre>
   * Required.
   * The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
   */
  public boolean hasCompany() {
    return company_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
   */
  public com.google.cloud.talent.v4beta1.Company getCompany() {
    return company_ == null
        ? com.google.cloud.talent.v4beta1.Company.getDefaultInstance()
        : company_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
   */
  public com.google.cloud.talent.v4beta1.CompanyOrBuilder getCompanyOrBuilder() {
    return getCompany();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (company_ != null) {
      output.writeMessage(2, getCompany());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (company_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCompany());
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.CreateCompanyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.CreateCompanyRequest other =
        (com.google.cloud.talent.v4beta1.CreateCompanyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasCompany() != other.hasCompany()) return false;
    if (hasCompany()) {
      if (!getCompany().equals(other.getCompany())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (hasCompany()) {
      hash = (37 * hash) + COMPANY_FIELD_NUMBER;
      hash = (53 * hash) + getCompany().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.CreateCompanyRequest prototype) {
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
   * The Request of the CreateCompany method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.CreateCompanyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.CreateCompanyRequest)
      com.google.cloud.talent.v4beta1.CreateCompanyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.CompanyServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.CompanyServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.CreateCompanyRequest.class,
              com.google.cloud.talent.v4beta1.CreateCompanyRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.CreateCompanyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (companyBuilder_ == null) {
        company_ = null;
      } else {
        company_ = null;
        companyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.CompanyServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateCompanyRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.CreateCompanyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateCompanyRequest build() {
      com.google.cloud.talent.v4beta1.CreateCompanyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateCompanyRequest buildPartial() {
      com.google.cloud.talent.v4beta1.CreateCompanyRequest result =
          new com.google.cloud.talent.v4beta1.CreateCompanyRequest(this);
      result.parent_ = parent_;
      if (companyBuilder_ == null) {
        result.company_ = company_;
      } else {
        result.company_ = companyBuilder_.build();
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
      if (other instanceof com.google.cloud.talent.v4beta1.CreateCompanyRequest) {
        return mergeFrom((com.google.cloud.talent.v4beta1.CreateCompanyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.CreateCompanyRequest other) {
      if (other == com.google.cloud.talent.v4beta1.CreateCompanyRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasCompany()) {
        mergeCompany(other.getCompany());
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
      com.google.cloud.talent.v4beta1.CreateCompanyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.CreateCompanyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required.
     * Resource name of the tenant under which the company is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/api-test-project/tenant/foo".
     * Tenant id is optional and a default tenant is created if unspecified, for
     * example, "projects/api-test-project".
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Required.
     * Resource name of the tenant under which the company is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/api-test-project/tenant/foo".
     * Tenant id is optional and a default tenant is created if unspecified, for
     * example, "projects/api-test-project".
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Required.
     * Resource name of the tenant under which the company is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/api-test-project/tenant/foo".
     * Tenant id is optional and a default tenant is created if unspecified, for
     * example, "projects/api-test-project".
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Required.
     * Resource name of the tenant under which the company is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/api-test-project/tenant/foo".
     * Tenant id is optional and a default tenant is created if unspecified, for
     * example, "projects/api-test-project".
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Required.
     * Resource name of the tenant under which the company is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/api-test-project/tenant/foo".
     * Tenant id is optional and a default tenant is created if unspecified, for
     * example, "projects/api-test-project".
     * </pre>
     *
     * <code>string parent = 1;</code>
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

    private com.google.cloud.talent.v4beta1.Company company_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Company,
            com.google.cloud.talent.v4beta1.Company.Builder,
            com.google.cloud.talent.v4beta1.CompanyOrBuilder>
        companyBuilder_;
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    public boolean hasCompany() {
      return companyBuilder_ != null || company_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    public com.google.cloud.talent.v4beta1.Company getCompany() {
      if (companyBuilder_ == null) {
        return company_ == null
            ? com.google.cloud.talent.v4beta1.Company.getDefaultInstance()
            : company_;
      } else {
        return companyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    public Builder setCompany(com.google.cloud.talent.v4beta1.Company value) {
      if (companyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        company_ = value;
        onChanged();
      } else {
        companyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    public Builder setCompany(com.google.cloud.talent.v4beta1.Company.Builder builderForValue) {
      if (companyBuilder_ == null) {
        company_ = builderForValue.build();
        onChanged();
      } else {
        companyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    public Builder mergeCompany(com.google.cloud.talent.v4beta1.Company value) {
      if (companyBuilder_ == null) {
        if (company_ != null) {
          company_ =
              com.google.cloud.talent.v4beta1.Company.newBuilder(company_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          company_ = value;
        }
        onChanged();
      } else {
        companyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    public Builder clearCompany() {
      if (companyBuilder_ == null) {
        company_ = null;
        onChanged();
      } else {
        company_ = null;
        companyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    public com.google.cloud.talent.v4beta1.Company.Builder getCompanyBuilder() {

      onChanged();
      return getCompanyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    public com.google.cloud.talent.v4beta1.CompanyOrBuilder getCompanyOrBuilder() {
      if (companyBuilder_ != null) {
        return companyBuilder_.getMessageOrBuilder();
      } else {
        return company_ == null
            ? com.google.cloud.talent.v4beta1.Company.getDefaultInstance()
            : company_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Company,
            com.google.cloud.talent.v4beta1.Company.Builder,
            com.google.cloud.talent.v4beta1.CompanyOrBuilder>
        getCompanyFieldBuilder() {
      if (companyBuilder_ == null) {
        companyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.talent.v4beta1.Company,
                com.google.cloud.talent.v4beta1.Company.Builder,
                com.google.cloud.talent.v4beta1.CompanyOrBuilder>(
                getCompany(), getParentForChildren(), isClean());
        company_ = null;
      }
      return companyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.CreateCompanyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.CreateCompanyRequest)
  private static final com.google.cloud.talent.v4beta1.CreateCompanyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.CreateCompanyRequest();
  }

  public static com.google.cloud.talent.v4beta1.CreateCompanyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCompanyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCompanyRequest>() {
        @java.lang.Override
        public CreateCompanyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateCompanyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateCompanyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCompanyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.CreateCompanyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
