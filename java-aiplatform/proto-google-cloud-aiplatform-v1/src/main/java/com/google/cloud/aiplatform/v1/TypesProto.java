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
// source: google/cloud/aiplatform/v1/types.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class TypesProto {
  private TypesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BoolArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BoolArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DoubleArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DoubleArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Int64Array_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Int64Array_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StringArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StringArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Tensor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Tensor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Tensor_StructValEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Tensor_StructValEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/types.proto"
          + "\022\032google.cloud.aiplatform.v1\"\033\n\tBoolArra"
          + "y\022\016\n\006values\030\001 \003(\010\"\035\n\013DoubleArray\022\016\n\006valu"
          + "es\030\001 \003(\001\"\034\n\nInt64Array\022\016\n\006values\030\001 \003(\003\"\035"
          + "\n\013StringArray\022\016\n\006values\030\001 \003(\t\"\223\005\n\006Tensor"
          + "\022:\n\005dtype\030\001 \001(\0162+.google.cloud.aiplatfor"
          + "m.v1.Tensor.DataType\022\r\n\005shape\030\002 \003(\003\022\020\n\010b"
          + "ool_val\030\003 \003(\010\022\022\n\nstring_val\030\016 \003(\t\022\021\n\tbyt"
          + "es_val\030\017 \003(\014\022\021\n\tfloat_val\030\005 \003(\002\022\022\n\ndoubl"
          + "e_val\030\006 \003(\001\022\017\n\007int_val\030\007 \003(\005\022\021\n\tint64_va"
          + "l\030\010 \003(\003\022\020\n\010uint_val\030\t \003(\r\022\022\n\nuint64_val\030"
          + "\n \003(\004\0224\n\010list_val\030\013 \003(\0132\".google.cloud.a"
          + "iplatform.v1.Tensor\022E\n\nstruct_val\030\014 \003(\0132"
          + "1.google.cloud.aiplatform.v1.Tensor.Stru"
          + "ctValEntry\022\022\n\ntensor_val\030\r \001(\014\032T\n\016Struct"
          + "ValEntry\022\013\n\003key\030\001 \001(\t\0221\n\005value\030\002 \001(\0132\".g"
          + "oogle.cloud.aiplatform.v1.Tensor:\0028\001\"\254\001\n"
          + "\010DataType\022\031\n\025DATA_TYPE_UNSPECIFIED\020\000\022\010\n\004"
          + "BOOL\020\001\022\n\n\006STRING\020\002\022\t\n\005FLOAT\020\003\022\n\n\006DOUBLE\020"
          + "\004\022\010\n\004INT8\020\005\022\t\n\005INT16\020\006\022\t\n\005INT32\020\007\022\t\n\005INT"
          + "64\020\010\022\t\n\005UINT8\020\t\022\n\n\006UINT16\020\n\022\n\n\006UINT32\020\013\022"
          + "\n\n\006UINT64\020\014B\310\001\n\036com.google.cloud.aiplatf"
          + "orm.v1B\nTypesProtoP\001Z>cloud.google.com/g"
          + "o/aiplatform/apiv1/aiplatformpb;aiplatfo"
          + "rmpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Goog"
          + "le\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::"
          + "AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_BoolArray_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_BoolArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BoolArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1_DoubleArray_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DoubleArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DoubleArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1_Int64Array_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_Int64Array_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Int64Array_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1_StringArray_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_StringArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StringArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1_Tensor_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_Tensor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Tensor_descriptor,
            new java.lang.String[] {
              "Dtype",
              "Shape",
              "BoolVal",
              "StringVal",
              "BytesVal",
              "FloatVal",
              "DoubleVal",
              "IntVal",
              "Int64Val",
              "UintVal",
              "Uint64Val",
              "ListVal",
              "StructVal",
              "TensorVal",
            });
    internal_static_google_cloud_aiplatform_v1_Tensor_StructValEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Tensor_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Tensor_StructValEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Tensor_StructValEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
