// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1;

/**
 * <pre>
 * Request to load a snapshot into a Cloud Composer environment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest}
 */
public final class LoadSnapshotRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest)
    LoadSnapshotRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoadSnapshotRequest.newBuilder() to construct.
  private LoadSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoadSnapshotRequest() {
    environment_ = "";
    snapshotPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoadSnapshotRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1_LoadSnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1_LoadSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest.class, com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest.Builder.class);
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object environment_;
  /**
   * <pre>
   * The resource name of the target environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   * @return The environment.
   */
  @java.lang.Override
  public java.lang.String getEnvironment() {
    java.lang.Object ref = environment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      environment_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the target environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   * @return The bytes for environment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnvironmentBytes() {
    java.lang.Object ref = environment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      environment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object snapshotPath_;
  /**
   * <pre>
   * A Cloud Storage path to a snapshot to load, e.g.:
   * "gs://my-bucket/snapshots/project_location_environment_timestamp".
   * </pre>
   *
   * <code>string snapshot_path = 2;</code>
   * @return The snapshotPath.
   */
  @java.lang.Override
  public java.lang.String getSnapshotPath() {
    java.lang.Object ref = snapshotPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A Cloud Storage path to a snapshot to load, e.g.:
   * "gs://my-bucket/snapshots/project_location_environment_timestamp".
   * </pre>
   *
   * <code>string snapshot_path = 2;</code>
   * @return The bytes for snapshotPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSnapshotPathBytes() {
    java.lang.Object ref = snapshotPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapshotPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKIP_PYPI_PACKAGES_INSTALLATION_FIELD_NUMBER = 3;
  private boolean skipPypiPackagesInstallation_;
  /**
   * <pre>
   * Whether or not to skip installing Pypi packages when loading the
   * environment's state.
   * </pre>
   *
   * <code>bool skip_pypi_packages_installation = 3;</code>
   * @return The skipPypiPackagesInstallation.
   */
  @java.lang.Override
  public boolean getSkipPypiPackagesInstallation() {
    return skipPypiPackagesInstallation_;
  }

  public static final int SKIP_ENVIRONMENT_VARIABLES_SETTING_FIELD_NUMBER = 4;
  private boolean skipEnvironmentVariablesSetting_;
  /**
   * <pre>
   * Whether or not to skip setting environment variables when loading the
   * environment's state.
   * </pre>
   *
   * <code>bool skip_environment_variables_setting = 4;</code>
   * @return The skipEnvironmentVariablesSetting.
   */
  @java.lang.Override
  public boolean getSkipEnvironmentVariablesSetting() {
    return skipEnvironmentVariablesSetting_;
  }

  public static final int SKIP_AIRFLOW_OVERRIDES_SETTING_FIELD_NUMBER = 5;
  private boolean skipAirflowOverridesSetting_;
  /**
   * <pre>
   * Whether or not to skip setting Airflow overrides when loading the
   * environment's state.
   * </pre>
   *
   * <code>bool skip_airflow_overrides_setting = 5;</code>
   * @return The skipAirflowOverridesSetting.
   */
  @java.lang.Override
  public boolean getSkipAirflowOverridesSetting() {
    return skipAirflowOverridesSetting_;
  }

  public static final int SKIP_GCS_DATA_COPYING_FIELD_NUMBER = 6;
  private boolean skipGcsDataCopying_;
  /**
   * <pre>
   * Whether or not to skip copying Cloud Storage data when loading the
   * environment's state.
   * </pre>
   *
   * <code>bool skip_gcs_data_copying = 6;</code>
   * @return The skipGcsDataCopying.
   */
  @java.lang.Override
  public boolean getSkipGcsDataCopying() {
    return skipGcsDataCopying_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(environment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, environment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, snapshotPath_);
    }
    if (skipPypiPackagesInstallation_ != false) {
      output.writeBool(3, skipPypiPackagesInstallation_);
    }
    if (skipEnvironmentVariablesSetting_ != false) {
      output.writeBool(4, skipEnvironmentVariablesSetting_);
    }
    if (skipAirflowOverridesSetting_ != false) {
      output.writeBool(5, skipAirflowOverridesSetting_);
    }
    if (skipGcsDataCopying_ != false) {
      output.writeBool(6, skipGcsDataCopying_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(environment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, environment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, snapshotPath_);
    }
    if (skipPypiPackagesInstallation_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, skipPypiPackagesInstallation_);
    }
    if (skipEnvironmentVariablesSetting_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, skipEnvironmentVariablesSetting_);
    }
    if (skipAirflowOverridesSetting_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, skipAirflowOverridesSetting_);
    }
    if (skipGcsDataCopying_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, skipGcsDataCopying_);
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
    if (!(obj instanceof com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest other = (com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest) obj;

    if (!getEnvironment()
        .equals(other.getEnvironment())) return false;
    if (!getSnapshotPath()
        .equals(other.getSnapshotPath())) return false;
    if (getSkipPypiPackagesInstallation()
        != other.getSkipPypiPackagesInstallation()) return false;
    if (getSkipEnvironmentVariablesSetting()
        != other.getSkipEnvironmentVariablesSetting()) return false;
    if (getSkipAirflowOverridesSetting()
        != other.getSkipAirflowOverridesSetting()) return false;
    if (getSkipGcsDataCopying()
        != other.getSkipGcsDataCopying()) return false;
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
    hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
    hash = (53 * hash) + getEnvironment().hashCode();
    hash = (37 * hash) + SNAPSHOT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotPath().hashCode();
    hash = (37 * hash) + SKIP_PYPI_PACKAGES_INSTALLATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSkipPypiPackagesInstallation());
    hash = (37 * hash) + SKIP_ENVIRONMENT_VARIABLES_SETTING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSkipEnvironmentVariablesSetting());
    hash = (37 * hash) + SKIP_AIRFLOW_OVERRIDES_SETTING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSkipAirflowOverridesSetting());
    hash = (37 * hash) + SKIP_GCS_DATA_COPYING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSkipGcsDataCopying());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest prototype) {
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
   * Request to load a snapshot into a Cloud Composer environment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest)
      com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1_LoadSnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1_LoadSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest.class, com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest.Builder.class);
    }

    // Construct using com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      environment_ = "";

      snapshotPath_ = "";

      skipPypiPackagesInstallation_ = false;

      skipEnvironmentVariablesSetting_ = false;

      skipAirflowOverridesSetting_ = false;

      skipGcsDataCopying_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1_LoadSnapshotRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest build() {
      com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest result = new com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest(this);
      result.environment_ = environment_;
      result.snapshotPath_ = snapshotPath_;
      result.skipPypiPackagesInstallation_ = skipPypiPackagesInstallation_;
      result.skipEnvironmentVariablesSetting_ = skipEnvironmentVariablesSetting_;
      result.skipAirflowOverridesSetting_ = skipAirflowOverridesSetting_;
      result.skipGcsDataCopying_ = skipGcsDataCopying_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest) {
        return mergeFrom((com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest other) {
      if (other == com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest.getDefaultInstance()) return this;
      if (!other.getEnvironment().isEmpty()) {
        environment_ = other.environment_;
        onChanged();
      }
      if (!other.getSnapshotPath().isEmpty()) {
        snapshotPath_ = other.snapshotPath_;
        onChanged();
      }
      if (other.getSkipPypiPackagesInstallation() != false) {
        setSkipPypiPackagesInstallation(other.getSkipPypiPackagesInstallation());
      }
      if (other.getSkipEnvironmentVariablesSetting() != false) {
        setSkipEnvironmentVariablesSetting(other.getSkipEnvironmentVariablesSetting());
      }
      if (other.getSkipAirflowOverridesSetting() != false) {
        setSkipAirflowOverridesSetting(other.getSkipAirflowOverridesSetting());
      }
      if (other.getSkipGcsDataCopying() != false) {
        setSkipGcsDataCopying(other.getSkipGcsDataCopying());
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
              environment_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              snapshotPath_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              skipPypiPackagesInstallation_ = input.readBool();

              break;
            } // case 24
            case 32: {
              skipEnvironmentVariablesSetting_ = input.readBool();

              break;
            } // case 32
            case 40: {
              skipAirflowOverridesSetting_ = input.readBool();

              break;
            } // case 40
            case 48: {
              skipGcsDataCopying_ = input.readBool();

              break;
            } // case 48
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

    private java.lang.Object environment_ = "";
    /**
     * <pre>
     * The resource name of the target environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     * @return The environment.
     */
    public java.lang.String getEnvironment() {
      java.lang.Object ref = environment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        environment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the target environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     * @return The bytes for environment.
     */
    public com.google.protobuf.ByteString
        getEnvironmentBytes() {
      java.lang.Object ref = environment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        environment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the target environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     * @param value The environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      environment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the target environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironment() {
      
      environment_ = getDefaultInstance().getEnvironment();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the target environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     * @param value The bytes for environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      environment_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object snapshotPath_ = "";
    /**
     * <pre>
     * A Cloud Storage path to a snapshot to load, e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * </pre>
     *
     * <code>string snapshot_path = 2;</code>
     * @return The snapshotPath.
     */
    public java.lang.String getSnapshotPath() {
      java.lang.Object ref = snapshotPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A Cloud Storage path to a snapshot to load, e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * </pre>
     *
     * <code>string snapshot_path = 2;</code>
     * @return The bytes for snapshotPath.
     */
    public com.google.protobuf.ByteString
        getSnapshotPathBytes() {
      java.lang.Object ref = snapshotPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapshotPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A Cloud Storage path to a snapshot to load, e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * </pre>
     *
     * <code>string snapshot_path = 2;</code>
     * @param value The snapshotPath to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      snapshotPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Cloud Storage path to a snapshot to load, e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * </pre>
     *
     * <code>string snapshot_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSnapshotPath() {
      
      snapshotPath_ = getDefaultInstance().getSnapshotPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Cloud Storage path to a snapshot to load, e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * </pre>
     *
     * <code>string snapshot_path = 2;</code>
     * @param value The bytes for snapshotPath to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      snapshotPath_ = value;
      onChanged();
      return this;
    }

    private boolean skipPypiPackagesInstallation_ ;
    /**
     * <pre>
     * Whether or not to skip installing Pypi packages when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_pypi_packages_installation = 3;</code>
     * @return The skipPypiPackagesInstallation.
     */
    @java.lang.Override
    public boolean getSkipPypiPackagesInstallation() {
      return skipPypiPackagesInstallation_;
    }
    /**
     * <pre>
     * Whether or not to skip installing Pypi packages when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_pypi_packages_installation = 3;</code>
     * @param value The skipPypiPackagesInstallation to set.
     * @return This builder for chaining.
     */
    public Builder setSkipPypiPackagesInstallation(boolean value) {
      
      skipPypiPackagesInstallation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to skip installing Pypi packages when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_pypi_packages_installation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkipPypiPackagesInstallation() {
      
      skipPypiPackagesInstallation_ = false;
      onChanged();
      return this;
    }

    private boolean skipEnvironmentVariablesSetting_ ;
    /**
     * <pre>
     * Whether or not to skip setting environment variables when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_environment_variables_setting = 4;</code>
     * @return The skipEnvironmentVariablesSetting.
     */
    @java.lang.Override
    public boolean getSkipEnvironmentVariablesSetting() {
      return skipEnvironmentVariablesSetting_;
    }
    /**
     * <pre>
     * Whether or not to skip setting environment variables when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_environment_variables_setting = 4;</code>
     * @param value The skipEnvironmentVariablesSetting to set.
     * @return This builder for chaining.
     */
    public Builder setSkipEnvironmentVariablesSetting(boolean value) {
      
      skipEnvironmentVariablesSetting_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to skip setting environment variables when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_environment_variables_setting = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkipEnvironmentVariablesSetting() {
      
      skipEnvironmentVariablesSetting_ = false;
      onChanged();
      return this;
    }

    private boolean skipAirflowOverridesSetting_ ;
    /**
     * <pre>
     * Whether or not to skip setting Airflow overrides when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_airflow_overrides_setting = 5;</code>
     * @return The skipAirflowOverridesSetting.
     */
    @java.lang.Override
    public boolean getSkipAirflowOverridesSetting() {
      return skipAirflowOverridesSetting_;
    }
    /**
     * <pre>
     * Whether or not to skip setting Airflow overrides when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_airflow_overrides_setting = 5;</code>
     * @param value The skipAirflowOverridesSetting to set.
     * @return This builder for chaining.
     */
    public Builder setSkipAirflowOverridesSetting(boolean value) {
      
      skipAirflowOverridesSetting_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to skip setting Airflow overrides when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_airflow_overrides_setting = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkipAirflowOverridesSetting() {
      
      skipAirflowOverridesSetting_ = false;
      onChanged();
      return this;
    }

    private boolean skipGcsDataCopying_ ;
    /**
     * <pre>
     * Whether or not to skip copying Cloud Storage data when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_gcs_data_copying = 6;</code>
     * @return The skipGcsDataCopying.
     */
    @java.lang.Override
    public boolean getSkipGcsDataCopying() {
      return skipGcsDataCopying_;
    }
    /**
     * <pre>
     * Whether or not to skip copying Cloud Storage data when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_gcs_data_copying = 6;</code>
     * @param value The skipGcsDataCopying to set.
     * @return This builder for chaining.
     */
    public Builder setSkipGcsDataCopying(boolean value) {
      
      skipGcsDataCopying_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to skip copying Cloud Storage data when loading the
     * environment's state.
     * </pre>
     *
     * <code>bool skip_gcs_data_copying = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkipGcsDataCopying() {
      
      skipGcsDataCopying_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest)
  private static final com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest();
  }

  public static com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoadSnapshotRequest>
      PARSER = new com.google.protobuf.AbstractParser<LoadSnapshotRequest>() {
    @java.lang.Override
    public LoadSnapshotRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoadSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoadSnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

