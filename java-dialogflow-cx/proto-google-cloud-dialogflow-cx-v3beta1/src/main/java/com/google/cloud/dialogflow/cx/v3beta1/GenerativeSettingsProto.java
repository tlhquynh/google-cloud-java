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
// source: google/cloud/dialogflow/cx/v3beta1/generative_settings.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class GenerativeSettingsProto {
  private GenerativeSettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_PromptTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_PromptTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_KnowledgeConnectorSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_KnowledgeConnectorSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/dialogflow/cx/v3beta1/gen"
          + "erative_settings.proto\022\"google.cloud.dia"
          + "logflow.cx.v3beta1\032\031google/api/resource."
          + "proto\0328google/cloud/dialogflow/cx/v3beta"
          + "1/safety_settings.proto\"\352\006\n\022GenerativeSe"
          + "ttings\022\014\n\004name\030\005 \001(\t\022b\n\021fallback_setting"
          + "s\030\001 \001(\0132G.google.cloud.dialogflow.cx.v3b"
          + "eta1.GenerativeSettings.FallbackSettings"
          + "\022V\n\032generative_safety_settings\030\003 \001(\01322.g"
          + "oogle.cloud.dialogflow.cx.v3beta1.Safety"
          + "Settings\022w\n\034knowledge_connector_settings"
          + "\030\007 \001(\0132Q.google.cloud.dialogflow.cx.v3be"
          + "ta1.GenerativeSettings.KnowledgeConnecto"
          + "rSettings\022\025\n\rlanguage_code\030\004 \001(\t\032\352\001\n\020Fal"
          + "lbackSettings\022\027\n\017selected_prompt\030\003 \001(\t\022p"
          + "\n\020prompt_templates\030\004 \003(\0132V.google.cloud."
          + "dialogflow.cx.v3beta1.GenerativeSettings"
          + ".FallbackSettings.PromptTemplate\032K\n\016Prom"
          + "ptTemplate\022\024\n\014display_name\030\001 \001(\t\022\023\n\013prom"
          + "pt_text\030\002 \001(\t\022\016\n\006frozen\030\003 \001(\010\032\210\001\n\032Knowle"
          + "dgeConnectorSettings\022\020\n\010business\030\001 \001(\t\022\r"
          + "\n\005agent\030\002 \001(\t\022\026\n\016agent_identity\030\003 \001(\t\022\034\n"
          + "\024business_description\030\004 \001(\t\022\023\n\013agent_sco"
          + "pe\030\005 \001(\t:\201\001\352A~\n1dialogflow.googleapis.co"
          + "m/AgentGenerativeSettings\022Iprojects/{pro"
          + "ject}/locations/{location}/agents/{agent"
          + "}/generativeSettingsB\321\001\n&com.google.clou"
          + "d.dialogflow.cx.v3beta1B\027GenerativeSetti"
          + "ngsProtoP\001Z6cloud.google.com/go/dialogfl"
          + "ow/cx/apiv3beta1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Goo"
          + "gle.Cloud.Dialogflow.Cx.V3Beta1\352\002&Google"
          + "::Cloud::Dialogflow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.SafetySettingsProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_descriptor,
            new java.lang.String[] {
              "Name",
              "FallbackSettings",
              "GenerativeSafetySettings",
              "KnowledgeConnectorSettings",
              "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_descriptor,
            new java.lang.String[] {
              "SelectedPrompt", "PromptTemplates",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_PromptTemplate_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_PromptTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_FallbackSettings_PromptTemplate_descriptor,
            new java.lang.String[] {
              "DisplayName", "PromptText", "Frozen",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_KnowledgeConnectorSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_KnowledgeConnectorSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GenerativeSettings_KnowledgeConnectorSettings_descriptor,
            new java.lang.String[] {
              "Business", "Agent", "AgentIdentity", "BusinessDescription", "AgentScope",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.SafetySettingsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
