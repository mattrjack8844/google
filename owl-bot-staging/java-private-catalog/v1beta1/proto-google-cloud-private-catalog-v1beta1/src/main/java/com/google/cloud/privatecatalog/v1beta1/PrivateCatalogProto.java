// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

package com.google.cloud.privatecatalog.v1beta1;

public final class PrivateCatalogProto {
  private PrivateCatalogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Catalog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Inputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_GitSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Version_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/privatecatalog/v1beta1/pr" +
      "ivate_catalog.proto\022#google.cloud.privat" +
      "ecatalog.v1beta1\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032#google/longrunning/operatio" +
      "ns.proto\032\034google/protobuf/struct.proto\032\037" +
      "google/protobuf/timestamp.proto\"d\n\025Searc" +
      "hCatalogsRequest\022\025\n\010resource\030\001 \001(\tB\003\340A\002\022" +
      "\r\n\005query\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npag" +
      "e_token\030\004 \001(\t\"q\n\026SearchCatalogsResponse\022" +
      ">\n\010catalogs\030\001 \003(\0132,.google.cloud.private" +
      "catalog.v1beta1.Catalog\022\027\n\017next_page_tok" +
      "en\030\002 \001(\t\"d\n\025SearchProductsRequest\022\025\n\010res" +
      "ource\030\001 \001(\tB\003\340A\002\022\r\n\005query\030\002 \001(\t\022\021\n\tpage_" +
      "size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"q\n\026Search" +
      "ProductsResponse\022>\n\010products\030\001 \003(\0132,.goo" +
      "gle.cloud.privatecatalog.v1beta1.Product" +
      "\022\027\n\017next_page_token\030\002 \001(\t\"i\n\025SearchVersi" +
      "onsRequest\022\025\n\010resource\030\001 \001(\tB\003\340A\002\022\022\n\005que" +
      "ry\030\002 \001(\tB\003\340A\002\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage" +
      "_token\030\004 \001(\t\"q\n\026SearchVersionsResponse\022>" +
      "\n\010versions\030\001 \003(\0132,.google.cloud.privatec" +
      "atalog.v1beta1.Version\022\027\n\017next_page_toke" +
      "n\030\002 \001(\t\"\202\002\n\007Catalog\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031" +
      "\n\014display_name\030\002 \001(\tB\003\340A\003\022\030\n\013description" +
      "\030\003 \001(\tB\003\340A\003\0224\n\013create_time\030\004 \001(\0132\032.googl" +
      "e.protobuf.TimestampB\003\340A\003\0224\n\013update_time" +
      "\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340A\003:" +
      "C\352A@\n*cloudprivatecatalog.googleapis.com" +
      "/Catalog\022\022catalogs/{catalog}\"\214\003\n\007Product" +
      "\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\027\n\nasset_type\030\002 \001(\tB" +
      "\003\340A\003\0229\n\020display_metadata\030\003 \001(\0132\027.google." +
      "protobuf.StructB\006\340A\002\340A\003\022\025\n\010icon_uri\030\004 \001(" +
      "\tB\003\340A\003\022R\n\020asset_references\030\n \003(\01323.googl" +
      "e.cloud.privatecatalog.v1beta1.AssetRefe" +
      "renceB\003\340A\003\0224\n\013create_time\030\005 \001(\0132\032.google" +
      ".protobuf.TimestampB\003\340A\003\0224\n\013update_time\030" +
      "\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003:C" +
      "\352A@\n*cloudprivatecatalog.googleapis.com/" +
      "Product\022\022products/{product}\"\336\005\n\016AssetRef" +
      "erence\022\017\n\002id\030\001 \001(\tB\003\340A\003\022\030\n\013description\030\002" +
      " \001(\tB\003\340A\003\022@\n\006inputs\030\006 \001(\0132+.google.cloud" +
      ".privatecatalog.v1beta1.InputsB\003\340A\003\022h\n\021v" +
      "alidation_status\030\007 \001(\0162H.google.cloud.pr" +
      "ivatecatalog.v1beta1.AssetReference.Asse" +
      "tValidationStateB\003\340A\003\022@\n\024validation_oper" +
      "ation\030\010 \001(\0132\035.google.longrunning.Operati" +
      "onB\003\340A\003\022\024\n\005asset\030\n \001(\tB\003\340A\003H\000\022\031\n\010gcs_pat" +
      "h\030\013 \001(\tB\005\030\001\340A\003H\000\022I\n\ngit_source\030\017 \001(\0132..g" +
      "oogle.cloud.privatecatalog.v1beta1.GitSo" +
      "urceB\003\340A\003H\000\022G\n\ngcs_source\030\020 \001(\0132..google" +
      ".cloud.privatecatalog.v1beta1.GcsSourceB" +
      "\003\340A\003\0224\n\013create_time\030\014 \001(\0132\032.google.proto" +
      "buf.TimestampB\003\340A\003\0224\n\013update_time\030\r \001(\0132" +
      "\032.google.protobuf.TimestampB\003\340A\003\022\023\n\007vers" +
      "ion\030\016 \001(\tB\002\030\001\"c\n\024AssetValidationState\022&\n" +
      "\"ASSET_VALIDATION_STATE_UNSPECIFIED\020\000\022\013\n" +
      "\007PENDING\020\001\022\t\n\005VALID\020\002\022\013\n\007INVALID\020\003B\010\n\006so" +
      "urce\":\n\006Inputs\0220\n\nparameters\030\001 \001(\0132\027.goo" +
      "gle.protobuf.StructB\003\340A\003\"q\n\tGcsSource\022\025\n" +
      "\010gcs_path\030\001 \001(\tB\003\340A\003\022\027\n\ngeneration\030\002 \001(\003" +
      "B\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.google.prot" +
      "obuf.TimestampB\003\340A\003\"`\n\tGitSource\022\014\n\004repo" +
      "\030\001 \001(\t\022\013\n\003dir\030\002 \001(\t\022\020\n\006commit\030\003 \001(\tH\000\022\020\n" +
      "\006branch\030\004 \001(\tH\000\022\r\n\003tag\030\005 \001(\tH\000B\005\n\003ref\"\272\002" +
      "\n\007Version\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\030\n\013descript" +
      "ion\030\002 \001(\tB\003\340A\003\022+\n\005asset\030\003 \001(\0132\027.google.p" +
      "rotobuf.StructB\003\340A\003\0224\n\013create_time\030\005 \001(\013" +
      "2\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upd" +
      "ate_time\030\006 \001(\0132\032.google.protobuf.Timesta" +
      "mpB\003\340A\003:i\352Af\n*cloudprivatecatalog.google" +
      "apis.com/Version\0228catalogs/{catalog}/pro" +
      "ducts/{product}/versions/{version}2\362\007\n\016P" +
      "rivateCatalog\022\253\002\n\016SearchCatalogs\022:.googl" +
      "e.cloud.privatecatalog.v1beta1.SearchCat" +
      "alogsRequest\032;.google.cloud.privatecatal" +
      "og.v1beta1.SearchCatalogsResponse\"\237\001\202\323\344\223" +
      "\002\230\001\022./v1beta1/{resource=projects/*}/cata" +
      "logs:searchZ5\0223/v1beta1/{resource=organi" +
      "zations/*}/catalogs:searchZ/\022-/v1beta1/{" +
      "resource=folders/*}/catalogs:search\022\253\002\n\016" +
      "SearchProducts\022:.google.cloud.privatecat" +
      "alog.v1beta1.SearchProductsRequest\032;.goo" +
      "gle.cloud.privatecatalog.v1beta1.SearchP" +
      "roductsResponse\"\237\001\202\323\344\223\002\230\001\022./v1beta1/{res" +
      "ource=projects/*}/products:searchZ5\0223/v1" +
      "beta1/{resource=organizations/*}/product" +
      "s:searchZ/\022-/v1beta1/{resource=folders/*" +
      "}/products:search\022\253\002\n\016SearchVersions\022:.g" +
      "oogle.cloud.privatecatalog.v1beta1.Searc" +
      "hVersionsRequest\032;.google.cloud.privatec" +
      "atalog.v1beta1.SearchVersionsResponse\"\237\001" +
      "\202\323\344\223\002\230\001\022./v1beta1/{resource=projects/*}/" +
      "versions:searchZ5\0223/v1beta1/{resource=or" +
      "ganizations/*}/versions:searchZ/\022-/v1bet" +
      "a1/{resource=folders/*}/versions:search\032" +
      "V\312A\"cloudprivatecatalog.googleapis.com\322A" +
      ".https://www.googleapis.com/auth/cloud-p" +
      "latformB\210\002\n\'com.google.cloud.privatecata" +
      "log.v1beta1B\023PrivateCatalogProtoP\001ZQgoog" +
      "le.golang.org/genproto/googleapis/cloud/" +
      "privatecatalog/v1beta1;privatecatalog\252\002#" +
      "Google.Cloud.PrivateCatalog.V1Beta1\312\002#Go" +
      "ogle\\Cloud\\PrivateCatalog\\V1beta1\352\002&Goog" +
      "le::Cloud::PrivateCatalog::V1beta1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor,
        new java.lang.String[] { "Resource", "Query", "PageSize", "PageToken", });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor,
        new java.lang.String[] { "Catalogs", "NextPageToken", });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor,
        new java.lang.String[] { "Resource", "Query", "PageSize", "PageToken", });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor,
        new java.lang.String[] { "Products", "NextPageToken", });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor,
        new java.lang.String[] { "Resource", "Query", "PageSize", "PageToken", });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor,
        new java.lang.String[] { "Versions", "NextPageToken", });
    internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_privatecatalog_v1beta1_Catalog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "CreateTime", "UpdateTime", });
    internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_privatecatalog_v1beta1_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor,
        new java.lang.String[] { "Name", "AssetType", "DisplayMetadata", "IconUri", "AssetReferences", "CreateTime", "UpdateTime", });
    internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor,
        new java.lang.String[] { "Id", "Description", "Inputs", "ValidationStatus", "ValidationOperation", "Asset", "GcsPath", "GitSource", "GcsSource", "CreateTime", "UpdateTime", "Version", "Source", });
    internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_privatecatalog_v1beta1_Inputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor,
        new java.lang.String[] { "Parameters", });
    internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor,
        new java.lang.String[] { "GcsPath", "Generation", "UpdateTime", });
    internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_privatecatalog_v1beta1_GitSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor,
        new java.lang.String[] { "Repo", "Dir", "Commit", "Branch", "Tag", "Ref", });
    internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_privatecatalog_v1beta1_Version_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor,
        new java.lang.String[] { "Name", "Description", "Asset", "CreateTime", "UpdateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
