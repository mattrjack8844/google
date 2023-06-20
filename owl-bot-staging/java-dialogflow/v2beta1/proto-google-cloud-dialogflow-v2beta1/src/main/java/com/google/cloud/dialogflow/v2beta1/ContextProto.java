// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/context.proto

package com.google.cloud.dialogflow.v2beta1;

public final class ContextProto {
  private ContextProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_Context_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/contex" +
      "t.proto\022\037google.cloud.dialogflow.v2beta1" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032\033goo" +
      "gle/protobuf/empty.proto\032 google/protobu" +
      "f/field_mask.proto\032\034google/protobuf/stru" +
      "ct.proto\"\200\004\n\007Context\022\014\n\004name\030\001 \001(\t\022\026\n\016li" +
      "fespan_count\030\002 \001(\005\022+\n\nparameters\030\003 \001(\0132\027" +
      ".google.protobuf.Struct:\241\003\352A\235\003\n!dialogfl" +
      "ow.googleapis.com/Context\022>projects/{pro" +
      "ject}/agent/sessions/{session}/contexts/" +
      "{context}\022fprojects/{project}/agent/envi" +
      "ronments/{environment}/users/{user}/sess" +
      "ions/{session}/contexts/{context}\022Sproje" +
      "cts/{project}/locations/{location}/agent" +
      "/sessions/{session}/contexts/{context}\022{" +
      "projects/{project}/locations/{location}/" +
      "agent/environments/{environment}/users/{" +
      "user}/sessions/{session}/contexts/{conte" +
      "xt}\"x\n\023ListContextsRequest\022:\n\006parent\030\001 \001" +
      "(\tB*\342A\001\002\372A#\022!dialogflow.googleapis.com/C" +
      "ontext\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030" +
      "\003 \001(\t\"k\n\024ListContextsResponse\022:\n\010context" +
      "s\030\001 \003(\0132(.google.cloud.dialogflow.v2beta" +
      "1.Context\022\027\n\017next_page_token\030\002 \001(\t\"M\n\021Ge" +
      "tContextRequest\0228\n\004name\030\001 \001(\tB*\342A\001\002\372A#\n!" +
      "dialogflow.googleapis.com/Context\"\223\001\n\024Cr" +
      "eateContextRequest\022:\n\006parent\030\001 \001(\tB*\342A\001\002" +
      "\372A#\022!dialogflow.googleapis.com/Context\022?" +
      "\n\007context\030\002 \001(\0132(.google.cloud.dialogflo" +
      "w.v2beta1.ContextB\004\342A\001\002\"\216\001\n\024UpdateContex" +
      "tRequest\022?\n\007context\030\001 \001(\0132(.google.cloud" +
      ".dialogflow.v2beta1.ContextB\004\342A\001\002\0225\n\013upd" +
      "ate_mask\030\002 \001(\0132\032.google.protobuf.FieldMa" +
      "skB\004\342A\001\001\"P\n\024DeleteContextRequest\0228\n\004name" +
      "\030\001 \001(\tB*\342A\001\002\372A#\n!dialogflow.googleapis.c" +
      "om/Context\"V\n\030DeleteAllContextsRequest\022:" +
      "\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\022!dialogflow.goog" +
      "leapis.com/Context2\234\026\n\010Contexts\022\272\003\n\014List" +
      "Contexts\0224.google.cloud.dialogflow.v2bet" +
      "a1.ListContextsRequest\0325.google.cloud.di" +
      "alogflow.v2beta1.ListContextsResponse\"\274\002" +
      "\332A\006parent\202\323\344\223\002\254\002\0226/v2beta1/{parent=proje" +
      "cts/*/agent/sessions/*}/contextsZO\022M/v2b" +
      "eta1/{parent=projects/*/agent/environmen" +
      "ts/*/users/*/sessions/*}/contextsZD\022B/v2" +
      "beta1/{parent=projects/*/locations/*/age" +
      "nt/sessions/*}/contextsZ[\022Y/v2beta1/{par" +
      "ent=projects/*/locations/*/agent/environ" +
      "ments/*/users/*/sessions/*}/contexts\022\247\003\n" +
      "\nGetContext\0222.google.cloud.dialogflow.v2" +
      "beta1.GetContextRequest\032(.google.cloud.d" +
      "ialogflow.v2beta1.Context\"\272\002\332A\004name\202\323\344\223\002" +
      "\254\002\0226/v2beta1/{name=projects/*/agent/sess" +
      "ions/*/contexts/*}ZO\022M/v2beta1/{name=pro" +
      "jects/*/agent/environments/*/users/*/ses" +
      "sions/*/contexts/*}ZD\022B/v2beta1/{name=pr" +
      "ojects/*/locations/*/agent/sessions/*/co" +
      "ntexts/*}Z[\022Y/v2beta1/{name=projects/*/l" +
      "ocations/*/agent/environments/*/users/*/" +
      "sessions/*/contexts/*}\022\333\003\n\rCreateContext" +
      "\0225.google.cloud.dialogflow.v2beta1.Creat" +
      "eContextRequest\032(.google.cloud.dialogflo" +
      "w.v2beta1.Context\"\350\002\332A\016parent,context\202\323\344" +
      "\223\002\320\002\"6/v2beta1/{parent=projects/*/agent/" +
      "sessions/*}/contexts:\007contextZX\"M/v2beta" +
      "1/{parent=projects/*/agent/environments/" +
      "*/users/*/sessions/*}/contexts:\007contextZ" +
      "M\"B/v2beta1/{parent=projects/*/locations" +
      "/*/agent/sessions/*}/contexts:\007contextZd" +
      "\"Y/v2beta1/{parent=projects/*/locations/" +
      "*/agent/environments/*/users/*/sessions/" +
      "*}/contexts:\007context\022\212\004\n\rUpdateContext\0225" +
      ".google.cloud.dialogflow.v2beta1.UpdateC" +
      "ontextRequest\032(.google.cloud.dialogflow." +
      "v2beta1.Context\"\227\003\332A\023context,update_mask" +
      "\332A\007context\202\323\344\223\002\360\0022>/v2beta1/{context.nam" +
      "e=projects/*/agent/sessions/*/contexts/*" +
      "}:\007contextZ`2U/v2beta1/{context.name=pro" +
      "jects/*/agent/environments/*/users/*/ses" +
      "sions/*/contexts/*}:\007contextZU2J/v2beta1" +
      "/{context.name=projects/*/locations/*/ag" +
      "ent/sessions/*/contexts/*}:\007contextZl2a/" +
      "v2beta1/{context.name=projects/*/locatio" +
      "ns/*/agent/environments/*/users/*/sessio" +
      "ns/*/contexts/*}:\007context\022\233\003\n\rDeleteCont" +
      "ext\0225.google.cloud.dialogflow.v2beta1.De" +
      "leteContextRequest\032\026.google.protobuf.Emp" +
      "ty\"\272\002\332A\004name\202\323\344\223\002\254\002*6/v2beta1/{name=proj" +
      "ects/*/agent/sessions/*/contexts/*}ZO*M/" +
      "v2beta1/{name=projects/*/agent/environme" +
      "nts/*/users/*/sessions/*/contexts/*}ZD*B" +
      "/v2beta1/{name=projects/*/locations/*/ag" +
      "ent/sessions/*/contexts/*}Z[*Y/v2beta1/{" +
      "name=projects/*/locations/*/agent/enviro" +
      "nments/*/users/*/sessions/*/contexts/*}\022" +
      "\245\003\n\021DeleteAllContexts\0229.google.cloud.dia" +
      "logflow.v2beta1.DeleteAllContextsRequest" +
      "\032\026.google.protobuf.Empty\"\274\002\332A\006parent\202\323\344\223" +
      "\002\254\002*6/v2beta1/{parent=projects/*/agent/s" +
      "essions/*}/contextsZO*M/v2beta1/{parent=" +
      "projects/*/agent/environments/*/users/*/" +
      "sessions/*}/contextsZD*B/v2beta1/{parent" +
      "=projects/*/locations/*/agent/sessions/*" +
      "}/contextsZ[*Y/v2beta1/{parent=projects/" +
      "*/locations/*/agent/environments/*/users" +
      "/*/sessions/*}/contexts\032x\312A\031dialogflow.g" +
      "oogleapis.com\322AYhttps://www.googleapis.c" +
      "om/auth/cloud-platform,https://www.googl" +
      "eapis.com/auth/dialogflowB\244\001\n#com.google" +
      ".cloud.dialogflow.v2beta1B\014ContextProtoP" +
      "\001ZCcloud.google.com/go/dialogflow/apiv2b" +
      "eta1/dialogflowpb;dialogflowpb\370\001\001\242\002\002DF\252\002" +
      "\037Google.Cloud.Dialogflow.V2Beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2beta1_Context_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Context_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_Context_descriptor,
        new java.lang.String[] { "Name", "LifespanCount", "Parameters", });
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_descriptor,
        new java.lang.String[] { "Contexts", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor,
        new java.lang.String[] { "Parent", "Context", });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_descriptor,
        new java.lang.String[] { "Context", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_descriptor,
        new java.lang.String[] { "Parent", });
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
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
