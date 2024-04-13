// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/extension_registry_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ExtensionRegistryServiceProto {
  private ExtensionRegistryServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_GetExtensionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetExtensionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UpdateExtensionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateExtensionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeleteExtensionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteExtensionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/aiplatform/v1beta1/extens" +
      "ion_registry_service.proto\022\037google.cloud" +
      ".aiplatform.v1beta1\032\034google/api/annotati" +
      "ons.proto\032\027google/api/client.proto\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\032/google/cloud/aiplatform/" +
      "v1beta1/extension.proto\032/google/cloud/ai" +
      "platform/v1beta1/operation.proto\032#google" +
      "/longrunning/operations.proto\032\033google/pr" +
      "otobuf/empty.proto\032 google/protobuf/fiel" +
      "d_mask.proto\"\227\001\n\026ImportExtensionRequest\022" +
      "9\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.googl" +
      "eapis.com/Location\022B\n\textension\030\002 \001(\0132*." +
      "google.cloud.aiplatform.v1beta1.Extensio" +
      "nB\003\340A\002\"w\n ImportExtensionOperationMetada" +
      "ta\022S\n\020generic_metadata\030\001 \001(\01329.google.cl" +
      "oud.aiplatform.v1beta1.GenericOperationM" +
      "etadata\"P\n\023GetExtensionRequest\0229\n\004name\030\001" +
      " \001(\tB+\340A\002\372A%\n#aiplatform.googleapis.com/" +
      "Extension\"\222\001\n\026UpdateExtensionRequest\022B\n\t" +
      "extension\030\001 \001(\0132*.google.cloud.aiplatfor" +
      "m.v1beta1.ExtensionB\003\340A\002\0224\n\013update_mask\030" +
      "\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"\257" +
      "\001\n\025ListExtensionsRequest\0229\n\006parent\030\001 \001(\t" +
      "B)\340A\002\372A#\n!locations.googleapis.com/Locat" +
      "ion\022\023\n\006filter\030\002 \001(\tB\003\340A\001\022\026\n\tpage_size\030\003 " +
      "\001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001(\tB\003\340A\001\022\025\n\010ord" +
      "er_by\030\006 \001(\tB\003\340A\001\"q\n\026ListExtensionsRespon" +
      "se\022>\n\nextensions\030\001 \003(\0132*.google.cloud.ai" +
      "platform.v1beta1.Extension\022\027\n\017next_page_" +
      "token\030\002 \001(\t\"S\n\026DeleteExtensionRequest\0229\n" +
      "\004name\030\001 \001(\tB+\340A\002\372A%\n#aiplatform.googleap" +
      "is.com/Extension2\257\t\n\030ExtensionRegistrySe" +
      "rvice\022\374\001\n\017ImportExtension\0227.google.cloud" +
      ".aiplatform.v1beta1.ImportExtensionReque" +
      "st\032\035.google.longrunning.Operation\"\220\001\312A-\n" +
      "\tExtension\022 ImportExtensionOperationMeta" +
      "data\332A\020parent,extension\202\323\344\223\002G\":/v1beta1/" +
      "{parent=projects/*/locations/*}/extensio" +
      "ns:import:\textension\022\264\001\n\014GetExtension\0224." +
      "google.cloud.aiplatform.v1beta1.GetExten" +
      "sionRequest\032*.google.cloud.aiplatform.v1" +
      "beta1.Extension\"B\332A\004name\202\323\344\223\0025\0223/v1beta1" +
      "/{name=projects/*/locations/*/extensions" +
      "/*}\022\307\001\n\016ListExtensions\0226.google.cloud.ai" +
      "platform.v1beta1.ListExtensionsRequest\0327" +
      ".google.cloud.aiplatform.v1beta1.ListExt" +
      "ensionsResponse\"D\332A\006parent\202\323\344\223\0025\0223/v1bet" +
      "a1/{parent=projects/*/locations/*}/exten" +
      "sions\022\340\001\n\017UpdateExtension\0227.google.cloud" +
      ".aiplatform.v1beta1.UpdateExtensionReque" +
      "st\032*.google.cloud.aiplatform.v1beta1.Ext" +
      "ension\"h\332A\025extension,update_mask\202\323\344\223\002J2=" +
      "/v1beta1/{extension.name=projects/*/loca" +
      "tions/*/extensions/*}:\textension\022\340\001\n\017Del" +
      "eteExtension\0227.google.cloud.aiplatform.v" +
      "1beta1.DeleteExtensionRequest\032\035.google.l" +
      "ongrunning.Operation\"u\312A0\n\025google.protob" +
      "uf.Empty\022\027DeleteOperationMetadata\332A\004name" +
      "\202\323\344\223\0025*3/v1beta1/{name=projects/*/locati" +
      "ons/*/extensions/*}\032M\312A\031aiplatform.googl" +
      "eapis.com\322A.https://www.googleapis.com/a" +
      "uth/cloud-platformB\364\001\n#com.google.cloud." +
      "aiplatform.v1beta1B\035ExtensionRegistrySer" +
      "viceProtoP\001ZCcloud.google.com/go/aiplatf" +
      "orm/apiv1beta1/aiplatformpb;aiplatformpb" +
      "\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Goo" +
      "gle\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::C" +
      "loud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ExtensionProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionRequest_descriptor,
        new java.lang.String[] { "Parent", "Extension", });
    internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ImportExtensionOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1beta1_GetExtensionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetExtensionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_GetExtensionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateExtensionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateExtensionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UpdateExtensionRequest_descriptor,
        new java.lang.String[] { "Extension", "UpdateMask", });
    internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", "OrderBy", });
    internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ListExtensionsResponse_descriptor,
        new java.lang.String[] { "Extensions", "NextPageToken", });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteExtensionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteExtensionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeleteExtensionRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExtensionProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
