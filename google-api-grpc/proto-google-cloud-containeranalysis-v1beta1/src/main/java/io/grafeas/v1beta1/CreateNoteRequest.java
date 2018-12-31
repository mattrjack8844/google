// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

/**
 *
 *
 * <pre>
 * Request to create a new note.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.CreateNoteRequest}
 */
public final class CreateNoteRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.CreateNoteRequest)
    CreateNoteRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateNoteRequest.newBuilder() to construct.
  private CreateNoteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateNoteRequest() {
    parent_ = "";
    noteId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateNoteRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              noteId_ = s;
              break;
            }
          case 26:
            {
              io.grafeas.v1beta1.Note.Builder subBuilder = null;
              if (note_ != null) {
                subBuilder = note_.toBuilder();
              }
              note_ = input.readMessage(io.grafeas.v1beta1.Note.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(note_);
                note_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_CreateNoteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.Grafeas
        .internal_static_grafeas_v1beta1_CreateNoteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.CreateNoteRequest.class,
            io.grafeas.v1beta1.CreateNoteRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the note is to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
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
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the note is to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
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

  public static final int NOTE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object noteId_;
  /**
   *
   *
   * <pre>
   * The ID to use for this note.
   * </pre>
   *
   * <code>string note_id = 2;</code>
   */
  public java.lang.String getNoteId() {
    java.lang.Object ref = noteId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      noteId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID to use for this note.
   * </pre>
   *
   * <code>string note_id = 2;</code>
   */
  public com.google.protobuf.ByteString getNoteIdBytes() {
    java.lang.Object ref = noteId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      noteId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTE_FIELD_NUMBER = 3;
  private io.grafeas.v1beta1.Note note_;
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 3;</code>
   */
  public boolean hasNote() {
    return note_ != null;
  }
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 3;</code>
   */
  public io.grafeas.v1beta1.Note getNote() {
    return note_ == null ? io.grafeas.v1beta1.Note.getDefaultInstance() : note_;
  }
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 3;</code>
   */
  public io.grafeas.v1beta1.NoteOrBuilder getNoteOrBuilder() {
    return getNote();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getNoteIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, noteId_);
    }
    if (note_ != null) {
      output.writeMessage(3, getNote());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getNoteIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, noteId_);
    }
    if (note_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getNote());
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
    if (!(obj instanceof io.grafeas.v1beta1.CreateNoteRequest)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.CreateNoteRequest other = (io.grafeas.v1beta1.CreateNoteRequest) obj;

    boolean result = true;
    result = result && getParent().equals(other.getParent());
    result = result && getNoteId().equals(other.getNoteId());
    result = result && (hasNote() == other.hasNote());
    if (hasNote()) {
      result = result && getNote().equals(other.getNote());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
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
    hash = (37 * hash) + NOTE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNoteId().hashCode();
    if (hasNote()) {
      hash = (37 * hash) + NOTE_FIELD_NUMBER;
      hash = (53 * hash) + getNote().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.CreateNoteRequest parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.CreateNoteRequest prototype) {
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
   * Request to create a new note.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.CreateNoteRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.CreateNoteRequest)
      io.grafeas.v1beta1.CreateNoteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_CreateNoteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_CreateNoteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.CreateNoteRequest.class,
              io.grafeas.v1beta1.CreateNoteRequest.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.CreateNoteRequest.newBuilder()
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

      noteId_ = "";

      if (noteBuilder_ == null) {
        note_ = null;
      } else {
        note_ = null;
        noteBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_CreateNoteRequest_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.CreateNoteRequest getDefaultInstanceForType() {
      return io.grafeas.v1beta1.CreateNoteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.CreateNoteRequest build() {
      io.grafeas.v1beta1.CreateNoteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.CreateNoteRequest buildPartial() {
      io.grafeas.v1beta1.CreateNoteRequest result = new io.grafeas.v1beta1.CreateNoteRequest(this);
      result.parent_ = parent_;
      result.noteId_ = noteId_;
      if (noteBuilder_ == null) {
        result.note_ = note_;
      } else {
        result.note_ = noteBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.CreateNoteRequest) {
        return mergeFrom((io.grafeas.v1beta1.CreateNoteRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.CreateNoteRequest other) {
      if (other == io.grafeas.v1beta1.CreateNoteRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getNoteId().isEmpty()) {
        noteId_ = other.noteId_;
        onChanged();
      }
      if (other.hasNote()) {
        mergeNote(other.getNote());
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
      io.grafeas.v1beta1.CreateNoteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.CreateNoteRequest) e.getUnfinishedMessage();
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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

    private java.lang.Object noteId_ = "";
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2;</code>
     */
    public java.lang.String getNoteId() {
      java.lang.Object ref = noteId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        noteId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2;</code>
     */
    public com.google.protobuf.ByteString getNoteIdBytes() {
      java.lang.Object ref = noteId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        noteId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2;</code>
     */
    public Builder setNoteId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      noteId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2;</code>
     */
    public Builder clearNoteId() {

      noteId_ = getDefaultInstance().getNoteId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2;</code>
     */
    public Builder setNoteIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      noteId_ = value;
      onChanged();
      return this;
    }

    private io.grafeas.v1beta1.Note note_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.Note,
            io.grafeas.v1beta1.Note.Builder,
            io.grafeas.v1beta1.NoteOrBuilder>
        noteBuilder_;
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    public boolean hasNote() {
      return noteBuilder_ != null || note_ != null;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    public io.grafeas.v1beta1.Note getNote() {
      if (noteBuilder_ == null) {
        return note_ == null ? io.grafeas.v1beta1.Note.getDefaultInstance() : note_;
      } else {
        return noteBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    public Builder setNote(io.grafeas.v1beta1.Note value) {
      if (noteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        note_ = value;
        onChanged();
      } else {
        noteBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    public Builder setNote(io.grafeas.v1beta1.Note.Builder builderForValue) {
      if (noteBuilder_ == null) {
        note_ = builderForValue.build();
        onChanged();
      } else {
        noteBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    public Builder mergeNote(io.grafeas.v1beta1.Note value) {
      if (noteBuilder_ == null) {
        if (note_ != null) {
          note_ = io.grafeas.v1beta1.Note.newBuilder(note_).mergeFrom(value).buildPartial();
        } else {
          note_ = value;
        }
        onChanged();
      } else {
        noteBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    public Builder clearNote() {
      if (noteBuilder_ == null) {
        note_ = null;
        onChanged();
      } else {
        note_ = null;
        noteBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    public io.grafeas.v1beta1.Note.Builder getNoteBuilder() {

      onChanged();
      return getNoteFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    public io.grafeas.v1beta1.NoteOrBuilder getNoteOrBuilder() {
      if (noteBuilder_ != null) {
        return noteBuilder_.getMessageOrBuilder();
      } else {
        return note_ == null ? io.grafeas.v1beta1.Note.getDefaultInstance() : note_;
      }
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.Note,
            io.grafeas.v1beta1.Note.Builder,
            io.grafeas.v1beta1.NoteOrBuilder>
        getNoteFieldBuilder() {
      if (noteBuilder_ == null) {
        noteBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1beta1.Note,
                io.grafeas.v1beta1.Note.Builder,
                io.grafeas.v1beta1.NoteOrBuilder>(getNote(), getParentForChildren(), isClean());
        note_ = null;
      }
      return noteBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.CreateNoteRequest)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.CreateNoteRequest)
  private static final io.grafeas.v1beta1.CreateNoteRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.CreateNoteRequest();
  }

  public static io.grafeas.v1beta1.CreateNoteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNoteRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateNoteRequest>() {
        @java.lang.Override
        public CreateNoteRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateNoteRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateNoteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNoteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.CreateNoteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
