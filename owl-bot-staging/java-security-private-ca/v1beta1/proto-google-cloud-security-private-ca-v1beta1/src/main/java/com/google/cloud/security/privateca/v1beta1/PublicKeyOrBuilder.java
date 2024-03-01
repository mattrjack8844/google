// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1beta1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.security.privateca.v1beta1;

public interface PublicKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.PublicKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The type of public key.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1beta1.PublicKey.KeyType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. The type of public key.
   * </pre>
   *
   * <code>.google.cloud.security.privateca.v1beta1.PublicKey.KeyType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  com.google.cloud.security.privateca.v1beta1.PublicKey.KeyType getType();

  /**
   * <pre>
   * Required. A public key. Padding and encoding varies by 'KeyType' and is described
   * along with the KeyType values.
   * </pre>
   *
   * <code>bytes key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();
}
