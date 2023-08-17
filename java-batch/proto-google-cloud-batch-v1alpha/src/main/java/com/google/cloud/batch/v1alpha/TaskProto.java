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
// source: google/cloud/batch/v1alpha/task.proto

package com.google.cloud.batch.v1alpha;

public final class TaskProto {
  private TaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ComputeResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ComputeResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_StatusEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskExecution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskResourceUsage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskResourceUsage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_Container_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_Container_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_Script_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_Script_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/batch/v1alpha/task.proto\022"
          + "\032google.cloud.batch.v1alpha\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032\'google/cloud/batch/v1alpha/volu"
          + "me.proto\032\036google/protobuf/duration.proto"
          + "\032\037google/protobuf/timestamp.proto\"b\n\017Com"
          + "puteResource\022\021\n\tcpu_milli\030\001 \001(\003\022\022\n\nmemor"
          + "y_mib\030\002 \001(\003\022\021\n\tgpu_count\030\003 \001(\003\022\025\n\rboot_d"
          + "isk_mib\030\004 \001(\003\"\345\001\n\013StatusEvent\022\014\n\004type\030\003 "
          + "\001(\t\022\023\n\013description\030\001 \001(\t\022.\n\nevent_time\030\002"
          + " \001(\0132\032.google.protobuf.Timestamp\022A\n\016task"
          + "_execution\030\004 \001(\0132).google.cloud.batch.v1"
          + "alpha.TaskExecution\022@\n\ntask_state\030\005 \001(\0162"
          + ",.google.cloud.batch.v1alpha.TaskStatus."
          + "State\"\"\n\rTaskExecution\022\021\n\texit_code\030\001 \001("
          + "\005\"\303\002\n\nTaskStatus\022;\n\005state\030\001 \001(\0162,.google"
          + ".cloud.batch.v1alpha.TaskStatus.State\022>\n"
          + "\rstatus_events\030\002 \003(\0132\'.google.cloud.batc"
          + "h.v1alpha.StatusEvent\022E\n\016resource_usage\030"
          + "\003 \001(\0132-.google.cloud.batch.v1alpha.TaskR"
          + "esourceUsage\"q\n\005State\022\025\n\021STATE_UNSPECIFI"
          + "ED\020\000\022\013\n\007PENDING\020\001\022\014\n\010ASSIGNED\020\002\022\013\n\007RUNNI"
          + "NG\020\003\022\n\n\006FAILED\020\004\022\r\n\tSUCCEEDED\020\005\022\016\n\nUNEXE"
          + "CUTED\020\006\"\'\n\021TaskResourceUsage\022\022\n\ncore_hou"
          + "rs\030\001 \001(\001\"\235\006\n\010Runnable\022C\n\tcontainer\030\001 \001(\013"
          + "2..google.cloud.batch.v1alpha.Runnable.C"
          + "ontainerH\000\022=\n\006script\030\002 \001(\0132+.google.clou"
          + "d.batch.v1alpha.Runnable.ScriptH\000\022?\n\007bar"
          + "rier\030\006 \001(\0132,.google.cloud.batch.v1alpha."
          + "Runnable.BarrierH\000\022\032\n\022ignore_exit_status"
          + "\030\003 \001(\010\022\022\n\nbackground\030\004 \001(\010\022\022\n\nalways_run"
          + "\030\005 \001(\010\022<\n\013environment\030\007 \001(\0132\'.google.clo"
          + "ud.batch.v1alpha.Environment\022*\n\007timeout\030"
          + "\010 \001(\0132\031.google.protobuf.Duration\022@\n\006labe"
          + "ls\030\t \003(\01320.google.cloud.batch.v1alpha.Ru"
          + "nnable.LabelsEntry\032\320\001\n\tContainer\022\021\n\timag"
          + "e_uri\030\001 \001(\t\022\020\n\010commands\030\002 \003(\t\022\022\n\nentrypo"
          + "int\030\003 \001(\t\022\017\n\007volumes\030\007 \003(\t\022\017\n\007options\030\010 "
          + "\001(\t\022\036\n\026block_external_network\030\t \001(\010\022\020\n\010u"
          + "sername\030\n \001(\t\022\020\n\010password\030\013 \001(\t\022$\n\026enabl"
          + "e_image_streaming\030\014 \001(\010B\004\342A\001\001\0323\n\006Script\022"
          + "\016\n\004path\030\001 \001(\tH\000\022\016\n\004text\030\002 \001(\tH\000B\t\n\007comma"
          + "nd\032\027\n\007Barrier\022\014\n\004name\030\001 \001(\t\032-\n\013LabelsEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\014\n\nex"
          + "ecutable\"\233\004\n\010TaskSpec\0227\n\trunnables\030\010 \003(\013"
          + "2$.google.cloud.batch.v1alpha.Runnable\022E"
          + "\n\020compute_resource\030\003 \001(\0132+.google.cloud."
          + "batch.v1alpha.ComputeResource\0223\n\020max_run"
          + "_duration\030\004 \001(\0132\031.google.protobuf.Durati"
          + "on\022\027\n\017max_retry_count\030\005 \001(\005\022G\n\022lifecycle"
          + "_policies\030\t \003(\0132+.google.cloud.batch.v1a"
          + "lpha.LifecyclePolicy\022P\n\014environments\030\006 \003"
          + "(\01326.google.cloud.batch.v1alpha.TaskSpec"
          + ".EnvironmentsEntryB\002\030\001\0223\n\007volumes\030\007 \003(\0132"
          + "\".google.cloud.batch.v1alpha.Volume\022<\n\013e"
          + "nvironment\030\n \001(\0132\'.google.cloud.batch.v1"
          + "alpha.Environment\0323\n\021EnvironmentsEntry\022\013"
          + "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\224\002\n\017Lifec"
          + "yclePolicy\022B\n\006action\030\001 \001(\01622.google.clou"
          + "d.batch.v1alpha.LifecyclePolicy.Action\022U"
          + "\n\020action_condition\030\002 \001(\0132;.google.cloud."
          + "batch.v1alpha.LifecyclePolicy.ActionCond"
          + "ition\032%\n\017ActionCondition\022\022\n\nexit_codes\030\001"
          + " \003(\005\"?\n\006Action\022\026\n\022ACTION_UNSPECIFIED\020\000\022\016"
          + "\n\nRETRY_TASK\020\001\022\r\n\tFAIL_TASK\020\002\"\305\001\n\004Task\022\014"
          + "\n\004name\030\001 \001(\t\0226\n\006status\030\002 \001(\0132&.google.cl"
          + "oud.batch.v1alpha.TaskStatus:w\352At\n\031batch"
          + ".googleapis.com/Task\022Wprojects/{project}"
          + "/locations/{location}/jobs/{job}/taskGro"
          + "ups/{task_group}/tasks/{task}\"\236\003\n\013Enviro"
          + "nment\022I\n\tvariables\030\001 \003(\01326.google.cloud."
          + "batch.v1alpha.Environment.VariablesEntry"
          + "\022V\n\020secret_variables\030\002 \003(\0132<.google.clou"
          + "d.batch.v1alpha.Environment.SecretVariab"
          + "lesEntry\022N\n\023encrypted_variables\030\003 \001(\01321."
          + "google.cloud.batch.v1alpha.Environment.K"
          + "MSEnvMap\0322\n\tKMSEnvMap\022\020\n\010key_name\030\001 \001(\t\022"
          + "\023\n\013cipher_text\030\002 \001(\t\0320\n\016VariablesEntry\022\013"
          + "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0326\n\024Secret"
          + "VariablesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001B\303\001\n\036com.google.cloud.batch.v1alph"
          + "aB\tTaskProtoP\001Z4cloud.google.com/go/batc"
          + "h/apiv1alpha/batchpb;batchpb\242\002\003GCB\252\002\032Goo"
          + "gle.Cloud.Batch.V1Alpha\312\002\032Google\\Cloud\\B"
          + "atch\\V1alpha\352\002\035Google::Cloud::Batch::V1a"
          + "lphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.VolumeProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1alpha_ComputeResource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_ComputeResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ComputeResource_descriptor,
            new java.lang.String[] {
              "CpuMilli", "MemoryMib", "GpuCount", "BootDiskMib",
            });
    internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_StatusEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor,
            new java.lang.String[] {
              "Type", "Description", "EventTime", "TaskExecution", "TaskState",
            });
    internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_TaskExecution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor,
            new java.lang.String[] {
              "ExitCode",
            });
    internal_static_google_cloud_batch_v1alpha_TaskStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_TaskStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskStatus_descriptor,
            new java.lang.String[] {
              "State", "StatusEvents", "ResourceUsage",
            });
    internal_static_google_cloud_batch_v1alpha_TaskResourceUsage_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1alpha_TaskResourceUsage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskResourceUsage_descriptor,
            new java.lang.String[] {
              "CoreHours",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1alpha_Runnable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_descriptor,
            new java.lang.String[] {
              "Container",
              "Script",
              "Barrier",
              "IgnoreExitStatus",
              "Background",
              "AlwaysRun",
              "Environment",
              "Timeout",
              "Labels",
              "Executable",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_Container_descriptor =
        internal_static_google_cloud_batch_v1alpha_Runnable_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Runnable_Container_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_Container_descriptor,
            new java.lang.String[] {
              "ImageUri",
              "Commands",
              "Entrypoint",
              "Volumes",
              "Options",
              "BlockExternalNetwork",
              "Username",
              "Password",
              "EnableImageStreaming",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_Script_descriptor =
        internal_static_google_cloud_batch_v1alpha_Runnable_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_Runnable_Script_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_Script_descriptor,
            new java.lang.String[] {
              "Path", "Text", "Command",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_descriptor =
        internal_static_google_cloud_batch_v1alpha_Runnable_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_Runnable_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_TaskSpec_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1alpha_TaskSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskSpec_descriptor,
            new java.lang.String[] {
              "Runnables",
              "ComputeResource",
              "MaxRunDuration",
              "MaxRetryCount",
              "LifecyclePolicies",
              "Environments",
              "Volumes",
              "Environment",
            });
    internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_TaskSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_descriptor,
            new java.lang.String[] {
              "Action", "ActionCondition",
            });
    internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_descriptor =
        internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_descriptor,
            new java.lang.String[] {
              "ExitCodes",
            });
    internal_static_google_cloud_batch_v1alpha_Task_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_batch_v1alpha_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Task_descriptor,
            new java.lang.String[] {
              "Name", "Status",
            });
    internal_static_google_cloud_batch_v1alpha_Environment_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_batch_v1alpha_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Environment_descriptor,
            new java.lang.String[] {
              "Variables", "SecretVariables", "EncryptedVariables",
            });
    internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_descriptor =
        internal_static_google_cloud_batch_v1alpha_Environment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_descriptor,
            new java.lang.String[] {
              "KeyName", "CipherText",
            });
    internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_Environment_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_Environment_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1alpha.VolumeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
