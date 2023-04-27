// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/annotation_spec.proto

package com.google.cloud.aiplatform.v1;

public final class AnnotationSpecProto {
  private AnnotationSpecProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_AnnotationSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_AnnotationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1/annotation_" +
      "spec.proto\022\032google.cloud.aiplatform.v1\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032\037google/protobuf/time" +
      "stamp.proto\"\314\002\n\016AnnotationSpec\022\021\n\004name\030\001" +
      " \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\0224\n\013" +
      "create_time\030\003 \001(\0132\032.google.protobuf.Time" +
      "stampB\003\340A\003\0224\n\013update_time\030\004 \001(\0132\032.google" +
      ".protobuf.TimestampB\003\340A\003\022\021\n\004etag\030\005 \001(\tB\003" +
      "\340A\001:\214\001\352A\210\001\n(aiplatform.googleapis.com/An" +
      "notationSpec\022\\projects/{project}/locatio" +
      "ns/{location}/datasets/{dataset}/annotat" +
      "ionSpecs/{annotation_spec}B\321\001\n\036com.googl" +
      "e.cloud.aiplatform.v1B\023AnnotationSpecPro" +
      "toP\001Z>cloud.google.com/go/aiplatform/api" +
      "v1/aiplatformpb;aiplatformpb\252\002\032Google.Cl" +
      "oud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatf" +
      "orm\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_AnnotationSpec_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_AnnotationSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_AnnotationSpec_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "CreateTime", "UpdateTime", "Etag", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
