// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/manual_batch_tuning_parameters.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class ManualBatchTuningParametersProto {
  private ManualBatchTuningParametersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ManualBatchTuningParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ManualBatchTuningParameters_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/aiplatform/v1/manual_batc" +
      "h_tuning_parameters.proto\022\032google.cloud." +
      "aiplatform.v1\032\037google/api/field_behavior" +
      ".proto\"6\n\033ManualBatchTuningParameters\022\027\n" +
      "\nbatch_size\030\001 \001(\005B\003\340A\005B\336\001\n\036com.google.cl" +
      "oud.aiplatform.v1B ManualBatchTuningPara" +
      "metersProtoP\001Z>cloud.google.com/go/aipla" +
      "tform/apiv1/aiplatformpb;aiplatformpb\252\002\032" +
      "Google.Cloud.AIPlatform.V1\312\002\032Google\\Clou" +
      "d\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatf" +
      "orm::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_ManualBatchTuningParameters_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ManualBatchTuningParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ManualBatchTuningParameters_descriptor,
        new java.lang.String[] { "BatchSize", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
