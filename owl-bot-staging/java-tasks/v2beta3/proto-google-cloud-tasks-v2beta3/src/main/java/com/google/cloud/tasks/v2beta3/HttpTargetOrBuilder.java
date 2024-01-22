// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/target.proto

package com.google.cloud.tasks.v2beta3;

public interface HttpTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.HttpTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URI override.
   *
   * When specified, overrides the execution URI for all the tasks in the queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.UriOverride uri_override = 1;</code>
   * @return Whether the uriOverride field is set.
   */
  boolean hasUriOverride();
  /**
   * <pre>
   * URI override.
   *
   * When specified, overrides the execution URI for all the tasks in the queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.UriOverride uri_override = 1;</code>
   * @return The uriOverride.
   */
  com.google.cloud.tasks.v2beta3.UriOverride getUriOverride();
  /**
   * <pre>
   * URI override.
   *
   * When specified, overrides the execution URI for all the tasks in the queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.UriOverride uri_override = 1;</code>
   */
  com.google.cloud.tasks.v2beta3.UriOverrideOrBuilder getUriOverrideOrBuilder();

  /**
   * <pre>
   * The HTTP method to use for the request.
   *
   * When specified, it overrides
   * [HttpRequest][google.cloud.tasks.v2beta3.HttpTarget.http_method] for the
   * task. Note that if the value is set to [HttpMethod][GET] the
   * [HttpRequest][body] of the task will be ignored at execution time.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.HttpMethod http_method = 2;</code>
   * @return The enum numeric value on the wire for httpMethod.
   */
  int getHttpMethodValue();
  /**
   * <pre>
   * The HTTP method to use for the request.
   *
   * When specified, it overrides
   * [HttpRequest][google.cloud.tasks.v2beta3.HttpTarget.http_method] for the
   * task. Note that if the value is set to [HttpMethod][GET] the
   * [HttpRequest][body] of the task will be ignored at execution time.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.HttpMethod http_method = 2;</code>
   * @return The httpMethod.
   */
  com.google.cloud.tasks.v2beta3.HttpMethod getHttpMethod();

  /**
   * <pre>
   * HTTP target headers.
   *
   * This map contains the header field names and values.
   * Headers will be set when running the
   * [CreateTask][google.cloud.tasks.v2beta3.CloudTasks.CreateTask] and/or
   * [BufferTask][google.cloud.tasks.v2beta3.CloudTasks.BufferTask].
   *
   * These headers represent a subset of the headers that will be configured for
   * the task's HTTP request. Some HTTP request headers will be ignored or
   * replaced.
   *
   * A partial list of headers that will be ignored or replaced is:
   * * Several predefined headers, prefixed with "X-CloudTasks-", can
   * be used to define properties of the task.
   * * Host: This will be computed by Cloud Tasks and derived from
   * [HttpRequest.url][google.cloud.tasks.v2beta3.Target.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   *
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example,`Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`. The default value is set to `"application/json"`.
   *
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   *
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   *
   * The size of the headers must be less than 80KB.
   * Queue-level headers to override headers of all the tasks in the queue.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.HttpTarget.HeaderOverride header_overrides = 3;</code>
   */
  java.util.List<com.google.cloud.tasks.v2beta3.HttpTarget.HeaderOverride> 
      getHeaderOverridesList();
  /**
   * <pre>
   * HTTP target headers.
   *
   * This map contains the header field names and values.
   * Headers will be set when running the
   * [CreateTask][google.cloud.tasks.v2beta3.CloudTasks.CreateTask] and/or
   * [BufferTask][google.cloud.tasks.v2beta3.CloudTasks.BufferTask].
   *
   * These headers represent a subset of the headers that will be configured for
   * the task's HTTP request. Some HTTP request headers will be ignored or
   * replaced.
   *
   * A partial list of headers that will be ignored or replaced is:
   * * Several predefined headers, prefixed with "X-CloudTasks-", can
   * be used to define properties of the task.
   * * Host: This will be computed by Cloud Tasks and derived from
   * [HttpRequest.url][google.cloud.tasks.v2beta3.Target.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   *
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example,`Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`. The default value is set to `"application/json"`.
   *
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   *
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   *
   * The size of the headers must be less than 80KB.
   * Queue-level headers to override headers of all the tasks in the queue.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.HttpTarget.HeaderOverride header_overrides = 3;</code>
   */
  com.google.cloud.tasks.v2beta3.HttpTarget.HeaderOverride getHeaderOverrides(int index);
  /**
   * <pre>
   * HTTP target headers.
   *
   * This map contains the header field names and values.
   * Headers will be set when running the
   * [CreateTask][google.cloud.tasks.v2beta3.CloudTasks.CreateTask] and/or
   * [BufferTask][google.cloud.tasks.v2beta3.CloudTasks.BufferTask].
   *
   * These headers represent a subset of the headers that will be configured for
   * the task's HTTP request. Some HTTP request headers will be ignored or
   * replaced.
   *
   * A partial list of headers that will be ignored or replaced is:
   * * Several predefined headers, prefixed with "X-CloudTasks-", can
   * be used to define properties of the task.
   * * Host: This will be computed by Cloud Tasks and derived from
   * [HttpRequest.url][google.cloud.tasks.v2beta3.Target.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   *
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example,`Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`. The default value is set to `"application/json"`.
   *
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   *
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   *
   * The size of the headers must be less than 80KB.
   * Queue-level headers to override headers of all the tasks in the queue.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.HttpTarget.HeaderOverride header_overrides = 3;</code>
   */
  int getHeaderOverridesCount();
  /**
   * <pre>
   * HTTP target headers.
   *
   * This map contains the header field names and values.
   * Headers will be set when running the
   * [CreateTask][google.cloud.tasks.v2beta3.CloudTasks.CreateTask] and/or
   * [BufferTask][google.cloud.tasks.v2beta3.CloudTasks.BufferTask].
   *
   * These headers represent a subset of the headers that will be configured for
   * the task's HTTP request. Some HTTP request headers will be ignored or
   * replaced.
   *
   * A partial list of headers that will be ignored or replaced is:
   * * Several predefined headers, prefixed with "X-CloudTasks-", can
   * be used to define properties of the task.
   * * Host: This will be computed by Cloud Tasks and derived from
   * [HttpRequest.url][google.cloud.tasks.v2beta3.Target.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   *
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example,`Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`. The default value is set to `"application/json"`.
   *
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   *
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   *
   * The size of the headers must be less than 80KB.
   * Queue-level headers to override headers of all the tasks in the queue.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.HttpTarget.HeaderOverride header_overrides = 3;</code>
   */
  java.util.List<? extends com.google.cloud.tasks.v2beta3.HttpTarget.HeaderOverrideOrBuilder> 
      getHeaderOverridesOrBuilderList();
  /**
   * <pre>
   * HTTP target headers.
   *
   * This map contains the header field names and values.
   * Headers will be set when running the
   * [CreateTask][google.cloud.tasks.v2beta3.CloudTasks.CreateTask] and/or
   * [BufferTask][google.cloud.tasks.v2beta3.CloudTasks.BufferTask].
   *
   * These headers represent a subset of the headers that will be configured for
   * the task's HTTP request. Some HTTP request headers will be ignored or
   * replaced.
   *
   * A partial list of headers that will be ignored or replaced is:
   * * Several predefined headers, prefixed with "X-CloudTasks-", can
   * be used to define properties of the task.
   * * Host: This will be computed by Cloud Tasks and derived from
   * [HttpRequest.url][google.cloud.tasks.v2beta3.Target.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   *
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example,`Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`. The default value is set to `"application/json"`.
   *
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   *
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   *
   * The size of the headers must be less than 80KB.
   * Queue-level headers to override headers of all the tasks in the queue.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.HttpTarget.HeaderOverride header_overrides = 3;</code>
   */
  com.google.cloud.tasks.v2beta3.HttpTarget.HeaderOverrideOrBuilder getHeaderOverridesOrBuilder(
      int index);

  /**
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as the `Authorization` header in the HTTP
   * request.
   *
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.OAuthToken oauth_token = 5;</code>
   * @return Whether the oauthToken field is set.
   */
  boolean hasOauthToken();
  /**
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as the `Authorization` header in the HTTP
   * request.
   *
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.OAuthToken oauth_token = 5;</code>
   * @return The oauthToken.
   */
  com.google.cloud.tasks.v2beta3.OAuthToken getOauthToken();
  /**
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as the `Authorization` header in the HTTP
   * request.
   *
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.OAuthToken oauth_token = 5;</code>
   */
  com.google.cloud.tasks.v2beta3.OAuthTokenOrBuilder getOauthTokenOrBuilder();

  /**
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   *
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.OidcToken oidc_token = 6;</code>
   * @return Whether the oidcToken field is set.
   */
  boolean hasOidcToken();
  /**
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   *
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.OidcToken oidc_token = 6;</code>
   * @return The oidcToken.
   */
  com.google.cloud.tasks.v2beta3.OidcToken getOidcToken();
  /**
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   *
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.OidcToken oidc_token = 6;</code>
   */
  com.google.cloud.tasks.v2beta3.OidcTokenOrBuilder getOidcTokenOrBuilder();

  com.google.cloud.tasks.v2beta3.HttpTarget.AuthorizationHeaderCase getAuthorizationHeaderCase();
}
