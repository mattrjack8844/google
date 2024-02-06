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
// source: google/cloud/contentwarehouse/v1/synonymset.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

public final class SynonymSetProto {
  private SynonymSetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_SynonymSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_SynonymSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_SynonymSet_Synonym_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_SynonymSet_Synonym_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/contentwarehouse/v1/synon"
          + "ymset.proto\022 google.cloud.contentwarehou"
          + "se.v1\032\031google/api/resource.proto\"\375\001\n\nSyn"
          + "onymSet\022\014\n\004name\030\001 \001(\t\022\017\n\007context\030\002 \001(\t\022F"
          + "\n\010synonyms\030\003 \003(\01324.google.cloud.contentw"
          + "arehouse.v1.SynonymSet.Synonym\032\030\n\007Synony"
          + "m\022\r\n\005words\030\001 \003(\t:n\352Ak\n*contentwarehouse."
          + "googleapis.com/SynonymSet\022=projects/{pro"
          + "ject}/locations/{location}/synonymSets/{"
          + "context}B\367\001\n$com.google.cloud.contentwar"
          + "ehouse.v1B\017SynonymSetProtoP\001ZPcloud.goog"
          + "le.com/go/contentwarehouse/apiv1/content"
          + "warehousepb;contentwarehousepb\252\002 Google."
          + "Cloud.ContentWarehouse.V1\312\002 Google\\Cloud"
          + "\\ContentWarehouse\\V1\352\002#Google::Cloud::Co"
          + "ntentWarehouse::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_SynonymSet_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_SynonymSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_SynonymSet_descriptor,
            new java.lang.String[] {
              "Name", "Context", "Synonyms",
            });
    internal_static_google_cloud_contentwarehouse_v1_SynonymSet_Synonym_descriptor =
        internal_static_google_cloud_contentwarehouse_v1_SynonymSet_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_contentwarehouse_v1_SynonymSet_Synonym_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_SynonymSet_Synonym_descriptor,
            new java.lang.String[] {
              "Words",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
