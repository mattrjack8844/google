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
// source: google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 *
 *
 * <pre>
 * Registered Api Key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration}
 */
public final class PredictionApiKeyRegistration extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration)
    PredictionApiKeyRegistrationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PredictionApiKeyRegistration.newBuilder() to construct.
  private PredictionApiKeyRegistration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PredictionApiKeyRegistration() {
    apiKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PredictionApiKeyRegistration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService
        .internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService
        .internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.class,
            com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.Builder
                .class);
  }

  public static final int API_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object apiKey_;
  /**
   *
   *
   * <pre>
   * The API key.
   * </pre>
   *
   * <code>string api_key = 1;</code>
   *
   * @return The apiKey.
   */
  @java.lang.Override
  public java.lang.String getApiKey() {
    java.lang.Object ref = apiKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiKey_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The API key.
   * </pre>
   *
   * <code>string api_key = 1;</code>
   *
   * @return The bytes for apiKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getApiKeyBytes() {
    java.lang.Object ref = apiKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      apiKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, apiKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, apiKey_);
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
    if (!(obj
        instanceof com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration other =
        (com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration) obj;

    if (!getApiKey().equals(other.getApiKey())) return false;
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
    hash = (37 * hash) + API_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getApiKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      parseFrom(
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
      com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prototype) {
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
   * Registered Api Key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration)
      com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService
          .internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService
          .internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.class,
              com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      apiKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService
          .internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
        getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration build() {
      com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
        buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration result =
          new com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration(this);
      result.apiKey_ = apiKey_;
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
      if (other
          instanceof com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration) {
        return mergeFrom(
            (com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration other) {
      if (other
          == com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
              .getDefaultInstance()) return this;
      if (!other.getApiKey().isEmpty()) {
        apiKey_ = other.apiKey_;
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
                apiKey_ = input.readStringRequireUtf8();

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

    private java.lang.Object apiKey_ = "";
    /**
     *
     *
     * <pre>
     * The API key.
     * </pre>
     *
     * <code>string api_key = 1;</code>
     *
     * @return The apiKey.
     */
    public java.lang.String getApiKey() {
      java.lang.Object ref = apiKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The API key.
     * </pre>
     *
     * <code>string api_key = 1;</code>
     *
     * @return The bytes for apiKey.
     */
    public com.google.protobuf.ByteString getApiKeyBytes() {
      java.lang.Object ref = apiKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The API key.
     * </pre>
     *
     * <code>string api_key = 1;</code>
     *
     * @param value The apiKey to set.
     * @return This builder for chaining.
     */
    public Builder setApiKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      apiKey_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The API key.
     * </pre>
     *
     * <code>string api_key = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearApiKey() {

      apiKey_ = getDefaultInstance().getApiKey();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The API key.
     * </pre>
     *
     * <code>string api_key = 1;</code>
     *
     * @param value The bytes for apiKey to set.
     * @return This builder for chaining.
     */
    public Builder setApiKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      apiKey_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration)
  private static final com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration();
  }

  public static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredictionApiKeyRegistration> PARSER =
      new com.google.protobuf.AbstractParser<PredictionApiKeyRegistration>() {
        @java.lang.Override
        public PredictionApiKeyRegistration parsePartialFrom(
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

  public static com.google.protobuf.Parser<PredictionApiKeyRegistration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredictionApiKeyRegistration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
