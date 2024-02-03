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
// source: google/cloud/retail/v2beta/promotion.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public final class PromotionProto {
  private PromotionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_Promotion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_Promotion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/retail/v2beta/promotion.p"
          + "roto\022\032google.cloud.retail.v2beta\"!\n\tProm"
          + "otion\022\024\n\014promotion_id\030\001 \001(\tB\315\001\n\036com.goog"
          + "le.cloud.retail.v2betaB\016PromotionProtoP\001"
          + "Z6cloud.google.com/go/retail/apiv2beta/r"
          + "etailpb;retailpb\242\002\006RETAIL\252\002\032Google.Cloud"
          + ".Retail.V2Beta\312\002\032Google\\Cloud\\Retail\\V2b"
          + "eta\352\002\035Google::Cloud::Retail::V2betab\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_retail_v2beta_Promotion_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_Promotion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_Promotion_descriptor,
            new java.lang.String[] {
              "PromotionId",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
