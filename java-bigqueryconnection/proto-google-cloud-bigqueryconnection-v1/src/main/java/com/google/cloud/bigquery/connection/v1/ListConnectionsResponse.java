/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

/**
 *
 *
 * <pre>
 * The response for
 * [ConnectionService.ListConnections][google.cloud.bigquery.connection.v1.ConnectionService.ListConnections].
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.connection.v1.ListConnectionsResponse}
 */
public final class ListConnectionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.connection.v1.ListConnectionsResponse)
    ListConnectionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListConnectionsResponse.newBuilder() to construct.
  private ListConnectionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListConnectionsResponse() {
    nextPageToken_ = "";
    connections_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListConnectionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
        .internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
        .internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.connection.v1.ListConnectionsResponse.class,
            com.google.cloud.bigquery.connection.v1.ListConnectionsResponse.Builder.class);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Next page token.
   * </pre>
   *
   * <code>string next_page_token = 1;</code>
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
   * Next page token.
   * </pre>
   *
   * <code>string next_page_token = 1;</code>
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

  public static final int CONNECTIONS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.bigquery.connection.v1.Connection> connections_;
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.connection.v1.Connection> getConnectionsList() {
    return connections_;
  }
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>
      getConnectionsOrBuilderList() {
    return connections_;
  }
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  @java.lang.Override
  public int getConnectionsCount() {
    return connections_.size();
  }
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.Connection getConnections(int index) {
    return connections_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder getConnectionsOrBuilder(
      int index) {
    return connections_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nextPageToken_);
    }
    for (int i = 0; i < connections_.size(); i++) {
      output.writeMessage(2, connections_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nextPageToken_);
    }
    for (int i = 0; i < connections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, connections_.get(i));
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
    if (!(obj instanceof com.google.cloud.bigquery.connection.v1.ListConnectionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.connection.v1.ListConnectionsResponse other =
        (com.google.cloud.bigquery.connection.v1.ListConnectionsResponse) obj;

    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getConnectionsList().equals(other.getConnectionsList())) return false;
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
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    if (getConnectionsCount() > 0) {
      hash = (37 * hash) + CONNECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConnectionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse parseFrom(
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
      com.google.cloud.bigquery.connection.v1.ListConnectionsResponse prototype) {
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
   * The response for
   * [ConnectionService.ListConnections][google.cloud.bigquery.connection.v1.ConnectionService.ListConnections].
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.connection.v1.ListConnectionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.connection.v1.ListConnectionsResponse)
      com.google.cloud.bigquery.connection.v1.ListConnectionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.connection.v1.ListConnectionsResponse.class,
              com.google.cloud.bigquery.connection.v1.ListConnectionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.connection.v1.ListConnectionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      nextPageToken_ = "";
      if (connectionsBuilder_ == null) {
        connections_ = java.util.Collections.emptyList();
      } else {
        connections_ = null;
        connectionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.ListConnectionsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.connection.v1.ListConnectionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.ListConnectionsResponse build() {
      com.google.cloud.bigquery.connection.v1.ListConnectionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.ListConnectionsResponse buildPartial() {
      com.google.cloud.bigquery.connection.v1.ListConnectionsResponse result =
          new com.google.cloud.bigquery.connection.v1.ListConnectionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.bigquery.connection.v1.ListConnectionsResponse result) {
      if (connectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          connections_ = java.util.Collections.unmodifiableList(connections_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.connections_ = connections_;
      } else {
        result.connections_ = connectionsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.bigquery.connection.v1.ListConnectionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
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
      if (other instanceof com.google.cloud.bigquery.connection.v1.ListConnectionsResponse) {
        return mergeFrom((com.google.cloud.bigquery.connection.v1.ListConnectionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.connection.v1.ListConnectionsResponse other) {
      if (other
          == com.google.cloud.bigquery.connection.v1.ListConnectionsResponse.getDefaultInstance())
        return this;
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (connectionsBuilder_ == null) {
        if (!other.connections_.isEmpty()) {
          if (connections_.isEmpty()) {
            connections_ = other.connections_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureConnectionsIsMutable();
            connections_.addAll(other.connections_);
          }
          onChanged();
        }
      } else {
        if (!other.connections_.isEmpty()) {
          if (connectionsBuilder_.isEmpty()) {
            connectionsBuilder_.dispose();
            connectionsBuilder_ = null;
            connections_ = other.connections_;
            bitField0_ = (bitField0_ & ~0x00000002);
            connectionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getConnectionsFieldBuilder()
                    : null;
          } else {
            connectionsBuilder_.addAllMessages(other.connections_);
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
            case 10:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.cloud.bigquery.connection.v1.Connection m =
                    input.readMessage(
                        com.google.cloud.bigquery.connection.v1.Connection.parser(),
                        extensionRegistry);
                if (connectionsBuilder_ == null) {
                  ensureConnectionsIsMutable();
                  connections_.add(m);
                } else {
                  connectionsBuilder_.addMessage(m);
                }
                break;
              } // case 18
            default:
              {
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

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Next page token.
     * </pre>
     *
     * <code>string next_page_token = 1;</code>
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
     * Next page token.
     * </pre>
     *
     * <code>string next_page_token = 1;</code>
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
     * Next page token.
     * </pre>
     *
     * <code>string next_page_token = 1;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Next page token.
     * </pre>
     *
     * <code>string next_page_token = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Next page token.
     * </pre>
     *
     * <code>string next_page_token = 1;</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.bigquery.connection.v1.Connection> connections_ =
        java.util.Collections.emptyList();

    private void ensureConnectionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        connections_ =
            new java.util.ArrayList<com.google.cloud.bigquery.connection.v1.Connection>(
                connections_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.connection.v1.Connection,
            com.google.cloud.bigquery.connection.v1.Connection.Builder,
            com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>
        connectionsBuilder_;

    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public java.util.List<com.google.cloud.bigquery.connection.v1.Connection> getConnectionsList() {
      if (connectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(connections_);
      } else {
        return connectionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public int getConnectionsCount() {
      if (connectionsBuilder_ == null) {
        return connections_.size();
      } else {
        return connectionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public com.google.cloud.bigquery.connection.v1.Connection getConnections(int index) {
      if (connectionsBuilder_ == null) {
        return connections_.get(index);
      } else {
        return connectionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder setConnections(
        int index, com.google.cloud.bigquery.connection.v1.Connection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.set(index, value);
        onChanged();
      } else {
        connectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder setConnections(
        int index, com.google.cloud.bigquery.connection.v1.Connection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.set(index, builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder addConnections(com.google.cloud.bigquery.connection.v1.Connection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.add(value);
        onChanged();
      } else {
        connectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder addConnections(
        int index, com.google.cloud.bigquery.connection.v1.Connection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.add(index, value);
        onChanged();
      } else {
        connectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder addConnections(
        com.google.cloud.bigquery.connection.v1.Connection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.add(builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder addConnections(
        int index, com.google.cloud.bigquery.connection.v1.Connection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.add(index, builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder addAllConnections(
        java.lang.Iterable<? extends com.google.cloud.bigquery.connection.v1.Connection> values) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, connections_);
        onChanged();
      } else {
        connectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder clearConnections() {
      if (connectionsBuilder_ == null) {
        connections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        connectionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public Builder removeConnections(int index) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.remove(index);
        onChanged();
      } else {
        connectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public com.google.cloud.bigquery.connection.v1.Connection.Builder getConnectionsBuilder(
        int index) {
      return getConnectionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder getConnectionsOrBuilder(
        int index) {
      if (connectionsBuilder_ == null) {
        return connections_.get(index);
      } else {
        return connectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>
        getConnectionsOrBuilderList() {
      if (connectionsBuilder_ != null) {
        return connectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(connections_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public com.google.cloud.bigquery.connection.v1.Connection.Builder addConnectionsBuilder() {
      return getConnectionsFieldBuilder()
          .addBuilder(com.google.cloud.bigquery.connection.v1.Connection.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public com.google.cloud.bigquery.connection.v1.Connection.Builder addConnectionsBuilder(
        int index) {
      return getConnectionsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.bigquery.connection.v1.Connection.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of connections.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
     */
    public java.util.List<com.google.cloud.bigquery.connection.v1.Connection.Builder>
        getConnectionsBuilderList() {
      return getConnectionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.connection.v1.Connection,
            com.google.cloud.bigquery.connection.v1.Connection.Builder,
            com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>
        getConnectionsFieldBuilder() {
      if (connectionsBuilder_ == null) {
        connectionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.connection.v1.Connection,
                com.google.cloud.bigquery.connection.v1.Connection.Builder,
                com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>(
                connections_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        connections_ = null;
      }
      return connectionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.connection.v1.ListConnectionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.connection.v1.ListConnectionsResponse)
  private static final com.google.cloud.bigquery.connection.v1.ListConnectionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.connection.v1.ListConnectionsResponse();
  }

  public static com.google.cloud.bigquery.connection.v1.ListConnectionsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConnectionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListConnectionsResponse>() {
        @java.lang.Override
        public ListConnectionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConnectionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConnectionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.ListConnectionsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
