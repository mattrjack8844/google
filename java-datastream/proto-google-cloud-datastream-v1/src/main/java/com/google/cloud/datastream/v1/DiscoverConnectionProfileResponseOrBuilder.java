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
// source: google/cloud/datastream/v1/datastream.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1;

public interface DiscoverConnectionProfileResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.DiscoverConnectionProfileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Enriched Oracle RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   *
   * @return Whether the oracleRdbms field is set.
   */
  boolean hasOracleRdbms();
  /**
   *
   *
   * <pre>
   * Enriched Oracle RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   *
   * @return The oracleRdbms.
   */
  com.google.cloud.datastream.v1.OracleRdbms getOracleRdbms();
  /**
   *
   *
   * <pre>
   * Enriched Oracle RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   */
  com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getOracleRdbmsOrBuilder();

  /**
   *
   *
   * <pre>
   * Enriched MySQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   *
   * @return Whether the mysqlRdbms field is set.
   */
  boolean hasMysqlRdbms();
  /**
   *
   *
   * <pre>
   * Enriched MySQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   *
   * @return The mysqlRdbms.
   */
  com.google.cloud.datastream.v1.MysqlRdbms getMysqlRdbms();
  /**
   *
   *
   * <pre>
   * Enriched MySQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   */
  com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getMysqlRdbmsOrBuilder();

  /**
   *
   *
   * <pre>
   * Enriched PostgreSQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms postgresql_rdbms = 102;</code>
   *
   * @return Whether the postgresqlRdbms field is set.
   */
  boolean hasPostgresqlRdbms();
  /**
   *
   *
   * <pre>
   * Enriched PostgreSQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms postgresql_rdbms = 102;</code>
   *
   * @return The postgresqlRdbms.
   */
  com.google.cloud.datastream.v1.PostgresqlRdbms getPostgresqlRdbms();
  /**
   *
   *
   * <pre>
   * Enriched PostgreSQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms postgresql_rdbms = 102;</code>
   */
  com.google.cloud.datastream.v1.PostgresqlRdbmsOrBuilder getPostgresqlRdbmsOrBuilder();

  com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse.DataObjectCase
      getDataObjectCase();
}
