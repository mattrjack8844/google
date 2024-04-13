// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/metadata_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface PurgeContextsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.PurgeContextsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of Contexts that this request deleted (or, if `force` is false,
   * the number of Contexts that will be deleted). This can be an estimate.
   * </pre>
   *
   * <code>int64 purge_count = 1;</code>
   * @return The purgeCount.
   */
  long getPurgeCount();

  /**
   * <pre>
   * A sample of the Context names that will be deleted.
   * Only populated if `force` is set to false. The maximum number of samples is
   * 100 (it is possible to return fewer).
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the purgeSample.
   */
  java.util.List<java.lang.String>
      getPurgeSampleList();
  /**
   * <pre>
   * A sample of the Context names that will be deleted.
   * Only populated if `force` is set to false. The maximum number of samples is
   * 100 (it is possible to return fewer).
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of purgeSample.
   */
  int getPurgeSampleCount();
  /**
   * <pre>
   * A sample of the Context names that will be deleted.
   * Only populated if `force` is set to false. The maximum number of samples is
   * 100 (it is possible to return fewer).
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The purgeSample at the given index.
   */
  java.lang.String getPurgeSample(int index);
  /**
   * <pre>
   * A sample of the Context names that will be deleted.
   * Only populated if `force` is set to false. The maximum number of samples is
   * 100 (it is possible to return fewer).
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the purgeSample at the given index.
   */
  com.google.protobuf.ByteString
      getPurgeSampleBytes(int index);
}
