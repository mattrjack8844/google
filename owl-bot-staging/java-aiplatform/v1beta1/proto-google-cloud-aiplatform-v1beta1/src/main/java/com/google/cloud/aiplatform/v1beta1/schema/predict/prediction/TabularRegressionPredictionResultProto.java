// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/tabular_regression.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class TabularRegressionPredictionResultProto {
  private TabularRegressionPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularRegressionPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularRegressionPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nRgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/prediction/tabular_regression.p" +
      "roto\0229google.cloud.aiplatform.v1beta1.sc" +
      "hema.predict.prediction\"\\\n!TabularRegres" +
      "sionPredictionResult\022\r\n\005value\030\001 \001(\002\022\023\n\013l" +
      "ower_bound\030\002 \001(\002\022\023\n\013upper_bound\030\003 \001(\002B\210\003" +
      "\n=com.google.cloud.aiplatform.v1beta1.sc" +
      "hema.predict.predictionB&TabularRegressi" +
      "onPredictionResultProtoP\001Zcgoogle.golang" +
      ".org/genproto/googleapis/cloud/aiplatfor" +
      "m/v1beta1/schema/predict/prediction;pred" +
      "iction\252\0029Google.Cloud.AIPlatform.V1Beta1" +
      ".Schema.Predict.Prediction\312\0029Google\\Clou" +
      "d\\AIPlatform\\V1beta1\\Schema\\Predict\\Pred" +
      "iction\352\002?Google::Cloud::AIPlatform::V1be" +
      "ta1::Schema::Predict::Predictionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularRegressionPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularRegressionPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularRegressionPredictionResult_descriptor,
        new java.lang.String[] { "Value", "LowerBound", "UpperBound", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
