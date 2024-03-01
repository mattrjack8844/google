// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v1/trace.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.cloudtrace.v1;

public interface TraceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.Trace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Project ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Globally unique identifier for the trace. This identifier is a 128-bit
   * numeric value formatted as a 32-byte hex string. For example,
   * `382d4f4c6b7bb2f4a972559d9085001d`.
   * </pre>
   *
   * <code>string trace_id = 2;</code>
   * @return The traceId.
   */
  java.lang.String getTraceId();
  /**
   * <pre>
   * Globally unique identifier for the trace. This identifier is a 128-bit
   * numeric value formatted as a 32-byte hex string. For example,
   * `382d4f4c6b7bb2f4a972559d9085001d`.
   * </pre>
   *
   * <code>string trace_id = 2;</code>
   * @return The bytes for traceId.
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();

  /**
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  java.util.List<com.google.devtools.cloudtrace.v1.TraceSpan> 
      getSpansList();
  /**
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  com.google.devtools.cloudtrace.v1.TraceSpan getSpans(int index);
  /**
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  int getSpansCount();
  /**
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder> 
      getSpansOrBuilderList();
  /**
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder getSpansOrBuilder(
      int index);
}
