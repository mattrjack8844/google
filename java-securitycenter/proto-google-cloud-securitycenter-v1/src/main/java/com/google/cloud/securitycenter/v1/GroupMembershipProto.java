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
// source: google/cloud/securitycenter/v1/group_membership.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1;

public final class GroupMembershipProto {
  private GroupMembershipProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_GroupMembership_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_GroupMembership_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/securitycenter/v1/group_m"
          + "embership.proto\022\036google.cloud.securityce"
          + "nter.v1\"\275\001\n\017GroupMembership\022M\n\ngroup_typ"
          + "e\030\001 \001(\01629.google.cloud.securitycenter.v1"
          + ".GroupMembership.GroupType\022\020\n\010group_id\030\002"
          + " \001(\t\"I\n\tGroupType\022\032\n\026GROUP_TYPE_UNSPECIF"
          + "IED\020\000\022 \n\034GROUP_TYPE_TOXIC_COMBINATION\020\001B"
          + "\356\001\n\"com.google.cloud.securitycenter.v1B\024"
          + "GroupMembershipProtoP\001ZJcloud.google.com"
          + "/go/securitycenter/apiv1/securitycenterp"
          + "b;securitycenterpb\252\002\036Google.Cloud.Securi"
          + "tyCenter.V1\312\002\036Google\\Cloud\\SecurityCente"
          + "r\\V1\352\002!Google::Cloud::SecurityCenter::V1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v1_GroupMembership_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_GroupMembership_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_GroupMembership_descriptor,
            new java.lang.String[] {
              "GroupType", "GroupId",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
