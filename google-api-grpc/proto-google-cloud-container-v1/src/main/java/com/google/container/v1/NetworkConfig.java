// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * NetworkConfig reports the relative names of network &amp; subnetwork.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.NetworkConfig}
 */
public final class NetworkConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.NetworkConfig)
    NetworkConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkConfig.newBuilder() to construct.
  private NetworkConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkConfig() {
    network_ = "";
    subnetwork_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NetworkConfig(
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
              java.lang.String s = input.readStringRequireUtf8();

              network_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              subnetwork_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_NetworkConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_NetworkConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.NetworkConfig.class,
            com.google.container.v1.NetworkConfig.Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;
  private volatile java.lang.Object network_;
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
   * the cluster is connected.
   * Example: projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   */
  public java.lang.String getNetwork() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      network_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
   * the cluster is connected.
   * Example: projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   */
  public com.google.protobuf.ByteString getNetworkBytes() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      network_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBNETWORK_FIELD_NUMBER = 2;
  private volatile java.lang.Object subnetwork_;
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   */
  public java.lang.String getSubnetwork() {
    java.lang.Object ref = subnetwork_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnetwork_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   */
  public com.google.protobuf.ByteString getSubnetworkBytes() {
    java.lang.Object ref = subnetwork_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subnetwork_ = b;
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
    if (!getNetworkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, network_);
    }
    if (!getSubnetworkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subnetwork_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNetworkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, network_);
    }
    if (!getSubnetworkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subnetwork_);
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
    if (!(obj instanceof com.google.container.v1.NetworkConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.NetworkConfig other = (com.google.container.v1.NetworkConfig) obj;

    if (!getNetwork().equals(other.getNetwork())) return false;
    if (!getSubnetwork().equals(other.getSubnetwork())) return false;
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
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getNetwork().hashCode();
    hash = (37 * hash) + SUBNETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getSubnetwork().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.NetworkConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.NetworkConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NetworkConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NetworkConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.NetworkConfig prototype) {
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
   * NetworkConfig reports the relative names of network &amp; subnetwork.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.NetworkConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.NetworkConfig)
      com.google.container.v1.NetworkConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NetworkConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NetworkConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.NetworkConfig.class,
              com.google.container.v1.NetworkConfig.Builder.class);
    }

    // Construct using com.google.container.v1.NetworkConfig.newBuilder()
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
      network_ = "";

      subnetwork_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NetworkConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.NetworkConfig getDefaultInstanceForType() {
      return com.google.container.v1.NetworkConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.NetworkConfig build() {
      com.google.container.v1.NetworkConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.NetworkConfig buildPartial() {
      com.google.container.v1.NetworkConfig result =
          new com.google.container.v1.NetworkConfig(this);
      result.network_ = network_;
      result.subnetwork_ = subnetwork_;
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
      if (other instanceof com.google.container.v1.NetworkConfig) {
        return mergeFrom((com.google.container.v1.NetworkConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.NetworkConfig other) {
      if (other == com.google.container.v1.NetworkConfig.getDefaultInstance()) return this;
      if (!other.getNetwork().isEmpty()) {
        network_ = other.network_;
        onChanged();
      }
      if (!other.getSubnetwork().isEmpty()) {
        subnetwork_ = other.subnetwork_;
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
      com.google.container.v1.NetworkConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.NetworkConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object network_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
     * the cluster is connected.
     * Example: projects/my-project/global/networks/my-network
     * </pre>
     *
     * <code>string network = 1;</code>
     */
    public java.lang.String getNetwork() {
      java.lang.Object ref = network_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        network_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
     * the cluster is connected.
     * Example: projects/my-project/global/networks/my-network
     * </pre>
     *
     * <code>string network = 1;</code>
     */
    public com.google.protobuf.ByteString getNetworkBytes() {
      java.lang.Object ref = network_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        network_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
     * the cluster is connected.
     * Example: projects/my-project/global/networks/my-network
     * </pre>
     *
     * <code>string network = 1;</code>
     */
    public Builder setNetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      network_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
     * the cluster is connected.
     * Example: projects/my-project/global/networks/my-network
     * </pre>
     *
     * <code>string network = 1;</code>
     */
    public Builder clearNetwork() {

      network_ = getDefaultInstance().getNetwork();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
     * the cluster is connected.
     * Example: projects/my-project/global/networks/my-network
     * </pre>
     *
     * <code>string network = 1;</code>
     */
    public Builder setNetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      network_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subnetwork_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
     * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     */
    public java.lang.String getSubnetwork() {
      java.lang.Object ref = subnetwork_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnetwork_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
     * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     */
    public com.google.protobuf.ByteString getSubnetworkBytes() {
      java.lang.Object ref = subnetwork_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subnetwork_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
     * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     */
    public Builder setSubnetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      subnetwork_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
     * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     */
    public Builder clearSubnetwork() {

      subnetwork_ = getDefaultInstance().getSubnetwork();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The relative name of the Google Compute Engine
     * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
     * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     */
    public Builder setSubnetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      subnetwork_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.NetworkConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.NetworkConfig)
  private static final com.google.container.v1.NetworkConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.NetworkConfig();
  }

  public static com.google.container.v1.NetworkConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkConfig> PARSER =
      new com.google.protobuf.AbstractParser<NetworkConfig>() {
        @java.lang.Override
        public NetworkConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NetworkConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NetworkConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.NetworkConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
