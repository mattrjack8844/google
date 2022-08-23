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

package com.google.cloud.recaptchaenterprise.v1.samples;

// [START recaptchaenterprise_v1_generated_recaptchaenterpriseserviceclient_searchrelatedaccountgroupmemberships_paged_async]
import com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient;
import com.google.common.base.Strings;
import com.google.protobuf.ByteString;
import com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership;
import com.google.recaptchaenterprise.v1.RelatedAccountGroupName;
import com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest;
import com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsResponse;

public class AsyncSearchRelatedAccountGroupMembershipsPaged {

  public static void main(String[] args) throws Exception {
    asyncSearchRelatedAccountGroupMembershipsPaged();
  }

  public static void asyncSearchRelatedAccountGroupMembershipsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
        RecaptchaEnterpriseServiceClient.create()) {
      SearchRelatedAccountGroupMembershipsRequest request =
          SearchRelatedAccountGroupMembershipsRequest.newBuilder()
              .setProject(
                  RelatedAccountGroupName.of("[PROJECT]", "[RELATEDACCOUNTGROUP]").toString())
              .setHashedAccountId(ByteString.EMPTY)
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        SearchRelatedAccountGroupMembershipsResponse response =
            recaptchaEnterpriseServiceClient
                .searchRelatedAccountGroupMembershipsCallable()
                .call(request);
        for (RelatedAccountGroupMembership element :
            response.getRelatedAccountGroupMembershipsList()) {
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
// [END recaptchaenterprise_v1_generated_recaptchaenterpriseserviceclient_searchrelatedaccountgroupmemberships_paged_async]
