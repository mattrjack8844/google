// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vmmigration.v1;

public interface FinalizeMigrationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.FinalizeMigrationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the MigratingVm.
   * </pre>
   *
   * <code>string migrating_vm = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The migratingVm.
   */
  java.lang.String getMigratingVm();
  /**
   * <pre>
   * Required. The name of the MigratingVm.
   * </pre>
   *
   * <code>string migrating_vm = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for migratingVm.
   */
  com.google.protobuf.ByteString
      getMigratingVmBytes();
}
