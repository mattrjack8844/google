// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/endpoint.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class EndpointProto {
  private EndpointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1beta1/endpoi" +
      "nt.proto\022\037google.cloud.aiplatform.v1beta" +
      "1\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\0325google/cloud/aipl" +
      "atform/v1beta1/encryption_spec.proto\0321go" +
      "ogle/cloud/aiplatform/v1beta1/explanatio" +
      "n.proto\032(google/cloud/aiplatform/v1beta1" +
      "/io.proto\0327google/cloud/aiplatform/v1bet" +
      "a1/machine_resources.proto\032\037google/proto" +
      "buf/timestamp.proto\"\342\010\n\010Endpoint\022\022\n\004name" +
      "\030\001 \001(\tB\004\342A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002" +
      "\022\023\n\013description\030\003 \001(\t\022M\n\017deployed_models" +
      "\030\004 \003(\0132..google.cloud.aiplatform.v1beta1" +
      ".DeployedModelB\004\342A\001\003\022R\n\rtraffic_split\030\005 " +
      "\003(\0132;.google.cloud.aiplatform.v1beta1.En" +
      "dpoint.TrafficSplitEntry\022\014\n\004etag\030\006 \001(\t\022E" +
      "\n\006labels\030\007 \003(\01325.google.cloud.aiplatform" +
      ".v1beta1.Endpoint.LabelsEntry\0225\n\013create_" +
      "time\030\010 \001(\0132\032.google.protobuf.TimestampB\004" +
      "\342A\001\003\0225\n\013update_time\030\t \001(\0132\032.google.proto" +
      "buf.TimestampB\004\342A\001\003\022H\n\017encryption_spec\030\n" +
      " \001(\0132/.google.cloud.aiplatform.v1beta1.E" +
      "ncryptionSpec\0228\n\007network\030\r \001(\tB\'\342A\001\001\372A \n" +
      "\036compute.googleapis.com/Network\022*\n\036enabl" +
      "e_private_service_connect\030\021 \001(\010B\002\030\001\022h\n\037m" +
      "odel_deployment_monitoring_job\030\016 \001(\tB?\342A" +
      "\001\003\372A8\n6aiplatform.googleapis.com/ModelDe" +
      "ploymentMonitoringJob\022u\n\'predict_request" +
      "_response_logging_config\030\022 \001(\0132D.google." +
      "cloud.aiplatform.v1beta1.PredictRequestR" +
      "esponseLoggingConfig\0323\n\021TrafficSplitEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\032-\n\013Lab" +
      "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      ":\265\001\352A\261\001\n\"aiplatform.googleapis.com/Endpo" +
      "int\022<projects/{project}/locations/{locat" +
      "ion}/endpoints/{endpoint}\022Mprojects/{pro" +
      "ject}/locations/{location}/publishers/{p" +
      "ublisher}/models/{model}\"\362\005\n\rDeployedMod" +
      "el\022R\n\023dedicated_resources\030\007 \001(\01323.google" +
      ".cloud.aiplatform.v1beta1.DedicatedResou" +
      "rcesH\000\022R\n\023automatic_resources\030\010 \001(\01323.go" +
      "ogle.cloud.aiplatform.v1beta1.AutomaticR" +
      "esourcesH\000\022Q\n\020shared_resources\030\021 \001(\tB5\372A" +
      "2\n0aiplatform.googleapis.com/DeploymentR" +
      "esourcePoolH\000\022\020\n\002id\030\001 \001(\tB\004\342A\001\005\0227\n\005model" +
      "\030\002 \001(\tB(\342A\001\002\372A!\n\037aiplatform.googleapis.c" +
      "om/Model\022\036\n\020model_version_id\030\022 \001(\tB\004\342A\001\003" +
      "\022\024\n\014display_name\030\003 \001(\t\0225\n\013create_time\030\006 " +
      "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022J\n" +
      "\020explanation_spec\030\t \001(\01320.google.cloud.a" +
      "iplatform.v1beta1.ExplanationSpec\022\034\n\024dis" +
      "able_explanations\030\023 \001(\010\022\027\n\017service_accou" +
      "nt\030\013 \001(\t\022 \n\030enable_container_logging\030\014 \001" +
      "(\010\022\035\n\025enable_access_logging\030\r \001(\010\022R\n\021pri" +
      "vate_endpoints\030\016 \001(\01321.google.cloud.aipl" +
      "atform.v1beta1.PrivateEndpointsB\004\342A\001\003B\026\n" +
      "\024prediction_resources\"\223\001\n\020PrivateEndpoin" +
      "ts\022\036\n\020predict_http_uri\030\001 \001(\tB\004\342A\001\003\022\036\n\020ex" +
      "plain_http_uri\030\002 \001(\tB\004\342A\001\003\022\035\n\017health_htt" +
      "p_uri\030\003 \001(\tB\004\342A\001\003\022 \n\022service_attachment\030" +
      "\004 \001(\tB\004\342A\001\003\"\241\001\n#PredictRequestResponseLo" +
      "ggingConfig\022\017\n\007enabled\030\001 \001(\010\022\025\n\rsampling" +
      "_rate\030\002 \001(\001\022R\n\024bigquery_destination\030\003 \001(" +
      "\01324.google.cloud.aiplatform.v1beta1.BigQ" +
      "ueryDestinationB\344\001\n#com.google.cloud.aip" +
      "latform.v1beta1B\rEndpointProtoP\001ZCcloud." +
      "google.com/go/aiplatform/apiv1beta1/aipl" +
      "atformpb;aiplatformpb\252\002\037Google.Cloud.AIP" +
      "latform.V1Beta1\312\002\037Google\\Cloud\\AIPlatfor" +
      "m\\V1beta1\352\002\"Google::Cloud::AIPlatform::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "DeployedModels", "TrafficSplit", "Etag", "Labels", "CreateTime", "UpdateTime", "EncryptionSpec", "Network", "EnablePrivateServiceConnect", "ModelDeploymentMonitoringJob", "PredictRequestResponseLoggingConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor,
        new java.lang.String[] { "DedicatedResources", "AutomaticResources", "SharedResources", "Id", "Model", "ModelVersionId", "DisplayName", "CreateTime", "ExplanationSpec", "DisableExplanations", "ServiceAccount", "EnableContainerLogging", "EnableAccessLogging", "PrivateEndpoints", "PredictionResources", });
    internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor,
        new java.lang.String[] { "PredictHttpUri", "ExplainHttpUri", "HealthHttpUri", "ServiceAttachment", });
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_descriptor,
        new java.lang.String[] { "Enabled", "SamplingRate", "BigqueryDestination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
