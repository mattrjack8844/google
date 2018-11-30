// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * All the findings for a single scanned item.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.InspectResult}
 */
public final class InspectResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.InspectResult)
    InspectResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InspectResult.newBuilder() to construct.
  private InspectResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InspectResult() {
    findings_ = java.util.Collections.emptyList();
    findingsTruncated_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InspectResult(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                findings_ = new java.util.ArrayList<com.google.privacy.dlp.v2.Finding>();
                mutable_bitField0_ |= 0x00000001;
              }
              findings_.add(
                  input.readMessage(com.google.privacy.dlp.v2.Finding.parser(), extensionRegistry));
              break;
            }
          case 16:
            {
              findingsTruncated_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        findings_ = java.util.Collections.unmodifiableList(findings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_InspectResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_InspectResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.InspectResult.class,
            com.google.privacy.dlp.v2.InspectResult.Builder.class);
  }

  private int bitField0_;
  public static final int FINDINGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.privacy.dlp.v2.Finding> findings_;
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  public java.util.List<com.google.privacy.dlp.v2.Finding> getFindingsList() {
    return findings_;
  }
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  public java.util.List<? extends com.google.privacy.dlp.v2.FindingOrBuilder>
      getFindingsOrBuilderList() {
    return findings_;
  }
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  public int getFindingsCount() {
    return findings_.size();
  }
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  public com.google.privacy.dlp.v2.Finding getFindings(int index) {
    return findings_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  public com.google.privacy.dlp.v2.FindingOrBuilder getFindingsOrBuilder(int index) {
    return findings_.get(index);
  }

  public static final int FINDINGS_TRUNCATED_FIELD_NUMBER = 2;
  private boolean findingsTruncated_;
  /**
   *
   *
   * <pre>
   * If true, then this item might have more findings than were returned,
   * and the findings returned are an arbitrary subset of all findings.
   * The findings list might be truncated because the input items were too
   * large, or because the server reached the maximum amount of resources
   * allowed for a single API call. For best results, divide the input into
   * smaller batches.
   * </pre>
   *
   * <code>bool findings_truncated = 2;</code>
   */
  public boolean getFindingsTruncated() {
    return findingsTruncated_;
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
    for (int i = 0; i < findings_.size(); i++) {
      output.writeMessage(1, findings_.get(i));
    }
    if (findingsTruncated_ != false) {
      output.writeBool(2, findingsTruncated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < findings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, findings_.get(i));
    }
    if (findingsTruncated_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, findingsTruncated_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.InspectResult)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.InspectResult other = (com.google.privacy.dlp.v2.InspectResult) obj;

    boolean result = true;
    result = result && getFindingsList().equals(other.getFindingsList());
    result = result && (getFindingsTruncated() == other.getFindingsTruncated());
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
    if (getFindingsCount() > 0) {
      hash = (37 * hash) + FINDINGS_FIELD_NUMBER;
      hash = (53 * hash) + getFindingsList().hashCode();
    }
    hash = (37 * hash) + FINDINGS_TRUNCATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getFindingsTruncated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.InspectResult parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.InspectResult prototype) {
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
   * All the findings for a single scanned item.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.InspectResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.InspectResult)
      com.google.privacy.dlp.v2.InspectResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_InspectResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_InspectResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.InspectResult.class,
              com.google.privacy.dlp.v2.InspectResult.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.InspectResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFindingsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (findingsBuilder_ == null) {
        findings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        findingsBuilder_.clear();
      }
      findingsTruncated_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_InspectResult_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InspectResult getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.InspectResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InspectResult build() {
      com.google.privacy.dlp.v2.InspectResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InspectResult buildPartial() {
      com.google.privacy.dlp.v2.InspectResult result =
          new com.google.privacy.dlp.v2.InspectResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (findingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          findings_ = java.util.Collections.unmodifiableList(findings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.findings_ = findings_;
      } else {
        result.findings_ = findingsBuilder_.build();
      }
      result.findingsTruncated_ = findingsTruncated_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.privacy.dlp.v2.InspectResult) {
        return mergeFrom((com.google.privacy.dlp.v2.InspectResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.InspectResult other) {
      if (other == com.google.privacy.dlp.v2.InspectResult.getDefaultInstance()) return this;
      if (findingsBuilder_ == null) {
        if (!other.findings_.isEmpty()) {
          if (findings_.isEmpty()) {
            findings_ = other.findings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFindingsIsMutable();
            findings_.addAll(other.findings_);
          }
          onChanged();
        }
      } else {
        if (!other.findings_.isEmpty()) {
          if (findingsBuilder_.isEmpty()) {
            findingsBuilder_.dispose();
            findingsBuilder_ = null;
            findings_ = other.findings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            findingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFindingsFieldBuilder()
                    : null;
          } else {
            findingsBuilder_.addAllMessages(other.findings_);
          }
        }
      }
      if (other.getFindingsTruncated() != false) {
        setFindingsTruncated(other.getFindingsTruncated());
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
      com.google.privacy.dlp.v2.InspectResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.InspectResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.privacy.dlp.v2.Finding> findings_ =
        java.util.Collections.emptyList();

    private void ensureFindingsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        findings_ = new java.util.ArrayList<com.google.privacy.dlp.v2.Finding>(findings_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.Finding,
            com.google.privacy.dlp.v2.Finding.Builder,
            com.google.privacy.dlp.v2.FindingOrBuilder>
        findingsBuilder_;

    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.Finding> getFindingsList() {
      if (findingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(findings_);
      } else {
        return findingsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public int getFindingsCount() {
      if (findingsBuilder_ == null) {
        return findings_.size();
      } else {
        return findingsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public com.google.privacy.dlp.v2.Finding getFindings(int index) {
      if (findingsBuilder_ == null) {
        return findings_.get(index);
      } else {
        return findingsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder setFindings(int index, com.google.privacy.dlp.v2.Finding value) {
      if (findingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingsIsMutable();
        findings_.set(index, value);
        onChanged();
      } else {
        findingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder setFindings(
        int index, com.google.privacy.dlp.v2.Finding.Builder builderForValue) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        findings_.set(index, builderForValue.build());
        onChanged();
      } else {
        findingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder addFindings(com.google.privacy.dlp.v2.Finding value) {
      if (findingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingsIsMutable();
        findings_.add(value);
        onChanged();
      } else {
        findingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder addFindings(int index, com.google.privacy.dlp.v2.Finding value) {
      if (findingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingsIsMutable();
        findings_.add(index, value);
        onChanged();
      } else {
        findingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder addFindings(com.google.privacy.dlp.v2.Finding.Builder builderForValue) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        findings_.add(builderForValue.build());
        onChanged();
      } else {
        findingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder addFindings(
        int index, com.google.privacy.dlp.v2.Finding.Builder builderForValue) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        findings_.add(index, builderForValue.build());
        onChanged();
      } else {
        findingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder addAllFindings(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.Finding> values) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, findings_);
        onChanged();
      } else {
        findingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder clearFindings() {
      if (findingsBuilder_ == null) {
        findings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        findingsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public Builder removeFindings(int index) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        findings_.remove(index);
        onChanged();
      } else {
        findingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public com.google.privacy.dlp.v2.Finding.Builder getFindingsBuilder(int index) {
      return getFindingsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public com.google.privacy.dlp.v2.FindingOrBuilder getFindingsOrBuilder(int index) {
      if (findingsBuilder_ == null) {
        return findings_.get(index);
      } else {
        return findingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.FindingOrBuilder>
        getFindingsOrBuilderList() {
      if (findingsBuilder_ != null) {
        return findingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(findings_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public com.google.privacy.dlp.v2.Finding.Builder addFindingsBuilder() {
      return getFindingsFieldBuilder()
          .addBuilder(com.google.privacy.dlp.v2.Finding.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public com.google.privacy.dlp.v2.Finding.Builder addFindingsBuilder(int index) {
      return getFindingsFieldBuilder()
          .addBuilder(index, com.google.privacy.dlp.v2.Finding.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of findings for an item.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.Finding.Builder> getFindingsBuilderList() {
      return getFindingsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.Finding,
            com.google.privacy.dlp.v2.Finding.Builder,
            com.google.privacy.dlp.v2.FindingOrBuilder>
        getFindingsFieldBuilder() {
      if (findingsBuilder_ == null) {
        findingsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.privacy.dlp.v2.Finding,
                com.google.privacy.dlp.v2.Finding.Builder,
                com.google.privacy.dlp.v2.FindingOrBuilder>(
                findings_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        findings_ = null;
      }
      return findingsBuilder_;
    }

    private boolean findingsTruncated_;
    /**
     *
     *
     * <pre>
     * If true, then this item might have more findings than were returned,
     * and the findings returned are an arbitrary subset of all findings.
     * The findings list might be truncated because the input items were too
     * large, or because the server reached the maximum amount of resources
     * allowed for a single API call. For best results, divide the input into
     * smaller batches.
     * </pre>
     *
     * <code>bool findings_truncated = 2;</code>
     */
    public boolean getFindingsTruncated() {
      return findingsTruncated_;
    }
    /**
     *
     *
     * <pre>
     * If true, then this item might have more findings than were returned,
     * and the findings returned are an arbitrary subset of all findings.
     * The findings list might be truncated because the input items were too
     * large, or because the server reached the maximum amount of resources
     * allowed for a single API call. For best results, divide the input into
     * smaller batches.
     * </pre>
     *
     * <code>bool findings_truncated = 2;</code>
     */
    public Builder setFindingsTruncated(boolean value) {

      findingsTruncated_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, then this item might have more findings than were returned,
     * and the findings returned are an arbitrary subset of all findings.
     * The findings list might be truncated because the input items were too
     * large, or because the server reached the maximum amount of resources
     * allowed for a single API call. For best results, divide the input into
     * smaller batches.
     * </pre>
     *
     * <code>bool findings_truncated = 2;</code>
     */
    public Builder clearFindingsTruncated() {

      findingsTruncated_ = false;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.InspectResult)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.InspectResult)
  private static final com.google.privacy.dlp.v2.InspectResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.InspectResult();
  }

  public static com.google.privacy.dlp.v2.InspectResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InspectResult> PARSER =
      new com.google.protobuf.AbstractParser<InspectResult>() {
        @java.lang.Override
        public InspectResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InspectResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InspectResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InspectResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
