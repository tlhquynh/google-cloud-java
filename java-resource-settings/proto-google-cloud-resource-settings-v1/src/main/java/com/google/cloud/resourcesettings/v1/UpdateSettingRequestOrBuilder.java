/*
 * Copyright 2023 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcesettings/v1/resource_settings.proto

package com.google.cloud.resourcesettings.v1;

public interface UpdateSettingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcesettings.v1.UpdateSettingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the setting field is set.
   */
  boolean hasSetting();
  /**
   *
   *
   * <pre>
   * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The setting.
   */
  com.google.cloud.resourcesettings.v1.Setting getSetting();
  /**
   *
   *
   * <pre>
   * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.resourcesettings.v1.SettingOrBuilder getSettingOrBuilder();
}
