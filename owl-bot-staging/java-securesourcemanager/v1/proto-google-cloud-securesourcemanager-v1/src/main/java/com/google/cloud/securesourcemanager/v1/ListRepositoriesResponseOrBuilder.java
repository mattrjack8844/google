// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securesourcemanager/v1/secure_source_manager.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securesourcemanager.v1;

public interface ListRepositoriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securesourcemanager.v1.ListRepositoriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  java.util.List<com.google.cloud.securesourcemanager.v1.Repository> 
      getRepositoriesList();
  /**
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  com.google.cloud.securesourcemanager.v1.Repository getRepositories(int index);
  /**
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  int getRepositoriesCount();
  /**
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securesourcemanager.v1.RepositoryOrBuilder> 
      getRepositoriesOrBuilderList();
  /**
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  com.google.cloud.securesourcemanager.v1.RepositoryOrBuilder getRepositoriesOrBuilder(
      int index);

  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
