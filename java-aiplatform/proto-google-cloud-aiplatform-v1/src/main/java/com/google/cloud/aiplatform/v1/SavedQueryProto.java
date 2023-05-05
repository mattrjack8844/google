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
// source: google/cloud/aiplatform/v1/saved_query.proto

package com.google.cloud.aiplatform.v1;

public final class SavedQueryProto {
  private SavedQueryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SavedQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SavedQuery_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/aiplatform/v1/saved_query"
          + ".proto\022\032google.cloud.aiplatform.v1\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "resource.proto\032\034google/protobuf/struct.p"
          + "roto\032\037google/protobuf/timestamp.proto\"\346\003"
          + "\n\nSavedQuery\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014displ"
          + "ay_name\030\002 \001(\tB\003\340A\002\022(\n\010metadata\030\014 \001(\0132\026.g"
          + "oogle.protobuf.Value\0224\n\013create_time\030\003 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up"
          + "date_time\030\004 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022\036\n\021annotation_filter\030\005 \001(\tB\003\340A\003"
          + "\022\031\n\014problem_type\030\006 \001(\tB\003\340A\002\022\"\n\025annotatio"
          + "n_spec_count\030\n \001(\005B\003\340A\003\022\014\n\004etag\030\010 \001(\t\022$\n"
          + "\027support_automl_training\030\t \001(\010B\003\340A\003:\200\001\352A"
          + "}\n$aiplatform.googleapis.com/SavedQuery\022"
          + "Uprojects/{project}/locations/{location}"
          + "/datasets/{dataset}/savedQueries/{saved_"
          + "query}B\315\001\n\036com.google.cloud.aiplatform.v"
          + "1B\017SavedQueryProtoP\001Z>cloud.google.com/g"
          + "o/aiplatform/apiv1/aiplatformpb;aiplatfo"
          + "rmpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Goog"
          + "le\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::"
          + "AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_SavedQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_SavedQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SavedQuery_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Metadata",
              "CreateTime",
              "UpdateTime",
              "AnnotationFilter",
              "ProblemType",
              "AnnotationSpecCount",
              "Etag",
              "SupportAutomlTraining",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
