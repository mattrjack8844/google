// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/lineage_subgraph.proto

package com.google.cloud.aiplatform.v1;

public final class LineageSubgraphProto {
  private LineageSubgraphProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_LineageSubgraph_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_LineageSubgraph_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/lineage_sub" +
      "graph.proto\022\032google.cloud.aiplatform.v1\032" +
      ")google/cloud/aiplatform/v1/artifact.pro" +
      "to\032&google/cloud/aiplatform/v1/event.pro" +
      "to\032*google/cloud/aiplatform/v1/execution" +
      ".proto\"\270\001\n\017LineageSubgraph\0227\n\tartifacts\030" +
      "\001 \003(\0132$.google.cloud.aiplatform.v1.Artif" +
      "act\0229\n\nexecutions\030\002 \003(\0132%.google.cloud.a" +
      "iplatform.v1.Execution\0221\n\006events\030\003 \003(\0132!" +
      ".google.cloud.aiplatform.v1.EventB\322\001\n\036co" +
      "m.google.cloud.aiplatform.v1B\024LineageSub" +
      "graphProtoP\001Z>cloud.google.com/go/aiplat" +
      "form/apiv1/aiplatformpb;aiplatformpb\252\002\032G" +
      "oogle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud" +
      "\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatfo" +
      "rm::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.aiplatform.v1.ArtifactProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.EventProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.ExecutionProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_LineageSubgraph_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_LineageSubgraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_LineageSubgraph_descriptor,
        new java.lang.String[] { "Artifacts", "Executions", "Events", });
    com.google.cloud.aiplatform.v1.ArtifactProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EventProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExecutionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
