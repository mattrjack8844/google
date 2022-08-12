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
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Response message for 'GenerateSshScript' request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.SshScript}
 */
public final class SshScript extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.SshScript)
    SshScriptOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SshScript.newBuilder() to construct.
  private SshScript(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SshScript() {
    script_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SshScript();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SshScript(
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

              script_ = s;
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
    return com.google.cloud.clouddms.v1.ClouddmsProto
        .internal_static_google_cloud_clouddms_v1_SshScript_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ClouddmsProto
        .internal_static_google_cloud_clouddms_v1_SshScript_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.SshScript.class,
            com.google.cloud.clouddms.v1.SshScript.Builder.class);
  }

  public static final int SCRIPT_FIELD_NUMBER = 1;
  private volatile java.lang.Object script_;
  /**
   *
   *
   * <pre>
   * The ssh configuration script.
   * </pre>
   *
   * <code>string script = 1;</code>
   *
   * @return The script.
   */
  @java.lang.Override
  public java.lang.String getScript() {
    java.lang.Object ref = script_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      script_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ssh configuration script.
   * </pre>
   *
   * <code>string script = 1;</code>
   *
   * @return The bytes for script.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScriptBytes() {
    java.lang.Object ref = script_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      script_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(script_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, script_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(script_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, script_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.SshScript)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.SshScript other = (com.google.cloud.clouddms.v1.SshScript) obj;

    if (!getScript().equals(other.getScript())) return false;
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
    hash = (37 * hash) + SCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getScript().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SshScript parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.SshScript prototype) {
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
   * Response message for 'GenerateSshScript' request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.SshScript}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.SshScript)
      com.google.cloud.clouddms.v1.SshScriptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_SshScript_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_SshScript_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.SshScript.class,
              com.google.cloud.clouddms.v1.SshScript.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.SshScript.newBuilder()
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
      script_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_SshScript_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SshScript getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.SshScript.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SshScript build() {
      com.google.cloud.clouddms.v1.SshScript result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SshScript buildPartial() {
      com.google.cloud.clouddms.v1.SshScript result =
          new com.google.cloud.clouddms.v1.SshScript(this);
      result.script_ = script_;
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
      if (other instanceof com.google.cloud.clouddms.v1.SshScript) {
        return mergeFrom((com.google.cloud.clouddms.v1.SshScript) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.SshScript other) {
      if (other == com.google.cloud.clouddms.v1.SshScript.getDefaultInstance()) return this;
      if (!other.getScript().isEmpty()) {
        script_ = other.script_;
        onChanged();
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
      com.google.cloud.clouddms.v1.SshScript parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.clouddms.v1.SshScript) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object script_ = "";
    /**
     *
     *
     * <pre>
     * The ssh configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     *
     * @return The script.
     */
    public java.lang.String getScript() {
      java.lang.Object ref = script_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        script_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ssh configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     *
     * @return The bytes for script.
     */
    public com.google.protobuf.ByteString getScriptBytes() {
      java.lang.Object ref = script_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        script_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ssh configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     *
     * @param value The script to set.
     * @return This builder for chaining.
     */
    public Builder setScript(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      script_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ssh configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScript() {

      script_ = getDefaultInstance().getScript();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ssh configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     *
     * @param value The bytes for script to set.
     * @return This builder for chaining.
     */
    public Builder setScriptBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      script_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.SshScript)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.SshScript)
  private static final com.google.cloud.clouddms.v1.SshScript DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.SshScript();
  }

  public static com.google.cloud.clouddms.v1.SshScript getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SshScript> PARSER =
      new com.google.protobuf.AbstractParser<SshScript>() {
        @java.lang.Override
        public SshScript parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SshScript(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SshScript> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SshScript> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.SshScript getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
