/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.storage.buckets;

// [START storage_add_bucket_iam_member]
import com.google.cloud.Binding;
import com.google.cloud.Policy;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddBucketIamMember {
  /** Example of adding a member to the Bucket-level IAM */
  public static void addBucketIamMember(String projectId, String bucketName) {
    // The ID of your GCP project
    // String projectId = "your-project-id";

    // The ID of your GCS bucket
    // String bucketName = "your-unique-bucket-name";

    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();

    int policyVersion = 3;
    Policy originalPolicy =
        storage.getIamPolicy(
            bucketName, Storage.BucketSourceOption.requestedPolicyVersion(policyVersion));

    String role = "roles/storage.objectViewer";
    String member = "group:example@google.com";

    // Get policy bindings list as a mutable ArrayList.
    List<Binding> bindings = new ArrayList(originalPolicy.getBindingsList());

    // Create a new binding using role and member
    Binding newBinding =
        Binding.newBuilder().setRole(role).setMembers(Arrays.asList(member)).build();
    bindings.add(newBinding);

    Policy updatedPolicy =
        storage.setIamPolicy(
            bucketName,
            originalPolicy.toBuilder().setBindings(bindings).setVersion(policyVersion).build());

    for (Binding binding : updatedPolicy.getBindingsList()) {
      boolean foundRole = binding.getRole().equals(role);
      boolean foundMember = binding.getMembers().contains(member);
      boolean bindingIsNotConditional = (binding.getCondition() == null);

      if (foundRole && foundMember && bindingIsNotConditional) {
        System.out.printf("Added %s with role %s to %s\n", member, role, bucketName);
      }
    }
  }
}
// [END storage_add_bucket_iam_member]
