// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

package com.google.api;

/**
 * Protobuf type {@code google.api.Authentication}
 *
 * <pre>
 * (== page authentication ==)
 * `Authentication` defines the authentication configuration for an API.
 * Example for an API targeted for external use:
 *     name: calendar.googleapis.com
 *     authentication:
 *       rules:
 *       - selector: "*"
 *         oauth:
 *           canonical_scopes: https://www.googleapis.com/auth/calendar
 *       - selector: google.calendar.Delegate
 *         oauth:
 *           canonical_scopes: https://www.googleapis.com/auth/calendar.read
 * </pre>
 */
public  final class Authentication extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.api.Authentication)
    AuthenticationOrBuilder {
  // Use Authentication.newBuilder() to construct.
  private Authentication(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Authentication() {
    rules_ = java.util.Collections.emptyList();
    providers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Authentication(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              rules_ = new java.util.ArrayList<com.google.api.AuthenticationRule>();
              mutable_bitField0_ |= 0x00000001;
            }
            rules_.add(input.readMessage(com.google.api.AuthenticationRule.parser(), extensionRegistry));
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              providers_ = new java.util.ArrayList<com.google.api.AuthProvider>();
              mutable_bitField0_ |= 0x00000002;
            }
            providers_.add(input.readMessage(com.google.api.AuthProvider.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        rules_ = java.util.Collections.unmodifiableList(rules_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        providers_ = java.util.Collections.unmodifiableList(providers_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.AuthProto.internal_static_google_api_Authentication_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.AuthProto.internal_static_google_api_Authentication_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.Authentication.class, com.google.api.Authentication.Builder.class);
  }

  public static final int RULES_FIELD_NUMBER = 3;
  private java.util.List<com.google.api.AuthenticationRule> rules_;
  /**
   * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
   *
   * <pre>
   * Individual rules for authentication.
   * </pre>
   */
  public java.util.List<com.google.api.AuthenticationRule> getRulesList() {
    return rules_;
  }
  /**
   * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
   *
   * <pre>
   * Individual rules for authentication.
   * </pre>
   */
  public java.util.List<? extends com.google.api.AuthenticationRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
   *
   * <pre>
   * Individual rules for authentication.
   * </pre>
   */
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
   *
   * <pre>
   * Individual rules for authentication.
   * </pre>
   */
  public com.google.api.AuthenticationRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
   *
   * <pre>
   * Individual rules for authentication.
   * </pre>
   */
  public com.google.api.AuthenticationRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
  }

  public static final int PROVIDERS_FIELD_NUMBER = 4;
  private java.util.List<com.google.api.AuthProvider> providers_;
  /**
   * <code>repeated .google.api.AuthProvider providers = 4;</code>
   *
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   */
  public java.util.List<com.google.api.AuthProvider> getProvidersList() {
    return providers_;
  }
  /**
   * <code>repeated .google.api.AuthProvider providers = 4;</code>
   *
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   */
  public java.util.List<? extends com.google.api.AuthProviderOrBuilder> 
      getProvidersOrBuilderList() {
    return providers_;
  }
  /**
   * <code>repeated .google.api.AuthProvider providers = 4;</code>
   *
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   */
  public int getProvidersCount() {
    return providers_.size();
  }
  /**
   * <code>repeated .google.api.AuthProvider providers = 4;</code>
   *
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   */
  public com.google.api.AuthProvider getProviders(int index) {
    return providers_.get(index);
  }
  /**
   * <code>repeated .google.api.AuthProvider providers = 4;</code>
   *
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   */
  public com.google.api.AuthProviderOrBuilder getProvidersOrBuilder(
      int index) {
    return providers_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(3, rules_.get(i));
    }
    for (int i = 0; i < providers_.size(); i++) {
      output.writeMessage(4, providers_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, rules_.get(i));
    }
    for (int i = 0; i < providers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, providers_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.api.Authentication parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Authentication parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Authentication parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Authentication parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Authentication parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.api.Authentication parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.api.Authentication parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.api.Authentication parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.api.Authentication parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.api.Authentication parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.Authentication prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.api.Authentication}
   *
   * <pre>
   * (== page authentication ==)
   * `Authentication` defines the authentication configuration for an API.
   * Example for an API targeted for external use:
   *     name: calendar.googleapis.com
   *     authentication:
   *       rules:
   *       - selector: "*"
   *         oauth:
   *           canonical_scopes: https://www.googleapis.com/auth/calendar
   *       - selector: google.calendar.Delegate
   *         oauth:
   *           canonical_scopes: https://www.googleapis.com/auth/calendar.read
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Authentication)
      com.google.api.AuthenticationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.AuthProto.internal_static_google_api_Authentication_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.AuthProto.internal_static_google_api_Authentication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.Authentication.class, com.google.api.Authentication.Builder.class);
    }

    // Construct using com.google.api.Authentication.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getRulesFieldBuilder();
        getProvidersFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rulesBuilder_.clear();
      }
      if (providersBuilder_ == null) {
        providers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        providersBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.AuthProto.internal_static_google_api_Authentication_descriptor;
    }

    public com.google.api.Authentication getDefaultInstanceForType() {
      return com.google.api.Authentication.getDefaultInstance();
    }

    public com.google.api.Authentication build() {
      com.google.api.Authentication result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.Authentication buildPartial() {
      com.google.api.Authentication result = new com.google.api.Authentication(this);
      int from_bitField0_ = bitField0_;
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
      if (providersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          providers_ = java.util.Collections.unmodifiableList(providers_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.providers_ = providers_;
      } else {
        result.providers_ = providersBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.Authentication) {
        return mergeFrom((com.google.api.Authentication)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.Authentication other) {
      if (other == com.google.api.Authentication.getDefaultInstance()) return this;
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
          }
        }
      }
      if (providersBuilder_ == null) {
        if (!other.providers_.isEmpty()) {
          if (providers_.isEmpty()) {
            providers_ = other.providers_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureProvidersIsMutable();
            providers_.addAll(other.providers_);
          }
          onChanged();
        }
      } else {
        if (!other.providers_.isEmpty()) {
          if (providersBuilder_.isEmpty()) {
            providersBuilder_.dispose();
            providersBuilder_ = null;
            providers_ = other.providers_;
            bitField0_ = (bitField0_ & ~0x00000002);
            providersBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getProvidersFieldBuilder() : null;
          } else {
            providersBuilder_.addAllMessages(other.providers_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.Authentication parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.Authentication) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.api.AuthenticationRule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        rules_ = new java.util.ArrayList<com.google.api.AuthenticationRule>(rules_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.api.AuthenticationRule, com.google.api.AuthenticationRule.Builder, com.google.api.AuthenticationRuleOrBuilder> rulesBuilder_;

    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public java.util.List<com.google.api.AuthenticationRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public com.google.api.AuthenticationRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder setRules(
        int index, com.google.api.AuthenticationRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder setRules(
        int index, com.google.api.AuthenticationRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder addRules(com.google.api.AuthenticationRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder addRules(
        int index, com.google.api.AuthenticationRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder addRules(
        com.google.api.AuthenticationRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder addRules(
        int index, com.google.api.AuthenticationRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.api.AuthenticationRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public com.google.api.AuthenticationRule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public com.google.api.AuthenticationRuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public java.util.List<? extends com.google.api.AuthenticationRuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public com.google.api.AuthenticationRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.google.api.AuthenticationRule.getDefaultInstance());
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public com.google.api.AuthenticationRule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.google.api.AuthenticationRule.getDefaultInstance());
    }
    /**
     * <code>repeated .google.api.AuthenticationRule rules = 3;</code>
     *
     * <pre>
     * Individual rules for authentication.
     * </pre>
     */
    public java.util.List<com.google.api.AuthenticationRule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.api.AuthenticationRule, com.google.api.AuthenticationRule.Builder, com.google.api.AuthenticationRuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.api.AuthenticationRule, com.google.api.AuthenticationRule.Builder, com.google.api.AuthenticationRuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
    }

    private java.util.List<com.google.api.AuthProvider> providers_ =
      java.util.Collections.emptyList();
    private void ensureProvidersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        providers_ = new java.util.ArrayList<com.google.api.AuthProvider>(providers_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.api.AuthProvider, com.google.api.AuthProvider.Builder, com.google.api.AuthProviderOrBuilder> providersBuilder_;

    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public java.util.List<com.google.api.AuthProvider> getProvidersList() {
      if (providersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(providers_);
      } else {
        return providersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public int getProvidersCount() {
      if (providersBuilder_ == null) {
        return providers_.size();
      } else {
        return providersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public com.google.api.AuthProvider getProviders(int index) {
      if (providersBuilder_ == null) {
        return providers_.get(index);
      } else {
        return providersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder setProviders(
        int index, com.google.api.AuthProvider value) {
      if (providersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProvidersIsMutable();
        providers_.set(index, value);
        onChanged();
      } else {
        providersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder setProviders(
        int index, com.google.api.AuthProvider.Builder builderForValue) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        providers_.set(index, builderForValue.build());
        onChanged();
      } else {
        providersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder addProviders(com.google.api.AuthProvider value) {
      if (providersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProvidersIsMutable();
        providers_.add(value);
        onChanged();
      } else {
        providersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder addProviders(
        int index, com.google.api.AuthProvider value) {
      if (providersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProvidersIsMutable();
        providers_.add(index, value);
        onChanged();
      } else {
        providersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder addProviders(
        com.google.api.AuthProvider.Builder builderForValue) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        providers_.add(builderForValue.build());
        onChanged();
      } else {
        providersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder addProviders(
        int index, com.google.api.AuthProvider.Builder builderForValue) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        providers_.add(index, builderForValue.build());
        onChanged();
      } else {
        providersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder addAllProviders(
        java.lang.Iterable<? extends com.google.api.AuthProvider> values) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, providers_);
        onChanged();
      } else {
        providersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder clearProviders() {
      if (providersBuilder_ == null) {
        providers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        providersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public Builder removeProviders(int index) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        providers_.remove(index);
        onChanged();
      } else {
        providersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public com.google.api.AuthProvider.Builder getProvidersBuilder(
        int index) {
      return getProvidersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public com.google.api.AuthProviderOrBuilder getProvidersOrBuilder(
        int index) {
      if (providersBuilder_ == null) {
        return providers_.get(index);  } else {
        return providersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public java.util.List<? extends com.google.api.AuthProviderOrBuilder> 
         getProvidersOrBuilderList() {
      if (providersBuilder_ != null) {
        return providersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(providers_);
      }
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public com.google.api.AuthProvider.Builder addProvidersBuilder() {
      return getProvidersFieldBuilder().addBuilder(
          com.google.api.AuthProvider.getDefaultInstance());
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public com.google.api.AuthProvider.Builder addProvidersBuilder(
        int index) {
      return getProvidersFieldBuilder().addBuilder(
          index, com.google.api.AuthProvider.getDefaultInstance());
    }
    /**
     * <code>repeated .google.api.AuthProvider providers = 4;</code>
     *
     * <pre>
     * Defines a set of authentication providers that a service supports.
     * </pre>
     */
    public java.util.List<com.google.api.AuthProvider.Builder> 
         getProvidersBuilderList() {
      return getProvidersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.api.AuthProvider, com.google.api.AuthProvider.Builder, com.google.api.AuthProviderOrBuilder> 
        getProvidersFieldBuilder() {
      if (providersBuilder_ == null) {
        providersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.api.AuthProvider, com.google.api.AuthProvider.Builder, com.google.api.AuthProviderOrBuilder>(
                providers_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        providers_ = null;
      }
      return providersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.Authentication)
  }

  // @@protoc_insertion_point(class_scope:google.api.Authentication)
  private static final com.google.api.Authentication DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.Authentication();
  }

  public static com.google.api.Authentication getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Authentication>
      PARSER = new com.google.protobuf.AbstractParser<Authentication>() {
    public Authentication parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Authentication(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Authentication> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Authentication> getParserForType() {
    return PARSER;
  }

  public com.google.api.Authentication getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

