/*
 * Copyright 2018 Google LLC
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
package com.google.cloud.compute.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest;
import com.google.cloud.compute.v1.DeleteInterconnectAttachmentHttpRequest;
import com.google.cloud.compute.v1.GetInterconnectAttachmentHttpRequest;
import com.google.cloud.compute.v1.InsertInterconnectAttachmentHttpRequest;
import com.google.cloud.compute.v1.InterconnectAttachment;
import com.google.cloud.compute.v1.InterconnectAttachmentAggregatedList;
import static com.google.cloud.compute.v1.InterconnectAttachmentClient.AggregatedListInterconnectAttachmentsPagedResponse;
import static com.google.cloud.compute.v1.InterconnectAttachmentClient.ListInterconnectAttachmentsPagedResponse;
import com.google.cloud.compute.v1.InterconnectAttachmentList;
import com.google.cloud.compute.v1.InterconnectAttachmentsScopedList;
import com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName;
import com.google.cloud.compute.v1.ProjectRegionName;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class InterconnectAttachmentStub implements BackgroundResource {


  @BetaApi
  public UnaryCallable<AggregatedListInterconnectAttachmentsHttpRequest, AggregatedListInterconnectAttachmentsPagedResponse> aggregatedListInterconnectAttachmentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListInterconnectAttachmentsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListInterconnectAttachmentsHttpRequest, InterconnectAttachmentAggregatedList> aggregatedListInterconnectAttachmentsCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListInterconnectAttachmentsCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteInterconnectAttachmentHttpRequest, Operation> deleteInterconnectAttachmentCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInterconnectAttachmentCallable()");
  }

  @BetaApi
  public UnaryCallable<GetInterconnectAttachmentHttpRequest, InterconnectAttachment> getInterconnectAttachmentCallable() {
    throw new UnsupportedOperationException("Not implemented: getInterconnectAttachmentCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertInterconnectAttachmentHttpRequest, Operation> insertInterconnectAttachmentCallable() {
    throw new UnsupportedOperationException("Not implemented: insertInterconnectAttachmentCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInterconnectAttachmentsHttpRequest, ListInterconnectAttachmentsPagedResponse> listInterconnectAttachmentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInterconnectAttachmentsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInterconnectAttachmentsHttpRequest, InterconnectAttachmentList> listInterconnectAttachmentsCallable() {
    throw new UnsupportedOperationException("Not implemented: listInterconnectAttachmentsCallable()");
  }

}