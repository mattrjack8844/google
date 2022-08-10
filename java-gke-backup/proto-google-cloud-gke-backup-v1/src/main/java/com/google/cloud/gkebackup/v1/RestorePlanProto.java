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
// source: google/cloud/gkebackup/v1/restore_plan.proto

package com.google.cloud.gkebackup.v1;

public final class RestorePlanProto {
  private RestorePlanProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RestorePlan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RestorePlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/gkebackup/v1/restore_plan"
          + ".proto\022\031google.cloud.gkebackup.v1\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\032\'google/cloud/gkebackup/v1"
          + "/restore.proto\032\037google/protobuf/timestam"
          + "p.proto\"\363\004\n\013RestorePlan\022\021\n\004name\030\001 \001(\tB\003\340"
          + "A\003\022\020\n\003uid\030\002 \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up"
          + "date_time\030\004 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022\023\n\013description\030\005 \001(\t\022C\n\013backup_"
          + "plan\030\006 \001(\tB.\340A\005\340A\002\372A%\n#gkebackup.googlea"
          + "pis.com/BackupPlan\022<\n\007cluster\030\007 \001(\tB+\340A\005"
          + "\340A\002\372A\"\n container.googleapis.com/Cluster"
          + "\022E\n\016restore_config\030\010 \001(\0132(.google.cloud."
          + "gkebackup.v1.RestoreConfigB\003\340A\002\022B\n\006label"
          + "s\030\t \003(\01322.google.cloud.gkebackup.v1.Rest"
          + "orePlan.LabelsEntry\022\021\n\004etag\030\n \001(\tB\003\340A\003\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001:n\352Ak\n$gkebackup.googleapis.com/Res"
          + "torePlan\022Cprojects/{project}/locations/{"
          + "location}/restorePlans/{restore_plan}B\316\001"
          + "\n\035com.google.cloud.gkebackup.v1B\020Restore"
          + "PlanProtoP\001ZBgoogle.golang.org/genproto/"
          + "googleapis/cloud/gkebackup/v1;gkebackup\252"
          + "\002\031Google.Cloud.GkeBackup.V1\312\002\031Google\\Clo"
          + "ud\\GkeBackup\\V1\352\002\034Google::Cloud::GkeBack"
          + "up::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkebackup.v1.RestoreProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkebackup_v1_RestorePlan_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_RestorePlan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RestorePlan_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Description",
              "BackupPlan",
              "Cluster",
              "RestoreConfig",
              "Labels",
              "Etag",
            });
    internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor =
        internal_static_google_cloud_gkebackup_v1_RestorePlan_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.cloud.gkebackup.v1.RestoreProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
