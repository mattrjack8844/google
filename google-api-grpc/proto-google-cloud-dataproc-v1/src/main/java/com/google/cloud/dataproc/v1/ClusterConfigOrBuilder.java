// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface ClusterConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A Cloud Storage staging bucket used for sharing generated
   * SSH keys and config. If you do not specify a staging bucket, Cloud
   * Dataproc will determine an appropriate Cloud Storage location (US,
   * ASIA, or EU) for your cluster's staging bucket according to the Google
   * Compute Engine zone where your cluster is deployed, and then it will create
   * and manage this project-level, per-location bucket for you.
   * </pre>
   *
   * <code>string config_bucket = 1;</code>
   */
  java.lang.String getConfigBucket();
  /**
   *
   *
   * <pre>
   * Optional. A Cloud Storage staging bucket used for sharing generated
   * SSH keys and config. If you do not specify a staging bucket, Cloud
   * Dataproc will determine an appropriate Cloud Storage location (US,
   * ASIA, or EU) for your cluster's staging bucket according to the Google
   * Compute Engine zone where your cluster is deployed, and then it will create
   * and manage this project-level, per-location bucket for you.
   * </pre>
   *
   * <code>string config_bucket = 1;</code>
   */
  com.google.protobuf.ByteString getConfigBucketBytes();

  /**
   *
   *
   * <pre>
   * Required. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GceClusterConfig gce_cluster_config = 8;</code>
   */
  boolean hasGceClusterConfig();
  /**
   *
   *
   * <pre>
   * Required. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GceClusterConfig gce_cluster_config = 8;</code>
   */
  com.google.cloud.dataproc.v1.GceClusterConfig getGceClusterConfig();
  /**
   *
   *
   * <pre>
   * Required. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.GceClusterConfig gce_cluster_config = 8;</code>
   */
  com.google.cloud.dataproc.v1.GceClusterConfigOrBuilder getGceClusterConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the master instance in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig master_config = 9;</code>
   */
  boolean hasMasterConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the master instance in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig master_config = 9;</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfig getMasterConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the master instance in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig master_config = 9;</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfigOrBuilder getMasterConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig worker_config = 10;</code>
   */
  boolean hasWorkerConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig worker_config = 10;</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfig getWorkerConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig worker_config = 10;</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfigOrBuilder getWorkerConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * additional worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig secondary_worker_config = 12;</code>
   */
  boolean hasSecondaryWorkerConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * additional worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig secondary_worker_config = 12;</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfig getSecondaryWorkerConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * additional worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.InstanceGroupConfig secondary_worker_config = 12;</code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfigOrBuilder getSecondaryWorkerConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The config settings for software inside the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.SoftwareConfig software_config = 13;</code>
   */
  boolean hasSoftwareConfig();
  /**
   *
   *
   * <pre>
   * Optional. The config settings for software inside the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.SoftwareConfig software_config = 13;</code>
   */
  com.google.cloud.dataproc.v1.SoftwareConfig getSoftwareConfig();
  /**
   *
   *
   * <pre>
   * Optional. The config settings for software inside the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.SoftwareConfig software_config = 13;</code>
   */
  com.google.cloud.dataproc.v1.SoftwareConfigOrBuilder getSoftwareConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11;
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.NodeInitializationAction>
      getInitializationActionsList();
  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11;
   * </code>
   */
  com.google.cloud.dataproc.v1.NodeInitializationAction getInitializationActions(int index);
  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11;
   * </code>
   */
  int getInitializationActionsCount();
  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.NodeInitializationActionOrBuilder>
      getInitializationActionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11;
   * </code>
   */
  com.google.cloud.dataproc.v1.NodeInitializationActionOrBuilder getInitializationActionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.EncryptionConfig encryption_config = 15;</code>
   */
  boolean hasEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.EncryptionConfig encryption_config = 15;</code>
   */
  com.google.cloud.dataproc.v1.EncryptionConfig getEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.EncryptionConfig encryption_config = 15;</code>
   */
  com.google.cloud.dataproc.v1.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();
}
