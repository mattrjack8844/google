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
// source: google/cloud/retail/v2beta/catalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public final class CatalogProto {
  private CatalogProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ProductLevelConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ProductLevelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CatalogAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CatalogAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_AttributesConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_AttributesConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_AttributesConfig_CatalogAttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompletionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompletionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_MerchantCenterLink_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_MerchantCenterLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_Catalog_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_Catalog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/retail/v2beta/catalog.pro"
          + "to\022\032google.cloud.retail.v2beta\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\032\'google/cloud/retail/v2beta/c"
          + "ommon.proto\032.google/cloud/retail/v2beta/"
          + "import_config.proto\"^\n\022ProductLevelConfi"
          + "g\022\036\n\026ingestion_product_type\030\001 \001(\t\022(\n mer"
          + "chant_center_product_id_field\030\002 \001(\t\"\300\n\n\020"
          + "CatalogAttribute\022\021\n\003key\030\001 \001(\tB\004\342A\001\002\022\024\n\006i"
          + "n_use\030\t \001(\010B\004\342A\001\003\022N\n\004type\030\n \001(\0162:.google"
          + ".cloud.retail.v2beta.CatalogAttribute.At"
          + "tributeTypeB\004\342A\001\003\022V\n\020indexable_option\030\005 "
          + "\001(\0162<.google.cloud.retail.v2beta.Catalog"
          + "Attribute.IndexableOption\022e\n\030dynamic_fac"
          + "etable_option\030\006 \001(\0162C.google.cloud.retai"
          + "l.v2beta.CatalogAttribute.DynamicFacetab"
          + "leOption\022X\n\021searchable_option\030\007 \001(\0162=.go"
          + "ogle.cloud.retail.v2beta.CatalogAttribut"
          + "e.SearchableOption\022d\n recommendations_fi"
          + "ltering_option\030\010 \001(\0162:.google.cloud.reta"
          + "il.v2beta.RecommendationsFilteringOption"
          + "\022c\n\027exact_searchable_option\030\013 \001(\0162B.goog"
          + "le.cloud.retail.v2beta.CatalogAttribute."
          + "ExactSearchableOption\022Z\n\022retrievable_opt"
          + "ion\030\014 \001(\0162>.google.cloud.retail.v2beta.C"
          + "atalogAttribute.RetrievableOption\"8\n\rAtt"
          + "ributeType\022\013\n\007UNKNOWN\020\000\022\013\n\007TEXTUAL\020\001\022\r\n\t"
          + "NUMERICAL\020\002\"b\n\017IndexableOption\022 \n\034INDEXA"
          + "BLE_OPTION_UNSPECIFIED\020\000\022\025\n\021INDEXABLE_EN"
          + "ABLED\020\001\022\026\n\022INDEXABLE_DISABLED\020\002\"\201\001\n\026Dyna"
          + "micFacetableOption\022(\n$DYNAMIC_FACETABLE_"
          + "OPTION_UNSPECIFIED\020\000\022\035\n\031DYNAMIC_FACETABL"
          + "E_ENABLED\020\001\022\036\n\032DYNAMIC_FACETABLE_DISABLE"
          + "D\020\002\"f\n\020SearchableOption\022!\n\035SEARCHABLE_OP"
          + "TION_UNSPECIFIED\020\000\022\026\n\022SEARCHABLE_ENABLED"
          + "\020\001\022\027\n\023SEARCHABLE_DISABLED\020\002\"}\n\025ExactSear"
          + "chableOption\022\'\n#EXACT_SEARCHABLE_OPTION_"
          + "UNSPECIFIED\020\000\022\034\n\030EXACT_SEARCHABLE_ENABLE"
          + "D\020\001\022\035\n\031EXACT_SEARCHABLE_DISABLED\020\002\"j\n\021Re"
          + "trievableOption\022\"\n\036RETRIEVABLE_OPTION_UN"
          + "SPECIFIED\020\000\022\027\n\023RETRIEVABLE_ENABLED\020\001\022\030\n\024"
          + "RETRIEVABLE_DISABLED\020\002\"\302\003\n\020AttributesCon"
          + "fig\022\023\n\004name\030\001 \001(\tB\005\342A\002\002\005\022_\n\022catalog_attr"
          + "ibutes\030\002 \003(\0132C.google.cloud.retail.v2bet"
          + "a.AttributesConfig.CatalogAttributesEntr"
          + "y\022V\n\026attribute_config_level\030\003 \001(\01620.goog"
          + "le.cloud.retail.v2beta.AttributeConfigLe"
          + "velB\004\342A\001\003\032f\n\026CatalogAttributesEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022;\n\005value\030\002 \001(\0132,.google.cloud.r"
          + "etail.v2beta.CatalogAttribute:\0028\001:x\352Au\n&"
          + "retail.googleapis.com/AttributesConfig\022K"
          + "projects/{project}/locations/{location}/"
          + "catalogs/{catalog}/attributesConfig\"\252\005\n\020"
          + "CompletionConfig\022\023\n\004name\030\001 \001(\tB\005\342A\002\002\005\022\026\n"
          + "\016matching_order\030\002 \001(\t\022\027\n\017max_suggestions"
          + "\030\003 \001(\005\022\031\n\021min_prefix_length\030\004 \001(\005\022\025\n\raut"
          + "o_learning\030\013 \001(\010\022]\n\030suggestions_input_co"
          + "nfig\030\005 \001(\01325.google.cloud.retail.v2beta."
          + "CompletionDataInputConfigB\004\342A\001\003\022/\n!last_"
          + "suggestions_import_operation\030\006 \001(\tB\004\342A\001\003"
          + "\022Z\n\025denylist_input_config\030\007 \001(\01325.google"
          + ".cloud.retail.v2beta.CompletionDataInput"
          + "ConfigB\004\342A\001\003\022,\n\036last_denylist_import_ope"
          + "ration\030\010 \001(\tB\004\342A\001\003\022[\n\026allowlist_input_co"
          + "nfig\030\t \001(\01325.google.cloud.retail.v2beta."
          + "CompletionDataInputConfigB\004\342A\001\003\022-\n\037last_"
          + "allowlist_import_operation\030\n \001(\tB\004\342A\001\003:x"
          + "\352Au\n&retail.googleapis.com/CompletionCon"
          + "fig\022Kprojects/{project}/locations/{locat"
          + "ion}/catalogs/{catalog}/completionConfig"
          + "\"\330\001\n\022MerchantCenterLink\022(\n\032merchant_cent"
          + "er_account_id\030\001 \001(\003B\004\342A\001\002\022\021\n\tbranch_id\030\002"
          + " \001(\t\022\024\n\014destinations\030\003 \003(\t\022\023\n\013region_cod"
          + "e\030\004 \001(\t\022\025\n\rlanguage_code\030\005 \001(\t\022C\n\005feeds\030"
          + "\006 \003(\01324.google.cloud.retail.v2beta.Merch"
          + "antCenterFeedFilter\"N\n\030MerchantCenterFee"
          + "dFilter\022\027\n\017primary_feed_id\030\001 \001(\003\022\031\n\021prim"
          + "ary_feed_name\030\002 \001(\t\"\\\n\033MerchantCenterLin"
          + "kingConfig\022=\n\005links\030\001 \003(\0132..google.cloud"
          + ".retail.v2beta.MerchantCenterLink\"\320\002\n\007Ca"
          + "talog\022\023\n\004name\030\001 \001(\tB\005\342A\002\002\005\022\033\n\014display_na"
          + "me\030\002 \001(\tB\005\342A\002\002\005\022R\n\024product_level_config\030"
          + "\004 \001(\0132..google.cloud.retail.v2beta.Produ"
          + "ctLevelConfigB\004\342A\001\002\022_\n\036merchant_center_l"
          + "inking_config\030\006 \001(\01327.google.cloud.retai"
          + "l.v2beta.MerchantCenterLinkingConfig:^\352A"
          + "[\n\035retail.googleapis.com/Catalog\022:projec"
          + "ts/{project}/locations/{location}/catalo"
          + "gs/{catalog}B\313\001\n\036com.google.cloud.retail"
          + ".v2betaB\014CatalogProtoP\001Z6cloud.google.co"
          + "m/go/retail/apiv2beta/retailpb;retailpb\242"
          + "\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312\002\032"
          + "Google\\Cloud\\Retail\\V2beta\352\002\035Google::Clo"
          + "ud::Retail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2beta.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_ProductLevelConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_ProductLevelConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ProductLevelConfig_descriptor,
            new java.lang.String[] {
              "IngestionProductType", "MerchantCenterProductIdField",
            });
    internal_static_google_cloud_retail_v2beta_CatalogAttribute_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_CatalogAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CatalogAttribute_descriptor,
            new java.lang.String[] {
              "Key",
              "InUse",
              "Type",
              "IndexableOption",
              "DynamicFacetableOption",
              "SearchableOption",
              "RecommendationsFilteringOption",
              "ExactSearchableOption",
              "RetrievableOption",
            });
    internal_static_google_cloud_retail_v2beta_AttributesConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_AttributesConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_AttributesConfig_descriptor,
            new java.lang.String[] {
              "Name", "CatalogAttributes", "AttributeConfigLevel",
            });
    internal_static_google_cloud_retail_v2beta_AttributesConfig_CatalogAttributesEntry_descriptor =
        internal_static_google_cloud_retail_v2beta_AttributesConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2beta_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_AttributesConfig_CatalogAttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2beta_CompletionConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_CompletionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompletionConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "MatchingOrder",
              "MaxSuggestions",
              "MinPrefixLength",
              "AutoLearning",
              "SuggestionsInputConfig",
              "LastSuggestionsImportOperation",
              "DenylistInputConfig",
              "LastDenylistImportOperation",
              "AllowlistInputConfig",
              "LastAllowlistImportOperation",
            });
    internal_static_google_cloud_retail_v2beta_MerchantCenterLink_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2beta_MerchantCenterLink_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_MerchantCenterLink_descriptor,
            new java.lang.String[] {
              "MerchantCenterAccountId",
              "BranchId",
              "Destinations",
              "RegionCode",
              "LanguageCode",
              "Feeds",
            });
    internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_descriptor,
            new java.lang.String[] {
              "PrimaryFeedId", "PrimaryFeedName",
            });
    internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_descriptor,
            new java.lang.String[] {
              "Links",
            });
    internal_static_google_cloud_retail_v2beta_Catalog_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2beta_Catalog_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_Catalog_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "ProductLevelConfig", "MerchantCenterLinkingConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.CommonProto.getDescriptor();
    com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
