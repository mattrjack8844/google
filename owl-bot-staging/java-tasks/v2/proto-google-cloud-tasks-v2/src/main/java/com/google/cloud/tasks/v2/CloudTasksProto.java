// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/cloudtasks.proto

package com.google.cloud.tasks.v2;

public final class CloudTasksProto {
  private CloudTasksProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_ListQueuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_ListQueuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_ListQueuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_ListQueuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_GetQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_GetQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_CreateQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_CreateQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_UpdateQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_UpdateQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_DeleteQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_DeleteQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_PurgeQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_PurgeQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_PauseQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_PauseQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_ResumeQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_ResumeQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_ListTasksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_ListTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_ListTasksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_ListTasksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_GetTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_GetTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_CreateTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_CreateTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_DeleteTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_DeleteTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2_RunTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_RunTaskRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/tasks/v2/cloudtasks.proto" +
      "\022\025google.cloud.tasks.v2\032\034google/api/anno" +
      "tations.proto\032\027google/api/client.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032!google/cloud/tasks/v" +
      "2/queue.proto\032 google/cloud/tasks/v2/tas" +
      "k.proto\032\036google/iam/v1/iam_policy.proto\032" +
      "\032google/iam/v1/policy.proto\032\033google/prot" +
      "obuf/empty.proto\032 google/protobuf/field_" +
      "mask.proto\"\204\001\n\021ListQueuesRequest\0228\n\006pare" +
      "nt\030\001 \001(\tB(\342A\001\002\372A!\022\037cloudtasks.googleapis" +
      ".com/Queue\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030" +
      "\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"[\n\022ListQueuesR" +
      "esponse\022,\n\006queues\030\001 \003(\0132\034.google.cloud.t" +
      "asks.v2.Queue\022\027\n\017next_page_token\030\002 \001(\t\"I" +
      "\n\017GetQueueRequest\0226\n\004name\030\001 \001(\tB(\342A\001\002\372A!" +
      "\n\037cloudtasks.googleapis.com/Queue\"\201\001\n\022Cr" +
      "eateQueueRequest\0228\n\006parent\030\001 \001(\tB(\342A\001\002\372A" +
      "!\022\037cloudtasks.googleapis.com/Queue\0221\n\005qu" +
      "eue\030\002 \001(\0132\034.google.cloud.tasks.v2.QueueB" +
      "\004\342A\001\002\"x\n\022UpdateQueueRequest\0221\n\005queue\030\001 \001" +
      "(\0132\034.google.cloud.tasks.v2.QueueB\004\342A\001\002\022/" +
      "\n\013update_mask\030\002 \001(\0132\032.google.protobuf.Fi" +
      "eldMask\"L\n\022DeleteQueueRequest\0226\n\004name\030\001 " +
      "\001(\tB(\342A\001\002\372A!\n\037cloudtasks.googleapis.com/" +
      "Queue\"K\n\021PurgeQueueRequest\0226\n\004name\030\001 \001(\t" +
      "B(\342A\001\002\372A!\n\037cloudtasks.googleapis.com/Que" +
      "ue\"K\n\021PauseQueueRequest\0226\n\004name\030\001 \001(\tB(\342" +
      "A\001\002\372A!\n\037cloudtasks.googleapis.com/Queue\"" +
      "L\n\022ResumeQueueRequest\0226\n\004name\030\001 \001(\tB(\342A\001" +
      "\002\372A!\n\037cloudtasks.googleapis.com/Queue\"\253\001" +
      "\n\020ListTasksRequest\0227\n\006parent\030\001 \001(\tB\'\342A\001\002" +
      "\372A \022\036cloudtasks.googleapis.com/Task\0227\n\rr" +
      "esponse_view\030\002 \001(\0162 .google.cloud.tasks." +
      "v2.Task.View\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_" +
      "token\030\004 \001(\t\"X\n\021ListTasksResponse\022*\n\005task" +
      "s\030\001 \003(\0132\033.google.cloud.tasks.v2.Task\022\027\n\017" +
      "next_page_token\030\002 \001(\t\"\200\001\n\016GetTaskRequest" +
      "\0225\n\004name\030\001 \001(\tB\'\342A\001\002\372A \n\036cloudtasks.goog" +
      "leapis.com/Task\0227\n\rresponse_view\030\002 \001(\0162 " +
      ".google.cloud.tasks.v2.Task.View\"\266\001\n\021Cre" +
      "ateTaskRequest\0227\n\006parent\030\001 \001(\tB\'\342A\001\002\372A \022" +
      "\036cloudtasks.googleapis.com/Task\022/\n\004task\030" +
      "\002 \001(\0132\033.google.cloud.tasks.v2.TaskB\004\342A\001\002" +
      "\0227\n\rresponse_view\030\003 \001(\0162 .google.cloud.t" +
      "asks.v2.Task.View\"J\n\021DeleteTaskRequest\0225" +
      "\n\004name\030\001 \001(\tB\'\342A\001\002\372A \n\036cloudtasks.google" +
      "apis.com/Task\"\200\001\n\016RunTaskRequest\0225\n\004name" +
      "\030\001 \001(\tB\'\342A\001\002\372A \n\036cloudtasks.googleapis.c" +
      "om/Task\0227\n\rresponse_view\030\002 \001(\0162 .google." +
      "cloud.tasks.v2.Task.View2\335\024\n\nCloudTasks\022" +
      "\236\001\n\nListQueues\022(.google.cloud.tasks.v2.L" +
      "istQueuesRequest\032).google.cloud.tasks.v2" +
      ".ListQueuesResponse\";\332A\006parent\202\323\344\223\002,\022*/v" +
      "2/{parent=projects/*/locations/*}/queues" +
      "\022\213\001\n\010GetQueue\022&.google.cloud.tasks.v2.Ge" +
      "tQueueRequest\032\034.google.cloud.tasks.v2.Qu" +
      "eue\"9\332A\004name\202\323\344\223\002,\022*/v2/{name=projects/*" +
      "/locations/*/queues/*}\022\240\001\n\013CreateQueue\022)" +
      ".google.cloud.tasks.v2.CreateQueueReques" +
      "t\032\034.google.cloud.tasks.v2.Queue\"H\332A\014pare" +
      "nt,queue\202\323\344\223\0023\"*/v2/{parent=projects/*/l" +
      "ocations/*}/queues:\005queue\022\253\001\n\013UpdateQueu" +
      "e\022).google.cloud.tasks.v2.UpdateQueueReq" +
      "uest\032\034.google.cloud.tasks.v2.Queue\"S\332A\021q" +
      "ueue,update_mask\202\323\344\223\002920/v2/{queue.name=" +
      "projects/*/locations/*/queues/*}:\005queue\022" +
      "\213\001\n\013DeleteQueue\022).google.cloud.tasks.v2." +
      "DeleteQueueRequest\032\026.google.protobuf.Emp" +
      "ty\"9\332A\004name\202\323\344\223\002,**/v2/{name=projects/*/" +
      "locations/*/queues/*}\022\230\001\n\nPurgeQueue\022(.g" +
      "oogle.cloud.tasks.v2.PurgeQueueRequest\032\034" +
      ".google.cloud.tasks.v2.Queue\"B\332A\004name\202\323\344" +
      "\223\0025\"0/v2/{name=projects/*/locations/*/qu" +
      "eues/*}:purge:\001*\022\230\001\n\nPauseQueue\022(.google" +
      ".cloud.tasks.v2.PauseQueueRequest\032\034.goog" +
      "le.cloud.tasks.v2.Queue\"B\332A\004name\202\323\344\223\0025\"0" +
      "/v2/{name=projects/*/locations/*/queues/" +
      "*}:pause:\001*\022\233\001\n\013ResumeQueue\022).google.clo" +
      "ud.tasks.v2.ResumeQueueRequest\032\034.google." +
      "cloud.tasks.v2.Queue\"C\332A\004name\202\323\344\223\0026\"1/v2" +
      "/{name=projects/*/locations/*/queues/*}:" +
      "resume:\001*\022\234\001\n\014GetIamPolicy\022\".google.iam." +
      "v1.GetIamPolicyRequest\032\025.google.iam.v1.P" +
      "olicy\"Q\332A\010resource\202\323\344\223\002@\";/v2/{resource=" +
      "projects/*/locations/*/queues/*}:getIamP" +
      "olicy:\001*\022\243\001\n\014SetIamPolicy\022\".google.iam.v" +
      "1.SetIamPolicyRequest\032\025.google.iam.v1.Po" +
      "licy\"X\332A\017resource,policy\202\323\344\223\002@\";/v2/{res" +
      "ource=projects/*/locations/*/queues/*}:s" +
      "etIamPolicy:\001*\022\316\001\n\022TestIamPermissions\022(." +
      "google.iam.v1.TestIamPermissionsRequest\032" +
      ").google.iam.v1.TestIamPermissionsRespon" +
      "se\"c\332A\024resource,permissions\202\323\344\223\002F\"A/v2/{" +
      "resource=projects/*/locations/*/queues/*" +
      "}:testIamPermissions:\001*\022\243\001\n\tListTasks\022\'." +
      "google.cloud.tasks.v2.ListTasksRequest\032(" +
      ".google.cloud.tasks.v2.ListTasksResponse" +
      "\"C\332A\006parent\202\323\344\223\0024\0222/v2/{parent=projects/" +
      "*/locations/*/queues/*}/tasks\022\220\001\n\007GetTas" +
      "k\022%.google.cloud.tasks.v2.GetTaskRequest" +
      "\032\033.google.cloud.tasks.v2.Task\"A\332A\004name\202\323" +
      "\344\223\0024\0222/v2/{name=projects/*/locations/*/q" +
      "ueues/*/tasks/*}\022\240\001\n\nCreateTask\022(.google" +
      ".cloud.tasks.v2.CreateTaskRequest\032\033.goog" +
      "le.cloud.tasks.v2.Task\"K\332A\013parent,task\202\323" +
      "\344\223\0027\"2/v2/{parent=projects/*/locations/*" +
      "/queues/*}/tasks:\001*\022\221\001\n\nDeleteTask\022(.goo" +
      "gle.cloud.tasks.v2.DeleteTaskRequest\032\026.g" +
      "oogle.protobuf.Empty\"A\332A\004name\202\323\344\223\0024*2/v2" +
      "/{name=projects/*/locations/*/queues/*/t" +
      "asks/*}\022\227\001\n\007RunTask\022%.google.cloud.tasks" +
      ".v2.RunTaskRequest\032\033.google.cloud.tasks." +
      "v2.Task\"H\332A\004name\202\323\344\223\002;\"6/v2/{name=projec" +
      "ts/*/locations/*/queues/*/tasks/*}:run:\001" +
      "*\032M\312A\031cloudtasks.googleapis.com\322A.https:" +
      "//www.googleapis.com/auth/cloud-platform" +
      "Bv\n\031com.google.cloud.tasks.v2B\017CloudTask" +
      "sProtoP\001Z>cloud.google.com/go/cloudtasks" +
      "/apiv2/cloudtaskspb;cloudtaskspb\242\002\005TASKS" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.tasks.v2.QueueProto.getDescriptor(),
          com.google.cloud.tasks.v2.TaskProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_tasks_v2_ListQueuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2_ListQueuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_ListQueuesRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", });
    internal_static_google_cloud_tasks_v2_ListQueuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2_ListQueuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_ListQueuesResponse_descriptor,
        new java.lang.String[] { "Queues", "NextPageToken", });
    internal_static_google_cloud_tasks_v2_GetQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2_GetQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_GetQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2_CreateQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_tasks_v2_CreateQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_CreateQueueRequest_descriptor,
        new java.lang.String[] { "Parent", "Queue", });
    internal_static_google_cloud_tasks_v2_UpdateQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_tasks_v2_UpdateQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_UpdateQueueRequest_descriptor,
        new java.lang.String[] { "Queue", "UpdateMask", });
    internal_static_google_cloud_tasks_v2_DeleteQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_tasks_v2_DeleteQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_DeleteQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2_PurgeQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_tasks_v2_PurgeQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_PurgeQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2_PauseQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_tasks_v2_PauseQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_PauseQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2_ResumeQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_tasks_v2_ResumeQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_ResumeQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2_ListTasksRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_tasks_v2_ListTasksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_ListTasksRequest_descriptor,
        new java.lang.String[] { "Parent", "ResponseView", "PageSize", "PageToken", });
    internal_static_google_cloud_tasks_v2_ListTasksResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_tasks_v2_ListTasksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_ListTasksResponse_descriptor,
        new java.lang.String[] { "Tasks", "NextPageToken", });
    internal_static_google_cloud_tasks_v2_GetTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_tasks_v2_GetTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_GetTaskRequest_descriptor,
        new java.lang.String[] { "Name", "ResponseView", });
    internal_static_google_cloud_tasks_v2_CreateTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_tasks_v2_CreateTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_CreateTaskRequest_descriptor,
        new java.lang.String[] { "Parent", "Task", "ResponseView", });
    internal_static_google_cloud_tasks_v2_DeleteTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_tasks_v2_DeleteTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_DeleteTaskRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2_RunTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_tasks_v2_RunTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2_RunTaskRequest_descriptor,
        new java.lang.String[] { "Name", "ResponseView", });
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
    com.google.cloud.tasks.v2.QueueProto.getDescriptor();
    com.google.cloud.tasks.v2.TaskProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
