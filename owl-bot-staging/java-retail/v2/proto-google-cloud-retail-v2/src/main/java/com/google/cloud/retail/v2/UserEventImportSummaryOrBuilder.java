// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface UserEventImportSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.UserEventImportSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Count of user events imported with complete existing catalog information.
   * </pre>
   *
   * <code>int64 joined_events_count = 1;</code>
   * @return The joinedEventsCount.
   */
  long getJoinedEventsCount();

  /**
   * <pre>
   * Count of user events imported, but with catalog information not found
   * in the imported catalog.
   * </pre>
   *
   * <code>int64 unjoined_events_count = 2;</code>
   * @return The unjoinedEventsCount.
   */
  long getUnjoinedEventsCount();
}
