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
// source: google/cloud/aiplatform/v1beta1/schedule_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ScheduleServiceProto {
  private ScheduleServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/schedu"
          + "le_service.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032/google/cloud/aiplatform/v1beta1/op"
          + "eration.proto\032.google/cloud/aiplatform/v"
          + "1beta1/schedule.proto\032#google/longrunnin"
          + "g/operations.proto\032\033google/protobuf/empt"
          + "y.proto\032 google/protobuf/field_mask.prot"
          + "o\"\224\001\n\025CreateScheduleRequest\0229\n\006parent\030\001 "
          + "\001(\tB)\340A\002\372A#\n!locations.googleapis.com/Lo"
          + "cation\022@\n\010schedule\030\002 \001(\0132).google.cloud."
          + "aiplatform.v1beta1.ScheduleB\003\340A\002\"N\n\022GetS"
          + "cheduleRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"ai"
          + "platform.googleapis.com/Schedule\"\232\001\n\024Lis"
          + "tSchedulesRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A"
          + "#\n!locations.googleapis.com/Location\022\016\n\006"
          + "filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_"
          + "token\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"n\n\025ListSch"
          + "edulesResponse\022<\n\tschedules\030\001 \003(\0132).goog"
          + "le.cloud.aiplatform.v1beta1.Schedule\022\027\n\017"
          + "next_page_token\030\002 \001(\t\"Q\n\025DeleteScheduleR"
          + "equest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform"
          + ".googleapis.com/Schedule\"P\n\024PauseSchedul"
          + "eRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aiplatfo"
          + "rm.googleapis.com/Schedule\"h\n\025ResumeSche"
          + "duleRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aipla"
          + "tform.googleapis.com/Schedule\022\025\n\010catch_u"
          + "p\030\002 \001(\010B\003\340A\001\"\217\001\n\025UpdateScheduleRequest\022@"
          + "\n\010schedule\030\001 \001(\0132).google.cloud.aiplatfo"
          + "rm.v1beta1.ScheduleB\003\340A\002\0224\n\013update_mask\030"
          + "\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\0022\320"
          + "\013\n\017ScheduleService\022\313\001\n\016CreateSchedule\0226."
          + "google.cloud.aiplatform.v1beta1.CreateSc"
          + "heduleRequest\032).google.cloud.aiplatform."
          + "v1beta1.Schedule\"V\332A\017parent,schedule\202\323\344\223"
          + "\002>\"2/v1beta1/{parent=projects/*/location"
          + "s/*}/schedules:\010schedule\022\335\001\n\016DeleteSched"
          + "ule\0226.google.cloud.aiplatform.v1beta1.De"
          + "leteScheduleRequest\032\035.google.longrunning"
          + ".Operation\"t\312A0\n\025google.protobuf.Empty\022\027"
          + "DeleteOperationMetadata\332A\004name\202\323\344\223\0024*2/v"
          + "1beta1/{name=projects/*/locations/*/sche"
          + "dules/*}\022\260\001\n\013GetSchedule\0223.google.cloud."
          + "aiplatform.v1beta1.GetScheduleRequest\032)."
          + "google.cloud.aiplatform.v1beta1.Schedule"
          + "\"A\332A\004name\202\323\344\223\0024\0222/v1beta1/{name=projects"
          + "/*/locations/*/schedules/*}\022\303\001\n\rListSche"
          + "dules\0225.google.cloud.aiplatform.v1beta1."
          + "ListSchedulesRequest\0326.google.cloud.aipl"
          + "atform.v1beta1.ListSchedulesResponse\"C\332A"
          + "\006parent\202\323\344\223\0024\0222/v1beta1/{parent=projects"
          + "/*/locations/*}/schedules\022\252\001\n\rPauseSched"
          + "ule\0225.google.cloud.aiplatform.v1beta1.Pa"
          + "useScheduleRequest\032\026.google.protobuf.Emp"
          + "ty\"J\332A\004name\202\323\344\223\002=\"8/v1beta1/{name=projec"
          + "ts/*/locations/*/schedules/*}:pause:\001*\022\275"
          + "\001\n\016ResumeSchedule\0226.google.cloud.aiplatf"
          + "orm.v1beta1.ResumeScheduleRequest\032\026.goog"
          + "le.protobuf.Empty\"[\332A\004name\332A\rname,catch_"
          + "up\202\323\344\223\002>\"9/v1beta1/{name=projects/*/loca"
          + "tions/*/schedules/*}:resume:\001*\022\331\001\n\016Updat"
          + "eSchedule\0226.google.cloud.aiplatform.v1be"
          + "ta1.UpdateScheduleRequest\032).google.cloud"
          + ".aiplatform.v1beta1.Schedule\"d\332A\024schedul"
          + "e,update_mask\202\323\344\223\002G2;/v1beta1/{schedule."
          + "name=projects/*/locations/*/schedules/*}"
          + ":\010schedule\032M\312A\031aiplatform.googleapis.com"
          + "\322A.https://www.googleapis.com/auth/cloud"
          + "-platformB\353\001\n#com.google.cloud.aiplatfor"
          + "m.v1beta1B\024ScheduleServiceProtoP\001ZCcloud"
          + ".google.com/go/aiplatform/apiv1beta1/aip"
          + "latformpb;aiplatformpb\252\002\037Google.Cloud.AI"
          + "Platform.V1Beta1\312\002\037Google\\Cloud\\AIPlatfo"
          + "rm\\V1beta1\352\002\"Google::Cloud::AIPlatform::"
          + "V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ScheduleProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Schedule",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_descriptor,
            new java.lang.String[] {
              "Schedules", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_descriptor,
            new java.lang.String[] {
              "Name", "CatchUp",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateScheduleRequest_descriptor,
            new java.lang.String[] {
              "Schedule", "UpdateMask",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ScheduleProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
