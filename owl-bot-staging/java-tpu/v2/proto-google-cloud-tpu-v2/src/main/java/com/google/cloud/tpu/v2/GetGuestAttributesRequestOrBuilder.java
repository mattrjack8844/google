// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.tpu.v2;

public interface GetGuestAttributesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.GetGuestAttributesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The guest attributes path to be queried.
   * </pre>
   *
   * <code>string query_path = 2;</code>
   * @return The queryPath.
   */
  java.lang.String getQueryPath();
  /**
   * <pre>
   * The guest attributes path to be queried.
   * </pre>
   *
   * <code>string query_path = 2;</code>
   * @return The bytes for queryPath.
   */
  com.google.protobuf.ByteString
      getQueryPathBytes();

  /**
   * <pre>
   * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
   * returned.
   * </pre>
   *
   * <code>repeated string worker_ids = 3;</code>
   * @return A list containing the workerIds.
   */
  java.util.List<java.lang.String>
      getWorkerIdsList();
  /**
   * <pre>
   * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
   * returned.
   * </pre>
   *
   * <code>repeated string worker_ids = 3;</code>
   * @return The count of workerIds.
   */
  int getWorkerIdsCount();
  /**
   * <pre>
   * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
   * returned.
   * </pre>
   *
   * <code>repeated string worker_ids = 3;</code>
   * @param index The index of the element to return.
   * @return The workerIds at the given index.
   */
  java.lang.String getWorkerIds(int index);
  /**
   * <pre>
   * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be
   * returned.
   * </pre>
   *
   * <code>repeated string worker_ids = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the workerIds at the given index.
   */
  com.google.protobuf.ByteString
      getWorkerIdsBytes(int index);
}
