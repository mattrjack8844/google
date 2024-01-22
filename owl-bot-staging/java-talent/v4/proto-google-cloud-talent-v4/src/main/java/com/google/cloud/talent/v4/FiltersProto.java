// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/filters.proto

package com.google.cloud.talent.v4;

public final class FiltersProto {
  private FiltersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4_JobQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_JobQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4_LocationFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_LocationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4_CompensationFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CompensationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4_CommuteFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CommuteFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/talent/v4/filters.proto\022\026" +
      "google.cloud.talent.v4\032\037google/api/field" +
      "_behavior.proto\032#google/cloud/talent/v4/" +
      "common.proto\032\036google/protobuf/duration.p" +
      "roto\032\030google/type/latlng.proto\032\033google/t" +
      "ype/timeofday.proto\"\342\004\n\010JobQuery\022\r\n\005quer" +
      "y\030\001 \001(\t\022\033\n\023query_language_code\030\016 \001(\t\022\021\n\t" +
      "companies\030\002 \003(\t\022@\n\020location_filters\030\003 \003(" +
      "\0132&.google.cloud.talent.v4.LocationFilte" +
      "r\022;\n\016job_categories\030\004 \003(\0162#.google.cloud" +
      ".talent.v4.JobCategory\022=\n\016commute_filter" +
      "\030\005 \001(\0132%.google.cloud.talent.v4.CommuteF" +
      "ilter\022\035\n\025company_display_names\030\006 \003(\t\022G\n\023" +
      "compensation_filter\030\007 \001(\0132*.google.cloud" +
      ".talent.v4.CompensationFilter\022\037\n\027custom_" +
      "attribute_filter\030\010 \001(\t\022\033\n\023disable_spell_" +
      "check\030\t \001(\010\022@\n\020employment_types\030\n \003(\0162&." +
      "google.cloud.talent.v4.EmploymentType\022\026\n" +
      "\016language_codes\030\013 \003(\t\022B\n\022publish_time_ra" +
      "nge\030\014 \001(\0132&.google.cloud.talent.v4.Times" +
      "tampRange\022\025\n\rexcluded_jobs\030\r \003(\t\"\355\002\n\016Loc" +
      "ationFilter\022\017\n\007address\030\001 \001(\t\022\023\n\013region_c" +
      "ode\030\002 \001(\t\022$\n\007lat_lng\030\003 \001(\0132\023.google.type" +
      ".LatLng\022\031\n\021distance_in_miles\030\004 \001(\001\022\\\n\026te" +
      "lecommute_preference\030\005 \001(\0162<.google.clou" +
      "d.talent.v4.LocationFilter.TelecommutePr" +
      "eference\"\225\001\n\025TelecommutePreference\022&\n\"TE" +
      "LECOMMUTE_PREFERENCE_UNSPECIFIED\020\000\022\034\n\024TE" +
      "LECOMMUTE_EXCLUDED\020\001\032\002\010\001\022\027\n\023TELECOMMUTE_" +
      "ALLOWED\020\002\022\035\n\031TELECOMMUTE_JOBS_EXCLUDED\020\003" +
      "\"\275\003\n\022CompensationFilter\022I\n\004type\030\001 \001(\01625." +
      "google.cloud.talent.v4.CompensationFilte" +
      "r.FilterTypeB\004\342A\001\002\022N\n\005units\030\002 \003(\01629.goog" +
      "le.cloud.talent.v4.CompensationInfo.Comp" +
      "ensationUnitB\004\342A\001\002\022I\n\005range\030\003 \001(\0132:.goog" +
      "le.cloud.talent.v4.CompensationInfo.Comp" +
      "ensationRange\0228\n0include_jobs_with_unspe" +
      "cified_compensation_range\030\004 \001(\010\"\206\001\n\nFilt" +
      "erType\022\033\n\027FILTER_TYPE_UNSPECIFIED\020\000\022\r\n\tU" +
      "NIT_ONLY\020\001\022\023\n\017UNIT_AND_AMOUNT\020\002\022\032\n\026ANNUA" +
      "LIZED_BASE_AMOUNT\020\003\022\033\n\027ANNUALIZED_TOTAL_" +
      "AMOUNT\020\004\"\304\003\n\rCommuteFilter\022C\n\016commute_me" +
      "thod\030\001 \001(\0162%.google.cloud.talent.v4.Comm" +
      "uteMethodB\004\342A\001\002\0224\n\021start_coordinates\030\002 \001" +
      "(\0132\023.google.type.LatLngB\004\342A\001\002\0228\n\017travel_" +
      "duration\030\003 \001(\0132\031.google.protobuf.Duratio" +
      "nB\004\342A\001\002\022!\n\031allow_imprecise_addresses\030\004 \001" +
      "(\010\022I\n\014road_traffic\030\005 \001(\01621.google.cloud." +
      "talent.v4.CommuteFilter.RoadTrafficH\000\0220\n" +
      "\016departure_time\030\006 \001(\0132\026.google.type.Time" +
      "OfDayH\000\"L\n\013RoadTraffic\022\034\n\030ROAD_TRAFFIC_U" +
      "NSPECIFIED\020\000\022\020\n\014TRAFFIC_FREE\020\001\022\r\n\tBUSY_H" +
      "OUR\020\002B\020\n\016traffic_optionBf\n\032com.google.cl" +
      "oud.talent.v4B\014FiltersProtoP\001Z2cloud.goo" +
      "gle.com/go/talent/apiv4/talentpb;talentp" +
      "b\242\002\003CTSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.talent.v4.CommonProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
          com.google.type.TimeOfDayProto.getDescriptor(),
        });
    internal_static_google_cloud_talent_v4_JobQuery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_JobQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4_JobQuery_descriptor,
        new java.lang.String[] { "Query", "QueryLanguageCode", "Companies", "LocationFilters", "JobCategories", "CommuteFilter", "CompanyDisplayNames", "CompensationFilter", "CustomAttributeFilter", "DisableSpellCheck", "EmploymentTypes", "LanguageCodes", "PublishTimeRange", "ExcludedJobs", });
    internal_static_google_cloud_talent_v4_LocationFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4_LocationFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4_LocationFilter_descriptor,
        new java.lang.String[] { "Address", "RegionCode", "LatLng", "DistanceInMiles", "TelecommutePreference", });
    internal_static_google_cloud_talent_v4_CompensationFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4_CompensationFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4_CompensationFilter_descriptor,
        new java.lang.String[] { "Type", "Units", "Range", "IncludeJobsWithUnspecifiedCompensationRange", });
    internal_static_google_cloud_talent_v4_CommuteFilter_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4_CommuteFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4_CommuteFilter_descriptor,
        new java.lang.String[] { "CommuteMethod", "StartCoordinates", "TravelDuration", "AllowImpreciseAddresses", "RoadTraffic", "DepartureTime", "TrafficOption", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4.CommonProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
