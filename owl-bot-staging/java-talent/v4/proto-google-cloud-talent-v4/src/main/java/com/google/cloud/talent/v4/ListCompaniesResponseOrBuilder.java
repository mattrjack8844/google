// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/company_service.proto

package com.google.cloud.talent.v4;

public interface ListCompaniesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.ListCompaniesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Companies for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Company companies = 1;</code>
   */
  java.util.List<com.google.cloud.talent.v4.Company> 
      getCompaniesList();
  /**
   * <pre>
   * Companies for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Company companies = 1;</code>
   */
  com.google.cloud.talent.v4.Company getCompanies(int index);
  /**
   * <pre>
   * Companies for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Company companies = 1;</code>
   */
  int getCompaniesCount();
  /**
   * <pre>
   * Companies for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Company companies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4.CompanyOrBuilder> 
      getCompaniesOrBuilderList();
  /**
   * <pre>
   * Companies for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Company companies = 1;</code>
   */
  com.google.cloud.talent.v4.CompanyOrBuilder getCompaniesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 3;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 3;</code>
   * @return The metadata.
   */
  com.google.cloud.talent.v4.ResponseMetadata getMetadata();
  /**
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 3;</code>
   */
  com.google.cloud.talent.v4.ResponseMetadataOrBuilder getMetadataOrBuilder();
}
