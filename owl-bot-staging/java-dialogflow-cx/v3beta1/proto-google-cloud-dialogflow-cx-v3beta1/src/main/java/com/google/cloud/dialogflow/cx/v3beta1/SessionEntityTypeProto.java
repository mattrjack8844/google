// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/session_entity_type.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class SessionEntityTypeProto {
  private SessionEntityTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/dialogflow/cx/v3beta1/ses" +
      "sion_entity_type.proto\022\"google.cloud.dia" +
      "logflow.cx.v3beta1\032\034google/api/annotatio" +
      "ns.proto\032\027google/api/client.proto\032\037googl" +
      "e/api/field_behavior.proto\032\031google/api/r" +
      "esource.proto\0324google/cloud/dialogflow/c" +
      "x/v3beta1/entity_type.proto\032\033google/prot" +
      "obuf/empty.proto\032 google/protobuf/field_" +
      "mask.proto\"\202\005\n\021SessionEntityType\022\022\n\004name" +
      "\030\001 \001(\tB\004\342A\001\002\022l\n\024entity_override_mode\030\003 \001" +
      "(\0162H.google.cloud.dialogflow.cx.v3beta1." +
      "SessionEntityType.EntityOverrideModeB\004\342A" +
      "\001\002\022M\n\010entities\030\004 \003(\01325.google.cloud.dial" +
      "ogflow.cx.v3beta1.EntityType.EntityB\004\342A\001" +
      "\002\"\202\001\n\022EntityOverrideMode\022$\n ENTITY_OVERR" +
      "IDE_MODE_UNSPECIFIED\020\000\022!\n\035ENTITY_OVERRID" +
      "E_MODE_OVERRIDE\020\001\022#\n\037ENTITY_OVERRIDE_MOD" +
      "E_SUPPLEMENT\020\002:\226\002\352A\222\002\n+dialogflow.google" +
      "apis.com/SessionEntityType\022cprojects/{pr" +
      "oject}/locations/{location}/agents/{agen" +
      "t}/sessions/{session}/entityTypes/{entit" +
      "y_type}\022~projects/{project}/locations/{l" +
      "ocation}/agents/{agent}/environments/{en" +
      "vironment}/sessions/{session}/entityType" +
      "s/{entity_type}\"\214\001\n\035ListSessionEntityTyp" +
      "esRequest\022D\n\006parent\030\001 \001(\tB4\342A\001\002\372A-\022+dial" +
      "ogflow.googleapis.com/SessionEntityType\022" +
      "\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\216" +
      "\001\n\036ListSessionEntityTypesResponse\022S\n\024ses" +
      "sion_entity_types\030\001 \003(\01325.google.cloud.d" +
      "ialogflow.cx.v3beta1.SessionEntityType\022\027" +
      "\n\017next_page_token\030\002 \001(\t\"a\n\033GetSessionEnt" +
      "ityTypeRequest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+d" +
      "ialogflow.googleapis.com/SessionEntityTy" +
      "pe\"\300\001\n\036CreateSessionEntityTypeRequest\022D\n" +
      "\006parent\030\001 \001(\tB4\342A\001\002\372A-\022+dialogflow.googl" +
      "eapis.com/SessionEntityType\022X\n\023session_e" +
      "ntity_type\030\002 \001(\01325.google.cloud.dialogfl" +
      "ow.cx.v3beta1.SessionEntityTypeB\004\342A\001\002\"\253\001" +
      "\n\036UpdateSessionEntityTypeRequest\022X\n\023sess" +
      "ion_entity_type\030\001 \001(\01325.google.cloud.dia" +
      "logflow.cx.v3beta1.SessionEntityTypeB\004\342A" +
      "\001\002\022/\n\013update_mask\030\002 \001(\0132\032.google.protobu" +
      "f.FieldMask\"d\n\036DeleteSessionEntityTypeRe" +
      "quest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+dialogflow" +
      ".googleapis.com/SessionEntityType2\245\017\n\022Se" +
      "ssionEntityTypes\022\327\002\n\026ListSessionEntityTy" +
      "pes\022A.google.cloud.dialogflow.cx.v3beta1" +
      ".ListSessionEntityTypesRequest\032B.google." +
      "cloud.dialogflow.cx.v3beta1.ListSessionE" +
      "ntityTypesResponse\"\265\001\332A\006parent\202\323\344\223\002\245\001\022H/" +
      "v3beta1/{parent=projects/*/locations/*/a" +
      "gents/*/sessions/*}/entityTypesZY\022W/v3be" +
      "ta1/{parent=projects/*/locations/*/agent" +
      "s/*/environments/*/sessions/*}/entityTyp" +
      "es\022\304\002\n\024GetSessionEntityType\022?.google.clo" +
      "ud.dialogflow.cx.v3beta1.GetSessionEntit" +
      "yTypeRequest\0325.google.cloud.dialogflow.c" +
      "x.v3beta1.SessionEntityType\"\263\001\332A\004name\202\323\344" +
      "\223\002\245\001\022H/v3beta1/{name=projects/*/location" +
      "s/*/agents/*/sessions/*/entityTypes/*}ZY" +
      "\022W/v3beta1/{name=projects/*/locations/*/" +
      "agents/*/environments/*/sessions/*/entit" +
      "yTypes/*}\022\212\003\n\027CreateSessionEntityType\022B." +
      "google.cloud.dialogflow.cx.v3beta1.Creat" +
      "eSessionEntityTypeRequest\0325.google.cloud" +
      ".dialogflow.cx.v3beta1.SessionEntityType" +
      "\"\363\001\332A\032parent,session_entity_type\202\323\344\223\002\317\001\"" +
      "H/v3beta1/{parent=projects/*/locations/*" +
      "/agents/*/sessions/*}/entityTypes:\023sessi" +
      "on_entity_typeZn\"W/v3beta1/{parent=proje" +
      "cts/*/locations/*/agents/*/environments/" +
      "*/sessions/*}/entityTypes:\023session_entit" +
      "y_type\022\270\003\n\027UpdateSessionEntityType\022B.goo" +
      "gle.cloud.dialogflow.cx.v3beta1.UpdateSe" +
      "ssionEntityTypeRequest\0325.google.cloud.di" +
      "alogflow.cx.v3beta1.SessionEntityType\"\241\002" +
      "\332A\037session_entity_type,update_mask\202\323\344\223\002\370" +
      "\0012\\/v3beta1/{session_entity_type.name=pr" +
      "ojects/*/locations/*/agents/*/sessions/*" +
      "/entityTypes/*}:\023session_entity_typeZ\202\0012" +
      "k/v3beta1/{session_entity_type.name=proj" +
      "ects/*/locations/*/agents/*/environments" +
      "/*/sessions/*/entityTypes/*}:\023session_en" +
      "tity_type\022\253\002\n\027DeleteSessionEntityType\022B." +
      "google.cloud.dialogflow.cx.v3beta1.Delet" +
      "eSessionEntityTypeRequest\032\026.google.proto" +
      "buf.Empty\"\263\001\332A\004name\202\323\344\223\002\245\001*H/v3beta1/{na" +
      "me=projects/*/locations/*/agents/*/sessi" +
      "ons/*/entityTypes/*}ZY*W/v3beta1/{name=p" +
      "rojects/*/locations/*/agents/*/environme" +
      "nts/*/sessions/*/entityTypes/*}\032x\312A\031dial" +
      "ogflow.googleapis.com\322AYhttps://www.goog" +
      "leapis.com/auth/cloud-platform,https://w" +
      "ww.googleapis.com/auth/dialogflowB\320\001\n&co" +
      "m.google.cloud.dialogflow.cx.v3beta1B\026Se" +
      "ssionEntityTypeProtoP\001Z6cloud.google.com" +
      "/go/dialogflow/cx/apiv3beta1/cxpb;cxpb\370\001" +
      "\001\242\002\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Be" +
      "ta1\352\002&Google::Cloud::Dialogflow::CX::V3b" +
      "eta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3beta1.EntityTypeProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_descriptor,
        new java.lang.String[] { "Name", "EntityOverrideMode", "Entities", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor,
        new java.lang.String[] { "SessionEntityTypes", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor,
        new java.lang.String[] { "Parent", "SessionEntityType", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_descriptor,
        new java.lang.String[] { "SessionEntityType", "UpdateMask", });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.EntityTypeProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
