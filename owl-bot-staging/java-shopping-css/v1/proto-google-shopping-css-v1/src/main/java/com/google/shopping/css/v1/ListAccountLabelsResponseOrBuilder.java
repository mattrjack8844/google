// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/css/v1/accounts_labels.proto

package com.google.shopping.css.v1;

public interface ListAccountLabelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.shopping.css.v1.ListAccountLabelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The labels from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.AccountLabel account_labels = 1;</code>
   */
  java.util.List<com.google.shopping.css.v1.AccountLabel> 
      getAccountLabelsList();
  /**
   * <pre>
   * The labels from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.AccountLabel account_labels = 1;</code>
   */
  com.google.shopping.css.v1.AccountLabel getAccountLabels(int index);
  /**
   * <pre>
   * The labels from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.AccountLabel account_labels = 1;</code>
   */
  int getAccountLabelsCount();
  /**
   * <pre>
   * The labels from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.AccountLabel account_labels = 1;</code>
   */
  java.util.List<? extends com.google.shopping.css.v1.AccountLabelOrBuilder> 
      getAccountLabelsOrBuilderList();
  /**
   * <pre>
   * The labels from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.AccountLabel account_labels = 1;</code>
   */
  com.google.shopping.css.v1.AccountLabelOrBuilder getAccountLabelsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
