// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/cloudscheduler.proto

package com.google.cloud.scheduler.v1beta1;

public final class SchedulerProto {
  private SchedulerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/scheduler/v1beta1/cloudsc" +
      "heduler.proto\022\036google.cloud.scheduler.v1" +
      "beta1\032\034google/api/annotations.proto\032(goo" +
      "gle/cloud/scheduler/v1beta1/job.proto\032\033g" +
      "oogle/protobuf/empty.proto\032 google/proto" +
      "buf/field_mask.proto\"H\n\017ListJobsRequest\022" +
      "\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\005 \001(\005\022\022\n\npa" +
      "ge_token\030\006 \001(\t\"^\n\020ListJobsResponse\0221\n\004jo" +
      "bs\030\001 \003(\0132#.google.cloud.scheduler.v1beta" +
      "1.Job\022\027\n\017next_page_token\030\002 \001(\t\"\035\n\rGetJob" +
      "Request\022\014\n\004name\030\001 \001(\t\"T\n\020CreateJobReques" +
      "t\022\016\n\006parent\030\001 \001(\t\0220\n\003job\030\002 \001(\0132#.google." +
      "cloud.scheduler.v1beta1.Job\"u\n\020UpdateJob" +
      "Request\0220\n\003job\030\001 \001(\0132#.google.cloud.sche" +
      "duler.v1beta1.Job\022/\n\013update_mask\030\002 \001(\0132\032" +
      ".google.protobuf.FieldMask\" \n\020DeleteJobR" +
      "equest\022\014\n\004name\030\001 \001(\t\"\037\n\017PauseJobRequest\022" +
      "\014\n\004name\030\001 \001(\t\" \n\020ResumeJobRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\"\035\n\rRunJobRequest\022\014\n\004name\030\001 \001(\t2\210" +
      "\n\n\016CloudScheduler\022\244\001\n\010ListJobs\022/.google." +
      "cloud.scheduler.v1beta1.ListJobsRequest\032" +
      "0.google.cloud.scheduler.v1beta1.ListJob" +
      "sResponse\"5\202\323\344\223\002/\022-/v1beta1/{parent=proj" +
      "ects/*/locations/*}/jobs\022\223\001\n\006GetJob\022-.go" +
      "ogle.cloud.scheduler.v1beta1.GetJobReque" +
      "st\032#.google.cloud.scheduler.v1beta1.Job\"" +
      "5\202\323\344\223\002/\022-/v1beta1/{name=projects/*/locat" +
      "ions/*/jobs/*}\022\236\001\n\tCreateJob\0220.google.cl" +
      "oud.scheduler.v1beta1.CreateJobRequest\032#" +
      ".google.cloud.scheduler.v1beta1.Job\":\202\323\344" +
      "\223\0024\"-/v1beta1/{parent=projects/*/locatio" +
      "ns/*}/jobs:\003job\022\242\001\n\tUpdateJob\0220.google.c" +
      "loud.scheduler.v1beta1.UpdateJobRequest\032" +
      "#.google.cloud.scheduler.v1beta1.Job\">\202\323" +
      "\344\223\002821/v1beta1/{job.name=projects/*/loca" +
      "tions/*/jobs/*}:\003job\022\214\001\n\tDeleteJob\0220.goo" +
      "gle.cloud.scheduler.v1beta1.DeleteJobReq" +
      "uest\032\026.google.protobuf.Empty\"5\202\323\344\223\002/*-/v" +
      "1beta1/{name=projects/*/locations/*/jobs" +
      "/*}\022\240\001\n\010PauseJob\022/.google.cloud.schedule" +
      "r.v1beta1.PauseJobRequest\032#.google.cloud" +
      ".scheduler.v1beta1.Job\">\202\323\344\223\0028\"3/v1beta1" +
      "/{name=projects/*/locations/*/jobs/*}:pa" +
      "use:\001*\022\243\001\n\tResumeJob\0220.google.cloud.sche" +
      "duler.v1beta1.ResumeJobRequest\032#.google." +
      "cloud.scheduler.v1beta1.Job\"?\202\323\344\223\0029\"4/v1" +
      "beta1/{name=projects/*/locations/*/jobs/" +
      "*}:resume:\001*\022\232\001\n\006RunJob\022-.google.cloud.s" +
      "cheduler.v1beta1.RunJobRequest\032#.google." +
      "cloud.scheduler.v1beta1.Job\"<\202\323\344\223\0026\"1/v1" +
      "beta1/{name=projects/*/locations/*/jobs/" +
      "*}:run:\001*B\177\n\"com.google.cloud.scheduler." +
      "v1beta1B\016SchedulerProtoP\001ZGgoogle.golang" +
      ".org/genproto/googleapis/cloud/scheduler" +
      "/v1beta1;schedulerb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.scheduler.v1beta1.JobProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor,
        new java.lang.String[] { "Jobs", "NextPageToken", });
    internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_descriptor,
        new java.lang.String[] { "Parent", "Job", });
    internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor,
        new java.lang.String[] { "Job", "UpdateMask", });
    internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.scheduler.v1beta1.JobProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
