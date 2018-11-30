// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

public interface ListTasksRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.ListTasksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The queue name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required.
   * The queue name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta3.Task] will be
   * returned.
   * By default response_view is [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all
   * information is retrieved by default because some data, such as
   * payloads, might be desirable to return only when needed because
   * of its large size or because of the sensitivity of data that it
   * contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL] requires
   * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
   * permission on the [Task][google.cloud.tasks.v2beta3.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
   */
  int getResponseViewValue();
  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta3.Task] will be
   * returned.
   * By default response_view is [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC]; not all
   * information is retrieved by default because some data, such as
   * payloads, might be desirable to return only when needed because
   * of its large size or because of the sensitivity of data that it
   * contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta3.Task.View.FULL] requires
   * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
   * permission on the [Task][google.cloud.tasks.v2beta3.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Task.View response_view = 2;</code>
   */
  com.google.cloud.tasks.v2beta3.Task.View getResponseView();

  /**
   *
   *
   * <pre>
   * Requested page size. Fewer tasks than requested might be returned.
   * The maximum page size is 1000. If unspecified, the page size will
   * be the maximum. Fewer tasks than requested might be returned,
   * even if more tasks exist; use
   * [next_page_token][google.cloud.tasks.v2beta3.ListTasksResponse.next_page_token] in the
   * response to determine if more tasks exist.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying the page of results to return.
   * To request the first page results, page_token must be empty. To
   * request the next page of results, page_token must be the value of
   * [next_page_token][google.cloud.tasks.v2beta3.ListTasksResponse.next_page_token] returned
   * from the previous call to [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks]
   * method.
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying the page of results to return.
   * To request the first page results, page_token must be empty. To
   * request the next page of results, page_token must be the value of
   * [next_page_token][google.cloud.tasks.v2beta3.ListTasksResponse.next_page_token] returned
   * from the previous call to [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks]
   * method.
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
