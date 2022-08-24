/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.websecurityscanner.v1beta.samples;

// [START websecurityscanner_v1beta_generated_websecurityscannerclient_listscanruns_paged_async]
import com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest;
import com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse;
import com.google.cloud.websecurityscanner.v1beta.ScanConfigName;
import com.google.cloud.websecurityscanner.v1beta.ScanRun;
import com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient;
import com.google.common.base.Strings;

public class AsyncListScanRunsPaged {

  public static void main(String[] args) throws Exception {
    asyncListScanRunsPaged();
  }

  public static void asyncListScanRunsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      ListScanRunsRequest request =
          ListScanRunsRequest.newBuilder()
              .setParent(ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]").toString())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      while (true) {
        ListScanRunsResponse response =
            webSecurityScannerClient.listScanRunsCallable().call(request);
        for (ScanRun element : response.getScanRunsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END websecurityscanner_v1beta_generated_websecurityscannerclient_listscanruns_paged_async]
