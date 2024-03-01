// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/log_entry.proto

// Protobuf Java Version: 3.25.2
package com.google.api.servicecontrol.v1;

public interface LogEntrySourceLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.LogEntrySourceLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Source file name. Depending on the runtime environment, this
   * might be a simple name or a fully-qualified name.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The file.
   */
  java.lang.String getFile();
  /**
   * <pre>
   * Optional. Source file name. Depending on the runtime environment, this
   * might be a simple name or a fully-qualified name.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The bytes for file.
   */
  com.google.protobuf.ByteString
      getFileBytes();

  /**
   * <pre>
   * Optional. Line within the source file. 1-based; 0 indicates no line number
   * available.
   * </pre>
   *
   * <code>int64 line = 2;</code>
   * @return The line.
   */
  long getLine();

  /**
   * <pre>
   * Optional. Human-readable name of the function or method being invoked, with
   * optional context such as the class or package name. This information may be
   * used in contexts such as the logs viewer, where a file and line number are
   * less meaningful. The format can vary by language. For example:
   * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
   * (Python).
   * </pre>
   *
   * <code>string function = 3;</code>
   * @return The function.
   */
  java.lang.String getFunction();
  /**
   * <pre>
   * Optional. Human-readable name of the function or method being invoked, with
   * optional context such as the class or package name. This information may be
   * used in contexts such as the logs viewer, where a file and line number are
   * less meaningful. The format can vary by language. For example:
   * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
   * (Python).
   * </pre>
   *
   * <code>string function = 3;</code>
   * @return The bytes for function.
   */
  com.google.protobuf.ByteString
      getFunctionBytes();
}
