// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/image_segmentation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class ImageSegmentationPredictionResultProto {
  private ImageSegmentationPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nRgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/prediction/image_segmentation.p" +
      "roto\0229google.cloud.aiplatform.v1beta1.sc" +
      "hema.predict.prediction\"S\n!ImageSegmenta" +
      "tionPredictionResult\022\025\n\rcategory_mask\030\001 " +
      "\001(\t\022\027\n\017confidence_mask\030\002 \001(\tB\202\003\n=com.goo" +
      "gle.cloud.aiplatform.v1beta1.schema.pred" +
      "ict.predictionB&ImageSegmentationPredict" +
      "ionResultProtoP\001Z]cloud.google.com/go/ai" +
      "platform/apiv1beta1/schema/predict/predi" +
      "ction/predictionpb;predictionpb\252\0029Google" +
      ".Cloud.AIPlatform.V1Beta1.Schema.Predict" +
      ".Prediction\312\0029Google\\Cloud\\AIPlatform\\V1" +
      "beta1\\Schema\\Predict\\Prediction\352\002?Google" +
      "::Cloud::AIPlatform::V1beta1::Schema::Pr" +
      "edict::Predictionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ImageSegmentationPredictionResult_descriptor,
        new java.lang.String[] { "CategoryMask", "ConfidenceMask", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
