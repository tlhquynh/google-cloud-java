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

package com.google.cloud.gaming.v1beta.samples;

// [START gameservices_v1beta_generated_RealmsService_ListRealms_sync]
import com.google.cloud.gaming.v1beta.ListRealmsRequest;
import com.google.cloud.gaming.v1beta.LocationName;
import com.google.cloud.gaming.v1beta.Realm;
import com.google.cloud.gaming.v1beta.RealmsServiceClient;

public class SyncListRealms {

  public static void main(String[] args) throws Exception {
    syncListRealms();
  }

  public static void syncListRealms() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
      ListRealmsRequest request =
          ListRealmsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      for (Realm element : realmsServiceClient.listRealms(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END gameservices_v1beta_generated_RealmsService_ListRealms_sync]
