// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.telcoautomation.v1alpha1;

public interface ComputeDeploymentStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.ComputeDeploymentStatusResponse)
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
   * Output only. Aggregated status of a deployment.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.Status aggregated_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for aggregatedStatus.
   */
  int getAggregatedStatusValue();
  /**
   * <pre>
   * Output only. Aggregated status of a deployment.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.Status aggregated_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The aggregatedStatus.
   */
  com.google.cloud.telcoautomation.v1alpha1.Status getAggregatedStatus();

  /**
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1alpha1.ResourceStatus> 
      getResourceStatusesList();
  /**
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.ResourceStatus getResourceStatuses(int index);
  /**
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getResourceStatusesCount();
  /**
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.ResourceStatusOrBuilder> 
      getResourceStatusesOrBuilderList();
  /**
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.ResourceStatusOrBuilder getResourceStatusesOrBuilder(
      int index);
}
