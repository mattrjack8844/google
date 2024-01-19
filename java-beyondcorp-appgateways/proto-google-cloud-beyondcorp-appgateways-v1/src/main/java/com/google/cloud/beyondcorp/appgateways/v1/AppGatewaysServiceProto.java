/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/beyondcorp/appgateways/v1/app_gateways_service.proto

package com.google.cloud.beyondcorp.appgateways.v1;

public final class AppGatewaysServiceProto {
  private AppGatewaysServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/beyondcorp/appgateways/v1"
          + "/app_gateways_service.proto\022&google.clou"
          + "d.beyondcorp.appgateways.v1\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\032#google/longrunni"
          + "ng/operations.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\270\001\n\026ListAppGatewaysRequest\022"
          + "=\n\006parent\030\001 \001(\tB-\342A\001\002\372A&\022$beyondcorp.goo"
          + "gleapis.com/AppGateway\022\027\n\tpage_size\030\002 \001("
          + "\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB\004\342A\001\001\022\024\n\006fil"
          + "ter\030\004 \001(\tB\004\342A\001\001\022\026\n\010order_by\030\005 \001(\tB\004\342A\001\001\""
          + "\221\001\n\027ListAppGatewaysResponse\022H\n\014app_gatew"
          + "ays\030\001 \003(\01322.google.cloud.beyondcorp.appg"
          + "ateways.v1.AppGateway\022\027\n\017next_page_token"
          + "\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"S\n\024GetAppGat"
          + "ewayRequest\022;\n\004name\030\001 \001(\tB-\342A\001\002\372A&\n$beyo"
          + "ndcorp.googleapis.com/AppGateway\"\374\001\n\027Cre"
          + "ateAppGatewayRequest\022=\n\006parent\030\001 \001(\tB-\342A"
          + "\001\002\372A&\022$beyondcorp.googleapis.com/AppGate"
          + "way\022\034\n\016app_gateway_id\030\002 \001(\tB\004\342A\001\001\022M\n\013app"
          + "_gateway\030\003 \001(\01322.google.cloud.beyondcorp"
          + ".appgateways.v1.AppGatewayB\004\342A\001\002\022\030\n\nrequ"
          + "est_id\030\004 \001(\tB\004\342A\001\001\022\033\n\rvalidate_only\030\005 \001("
          + "\010B\004\342A\001\001\"\215\001\n\027DeleteAppGatewayRequest\022;\n\004n"
          + "ame\030\001 \001(\tB-\342A\001\002\372A&\n$beyondcorp.googleapi"
          + "s.com/AppGateway\022\030\n\nrequest_id\030\002 \001(\tB\004\342A"
          + "\001\001\022\033\n\rvalidate_only\030\003 \001(\010B\004\342A\001\001\"\267\010\n\nAppG"
          + "ateway\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\0225\n\013create_tim"
          + "e\030\002 \001(\0132\032.google.protobuf.TimestampB\004\342A\001"
          + "\003\0225\n\013update_time\030\003 \001(\0132\032.google.protobuf"
          + ".TimestampB\004\342A\001\003\022T\n\006labels\030\004 \003(\0132>.googl"
          + "e.cloud.beyondcorp.appgateways.v1.AppGat"
          + "eway.LabelsEntryB\004\342A\001\001\022\032\n\014display_name\030\005"
          + " \001(\tB\004\342A\001\001\022\021\n\003uid\030\006 \001(\tB\004\342A\001\003\022K\n\004type\030\007 "
          + "\001(\01627.google.cloud.beyondcorp.appgateway"
          + "s.v1.AppGateway.TypeB\004\342A\001\002\022M\n\005state\030\010 \001("
          + "\01628.google.cloud.beyondcorp.appgateways."
          + "v1.AppGateway.StateB\004\342A\001\003\022\021\n\003uri\030\t \001(\tB\004"
          + "\342A\001\003\022k\n\025allocated_connections\030\n \003(\0132F.go"
          + "ogle.cloud.beyondcorp.appgateways.v1.App"
          + "Gateway.AllocatedConnectionB\004\342A\001\003\022T\n\thos"
          + "t_type\030\013 \001(\0162;.google.cloud.beyondcorp.a"
          + "ppgateways.v1.AppGateway.HostTypeB\004\342A\001\002\032"
          + "H\n\023AllocatedConnection\022\025\n\007psc_uri\030\001 \001(\tB"
          + "\004\342A\001\002\022\032\n\014ingress_port\030\002 \001(\005B\004\342A\001\002\032-\n\013Lab"
          + "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "\"+\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\r\n\tTCP_PR"
          + "OXY\020\001\"_\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\013\n\007CREATED\020\002\022\014\n\010UPDATING\020\003\022\014"
          + "\n\010DELETING\020\004\022\010\n\004DOWN\020\005\";\n\010HostType\022\031\n\025HO"
          + "ST_TYPE_UNSPECIFIED\020\000\022\024\n\020GCP_REGIONAL_MI"
          + "G\020\001:l\352Ai\n$beyondcorp.googleapis.com/AppG"
          + "ateway\022Aprojects/{project}/locations/{lo"
          + "cation}/appGateways/{app_gateway}\"\221\002\n\033Ap"
          + "pGatewayOperationMetadata\0225\n\013create_time"
          + "\030\001 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003"
          + "\0222\n\010end_time\030\002 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003\022\024\n\006target\030\003 \001(\tB\004\342A\001\003\022\022\n\004ve"
          + "rb\030\004 \001(\tB\004\342A\001\003\022\034\n\016status_message\030\005 \001(\tB\004"
          + "\342A\001\003\022$\n\026requested_cancellation\030\006 \001(\010B\004\342A"
          + "\001\003\022\031\n\013api_version\030\007 \001(\tB\004\342A\001\0032\366\007\n\022AppGat"
          + "ewaysService\022\324\001\n\017ListAppGateways\022>.googl"
          + "e.cloud.beyondcorp.appgateways.v1.ListAp"
          + "pGatewaysRequest\032?.google.cloud.beyondco"
          + "rp.appgateways.v1.ListAppGatewaysRespons"
          + "e\"@\332A\006parent\202\323\344\223\0021\022//v1/{parent=projects"
          + "/*/locations/*}/appGateways\022\301\001\n\rGetAppGa"
          + "teway\022<.google.cloud.beyondcorp.appgatew"
          + "ays.v1.GetAppGatewayRequest\0322.google.clo"
          + "ud.beyondcorp.appgateways.v1.AppGateway\""
          + ">\332A\004name\202\323\344\223\0021\022//v1/{name=projects/*/loc"
          + "ations/*/appGateways/*}\022\211\002\n\020CreateAppGat"
          + "eway\022?.google.cloud.beyondcorp.appgatewa"
          + "ys.v1.CreateAppGatewayRequest\032\035.google.l"
          + "ongrunning.Operation\"\224\001\312A)\n\nAppGateway\022\033"
          + "AppGatewayOperationMetadata\332A!parent,app"
          + "_gateway,app_gateway_id\202\323\344\223\002>\"//v1/{pare"
          + "nt=projects/*/locations/*}/appGateways:\013"
          + "app_gateway\022\351\001\n\020DeleteAppGateway\022?.googl"
          + "e.cloud.beyondcorp.appgateways.v1.Delete"
          + "AppGatewayRequest\032\035.google.longrunning.O"
          + "peration\"u\312A4\n\025google.protobuf.Empty\022\033Ap"
          + "pGatewayOperationMetadata\332A\004name\202\323\344\223\0021*/"
          + "/v1/{name=projects/*/locations/*/appGate"
          + "ways/*}\032M\312A\031beyondcorp.googleapis.com\322A."
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atformB\224\002\n*com.google.cloud.beyondcorp.a"
          + "ppgateways.v1B\027AppGatewaysServiceProtoP\001"
          + "ZLcloud.google.com/go/beyondcorp/appgate"
          + "ways/apiv1/appgatewayspb;appgatewayspb\252\002"
          + "&Google.Cloud.BeyondCorp.AppGateways.V1\312"
          + "\002&Google\\Cloud\\BeyondCorp\\AppGateways\\V1"
          + "\352\002*Google::Cloud::BeyondCorp::AppGateway"
          + "s::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_descriptor,
            new java.lang.String[] {
              "AppGateways", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AppGatewayId", "AppGateway", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "DisplayName",
              "Uid",
              "Type",
              "State",
              "Uri",
              "AllocatedConnections",
              "HostType",
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_descriptor =
        internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_descriptor,
            new java.lang.String[] {
              "PscUri", "IngressPort",
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_descriptor =
        internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
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
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
