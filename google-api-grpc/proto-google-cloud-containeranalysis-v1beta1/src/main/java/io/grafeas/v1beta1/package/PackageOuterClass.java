// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

package io.grafeas.v1beta1.package;

public final class PackageOuterClass {
  private PackageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_package_Distribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_package_Distribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_package_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_package_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_package_Package_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_package_Package_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_package_Details_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_package_Details_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_package_Installation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_package_Installation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_package_Version_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_package_Version_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/devtools/containeranalysis/v1be" +
      "ta1/package/package.proto\022\027grafeas.v1bet" +
      "a1.package\"\314\001\n\014Distribution\022\017\n\007cpe_uri\030\001" +
      " \001(\t\022;\n\014architecture\030\002 \001(\0162%.grafeas.v1b" +
      "eta1.package.Architecture\0228\n\016latest_vers" +
      "ion\030\003 \001(\0132 .grafeas.v1beta1.package.Vers" +
      "ion\022\022\n\nmaintainer\030\004 \001(\t\022\013\n\003url\030\005 \001(\t\022\023\n\013" +
      "description\030\006 \001(\t\"\\\n\010Location\022\017\n\007cpe_uri" +
      "\030\001 \001(\t\0221\n\007version\030\002 \001(\0132 .grafeas.v1beta" +
      "1.package.Version\022\014\n\004path\030\003 \001(\t\"T\n\007Packa" +
      "ge\022\014\n\004name\030\001 \001(\t\022;\n\014distribution\030\n \003(\0132%" +
      ".grafeas.v1beta1.package.Distribution\"F\n" +
      "\007Details\022;\n\014installation\030\001 \001(\0132%.grafeas" +
      ".v1beta1.package.Installation\"Q\n\014Install" +
      "ation\022\014\n\004name\030\001 \001(\t\0223\n\010location\030\002 \003(\0132!." +
      "grafeas.v1beta1.package.Location\"\307\001\n\007Ver" +
      "sion\022\r\n\005epoch\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010rev" +
      "ision\030\003 \001(\t\022:\n\004kind\030\004 \001(\0162,.grafeas.v1be" +
      "ta1.package.Version.VersionKind\"Q\n\013Versi" +
      "onKind\022\034\n\030VERSION_KIND_UNSPECIFIED\020\000\022\n\n\006" +
      "NORMAL\020\001\022\013\n\007MINIMUM\020\002\022\013\n\007MAXIMUM\020\003*>\n\014Ar" +
      "chitecture\022\034\n\030ARCHITECTURE_UNSPECIFIED\020\000" +
      "\022\007\n\003X86\020\001\022\007\n\003X64\020\002B~\n\032io.grafeas.v1beta1" +
      ".packageP\001ZXgoogle.golang.org/genproto/g" +
      "oogleapis/devtools/containeranalysis/v1b" +
      "eta1/package;package\242\002\003GRAb\006proto3"
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
        }, assigner);
    internal_static_grafeas_v1beta1_package_Distribution_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1beta1_package_Distribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_package_Distribution_descriptor,
        new java.lang.String[] { "CpeUri", "Architecture", "LatestVersion", "Maintainer", "Url", "Description", });
    internal_static_grafeas_v1beta1_package_Location_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1beta1_package_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_package_Location_descriptor,
        new java.lang.String[] { "CpeUri", "Version", "Path", });
    internal_static_grafeas_v1beta1_package_Package_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1beta1_package_Package_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_package_Package_descriptor,
        new java.lang.String[] { "Name", "Distribution", });
    internal_static_grafeas_v1beta1_package_Details_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grafeas_v1beta1_package_Details_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_package_Details_descriptor,
        new java.lang.String[] { "Installation", });
    internal_static_grafeas_v1beta1_package_Installation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grafeas_v1beta1_package_Installation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_package_Installation_descriptor,
        new java.lang.String[] { "Name", "Location", });
    internal_static_grafeas_v1beta1_package_Version_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grafeas_v1beta1_package_Version_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_package_Version_descriptor,
        new java.lang.String[] { "Epoch", "Name", "Revision", "Kind", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
