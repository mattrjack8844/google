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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.netapp.v1;

public final class VolumeProto {
  private VolumeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ListVolumesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ListVolumesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_GetVolumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_GetVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_CreateVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_RevertVolumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_RevertVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_Volume_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_Volume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ExportPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_SnapshotPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_SnapshotPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_HourlySchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_DailySchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_DailySchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_WeeklySchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_WeeklySchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_MonthlySchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_MountOption_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_MountOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_RestoreParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_BackupConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_BackupConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_TieringPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_TieringPolicy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/netapp/v1/volume.proto\022\026g"
          + "oogle.cloud.netapp.v1\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032#google/cloud/netapp/v1/common.proto\032 "
          + "google/protobuf/field_mask.proto\032\037google"
          + "/protobuf/timestamp.proto\"\223\001\n\022ListVolume"
          + "sRequest\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\022\034netapp"
          + ".googleapis.com/Volume\022\021\n\tpage_size\030\002 \001("
          + "\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n"
          + "\010order_by\030\005 \001(\t\"t\n\023ListVolumesResponse\022/"
          + "\n\007volumes\030\001 \003(\0132\036.google.cloud.netapp.v1"
          + ".Volume\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unre"
          + "achable\030\003 \003(\t\"F\n\020GetVolumeRequest\0222\n\004nam"
          + "e\030\001 \001(\tB$\340A\002\372A\036\n\034netapp.googleapis.com/V"
          + "olume\"\230\001\n\023CreateVolumeRequest\0224\n\006parent\030"
          + "\001 \001(\tB$\340A\002\372A\036\022\034netapp.googleapis.com/Vol"
          + "ume\022\026\n\tvolume_id\030\002 \001(\tB\003\340A\002\0223\n\006volume\030\003 "
          + "\001(\0132\036.google.cloud.netapp.v1.VolumeB\003\340A\002"
          + "\"\200\001\n\023UpdateVolumeRequest\0224\n\013update_mask\030"
          + "\001 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\0223"
          + "\n\006volume\030\002 \001(\0132\036.google.cloud.netapp.v1."
          + "VolumeB\003\340A\002\"X\n\023DeleteVolumeRequest\0222\n\004na"
          + "me\030\001 \001(\tB$\340A\002\372A\036\n\034netapp.googleapis.com/"
          + "Volume\022\r\n\005force\030\002 \001(\010\"c\n\023RevertVolumeReq"
          + "uest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034netapp.googl"
          + "eapis.com/Volume\022\030\n\013snapshot_id\030\002 \001(\tB\003\340"
          + "A\002\"\360\017\n\006Volume\022\021\n\004name\030\001 \001(\tB\003\340A\010\0228\n\005stat"
          + "e\030\002 \001(\0162$.google.cloud.netapp.v1.Volume."
          + "StateB\003\340A\003\022\032\n\rstate_details\030\003 \001(\tB\003\340A\003\0224"
          + "\n\013create_time\030\004 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\022\027\n\nshare_name\030\005 \001(\tB\003\340A\002\022\026\n"
          + "\tpsa_range\030\006 \001(\tB\003\340A\003\022?\n\014storage_pool\030\007 "
          + "\001(\tB)\340A\002\372A#\n!netapp.googleapis.com/Stora"
          + "gePool\0227\n\007network\030\010 \001(\tB&\340A\003\372A \n\036compute"
          + ".googleapis.com/Network\022@\n\rservice_level"
          + "\030\t \001(\0162$.google.cloud.netapp.v1.ServiceL"
          + "evelB\003\340A\003\022\031\n\014capacity_gib\030\n \001(\003B\003\340A\002\022@\n\r"
          + "export_policy\030\013 \001(\0132$.google.cloud.netap"
          + "p.v1.ExportPolicyB\003\340A\001\0229\n\tprotocols\030\014 \003("
          + "\0162!.google.cloud.netapp.v1.ProtocolsB\003\340A"
          + "\002\022>\n\014smb_settings\030\r \003(\0162#.google.cloud.n"
          + "etapp.v1.SMBSettingsB\003\340A\001\022?\n\rmount_optio"
          + "ns\030\016 \003(\0132#.google.cloud.netapp.v1.MountO"
          + "ptionB\003\340A\003\022\035\n\020unix_permissions\030\017 \001(\tB\003\340A"
          + "\001\022?\n\006labels\030\020 \003(\0132*.google.cloud.netapp."
          + "v1.Volume.LabelsEntryB\003\340A\001\022\030\n\013descriptio"
          + "n\030\021 \001(\tB\003\340A\001\022D\n\017snapshot_policy\030\022 \001(\0132&."
          + "google.cloud.netapp.v1.SnapshotPolicyB\003\340"
          + "A\001\022\031\n\014snap_reserve\030\023 \001(\001B\003\340A\001\022\037\n\022snapsho"
          + "t_directory\030\024 \001(\010B\003\340A\001\022\025\n\010used_gib\030\025 \001(\003"
          + "B\003\340A\003\022B\n\016security_style\030\026 \001(\0162%.google.c"
          + "loud.netapp.v1.SecurityStyleB\003\340A\001\022\035\n\020ker"
          + "beros_enabled\030\027 \001(\010B\003\340A\001\022\031\n\014ldap_enabled"
          + "\030\030 \001(\010B\003\340A\003\022G\n\020active_directory\030\031 \001(\tB-\340"
          + "A\003\372A\'\n%netapp.googleapis.com/ActiveDirec"
          + "tory\022J\n\022restore_parameters\030\032 \001(\0132).googl"
          + "e.cloud.netapp.v1.RestoreParametersB\003\340A\001"
          + "\022;\n\nkms_config\030\033 \001(\tB\'\340A\003\372A!\n\037netapp.goo"
          + "gleapis.com/KmsConfig\022D\n\017encryption_type"
          + "\030\034 \001(\0162&.google.cloud.netapp.v1.Encrypti"
          + "onTypeB\003\340A\003\022\034\n\017has_replication\030\035 \001(\010B\003\340A"
          + "\003\022@\n\rbackup_config\030\036 \001(\0132$.google.cloud."
          + "netapp.v1.BackupConfigH\000\210\001\001\022I\n\022restricte"
          + "d_actions\030\037 \003(\0162(.google.cloud.netapp.v1"
          + ".RestrictedActionB\003\340A\001\022\033\n\016large_capacity"
          + "\030  \001(\010B\003\340A\001\022\037\n\022multiple_endpoints\030! \001(\010B"
          + "\003\340A\001\022B\n\016tiering_policy\030\" \001(\0132%.google.cl"
          + "oud.netapp.v1.TieringPolicyH\001\210\001\001\022\031\n\014repl"
          + "ica_zone\030$ \001(\tB\003\340A\003\022\021\n\004zone\030% \001(\tB\003\340A\003\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\"{\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\t\n"
          + "\005READY\020\001\022\014\n\010CREATING\020\002\022\014\n\010DELETING\020\003\022\014\n\010"
          + "UPDATING\020\004\022\r\n\tRESTORING\020\005\022\014\n\010DISABLED\020\006\022"
          + "\t\n\005ERROR\020\007:l\352Ai\n\034netapp.googleapis.com/V"
          + "olume\0228projects/{project}/locations/{loc"
          + "ation}/volumes/{volume}*\007volumes2\006volume"
          + "B\020\n\016_backup_configB\021\n\017_tiering_policy\"R\n"
          + "\014ExportPolicy\022B\n\005rules\030\001 \003(\0132..google.cl"
          + "oud.netapp.v1.SimpleExportPolicyRuleB\003\340A"
          + "\002\"\374\004\n\026SimpleExportPolicyRule\022\034\n\017allowed_"
          + "clients\030\001 \001(\tH\000\210\001\001\022\034\n\017has_root_access\030\002 "
          + "\001(\tH\001\210\001\001\022<\n\013access_type\030\003 \001(\0162\".google.c"
          + "loud.netapp.v1.AccessTypeH\002\210\001\001\022\022\n\005nfsv3\030"
          + "\004 \001(\010H\003\210\001\001\022\022\n\005nfsv4\030\005 \001(\010H\004\210\001\001\022!\n\024kerber"
          + "os_5_read_only\030\006 \001(\010H\005\210\001\001\022\"\n\025kerberos_5_"
          + "read_write\030\007 \001(\010H\006\210\001\001\022\"\n\025kerberos_5i_rea"
          + "d_only\030\010 \001(\010H\007\210\001\001\022#\n\026kerberos_5i_read_wr"
          + "ite\030\t \001(\010H\010\210\001\001\022\"\n\025kerberos_5p_read_only\030"
          + "\n \001(\010H\t\210\001\001\022#\n\026kerberos_5p_read_write\030\013 \001"
          + "(\010H\n\210\001\001B\022\n\020_allowed_clientsB\022\n\020_has_root"
          + "_accessB\016\n\014_access_typeB\010\n\006_nfsv3B\010\n\006_nf"
          + "sv4B\027\n\025_kerberos_5_read_onlyB\030\n\026_kerbero"
          + "s_5_read_writeB\030\n\026_kerberos_5i_read_only"
          + "B\031\n\027_kerberos_5i_read_writeB\030\n\026_kerberos"
          + "_5p_read_onlyB\031\n\027_kerberos_5p_read_write"
          + "\"\232\003\n\016SnapshotPolicy\022\024\n\007enabled\030\001 \001(\010H\000\210\001"
          + "\001\022D\n\017hourly_schedule\030\002 \001(\0132&.google.clou"
          + "d.netapp.v1.HourlyScheduleH\001\210\001\001\022B\n\016daily"
          + "_schedule\030\003 \001(\0132%.google.cloud.netapp.v1"
          + ".DailyScheduleH\002\210\001\001\022D\n\017weekly_schedule\030\004"
          + " \001(\0132&.google.cloud.netapp.v1.WeeklySche"
          + "duleH\003\210\001\001\022F\n\020monthly_schedule\030\005 \001(\0132\'.go"
          + "ogle.cloud.netapp.v1.MonthlyScheduleH\004\210\001"
          + "\001B\n\n\010_enabledB\022\n\020_hourly_scheduleB\021\n\017_da"
          + "ily_scheduleB\022\n\020_weekly_scheduleB\023\n\021_mon"
          + "thly_schedule\"f\n\016HourlySchedule\022\036\n\021snaps"
          + "hots_to_keep\030\001 \001(\001H\000\210\001\001\022\023\n\006minute\030\002 \001(\001H"
          + "\001\210\001\001B\024\n\022_snapshots_to_keepB\t\n\007_minute\"\201\001"
          + "\n\rDailySchedule\022\036\n\021snapshots_to_keep\030\001 \001"
          + "(\001H\000\210\001\001\022\023\n\006minute\030\002 \001(\001H\001\210\001\001\022\021\n\004hour\030\003 \001"
          + "(\001H\002\210\001\001B\024\n\022_snapshots_to_keepB\t\n\007_minute"
          + "B\007\n\005_hour\"\234\001\n\016WeeklySchedule\022\036\n\021snapshot"
          + "s_to_keep\030\001 \001(\001H\000\210\001\001\022\023\n\006minute\030\002 \001(\001H\001\210\001"
          + "\001\022\021\n\004hour\030\003 \001(\001H\002\210\001\001\022\020\n\003day\030\004 \001(\tH\003\210\001\001B\024"
          + "\n\022_snapshots_to_keepB\t\n\007_minuteB\007\n\005_hour"
          + "B\006\n\004_day\"\261\001\n\017MonthlySchedule\022\036\n\021snapshot"
          + "s_to_keep\030\001 \001(\001H\000\210\001\001\022\023\n\006minute\030\002 \001(\001H\001\210\001"
          + "\001\022\021\n\004hour\030\003 \001(\001H\002\210\001\001\022\032\n\rdays_of_month\030\004 "
          + "\001(\tH\003\210\001\001B\024\n\022_snapshots_to_keepB\t\n\007_minut"
          + "eB\007\n\005_hourB\020\n\016_days_of_month\"}\n\013MountOpt"
          + "ion\022\016\n\006export\030\001 \001(\t\022\023\n\013export_full\030\002 \001(\t"
          + "\0223\n\010protocol\030\003 \001(\0162!.google.cloud.netapp"
          + ".v1.Protocols\022\024\n\014instructions\030\004 \001(\t\"Q\n\021R"
          + "estoreParameters\022\031\n\017source_snapshot\030\001 \001("
          + "\tH\000\022\027\n\rsource_backup\030\002 \001(\tH\000B\010\n\006source\"\232"
          + "\002\n\014BackupConfig\022C\n\017backup_policies\030\001 \003(\t"
          + "B*\340A\001\372A$\n\"netapp.googleapis.com/BackupPo"
          + "licy\022?\n\014backup_vault\030\002 \001(\tB)\340A\001\372A#\n!neta"
          + "pp.googleapis.com/BackupVault\022*\n\030schedul"
          + "ed_backup_enabled\030\003 \001(\010B\003\340A\001H\000\210\001\001\022$\n\022bac"
          + "kup_chain_bytes\030\004 \001(\003B\003\340A\003H\001\210\001\001B\033\n\031_sche"
          + "duled_backup_enabledB\025\n\023_backup_chain_by"
          + "tes\"\371\001\n\rTieringPolicy\022O\n\013tier_action\030\001 \001"
          + "(\01620.google.cloud.netapp.v1.TieringPolic"
          + "y.TierActionB\003\340A\001H\000\210\001\001\022(\n\026cooling_thresh"
          + "old_days\030\002 \001(\005B\003\340A\001H\001\210\001\001\"B\n\nTierAction\022\033"
          + "\n\027TIER_ACTION_UNSPECIFIED\020\000\022\013\n\007ENABLED\020\001"
          + "\022\n\n\006PAUSED\020\002B\016\n\014_tier_actionB\031\n\027_cooling"
          + "_threshold_days*E\n\tProtocols\022\031\n\025PROTOCOL"
          + "S_UNSPECIFIED\020\000\022\t\n\005NFSV3\020\001\022\t\n\005NFSV4\020\002\022\007\n"
          + "\003SMB\020\003*W\n\nAccessType\022\033\n\027ACCESS_TYPE_UNSP"
          + "ECIFIED\020\000\022\r\n\tREAD_ONLY\020\001\022\016\n\nREAD_WRITE\020\002"
          + "\022\r\n\tREAD_NONE\020\003*\350\001\n\013SMBSettings\022\034\n\030SMB_S"
          + "ETTINGS_UNSPECIFIED\020\000\022\020\n\014ENCRYPT_DATA\020\001\022"
          + "\r\n\tBROWSABLE\020\002\022\021\n\rCHANGE_NOTIFY\020\003\022\021\n\rNON"
          + "_BROWSABLE\020\004\022\013\n\007OPLOCKS\020\005\022\021\n\rSHOW_SNAPSH"
          + "OT\020\006\022\032\n\026SHOW_PREVIOUS_VERSIONS\020\007\022\034\n\030ACCE"
          + "SS_BASED_ENUMERATION\020\010\022\032\n\026CONTINUOUSLY_A"
          + "VAILABLE\020\t*C\n\rSecurityStyle\022\036\n\032SECURITY_"
          + "STYLE_UNSPECIFIED\020\000\022\010\n\004NTFS\020\001\022\010\n\004UNIX\020\002*"
          + "A\n\020RestrictedAction\022!\n\035RESTRICTED_ACTION"
          + "_UNSPECIFIED\020\000\022\n\n\006DELETE\020\001B\255\001\n\032com.googl"
          + "e.cloud.netapp.v1B\013VolumeProtoP\001Z2cloud."
          + "google.com/go/netapp/apiv1/netapppb;neta"
          + "pppb\252\002\026Google.Cloud.NetApp.V1\312\002\026Google\\C"
          + "loud\\NetApp\\V1\352\002\031Google::Cloud::NetApp::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.netapp.v1.CommonProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_netapp_v1_ListVolumesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_netapp_v1_ListVolumesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ListVolumesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_netapp_v1_ListVolumesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_netapp_v1_ListVolumesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ListVolumesResponse_descriptor,
            new java.lang.String[] {
              "Volumes", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_netapp_v1_GetVolumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_netapp_v1_GetVolumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_GetVolumeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_netapp_v1_CreateVolumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "VolumeId", "Volume",
            });
    internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Volume",
            });
    internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_netapp_v1_RevertVolumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_netapp_v1_RevertVolumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_RevertVolumeRequest_descriptor,
            new java.lang.String[] {
              "Name", "SnapshotId",
            });
    internal_static_google_cloud_netapp_v1_Volume_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_netapp_v1_Volume_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_Volume_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "StateDetails",
              "CreateTime",
              "ShareName",
              "PsaRange",
              "StoragePool",
              "Network",
              "ServiceLevel",
              "CapacityGib",
              "ExportPolicy",
              "Protocols",
              "SmbSettings",
              "MountOptions",
              "UnixPermissions",
              "Labels",
              "Description",
              "SnapshotPolicy",
              "SnapReserve",
              "SnapshotDirectory",
              "UsedGib",
              "SecurityStyle",
              "KerberosEnabled",
              "LdapEnabled",
              "ActiveDirectory",
              "RestoreParameters",
              "KmsConfig",
              "EncryptionType",
              "HasReplication",
              "BackupConfig",
              "RestrictedActions",
              "LargeCapacity",
              "MultipleEndpoints",
              "TieringPolicy",
              "ReplicaZone",
              "Zone",
            });
    internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_descriptor =
        internal_static_google_cloud_netapp_v1_Volume_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_netapp_v1_ExportPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor,
            new java.lang.String[] {
              "Rules",
            });
    internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_descriptor,
            new java.lang.String[] {
              "AllowedClients",
              "HasRootAccess",
              "AccessType",
              "Nfsv3",
              "Nfsv4",
              "Kerberos5ReadOnly",
              "Kerberos5ReadWrite",
              "Kerberos5IReadOnly",
              "Kerberos5IReadWrite",
              "Kerberos5PReadOnly",
              "Kerberos5PReadWrite",
            });
    internal_static_google_cloud_netapp_v1_SnapshotPolicy_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_netapp_v1_SnapshotPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_SnapshotPolicy_descriptor,
            new java.lang.String[] {
              "Enabled", "HourlySchedule", "DailySchedule", "WeeklySchedule", "MonthlySchedule",
            });
    internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_netapp_v1_HourlySchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor,
            new java.lang.String[] {
              "SnapshotsToKeep", "Minute",
            });
    internal_static_google_cloud_netapp_v1_DailySchedule_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_netapp_v1_DailySchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_DailySchedule_descriptor,
            new java.lang.String[] {
              "SnapshotsToKeep", "Minute", "Hour",
            });
    internal_static_google_cloud_netapp_v1_WeeklySchedule_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_netapp_v1_WeeklySchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_WeeklySchedule_descriptor,
            new java.lang.String[] {
              "SnapshotsToKeep", "Minute", "Hour", "Day",
            });
    internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_netapp_v1_MonthlySchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor,
            new java.lang.String[] {
              "SnapshotsToKeep", "Minute", "Hour", "DaysOfMonth",
            });
    internal_static_google_cloud_netapp_v1_MountOption_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_netapp_v1_MountOption_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_MountOption_descriptor,
            new java.lang.String[] {
              "Export", "ExportFull", "Protocol", "Instructions",
            });
    internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_netapp_v1_RestoreParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor,
            new java.lang.String[] {
              "SourceSnapshot", "SourceBackup", "Source",
            });
    internal_static_google_cloud_netapp_v1_BackupConfig_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_netapp_v1_BackupConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_BackupConfig_descriptor,
            new java.lang.String[] {
              "BackupPolicies", "BackupVault", "ScheduledBackupEnabled", "BackupChainBytes",
            });
    internal_static_google_cloud_netapp_v1_TieringPolicy_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_netapp_v1_TieringPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_TieringPolicy_descriptor,
            new java.lang.String[] {
              "TierAction", "CoolingThresholdDays",
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
    com.google.cloud.netapp.v1.CommonProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
