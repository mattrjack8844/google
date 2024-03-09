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
// source: google/cloud/discoveryengine/v1alpha/chunk_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public final class ChunkServiceProto {
  private ChunkServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetChunkRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetChunkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListChunksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListChunksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListChunksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListChunksResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/discoveryengine/v1alpha/c"
          + "hunk_service.proto\022$google.cloud.discove"
          + "ryengine.v1alpha\032\034google/api/annotations"
          + ".proto\032\027google/api/client.proto\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\0320google/cloud/discoveryengin"
          + "e/v1alpha/chunk.proto\"M\n\017GetChunkRequest"
          + "\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$discoveryengine."
          + "googleapis.com/Chunk\"{\n\021ListChunksReques"
          + "t\022?\n\006parent\030\001 \001(\tB/\340A\002\372A)\n\'discoveryengi"
          + "ne.googleapis.com/Document\022\021\n\tpage_size\030"
          + "\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"j\n\022ListChunksR"
          + "esponse\022;\n\006chunks\030\001 \003(\0132+.google.cloud.d"
          + "iscoveryengine.v1alpha.Chunk\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t2\355\005\n\014ChunkService\022\271\002\n\010GetCh"
          + "unk\0225.google.cloud.discoveryengine.v1alp"
          + "ha.GetChunkRequest\032+.google.cloud.discov"
          + "eryengine.v1alpha.Chunk\"\310\001\332A\004name\202\323\344\223\002\272\001"
          + "\022S/v1alpha/{name=projects/*/locations/*/"
          + "dataStores/*/branches/*/documents/*/chun"
          + "ks/*}Zc\022a/v1alpha/{name=projects/*/locat"
          + "ions/*/collections/*/dataStores/*/branch"
          + "es/*/documents/*/chunks/*}\022\314\002\n\nListChunk"
          + "s\0227.google.cloud.discoveryengine.v1alpha"
          + ".ListChunksRequest\0328.google.cloud.discov"
          + "eryengine.v1alpha.ListChunksResponse\"\312\001\332"
          + "A\006parent\202\323\344\223\002\272\001\022S/v1alpha/{parent=projec"
          + "ts/*/locations/*/dataStores/*/branches/*"
          + "}/documents/*/chunksZc\022a/v1alpha/{parent"
          + "=projects/*/locations/*/collections/*/da"
          + "taStores/*/branches/*}/documents/*/chunk"
          + "s\032R\312A\036discoveryengine.googleapis.com\322A.h"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tformB\235\002\n(com.google.cloud.discoveryengi"
          + "ne.v1alphaB\021ChunkServiceProtoP\001ZRcloud.g"
          + "oogle.com/go/discoveryengine/apiv1alpha/"
          + "discoveryenginepb;discoveryenginepb\242\002\017DI"
          + "SCOVERYENGINE\252\002$Google.Cloud.DiscoveryEn"
          + "gine.V1Alpha\312\002$Google\\Cloud\\DiscoveryEng"
          + "ine\\V1alpha\352\002\'Google::Cloud::DiscoveryEn"
          + "gine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.ChunkProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetChunkRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_GetChunkRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetChunkRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListChunksRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_ListChunksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListChunksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListChunksResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_ListChunksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListChunksResponse_descriptor,
            new java.lang.String[] {
              "Chunks", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.ChunkProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
