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
// source: google/cloud/vertexai/v1/endpoint.proto

package com.google.cloud.vertexai.v1;

public final class EndpointProto {
  private EndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Endpoint_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Endpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_DeployedModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_DeployedModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_PrivateEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_PrivateEndpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_PredictRequestResponseLoggingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/vertexai/v1/endpoint.prot"
          + "o\022\030google.cloud.vertexai.v1\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032.google/cloud/vertexai/v1/encryp"
          + "tion_spec.proto\032*google/cloud/vertexai/v"
          + "1/explanation.proto\032!google/cloud/vertex"
          + "ai/v1/io.proto\0320google/cloud/vertexai/v1"
          + "/machine_resources.proto\032\037google/protobu"
          + "f/timestamp.proto\"\277\010\n\010Endpoint\022\022\n\004name\030\001"
          + " \001(\tB\004\342A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022\023"
          + "\n\013description\030\003 \001(\t\022F\n\017deployed_models\030\004"
          + " \003(\0132\'.google.cloud.vertexai.v1.Deployed"
          + "ModelB\004\342A\001\003\022K\n\rtraffic_split\030\005 \003(\01324.goo"
          + "gle.cloud.vertexai.v1.Endpoint.TrafficSp"
          + "litEntry\022\014\n\004etag\030\006 \001(\t\022>\n\006labels\030\007 \003(\0132."
          + ".google.cloud.vertexai.v1.Endpoint.Label"
          + "sEntry\0225\n\013create_time\030\010 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\004\342A\001\003\0225\n\013update_time\030\t \001"
          + "(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022A\n\017"
          + "encryption_spec\030\n \001(\0132(.google.cloud.ver"
          + "texai.v1.EncryptionSpec\0228\n\007network\030\r \001(\t"
          + "B\'\342A\001\001\372A \n\036compute.googleapis.com/Networ"
          + "k\022*\n\036enable_private_service_connect\030\021 \001("
          + "\010B\002\030\001\022h\n\037model_deployment_monitoring_job"
          + "\030\016 \001(\tB?\342A\001\003\372A8\n6aiplatform.googleapis.c"
          + "om/ModelDeploymentMonitoringJob\022n\n\'predi"
          + "ct_request_response_logging_config\030\022 \001(\013"
          + "2=.google.cloud.vertexai.v1.PredictReque"
          + "stResponseLoggingConfig\0323\n\021TrafficSplitE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\032-\n\013"
          + "LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:"
          + "\0028\001:\265\001\352A\261\001\n\"aiplatform.googleapis.com/En"
          + "dpoint\022<projects/{project}/locations/{lo"
          + "cation}/endpoints/{endpoint}\022Mprojects/{"
          + "project}/locations/{location}/publishers"
          + "/{publisher}/models/{model}\"\346\004\n\rDeployed"
          + "Model\022K\n\023dedicated_resources\030\007 \001(\0132,.goo"
          + "gle.cloud.vertexai.v1.DedicatedResources"
          + "H\000\022K\n\023automatic_resources\030\010 \001(\0132,.google"
          + ".cloud.vertexai.v1.AutomaticResourcesH\000\022"
          + "\020\n\002id\030\001 \001(\tB\004\342A\001\005\0227\n\005model\030\002 \001(\tB(\342A\001\002\372A"
          + "!\n\037aiplatform.googleapis.com/Model\022\036\n\020mo"
          + "del_version_id\030\022 \001(\tB\004\342A\001\003\022\024\n\014display_na"
          + "me\030\003 \001(\t\0225\n\013create_time\030\006 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\004\342A\001\003\022C\n\020explanation_s"
          + "pec\030\t \001(\0132).google.cloud.vertexai.v1.Exp"
          + "lanationSpec\022\027\n\017service_account\030\013 \001(\t\022!\n"
          + "\031disable_container_logging\030\017 \001(\010\022\035\n\025enab"
          + "le_access_logging\030\r \001(\010\022K\n\021private_endpo"
          + "ints\030\016 \001(\0132*.google.cloud.vertexai.v1.Pr"
          + "ivateEndpointsB\004\342A\001\003B\026\n\024prediction_resou"
          + "rces\"\223\001\n\020PrivateEndpoints\022\036\n\020predict_htt"
          + "p_uri\030\001 \001(\tB\004\342A\001\003\022\036\n\020explain_http_uri\030\002 "
          + "\001(\tB\004\342A\001\003\022\035\n\017health_http_uri\030\003 \001(\tB\004\342A\001\003"
          + "\022 \n\022service_attachment\030\004 \001(\tB\004\342A\001\003\"\232\001\n#P"
          + "redictRequestResponseLoggingConfig\022\017\n\007en"
          + "abled\030\001 \001(\010\022\025\n\rsampling_rate\030\002 \001(\001\022K\n\024bi"
          + "gquery_destination\030\003 \001(\0132-.google.cloud."
          + "vertexai.v1.BigQueryDestinationB\275\001\n\034com."
          + "google.cloud.vertexai.v1B\rEndpointProtoP"
          + "\001Z8cloud.google.com/go/vertexai/apiv1/ve"
          + "rtexaipb;vertexaipb\252\002\030Google.Cloud.Verte"
          + "xAI.V1\312\002\030Google\\Cloud\\VertexAI\\V1\352\002\033Goog"
          + "le::Cloud::VertexAI::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.vertexai.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.vertexai.v1.ExplanationProto.getDescriptor(),
              com.google.cloud.vertexai.v1.IoProto.getDescriptor(),
              com.google.cloud.vertexai.v1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Endpoint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "DeployedModels",
              "TrafficSplit",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "EncryptionSpec",
              "Network",
              "EnablePrivateServiceConnect",
              "ModelDeploymentMonitoringJob",
              "PredictRequestResponseLoggingConfig",
            });
    internal_static_google_cloud_vertexai_v1_Endpoint_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_vertexai_v1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_vertexai_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Endpoint_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_vertexai_v1_Endpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_vertexai_v1_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_vertexai_v1_Endpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Endpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_vertexai_v1_DeployedModel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vertexai_v1_DeployedModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_DeployedModel_descriptor,
            new java.lang.String[] {
              "DedicatedResources",
              "AutomaticResources",
              "Id",
              "Model",
              "ModelVersionId",
              "DisplayName",
              "CreateTime",
              "ExplanationSpec",
              "ServiceAccount",
              "DisableContainerLogging",
              "EnableAccessLogging",
              "PrivateEndpoints",
              "PredictionResources",
            });
    internal_static_google_cloud_vertexai_v1_PrivateEndpoints_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vertexai_v1_PrivateEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_PrivateEndpoints_descriptor,
            new java.lang.String[] {
              "PredictHttpUri", "ExplainHttpUri", "HealthHttpUri", "ServiceAttachment",
            });
    internal_static_google_cloud_vertexai_v1_PredictRequestResponseLoggingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vertexai_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_PredictRequestResponseLoggingConfig_descriptor,
            new java.lang.String[] {
              "Enabled", "SamplingRate", "BigqueryDestination",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.vertexai.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.vertexai.v1.ExplanationProto.getDescriptor();
    com.google.cloud.vertexai.v1.IoProto.getDescriptor();
    com.google.cloud.vertexai.v1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
