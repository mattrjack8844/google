/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vertexai/v1/types.proto

package com.google.cloud.vertexai.v1;

public interface TensorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.Tensor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The data type of tensor.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.Tensor.DataType dtype = 1;</code>
   *
   * @return The enum numeric value on the wire for dtype.
   */
  int getDtypeValue();
  /**
   *
   *
   * <pre>
   * The data type of tensor.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.Tensor.DataType dtype = 1;</code>
   *
   * @return The dtype.
   */
  com.google.cloud.vertexai.v1.Tensor.DataType getDtype();

  /**
   *
   *
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>repeated int64 shape = 2;</code>
   *
   * @return A list containing the shape.
   */
  java.util.List<java.lang.Long> getShapeList();
  /**
   *
   *
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>repeated int64 shape = 2;</code>
   *
   * @return The count of shape.
   */
  int getShapeCount();
  /**
   *
   *
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>repeated int64 shape = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The shape at the given index.
   */
  long getShape(int index);

  /**
   *
   *
   * <pre>
   * Type specific representations that make it easy to create tensor protos in
   * all languages.  Only the representation corresponding to "dtype" can
   * be set.  The values hold the flattened representation of the tensor in
   * row major order.
   *
   * [BOOL][google.vertexai.master.Tensor.DataType.BOOL]
   * </pre>
   *
   * <code>repeated bool bool_val = 3;</code>
   *
   * @return A list containing the boolVal.
   */
  java.util.List<java.lang.Boolean> getBoolValList();
  /**
   *
   *
   * <pre>
   * Type specific representations that make it easy to create tensor protos in
   * all languages.  Only the representation corresponding to "dtype" can
   * be set.  The values hold the flattened representation of the tensor in
   * row major order.
   *
   * [BOOL][google.vertexai.master.Tensor.DataType.BOOL]
   * </pre>
   *
   * <code>repeated bool bool_val = 3;</code>
   *
   * @return The count of boolVal.
   */
  int getBoolValCount();
  /**
   *
   *
   * <pre>
   * Type specific representations that make it easy to create tensor protos in
   * all languages.  Only the representation corresponding to "dtype" can
   * be set.  The values hold the flattened representation of the tensor in
   * row major order.
   *
   * [BOOL][google.vertexai.master.Tensor.DataType.BOOL]
   * </pre>
   *
   * <code>repeated bool bool_val = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The boolVal at the given index.
   */
  boolean getBoolVal(int index);

  /**
   *
   *
   * <pre>
   * [STRING][google.vertexai.master.Tensor.DataType.STRING]
   * </pre>
   *
   * <code>repeated string string_val = 14;</code>
   *
   * @return A list containing the stringVal.
   */
  java.util.List<java.lang.String> getStringValList();
  /**
   *
   *
   * <pre>
   * [STRING][google.vertexai.master.Tensor.DataType.STRING]
   * </pre>
   *
   * <code>repeated string string_val = 14;</code>
   *
   * @return The count of stringVal.
   */
  int getStringValCount();
  /**
   *
   *
   * <pre>
   * [STRING][google.vertexai.master.Tensor.DataType.STRING]
   * </pre>
   *
   * <code>repeated string string_val = 14;</code>
   *
   * @param index The index of the element to return.
   * @return The stringVal at the given index.
   */
  java.lang.String getStringVal(int index);
  /**
   *
   *
   * <pre>
   * [STRING][google.vertexai.master.Tensor.DataType.STRING]
   * </pre>
   *
   * <code>repeated string string_val = 14;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the stringVal at the given index.
   */
  com.google.protobuf.ByteString getStringValBytes(int index);

  /**
   *
   *
   * <pre>
   * [STRING][google.vertexai.master.Tensor.DataType.STRING]
   * </pre>
   *
   * <code>repeated bytes bytes_val = 15;</code>
   *
   * @return A list containing the bytesVal.
   */
  java.util.List<com.google.protobuf.ByteString> getBytesValList();
  /**
   *
   *
   * <pre>
   * [STRING][google.vertexai.master.Tensor.DataType.STRING]
   * </pre>
   *
   * <code>repeated bytes bytes_val = 15;</code>
   *
   * @return The count of bytesVal.
   */
  int getBytesValCount();
  /**
   *
   *
   * <pre>
   * [STRING][google.vertexai.master.Tensor.DataType.STRING]
   * </pre>
   *
   * <code>repeated bytes bytes_val = 15;</code>
   *
   * @param index The index of the element to return.
   * @return The bytesVal at the given index.
   */
  com.google.protobuf.ByteString getBytesVal(int index);

  /**
   *
   *
   * <pre>
   * [FLOAT][google.vertexai.master.Tensor.DataType.FLOAT]
   * </pre>
   *
   * <code>repeated float float_val = 5;</code>
   *
   * @return A list containing the floatVal.
   */
  java.util.List<java.lang.Float> getFloatValList();
  /**
   *
   *
   * <pre>
   * [FLOAT][google.vertexai.master.Tensor.DataType.FLOAT]
   * </pre>
   *
   * <code>repeated float float_val = 5;</code>
   *
   * @return The count of floatVal.
   */
  int getFloatValCount();
  /**
   *
   *
   * <pre>
   * [FLOAT][google.vertexai.master.Tensor.DataType.FLOAT]
   * </pre>
   *
   * <code>repeated float float_val = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The floatVal at the given index.
   */
  float getFloatVal(int index);

  /**
   *
   *
   * <pre>
   * [DOUBLE][google.vertexai.master.Tensor.DataType.DOUBLE]
   * </pre>
   *
   * <code>repeated double double_val = 6;</code>
   *
   * @return A list containing the doubleVal.
   */
  java.util.List<java.lang.Double> getDoubleValList();
  /**
   *
   *
   * <pre>
   * [DOUBLE][google.vertexai.master.Tensor.DataType.DOUBLE]
   * </pre>
   *
   * <code>repeated double double_val = 6;</code>
   *
   * @return The count of doubleVal.
   */
  int getDoubleValCount();
  /**
   *
   *
   * <pre>
   * [DOUBLE][google.vertexai.master.Tensor.DataType.DOUBLE]
   * </pre>
   *
   * <code>repeated double double_val = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The doubleVal at the given index.
   */
  double getDoubleVal(int index);

  /**
   *
   *
   * <pre>
   * [INT_8][google.vertexai.master.Tensor.DataType.INT8]
   * [INT_16][google.vertexai.master.Tensor.DataType.INT16]
   * [INT_32][google.vertexai.master.Tensor.DataType.INT32]
   * </pre>
   *
   * <code>repeated int32 int_val = 7;</code>
   *
   * @return A list containing the intVal.
   */
  java.util.List<java.lang.Integer> getIntValList();
  /**
   *
   *
   * <pre>
   * [INT_8][google.vertexai.master.Tensor.DataType.INT8]
   * [INT_16][google.vertexai.master.Tensor.DataType.INT16]
   * [INT_32][google.vertexai.master.Tensor.DataType.INT32]
   * </pre>
   *
   * <code>repeated int32 int_val = 7;</code>
   *
   * @return The count of intVal.
   */
  int getIntValCount();
  /**
   *
   *
   * <pre>
   * [INT_8][google.vertexai.master.Tensor.DataType.INT8]
   * [INT_16][google.vertexai.master.Tensor.DataType.INT16]
   * [INT_32][google.vertexai.master.Tensor.DataType.INT32]
   * </pre>
   *
   * <code>repeated int32 int_val = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The intVal at the given index.
   */
  int getIntVal(int index);

  /**
   *
   *
   * <pre>
   * [INT64][google.vertexai.master.Tensor.DataType.INT64]
   * </pre>
   *
   * <code>repeated int64 int64_val = 8;</code>
   *
   * @return A list containing the int64Val.
   */
  java.util.List<java.lang.Long> getInt64ValList();
  /**
   *
   *
   * <pre>
   * [INT64][google.vertexai.master.Tensor.DataType.INT64]
   * </pre>
   *
   * <code>repeated int64 int64_val = 8;</code>
   *
   * @return The count of int64Val.
   */
  int getInt64ValCount();
  /**
   *
   *
   * <pre>
   * [INT64][google.vertexai.master.Tensor.DataType.INT64]
   * </pre>
   *
   * <code>repeated int64 int64_val = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The int64Val at the given index.
   */
  long getInt64Val(int index);

  /**
   *
   *
   * <pre>
   * [UINT8][google.vertexai.master.Tensor.DataType.UINT8]
   * [UINT16][google.vertexai.master.Tensor.DataType.UINT16]
   * [UINT32][google.vertexai.master.Tensor.DataType.UINT32]
   * </pre>
   *
   * <code>repeated uint32 uint_val = 9;</code>
   *
   * @return A list containing the uintVal.
   */
  java.util.List<java.lang.Integer> getUintValList();
  /**
   *
   *
   * <pre>
   * [UINT8][google.vertexai.master.Tensor.DataType.UINT8]
   * [UINT16][google.vertexai.master.Tensor.DataType.UINT16]
   * [UINT32][google.vertexai.master.Tensor.DataType.UINT32]
   * </pre>
   *
   * <code>repeated uint32 uint_val = 9;</code>
   *
   * @return The count of uintVal.
   */
  int getUintValCount();
  /**
   *
   *
   * <pre>
   * [UINT8][google.vertexai.master.Tensor.DataType.UINT8]
   * [UINT16][google.vertexai.master.Tensor.DataType.UINT16]
   * [UINT32][google.vertexai.master.Tensor.DataType.UINT32]
   * </pre>
   *
   * <code>repeated uint32 uint_val = 9;</code>
   *
   * @param index The index of the element to return.
   * @return The uintVal at the given index.
   */
  int getUintVal(int index);

  /**
   *
   *
   * <pre>
   * [UINT64][google.vertexai.master.Tensor.DataType.UINT64]
   * </pre>
   *
   * <code>repeated uint64 uint64_val = 10;</code>
   *
   * @return A list containing the uint64Val.
   */
  java.util.List<java.lang.Long> getUint64ValList();
  /**
   *
   *
   * <pre>
   * [UINT64][google.vertexai.master.Tensor.DataType.UINT64]
   * </pre>
   *
   * <code>repeated uint64 uint64_val = 10;</code>
   *
   * @return The count of uint64Val.
   */
  int getUint64ValCount();
  /**
   *
   *
   * <pre>
   * [UINT64][google.vertexai.master.Tensor.DataType.UINT64]
   * </pre>
   *
   * <code>repeated uint64 uint64_val = 10;</code>
   *
   * @param index The index of the element to return.
   * @return The uint64Val at the given index.
   */
  long getUint64Val(int index);

  /**
   *
   *
   * <pre>
   * A list of tensor values.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Tensor list_val = 11;</code>
   */
  java.util.List<com.google.cloud.vertexai.v1.Tensor> getListValList();
  /**
   *
   *
   * <pre>
   * A list of tensor values.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Tensor list_val = 11;</code>
   */
  com.google.cloud.vertexai.v1.Tensor getListVal(int index);
  /**
   *
   *
   * <pre>
   * A list of tensor values.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Tensor list_val = 11;</code>
   */
  int getListValCount();
  /**
   *
   *
   * <pre>
   * A list of tensor values.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Tensor list_val = 11;</code>
   */
  java.util.List<? extends com.google.cloud.vertexai.v1.TensorOrBuilder> getListValOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of tensor values.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Tensor list_val = 11;</code>
   */
  com.google.cloud.vertexai.v1.TensorOrBuilder getListValOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A map of string to tensor.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.vertexai.v1.Tensor&gt; struct_val = 12;</code>
   */
  int getStructValCount();
  /**
   *
   *
   * <pre>
   * A map of string to tensor.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.vertexai.v1.Tensor&gt; struct_val = 12;</code>
   */
  boolean containsStructVal(java.lang.String key);
  /** Use {@link #getStructValMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.vertexai.v1.Tensor> getStructVal();
  /**
   *
   *
   * <pre>
   * A map of string to tensor.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.vertexai.v1.Tensor&gt; struct_val = 12;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.vertexai.v1.Tensor> getStructValMap();
  /**
   *
   *
   * <pre>
   * A map of string to tensor.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.vertexai.v1.Tensor&gt; struct_val = 12;</code>
   */
  /* nullable */
  com.google.cloud.vertexai.v1.Tensor getStructValOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.vertexai.v1.Tensor defaultValue);
  /**
   *
   *
   * <pre>
   * A map of string to tensor.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.vertexai.v1.Tensor&gt; struct_val = 12;</code>
   */
  com.google.cloud.vertexai.v1.Tensor getStructValOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Serialized raw tensor content.
   * </pre>
   *
   * <code>bytes tensor_val = 13;</code>
   *
   * @return The tensorVal.
   */
  com.google.protobuf.ByteString getTensorVal();
}
