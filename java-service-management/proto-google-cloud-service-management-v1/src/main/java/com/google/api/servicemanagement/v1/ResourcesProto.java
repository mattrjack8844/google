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
// source: google/api/servicemanagement/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.api.servicemanagement.v1;

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_ManagedService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_ManagedService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_OperationMetadata_Step_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_OperationMetadata_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_Diagnostic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_Diagnostic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_ConfigSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_ConfigSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_ConfigFile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_ConfigFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_ConfigRef_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_ConfigRef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_ChangeReport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_ChangeReport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_Rollout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_Rollout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_PercentagesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_PercentagesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicemanagement_v1_Rollout_DeleteServiceStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicemanagement_v1_Rollout_DeleteServiceStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/api/servicemanagement/v1/resour"
          + "ces.proto\022\037google.api.servicemanagement."
          + "v1\032\036google/api/config_change.proto\032\037goog"
          + "le/api/field_behavior.proto\032\037google/prot"
          + "obuf/timestamp.proto\"C\n\016ManagedService\022\024"
          + "\n\014service_name\030\002 \001(\t\022\033\n\023producer_project"
          + "_id\030\003 \001(\t\"\221\003\n\021OperationMetadata\022\026\n\016resou"
          + "rce_names\030\001 \003(\t\022F\n\005steps\030\002 \003(\01327.google."
          + "api.servicemanagement.v1.OperationMetada"
          + "ta.Step\022\033\n\023progress_percentage\030\003 \001(\005\022.\n\n"
          + "start_time\030\004 \001(\0132\032.google.protobuf.Times"
          + "tamp\032f\n\004Step\022\023\n\013description\030\002 \001(\t\022I\n\006sta"
          + "tus\030\004 \001(\01629.google.api.servicemanagement"
          + ".v1.OperationMetadata.Status\"g\n\006Status\022\026"
          + "\n\022STATUS_UNSPECIFIED\020\000\022\010\n\004DONE\020\001\022\017\n\013NOT_"
          + "STARTED\020\002\022\017\n\013IN_PROGRESS\020\003\022\n\n\006FAILED\020\004\022\r"
          + "\n\tCANCELLED\020\005\"\217\001\n\nDiagnostic\022\020\n\010location"
          + "\030\001 \001(\t\022>\n\004kind\030\002 \001(\01620.google.api.servic"
          + "emanagement.v1.Diagnostic.Kind\022\017\n\007messag"
          + "e\030\003 \001(\t\"\036\n\004Kind\022\013\n\007WARNING\020\000\022\t\n\005ERROR\020\001\""
          + "V\n\014ConfigSource\022\n\n\002id\030\005 \001(\t\022:\n\005files\030\002 \003"
          + "(\0132+.google.api.servicemanagement.v1.Con"
          + "figFile\"\225\002\n\nConfigFile\022\021\n\tfile_path\030\001 \001("
          + "\t\022\025\n\rfile_contents\030\003 \001(\014\022G\n\tfile_type\030\004 "
          + "\001(\01624.google.api.servicemanagement.v1.Co"
          + "nfigFile.FileType\"\223\001\n\010FileType\022\031\n\025FILE_T"
          + "YPE_UNSPECIFIED\020\000\022\027\n\023SERVICE_CONFIG_YAML"
          + "\020\001\022\021\n\rOPEN_API_JSON\020\002\022\021\n\rOPEN_API_YAML\020\003"
          + "\022\035\n\031FILE_DESCRIPTOR_SET_PROTO\020\004\022\016\n\nPROTO"
          + "_FILE\020\006\"\031\n\tConfigRef\022\014\n\004name\030\001 \001(\t\"@\n\014Ch"
          + "angeReport\0220\n\016config_changes\030\001 \003(\0132\030.goo"
          + "gle.api.ConfigChange\"\372\005\n\007Rollout\022\030\n\nroll"
          + "out_id\030\001 \001(\tB\004\342A\001\001\022/\n\013create_time\030\002 \001(\0132"
          + "\032.google.protobuf.Timestamp\022\022\n\ncreated_b"
          + "y\030\003 \001(\t\022F\n\006status\030\004 \001(\01626.google.api.ser"
          + "vicemanagement.v1.Rollout.RolloutStatus\022"
          + "c\n\030traffic_percent_strategy\030\005 \001(\0132?.goog"
          + "le.api.servicemanagement.v1.Rollout.Traf"
          + "ficPercentStrategyH\000\022b\n\027delete_service_s"
          + "trategy\030\310\001 \001(\0132>.google.api.servicemanag"
          + "ement.v1.Rollout.DeleteServiceStrategyH\000"
          + "\022\024\n\014service_name\030\010 \001(\t\032\263\001\n\026TrafficPercen"
          + "tStrategy\022e\n\013percentages\030\001 \003(\0132P.google."
          + "api.servicemanagement.v1.Rollout.Traffic"
          + "PercentStrategy.PercentagesEntry\0322\n\020Perc"
          + "entagesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\001"
          + ":\0028\001\032\027\n\025DeleteServiceStrategy\"\215\001\n\rRollou"
          + "tStatus\022\036\n\032ROLLOUT_STATUS_UNSPECIFIED\020\000\022"
          + "\017\n\013IN_PROGRESS\020\001\022\013\n\007SUCCESS\020\002\022\r\n\tCANCELL"
          + "ED\020\003\022\n\n\006FAILED\020\004\022\013\n\007PENDING\020\005\022\026\n\022FAILED_"
          + "ROLLED_BACK\020\006B\n\n\010strategyB\202\002\n#com.google"
          + ".api.servicemanagement.v1B\016ResourcesProt"
          + "oP\001ZScloud.google.com/go/servicemanageme"
          + "nt/apiv1/servicemanagementpb;servicemana"
          + "gementpb\242\002\004GASM\252\002!Google.Cloud.ServiceMa"
          + "nagement.V1\312\002!Google\\Cloud\\ServiceManage"
          + "ment\\V1\352\002$Google::Cloud::ServiceManageme"
          + "nt::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ConfigChangeProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_api_servicemanagement_v1_ManagedService_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicemanagement_v1_ManagedService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_ManagedService_descriptor,
            new java.lang.String[] {
              "ServiceName", "ProducerProjectId",
            });
    internal_static_google_api_servicemanagement_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_servicemanagement_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "ResourceNames", "Steps", "ProgressPercentage", "StartTime",
            });
    internal_static_google_api_servicemanagement_v1_OperationMetadata_Step_descriptor =
        internal_static_google_api_servicemanagement_v1_OperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_api_servicemanagement_v1_OperationMetadata_Step_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_OperationMetadata_Step_descriptor,
            new java.lang.String[] {
              "Description", "Status",
            });
    internal_static_google_api_servicemanagement_v1_Diagnostic_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_servicemanagement_v1_Diagnostic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_Diagnostic_descriptor,
            new java.lang.String[] {
              "Location", "Kind", "Message",
            });
    internal_static_google_api_servicemanagement_v1_ConfigSource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_servicemanagement_v1_ConfigSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_ConfigSource_descriptor,
            new java.lang.String[] {
              "Id", "Files",
            });
    internal_static_google_api_servicemanagement_v1_ConfigFile_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_servicemanagement_v1_ConfigFile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_ConfigFile_descriptor,
            new java.lang.String[] {
              "FilePath", "FileContents", "FileType",
            });
    internal_static_google_api_servicemanagement_v1_ConfigRef_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_api_servicemanagement_v1_ConfigRef_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_ConfigRef_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_api_servicemanagement_v1_ChangeReport_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_api_servicemanagement_v1_ChangeReport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_ChangeReport_descriptor,
            new java.lang.String[] {
              "ConfigChanges",
            });
    internal_static_google_api_servicemanagement_v1_Rollout_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_api_servicemanagement_v1_Rollout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_Rollout_descriptor,
            new java.lang.String[] {
              "RolloutId",
              "CreateTime",
              "CreatedBy",
              "Status",
              "TrafficPercentStrategy",
              "DeleteServiceStrategy",
              "ServiceName",
              "Strategy",
            });
    internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_descriptor =
        internal_static_google_api_servicemanagement_v1_Rollout_descriptor.getNestedTypes().get(0);
    internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_descriptor,
            new java.lang.String[] {
              "Percentages",
            });
    internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_PercentagesEntry_descriptor =
        internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_PercentagesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_Rollout_TrafficPercentStrategy_PercentagesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_servicemanagement_v1_Rollout_DeleteServiceStrategy_descriptor =
        internal_static_google_api_servicemanagement_v1_Rollout_descriptor.getNestedTypes().get(1);
    internal_static_google_api_servicemanagement_v1_Rollout_DeleteServiceStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicemanagement_v1_Rollout_DeleteServiceStrategy_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ConfigChangeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
