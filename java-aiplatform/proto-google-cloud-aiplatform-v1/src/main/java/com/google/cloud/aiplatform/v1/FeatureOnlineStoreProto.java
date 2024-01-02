/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1/feature_online_store.proto

package com.google.cloud.aiplatform.v1;

public final class FeatureOnlineStoreProto {
  private FeatureOnlineStoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/feature_onl"
          + "ine_store.proto\022\032google.cloud.aiplatform"
          + ".v1\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\032\037google/protobuf"
          + "/timestamp.proto\"\365\006\n\022FeatureOnlineStore\022"
          + "K\n\010bigtable\030\010 \001(\01327.google.cloud.aiplatf"
          + "orm.v1.FeatureOnlineStore.BigtableH\000\022\022\n\004"
          + "name\030\001 \001(\tB\004\342A\001\010\0225\n\013create_time\030\003 \001(\0132\032."
          + "google.protobuf.TimestampB\004\342A\001\003\0225\n\013updat"
          + "e_time\030\004 \001(\0132\032.google.protobuf.Timestamp"
          + "B\004\342A\001\003\022\022\n\004etag\030\005 \001(\tB\004\342A\001\001\022P\n\006labels\030\006 \003"
          + "(\0132:.google.cloud.aiplatform.v1.FeatureO"
          + "nlineStore.LabelsEntryB\004\342A\001\001\022I\n\005state\030\007 "
          + "\001(\01624.google.cloud.aiplatform.v1.Feature"
          + "OnlineStore.StateB\004\342A\001\003\032\334\001\n\010Bigtable\022_\n\014"
          + "auto_scaling\030\001 \001(\0132C.google.cloud.aiplat"
          + "form.v1.FeatureOnlineStore.Bigtable.Auto"
          + "ScalingB\004\342A\001\002\032o\n\013AutoScaling\022\034\n\016min_node"
          + "_count\030\001 \001(\005B\004\342A\001\002\022\034\n\016max_node_count\030\002 \001"
          + "(\005B\004\342A\001\002\022$\n\026cpu_utilization_target\030\003 \001(\005"
          + "B\004\342A\001\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001\"8\n\005State\022\025\n\021STATE_UNSPECIF"
          + "IED\020\000\022\n\n\006STABLE\020\001\022\014\n\010UPDATING\020\002:\206\001\352A\202\001\n,"
          + "aiplatform.googleapis.com/FeatureOnlineS"
          + "tore\022Rprojects/{project}/locations/{loca"
          + "tion}/featureOnlineStores/{feature_onlin"
          + "e_store}B\016\n\014storage_typeB\325\001\n\036com.google."
          + "cloud.aiplatform.v1B\027FeatureOnlineStoreP"
          + "rotoP\001Z>cloud.google.com/go/aiplatform/a"
          + "piv1/aiplatformpb;aiplatformpb\252\002\032Google."
          + "Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPla"
          + "tform\\V1\352\002\035Google::Cloud::AIPlatform::V1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor,
            new java.lang.String[] {
              "Bigtable",
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "State",
              "StorageType",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor,
            new java.lang.String[] {
              "AutoScaling",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor,
            new java.lang.String[] {
              "MinNodeCount", "MaxNodeCount", "CpuUtilizationTarget",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
