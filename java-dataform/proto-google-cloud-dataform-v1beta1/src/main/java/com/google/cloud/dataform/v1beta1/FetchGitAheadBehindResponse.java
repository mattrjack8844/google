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
 * `FetchGitAheadBehind` response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse}
 */
public final class FetchGitAheadBehindResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse)
    FetchGitAheadBehindResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FetchGitAheadBehindResponse.newBuilder() to construct.
  private FetchGitAheadBehindResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchGitAheadBehindResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchGitAheadBehindResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_FetchGitAheadBehindResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_FetchGitAheadBehindResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse.class,
            com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse.Builder.class);
  }

  public static final int COMMITS_AHEAD_FIELD_NUMBER = 1;
  private int commitsAhead_ = 0;
  /**
   *
   *
   * <pre>
   * The number of commits in the remote branch that are not in the workspace.
   * </pre>
   *
   * <code>int32 commits_ahead = 1;</code>
   *
   * @return The commitsAhead.
   */
  @java.lang.Override
  public int getCommitsAhead() {
    return commitsAhead_;
  }

  public static final int COMMITS_BEHIND_FIELD_NUMBER = 2;
  private int commitsBehind_ = 0;
  /**
   *
   *
   * <pre>
   * The number of commits in the workspace that are not in the remote branch.
   * </pre>
   *
   * <code>int32 commits_behind = 2;</code>
   *
   * @return The commitsBehind.
   */
  @java.lang.Override
  public int getCommitsBehind() {
    return commitsBehind_;
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
    if (commitsAhead_ != 0) {
      output.writeInt32(1, commitsAhead_);
    }
    if (commitsBehind_ != 0) {
      output.writeInt32(2, commitsBehind_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commitsAhead_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, commitsAhead_);
    }
    if (commitsBehind_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, commitsBehind_);
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse other =
        (com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse) obj;

    if (getCommitsAhead() != other.getCommitsAhead()) return false;
    if (getCommitsBehind() != other.getCommitsBehind()) return false;
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
    hash = (37 * hash) + COMMITS_AHEAD_FIELD_NUMBER;
    hash = (53 * hash) + getCommitsAhead();
    hash = (37 * hash) + COMMITS_BEHIND_FIELD_NUMBER;
    hash = (53 * hash) + getCommitsBehind();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse parseFrom(
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
      com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse prototype) {
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
   * `FetchGitAheadBehind` response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse)
      com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_FetchGitAheadBehindResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_FetchGitAheadBehindResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse.class,
              com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      commitsAhead_ = 0;
      commitsBehind_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_FetchGitAheadBehindResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse
        getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse build() {
      com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse buildPartial() {
      com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse result =
          new com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.commitsAhead_ = commitsAhead_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.commitsBehind_ = commitsBehind_;
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
      if (other instanceof com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse other) {
      if (other
          == com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse.getDefaultInstance())
        return this;
      if (other.getCommitsAhead() != 0) {
        setCommitsAhead(other.getCommitsAhead());
      }
      if (other.getCommitsBehind() != 0) {
        setCommitsBehind(other.getCommitsBehind());
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
            case 8:
              {
                commitsAhead_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                commitsBehind_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int commitsAhead_;
    /**
     *
     *
     * <pre>
     * The number of commits in the remote branch that are not in the workspace.
     * </pre>
     *
     * <code>int32 commits_ahead = 1;</code>
     *
     * @return The commitsAhead.
     */
    @java.lang.Override
    public int getCommitsAhead() {
      return commitsAhead_;
    }
    /**
     *
     *
     * <pre>
     * The number of commits in the remote branch that are not in the workspace.
     * </pre>
     *
     * <code>int32 commits_ahead = 1;</code>
     *
     * @param value The commitsAhead to set.
     * @return This builder for chaining.
     */
    public Builder setCommitsAhead(int value) {

      commitsAhead_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of commits in the remote branch that are not in the workspace.
     * </pre>
     *
     * <code>int32 commits_ahead = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCommitsAhead() {
      bitField0_ = (bitField0_ & ~0x00000001);
      commitsAhead_ = 0;
      onChanged();
      return this;
    }

    private int commitsBehind_;
    /**
     *
     *
     * <pre>
     * The number of commits in the workspace that are not in the remote branch.
     * </pre>
     *
     * <code>int32 commits_behind = 2;</code>
     *
     * @return The commitsBehind.
     */
    @java.lang.Override
    public int getCommitsBehind() {
      return commitsBehind_;
    }
    /**
     *
     *
     * <pre>
     * The number of commits in the workspace that are not in the remote branch.
     * </pre>
     *
     * <code>int32 commits_behind = 2;</code>
     *
     * @param value The commitsBehind to set.
     * @return This builder for chaining.
     */
    public Builder setCommitsBehind(int value) {

      commitsBehind_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of commits in the workspace that are not in the remote branch.
     * </pre>
     *
     * <code>int32 commits_behind = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCommitsBehind() {
      bitField0_ = (bitField0_ & ~0x00000002);
      commitsBehind_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse)
  private static final com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse();
  }

  public static com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchGitAheadBehindResponse> PARSER =
      new com.google.protobuf.AbstractParser<FetchGitAheadBehindResponse>() {
        @java.lang.Override
        public FetchGitAheadBehindResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchGitAheadBehindResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchGitAheadBehindResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.FetchGitAheadBehindResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
