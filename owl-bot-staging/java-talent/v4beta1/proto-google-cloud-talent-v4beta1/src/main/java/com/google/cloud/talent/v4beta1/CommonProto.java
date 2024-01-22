// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_TimestampRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_RequestMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ResponseMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeviceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SpellingCorrection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_BatchOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_BatchOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/talent/v4beta1/common.pro" +
      "to\022\033google.cloud.talent.v4beta1\032\037google/" +
      "api/field_behavior.proto\032\037google/protobu" +
      "f/timestamp.proto\032\036google/protobuf/wrapp" +
      "ers.proto\032\030google/type/latlng.proto\032\027goo" +
      "gle/type/money.proto\032 google/type/postal" +
      "_address.proto\"n\n\016TimestampRange\022.\n\nstar" +
      "t_time\030\001 \001(\0132\032.google.protobuf.Timestamp" +
      "\022,\n\010end_time\030\002 \001(\0132\032.google.protobuf.Tim" +
      "estamp\"\267\003\n\010Location\022I\n\rlocation_type\030\001 \001" +
      "(\01622.google.cloud.talent.v4beta1.Locatio" +
      "n.LocationType\0222\n\016postal_address\030\002 \001(\0132\032" +
      ".google.type.PostalAddress\022$\n\007lat_lng\030\003 " +
      "\001(\0132\023.google.type.LatLng\022\024\n\014radius_miles" +
      "\030\004 \001(\001\"\357\001\n\014LocationType\022\035\n\031LOCATION_TYPE" +
      "_UNSPECIFIED\020\000\022\013\n\007COUNTRY\020\001\022\027\n\023ADMINISTR" +
      "ATIVE_AREA\020\002\022\033\n\027SUB_ADMINISTRATIVE_AREA\020" +
      "\003\022\014\n\010LOCALITY\020\004\022\017\n\013POSTAL_CODE\020\005\022\020\n\014SUB_" +
      "LOCALITY\020\006\022\022\n\016SUB_LOCALITY_1\020\007\022\022\n\016SUB_LO" +
      "CALITY_2\020\010\022\020\n\014NEIGHBORHOOD\020\t\022\022\n\016STREET_A" +
      "DDRESS\020\n\"\237\001\n\017RequestMetadata\022\016\n\006domain\030\001" +
      " \001(\t\022\022\n\nsession_id\030\002 \001(\t\022\017\n\007user_id\030\003 \001(" +
      "\t\022\031\n\021allow_missing_ids\030\004 \001(\010\022<\n\013device_i" +
      "nfo\030\005 \001(\0132\'.google.cloud.talent.v4beta1." +
      "DeviceInfo\"&\n\020ResponseMetadata\022\022\n\nreques" +
      "t_id\030\001 \001(\t\"\317\001\n\nDeviceInfo\022G\n\013device_type" +
      "\030\001 \001(\01622.google.cloud.talent.v4beta1.Dev" +
      "iceInfo.DeviceType\022\n\n\002id\030\002 \001(\t\"l\n\nDevice" +
      "Type\022\033\n\027DEVICE_TYPE_UNSPECIFIED\020\000\022\007\n\003WEB" +
      "\020\001\022\016\n\nMOBILE_WEB\020\002\022\013\n\007ANDROID\020\003\022\007\n\003IOS\020\004" +
      "\022\007\n\003BOT\020\005\022\t\n\005OTHER\020\006\"m\n\017CustomAttribute\022" +
      "\025\n\rstring_values\030\001 \003(\t\022\023\n\013long_values\030\002 " +
      "\003(\003\022\022\n\nfilterable\030\003 \001(\010\022\032\n\022keyword_searc" +
      "hable\030\004 \001(\010\"W\n\022SpellingCorrection\022\021\n\tcor" +
      "rected\030\001 \001(\010\022\026\n\016corrected_text\030\002 \001(\t\022\026\n\016" +
      "corrected_html\030\003 \001(\t\"\250\t\n\020CompensationInf" +
      "o\022P\n\007entries\030\001 \003(\0132?.google.cloud.talent" +
      ".v4beta1.CompensationInfo.CompensationEn" +
      "try\022q\n\"annualized_base_compensation_rang" +
      "e\030\002 \001(\0132?.google.cloud.talent.v4beta1.Co" +
      "mpensationInfo.CompensationRangeB\004\342A\001\003\022r" +
      "\n#annualized_total_compensation_range\030\003 " +
      "\001(\0132?.google.cloud.talent.v4beta1.Compen" +
      "sationInfo.CompensationRangeB\004\342A\001\003\032\222\003\n\021C" +
      "ompensationEntry\022L\n\004type\030\001 \001(\0162>.google." +
      "cloud.talent.v4beta1.CompensationInfo.Co" +
      "mpensationType\022L\n\004unit\030\002 \001(\0162>.google.cl" +
      "oud.talent.v4beta1.CompensationInfo.Comp" +
      "ensationUnit\022$\n\006amount\030\003 \001(\0132\022.google.ty" +
      "pe.MoneyH\000\022P\n\005range\030\004 \001(\0132?.google.cloud" +
      ".talent.v4beta1.CompensationInfo.Compens" +
      "ationRangeH\000\022\023\n\013description\030\005 \001(\t\022=\n\027exp" +
      "ected_units_per_year\030\006 \001(\0132\034.google.prot" +
      "obuf.DoubleValueB\025\n\023compensation_amount\032" +
      "o\n\021CompensationRange\022,\n\020max_compensation" +
      "\030\002 \001(\0132\022.google.type.Money\022,\n\020min_compen" +
      "sation\030\001 \001(\0132\022.google.type.Money\"\265\001\n\020Com" +
      "pensationType\022!\n\035COMPENSATION_TYPE_UNSPE" +
      "CIFIED\020\000\022\010\n\004BASE\020\001\022\t\n\005BONUS\020\002\022\021\n\rSIGNING" +
      "_BONUS\020\003\022\n\n\006EQUITY\020\004\022\022\n\016PROFIT_SHARING\020\005" +
      "\022\017\n\013COMMISSIONS\020\006\022\010\n\004TIPS\020\007\022\033\n\027OTHER_COM" +
      "PENSATION_TYPE\020\010\"\234\001\n\020CompensationUnit\022!\n" +
      "\035COMPENSATION_UNIT_UNSPECIFIED\020\000\022\n\n\006HOUR" +
      "LY\020\001\022\t\n\005DAILY\020\002\022\n\n\006WEEKLY\020\003\022\013\n\007MONTHLY\020\004" +
      "\022\n\n\006YEARLY\020\005\022\014\n\010ONE_TIME\020\006\022\033\n\027OTHER_COMP" +
      "ENSATION_UNIT\020\007\"\314\003\n\026BatchOperationMetada" +
      "ta\022H\n\005state\030\001 \001(\01629.google.cloud.talent." +
      "v4beta1.BatchOperationMetadata.State\022\031\n\021" +
      "state_description\030\002 \001(\t\022\025\n\rsuccess_count" +
      "\030\003 \001(\005\022\025\n\rfailure_count\030\004 \001(\005\022\023\n\013total_c" +
      "ount\030\005 \001(\005\022/\n\013create_time\030\006 \001(\0132\032.google" +
      ".protobuf.Timestamp\022/\n\013update_time\030\007 \001(\013" +
      "2\032.google.protobuf.Timestamp\022,\n\010end_time" +
      "\030\010 \001(\0132\032.google.protobuf.Timestamp\"z\n\005St" +
      "ate\022\025\n\021STATE_UNSPECIFIED\020\000\022\020\n\014INITIALIZI" +
      "NG\020\001\022\016\n\nPROCESSING\020\002\022\r\n\tSUCCEEDED\020\003\022\n\n\006F" +
      "AILED\020\004\022\016\n\nCANCELLING\020\005\022\r\n\tCANCELLED\020\006*y" +
      "\n\013CompanySize\022\034\n\030COMPANY_SIZE_UNSPECIFIE" +
      "D\020\000\022\010\n\004MINI\020\001\022\t\n\005SMALL\020\002\022\013\n\007SMEDIUM\020\003\022\n\n" +
      "\006MEDIUM\020\004\022\007\n\003BIG\020\005\022\n\n\006BIGGER\020\006\022\t\n\005GIANT\020" +
      "\007*\342\001\n\nJobBenefit\022\033\n\027JOB_BENEFIT_UNSPECIF" +
      "IED\020\000\022\016\n\nCHILD_CARE\020\001\022\n\n\006DENTAL\020\002\022\024\n\020DOM" +
      "ESTIC_PARTNER\020\003\022\022\n\016FLEXIBLE_HOURS\020\004\022\013\n\007M" +
      "EDICAL\020\005\022\022\n\016LIFE_INSURANCE\020\006\022\022\n\016PARENTAL" +
      "_LEAVE\020\007\022\023\n\017RETIREMENT_PLAN\020\010\022\r\n\tSICK_DA" +
      "YS\020\t\022\014\n\010VACATION\020\n\022\n\n\006VISION\020\013*\216\002\n\nDegre" +
      "eType\022\033\n\027DEGREE_TYPE_UNSPECIFIED\020\000\022\025\n\021PR" +
      "IMARY_EDUCATION\020\001\022\035\n\031LOWER_SECONDARY_EDU" +
      "CATION\020\002\022\035\n\031UPPER_SECONDARY_EDUCATION\020\003\022" +
      "\034\n\030ADULT_REMEDIAL_EDUCATION\020\004\022\034\n\030ASSOCIA" +
      "TES_OR_EQUIVALENT\020\005\022\033\n\027BACHELORS_OR_EQUI" +
      "VALENT\020\006\022\031\n\025MASTERS_OR_EQUIVALENT\020\007\022\032\n\026D" +
      "OCTORAL_OR_EQUIVALENT\020\010*\334\001\n\016EmploymentTy" +
      "pe\022\037\n\033EMPLOYMENT_TYPE_UNSPECIFIED\020\000\022\r\n\tF" +
      "ULL_TIME\020\001\022\r\n\tPART_TIME\020\002\022\016\n\nCONTRACTOR\020" +
      "\003\022\024\n\020CONTRACT_TO_HIRE\020\004\022\r\n\tTEMPORARY\020\005\022\n" +
      "\n\006INTERN\020\006\022\r\n\tVOLUNTEER\020\007\022\014\n\010PER_DIEM\020\010\022" +
      "\022\n\016FLY_IN_FLY_OUT\020\t\022\031\n\025OTHER_EMPLOYMENT_" +
      "TYPE\020\n*q\n\010JobLevel\022\031\n\025JOB_LEVEL_UNSPECIF" +
      "IED\020\000\022\017\n\013ENTRY_LEVEL\020\001\022\017\n\013EXPERIENCED\020\002\022" +
      "\013\n\007MANAGER\020\003\022\014\n\010DIRECTOR\020\004\022\r\n\tEXECUTIVE\020" +
      "\005*\272\006\n\013JobCategory\022\034\n\030JOB_CATEGORY_UNSPEC" +
      "IFIED\020\000\022\032\n\026ACCOUNTING_AND_FINANCE\020\001\022\035\n\031A" +
      "DMINISTRATIVE_AND_OFFICE\020\002\022\035\n\031ADVERTISIN" +
      "G_AND_MARKETING\020\003\022\017\n\013ANIMAL_CARE\020\004\022\032\n\026AR" +
      "T_FASHION_AND_DESIGN\020\005\022\027\n\023BUSINESS_OPERA" +
      "TIONS\020\006\022\033\n\027CLEANING_AND_FACILITIES\020\007\022\023\n\017" +
      "COMPUTER_AND_IT\020\010\022\020\n\014CONSTRUCTION\020\t\022\024\n\020C" +
      "USTOMER_SERVICE\020\n\022\r\n\tEDUCATION\020\013\022\034\n\030ENTE" +
      "RTAINMENT_AND_TRAVEL\020\014\022\030\n\024FARMING_AND_OU" +
      "TDOORS\020\r\022\016\n\nHEALTHCARE\020\016\022\023\n\017HUMAN_RESOUR" +
      "CES\020\017\022\'\n#INSTALLATION_MAINTENANCE_AND_RE" +
      "PAIR\020\020\022\t\n\005LEGAL\020\021\022\016\n\nMANAGEMENT\020\022\022\037\n\033MAN" +
      "UFACTURING_AND_WAREHOUSE\020\023\022$\n MEDIA_COMM" +
      "UNICATIONS_AND_WRITING\020\024\022\026\n\022OIL_GAS_AND_" +
      "MINING\020\025\022\036\n\032PERSONAL_CARE_AND_SERVICES\020\026" +
      "\022\027\n\023PROTECTIVE_SERVICES\020\027\022\017\n\013REAL_ESTATE" +
      "\020\030\022\036\n\032RESTAURANT_AND_HOSPITALITY\020\031\022\024\n\020SA" +
      "LES_AND_RETAIL\020\032\022\033\n\027SCIENCE_AND_ENGINEER" +
      "ING\020\033\022\"\n\036SOCIAL_SERVICES_AND_NON_PROFIT\020" +
      "\034\022!\n\035SPORTS_FITNESS_AND_RECREATION\020\035\022 \n\034" +
      "TRANSPORTATION_AND_LOGISTICS\020\036*e\n\rPostin" +
      "gRegion\022\036\n\032POSTING_REGION_UNSPECIFIED\020\000\022" +
      "\027\n\023ADMINISTRATIVE_AREA\020\001\022\n\n\006NATION\020\002\022\017\n\013" +
      "TELECOMMUTE\020\003*n\n\nVisibility\022\032\n\026VISIBILIT" +
      "Y_UNSPECIFIED\020\000\022\020\n\014ACCOUNT_ONLY\020\001\022\026\n\022SHA" +
      "RED_WITH_GOOGLE\020\002\022\026\n\022SHARED_WITH_PUBLIC\020" +
      "\003\032\002\030\001*q\n\020HtmlSanitization\022!\n\035HTML_SANITI" +
      "ZATION_UNSPECIFIED\020\000\022\036\n\032HTML_SANITIZATIO" +
      "N_DISABLED\020\001\022\032\n\026SIMPLE_FORMATTING_ONLY\020\002" +
      "*c\n\rCommuteMethod\022\036\n\032COMMUTE_METHOD_UNSP" +
      "ECIFIED\020\000\022\013\n\007DRIVING\020\001\022\013\n\007TRANSIT\020\002\022\013\n\007W" +
      "ALKING\020\003\022\013\n\007CYCLING\020\004Bo\n\037com.google.clou" +
      "d.talent.v4beta1B\013CommonProtoP\001Z7cloud.g" +
      "oogle.com/go/talent/apiv4beta1/talentpb;" +
      "talentpb\242\002\003CTSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
          com.google.type.MoneyProto.getDescriptor(),
          com.google.type.PostalAddressProto.getDescriptor(),
        });
    internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_TimestampRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", });
    internal_static_google_cloud_talent_v4beta1_Location_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_Location_descriptor,
        new java.lang.String[] { "LocationType", "PostalAddress", "LatLng", "RadiusMiles", });
    internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_RequestMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor,
        new java.lang.String[] { "Domain", "SessionId", "UserId", "AllowMissingIds", "DeviceInfo", });
    internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_ResponseMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor,
        new java.lang.String[] { "RequestId", });
    internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_DeviceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor,
        new java.lang.String[] { "DeviceType", "Id", });
    internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_CustomAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor,
        new java.lang.String[] { "StringValues", "LongValues", "Filterable", "KeywordSearchable", });
    internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_SpellingCorrection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor,
        new java.lang.String[] { "Corrected", "CorrectedText", "CorrectedHtml", });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor,
        new java.lang.String[] { "Entries", "AnnualizedBaseCompensationRange", "AnnualizedTotalCompensationRange", });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor =
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor,
        new java.lang.String[] { "Type", "Unit", "Amount", "Range", "Description", "ExpectedUnitsPerYear", "CompensationAmount", });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor =
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor,
        new java.lang.String[] { "MaxCompensation", "MinCompensation", });
    internal_static_google_cloud_talent_v4beta1_BatchOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_BatchOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_BatchOperationMetadata_descriptor,
        new java.lang.String[] { "State", "StateDescription", "SuccessCount", "FailureCount", "TotalCount", "CreateTime", "UpdateTime", "EndTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
