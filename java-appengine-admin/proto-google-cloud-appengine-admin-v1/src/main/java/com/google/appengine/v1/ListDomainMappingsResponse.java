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
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Response message for `DomainMappings.ListDomainMappings`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ListDomainMappingsResponse}
 */
public final class ListDomainMappingsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ListDomainMappingsResponse)
    ListDomainMappingsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDomainMappingsResponse.newBuilder() to construct.
  private ListDomainMappingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDomainMappingsResponse() {
    domainMappings_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDomainMappingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListDomainMappingsResponse(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                domainMappings_ = new java.util.ArrayList<com.google.appengine.v1.DomainMapping>();
                mutable_bitField0_ |= 0x00000001;
              }
              domainMappings_.add(
                  input.readMessage(
                      com.google.appengine.v1.DomainMapping.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        domainMappings_ = java.util.Collections.unmodifiableList(domainMappings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_ListDomainMappingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_ListDomainMappingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ListDomainMappingsResponse.class,
            com.google.appengine.v1.ListDomainMappingsResponse.Builder.class);
  }

  public static final int DOMAIN_MAPPINGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.appengine.v1.DomainMapping> domainMappings_;
  /**
   *
   *
   * <pre>
   * The domain mappings for the application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.appengine.v1.DomainMapping> getDomainMappingsList() {
    return domainMappings_;
  }
  /**
   *
   *
   * <pre>
   * The domain mappings for the application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.appengine.v1.DomainMappingOrBuilder>
      getDomainMappingsOrBuilderList() {
    return domainMappings_;
  }
  /**
   *
   *
   * <pre>
   * The domain mappings for the application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
   */
  @java.lang.Override
  public int getDomainMappingsCount() {
    return domainMappings_.size();
  }
  /**
   *
   *
   * <pre>
   * The domain mappings for the application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.DomainMapping getDomainMappings(int index) {
    return domainMappings_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The domain mappings for the application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.DomainMappingOrBuilder getDomainMappingsOrBuilder(int index) {
    return domainMappings_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < domainMappings_.size(); i++) {
      output.writeMessage(1, domainMappings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < domainMappings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, domainMappings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.appengine.v1.ListDomainMappingsResponse)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ListDomainMappingsResponse other =
        (com.google.appengine.v1.ListDomainMappingsResponse) obj;

    if (!getDomainMappingsList().equals(other.getDomainMappingsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getDomainMappingsCount() > 0) {
      hash = (37 * hash) + DOMAIN_MAPPINGS_FIELD_NUMBER;
      hash = (53 * hash) + getDomainMappingsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.ListDomainMappingsResponse prototype) {
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
   * Response message for `DomainMappings.ListDomainMappings`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ListDomainMappingsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ListDomainMappingsResponse)
      com.google.appengine.v1.ListDomainMappingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_ListDomainMappingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_ListDomainMappingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ListDomainMappingsResponse.class,
              com.google.appengine.v1.ListDomainMappingsResponse.Builder.class);
    }

    // Construct using com.google.appengine.v1.ListDomainMappingsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDomainMappingsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (domainMappingsBuilder_ == null) {
        domainMappings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        domainMappingsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_ListDomainMappingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.ListDomainMappingsResponse getDefaultInstanceForType() {
      return com.google.appengine.v1.ListDomainMappingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.ListDomainMappingsResponse build() {
      com.google.appengine.v1.ListDomainMappingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.ListDomainMappingsResponse buildPartial() {
      com.google.appengine.v1.ListDomainMappingsResponse result =
          new com.google.appengine.v1.ListDomainMappingsResponse(this);
      int from_bitField0_ = bitField0_;
      if (domainMappingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          domainMappings_ = java.util.Collections.unmodifiableList(domainMappings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.domainMappings_ = domainMappings_;
      } else {
        result.domainMappings_ = domainMappingsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.appengine.v1.ListDomainMappingsResponse) {
        return mergeFrom((com.google.appengine.v1.ListDomainMappingsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ListDomainMappingsResponse other) {
      if (other == com.google.appengine.v1.ListDomainMappingsResponse.getDefaultInstance())
        return this;
      if (domainMappingsBuilder_ == null) {
        if (!other.domainMappings_.isEmpty()) {
          if (domainMappings_.isEmpty()) {
            domainMappings_ = other.domainMappings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDomainMappingsIsMutable();
            domainMappings_.addAll(other.domainMappings_);
          }
          onChanged();
        }
      } else {
        if (!other.domainMappings_.isEmpty()) {
          if (domainMappingsBuilder_.isEmpty()) {
            domainMappingsBuilder_.dispose();
            domainMappingsBuilder_ = null;
            domainMappings_ = other.domainMappings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            domainMappingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDomainMappingsFieldBuilder()
                    : null;
          } else {
            domainMappingsBuilder_.addAllMessages(other.domainMappings_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.appengine.v1.ListDomainMappingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.appengine.v1.ListDomainMappingsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.appengine.v1.DomainMapping> domainMappings_ =
        java.util.Collections.emptyList();

    private void ensureDomainMappingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        domainMappings_ =
            new java.util.ArrayList<com.google.appengine.v1.DomainMapping>(domainMappings_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.appengine.v1.DomainMapping,
            com.google.appengine.v1.DomainMapping.Builder,
            com.google.appengine.v1.DomainMappingOrBuilder>
        domainMappingsBuilder_;

    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public java.util.List<com.google.appengine.v1.DomainMapping> getDomainMappingsList() {
      if (domainMappingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(domainMappings_);
      } else {
        return domainMappingsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public int getDomainMappingsCount() {
      if (domainMappingsBuilder_ == null) {
        return domainMappings_.size();
      } else {
        return domainMappingsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public com.google.appengine.v1.DomainMapping getDomainMappings(int index) {
      if (domainMappingsBuilder_ == null) {
        return domainMappings_.get(index);
      } else {
        return domainMappingsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder setDomainMappings(int index, com.google.appengine.v1.DomainMapping value) {
      if (domainMappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainMappingsIsMutable();
        domainMappings_.set(index, value);
        onChanged();
      } else {
        domainMappingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder setDomainMappings(
        int index, com.google.appengine.v1.DomainMapping.Builder builderForValue) {
      if (domainMappingsBuilder_ == null) {
        ensureDomainMappingsIsMutable();
        domainMappings_.set(index, builderForValue.build());
        onChanged();
      } else {
        domainMappingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder addDomainMappings(com.google.appengine.v1.DomainMapping value) {
      if (domainMappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainMappingsIsMutable();
        domainMappings_.add(value);
        onChanged();
      } else {
        domainMappingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder addDomainMappings(int index, com.google.appengine.v1.DomainMapping value) {
      if (domainMappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainMappingsIsMutable();
        domainMappings_.add(index, value);
        onChanged();
      } else {
        domainMappingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder addDomainMappings(
        com.google.appengine.v1.DomainMapping.Builder builderForValue) {
      if (domainMappingsBuilder_ == null) {
        ensureDomainMappingsIsMutable();
        domainMappings_.add(builderForValue.build());
        onChanged();
      } else {
        domainMappingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder addDomainMappings(
        int index, com.google.appengine.v1.DomainMapping.Builder builderForValue) {
      if (domainMappingsBuilder_ == null) {
        ensureDomainMappingsIsMutable();
        domainMappings_.add(index, builderForValue.build());
        onChanged();
      } else {
        domainMappingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder addAllDomainMappings(
        java.lang.Iterable<? extends com.google.appengine.v1.DomainMapping> values) {
      if (domainMappingsBuilder_ == null) {
        ensureDomainMappingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, domainMappings_);
        onChanged();
      } else {
        domainMappingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder clearDomainMappings() {
      if (domainMappingsBuilder_ == null) {
        domainMappings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        domainMappingsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public Builder removeDomainMappings(int index) {
      if (domainMappingsBuilder_ == null) {
        ensureDomainMappingsIsMutable();
        domainMappings_.remove(index);
        onChanged();
      } else {
        domainMappingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public com.google.appengine.v1.DomainMapping.Builder getDomainMappingsBuilder(int index) {
      return getDomainMappingsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public com.google.appengine.v1.DomainMappingOrBuilder getDomainMappingsOrBuilder(int index) {
      if (domainMappingsBuilder_ == null) {
        return domainMappings_.get(index);
      } else {
        return domainMappingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public java.util.List<? extends com.google.appengine.v1.DomainMappingOrBuilder>
        getDomainMappingsOrBuilderList() {
      if (domainMappingsBuilder_ != null) {
        return domainMappingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(domainMappings_);
      }
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public com.google.appengine.v1.DomainMapping.Builder addDomainMappingsBuilder() {
      return getDomainMappingsFieldBuilder()
          .addBuilder(com.google.appengine.v1.DomainMapping.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public com.google.appengine.v1.DomainMapping.Builder addDomainMappingsBuilder(int index) {
      return getDomainMappingsFieldBuilder()
          .addBuilder(index, com.google.appengine.v1.DomainMapping.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The domain mappings for the application.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.DomainMapping domain_mappings = 1;</code>
     */
    public java.util.List<com.google.appengine.v1.DomainMapping.Builder>
        getDomainMappingsBuilderList() {
      return getDomainMappingsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.appengine.v1.DomainMapping,
            com.google.appengine.v1.DomainMapping.Builder,
            com.google.appengine.v1.DomainMappingOrBuilder>
        getDomainMappingsFieldBuilder() {
      if (domainMappingsBuilder_ == null) {
        domainMappingsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.appengine.v1.DomainMapping,
                com.google.appengine.v1.DomainMapping.Builder,
                com.google.appengine.v1.DomainMappingOrBuilder>(
                domainMappings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        domainMappings_ = null;
      }
      return domainMappingsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ListDomainMappingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ListDomainMappingsResponse)
  private static final com.google.appengine.v1.ListDomainMappingsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ListDomainMappingsResponse();
  }

  public static com.google.appengine.v1.ListDomainMappingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDomainMappingsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDomainMappingsResponse>() {
        @java.lang.Override
        public ListDomainMappingsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListDomainMappingsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListDomainMappingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDomainMappingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.ListDomainMappingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
