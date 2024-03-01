// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/merchant/inventories/v1beta/regionalinventory.proto

// Protobuf Java Version: 3.25.2
package com.google.shopping.merchant.inventories.v1beta;

/**
 * <pre>
 * Request message for the `InsertRegionalInventory` method.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest}
 */
public final class InsertRegionalInventoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest)
    InsertRegionalInventoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InsertRegionalInventoryRequest.newBuilder() to construct.
  private InsertRegionalInventoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InsertRegionalInventoryRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InsertRegionalInventoryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.shopping.merchant.inventories.v1beta.RegionalInventoryProto.internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.inventories.v1beta.RegionalInventoryProto.internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest.class, com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The account and product where this inventory will be inserted.
   * Format: `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The account and product where this inventory will be inserted.
   * Format: `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int REGIONAL_INVENTORY_FIELD_NUMBER = 2;
  private com.google.shopping.merchant.inventories.v1beta.RegionalInventory regionalInventory_;
  /**
   * <pre>
   * Required. Regional inventory information to add to the product. If the
   * product already has a `RegionalInventory` resource for the same `region`,
   * full replacement of the `RegionalInventory` resource is performed.
   * </pre>
   *
   * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the regionalInventory field is set.
   */
  @java.lang.Override
  public boolean hasRegionalInventory() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. Regional inventory information to add to the product. If the
   * product already has a `RegionalInventory` resource for the same `region`,
   * full replacement of the `RegionalInventory` resource is performed.
   * </pre>
   *
   * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The regionalInventory.
   */
  @java.lang.Override
  public com.google.shopping.merchant.inventories.v1beta.RegionalInventory getRegionalInventory() {
    return regionalInventory_ == null ? com.google.shopping.merchant.inventories.v1beta.RegionalInventory.getDefaultInstance() : regionalInventory_;
  }
  /**
   * <pre>
   * Required. Regional inventory information to add to the product. If the
   * product already has a `RegionalInventory` resource for the same `region`,
   * full replacement of the `RegionalInventory` resource is performed.
   * </pre>
   *
   * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.inventories.v1beta.RegionalInventoryOrBuilder getRegionalInventoryOrBuilder() {
    return regionalInventory_ == null ? com.google.shopping.merchant.inventories.v1beta.RegionalInventory.getDefaultInstance() : regionalInventory_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getRegionalInventory());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRegionalInventory());
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
    if (!(obj instanceof com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest other = (com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasRegionalInventory() != other.hasRegionalInventory()) return false;
    if (hasRegionalInventory()) {
      if (!getRegionalInventory()
          .equals(other.getRegionalInventory())) return false;
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
    if (hasRegionalInventory()) {
      hash = (37 * hash) + REGIONAL_INVENTORY_FIELD_NUMBER;
      hash = (53 * hash) + getRegionalInventory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest parseFrom(
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
  public static Builder newBuilder(com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest prototype) {
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
   * Request message for the `InsertRegionalInventory` method.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest)
      com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.shopping.merchant.inventories.v1beta.RegionalInventoryProto.internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.inventories.v1beta.RegionalInventoryProto.internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest.class, com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest.Builder.class);
    }

    // Construct using com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest.newBuilder()
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
        getRegionalInventoryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      regionalInventory_ = null;
      if (regionalInventoryBuilder_ != null) {
        regionalInventoryBuilder_.dispose();
        regionalInventoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.shopping.merchant.inventories.v1beta.RegionalInventoryProto.internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest getDefaultInstanceForType() {
      return com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest build() {
      com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest buildPartial() {
      com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest result = new com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.regionalInventory_ = regionalInventoryBuilder_ == null
            ? regionalInventory_
            : regionalInventoryBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest) {
        return mergeFrom((com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest other) {
      if (other == com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRegionalInventory()) {
        mergeRegionalInventory(other.getRegionalInventory());
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
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRegionalInventoryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The account and product where this inventory will be inserted.
     * Format: `accounts/{account}/products/{product}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The account and product where this inventory will be inserted.
     * Format: `accounts/{account}/products/{product}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The account and product where this inventory will be inserted.
     * Format: `accounts/{account}/products/{product}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The account and product where this inventory will be inserted.
     * Format: `accounts/{account}/products/{product}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The account and product where this inventory will be inserted.
     * Format: `accounts/{account}/products/{product}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.shopping.merchant.inventories.v1beta.RegionalInventory regionalInventory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.shopping.merchant.inventories.v1beta.RegionalInventory, com.google.shopping.merchant.inventories.v1beta.RegionalInventory.Builder, com.google.shopping.merchant.inventories.v1beta.RegionalInventoryOrBuilder> regionalInventoryBuilder_;
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the regionalInventory field is set.
     */
    public boolean hasRegionalInventory() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The regionalInventory.
     */
    public com.google.shopping.merchant.inventories.v1beta.RegionalInventory getRegionalInventory() {
      if (regionalInventoryBuilder_ == null) {
        return regionalInventory_ == null ? com.google.shopping.merchant.inventories.v1beta.RegionalInventory.getDefaultInstance() : regionalInventory_;
      } else {
        return regionalInventoryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRegionalInventory(com.google.shopping.merchant.inventories.v1beta.RegionalInventory value) {
      if (regionalInventoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        regionalInventory_ = value;
      } else {
        regionalInventoryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRegionalInventory(
        com.google.shopping.merchant.inventories.v1beta.RegionalInventory.Builder builderForValue) {
      if (regionalInventoryBuilder_ == null) {
        regionalInventory_ = builderForValue.build();
      } else {
        regionalInventoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeRegionalInventory(com.google.shopping.merchant.inventories.v1beta.RegionalInventory value) {
      if (regionalInventoryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          regionalInventory_ != null &&
          regionalInventory_ != com.google.shopping.merchant.inventories.v1beta.RegionalInventory.getDefaultInstance()) {
          getRegionalInventoryBuilder().mergeFrom(value);
        } else {
          regionalInventory_ = value;
        }
      } else {
        regionalInventoryBuilder_.mergeFrom(value);
      }
      if (regionalInventory_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearRegionalInventory() {
      bitField0_ = (bitField0_ & ~0x00000002);
      regionalInventory_ = null;
      if (regionalInventoryBuilder_ != null) {
        regionalInventoryBuilder_.dispose();
        regionalInventoryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.shopping.merchant.inventories.v1beta.RegionalInventory.Builder getRegionalInventoryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRegionalInventoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.shopping.merchant.inventories.v1beta.RegionalInventoryOrBuilder getRegionalInventoryOrBuilder() {
      if (regionalInventoryBuilder_ != null) {
        return regionalInventoryBuilder_.getMessageOrBuilder();
      } else {
        return regionalInventory_ == null ?
            com.google.shopping.merchant.inventories.v1beta.RegionalInventory.getDefaultInstance() : regionalInventory_;
      }
    }
    /**
     * <pre>
     * Required. Regional inventory information to add to the product. If the
     * product already has a `RegionalInventory` resource for the same `region`,
     * full replacement of the `RegionalInventory` resource is performed.
     * </pre>
     *
     * <code>.google.shopping.merchant.inventories.v1beta.RegionalInventory regional_inventory = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.shopping.merchant.inventories.v1beta.RegionalInventory, com.google.shopping.merchant.inventories.v1beta.RegionalInventory.Builder, com.google.shopping.merchant.inventories.v1beta.RegionalInventoryOrBuilder> 
        getRegionalInventoryFieldBuilder() {
      if (regionalInventoryBuilder_ == null) {
        regionalInventoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.merchant.inventories.v1beta.RegionalInventory, com.google.shopping.merchant.inventories.v1beta.RegionalInventory.Builder, com.google.shopping.merchant.inventories.v1beta.RegionalInventoryOrBuilder>(
                getRegionalInventory(),
                getParentForChildren(),
                isClean());
        regionalInventory_ = null;
      }
      return regionalInventoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest)
  private static final com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest();
  }

  public static com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InsertRegionalInventoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<InsertRegionalInventoryRequest>() {
    @java.lang.Override
    public InsertRegionalInventoryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InsertRegionalInventoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InsertRegionalInventoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.inventories.v1beta.InsertRegionalInventoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

