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
// source: google/devtools/clouddebugger/v2/data.proto

package com.google.devtools.clouddebugger.v2;

/**
 *
 *
 * <pre>
 * Represents a location in the source code.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.SourceLocation}
 */
public final class SourceLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.SourceLocation)
    SourceLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceLocation.newBuilder() to construct.
  private SourceLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceLocation() {
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceLocation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SourceLocation(
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

              path_ = s;
              break;
            }
          case 16:
            {
              line_ = input.readInt32();
              break;
            }
          case 24:
            {
              column_ = input.readInt32();
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
    return com.google.devtools.clouddebugger.v2.DataProto
        .internal_static_google_devtools_clouddebugger_v2_SourceLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DataProto
        .internal_static_google_devtools_clouddebugger_v2_SourceLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.SourceLocation.class,
            com.google.devtools.clouddebugger.v2.SourceLocation.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object path_;
  /**
   *
   *
   * <pre>
   * Path to the source file within the source context of the target binary.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Path to the source file within the source context of the target binary.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_FIELD_NUMBER = 2;
  private int line_;
  /**
   *
   *
   * <pre>
   * Line inside the file. The first line in the file has the value `1`.
   * </pre>
   *
   * <code>int32 line = 2;</code>
   *
   * @return The line.
   */
  @java.lang.Override
  public int getLine() {
    return line_;
  }

  public static final int COLUMN_FIELD_NUMBER = 3;
  private int column_;
  /**
   *
   *
   * <pre>
   * Column within a line. The first column in a line as the value `1`.
   * Agents that do not support setting breakpoints on specific columns ignore
   * this field.
   * </pre>
   *
   * <code>int32 column = 3;</code>
   *
   * @return The column.
   */
  @java.lang.Override
  public int getColumn() {
    return column_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (line_ != 0) {
      output.writeInt32(2, line_);
    }
    if (column_ != 0) {
      output.writeInt32(3, column_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (line_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, line_);
    }
    if (column_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, column_);
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.SourceLocation)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.SourceLocation other =
        (com.google.devtools.clouddebugger.v2.SourceLocation) obj;

    if (!getPath().equals(other.getPath())) return false;
    if (getLine() != other.getLine()) return false;
    if (getColumn() != other.getColumn()) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + LINE_FIELD_NUMBER;
    hash = (53 * hash) + getLine();
    hash = (37 * hash) + COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + getColumn();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation parseFrom(
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

  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.SourceLocation prototype) {
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
   * Represents a location in the source code.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.SourceLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.SourceLocation)
      com.google.devtools.clouddebugger.v2.SourceLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_SourceLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_SourceLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.SourceLocation.class,
              com.google.devtools.clouddebugger.v2.SourceLocation.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.SourceLocation.newBuilder()
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
      path_ = "";

      line_ = 0;

      column_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_SourceLocation_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.SourceLocation getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.SourceLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.SourceLocation build() {
      com.google.devtools.clouddebugger.v2.SourceLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.SourceLocation buildPartial() {
      com.google.devtools.clouddebugger.v2.SourceLocation result =
          new com.google.devtools.clouddebugger.v2.SourceLocation(this);
      result.path_ = path_;
      result.line_ = line_;
      result.column_ = column_;
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
      if (other instanceof com.google.devtools.clouddebugger.v2.SourceLocation) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.SourceLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.SourceLocation other) {
      if (other == com.google.devtools.clouddebugger.v2.SourceLocation.getDefaultInstance())
        return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (other.getLine() != 0) {
        setLine(other.getLine());
      }
      if (other.getColumn() != 0) {
        setColumn(other.getColumn());
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
      com.google.devtools.clouddebugger.v2.SourceLocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.devtools.clouddebugger.v2.SourceLocation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     *
     *
     * <pre>
     * Path to the source file within the source context of the target binary.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to the source file within the source context of the target binary.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to the source file within the source context of the target binary.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      path_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to the source file within the source context of the target binary.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPath() {

      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to the source file within the source context of the target binary.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      path_ = value;
      onChanged();
      return this;
    }

    private int line_;
    /**
     *
     *
     * <pre>
     * Line inside the file. The first line in the file has the value `1`.
     * </pre>
     *
     * <code>int32 line = 2;</code>
     *
     * @return The line.
     */
    @java.lang.Override
    public int getLine() {
      return line_;
    }
    /**
     *
     *
     * <pre>
     * Line inside the file. The first line in the file has the value `1`.
     * </pre>
     *
     * <code>int32 line = 2;</code>
     *
     * @param value The line to set.
     * @return This builder for chaining.
     */
    public Builder setLine(int value) {

      line_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Line inside the file. The first line in the file has the value `1`.
     * </pre>
     *
     * <code>int32 line = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLine() {

      line_ = 0;
      onChanged();
      return this;
    }

    private int column_;
    /**
     *
     *
     * <pre>
     * Column within a line. The first column in a line as the value `1`.
     * Agents that do not support setting breakpoints on specific columns ignore
     * this field.
     * </pre>
     *
     * <code>int32 column = 3;</code>
     *
     * @return The column.
     */
    @java.lang.Override
    public int getColumn() {
      return column_;
    }
    /**
     *
     *
     * <pre>
     * Column within a line. The first column in a line as the value `1`.
     * Agents that do not support setting breakpoints on specific columns ignore
     * this field.
     * </pre>
     *
     * <code>int32 column = 3;</code>
     *
     * @param value The column to set.
     * @return This builder for chaining.
     */
    public Builder setColumn(int value) {

      column_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Column within a line. The first column in a line as the value `1`.
     * Agents that do not support setting breakpoints on specific columns ignore
     * this field.
     * </pre>
     *
     * <code>int32 column = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearColumn() {

      column_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.SourceLocation)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.SourceLocation)
  private static final com.google.devtools.clouddebugger.v2.SourceLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.SourceLocation();
  }

  public static com.google.devtools.clouddebugger.v2.SourceLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceLocation> PARSER =
      new com.google.protobuf.AbstractParser<SourceLocation>() {
        @java.lang.Override
        public SourceLocation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SourceLocation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SourceLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.SourceLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
