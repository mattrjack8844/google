// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1/target.proto

package com.google.cloud.scheduler.v1;

public final class TargetProto {
  private TargetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_HttpTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_HttpTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_HttpTarget_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_HttpTarget_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_PubsubTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_PubsubTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_PubsubTarget_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_PubsubTarget_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_AppEngineRouting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_AppEngineRouting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/scheduler/v1/target.proto"
          + "\022\031google.cloud.scheduler.v1\032\034google/api/"
          + "annotations.proto\032\031google/protobuf/any.p"
          + "roto\"\330\001\n\nHttpTarget\022\013\n\003uri\030\001 \001(\t\022:\n\013http"
          + "_method\030\002 \001(\0162%.google.cloud.scheduler.v"
          + "1.HttpMethod\022C\n\007headers\030\003 \003(\01322.google.c"
          + "loud.scheduler.v1.HttpTarget.HeadersEntr"
          + "y\022\014\n\004body\030\004 \001(\014\032.\n\014HeadersEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\274\002\n\023AppEngineHtt"
          + "pTarget\022:\n\013http_method\030\001 \001(\0162%.google.cl"
          + "oud.scheduler.v1.HttpMethod\022G\n\022app_engin"
          + "e_routing\030\002 \001(\0132+.google.cloud.scheduler"
          + ".v1.AppEngineRouting\022\024\n\014relative_uri\030\003 \001"
          + "(\t\022L\n\007headers\030\004 \003(\0132;.google.cloud.sched"
          + "uler.v1.AppEngineHttpTarget.HeadersEntry"
          + "\022\014\n\004body\030\005 \001(\014\032.\n\014HeadersEntry\022\013\n\003key\030\001 "
          + "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\260\001\n\014PubsubTarget\022"
          + "\022\n\ntopic_name\030\001 \001(\t\022\014\n\004data\030\003 \001(\014\022K\n\natt"
          + "ributes\030\004 \003(\01327.google.cloud.scheduler.v"
          + "1.PubsubTarget.AttributesEntry\0321\n\017Attrib"
          + "utesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028"
          + "\001\"T\n\020AppEngineRouting\022\017\n\007service\030\001 \001(\t\022\017"
          + "\n\007version\030\002 \001(\t\022\020\n\010instance\030\003 \001(\t\022\014\n\004hos"
          + "t\030\004 \001(\t*s\n\nHttpMethod\022\033\n\027HTTP_METHOD_UNS"
          + "PECIFIED\020\000\022\010\n\004POST\020\001\022\007\n\003GET\020\002\022\010\n\004HEAD\020\003\022"
          + "\007\n\003PUT\020\004\022\n\n\006DELETE\020\005\022\t\n\005PATCH\020\006\022\013\n\007OPTIO"
          + "NS\020\007Br\n\035com.google.cloud.scheduler.v1B\013T"
          + "argetProtoP\001ZBgoogle.golang.org/genproto"
          + "/googleapis/cloud/scheduler/v1;scheduler"
          + "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_scheduler_v1_HttpTarget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_scheduler_v1_HttpTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_HttpTarget_descriptor,
            new java.lang.String[] {
              "Uri", "HttpMethod", "Headers", "Body",
            });
    internal_static_google_cloud_scheduler_v1_HttpTarget_HeadersEntry_descriptor =
        internal_static_google_cloud_scheduler_v1_HttpTarget_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_scheduler_v1_HttpTarget_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_HttpTarget_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_descriptor,
            new java.lang.String[] {
              "HttpMethod", "AppEngineRouting", "RelativeUri", "Headers", "Body",
            });
    internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_HeadersEntry_descriptor =
        internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_AppEngineHttpTarget_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_scheduler_v1_PubsubTarget_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_scheduler_v1_PubsubTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_PubsubTarget_descriptor,
            new java.lang.String[] {
              "TopicName", "Data", "Attributes",
            });
    internal_static_google_cloud_scheduler_v1_PubsubTarget_AttributesEntry_descriptor =
        internal_static_google_cloud_scheduler_v1_PubsubTarget_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_scheduler_v1_PubsubTarget_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_PubsubTarget_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_scheduler_v1_AppEngineRouting_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_scheduler_v1_AppEngineRouting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_AppEngineRouting_descriptor,
            new java.lang.String[] {
              "Service", "Version", "Instance", "Host",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
