/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/channel/v1/reports_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.channel.v1;

public final class ReportsServiceProto {
  private ReportsServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_RunReportJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_RunReportJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_RunReportJobResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_RunReportJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_FetchReportResultsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_FetchReportResultsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_FetchReportResultsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_FetchReportResultsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ListReportsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ListReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ListReportsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ListReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ReportJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ReportJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ReportResultsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ReportResultsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Column_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Column_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_DateRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_DateRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Row_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Row_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ReportValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ReportValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ReportStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ReportStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Report_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Report_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/channel/v1/reports_servic"
          + "e.proto\022\027google.cloud.channel.v1\032\034google"
          + "/api/annotations.proto\032\027google/api/clien"
          + "t.proto\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\032(google/clou"
          + "d/channel/v1/operations.proto\032#google/lo"
          + "ngrunning/operations.proto\032\037google/proto"
          + "buf/timestamp.proto\032\026google/type/date.pr"
          + "oto\032\032google/type/datetime.proto\032\031google/"
          + "type/decimal.proto\032\027google/type/money.pr"
          + "oto\"\301\001\n\023RunReportJobRequest\0228\n\004name\030\001 \001("
          + "\tB*\340A\002\372A$\n\"cloudchannel.googleapis.com/R"
          + "eport\022;\n\ndate_range\030\002 \001(\0132\".google.cloud"
          + ".channel.v1.DateRangeB\003\340A\001\022\023\n\006filter\030\003 \001"
          + "(\tB\003\340A\001\022\032\n\rlanguage_code\030\004 \001(\tB\003\340A\001:\002\030\001\""
          + "\233\001\n\024RunReportJobResponse\0226\n\nreport_job\030\001"
          + " \001(\0132\".google.cloud.channel.v1.ReportJob"
          + "\022G\n\017report_metadata\030\002 \001(\0132..google.cloud"
          + ".channel.v1.ReportResultsMetadata:\002\030\001\"\260\001"
          + "\n\031FetchReportResultsRequest\022A\n\nreport_jo"
          + "b\030\001 \001(\tB-\340A\002\372A\'\n%cloudchannel.googleapis"
          + ".com/ReportJob\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027"
          + "\n\npage_token\030\003 \001(\tB\003\340A\001\022\033\n\016partition_key"
          + "s\030\004 \003(\tB\003\340A\001:\002\030\001\"\256\001\n\032FetchReportResultsR"
          + "esponse\022G\n\017report_metadata\030\001 \001(\0132..googl"
          + "e.cloud.channel.v1.ReportResultsMetadata"
          + "\022*\n\004rows\030\002 \003(\0132\034.google.cloud.channel.v1"
          + ".Row\022\027\n\017next_page_token\030\003 \001(\t:\002\030\001\"z\n\022Lis"
          + "tReportsRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\026\n\t"
          + "page_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\t"
          + "B\003\340A\001\022\032\n\rlanguage_code\030\004 \001(\tB\003\340A\001:\002\030\001\"d\n"
          + "\023ListReportsResponse\0220\n\007reports\030\001 \003(\0132\037."
          + "google.cloud.channel.v1.Report\022\027\n\017next_p"
          + "age_token\030\002 \001(\t:\002\030\001\"\266\001\n\tReportJob\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\002\022<\n\rreport_status\030\002 \001(\0132%.go"
          + "ogle.cloud.channel.v1.ReportStatus:X\030\001\352A"
          + "S\n%cloudchannel.googleapis.com/ReportJob"
          + "\022*accounts/{account}/reportJobs/{report_"
          + "job}\"\331\001\n\025ReportResultsMetadata\022/\n\006report"
          + "\030\001 \001(\0132\037.google.cloud.channel.v1.Report\022"
          + "\021\n\trow_count\030\002 \001(\003\0226\n\ndate_range\030\003 \001(\0132\""
          + ".google.cloud.channel.v1.DateRange\022@\n\024pr"
          + "eceding_date_range\030\004 \001(\0132\".google.cloud."
          + "channel.v1.DateRange:\002\030\001\"\337\001\n\006Column\022\021\n\tc"
          + "olumn_id\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022;\n\t"
          + "data_type\030\003 \001(\0162(.google.cloud.channel.v"
          + "1.Column.DataType\"k\n\010DataType\022\031\n\025DATA_TY"
          + "PE_UNSPECIFIED\020\000\022\n\n\006STRING\020\001\022\007\n\003INT\020\002\022\013\n"
          + "\007DECIMAL\020\003\022\t\n\005MONEY\020\004\022\010\n\004DATE\020\005\022\r\n\tDATE_"
          + "TIME\020\006:\002\030\001\"\325\001\n\tDateRange\0224\n\025usage_start_"
          + "date_time\030\001 \001(\0132\025.google.type.DateTime\0222"
          + "\n\023usage_end_date_time\030\002 \001(\0132\025.google.typ"
          + "e.DateTime\022-\n\022invoice_start_date\030\003 \001(\0132\021"
          + ".google.type.Date\022+\n\020invoice_end_date\030\004 "
          + "\001(\0132\021.google.type.Date:\002\030\001\"V\n\003Row\0224\n\006val"
          + "ues\030\001 \003(\0132$.google.cloud.channel.v1.Repo"
          + "rtValue\022\025\n\rpartition_key\030\002 \001(\t:\002\030\001\"\374\001\n\013R"
          + "eportValue\022\026\n\014string_value\030\001 \001(\tH\000\022\023\n\tin"
          + "t_value\030\002 \001(\003H\000\022-\n\rdecimal_value\030\003 \001(\0132\024"
          + ".google.type.DecimalH\000\022)\n\013money_value\030\004 "
          + "\001(\0132\022.google.type.MoneyH\000\022\'\n\ndate_value\030"
          + "\005 \001(\0132\021.google.type.DateH\000\0220\n\017date_time_"
          + "value\030\006 \001(\0132\025.google.type.DateTimeH\000:\002\030\001"
          + "B\007\n\005value\"\201\002\n\014ReportStatus\022:\n\005state\030\001 \001("
          + "\0162+.google.cloud.channel.v1.ReportStatus"
          + ".State\022.\n\nstart_time\030\002 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022,\n\010end_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\"S\n\005State\022\025\n\021STATE_U"
          + "NSPECIFIED\020\000\022\013\n\007STARTED\020\001\022\013\n\007WRITING\020\002\022\r"
          + "\n\tAVAILABLE\020\003\022\n\n\006FAILED\020\004:\002\030\001\"\310\001\n\006Report"
          + "\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\024\n\014display_name\030\002 \001("
          + "\t\0220\n\007columns\030\003 \003(\0132\037.google.cloud.channe"
          + "l.v1.Column\022\023\n\013description\030\004 \001(\t:N\030\001\352AI\n"
          + "\"cloudchannel.googleapis.com/Report\022#acc"
          + "ounts/{account}/reports/{report}2\262\005\n\032Clo"
          + "udChannelReportsService\022\272\001\n\014RunReportJob"
          + "\022,.google.cloud.channel.v1.RunReportJobR"
          + "equest\032\035.google.longrunning.Operation\"]\210"
          + "\002\001\312A)\n\024RunReportJobResponse\022\021OperationMe"
          + "tadata\202\323\344\223\002(\"#/v1/{name=accounts/*/repor"
          + "ts/*}:run:\001*\022\325\001\n\022FetchReportResults\0222.go"
          + "ogle.cloud.channel.v1.FetchReportResults"
          + "Request\0323.google.cloud.channel.v1.FetchR"
          + "eportResultsResponse\"V\210\002\001\332A\nreport_job\202\323"
          + "\344\223\002@\";/v1/{report_job=accounts/*/reportJ"
          + "obs/*}:fetchReportResults:\001*\022\235\001\n\013ListRep"
          + "orts\022+.google.cloud.channel.v1.ListRepor"
          + "tsRequest\032,.google.cloud.channel.v1.List"
          + "ReportsResponse\"3\210\002\001\332A\006parent\202\323\344\223\002!\022\037/v1"
          + "/{parent=accounts/*}/reports\032_\210\002\001\312A\033clou"
          + "dchannel.googleapis.com\322A;https://www.go"
          + "ogleapis.com/auth/apps.reports.usage.rea"
          + "donlyBk\n\033com.google.cloud.channel.v1B\023Re"
          + "portsServiceProtoP\001Z5cloud.google.com/go"
          + "/channel/apiv1/channelpb;channelpbb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.channel.v1.OperationsProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
              com.google.type.DateTimeProto.getDescriptor(),
              com.google.type.DecimalProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_cloud_channel_v1_RunReportJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_RunReportJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_RunReportJobRequest_descriptor,
            new java.lang.String[] {
              "Name", "DateRange", "Filter", "LanguageCode",
            });
    internal_static_google_cloud_channel_v1_RunReportJobResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_channel_v1_RunReportJobResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_RunReportJobResponse_descriptor,
            new java.lang.String[] {
              "ReportJob", "ReportMetadata",
            });
    internal_static_google_cloud_channel_v1_FetchReportResultsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_channel_v1_FetchReportResultsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_FetchReportResultsRequest_descriptor,
            new java.lang.String[] {
              "ReportJob", "PageSize", "PageToken", "PartitionKeys",
            });
    internal_static_google_cloud_channel_v1_FetchReportResultsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_channel_v1_FetchReportResultsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_FetchReportResultsResponse_descriptor,
            new java.lang.String[] {
              "ReportMetadata", "Rows", "NextPageToken",
            });
    internal_static_google_cloud_channel_v1_ListReportsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_channel_v1_ListReportsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ListReportsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "LanguageCode",
            });
    internal_static_google_cloud_channel_v1_ListReportsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_channel_v1_ListReportsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ListReportsResponse_descriptor,
            new java.lang.String[] {
              "Reports", "NextPageToken",
            });
    internal_static_google_cloud_channel_v1_ReportJob_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_channel_v1_ReportJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ReportJob_descriptor,
            new java.lang.String[] {
              "Name", "ReportStatus",
            });
    internal_static_google_cloud_channel_v1_ReportResultsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_channel_v1_ReportResultsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ReportResultsMetadata_descriptor,
            new java.lang.String[] {
              "Report", "RowCount", "DateRange", "PrecedingDateRange",
            });
    internal_static_google_cloud_channel_v1_Column_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_channel_v1_Column_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Column_descriptor,
            new java.lang.String[] {
              "ColumnId", "DisplayName", "DataType",
            });
    internal_static_google_cloud_channel_v1_DateRange_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_channel_v1_DateRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_DateRange_descriptor,
            new java.lang.String[] {
              "UsageStartDateTime", "UsageEndDateTime", "InvoiceStartDate", "InvoiceEndDate",
            });
    internal_static_google_cloud_channel_v1_Row_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_channel_v1_Row_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Row_descriptor,
            new java.lang.String[] {
              "Values", "PartitionKey",
            });
    internal_static_google_cloud_channel_v1_ReportValue_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_channel_v1_ReportValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ReportValue_descriptor,
            new java.lang.String[] {
              "StringValue",
              "IntValue",
              "DecimalValue",
              "MoneyValue",
              "DateValue",
              "DateTimeValue",
              "Value",
            });
    internal_static_google_cloud_channel_v1_ReportStatus_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_channel_v1_ReportStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ReportStatus_descriptor,
            new java.lang.String[] {
              "State", "StartTime", "EndTime",
            });
    internal_static_google_cloud_channel_v1_Report_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_channel_v1_Report_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Report_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Columns", "Description",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.channel.v1.OperationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.DateTimeProto.getDescriptor();
    com.google.type.DecimalProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
