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
// source: google/cloud/aiplatform/v1/schema/predict/instance/video_object_tracking.proto

package com.google.cloud.aiplatform.v1.schema.predict.instance;

public final class VideoObjectTrackingPredictionInstanceProto {
  private VideoObjectTrackingPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoObjectTrackingPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoObjectTrackingPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/instance/video_object_tracking.proto"
          + "\0222google.cloud.aiplatform.v1.schema.pred"
          + "ict.instance\"\201\001\n%VideoObjectTrackingPred"
          + "ictionInstance\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_"
          + "type\030\002 \001(\t\022\032\n\022time_segment_start\030\003 \001(\t\022\030"
          + "\n\020time_segment_end\030\004 \001(\tB\347\002\n6com.google."
          + "cloud.aiplatform.v1.schema.predict.insta"
          + "nceB*VideoObjectTrackingPredictionInstan"
          + "ceProtoP\001ZZgoogle.golang.org/genproto/go"
          + "ogleapis/cloud/aiplatform/v1/schema/pred"
          + "ict/instance;instance\252\0022Google.Cloud.AIP"
          + "latform.V1.Schema.Predict.Instance\312\0022Goo"
          + "gle\\Cloud\\AIPlatform\\V1\\Schema\\Predict\\I"
          + "nstance\352\0028Google::Cloud::AIPlatform::V1:"
          + ":Schema::Predict::Instanceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoObjectTrackingPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoObjectTrackingPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_instance_VideoObjectTrackingPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType", "TimeSegmentStart", "TimeSegmentEnd",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
