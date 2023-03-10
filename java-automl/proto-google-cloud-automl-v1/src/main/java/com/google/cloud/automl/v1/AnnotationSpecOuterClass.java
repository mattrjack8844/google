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
// source: google/cloud/automl/v1/annotation_spec.proto

package com.google.cloud.automl.v1;

public final class AnnotationSpecOuterClass {
  private AnnotationSpecOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_AnnotationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_AnnotationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/automl/v1/annotation_spec"
          + ".proto\022\026google.cloud.automl.v1\032\031google/a"
          + "pi/resource.proto\"\326\001\n\016AnnotationSpec\022\014\n\004"
          + "name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\025\n\rexam"
          + "ple_count\030\t \001(\005:\210\001\352A\204\001\n$automl.googleapi"
          + "s.com/AnnotationSpec\022\\projects/{project}"
          + "/locations/{location}/datasets/{dataset}"
          + "/annotationSpecs/{annotation_spec}B\240\001\n\032c"
          + "om.google.cloud.automl.v1P\001Z2cloud.googl"
          + "e.com/go/automl/apiv1/automlpb;automlpb\252"
          + "\002\026Google.Cloud.AutoML.V1\312\002\026Google\\Cloud\\"
          + "AutoMl\\V1\352\002\031Google::Cloud::AutoML::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_AnnotationSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_AnnotationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_AnnotationSpec_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "ExampleCount",
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
