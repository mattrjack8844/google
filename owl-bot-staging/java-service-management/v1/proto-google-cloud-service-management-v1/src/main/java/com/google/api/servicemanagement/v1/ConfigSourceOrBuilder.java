// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.api.servicemanagement.v1;

public interface ConfigSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ConfigSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead.
   * </pre>
   *
   * <code>string id = 5;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead.
   * </pre>
   *
   * <code>string id = 5;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.ConfigFile> 
      getFilesList();
  /**
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  com.google.api.servicemanagement.v1.ConfigFile getFiles(int index);
  /**
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  int getFilesCount();
  /**
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  java.util.List<? extends com.google.api.servicemanagement.v1.ConfigFileOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  com.google.api.servicemanagement.v1.ConfigFileOrBuilder getFilesOrBuilder(
      int index);
}
