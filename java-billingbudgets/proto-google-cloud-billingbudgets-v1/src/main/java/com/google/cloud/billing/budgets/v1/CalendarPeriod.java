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
// source: google/cloud/billing/budgets/v1/budget_model.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.billing.budgets.v1;

/**
 *
 *
 * <pre>
 * A `CalendarPeriod` represents the abstract concept of a time period that
 * has a canonical start. Grammatically, "the start of the current
 * `CalendarPeriod`". All calendar times begin at 12 AM US and Canadian
 * Pacific Time (UTC-8).
 * </pre>
 *
 * Protobuf enum {@code google.cloud.billing.budgets.v1.CalendarPeriod}
 */
public enum CalendarPeriod implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Calendar period is unset. This is the default if the budget is for a
   * custom time period (CustomPeriod).
   * </pre>
   *
   * <code>CALENDAR_PERIOD_UNSPECIFIED = 0;</code>
   */
  CALENDAR_PERIOD_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A month. Month starts on the first day of each month, such as January 1,
   * February 1, March 1, and so on.
   * </pre>
   *
   * <code>MONTH = 1;</code>
   */
  MONTH(1),
  /**
   *
   *
   * <pre>
   * A quarter. Quarters start on dates January 1, April 1, July 1, and October
   * 1 of each year.
   * </pre>
   *
   * <code>QUARTER = 2;</code>
   */
  QUARTER(2),
  /**
   *
   *
   * <pre>
   * A year. Year starts on January 1.
   * </pre>
   *
   * <code>YEAR = 3;</code>
   */
  YEAR(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Calendar period is unset. This is the default if the budget is for a
   * custom time period (CustomPeriod).
   * </pre>
   *
   * <code>CALENDAR_PERIOD_UNSPECIFIED = 0;</code>
   */
  public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A month. Month starts on the first day of each month, such as January 1,
   * February 1, March 1, and so on.
   * </pre>
   *
   * <code>MONTH = 1;</code>
   */
  public static final int MONTH_VALUE = 1;
  /**
   *
   *
   * <pre>
   * A quarter. Quarters start on dates January 1, April 1, July 1, and October
   * 1 of each year.
   * </pre>
   *
   * <code>QUARTER = 2;</code>
   */
  public static final int QUARTER_VALUE = 2;
  /**
   *
   *
   * <pre>
   * A year. Year starts on January 1.
   * </pre>
   *
   * <code>YEAR = 3;</code>
   */
  public static final int YEAR_VALUE = 3;

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
  public static CalendarPeriod valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CalendarPeriod forNumber(int value) {
    switch (value) {
      case 0:
        return CALENDAR_PERIOD_UNSPECIFIED;
      case 1:
        return MONTH;
      case 2:
        return QUARTER;
      case 3:
        return YEAR;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CalendarPeriod> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<CalendarPeriod> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<CalendarPeriod>() {
        public CalendarPeriod findValueByNumber(int number) {
          return CalendarPeriod.forNumber(number);
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
    return com.google.cloud.billing.budgets.v1.BudgetModelProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final CalendarPeriod[] VALUES = values();

  public static CalendarPeriod valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CalendarPeriod(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.billing.budgets.v1.CalendarPeriod)
}
