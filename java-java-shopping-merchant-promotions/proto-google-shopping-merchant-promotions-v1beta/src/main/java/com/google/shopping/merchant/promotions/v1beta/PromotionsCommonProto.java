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
// source: google/shopping/merchant/promotions/v1beta/promotions_common.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.promotions.v1beta;

public final class PromotionsCommonProto {
  private PromotionsCommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_promotions_v1beta_Attributes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_promotions_v1beta_Attributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_DestinationStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_DestinationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_ItemLevelIssue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_ItemLevelIssue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/shopping/merchant/promotions/v1"
          + "beta/promotions_common.proto\022*google.sho"
          + "pping.merchant.promotions.v1beta\032\037google"
          + "/api/field_behavior.proto\032\037google/protob"
          + "uf/timestamp.proto\032 google/shopping/type"
          + "/types.proto\032\032google/type/interval.proto"
          + "\"\325\013\n\nAttributes\022d\n\025product_applicability"
          + "\030\001 \001(\0162@.google.shopping.merchant.promot"
          + "ions.v1beta.ProductApplicabilityB\003\340A\002\022N\n"
          + "\noffer_type\030\002 \001(\01625.google.shopping.merc"
          + "hant.promotions.v1beta.OfferTypeB\003\340A\002\022$\n"
          + "\027generic_redemption_code\030\003 \001(\tB\003\340A\001\022\027\n\nl"
          + "ong_title\030\004 \001(\tB\003\340A\002\022[\n\021coupon_value_typ"
          + "e\030\005 \001(\0162;.google.shopping.merchant.promo"
          + "tions.v1beta.CouponValueTypeB\003\340A\002\022V\n\026pro"
          + "motion_destinations\030\006 \003(\01621.google.shopp"
          + "ing.type.Destination.DestinationEnumB\003\340A"
          + "\002\022\036\n\021item_id_inclusion\030\007 \003(\tB\003\340A\001\022\034\n\017bra"
          + "nd_inclusion\030\010 \003(\tB\003\340A\001\022$\n\027item_group_id"
          + "_inclusion\030\t \003(\tB\003\340A\001\022#\n\026product_type_in"
          + "clusion\030\n \003(\tB\003\340A\001\022\036\n\021item_id_exclusion\030"
          + "\013 \003(\tB\003\340A\001\022\034\n\017brand_exclusion\030\014 \003(\tB\003\340A\001"
          + "\022$\n\027item_group_id_exclusion\030\r \003(\tB\003\340A\001\022#"
          + "\n\026product_type_exclusion\030\016 \003(\tB\003\340A\001\022A\n\027m"
          + "inimum_purchase_amount\030\017 \001(\0132\033.google.sh"
          + "opping.type.PriceB\003\340A\001\022&\n\031minimum_purcha"
          + "se_quantity\030\020 \001(\003B\003\340A\001\022\033\n\016limit_quantity"
          + "\030\021 \001(\003B\003\340A\001\0225\n\013limit_value\030\022 \001(\0132\033.googl"
          + "e.shopping.type.PriceB\003\340A\001\022\030\n\013percent_of"
          + "f\030\023 \001(\003B\003\340A\001\022:\n\020money_off_amount\030\024 \001(\0132\033"
          + ".google.shopping.type.PriceB\003\340A\001\022)\n\034get_"
          + "this_quantity_discounted\030\025 \001(\003B\003\340A\001\0229\n\017f"
          + "ree_gift_value\030\026 \001(\0132\033.google.shopping.t"
          + "ype.PriceB\003\340A\001\022\"\n\025free_gift_description\030"
          + "\027 \001(\tB\003\340A\001\022\036\n\021free_gift_item_id\030\030 \001(\tB\003\340"
          + "A\001\022C\n\037promotion_effective_time_period\030\031 "
          + "\001(\0132\025.google.type.IntervalB\003\340A\002\022A\n\035promo"
          + "tion_display_time_period\030\032 \001(\0132\025.google."
          + "type.IntervalB\003\340A\001\022`\n\023store_applicabilit"
          + "y\030\034 \001(\0162>.google.shopping.merchant.promo"
          + "tions.v1beta.StoreApplicabilityB\003\340A\001\022\"\n\025"
          + "store_codes_inclusion\030\035 \003(\tB\003\340A\001\022\"\n\025stor"
          + "e_codes_exclusion\030\036 \003(\tB\003\340A\001\022\032\n\rpromotio"
          + "n_url\030\037 \001(\tB\003\340A\001\"\221\t\n\017PromotionStatus\022p\n\024"
          + "destination_statuses\030\001 \003(\0132M.google.shop"
          + "ping.merchant.promotions.v1beta.Promotio"
          + "nStatus.DestinationStatusB\003\340A\003\022j\n\021item_l"
          + "evel_issues\030\002 \003(\0132J.google.shopping.merc"
          + "hant.promotions.v1beta.PromotionStatus.I"
          + "temLevelIssueB\003\340A\003\0226\n\rcreation_date\030\003 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0229\n\020la"
          + "st_update_date\030\004 \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\032\310\002\n\021DestinationStatus\022[\n\021r"
          + "eporting_context\030\001 \001(\0162;.google.shopping"
          + ".type.ReportingContext.ReportingContextE"
          + "numB\003\340A\003\022h\n\006status\030\002 \001(\0162S.google.shoppi"
          + "ng.merchant.promotions.v1beta.PromotionS"
          + "tatus.DestinationStatus.StateB\003\340A\003\"l\n\005St"
          + "ate\022\025\n\021STATE_UNSPECIFIED\020\000\022\r\n\tIN_REVIEW\020"
          + "\001\022\014\n\010REJECTED\020\002\022\010\n\004LIVE\020\003\022\013\n\007STOPPED\020\004\022\013"
          + "\n\007EXPIRED\020\005\022\013\n\007PENDING\020\006\032\341\003\n\016ItemLevelIs"
          + "sue\022\021\n\004code\030\001 \001(\tB\003\340A\003\022j\n\010severity\030\002 \001(\016"
          + "2S.google.shopping.merchant.promotions.v"
          + "1beta.PromotionStatus.ItemLevelIssue.Sev"
          + "erityB\003\340A\003\022\027\n\nresolution\030\003 \001(\tB\003\340A\003\022\026\n\ta"
          + "ttribute\030\004 \001(\tB\003\340A\003\022[\n\021reporting_context"
          + "\030\005 \001(\0162;.google.shopping.type.ReportingC"
          + "ontext.ReportingContextEnumB\003\340A\003\022\030\n\013desc"
          + "ription\030\006 \001(\tB\003\340A\003\022\023\n\006detail\030\007 \001(\tB\003\340A\003\022"
          + "\032\n\rdocumentation\030\010 \001(\tB\003\340A\003\022!\n\024applicabl"
          + "e_countries\030\t \003(\tB\003\340A\003\"T\n\010Severity\022\030\n\024SE"
          + "VERITY_UNSPECIFIED\020\000\022\020\n\014NOT_IMPACTED\020\001\022\013"
          + "\n\007DEMOTED\020\002\022\017\n\013DISAPPROVED\020\003*f\n\024ProductA"
          + "pplicability\022%\n!PRODUCT_APPLICABILITY_UN"
          + "SPECIFIED\020\000\022\020\n\014ALL_PRODUCTS\020\001\022\025\n\021SPECIFI"
          + "C_PRODUCTS\020\002*^\n\022StoreApplicability\022#\n\037ST"
          + "ORE_APPLICABILITY_UNSPECIFIED\020\000\022\016\n\nALL_S"
          + "TORES\020\001\022\023\n\017SPECIFIC_STORES\020\002*F\n\tOfferTyp"
          + "e\022\032\n\026OFFER_TYPE_UNSPECIFIED\020\000\022\013\n\007NO_CODE"
          + "\020\001\022\020\n\014GENERIC_CODE\020\002*Q\n\021RedemptionChanne"
          + "l\022\"\n\036REDEMPTION_CHANNEL_UNSPECIFIED\020\000\022\014\n"
          + "\010IN_STORE\020\001\022\n\n\006ONLINE\020\002*\331\002\n\017CouponValueT"
          + "ype\022!\n\035COUPON_VALUE_TYPE_UNSPECIFIED\020\000\022\r"
          + "\n\tMONEY_OFF\020\001\022\017\n\013PERCENT_OFF\020\002\022\031\n\025BUY_M_"
          + "GET_N_MONEY_OFF\020\003\022\033\n\027BUY_M_GET_N_PERCENT"
          + "_OFF\020\004\022\027\n\023BUY_M_GET_MONEY_OFF\020\005\022\031\n\025BUY_M"
          + "_GET_PERCENT_OFF\020\006\022\r\n\tFREE_GIFT\020\007\022\030\n\024FRE"
          + "E_GIFT_WITH_VALUE\020\010\022\032\n\026FREE_GIFT_WITH_IT"
          + "EM_ID\020\t\022\032\n\026FREE_SHIPPING_STANDARD\020\n\022\033\n\027F"
          + "REE_SHIPPING_OVERNIGHT\020\013\022\031\n\025FREE_SHIPPIN"
          + "G_TWO_DAY\020\014B\237\001\n.com.google.shopping.merc"
          + "hant.promotions.v1betaB\025PromotionsCommon"
          + "ProtoP\001ZTcloud.google.com/go/shopping/me"
          + "rchant/promotions/apiv1beta/promotionspb"
          + ";promotionspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.shopping.type.TypesProto.getDescriptor(),
              com.google.type.IntervalProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_promotions_v1beta_Attributes_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_promotions_v1beta_Attributes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_promotions_v1beta_Attributes_descriptor,
            new java.lang.String[] {
              "ProductApplicability",
              "OfferType",
              "GenericRedemptionCode",
              "LongTitle",
              "CouponValueType",
              "PromotionDestinations",
              "ItemIdInclusion",
              "BrandInclusion",
              "ItemGroupIdInclusion",
              "ProductTypeInclusion",
              "ItemIdExclusion",
              "BrandExclusion",
              "ItemGroupIdExclusion",
              "ProductTypeExclusion",
              "MinimumPurchaseAmount",
              "MinimumPurchaseQuantity",
              "LimitQuantity",
              "LimitValue",
              "PercentOff",
              "MoneyOffAmount",
              "GetThisQuantityDiscounted",
              "FreeGiftValue",
              "FreeGiftDescription",
              "FreeGiftItemId",
              "PromotionEffectiveTimePeriod",
              "PromotionDisplayTimePeriod",
              "StoreApplicability",
              "StoreCodesInclusion",
              "StoreCodesExclusion",
              "PromotionUrl",
            });
    internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_descriptor,
            new java.lang.String[] {
              "DestinationStatuses", "ItemLevelIssues", "CreationDate", "LastUpdateDate",
            });
    internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_DestinationStatus_descriptor =
        internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_DestinationStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_DestinationStatus_descriptor,
            new java.lang.String[] {
              "ReportingContext", "Status",
            });
    internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_ItemLevelIssue_descriptor =
        internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_ItemLevelIssue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_promotions_v1beta_PromotionStatus_ItemLevelIssue_descriptor,
            new java.lang.String[] {
              "Code",
              "Severity",
              "Resolution",
              "Attribute",
              "ReportingContext",
              "Description",
              "Detail",
              "Documentation",
              "ApplicableCountries",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.shopping.type.TypesProto.getDescriptor();
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
