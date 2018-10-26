// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

public interface ClusterAutoscalingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1alpha1.ClusterAutoscaling)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Enables automatic node pool creation and deletion.
   * </pre>
   *
   * <code>bool enable_node_autoprovisioning = 1;</code>
   */
  boolean getEnableNodeAutoprovisioning();

  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  java.util.List<com.google.container.v1alpha1.ResourceLimit> 
      getResourceLimitsList();
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  com.google.container.v1alpha1.ResourceLimit getResourceLimits(int index);
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  int getResourceLimitsCount();
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  java.util.List<? extends com.google.container.v1alpha1.ResourceLimitOrBuilder> 
      getResourceLimitsOrBuilderList();
  /**
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.ResourceLimit resource_limits = 2;</code>
   */
  com.google.container.v1alpha1.ResourceLimitOrBuilder getResourceLimitsOrBuilder(
      int index);
}
