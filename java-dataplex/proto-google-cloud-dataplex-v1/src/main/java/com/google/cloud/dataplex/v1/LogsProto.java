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
// source: google/cloud/dataplex/v1/logs.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public final class LogsProto {
  private LogsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_EntityDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_EntityDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_PartitionDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_PartitionDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ActionDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ActionDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_JobEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_JobEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_SessionEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_SessionEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_SessionEvent_QueryDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_SessionEvent_QueryDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_GovernanceEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GovernanceEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_GovernanceEvent_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GovernanceEvent_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionPassedEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionPassedEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionScoreEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionScoreEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_ColumnScoreEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_ColumnScoreEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileAppliedConfigs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileAppliedConfigs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityAppliedConfigs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityAppliedConfigs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_BigQueryExportResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_BigQueryExportResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityScanRuleResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityScanRuleResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/dataplex/v1/logs.proto\022\030g"
          + "oogle.cloud.dataplex.v1\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032\036google/protobuf/duration.proto\032\037goo"
          + "gle/protobuf/timestamp.proto\"\240\t\n\016Discove"
          + "ryEvent\022\017\n\007message\030\001 \001(\t\022\017\n\007lake_id\030\002 \001("
          + "\t\022\017\n\007zone_id\030\003 \001(\t\022\020\n\010asset_id\030\004 \001(\t\022\025\n\r"
          + "data_location\030\005 \001(\t\022@\n\004type\030\n \001(\01622.goog"
          + "le.cloud.dataplex.v1.DiscoveryEvent.Even"
          + "tType\022H\n\006config\030\024 \001(\01326.google.cloud.dat"
          + "aplex.v1.DiscoveryEvent.ConfigDetailsH\000\022"
          + "H\n\006entity\030\025 \001(\01326.google.cloud.dataplex."
          + "v1.DiscoveryEvent.EntityDetailsH\000\022N\n\tpar"
          + "tition\030\026 \001(\01329.google.cloud.dataplex.v1."
          + "DiscoveryEvent.PartitionDetailsH\000\022H\n\006act"
          + "ion\030\027 \001(\01326.google.cloud.dataplex.v1.Dis"
          + "coveryEvent.ActionDetailsH\000\032\236\001\n\rConfigDe"
          + "tails\022Z\n\nparameters\030\001 \003(\0132F.google.cloud"
          + ".dataplex.v1.DiscoveryEvent.ConfigDetail"
          + "s.ParametersEntry\0321\n\017ParametersEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032b\n\rEntityDe"
          + "tails\022\016\n\006entity\030\001 \001(\t\022A\n\004type\030\002 \001(\01623.go"
          + "ogle.cloud.dataplex.v1.DiscoveryEvent.En"
          + "tityType\032\230\001\n\020PartitionDetails\022\021\n\tpartiti"
          + "on\030\001 \001(\t\022\016\n\006entity\030\002 \001(\t\022A\n\004type\030\003 \001(\01623"
          + ".google.cloud.dataplex.v1.DiscoveryEvent"
          + ".EntityType\022\036\n\026sampled_data_locations\030\004 "
          + "\003(\t\032\035\n\rActionDetails\022\014\n\004type\030\001 \001(\t\"\264\001\n\tE"
          + "ventType\022\032\n\026EVENT_TYPE_UNSPECIFIED\020\000\022\n\n\006"
          + "CONFIG\020\001\022\022\n\016ENTITY_CREATED\020\002\022\022\n\016ENTITY_U"
          + "PDATED\020\003\022\022\n\016ENTITY_DELETED\020\004\022\025\n\021PARTITIO"
          + "N_CREATED\020\005\022\025\n\021PARTITION_UPDATED\020\006\022\025\n\021PA"
          + "RTITION_DELETED\020\007\"A\n\nEntityType\022\033\n\027ENTIT"
          + "Y_TYPE_UNSPECIFIED\020\000\022\t\n\005TABLE\020\001\022\013\n\007FILES"
          + "ET\020\002B\t\n\007details\"\305\005\n\010JobEvent\022\017\n\007message\030"
          + "\001 \001(\t\022\016\n\006job_id\030\002 \001(\t\022.\n\nstart_time\030\003 \001("
          + "\0132\032.google.protobuf.Timestamp\022,\n\010end_tim"
          + "e\030\004 \001(\0132\032.google.protobuf.Timestamp\0227\n\005s"
          + "tate\030\005 \001(\0162(.google.cloud.dataplex.v1.Jo"
          + "bEvent.State\022\017\n\007retries\030\006 \001(\005\0225\n\004type\030\007 "
          + "\001(\0162\'.google.cloud.dataplex.v1.JobEvent."
          + "Type\022;\n\007service\030\010 \001(\0162*.google.cloud.dat"
          + "aplex.v1.JobEvent.Service\022\023\n\013service_job"
          + "\030\t \001(\t\022N\n\021execution_trigger\030\013 \001(\01623.goog"
          + "le.cloud.dataplex.v1.JobEvent.ExecutionT"
          + "rigger\"5\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\t\n\005"
          + "SPARK\020\001\022\014\n\010NOTEBOOK\020\002\"U\n\005State\022\025\n\021STATE_"
          + "UNSPECIFIED\020\000\022\r\n\tSUCCEEDED\020\001\022\n\n\006FAILED\020\002"
          + "\022\r\n\tCANCELLED\020\003\022\013\n\007ABORTED\020\004\"0\n\007Service\022"
          + "\027\n\023SERVICE_UNSPECIFIED\020\000\022\014\n\010DATAPROC\020\001\"W"
          + "\n\020ExecutionTrigger\022!\n\035EXECUTION_TRIGGER_"
          + "UNSPECIFIED\020\000\022\017\n\013TASK_CONFIG\020\001\022\017\n\013RUN_RE"
          + "QUEST\020\002\"\275\005\n\014SessionEvent\022\017\n\007message\030\001 \001("
          + "\t\022\017\n\007user_id\030\002 \001(\t\022\022\n\nsession_id\030\003 \001(\t\022>"
          + "\n\004type\030\004 \001(\01620.google.cloud.dataplex.v1."
          + "SessionEvent.EventType\022C\n\005query\030\005 \001(\01322."
          + "google.cloud.dataplex.v1.SessionEvent.Qu"
          + "eryDetailH\000\022\027\n\017event_succeeded\030\006 \001(\010\022\034\n\024"
          + "fast_startup_enabled\030\007 \001(\010\0226\n\023unassigned"
          + "_duration\030\010 \001(\0132\031.google.protobuf.Durati"
          + "on\032\243\002\n\013QueryDetail\022\020\n\010query_id\030\001 \001(\t\022\022\n\n"
          + "query_text\030\002 \001(\t\022I\n\006engine\030\003 \001(\01629.googl"
          + "e.cloud.dataplex.v1.SessionEvent.QueryDe"
          + "tail.Engine\022+\n\010duration\030\004 \001(\0132\031.google.p"
          + "rotobuf.Duration\022\031\n\021result_size_bytes\030\005 "
          + "\001(\003\022\034\n\024data_processed_bytes\030\006 \001(\003\"=\n\006Eng"
          + "ine\022\026\n\022ENGINE_UNSPECIFIED\020\000\022\r\n\tSPARK_SQL"
          + "\020\001\022\014\n\010BIGQUERY\020\002\"S\n\tEventType\022\032\n\026EVENT_T"
          + "YPE_UNSPECIFIED\020\000\022\t\n\005START\020\001\022\010\n\004STOP\020\002\022\t"
          + "\n\005QUERY\020\003\022\n\n\006CREATE\020\004B\010\n\006detail\"\272\007\n\017Gove"
          + "rnanceEvent\022\017\n\007message\030\001 \001(\t\022G\n\nevent_ty"
          + "pe\030\002 \001(\01623.google.cloud.dataplex.v1.Gove"
          + "rnanceEvent.EventType\022E\n\006entity\030\003 \001(\01320."
          + "google.cloud.dataplex.v1.GovernanceEvent"
          + ".EntityH\000\210\001\001\032\322\001\n\006Entity\0223\n\006entity\030\001 \001(\tB"
          + "#\372A \n\036dataplex.googleapis.com/Entity\022P\n\013"
          + "entity_type\030\002 \001(\0162;.google.cloud.dataple"
          + "x.v1.GovernanceEvent.Entity.EntityType\"A"
          + "\n\nEntityType\022\033\n\027ENTITY_TYPE_UNSPECIFIED\020"
          + "\000\022\t\n\005TABLE\020\001\022\013\n\007FILESET\020\002\"\245\004\n\tEventType\022"
          + "\032\n\026EVENT_TYPE_UNSPECIFIED\020\000\022\036\n\032RESOURCE_"
          + "IAM_POLICY_UPDATE\020\001\022\031\n\025BIGQUERY_TABLE_CR"
          + "EATE\020\002\022\031\n\025BIGQUERY_TABLE_UPDATE\020\003\022\031\n\025BIG"
          + "QUERY_TABLE_DELETE\020\004\022\036\n\032BIGQUERY_CONNECT"
          + "ION_CREATE\020\005\022\036\n\032BIGQUERY_CONNECTION_UPDA"
          + "TE\020\006\022\036\n\032BIGQUERY_CONNECTION_DELETE\020\007\022\034\n\030"
          + "BIGQUERY_TAXONOMY_CREATE\020\n\022\036\n\032BIGQUERY_P"
          + "OLICY_TAG_CREATE\020\013\022\036\n\032BIGQUERY_POLICY_TA"
          + "G_DELETE\020\014\022&\n\"BIGQUERY_POLICY_TAG_SET_IA"
          + "M_POLICY\020\r\022\030\n\024ACCESS_POLICY_UPDATE\020\016\022%\n!"
          + "GOVERNANCE_RULE_MATCHED_RESOURCES\020\017\022(\n$G"
          + "OVERNANCE_RULE_SEARCH_LIMIT_EXCEEDS\020\020\022\032\n"
          + "\026GOVERNANCE_RULE_ERRORS\020\021\022\036\n\032GOVERNANCE_"
          + "RULE_PROCESSING\020\022B\t\n\007_entity\"\363\022\n\rDataSca"
          + "nEvent\022\023\n\013data_source\030\001 \001(\t\022\016\n\006job_id\030\002 "
          + "\001(\t\022/\n\013create_time\030\014 \001(\0132\032.google.protob"
          + "uf.Timestamp\022.\n\nstart_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022,\n\010end_time\030\004 \001(\0132\032"
          + ".google.protobuf.Timestamp\022>\n\004type\030\005 \001(\016"
          + "20.google.cloud.dataplex.v1.DataScanEven"
          + "t.ScanType\022<\n\005state\030\006 \001(\0162-.google.cloud"
          + ".dataplex.v1.DataScanEvent.State\022\017\n\007mess"
          + "age\030\007 \001(\t\022\024\n\014spec_version\030\010 \001(\t\022@\n\007trigg"
          + "er\030\t \001(\0162/.google.cloud.dataplex.v1.Data"
          + "ScanEvent.Trigger\022<\n\005scope\030\n \001(\0162-.googl"
          + "e.cloud.dataplex.v1.DataScanEvent.Scope\022"
          + "Q\n\014data_profile\030e \001(\01329.google.cloud.dat"
          + "aplex.v1.DataScanEvent.DataProfileResult"
          + "H\000\022Q\n\014data_quality\030f \001(\01329.google.cloud."
          + "dataplex.v1.DataScanEvent.DataQualityRes"
          + "ultH\000\022b\n\024data_profile_configs\030\311\001 \001(\0132A.g"
          + "oogle.cloud.dataplex.v1.DataScanEvent.Da"
          + "taProfileAppliedConfigsH\001\022b\n\024data_qualit"
          + "y_configs\030\312\001 \001(\0132A.google.cloud.dataplex"
          + ".v1.DataScanEvent.DataQualityAppliedConf"
          + "igsH\001\022_\n\030post_scan_actions_result\030\013 \001(\0132"
          + "=.google.cloud.dataplex.v1.DataScanEvent"
          + ".PostScanActionsResult\032&\n\021DataProfileRes"
          + "ult\022\021\n\trow_count\030\001 \001(\003\032\234\004\n\021DataQualityRe"
          + "sult\022\021\n\trow_count\030\001 \001(\003\022\016\n\006passed\030\002 \001(\010\022"
          + "h\n\020dimension_passed\030\003 \003(\0132N.google.cloud"
          + ".dataplex.v1.DataScanEvent.DataQualityRe"
          + "sult.DimensionPassedEntry\022\r\n\005score\030\004 \001(\002"
          + "\022f\n\017dimension_score\030\005 \003(\0132M.google.cloud"
          + ".dataplex.v1.DataScanEvent.DataQualityRe"
          + "sult.DimensionScoreEntry\022`\n\014column_score"
          + "\030\006 \003(\0132J.google.cloud.dataplex.v1.DataSc"
          + "anEvent.DataQualityResult.ColumnScoreEnt"
          + "ry\0326\n\024DimensionPassedEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\010:\0028\001\0325\n\023DimensionScoreEntr"
          + "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\002:\0028\001\0322\n\020Col"
          + "umnScoreEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\002:\0028\001\032p\n\031DataProfileAppliedConfigs\022\030\n\020sa"
          + "mpling_percent\030\001 \001(\002\022\032\n\022row_filter_appli"
          + "ed\030\002 \001(\010\022\035\n\025column_filter_applied\030\003 \001(\010\032"
          + "Q\n\031DataQualityAppliedConfigs\022\030\n\020sampling"
          + "_percent\030\001 \001(\002\022\032\n\022row_filter_applied\030\002 \001"
          + "(\010\032\346\002\n\025PostScanActionsResult\022r\n\026bigquery"
          + "_export_result\030\001 \001(\0132R.google.cloud.data"
          + "plex.v1.DataScanEvent.PostScanActionsRes"
          + "ult.BigQueryExportResult\032\330\001\n\024BigQueryExp"
          + "ortResult\022g\n\005state\030\001 \001(\0162X.google.cloud."
          + "dataplex.v1.DataScanEvent.PostScanAction"
          + "sResult.BigQueryExportResult.State\022\017\n\007me"
          + "ssage\030\002 \001(\t\"F\n\005State\022\025\n\021STATE_UNSPECIFIE"
          + "D\020\000\022\r\n\tSUCCEEDED\020\001\022\n\n\006FAILED\020\002\022\013\n\007SKIPPE"
          + "D\020\003\"I\n\010ScanType\022\031\n\025SCAN_TYPE_UNSPECIFIED"
          + "\020\000\022\020\n\014DATA_PROFILE\020\001\022\020\n\014DATA_QUALITY\020\002\"b"
          + "\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007STARTE"
          + "D\020\001\022\r\n\tSUCCEEDED\020\002\022\n\n\006FAILED\020\003\022\r\n\tCANCEL"
          + "LED\020\004\022\013\n\007CREATED\020\005\"?\n\007Trigger\022\027\n\023TRIGGER"
          + "_UNSPECIFIED\020\000\022\r\n\tON_DEMAND\020\001\022\014\n\010SCHEDUL"
          + "E\020\002\"9\n\005Scope\022\025\n\021SCOPE_UNSPECIFIED\020\000\022\010\n\004F"
          + "ULL\020\001\022\017\n\013INCREMENTAL\020\002B\010\n\006resultB\020\n\016appl"
          + "iedConfigs\"\351\006\n\031DataQualityScanRuleResult"
          + "\022\016\n\006job_id\030\001 \001(\t\022\023\n\013data_source\030\002 \001(\t\022\016\n"
          + "\006column\030\003 \001(\t\022\021\n\trule_name\030\004 \001(\t\022O\n\trule"
          + "_type\030\005 \001(\0162<.google.cloud.dataplex.v1.D"
          + "ataQualityScanRuleResult.RuleType\022Z\n\016eva"
          + "lution_type\030\006 \001(\0162B.google.cloud.dataple"
          + "x.v1.DataQualityScanRuleResult.Evaluatio"
          + "nType\022\026\n\016rule_dimension\030\007 \001(\t\022\031\n\021thresho"
          + "ld_percent\030\010 \001(\001\022J\n\006result\030\t \001(\0162:.googl"
          + "e.cloud.dataplex.v1.DataQualityScanRuleR"
          + "esult.Result\022\033\n\023evaluated_row_count\030\n \001("
          + "\003\022\030\n\020passed_row_count\030\013 \001(\003\022\026\n\016null_row_"
          + "count\030\014 \001(\003\"\377\001\n\010RuleType\022\031\n\025RULE_TYPE_UN"
          + "SPECIFIED\020\000\022\030\n\024NON_NULL_EXPECTATION\020\001\022\025\n"
          + "\021RANGE_EXPECTATION\020\002\022\025\n\021REGEX_EXPECTATIO"
          + "N\020\003\022\035\n\031ROW_CONDITION_EXPECTATION\020\004\022\023\n\017SE"
          + "T_EXPECTATION\020\005\022\037\n\033STATISTIC_RANGE_EXPEC"
          + "TATION\020\006\022\037\n\033TABLE_CONDITION_EXPECTATION\020"
          + "\007\022\032\n\026UNIQUENESS_EXPECTATION\020\010\"M\n\016Evaluat"
          + "ionType\022\037\n\033EVALUATION_TYPE_UNSPECIFIED\020\000"
          + "\022\013\n\007PER_ROW\020\001\022\r\n\tAGGREGATE\020\002\"8\n\006Result\022\026"
          + "\n\022RESULT_UNSPECIFIED\020\000\022\n\n\006PASSED\020\001\022\n\n\006FA"
          + "ILED\020\002Be\n\034com.google.cloud.dataplex.v1B\t"
          + "LogsProtoP\001Z8cloud.google.com/go/dataple"
          + "x/apiv1/dataplexpb;dataplexpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DiscoveryEvent_descriptor,
            new java.lang.String[] {
              "Message",
              "LakeId",
              "ZoneId",
              "AssetId",
              "DataLocation",
              "Type",
              "Config",
              "Entity",
              "Partition",
              "Action",
              "Details",
            });
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_descriptor =
        internal_static_google_cloud_dataplex_v1_DiscoveryEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_descriptor,
            new java.lang.String[] {
              "Parameters",
            });
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_ParametersEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ConfigDetails_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_EntityDetails_descriptor =
        internal_static_google_cloud_dataplex_v1_DiscoveryEvent_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_EntityDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DiscoveryEvent_EntityDetails_descriptor,
            new java.lang.String[] {
              "Entity", "Type",
            });
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_PartitionDetails_descriptor =
        internal_static_google_cloud_dataplex_v1_DiscoveryEvent_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_PartitionDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DiscoveryEvent_PartitionDetails_descriptor,
            new java.lang.String[] {
              "Partition", "Entity", "Type", "SampledDataLocations",
            });
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ActionDetails_descriptor =
        internal_static_google_cloud_dataplex_v1_DiscoveryEvent_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ActionDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DiscoveryEvent_ActionDetails_descriptor,
            new java.lang.String[] {
              "Type",
            });
    internal_static_google_cloud_dataplex_v1_JobEvent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_JobEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_JobEvent_descriptor,
            new java.lang.String[] {
              "Message",
              "JobId",
              "StartTime",
              "EndTime",
              "State",
              "Retries",
              "Type",
              "Service",
              "ServiceJob",
              "ExecutionTrigger",
            });
    internal_static_google_cloud_dataplex_v1_SessionEvent_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_SessionEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_SessionEvent_descriptor,
            new java.lang.String[] {
              "Message",
              "UserId",
              "SessionId",
              "Type",
              "Query",
              "EventSucceeded",
              "FastStartupEnabled",
              "UnassignedDuration",
              "Detail",
            });
    internal_static_google_cloud_dataplex_v1_SessionEvent_QueryDetail_descriptor =
        internal_static_google_cloud_dataplex_v1_SessionEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_SessionEvent_QueryDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_SessionEvent_QueryDetail_descriptor,
            new java.lang.String[] {
              "QueryId", "QueryText", "Engine", "Duration", "ResultSizeBytes", "DataProcessedBytes",
            });
    internal_static_google_cloud_dataplex_v1_GovernanceEvent_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataplex_v1_GovernanceEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_GovernanceEvent_descriptor,
            new java.lang.String[] {
              "Message", "EventType", "Entity",
            });
    internal_static_google_cloud_dataplex_v1_GovernanceEvent_Entity_descriptor =
        internal_static_google_cloud_dataplex_v1_GovernanceEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_GovernanceEvent_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_GovernanceEvent_Entity_descriptor,
            new java.lang.String[] {
              "Entity", "EntityType",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_descriptor,
            new java.lang.String[] {
              "DataSource",
              "JobId",
              "CreateTime",
              "StartTime",
              "EndTime",
              "Type",
              "State",
              "Message",
              "SpecVersion",
              "Trigger",
              "Scope",
              "DataProfile",
              "DataQuality",
              "DataProfileConfigs",
              "DataQualityConfigs",
              "PostScanActionsResult",
              "Result",
              "AppliedConfigs",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileResult_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileResult_descriptor,
            new java.lang.String[] {
              "RowCount",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_descriptor,
            new java.lang.String[] {
              "RowCount", "Passed", "DimensionPassed", "Score", "DimensionScore", "ColumnScore",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionPassedEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionPassedEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionPassedEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionScoreEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionScoreEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_DimensionScoreEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_ColumnScoreEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_ColumnScoreEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityResult_ColumnScoreEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileAppliedConfigs_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileAppliedConfigs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_DataProfileAppliedConfigs_descriptor,
            new java.lang.String[] {
              "SamplingPercent", "RowFilterApplied", "ColumnFilterApplied",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityAppliedConfigs_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityAppliedConfigs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_DataQualityAppliedConfigs_descriptor,
            new java.lang.String[] {
              "SamplingPercent", "RowFilterApplied",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_descriptor,
            new java.lang.String[] {
              "BigqueryExportResult",
            });
    internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_BigQueryExportResult_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_BigQueryExportResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanEvent_PostScanActionsResult_BigQueryExportResult_descriptor,
            new java.lang.String[] {
              "State", "Message",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityScanRuleResult_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataplex_v1_DataQualityScanRuleResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityScanRuleResult_descriptor,
            new java.lang.String[] {
              "JobId",
              "DataSource",
              "Column",
              "RuleName",
              "RuleType",
              "EvalutionType",
              "RuleDimension",
              "ThresholdPercent",
              "Result",
              "EvaluatedRowCount",
              "PassedRowCount",
              "NullRowCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
