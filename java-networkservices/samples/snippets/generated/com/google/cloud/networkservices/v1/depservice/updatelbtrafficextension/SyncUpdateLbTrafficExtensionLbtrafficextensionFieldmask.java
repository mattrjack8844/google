/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.networkservices.v1.samples;

// [START networkservices_v1_generated_DepService_UpdateLbTrafficExtension_LbtrafficextensionFieldmask_sync]
import com.google.cloud.networkservices.v1.DepServiceClient;
import com.google.cloud.networkservices.v1.LbTrafficExtension;
import com.google.protobuf.FieldMask;

public class SyncUpdateLbTrafficExtensionLbtrafficextensionFieldmask {

  public static void main(String[] args) throws Exception {
    syncUpdateLbTrafficExtensionLbtrafficextensionFieldmask();
  }

  public static void syncUpdateLbTrafficExtensionLbtrafficextensionFieldmask() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DepServiceClient depServiceClient = DepServiceClient.create()) {
      LbTrafficExtension lbTrafficExtension = LbTrafficExtension.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      LbTrafficExtension response =
          depServiceClient.updateLbTrafficExtensionAsync(lbTrafficExtension, updateMask).get();
    }
  }
}
// [END networkservices_v1_generated_DepService_UpdateLbTrafficExtension_LbtrafficextensionFieldmask_sync]
