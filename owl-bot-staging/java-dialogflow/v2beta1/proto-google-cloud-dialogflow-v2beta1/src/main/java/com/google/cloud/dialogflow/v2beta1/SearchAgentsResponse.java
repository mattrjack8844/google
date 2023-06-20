// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The response message for
 * [Agents.SearchAgents][google.cloud.dialogflow.v2beta1.Agents.SearchAgents].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.SearchAgentsResponse}
 */
public final class SearchAgentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.SearchAgentsResponse)
    SearchAgentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchAgentsResponse.newBuilder() to construct.
  private SearchAgentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchAgentsResponse() {
    agents_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchAgentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.class, com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.Builder.class);
  }

  public static final int AGENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2beta1.Agent> agents_;
  /**
   * <pre>
   * The list of agents. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2beta1.Agent> getAgentsList() {
    return agents_;
  }
  /**
   * <pre>
   * The list of agents. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.AgentOrBuilder> 
      getAgentsOrBuilderList() {
    return agents_;
  }
  /**
   * <pre>
   * The list of agents. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
   */
  @java.lang.Override
  public int getAgentsCount() {
    return agents_.size();
  }
  /**
   * <pre>
   * The list of agents. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Agent getAgents(int index) {
    return agents_.get(index);
  }
  /**
   * <pre>
   * The list of agents. There will be a maximum number of items returned based
   * on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.AgentOrBuilder getAgentsOrBuilder(
      int index) {
    return agents_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < agents_.size(); i++) {
      output.writeMessage(1, agents_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < agents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, agents_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse other = (com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse) obj;

    if (!getAgentsList()
        .equals(other.getAgentsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getAgentsCount() > 0) {
      hash = (37 * hash) + AGENTS_FIELD_NUMBER;
      hash = (53 * hash) + getAgentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse prototype) {
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
   * The response message for
   * [Agents.SearchAgents][google.cloud.dialogflow.v2beta1.Agents.SearchAgents].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.SearchAgentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.SearchAgentsResponse)
      com.google.cloud.dialogflow.v2beta1.SearchAgentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.class, com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (agentsBuilder_ == null) {
        agents_ = java.util.Collections.emptyList();
      } else {
        agents_ = null;
        agentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse build() {
      com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse result = new com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse result) {
      if (agentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          agents_ = java.util.Collections.unmodifiableList(agents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.agents_ = agents_;
      } else {
        result.agents_ = agentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.getDefaultInstance()) return this;
      if (agentsBuilder_ == null) {
        if (!other.agents_.isEmpty()) {
          if (agents_.isEmpty()) {
            agents_ = other.agents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgentsIsMutable();
            agents_.addAll(other.agents_);
          }
          onChanged();
        }
      } else {
        if (!other.agents_.isEmpty()) {
          if (agentsBuilder_.isEmpty()) {
            agentsBuilder_.dispose();
            agentsBuilder_ = null;
            agents_ = other.agents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            agentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgentsFieldBuilder() : null;
          } else {
            agentsBuilder_.addAllMessages(other.agents_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
              com.google.cloud.dialogflow.v2beta1.Agent m =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2beta1.Agent.parser(),
                      extensionRegistry);
              if (agentsBuilder_ == null) {
                ensureAgentsIsMutable();
                agents_.add(m);
              } else {
                agentsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.dialogflow.v2beta1.Agent> agents_ =
      java.util.Collections.emptyList();
    private void ensureAgentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        agents_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Agent>(agents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Agent, com.google.cloud.dialogflow.v2beta1.Agent.Builder, com.google.cloud.dialogflow.v2beta1.AgentOrBuilder> agentsBuilder_;

    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Agent> getAgentsList() {
      if (agentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(agents_);
      } else {
        return agentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public int getAgentsCount() {
      if (agentsBuilder_ == null) {
        return agents_.size();
      } else {
        return agentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Agent getAgents(int index) {
      if (agentsBuilder_ == null) {
        return agents_.get(index);
      } else {
        return agentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder setAgents(
        int index, com.google.cloud.dialogflow.v2beta1.Agent value) {
      if (agentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentsIsMutable();
        agents_.set(index, value);
        onChanged();
      } else {
        agentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder setAgents(
        int index, com.google.cloud.dialogflow.v2beta1.Agent.Builder builderForValue) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        agents_.set(index, builderForValue.build());
        onChanged();
      } else {
        agentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder addAgents(com.google.cloud.dialogflow.v2beta1.Agent value) {
      if (agentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentsIsMutable();
        agents_.add(value);
        onChanged();
      } else {
        agentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder addAgents(
        int index, com.google.cloud.dialogflow.v2beta1.Agent value) {
      if (agentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentsIsMutable();
        agents_.add(index, value);
        onChanged();
      } else {
        agentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder addAgents(
        com.google.cloud.dialogflow.v2beta1.Agent.Builder builderForValue) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        agents_.add(builderForValue.build());
        onChanged();
      } else {
        agentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder addAgents(
        int index, com.google.cloud.dialogflow.v2beta1.Agent.Builder builderForValue) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        agents_.add(index, builderForValue.build());
        onChanged();
      } else {
        agentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder addAllAgents(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.Agent> values) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, agents_);
        onChanged();
      } else {
        agentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder clearAgents() {
      if (agentsBuilder_ == null) {
        agents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        agentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public Builder removeAgents(int index) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        agents_.remove(index);
        onChanged();
      } else {
        agentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Agent.Builder getAgentsBuilder(
        int index) {
      return getAgentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.AgentOrBuilder getAgentsOrBuilder(
        int index) {
      if (agentsBuilder_ == null) {
        return agents_.get(index);  } else {
        return agentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.AgentOrBuilder> 
         getAgentsOrBuilderList() {
      if (agentsBuilder_ != null) {
        return agentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(agents_);
      }
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Agent.Builder addAgentsBuilder() {
      return getAgentsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2beta1.Agent.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Agent.Builder addAgentsBuilder(
        int index) {
      return getAgentsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2beta1.Agent.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of agents. There will be a maximum number of items returned based
     * on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Agent agents = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Agent.Builder> 
         getAgentsBuilderList() {
      return getAgentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Agent, com.google.cloud.dialogflow.v2beta1.Agent.Builder, com.google.cloud.dialogflow.v2beta1.AgentOrBuilder> 
        getAgentsFieldBuilder() {
      if (agentsBuilder_ == null) {
        agentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Agent, com.google.cloud.dialogflow.v2beta1.Agent.Builder, com.google.cloud.dialogflow.v2beta1.AgentOrBuilder>(
                agents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        agents_ = null;
      }
      return agentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.SearchAgentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SearchAgentsResponse)
  private static final com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchAgentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchAgentsResponse>() {
    @java.lang.Override
    public SearchAgentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchAgentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchAgentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

