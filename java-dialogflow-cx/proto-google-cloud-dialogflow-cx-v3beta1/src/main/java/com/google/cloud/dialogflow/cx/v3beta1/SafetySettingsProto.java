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
// source: google/cloud/dialogflow/cx/v3beta1/safety_settings.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class SafetySettingsProto {
  private SafetySettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_Phrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_Phrase_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/dialogflow/cx/v3beta1/saf"
          + "ety_settings.proto\022\"google.cloud.dialogf"
          + "low.cx.v3beta1\032\037google/api/field_behavio"
          + "r.proto\"\236\001\n\016SafetySettings\022Q\n\016banned_phr"
          + "ases\030\001 \003(\01329.google.cloud.dialogflow.cx."
          + "v3beta1.SafetySettings.Phrase\0329\n\006Phrase\022"
          + "\022\n\004text\030\001 \001(\tB\004\342A\001\002\022\033\n\rlanguage_code\030\002 \001"
          + "(\tB\004\342A\001\002B\244\001\n&com.google.cloud.dialogflow"
          + ".cx.v3beta1B\023SafetySettingsProtoP\001Z6clou"
          + "d.google.com/go/dialogflow/cx/apiv3beta1"
          + "/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialog"
          + "flow.Cx.V3Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_descriptor,
            new java.lang.String[] {
              "BannedPhrases",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_Phrase_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_Phrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SafetySettings_Phrase_descriptor,
            new java.lang.String[] {
              "Text", "LanguageCode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
