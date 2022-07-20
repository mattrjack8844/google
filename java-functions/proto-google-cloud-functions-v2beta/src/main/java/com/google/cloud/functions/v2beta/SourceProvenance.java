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
// source: google/cloud/functions/v2beta/functions.proto

package com.google.cloud.functions.v2beta;

/**
 *
 *
 * <pre>
 * Provenance of the source. Ways to find the original source, or verify that
 * some source was used for this build.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v2beta.SourceProvenance}
 */
public final class SourceProvenance extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v2beta.SourceProvenance)
    SourceProvenanceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceProvenance.newBuilder() to construct.
  private SourceProvenance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceProvenance() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceProvenance();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SourceProvenance(
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
              com.google.cloud.functions.v2beta.StorageSource.Builder subBuilder = null;
              if (resolvedStorageSource_ != null) {
                subBuilder = resolvedStorageSource_.toBuilder();
              }
              resolvedStorageSource_ =
                  input.readMessage(
                      com.google.cloud.functions.v2beta.StorageSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(resolvedStorageSource_);
                resolvedStorageSource_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.cloud.functions.v2beta.RepoSource.Builder subBuilder = null;
              if (resolvedRepoSource_ != null) {
                subBuilder = resolvedRepoSource_.toBuilder();
              }
              resolvedRepoSource_ =
                  input.readMessage(
                      com.google.cloud.functions.v2beta.RepoSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(resolvedRepoSource_);
                resolvedRepoSource_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.functions.v2beta.FunctionsProto
        .internal_static_google_cloud_functions_v2beta_SourceProvenance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v2beta.FunctionsProto
        .internal_static_google_cloud_functions_v2beta_SourceProvenance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v2beta.SourceProvenance.class,
            com.google.cloud.functions.v2beta.SourceProvenance.Builder.class);
  }

  public static final int RESOLVED_STORAGE_SOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.functions.v2beta.StorageSource resolvedStorageSource_;
  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
   *
   * @return Whether the resolvedStorageSource field is set.
   */
  @java.lang.Override
  public boolean hasResolvedStorageSource() {
    return resolvedStorageSource_ != null;
  }
  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
   *
   * @return The resolvedStorageSource.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.StorageSource getResolvedStorageSource() {
    return resolvedStorageSource_ == null
        ? com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance()
        : resolvedStorageSource_;
  }
  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.StorageSourceOrBuilder
      getResolvedStorageSourceOrBuilder() {
    return getResolvedStorageSource();
  }

  public static final int RESOLVED_REPO_SOURCE_FIELD_NUMBER = 2;
  private com.google.cloud.functions.v2beta.RepoSource resolvedRepoSource_;
  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
   *
   * @return Whether the resolvedRepoSource field is set.
   */
  @java.lang.Override
  public boolean hasResolvedRepoSource() {
    return resolvedRepoSource_ != null;
  }
  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
   *
   * @return The resolvedRepoSource.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.RepoSource getResolvedRepoSource() {
    return resolvedRepoSource_ == null
        ? com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance()
        : resolvedRepoSource_;
  }
  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.RepoSourceOrBuilder getResolvedRepoSourceOrBuilder() {
    return getResolvedRepoSource();
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
    if (resolvedStorageSource_ != null) {
      output.writeMessage(1, getResolvedStorageSource());
    }
    if (resolvedRepoSource_ != null) {
      output.writeMessage(2, getResolvedRepoSource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resolvedStorageSource_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getResolvedStorageSource());
    }
    if (resolvedRepoSource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getResolvedRepoSource());
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
    if (!(obj instanceof com.google.cloud.functions.v2beta.SourceProvenance)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v2beta.SourceProvenance other =
        (com.google.cloud.functions.v2beta.SourceProvenance) obj;

    if (hasResolvedStorageSource() != other.hasResolvedStorageSource()) return false;
    if (hasResolvedStorageSource()) {
      if (!getResolvedStorageSource().equals(other.getResolvedStorageSource())) return false;
    }
    if (hasResolvedRepoSource() != other.hasResolvedRepoSource()) return false;
    if (hasResolvedRepoSource()) {
      if (!getResolvedRepoSource().equals(other.getResolvedRepoSource())) return false;
    }
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
    if (hasResolvedStorageSource()) {
      hash = (37 * hash) + RESOLVED_STORAGE_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResolvedStorageSource().hashCode();
    }
    if (hasResolvedRepoSource()) {
      hash = (37 * hash) + RESOLVED_REPO_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResolvedRepoSource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance parseFrom(
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

  public static Builder newBuilder(com.google.cloud.functions.v2beta.SourceProvenance prototype) {
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
   * Provenance of the source. Ways to find the original source, or verify that
   * some source was used for this build.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v2beta.SourceProvenance}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v2beta.SourceProvenance)
      com.google.cloud.functions.v2beta.SourceProvenanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.functions.v2beta.FunctionsProto
          .internal_static_google_cloud_functions_v2beta_SourceProvenance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v2beta.FunctionsProto
          .internal_static_google_cloud_functions_v2beta_SourceProvenance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v2beta.SourceProvenance.class,
              com.google.cloud.functions.v2beta.SourceProvenance.Builder.class);
    }

    // Construct using com.google.cloud.functions.v2beta.SourceProvenance.newBuilder()
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
      if (resolvedStorageSourceBuilder_ == null) {
        resolvedStorageSource_ = null;
      } else {
        resolvedStorageSource_ = null;
        resolvedStorageSourceBuilder_ = null;
      }
      if (resolvedRepoSourceBuilder_ == null) {
        resolvedRepoSource_ = null;
      } else {
        resolvedRepoSource_ = null;
        resolvedRepoSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.functions.v2beta.FunctionsProto
          .internal_static_google_cloud_functions_v2beta_SourceProvenance_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.SourceProvenance getDefaultInstanceForType() {
      return com.google.cloud.functions.v2beta.SourceProvenance.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.SourceProvenance build() {
      com.google.cloud.functions.v2beta.SourceProvenance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.SourceProvenance buildPartial() {
      com.google.cloud.functions.v2beta.SourceProvenance result =
          new com.google.cloud.functions.v2beta.SourceProvenance(this);
      if (resolvedStorageSourceBuilder_ == null) {
        result.resolvedStorageSource_ = resolvedStorageSource_;
      } else {
        result.resolvedStorageSource_ = resolvedStorageSourceBuilder_.build();
      }
      if (resolvedRepoSourceBuilder_ == null) {
        result.resolvedRepoSource_ = resolvedRepoSource_;
      } else {
        result.resolvedRepoSource_ = resolvedRepoSourceBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.functions.v2beta.SourceProvenance) {
        return mergeFrom((com.google.cloud.functions.v2beta.SourceProvenance) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v2beta.SourceProvenance other) {
      if (other == com.google.cloud.functions.v2beta.SourceProvenance.getDefaultInstance())
        return this;
      if (other.hasResolvedStorageSource()) {
        mergeResolvedStorageSource(other.getResolvedStorageSource());
      }
      if (other.hasResolvedRepoSource()) {
        mergeResolvedRepoSource(other.getResolvedRepoSource());
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
      com.google.cloud.functions.v2beta.SourceProvenance parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.functions.v2beta.SourceProvenance) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.functions.v2beta.StorageSource resolvedStorageSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2beta.StorageSource,
            com.google.cloud.functions.v2beta.StorageSource.Builder,
            com.google.cloud.functions.v2beta.StorageSourceOrBuilder>
        resolvedStorageSourceBuilder_;
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     *
     * @return Whether the resolvedStorageSource field is set.
     */
    public boolean hasResolvedStorageSource() {
      return resolvedStorageSourceBuilder_ != null || resolvedStorageSource_ != null;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     *
     * @return The resolvedStorageSource.
     */
    public com.google.cloud.functions.v2beta.StorageSource getResolvedStorageSource() {
      if (resolvedStorageSourceBuilder_ == null) {
        return resolvedStorageSource_ == null
            ? com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance()
            : resolvedStorageSource_;
      } else {
        return resolvedStorageSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     */
    public Builder setResolvedStorageSource(com.google.cloud.functions.v2beta.StorageSource value) {
      if (resolvedStorageSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resolvedStorageSource_ = value;
        onChanged();
      } else {
        resolvedStorageSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     */
    public Builder setResolvedStorageSource(
        com.google.cloud.functions.v2beta.StorageSource.Builder builderForValue) {
      if (resolvedStorageSourceBuilder_ == null) {
        resolvedStorageSource_ = builderForValue.build();
        onChanged();
      } else {
        resolvedStorageSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     */
    public Builder mergeResolvedStorageSource(
        com.google.cloud.functions.v2beta.StorageSource value) {
      if (resolvedStorageSourceBuilder_ == null) {
        if (resolvedStorageSource_ != null) {
          resolvedStorageSource_ =
              com.google.cloud.functions.v2beta.StorageSource.newBuilder(resolvedStorageSource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          resolvedStorageSource_ = value;
        }
        onChanged();
      } else {
        resolvedStorageSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     */
    public Builder clearResolvedStorageSource() {
      if (resolvedStorageSourceBuilder_ == null) {
        resolvedStorageSource_ = null;
        onChanged();
      } else {
        resolvedStorageSource_ = null;
        resolvedStorageSourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     */
    public com.google.cloud.functions.v2beta.StorageSource.Builder
        getResolvedStorageSourceBuilder() {

      onChanged();
      return getResolvedStorageSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     */
    public com.google.cloud.functions.v2beta.StorageSourceOrBuilder
        getResolvedStorageSourceOrBuilder() {
      if (resolvedStorageSourceBuilder_ != null) {
        return resolvedStorageSourceBuilder_.getMessageOrBuilder();
      } else {
        return resolvedStorageSource_ == null
            ? com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance()
            : resolvedStorageSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2beta.StorageSource,
            com.google.cloud.functions.v2beta.StorageSource.Builder,
            com.google.cloud.functions.v2beta.StorageSourceOrBuilder>
        getResolvedStorageSourceFieldBuilder() {
      if (resolvedStorageSourceBuilder_ == null) {
        resolvedStorageSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.functions.v2beta.StorageSource,
                com.google.cloud.functions.v2beta.StorageSource.Builder,
                com.google.cloud.functions.v2beta.StorageSourceOrBuilder>(
                getResolvedStorageSource(), getParentForChildren(), isClean());
        resolvedStorageSource_ = null;
      }
      return resolvedStorageSourceBuilder_;
    }

    private com.google.cloud.functions.v2beta.RepoSource resolvedRepoSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2beta.RepoSource,
            com.google.cloud.functions.v2beta.RepoSource.Builder,
            com.google.cloud.functions.v2beta.RepoSourceOrBuilder>
        resolvedRepoSourceBuilder_;
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     *
     * @return Whether the resolvedRepoSource field is set.
     */
    public boolean hasResolvedRepoSource() {
      return resolvedRepoSourceBuilder_ != null || resolvedRepoSource_ != null;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     *
     * @return The resolvedRepoSource.
     */
    public com.google.cloud.functions.v2beta.RepoSource getResolvedRepoSource() {
      if (resolvedRepoSourceBuilder_ == null) {
        return resolvedRepoSource_ == null
            ? com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance()
            : resolvedRepoSource_;
      } else {
        return resolvedRepoSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     */
    public Builder setResolvedRepoSource(com.google.cloud.functions.v2beta.RepoSource value) {
      if (resolvedRepoSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resolvedRepoSource_ = value;
        onChanged();
      } else {
        resolvedRepoSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     */
    public Builder setResolvedRepoSource(
        com.google.cloud.functions.v2beta.RepoSource.Builder builderForValue) {
      if (resolvedRepoSourceBuilder_ == null) {
        resolvedRepoSource_ = builderForValue.build();
        onChanged();
      } else {
        resolvedRepoSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     */
    public Builder mergeResolvedRepoSource(com.google.cloud.functions.v2beta.RepoSource value) {
      if (resolvedRepoSourceBuilder_ == null) {
        if (resolvedRepoSource_ != null) {
          resolvedRepoSource_ =
              com.google.cloud.functions.v2beta.RepoSource.newBuilder(resolvedRepoSource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          resolvedRepoSource_ = value;
        }
        onChanged();
      } else {
        resolvedRepoSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     */
    public Builder clearResolvedRepoSource() {
      if (resolvedRepoSourceBuilder_ == null) {
        resolvedRepoSource_ = null;
        onChanged();
      } else {
        resolvedRepoSource_ = null;
        resolvedRepoSourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     */
    public com.google.cloud.functions.v2beta.RepoSource.Builder getResolvedRepoSourceBuilder() {

      onChanged();
      return getResolvedRepoSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     */
    public com.google.cloud.functions.v2beta.RepoSourceOrBuilder getResolvedRepoSourceOrBuilder() {
      if (resolvedRepoSourceBuilder_ != null) {
        return resolvedRepoSourceBuilder_.getMessageOrBuilder();
      } else {
        return resolvedRepoSource_ == null
            ? com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance()
            : resolvedRepoSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2beta.RepoSource,
            com.google.cloud.functions.v2beta.RepoSource.Builder,
            com.google.cloud.functions.v2beta.RepoSourceOrBuilder>
        getResolvedRepoSourceFieldBuilder() {
      if (resolvedRepoSourceBuilder_ == null) {
        resolvedRepoSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.functions.v2beta.RepoSource,
                com.google.cloud.functions.v2beta.RepoSource.Builder,
                com.google.cloud.functions.v2beta.RepoSourceOrBuilder>(
                getResolvedRepoSource(), getParentForChildren(), isClean());
        resolvedRepoSource_ = null;
      }
      return resolvedRepoSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v2beta.SourceProvenance)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v2beta.SourceProvenance)
  private static final com.google.cloud.functions.v2beta.SourceProvenance DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v2beta.SourceProvenance();
  }

  public static com.google.cloud.functions.v2beta.SourceProvenance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceProvenance> PARSER =
      new com.google.protobuf.AbstractParser<SourceProvenance>() {
        @java.lang.Override
        public SourceProvenance parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SourceProvenance(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SourceProvenance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceProvenance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v2beta.SourceProvenance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
