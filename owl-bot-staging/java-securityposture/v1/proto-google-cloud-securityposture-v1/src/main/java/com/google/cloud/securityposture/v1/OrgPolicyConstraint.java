// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securityposture/v1/org_policy_constraints.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securityposture.v1;

/**
 * <pre>
 * Message for Org Policy Canned Constraint.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securityposture.v1.OrgPolicyConstraint}
 */
public final class OrgPolicyConstraint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securityposture.v1.OrgPolicyConstraint)
    OrgPolicyConstraintOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrgPolicyConstraint.newBuilder() to construct.
  private OrgPolicyConstraint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrgPolicyConstraint() {
    cannedConstraintId_ = "";
    policyRules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrgPolicyConstraint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securityposture.v1.OrgPolicyConstraintsProto.internal_static_google_cloud_securityposture_v1_OrgPolicyConstraint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securityposture.v1.OrgPolicyConstraintsProto.internal_static_google_cloud_securityposture_v1_OrgPolicyConstraint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securityposture.v1.OrgPolicyConstraint.class, com.google.cloud.securityposture.v1.OrgPolicyConstraint.Builder.class);
  }

  public static final int CANNED_CONSTRAINT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cannedConstraintId_ = "";
  /**
   * <pre>
   * Required. Org Policy Canned Constraint id.
   * </pre>
   *
   * <code>string canned_constraint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The cannedConstraintId.
   */
  @java.lang.Override
  public java.lang.String getCannedConstraintId() {
    java.lang.Object ref = cannedConstraintId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cannedConstraintId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Org Policy Canned Constraint id.
   * </pre>
   *
   * <code>string canned_constraint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for cannedConstraintId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCannedConstraintIdBytes() {
    java.lang.Object ref = cannedConstraintId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cannedConstraintId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLICY_RULES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.securityposture.v1.PolicyRule> policyRules_;
  /**
   * <pre>
   * Required. Org PolicySpec rules.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.securityposture.v1.PolicyRule> getPolicyRulesList() {
    return policyRules_;
  }
  /**
   * <pre>
   * Required. Org PolicySpec rules.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.securityposture.v1.PolicyRuleOrBuilder> 
      getPolicyRulesOrBuilderList() {
    return policyRules_;
  }
  /**
   * <pre>
   * Required. Org PolicySpec rules.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getPolicyRulesCount() {
    return policyRules_.size();
  }
  /**
   * <pre>
   * Required. Org PolicySpec rules.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.PolicyRule getPolicyRules(int index) {
    return policyRules_.get(index);
  }
  /**
   * <pre>
   * Required. Org PolicySpec rules.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.PolicyRuleOrBuilder getPolicyRulesOrBuilder(
      int index) {
    return policyRules_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cannedConstraintId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cannedConstraintId_);
    }
    for (int i = 0; i < policyRules_.size(); i++) {
      output.writeMessage(2, policyRules_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cannedConstraintId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cannedConstraintId_);
    }
    for (int i = 0; i < policyRules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, policyRules_.get(i));
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
    if (!(obj instanceof com.google.cloud.securityposture.v1.OrgPolicyConstraint)) {
      return super.equals(obj);
    }
    com.google.cloud.securityposture.v1.OrgPolicyConstraint other = (com.google.cloud.securityposture.v1.OrgPolicyConstraint) obj;

    if (!getCannedConstraintId()
        .equals(other.getCannedConstraintId())) return false;
    if (!getPolicyRulesList()
        .equals(other.getPolicyRulesList())) return false;
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
    hash = (37 * hash) + CANNED_CONSTRAINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCannedConstraintId().hashCode();
    if (getPolicyRulesCount() > 0) {
      hash = (37 * hash) + POLICY_RULES_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyRulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.securityposture.v1.OrgPolicyConstraint prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message for Org Policy Canned Constraint.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securityposture.v1.OrgPolicyConstraint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securityposture.v1.OrgPolicyConstraint)
      com.google.cloud.securityposture.v1.OrgPolicyConstraintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securityposture.v1.OrgPolicyConstraintsProto.internal_static_google_cloud_securityposture_v1_OrgPolicyConstraint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securityposture.v1.OrgPolicyConstraintsProto.internal_static_google_cloud_securityposture_v1_OrgPolicyConstraint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securityposture.v1.OrgPolicyConstraint.class, com.google.cloud.securityposture.v1.OrgPolicyConstraint.Builder.class);
    }

    // Construct using com.google.cloud.securityposture.v1.OrgPolicyConstraint.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cannedConstraintId_ = "";
      if (policyRulesBuilder_ == null) {
        policyRules_ = java.util.Collections.emptyList();
      } else {
        policyRules_ = null;
        policyRulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securityposture.v1.OrgPolicyConstraintsProto.internal_static_google_cloud_securityposture_v1_OrgPolicyConstraint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.OrgPolicyConstraint getDefaultInstanceForType() {
      return com.google.cloud.securityposture.v1.OrgPolicyConstraint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.OrgPolicyConstraint build() {
      com.google.cloud.securityposture.v1.OrgPolicyConstraint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.OrgPolicyConstraint buildPartial() {
      com.google.cloud.securityposture.v1.OrgPolicyConstraint result = new com.google.cloud.securityposture.v1.OrgPolicyConstraint(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.securityposture.v1.OrgPolicyConstraint result) {
      if (policyRulesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          policyRules_ = java.util.Collections.unmodifiableList(policyRules_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.policyRules_ = policyRules_;
      } else {
        result.policyRules_ = policyRulesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.securityposture.v1.OrgPolicyConstraint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cannedConstraintId_ = cannedConstraintId_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securityposture.v1.OrgPolicyConstraint) {
        return mergeFrom((com.google.cloud.securityposture.v1.OrgPolicyConstraint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securityposture.v1.OrgPolicyConstraint other) {
      if (other == com.google.cloud.securityposture.v1.OrgPolicyConstraint.getDefaultInstance()) return this;
      if (!other.getCannedConstraintId().isEmpty()) {
        cannedConstraintId_ = other.cannedConstraintId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (policyRulesBuilder_ == null) {
        if (!other.policyRules_.isEmpty()) {
          if (policyRules_.isEmpty()) {
            policyRules_ = other.policyRules_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePolicyRulesIsMutable();
            policyRules_.addAll(other.policyRules_);
          }
          onChanged();
        }
      } else {
        if (!other.policyRules_.isEmpty()) {
          if (policyRulesBuilder_.isEmpty()) {
            policyRulesBuilder_.dispose();
            policyRulesBuilder_ = null;
            policyRules_ = other.policyRules_;
            bitField0_ = (bitField0_ & ~0x00000002);
            policyRulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPolicyRulesFieldBuilder() : null;
          } else {
            policyRulesBuilder_.addAllMessages(other.policyRules_);
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
            case 10: {
              cannedConstraintId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.cloud.securityposture.v1.PolicyRule m =
                  input.readMessage(
                      com.google.cloud.securityposture.v1.PolicyRule.parser(),
                      extensionRegistry);
              if (policyRulesBuilder_ == null) {
                ensurePolicyRulesIsMutable();
                policyRules_.add(m);
              } else {
                policyRulesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
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

    private java.lang.Object cannedConstraintId_ = "";
    /**
     * <pre>
     * Required. Org Policy Canned Constraint id.
     * </pre>
     *
     * <code>string canned_constraint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The cannedConstraintId.
     */
    public java.lang.String getCannedConstraintId() {
      java.lang.Object ref = cannedConstraintId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cannedConstraintId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Org Policy Canned Constraint id.
     * </pre>
     *
     * <code>string canned_constraint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for cannedConstraintId.
     */
    public com.google.protobuf.ByteString
        getCannedConstraintIdBytes() {
      java.lang.Object ref = cannedConstraintId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cannedConstraintId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Org Policy Canned Constraint id.
     * </pre>
     *
     * <code>string canned_constraint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The cannedConstraintId to set.
     * @return This builder for chaining.
     */
    public Builder setCannedConstraintId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cannedConstraintId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Org Policy Canned Constraint id.
     * </pre>
     *
     * <code>string canned_constraint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCannedConstraintId() {
      cannedConstraintId_ = getDefaultInstance().getCannedConstraintId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Org Policy Canned Constraint id.
     * </pre>
     *
     * <code>string canned_constraint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for cannedConstraintId to set.
     * @return This builder for chaining.
     */
    public Builder setCannedConstraintIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cannedConstraintId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.securityposture.v1.PolicyRule> policyRules_ =
      java.util.Collections.emptyList();
    private void ensurePolicyRulesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        policyRules_ = new java.util.ArrayList<com.google.cloud.securityposture.v1.PolicyRule>(policyRules_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.securityposture.v1.PolicyRule, com.google.cloud.securityposture.v1.PolicyRule.Builder, com.google.cloud.securityposture.v1.PolicyRuleOrBuilder> policyRulesBuilder_;

    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloud.securityposture.v1.PolicyRule> getPolicyRulesList() {
      if (policyRulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(policyRules_);
      } else {
        return policyRulesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getPolicyRulesCount() {
      if (policyRulesBuilder_ == null) {
        return policyRules_.size();
      } else {
        return policyRulesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securityposture.v1.PolicyRule getPolicyRules(int index) {
      if (policyRulesBuilder_ == null) {
        return policyRules_.get(index);
      } else {
        return policyRulesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicyRules(
        int index, com.google.cloud.securityposture.v1.PolicyRule value) {
      if (policyRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyRulesIsMutable();
        policyRules_.set(index, value);
        onChanged();
      } else {
        policyRulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicyRules(
        int index, com.google.cloud.securityposture.v1.PolicyRule.Builder builderForValue) {
      if (policyRulesBuilder_ == null) {
        ensurePolicyRulesIsMutable();
        policyRules_.set(index, builderForValue.build());
        onChanged();
      } else {
        policyRulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addPolicyRules(com.google.cloud.securityposture.v1.PolicyRule value) {
      if (policyRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyRulesIsMutable();
        policyRules_.add(value);
        onChanged();
      } else {
        policyRulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addPolicyRules(
        int index, com.google.cloud.securityposture.v1.PolicyRule value) {
      if (policyRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyRulesIsMutable();
        policyRules_.add(index, value);
        onChanged();
      } else {
        policyRulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addPolicyRules(
        com.google.cloud.securityposture.v1.PolicyRule.Builder builderForValue) {
      if (policyRulesBuilder_ == null) {
        ensurePolicyRulesIsMutable();
        policyRules_.add(builderForValue.build());
        onChanged();
      } else {
        policyRulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addPolicyRules(
        int index, com.google.cloud.securityposture.v1.PolicyRule.Builder builderForValue) {
      if (policyRulesBuilder_ == null) {
        ensurePolicyRulesIsMutable();
        policyRules_.add(index, builderForValue.build());
        onChanged();
      } else {
        policyRulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllPolicyRules(
        java.lang.Iterable<? extends com.google.cloud.securityposture.v1.PolicyRule> values) {
      if (policyRulesBuilder_ == null) {
        ensurePolicyRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, policyRules_);
        onChanged();
      } else {
        policyRulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPolicyRules() {
      if (policyRulesBuilder_ == null) {
        policyRules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        policyRulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removePolicyRules(int index) {
      if (policyRulesBuilder_ == null) {
        ensurePolicyRulesIsMutable();
        policyRules_.remove(index);
        onChanged();
      } else {
        policyRulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securityposture.v1.PolicyRule.Builder getPolicyRulesBuilder(
        int index) {
      return getPolicyRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securityposture.v1.PolicyRuleOrBuilder getPolicyRulesOrBuilder(
        int index) {
      if (policyRulesBuilder_ == null) {
        return policyRules_.get(index);  } else {
        return policyRulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.cloud.securityposture.v1.PolicyRuleOrBuilder> 
         getPolicyRulesOrBuilderList() {
      if (policyRulesBuilder_ != null) {
        return policyRulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(policyRules_);
      }
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securityposture.v1.PolicyRule.Builder addPolicyRulesBuilder() {
      return getPolicyRulesFieldBuilder().addBuilder(
          com.google.cloud.securityposture.v1.PolicyRule.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securityposture.v1.PolicyRule.Builder addPolicyRulesBuilder(
        int index) {
      return getPolicyRulesFieldBuilder().addBuilder(
          index, com.google.cloud.securityposture.v1.PolicyRule.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. Org PolicySpec rules.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.PolicyRule policy_rules = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloud.securityposture.v1.PolicyRule.Builder> 
         getPolicyRulesBuilderList() {
      return getPolicyRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.securityposture.v1.PolicyRule, com.google.cloud.securityposture.v1.PolicyRule.Builder, com.google.cloud.securityposture.v1.PolicyRuleOrBuilder> 
        getPolicyRulesFieldBuilder() {
      if (policyRulesBuilder_ == null) {
        policyRulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securityposture.v1.PolicyRule, com.google.cloud.securityposture.v1.PolicyRule.Builder, com.google.cloud.securityposture.v1.PolicyRuleOrBuilder>(
                policyRules_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        policyRules_ = null;
      }
      return policyRulesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.securityposture.v1.OrgPolicyConstraint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securityposture.v1.OrgPolicyConstraint)
  private static final com.google.cloud.securityposture.v1.OrgPolicyConstraint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securityposture.v1.OrgPolicyConstraint();
  }

  public static com.google.cloud.securityposture.v1.OrgPolicyConstraint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrgPolicyConstraint>
      PARSER = new com.google.protobuf.AbstractParser<OrgPolicyConstraint>() {
    @java.lang.Override
    public OrgPolicyConstraint parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrgPolicyConstraint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrgPolicyConstraint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securityposture.v1.OrgPolicyConstraint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

