// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/mutation_record.proto

package com.google.monitoring.v3;

public final class MutationRecordProto {
  private MutationRecordProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_MutationRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_MutationRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/monitoring/v3/mutation_record.p"
          + "roto\022\024google.monitoring.v3\032\037google/proto"
          + "buf/timestamp.proto\"U\n\016MutationRecord\022/\n"
          + "\013mutate_time\030\001 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022\022\n\nmutated_by\030\002 \001(\tB\253\001\n\030com.googl"
          + "e.monitoring.v3B\023MutationRecordProtoP\001Z>"
          + "google.golang.org/genproto/googleapis/mo"
          + "nitoring/v3;monitoring\252\002\032Google.Cloud.Mo"
          + "nitoring.V3\312\002\032Google\\Cloud\\Monitoring\\V3"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_MutationRecord_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_MutationRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_MutationRecord_descriptor,
            new java.lang.String[] {
              "MutateTime", "MutatedBy",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
