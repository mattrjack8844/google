// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/import_config.proto

package com.google.cloud.retail.v2beta;

/**
 * <pre>
 * The inline source for the input config for ImportProducts method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.ProductInlineSource}
 */
public final class ProductInlineSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.ProductInlineSource)
    ProductInlineSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductInlineSource.newBuilder() to construct.
  private ProductInlineSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductInlineSource() {
    products_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductInlineSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductInlineSource(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              products_ = new java.util.ArrayList<com.google.cloud.retail.v2beta.Product>();
              mutable_bitField0_ |= 0x00000001;
            }
            products_.add(
                input.readMessage(com.google.cloud.retail.v2beta.Product.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        products_ = java.util.Collections.unmodifiableList(products_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ProductInlineSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ProductInlineSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.ProductInlineSource.class, com.google.cloud.retail.v2beta.ProductInlineSource.Builder.class);
  }

  public static final int PRODUCTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.retail.v2beta.Product> products_;
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.retail.v2beta.Product> getProductsList() {
    return products_;
  }
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.retail.v2beta.ProductOrBuilder> 
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getProductsCount() {
    return products_.size();
  }
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.Product getProducts(int index) {
    return products_.get(index);
  }
  /**
   * <pre>
   * Required. A list of products to update/create. Each product must have a
   * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
   * of 100 items.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.ProductOrBuilder getProductsOrBuilder(
      int index) {
    return products_.get(index);
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
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(1, products_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, products_.get(i));
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.ProductInlineSource)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.ProductInlineSource other = (com.google.cloud.retail.v2beta.ProductInlineSource) obj;

    if (!getProductsList()
        .equals(other.getProductsList())) return false;
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
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ProductInlineSource parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2beta.ProductInlineSource prototype) {
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
   * The inline source for the input config for ImportProducts method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.ProductInlineSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.ProductInlineSource)
      com.google.cloud.retail.v2beta.ProductInlineSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ProductInlineSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ProductInlineSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.ProductInlineSource.class, com.google.cloud.retail.v2beta.ProductInlineSource.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.ProductInlineSource.newBuilder()
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
        getProductsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ProductInlineSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ProductInlineSource getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.ProductInlineSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ProductInlineSource build() {
      com.google.cloud.retail.v2beta.ProductInlineSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ProductInlineSource buildPartial() {
      com.google.cloud.retail.v2beta.ProductInlineSource result = new com.google.cloud.retail.v2beta.ProductInlineSource(this);
      int from_bitField0_ = bitField0_;
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
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
      if (other instanceof com.google.cloud.retail.v2beta.ProductInlineSource) {
        return mergeFrom((com.google.cloud.retail.v2beta.ProductInlineSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.ProductInlineSource other) {
      if (other == com.google.cloud.retail.v2beta.ProductInlineSource.getDefaultInstance()) return this;
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductsFieldBuilder() : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
          }
        }
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
      com.google.cloud.retail.v2beta.ProductInlineSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2beta.ProductInlineSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.retail.v2beta.Product> products_ =
      java.util.Collections.emptyList();
    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        products_ = new java.util.ArrayList<com.google.cloud.retail.v2beta.Product>(products_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.retail.v2beta.Product, com.google.cloud.retail.v2beta.Product.Builder, com.google.cloud.retail.v2beta.ProductOrBuilder> productsBuilder_;

    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloud.retail.v2beta.Product> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.Product getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProducts(
        int index, com.google.cloud.retail.v2beta.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProducts(
        int index, com.google.cloud.retail.v2beta.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addProducts(com.google.cloud.retail.v2beta.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addProducts(
        int index, com.google.cloud.retail.v2beta.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addProducts(
        com.google.cloud.retail.v2beta.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addProducts(
        int index, com.google.cloud.retail.v2beta.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllProducts(
        java.lang.Iterable<? extends com.google.cloud.retail.v2beta.Product> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.Product.Builder getProductsBuilder(
        int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.ProductOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);  } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.cloud.retail.v2beta.ProductOrBuilder> 
         getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.Product.Builder addProductsBuilder() {
      return getProductsFieldBuilder().addBuilder(
          com.google.cloud.retail.v2beta.Product.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.Product.Builder addProductsBuilder(
        int index) {
      return getProductsFieldBuilder().addBuilder(
          index, com.google.cloud.retail.v2beta.Product.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A list of products to update/create. Each product must have a
     * valid [Product.id][google.cloud.retail.v2beta.Product.id]. Recommended max
     * of 100 items.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.Product products = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloud.retail.v2beta.Product.Builder> 
         getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.retail.v2beta.Product, com.google.cloud.retail.v2beta.Product.Builder, com.google.cloud.retail.v2beta.ProductOrBuilder> 
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.retail.v2beta.Product, com.google.cloud.retail.v2beta.Product.Builder, com.google.cloud.retail.v2beta.ProductOrBuilder>(
                products_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        products_ = null;
      }
      return productsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.ProductInlineSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.ProductInlineSource)
  private static final com.google.cloud.retail.v2beta.ProductInlineSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.ProductInlineSource();
  }

  public static com.google.cloud.retail.v2beta.ProductInlineSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductInlineSource>
      PARSER = new com.google.protobuf.AbstractParser<ProductInlineSource>() {
    @java.lang.Override
    public ProductInlineSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductInlineSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductInlineSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductInlineSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.ProductInlineSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

