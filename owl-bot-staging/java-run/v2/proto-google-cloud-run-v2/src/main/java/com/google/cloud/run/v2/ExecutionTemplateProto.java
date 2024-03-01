// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/execution_template.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.run.v2;

public final class ExecutionTemplateProto {
  private ExecutionTemplateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ExecutionTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ExecutionTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ExecutionTemplate_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ExecutionTemplate_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ExecutionTemplate_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ExecutionTemplate_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/run/v2/execution_template" +
      ".proto\022\023google.cloud.run.v2\032\037google/api/" +
      "field_behavior.proto\032\'google/cloud/run/v" +
      "2/task_template.proto\"\353\002\n\021ExecutionTempl" +
      "ate\022B\n\006labels\030\001 \003(\01322.google.cloud.run.v" +
      "2.ExecutionTemplate.LabelsEntry\022L\n\013annot" +
      "ations\030\002 \003(\01327.google.cloud.run.v2.Execu" +
      "tionTemplate.AnnotationsEntry\022\023\n\013paralle" +
      "lism\030\003 \001(\005\022\022\n\ntask_count\030\004 \001(\005\0228\n\010templa" +
      "te\030\005 \001(\0132!.google.cloud.run.v2.TaskTempl" +
      "ateB\003\340A\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001\0322\n\020AnnotationsEntry\022\013\n\003k" +
      "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B^\n\027com.googl" +
      "e.cloud.run.v2B\026ExecutionTemplateProtoP\001" +
      "Z)cloud.google.com/go/run/apiv2/runpb;ru" +
      "npbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.run.v2.TaskTemplateProto.getDescriptor(),
        });
    internal_static_google_cloud_run_v2_ExecutionTemplate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_ExecutionTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ExecutionTemplate_descriptor,
        new java.lang.String[] { "Labels", "Annotations", "Parallelism", "TaskCount", "Template", });
    internal_static_google_cloud_run_v2_ExecutionTemplate_LabelsEntry_descriptor =
      internal_static_google_cloud_run_v2_ExecutionTemplate_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_run_v2_ExecutionTemplate_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ExecutionTemplate_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_run_v2_ExecutionTemplate_AnnotationsEntry_descriptor =
      internal_static_google_cloud_run_v2_ExecutionTemplate_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_run_v2_ExecutionTemplate_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ExecutionTemplate_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.run.v2.TaskTemplateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
