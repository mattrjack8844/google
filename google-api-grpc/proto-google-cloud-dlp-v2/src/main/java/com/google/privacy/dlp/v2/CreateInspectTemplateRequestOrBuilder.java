// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CreateInspectTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CreateInspectTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The InspectTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
   */
  boolean hasInspectTemplate();
  /**
   *
   *
   * <pre>
   * The InspectTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectTemplate getInspectTemplate();
  /**
   *
   *
   * <pre>
   * The InspectTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectTemplateOrBuilder getInspectTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   */
  java.lang.String getTemplateId();
  /**
   *
   *
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   */
  com.google.protobuf.ByteString getTemplateIdBytes();
}
