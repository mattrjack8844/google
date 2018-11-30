// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

public interface BatchCreateOccurrencesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.BatchCreateOccurrencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the occurrences are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the occurrences are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  java.util.List<io.grafeas.v1beta1.Occurrence> getOccurrencesList();
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  io.grafeas.v1beta1.Occurrence getOccurrences(int index);
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  int getOccurrencesCount();
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.OccurrenceOrBuilder> getOccurrencesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  io.grafeas.v1beta1.OccurrenceOrBuilder getOccurrencesOrBuilder(int index);
}
