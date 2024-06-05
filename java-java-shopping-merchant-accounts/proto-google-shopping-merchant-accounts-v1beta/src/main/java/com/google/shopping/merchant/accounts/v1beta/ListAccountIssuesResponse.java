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
// source: google/shopping/merchant/accounts/v1beta/accountissue.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.accounts.v1beta;

/**
 *
 *
 * <pre>
 * Response message for the `ListAccountIssues` method.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse}
 */
public final class ListAccountIssuesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse)
    ListAccountIssuesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAccountIssuesResponse.newBuilder() to construct.
  private ListAccountIssuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAccountIssuesResponse() {
    accountIssues_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAccountIssuesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.accounts.v1beta.AccountIssueProto
        .internal_static_google_shopping_merchant_accounts_v1beta_ListAccountIssuesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.accounts.v1beta.AccountIssueProto
        .internal_static_google_shopping_merchant_accounts_v1beta_ListAccountIssuesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse.class,
            com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse.Builder.class);
  }

  public static final int ACCOUNT_ISSUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.shopping.merchant.accounts.v1beta.AccountIssue> accountIssues_;
  /**
   *
   *
   * <pre>
   * The issues from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.shopping.merchant.accounts.v1beta.AccountIssue>
      getAccountIssuesList() {
    return accountIssues_;
  }
  /**
   *
   *
   * <pre>
   * The issues from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.shopping.merchant.accounts.v1beta.AccountIssueOrBuilder>
      getAccountIssuesOrBuilderList() {
    return accountIssues_;
  }
  /**
   *
   *
   * <pre>
   * The issues from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
   * </code>
   */
  @java.lang.Override
  public int getAccountIssuesCount() {
    return accountIssues_.size();
  }
  /**
   *
   *
   * <pre>
   * The issues from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.AccountIssue getAccountIssues(int index) {
    return accountIssues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The issues from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.AccountIssueOrBuilder
      getAccountIssuesOrBuilder(int index) {
    return accountIssues_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < accountIssues_.size(); i++) {
      output.writeMessage(1, accountIssues_.get(i));
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
    for (int i = 0; i < accountIssues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, accountIssues_.get(i));
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
    if (!(obj instanceof com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse other =
        (com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse) obj;

    if (!getAccountIssuesList().equals(other.getAccountIssuesList())) return false;
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
    if (getAccountIssuesCount() > 0) {
      hash = (37 * hash) + ACCOUNT_ISSUES_FIELD_NUMBER;
      hash = (53 * hash) + getAccountIssuesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse parseFrom(
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
      com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse prototype) {
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
   * Response message for the `ListAccountIssues` method.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse)
      com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.accounts.v1beta.AccountIssueProto
          .internal_static_google_shopping_merchant_accounts_v1beta_ListAccountIssuesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.accounts.v1beta.AccountIssueProto
          .internal_static_google_shopping_merchant_accounts_v1beta_ListAccountIssuesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse.class,
              com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse.Builder.class);
    }

    // Construct using
    // com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (accountIssuesBuilder_ == null) {
        accountIssues_ = java.util.Collections.emptyList();
      } else {
        accountIssues_ = null;
        accountIssuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.accounts.v1beta.AccountIssueProto
          .internal_static_google_shopping_merchant_accounts_v1beta_ListAccountIssuesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse build() {
      com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse buildPartial() {
      com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse result =
          new com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse result) {
      if (accountIssuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accountIssues_ = java.util.Collections.unmodifiableList(accountIssues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accountIssues_ = accountIssues_;
      } else {
        result.accountIssues_ = accountIssuesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse result) {
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
      if (other instanceof com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse) {
        return mergeFrom(
            (com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse other) {
      if (other
          == com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse
              .getDefaultInstance()) return this;
      if (accountIssuesBuilder_ == null) {
        if (!other.accountIssues_.isEmpty()) {
          if (accountIssues_.isEmpty()) {
            accountIssues_ = other.accountIssues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccountIssuesIsMutable();
            accountIssues_.addAll(other.accountIssues_);
          }
          onChanged();
        }
      } else {
        if (!other.accountIssues_.isEmpty()) {
          if (accountIssuesBuilder_.isEmpty()) {
            accountIssuesBuilder_.dispose();
            accountIssuesBuilder_ = null;
            accountIssues_ = other.accountIssues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accountIssuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAccountIssuesFieldBuilder()
                    : null;
          } else {
            accountIssuesBuilder_.addAllMessages(other.accountIssues_);
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
                com.google.shopping.merchant.accounts.v1beta.AccountIssue m =
                    input.readMessage(
                        com.google.shopping.merchant.accounts.v1beta.AccountIssue.parser(),
                        extensionRegistry);
                if (accountIssuesBuilder_ == null) {
                  ensureAccountIssuesIsMutable();
                  accountIssues_.add(m);
                } else {
                  accountIssuesBuilder_.addMessage(m);
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

    private java.util.List<com.google.shopping.merchant.accounts.v1beta.AccountIssue>
        accountIssues_ = java.util.Collections.emptyList();

    private void ensureAccountIssuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accountIssues_ =
            new java.util.ArrayList<com.google.shopping.merchant.accounts.v1beta.AccountIssue>(
                accountIssues_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.shopping.merchant.accounts.v1beta.AccountIssue,
            com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder,
            com.google.shopping.merchant.accounts.v1beta.AccountIssueOrBuilder>
        accountIssuesBuilder_;

    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public java.util.List<com.google.shopping.merchant.accounts.v1beta.AccountIssue>
        getAccountIssuesList() {
      if (accountIssuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accountIssues_);
      } else {
        return accountIssuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public int getAccountIssuesCount() {
      if (accountIssuesBuilder_ == null) {
        return accountIssues_.size();
      } else {
        return accountIssuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.AccountIssue getAccountIssues(int index) {
      if (accountIssuesBuilder_ == null) {
        return accountIssues_.get(index);
      } else {
        return accountIssuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder setAccountIssues(
        int index, com.google.shopping.merchant.accounts.v1beta.AccountIssue value) {
      if (accountIssuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountIssuesIsMutable();
        accountIssues_.set(index, value);
        onChanged();
      } else {
        accountIssuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder setAccountIssues(
        int index,
        com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder builderForValue) {
      if (accountIssuesBuilder_ == null) {
        ensureAccountIssuesIsMutable();
        accountIssues_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountIssuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder addAccountIssues(
        com.google.shopping.merchant.accounts.v1beta.AccountIssue value) {
      if (accountIssuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountIssuesIsMutable();
        accountIssues_.add(value);
        onChanged();
      } else {
        accountIssuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder addAccountIssues(
        int index, com.google.shopping.merchant.accounts.v1beta.AccountIssue value) {
      if (accountIssuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountIssuesIsMutable();
        accountIssues_.add(index, value);
        onChanged();
      } else {
        accountIssuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder addAccountIssues(
        com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder builderForValue) {
      if (accountIssuesBuilder_ == null) {
        ensureAccountIssuesIsMutable();
        accountIssues_.add(builderForValue.build());
        onChanged();
      } else {
        accountIssuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder addAccountIssues(
        int index,
        com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder builderForValue) {
      if (accountIssuesBuilder_ == null) {
        ensureAccountIssuesIsMutable();
        accountIssues_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountIssuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder addAllAccountIssues(
        java.lang.Iterable<? extends com.google.shopping.merchant.accounts.v1beta.AccountIssue>
            values) {
      if (accountIssuesBuilder_ == null) {
        ensureAccountIssuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, accountIssues_);
        onChanged();
      } else {
        accountIssuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder clearAccountIssues() {
      if (accountIssuesBuilder_ == null) {
        accountIssues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accountIssuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public Builder removeAccountIssues(int index) {
      if (accountIssuesBuilder_ == null) {
        ensureAccountIssuesIsMutable();
        accountIssues_.remove(index);
        onChanged();
      } else {
        accountIssuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder
        getAccountIssuesBuilder(int index) {
      return getAccountIssuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.AccountIssueOrBuilder
        getAccountIssuesOrBuilder(int index) {
      if (accountIssuesBuilder_ == null) {
        return accountIssues_.get(index);
      } else {
        return accountIssuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.shopping.merchant.accounts.v1beta.AccountIssueOrBuilder>
        getAccountIssuesOrBuilderList() {
      if (accountIssuesBuilder_ != null) {
        return accountIssuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accountIssues_);
      }
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder
        addAccountIssuesBuilder() {
      return getAccountIssuesFieldBuilder()
          .addBuilder(
              com.google.shopping.merchant.accounts.v1beta.AccountIssue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder
        addAccountIssuesBuilder(int index) {
      return getAccountIssuesFieldBuilder()
          .addBuilder(
              index,
              com.google.shopping.merchant.accounts.v1beta.AccountIssue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The issues from the specified account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.AccountIssue account_issues = 1;
     * </code>
     */
    public java.util.List<com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder>
        getAccountIssuesBuilderList() {
      return getAccountIssuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.shopping.merchant.accounts.v1beta.AccountIssue,
            com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder,
            com.google.shopping.merchant.accounts.v1beta.AccountIssueOrBuilder>
        getAccountIssuesFieldBuilder() {
      if (accountIssuesBuilder_ == null) {
        accountIssuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.shopping.merchant.accounts.v1beta.AccountIssue,
                com.google.shopping.merchant.accounts.v1beta.AccountIssue.Builder,
                com.google.shopping.merchant.accounts.v1beta.AccountIssueOrBuilder>(
                accountIssues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accountIssues_ = null;
      }
      return accountIssuesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse)
  private static final com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse();
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAccountIssuesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAccountIssuesResponse>() {
        @java.lang.Override
        public ListAccountIssuesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAccountIssuesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAccountIssuesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.ListAccountIssuesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
