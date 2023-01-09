// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/feature.proto

package com.google.cloud.gkehub.v1alpha;

public interface CommonFeatureSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha.CommonFeatureSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
   * @return Whether the multiclusteringress field is set.
   */
  boolean hasMulticlusteringress();
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
   * @return The multiclusteringress.
   */
  com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec getMulticlusteringress();
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec multiclusteringress = 102;</code>
   */
  com.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpecOrBuilder getMulticlusteringressOrBuilder();

  /**
   * <pre>
   * Cloud Audit Logging-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
   * @return Whether the cloudauditlogging field is set.
   */
  boolean hasCloudauditlogging();
  /**
   * <pre>
   * Cloud Audit Logging-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
   * @return The cloudauditlogging.
   */
  com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec getCloudauditlogging();
  /**
   * <pre>
   * Cloud Audit Logging-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec cloudauditlogging = 108;</code>
   */
  com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpecOrBuilder getCloudauditloggingOrBuilder();

  public com.google.cloud.gkehub.v1alpha.CommonFeatureSpec.FeatureSpecCase getFeatureSpecCase();
}
