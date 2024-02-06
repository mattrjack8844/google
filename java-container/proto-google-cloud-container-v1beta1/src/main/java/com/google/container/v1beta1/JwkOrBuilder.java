/*
 * Copyright 2024 Google LLC
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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface JwkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.Jwk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Key Type.
   * </pre>
   *
   * <code>string kty = 1;</code>
   *
   * @return The kty.
   */
  java.lang.String getKty();
  /**
   *
   *
   * <pre>
   * Key Type.
   * </pre>
   *
   * <code>string kty = 1;</code>
   *
   * @return The bytes for kty.
   */
  com.google.protobuf.ByteString getKtyBytes();

  /**
   *
   *
   * <pre>
   * Algorithm.
   * </pre>
   *
   * <code>string alg = 2;</code>
   *
   * @return The alg.
   */
  java.lang.String getAlg();
  /**
   *
   *
   * <pre>
   * Algorithm.
   * </pre>
   *
   * <code>string alg = 2;</code>
   *
   * @return The bytes for alg.
   */
  com.google.protobuf.ByteString getAlgBytes();

  /**
   *
   *
   * <pre>
   * Permitted uses for the public keys.
   * </pre>
   *
   * <code>string use = 3;</code>
   *
   * @return The use.
   */
  java.lang.String getUse();
  /**
   *
   *
   * <pre>
   * Permitted uses for the public keys.
   * </pre>
   *
   * <code>string use = 3;</code>
   *
   * @return The bytes for use.
   */
  com.google.protobuf.ByteString getUseBytes();

  /**
   *
   *
   * <pre>
   * Key ID.
   * </pre>
   *
   * <code>string kid = 4;</code>
   *
   * @return The kid.
   */
  java.lang.String getKid();
  /**
   *
   *
   * <pre>
   * Key ID.
   * </pre>
   *
   * <code>string kid = 4;</code>
   *
   * @return The bytes for kid.
   */
  com.google.protobuf.ByteString getKidBytes();

  /**
   *
   *
   * <pre>
   * Used for RSA keys.
   * </pre>
   *
   * <code>string n = 5;</code>
   *
   * @return The n.
   */
  java.lang.String getN();
  /**
   *
   *
   * <pre>
   * Used for RSA keys.
   * </pre>
   *
   * <code>string n = 5;</code>
   *
   * @return The bytes for n.
   */
  com.google.protobuf.ByteString getNBytes();

  /**
   *
   *
   * <pre>
   * Used for RSA keys.
   * </pre>
   *
   * <code>string e = 6;</code>
   *
   * @return The e.
   */
  java.lang.String getE();
  /**
   *
   *
   * <pre>
   * Used for RSA keys.
   * </pre>
   *
   * <code>string e = 6;</code>
   *
   * @return The bytes for e.
   */
  com.google.protobuf.ByteString getEBytes();

  /**
   *
   *
   * <pre>
   * Used for ECDSA keys.
   * </pre>
   *
   * <code>string x = 7;</code>
   *
   * @return The x.
   */
  java.lang.String getX();
  /**
   *
   *
   * <pre>
   * Used for ECDSA keys.
   * </pre>
   *
   * <code>string x = 7;</code>
   *
   * @return The bytes for x.
   */
  com.google.protobuf.ByteString getXBytes();

  /**
   *
   *
   * <pre>
   * Used for ECDSA keys.
   * </pre>
   *
   * <code>string y = 8;</code>
   *
   * @return The y.
   */
  java.lang.String getY();
  /**
   *
   *
   * <pre>
   * Used for ECDSA keys.
   * </pre>
   *
   * <code>string y = 8;</code>
   *
   * @return The bytes for y.
   */
  com.google.protobuf.ByteString getYBytes();

  /**
   *
   *
   * <pre>
   * Used for ECDSA keys.
   * </pre>
   *
   * <code>string crv = 9;</code>
   *
   * @return The crv.
   */
  java.lang.String getCrv();
  /**
   *
   *
   * <pre>
   * Used for ECDSA keys.
   * </pre>
   *
   * <code>string crv = 9;</code>
   *
   * @return The bytes for crv.
   */
  com.google.protobuf.ByteString getCrvBytes();
}
