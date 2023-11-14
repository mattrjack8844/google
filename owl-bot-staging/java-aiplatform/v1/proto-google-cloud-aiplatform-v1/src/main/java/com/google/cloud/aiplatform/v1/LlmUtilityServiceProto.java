// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/llm_utility_service.proto

package com.google.cloud.aiplatform.v1;

public final class LlmUtilityServiceProto {
  private LlmUtilityServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ComputeTokensRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ComputeTokensRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_TokensInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TokensInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ComputeTokensResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ComputeTokensResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/aiplatform/v1/llm_utility" +
      "_service.proto\022\032google.cloud.aiplatform." +
      "v1\032\034google/api/annotations.proto\032\027google" +
      "/api/client.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\0323g" +
      "oogle/cloud/aiplatform/v1/prediction_ser" +
      "vice.proto\032\034google/protobuf/struct.proto" +
      "\"\206\001\n\024ComputeTokensRequest\022=\n\010endpoint\030\001 " +
      "\001(\tB+\342A\001\002\372A$\n\"aiplatform.googleapis.com/" +
      "Endpoint\022/\n\tinstances\030\002 \003(\0132\026.google.pro" +
      "tobuf.ValueB\004\342A\001\002\"/\n\nTokensInfo\022\016\n\006token" +
      "s\030\001 \003(\014\022\021\n\ttoken_ids\030\002 \003(\003\"T\n\025ComputeTok" +
      "ensResponse\022;\n\013tokens_info\030\001 \003(\0132&.googl" +
      "e.cloud.aiplatform.v1.TokensInfo2\254\005\n\021Llm" +
      "UtilityService\022\235\002\n\013CountTokens\022..google." +
      "cloud.aiplatform.v1.CountTokensRequest\032/" +
      ".google.cloud.aiplatform.v1.CountTokensR" +
      "esponse\"\254\001\332A\022endpoint,instances\202\323\344\223\002\220\001\"=" +
      "/v1/{endpoint=projects/*/locations/*/end" +
      "points/*}:countTokens:\001*ZL\"G/v1/{endpoin" +
      "t=projects/*/locations/*/publishers/*/mo" +
      "dels/*}:countTokens:\001*\022\247\002\n\rComputeTokens" +
      "\0220.google.cloud.aiplatform.v1.ComputeTok" +
      "ensRequest\0321.google.cloud.aiplatform.v1." +
      "ComputeTokensResponse\"\260\001\332A\022endpoint,inst" +
      "ances\202\323\344\223\002\224\001\"?/v1/{endpoint=projects/*/l" +
      "ocations/*/endpoints/*}:computeTokens:\001*" +
      "ZN\"I/v1/{endpoint=projects/*/locations/*" +
      "/publishers/*/models/*}:computeTokens:\001*" +
      "\032M\312A\031aiplatform.googleapis.com\322A.https:/" +
      "/www.googleapis.com/auth/cloud-platformB" +
      "\324\001\n\036com.google.cloud.aiplatform.v1B\026LlmU" +
      "tilityServiceProtoP\001Z>cloud.google.com/g" +
      "o/aiplatform/apiv1/aiplatformpb;aiplatfo" +
      "rmpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Goog" +
      "le\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::" +
      "AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.PredictionServiceProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_ComputeTokensRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ComputeTokensRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ComputeTokensRequest_descriptor,
        new java.lang.String[] { "Endpoint", "Instances", });
    internal_static_google_cloud_aiplatform_v1_TokensInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_TokensInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_TokensInfo_descriptor,
        new java.lang.String[] { "Tokens", "TokenIds", });
    internal_static_google_cloud_aiplatform_v1_ComputeTokensResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ComputeTokensResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ComputeTokensResponse_descriptor,
        new java.lang.String[] { "TokensInfo", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PredictionServiceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
