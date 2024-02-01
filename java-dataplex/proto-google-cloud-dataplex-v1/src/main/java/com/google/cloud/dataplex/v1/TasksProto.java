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
// source: google/cloud/dataplex/v1/tasks.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public final class TasksProto {
  private TasksProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_BatchComputeResources_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_BatchComputeResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_PropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_PropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_VpcNetwork_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_VpcNetwork_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_TriggerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_TriggerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_ArgsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_ArgsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_SparkTaskConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_SparkTaskConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_NotebookTaskConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_NotebookTaskConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_ExecutionStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_ExecutionStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Task_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Task_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Job_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Job_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/dataplex/v1/tasks.proto\022\030"
          + "google.cloud.dataplex.v1\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032(google/cloud/dataplex/v1/resources"
          + ".proto\032\036google/protobuf/duration.proto\032\037"
          + "google/protobuf/timestamp.proto\"\305\026\n\004Task"
          + "\0223\n\004name\030\001 \001(\tB%\342A\001\003\372A\036\n\034dataplex.google"
          + "apis.com/Task\022\021\n\003uid\030\002 \001(\tB\004\342A\001\003\0225\n\013crea"
          + "te_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\0225\n\013update_time\030\004 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\003\022\031\n\013description\030\005 "
          + "\001(\tB\004\342A\001\001\022\032\n\014display_name\030\006 \001(\tB\004\342A\001\001\0224\n"
          + "\005state\030\007 \001(\0162\037.google.cloud.dataplex.v1."
          + "StateB\004\342A\001\003\022@\n\006labels\030\010 \003(\0132*.google.clo"
          + "ud.dataplex.v1.Task.LabelsEntryB\004\342A\001\001\022F\n"
          + "\014trigger_spec\030d \001(\0132*.google.cloud.datap"
          + "lex.v1.Task.TriggerSpecB\004\342A\001\002\022J\n\016executi"
          + "on_spec\030e \001(\0132,.google.cloud.dataplex.v1"
          + ".Task.ExecutionSpecB\004\342A\001\002\022O\n\020execution_s"
          + "tatus\030\311\001 \001(\0132..google.cloud.dataplex.v1."
          + "Task.ExecutionStatusB\004\342A\001\003\022@\n\005spark\030\254\002 \001"
          + "(\0132..google.cloud.dataplex.v1.Task.Spark"
          + "TaskConfigH\000\022F\n\010notebook\030\256\002 \001(\01321.google"
          + ".cloud.dataplex.v1.Task.NotebookTaskConf"
          + "igH\000\032\243\006\n\022InfrastructureSpec\022X\n\005batch\0304 \001"
          + "(\0132G.google.cloud.dataplex.v1.Task.Infra"
          + "structureSpec.BatchComputeResourcesH\000\022b\n"
          + "\017container_image\030e \001(\0132G.google.cloud.da"
          + "taplex.v1.Task.InfrastructureSpec.Contai"
          + "nerImageRuntimeH\001\022T\n\013vpc_network\030\226\001 \001(\0132"
          + "<.google.cloud.dataplex.v1.Task.Infrastr"
          + "uctureSpec.VpcNetworkH\002\032Y\n\025BatchComputeR"
          + "esources\022\035\n\017executors_count\030\001 \001(\005B\004\342A\001\001\022"
          + "!\n\023max_executors_count\030\002 \001(\005B\004\342A\001\001\032\212\002\n\025C"
          + "ontainerImageRuntime\022\023\n\005image\030\001 \001(\tB\004\342A\001"
          + "\001\022\027\n\tjava_jars\030\002 \003(\tB\004\342A\001\001\022\035\n\017python_pac"
          + "kages\030\003 \003(\tB\004\342A\001\001\022q\n\nproperties\030\004 \003(\0132W."
          + "google.cloud.dataplex.v1.Task.Infrastruc"
          + "tureSpec.ContainerImageRuntime.Propertie"
          + "sEntryB\004\342A\001\001\0321\n\017PropertiesEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032n\n\nVpcNetwork\022\027\n"
          + "\007network\030\001 \001(\tB\004\342A\001\001H\000\022\033\n\013sub_network\030\002 "
          + "\001(\tB\004\342A\001\001H\000\022\032\n\014network_tags\030\003 \003(\tB\004\342A\001\001B"
          + "\016\n\014network_nameB\013\n\tresourcesB\t\n\007runtimeB"
          + "\t\n\007network\032\235\002\n\013TriggerSpec\022D\n\004type\030\005 \001(\016"
          + "2/.google.cloud.dataplex.v1.Task.Trigger"
          + "Spec.TypeB\005\342A\002\002\005\0224\n\nstart_time\030\006 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\004\342A\001\001\022\026\n\010disabl"
          + "ed\030\004 \001(\010B\004\342A\001\001\022\031\n\013max_retries\030\007 \001(\005B\004\342A\001"
          + "\001\022\030\n\010schedule\030d \001(\tB\004\342A\001\001H\000\":\n\004Type\022\024\n\020T"
          + "YPE_UNSPECIFIED\020\000\022\r\n\tON_DEMAND\020\001\022\r\n\tRECU"
          + "RRING\020\002B\t\n\007trigger\032\232\002\n\rExecutionSpec\022J\n\004"
          + "args\030\004 \003(\01326.google.cloud.dataplex.v1.Ta"
          + "sk.ExecutionSpec.ArgsEntryB\004\342A\001\001\022\035\n\017serv"
          + "ice_account\030\005 \001(\tB\004\342A\001\002\022\025\n\007project\030\007 \001(\t"
          + "B\004\342A\001\001\022C\n\032max_job_execution_lifetime\030\010 \001"
          + "(\0132\031.google.protobuf.DurationB\004\342A\001\001\022\025\n\007k"
          + "ms_key\030\t \001(\tB\004\342A\001\001\032+\n\tArgsEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032\250\002\n\017SparkTaskCon"
          + "fig\022\033\n\021main_jar_file_uri\030d \001(\tH\000\022\024\n\nmain"
          + "_class\030e \001(\tH\000\022\034\n\022python_script_file\030f \001"
          + "(\tH\000\022\031\n\017sql_script_file\030h \001(\tH\000\022\024\n\nsql_s"
          + "cript\030i \001(\tH\000\022\027\n\tfile_uris\030\003 \003(\tB\004\342A\001\001\022\032"
          + "\n\014archive_uris\030\004 \003(\tB\004\342A\001\001\022T\n\023infrastruc"
          + "ture_spec\030\006 \001(\01321.google.cloud.dataplex."
          + "v1.Task.InfrastructureSpecB\004\342A\001\001B\010\n\006driv"
          + "er\032\267\001\n\022NotebookTaskConfig\022\026\n\010notebook\030\004 "
          + "\001(\tB\004\342A\001\002\022T\n\023infrastructure_spec\030\003 \001(\01321"
          + ".google.cloud.dataplex.v1.Task.Infrastru"
          + "ctureSpecB\004\342A\001\001\022\027\n\tfile_uris\030\005 \003(\tB\004\342A\001\001"
          + "\022\032\n\014archive_uris\030\006 \003(\tB\004\342A\001\001\032\201\001\n\017Executi"
          + "onStatus\0225\n\013update_time\030\003 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\004\342A\001\003\0227\n\nlatest_job\030\t "
          + "\001(\0132\035.google.cloud.dataplex.v1.JobB\004\342A\001\003"
          + "\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 "
          + "\001(\t:\0028\001:d\352Aa\n\034dataplex.googleapis.com/Ta"
          + "sk\022Aprojects/{project}/locations/{locati"
          + "on}/lakes/{lake}/tasks/{task}B\010\n\006config\""
          + "\321\007\n\003Job\0222\n\004name\030\001 \001(\tB$\342A\001\003\372A\035\n\033dataplex"
          + ".googleapis.com/Job\022\021\n\003uid\030\002 \001(\tB\004\342A\001\003\0224"
          + "\n\nstart_time\030\003 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003\0222\n\010end_time\030\004 \001(\0132\032.google."
          + "protobuf.TimestampB\004\342A\001\003\0228\n\005state\030\005 \001(\0162"
          + "#.google.cloud.dataplex.v1.Job.StateB\004\342A"
          + "\001\003\022\031\n\013retry_count\030\006 \001(\rB\004\342A\001\003\022<\n\007service"
          + "\030\007 \001(\0162%.google.cloud.dataplex.v1.Job.Se"
          + "rviceB\004\342A\001\003\022\031\n\013service_job\030\010 \001(\tB\004\342A\001\003\022\025"
          + "\n\007message\030\t \001(\tB\004\342A\001\003\022?\n\006labels\030\n \003(\0132)."
          + "google.cloud.dataplex.v1.Job.LabelsEntry"
          + "B\004\342A\001\003\022<\n\007trigger\030\013 \001(\0162%.google.cloud.d"
          + "ataplex.v1.Job.TriggerB\004\342A\001\003\022J\n\016executio"
          + "n_spec\030d \001(\0132,.google.cloud.dataplex.v1."
          + "Task.ExecutionSpecB\004\342A\001\003\032-\n\013LabelsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"0\n\007Servi"
          + "ce\022\027\n\023SERVICE_UNSPECIFIED\020\000\022\014\n\010DATAPROC\020"
          + "\001\"r\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007RUN"
          + "NING\020\001\022\016\n\nCANCELLING\020\002\022\r\n\tCANCELLED\020\003\022\r\n"
          + "\tSUCCEEDED\020\004\022\n\n\006FAILED\020\005\022\013\n\007ABORTED\020\006\"D\n"
          + "\007Trigger\022\027\n\023TRIGGER_UNSPECIFIED\020\000\022\017\n\013TAS"
          + "K_CONFIG\020\001\022\017\n\013RUN_REQUEST\020\002:n\352Ak\n\033datapl"
          + "ex.googleapis.com/Job\022Lprojects/{project"
          + "}/locations/{location}/lakes/{lake}/task"
          + "s/{task}/jobs/{job}Bf\n\034com.google.cloud."
          + "dataplex.v1B\nTasksProtoP\001Z8cloud.google."
          + "com/go/dataplex/apiv1/dataplexpb;dataple"
          + "xpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ResourcesProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_Task_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Description",
              "DisplayName",
              "State",
              "Labels",
              "TriggerSpec",
              "ExecutionSpec",
              "ExecutionStatus",
              "Spark",
              "Notebook",
              "Config",
            });
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_descriptor,
            new java.lang.String[] {
              "Batch", "ContainerImage", "VpcNetwork", "Resources", "Runtime", "Network",
            });
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_BatchComputeResources_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_BatchComputeResources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_BatchComputeResources_descriptor,
            new java.lang.String[] {
              "ExecutorsCount", "MaxExecutorsCount",
            });
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_descriptor,
            new java.lang.String[] {
              "Image", "JavaJars", "PythonPackages", "Properties",
            });
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_PropertiesEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_PropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_ContainerImageRuntime_PropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_VpcNetwork_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_VpcNetwork_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_InfrastructureSpec_VpcNetwork_descriptor,
            new java.lang.String[] {
              "Network", "SubNetwork", "NetworkTags", "NetworkName",
            });
    internal_static_google_cloud_dataplex_v1_Task_TriggerSpec_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_Task_TriggerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_TriggerSpec_descriptor,
            new java.lang.String[] {
              "Type", "StartTime", "Disabled", "MaxRetries", "Schedule", "Trigger",
            });
    internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_descriptor,
            new java.lang.String[] {
              "Args", "ServiceAccount", "Project", "MaxJobExecutionLifetime", "KmsKey",
            });
    internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_ArgsEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_ArgsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_ExecutionSpec_ArgsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_Task_SparkTaskConfig_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dataplex_v1_Task_SparkTaskConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_SparkTaskConfig_descriptor,
            new java.lang.String[] {
              "MainJarFileUri",
              "MainClass",
              "PythonScriptFile",
              "SqlScriptFile",
              "SqlScript",
              "FileUris",
              "ArchiveUris",
              "InfrastructureSpec",
              "Driver",
            });
    internal_static_google_cloud_dataplex_v1_Task_NotebookTaskConfig_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_dataplex_v1_Task_NotebookTaskConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_NotebookTaskConfig_descriptor,
            new java.lang.String[] {
              "Notebook", "InfrastructureSpec", "FileUris", "ArchiveUris",
            });
    internal_static_google_cloud_dataplex_v1_Task_ExecutionStatus_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_dataplex_v1_Task_ExecutionStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_ExecutionStatus_descriptor,
            new java.lang.String[] {
              "UpdateTime", "LatestJob",
            });
    internal_static_google_cloud_dataplex_v1_Task_LabelsEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_Task_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_dataplex_v1_Task_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Task_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_Job_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Job_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "StartTime",
              "EndTime",
              "State",
              "RetryCount",
              "Service",
              "ServiceJob",
              "Message",
              "Labels",
              "Trigger",
              "ExecutionSpec",
            });
    internal_static_google_cloud_dataplex_v1_Job_LabelsEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_Job_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Job_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Job_LabelsEntry_descriptor,
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
    com.google.cloud.dataplex.v1.ResourcesProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
