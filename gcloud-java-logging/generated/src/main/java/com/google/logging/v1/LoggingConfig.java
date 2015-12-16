// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v1/logging_config.proto

package com.google.logging.v1;

public final class LoggingConfig {
  private LoggingConfig() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_LogSink_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_LogSink_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_LogError_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_LogError_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_ListLogSinksRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_ListLogSinksRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_ListLogSinksResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_ListLogSinksResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_GetLogSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_GetLogSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_CreateLogSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_CreateLogSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_UpdateLogSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_UpdateLogSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_DeleteLogSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_DeleteLogSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_ListLogServiceSinksRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_ListLogServiceSinksRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_ListLogServiceSinksResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_ListLogServiceSinksResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_GetLogServiceSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_GetLogServiceSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_CreateLogServiceSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_CreateLogServiceSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_UpdateLogServiceSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_UpdateLogServiceSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_DeleteLogServiceSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_DeleteLogServiceSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_ListSinksRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_ListSinksRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_ListSinksResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_ListSinksResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_GetSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_GetSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_CreateSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_CreateSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_UpdateSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_UpdateSinkRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v1_DeleteSinkRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_logging_v1_DeleteSinkRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/logging/v1/logging_config.proto" +
      "\022\021google.logging.v1\032\034google/api/annotati" +
      "ons.proto\032\033google/protobuf/empty.proto\032\027" +
      "google/rpc/status.proto\"i\n\007LogSink\022\014\n\004na" +
      "me\030\001 \001(\t\022\023\n\013destination\030\003 \001(\t\022\016\n\006filter\030" +
      "\005 \001(\t\022+\n\006errors\030\004 \003(\0132\033.google.logging.v" +
      "1.LogError\"T\n\010LogError\022\020\n\010resource\030\001 \001(\t" +
      "\022\"\n\006status\030\002 \001(\0132\022.google.rpc.Status\022\022\n\n" +
      "time_nanos\030\003 \001(\003\"\'\n\023ListLogSinksRequest\022" +
      "\020\n\010log_name\030\003 \001(\t\"A\n\024ListLogSinksRespons",
      "e\022)\n\005sinks\030\001 \003(\0132\032.google.logging.v1.Log" +
      "Sink\"&\n\021GetLogSinkRequest\022\021\n\tsink_name\030\004" +
      " \001(\t\"R\n\024CreateLogSinkRequest\022\020\n\010log_name" +
      "\030\001 \001(\t\022(\n\004sink\030\002 \001(\0132\032.google.logging.v1" +
      ".LogSink\"S\n\024UpdateLogSinkRequest\022\021\n\tsink" +
      "_name\030\005 \001(\t\022(\n\004sink\030\004 \001(\0132\032.google.loggi" +
      "ng.v1.LogSink\")\n\024DeleteLogSinkRequest\022\021\n" +
      "\tsink_name\030\001 \001(\t\"2\n\032ListLogServiceSinksR" +
      "equest\022\024\n\014service_name\030\001 \001(\t\"H\n\033ListLogS" +
      "erviceSinksResponse\022)\n\005sinks\030\001 \003(\0132\032.goo",
      "gle.logging.v1.LogSink\"-\n\030GetLogServiceS" +
      "inkRequest\022\021\n\tsink_name\030\001 \001(\t\"]\n\033CreateL" +
      "ogServiceSinkRequest\022\024\n\014service_name\030\001 \001" +
      "(\t\022(\n\004sink\030\002 \001(\0132\032.google.logging.v1.Log" +
      "Sink\"Z\n\033UpdateLogServiceSinkRequest\022\021\n\ts" +
      "ink_name\030\001 \001(\t\022(\n\004sink\030\002 \001(\0132\032.google.lo" +
      "gging.v1.LogSink\"0\n\033DeleteLogServiceSink" +
      "Request\022\021\n\tsink_name\030\001 \001(\t\"(\n\020ListSinksR" +
      "equest\022\024\n\014project_name\030\001 \001(\t\">\n\021ListSink" +
      "sResponse\022)\n\005sinks\030\001 \003(\0132\032.google.loggin",
      "g.v1.LogSink\"#\n\016GetSinkRequest\022\021\n\tsink_n" +
      "ame\030\001 \001(\t\"S\n\021CreateSinkRequest\022\024\n\014projec" +
      "t_name\030\001 \001(\t\022(\n\004sink\030\002 \001(\0132\032.google.logg" +
      "ing.v1.LogSink\"P\n\021UpdateSinkRequest\022\021\n\ts" +
      "ink_name\030\001 \001(\t\022(\n\004sink\030\002 \001(\0132\032.google.lo" +
      "gging.v1.LogSink\"&\n\021DeleteSinkRequest\022\021\n" +
      "\tsink_name\030\001 \001(\t2\304\020\n\rConfigService\022\214\001\n\014L" +
      "istLogSinks\022&.google.logging.v1.ListLogS" +
      "inksRequest\032\'.google.logging.v1.ListLogS" +
      "inksResponse\"+\202\323\344\223\002%\022#{log_name=/project",
      "s/*/logs/*}/sinks\022~\n\nGetLogSink\022$.google" +
      ".logging.v1.GetLogSinkRequest\032\032.google.l" +
      "ogging.v1.LogSink\".\202\323\344\223\002(\022&{sink_name=/p" +
      "rojects/*/logs/*/sinks/*}\022\207\001\n\rCreateLogS" +
      "ink\022\'.google.logging.v1.CreateLogSinkReq" +
      "uest\032\032.google.logging.v1.LogSink\"1\202\323\344\223\002+" +
      "\"#{log_name=/projects/*/logs/*}/sinks:\004s" +
      "ink\022\212\001\n\rUpdateLogSink\022\'.google.logging.v" +
      "1.UpdateLogSinkRequest\032\032.google.logging." +
      "v1.LogSink\"4\202\323\344\223\002.\032&{sink_name=/projects",
      "/*/logs/*/sinks/*}:\004sink\022\200\001\n\rDeleteLogSi" +
      "nk\022\'.google.logging.v1.DeleteLogSinkRequ" +
      "est\032\026.google.protobuf.Empty\".\202\323\344\223\002(*&{si" +
      "nk_name=/projects/*/logs/*/sinks/*}\022\254\001\n\023" +
      "ListLogServiceSinks\022-.google.logging.v1." +
      "ListLogServiceSinksRequest\032..google.logg" +
      "ing.v1.ListLogServiceSinksResponse\"6\202\323\344\223" +
      "\0020\022.{service_name=/projects/*/logService" +
      "s/*}/sinks\022\223\001\n\021GetLogServiceSink\022+.googl" +
      "e.logging.v1.GetLogServiceSinkRequest\032\032.",
      "google.logging.v1.LogSink\"5\202\323\344\223\002/\022-{sink" +
      "_name=/projects/*/logServices/*/sinks/*}" +
      "\022\240\001\n\024CreateLogServiceSink\022..google.loggi" +
      "ng.v1.CreateLogServiceSinkRequest\032\032.goog" +
      "le.logging.v1.LogSink\"<\202\323\344\223\0026\".{service_" +
      "name=/projects/*/logServices/*}/sinks:\004s" +
      "ink\022\237\001\n\024UpdateLogServiceSink\022..google.lo" +
      "gging.v1.UpdateLogServiceSinkRequest\032\032.g" +
      "oogle.logging.v1.LogSink\";\202\323\344\223\0025\032-{sink_" +
      "name=/projects/*/logServices/*/sinks/*}:",
      "\004sink\022\225\001\n\024DeleteLogServiceSink\022..google." +
      "logging.v1.DeleteLogServiceSinkRequest\032\026" +
      ".google.protobuf.Empty\"5\202\323\344\223\002/*-{sink_na" +
      "me=/projects/*/logServices/*/sinks/*}\022\200\001" +
      "\n\tListSinks\022#.google.logging.v1.ListSink" +
      "sRequest\032$.google.logging.v1.ListSinksRe" +
      "sponse\"(\202\323\344\223\002\"\022 {project_name=/projects/" +
      "*}/sinks\022q\n\007GetSink\022!.google.logging.v1." +
      "GetSinkRequest\032\032.google.logging.v1.LogSi" +
      "nk\"\'\202\323\344\223\002!\022\037{sink_name=/projects/*/sinks",
      "/*}\022~\n\nCreateSink\022$.google.logging.v1.Cr" +
      "eateSinkRequest\032\032.google.logging.v1.LogS" +
      "ink\".\202\323\344\223\002(\" {project_name=/projects/*}/" +
      "sinks:\004sink\022}\n\nUpdateSink\022$.google.loggi" +
      "ng.v1.UpdateSinkRequest\032\032.google.logging" +
      ".v1.LogSink\"-\202\323\344\223\002\'\032\037{sink_name=/project" +
      "s/*/sinks/*}:\004sink\022s\n\nDeleteSink\022$.googl" +
      "e.logging.v1.DeleteSinkRequest\032\026.google." +
      "protobuf.Empty\"\'\202\323\344\223\002!*\037{sink_name=/proj" +
      "ects/*/sinks/*}B\031\n\025com.google.logging.v1",
      "P\001b\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_logging_v1_LogSink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v1_LogSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_LogSink_descriptor,
        new java.lang.String[] { "Name", "Destination", "Filter", "Errors", });
    internal_static_google_logging_v1_LogError_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v1_LogError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_LogError_descriptor,
        new java.lang.String[] { "Resource", "Status", "TimeNanos", });
    internal_static_google_logging_v1_ListLogSinksRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v1_ListLogSinksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_ListLogSinksRequest_descriptor,
        new java.lang.String[] { "LogName", });
    internal_static_google_logging_v1_ListLogSinksResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_logging_v1_ListLogSinksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_ListLogSinksResponse_descriptor,
        new java.lang.String[] { "Sinks", });
    internal_static_google_logging_v1_GetLogSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_logging_v1_GetLogSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_GetLogSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", });
    internal_static_google_logging_v1_CreateLogSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_logging_v1_CreateLogSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_CreateLogSinkRequest_descriptor,
        new java.lang.String[] { "LogName", "Sink", });
    internal_static_google_logging_v1_UpdateLogSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_logging_v1_UpdateLogSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_UpdateLogSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", "Sink", });
    internal_static_google_logging_v1_DeleteLogSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_logging_v1_DeleteLogSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_DeleteLogSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", });
    internal_static_google_logging_v1_ListLogServiceSinksRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_logging_v1_ListLogServiceSinksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_ListLogServiceSinksRequest_descriptor,
        new java.lang.String[] { "ServiceName", });
    internal_static_google_logging_v1_ListLogServiceSinksResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_logging_v1_ListLogServiceSinksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_ListLogServiceSinksResponse_descriptor,
        new java.lang.String[] { "Sinks", });
    internal_static_google_logging_v1_GetLogServiceSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_logging_v1_GetLogServiceSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_GetLogServiceSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", });
    internal_static_google_logging_v1_CreateLogServiceSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_logging_v1_CreateLogServiceSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_CreateLogServiceSinkRequest_descriptor,
        new java.lang.String[] { "ServiceName", "Sink", });
    internal_static_google_logging_v1_UpdateLogServiceSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_logging_v1_UpdateLogServiceSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_UpdateLogServiceSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", "Sink", });
    internal_static_google_logging_v1_DeleteLogServiceSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_logging_v1_DeleteLogServiceSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_DeleteLogServiceSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", });
    internal_static_google_logging_v1_ListSinksRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_logging_v1_ListSinksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_ListSinksRequest_descriptor,
        new java.lang.String[] { "ProjectName", });
    internal_static_google_logging_v1_ListSinksResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_logging_v1_ListSinksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_ListSinksResponse_descriptor,
        new java.lang.String[] { "Sinks", });
    internal_static_google_logging_v1_GetSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_google_logging_v1_GetSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_GetSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", });
    internal_static_google_logging_v1_CreateSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_google_logging_v1_CreateSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_CreateSinkRequest_descriptor,
        new java.lang.String[] { "ProjectName", "Sink", });
    internal_static_google_logging_v1_UpdateSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_google_logging_v1_UpdateSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_UpdateSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", "Sink", });
    internal_static_google_logging_v1_DeleteSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_google_logging_v1_DeleteSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_logging_v1_DeleteSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
