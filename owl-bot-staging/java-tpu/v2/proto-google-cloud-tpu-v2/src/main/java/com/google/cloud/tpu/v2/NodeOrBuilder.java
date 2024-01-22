// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

public interface NodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.Node)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Immutable. The name of the TPU.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Immutable. The name of the TPU.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The user-supplied description of the TPU. Maximum of 512 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The user-supplied description of the TPU. Maximum of 512 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Optional. The type of hardware accelerators associated with this node.
   * </pre>
   *
   * <code>string accelerator_type = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The acceleratorType.
   */
  java.lang.String getAcceleratorType();
  /**
   * <pre>
   * Optional. The type of hardware accelerators associated with this node.
   * </pre>
   *
   * <code>string accelerator_type = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for acceleratorType.
   */
  com.google.protobuf.ByteString
      getAcceleratorTypeBytes();

  /**
   * <pre>
   * Output only. The current state for the TPU Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current state for the TPU Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.tpu.v2.Node.State getState();

  /**
   * <pre>
   * Output only. If this field is populated, it contains a description of why
   * the TPU Node is unhealthy.
   * </pre>
   *
   * <code>string health_description = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The healthDescription.
   */
  java.lang.String getHealthDescription();
  /**
   * <pre>
   * Output only. If this field is populated, it contains a description of why
   * the TPU Node is unhealthy.
   * </pre>
   *
   * <code>string health_description = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for healthDescription.
   */
  com.google.protobuf.ByteString
      getHealthDescriptionBytes();

  /**
   * <pre>
   * Required. The runtime version running in the Node.
   * </pre>
   *
   * <code>string runtime_version = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The runtimeVersion.
   */
  java.lang.String getRuntimeVersion();
  /**
   * <pre>
   * Required. The runtime version running in the Node.
   * </pre>
   *
   * <code>string runtime_version = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for runtimeVersion.
   */
  com.google.protobuf.ByteString
      getRuntimeVersionBytes();

  /**
   * <pre>
   * Network configurations for the TPU node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.NetworkConfig network_config = 36;</code>
   * @return Whether the networkConfig field is set.
   */
  boolean hasNetworkConfig();
  /**
   * <pre>
   * Network configurations for the TPU node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.NetworkConfig network_config = 36;</code>
   * @return The networkConfig.
   */
  com.google.cloud.tpu.v2.NetworkConfig getNetworkConfig();
  /**
   * <pre>
   * Network configurations for the TPU node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.NetworkConfig network_config = 36;</code>
   */
  com.google.cloud.tpu.v2.NetworkConfigOrBuilder getNetworkConfigOrBuilder();

  /**
   * <pre>
   * The CIDR block that the TPU node will use when selecting an IP address.
   * This CIDR block must be a /29 block; the Compute Engine networks API
   * forbids a smaller block, and using a larger block would be wasteful (a
   * node can only consume one IP address). Errors will occur if the CIDR block
   * has already been used for a currently existing TPU node, the CIDR block
   * conflicts with any subnetworks in the user's provided network, or the
   * provided network is peered with another network that is using that CIDR
   * block.
   * </pre>
   *
   * <code>string cidr_block = 13;</code>
   * @return The cidrBlock.
   */
  java.lang.String getCidrBlock();
  /**
   * <pre>
   * The CIDR block that the TPU node will use when selecting an IP address.
   * This CIDR block must be a /29 block; the Compute Engine networks API
   * forbids a smaller block, and using a larger block would be wasteful (a
   * node can only consume one IP address). Errors will occur if the CIDR block
   * has already been used for a currently existing TPU node, the CIDR block
   * conflicts with any subnetworks in the user's provided network, or the
   * provided network is peered with another network that is using that CIDR
   * block.
   * </pre>
   *
   * <code>string cidr_block = 13;</code>
   * @return The bytes for cidrBlock.
   */
  com.google.protobuf.ByteString
      getCidrBlockBytes();

  /**
   * <pre>
   * The Google Cloud Platform Service Account to be used by the TPU node VMs.
   * If None is specified, the default compute service account will be used.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.ServiceAccount service_account = 37;</code>
   * @return Whether the serviceAccount field is set.
   */
  boolean hasServiceAccount();
  /**
   * <pre>
   * The Google Cloud Platform Service Account to be used by the TPU node VMs.
   * If None is specified, the default compute service account will be used.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.ServiceAccount service_account = 37;</code>
   * @return The serviceAccount.
   */
  com.google.cloud.tpu.v2.ServiceAccount getServiceAccount();
  /**
   * <pre>
   * The Google Cloud Platform Service Account to be used by the TPU node VMs.
   * If None is specified, the default compute service account will be used.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.ServiceAccount service_account = 37;</code>
   */
  com.google.cloud.tpu.v2.ServiceAccountOrBuilder getServiceAccountOrBuilder();

  /**
   * <pre>
   * Output only. The time when the node was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time when the node was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time when the node was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The scheduling options for this node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.SchedulingConfig scheduling_config = 17;</code>
   * @return Whether the schedulingConfig field is set.
   */
  boolean hasSchedulingConfig();
  /**
   * <pre>
   * The scheduling options for this node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.SchedulingConfig scheduling_config = 17;</code>
   * @return The schedulingConfig.
   */
  com.google.cloud.tpu.v2.SchedulingConfig getSchedulingConfig();
  /**
   * <pre>
   * The scheduling options for this node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.SchedulingConfig scheduling_config = 17;</code>
   */
  com.google.cloud.tpu.v2.SchedulingConfigOrBuilder getSchedulingConfigOrBuilder();

  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that runtime clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.tpu.v2.NetworkEndpoint> 
      getNetworkEndpointsList();
  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that runtime clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v2.NetworkEndpoint getNetworkEndpoints(int index);
  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that runtime clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getNetworkEndpointsCount();
  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that runtime clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2.NetworkEndpointOrBuilder> 
      getNetworkEndpointsOrBuilderList();
  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that runtime clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v2.NetworkEndpointOrBuilder getNetworkEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * The health status of the TPU node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node.Health health = 22;</code>
   * @return The enum numeric value on the wire for health.
   */
  int getHealthValue();
  /**
   * <pre>
   * The health status of the TPU node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node.Health health = 22;</code>
   * @return The health.
   */
  com.google.cloud.tpu.v2.Node.Health getHealth();

  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
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
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Custom metadata to apply to the TPU Node.
   * Can set startup-script and shutdown-script
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 34;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Custom metadata to apply to the TPU Node.
   * Can set startup-script and shutdown-script
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 34;</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * Custom metadata to apply to the TPU Node.
   * Can set startup-script and shutdown-script
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 34;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * Custom metadata to apply to the TPU Node.
   * Can set startup-script and shutdown-script
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 34;</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Custom metadata to apply to the TPU Node.
   * Can set startup-script and shutdown-script
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 34;</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Tags to apply to the TPU Node. Tags are used to identify valid sources or
   * targets for network firewalls.
   * </pre>
   *
   * <code>repeated string tags = 40;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * Tags to apply to the TPU Node. Tags are used to identify valid sources or
   * targets for network firewalls.
   * </pre>
   *
   * <code>repeated string tags = 40;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   * Tags to apply to the TPU Node. Tags are used to identify valid sources or
   * targets for network firewalls.
   * </pre>
   *
   * <code>repeated string tags = 40;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * Tags to apply to the TPU Node. Tags are used to identify valid sources or
   * targets for network firewalls.
   * </pre>
   *
   * <code>repeated string tags = 40;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   * Output only. The unique identifier for the TPU Node.
   * </pre>
   *
   * <code>int64 id = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The additional data disks for the Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AttachedDisk data_disks = 41;</code>
   */
  java.util.List<com.google.cloud.tpu.v2.AttachedDisk> 
      getDataDisksList();
  /**
   * <pre>
   * The additional data disks for the Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AttachedDisk data_disks = 41;</code>
   */
  com.google.cloud.tpu.v2.AttachedDisk getDataDisks(int index);
  /**
   * <pre>
   * The additional data disks for the Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AttachedDisk data_disks = 41;</code>
   */
  int getDataDisksCount();
  /**
   * <pre>
   * The additional data disks for the Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AttachedDisk data_disks = 41;</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2.AttachedDiskOrBuilder> 
      getDataDisksOrBuilderList();
  /**
   * <pre>
   * The additional data disks for the Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AttachedDisk data_disks = 41;</code>
   */
  com.google.cloud.tpu.v2.AttachedDiskOrBuilder getDataDisksOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The API version that created this Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node.ApiVersion api_version = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for apiVersion.
   */
  int getApiVersionValue();
  /**
   * <pre>
   * Output only. The API version that created this Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node.ApiVersion api_version = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The apiVersion.
   */
  com.google.cloud.tpu.v2.Node.ApiVersion getApiVersion();

  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.tpu.v2.Symptom> 
      getSymptomsList();
  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v2.Symptom getSymptoms(int index);
  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getSymptomsCount();
  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2.SymptomOrBuilder> 
      getSymptomsOrBuilderList();
  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v2.SymptomOrBuilder getSymptomsOrBuilder(
      int index);

  /**
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.ShieldedInstanceConfig shielded_instance_config = 45;</code>
   * @return Whether the shieldedInstanceConfig field is set.
   */
  boolean hasShieldedInstanceConfig();
  /**
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.ShieldedInstanceConfig shielded_instance_config = 45;</code>
   * @return The shieldedInstanceConfig.
   */
  com.google.cloud.tpu.v2.ShieldedInstanceConfig getShieldedInstanceConfig();
  /**
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.ShieldedInstanceConfig shielded_instance_config = 45;</code>
   */
  com.google.cloud.tpu.v2.ShieldedInstanceConfigOrBuilder getShieldedInstanceConfigOrBuilder();

  /**
   * <pre>
   * The AccleratorConfig for the TPU Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AcceleratorConfig accelerator_config = 46;</code>
   * @return Whether the acceleratorConfig field is set.
   */
  boolean hasAcceleratorConfig();
  /**
   * <pre>
   * The AccleratorConfig for the TPU Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AcceleratorConfig accelerator_config = 46;</code>
   * @return The acceleratorConfig.
   */
  com.google.cloud.tpu.v2.AcceleratorConfig getAcceleratorConfig();
  /**
   * <pre>
   * The AccleratorConfig for the TPU Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AcceleratorConfig accelerator_config = 46;</code>
   */
  com.google.cloud.tpu.v2.AcceleratorConfigOrBuilder getAcceleratorConfigOrBuilder();

  /**
   * <pre>
   * Output only. The qualified name of the QueuedResource that requested this
   * Node.
   * </pre>
   *
   * <code>string queued_resource = 47 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The queuedResource.
   */
  java.lang.String getQueuedResource();
  /**
   * <pre>
   * Output only. The qualified name of the QueuedResource that requested this
   * Node.
   * </pre>
   *
   * <code>string queued_resource = 47 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for queuedResource.
   */
  com.google.protobuf.ByteString
      getQueuedResourceBytes();

  /**
   * <pre>
   * Output only. Whether the Node belongs to a Multislice group.
   * </pre>
   *
   * <code>bool multislice_node = 48 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The multisliceNode.
   */
  boolean getMultisliceNode();
}
