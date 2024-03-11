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
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * A collection of source attributions for a piece of content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CitationMetadata}
 */
public final class CitationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CitationMetadata)
    CitationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CitationMetadata.newBuilder() to construct.
  private CitationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CitationMetadata() {
    citations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CitationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ContentProto
        .internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ContentProto
        .internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CitationMetadata.class,
            com.google.cloud.aiplatform.v1beta1.CitationMetadata.Builder.class);
  }

  public static final int CITATIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Citation> citations_;
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Citation> getCitationsList() {
    return citations_;
  }
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.CitationOrBuilder>
      getCitationsOrBuilderList() {
    return citations_;
  }
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getCitationsCount() {
    return citations_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Citation getCitations(int index) {
    return citations_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CitationOrBuilder getCitationsOrBuilder(int index) {
    return citations_.get(index);
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
    for (int i = 0; i < citations_.size(); i++) {
      output.writeMessage(1, citations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < citations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, citations_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CitationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CitationMetadata other =
        (com.google.cloud.aiplatform.v1beta1.CitationMetadata) obj;

    if (!getCitationsList().equals(other.getCitationsList())) return false;
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
    if (getCitationsCount() > 0) {
      hash = (37 * hash) + CITATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCitationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.CitationMetadata prototype) {
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
   * A collection of source attributions for a piece of content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CitationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CitationMetadata)
      com.google.cloud.aiplatform.v1beta1.CitationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto
          .internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto
          .internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CitationMetadata.class,
              com.google.cloud.aiplatform.v1beta1.CitationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CitationMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (citationsBuilder_ == null) {
        citations_ = java.util.Collections.emptyList();
      } else {
        citations_ = null;
        citationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ContentProto
          .internal_static_google_cloud_aiplatform_v1beta1_CitationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CitationMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CitationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CitationMetadata build() {
      com.google.cloud.aiplatform.v1beta1.CitationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CitationMetadata buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CitationMetadata result =
          new com.google.cloud.aiplatform.v1beta1.CitationMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.CitationMetadata result) {
      if (citationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          citations_ = java.util.Collections.unmodifiableList(citations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.citations_ = citations_;
      } else {
        result.citations_ = citationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.CitationMetadata result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CitationMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CitationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CitationMetadata other) {
      if (other == com.google.cloud.aiplatform.v1beta1.CitationMetadata.getDefaultInstance())
        return this;
      if (citationsBuilder_ == null) {
        if (!other.citations_.isEmpty()) {
          if (citations_.isEmpty()) {
            citations_ = other.citations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCitationsIsMutable();
            citations_.addAll(other.citations_);
          }
          onChanged();
        }
      } else {
        if (!other.citations_.isEmpty()) {
          if (citationsBuilder_.isEmpty()) {
            citationsBuilder_.dispose();
            citationsBuilder_ = null;
            citations_ = other.citations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            citationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCitationsFieldBuilder()
                    : null;
          } else {
            citationsBuilder_.addAllMessages(other.citations_);
          }
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
                com.google.cloud.aiplatform.v1beta1.Citation m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.Citation.parser(), extensionRegistry);
                if (citationsBuilder_ == null) {
                  ensureCitationsIsMutable();
                  citations_.add(m);
                } else {
                  citationsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Citation> citations_ =
        java.util.Collections.emptyList();

    private void ensureCitationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        citations_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Citation>(citations_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Citation,
            com.google.cloud.aiplatform.v1beta1.Citation.Builder,
            com.google.cloud.aiplatform.v1beta1.CitationOrBuilder>
        citationsBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Citation> getCitationsList() {
      if (citationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(citations_);
      } else {
        return citationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getCitationsCount() {
      if (citationsBuilder_ == null) {
        return citations_.size();
      } else {
        return citationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.Citation getCitations(int index) {
      if (citationsBuilder_ == null) {
        return citations_.get(index);
      } else {
        return citationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setCitations(int index, com.google.cloud.aiplatform.v1beta1.Citation value) {
      if (citationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCitationsIsMutable();
        citations_.set(index, value);
        onChanged();
      } else {
        citationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setCitations(
        int index, com.google.cloud.aiplatform.v1beta1.Citation.Builder builderForValue) {
      if (citationsBuilder_ == null) {
        ensureCitationsIsMutable();
        citations_.set(index, builderForValue.build());
        onChanged();
      } else {
        citationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addCitations(com.google.cloud.aiplatform.v1beta1.Citation value) {
      if (citationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCitationsIsMutable();
        citations_.add(value);
        onChanged();
      } else {
        citationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addCitations(int index, com.google.cloud.aiplatform.v1beta1.Citation value) {
      if (citationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCitationsIsMutable();
        citations_.add(index, value);
        onChanged();
      } else {
        citationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addCitations(
        com.google.cloud.aiplatform.v1beta1.Citation.Builder builderForValue) {
      if (citationsBuilder_ == null) {
        ensureCitationsIsMutable();
        citations_.add(builderForValue.build());
        onChanged();
      } else {
        citationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addCitations(
        int index, com.google.cloud.aiplatform.v1beta1.Citation.Builder builderForValue) {
      if (citationsBuilder_ == null) {
        ensureCitationsIsMutable();
        citations_.add(index, builderForValue.build());
        onChanged();
      } else {
        citationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllCitations(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Citation> values) {
      if (citationsBuilder_ == null) {
        ensureCitationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, citations_);
        onChanged();
      } else {
        citationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearCitations() {
      if (citationsBuilder_ == null) {
        citations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        citationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeCitations(int index) {
      if (citationsBuilder_ == null) {
        ensureCitationsIsMutable();
        citations_.remove(index);
        onChanged();
      } else {
        citationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.Citation.Builder getCitationsBuilder(int index) {
      return getCitationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.CitationOrBuilder getCitationsOrBuilder(int index) {
      if (citationsBuilder_ == null) {
        return citations_.get(index);
      } else {
        return citationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.CitationOrBuilder>
        getCitationsOrBuilderList() {
      if (citationsBuilder_ != null) {
        return citationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(citations_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.Citation.Builder addCitationsBuilder() {
      return getCitationsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Citation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.Citation.Builder addCitationsBuilder(int index) {
      return getCitationsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Citation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. List of citations.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Citation.Builder>
        getCitationsBuilderList() {
      return getCitationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Citation,
            com.google.cloud.aiplatform.v1beta1.Citation.Builder,
            com.google.cloud.aiplatform.v1beta1.CitationOrBuilder>
        getCitationsFieldBuilder() {
      if (citationsBuilder_ == null) {
        citationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Citation,
                com.google.cloud.aiplatform.v1beta1.Citation.Builder,
                com.google.cloud.aiplatform.v1beta1.CitationOrBuilder>(
                citations_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        citations_ = null;
      }
      return citationsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CitationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CitationMetadata)
  private static final com.google.cloud.aiplatform.v1beta1.CitationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CitationMetadata();
  }

  public static com.google.cloud.aiplatform.v1beta1.CitationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CitationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<CitationMetadata>() {
        @java.lang.Override
        public CitationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CitationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CitationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CitationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
