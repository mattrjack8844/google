/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ExplanationProto {
  private ExplanationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Neighbor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Neighbor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Examples_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Presets_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Presets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1beta1/explan"
          + "ation.proto\022\037google.cloud.aiplatform.v1b"
          + "eta1\032\037google/api/field_behavior.proto\032:g"
          + "oogle/cloud/aiplatform/v1beta1/explanati"
          + "on_metadata.proto\032(google/cloud/aiplatfo"
          + "rm/v1beta1/io.proto\032\034google/protobuf/str"
          + "uct.proto\"\231\001\n\013Explanation\022G\n\014attribution"
          + "s\030\001 \003(\0132,.google.cloud.aiplatform.v1beta"
          + "1.AttributionB\003\340A\003\022A\n\tneighbors\030\002 \003(\0132)."
          + "google.cloud.aiplatform.v1beta1.Neighbor"
          + "B\003\340A\003\"`\n\020ModelExplanation\022L\n\021mean_attrib"
          + "utions\030\001 \003(\0132,.google.cloud.aiplatform.v"
          + "1beta1.AttributionB\003\340A\003\"\211\002\n\013Attribution\022"
          + "\"\n\025baseline_output_value\030\001 \001(\001B\003\340A\003\022\"\n\025i"
          + "nstance_output_value\030\002 \001(\001B\003\340A\003\0229\n\024featu"
          + "re_attributions\030\003 \001(\0132\026.google.protobuf."
          + "ValueB\003\340A\003\022\031\n\014output_index\030\004 \003(\005B\003\340A\003\022 \n"
          + "\023output_display_name\030\005 \001(\tB\003\340A\003\022 \n\023appro"
          + "ximation_error\030\006 \001(\001B\003\340A\003\022\030\n\013output_name"
          + "\030\007 \001(\tB\003\340A\003\"D\n\010Neighbor\022\030\n\013neighbor_id\030\001"
          + " \001(\tB\003\340A\003\022\036\n\021neighbor_distance\030\002 \001(\001B\003\340A"
          + "\003\"\257\001\n\017ExplanationSpec\022O\n\nparameters\030\001 \001("
          + "\01326.google.cloud.aiplatform.v1beta1.Expl"
          + "anationParametersB\003\340A\002\022K\n\010metadata\030\002 \001(\013"
          + "24.google.cloud.aiplatform.v1beta1.Expla"
          + "nationMetadataB\003\340A\001\"\301\003\n\025ExplanationParam"
          + "eters\022a\n\033sampled_shapley_attribution\030\001 \001"
          + "(\0132:.google.cloud.aiplatform.v1beta1.Sam"
          + "pledShapleyAttributionH\000\022k\n integrated_g"
          + "radients_attribution\030\002 \001(\0132?.google.clou"
          + "d.aiplatform.v1beta1.IntegratedGradients"
          + "AttributionH\000\022L\n\020xrai_attribution\030\003 \001(\0132"
          + "0.google.cloud.aiplatform.v1beta1.XraiAt"
          + "tributionH\000\022=\n\010examples\030\007 \001(\0132).google.c"
          + "loud.aiplatform.v1beta1.ExamplesH\000\022\r\n\005to"
          + "p_k\030\004 \001(\005\0222\n\016output_indices\030\005 \001(\0132\032.goog"
          + "le.protobuf.ListValueB\010\n\006method\"4\n\031Sampl"
          + "edShapleyAttribution\022\027\n\npath_count\030\001 \001(\005"
          + "B\003\340A\002\"\333\001\n\036IntegratedGradientsAttribution"
          + "\022\027\n\nstep_count\030\001 \001(\005B\003\340A\002\022M\n\022smooth_grad"
          + "_config\030\002 \001(\01321.google.cloud.aiplatform."
          + "v1beta1.SmoothGradConfig\022Q\n\024blur_baselin"
          + "e_config\030\003 \001(\01323.google.cloud.aiplatform"
          + ".v1beta1.BlurBaselineConfig\"\314\001\n\017XraiAttr"
          + "ibution\022\027\n\nstep_count\030\001 \001(\005B\003\340A\002\022M\n\022smoo"
          + "th_grad_config\030\002 \001(\01321.google.cloud.aipl"
          + "atform.v1beta1.SmoothGradConfig\022Q\n\024blur_"
          + "baseline_config\030\003 \001(\01323.google.cloud.aip"
          + "latform.v1beta1.BlurBaselineConfig\"\256\001\n\020S"
          + "moothGradConfig\022\025\n\013noise_sigma\030\001 \001(\002H\000\022Q"
          + "\n\023feature_noise_sigma\030\002 \001(\01322.google.clo"
          + "ud.aiplatform.v1beta1.FeatureNoiseSigmaH"
          + "\000\022\032\n\022noisy_sample_count\030\003 \001(\005B\024\n\022Gradien"
          + "tNoiseSigma\"\246\001\n\021FeatureNoiseSigma\022\\\n\013noi"
          + "se_sigma\030\001 \003(\0132G.google.cloud.aiplatform"
          + ".v1beta1.FeatureNoiseSigma.NoiseSigmaFor"
          + "Feature\0323\n\024NoiseSigmaForFeature\022\014\n\004name\030"
          + "\001 \001(\t\022\r\n\005sigma\030\002 \001(\002\",\n\022BlurBaselineConf"
          + "ig\022\026\n\016max_blur_sigma\030\001 \001(\002\"\266\004\n\010Examples\022"
          + "X\n\022example_gcs_source\030\005 \001(\0132:.google.clo"
          + "ud.aiplatform.v1beta1.Examples.ExampleGc"
          + "sSourceH\000\022@\n\036nearest_neighbor_search_con"
          + "fig\030\002 \001(\0132\026.google.protobuf.ValueH\001\022;\n\007p"
          + "resets\030\004 \001(\0132(.google.cloud.aiplatform.v"
          + "1beta1.PresetsH\001\022>\n\ngcs_source\030\001 \001(\0132*.g"
          + "oogle.cloud.aiplatform.v1beta1.GcsSource"
          + "\022\026\n\016neighbor_count\030\003 \001(\005\032\344\001\n\020ExampleGcsS"
          + "ource\022Z\n\013data_format\030\001 \001(\0162E.google.clou"
          + "d.aiplatform.v1beta1.Examples.ExampleGcs"
          + "Source.DataFormat\022>\n\ngcs_source\030\002 \001(\0132*."
          + "google.cloud.aiplatform.v1beta1.GcsSourc"
          + "e\"4\n\nDataFormat\022\033\n\027DATA_FORMAT_UNSPECIFI"
          + "ED\020\000\022\t\n\005JSONL\020\001B\010\n\006sourceB\010\n\006config\"\204\002\n\007"
          + "Presets\022B\n\005query\030\001 \001(\0162..google.cloud.ai"
          + "platform.v1beta1.Presets.QueryH\000\210\001\001\022C\n\010m"
          + "odality\030\002 \001(\01621.google.cloud.aiplatform."
          + "v1beta1.Presets.Modality\"\036\n\005Query\022\013\n\007PRE"
          + "CISE\020\000\022\010\n\004FAST\020\001\"F\n\010Modality\022\030\n\024MODALITY"
          + "_UNSPECIFIED\020\000\022\t\n\005IMAGE\020\001\022\010\n\004TEXT\020\002\022\013\n\007T"
          + "ABULAR\020\003B\010\n\006_query\"\203\002\n\027ExplanationSpecOv"
          + "erride\022J\n\nparameters\030\001 \001(\01326.google.clou"
          + "d.aiplatform.v1beta1.ExplanationParamete"
          + "rs\022N\n\010metadata\030\002 \001(\0132<.google.cloud.aipl"
          + "atform.v1beta1.ExplanationMetadataOverri"
          + "de\022L\n\021examples_override\030\003 \001(\01321.google.c"
          + "loud.aiplatform.v1beta1.ExamplesOverride"
          + "\"\312\002\n\033ExplanationMetadataOverride\022]\n\006inpu"
          + "ts\030\001 \003(\0132H.google.cloud.aiplatform.v1bet"
          + "a1.ExplanationMetadataOverride.InputsEnt"
          + "ryB\003\340A\002\032H\n\025InputMetadataOverride\022/\n\017inpu"
          + "t_baselines\030\001 \003(\0132\026.google.protobuf.Valu"
          + "e\032\201\001\n\013InputsEntry\022\013\n\003key\030\001 \001(\t\022a\n\005value\030"
          + "\002 \001(\0132R.google.cloud.aiplatform.v1beta1."
          + "ExplanationMetadataOverride.InputMetadat"
          + "aOverride:\0028\001\"\320\002\n\020ExamplesOverride\022\026\n\016ne"
          + "ighbor_count\030\001 \001(\005\022\026\n\016crowding_count\030\002 \001"
          + "(\005\022T\n\014restrictions\030\003 \003(\0132>.google.cloud."
          + "aiplatform.v1beta1.ExamplesRestrictionsN"
          + "amespace\022\031\n\021return_embeddings\030\004 \001(\010\022Q\n\013d"
          + "ata_format\030\005 \001(\0162<.google.cloud.aiplatfo"
          + "rm.v1beta1.ExamplesOverride.DataFormat\"H"
          + "\n\nDataFormat\022\033\n\027DATA_FORMAT_UNSPECIFIED\020"
          + "\000\022\r\n\tINSTANCES\020\001\022\016\n\nEMBEDDINGS\020\002\"T\n\035Exam"
          + "plesRestrictionsNamespace\022\026\n\016namespace_n"
          + "ame\030\001 \001(\t\022\r\n\005allow\030\002 \003(\t\022\014\n\004deny\030\003 \003(\tB\347"
          + "\001\n#com.google.cloud.aiplatform.v1beta1B\020"
          + "ExplanationProtoP\001ZCcloud.google.com/go/"
          + "aiplatform/apiv1beta1/aiplatformpb;aipla"
          + "tformpb\252\002\037Google.Cloud.AIPlatform.V1Beta"
          + "1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Go"
          + "ogle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor,
            new java.lang.String[] {
              "Attributions", "Neighbors",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor,
            new java.lang.String[] {
              "MeanAttributions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor,
            new java.lang.String[] {
              "BaselineOutputValue",
              "InstanceOutputValue",
              "FeatureAttributions",
              "OutputIndex",
              "OutputDisplayName",
              "ApproximationError",
              "OutputName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Neighbor_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_Neighbor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Neighbor_descriptor,
            new java.lang.String[] {
              "NeighborId", "NeighborDistance",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor,
            new java.lang.String[] {
              "Parameters", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor,
            new java.lang.String[] {
              "SampledShapleyAttribution",
              "IntegratedGradientsAttribution",
              "XraiAttribution",
              "Examples",
              "TopK",
              "OutputIndices",
              "Method",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor,
            new java.lang.String[] {
              "PathCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor,
            new java.lang.String[] {
              "StepCount", "SmoothGradConfig", "BlurBaselineConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor,
            new java.lang.String[] {
              "StepCount", "SmoothGradConfig", "BlurBaselineConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor,
            new java.lang.String[] {
              "NoiseSigma", "FeatureNoiseSigma", "NoisySampleCount", "GradientNoiseSigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor,
            new java.lang.String[] {
              "NoiseSigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor,
            new java.lang.String[] {
              "Name", "Sigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor,
            new java.lang.String[] {
              "MaxBlurSigma",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_Examples_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor,
            new java.lang.String[] {
              "ExampleGcsSource",
              "NearestNeighborSearchConfig",
              "Presets",
              "GcsSource",
              "NeighborCount",
              "Source",
              "Config",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Examples_ExampleGcsSource_descriptor,
            new java.lang.String[] {
              "DataFormat", "GcsSource",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Presets_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1beta1_Presets_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Presets_descriptor,
            new java.lang.String[] {
              "Query", "Modality", "Query",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor,
            new java.lang.String[] {
              "Parameters", "Metadata", "ExamplesOverride",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor,
            new java.lang.String[] {
              "InputBaselines",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExamplesOverride_descriptor,
            new java.lang.String[] {
              "NeighborCount", "CrowdingCount", "Restrictions", "ReturnEmbeddings", "DataFormat",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExamplesRestrictionsNamespace_descriptor,
            new java.lang.String[] {
              "NamespaceName", "Allow", "Deny",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
