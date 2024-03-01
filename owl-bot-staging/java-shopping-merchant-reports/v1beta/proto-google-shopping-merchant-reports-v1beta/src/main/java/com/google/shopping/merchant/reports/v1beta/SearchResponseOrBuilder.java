// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/merchant/reports/v1beta/reports.proto

// Protobuf Java Version: 3.25.2
package com.google.shopping.merchant.reports.v1beta;

public interface SearchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reports.v1beta.SearchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Rows that matched the search query.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ReportRow results = 1;</code>
   */
  java.util.List<com.google.shopping.merchant.reports.v1beta.ReportRow> 
      getResultsList();
  /**
   * <pre>
   * Rows that matched the search query.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ReportRow results = 1;</code>
   */
  com.google.shopping.merchant.reports.v1beta.ReportRow getResults(int index);
  /**
   * <pre>
   * Rows that matched the search query.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ReportRow results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Rows that matched the search query.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ReportRow results = 1;</code>
   */
  java.util.List<? extends com.google.shopping.merchant.reports.v1beta.ReportRowOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * Rows that matched the search query.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reports.v1beta.ReportRow results = 1;</code>
   */
  com.google.shopping.merchant.reports.v1beta.ReportRowOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Token which can be sent as `page_token` to retrieve the next page. If
   * omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token which can be sent as `page_token` to retrieve the next page. If
   * omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
