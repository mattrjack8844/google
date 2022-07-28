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
// source: google/cloud/retail/v2alpha/export_config.proto

package com.google.cloud.retail.v2alpha;

public final class ExportConfigProto {
  private ExportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/retail/v2alpha/export_con"
          + "fig.proto\022\033google.cloud.retail.v2alpha\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\037google/protobuf/time"
          + "stamp.proto\032\027google/rpc/status.proto\"9\n\022"
          + "ExportErrorsConfig\022\024\n\ngcs_prefix\030\001 \001(\tH\000"
          + "B\r\n\013destination\"r\n\016ExportMetadata\022/\n\013cre"
          + "ate_time\030\001 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022/\n\013update_time\030\002 \001(\0132\032.google.protobu"
          + "f.Timestamp\"\213\001\n\026ExportProductsResponse\022)"
          + "\n\rerror_samples\030\001 \003(\0132\022.google.rpc.Statu"
          + "s\022F\n\rerrors_config\030\002 \001(\0132/.google.cloud."
          + "retail.v2alpha.ExportErrorsConfig\"\215\001\n\030Ex"
          + "portUserEventsResponse\022)\n\rerror_samples\030"
          + "\001 \003(\0132\022.google.rpc.Status\022F\n\rerrors_conf"
          + "ig\030\002 \001(\0132/.google.cloud.retail.v2alpha.E"
          + "xportErrorsConfigB\337\001\n\037com.google.cloud.r"
          + "etail.v2alphaB\021ExportConfigProtoP\001ZAgoog"
          + "le.golang.org/genproto/googleapis/cloud/"
          + "retail/v2alpha;retail\242\002\006RETAIL\252\002\033Google."
          + "Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Reta"
          + "il\\V2alpha\352\002\036Google::Cloud::Retail::V2al"
          + "phab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_retail_v2alpha_ExportMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_ExportMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig",
            });
    internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig",
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
