// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/service.proto

package com.google.api;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Service_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Service_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/service.proto\022\ngoogle.api\032\031" +
      "google/protobuf/any.proto\032\031google/protob" +
      "uf/api.proto\032\032google/protobuf/type.proto" +
      "\032\036google/protobuf/wrappers.proto\032\034google" +
      "/api/annotations.proto\032\025google/api/auth." +
      "proto\032\030google/api/context.proto\032\030google/" +
      "api/control.proto\032\036google/api/documentat" +
      "ion.proto\032\026google/api/error.proto\032\025googl" +
      "e/api/http.proto\032\024google/api/log.proto\032\030" +
      "google/api/logging.proto\032\027google/api/met",
      "ric.proto\032#google/api/monitored_resource" +
      ".proto\032\033google/api/monitoring.proto\032\026goo" +
      "gle/api/usage.proto\032\033google/api/visibili" +
      "ty.proto\"\227\007\n\007Service\0224\n\016config_version\030\024" +
      " \001(\0132\034.google.protobuf.UInt32Value\022\014\n\004na" +
      "me\030\001 \001(\t\022\r\n\005title\030\002 \001(\t\022\033\n\023producer_proj" +
      "ect_id\030\026 \001(\t\022\"\n\004apis\030\003 \003(\0132\024.google.prot" +
      "obuf.Api\022$\n\005types\030\004 \003(\0132\025.google.protobu" +
      "f.Type\022$\n\005enums\030\005 \003(\0132\025.google.protobuf." +
      "Enum\0220\n\rdocumentation\030\006 \001(\0132\031.google.api",
      ".Documentation\022*\n\nvisibility\030\007 \001(\0132\026.goo" +
      "gle.api.Visibility\022\036\n\004http\030\t \001(\0132\020.googl" +
      "e.api.Http\0222\n\016authentication\030\013 \001(\0132\032.goo" +
      "gle.api.Authentication\022$\n\007context\030\014 \001(\0132" +
      "\023.google.api.Context\022 \n\005usage\030\017 \001(\0132\021.go" +
      "ogle.api.Usage\022-\n\014custom_error\030\020 \001(\0132\027.g" +
      "oogle.api.CustomError\022$\n\007control\030\025 \001(\0132\023" +
      ".google.api.Control\022\'\n\004logs\030\027 \003(\0132\031.goog" +
      "le.api.LogDescriptor\022-\n\007metrics\030\030 \003(\0132\034." +
      "google.api.MetricDescriptor\022D\n\023monitored",
      "_resources\030\031 \003(\0132\'.google.api.MonitoredR" +
      "esourceDescriptor\022$\n\007logging\030\033 \001(\0132\023.goo" +
      "gle.api.Logging\022*\n\nmonitoring\030\034 \001(\0132\026.go" +
      "ogle.api.Monitoring\022@\n\014derived_data\030d \001(" +
      "\0132\024.google.protobuf.AnyB\024\372\322\344\223\002\016\022\014GOOGLE_" +
      "TOOLS\022+\n\014system_types\030f \003(\0132\025.google.pro" +
      "tobuf.TypeB \n\016com.google.apiB\014ServicePro" +
      "toP\001b\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.ApiProto.getDescriptor(),
          com.google.protobuf.TypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.AuthProto.getDescriptor(),
          com.google.api.ContextProto.getDescriptor(),
          com.google.api.ControlProto.getDescriptor(),
          com.google.api.DocumentationProto.getDescriptor(),
          com.google.api.ErrorFormatProto.getDescriptor(),
          com.google.api.HttpProto.getDescriptor(),
          com.google.api.LogProto.getDescriptor(),
          com.google.api.LoggingProto.getDescriptor(),
          com.google.api.MetricProto.getDescriptor(),
          com.google.api.MonitoredResourceProto.getDescriptor(),
          com.google.api.MonitoringProto.getDescriptor(),
          com.google.api.UsageProto.getDescriptor(),
          com.google.api.VisibilityProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_Service_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Service_descriptor,
        new java.lang.String[] { "ConfigVersion", "Name", "Title", "ProducerProjectId", "Apis", "Types", "Enums", "Documentation", "Visibility", "Http", "Authentication", "Context", "Usage", "CustomError", "Control", "Logs", "Metrics", "MonitoredResources", "Logging", "Monitoring", "DerivedData", "SystemTypes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.fieldVisibility);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.ApiProto.getDescriptor();
    com.google.protobuf.TypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.AuthProto.getDescriptor();
    com.google.api.ContextProto.getDescriptor();
    com.google.api.ControlProto.getDescriptor();
    com.google.api.DocumentationProto.getDescriptor();
    com.google.api.ErrorFormatProto.getDescriptor();
    com.google.api.HttpProto.getDescriptor();
    com.google.api.LogProto.getDescriptor();
    com.google.api.LoggingProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.MonitoringProto.getDescriptor();
    com.google.api.UsageProto.getDescriptor();
    com.google.api.VisibilityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
