// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/completion_stats.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class CompletionStatsProto {
  private CompletionStatsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CompletionStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CompletionStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/completion_" +
      "stats.proto\022\032google.cloud.aiplatform.v1\032" +
      "\037google/api/field_behavior.proto\"\234\001\n\017Com" +
      "pletionStats\022\036\n\020successful_count\030\001 \001(\003B\004" +
      "\342A\001\003\022\032\n\014failed_count\030\002 \001(\003B\004\342A\001\003\022\036\n\020inco" +
      "mplete_count\030\003 \001(\003B\004\342A\001\003\022-\n\037successful_f" +
      "orecast_point_count\030\005 \001(\003B\004\342A\001\003B\322\001\n\036com." +
      "google.cloud.aiplatform.v1B\024CompletionSt" +
      "atsProtoP\001Z>cloud.google.com/go/aiplatfo" +
      "rm/apiv1/aiplatformpb;aiplatformpb\252\002\032Goo" +
      "gle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\A" +
      "IPlatform\\V1\352\002\035Google::Cloud::AIPlatform" +
      "::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_CompletionStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CompletionStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CompletionStats_descriptor,
        new java.lang.String[] { "SuccessfulCount", "FailedCount", "IncompleteCount", "SuccessfulForecastPointCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
