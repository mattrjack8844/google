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
// source: google/cloud/channel/v1/operations.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.channel.v1;

public final class OperationsProto {
  private OperationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/channel/v1/operations.pro"
          + "to\022\027google.cloud.channel.v1\"\266\003\n\021Operatio"
          + "nMetadata\022P\n\016operation_type\030\001 \001(\01628.goog"
          + "le.cloud.channel.v1.OperationMetadata.Op"
          + "erationType\"\316\002\n\rOperationType\022\036\n\032OPERATI"
          + "ON_TYPE_UNSPECIFIED\020\000\022\026\n\022CREATE_ENTITLEM"
          + "ENT\020\001\022\033\n\027CHANGE_RENEWAL_SETTINGS\020\003\022\026\n\022ST"
          + "ART_PAID_SERVICE\020\005\022\030\n\024ACTIVATE_ENTITLEME"
          + "NT\020\007\022\027\n\023SUSPEND_ENTITLEMENT\020\010\022\026\n\022CANCEL_"
          + "ENTITLEMENT\020\t\022\031\n\025TRANSFER_ENTITLEMENTS\020\n"
          + "\022#\n\037TRANSFER_ENTITLEMENTS_TO_GOOGLE\020\013\022\020\n"
          + "\014CHANGE_OFFER\020\016\022\025\n\021CHANGE_PARAMETERS\020\017\022\034"
          + "\n\030PROVISION_CLOUD_IDENTITY\020\020Bg\n\033com.goog"
          + "le.cloud.channel.v1B\017OperationsProtoP\001Z5"
          + "cloud.google.com/go/channel/apiv1/channe"
          + "lpb;channelpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_channel_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "OperationType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
