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

package com.google.cloud.websecurityscanner.v1.samples;

// [START websecurityscanner_v1_generated_websecurityscannerclient_getscanrun_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.websecurityscanner.v1.GetScanRunRequest;
import com.google.cloud.websecurityscanner.v1.ScanRun;
import com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient;

public class AsyncGetScanRun {

  public static void main(String[] args) throws Exception {
    asyncGetScanRun();
  }

  public static void asyncGetScanRun() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      GetScanRunRequest request = GetScanRunRequest.newBuilder().setName("name3373707").build();
      ApiFuture<ScanRun> future = webSecurityScannerClient.getScanRunCallable().futureCall(request);
      // Do something.
      ScanRun response = future.get();
    }
  }
}
// [END websecurityscanner_v1_generated_websecurityscannerclient_getscanrun_async]
