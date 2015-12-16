// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

/**
 * Protobuf type {@code google.logging.v2.ReadLogEntriesRequest}
 *
 * <pre>
 * The parameters to `ReadLogEntries`.
 * There are two different use cases for streaming:
 * 1.  To return a very large result set. The request eventually
 *     completes when all entries have been returned.
 * 2.  To "tail" a log stream, returning new entries as they arrive.
 *     In this case, the request never completes.
 * Only the first use case is supported.
 * </pre>
 */
public  final class ReadLogEntriesRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.ReadLogEntriesRequest)
    ReadLogEntriesRequestOrBuilder {
  // Use ReadLogEntriesRequest.newBuilder() to construct.
  private ReadLogEntriesRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ReadLogEntriesRequest() {
    projectIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    filter_ = "";
    orderBy_ = "";
    resumeToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReadLogEntriesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              projectIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            projectIds_.add(s);
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            filter_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            orderBy_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            resumeToken_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        projectIds_ = projectIds_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_ReadLogEntriesRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_ReadLogEntriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.ReadLogEntriesRequest.class, com.google.logging.v2.ReadLogEntriesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList projectIds_;
  /**
   * <code>repeated string project_ids = 1;</code>
   *
   * <pre>
   * Required. A list of project ids from which to retrieve log entries.
   * Example: `"my-project-id"`.
   * </pre>
   */
  public com.google.protobuf.ProtocolStringList
      getProjectIdsList() {
    return projectIds_;
  }
  /**
   * <code>repeated string project_ids = 1;</code>
   *
   * <pre>
   * Required. A list of project ids from which to retrieve log entries.
   * Example: `"my-project-id"`.
   * </pre>
   */
  public int getProjectIdsCount() {
    return projectIds_.size();
  }
  /**
   * <code>repeated string project_ids = 1;</code>
   *
   * <pre>
   * Required. A list of project ids from which to retrieve log entries.
   * Example: `"my-project-id"`.
   * </pre>
   */
  public java.lang.String getProjectIds(int index) {
    return projectIds_.get(index);
  }
  /**
   * <code>repeated string project_ids = 1;</code>
   *
   * <pre>
   * Required. A list of project ids from which to retrieve log entries.
   * Example: `"my-project-id"`.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getProjectIdsBytes(int index) {
    return projectIds_.getByteString(index);
  }

  public static final int FILTER_FIELD_NUMBER = 2;
  private volatile java.lang.Object filter_;
  /**
   * <code>optional string filter = 2;</code>
   *
   * <pre>
   * Optional. An [advanced logs filter](/logging/docs/view/advanced_filters).
   * The response includes only entries that match the filter.
   * If `filter` is empty, then all entries in all logs are retrieved.
   * </pre>
   */
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <code>optional string filter = 2;</code>
   *
   * <pre>
   * Optional. An [advanced logs filter](/logging/docs/view/advanced_filters).
   * The response includes only entries that match the filter.
   * If `filter` is empty, then all entries in all logs are retrieved.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDER_BY_FIELD_NUMBER = 3;
  private volatile java.lang.Object orderBy_;
  /**
   * <code>optional string order_by = 3;</code>
   *
   * <pre>
   * Optional. How the results should be sorted.  Presently, the only permitted
   * values are `"timestamp"` (default) and `"timestamp desc"`.  The first
   * option returns entries in order of increasing values of
   * `LogEntry.timestamp` (oldest first), and the second option returns entries
   * in order of decreasing timestamps (newest first).  Entries with equal
   * timestamps will be returned in order of `LogEntry.insertId`.
   * </pre>
   */
  public java.lang.String getOrderBy() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderBy_ = s;
      return s;
    }
  }
  /**
   * <code>optional string order_by = 3;</code>
   *
   * <pre>
   * Optional. How the results should be sorted.  Presently, the only permitted
   * values are `"timestamp"` (default) and `"timestamp desc"`.  The first
   * option returns entries in order of increasing values of
   * `LogEntry.timestamp` (oldest first), and the second option returns entries
   * in order of decreasing timestamps (newest first).  Entries with equal
   * timestamps will be returned in order of `LogEntry.insertId`.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getOrderByBytes() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderBy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object resumeToken_;
  /**
   * <code>optional string resume_token = 4;</code>
   *
   * <pre>
   * Optional. If the `resumeToken` request parameter is supplied, then the next
   * page of results in the set are retrieved.  The `resumeToken` request
   * parameter must be set with the value of the `resumeToken` result parameter
   * from the previous request.
   * </pre>
   */
  public java.lang.String getResumeToken() {
    java.lang.Object ref = resumeToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resumeToken_ = s;
      return s;
    }
  }
  /**
   * <code>optional string resume_token = 4;</code>
   *
   * <pre>
   * Optional. If the `resumeToken` request parameter is supplied, then the next
   * page of results in the set are retrieved.  The `resumeToken` request
   * parameter must be set with the value of the `resumeToken` result parameter
   * from the previous request.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getResumeTokenBytes() {
    java.lang.Object ref = resumeToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resumeToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < projectIds_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, projectIds_.getRaw(i));
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, filter_);
    }
    if (!getOrderByBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, orderBy_);
    }
    if (!getResumeTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, resumeToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < projectIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(projectIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProjectIdsList().size();
    }
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, filter_);
    }
    if (!getOrderByBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, orderBy_);
    }
    if (!getResumeTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, resumeToken_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.logging.v2.ReadLogEntriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.logging.v2.ReadLogEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.logging.v2.ReadLogEntriesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.logging.v2.ReadLogEntriesRequest}
   *
   * <pre>
   * The parameters to `ReadLogEntries`.
   * There are two different use cases for streaming:
   * 1.  To return a very large result set. The request eventually
   *     completes when all entries have been returned.
   * 2.  To "tail" a log stream, returning new entries as they arrive.
   *     In this case, the request never completes.
   * Only the first use case is supported.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.ReadLogEntriesRequest)
      com.google.logging.v2.ReadLogEntriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_ReadLogEntriesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_ReadLogEntriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.ReadLogEntriesRequest.class, com.google.logging.v2.ReadLogEntriesRequest.Builder.class);
    }

    // Construct using com.google.logging.v2.ReadLogEntriesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      projectIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      filter_ = "";

      orderBy_ = "";

      resumeToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v2.LoggingProto.internal_static_google_logging_v2_ReadLogEntriesRequest_descriptor;
    }

    public com.google.logging.v2.ReadLogEntriesRequest getDefaultInstanceForType() {
      return com.google.logging.v2.ReadLogEntriesRequest.getDefaultInstance();
    }

    public com.google.logging.v2.ReadLogEntriesRequest build() {
      com.google.logging.v2.ReadLogEntriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.logging.v2.ReadLogEntriesRequest buildPartial() {
      com.google.logging.v2.ReadLogEntriesRequest result = new com.google.logging.v2.ReadLogEntriesRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        projectIds_ = projectIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.projectIds_ = projectIds_;
      result.filter_ = filter_;
      result.orderBy_ = orderBy_;
      result.resumeToken_ = resumeToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.ReadLogEntriesRequest) {
        return mergeFrom((com.google.logging.v2.ReadLogEntriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.ReadLogEntriesRequest other) {
      if (other == com.google.logging.v2.ReadLogEntriesRequest.getDefaultInstance()) return this;
      if (!other.projectIds_.isEmpty()) {
        if (projectIds_.isEmpty()) {
          projectIds_ = other.projectIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureProjectIdsIsMutable();
          projectIds_.addAll(other.projectIds_);
        }
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (!other.getOrderBy().isEmpty()) {
        orderBy_ = other.orderBy_;
        onChanged();
      }
      if (!other.getResumeToken().isEmpty()) {
        resumeToken_ = other.resumeToken_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.logging.v2.ReadLogEntriesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.ReadLogEntriesRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList projectIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureProjectIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        projectIds_ = new com.google.protobuf.LazyStringArrayList(projectIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getProjectIdsList() {
      return projectIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public int getProjectIdsCount() {
      return projectIds_.size();
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public java.lang.String getProjectIds(int index) {
      return projectIds_.get(index);
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getProjectIdsBytes(int index) {
      return projectIds_.getByteString(index);
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public Builder setProjectIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProjectIdsIsMutable();
      projectIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public Builder addProjectIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProjectIdsIsMutable();
      projectIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public Builder addAllProjectIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureProjectIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, projectIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public Builder clearProjectIds() {
      projectIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string project_ids = 1;</code>
     *
     * <pre>
     * Required. A list of project ids from which to retrieve log entries.
     * Example: `"my-project-id"`.
     * </pre>
     */
    public Builder addProjectIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureProjectIdsIsMutable();
      projectIds_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <code>optional string filter = 2;</code>
     *
     * <pre>
     * Optional. An [advanced logs filter](/logging/docs/view/advanced_filters).
     * The response includes only entries that match the filter.
     * If `filter` is empty, then all entries in all logs are retrieved.
     * </pre>
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string filter = 2;</code>
     *
     * <pre>
     * Optional. An [advanced logs filter](/logging/docs/view/advanced_filters).
     * The response includes only entries that match the filter.
     * If `filter` is empty, then all entries in all logs are retrieved.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string filter = 2;</code>
     *
     * <pre>
     * Optional. An [advanced logs filter](/logging/docs/view/advanced_filters).
     * The response includes only entries that match the filter.
     * If `filter` is empty, then all entries in all logs are retrieved.
     * </pre>
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string filter = 2;</code>
     *
     * <pre>
     * Optional. An [advanced logs filter](/logging/docs/view/advanced_filters).
     * The response includes only entries that match the filter.
     * If `filter` is empty, then all entries in all logs are retrieved.
     * </pre>
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <code>optional string filter = 2;</code>
     *
     * <pre>
     * Optional. An [advanced logs filter](/logging/docs/view/advanced_filters).
     * The response includes only entries that match the filter.
     * If `filter` is empty, then all entries in all logs are retrieved.
     * </pre>
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object orderBy_ = "";
    /**
     * <code>optional string order_by = 3;</code>
     *
     * <pre>
     * Optional. How the results should be sorted.  Presently, the only permitted
     * values are `"timestamp"` (default) and `"timestamp desc"`.  The first
     * option returns entries in order of increasing values of
     * `LogEntry.timestamp` (oldest first), and the second option returns entries
     * in order of decreasing timestamps (newest first).  Entries with equal
     * timestamps will be returned in order of `LogEntry.insertId`.
     * </pre>
     */
    public java.lang.String getOrderBy() {
      java.lang.Object ref = orderBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string order_by = 3;</code>
     *
     * <pre>
     * Optional. How the results should be sorted.  Presently, the only permitted
     * values are `"timestamp"` (default) and `"timestamp desc"`.  The first
     * option returns entries in order of increasing values of
     * `LogEntry.timestamp` (oldest first), and the second option returns entries
     * in order of decreasing timestamps (newest first).  Entries with equal
     * timestamps will be returned in order of `LogEntry.insertId`.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getOrderByBytes() {
      java.lang.Object ref = orderBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string order_by = 3;</code>
     *
     * <pre>
     * Optional. How the results should be sorted.  Presently, the only permitted
     * values are `"timestamp"` (default) and `"timestamp desc"`.  The first
     * option returns entries in order of increasing values of
     * `LogEntry.timestamp` (oldest first), and the second option returns entries
     * in order of decreasing timestamps (newest first).  Entries with equal
     * timestamps will be returned in order of `LogEntry.insertId`.
     * </pre>
     */
    public Builder setOrderBy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string order_by = 3;</code>
     *
     * <pre>
     * Optional. How the results should be sorted.  Presently, the only permitted
     * values are `"timestamp"` (default) and `"timestamp desc"`.  The first
     * option returns entries in order of increasing values of
     * `LogEntry.timestamp` (oldest first), and the second option returns entries
     * in order of decreasing timestamps (newest first).  Entries with equal
     * timestamps will be returned in order of `LogEntry.insertId`.
     * </pre>
     */
    public Builder clearOrderBy() {
      
      orderBy_ = getDefaultInstance().getOrderBy();
      onChanged();
      return this;
    }
    /**
     * <code>optional string order_by = 3;</code>
     *
     * <pre>
     * Optional. How the results should be sorted.  Presently, the only permitted
     * values are `"timestamp"` (default) and `"timestamp desc"`.  The first
     * option returns entries in order of increasing values of
     * `LogEntry.timestamp` (oldest first), and the second option returns entries
     * in order of decreasing timestamps (newest first).  Entries with equal
     * timestamps will be returned in order of `LogEntry.insertId`.
     * </pre>
     */
    public Builder setOrderByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderBy_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resumeToken_ = "";
    /**
     * <code>optional string resume_token = 4;</code>
     *
     * <pre>
     * Optional. If the `resumeToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `resumeToken` request
     * parameter must be set with the value of the `resumeToken` result parameter
     * from the previous request.
     * </pre>
     */
    public java.lang.String getResumeToken() {
      java.lang.Object ref = resumeToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resumeToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string resume_token = 4;</code>
     *
     * <pre>
     * Optional. If the `resumeToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `resumeToken` request
     * parameter must be set with the value of the `resumeToken` result parameter
     * from the previous request.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getResumeTokenBytes() {
      java.lang.Object ref = resumeToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resumeToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string resume_token = 4;</code>
     *
     * <pre>
     * Optional. If the `resumeToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `resumeToken` request
     * parameter must be set with the value of the `resumeToken` result parameter
     * from the previous request.
     * </pre>
     */
    public Builder setResumeToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resumeToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string resume_token = 4;</code>
     *
     * <pre>
     * Optional. If the `resumeToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `resumeToken` request
     * parameter must be set with the value of the `resumeToken` result parameter
     * from the previous request.
     * </pre>
     */
    public Builder clearResumeToken() {
      
      resumeToken_ = getDefaultInstance().getResumeToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string resume_token = 4;</code>
     *
     * <pre>
     * Optional. If the `resumeToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `resumeToken` request
     * parameter must be set with the value of the `resumeToken` result parameter
     * from the previous request.
     * </pre>
     */
    public Builder setResumeTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resumeToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.logging.v2.ReadLogEntriesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.ReadLogEntriesRequest)
  private static final com.google.logging.v2.ReadLogEntriesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.ReadLogEntriesRequest();
  }

  public static com.google.logging.v2.ReadLogEntriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadLogEntriesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReadLogEntriesRequest>() {
    public ReadLogEntriesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ReadLogEntriesRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ReadLogEntriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadLogEntriesRequest> getParserForType() {
    return PARSER;
  }

  public com.google.logging.v2.ReadLogEntriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

