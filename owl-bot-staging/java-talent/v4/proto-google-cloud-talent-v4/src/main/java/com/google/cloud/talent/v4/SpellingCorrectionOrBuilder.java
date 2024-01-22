// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/common.proto

package com.google.cloud.talent.v4;

public interface SpellingCorrectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.SpellingCorrection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates if the query was corrected by the spell checker.
   * </pre>
   *
   * <code>bool corrected = 1;</code>
   * @return The corrected.
   */
  boolean getCorrected();

  /**
   * <pre>
   * Correction output consisting of the corrected keyword string.
   * </pre>
   *
   * <code>string corrected_text = 2;</code>
   * @return The correctedText.
   */
  java.lang.String getCorrectedText();
  /**
   * <pre>
   * Correction output consisting of the corrected keyword string.
   * </pre>
   *
   * <code>string corrected_text = 2;</code>
   * @return The bytes for correctedText.
   */
  com.google.protobuf.ByteString
      getCorrectedTextBytes();

  /**
   * <pre>
   * Corrected output with html tags to highlight the corrected words.
   * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
   *
   * For example, the user input query is "software enginear", where the second
   * word, "enginear," is incorrect. It should be "engineer". When spelling
   * correction is enabled, this value is
   * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
   * </pre>
   *
   * <code>string corrected_html = 3;</code>
   * @return The correctedHtml.
   */
  java.lang.String getCorrectedHtml();
  /**
   * <pre>
   * Corrected output with html tags to highlight the corrected words.
   * Corrected words are called out with the "&lt;b&gt;&lt;i&gt;...&lt;/i&gt;&lt;/b&gt;" html tags.
   *
   * For example, the user input query is "software enginear", where the second
   * word, "enginear," is incorrect. It should be "engineer". When spelling
   * correction is enabled, this value is
   * "software &lt;b&gt;&lt;i&gt;engineer&lt;/i&gt;&lt;/b&gt;".
   * </pre>
   *
   * <code>string corrected_html = 3;</code>
   * @return The bytes for correctedHtml.
   */
  com.google.protobuf.ByteString
      getCorrectedHtmlBytes();
}
