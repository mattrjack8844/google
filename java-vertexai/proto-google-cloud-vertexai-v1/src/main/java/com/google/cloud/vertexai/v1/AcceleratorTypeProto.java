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
// source: google/cloud/vertexai/v1/accelerator_type.proto

package com.google.cloud.vertexai.v1;

public final class AcceleratorTypeProto {
  private AcceleratorTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/vertexai/v1/accelerator_t"
          + "ype.proto\022\030google.cloud.vertexai.v1*\205\002\n\017"
          + "AcceleratorType\022 \n\034ACCELERATOR_TYPE_UNSP"
          + "ECIFIED\020\000\022\024\n\020NVIDIA_TESLA_K80\020\001\022\025\n\021NVIDI"
          + "A_TESLA_P100\020\002\022\025\n\021NVIDIA_TESLA_V100\020\003\022\023\n"
          + "\017NVIDIA_TESLA_P4\020\004\022\023\n\017NVIDIA_TESLA_T4\020\005\022"
          + "\025\n\021NVIDIA_TESLA_A100\020\010\022\024\n\020NVIDIA_A100_80"
          + "GB\020\t\022\r\n\tNVIDIA_L4\020\013\022\n\n\006TPU_V2\020\006\022\n\n\006TPU_V"
          + "3\020\007\022\016\n\nTPU_V4_POD\020\nB\304\001\n\034com.google.cloud"
          + ".vertexai.v1B\024AcceleratorTypeProtoP\001Z8cl"
          + "oud.google.com/go/vertexai/apiv1/vertexa"
          + "ipb;vertexaipb\252\002\030Google.Cloud.VertexAI.V"
          + "1\312\002\030Google\\Cloud\\VertexAI\\V1\352\002\033Google::C"
          + "loud::VertexAI::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
