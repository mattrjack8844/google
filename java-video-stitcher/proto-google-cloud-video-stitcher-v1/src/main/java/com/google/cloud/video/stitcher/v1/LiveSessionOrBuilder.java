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
// source: google/cloud/video/stitcher/v1/sessions.proto

package com.google.cloud.video.stitcher.v1;

public interface LiveSessionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.LiveSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the live session, in the form of
   * `projects/{project}/locations/{location}/liveSessions/{id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the live session, in the form of
   * `projects/{project}/locations/{location}/liveSessions/{id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The URI to play the live session's ad-stitched stream.
   * </pre>
   *
   * <code>string play_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The playUri.
   */
  java.lang.String getPlayUri();
  /**
   *
   *
   * <pre>
   * Output only. The URI to play the live session's ad-stitched stream.
   * </pre>
   *
   * <code>string play_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for playUri.
   */
  com.google.protobuf.ByteString getPlayUriBytes();

  /**
   *
   *
   * <pre>
   * The URI of the live session's source stream.
   * </pre>
   *
   * <code>string source_uri = 3;</code>
   *
   * @return The sourceUri.
   */
  java.lang.String getSourceUri();
  /**
   *
   *
   * <pre>
   * The URI of the live session's source stream.
   * </pre>
   *
   * <code>string source_uri = 3;</code>
   *
   * @return The bytes for sourceUri.
   */
  com.google.protobuf.ByteString getSourceUriBytes();

  /**
   *
   *
   * <pre>
   * The default ad tag to use when no ad tag ids are specified in an ad break's
   * SCTE-35 message.
   * default_ad_tag_id is necessary when `adTagMap` has more than one key. Its
   * value must be present in the `adTagMap`.
   * </pre>
   *
   * <code>string default_ad_tag_id = 4;</code>
   *
   * @return The defaultAdTagId.
   */
  java.lang.String getDefaultAdTagId();
  /**
   *
   *
   * <pre>
   * The default ad tag to use when no ad tag ids are specified in an ad break's
   * SCTE-35 message.
   * default_ad_tag_id is necessary when `adTagMap` has more than one key. Its
   * value must be present in the `adTagMap`.
   * </pre>
   *
   * <code>string default_ad_tag_id = 4;</code>
   *
   * @return The bytes for defaultAdTagId.
   */
  com.google.protobuf.ByteString getDefaultAdTagIdBytes();

  /**
   *
   *
   * <pre>
   * Key value pairs for ad tags. Ads parsed from ad tags must be MP4 videos
   * each with at least one audio track.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.video.stitcher.v1.AdTag&gt; ad_tag_map = 5;</code>
   */
  int getAdTagMapCount();
  /**
   *
   *
   * <pre>
   * Key value pairs for ad tags. Ads parsed from ad tags must be MP4 videos
   * each with at least one audio track.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.video.stitcher.v1.AdTag&gt; ad_tag_map = 5;</code>
   */
  boolean containsAdTagMap(java.lang.String key);
  /** Use {@link #getAdTagMapMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.video.stitcher.v1.AdTag> getAdTagMap();
  /**
   *
   *
   * <pre>
   * Key value pairs for ad tags. Ads parsed from ad tags must be MP4 videos
   * each with at least one audio track.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.video.stitcher.v1.AdTag&gt; ad_tag_map = 5;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.video.stitcher.v1.AdTag> getAdTagMapMap();
  /**
   *
   *
   * <pre>
   * Key value pairs for ad tags. Ads parsed from ad tags must be MP4 videos
   * each with at least one audio track.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.video.stitcher.v1.AdTag&gt; ad_tag_map = 5;</code>
   */

  /* nullable */
  com.google.cloud.video.stitcher.v1.AdTag getAdTagMapOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.video.stitcher.v1.AdTag defaultValue);
  /**
   *
   *
   * <pre>
   * Key value pairs for ad tags. Ads parsed from ad tags must be MP4 videos
   * each with at least one audio track.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.video.stitcher.v1.AdTag&gt; ad_tag_map = 5;</code>
   */
  com.google.cloud.video.stitcher.v1.AdTag getAdTagMapOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Key value pairs for ad tag macro replacement. If the
   * specified ad tag URI has macros, this field provides the mapping
   * to the value that will replace the macro in the ad tag URI.
   * Macros are designated by square brackets.
   * For example:
   *   Ad tag URI: "https://doubleclick.google.com/ad/1?geo_id=[geoId]"
   *   Ad tag macros: `{"geoId": "123"}`
   *   Fully qualified ad tag:
   *   `"https://doubleclick.google.com/ad/1?geo_id=123"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; ad_tag_macros = 6;</code>
   */
  int getAdTagMacrosCount();
  /**
   *
   *
   * <pre>
   * Key value pairs for ad tag macro replacement. If the
   * specified ad tag URI has macros, this field provides the mapping
   * to the value that will replace the macro in the ad tag URI.
   * Macros are designated by square brackets.
   * For example:
   *   Ad tag URI: "https://doubleclick.google.com/ad/1?geo_id=[geoId]"
   *   Ad tag macros: `{"geoId": "123"}`
   *   Fully qualified ad tag:
   *   `"https://doubleclick.google.com/ad/1?geo_id=123"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; ad_tag_macros = 6;</code>
   */
  boolean containsAdTagMacros(java.lang.String key);
  /** Use {@link #getAdTagMacrosMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAdTagMacros();
  /**
   *
   *
   * <pre>
   * Key value pairs for ad tag macro replacement. If the
   * specified ad tag URI has macros, this field provides the mapping
   * to the value that will replace the macro in the ad tag URI.
   * Macros are designated by square brackets.
   * For example:
   *   Ad tag URI: "https://doubleclick.google.com/ad/1?geo_id=[geoId]"
   *   Ad tag macros: `{"geoId": "123"}`
   *   Fully qualified ad tag:
   *   `"https://doubleclick.google.com/ad/1?geo_id=123"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; ad_tag_macros = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAdTagMacrosMap();
  /**
   *
   *
   * <pre>
   * Key value pairs for ad tag macro replacement. If the
   * specified ad tag URI has macros, this field provides the mapping
   * to the value that will replace the macro in the ad tag URI.
   * Macros are designated by square brackets.
   * For example:
   *   Ad tag URI: "https://doubleclick.google.com/ad/1?geo_id=[geoId]"
   *   Ad tag macros: `{"geoId": "123"}`
   *   Fully qualified ad tag:
   *   `"https://doubleclick.google.com/ad/1?geo_id=123"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; ad_tag_macros = 6;</code>
   */

  /* nullable */
  java.lang.String getAdTagMacrosOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Key value pairs for ad tag macro replacement. If the
   * specified ad tag URI has macros, this field provides the mapping
   * to the value that will replace the macro in the ad tag URI.
   * Macros are designated by square brackets.
   * For example:
   *   Ad tag URI: "https://doubleclick.google.com/ad/1?geo_id=[geoId]"
   *   Ad tag macros: `{"geoId": "123"}`
   *   Fully qualified ad tag:
   *   `"https://doubleclick.google.com/ad/1?geo_id=123"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; ad_tag_macros = 6;</code>
   */
  java.lang.String getAdTagMacrosOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Whether client side ad tracking is enabled. If enabled, the client player
   * is expected to trigger playback and activity events itself. Otherwise,
   * server side ad tracking is enabled and the Video Stitcher API will trigger
   * playback events on behalf of the client player.
   * </pre>
   *
   * <code>bool client_ad_tracking = 7;</code>
   *
   * @return The clientAdTracking.
   */
  boolean getClientAdTracking();

  /**
   *
   *
   * <pre>
   * The default slate to use when no slates are specified in an ad break's
   * SCTE-35 message. When specified, this value must match the ID for a slate
   * that has already been created via the
   * [CreateSlate](projects.locations.slates/create) method.
   * </pre>
   *
   * <code>string default_slate_id = 8;</code>
   *
   * @return The defaultSlateId.
   */
  java.lang.String getDefaultSlateId();
  /**
   *
   *
   * <pre>
   * The default slate to use when no slates are specified in an ad break's
   * SCTE-35 message. When specified, this value must match the ID for a slate
   * that has already been created via the
   * [CreateSlate](projects.locations.slates/create) method.
   * </pre>
   *
   * <code>string default_slate_id = 8;</code>
   *
   * @return The bytes for defaultSlateId.
   */
  com.google.protobuf.ByteString getDefaultSlateIdBytes();

  /**
   *
   *
   * <pre>
   * Defines the stitcher behavior in case an ad does not align exactly with
   * the ad break boundaries. If not specified, the default is `COMPLETE_AD`.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.LiveSession.StitchingPolicy stitching_policy = 9;</code>
   *
   * @return The enum numeric value on the wire for stitchingPolicy.
   */
  int getStitchingPolicyValue();
  /**
   *
   *
   * <pre>
   * Defines the stitcher behavior in case an ad does not align exactly with
   * the ad break boundaries. If not specified, the default is `COMPLETE_AD`.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.LiveSession.StitchingPolicy stitching_policy = 9;</code>
   *
   * @return The stitchingPolicy.
   */
  com.google.cloud.video.stitcher.v1.LiveSession.StitchingPolicy getStitchingPolicy();

  /**
   *
   *
   * <pre>
   * Additional options that affect the output of the manifest.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.ManifestOptions manifest_options = 10;</code>
   *
   * @return Whether the manifestOptions field is set.
   */
  boolean hasManifestOptions();
  /**
   *
   *
   * <pre>
   * Additional options that affect the output of the manifest.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.ManifestOptions manifest_options = 10;</code>
   *
   * @return The manifestOptions.
   */
  com.google.cloud.video.stitcher.v1.ManifestOptions getManifestOptions();
  /**
   *
   *
   * <pre>
   * Additional options that affect the output of the manifest.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.ManifestOptions manifest_options = 10;</code>
   */
  com.google.cloud.video.stitcher.v1.ManifestOptionsOrBuilder getManifestOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The generated ID of the LiveSession's source stream.
   * </pre>
   *
   * <code>string stream_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The streamId.
   */
  java.lang.String getStreamId();
  /**
   *
   *
   * <pre>
   * Output only. The generated ID of the LiveSession's source stream.
   * </pre>
   *
   * <code>string stream_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for streamId.
   */
  com.google.protobuf.ByteString getStreamIdBytes();
}
