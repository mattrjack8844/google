// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/processing.proto

package com.google.cloud.dataplex.v1;

public final class ProcessingProto {
  private ProcessingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_Trigger_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Trigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_Trigger_OnDemand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Trigger_OnDemand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_Trigger_Schedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Trigger_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_DataSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_ScannedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ScannedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_ScannedData_IncrementalField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ScannedData_IncrementalField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/dataplex/v1/processing.pr" +
      "oto\022\030google.cloud.dataplex.v1\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\276\001\n\007Trigger\022?\n\ton_demand\030d \001(\013" +
      "2*.google.cloud.dataplex.v1.Trigger.OnDe" +
      "mandH\000\022>\n\010schedule\030e \001(\0132*.google.cloud." +
      "dataplex.v1.Trigger.ScheduleH\000\032\n\n\010OnDema" +
      "nd\032\036\n\010Schedule\022\022\n\004cron\030\001 \001(\tB\004\342A\001\002B\006\n\004mo" +
      "de\"k\n\nDataSource\0229\n\006entity\030d \001(\tB\'\342A\001\005\372A" +
      " \n\036dataplex.googleapis.com/EntityH\000\022\030\n\010r" +
      "esource\030e \001(\tB\004\342A\001\005H\000B\010\n\006source\"\257\001\n\013Scan" +
      "nedData\022S\n\021incremental_field\030\001 \001(\01326.goo" +
      "gle.cloud.dataplex.v1.ScannedData.Increm" +
      "entalFieldH\000\032=\n\020IncrementalField\022\r\n\005fiel" +
      "d\030\001 \001(\t\022\r\n\005start\030\002 \001(\t\022\013\n\003end\030\003 \001(\tB\014\n\nd" +
      "ata_rangeBk\n\034com.google.cloud.dataplex.v" +
      "1B\017ProcessingProtoP\001Z8cloud.google.com/g" +
      "o/dataplex/apiv1/dataplexpb;dataplexpbb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_dataplex_v1_Trigger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Trigger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_Trigger_descriptor,
        new java.lang.String[] { "OnDemand", "Schedule", "Mode", });
    internal_static_google_cloud_dataplex_v1_Trigger_OnDemand_descriptor =
      internal_static_google_cloud_dataplex_v1_Trigger_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Trigger_OnDemand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_Trigger_OnDemand_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_dataplex_v1_Trigger_Schedule_descriptor =
      internal_static_google_cloud_dataplex_v1_Trigger_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_Trigger_Schedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_Trigger_Schedule_descriptor,
        new java.lang.String[] { "Cron", });
    internal_static_google_cloud_dataplex_v1_DataSource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_DataSource_descriptor,
        new java.lang.String[] { "Entity", "Resource", "Source", });
    internal_static_google_cloud_dataplex_v1_ScannedData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_ScannedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_ScannedData_descriptor,
        new java.lang.String[] { "IncrementalField", "DataRange", });
    internal_static_google_cloud_dataplex_v1_ScannedData_IncrementalField_descriptor =
      internal_static_google_cloud_dataplex_v1_ScannedData_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_ScannedData_IncrementalField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_ScannedData_IncrementalField_descriptor,
        new java.lang.String[] { "Field", "Start", "End", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
