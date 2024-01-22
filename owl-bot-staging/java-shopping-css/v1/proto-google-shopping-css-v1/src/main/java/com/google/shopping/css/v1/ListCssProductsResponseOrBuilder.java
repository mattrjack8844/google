// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/css/v1/css_products.proto

package com.google.shopping.css.v1;

public interface ListCssProductsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.shopping.css.v1.ListCssProductsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The processed CSS products from the specified account. These are your
   * processed CSS products after applying rules and supplemental feeds.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.CssProduct css_products = 1;</code>
   */
  java.util.List<com.google.shopping.css.v1.CssProduct> 
      getCssProductsList();
  /**
   * <pre>
   * The processed CSS products from the specified account. These are your
   * processed CSS products after applying rules and supplemental feeds.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.CssProduct css_products = 1;</code>
   */
  com.google.shopping.css.v1.CssProduct getCssProducts(int index);
  /**
   * <pre>
   * The processed CSS products from the specified account. These are your
   * processed CSS products after applying rules and supplemental feeds.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.CssProduct css_products = 1;</code>
   */
  int getCssProductsCount();
  /**
   * <pre>
   * The processed CSS products from the specified account. These are your
   * processed CSS products after applying rules and supplemental feeds.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.CssProduct css_products = 1;</code>
   */
  java.util.List<? extends com.google.shopping.css.v1.CssProductOrBuilder> 
      getCssProductsOrBuilderList();
  /**
   * <pre>
   * The processed CSS products from the specified account. These are your
   * processed CSS products after applying rules and supplemental feeds.
   * </pre>
   *
   * <code>repeated .google.shopping.css.v1.CssProduct css_products = 1;</code>
   */
  com.google.shopping.css.v1.CssProductOrBuilder getCssProductsOrBuilder(
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
