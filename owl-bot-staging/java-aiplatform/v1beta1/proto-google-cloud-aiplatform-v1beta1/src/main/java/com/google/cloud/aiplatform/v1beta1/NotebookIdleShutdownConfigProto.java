// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/notebook_idle_shutdown_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class NotebookIdleShutdownConfigProto {
  private NotebookIdleShutdownConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_NotebookIdleShutdownConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookIdleShutdownConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/cloud/aiplatform/v1beta1/notebo" +
      "ok_idle_shutdown_config.proto\022\037google.cl" +
      "oud.aiplatform.v1beta1\032\037google/api/field" +
      "_behavior.proto\032\036google/protobuf/duratio" +
      "n.proto\"r\n\032NotebookIdleShutdownConfig\0224\n" +
      "\014idle_timeout\030\001 \001(\0132\031.google.protobuf.Du" +
      "rationB\003\340A\002\022\036\n\026idle_shutdown_disabled\030\002 " +
      "\001(\010B\366\001\n#com.google.cloud.aiplatform.v1be" +
      "ta1B\037NotebookIdleShutdownConfigProtoP\001ZC" +
      "cloud.google.com/go/aiplatform/apiv1beta" +
      "1/aiplatformpb;aiplatformpb\252\002\037Google.Clo" +
      "ud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIP" +
      "latform\\V1beta1\352\002\"Google::Cloud::AIPlatf" +
      "orm::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookIdleShutdownConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookIdleShutdownConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_NotebookIdleShutdownConfig_descriptor,
        new java.lang.String[] { "IdleTimeout", "IdleShutdownDisabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
