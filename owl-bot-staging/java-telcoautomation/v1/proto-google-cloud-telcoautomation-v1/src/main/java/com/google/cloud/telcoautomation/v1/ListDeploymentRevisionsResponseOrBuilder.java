// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.telcoautomation.v1;

public interface ListDeploymentRevisionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.ListDeploymentRevisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1.Deployment> 
      getDeploymentsList();
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  com.google.cloud.telcoautomation.v1.Deployment getDeployments(int index);
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  int getDeploymentsCount();
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1.DeploymentOrBuilder> 
      getDeploymentsOrBuilderList();
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Deployment deployments = 1;</code>
   */
  com.google.cloud.telcoautomation.v1.DeploymentOrBuilder getDeploymentsOrBuilder(
      int index);

  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
