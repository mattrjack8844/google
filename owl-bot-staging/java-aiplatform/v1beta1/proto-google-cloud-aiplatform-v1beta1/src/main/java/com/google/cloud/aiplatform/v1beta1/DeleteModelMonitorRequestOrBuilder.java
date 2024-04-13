// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_monitoring_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface DeleteModelMonitorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeleteModelMonitorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the ModelMonitor resource to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/modelMonitords/{model_monitor}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the ModelMonitor resource to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/modelMonitords/{model_monitor}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Force delete the model monitor with schedules.
   * </pre>
   *
   * <code>bool force = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The force.
   */
  boolean getForce();
}
