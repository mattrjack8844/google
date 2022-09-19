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
// source: google/cloud/vision/v1p3beta1/product_search.proto

package com.google.cloud.vision.v1p3beta1;

public final class ProductSearchProto {
  private ProductSearchProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ObjectAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ObjectAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_GroupedResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_GroupedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/vision/v1p3beta1/product_"
          + "search.proto\022\035google.cloud.vision.v1p3be"
          + "ta1\032\031google/api/resource.proto\032,google/c"
          + "loud/vision/v1p3beta1/geometry.proto\032:go"
          + "ogle/cloud/vision/v1p3beta1/product_sear"
          + "ch_service.proto\032\037google/protobuf/timest"
          + "amp.proto\"\301\001\n\023ProductSearchParams\022B\n\rbou"
          + "nding_poly\030\t \001(\0132+.google.cloud.vision.v"
          + "1p3beta1.BoundingPoly\022:\n\013product_set\030\006 \001"
          + "(\tB%\372A\"\n vision.googleapis.com/ProductSe"
          + "t\022\032\n\022product_categories\030\007 \003(\t\022\016\n\006filter\030"
          + "\010 \001(\t\"\262\005\n\024ProductSearchResults\022.\n\nindex_"
          + "time\030\002 \001(\0132\032.google.protobuf.Timestamp\022K"
          + "\n\007results\030\005 \003(\0132:.google.cloud.vision.v1"
          + "p3beta1.ProductSearchResults.Result\022b\n\027p"
          + "roduct_grouped_results\030\006 \003(\0132A.google.cl"
          + "oud.vision.v1p3beta1.ProductSearchResult"
          + "s.GroupedResult\032_\n\006Result\0227\n\007product\030\001 \001"
          + "(\0132&.google.cloud.vision.v1p3beta1.Produ"
          + "ct\022\r\n\005score\030\002 \001(\002\022\r\n\005image\030\003 \001(\t\032S\n\020Obje"
          + "ctAnnotation\022\013\n\003mid\030\001 \001(\t\022\025\n\rlanguage_co"
          + "de\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\r\n\005score\030\004 \001(\002\032\202\002"
          + "\n\rGroupedResult\022B\n\rbounding_poly\030\001 \001(\0132+"
          + ".google.cloud.vision.v1p3beta1.BoundingP"
          + "oly\022K\n\007results\030\002 \003(\0132:.google.cloud.visi"
          + "on.v1p3beta1.ProductSearchResults.Result"
          + "\022`\n\022object_annotations\030\003 \003(\0132D.google.cl"
          + "oud.vision.v1p3beta1.ProductSearchResult"
          + "s.ObjectAnnotationB\210\001\n!com.google.cloud."
          + "vision.v1p3beta1B\022ProductSearchProtoP\001ZC"
          + "google.golang.org/genproto/googleapis/cl"
          + "oud/vision/v1p3beta1;vision\370\001\001\242\002\004GCVNb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.vision.v1p3beta1.GeometryProto.getDescriptor(),
              com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_descriptor,
            new java.lang.String[] {
              "BoundingPoly", "ProductSet", "ProductCategories", "Filter",
            });
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor,
            new java.lang.String[] {
              "IndexTime", "Results", "ProductGroupedResults",
            });
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_descriptor =
        internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_descriptor,
            new java.lang.String[] {
              "Product", "Score", "Image",
            });
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ObjectAnnotation_descriptor =
        internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ObjectAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ObjectAnnotation_descriptor,
            new java.lang.String[] {
              "Mid", "LanguageCode", "Name", "Score",
            });
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_GroupedResult_descriptor =
        internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_GroupedResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_GroupedResult_descriptor,
            new java.lang.String[] {
              "BoundingPoly", "Results", "ObjectAnnotations",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.vision.v1p3beta1.GeometryProto.getDescriptor();
    com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
