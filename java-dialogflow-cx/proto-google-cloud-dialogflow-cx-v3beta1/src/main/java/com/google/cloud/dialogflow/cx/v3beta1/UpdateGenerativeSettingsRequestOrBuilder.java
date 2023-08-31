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
// source: google/cloud/dialogflow/cx/v3beta1/agent.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface UpdateGenerativeSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.UpdateGenerativeSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Generative settings to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.GenerativeSettings generative_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the generativeSettings field is set.
   */
  boolean hasGenerativeSettings();
  /**
   *
   *
   * <pre>
   * Required. Generative settings to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.GenerativeSettings generative_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The generativeSettings.
   */
  com.google.cloud.dialogflow.cx.v3beta1.GenerativeSettings getGenerativeSettings();
  /**
   *
   *
   * <pre>
   * Required. Generative settings to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.GenerativeSettings generative_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.GenerativeSettingsOrBuilder
      getGenerativeSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
