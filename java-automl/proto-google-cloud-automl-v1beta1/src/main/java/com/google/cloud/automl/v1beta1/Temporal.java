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
// source: google/cloud/automl/v1beta1/temporal.proto

package com.google.cloud.automl.v1beta1;

public final class Temporal {
  private Temporal() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TimeSegment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TimeSegment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/automl/v1beta1/temporal.p"
          + "roto\022\033google.cloud.automl.v1beta1\032\036googl"
          + "e/protobuf/duration.proto\"w\n\013TimeSegment"
          + "\0224\n\021start_time_offset\030\001 \001(\0132\031.google.pro"
          + "tobuf.Duration\0222\n\017end_time_offset\030\002 \001(\0132"
          + "\031.google.protobuf.DurationB\233\001\n\037com.googl"
          + "e.cloud.automl.v1beta1P\001Z7cloud.google.c"
          + "om/go/automl/apiv1beta1/automlpb;automlp"
          + "b\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google"
          + "::Cloud::AutoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_TimeSegment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TimeSegment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TimeSegment_descriptor,
            new java.lang.String[] {
              "StartTimeOffset", "EndTimeOffset",
            });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
