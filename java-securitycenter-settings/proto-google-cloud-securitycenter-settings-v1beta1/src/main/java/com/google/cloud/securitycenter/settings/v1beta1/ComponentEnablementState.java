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
// source: google/cloud/securitycenter/settings/v1beta1/component_settings.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.settings.v1beta1;

/**
 *
 *
 * <pre>
 * Valid states for a component
 * </pre>
 *
 * Protobuf enum {@code google.cloud.securitycenter.settings.v1beta1.ComponentEnablementState}
 */
public enum ComponentEnablementState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No state specified, equivalent of INHERIT
   * </pre>
   *
   * <code>COMPONENT_ENABLEMENT_STATE_UNSPECIFIED = 0;</code>
   */
  COMPONENT_ENABLEMENT_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Disable the component
   * </pre>
   *
   * <code>DISABLE = 1;</code>
   */
  DISABLE(1),
  /**
   *
   *
   * <pre>
   * Enable the component
   * </pre>
   *
   * <code>ENABLE = 2;</code>
   */
  ENABLE(2),
  /**
   *
   *
   * <pre>
   * Inherit the state from resources parent folder or organization.
   * </pre>
   *
   * <code>INHERIT = 3;</code>
   */
  INHERIT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No state specified, equivalent of INHERIT
   * </pre>
   *
   * <code>COMPONENT_ENABLEMENT_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int COMPONENT_ENABLEMENT_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Disable the component
   * </pre>
   *
   * <code>DISABLE = 1;</code>
   */
  public static final int DISABLE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Enable the component
   * </pre>
   *
   * <code>ENABLE = 2;</code>
   */
  public static final int ENABLE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Inherit the state from resources parent folder or organization.
   * </pre>
   *
   * <code>INHERIT = 3;</code>
   */
  public static final int INHERIT_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ComponentEnablementState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ComponentEnablementState forNumber(int value) {
    switch (value) {
      case 0:
        return COMPONENT_ENABLEMENT_STATE_UNSPECIFIED;
      case 1:
        return DISABLE;
      case 2:
        return ENABLE;
      case 3:
        return INHERIT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ComponentEnablementState>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ComponentEnablementState>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ComponentEnablementState>() {
            public ComponentEnablementState findValueByNumber(int number) {
              return ComponentEnablementState.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.securitycenter.settings.v1beta1.ComponentSettingsProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final ComponentEnablementState[] VALUES = values();

  public static ComponentEnablementState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ComponentEnablementState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.securitycenter.settings.v1beta1.ComponentEnablementState)
}
