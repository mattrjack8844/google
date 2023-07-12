// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface GPUDriverInstallationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.GPUDriverInstallationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Mode for how the GPU driver is installed.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.GPUDriverInstallationConfig.GPUDriverVersion gpu_driver_version = 1;</code>
   * @return Whether the gpuDriverVersion field is set.
   */
  boolean hasGpuDriverVersion();
  /**
   * <pre>
   * Mode for how the GPU driver is installed.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.GPUDriverInstallationConfig.GPUDriverVersion gpu_driver_version = 1;</code>
   * @return The enum numeric value on the wire for gpuDriverVersion.
   */
  int getGpuDriverVersionValue();
  /**
   * <pre>
   * Mode for how the GPU driver is installed.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.GPUDriverInstallationConfig.GPUDriverVersion gpu_driver_version = 1;</code>
   * @return The gpuDriverVersion.
   */
  com.google.container.v1beta1.GPUDriverInstallationConfig.GPUDriverVersion getGpuDriverVersion();
}
