// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ResourcesConsumedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ResourcesConsumed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The number of replica hours used. Note that many replicas may
   * run in parallel, and additionally any given work may be queued for some
   * time. Therefore this value is not strictly related to wall time.
   * </pre>
   *
   * <code>double replica_hours = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The replicaHours.
   */
  double getReplicaHours();
}
