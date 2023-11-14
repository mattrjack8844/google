// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/operation.proto

package com.google.cloud.aiplatform.v1;

public final class OperationProto {
  private OperationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_GenericOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GenericOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeleteOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/aiplatform/v1/operation.p" +
      "roto\022\032google.cloud.aiplatform.v1\032\037google" +
      "/api/field_behavior.proto\032\037google/protob" +
      "uf/timestamp.proto\032\027google/rpc/status.pr" +
      "oto\"\274\001\n\030GenericOperationMetadata\0222\n\020part" +
      "ial_failures\030\001 \003(\0132\022.google.rpc.StatusB\004" +
      "\342A\001\003\0225\n\013create_time\030\002 \001(\0132\032.google.proto" +
      "buf.TimestampB\004\342A\001\003\0225\n\013update_time\030\003 \001(\013" +
      "2\032.google.protobuf.TimestampB\004\342A\001\003\"i\n\027De" +
      "leteOperationMetadata\022N\n\020generic_metadat" +
      "a\030\001 \001(\01324.google.cloud.aiplatform.v1.Gen" +
      "ericOperationMetadataB\314\001\n\036com.google.clo" +
      "ud.aiplatform.v1B\016OperationProtoP\001Z>clou" +
      "d.google.com/go/aiplatform/apiv1/aiplatf" +
      "ormpb;aiplatformpb\252\002\032Google.Cloud.AIPlat" +
      "form.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035G" +
      "oogle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_GenericOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_GenericOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_GenericOperationMetadata_descriptor,
        new java.lang.String[] { "PartialFailures", "CreateTime", "UpdateTime", });
    internal_static_google_cloud_aiplatform_v1_DeleteOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DeleteOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeleteOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
