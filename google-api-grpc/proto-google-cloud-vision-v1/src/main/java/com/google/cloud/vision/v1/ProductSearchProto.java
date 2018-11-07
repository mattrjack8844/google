// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search.proto

package com.google.cloud.vision.v1;

public final class ProductSearchProto {
  private ProductSearchProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_ProductSearchParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_ProductSearchResults_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchResults_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/vision/v1/product_search." +
      "proto\022\026google.cloud.vision.v1\032\034google/ap" +
      "i/annotations.proto\032%google/cloud/vision" +
      "/v1/geometry.proto\0323google/cloud/vision/" +
      "v1/product_search_service.proto\032\037google/" +
      "protobuf/timestamp.proto\"\223\001\n\023ProductSear" +
      "chParams\022;\n\rbounding_poly\030\t \001(\0132$.google" +
      ".cloud.vision.v1.BoundingPoly\022\023\n\013product" +
      "_set\030\006 \001(\t\022\032\n\022product_categories\030\007 \003(\t\022\016" +
      "\n\006filter\030\010 \001(\t\"\330\003\n\024ProductSearchResults\022" +
      ".\n\nindex_time\030\002 \001(\0132\032.google.protobuf.Ti" +
      "mestamp\022D\n\007results\030\005 \003(\01323.google.cloud." +
      "vision.v1.ProductSearchResults.Result\022[\n" +
      "\027product_grouped_results\030\006 \003(\0132:.google." +
      "cloud.vision.v1.ProductSearchResults.Gro" +
      "upedResult\032X\n\006Result\0220\n\007product\030\001 \001(\0132\037." +
      "google.cloud.vision.v1.Product\022\r\n\005score\030" +
      "\002 \001(\002\022\r\n\005image\030\003 \001(\t\032\222\001\n\rGroupedResult\022;" +
      "\n\rbounding_poly\030\001 \001(\0132$.google.cloud.vis" +
      "ion.v1.BoundingPoly\022D\n\007results\030\002 \003(\01323.g" +
      "oogle.cloud.vision.v1.ProductSearchResul" +
      "ts.ResultBz\n\032com.google.cloud.vision.v1B" +
      "\022ProductSearchProtoP\001Z<google.golang.org" +
      "/genproto/googleapis/cloud/vision/v1;vis" +
      "ion\370\001\001\242\002\004GCVNb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.vision.v1.GeometryProto.getDescriptor(),
          com.google.cloud.vision.v1.ProductSearchServiceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_vision_v1_ProductSearchParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1_ProductSearchParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_ProductSearchParams_descriptor,
        new java.lang.String[] { "BoundingPoly", "ProductSet", "ProductCategories", "Filter", });
    internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1_ProductSearchResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor,
        new java.lang.String[] { "IndexTime", "Results", "ProductGroupedResults", });
    internal_static_google_cloud_vision_v1_ProductSearchResults_Result_descriptor =
      internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_vision_v1_ProductSearchResults_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_ProductSearchResults_Result_descriptor,
        new java.lang.String[] { "Product", "Score", "Image", });
    internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_descriptor =
      internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_descriptor,
        new java.lang.String[] { "BoundingPoly", "Results", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.vision.v1.GeometryProto.getDescriptor();
    com.google.cloud.vision.v1.ProductSearchServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
