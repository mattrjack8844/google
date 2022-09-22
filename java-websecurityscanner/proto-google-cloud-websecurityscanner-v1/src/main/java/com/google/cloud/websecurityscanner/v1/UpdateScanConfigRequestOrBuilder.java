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
// source: google/cloud/websecurityscanner/v1/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1;

public interface UpdateScanConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1.UpdateScanConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be updated. The name field must be set to identify the
   * resource to be updated. The values of fields not covered by the mask
   * will be ignored.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.ScanConfig scan_config = 2;</code>
   *
   * @return Whether the scanConfig field is set.
   */
  boolean hasScanConfig();
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be updated. The name field must be set to identify the
   * resource to be updated. The values of fields not covered by the mask
   * will be ignored.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.ScanConfig scan_config = 2;</code>
   *
   * @return The scanConfig.
   */
  com.google.cloud.websecurityscanner.v1.ScanConfig getScanConfig();
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be updated. The name field must be set to identify the
   * resource to be updated. The values of fields not covered by the mask
   * will be ignored.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.ScanConfig scan_config = 2;</code>
   */
  com.google.cloud.websecurityscanner.v1.ScanConfigOrBuilder getScanConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
