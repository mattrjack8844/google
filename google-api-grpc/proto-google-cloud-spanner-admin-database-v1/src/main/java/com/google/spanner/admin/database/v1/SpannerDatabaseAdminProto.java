// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

public final class SpannerDatabaseAdminProto {
  private SpannerDatabaseAdminProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_RestoreInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_RestoreInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_Database_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_Database_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_ListDatabasesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_ListDatabasesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_CreateDatabaseMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_CreateDatabaseMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_GetDatabaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_GetDatabaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_GetDatabaseDdlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_GetDatabaseDdlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_RestoreDatabaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_RestoreDatabaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_admin_database_v1_RestoreDatabaseMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_database_v1_RestoreDatabaseMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/spanner/admin/database/v1/spann"
          + "er_database_admin.proto\022 google.spanner."
          + "admin.database.v1\032\034google/api/annotation"
          + "s.proto\032\036google/iam/v1/iam_policy.proto\032"
          + "\032google/iam/v1/policy.proto\032#google/long"
          + "running/operations.proto\032\033google/protobu"
          + "f/empty.proto\032\037google/protobuf/timestamp"
          + ".proto\032-google/spanner/admin/database/v1"
          + "/backup.proto\032-google/spanner/admin/data"
          + "base/v1/common.proto\"\253\001\n\013RestoreInfo\022H\n\013"
          + "source_type\030\001 \001(\01623.google.spanner.admin"
          + ".database.v1.RestoreSourceType\022C\n\013backup"
          + "_info\030\002 \001(\0132,.google.spanner.admin.datab"
          + "ase.v1.BackupInfoH\000B\r\n\013source_info\"\236\002\n\010D"
          + "atabase\022\014\n\004name\030\001 \001(\t\022?\n\005state\030\002 \001(\01620.g"
          + "oogle.spanner.admin.database.v1.Database"
          + ".State\022/\n\013create_time\030\003 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022C\n\014restore_info\030\004 \001(\0132-."
          + "google.spanner.admin.database.v1.Restore"
          + "Info\"M\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010"
          + "CREATING\020\001\022\t\n\005READY\020\002\022\024\n\020READY_OPTIMIZIN"
          + "G\020\003\"M\n\024ListDatabasesRequest\022\016\n\006parent\030\001 "
          + "\001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001"
          + "(\t\"o\n\025ListDatabasesResponse\022=\n\tdatabases"
          + "\030\001 \003(\0132*.google.spanner.admin.database.v"
          + "1.Database\022\027\n\017next_page_token\030\002 \001(\t\"[\n\025C"
          + "reateDatabaseRequest\022\016\n\006parent\030\001 \001(\t\022\030\n\020"
          + "create_statement\030\002 \001(\t\022\030\n\020extra_statemen"
          + "ts\030\003 \003(\t\"*\n\026CreateDatabaseMetadata\022\020\n\010da"
          + "tabase\030\001 \001(\t\"\"\n\022GetDatabaseRequest\022\014\n\004na"
          + "me\030\001 \001(\t\"V\n\030UpdateDatabaseDdlRequest\022\020\n\010"
          + "database\030\001 \001(\t\022\022\n\nstatements\030\002 \003(\t\022\024\n\014op"
          + "eration_id\030\003 \001(\t\"x\n\031UpdateDatabaseDdlMet"
          + "adata\022\020\n\010database\030\001 \001(\t\022\022\n\nstatements\030\002 "
          + "\003(\t\0225\n\021commit_timestamps\030\003 \003(\0132\032.google."
          + "protobuf.Timestamp\"\'\n\023DropDatabaseReques"
          + "t\022\020\n\010database\030\001 \001(\t\")\n\025GetDatabaseDdlReq"
          + "uest\022\020\n\010database\030\001 \001(\t\",\n\026GetDatabaseDdl"
          + "Response\022\022\n\nstatements\030\001 \003(\t\"f\n\035ListData"
          + "baseOperationsRequest\022\016\n\006parent\030\001 \001(\t\022\016\n"
          + "\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage"
          + "_token\030\004 \001(\t\"l\n\036ListDatabaseOperationsRe"
          + "sponse\0221\n\noperations\030\001 \003(\0132\035.google.long"
          + "running.Operation\022\027\n\017next_page_token\030\002 \001"
          + "(\t\"Y\n\026RestoreDatabaseRequest\022\016\n\006parent\030\001"
          + " \001(\t\022\023\n\013database_id\030\002 \001(\t\022\020\n\006backup\030\003 \001("
          + "\tH\000B\010\n\006source\"\347\002\n\027RestoreDatabaseMetadat"
          + "a\022\014\n\004name\030\001 \001(\t\022H\n\013source_type\030\002 \001(\01623.g"
          + "oogle.spanner.admin.database.v1.RestoreS"
          + "ourceType\022C\n\013backup_info\030\003 \001(\0132,.google."
          + "spanner.admin.database.v1.BackupInfoH\000\022E"
          + "\n\010progress\030\004 \001(\01323.google.spanner.admin."
          + "database.v1.OperationProgress\022/\n\013cancel_"
          + "time\030\005 \001(\0132\032.google.protobuf.Timestamp\022("
          + "\n optimize_database_operation_name\030\006 \001(\t"
          + "B\r\n\013source_info*5\n\021RestoreSourceType\022\024\n\020"
          + "TYPE_UNSPECIFIED\020\000\022\n\n\006BACKUP\020\0012\260\027\n\rDatab"
          + "aseAdmin\022\267\001\n\rListDatabases\0226.google.span"
          + "ner.admin.database.v1.ListDatabasesReque"
          + "st\0327.google.spanner.admin.database.v1.Li"
          + "stDatabasesResponse\"5\202\323\344\223\002/\022-/v1/{parent"
          + "=projects/*/instances/*}/databases\022\242\001\n\016C"
          + "reateDatabase\0227.google.spanner.admin.dat"
          + "abase.v1.CreateDatabaseRequest\032\035.google."
          + "longrunning.Operation\"8\202\323\344\223\0022\"-/v1/{pare"
          + "nt=projects/*/instances/*}/databases:\001*\022"
          + "\246\001\n\013GetDatabase\0224.google.spanner.admin.d"
          + "atabase.v1.GetDatabaseRequest\032*.google.s"
          + "panner.admin.database.v1.Database\"5\202\323\344\223\002"
          + "/\022-/v1/{name=projects/*/instances/*/data"
          + "bases/*}\022\260\001\n\021UpdateDatabaseDdl\022:.google."
          + "spanner.admin.database.v1.UpdateDatabase"
          + "DdlRequest\032\035.google.longrunning.Operatio"
          + "n\"@\202\323\344\223\002:25/v1/{database=projects/*/inst"
          + "ances/*/databases/*}/ddl:\001*\022\230\001\n\014DropData"
          + "base\0225.google.spanner.admin.database.v1."
          + "DropDatabaseRequest\032\026.google.protobuf.Em"
          + "pty\"9\202\323\344\223\0023*1/v1/{database=projects/*/in"
          + "stances/*/databases/*}\022\302\001\n\016GetDatabaseDd"
          + "l\0227.google.spanner.admin.database.v1.Get"
          + "DatabaseDdlRequest\0328.google.spanner.admi"
          + "n.database.v1.GetDatabaseDdlResponse\"=\202\323"
          + "\344\223\0027\0225/v1/{database=projects/*/instances"
          + "/*/databases/*}/ddl\022\224\001\n\014SetIamPolicy\022\".g"
          + "oogle.iam.v1.SetIamPolicyRequest\032\025.googl"
          + "e.iam.v1.Policy\"I\202\323\344\223\002C\">/v1/{resource=p"
          + "rojects/*/instances/*/databases/*}:setIa"
          + "mPolicy:\001*\022\224\001\n\014GetIamPolicy\022\".google.iam"
          + ".v1.GetIamPolicyRequest\032\025.google.iam.v1."
          + "Policy\"I\202\323\344\223\002C\">/v1/{resource=projects/*"
          + "/instances/*/databases/*}:getIamPolicy:\001"
          + "*\022\272\001\n\022TestIamPermissions\022(.google.iam.v1"
          + ".TestIamPermissionsRequest\032).google.iam."
          + "v1.TestIamPermissionsResponse\"O\202\323\344\223\002I\"D/"
          + "v1/{resource=projects/*/instances/*/data"
          + "bases/*}:testIamPermissions:\001*\022\234\001\n\014Creat"
          + "eBackup\0225.google.spanner.admin.database."
          + "v1.CreateBackupRequest\032\035.google.longrunn"
          + "ing.Operation\"6\202\323\344\223\0020\"+/v1/{parent=proje"
          + "cts/*/instances/*}/backups:\001*\022\236\001\n\tGetBac"
          + "kup\0222.google.spanner.admin.database.v1.G"
          + "etBackupRequest\032(.google.spanner.admin.d"
          + "atabase.v1.Backup\"3\202\323\344\223\002-\022+/v1/{name=pro"
          + "jects/*/instances/*/backups/*}\022\256\001\n\014Updat"
          + "eBackup\0225.google.spanner.admin.database."
          + "v1.UpdateBackupRequest\032(.google.spanner."
          + "admin.database.v1.Backup\"=\202\323\344\223\002722/v1/{b"
          + "ackup.name=projects/*/instances/*/backup"
          + "s/*}:\001*\022\222\001\n\014DeleteBackup\0225.google.spanne"
          + "r.admin.database.v1.DeleteBackupRequest\032"
          + "\026.google.protobuf.Empty\"3\202\323\344\223\002-*+/v1/{na"
          + "me=projects/*/instances/*/backups/*}\022\257\001\n"
          + "\013ListBackups\0224.google.spanner.admin.data"
          + "base.v1.ListBackupsRequest\0325.google.span"
          + "ner.admin.database.v1.ListBackupsRespons"
          + "e\"3\202\323\344\223\002-\022+/v1/{parent=projects/*/instan"
          + "ces/*}/backups\022\254\001\n\017RestoreDatabase\0228.goo"
          + "gle.spanner.admin.database.v1.RestoreDat"
          + "abaseRequest\032\035.google.longrunning.Operat"
          + "ion\"@\202\323\344\223\002:\"5/v1/{parent=projects/*/inst"
          + "ances/*}/databases:restore:\001*\022\333\001\n\026ListDa"
          + "tabaseOperations\022?.google.spanner.admin."
          + "database.v1.ListDatabaseOperationsReques"
          + "t\032@.google.spanner.admin.database.v1.Lis"
          + "tDatabaseOperationsResponse\">\202\323\344\223\0028\0226/v1"
          + "/{parent=projects/*/instances/*}/databas"
          + "eOperations\022\323\001\n\024ListBackupOperations\022=.g"
          + "oogle.spanner.admin.database.v1.ListBack"
          + "upOperationsRequest\032>.google.spanner.adm"
          + "in.database.v1.ListBackupOperationsRespo"
          + "nse\"<\202\323\344\223\0026\0224/v1/{parent=projects/*/inst"
          + "ances/*}/backupOperationsB\337\001\n$com.google"
          + ".spanner.admin.database.v1B\031SpannerDatab"
          + "aseAdminProtoP\001ZHgoogle.golang.org/genpr"
          + "oto/googleapis/spanner/admin/database/v1"
          + ";database\252\002&Google.Cloud.Spanner.Admin.D"
          + "atabase.V1\312\002&Google\\Cloud\\Spanner\\Admin\\"
          + "Database\\V1b\006proto3"
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
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.spanner.admin.database.v1.BackupOuterClass.getDescriptor(),
          com.google.spanner.admin.database.v1.Common.getDescriptor(),
        },
        assigner);
    internal_static_google_spanner_admin_database_v1_RestoreInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_admin_database_v1_RestoreInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_RestoreInfo_descriptor,
            new java.lang.String[] {
              "SourceType", "BackupInfo", "SourceInfo",
            });
    internal_static_google_spanner_admin_database_v1_Database_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_admin_database_v1_Database_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_Database_descriptor,
            new java.lang.String[] {
              "Name", "State", "CreateTime", "RestoreInfo",
            });
    internal_static_google_spanner_admin_database_v1_ListDatabasesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_spanner_admin_database_v1_ListDatabasesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_ListDatabasesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_descriptor,
            new java.lang.String[] {
              "Databases", "NextPageToken",
            });
    internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_descriptor,
            new java.lang.String[] {
              "Parent", "CreateStatement", "ExtraStatements",
            });
    internal_static_google_spanner_admin_database_v1_CreateDatabaseMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_spanner_admin_database_v1_CreateDatabaseMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_CreateDatabaseMetadata_descriptor,
            new java.lang.String[] {
              "Database",
            });
    internal_static_google_spanner_admin_database_v1_GetDatabaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_spanner_admin_database_v1_GetDatabaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_GetDatabaseRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlRequest_descriptor,
            new java.lang.String[] {
              "Database", "Statements", "OperationId",
            });
    internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_UpdateDatabaseDdlMetadata_descriptor,
            new java.lang.String[] {
              "Database", "Statements", "CommitTimestamps",
            });
    internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_descriptor,
            new java.lang.String[] {
              "Database",
            });
    internal_static_google_spanner_admin_database_v1_GetDatabaseDdlRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_spanner_admin_database_v1_GetDatabaseDdlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_GetDatabaseDdlRequest_descriptor,
            new java.lang.String[] {
              "Database",
            });
    internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor,
            new java.lang.String[] {
              "Statements",
            });
    internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_ListDatabaseOperationsResponse_descriptor,
            new java.lang.String[] {
              "Operations", "NextPageToken",
            });
    internal_static_google_spanner_admin_database_v1_RestoreDatabaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_spanner_admin_database_v1_RestoreDatabaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_RestoreDatabaseRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DatabaseId", "Backup", "Source",
            });
    internal_static_google_spanner_admin_database_v1_RestoreDatabaseMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_spanner_admin_database_v1_RestoreDatabaseMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_admin_database_v1_RestoreDatabaseMetadata_descriptor,
            new java.lang.String[] {
              "Name",
              "SourceType",
              "BackupInfo",
              "Progress",
              "CancelTime",
              "OptimizeDatabaseOperationName",
              "SourceInfo",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.spanner.admin.database.v1.BackupOuterClass.getDescriptor();
    com.google.spanner.admin.database.v1.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
