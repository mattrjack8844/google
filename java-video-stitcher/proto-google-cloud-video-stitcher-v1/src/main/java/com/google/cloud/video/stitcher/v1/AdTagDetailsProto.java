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
// source: google/cloud/video/stitcher/v1/ad_tag_details.proto

package com.google.cloud.video.stitcher.v1;

public final class AdTagDetailsProto {
  private AdTagDetailsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_LiveAdTagDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_LiveAdTagDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_AdRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_AdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_RequestMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_RequestMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_ResponseMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_ResponseMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/video/stitcher/v1/ad_tag_"
          + "details.proto\022\036google.cloud.video.stitch"
          + "er.v1\032\031google/api/resource.proto\032\036google"
          + "/protobuf/duration.proto\032\034google/protobu"
          + "f/struct.proto\"\377\001\n\017LiveAdTagDetail\022\014\n\004na"
          + "me\030\001 \001(\t\022>\n\013ad_requests\030\002 \003(\0132).google.c"
          + "loud.video.stitcher.v1.AdRequest:\235\001\352A\231\001\n"
          + ",videostitcher.googleapis.com/LiveAdTagD"
          + "etail\022iprojects/{project}/locations/{loc"
          + "ation}/liveSessions/{live_session}/liveA"
          + "dTagDetails/{live_ad_tag_detail}\"\371\001\n\016Vod"
          + "AdTagDetail\022\014\n\004name\030\001 \001(\t\022>\n\013ad_requests"
          + "\030\002 \003(\0132).google.cloud.video.stitcher.v1."
          + "AdRequest:\230\001\352A\224\001\n+videostitcher.googleap"
          + "is.com/VodAdTagDetail\022eprojects/{project"
          + "}/locations/{location}/vodSessions/{vod_"
          + "session}/vodAdTagDetails/{vod_ad_tag_det"
          + "ail}\"\260\001\n\tAdRequest\022\013\n\003uri\030\001 \001(\t\022I\n\020reque"
          + "st_metadata\030\002 \001(\0132/.google.cloud.video.s"
          + "titcher.v1.RequestMetadata\022K\n\021response_m"
          + "etadata\030\003 \001(\01320.google.cloud.video.stitc"
          + "her.v1.ResponseMetadata\";\n\017RequestMetada"
          + "ta\022(\n\007headers\030\001 \001(\0132\027.google.protobuf.St"
          + "ruct\"\257\001\n\020ResponseMetadata\022\r\n\005error\030\001 \001(\t"
          + "\022(\n\007headers\030\002 \001(\0132\027.google.protobuf.Stru"
          + "ct\022\023\n\013status_code\030\003 \001(\t\022\022\n\nsize_bytes\030\004 "
          + "\001(\005\022+\n\010duration\030\005 \001(\0132\031.google.protobuf."
          + "Duration\022\014\n\004body\030\006 \001(\tBy\n\"com.google.clo"
          + "ud.video.stitcher.v1B\021AdTagDetailsProtoP"
          + "\001Z>cloud.google.com/go/video/stitcher/ap"
          + "iv1/stitcherpb;stitcherpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_video_stitcher_v1_LiveAdTagDetail_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_video_stitcher_v1_LiveAdTagDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_LiveAdTagDetail_descriptor,
            new java.lang.String[] {
              "Name", "AdRequests",
            });
    internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_VodAdTagDetail_descriptor,
            new java.lang.String[] {
              "Name", "AdRequests",
            });
    internal_static_google_cloud_video_stitcher_v1_AdRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_video_stitcher_v1_AdRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_AdRequest_descriptor,
            new java.lang.String[] {
              "Uri", "RequestMetadata", "ResponseMetadata",
            });
    internal_static_google_cloud_video_stitcher_v1_RequestMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_video_stitcher_v1_RequestMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_RequestMetadata_descriptor,
            new java.lang.String[] {
              "Headers",
            });
    internal_static_google_cloud_video_stitcher_v1_ResponseMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_video_stitcher_v1_ResponseMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_ResponseMetadata_descriptor,
            new java.lang.String[] {
              "Error", "Headers", "StatusCode", "SizeBytes", "Duration", "Body",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
