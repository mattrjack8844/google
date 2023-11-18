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
// source: google/cloud/dialogflow/cx/v3/deployment.proto

package com.google.cloud.dialogflow.cx.v3;

public final class DeploymentProto {
  private DeploymentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Deployment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Deployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Deployment_Result_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Deployment_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetDeploymentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dialogflow/cx/v3/deployme"
          + "nt.proto\022\035google.cloud.dialogflow.cx.v3\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\263\005\n\nDeployme"
          + "nt\022\014\n\004name\030\001 \001(\t\022<\n\014flow_version\030\002 \001(\tB&"
          + "\372A#\n!dialogflow.googleapis.com/Version\022>"
          + "\n\005state\030\003 \001(\0162/.google.cloud.dialogflow."
          + "cx.v3.Deployment.State\022@\n\006result\030\004 \001(\01320"
          + ".google.cloud.dialogflow.cx.v3.Deploymen"
          + "t.Result\022.\n\nstart_time\030\005 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\022,\n\010end_time\030\006 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\032\227\001\n\006Result\022N\n\027dep"
          + "loyment_test_results\030\001 \003(\tB-\372A*\n(dialogf"
          + "low.googleapis.com/TestCaseResult\022=\n\nexp"
          + "eriment\030\002 \001(\tB)\372A&\n$dialogflow.googleapi"
          + "s.com/Experiment\"F\n\005State\022\025\n\021STATE_UNSPE"
          + "CIFIED\020\000\022\013\n\007RUNNING\020\001\022\r\n\tSUCCEEDED\020\002\022\n\n\006"
          + "FAILED\020\003:\226\001\352A\222\001\n$dialogflow.googleapis.c"
          + "om/Deployment\022jprojects/{project}/locati"
          + "ons/{location}/agents/{agent}/environmen"
          + "ts/{environment}/deployments/{deployment"
          + "}\"~\n\026ListDeploymentsRequest\022=\n\006parent\030\001 "
          + "\001(\tB-\342A\001\002\372A&\022$dialogflow.googleapis.com/"
          + "Deployment\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_to"
          + "ken\030\003 \001(\t\"r\n\027ListDeploymentsResponse\022>\n\013"
          + "deployments\030\001 \003(\0132).google.cloud.dialogf"
          + "low.cx.v3.Deployment\022\027\n\017next_page_token\030"
          + "\002 \001(\t\"S\n\024GetDeploymentRequest\022;\n\004name\030\001 "
          + "\001(\tB-\342A\001\002\372A&\n$dialogflow.googleapis.com/"
          + "Deployment2\256\004\n\013Deployments\022\332\001\n\017ListDeplo"
          + "yments\0225.google.cloud.dialogflow.cx.v3.L"
          + "istDeploymentsRequest\0326.google.cloud.dia"
          + "logflow.cx.v3.ListDeploymentsResponse\"X\332"
          + "A\006parent\202\323\344\223\002I\022G/v3/{parent=projects/*/l"
          + "ocations/*/agents/*/environments/*}/depl"
          + "oyments\022\307\001\n\rGetDeployment\0223.google.cloud"
          + ".dialogflow.cx.v3.GetDeploymentRequest\032)"
          + ".google.cloud.dialogflow.cx.v3.Deploymen"
          + "t\"V\332A\004name\202\323\344\223\002I\022G/v3/{name=projects/*/l"
          + "ocations/*/agents/*/environments/*/deplo"
          + "yments/*}\032x\312A\031dialogflow.googleapis.com\322"
          + "AYhttps://www.googleapis.com/auth/cloud-"
          + "platform,https://www.googleapis.com/auth"
          + "/dialogflowB\265\001\n!com.google.cloud.dialogf"
          + "low.cx.v3B\017DeploymentProtoP\001Z1cloud.goog"
          + "le.com/go/dialogflow/cx/apiv3/cxpb;cxpb\370"
          + "\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogflow.Cx.V3\352"
          + "\002!Google::Cloud::Dialogflow::CX::V3b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_Deployment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Deployment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Deployment_descriptor,
            new java.lang.String[] {
              "Name", "FlowVersion", "State", "Result", "StartTime", "EndTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Deployment_Result_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Deployment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Deployment_Result_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Deployment_Result_descriptor,
            new java.lang.String[] {
              "DeploymentTestResults", "Experiment",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_descriptor,
            new java.lang.String[] {
              "Deployments", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_GetDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetDeploymentRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
