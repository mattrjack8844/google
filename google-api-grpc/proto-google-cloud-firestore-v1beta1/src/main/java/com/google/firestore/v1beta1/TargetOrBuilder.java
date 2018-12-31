// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/firestore.proto

package com.google.firestore.v1beta1;

public interface TargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.Target)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A target specified by a query.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Target.QueryTarget query = 2;</code>
   */
  boolean hasQuery();
  /**
   *
   *
   * <pre>
   * A target specified by a query.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Target.QueryTarget query = 2;</code>
   */
  com.google.firestore.v1beta1.Target.QueryTarget getQuery();
  /**
   *
   *
   * <pre>
   * A target specified by a query.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Target.QueryTarget query = 2;</code>
   */
  com.google.firestore.v1beta1.Target.QueryTargetOrBuilder getQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * A target specified by a set of document names.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Target.DocumentsTarget documents = 3;</code>
   */
  boolean hasDocuments();
  /**
   *
   *
   * <pre>
   * A target specified by a set of document names.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Target.DocumentsTarget documents = 3;</code>
   */
  com.google.firestore.v1beta1.Target.DocumentsTarget getDocuments();
  /**
   *
   *
   * <pre>
   * A target specified by a set of document names.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.Target.DocumentsTarget documents = 3;</code>
   */
  com.google.firestore.v1beta1.Target.DocumentsTargetOrBuilder getDocumentsOrBuilder();

  /**
   *
   *
   * <pre>
   * A resume token from a prior [TargetChange][google.firestore.v1beta1.TargetChange] for an identical target.
   * Using a resume token with a different target is unsupported and may fail.
   * </pre>
   *
   * <code>bytes resume_token = 4;</code>
   */
  com.google.protobuf.ByteString getResumeToken();

  /**
   *
   *
   * <pre>
   * Start listening after a specific `read_time`.
   * The client must know the state of matching documents at this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 11;</code>
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Start listening after a specific `read_time`.
   * The client must know the state of matching documents at this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 11;</code>
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Start listening after a specific `read_time`.
   * The client must know the state of matching documents at this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A client provided target ID.
   * If not set, the server will assign an ID for the target.
   * Used for resuming a target without changing IDs. The IDs can either be
   * client-assigned or be server-assigned in a previous stream. All targets
   * with client provided IDs must be added before adding a target that needs
   * a server-assigned id.
   * </pre>
   *
   * <code>int32 target_id = 5;</code>
   */
  int getTargetId();

  /**
   *
   *
   * <pre>
   * If the target should be removed once it is current and consistent.
   * </pre>
   *
   * <code>bool once = 6;</code>
   */
  boolean getOnce();

  public com.google.firestore.v1beta1.Target.TargetTypeCase getTargetTypeCase();

  public com.google.firestore.v1beta1.Target.ResumeTypeCase getResumeTypeCase();
}
