// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

public interface ExamplePayloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ExamplePayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   */
  boolean hasImage();
  /**
   *
   *
   * <pre>
   * Example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   */
  com.google.cloud.automl.v1beta1.Image getImage();
  /**
   *
   *
   * <pre>
   * Example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   */
  com.google.cloud.automl.v1beta1.ImageOrBuilder getImageOrBuilder();

  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   */
  boolean hasTextSnippet();
  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   */
  com.google.cloud.automl.v1beta1.TextSnippet getTextSnippet();
  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   */
  com.google.cloud.automl.v1beta1.TextSnippetOrBuilder getTextSnippetOrBuilder();

  /**
   *
   *
   * <pre>
   * Example document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Document document = 4;</code>
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * Example document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Document document = 4;</code>
   */
  com.google.cloud.automl.v1beta1.Document getDocument();
  /**
   *
   *
   * <pre>
   * Example document.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Document document = 4;</code>
   */
  com.google.cloud.automl.v1beta1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Example relational table row.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Row row = 3;</code>
   */
  boolean hasRow();
  /**
   *
   *
   * <pre>
   * Example relational table row.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Row row = 3;</code>
   */
  com.google.cloud.automl.v1beta1.Row getRow();
  /**
   *
   *
   * <pre>
   * Example relational table row.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Row row = 3;</code>
   */
  com.google.cloud.automl.v1beta1.RowOrBuilder getRowOrBuilder();

  public com.google.cloud.automl.v1beta1.ExamplePayload.PayloadCase getPayloadCase();
}
