/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/baremetalsolution/v2/lun.proto

package com.google.cloud.baremetalsolution.v2;

public final class LunProto {
  private LunProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_Lun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Lun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_EvictLunRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_EvictLunRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/baremetalsolution/v2/lun."
          + "proto\022!google.cloud.baremetalsolution.v2"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\340\006\n\003Lun\022\022\n\004name\030\001 \001(\tB\004\342A\001"
          + "\003\022\n\n\002id\030\n \001(\t\022;\n\005state\030\002 \001(\0162,.google.cl"
          + "oud.baremetalsolution.v2.Lun.State\022\017\n\007si"
          + "ze_gb\030\003 \001(\003\022T\n\022multiprotocol_type\030\004 \001(\0162"
          + "8.google.cloud.baremetalsolution.v2.Lun."
          + "MultiprotocolType\022D\n\016storage_volume\030\005 \001("
          + "\tB,\372A)\n\'baremetalsolution.googleapis.com"
          + "/Volume\022\021\n\tshareable\030\006 \001(\010\022\020\n\010boot_lun\030\007"
          + " \001(\010\022H\n\014storage_type\030\010 \001(\01622.google.clou"
          + "d.baremetalsolution.v2.Lun.StorageType\022\014"
          + "\n\004wwid\030\t \001(\t\0225\n\013expire_time\030\013 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\004\342A\001\003\022E\n\tinstances"
          + "\030\014 \003(\tB2\342A\001\003\372A+\n)baremetalsolution.googl"
          + "eapis.com/Instance\"a\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\014\n\010CREATING\020\001\022\014\n\010UPDATING\020\002\022\t"
          + "\n\005READY\020\003\022\014\n\010DELETING\020\004\022\014\n\010COOL_OFF\020\005\"B\n"
          + "\021MultiprotocolType\022\"\n\036MULTIPROTOCOL_TYPE"
          + "_UNSPECIFIED\020\000\022\t\n\005LINUX\020\001\"=\n\013StorageType"
          + "\022\034\n\030STORAGE_TYPE_UNSPECIFIED\020\000\022\007\n\003SSD\020\001\022"
          + "\007\n\003HDD\020\002:n\352Ak\n$baremetalsolution.googlea"
          + "pis.com/Lun\022Cprojects/{project}/location"
          + "s/{location}/volumes/{volume}/luns/{lun}"
          + "\"L\n\rGetLunRequest\022;\n\004name\030\001 \001(\tB-\342A\001\002\372A&"
          + "\n$baremetalsolution.googleapis.com/Lun\"z"
          + "\n\017ListLunsRequest\022@\n\006parent\030\001 \001(\tB0\342A\001\002\372"
          + "A)\n\'baremetalsolution.googleapis.com/Vol"
          + "ume\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001"
          + "(\t\"v\n\020ListLunsResponse\0224\n\004luns\030\001 \003(\0132&.g"
          + "oogle.cloud.baremetalsolution.v2.Lun\022\027\n\017"
          + "next_page_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003"
          + "(\t\"N\n\017EvictLunRequest\022;\n\004name\030\001 \001(\tB-\342A\001"
          + "\002\372A&\n$baremetalsolution.googleapis.com/L"
          + "unB\367\001\n%com.google.cloud.baremetalsolutio"
          + "n.v2B\010LunProtoP\001ZScloud.google.com/go/ba"
          + "remetalsolution/apiv2/baremetalsolutionp"
          + "b;baremetalsolutionpb\252\002!Google.Cloud.Bar"
          + "eMetalSolution.V2\312\002!Google\\Cloud\\BareMet"
          + "alSolution\\V2\352\002$Google::Cloud::BareMetal"
          + "Solution::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_Lun_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_Lun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_Lun_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "State",
              "SizeGb",
              "MultiprotocolType",
              "StorageVolume",
              "Shareable",
              "BootLun",
              "StorageType",
              "Wwid",
              "ExpireTime",
              "Instances",
            });
    internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_descriptor,
            new java.lang.String[] {
              "Luns", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_baremetalsolution_v2_EvictLunRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_baremetalsolution_v2_EvictLunRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_EvictLunRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
