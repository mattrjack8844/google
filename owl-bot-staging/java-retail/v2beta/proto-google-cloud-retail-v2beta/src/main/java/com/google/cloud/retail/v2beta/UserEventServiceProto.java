// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/user_event_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public final class UserEventServiceProto {
  private UserEventServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/retail/v2beta/user_event_" +
      "service.proto\022\032google.cloud.retail.v2bet" +
      "a\032\034google/api/annotations.proto\032\027google/" +
      "api/client.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/httpbody.proto\032\031go" +
      "ogle/api/resource.proto\032.google/cloud/re" +
      "tail/v2beta/import_config.proto\032-google/" +
      "cloud/retail/v2beta/purge_config.proto\032+" +
      "google/cloud/retail/v2beta/user_event.pr" +
      "oto\032#google/longrunning/operations.proto" +
      "\"\201\001\n\025WriteUserEventRequest\022\023\n\006parent\030\001 \001" +
      "(\tB\003\340A\002\022>\n\nuser_event\030\002 \001(\0132%.google.clo" +
      "ud.retail.v2beta.UserEventB\003\340A\002\022\023\n\013write" +
      "_async\030\003 \001(\010\"\237\001\n\027CollectUserEventRequest" +
      "\022\027\n\rprebuilt_rule\030\006 \001(\tH\000\022\023\n\006parent\030\001 \001(" +
      "\tB\003\340A\002\022\027\n\nuser_event\030\002 \001(\tB\003\340A\002\022\013\n\003uri\030\003" +
      " \001(\t\022\013\n\003ets\030\004 \001(\003\022\020\n\010raw_json\030\005 \001(\tB\021\n\017c" +
      "onversion_rule\"\202\002\n\027RejoinUserEventsReque" +
      "st\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022i\n\027user_event_re" +
      "join_scope\030\002 \001(\0162H.google.cloud.retail.v" +
      "2beta.RejoinUserEventsRequest.UserEventR" +
      "ejoinScope\"g\n\024UserEventRejoinScope\022\'\n#US" +
      "ER_EVENT_REJOIN_SCOPE_UNSPECIFIED\020\000\022\021\n\rJ" +
      "OINED_EVENTS\020\001\022\023\n\017UNJOINED_EVENTS\020\002\">\n\030R" +
      "ejoinUserEventsResponse\022\"\n\032rejoined_user" +
      "_events_count\030\001 \001(\003\"\032\n\030RejoinUserEventsM" +
      "etadata2\373\t\n\020UserEventService\022\303\001\n\016WriteUs" +
      "erEvent\0221.google.cloud.retail.v2beta.Wri" +
      "teUserEventRequest\032%.google.cloud.retail" +
      ".v2beta.UserEvent\"W\202\323\344\223\002Q\"C/v2beta/{pare" +
      "nt=projects/*/locations/*/catalogs/*}/us" +
      "erEvents:write:\nuser_event\022\254\001\n\020CollectUs" +
      "erEvent\0223.google.cloud.retail.v2beta.Col" +
      "lectUserEventRequest\032\024.google.api.HttpBo" +
      "dy\"M\202\323\344\223\002G\022E/v2beta/{parent=projects/*/l" +
      "ocations/*/catalogs/*}/userEvents:collec" +
      "t\022\226\002\n\017PurgeUserEvents\0222.google.cloud.ret" +
      "ail.v2beta.PurgeUserEventsRequest\032\035.goog" +
      "le.longrunning.Operation\"\257\001\312A^\n2google.c" +
      "loud.retail.v2beta.PurgeUserEventsRespon" +
      "se\022(google.cloud.retail.v2beta.PurgeMeta" +
      "data\202\323\344\223\002H\"C/v2beta/{parent=projects/*/l" +
      "ocations/*/catalogs/*}/userEvents:purge:" +
      "\001*\022\233\002\n\020ImportUserEvents\0223.google.cloud.r" +
      "etail.v2beta.ImportUserEventsRequest\032\035.g" +
      "oogle.longrunning.Operation\"\262\001\312A`\n3googl" +
      "e.cloud.retail.v2beta.ImportUserEventsRe" +
      "sponse\022)google.cloud.retail.v2beta.Impor" +
      "tMetadata\202\323\344\223\002I\"D/v2beta/{parent=project" +
      "s/*/locations/*/catalogs/*}/userEvents:i" +
      "mport:\001*\022\357\001\n\020RejoinUserEvents\0223.google.c" +
      "loud.retail.v2beta.RejoinUserEventsReque" +
      "st\032\035.google.longrunning.Operation\"\206\001\312A4\n" +
      "\030RejoinUserEventsResponse\022\030RejoinUserEve" +
      "ntsMetadata\202\323\344\223\002I\"D/v2beta/{parent=proje" +
      "cts/*/locations/*/catalogs/*}/userEvents" +
      ":rejoin:\001*\032I\312A\025retail.googleapis.com\322A.h" +
      "ttps://www.googleapis.com/auth/cloud-pla" +
      "tformB\324\001\n\036com.google.cloud.retail.v2beta" +
      "B\025UserEventServiceProtoP\001Z6cloud.google." +
      "com/go/retail/apiv2beta/retailpb;retailp" +
      "b\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312" +
      "\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Google::C" +
      "loud::Retail::V2betab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.HttpBodyProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor(),
          com.google.cloud.retail.v2beta.PurgeConfigProto.getDescriptor(),
          com.google.cloud.retail.v2beta.UserEventProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor,
        new java.lang.String[] { "Parent", "UserEvent", "WriteAsync", });
    internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor,
        new java.lang.String[] { "PrebuiltRule", "Parent", "UserEvent", "Uri", "Ets", "RawJson", "ConversionRule", });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor,
        new java.lang.String[] { "Parent", "UserEventRejoinScope", });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor,
        new java.lang.String[] { "RejoinedUserEventsCount", });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor();
    com.google.cloud.retail.v2beta.PurgeConfigProto.getDescriptor();
    com.google.cloud.retail.v2beta.UserEventProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
