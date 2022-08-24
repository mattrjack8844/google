/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

package com.google.cloud.gsuiteaddons.v1;

public interface AddOnsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gsuiteaddons.v1.AddOns)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configuration that is common across all Google Workspace Add-ons.
   * </pre>
   *
   * <code>.google.apps.script.type.CommonAddOnManifest common = 1;</code>
   *
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   *
   *
   * <pre>
   * Configuration that is common across all Google Workspace Add-ons.
   * </pre>
   *
   * <code>.google.apps.script.type.CommonAddOnManifest common = 1;</code>
   *
   * @return The common.
   */
  com.google.apps.script.type.CommonAddOnManifest getCommon();
  /**
   *
   *
   * <pre>
   * Configuration that is common across all Google Workspace Add-ons.
   * </pre>
   *
   * <code>.google.apps.script.type.CommonAddOnManifest common = 1;</code>
   */
  com.google.apps.script.type.CommonAddOnManifestOrBuilder getCommonOrBuilder();

  /**
   *
   *
   * <pre>
   * Gmail add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.GmailAddOnManifest gmail = 2;</code>
   *
   * @return Whether the gmail field is set.
   */
  boolean hasGmail();
  /**
   *
   *
   * <pre>
   * Gmail add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.GmailAddOnManifest gmail = 2;</code>
   *
   * @return The gmail.
   */
  com.google.apps.script.type.gmail.GmailAddOnManifest getGmail();
  /**
   *
   *
   * <pre>
   * Gmail add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.GmailAddOnManifest gmail = 2;</code>
   */
  com.google.apps.script.type.gmail.GmailAddOnManifestOrBuilder getGmailOrBuilder();

  /**
   *
   *
   * <pre>
   * Drive add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.drive.DriveAddOnManifest drive = 5;</code>
   *
   * @return Whether the drive field is set.
   */
  boolean hasDrive();
  /**
   *
   *
   * <pre>
   * Drive add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.drive.DriveAddOnManifest drive = 5;</code>
   *
   * @return The drive.
   */
  com.google.apps.script.type.drive.DriveAddOnManifest getDrive();
  /**
   *
   *
   * <pre>
   * Drive add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.drive.DriveAddOnManifest drive = 5;</code>
   */
  com.google.apps.script.type.drive.DriveAddOnManifestOrBuilder getDriveOrBuilder();

  /**
   *
   *
   * <pre>
   * Calendar add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.calendar.CalendarAddOnManifest calendar = 6;</code>
   *
   * @return Whether the calendar field is set.
   */
  boolean hasCalendar();
  /**
   *
   *
   * <pre>
   * Calendar add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.calendar.CalendarAddOnManifest calendar = 6;</code>
   *
   * @return The calendar.
   */
  com.google.apps.script.type.calendar.CalendarAddOnManifest getCalendar();
  /**
   *
   *
   * <pre>
   * Calendar add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.calendar.CalendarAddOnManifest calendar = 6;</code>
   */
  com.google.apps.script.type.calendar.CalendarAddOnManifestOrBuilder getCalendarOrBuilder();

  /**
   *
   *
   * <pre>
   * Docs add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.docs.DocsAddOnManifest docs = 7;</code>
   *
   * @return Whether the docs field is set.
   */
  boolean hasDocs();
  /**
   *
   *
   * <pre>
   * Docs add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.docs.DocsAddOnManifest docs = 7;</code>
   *
   * @return The docs.
   */
  com.google.apps.script.type.docs.DocsAddOnManifest getDocs();
  /**
   *
   *
   * <pre>
   * Docs add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.docs.DocsAddOnManifest docs = 7;</code>
   */
  com.google.apps.script.type.docs.DocsAddOnManifestOrBuilder getDocsOrBuilder();

  /**
   *
   *
   * <pre>
   * Sheets add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.sheets.SheetsAddOnManifest sheets = 8;</code>
   *
   * @return Whether the sheets field is set.
   */
  boolean hasSheets();
  /**
   *
   *
   * <pre>
   * Sheets add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.sheets.SheetsAddOnManifest sheets = 8;</code>
   *
   * @return The sheets.
   */
  com.google.apps.script.type.sheets.SheetsAddOnManifest getSheets();
  /**
   *
   *
   * <pre>
   * Sheets add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.sheets.SheetsAddOnManifest sheets = 8;</code>
   */
  com.google.apps.script.type.sheets.SheetsAddOnManifestOrBuilder getSheetsOrBuilder();

  /**
   *
   *
   * <pre>
   * Slides add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.slides.SlidesAddOnManifest slides = 10;</code>
   *
   * @return Whether the slides field is set.
   */
  boolean hasSlides();
  /**
   *
   *
   * <pre>
   * Slides add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.slides.SlidesAddOnManifest slides = 10;</code>
   *
   * @return The slides.
   */
  com.google.apps.script.type.slides.SlidesAddOnManifest getSlides();
  /**
   *
   *
   * <pre>
   * Slides add-on configuration.
   * </pre>
   *
   * <code>.google.apps.script.type.slides.SlidesAddOnManifest slides = 10;</code>
   */
  com.google.apps.script.type.slides.SlidesAddOnManifestOrBuilder getSlidesOrBuilder();

  /**
   *
   *
   * <pre>
   * Options for sending requests to add-on HTTP endpoints
   * </pre>
   *
   * <code>.google.apps.script.type.HttpOptions http_options = 15;</code>
   *
   * @return Whether the httpOptions field is set.
   */
  boolean hasHttpOptions();
  /**
   *
   *
   * <pre>
   * Options for sending requests to add-on HTTP endpoints
   * </pre>
   *
   * <code>.google.apps.script.type.HttpOptions http_options = 15;</code>
   *
   * @return The httpOptions.
   */
  com.google.apps.script.type.HttpOptions getHttpOptions();
  /**
   *
   *
   * <pre>
   * Options for sending requests to add-on HTTP endpoints
   * </pre>
   *
   * <code>.google.apps.script.type.HttpOptions http_options = 15;</code>
   */
  com.google.apps.script.type.HttpOptionsOrBuilder getHttpOptionsOrBuilder();
}
