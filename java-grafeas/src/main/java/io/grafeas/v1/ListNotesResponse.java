/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Response for listing notes.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.ListNotesResponse}
 */
public final class ListNotesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.ListNotesResponse)
    ListNotesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListNotesResponse.newBuilder() to construct.
  private ListNotesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListNotesResponse() {
    notes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListNotesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.GrafeasOuterClass.internal_static_grafeas_v1_ListNotesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.GrafeasOuterClass
        .internal_static_grafeas_v1_ListNotesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.ListNotesResponse.class, io.grafeas.v1.ListNotesResponse.Builder.class);
  }

  public static final int NOTES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<io.grafeas.v1.Note> notes_;
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grafeas.v1.Note> getNotesList() {
    return notes_;
  }
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grafeas.v1.NoteOrBuilder> getNotesOrBuilderList() {
    return notes_;
  }
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  @java.lang.Override
  public int getNotesCount() {
    return notes_.size();
  }
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.Note getNotes(int index) {
    return notes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.NoteOrBuilder getNotesOrBuilder(int index) {
    return notes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
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
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
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
    for (int i = 0; i < notes_.size(); i++) {
      output.writeMessage(1, notes_.get(i));
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
    for (int i = 0; i < notes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, notes_.get(i));
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
    if (!(obj instanceof io.grafeas.v1.ListNotesResponse)) {
      return super.equals(obj);
    }
    io.grafeas.v1.ListNotesResponse other = (io.grafeas.v1.ListNotesResponse) obj;

    if (!getNotesList().equals(other.getNotesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getNotesCount() > 0) {
      hash = (37 * hash) + NOTES_FIELD_NUMBER;
      hash = (53 * hash) + getNotesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.ListNotesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ListNotesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ListNotesResponse parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.ListNotesResponse prototype) {
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
   * Response for listing notes.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.ListNotesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.ListNotesResponse)
      io.grafeas.v1.ListNotesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_ListNotesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_ListNotesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.ListNotesResponse.class, io.grafeas.v1.ListNotesResponse.Builder.class);
    }

    // Construct using io.grafeas.v1.ListNotesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (notesBuilder_ == null) {
        notes_ = java.util.Collections.emptyList();
      } else {
        notes_ = null;
        notesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_ListNotesResponse_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.ListNotesResponse getDefaultInstanceForType() {
      return io.grafeas.v1.ListNotesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.ListNotesResponse build() {
      io.grafeas.v1.ListNotesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.ListNotesResponse buildPartial() {
      io.grafeas.v1.ListNotesResponse result = new io.grafeas.v1.ListNotesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.grafeas.v1.ListNotesResponse result) {
      if (notesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          notes_ = java.util.Collections.unmodifiableList(notes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.notes_ = notes_;
      } else {
        result.notes_ = notesBuilder_.build();
      }
    }

    private void buildPartial0(io.grafeas.v1.ListNotesResponse result) {
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
      if (other instanceof io.grafeas.v1.ListNotesResponse) {
        return mergeFrom((io.grafeas.v1.ListNotesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.ListNotesResponse other) {
      if (other == io.grafeas.v1.ListNotesResponse.getDefaultInstance()) return this;
      if (notesBuilder_ == null) {
        if (!other.notes_.isEmpty()) {
          if (notes_.isEmpty()) {
            notes_ = other.notes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNotesIsMutable();
            notes_.addAll(other.notes_);
          }
          onChanged();
        }
      } else {
        if (!other.notes_.isEmpty()) {
          if (notesBuilder_.isEmpty()) {
            notesBuilder_.dispose();
            notesBuilder_ = null;
            notes_ = other.notes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            notesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNotesFieldBuilder()
                    : null;
          } else {
            notesBuilder_.addAllMessages(other.notes_);
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
            case 10:
              {
                io.grafeas.v1.Note m =
                    input.readMessage(io.grafeas.v1.Note.parser(), extensionRegistry);
                if (notesBuilder_ == null) {
                  ensureNotesIsMutable();
                  notes_.add(m);
                } else {
                  notesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.util.List<io.grafeas.v1.Note> notes_ = java.util.Collections.emptyList();

    private void ensureNotesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        notes_ = new java.util.ArrayList<io.grafeas.v1.Note>(notes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Note, io.grafeas.v1.Note.Builder, io.grafeas.v1.NoteOrBuilder>
        notesBuilder_;

    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public java.util.List<io.grafeas.v1.Note> getNotesList() {
      if (notesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(notes_);
      } else {
        return notesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public int getNotesCount() {
      if (notesBuilder_ == null) {
        return notes_.size();
      } else {
        return notesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public io.grafeas.v1.Note getNotes(int index) {
      if (notesBuilder_ == null) {
        return notes_.get(index);
      } else {
        return notesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder setNotes(int index, io.grafeas.v1.Note value) {
      if (notesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotesIsMutable();
        notes_.set(index, value);
        onChanged();
      } else {
        notesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder setNotes(int index, io.grafeas.v1.Note.Builder builderForValue) {
      if (notesBuilder_ == null) {
        ensureNotesIsMutable();
        notes_.set(index, builderForValue.build());
        onChanged();
      } else {
        notesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder addNotes(io.grafeas.v1.Note value) {
      if (notesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotesIsMutable();
        notes_.add(value);
        onChanged();
      } else {
        notesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder addNotes(int index, io.grafeas.v1.Note value) {
      if (notesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotesIsMutable();
        notes_.add(index, value);
        onChanged();
      } else {
        notesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder addNotes(io.grafeas.v1.Note.Builder builderForValue) {
      if (notesBuilder_ == null) {
        ensureNotesIsMutable();
        notes_.add(builderForValue.build());
        onChanged();
      } else {
        notesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder addNotes(int index, io.grafeas.v1.Note.Builder builderForValue) {
      if (notesBuilder_ == null) {
        ensureNotesIsMutable();
        notes_.add(index, builderForValue.build());
        onChanged();
      } else {
        notesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder addAllNotes(java.lang.Iterable<? extends io.grafeas.v1.Note> values) {
      if (notesBuilder_ == null) {
        ensureNotesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, notes_);
        onChanged();
      } else {
        notesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder clearNotes() {
      if (notesBuilder_ == null) {
        notes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        notesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public Builder removeNotes(int index) {
      if (notesBuilder_ == null) {
        ensureNotesIsMutable();
        notes_.remove(index);
        onChanged();
      } else {
        notesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public io.grafeas.v1.Note.Builder getNotesBuilder(int index) {
      return getNotesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public io.grafeas.v1.NoteOrBuilder getNotesOrBuilder(int index) {
      if (notesBuilder_ == null) {
        return notes_.get(index);
      } else {
        return notesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public java.util.List<? extends io.grafeas.v1.NoteOrBuilder> getNotesOrBuilderList() {
      if (notesBuilder_ != null) {
        return notesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(notes_);
      }
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public io.grafeas.v1.Note.Builder addNotesBuilder() {
      return getNotesFieldBuilder().addBuilder(io.grafeas.v1.Note.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public io.grafeas.v1.Note.Builder addNotesBuilder(int index) {
      return getNotesFieldBuilder().addBuilder(index, io.grafeas.v1.Note.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The notes requested.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Note notes = 1;</code>
     */
    public java.util.List<io.grafeas.v1.Note.Builder> getNotesBuilderList() {
      return getNotesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Note, io.grafeas.v1.Note.Builder, io.grafeas.v1.NoteOrBuilder>
        getNotesFieldBuilder() {
      if (notesBuilder_ == null) {
        notesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                io.grafeas.v1.Note, io.grafeas.v1.Note.Builder, io.grafeas.v1.NoteOrBuilder>(
                notes_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        notes_ = null;
      }
      return notesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
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
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
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
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The next pagination token in the list response. It should be used as
     * `page_token` for the following request. An empty value means no more
     * results.
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
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.ListNotesResponse)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.ListNotesResponse)
  private static final io.grafeas.v1.ListNotesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.ListNotesResponse();
  }

  public static io.grafeas.v1.ListNotesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNotesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListNotesResponse>() {
        @java.lang.Override
        public ListNotesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNotesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNotesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.ListNotesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
