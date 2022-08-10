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
// source: google/cloud/gkebackup/v1/restore.proto

package com.google.cloud.gkebackup.v1;

public final class RestoreProto {
  private RestoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_Restore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Restore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_Restore_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Restore_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RestoreConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RestoreConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RestoreConfig_GroupKind_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RestoreConfig_GroupKind_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/gkebackup/v1/restore.prot"
          + "o\022\031google.cloud.gkebackup.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032&google/cloud/gkebackup/v1/comm"
          + "on.proto\032\037google/protobuf/timestamp.prot"
          + "o\"\377\007\n\007Restore\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\020\n\003uid\030"
          + "\002 \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032.google"
          + ".protobuf.TimestampB\003\340A\003\0224\n\013update_time\030"
          + "\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023"
          + "\n\013description\030\005 \001(\t\022:\n\006backup\030\006 \001(\tB*\340A\005"
          + "\340A\002\372A!\n\037gkebackup.googleapis.com/Backup\022"
          + "9\n\007cluster\030\007 \001(\tB(\340A\003\372A\"\n container.goog"
          + "leapis.com/Cluster\022E\n\016restore_config\030\010 \001"
          + "(\0132(.google.cloud.gkebackup.v1.RestoreCo"
          + "nfigB\003\340A\003\022>\n\006labels\030\t \003(\0132..google.cloud"
          + ".gkebackup.v1.Restore.LabelsEntry\022<\n\005sta"
          + "te\030\n \001(\0162(.google.cloud.gkebackup.v1.Res"
          + "tore.StateB\003\340A\003\022\031\n\014state_reason\030\013 \001(\tB\003\340"
          + "A\003\0226\n\rcomplete_time\030\014 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\022%\n\030resources_restored"
          + "_count\030\r \001(\005B\003\340A\003\022%\n\030resources_excluded_"
          + "count\030\016 \001(\005B\003\340A\003\022#\n\026resources_failed_cou"
          + "nt\030\017 \001(\005B\003\340A\003\022#\n\026volumes_restored_count\030"
          + "\020 \001(\005B\003\340A\003\022\021\n\004etag\030\021 \001(\tB\003\340A\003\032-\n\013LabelsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"f\n\005"
          + "State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING"
          + "\020\001\022\017\n\013IN_PROGRESS\020\002\022\r\n\tSUCCEEDED\020\003\022\n\n\006FA"
          + "ILED\020\004\022\014\n\010DELETING\020\005:}\352Az\n gkebackup.goo"
          + "gleapis.com/Restore\022Vprojects/{project}/"
          + "locations/{location}/restorePlans/{resto"
          + "re_plan}/restores/{restore}\"\250\014\n\rRestoreC"
          + "onfig\022d\n\032volume_data_restore_policy\030\001 \001("
          + "\0162@.google.cloud.gkebackup.v1.RestoreCon"
          + "fig.VolumeDataRestorePolicy\022p\n cluster_r"
          + "esource_conflict_policy\030\002 \001(\0162F.google.c"
          + "loud.gkebackup.v1.RestoreConfig.ClusterR"
          + "esourceConflictPolicy\022p\n namespaced_reso"
          + "urce_restore_mode\030\003 \001(\0162F.google.cloud.g"
          + "kebackup.v1.RestoreConfig.NamespacedReso"
          + "urceRestoreMode\022l\n\036cluster_resource_rest"
          + "ore_scope\030\004 \001(\0132D.google.cloud.gkebackup"
          + ".v1.RestoreConfig.ClusterResourceRestore"
          + "Scope\022\030\n\016all_namespaces\030\005 \001(\010H\000\022D\n\023selec"
          + "ted_namespaces\030\006 \001(\0132%.google.cloud.gkeb"
          + "ackup.v1.NamespacesH\000\022K\n\025selected_applic"
          + "ations\030\007 \001(\0132*.google.cloud.gkebackup.v1"
          + ".NamespacedNamesH\000\022U\n\022substitution_rules"
          + "\030\010 \003(\01329.google.cloud.gkebackup.v1.Resto"
          + "reConfig.SubstitutionRule\032:\n\tGroupKind\022\026"
          + "\n\016resource_group\030\001 \001(\t\022\025\n\rresource_kind\030"
          + "\002 \001(\t\032o\n\033ClusterResourceRestoreScope\022P\n\024"
          + "selected_group_kinds\030\001 \003(\01322.google.clou"
          + "d.gkebackup.v1.RestoreConfig.GroupKind\032\317"
          + "\001\n\020SubstitutionRule\022\031\n\021target_namespaces"
          + "\030\001 \003(\t\022N\n\022target_group_kinds\030\002 \003(\01322.goo"
          + "gle.cloud.gkebackup.v1.RestoreConfig.Gro"
          + "upKind\022\035\n\020target_json_path\030\003 \001(\tB\003\340A\002\022\036\n"
          + "\026original_value_pattern\030\004 \001(\t\022\021\n\tnew_val"
          + "ue\030\005 \001(\t\"\257\001\n\027VolumeDataRestorePolicy\022*\n&"
          + "VOLUME_DATA_RESTORE_POLICY_UNSPECIFIED\020\000"
          + "\022#\n\037RESTORE_VOLUME_DATA_FROM_BACKUP\020\001\022#\n"
          + "\037REUSE_VOLUME_HANDLE_FROM_BACKUP\020\002\022\036\n\032NO"
          + "_VOLUME_DATA_RESTORATION\020\003\"\203\001\n\035ClusterRe"
          + "sourceConflictPolicy\0220\n,CLUSTER_RESOURCE"
          + "_CONFLICT_POLICY_UNSPECIFIED\020\000\022\030\n\024USE_EX"
          + "ISTING_VERSION\020\001\022\026\n\022USE_BACKUP_VERSION\020\002"
          + "\"\177\n\035NamespacedResourceRestoreMode\0220\n,NAM"
          + "ESPACED_RESOURCE_RESTORE_MODE_UNSPECIFIE"
          + "D\020\000\022\026\n\022DELETE_AND_RESTORE\020\001\022\024\n\020FAIL_ON_C"
          + "ONFLICT\020\002B#\n!namespaced_resource_restore"
          + "_scopeB\312\001\n\035com.google.cloud.gkebackup.v1"
          + "B\014RestoreProtoP\001ZBgoogle.golang.org/genp"
          + "roto/googleapis/cloud/gkebackup/v1;gkeba"
          + "ckup\252\002\031Google.Cloud.GkeBackup.V1\312\002\031Googl"
          + "e\\Cloud\\GkeBackup\\V1\352\002\034Google::Cloud::Gk"
          + "eBackup::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkebackup.v1.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkebackup_v1_Restore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Restore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_Restore_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Description",
              "Backup",
              "Cluster",
              "RestoreConfig",
              "Labels",
              "State",
              "StateReason",
              "CompleteTime",
              "ResourcesRestoredCount",
              "ResourcesExcludedCount",
              "ResourcesFailedCount",
              "VolumesRestoredCount",
              "Etag",
            });
    internal_static_google_cloud_gkebackup_v1_Restore_LabelsEntry_descriptor =
        internal_static_google_cloud_gkebackup_v1_Restore_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Restore_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_Restore_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkebackup_v1_RestoreConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_RestoreConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RestoreConfig_descriptor,
            new java.lang.String[] {
              "VolumeDataRestorePolicy",
              "ClusterResourceConflictPolicy",
              "NamespacedResourceRestoreMode",
              "ClusterResourceRestoreScope",
              "AllNamespaces",
              "SelectedNamespaces",
              "SelectedApplications",
              "SubstitutionRules",
              "NamespacedResourceRestoreScope",
            });
    internal_static_google_cloud_gkebackup_v1_RestoreConfig_GroupKind_descriptor =
        internal_static_google_cloud_gkebackup_v1_RestoreConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_RestoreConfig_GroupKind_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RestoreConfig_GroupKind_descriptor,
            new java.lang.String[] {
              "ResourceGroup", "ResourceKind",
            });
    internal_static_google_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_descriptor =
        internal_static_google_cloud_gkebackup_v1_RestoreConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_descriptor,
            new java.lang.String[] {
              "SelectedGroupKinds",
            });
    internal_static_google_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_descriptor =
        internal_static_google_cloud_gkebackup_v1_RestoreConfig_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_descriptor,
            new java.lang.String[] {
              "TargetNamespaces",
              "TargetGroupKinds",
              "TargetJsonPath",
              "OriginalValuePattern",
              "NewValue",
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
    com.google.cloud.gkebackup.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
