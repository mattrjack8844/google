// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/finding.proto

package com.google.cloud.securitycenter.v1beta1;

public final class FindingOuterClass {
  private FindingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1beta1_Finding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_Finding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1beta1_Finding_SourcePropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_Finding_SourcePropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/securitycenter/v1beta1/fi" +
      "nding.proto\022#google.cloud.securitycenter" +
      ".v1beta1\032\034google/api/annotations.proto\0328" +
      "google/cloud/securitycenter/v1beta1/secu" +
      "rity_marks.proto\032\034google/protobuf/struct" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "\300\004\n\007Finding\022\014\n\004name\030\001 \001(\t\022\016\n\006parent\030\002 \001(" +
      "\t\022\025\n\rresource_name\030\003 \001(\t\022A\n\005state\030\004 \001(\0162" +
      "2.google.cloud.securitycenter.v1beta1.Fi" +
      "nding.State\022\020\n\010category\030\005 \001(\t\022\024\n\014externa" +
      "l_uri\030\006 \001(\t\022]\n\021source_properties\030\007 \003(\0132B" +
      ".google.cloud.securitycenter.v1beta1.Fin" +
      "ding.SourcePropertiesEntry\022J\n\016security_m" +
      "arks\030\010 \001(\01322.google.cloud.securitycenter" +
      ".v1beta1.SecurityMarks\022.\n\nevent_time\030\t \001" +
      "(\0132\032.google.protobuf.Timestamp\022/\n\013create" +
      "_time\030\n \001(\0132\032.google.protobuf.Timestamp\032" +
      "O\n\025SourcePropertiesEntry\022\013\n\003key\030\001 \001(\t\022%\n" +
      "\005value\030\002 \001(\0132\026.google.protobuf.Value:\0028\001" +
      "\"8\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTI" +
      "VE\020\001\022\014\n\010INACTIVE\020\002B~\n\'com.google.cloud.s" +
      "ecuritycenter.v1beta1P\001ZQgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/securitycen" +
      "ter/v1beta1;securitycenterb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_securitycenter_v1beta1_Finding_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_Finding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1beta1_Finding_descriptor,
        new java.lang.String[] { "Name", "Parent", "ResourceName", "State", "Category", "ExternalUri", "SourceProperties", "SecurityMarks", "EventTime", "CreateTime", });
    internal_static_google_cloud_securitycenter_v1beta1_Finding_SourcePropertiesEntry_descriptor =
      internal_static_google_cloud_securitycenter_v1beta1_Finding_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_Finding_SourcePropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1beta1_Finding_SourcePropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
