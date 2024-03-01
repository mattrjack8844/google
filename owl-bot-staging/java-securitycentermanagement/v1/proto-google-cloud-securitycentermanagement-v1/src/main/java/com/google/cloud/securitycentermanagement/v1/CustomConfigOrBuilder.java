// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycentermanagement.v1;

public interface CustomConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.CustomConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The CEL expression to evaluate to produce findings. When the
   * expression evaluates to true against a resource, a finding is generated.
   * </pre>
   *
   * <code>.google.type.Expr predicate = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the predicate field is set.
   */
  boolean hasPredicate();
  /**
   * <pre>
   * Optional. The CEL expression to evaluate to produce findings. When the
   * expression evaluates to true against a resource, a finding is generated.
   * </pre>
   *
   * <code>.google.type.Expr predicate = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The predicate.
   */
  com.google.type.Expr getPredicate();
  /**
   * <pre>
   * Optional. The CEL expression to evaluate to produce findings. When the
   * expression evaluates to true against a resource, a finding is generated.
   * </pre>
   *
   * <code>.google.type.Expr predicate = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.type.ExprOrBuilder getPredicateOrBuilder();

  /**
   * <pre>
   * Optional. Custom output properties.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.CustomConfig.CustomOutputSpec custom_output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the customOutput field is set.
   */
  boolean hasCustomOutput();
  /**
   * <pre>
   * Optional. Custom output properties.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.CustomConfig.CustomOutputSpec custom_output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The customOutput.
   */
  com.google.cloud.securitycentermanagement.v1.CustomConfig.CustomOutputSpec getCustomOutput();
  /**
   * <pre>
   * Optional. Custom output properties.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.CustomConfig.CustomOutputSpec custom_output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.securitycentermanagement.v1.CustomConfig.CustomOutputSpecOrBuilder getCustomOutputOrBuilder();

  /**
   * <pre>
   * Optional. The Cloud Asset Inventory resource types that the custom module
   * operates on. For information about resource types, see [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
   * Each custom module can specify up to 5 resource types.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.CustomConfig.ResourceSelector resource_selector = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the resourceSelector field is set.
   */
  boolean hasResourceSelector();
  /**
   * <pre>
   * Optional. The Cloud Asset Inventory resource types that the custom module
   * operates on. For information about resource types, see [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
   * Each custom module can specify up to 5 resource types.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.CustomConfig.ResourceSelector resource_selector = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The resourceSelector.
   */
  com.google.cloud.securitycentermanagement.v1.CustomConfig.ResourceSelector getResourceSelector();
  /**
   * <pre>
   * Optional. The Cloud Asset Inventory resource types that the custom module
   * operates on. For information about resource types, see [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
   * Each custom module can specify up to 5 resource types.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.CustomConfig.ResourceSelector resource_selector = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.securitycentermanagement.v1.CustomConfig.ResourceSelectorOrBuilder getResourceSelectorOrBuilder();

  /**
   * <pre>
   * Optional. The severity to assign to findings generated by the module.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.CustomConfig.Severity severity = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   * <pre>
   * Optional. The severity to assign to findings generated by the module.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.CustomConfig.Severity severity = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The severity.
   */
  com.google.cloud.securitycentermanagement.v1.CustomConfig.Severity getSeverity();

  /**
   * <pre>
   * Optional. Text that describes the vulnerability or misconfiguration that
   * the custom module detects. This explanation is returned with each finding
   * instance to help investigators understand the detected issue. The text must
   * be enclosed in quotation marks.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Text that describes the vulnerability or misconfiguration that
   * the custom module detects. This explanation is returned with each finding
   * instance to help investigators understand the detected issue. The text must
   * be enclosed in quotation marks.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Optional. An explanation of the recommended steps that security teams can
   * take to resolve the detected issue. This explanation is returned with each
   * finding generated by this module in the `nextSteps` property of the finding
   * JSON.
   * </pre>
   *
   * <code>string recommendation = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The recommendation.
   */
  java.lang.String getRecommendation();
  /**
   * <pre>
   * Optional. An explanation of the recommended steps that security teams can
   * take to resolve the detected issue. This explanation is returned with each
   * finding generated by this module in the `nextSteps` property of the finding
   * JSON.
   * </pre>
   *
   * <code>string recommendation = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for recommendation.
   */
  com.google.protobuf.ByteString
      getRecommendationBytes();
}
