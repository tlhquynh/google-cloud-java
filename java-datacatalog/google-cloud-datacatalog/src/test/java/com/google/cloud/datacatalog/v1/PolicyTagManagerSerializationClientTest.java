/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.datacatalog.v1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class PolicyTagManagerSerializationClientTest {
  private static MockIAMPolicy mockIAMPolicy;
  private static MockPolicyTagManagerSerialization mockPolicyTagManagerSerialization;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private PolicyTagManagerSerializationClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockPolicyTagManagerSerialization = new MockPolicyTagManagerSerialization();
    mockIAMPolicy = new MockIAMPolicy();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockPolicyTagManagerSerialization, mockIAMPolicy));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    PolicyTagManagerSerializationSettings settings =
        PolicyTagManagerSerializationSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = PolicyTagManagerSerializationClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void replaceTaxonomyTest() throws Exception {
    Taxonomy expectedResponse =
        Taxonomy.newBuilder()
            .setName(TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setPolicyTagCount(1074340189)
            .setTaxonomyTimestamps(SystemTimestamps.newBuilder().build())
            .addAllActivatedPolicyTypes(new ArrayList<Taxonomy.PolicyType>())
            .setService(Taxonomy.Service.newBuilder().build())
            .build();
    mockPolicyTagManagerSerialization.addResponse(expectedResponse);

    ReplaceTaxonomyRequest request =
        ReplaceTaxonomyRequest.newBuilder()
            .setName(TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]").toString())
            .setSerializedTaxonomy(SerializedTaxonomy.newBuilder().build())
            .build();

    Taxonomy actualResponse = client.replaceTaxonomy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPolicyTagManagerSerialization.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ReplaceTaxonomyRequest actualRequest = ((ReplaceTaxonomyRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertEquals(request.getSerializedTaxonomy(), actualRequest.getSerializedTaxonomy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void replaceTaxonomyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPolicyTagManagerSerialization.addException(exception);

    try {
      ReplaceTaxonomyRequest request =
          ReplaceTaxonomyRequest.newBuilder()
              .setName(TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]").toString())
              .setSerializedTaxonomy(SerializedTaxonomy.newBuilder().build())
              .build();
      client.replaceTaxonomy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void importTaxonomiesTest() throws Exception {
    ImportTaxonomiesResponse expectedResponse =
        ImportTaxonomiesResponse.newBuilder().addAllTaxonomies(new ArrayList<Taxonomy>()).build();
    mockPolicyTagManagerSerialization.addResponse(expectedResponse);

    ImportTaxonomiesRequest request =
        ImportTaxonomiesRequest.newBuilder()
            .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
            .build();

    ImportTaxonomiesResponse actualResponse = client.importTaxonomies(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPolicyTagManagerSerialization.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportTaxonomiesRequest actualRequest = ((ImportTaxonomiesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getInlineSource(), actualRequest.getInlineSource());
    Assert.assertEquals(request.getCrossRegionalSource(), actualRequest.getCrossRegionalSource());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importTaxonomiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPolicyTagManagerSerialization.addException(exception);

    try {
      ImportTaxonomiesRequest request =
          ImportTaxonomiesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .build();
      client.importTaxonomies(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void exportTaxonomiesTest() throws Exception {
    ExportTaxonomiesResponse expectedResponse =
        ExportTaxonomiesResponse.newBuilder()
            .addAllTaxonomies(new ArrayList<SerializedTaxonomy>())
            .build();
    mockPolicyTagManagerSerialization.addResponse(expectedResponse);

    ExportTaxonomiesRequest request =
        ExportTaxonomiesRequest.newBuilder()
            .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
            .addAllTaxonomies(new ArrayList<String>())
            .build();

    ExportTaxonomiesResponse actualResponse = client.exportTaxonomies(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPolicyTagManagerSerialization.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportTaxonomiesRequest actualRequest = ((ExportTaxonomiesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getTaxonomiesList(), actualRequest.getTaxonomiesList());
    Assert.assertEquals(request.getSerializedTaxonomies(), actualRequest.getSerializedTaxonomies());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportTaxonomiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPolicyTagManagerSerialization.addException(exception);

    try {
      ExportTaxonomiesRequest request =
          ExportTaxonomiesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .addAllTaxonomies(new ArrayList<String>())
              .build();
      client.exportTaxonomies(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
