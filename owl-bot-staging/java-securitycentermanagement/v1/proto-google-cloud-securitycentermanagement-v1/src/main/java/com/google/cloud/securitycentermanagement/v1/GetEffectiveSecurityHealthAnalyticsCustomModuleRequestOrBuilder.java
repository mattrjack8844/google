// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycentermanagement.v1;

public interface GetEffectiveSecurityHealthAnalyticsCustomModuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.GetEffectiveSecurityHealthAnalyticsCustomModuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the SHA custom module.
   *
   * Its format is:
   *
   *   * "organizations/{organization}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{module_id}".
   *   * "folders/{folder}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{module_id}".
   *   * "projects/{project}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{module_id}".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the SHA custom module.
   *
   * Its format is:
   *
   *   * "organizations/{organization}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{module_id}".
   *   * "folders/{folder}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{module_id}".
   *   * "projects/{project}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{module_id}".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
