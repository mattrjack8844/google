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
// source: google/cloud/discoveryengine/v1/import_config.proto

package com.google.cloud.discoveryengine.v1;

public final class ImportConfigProto {
  private ImportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportDocumentsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ImportDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ImportDocumentsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/discoveryengine/v1/import"
          + "_config.proto\022\037google.cloud.discoveryeng"
          + "ine.v1\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032.google/cloud"
          + "/discoveryengine/v1/document.proto\0320goog"
          + "le/cloud/discoveryengine/v1/user_event.p"
          + "roto\032\037google/protobuf/timestamp.proto\032\027g"
          + "oogle/rpc/status.proto\032\026google/type/date"
          + ".proto\":\n\tGcsSource\022\030\n\ninput_uris\030\001 \003(\tB"
          + "\004\342A\001\002\022\023\n\013data_schema\030\002 \001(\t\"\276\001\n\016BigQueryS"
          + "ource\022+\n\016partition_date\030\005 \001(\0132\021.google.t"
          + "ype.DateH\000\022\022\n\nproject_id\030\001 \001(\t\022\030\n\ndatase"
          + "t_id\030\002 \001(\tB\004\342A\001\002\022\026\n\010table_id\030\003 \001(\tB\004\342A\001\002"
          + "\022\027\n\017gcs_staging_dir\030\004 \001(\t\022\023\n\013data_schema"
          + "\030\006 \001(\tB\013\n\tpartition\"8\n\021ImportErrorConfig"
          + "\022\024\n\ngcs_prefix\030\001 \001(\tH\000B\r\n\013destination\"\365\003"
          + "\n\027ImportUserEventsRequest\022^\n\rinline_sour"
          + "ce\030\002 \001(\0132E.google.cloud.discoveryengine."
          + "v1.ImportUserEventsRequest.InlineSourceH"
          + "\000\022@\n\ngcs_source\030\003 \001(\0132*.google.cloud.dis"
          + "coveryengine.v1.GcsSourceH\000\022J\n\017bigquery_"
          + "source\030\004 \001(\0132/.google.cloud.discoveryeng"
          + "ine.v1.BigQuerySourceH\000\022A\n\006parent\030\001 \001(\tB"
          + "1\342A\001\002\372A*\n(discoveryengine.googleapis.com"
          + "/DataStore\022H\n\014error_config\030\005 \001(\01322.googl"
          + "e.cloud.discoveryengine.v1.ImportErrorCo"
          + "nfig\032U\n\014InlineSource\022E\n\013user_events\030\001 \003("
          + "\0132*.google.cloud.discoveryengine.v1.User"
          + "EventB\004\342A\001\002B\010\n\006source\"\313\001\n\030ImportUserEven"
          + "tsResponse\022)\n\rerror_samples\030\001 \003(\0132\022.goog"
          + "le.rpc.Status\022H\n\014error_config\030\002 \001(\01322.go"
          + "ogle.cloud.discoveryengine.v1.ImportErro"
          + "rConfig\022\033\n\023joined_events_count\030\003 \001(\003\022\035\n\025"
          + "unjoined_events_count\030\004 \001(\003\"\252\001\n\030ImportUs"
          + "erEventsMetadata\022/\n\013create_time\030\001 \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013update_time"
          + "\030\002 \001(\0132\032.google.protobuf.Timestamp\022\025\n\rsu"
          + "ccess_count\030\003 \001(\003\022\025\n\rfailure_count\030\004 \001(\003"
          + "\"\251\001\n\027ImportDocumentsMetadata\022/\n\013create_t"
          + "ime\030\001 \001(\0132\032.google.protobuf.Timestamp\022/\n"
          + "\013update_time\030\002 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rfailure"
          + "_count\030\004 \001(\003\"\331\005\n\026ImportDocumentsRequest\022"
          + "]\n\rinline_source\030\002 \001(\0132D.google.cloud.di"
          + "scoveryengine.v1.ImportDocumentsRequest."
          + "InlineSourceH\000\022@\n\ngcs_source\030\003 \001(\0132*.goo"
          + "gle.cloud.discoveryengine.v1.GcsSourceH\000"
          + "\022J\n\017bigquery_source\030\004 \001(\0132/.google.cloud"
          + ".discoveryengine.v1.BigQuerySourceH\000\022>\n\006"
          + "parent\030\001 \001(\tB.\342A\001\002\372A\'\n%discoveryengine.g"
          + "oogleapis.com/Branch\022H\n\014error_config\030\005 \001"
          + "(\01322.google.cloud.discoveryengine.v1.Imp"
          + "ortErrorConfig\022g\n\023reconciliation_mode\030\006 "
          + "\001(\0162J.google.cloud.discoveryengine.v1.Im"
          + "portDocumentsRequest.ReconciliationMode\022"
          + "\031\n\021auto_generate_ids\030\010 \001(\010\022\020\n\010id_field\030\t"
          + " \001(\t\032R\n\014InlineSource\022B\n\tdocuments\030\001 \003(\0132"
          + ").google.cloud.discoveryengine.v1.Docume"
          + "ntB\004\342A\001\002\"T\n\022ReconciliationMode\022#\n\037RECONC"
          + "ILIATION_MODE_UNSPECIFIED\020\000\022\017\n\013INCREMENT"
          + "AL\020\001\022\010\n\004FULL\020\002B\010\n\006source\"\216\001\n\027ImportDocum"
          + "entsResponse\022)\n\rerror_samples\030\001 \003(\0132\022.go"
          + "ogle.rpc.Status\022H\n\014error_config\030\002 \001(\01322."
          + "google.cloud.discoveryengine.v1.ImportEr"
          + "rorConfigB\204\002\n#com.google.cloud.discovery"
          + "engine.v1B\021ImportConfigProtoP\001ZMcloud.go"
          + "ogle.com/go/discoveryengine/apiv1/discov"
          + "eryenginepb;discoveryenginepb\242\002\017DISCOVER"
          + "YENGINE\252\002\037Google.Cloud.DiscoveryEngine.V"
          + "1\312\002\037Google\\Cloud\\DiscoveryEngine\\V1\352\002\"Go"
          + "ogle::Cloud::DiscoveryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.DocumentProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.UserEventProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUris", "DataSchema",
            });
    internal_static_google_cloud_discoveryengine_v1_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_BigQuerySource_descriptor,
            new java.lang.String[] {
              "PartitionDate",
              "ProjectId",
              "DatasetId",
              "TableId",
              "GcsStagingDir",
              "DataSchema",
              "Partition",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_descriptor,
            new java.lang.String[] {
              "InlineSource", "GcsSource", "BigquerySource", "Parent", "ErrorConfig", "Source",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportUserEventsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "UserEvents",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_ImportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig", "JoinedEventsCount", "UnjoinedEventsCount",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1_ImportUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportUserEventsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportDocumentsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1_ImportDocumentsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportDocumentsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_descriptor,
            new java.lang.String[] {
              "InlineSource",
              "GcsSource",
              "BigquerySource",
              "Parent",
              "ErrorConfig",
              "ReconciliationMode",
              "AutoGenerateIds",
              "IdField",
              "Source",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportDocumentsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "Documents",
            });
    internal_static_google_cloud_discoveryengine_v1_ImportDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1_ImportDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ImportDocumentsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.UserEventProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
