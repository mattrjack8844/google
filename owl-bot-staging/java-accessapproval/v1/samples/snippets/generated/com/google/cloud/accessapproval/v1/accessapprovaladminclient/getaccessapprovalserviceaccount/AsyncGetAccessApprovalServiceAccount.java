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

package com.google.cloud.accessapproval.v1.samples;

// [START accessapproval_v1_generated_accessapprovaladminclient_getaccessapprovalserviceaccount_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.accessapproval.v1.AccessApprovalAdminClient;
import com.google.cloud.accessapproval.v1.AccessApprovalServiceAccount;
import com.google.cloud.accessapproval.v1.GetAccessApprovalServiceAccountMessage;

public class AsyncGetAccessApprovalServiceAccount {

  public static void main(String[] args) throws Exception {
    asyncGetAccessApprovalServiceAccount();
  }

  public static void asyncGetAccessApprovalServiceAccount() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AccessApprovalAdminClient accessApprovalAdminClient = AccessApprovalAdminClient.create()) {
      GetAccessApprovalServiceAccountMessage request =
          GetAccessApprovalServiceAccountMessage.newBuilder().setName("name3373707").build();
      ApiFuture<AccessApprovalServiceAccount> future =
          accessApprovalAdminClient.getAccessApprovalServiceAccountCallable().futureCall(request);
      // Do something.
      AccessApprovalServiceAccount response = future.get();
    }
  }
}
// [END accessapproval_v1_generated_accessapprovaladminclient_getaccessapprovalserviceaccount_async]
