// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vision.v1p4beta1;

/**
 * <pre>
 * Request message for the `UpdateProduct` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.UpdateProductRequest}
 */
public final class UpdateProductRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.UpdateProductRequest)
    UpdateProductRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateProductRequest.newBuilder() to construct.
  private UpdateProductRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateProductRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateProductRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p4beta1_UpdateProductRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p4beta1_UpdateProductRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.UpdateProductRequest.class, com.google.cloud.vision.v1p4beta1.UpdateProductRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCT_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1p4beta1.Product product_;
  /**
   * <pre>
   * Required. The Product resource which replaces the one on the server.
   * product.name is immutable.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The Product resource which replaces the one on the server.
   * product.name is immutable.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The product.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.Product getProduct() {
    return product_ == null ? com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance() : product_;
  }
  /**
   * <pre>
   * Required. The Product resource which replaces the one on the server.
   * product.name is immutable.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.ProductOrBuilder getProductOrBuilder() {
    return product_ == null ? com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance() : product_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
   * to update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask paths include `product_labels`, `display_name`, and
   * `description`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
   * to update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask paths include `product_labels`, `display_name`, and
   * `description`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
   * to update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask paths include `product_labels`, `display_name`, and
   * `description`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getProduct());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProduct());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.UpdateProductRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.UpdateProductRequest other = (com.google.cloud.vision.v1p4beta1.UpdateProductRequest) obj;

    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct()
          .equals(other.getProduct())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1p4beta1.UpdateProductRequest prototype) {
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
   * Request message for the `UpdateProduct` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.UpdateProductRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.UpdateProductRequest)
      com.google.cloud.vision.v1p4beta1.UpdateProductRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p4beta1_UpdateProductRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p4beta1_UpdateProductRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.UpdateProductRequest.class, com.google.cloud.vision.v1p4beta1.UpdateProductRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.UpdateProductRequest.newBuilder()
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
        getProductFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      product_ = null;
      if (productBuilder_ != null) {
        productBuilder_.dispose();
        productBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p4beta1_UpdateProductRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.UpdateProductRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.UpdateProductRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.UpdateProductRequest build() {
      com.google.cloud.vision.v1p4beta1.UpdateProductRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.UpdateProductRequest buildPartial() {
      com.google.cloud.vision.v1p4beta1.UpdateProductRequest result = new com.google.cloud.vision.v1p4beta1.UpdateProductRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1p4beta1.UpdateProductRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.product_ = productBuilder_ == null
            ? product_
            : productBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.vision.v1p4beta1.UpdateProductRequest) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.UpdateProductRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.UpdateProductRequest other) {
      if (other == com.google.cloud.vision.v1p4beta1.UpdateProductRequest.getDefaultInstance()) return this;
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
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
            case 10: {
              input.readMessage(
                  getProductFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.google.cloud.vision.v1p4beta1.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1p4beta1.Product, com.google.cloud.vision.v1p4beta1.Product.Builder, com.google.cloud.vision.v1p4beta1.ProductOrBuilder> productBuilder_;
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The product.
     */
    public com.google.cloud.vision.v1p4beta1.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProduct(com.google.cloud.vision.v1p4beta1.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
      } else {
        productBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProduct(
        com.google.cloud.vision.v1p4beta1.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeProduct(com.google.cloud.vision.v1p4beta1.Product value) {
      if (productBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          product_ != null &&
          product_ != com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance()) {
          getProductBuilder().mergeFrom(value);
        } else {
          product_ = value;
        }
      } else {
        productBuilder_.mergeFrom(value);
      }
      if (product_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearProduct() {
      bitField0_ = (bitField0_ & ~0x00000001);
      product_ = null;
      if (productBuilder_ != null) {
        productBuilder_.dispose();
        productBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.vision.v1p4beta1.Product.Builder getProductBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.vision.v1p4beta1.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <pre>
     * Required. The Product resource which replaces the one on the server.
     * product.name is immutable.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1p4beta1.Product, com.google.cloud.vision.v1p4beta1.Product.Builder, com.google.cloud.vision.v1p4beta1.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.Product, com.google.cloud.vision.v1p4beta1.Product.Builder, com.google.cloud.vision.v1p4beta1.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
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
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
     * to update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask paths include `product_labels`, `display_name`, and
     * `description`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.UpdateProductRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.UpdateProductRequest)
  private static final com.google.cloud.vision.v1p4beta1.UpdateProductRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.UpdateProductRequest();
  }

  public static com.google.cloud.vision.v1p4beta1.UpdateProductRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateProductRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateProductRequest>() {
    @java.lang.Override
    public UpdateProductRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateProductRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateProductRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.UpdateProductRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

