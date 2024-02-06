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
// source: google/cloud/datacatalog/v1beta1/search.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1beta1;

public final class Search {
  private Search() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/datacatalog/v1beta1/searc"
          + "h.proto\022 google.cloud.datacatalog.v1beta"
          + "1\032\037google/api/field_behavior.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\356\001\n\023SearchCa"
          + "talogResult\022N\n\022search_result_type\030\001 \001(\0162"
          + "2.google.cloud.datacatalog.v1beta1.Searc"
          + "hResultType\022\035\n\025search_result_subtype\030\002 \001"
          + "(\t\022\036\n\026relative_resource_name\030\003 \001(\t\022\027\n\017li"
          + "nked_resource\030\004 \001(\t\022/\n\013modify_time\030\007 \001(\013"
          + "2\032.google.protobuf.Timestamp*d\n\020SearchRe"
          + "sultType\022\"\n\036SEARCH_RESULT_TYPE_UNSPECIFI"
          + "ED\020\000\022\t\n\005ENTRY\020\001\022\020\n\014TAG_TEMPLATE\020\002\022\017\n\013ENT"
          + "RY_GROUP\020\003B\337\001\n$com.google.cloud.datacata"
          + "log.v1beta1P\001ZFcloud.google.com/go/datac"
          + "atalog/apiv1beta1/datacatalogpb;datacata"
          + "logpb\370\001\001\252\002 Google.Cloud.DataCatalog.V1Be"
          + "ta1\312\002 Google\\Cloud\\DataCatalog\\V1beta1\352\002"
          + "#Google::Cloud::DataCatalog::V1beta1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor,
            new java.lang.String[] {
              "SearchResultType",
              "SearchResultSubtype",
              "RelativeResourceName",
              "LinkedResource",
              "ModifyTime",
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
