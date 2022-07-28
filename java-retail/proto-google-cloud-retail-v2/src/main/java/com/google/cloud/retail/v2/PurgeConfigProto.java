/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/retail/v2/purge_config.proto

package com.google.cloud.retail.v2;

public final class PurgeConfigProto {
  private PurgeConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PurgeMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PurgeMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PurgeUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PurgeUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PurgeUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PurgeUserEventsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/retail/v2/purge_config.pr"
          + "oto\022\026google.cloud.retail.v2\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\"\017\n\rPurgeMetadata\"s\n\026PurgeUserEve"
          + "ntsRequest\0225\n\006parent\030\001 \001(\tB%\340A\002\372A\037\n\035reta"
          + "il.googleapis.com/Catalog\022\023\n\006filter\030\002 \001("
          + "\tB\003\340A\002\022\r\n\005force\030\003 \001(\010\"6\n\027PurgeUserEvents"
          + "Response\022\033\n\023purged_events_count\030\001 \001(\003B\305\001"
          + "\n\032com.google.cloud.retail.v2B\020PurgeConfi"
          + "gProtoP\001Z<google.golang.org/genproto/goo"
          + "gleapis/cloud/retail/v2;retail\242\002\006RETAIL\252"
          + "\002\026Google.Cloud.Retail.V2\312\002\026Google\\Cloud\\"
          + "Retail\\V2\352\002\031Google::Cloud::Retail::V2b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_PurgeMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_PurgeMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PurgeMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_retail_v2_PurgeUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_PurgeUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PurgeUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "Force",
            });
    internal_static_google_cloud_retail_v2_PurgeUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_PurgeUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PurgeUserEventsResponse_descriptor,
            new java.lang.String[] {
              "PurgedEventsCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
