/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore_federation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1;

public final class MetastoreFederationProto {
  private MetastoreFederationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_Federation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_Federation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_BackendMetastore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_BackendMetastore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_ListFederationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_ListFederationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_ListFederationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_ListFederationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_GetFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_GetFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_CreateFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_CreateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_UpdateFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_UpdateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1_DeleteFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1_DeleteFederationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/metastore/v1/metastore_fe"
          + "deration.proto\022\031google.cloud.metastore.v"
          + "1\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032)go"
          + "ogle/cloud/metastore/v1/metastore.proto\032"
          + "#google/longrunning/operations.proto\032\033go"
          + "ogle/protobuf/empty.proto\032 google/protob"
          + "uf/field_mask.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\253\006\n\nFederation\022\021\n\004name\030\001 \001("
          + "\tB\003\340A\005\0224\n\013create_time\030\002 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0224\n\013update_time\030\003 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022A\n\006la"
          + "bels\030\004 \003(\01321.google.cloud.metastore.v1.F"
          + "ederation.LabelsEntry\022\024\n\007version\030\005 \001(\tB\003"
          + "\340A\005\022X\n\022backend_metastores\030\006 \003(\0132<.google"
          + ".cloud.metastore.v1.Federation.BackendMe"
          + "tastoresEntry\022\031\n\014endpoint_uri\030\007 \001(\tB\003\340A\003"
          + "\022?\n\005state\030\010 \001(\0162+.google.cloud.metastore"
          + ".v1.Federation.StateB\003\340A\003\022\032\n\rstate_messa"
          + "ge\030\t \001(\tB\003\340A\003\022\020\n\003uid\030\n \001(\tB\003\340A\003\032-\n\013Label"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032e"
          + "\n\026BackendMetastoresEntry\022\013\n\003key\030\001 \001(\005\022:\n"
          + "\005value\030\002 \001(\0132+.google.cloud.metastore.v1"
          + ".BackendMetastore:\0028\001\"_\n\005State\022\025\n\021STATE_"
          + "UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022"
          + "\014\n\010UPDATING\020\003\022\014\n\010DELETING\020\004\022\t\n\005ERROR\020\005:j"
          + "\352Ag\n#metastore.googleapis.com/Federation"
          + "\022@projects/{project}/locations/{location"
          + "}/federations/{federation}\"\312\001\n\020BackendMe"
          + "tastore\022\014\n\004name\030\001 \001(\t\022Q\n\016metastore_type\030"
          + "\002 \001(\01629.google.cloud.metastore.v1.Backen"
          + "dMetastore.MetastoreType\"U\n\rMetastoreTyp"
          + "e\022\036\n\032METASTORE_TYPE_UNSPECIFIED\020\000\022\014\n\010BIG"
          + "QUERY\020\002\022\026\n\022DATAPROC_METASTORE\020\003\"\262\001\n\026List"
          + "FederationsRequest\022;\n\006parent\030\001 \001(\tB+\340A\002\372"
          + "A%\022#metastore.googleapis.com/Federation\022"
          + "\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 "
          + "\001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_b"
          + "y\030\005 \001(\tB\003\340A\001\"\203\001\n\027ListFederationsResponse"
          + "\022:\n\013federations\030\001 \003(\0132%.google.cloud.met"
          + "astore.v1.Federation\022\027\n\017next_page_token\030"
          + "\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"Q\n\024GetFederat"
          + "ionRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#metast"
          + "ore.googleapis.com/Federation\"\313\001\n\027Create"
          + "FederationRequest\022;\n\006parent\030\001 \001(\tB+\340A\002\372A"
          + "%\022#metastore.googleapis.com/Federation\022\032"
          + "\n\rfederation_id\030\002 \001(\tB\003\340A\002\022>\n\nfederation"
          + "\030\003 \001(\0132%.google.cloud.metastore.v1.Feder"
          + "ationB\003\340A\002\022\027\n\nrequest_id\030\004 \001(\tB\003\340A\001\"\250\001\n\027"
          + "UpdateFederationRequest\0224\n\013update_mask\030\001"
          + " \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022>\n"
          + "\nfederation\030\002 \001(\0132%.google.cloud.metasto"
          + "re.v1.FederationB\003\340A\002\022\027\n\nrequest_id\030\003 \001("
          + "\tB\003\340A\001\"m\n\027DeleteFederationRequest\0229\n\004nam"
          + "e\030\001 \001(\tB+\340A\002\372A%\n#metastore.googleapis.co"
          + "m/Federation\022\027\n\nrequest_id\030\002 \001(\tB\003\340A\0012\334\t"
          + "\n\033DataprocMetastoreFederation\022\272\001\n\017ListFe"
          + "derations\0221.google.cloud.metastore.v1.Li"
          + "stFederationsRequest\0322.google.cloud.meta"
          + "store.v1.ListFederationsResponse\"@\332A\006par"
          + "ent\202\323\344\223\0021\022//v1/{parent=projects/*/locati"
          + "ons/*}/federations\022\247\001\n\rGetFederation\022/.g"
          + "oogle.cloud.metastore.v1.GetFederationRe"
          + "quest\032%.google.cloud.metastore.v1.Federa"
          + "tion\">\332A\004name\202\323\344\223\0021\022//v1/{name=projects/"
          + "*/locations/*/federations/*}\022\211\002\n\020CreateF"
          + "ederation\0222.google.cloud.metastore.v1.Cr"
          + "eateFederationRequest\032\035.google.longrunni"
          + "ng.Operation\"\241\001\312A9\n\nFederation\022+google.c"
          + "loud.metastore.v1.OperationMetadata\332A\037pa"
          + "rent,federation,federation_id\202\323\344\223\002=\"//v1"
          + "/{parent=projects/*/locations/*}/federat"
          + "ions:\nfederation\022\213\002\n\020UpdateFederation\0222."
          + "google.cloud.metastore.v1.UpdateFederati"
          + "onRequest\032\035.google.longrunning.Operation"
          + "\"\243\001\312A9\n\nFederation\022+google.cloud.metasto"
          + "re.v1.OperationMetadata\332A\026federation,upd"
          + "ate_mask\202\323\344\223\002H2:/v1/{federation.name=pro"
          + "jects/*/locations/*/federations/*}:\nfede"
          + "ration\022\355\001\n\020DeleteFederation\0222.google.clo"
          + "ud.metastore.v1.DeleteFederationRequest\032"
          + "\035.google.longrunning.Operation\"\205\001\312AD\n\025go"
          + "ogle.protobuf.Empty\022+google.cloud.metast"
          + "ore.v1.OperationMetadata\332A\004name\202\323\344\223\0021*//"
          + "v1/{name=projects/*/locations/*/federati"
          + "ons/*}\032L\312A\030metastore.googleapis.com\322A.ht"
          + "tps://www.googleapis.com/auth/cloud-plat"
          + "formBx\n\035com.google.cloud.metastore.v1B\030M"
          + "etastoreFederationProtoP\001Z;cloud.google."
          + "com/go/metastore/apiv1/metastorepb;metas"
          + "torepbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.metastore.v1.MetastoreProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_metastore_v1_Federation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_metastore_v1_Federation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_Federation_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Version",
              "BackendMetastores",
              "EndpointUri",
              "State",
              "StateMessage",
              "Uid",
            });
    internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_descriptor =
        internal_static_google_cloud_metastore_v1_Federation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_Federation_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_descriptor =
        internal_static_google_cloud_metastore_v1_Federation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_Federation_BackendMetastoresEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_metastore_v1_BackendMetastore_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_metastore_v1_BackendMetastore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_BackendMetastore_descriptor,
            new java.lang.String[] {
              "Name", "MetastoreType",
            });
    internal_static_google_cloud_metastore_v1_ListFederationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_metastore_v1_ListFederationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_ListFederationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_metastore_v1_ListFederationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_metastore_v1_ListFederationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_ListFederationsResponse_descriptor,
            new java.lang.String[] {
              "Federations", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_metastore_v1_GetFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_metastore_v1_GetFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_GetFederationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_metastore_v1_CreateFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_metastore_v1_CreateFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_CreateFederationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FederationId", "Federation", "RequestId",
            });
    internal_static_google_cloud_metastore_v1_UpdateFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_metastore_v1_UpdateFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_UpdateFederationRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Federation", "RequestId",
            });
    internal_static_google_cloud_metastore_v1_DeleteFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_metastore_v1_DeleteFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1_DeleteFederationRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.metastore.v1.MetastoreProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
