// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/projects.proto

package com.google.cloud.resourcemanager.v3;

/**
 * <pre>
 * A page of the response received from the
 * [SearchProjects][google.cloud.resourcemanager.v3.Projects.SearchProjects]
 * method.
 * A paginated response where more pages are available has
 * `next_page_token` set. This token can be used in a subsequent request to
 * retrieve the next request page.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.SearchProjectsResponse}
 */
public final class SearchProjectsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.SearchProjectsResponse)
    SearchProjectsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchProjectsResponse.newBuilder() to construct.
  private SearchProjectsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchProjectsResponse() {
    projects_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchProjectsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.SearchProjectsResponse.class, com.google.cloud.resourcemanager.v3.SearchProjectsResponse.Builder.class);
  }

  public static final int PROJECTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.resourcemanager.v3.Project> projects_;
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.resourcemanager.v3.Project> getProjectsList() {
    return projects_;
  }
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.resourcemanager.v3.ProjectOrBuilder> 
      getProjectsOrBuilderList() {
    return projects_;
  }
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  @java.lang.Override
  public int getProjectsCount() {
    return projects_.size();
  }
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.Project getProjects(int index) {
    return projects_.get(index);
  }
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.ProjectOrBuilder getProjectsOrBuilder(
      int index) {
    return projects_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Pagination token.
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   * Pagination tokens have a limited lifetime.
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
   * Pagination token.
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   * Pagination tokens have a limited lifetime.
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
    for (int i = 0; i < projects_.size(); i++) {
      output.writeMessage(1, projects_.get(i));
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
    for (int i = 0; i < projects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, projects_.get(i));
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.SearchProjectsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.SearchProjectsResponse other = (com.google.cloud.resourcemanager.v3.SearchProjectsResponse) obj;

    if (!getProjectsList()
        .equals(other.getProjectsList())) return false;
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
    if (getProjectsCount() > 0) {
      hash = (37 * hash) + PROJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getProjectsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.resourcemanager.v3.SearchProjectsResponse prototype) {
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
   * A page of the response received from the
   * [SearchProjects][google.cloud.resourcemanager.v3.Projects.SearchProjects]
   * method.
   * A paginated response where more pages are available has
   * `next_page_token` set. This token can be used in a subsequent request to
   * retrieve the next request page.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.SearchProjectsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.SearchProjectsResponse)
      com.google.cloud.resourcemanager.v3.SearchProjectsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.SearchProjectsResponse.class, com.google.cloud.resourcemanager.v3.SearchProjectsResponse.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.SearchProjectsResponse.newBuilder()
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
      if (projectsBuilder_ == null) {
        projects_ = java.util.Collections.emptyList();
      } else {
        projects_ = null;
        projectsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_SearchProjectsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.SearchProjectsResponse getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.SearchProjectsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.SearchProjectsResponse build() {
      com.google.cloud.resourcemanager.v3.SearchProjectsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.SearchProjectsResponse buildPartial() {
      com.google.cloud.resourcemanager.v3.SearchProjectsResponse result = new com.google.cloud.resourcemanager.v3.SearchProjectsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.resourcemanager.v3.SearchProjectsResponse result) {
      if (projectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          projects_ = java.util.Collections.unmodifiableList(projects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.projects_ = projects_;
      } else {
        result.projects_ = projectsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v3.SearchProjectsResponse result) {
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
      if (other instanceof com.google.cloud.resourcemanager.v3.SearchProjectsResponse) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.SearchProjectsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.SearchProjectsResponse other) {
      if (other == com.google.cloud.resourcemanager.v3.SearchProjectsResponse.getDefaultInstance()) return this;
      if (projectsBuilder_ == null) {
        if (!other.projects_.isEmpty()) {
          if (projects_.isEmpty()) {
            projects_ = other.projects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProjectsIsMutable();
            projects_.addAll(other.projects_);
          }
          onChanged();
        }
      } else {
        if (!other.projects_.isEmpty()) {
          if (projectsBuilder_.isEmpty()) {
            projectsBuilder_.dispose();
            projectsBuilder_ = null;
            projects_ = other.projects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            projectsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProjectsFieldBuilder() : null;
          } else {
            projectsBuilder_.addAllMessages(other.projects_);
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
              com.google.cloud.resourcemanager.v3.Project m =
                  input.readMessage(
                      com.google.cloud.resourcemanager.v3.Project.parser(),
                      extensionRegistry);
              if (projectsBuilder_ == null) {
                ensureProjectsIsMutable();
                projects_.add(m);
              } else {
                projectsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.resourcemanager.v3.Project> projects_ =
      java.util.Collections.emptyList();
    private void ensureProjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        projects_ = new java.util.ArrayList<com.google.cloud.resourcemanager.v3.Project>(projects_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.resourcemanager.v3.Project, com.google.cloud.resourcemanager.v3.Project.Builder, com.google.cloud.resourcemanager.v3.ProjectOrBuilder> projectsBuilder_;

    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcemanager.v3.Project> getProjectsList() {
      if (projectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(projects_);
      } else {
        return projectsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public int getProjectsCount() {
      if (projectsBuilder_ == null) {
        return projects_.size();
      } else {
        return projectsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.Project getProjects(int index) {
      if (projectsBuilder_ == null) {
        return projects_.get(index);
      } else {
        return projectsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder setProjects(
        int index, com.google.cloud.resourcemanager.v3.Project value) {
      if (projectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectsIsMutable();
        projects_.set(index, value);
        onChanged();
      } else {
        projectsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder setProjects(
        int index, com.google.cloud.resourcemanager.v3.Project.Builder builderForValue) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        projects_.set(index, builderForValue.build());
        onChanged();
      } else {
        projectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder addProjects(com.google.cloud.resourcemanager.v3.Project value) {
      if (projectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectsIsMutable();
        projects_.add(value);
        onChanged();
      } else {
        projectsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder addProjects(
        int index, com.google.cloud.resourcemanager.v3.Project value) {
      if (projectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectsIsMutable();
        projects_.add(index, value);
        onChanged();
      } else {
        projectsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder addProjects(
        com.google.cloud.resourcemanager.v3.Project.Builder builderForValue) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        projects_.add(builderForValue.build());
        onChanged();
      } else {
        projectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder addProjects(
        int index, com.google.cloud.resourcemanager.v3.Project.Builder builderForValue) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        projects_.add(index, builderForValue.build());
        onChanged();
      } else {
        projectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder addAllProjects(
        java.lang.Iterable<? extends com.google.cloud.resourcemanager.v3.Project> values) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, projects_);
        onChanged();
      } else {
        projectsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder clearProjects() {
      if (projectsBuilder_ == null) {
        projects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        projectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public Builder removeProjects(int index) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        projects_.remove(index);
        onChanged();
      } else {
        projectsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.Project.Builder getProjectsBuilder(
        int index) {
      return getProjectsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.ProjectOrBuilder getProjectsOrBuilder(
        int index) {
      if (projectsBuilder_ == null) {
        return projects_.get(index);  } else {
        return projectsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.resourcemanager.v3.ProjectOrBuilder> 
         getProjectsOrBuilderList() {
      if (projectsBuilder_ != null) {
        return projectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(projects_);
      }
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.Project.Builder addProjectsBuilder() {
      return getProjectsFieldBuilder().addBuilder(
          com.google.cloud.resourcemanager.v3.Project.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.Project.Builder addProjectsBuilder(
        int index) {
      return getProjectsFieldBuilder().addBuilder(
          index, com.google.cloud.resourcemanager.v3.Project.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of Projects that matched the list filter query. This list can
     * be paginated.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcemanager.v3.Project.Builder> 
         getProjectsBuilderList() {
      return getProjectsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.resourcemanager.v3.Project, com.google.cloud.resourcemanager.v3.Project.Builder, com.google.cloud.resourcemanager.v3.ProjectOrBuilder> 
        getProjectsFieldBuilder() {
      if (projectsBuilder_ == null) {
        projectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.Project, com.google.cloud.resourcemanager.v3.Project.Builder, com.google.cloud.resourcemanager.v3.ProjectOrBuilder>(
                projects_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        projects_ = null;
      }
      return projectsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Pagination token.
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     * Pagination tokens have a limited lifetime.
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
     * Pagination token.
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     * Pagination tokens have a limited lifetime.
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
     * Pagination token.
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     * Pagination tokens have a limited lifetime.
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
     * Pagination token.
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     * Pagination tokens have a limited lifetime.
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
     * Pagination token.
     * If the result set is too large to fit in a single response, this token
     * is returned. It encodes the position of the current result cursor.
     * Feeding this value into a new list request with the `page_token` parameter
     * gives the next page of the results.
     * When `next_page_token` is not filled in, there is no next page and
     * the list returned is the last page in the result set.
     * Pagination tokens have a limited lifetime.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.SearchProjectsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.SearchProjectsResponse)
  private static final com.google.cloud.resourcemanager.v3.SearchProjectsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.SearchProjectsResponse();
  }

  public static com.google.cloud.resourcemanager.v3.SearchProjectsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchProjectsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchProjectsResponse>() {
    @java.lang.Override
    public SearchProjectsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchProjectsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchProjectsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.SearchProjectsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

