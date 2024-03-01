// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/model.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public final class ModelProto {
  private ModelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_Model_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_Model_ServingConfigList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_Model_ServingConfigList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/retail/v2beta/model.proto" +
      "\022\032google.cloud.retail.v2beta\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\032\'google/cloud/retail/v2beta/com" +
      "mon.proto\032\037google/protobuf/timestamp.pro" +
      "to\"\272\n\n\005Model\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\031\n\014displ" +
      "ay_name\030\002 \001(\tB\003\340A\002\022L\n\016training_state\030\003 \001" +
      "(\0162/.google.cloud.retail.v2beta.Model.Tr" +
      "ainingStateB\003\340A\001\022J\n\rserving_state\030\004 \001(\0162" +
      "..google.cloud.retail.v2beta.Model.Servi" +
      "ngStateB\003\340A\003\0224\n\013create_time\030\005 \001(\0132\032.goog" +
      "le.protobuf.TimestampB\003\340A\003\0224\n\013update_tim" +
      "e\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003" +
      "\022\021\n\004type\030\007 \001(\tB\003\340A\002\022#\n\026optimization_obje" +
      "ctive\030\010 \001(\tB\003\340A\001\022Y\n\025periodic_tuning_stat" +
      "e\030\013 \001(\01625.google.cloud.retail.v2beta.Mod" +
      "el.PeriodicTuningStateB\003\340A\001\0227\n\016last_tune" +
      "_time\030\014 \001(\0132\032.google.protobuf.TimestampB" +
      "\003\340A\003\022\035\n\020tuning_operation\030\017 \001(\tB\003\340A\003\022D\n\nd" +
      "ata_state\030\020 \001(\0162+.google.cloud.retail.v2" +
      "beta.Model.DataStateB\003\340A\003\022Y\n\020filtering_o" +
      "ption\030\022 \001(\0162:.google.cloud.retail.v2beta" +
      ".RecommendationsFilteringOptionB\003\340A\001\022V\n\024" +
      "serving_config_lists\030\023 \003(\01323.google.clou" +
      "d.retail.v2beta.Model.ServingConfigListB" +
      "\003\340A\003\0324\n\021ServingConfigList\022\037\n\022serving_con" +
      "fig_ids\030\001 \003(\tB\003\340A\001\"R\n\014ServingState\022\035\n\031SE" +
      "RVING_STATE_UNSPECIFIED\020\000\022\014\n\010INACTIVE\020\001\022" +
      "\n\n\006ACTIVE\020\002\022\t\n\005TUNED\020\003\"I\n\rTrainingState\022" +
      "\036\n\032TRAINING_STATE_UNSPECIFIED\020\000\022\n\n\006PAUSE" +
      "D\020\001\022\014\n\010TRAINING\020\002\"\220\001\n\023PeriodicTuningStat" +
      "e\022%\n!PERIODIC_TUNING_STATE_UNSPECIFIED\020\000" +
      "\022\034\n\030PERIODIC_TUNING_DISABLED\020\001\022\027\n\023ALL_TU" +
      "NING_DISABLED\020\003\022\033\n\027PERIODIC_TUNING_ENABL" +
      "ED\020\002\"D\n\tDataState\022\032\n\026DATA_STATE_UNSPECIF" +
      "IED\020\000\022\013\n\007DATA_OK\020\001\022\016\n\nDATA_ERROR\020\002:k\352Ah\n" +
      "\033retail.googleapis.com/Model\022Iprojects/{" +
      "project}/locations/{location}/catalogs/{" +
      "catalog}/models/{model}B\311\001\n\036com.google.c" +
      "loud.retail.v2betaB\nModelProtoP\001Z6cloud." +
      "google.com/go/retail/apiv2beta/retailpb;" +
      "retailpb\242\002\006RETAIL\252\002\032Google.Cloud.Retail." +
      "V2Beta\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Go" +
      "ogle::Cloud::Retail::V2betab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2beta.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2beta_Model_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_Model_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_Model_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "TrainingState", "ServingState", "CreateTime", "UpdateTime", "Type", "OptimizationObjective", "PeriodicTuningState", "LastTuneTime", "TuningOperation", "DataState", "FilteringOption", "ServingConfigLists", });
    internal_static_google_cloud_retail_v2beta_Model_ServingConfigList_descriptor =
      internal_static_google_cloud_retail_v2beta_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_Model_ServingConfigList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_Model_ServingConfigList_descriptor,
        new java.lang.String[] { "ServingConfigIds", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
