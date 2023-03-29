/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DeploymentResourcePoolServiceProto {
  private DeploymentResourcePoolServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/cloud/aiplatform/v1beta1/deploy"
          + "ment_resource_pool_service.proto\022\037google"
          + ".cloud.aiplatform.v1beta1\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\0328google/cloud/aipla"
          + "tform/v1beta1/deployed_model_ref.proto\032>"
          + "google/cloud/aiplatform/v1beta1/deployme"
          + "nt_resource_pool.proto\032.google/cloud/aip"
          + "latform/v1beta1/endpoint.proto\032/google/c"
          + "loud/aiplatform/v1beta1/operation.proto\032"
          + "#google/longrunning/operations.proto\032\033go"
          + "ogle/protobuf/empty.proto\"\352\001\n#CreateDepl"
          + "oymentResourcePoolRequest\0229\n\006parent\030\001 \001("
          + "\tB)\340A\002\372A#\n!locations.googleapis.com/Loca"
          + "tion\022^\n\030deployment_resource_pool\030\002 \001(\01327"
          + ".google.cloud.aiplatform.v1beta1.Deploym"
          + "entResourcePoolB\003\340A\002\022(\n\033deployment_resou"
          + "rce_pool_id\030\003 \001(\tB\003\340A\002\"\204\001\n-CreateDeploym"
          + "entResourcePoolOperationMetadata\022S\n\020gene"
          + "ric_metadata\030\001 \001(\01329.google.cloud.aiplat"
          + "form.v1beta1.GenericOperationMetadata\"j\n"
          + " GetDeploymentResourcePoolRequest\022F\n\004nam"
          + "e\030\001 \001(\tB8\340A\002\372A2\n0aiplatform.googleapis.c"
          + "om/DeploymentResourcePool\"\206\001\n\"ListDeploy"
          + "mentResourcePoolsRequest\0229\n\006parent\030\001 \001(\t"
          + "B)\340A\002\372A#\022!locations.googleapis.com/Locat"
          + "ion\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001"
          + "(\t\"\232\001\n#ListDeploymentResourcePoolsRespon"
          + "se\022Z\n\031deployment_resource_pools\030\001 \003(\01327."
          + "google.cloud.aiplatform.v1beta1.Deployme"
          + "ntResourcePool\022\027\n\017next_page_token\030\002 \001(\t\""
          + "\204\001\n-UpdateDeploymentResourcePoolOperatio"
          + "nMetadata\022S\n\020generic_metadata\030\001 \001(\01329.go"
          + "ogle.cloud.aiplatform.v1beta1.GenericOpe"
          + "rationMetadata\"m\n#DeleteDeploymentResour"
          + "cePoolRequest\022F\n\004name\030\001 \001(\tB8\340A\002\372A2\n0aip"
          + "latform.googleapis.com/DeploymentResourc"
          + "ePool\"j\n\032QueryDeployedModelsRequest\022%\n\030d"
          + "eployment_resource_pool\030\001 \001(\tB\003\340A\002\022\021\n\tpa"
          + "ge_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\225\002\n\033Qu"
          + "eryDeployedModelsResponse\022K\n\017deployed_mo"
          + "dels\030\001 \003(\0132..google.cloud.aiplatform.v1b"
          + "eta1.DeployedModelB\002\030\001\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\022N\n\023deployed_model_refs\030\003 \003(\01321.g"
          + "oogle.cloud.aiplatform.v1beta1.DeployedM"
          + "odelRef\022\"\n\032total_deployed_model_count\030\004 "
          + "\001(\005\022\034\n\024total_endpoint_count\030\005 \001(\0052\337\013\n\035De"
          + "ploymentResourcePoolService\022\331\002\n\034CreateDe"
          + "ploymentResourcePool\022D.google.cloud.aipl"
          + "atform.v1beta1.CreateDeploymentResourceP"
          + "oolRequest\032\035.google.longrunning.Operatio"
          + "n\"\323\001\202\323\344\223\002E\"@/v1beta1/{parent=projects/*/"
          + "locations/*}/deploymentResourcePools:\001*\332"
          + "A;parent,deployment_resource_pool,deploy"
          + "ment_resource_pool_id\312AG\n\026DeploymentReso"
          + "urcePool\022-CreateDeploymentResourcePoolOp"
          + "erationMetadata\022\350\001\n\031GetDeploymentResourc"
          + "ePool\022A.google.cloud.aiplatform.v1beta1."
          + "GetDeploymentResourcePoolRequest\0327.googl"
          + "e.cloud.aiplatform.v1beta1.DeploymentRes"
          + "ourcePool\"O\202\323\344\223\002B\022@/v1beta1/{name=projec"
          + "ts/*/locations/*/deploymentResourcePools"
          + "/*}\332A\004name\022\373\001\n\033ListDeploymentResourcePoo"
          + "ls\022C.google.cloud.aiplatform.v1beta1.Lis"
          + "tDeploymentResourcePoolsRequest\032D.google"
          + ".cloud.aiplatform.v1beta1.ListDeployment"
          + "ResourcePoolsResponse\"Q\202\323\344\223\002B\022@/v1beta1/"
          + "{parent=projects/*/locations/*}/deployme"
          + "ntResourcePools\332A\006parent\022\210\002\n\034DeleteDeplo"
          + "ymentResourcePool\022D.google.cloud.aiplatf"
          + "orm.v1beta1.DeleteDeploymentResourcePool"
          + "Request\032\035.google.longrunning.Operation\"\202"
          + "\001\202\323\344\223\002B*@/v1beta1/{name=projects/*/locat"
          + "ions/*/deploymentResourcePools/*}\332A\004name"
          + "\312A0\n\025google.protobuf.Empty\022\027DeleteOperat"
          + "ionMetadata\022\236\002\n\023QueryDeployedModels\022;.go"
          + "ogle.cloud.aiplatform.v1beta1.QueryDeplo"
          + "yedModelsRequest\032<.google.cloud.aiplatfo"
          + "rm.v1beta1.QueryDeployedModelsResponse\"\213"
          + "\001\202\323\344\223\002j\022h/v1beta1/{deployment_resource_p"
          + "ool=projects/*/locations/*/deploymentRes"
          + "ourcePools/*}:queryDeployedModels\332A\030depl"
          + "oyment_resource_pool\032M\312A\031aiplatform.goog"
          + "leapis.com\322A.https://www.googleapis.com/"
          + "auth/cloud-platformB\371\001\n#com.google.cloud"
          + ".aiplatform.v1beta1B\"DeploymentResourceP"
          + "oolServiceProtoP\001ZCcloud.google.com/go/a"
          + "iplatform/apiv1beta1/aiplatformpb;aiplat"
          + "formpb\252\002\037Google.Cloud.AIPlatform.V1Beta1"
          + "\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Goo"
          + "gle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DeploymentResourcePool", "DeploymentResourcePoolId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor,
            new java.lang.String[] {
              "DeploymentResourcePools", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor,
            new java.lang.String[] {
              "DeploymentResourcePool", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor,
            new java.lang.String[] {
              "DeployedModels",
              "NextPageToken",
              "DeployedModelRefs",
              "TotalDeployedModelCount",
              "TotalEndpointCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
