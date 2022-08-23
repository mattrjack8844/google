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
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

/**
 *
 *
 * <pre>
 * The response for [ReservationService.SearchAssignments][google.cloud.bigquery.reservation.v1.ReservationService.SearchAssignments].
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse}
 */
public final class SearchAssignmentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse)
    SearchAssignmentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchAssignmentsResponse.newBuilder() to construct.
  private SearchAssignmentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchAssignmentsResponse() {
    assignments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchAssignmentsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SearchAssignmentsResponse(
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
                assignments_ =
                    new java.util.ArrayList<com.google.cloud.bigquery.reservation.v1.Assignment>();
                mutable_bitField0_ |= 0x00000001;
              }
              assignments_.add(
                  input.readMessage(
                      com.google.cloud.bigquery.reservation.v1.Assignment.parser(),
                      extensionRegistry));
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
        assignments_ = java.util.Collections.unmodifiableList(assignments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto
        .internal_static_google_cloud_bigquery_reservation_v1_SearchAssignmentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto
        .internal_static_google_cloud_bigquery_reservation_v1_SearchAssignmentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse.class,
            com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse.Builder.class);
  }

  public static final int ASSIGNMENTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.bigquery.reservation.v1.Assignment> assignments_;
  /**
   *
   *
   * <pre>
   * List of assignments visible to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.reservation.v1.Assignment> getAssignmentsList() {
    return assignments_;
  }
  /**
   *
   *
   * <pre>
   * List of assignments visible to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder>
      getAssignmentsOrBuilderList() {
    return assignments_;
  }
  /**
   *
   *
   * <pre>
   * List of assignments visible to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
   */
  @java.lang.Override
  public int getAssignmentsCount() {
    return assignments_.size();
  }
  /**
   *
   *
   * <pre>
   * List of assignments visible to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.Assignment getAssignments(int index) {
    return assignments_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of assignments visible to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder getAssignmentsOrBuilder(
      int index) {
    return assignments_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
    for (int i = 0; i < assignments_.size(); i++) {
      output.writeMessage(1, assignments_.get(i));
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
    for (int i = 0; i < assignments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, assignments_.get(i));
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
    if (!(obj instanceof com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse other =
        (com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse) obj;

    if (!getAssignmentsList().equals(other.getAssignmentsList())) return false;
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
    if (getAssignmentsCount() > 0) {
      hash = (37 * hash) + ASSIGNMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getAssignmentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parseFrom(
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
      com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse prototype) {
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
   * The response for [ReservationService.SearchAssignments][google.cloud.bigquery.reservation.v1.ReservationService.SearchAssignments].
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse)
      com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_SearchAssignmentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_SearchAssignmentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse.class,
              com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAssignmentsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (assignmentsBuilder_ == null) {
        assignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        assignmentsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_SearchAssignmentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse build() {
      com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse buildPartial() {
      com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse result =
          new com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (assignmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          assignments_ = java.util.Collections.unmodifiableList(assignments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.assignments_ = assignments_;
      } else {
        result.assignments_ = assignmentsBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse) {
        return mergeFrom(
            (com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse other) {
      if (other
          == com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse
              .getDefaultInstance()) return this;
      if (assignmentsBuilder_ == null) {
        if (!other.assignments_.isEmpty()) {
          if (assignments_.isEmpty()) {
            assignments_ = other.assignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAssignmentsIsMutable();
            assignments_.addAll(other.assignments_);
          }
          onChanged();
        }
      } else {
        if (!other.assignments_.isEmpty()) {
          if (assignmentsBuilder_.isEmpty()) {
            assignmentsBuilder_.dispose();
            assignmentsBuilder_ = null;
            assignments_ = other.assignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            assignmentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAssignmentsFieldBuilder()
                    : null;
          } else {
            assignmentsBuilder_.addAllMessages(other.assignments_);
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
      com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.bigquery.reservation.v1.Assignment> assignments_ =
        java.util.Collections.emptyList();

    private void ensureAssignmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        assignments_ =
            new java.util.ArrayList<com.google.cloud.bigquery.reservation.v1.Assignment>(
                assignments_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.reservation.v1.Assignment,
            com.google.cloud.bigquery.reservation.v1.Assignment.Builder,
            com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder>
        assignmentsBuilder_;

    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.reservation.v1.Assignment>
        getAssignmentsList() {
      if (assignmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(assignments_);
      } else {
        return assignmentsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public int getAssignmentsCount() {
      if (assignmentsBuilder_ == null) {
        return assignments_.size();
      } else {
        return assignmentsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.Assignment getAssignments(int index) {
      if (assignmentsBuilder_ == null) {
        return assignments_.get(index);
      } else {
        return assignmentsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder setAssignments(
        int index, com.google.cloud.bigquery.reservation.v1.Assignment value) {
      if (assignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssignmentsIsMutable();
        assignments_.set(index, value);
        onChanged();
      } else {
        assignmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder setAssignments(
        int index, com.google.cloud.bigquery.reservation.v1.Assignment.Builder builderForValue) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        assignments_.set(index, builderForValue.build());
        onChanged();
      } else {
        assignmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder addAssignments(com.google.cloud.bigquery.reservation.v1.Assignment value) {
      if (assignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssignmentsIsMutable();
        assignments_.add(value);
        onChanged();
      } else {
        assignmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder addAssignments(
        int index, com.google.cloud.bigquery.reservation.v1.Assignment value) {
      if (assignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssignmentsIsMutable();
        assignments_.add(index, value);
        onChanged();
      } else {
        assignmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder addAssignments(
        com.google.cloud.bigquery.reservation.v1.Assignment.Builder builderForValue) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        assignments_.add(builderForValue.build());
        onChanged();
      } else {
        assignmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder addAssignments(
        int index, com.google.cloud.bigquery.reservation.v1.Assignment.Builder builderForValue) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        assignments_.add(index, builderForValue.build());
        onChanged();
      } else {
        assignmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder addAllAssignments(
        java.lang.Iterable<? extends com.google.cloud.bigquery.reservation.v1.Assignment> values) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, assignments_);
        onChanged();
      } else {
        assignmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder clearAssignments() {
      if (assignmentsBuilder_ == null) {
        assignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        assignmentsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public Builder removeAssignments(int index) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        assignments_.remove(index);
        onChanged();
      } else {
        assignmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.Assignment.Builder getAssignmentsBuilder(
        int index) {
      return getAssignmentsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder getAssignmentsOrBuilder(
        int index) {
      if (assignmentsBuilder_ == null) {
        return assignments_.get(index);
      } else {
        return assignmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder>
        getAssignmentsOrBuilderList() {
      if (assignmentsBuilder_ != null) {
        return assignmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(assignments_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.Assignment.Builder addAssignmentsBuilder() {
      return getAssignmentsFieldBuilder()
          .addBuilder(com.google.cloud.bigquery.reservation.v1.Assignment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.Assignment.Builder addAssignmentsBuilder(
        int index) {
      return getAssignmentsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.bigquery.reservation.v1.Assignment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of assignments visible to the user.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.reservation.v1.Assignment assignments = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.reservation.v1.Assignment.Builder>
        getAssignmentsBuilderList() {
      return getAssignmentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.reservation.v1.Assignment,
            com.google.cloud.bigquery.reservation.v1.Assignment.Builder,
            com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder>
        getAssignmentsFieldBuilder() {
      if (assignmentsBuilder_ == null) {
        assignmentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.reservation.v1.Assignment,
                com.google.cloud.bigquery.reservation.v1.Assignment.Builder,
                com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder>(
                assignments_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        assignments_ = null;
      }
      return assignmentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse)
  private static final com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse();
  }

  public static com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchAssignmentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchAssignmentsResponse>() {
        @java.lang.Override
        public SearchAssignmentsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SearchAssignmentsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SearchAssignmentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchAssignmentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.SearchAssignmentsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
