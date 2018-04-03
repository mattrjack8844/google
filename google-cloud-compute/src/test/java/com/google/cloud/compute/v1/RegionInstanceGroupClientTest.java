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
package com.google.cloud.compute.v1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import static com.google.cloud.compute.v1.RegionInstanceGroupClient.ListInstancesRegionInstanceGroupsPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupClient.ListRegionInstanceGroupsPagedResponse;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub.getRegionInstanceGroupMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub.listInstancesRegionInstanceGroupsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub.listRegionInstanceGroupsMethodDescriptor;
import static com.google.cloud.compute.v1.stub.HttpJsonRegionInstanceGroupStub.setNamedPortsRegionInstanceGroupMethodDescriptor;
import com.google.cloud.compute.v1.stub.RegionInstanceGroupStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class RegionInstanceGroupClientTest {

   private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS = ImmutableList.copyOf(
        Lists.<ApiMethodDescriptor>newArrayList(
          getRegionInstanceGroupMethodDescriptor,
          listRegionInstanceGroupsMethodDescriptor,
          listInstancesRegionInstanceGroupsMethodDescriptor,
          setNamedPortsRegionInstanceGroupMethodDescriptor
        ));
  private static final MockHttpService mockService
      = new MockHttpService(METHOD_DESCRIPTORS, RegionInstanceGroupStubSettings.getDefaultEndpoint());

  private static RegionInstanceGroupClient client;
  private static RegionInstanceGroupSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        RegionInstanceGroupSettings.newBuilder()
           .setTransportChannelProvider(
               RegionInstanceGroupSettings.defaultHttpJsonTransportProviderBuilder()
                   .setHttpTransport(mockService).build())
           .setCredentialsProvider(NoCredentialsProvider.create())
           .build();
    client =
       RegionInstanceGroupClient.create(clientSettings);
  }

  @After
  public void cleanUp() {
    mockService.reset();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionInstanceGroupTest() {
    String kind = "kind3292052";
    String description = "description-1724546052";
    ProjectNetworkName network = ProjectNetworkName.of("[PROJECT]", "[NETWORK]");
    String selfLink = "selfLink-1691268851";
    Integer size = 3530753;
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    ProjectRegionSubnetworkName subnetwork = ProjectRegionSubnetworkName.of("[PROJECT]", "[REGION]", "[SUBNETWORK]");
    String creationTimestamp = "creationTimestamp567396278";
    String fingerprint = "fingerprint-1375934236";
    String name = "name3373707";
    String id = "id3355";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    InstanceGroup expectedResponse = InstanceGroup.newBuilder()
      .setKind(kind)
      .setDescription(description)
      .setNetwork(network.toString())
      .setSelfLink(selfLink)
      .setSize(size)
      .setZone(zone.toString())
      .setSubnetwork(subnetwork.toString())
      .setCreationTimestamp(creationTimestamp)
      .setFingerprint(fingerprint)
      .setName(name)
      .setId(id)
      .setRegion(region.toString())
      .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");

    InstanceGroup actualResponse =
        client.getRegionInstanceGroup(instanceGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void getRegionInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");

      client.getRegionInstanceGroup(instanceGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstanceGroup itemsElement = InstanceGroup.newBuilder().build();
    List<InstanceGroup> items = Arrays.asList(itemsElement);
    RegionInstanceGroupList expectedResponse = RegionInstanceGroupList.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

    ListRegionInstanceGroupsPagedResponse pagedListResponse = client.listRegionInstanceGroups(region);

    List<InstanceGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0),
        resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void listRegionInstanceGroupsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");

      client.listRegionInstanceGroups(region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesRegionInstanceGroupsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    String id = "id3355";
    String selfLink = "selfLink-1691268851";
    InstanceWithNamedPorts itemsElement = InstanceWithNamedPorts.newBuilder().build();
    List<InstanceWithNamedPorts> items = Arrays.asList(itemsElement);
    RegionInstanceGroupsListInstances expectedResponse = RegionInstanceGroupsListInstances.newBuilder()
      .setKind(kind)
      .setNextPageToken(nextPageToken)
      .setId(id)
      .setSelfLink(selfLink)
      .addAllItems(items)
      .build();
    mockService.addResponse(expectedResponse);

    ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
    RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequestResource = RegionInstanceGroupsListInstancesRequest.newBuilder().build();

    ListInstancesRegionInstanceGroupsPagedResponse pagedListResponse = client.listInstancesRegionInstanceGroups(instanceGroup, regionInstanceGroupsListInstancesRequestResource);

    List<InstanceWithNamedPorts> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0),
        resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesRegionInstanceGroupsExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
      RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequestResource = RegionInstanceGroupsListInstancesRequest.newBuilder().build();

      client.listInstancesRegionInstanceGroups(instanceGroup, regionInstanceGroupsListInstancesRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsRegionInstanceGroupTest() {
    String httpErrorMessage = "httpErrorMessage1276263769";
    String targetId = "targetId-815576439";
    String kind = "kind3292052";
    String description = "description-1724546052";
    String statusMessage = "statusMessage-239442758";
    String selfLink = "selfLink-1691268851";
    String insertTime = "insertTime-103148397";
    Integer httpErrorStatusCode = 1386087020;
    ProjectZoneName zone = ProjectZoneName.of("[PROJECT]", "[ZONE]");
    String targetLink = "targetLink-2084812312";
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    Integer progress = 1001078227;
    String operationType = "operationType-1432962286";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    String id = "id3355";
    ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
    String clientOperationId = "clientOperationId-239630617";
    String user = "user3599307";
    String status = "status-892481550";
    Operation expectedResponse = Operation.newBuilder()
      .setHttpErrorMessage(httpErrorMessage)
      .setTargetId(targetId)
      .setKind(kind)
      .setDescription(description)
      .setStatusMessage(statusMessage)
      .setSelfLink(selfLink)
      .setInsertTime(insertTime)
      .setHttpErrorStatusCode(httpErrorStatusCode)
      .setZone(zone.toString())
      .setTargetLink(targetLink)
      .setCreationTimestamp(creationTimestamp)
      .setName(name)
      .setProgress(progress)
      .setOperationType(operationType)
      .setStartTime(startTime)
      .setEndTime(endTime)
      .setId(id)
      .setRegion(region.toString())
      .setClientOperationId(clientOperationId)
      .setUser(user)
      .setStatus(status)
      .build();
    mockService.addResponse(expectedResponse);

    String requestId = "requestId37109963";
    ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
    RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource = RegionInstanceGroupsSetNamedPortsRequest.newBuilder().build();

    Operation actualResponse =
        client.setNamedPortsRegionInstanceGroup(requestId, instanceGroup, regionInstanceGroupsSetNamedPortsRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey = mockService.getRequestHeaders()
        .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey()).iterator().next();
    Assert.assertTrue(GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
        .matcher(apiClientHeaderKey).matches());
  }

  @Test
  @SuppressWarnings("all")
  public void setNamedPortsRegionInstanceGroupExceptionTest() throws Exception {
    ApiException exception = ApiExceptionFactory.createException(new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String requestId = "requestId37109963";
      ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of("[PROJECT]", "[REGION]", "[INSTANCE_GROUP]");
      RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource = RegionInstanceGroupsSetNamedPortsRequest.newBuilder().build();

      client.setNamedPortsRegionInstanceGroup(requestId, instanceGroup, regionInstanceGroupsSetNamedPortsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

}