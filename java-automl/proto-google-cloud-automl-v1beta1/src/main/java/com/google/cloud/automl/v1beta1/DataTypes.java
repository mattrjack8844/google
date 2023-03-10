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
// source: google/cloud/automl/v1beta1/data_types.proto

package com.google.cloud.automl.v1beta1;

public final class DataTypes {
  private DataTypes() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_DataType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_DataType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_StructType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_StructType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_StructType_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_StructType_FieldsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/automl/v1beta1/data_types"
          + ".proto\022\033google.cloud.automl.v1beta1\"\374\001\n\010"
          + "DataType\022B\n\021list_element_type\030\002 \001(\0132%.go"
          + "ogle.cloud.automl.v1beta1.DataTypeH\000\022>\n\013"
          + "struct_type\030\003 \001(\0132\'.google.cloud.automl."
          + "v1beta1.StructTypeH\000\022\025\n\013time_format\030\005 \001("
          + "\tH\000\0228\n\ttype_code\030\001 \001(\0162%.google.cloud.au"
          + "toml.v1beta1.TypeCode\022\020\n\010nullable\030\004 \001(\010B"
          + "\t\n\007details\"\247\001\n\nStructType\022C\n\006fields\030\001 \003("
          + "\01323.google.cloud.automl.v1beta1.StructTy"
          + "pe.FieldsEntry\032T\n\013FieldsEntry\022\013\n\003key\030\001 \001"
          + "(\t\0224\n\005value\030\002 \001(\0132%.google.cloud.automl."
          + "v1beta1.DataType:\0028\001*r\n\010TypeCode\022\031\n\025TYPE"
          + "_CODE_UNSPECIFIED\020\000\022\013\n\007FLOAT64\020\003\022\r\n\tTIME"
          + "STAMP\020\004\022\n\n\006STRING\020\006\022\t\n\005ARRAY\020\010\022\n\n\006STRUCT"
          + "\020\t\022\014\n\010CATEGORY\020\nB\233\001\n\037com.google.cloud.au"
          + "toml.v1beta1P\001Z7cloud.google.com/go/auto"
          + "ml/apiv1beta1/automlpb;automlpb\312\002\033Google"
          + "\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::A"
          + "utoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_automl_v1beta1_DataType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_DataType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_DataType_descriptor,
            new java.lang.String[] {
              "ListElementType", "StructType", "TimeFormat", "TypeCode", "Nullable", "Details",
            });
    internal_static_google_cloud_automl_v1beta1_StructType_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_StructType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_StructType_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_google_cloud_automl_v1beta1_StructType_FieldsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_StructType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_StructType_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_StructType_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
