// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/finding.proto

package com.google.cloud.websecurityscanner.v1alpha;

public final class FindingProto {
  private FindingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_Finding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_Finding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/websecurityscanner/v1alph"
          + "a/finding.proto\022\'google.cloud.websecurit"
          + "yscanner.v1alpha\032\034google/api/annotations"
          + ".proto\032;google/cloud/websecurityscanner/"
          + "v1alpha/finding_addon.proto\"\365\005\n\007Finding\022"
          + "\014\n\004name\030\001 \001(\t\022R\n\014finding_type\030\002 \001(\0162<.go"
          + "ogle.cloud.websecurityscanner.v1alpha.Fi"
          + "nding.FindingType\022\023\n\013http_method\030\003 \001(\t\022\022"
          + "\n\nfuzzed_url\030\004 \001(\t\022\014\n\004body\030\005 \001(\t\022\023\n\013desc"
          + "ription\030\006 \001(\t\022\030\n\020reproduction_url\030\007 \001(\t\022"
          + "\021\n\tframe_url\030\010 \001(\t\022\021\n\tfinal_url\030\t \001(\t\022\023\n"
          + "\013tracking_id\030\n \001(\t\022R\n\020outdated_library\030\013"
          + " \001(\01328.google.cloud.websecurityscanner.v"
          + "1alpha.OutdatedLibrary\022V\n\022violating_reso"
          + "urce\030\014 \001(\0132:.google.cloud.websecuritysca"
          + "nner.v1alpha.ViolatingResource\022\\\n\025vulner"
          + "able_parameters\030\r \001(\0132=.google.cloud.web"
          + "securityscanner.v1alpha.VulnerableParame"
          + "ters\0229\n\003xss\030\016 \001(\0132,.google.cloud.websecu"
          + "rityscanner.v1alpha.Xss\"\241\001\n\013FindingType\022"
          + "\034\n\030FINDING_TYPE_UNSPECIFIED\020\000\022\021\n\rMIXED_C"
          + "ONTENT\020\001\022\024\n\020OUTDATED_LIBRARY\020\002\022\021\n\rROSETT"
          + "A_FLASH\020\005\022\020\n\014XSS_CALLBACK\020\003\022\r\n\tXSS_ERROR"
          + "\020\004\022\027\n\023CLEAR_TEXT_PASSWORD\020\006B\230\001\n+com.goog"
          + "le.cloud.websecurityscanner.v1alphaB\014Fin"
          + "dingProtoP\001ZYgoogle.golang.org/genproto/"
          + "googleapis/cloud/websecurityscanner/v1al"
          + "pha;websecurityscannerb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_websecurityscanner_v1alpha_Finding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_Finding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_Finding_descriptor,
            new java.lang.String[] {
              "Name",
              "FindingType",
              "HttpMethod",
              "FuzzedUrl",
              "Body",
              "Description",
              "ReproductionUrl",
              "FrameUrl",
              "FinalUrl",
              "TrackingId",
              "OutdatedLibrary",
              "ViolatingResource",
              "VulnerableParameters",
              "Xss",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
