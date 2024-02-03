/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/retail/v2beta/purge_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public final class PurgeConfigProto {
  private PurgeConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PurgeMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PurgeMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PurgeUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PurgeUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PurgeUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PurgeUserEventsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/retail/v2beta/purge_confi"
          + "g.proto\022\032google.cloud.retail.v2beta\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\"\017\n\rPurgeMetadata\"u\n\026Purg"
          + "eUserEventsRequest\0226\n\006parent\030\001 \001(\tB&\342A\001\002"
          + "\372A\037\n\035retail.googleapis.com/Catalog\022\024\n\006fi"
          + "lter\030\002 \001(\tB\004\342A\001\002\022\r\n\005force\030\003 \001(\010\"6\n\027Purge"
          + "UserEventsResponse\022\033\n\023purged_events_coun"
          + "t\030\001 \001(\003B\317\001\n\036com.google.cloud.retail.v2be"
          + "taB\020PurgeConfigProtoP\001Z6cloud.google.com"
          + "/go/retail/apiv2beta/retailpb;retailpb\242\002"
          + "\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312\002\032G"
          + "oogle\\Cloud\\Retail\\V2beta\352\002\035Google::Clou"
          + "d::Retail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_PurgeMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_PurgeMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PurgeMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_retail_v2beta_PurgeUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_PurgeUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PurgeUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "Force",
            });
    internal_static_google_cloud_retail_v2beta_PurgeUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_PurgeUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PurgeUserEventsResponse_descriptor,
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
