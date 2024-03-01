// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.api.servicemanagement.v1;

public interface DiagnosticOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.Diagnostic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * File name and line number of the error or warning.
   * </pre>
   *
   * <code>string location = 1;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * File name and line number of the error or warning.
   * </pre>
   *
   * <code>string location = 1;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * The kind of diagnostic information provided.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.Diagnostic.Kind kind = 2;</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <pre>
   * The kind of diagnostic information provided.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.Diagnostic.Kind kind = 2;</code>
   * @return The kind.
   */
  com.google.api.servicemanagement.v1.Diagnostic.Kind getKind();

  /**
   * <pre>
   * Message describing the error or warning.
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Message describing the error or warning.
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
