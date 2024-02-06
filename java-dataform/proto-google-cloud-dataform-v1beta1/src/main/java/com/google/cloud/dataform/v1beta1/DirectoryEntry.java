/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1beta1;

/**
 *
 *
 * <pre>
 * Represents a single entry in a directory.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.DirectoryEntry}
 */
public final class DirectoryEntry extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.DirectoryEntry)
    DirectoryEntryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DirectoryEntry.newBuilder() to construct.
  private DirectoryEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DirectoryEntry() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DirectoryEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_DirectoryEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_DirectoryEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.DirectoryEntry.class,
            com.google.cloud.dataform.v1beta1.DirectoryEntry.Builder.class);
  }

  private int entryCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object entry_;

  public enum EntryCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FILE(1),
    DIRECTORY(2),
    ENTRY_NOT_SET(0);
    private final int value;

    private EntryCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EntryCase valueOf(int value) {
      return forNumber(value);
    }

    public static EntryCase forNumber(int value) {
      switch (value) {
        case 1:
          return FILE;
        case 2:
          return DIRECTORY;
        case 0:
          return ENTRY_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public EntryCase getEntryCase() {
    return EntryCase.forNumber(entryCase_);
  }

  public static final int FILE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A file in the directory.
   * </pre>
   *
   * <code>string file = 1;</code>
   *
   * @return Whether the file field is set.
   */
  public boolean hasFile() {
    return entryCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A file in the directory.
   * </pre>
   *
   * <code>string file = 1;</code>
   *
   * @return The file.
   */
  public java.lang.String getFile() {
    java.lang.Object ref = "";
    if (entryCase_ == 1) {
      ref = entry_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (entryCase_ == 1) {
        entry_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A file in the directory.
   * </pre>
   *
   * <code>string file = 1;</code>
   *
   * @return The bytes for file.
   */
  public com.google.protobuf.ByteString getFileBytes() {
    java.lang.Object ref = "";
    if (entryCase_ == 1) {
      ref = entry_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (entryCase_ == 1) {
        entry_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIRECTORY_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A child directory in the directory.
   * </pre>
   *
   * <code>string directory = 2;</code>
   *
   * @return Whether the directory field is set.
   */
  public boolean hasDirectory() {
    return entryCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * A child directory in the directory.
   * </pre>
   *
   * <code>string directory = 2;</code>
   *
   * @return The directory.
   */
  public java.lang.String getDirectory() {
    java.lang.Object ref = "";
    if (entryCase_ == 2) {
      ref = entry_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (entryCase_ == 2) {
        entry_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A child directory in the directory.
   * </pre>
   *
   * <code>string directory = 2;</code>
   *
   * @return The bytes for directory.
   */
  public com.google.protobuf.ByteString getDirectoryBytes() {
    java.lang.Object ref = "";
    if (entryCase_ == 2) {
      ref = entry_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (entryCase_ == 2) {
        entry_ = b;
      }
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
    if (entryCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entry_);
    }
    if (entryCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entry_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entryCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entry_);
    }
    if (entryCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entry_);
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.DirectoryEntry)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.DirectoryEntry other =
        (com.google.cloud.dataform.v1beta1.DirectoryEntry) obj;

    if (!getEntryCase().equals(other.getEntryCase())) return false;
    switch (entryCase_) {
      case 1:
        if (!getFile().equals(other.getFile())) return false;
        break;
      case 2:
        if (!getDirectory().equals(other.getDirectory())) return false;
        break;
      case 0:
      default:
    }
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
    switch (entryCase_) {
      case 1:
        hash = (37 * hash) + FILE_FIELD_NUMBER;
        hash = (53 * hash) + getFile().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DIRECTORY_FIELD_NUMBER;
        hash = (53 * hash) + getDirectory().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataform.v1beta1.DirectoryEntry prototype) {
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
   * Represents a single entry in a directory.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.DirectoryEntry}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.DirectoryEntry)
      com.google.cloud.dataform.v1beta1.DirectoryEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_DirectoryEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_DirectoryEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.DirectoryEntry.class,
              com.google.cloud.dataform.v1beta1.DirectoryEntry.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.DirectoryEntry.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entryCase_ = 0;
      entry_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_DirectoryEntry_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.DirectoryEntry getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.DirectoryEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.DirectoryEntry build() {
      com.google.cloud.dataform.v1beta1.DirectoryEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.DirectoryEntry buildPartial() {
      com.google.cloud.dataform.v1beta1.DirectoryEntry result =
          new com.google.cloud.dataform.v1beta1.DirectoryEntry(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataform.v1beta1.DirectoryEntry result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.dataform.v1beta1.DirectoryEntry result) {
      result.entryCase_ = entryCase_;
      result.entry_ = this.entry_;
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
      if (other instanceof com.google.cloud.dataform.v1beta1.DirectoryEntry) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.DirectoryEntry) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1beta1.DirectoryEntry other) {
      if (other == com.google.cloud.dataform.v1beta1.DirectoryEntry.getDefaultInstance())
        return this;
      switch (other.getEntryCase()) {
        case FILE:
          {
            entryCase_ = 1;
            entry_ = other.entry_;
            onChanged();
            break;
          }
        case DIRECTORY:
          {
            entryCase_ = 2;
            entry_ = other.entry_;
            onChanged();
            break;
          }
        case ENTRY_NOT_SET:
          {
            break;
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
                java.lang.String s = input.readStringRequireUtf8();
                entryCase_ = 1;
                entry_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                entryCase_ = 2;
                entry_ = s;
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

    private int entryCase_ = 0;
    private java.lang.Object entry_;

    public EntryCase getEntryCase() {
      return EntryCase.forNumber(entryCase_);
    }

    public Builder clearEntry() {
      entryCase_ = 0;
      entry_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * A file in the directory.
     * </pre>
     *
     * <code>string file = 1;</code>
     *
     * @return Whether the file field is set.
     */
    @java.lang.Override
    public boolean hasFile() {
      return entryCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A file in the directory.
     * </pre>
     *
     * <code>string file = 1;</code>
     *
     * @return The file.
     */
    @java.lang.Override
    public java.lang.String getFile() {
      java.lang.Object ref = "";
      if (entryCase_ == 1) {
        ref = entry_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (entryCase_ == 1) {
          entry_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A file in the directory.
     * </pre>
     *
     * <code>string file = 1;</code>
     *
     * @return The bytes for file.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFileBytes() {
      java.lang.Object ref = "";
      if (entryCase_ == 1) {
        ref = entry_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (entryCase_ == 1) {
          entry_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A file in the directory.
     * </pre>
     *
     * <code>string file = 1;</code>
     *
     * @param value The file to set.
     * @return This builder for chaining.
     */
    public Builder setFile(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entryCase_ = 1;
      entry_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A file in the directory.
     * </pre>
     *
     * <code>string file = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFile() {
      if (entryCase_ == 1) {
        entryCase_ = 0;
        entry_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A file in the directory.
     * </pre>
     *
     * <code>string file = 1;</code>
     *
     * @param value The bytes for file to set.
     * @return This builder for chaining.
     */
    public Builder setFileBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entryCase_ = 1;
      entry_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A child directory in the directory.
     * </pre>
     *
     * <code>string directory = 2;</code>
     *
     * @return Whether the directory field is set.
     */
    @java.lang.Override
    public boolean hasDirectory() {
      return entryCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * A child directory in the directory.
     * </pre>
     *
     * <code>string directory = 2;</code>
     *
     * @return The directory.
     */
    @java.lang.Override
    public java.lang.String getDirectory() {
      java.lang.Object ref = "";
      if (entryCase_ == 2) {
        ref = entry_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (entryCase_ == 2) {
          entry_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A child directory in the directory.
     * </pre>
     *
     * <code>string directory = 2;</code>
     *
     * @return The bytes for directory.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDirectoryBytes() {
      java.lang.Object ref = "";
      if (entryCase_ == 2) {
        ref = entry_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (entryCase_ == 2) {
          entry_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A child directory in the directory.
     * </pre>
     *
     * <code>string directory = 2;</code>
     *
     * @param value The directory to set.
     * @return This builder for chaining.
     */
    public Builder setDirectory(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entryCase_ = 2;
      entry_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A child directory in the directory.
     * </pre>
     *
     * <code>string directory = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDirectory() {
      if (entryCase_ == 2) {
        entryCase_ = 0;
        entry_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A child directory in the directory.
     * </pre>
     *
     * <code>string directory = 2;</code>
     *
     * @param value The bytes for directory to set.
     * @return This builder for chaining.
     */
    public Builder setDirectoryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entryCase_ = 2;
      entry_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.DirectoryEntry)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.DirectoryEntry)
  private static final com.google.cloud.dataform.v1beta1.DirectoryEntry DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.DirectoryEntry();
  }

  public static com.google.cloud.dataform.v1beta1.DirectoryEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DirectoryEntry> PARSER =
      new com.google.protobuf.AbstractParser<DirectoryEntry>() {
        @java.lang.Override
        public DirectoryEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<DirectoryEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DirectoryEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.DirectoryEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
