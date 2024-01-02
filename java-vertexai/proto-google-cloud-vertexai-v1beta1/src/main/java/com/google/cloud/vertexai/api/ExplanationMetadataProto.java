/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/vertexai/v1beta1/explanation_metadata.proto

package com.google.cloud.vertexai.api;

public final class ExplanationMetadataProto {
  private ExplanationMetadataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_Visualization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_Visualization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/vertexai/v1beta1/explanat"
          + "ion_metadata.proto\022\035google.cloud.vertexa"
          + "i.v1beta1\032\037google/api/field_behavior.pro"
          + "to\032\034google/protobuf/struct.proto\"\362\022\n\023Exp"
          + "lanationMetadata\022T\n\006inputs\030\001 \003(\0132>.googl"
          + "e.cloud.vertexai.v1beta1.ExplanationMeta"
          + "data.InputsEntryB\004\342A\001\002\022V\n\007outputs\030\002 \003(\0132"
          + "?.google.cloud.vertexai.v1beta1.Explanat"
          + "ionMetadata.OutputsEntryB\004\342A\001\002\022\'\n\037featur"
          + "e_attributions_schema_uri\030\003 \001(\t\022\033\n\023laten"
          + "t_space_source\030\005 \001(\t\032\331\r\n\rInputMetadata\022/"
          + "\n\017input_baselines\030\001 \003(\0132\026.google.protobu"
          + "f.Value\022\031\n\021input_tensor_name\030\002 \001(\t\022[\n\010en"
          + "coding\030\003 \001(\0162I.google.cloud.vertexai.v1b"
          + "eta1.ExplanationMetadata.InputMetadata.E"
          + "ncoding\022\020\n\010modality\030\004 \001(\t\022q\n\024feature_val"
          + "ue_domain\030\005 \001(\0132S.google.cloud.vertexai."
          + "v1beta1.ExplanationMetadata.InputMetadat"
          + "a.FeatureValueDomain\022\033\n\023indices_tensor_n"
          + "ame\030\006 \001(\t\022\037\n\027dense_shape_tensor_name\030\007 \001"
          + "(\t\022\035\n\025index_feature_mapping\030\010 \003(\t\022\033\n\023enc"
          + "oded_tensor_name\030\t \001(\t\0221\n\021encoded_baseli"
          + "nes\030\n \003(\0132\026.google.protobuf.Value\022e\n\rvis"
          + "ualization\030\013 \001(\0132N.google.cloud.vertexai"
          + ".v1beta1.ExplanationMetadata.InputMetada"
          + "ta.Visualization\022\022\n\ngroup_name\030\014 \001(\t\032j\n\022"
          + "FeatureValueDomain\022\021\n\tmin_value\030\001 \001(\002\022\021\n"
          + "\tmax_value\030\002 \001(\002\022\025\n\roriginal_mean\030\003 \001(\002\022"
          + "\027\n\017original_stddev\030\004 \001(\002\032\342\006\n\rVisualizati"
          + "on\022a\n\004type\030\001 \001(\0162S.google.cloud.vertexai"
          + ".v1beta1.ExplanationMetadata.InputMetada"
          + "ta.Visualization.Type\022i\n\010polarity\030\002 \001(\0162"
          + "W.google.cloud.vertexai.v1beta1.Explanat"
          + "ionMetadata.InputMetadata.Visualization."
          + "Polarity\022j\n\tcolor_map\030\003 \001(\0162W.google.clo"
          + "ud.vertexai.v1beta1.ExplanationMetadata."
          + "InputMetadata.Visualization.ColorMap\022\037\n\027"
          + "clip_percent_upperbound\030\004 \001(\002\022\037\n\027clip_pe"
          + "rcent_lowerbound\030\005 \001(\002\022p\n\014overlay_type\030\006"
          + " \001(\0162Z.google.cloud.vertexai.v1beta1.Exp"
          + "lanationMetadata.InputMetadata.Visualiza"
          + "tion.OverlayType\"6\n\004Type\022\024\n\020TYPE_UNSPECI"
          + "FIED\020\000\022\n\n\006PIXELS\020\001\022\014\n\010OUTLINES\020\002\"J\n\010Pola"
          + "rity\022\030\n\024POLARITY_UNSPECIFIED\020\000\022\014\n\010POSITI"
          + "VE\020\001\022\014\n\010NEGATIVE\020\002\022\010\n\004BOTH\020\003\"{\n\010ColorMap"
          + "\022\031\n\025COLOR_MAP_UNSPECIFIED\020\000\022\016\n\nPINK_GREE"
          + "N\020\001\022\013\n\007VIRIDIS\020\002\022\007\n\003RED\020\003\022\t\n\005GREEN\020\004\022\r\n\t"
          + "RED_GREEN\020\006\022\024\n\020PINK_WHITE_GREEN\020\005\"b\n\013Ove"
          + "rlayType\022\034\n\030OVERLAY_TYPE_UNSPECIFIED\020\000\022\010"
          + "\n\004NONE\020\001\022\014\n\010ORIGINAL\020\002\022\r\n\tGRAYSCALE\020\003\022\016\n"
          + "\nMASK_BLACK\020\004\"\240\001\n\010Encoding\022\030\n\024ENCODING_U"
          + "NSPECIFIED\020\000\022\014\n\010IDENTITY\020\001\022\023\n\017BAG_OF_FEA"
          + "TURES\020\002\022\032\n\026BAG_OF_FEATURES_SPARSE\020\003\022\r\n\tI"
          + "NDICATOR\020\004\022\026\n\022COMBINED_EMBEDDING\020\005\022\024\n\020CO"
          + "NCAT_EMBEDDING\020\006\032\246\001\n\016OutputMetadata\022<\n\032i"
          + "ndex_display_name_mapping\030\001 \001(\0132\026.google"
          + ".protobuf.ValueH\000\022\"\n\030display_name_mappin"
          + "g_key\030\002 \001(\tH\000\022\032\n\022output_tensor_name\030\003 \001("
          + "\tB\026\n\024display_name_mapping\032o\n\013InputsEntry"
          + "\022\013\n\003key\030\001 \001(\t\022O\n\005value\030\002 \001(\0132@.google.cl"
          + "oud.vertexai.v1beta1.ExplanationMetadata"
          + ".InputMetadata:\0028\001\032q\n\014OutputsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022P\n\005value\030\002 \001(\0132A.google.cloud.ve"
          + "rtexai.v1beta1.ExplanationMetadata.Outpu"
          + "tMetadata:\0028\001B\335\001\n\035com.google.cloud.verte"
          + "xai.apiB\030ExplanationMetadataProtoP\001Z=clo"
          + "ud.google.com/go/vertexai/apiv1beta1/ver"
          + "texaipb;vertexaipb\252\002\035Google.Cloud.Vertex"
          + "AI.V1Beta1\312\002\035Google\\Cloud\\VertexAI\\V1bet"
          + "a1\352\002 Google::Cloud::VertexAI::V1beta1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_descriptor,
            new java.lang.String[] {
              "Inputs", "Outputs", "FeatureAttributionsSchemaUri", "LatentSpaceSource",
            });
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_descriptor =
        internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_descriptor,
            new java.lang.String[] {
              "InputBaselines",
              "InputTensorName",
              "Encoding",
              "Modality",
              "FeatureValueDomain",
              "IndicesTensorName",
              "DenseShapeTensorName",
              "IndexFeatureMapping",
              "EncodedTensorName",
              "EncodedBaselines",
              "Visualization",
              "GroupName",
            });
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor =
        internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue", "OriginalMean", "OriginalStddev",
            });
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_Visualization_descriptor =
        internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_Visualization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputMetadata_Visualization_descriptor,
            new java.lang.String[] {
              "Type",
              "Polarity",
              "ColorMap",
              "ClipPercentUpperbound",
              "ClipPercentLowerbound",
              "OverlayType",
            });
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputMetadata_descriptor =
        internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputMetadata_descriptor,
            new java.lang.String[] {
              "IndexDisplayNameMapping",
              "DisplayNameMappingKey",
              "OutputTensorName",
              "DisplayNameMapping",
            });
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputsEntry_descriptor =
        internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputsEntry_descriptor =
        internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_ExplanationMetadata_OutputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
