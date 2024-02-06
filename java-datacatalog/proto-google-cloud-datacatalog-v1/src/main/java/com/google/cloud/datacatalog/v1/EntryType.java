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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Metadata automatically ingested from Google Cloud resources like BigQuery
 * tables or Pub/Sub topics always uses enum values from `EntryType` as the type
 * of entry.
 *
 * Other sources of metadata like Hive or Oracle databases can identify the type
 * by either using one of the enum values from `EntryType` (for example,
 * `FILESET` for a Cloud Storage fileset) or specifying a custom value using
 * the [`Entry`](#resource:-entry) field `user_specified_type`. For more
 * information, see
 * [Surface files from Cloud Storage with fileset
 * entries](/data-catalog/docs/how-to/filesets) or [Create custom entries for
 * your data sources](/data-catalog/docs/how-to/custom-entries).
 * </pre>
 *
 * Protobuf enum {@code google.cloud.datacatalog.v1.EntryType}
 */
public enum EntryType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default unknown type.
   * </pre>
   *
   * <code>ENTRY_TYPE_UNSPECIFIED = 0;</code>
   */
  ENTRY_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The entry type that has a GoogleSQL schema, including
   * logical views.
   * </pre>
   *
   * <code>TABLE = 2;</code>
   */
  TABLE(2),
  /**
   *
   *
   * <pre>
   * The type of models.
   *
   * For more information, see [Supported models in BigQuery
   * ML](/bigquery/docs/bqml-introduction#supported_models).
   * </pre>
   *
   * <code>MODEL = 5;</code>
   */
  MODEL(5),
  /**
   *
   *
   * <pre>
   * An entry type for streaming entries. For example, a Pub/Sub topic.
   * </pre>
   *
   * <code>DATA_STREAM = 3;</code>
   */
  DATA_STREAM(3),
  /**
   *
   *
   * <pre>
   * An entry type for a set of files or objects. For example, a
   * Cloud Storage fileset.
   * </pre>
   *
   * <code>FILESET = 4;</code>
   */
  FILESET(4),
  /**
   *
   *
   * <pre>
   * A group of servers that work together. For example, a Kafka cluster.
   * </pre>
   *
   * <code>CLUSTER = 6;</code>
   */
  CLUSTER(6),
  /**
   *
   *
   * <pre>
   * A database.
   * </pre>
   *
   * <code>DATABASE = 7;</code>
   */
  DATABASE(7),
  /**
   *
   *
   * <pre>
   * Connection to a data source. For example, a BigQuery
   * connection.
   * </pre>
   *
   * <code>DATA_SOURCE_CONNECTION = 8;</code>
   */
  DATA_SOURCE_CONNECTION(8),
  /**
   *
   *
   * <pre>
   * Routine, for example, a BigQuery routine.
   * </pre>
   *
   * <code>ROUTINE = 9;</code>
   */
  ROUTINE(9),
  /**
   *
   *
   * <pre>
   * A Dataplex lake.
   * </pre>
   *
   * <code>LAKE = 10;</code>
   */
  LAKE(10),
  /**
   *
   *
   * <pre>
   * A Dataplex zone.
   * </pre>
   *
   * <code>ZONE = 11;</code>
   */
  ZONE(11),
  /**
   *
   *
   * <pre>
   * A service, for example, a Dataproc Metastore service.
   * </pre>
   *
   * <code>SERVICE = 14;</code>
   */
  SERVICE(14),
  /**
   *
   *
   * <pre>
   * Schema within a relational database.
   * </pre>
   *
   * <code>DATABASE_SCHEMA = 15;</code>
   */
  DATABASE_SCHEMA(15),
  /**
   *
   *
   * <pre>
   * A Dashboard, for example from Looker.
   * </pre>
   *
   * <code>DASHBOARD = 16;</code>
   */
  DASHBOARD(16),
  /**
   *
   *
   * <pre>
   * A Looker Explore.
   *
   * For more information, see [Looker Explore API]
   * (https://developers.looker.com/api/explorer/4.0/methods/LookmlModel/lookml_model_explore).
   * </pre>
   *
   * <code>EXPLORE = 17;</code>
   */
  EXPLORE(17),
  /**
   *
   *
   * <pre>
   * A Looker Look.
   *
   * For more information, see [Looker Look API]
   * (https://developers.looker.com/api/explorer/4.0/methods/Look).
   * </pre>
   *
   * <code>LOOK = 18;</code>
   */
  LOOK(18),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default unknown type.
   * </pre>
   *
   * <code>ENTRY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ENTRY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The entry type that has a GoogleSQL schema, including
   * logical views.
   * </pre>
   *
   * <code>TABLE = 2;</code>
   */
  public static final int TABLE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The type of models.
   *
   * For more information, see [Supported models in BigQuery
   * ML](/bigquery/docs/bqml-introduction#supported_models).
   * </pre>
   *
   * <code>MODEL = 5;</code>
   */
  public static final int MODEL_VALUE = 5;
  /**
   *
   *
   * <pre>
   * An entry type for streaming entries. For example, a Pub/Sub topic.
   * </pre>
   *
   * <code>DATA_STREAM = 3;</code>
   */
  public static final int DATA_STREAM_VALUE = 3;
  /**
   *
   *
   * <pre>
   * An entry type for a set of files or objects. For example, a
   * Cloud Storage fileset.
   * </pre>
   *
   * <code>FILESET = 4;</code>
   */
  public static final int FILESET_VALUE = 4;
  /**
   *
   *
   * <pre>
   * A group of servers that work together. For example, a Kafka cluster.
   * </pre>
   *
   * <code>CLUSTER = 6;</code>
   */
  public static final int CLUSTER_VALUE = 6;
  /**
   *
   *
   * <pre>
   * A database.
   * </pre>
   *
   * <code>DATABASE = 7;</code>
   */
  public static final int DATABASE_VALUE = 7;
  /**
   *
   *
   * <pre>
   * Connection to a data source. For example, a BigQuery
   * connection.
   * </pre>
   *
   * <code>DATA_SOURCE_CONNECTION = 8;</code>
   */
  public static final int DATA_SOURCE_CONNECTION_VALUE = 8;
  /**
   *
   *
   * <pre>
   * Routine, for example, a BigQuery routine.
   * </pre>
   *
   * <code>ROUTINE = 9;</code>
   */
  public static final int ROUTINE_VALUE = 9;
  /**
   *
   *
   * <pre>
   * A Dataplex lake.
   * </pre>
   *
   * <code>LAKE = 10;</code>
   */
  public static final int LAKE_VALUE = 10;
  /**
   *
   *
   * <pre>
   * A Dataplex zone.
   * </pre>
   *
   * <code>ZONE = 11;</code>
   */
  public static final int ZONE_VALUE = 11;
  /**
   *
   *
   * <pre>
   * A service, for example, a Dataproc Metastore service.
   * </pre>
   *
   * <code>SERVICE = 14;</code>
   */
  public static final int SERVICE_VALUE = 14;
  /**
   *
   *
   * <pre>
   * Schema within a relational database.
   * </pre>
   *
   * <code>DATABASE_SCHEMA = 15;</code>
   */
  public static final int DATABASE_SCHEMA_VALUE = 15;
  /**
   *
   *
   * <pre>
   * A Dashboard, for example from Looker.
   * </pre>
   *
   * <code>DASHBOARD = 16;</code>
   */
  public static final int DASHBOARD_VALUE = 16;
  /**
   *
   *
   * <pre>
   * A Looker Explore.
   *
   * For more information, see [Looker Explore API]
   * (https://developers.looker.com/api/explorer/4.0/methods/LookmlModel/lookml_model_explore).
   * </pre>
   *
   * <code>EXPLORE = 17;</code>
   */
  public static final int EXPLORE_VALUE = 17;
  /**
   *
   *
   * <pre>
   * A Looker Look.
   *
   * For more information, see [Looker Look API]
   * (https://developers.looker.com/api/explorer/4.0/methods/Look).
   * </pre>
   *
   * <code>LOOK = 18;</code>
   */
  public static final int LOOK_VALUE = 18;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EntryType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EntryType forNumber(int value) {
    switch (value) {
      case 0:
        return ENTRY_TYPE_UNSPECIFIED;
      case 2:
        return TABLE;
      case 5:
        return MODEL;
      case 3:
        return DATA_STREAM;
      case 4:
        return FILESET;
      case 6:
        return CLUSTER;
      case 7:
        return DATABASE;
      case 8:
        return DATA_SOURCE_CONNECTION;
      case 9:
        return ROUTINE;
      case 10:
        return LAKE;
      case 11:
        return ZONE;
      case 14:
        return SERVICE;
      case 15:
        return DATABASE_SCHEMA;
      case 16:
        return DASHBOARD;
      case 17:
        return EXPLORE;
      case 18:
        return LOOK;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EntryType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<EntryType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<EntryType>() {
        public EntryType findValueByNumber(int number) {
          return EntryType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog.getDescriptor().getEnumTypes().get(0);
  }

  private static final EntryType[] VALUES = values();

  public static EntryType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EntryType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.EntryType)
}
