// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

public interface ExportAgentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ExportAgentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri` is specified in `ExportAgentRequest`.
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   * @return Whether the agentUri field is set.
   */
  boolean hasAgentUri();
  /**
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri` is specified in `ExportAgentRequest`.
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   * @return The agentUri.
   */
  java.lang.String getAgentUri();
  /**
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri` is specified in `ExportAgentRequest`.
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   * @return The bytes for agentUri.
   */
  com.google.protobuf.ByteString
      getAgentUriBytes();

  /**
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 2;</code>
   * @return Whether the agentContent field is set.
   */
  boolean hasAgentContent();
  /**
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 2;</code>
   * @return The agentContent.
   */
  com.google.protobuf.ByteString getAgentContent();

  com.google.cloud.dialogflow.v2.ExportAgentResponse.AgentCase getAgentCase();
}
