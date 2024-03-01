// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1/services.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.transcoder.v1;

public final class ServicesProto {
  private ServicesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_CreateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_ListJobsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_GetJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_DeleteJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_ListJobsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_CreateJobTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_CreateJobTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_GetJobTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_GetJobTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_DeleteJobTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_DeleteJobTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/video/transcoder/v1/servi" +
      "ces.proto\022 google.cloud.video.transcoder" +
      ".v1\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\0320" +
      "google/cloud/video/transcoder/v1/resourc" +
      "es.proto\032\033google/protobuf/empty.proto\"\206\001" +
      "\n\020CreateJobRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372" +
      "A#\n!locations.googleapis.com/Location\0227\n" +
      "\003job\030\002 \001(\0132%.google.cloud.video.transcod" +
      "er.v1.JobB\003\340A\002\"\225\001\n\017ListJobsRequest\0229\n\006pa" +
      "rent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis" +
      ".com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage" +
      "_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by" +
      "\030\005 \001(\t\"D\n\rGetJobRequest\0223\n\004name\030\001 \001(\tB%\340" +
      "A\002\372A\037\n\035transcoder.googleapis.com/Job\"^\n\020" +
      "DeleteJobRequest\0223\n\004name\030\001 \001(\tB%\340A\002\372A\037\n\035" +
      "transcoder.googleapis.com/Job\022\025\n\rallow_m" +
      "issing\030\002 \001(\010\"u\n\020ListJobsResponse\0223\n\004jobs" +
      "\030\001 \003(\0132%.google.cloud.video.transcoder.v" +
      "1.Job\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreac" +
      "hable\030\003 \003(\t\"\275\001\n\030CreateJobTemplateRequest" +
      "\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.goog" +
      "leapis.com/Location\022H\n\014job_template\030\002 \001(" +
      "\0132-.google.cloud.video.transcoder.v1.Job" +
      "TemplateB\003\340A\002\022\034\n\017job_template_id\030\003 \001(\tB\003" +
      "\340A\002\"\235\001\n\027ListJobTemplatesRequest\0229\n\006paren" +
      "t\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis.co" +
      "m/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_to" +
      "ken\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 " +
      "\001(\t\"T\n\025GetJobTemplateRequest\022;\n\004name\030\001 \001" +
      "(\tB-\340A\002\372A\'\n%transcoder.googleapis.com/Jo" +
      "bTemplate\"n\n\030DeleteJobTemplateRequest\022;\n" +
      "\004name\030\001 \001(\tB-\340A\002\372A\'\n%transcoder.googleap" +
      "is.com/JobTemplate\022\025\n\rallow_missing\030\002 \001(" +
      "\010\"\216\001\n\030ListJobTemplatesResponse\022D\n\rjob_te" +
      "mplates\030\001 \003(\0132-.google.cloud.video.trans" +
      "coder.v1.JobTemplate\022\027\n\017next_page_token\030" +
      "\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t2\222\014\n\021Transcode" +
      "rService\022\252\001\n\tCreateJob\0222.google.cloud.vi" +
      "deo.transcoder.v1.CreateJobRequest\032%.goo" +
      "gle.cloud.video.transcoder.v1.Job\"B\332A\npa" +
      "rent,job\202\323\344\223\002/\"(/v1/{parent=projects/*/l" +
      "ocations/*}/jobs:\003job\022\254\001\n\010ListJobs\0221.goo" +
      "gle.cloud.video.transcoder.v1.ListJobsRe" +
      "quest\0322.google.cloud.video.transcoder.v1" +
      ".ListJobsResponse\"9\332A\006parent\202\323\344\223\002*\022(/v1/" +
      "{parent=projects/*/locations/*}/jobs\022\231\001\n" +
      "\006GetJob\022/.google.cloud.video.transcoder." +
      "v1.GetJobRequest\032%.google.cloud.video.tr" +
      "anscoder.v1.Job\"7\332A\004name\202\323\344\223\002*\022(/v1/{nam" +
      "e=projects/*/locations/*/jobs/*}\022\220\001\n\tDel" +
      "eteJob\0222.google.cloud.video.transcoder.v" +
      "1.DeleteJobRequest\032\026.google.protobuf.Emp" +
      "ty\"7\332A\004name\202\323\344\223\002**(/v1/{name=projects/*/" +
      "locations/*/jobs/*}\022\354\001\n\021CreateJobTemplat" +
      "e\022:.google.cloud.video.transcoder.v1.Cre" +
      "ateJobTemplateRequest\032-.google.cloud.vid" +
      "eo.transcoder.v1.JobTemplate\"l\332A#parent," +
      "job_template,job_template_id\202\323\344\223\002@\"0/v1/" +
      "{parent=projects/*/locations/*}/jobTempl" +
      "ates:\014job_template\022\314\001\n\020ListJobTemplates\022" +
      "9.google.cloud.video.transcoder.v1.ListJ" +
      "obTemplatesRequest\032:.google.cloud.video." +
      "transcoder.v1.ListJobTemplatesResponse\"A" +
      "\332A\006parent\202\323\344\223\0022\0220/v1/{parent=projects/*/" +
      "locations/*}/jobTemplates\022\271\001\n\016GetJobTemp" +
      "late\0227.google.cloud.video.transcoder.v1." +
      "GetJobTemplateRequest\032-.google.cloud.vid" +
      "eo.transcoder.v1.JobTemplate\"?\332A\004name\202\323\344" +
      "\223\0022\0220/v1/{name=projects/*/locations/*/jo" +
      "bTemplates/*}\022\250\001\n\021DeleteJobTemplate\022:.go" +
      "ogle.cloud.video.transcoder.v1.DeleteJob" +
      "TemplateRequest\032\026.google.protobuf.Empty\"" +
      "?\332A\004name\202\323\344\223\0022*0/v1/{name=projects/*/loc" +
      "ations/*/jobTemplates/*}\032M\312A\031transcoder." +
      "googleapis.com\322A.https://www.googleapis." +
      "com/auth/cloud-platformB\352\001\n$com.google.c" +
      "loud.video.transcoder.v1B\rServicesProtoP" +
      "\001ZDcloud.google.com/go/video/transcoder/" +
      "apiv1/transcoderpb;transcoderpb\252\002 Google" +
      ".Cloud.Video.Transcoder.V1\312\002 Google\\Clou" +
      "d\\Video\\Transcoder\\V1\352\002$Google::Cloud::V" +
      "ideo::Transcoder::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.video.transcoder.v1.ResourcesProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_google_cloud_video_transcoder_v1_CreateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_video_transcoder_v1_CreateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_CreateJobRequest_descriptor,
        new java.lang.String[] { "Parent", "Job", });
    internal_static_google_cloud_video_transcoder_v1_ListJobsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_video_transcoder_v1_ListJobsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_ListJobsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_video_transcoder_v1_GetJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_video_transcoder_v1_GetJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_GetJobRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_video_transcoder_v1_DeleteJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_video_transcoder_v1_DeleteJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_DeleteJobRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_google_cloud_video_transcoder_v1_ListJobsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_video_transcoder_v1_ListJobsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_ListJobsResponse_descriptor,
        new java.lang.String[] { "Jobs", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_video_transcoder_v1_CreateJobTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_video_transcoder_v1_CreateJobTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_CreateJobTemplateRequest_descriptor,
        new java.lang.String[] { "Parent", "JobTemplate", "JobTemplateId", });
    internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_video_transcoder_v1_GetJobTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_video_transcoder_v1_GetJobTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_GetJobTemplateRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_video_transcoder_v1_DeleteJobTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_video_transcoder_v1_DeleteJobTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_DeleteJobTemplateRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_video_transcoder_v1_ListJobTemplatesResponse_descriptor,
        new java.lang.String[] { "JobTemplates", "NextPageToken", "Unreachable", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.video.transcoder.v1.ResourcesProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
