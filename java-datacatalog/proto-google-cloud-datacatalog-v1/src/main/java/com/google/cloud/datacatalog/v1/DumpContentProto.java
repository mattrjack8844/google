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
// source: google/cloud/datacatalog/v1/dump_content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public final class DumpContentProto {
  private DumpContentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TaggedEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TaggedEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_DumpItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DumpItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/datacatalog/v1/dump_conte"
          + "nt.proto\022\033google.cloud.datacatalog.v1\032\037g"
          + "oogle/api/field_behavior.proto\032-google/c"
          + "loud/datacatalog/v1/datacatalog.proto\032&g"
          + "oogle/cloud/datacatalog/v1/tags.proto\"\307\001"
          + "\n\013TaggedEntry\0226\n\010v1_entry\030\001 \001(\0132\".google"
          + ".cloud.datacatalog.v1.EntryH\000\022;\n\014present"
          + "_tags\030\002 \003(\0132 .google.cloud.datacatalog.v"
          + "1.TagB\003\340A\001\022:\n\013absent_tags\030\003 \003(\0132 .google"
          + ".cloud.datacatalog.v1.TagB\003\340A\001B\007\n\005entry\""
          + "T\n\010DumpItem\022@\n\014tagged_entry\030\001 \001(\0132(.goog"
          + "le.cloud.datacatalog.v1.TaggedEntryH\000B\006\n"
          + "\004itemB\330\001\n\037com.google.cloud.datacatalog.v"
          + "1B\020DumpContentProtoP\001ZAcloud.google.com/"
          + "go/datacatalog/apiv1/datacatalogpb;datac"
          + "atalogpb\370\001\001\252\002\033Google.Cloud.DataCatalog.V"
          + "1\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036Google"
          + "::Cloud::DataCatalog::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.datacatalog.v1.Datacatalog.getDescriptor(),
              com.google.cloud.datacatalog.v1.Tags.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_TaggedEntry_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_TaggedEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TaggedEntry_descriptor,
            new java.lang.String[] {
              "V1Entry", "PresentTags", "AbsentTags", "Entry",
            });
    internal_static_google_cloud_datacatalog_v1_DumpItem_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_DumpItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_DumpItem_descriptor,
            new java.lang.String[] {
              "TaggedEntry", "Item",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.datacatalog.v1.Datacatalog.getDescriptor();
    com.google.cloud.datacatalog.v1.Tags.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
