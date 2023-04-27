// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface SearchFeaturesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SearchFeaturesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to search Features.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * Required. The resource name of the Location to search Features.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * Query string that is a conjunction of field-restricted queries and/or
   * field-restricted filters.  Field-restricted queries and filters can be
   * combined using `AND` to form a conjunction.
   * A field query is in the form FIELD:QUERY. This implicitly checks if QUERY
   * exists as a substring within Feature's FIELD. The QUERY
   * and the FIELD are converted to a sequence of words (i.e. tokens) for
   * comparison. This is done by:
   *   * Removing leading/trailing whitespace and tokenizing the search value.
   *   Characters that are not one of alphanumeric `[a-zA-Z0-9]`, underscore
   *   `_`, or asterisk `*` are treated as delimiters for tokens. `*` is treated
   *   as a wildcard that matches characters within a token.
   *   * Ignoring case.
   *   * Prepending an asterisk to the first and appending an asterisk to the
   *   last token in QUERY.
   * A QUERY must be either a singular token or a phrase. A phrase is one or
   * multiple words enclosed in double quotation marks ("). With phrases, the
   * order of the words is important. Words in the phrase must be matching in
   * order and consecutively.
   * Supported FIELDs for field-restricted queries:
   * * `feature_id`
   * * `description`
   * * `entity_type_id`
   * Examples:
   * * `feature_id: foo` --&gt; Matches a Feature with ID containing the substring
   * `foo` (eg. `foo`, `foofeature`, `barfoo`).
   * * `feature_id: foo*feature` --&gt; Matches a Feature with ID containing the
   * substring `foo*feature` (eg. `foobarfeature`).
   * * `feature_id: foo AND description: bar` --&gt; Matches a Feature with ID
   * containing the substring `foo` and description containing the substring
   * `bar`.
   * Besides field queries, the following exact-match filters are
   * supported. The exact-match filters do not support wildcards. Unlike
   * field-restricted queries, exact-match filters are case-sensitive.
   * * `feature_id`: Supports = comparisons.
   * * `description`: Supports = comparisons. Multi-token filters should be
   * enclosed in quotes.
   * * `entity_type_id`: Supports = comparisons.
   * * `value_type`: Supports = and != comparisons.
   * * `labels`: Supports key-value equality as well as key presence.
   * * `featurestore_id`: Supports = comparisons.
   * Examples:
   * * `description = "foo bar"` --&gt; Any Feature with description exactly equal
   * to `foo bar`
   * * `value_type = DOUBLE` --&gt; Features whose type is DOUBLE.
   * * `labels.active = yes AND labels.env = prod` --&gt; Features having both
   *     (active: yes) and (env: prod) labels.
   * * `labels.env: *` --&gt; Any Feature which has a label with `env` as the
   *   key.
   * </pre>
   *
   * <code>string query = 3;</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Query string that is a conjunction of field-restricted queries and/or
   * field-restricted filters.  Field-restricted queries and filters can be
   * combined using `AND` to form a conjunction.
   * A field query is in the form FIELD:QUERY. This implicitly checks if QUERY
   * exists as a substring within Feature's FIELD. The QUERY
   * and the FIELD are converted to a sequence of words (i.e. tokens) for
   * comparison. This is done by:
   *   * Removing leading/trailing whitespace and tokenizing the search value.
   *   Characters that are not one of alphanumeric `[a-zA-Z0-9]`, underscore
   *   `_`, or asterisk `*` are treated as delimiters for tokens. `*` is treated
   *   as a wildcard that matches characters within a token.
   *   * Ignoring case.
   *   * Prepending an asterisk to the first and appending an asterisk to the
   *   last token in QUERY.
   * A QUERY must be either a singular token or a phrase. A phrase is one or
   * multiple words enclosed in double quotation marks ("). With phrases, the
   * order of the words is important. Words in the phrase must be matching in
   * order and consecutively.
   * Supported FIELDs for field-restricted queries:
   * * `feature_id`
   * * `description`
   * * `entity_type_id`
   * Examples:
   * * `feature_id: foo` --&gt; Matches a Feature with ID containing the substring
   * `foo` (eg. `foo`, `foofeature`, `barfoo`).
   * * `feature_id: foo*feature` --&gt; Matches a Feature with ID containing the
   * substring `foo*feature` (eg. `foobarfeature`).
   * * `feature_id: foo AND description: bar` --&gt; Matches a Feature with ID
   * containing the substring `foo` and description containing the substring
   * `bar`.
   * Besides field queries, the following exact-match filters are
   * supported. The exact-match filters do not support wildcards. Unlike
   * field-restricted queries, exact-match filters are case-sensitive.
   * * `feature_id`: Supports = comparisons.
   * * `description`: Supports = comparisons. Multi-token filters should be
   * enclosed in quotes.
   * * `entity_type_id`: Supports = comparisons.
   * * `value_type`: Supports = and != comparisons.
   * * `labels`: Supports key-value equality as well as key presence.
   * * `featurestore_id`: Supports = comparisons.
   * Examples:
   * * `description = "foo bar"` --&gt; Any Feature with description exactly equal
   * to `foo bar`
   * * `value_type = DOUBLE` --&gt; Features whose type is DOUBLE.
   * * `labels.active = yes AND labels.env = prod` --&gt; Features having both
   *     (active: yes) and (env: prod) labels.
   * * `labels.env: *` --&gt; Any Feature which has a label with `env` as the
   *   key.
   * </pre>
   *
   * <code>string query = 3;</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * The maximum number of Features to return. The service may return fewer
   * than this value. If unspecified, at most 100 Features will be returned.
   * The maximum value is 100; any value greater than 100 will be coerced to
   * 100.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous
   * [FeaturestoreService.SearchFeatures][google.cloud.aiplatform.v1beta1.FeaturestoreService.SearchFeatures]
   * call. Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * [FeaturestoreService.SearchFeatures][google.cloud.aiplatform.v1beta1.FeaturestoreService.SearchFeatures],
   * except `page_size`, must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous
   * [FeaturestoreService.SearchFeatures][google.cloud.aiplatform.v1beta1.FeaturestoreService.SearchFeatures]
   * call. Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * [FeaturestoreService.SearchFeatures][google.cloud.aiplatform.v1beta1.FeaturestoreService.SearchFeatures],
   * except `page_size`, must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
