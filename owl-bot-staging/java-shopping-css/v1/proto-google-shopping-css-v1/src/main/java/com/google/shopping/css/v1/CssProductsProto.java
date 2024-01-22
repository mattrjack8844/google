// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/css/v1/css_products.proto

package com.google.shopping.css.v1;

public final class CssProductsProto {
  private CssProductsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_shopping_css_v1_GetCssProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_css_v1_GetCssProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_shopping_css_v1_CssProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_css_v1_CssProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_shopping_css_v1_ListCssProductsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_css_v1_ListCssProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_shopping_css_v1_ListCssProductsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_css_v1_ListCssProductsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/shopping/css/v1/css_products.pr" +
      "oto\022\026google.shopping.css.v1\032\034google/api/" +
      "annotations.proto\032\027google/api/client.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032/google/shopping/" +
      "css/v1/css_product_common.proto\032 google/" +
      "shopping/type/types.proto\"L\n\024GetCssProdu" +
      "ctRequest\0224\n\004name\030\001 \001(\tB&\342A\001\002\372A\037\n\035css.go" +
      "ogleapis.com/CssProduct\"\260\003\n\nCssProduct\022\014" +
      "\n\004name\030\001 \001(\t\022\035\n\017raw_provided_id\030\002 \001(\tB\004\342" +
      "A\001\003\022\036\n\020content_language\030\003 \001(\tB\004\342A\001\003\022\030\n\nf" +
      "eed_label\030\004 \001(\tB\004\342A\001\003\022<\n\nattributes\030\005 \001(" +
      "\0132\".google.shopping.css.v1.AttributesB\004\342" +
      "A\001\003\022F\n\021custom_attributes\030\006 \003(\0132%.google." +
      "shopping.type.CustomAttributeB\004\342A\001\003\022J\n\022c" +
      "ss_product_status\030\010 \001(\0132(.google.shoppin" +
      "g.css.v1.CssProductStatusB\004\342A\001\003:i\352Af\n\035cs" +
      "s.googleapis.com/CssProduct\022,accounts/{a" +
      "ccount}/cssProducts/{css_product}*\013cssPr" +
      "oducts2\ncssProduct\"w\n\026ListCssProductsReq" +
      "uest\0226\n\006parent\030\001 \001(\tB&\342A\001\002\372A\037\022\035css.googl" +
      "eapis.com/CssProduct\022\021\n\tpage_size\030\002 \001(\005\022" +
      "\022\n\npage_token\030\003 \001(\t\"l\n\027ListCssProductsRe" +
      "sponse\0228\n\014css_products\030\001 \003(\0132\".google.sh" +
      "opping.css.v1.CssProduct\022\027\n\017next_page_to" +
      "ken\030\002 \001(\t2\230\003\n\022CssProductsService\022\225\001\n\rGet" +
      "CssProduct\022,.google.shopping.css.v1.GetC" +
      "ssProductRequest\032\".google.shopping.css.v" +
      "1.CssProduct\"2\332A\004name\202\323\344\223\002%\022#/v1/{name=a" +
      "ccounts/*/cssProducts/*}\022\250\001\n\017ListCssProd" +
      "ucts\022..google.shopping.css.v1.ListCssPro" +
      "ductsRequest\032/.google.shopping.css.v1.Li" +
      "stCssProductsResponse\"4\332A\006parent\202\323\344\223\002%\022#" +
      "/v1/{parent=accounts/*}/cssProducts\032?\312A\022" +
      "css.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/contentB\262\001\n\032com.google.shop" +
      "ping.css.v1B\020CssProductsProtoP\001Z2cloud.g" +
      "oogle.com/go/shopping/css/apiv1/csspb;cs" +
      "spb\252\002\026Google.Shopping.Css.V1\312\002\026Google\\Sh" +
      "opping\\Css\\V1\352\002\031Google::Shopping::Css::V" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.shopping.css.v1.CssProductCommonProto.getDescriptor(),
          com.google.shopping.type.TypesProto.getDescriptor(),
        });
    internal_static_google_shopping_css_v1_GetCssProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_css_v1_GetCssProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_shopping_css_v1_GetCssProductRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_shopping_css_v1_CssProduct_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_css_v1_CssProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_shopping_css_v1_CssProduct_descriptor,
        new java.lang.String[] { "Name", "RawProvidedId", "ContentLanguage", "FeedLabel", "Attributes", "CustomAttributes", "CssProductStatus", });
    internal_static_google_shopping_css_v1_ListCssProductsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_css_v1_ListCssProductsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_shopping_css_v1_ListCssProductsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_shopping_css_v1_ListCssProductsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_css_v1_ListCssProductsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_shopping_css_v1_ListCssProductsResponse_descriptor,
        new java.lang.String[] { "CssProducts", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.shopping.css.v1.CssProductCommonProto.getDescriptor();
    com.google.shopping.type.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
