// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/k8s.min.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.run.v2;

public interface CloudSqlInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.CloudSqlInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Cloud SQL instance connection names, as can be found in
   * https://console.cloud.google.com/sql/instances. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on
   * how to connect Cloud SQL and Cloud Run. Format:
   * {project}:{location}:{instance}
   * </pre>
   *
   * <code>repeated string instances = 1;</code>
   * @return A list containing the instances.
   */
  java.util.List<java.lang.String>
      getInstancesList();
  /**
   * <pre>
   * The Cloud SQL instance connection names, as can be found in
   * https://console.cloud.google.com/sql/instances. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on
   * how to connect Cloud SQL and Cloud Run. Format:
   * {project}:{location}:{instance}
   * </pre>
   *
   * <code>repeated string instances = 1;</code>
   * @return The count of instances.
   */
  int getInstancesCount();
  /**
   * <pre>
   * The Cloud SQL instance connection names, as can be found in
   * https://console.cloud.google.com/sql/instances. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on
   * how to connect Cloud SQL and Cloud Run. Format:
   * {project}:{location}:{instance}
   * </pre>
   *
   * <code>repeated string instances = 1;</code>
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  java.lang.String getInstances(int index);
  /**
   * <pre>
   * The Cloud SQL instance connection names, as can be found in
   * https://console.cloud.google.com/sql/instances. Visit
   * https://cloud.google.com/sql/docs/mysql/connect-run for more information on
   * how to connect Cloud SQL and Cloud Run. Format:
   * {project}:{location}:{instance}
   * </pre>
   *
   * <code>repeated string instances = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  com.google.protobuf.ByteString
      getInstancesBytes(int index);
}
