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
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

/**
 *
 *
 * <pre>
 * Message for creating a listing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest}
 */
public final class CreateListingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest)
    CreateListingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateListingRequest.newBuilder() to construct.
  private CreateListingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateListingRequest() {
    parent_ = "";
    listingId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateListingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateListingRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              java.lang.String s = input.readStringRequireUtf8();

              listingId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder subBuilder = null;
              if (listing_ != null) {
                subBuilder = listing_.toBuilder();
              }
              listing_ =
                  input.readMessage(
                      com.google.cloud.bigquery.dataexchange.v1beta1.Listing.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(listing_);
                listing_ = subBuilder.buildPartial();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_CreateListingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_CreateListingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest.class,
            com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource path of the listing.
   * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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
   * Required. The parent resource path of the listing.
   * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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

  public static final int LISTING_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object listingId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the listing to create.
   * Must contain only Unicode letters, numbers (0-9), underscores (_).
   * Should not use characters that require URL-escaping, or characters
   * outside of ASCII, spaces.
   * Max length: 100 bytes.
   * </pre>
   *
   * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The listingId.
   */
  @java.lang.Override
  public java.lang.String getListingId() {
    java.lang.Object ref = listingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      listingId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the listing to create.
   * Must contain only Unicode letters, numbers (0-9), underscores (_).
   * Should not use characters that require URL-escaping, or characters
   * outside of ASCII, spaces.
   * Max length: 100 bytes.
   * </pre>
   *
   * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for listingId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getListingIdBytes() {
    java.lang.Object ref = listingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      listingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LISTING_FIELD_NUMBER = 3;
  private com.google.cloud.bigquery.dataexchange.v1beta1.Listing listing_;
  /**
   *
   *
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the listing field is set.
   */
  @java.lang.Override
  public boolean hasListing() {
    return listing_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The listing.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.Listing getListing() {
    return listing_ == null
        ? com.google.cloud.bigquery.dataexchange.v1beta1.Listing.getDefaultInstance()
        : listing_;
  }
  /**
   *
   *
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder getListingOrBuilder() {
    return getListing();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listingId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, listingId_);
    }
    if (listing_ != null) {
      output.writeMessage(3, getListing());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listingId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, listingId_);
    }
    if (listing_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getListing());
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
    if (!(obj instanceof com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest other =
        (com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getListingId().equals(other.getListingId())) return false;
    if (hasListing() != other.hasListing()) return false;
    if (hasListing()) {
      if (!getListing().equals(other.getListing())) return false;
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
    hash = (37 * hash) + LISTING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getListingId().hashCode();
    if (hasListing()) {
      hash = (37 * hash) + LISTING_FIELD_NUMBER;
      hash = (53 * hash) + getListing().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parseFrom(
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
      com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest prototype) {
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
   * Message for creating a listing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest)
      com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_CreateListingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_CreateListingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest.class,
              com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest.newBuilder()
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

      listingId_ = "";

      if (listingBuilder_ == null) {
        listing_ = null;
      } else {
        listing_ = null;
        listingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_CreateListingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest build() {
      com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest buildPartial() {
      com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest result =
          new com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest(this);
      result.parent_ = parent_;
      result.listingId_ = listingId_;
      if (listingBuilder_ == null) {
        result.listing_ = listing_;
      } else {
        result.listing_ = listingBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest other) {
      if (other
          == com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getListingId().isEmpty()) {
        listingId_ = other.listingId_;
        onChanged();
      }
      if (other.hasListing()) {
        mergeListing(other.getListing());
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
      com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest)
                e.getUnfinishedMessage();
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
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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
     * Required. The parent resource path of the listing.
     * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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

    private java.lang.Object listingId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The listingId.
     */
    public java.lang.String getListingId() {
      java.lang.Object ref = listingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        listingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for listingId.
     */
    public com.google.protobuf.ByteString getListingIdBytes() {
      java.lang.Object ref = listingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        listingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The listingId to set.
     * @return This builder for chaining.
     */
    public Builder setListingId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      listingId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearListingId() {

      listingId_ = getDefaultInstance().getListingId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the listing to create.
     * Must contain only Unicode letters, numbers (0-9), underscores (_).
     * Should not use characters that require URL-escaping, or characters
     * outside of ASCII, spaces.
     * Max length: 100 bytes.
     * </pre>
     *
     * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for listingId to set.
     * @return This builder for chaining.
     */
    public Builder setListingIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      listingId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.dataexchange.v1beta1.Listing listing_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.dataexchange.v1beta1.Listing,
            com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder,
            com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder>
        listingBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the listing field is set.
     */
    public boolean hasListing() {
      return listingBuilder_ != null || listing_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The listing.
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.Listing getListing() {
      if (listingBuilder_ == null) {
        return listing_ == null
            ? com.google.cloud.bigquery.dataexchange.v1beta1.Listing.getDefaultInstance()
            : listing_;
      } else {
        return listingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setListing(com.google.cloud.bigquery.dataexchange.v1beta1.Listing value) {
      if (listingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        listing_ = value;
        onChanged();
      } else {
        listingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setListing(
        com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder builderForValue) {
      if (listingBuilder_ == null) {
        listing_ = builderForValue.build();
        onChanged();
      } else {
        listingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeListing(com.google.cloud.bigquery.dataexchange.v1beta1.Listing value) {
      if (listingBuilder_ == null) {
        if (listing_ != null) {
          listing_ =
              com.google.cloud.bigquery.dataexchange.v1beta1.Listing.newBuilder(listing_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          listing_ = value;
        }
        onChanged();
      } else {
        listingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearListing() {
      if (listingBuilder_ == null) {
        listing_ = null;
        onChanged();
      } else {
        listing_ = null;
        listingBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder getListingBuilder() {

      onChanged();
      return getListingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder getListingOrBuilder() {
      if (listingBuilder_ != null) {
        return listingBuilder_.getMessageOrBuilder();
      } else {
        return listing_ == null
            ? com.google.cloud.bigquery.dataexchange.v1beta1.Listing.getDefaultInstance()
            : listing_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The listing to create.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.dataexchange.v1beta1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.dataexchange.v1beta1.Listing,
            com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder,
            com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder>
        getListingFieldBuilder() {
      if (listingBuilder_ == null) {
        listingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.dataexchange.v1beta1.Listing,
                com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder,
                com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder>(
                getListing(), getParentForChildren(), isClean());
        listing_ = null;
      }
      return listingBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest)
  private static final com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest();
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateListingRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateListingRequest>() {
        @java.lang.Override
        public CreateListingRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateListingRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateListingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateListingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.CreateListingRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
