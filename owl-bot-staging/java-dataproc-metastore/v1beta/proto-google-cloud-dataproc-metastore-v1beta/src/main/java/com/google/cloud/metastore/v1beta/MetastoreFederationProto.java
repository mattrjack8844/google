// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore_federation.proto

package com.google.cloud.metastore.v1beta;

public final class MetastoreFederationProto {
  private MetastoreFederationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_Federation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_Federation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_BackendMetastore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_GetFederationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_GetFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/metastore/v1beta/metastor" +
      "e_federation.proto\022\035google.cloud.metasto" +
      "re.v1beta\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\032-google/cloud/metastore/v1beta/meta" +
      "store.proto\032#google/longrunning/operatio" +
      "ns.proto\032\033google/protobuf/empty.proto\032 g" +
      "oogle/protobuf/field_mask.proto\032\037google/" +
      "protobuf/timestamp.proto\"\303\006\n\nFederation\022" +
      "\022\n\004name\030\001 \001(\tB\004\342A\001\005\0225\n\013create_time\030\002 \001(\013" +
      "2\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013up" +
      "date_time\030\003 \001(\0132\032.google.protobuf.Timest" +
      "ampB\004\342A\001\003\022E\n\006labels\030\004 \003(\01325.google.cloud" +
      ".metastore.v1beta.Federation.LabelsEntry" +
      "\022\025\n\007version\030\005 \001(\tB\004\342A\001\005\022\\\n\022backend_metas" +
      "tores\030\006 \003(\0132@.google.cloud.metastore.v1b" +
      "eta.Federation.BackendMetastoresEntry\022\032\n" +
      "\014endpoint_uri\030\007 \001(\tB\004\342A\001\003\022D\n\005state\030\010 \001(\016" +
      "2/.google.cloud.metastore.v1beta.Federat" +
      "ion.StateB\004\342A\001\003\022\033\n\rstate_message\030\t \001(\tB\004" +
      "\342A\001\003\022\021\n\003uid\030\n \001(\tB\004\342A\001\003\032-\n\013LabelsEntry\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032i\n\026Backen" +
      "dMetastoresEntry\022\013\n\003key\030\001 \001(\005\022>\n\005value\030\002" +
      " \001(\0132/.google.cloud.metastore.v1beta.Bac" +
      "kendMetastore:\0028\001\"_\n\005State\022\025\n\021STATE_UNSP" +
      "ECIFIED\020\000\022\014\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010U" +
      "PDATING\020\003\022\014\n\010DELETING\020\004\022\t\n\005ERROR\020\005:j\352Ag\n" +
      "#metastore.googleapis.com/Federation\022@pr" +
      "ojects/{project}/locations/{location}/fe" +
      "derations/{federation}\"\334\001\n\020BackendMetast" +
      "ore\022\014\n\004name\030\001 \001(\t\022U\n\016metastore_type\030\002 \001(" +
      "\0162=.google.cloud.metastore.v1beta.Backen" +
      "dMetastore.MetastoreType\"c\n\rMetastoreTyp" +
      "e\022\036\n\032METASTORE_TYPE_UNSPECIFIED\020\000\022\014\n\010DAT" +
      "APLEX\020\001\022\014\n\010BIGQUERY\020\002\022\026\n\022DATAPROC_METAST" +
      "ORE\020\003\"\267\001\n\026ListFederationsRequest\022<\n\006pare" +
      "nt\030\001 \001(\tB,\342A\001\002\372A%\022#metastore.googleapis." +
      "com/Federation\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022" +
      "\030\n\npage_token\030\003 \001(\tB\004\342A\001\001\022\024\n\006filter\030\004 \001(" +
      "\tB\004\342A\001\001\022\026\n\010order_by\030\005 \001(\tB\004\342A\001\001\"\207\001\n\027List" +
      "FederationsResponse\022>\n\013federations\030\001 \003(\013" +
      "2).google.cloud.metastore.v1beta.Federat" +
      "ion\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreacha" +
      "ble\030\003 \003(\t\"R\n\024GetFederationRequest\022:\n\004nam" +
      "e\030\001 \001(\tB,\342A\001\002\372A%\n#metastore.googleapis.c" +
      "om/Federation\"\323\001\n\027CreateFederationReques" +
      "t\022<\n\006parent\030\001 \001(\tB,\342A\001\002\372A%\022#metastore.go" +
      "ogleapis.com/Federation\022\033\n\rfederation_id" +
      "\030\002 \001(\tB\004\342A\001\002\022C\n\nfederation\030\003 \001(\0132).googl" +
      "e.cloud.metastore.v1beta.FederationB\004\342A\001" +
      "\002\022\030\n\nrequest_id\030\004 \001(\tB\004\342A\001\001\"\257\001\n\027UpdateFe" +
      "derationRequest\0225\n\013update_mask\030\001 \001(\0132\032.g" +
      "oogle.protobuf.FieldMaskB\004\342A\001\002\022C\n\nfedera" +
      "tion\030\002 \001(\0132).google.cloud.metastore.v1be" +
      "ta.FederationB\004\342A\001\002\022\030\n\nrequest_id\030\003 \001(\tB" +
      "\004\342A\001\001\"o\n\027DeleteFederationRequest\022:\n\004name" +
      "\030\001 \001(\tB,\342A\001\002\372A%\n#metastore.googleapis.co" +
      "m/Federation\022\030\n\nrequest_id\030\002 \001(\tB\004\342A\001\0012\230" +
      "\n\n\033DataprocMetastoreFederation\022\306\001\n\017ListF" +
      "ederations\0225.google.cloud.metastore.v1be" +
      "ta.ListFederationsRequest\0326.google.cloud" +
      ".metastore.v1beta.ListFederationsRespons" +
      "e\"D\332A\006parent\202\323\344\223\0025\0223/v1beta/{parent=proj" +
      "ects/*/locations/*}/federations\022\263\001\n\rGetF" +
      "ederation\0223.google.cloud.metastore.v1bet" +
      "a.GetFederationRequest\032).google.cloud.me" +
      "tastore.v1beta.Federation\"B\332A\004name\202\323\344\223\0025" +
      "\0223/v1beta/{name=projects/*/locations/*/f" +
      "ederations/*}\022\225\002\n\020CreateFederation\0226.goo" +
      "gle.cloud.metastore.v1beta.CreateFederat" +
      "ionRequest\032\035.google.longrunning.Operatio" +
      "n\"\251\001\312A=\n\nFederation\022/google.cloud.metast" +
      "ore.v1beta.OperationMetadata\332A\037parent,fe" +
      "deration,federation_id\202\323\344\223\002A\"3/v1beta/{p" +
      "arent=projects/*/locations/*}/federation" +
      "s:\nfederation\022\227\002\n\020UpdateFederation\0226.goo" +
      "gle.cloud.metastore.v1beta.UpdateFederat" +
      "ionRequest\032\035.google.longrunning.Operatio" +
      "n\"\253\001\312A=\n\nFederation\022/google.cloud.metast" +
      "ore.v1beta.OperationMetadata\332A\026federatio" +
      "n,update_mask\202\323\344\223\002L2>/v1beta/{federation" +
      ".name=projects/*/locations/*/federations" +
      "/*}:\nfederation\022\371\001\n\020DeleteFederation\0226.g" +
      "oogle.cloud.metastore.v1beta.DeleteFeder" +
      "ationRequest\032\035.google.longrunning.Operat" +
      "ion\"\215\001\312AH\n\025google.protobuf.Empty\022/google" +
      ".cloud.metastore.v1beta.OperationMetadat" +
      "a\332A\004name\202\323\344\223\0025*3/v1beta/{name=projects/*" +
      "/locations/*/federations/*}\032L\312A\030metastor" +
      "e.googleapis.com\322A.https://www.googleapi" +
      "s.com/auth/cloud-platformB\200\001\n!com.google" +
      ".cloud.metastore.v1betaB\030MetastoreFedera" +
      "tionProtoP\001Z?cloud.google.com/go/metasto" +
      "re/apiv1beta/metastorepb;metastorepbb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.metastore.v1beta.MetastoreProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_metastore_v1beta_Federation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_metastore_v1beta_Federation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_Federation_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "Version", "BackendMetastores", "EndpointUri", "State", "StateMessage", "Uid", });
    internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_descriptor =
      internal_static_google_cloud_metastore_v1beta_Federation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_descriptor =
      internal_static_google_cloud_metastore_v1beta_Federation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_metastore_v1beta_BackendMetastore_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor,
        new java.lang.String[] { "Name", "MetastoreType", });
    internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_descriptor,
        new java.lang.String[] { "Federations", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_metastore_v1beta_GetFederationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_metastore_v1beta_GetFederationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_GetFederationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_descriptor,
        new java.lang.String[] { "Parent", "FederationId", "Federation", "RequestId", });
    internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "Federation", "RequestId", });
    internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.metastore.v1beta.MetastoreProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
