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
// source: google/cloud/baremetalsolution/v2/ssh_key.proto

package com.google.cloud.baremetalsolution.v2;

public final class SshKeyProto {
  private SshKeyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_SSHKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_SSHKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_CreateSSHKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_CreateSSHKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_DeleteSSHKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_DeleteSSHKeyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/baremetalsolution/v2/ssh_"
          + "key.proto\022!google.cloud.baremetalsolutio"
          + "n.v2\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\"\231\001\n\006SSHKey\022\022\n\004n"
          + "ame\030\001 \001(\tB\004\342A\001\003\022\022\n\npublic_key\030\002 \001(\t:g\352Ad"
          + "\n\'baremetalsolution.googleapis.com/SshKe"
          + "y\0229projects/{project}/locations/{locatio"
          + "n}/sshKeys/{ssh_key}\"w\n\022ListSSHKeysReque"
          + "st\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.g"
          + "oogleapis.com/Location\022\021\n\tpage_size\030\002 \001("
          + "\005\022\022\n\npage_token\030\003 \001(\t\"k\n\023ListSSHKeysResp"
          + "onse\022;\n\010ssh_keys\030\001 \003(\0132).google.cloud.ba"
          + "remetalsolution.v2.SSHKey\022\027\n\017next_page_t"
          + "oken\030Z \001(\t\"\255\001\n\023CreateSSHKeyRequest\022:\n\006pa"
          + "rent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleapi"
          + "s.com/Location\022@\n\007ssh_key\030\002 \001(\0132).google"
          + ".cloud.baremetalsolution.v2.SSHKeyB\004\342A\001\002"
          + "\022\030\n\nssh_key_id\030\003 \001(\tB\004\342A\001\002\"U\n\023DeleteSSHK"
          + "eyRequest\022>\n\004name\030\001 \001(\tB0\342A\001\002\372A)\n\'bareme"
          + "talsolution.googleapis.com/SshKeyB\372\001\n%co"
          + "m.google.cloud.baremetalsolution.v2B\013Ssh"
          + "KeyProtoP\001ZScloud.google.com/go/baremeta"
          + "lsolution/apiv2/baremetalsolutionpb;bare"
          + "metalsolutionpb\252\002!Google.Cloud.BareMetal"
          + "Solution.V2\312\002!Google\\Cloud\\BareMetalSolu"
          + "tion\\V2\352\002$Google::Cloud::BareMetalSoluti"
          + "on::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_SSHKey_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_SSHKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_SSHKey_descriptor,
            new java.lang.String[] {
              "Name", "PublicKey",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_descriptor,
            new java.lang.String[] {
              "SshKeys", "NextPageToken",
            });
    internal_static_google_cloud_baremetalsolution_v2_CreateSSHKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_baremetalsolution_v2_CreateSSHKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_CreateSSHKeyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SshKey", "SshKeyId",
            });
    internal_static_google_cloud_baremetalsolution_v2_DeleteSSHKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_baremetalsolution_v2_DeleteSSHKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_DeleteSSHKeyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
