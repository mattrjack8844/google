// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1alpha1;

public interface PublicBlueprintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.PublicBlueprint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the public blueprint.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the public blueprint.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The display name of the public blueprint.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The display name of the public blueprint.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The description of the public blueprint.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the public blueprint.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * DeploymentLevel of a blueprint signifies where the blueprint will be
   * applied. e.g. [HYDRATION, DEPLOYMENT]
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.PublicBlueprint.DeploymentLevel deployment_level = 4;</code>
   * @return The enum numeric value on the wire for deploymentLevel.
   */
  int getDeploymentLevelValue();
  /**
   * <pre>
   * DeploymentLevel of a blueprint signifies where the blueprint will be
   * applied. e.g. [HYDRATION, DEPLOYMENT]
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.PublicBlueprint.DeploymentLevel deployment_level = 4;</code>
   * @return The deploymentLevel.
   */
  com.google.cloud.telcoautomation.v1alpha1.PublicBlueprint.DeploymentLevel getDeploymentLevel();

  /**
   * <pre>
   * Source provider is the author of a public blueprint. e.g. Google, vendors
   * </pre>
   *
   * <code>string source_provider = 5;</code>
   * @return The sourceProvider.
   */
  java.lang.String getSourceProvider();
  /**
   * <pre>
   * Source provider is the author of a public blueprint. e.g. Google, vendors
   * </pre>
   *
   * <code>string source_provider = 5;</code>
   * @return The bytes for sourceProvider.
   */
  com.google.protobuf.ByteString
      getSourceProviderBytes();
}
