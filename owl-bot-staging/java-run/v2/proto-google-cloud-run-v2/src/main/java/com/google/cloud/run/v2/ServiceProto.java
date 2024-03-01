// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.run.v2;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_CreateServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_CreateServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_UpdateServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_UpdateServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ListServicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ListServicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ListServicesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ListServicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_GetServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_GetServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_DeleteServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_DeleteServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Service_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Service_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Service_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Service_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!google/cloud/run/v2/service.proto\022\023goo" +
      "gle.cloud.run.v2\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\035google/api/lau" +
      "nch_stage.proto\032\031google/api/resource.pro" +
      "to\032\030google/api/routing.proto\032#google/clo" +
      "ud/run/v2/condition.proto\032+google/cloud/" +
      "run/v2/revision_template.proto\032(google/c" +
      "loud/run/v2/traffic_target.proto\032)google" +
      "/cloud/run/v2/vendor_settings.proto\032\036goo" +
      "gle/iam/v1/iam_policy.proto\032\032google/iam/" +
      "v1/policy.proto\032#google/longrunning/oper" +
      "ations.proto\032\037google/protobuf/timestamp." +
      "proto\"\256\001\n\024CreateServiceRequest\0222\n\006parent" +
      "\030\001 \001(\tB\"\340A\002\372A\034\022\032run.googleapis.com/Servi" +
      "ce\0222\n\007service\030\002 \001(\0132\034.google.cloud.run.v" +
      "2.ServiceB\003\340A\002\022\027\n\nservice_id\030\003 \001(\tB\003\340A\002\022" +
      "\025\n\rvalidate_only\030\004 \001(\010\"x\n\024UpdateServiceR" +
      "equest\0222\n\007service\030\001 \001(\0132\034.google.cloud.r" +
      "un.v2.ServiceB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(" +
      "\010\022\025\n\rallow_missing\030\004 \001(\010\"\206\001\n\023ListService" +
      "sRequest\0222\n\006parent\030\001 \001(\tB\"\340A\002\372A\034\022\032run.go" +
      "ogleapis.com/Service\022\021\n\tpage_size\030\002 \001(\005\022" +
      "\022\n\npage_token\030\003 \001(\t\022\024\n\014show_deleted\030\004 \001(" +
      "\010\"_\n\024ListServicesResponse\022.\n\010services\030\001 " +
      "\003(\0132\034.google.cloud.run.v2.Service\022\027\n\017nex" +
      "t_page_token\030\002 \001(\t\"E\n\021GetServiceRequest\022" +
      "0\n\004name\030\001 \001(\tB\"\340A\002\372A\034\n\032run.googleapis.co" +
      "m/Service\"m\n\024DeleteServiceRequest\0220\n\004nam" +
      "e\030\001 \001(\tB\"\340A\002\372A\034\n\032run.googleapis.com/Serv" +
      "ice\022\025\n\rvalidate_only\030\002 \001(\010\022\014\n\004etag\030\003 \001(\t" +
      "\"\316\013\n\007Service\022\014\n\004name\030\001 \001(\t\022\023\n\013descriptio" +
      "n\030\002 \001(\t\022\020\n\003uid\030\003 \001(\tB\003\340A\003\022\027\n\ngeneration\030" +
      "\004 \001(\003B\003\340A\003\0228\n\006labels\030\005 \003(\0132(.google.clou" +
      "d.run.v2.Service.LabelsEntry\022B\n\013annotati" +
      "ons\030\006 \003(\0132-.google.cloud.run.v2.Service." +
      "AnnotationsEntry\0224\n\013create_time\030\007 \001(\0132\032." +
      "google.protobuf.TimestampB\003\340A\003\0224\n\013update" +
      "_time\030\010 \001(\0132\032.google.protobuf.TimestampB" +
      "\003\340A\003\0224\n\013delete_time\030\t \001(\0132\032.google.proto" +
      "buf.TimestampB\003\340A\003\0224\n\013expire_time\030\n \001(\0132" +
      "\032.google.protobuf.TimestampB\003\340A\003\022\024\n\007crea" +
      "tor\030\013 \001(\tB\003\340A\003\022\032\n\rlast_modifier\030\014 \001(\tB\003\340" +
      "A\003\022\016\n\006client\030\r \001(\t\022\026\n\016client_version\030\016 \001" +
      "(\t\0224\n\007ingress\030\017 \001(\0162#.google.cloud.run.v" +
      "2.IngressTraffic\022-\n\014launch_stage\030\020 \001(\0162\027" +
      ".google.api.LaunchStage\022F\n\024binary_author" +
      "ization\030\021 \001(\0132(.google.cloud.run.v2.Bina" +
      "ryAuthorization\022<\n\010template\030\022 \001(\0132%.goog" +
      "le.cloud.run.v2.RevisionTemplateB\003\340A\002\0223\n" +
      "\007traffic\030\023 \003(\0132\".google.cloud.run.v2.Tra" +
      "fficTarget\022 \n\023observed_generation\030\036 \001(\003B" +
      "\003\340A\003\022?\n\022terminal_condition\030\037 \001(\0132\036.googl" +
      "e.cloud.run.v2.ConditionB\003\340A\003\0227\n\nconditi" +
      "ons\030  \003(\0132\036.google.cloud.run.v2.Conditio" +
      "nB\003\340A\003\022B\n\025latest_ready_revision\030! \001(\tB#\340" +
      "A\003\372A\035\n\033run.googleapis.com/Revision\022D\n\027la" +
      "test_created_revision\030\" \001(\tB#\340A\003\372A\035\n\033run" +
      ".googleapis.com/Revision\022G\n\020traffic_stat" +
      "uses\030# \003(\0132(.google.cloud.run.v2.Traffic" +
      "TargetStatusB\003\340A\003\022\020\n\003uri\030$ \001(\tB\003\340A\003\022\030\n\020c" +
      "ustom_audiences\030% \003(\t\022\032\n\rsatisfies_pzs\030&" +
      " \001(\010B\003\340A\003\022\030\n\013reconciling\030b \001(\010B\003\340A\003\022\021\n\004e" +
      "tag\030c \001(\tB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0322\n\020AnnotationsEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:^\352A[\n\032" +
      "run.googleapis.com/Service\022:projects/{pr" +
      "oject}/locations/{location}/services/{se" +
      "rvice}R\001\0012\267\r\n\010Services\022\375\001\n\rCreateService" +
      "\022).google.cloud.run.v2.CreateServiceRequ" +
      "est\032\035.google.longrunning.Operation\"\241\001\312A\022" +
      "\n\007Service\022\007Service\332A\031parent,service,serv" +
      "ice_id\202\323\344\223\0027\",/v2/{parent=projects/*/loc" +
      "ations/*}/services:\007service\212\323\344\223\002-\022+\n\006par" +
      "ent\022!projects/*/locations/{location=*}\022\303" +
      "\001\n\nGetService\022&.google.cloud.run.v2.GetS" +
      "erviceRequest\032\034.google.cloud.run.v2.Serv" +
      "ice\"o\332A\004name\202\323\344\223\002.\022,/v2/{name=projects/*" +
      "/locations/*/services/*}\212\323\344\223\002.\022,\n\004name\022$" +
      "projects/*/locations/{location=*}/**\022\325\001\n" +
      "\014ListServices\022(.google.cloud.run.v2.List" +
      "ServicesRequest\032).google.cloud.run.v2.Li" +
      "stServicesResponse\"p\332A\006parent\202\323\344\223\002.\022,/v2" +
      "/{parent=projects/*/locations/*}/service" +
      "s\212\323\344\223\002-\022+\n\006parent\022!projects/*/locations/" +
      "{location=*}\022\374\001\n\rUpdateService\022).google." +
      "cloud.run.v2.UpdateServiceRequest\032\035.goog" +
      "le.longrunning.Operation\"\240\001\312A\022\n\007Service\022" +
      "\007Service\332A\007service\202\323\344\223\002?24/v2/{service.n" +
      "ame=projects/*/locations/*/services/*}:\007" +
      "service\212\323\344\223\0026\0224\n\014service.name\022$projects/" +
      "*/locations/{location=*}/**\022\340\001\n\rDeleteSe" +
      "rvice\022).google.cloud.run.v2.DeleteServic" +
      "eRequest\032\035.google.longrunning.Operation\"" +
      "\204\001\312A\022\n\007Service\022\007Service\332A\004name\202\323\344\223\002.*,/v" +
      "2/{name=projects/*/locations/*/services/" +
      "*}\212\323\344\223\002.\022,\n\004name\022$projects/*/locations/{" +
      "location=*}/**\022\220\001\n\014GetIamPolicy\022\".google" +
      ".iam.v1.GetIamPolicyRequest\032\025.google.iam" +
      ".v1.Policy\"E\202\323\344\223\002?\022=/v2/{resource=projec" +
      "ts/*/locations/*/services/*}:getIamPolic" +
      "y\022\223\001\n\014SetIamPolicy\022\".google.iam.v1.SetIa" +
      "mPolicyRequest\032\025.google.iam.v1.Policy\"H\202" +
      "\323\344\223\002B\"=/v2/{resource=projects/*/location" +
      "s/*/services/*}:setIamPolicy:\001*\022\271\001\n\022Test" +
      "IamPermissions\022(.google.iam.v1.TestIamPe" +
      "rmissionsRequest\032).google.iam.v1.TestIam" +
      "PermissionsResponse\"N\202\323\344\223\002H\"C/v2/{resour" +
      "ce=projects/*/locations/*/services/*}:te" +
      "stIamPermissions:\001*\032F\312A\022run.googleapis.c" +
      "om\322A.https://www.googleapis.com/auth/clo" +
      "ud-platformBT\n\027com.google.cloud.run.v2B\014" +
      "ServiceProtoP\001Z)cloud.google.com/go/run/" +
      "apiv2/runpb;runpbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.LaunchStageProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.RoutingProto.getDescriptor(),
          com.google.cloud.run.v2.ConditionProto.getDescriptor(),
          com.google.cloud.run.v2.RevisionTemplateProto.getDescriptor(),
          com.google.cloud.run.v2.TrafficTargetProto.getDescriptor(),
          com.google.cloud.run.v2.VendorSettingsProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_run_v2_CreateServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_CreateServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_CreateServiceRequest_descriptor,
        new java.lang.String[] { "Parent", "Service", "ServiceId", "ValidateOnly", });
    internal_static_google_cloud_run_v2_UpdateServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_run_v2_UpdateServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_UpdateServiceRequest_descriptor,
        new java.lang.String[] { "Service", "ValidateOnly", "AllowMissing", });
    internal_static_google_cloud_run_v2_ListServicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_run_v2_ListServicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ListServicesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "ShowDeleted", });
    internal_static_google_cloud_run_v2_ListServicesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_run_v2_ListServicesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ListServicesResponse_descriptor,
        new java.lang.String[] { "Services", "NextPageToken", });
    internal_static_google_cloud_run_v2_GetServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_run_v2_GetServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_GetServiceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_run_v2_DeleteServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_run_v2_DeleteServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_DeleteServiceRequest_descriptor,
        new java.lang.String[] { "Name", "ValidateOnly", "Etag", });
    internal_static_google_cloud_run_v2_Service_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_run_v2_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Service_descriptor,
        new java.lang.String[] { "Name", "Description", "Uid", "Generation", "Labels", "Annotations", "CreateTime", "UpdateTime", "DeleteTime", "ExpireTime", "Creator", "LastModifier", "Client", "ClientVersion", "Ingress", "LaunchStage", "BinaryAuthorization", "Template", "Traffic", "ObservedGeneration", "TerminalCondition", "Conditions", "LatestReadyRevision", "LatestCreatedRevision", "TrafficStatuses", "Uri", "CustomAudiences", "SatisfiesPzs", "Reconciling", "Etag", });
    internal_static_google_cloud_run_v2_Service_LabelsEntry_descriptor =
      internal_static_google_cloud_run_v2_Service_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_run_v2_Service_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Service_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_run_v2_Service_AnnotationsEntry_descriptor =
      internal_static_google_cloud_run_v2_Service_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_run_v2_Service_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Service_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.api.RoutingProto.routing);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.RoutingProto.getDescriptor();
    com.google.cloud.run.v2.ConditionProto.getDescriptor();
    com.google.cloud.run.v2.RevisionTemplateProto.getDescriptor();
    com.google.cloud.run.v2.TrafficTargetProto.getDescriptor();
    com.google.cloud.run.v2.VendorSettingsProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
