// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface CreateSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.CreateSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional user-provided name for this snapshot.
   * If the name is not provided in the request, the server will assign a random
   * name for this snapshot on the same project as the subscription.
   * Note that for REST API requests, you must specify a name.  See the
   * &lt;a href="/pubsub/docs/admin#resource_names"&gt;resource name rules&lt;/a&gt;.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional user-provided name for this snapshot.
   * If the name is not provided in the request, the server will assign a random
   * name for this snapshot on the same project as the subscription.
   * Note that for REST API requests, you must specify a name.  See the
   * &lt;a href="/pubsub/docs/admin#resource_names"&gt;resource name rules&lt;/a&gt;.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The subscription whose backlog the snapshot retains.
   * Specifically, the created snapshot is guaranteed to retain:
   *  (a) The existing backlog on the subscription. More precisely, this is
   *      defined as the messages in the subscription's backlog that are
   *      unacknowledged upon the successful completion of the
   *      `CreateSnapshot` request; as well as:
   *  (b) Any messages published to the subscription's topic following the
   *      successful completion of the CreateSnapshot request.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 2;</code>
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * The subscription whose backlog the snapshot retains.
   * Specifically, the created snapshot is guaranteed to retain:
   *  (a) The existing backlog on the subscription. More precisely, this is
   *      defined as the messages in the subscription's backlog that are
   *      unacknowledged upon the successful completion of the
   *      `CreateSnapshot` request; as well as:
   *  (b) Any messages published to the subscription's topic following the
   *      successful completion of the CreateSnapshot request.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 2;</code>
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
