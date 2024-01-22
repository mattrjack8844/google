// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1;

public interface DeploymentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.Deployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the deployment.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the deployment.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Immutable. The revision ID of the deployment.
   * A new revision is committed whenever a change in deployment is applied.
   * </pre>
   *
   * <code>string revision_id = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   * <pre>
   * Output only. Immutable. The revision ID of the deployment.
   * A new revision is committed whenever a change in deployment is applied.
   * </pre>
   *
   * <code>string revision_id = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString
      getRevisionIdBytes();

  /**
   * <pre>
   * Required. The blueprint revision from which this deployment was created.
   * </pre>
   *
   * <code>string source_blueprint_revision = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sourceBlueprintRevision.
   */
  java.lang.String getSourceBlueprintRevision();
  /**
   * <pre>
   * Required. The blueprint revision from which this deployment was created.
   * </pre>
   *
   * <code>string source_blueprint_revision = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for sourceBlueprintRevision.
   */
  com.google.protobuf.ByteString
      getSourceBlueprintRevisionBytes();

  /**
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the revisionCreateTime field is set.
   */
  boolean hasRevisionCreateTime();
  /**
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The revisionCreateTime.
   */
  com.google.protobuf.Timestamp getRevisionCreateTime();
  /**
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getRevisionCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. State of the deployment (DRAFT, APPLIED, DELETING).
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.Deployment.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of the deployment (DRAFT, APPLIED, DELETING).
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.Deployment.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.telcoautomation.v1.Deployment.State getState();

  /**
   * <pre>
   * Optional. Human readable name of a Deployment.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Optional. Human readable name of a Deployment.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. Name of the repository where the deployment package files are
   * stored.
   * </pre>
   *
   * <code>string repository = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The repository.
   */
  java.lang.String getRepository();
  /**
   * <pre>
   * Output only. Name of the repository where the deployment package files are
   * stored.
   * </pre>
   *
   * <code>string repository = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for repository.
   */
  com.google.protobuf.ByteString
      getRepositoryBytes();

  /**
   * <pre>
   * Optional. Files present in a deployment.
   * When invoking UpdateDeployment API, only the modified files should be
   * included in this. Files that are not included in the update of a deployment
   * will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.File files = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1.File> 
      getFilesList();
  /**
   * <pre>
   * Optional. Files present in a deployment.
   * When invoking UpdateDeployment API, only the modified files should be
   * included in this. Files that are not included in the update of a deployment
   * will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.File files = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.telcoautomation.v1.File getFiles(int index);
  /**
   * <pre>
   * Optional. Files present in a deployment.
   * When invoking UpdateDeployment API, only the modified files should be
   * included in this. Files that are not included in the update of a deployment
   * will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.File files = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getFilesCount();
  /**
   * <pre>
   * Optional. Files present in a deployment.
   * When invoking UpdateDeployment API, only the modified files should be
   * included in this. Files that are not included in the update of a deployment
   * will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.File files = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1.FileOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <pre>
   * Optional. Files present in a deployment.
   * When invoking UpdateDeployment API, only the modified files should be
   * included in this. Files that are not included in the update of a deployment
   * will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.File files = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.telcoautomation.v1.FileOrBuilder getFilesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a deployment
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a deployment
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a deployment
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a deployment
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a deployment
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Deployment creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Deployment creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Deployment creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The timestamp when the deployment was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp when the deployment was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The timestamp when the deployment was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Source provider is the author of a public blueprint, from
   * which this deployment is created.
   * </pre>
   *
   * <code>string source_provider = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sourceProvider.
   */
  java.lang.String getSourceProvider();
  /**
   * <pre>
   * Output only. Source provider is the author of a public blueprint, from
   * which this deployment is created.
   * </pre>
   *
   * <code>string source_provider = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for sourceProvider.
   */
  com.google.protobuf.ByteString
      getSourceProviderBytes();

  /**
   * <pre>
   * Optional. Immutable. The WorkloadCluster on which to create the Deployment.
   * </pre>
   *
   * <code>string workload_cluster = 13 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The workloadCluster.
   */
  java.lang.String getWorkloadCluster();
  /**
   * <pre>
   * Optional. Immutable. The WorkloadCluster on which to create the Deployment.
   * </pre>
   *
   * <code>string workload_cluster = 13 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for workloadCluster.
   */
  com.google.protobuf.ByteString
      getWorkloadClusterBytes();

  /**
   * <pre>
   * Output only. Attributes to where the deployment can inflict changes. The
   * value can only be [SINGLE_DEPLOYMENT, MULTI_DEPLOYMENT].
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.DeploymentLevel deployment_level = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for deploymentLevel.
   */
  int getDeploymentLevelValue();
  /**
   * <pre>
   * Output only. Attributes to where the deployment can inflict changes. The
   * value can only be [SINGLE_DEPLOYMENT, MULTI_DEPLOYMENT].
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.DeploymentLevel deployment_level = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deploymentLevel.
   */
  com.google.cloud.telcoautomation.v1.DeploymentLevel getDeploymentLevel();

  /**
   * <pre>
   * Output only. Indicates if the deployment can be rolled back, exported from
   * public blueprint.
   * </pre>
   *
   * <code>bool rollback_support = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The rollbackSupport.
   */
  boolean getRollbackSupport();
}
