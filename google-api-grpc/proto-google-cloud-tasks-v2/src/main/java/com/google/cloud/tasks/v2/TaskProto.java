// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/task.proto

package com.google.cloud.tasks.v2;

public final class TaskProto {
  private TaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_Attempt_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_Attempt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/cloud/tasks/v2/task.proto\022\025goog"
          + "le.cloud.tasks.v2\032\034google/api/annotation"
          + "s.proto\032\031google/api/resource.proto\032\"goog"
          + "le/cloud/tasks/v2/target.proto\032\036google/p"
          + "rotobuf/duration.proto\032\037google/protobuf/"
          + "timestamp.proto\032\027google/rpc/status.proto"
          + "\"\216\004\n\004Task\022\014\n\004name\030\001 \001(\t\022N\n\027app_engine_ht"
          + "tp_request\030\002 \001(\0132+.google.cloud.tasks.v2"
          + ".AppEngineHttpRequestH\000\0221\n\rschedule_time"
          + "\030\004 \001(\0132\032.google.protobuf.Timestamp\022/\n\013cr"
          + "eate_time\030\005 \001(\0132\032.google.protobuf.Timest"
          + "amp\0224\n\021dispatch_deadline\030\006 \001(\0132\031.google."
          + "protobuf.Duration\022\026\n\016dispatch_count\030\007 \001("
          + "\005\022\026\n\016response_count\030\010 \001(\005\0225\n\rfirst_attem"
          + "pt\030\t \001(\0132\036.google.cloud.tasks.v2.Attempt"
          + "\0224\n\014last_attempt\030\n \001(\0132\036.google.cloud.ta"
          + "sks.v2.Attempt\022.\n\004view\030\013 \001(\0162 .google.cl"
          + "oud.tasks.v2.Task.View\"1\n\004View\022\024\n\020VIEW_U"
          + "NSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL\020\002B\016\n\014mes"
          + "sage_type\"\317\001\n\007Attempt\0221\n\rschedule_time\030\001"
          + " \001(\0132\032.google.protobuf.Timestamp\0221\n\rdisp"
          + "atch_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "amp\0221\n\rresponse_time\030\003 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022+\n\017response_status\030\004 \001(\0132"
          + "\022.google.rpc.StatusBd\n\031com.google.cloud."
          + "tasks.v2B\tTaskProtoP\001Z:google.golang.org"
          + "/genproto/googleapis/cloud/tasks/v2;task"
          + "sb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.tasks.v2.TargetProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2_Task_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_Task_descriptor,
            new java.lang.String[] {
              "Name",
              "AppEngineHttpRequest",
              "ScheduleTime",
              "CreateTime",
              "DispatchDeadline",
              "DispatchCount",
              "ResponseCount",
              "FirstAttempt",
              "LastAttempt",
              "View",
              "MessageType",
            });
    internal_static_google_cloud_tasks_v2_Attempt_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2_Attempt_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_Attempt_descriptor,
            new java.lang.String[] {
              "ScheduleTime", "DispatchTime", "ResponseTime", "ResponseStatus",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
