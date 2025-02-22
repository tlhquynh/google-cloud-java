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
// source: google/cloud/discoveryengine/v1alpha/conversation.proto

package com.google.cloud.discoveryengine.v1alpha;

public final class ConversationProto {
  private ConversationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Conversation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Conversation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Reply_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Reply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Reply_Reference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Reply_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_TextInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_TextInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ConversationMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ConversationMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/discoveryengine/v1alpha/c"
          + "onversation.proto\022$google.cloud.discover"
          + "yengine.v1alpha\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\0329goo"
          + "gle/cloud/discoveryengine/v1alpha/search"
          + "_service.proto\032\037google/protobuf/timestam"
          + "p.proto\"\203\005\n\014Conversation\022\022\n\004name\030\001 \001(\tB\004"
          + "\342A\001\005\022G\n\005state\030\002 \001(\01628.google.cloud.disco"
          + "veryengine.v1alpha.Conversation.State\022\026\n"
          + "\016user_pseudo_id\030\003 \001(\t\022K\n\010messages\030\004 \003(\0132"
          + "9.google.cloud.discoveryengine.v1alpha.C"
          + "onversationMessage\0224\n\nstart_time\030\005 \001(\0132\032"
          + ".google.protobuf.TimestampB\004\342A\001\003\0222\n\010end_"
          + "time\030\006 \001(\0132\032.google.protobuf.TimestampB\004"
          + "\342A\001\003\">\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\017\n\013"
          + "IN_PROGRESS\020\001\022\r\n\tCOMPLETED\020\002:\206\002\352A\202\002\n+dis"
          + "coveryengine.googleapis.com/Conversation"
          + "\022\\projects/{project}/locations/{location"
          + "}/dataStores/{data_store}/conversations/"
          + "{conversation}\022uprojects/{project}/locat"
          + "ions/{location}/collections/{collection}"
          + "/dataStores/{data_store}/conversations/{"
          + "conversation}\"\207\002\n\005Reply\022\021\n\005reply\030\001 \001(\tB\002"
          + "\030\001\022M\n\nreferences\030\002 \003(\01325.google.cloud.di"
          + "scoveryengine.v1alpha.Reply.ReferenceB\002\030"
          + "\001\022M\n\007summary\030\003 \001(\0132<.google.cloud.discov"
          + "eryengine.v1alpha.SearchResponse.Summary"
          + "\032M\n\tReference\022\013\n\003uri\030\001 \001(\t\022\023\n\013anchor_tex"
          + "t\030\002 \001(\t\022\r\n\005start\030\003 \001(\005\022\013\n\003end\030\004 \001(\005:\002\030\001\""
          + "I\n\023ConversationContext\022\031\n\021context_docume"
          + "nts\030\001 \003(\t\022\027\n\017active_document\030\002 \001(\t\"f\n\tTe"
          + "xtInput\022\r\n\005input\030\001 \001(\t\022J\n\007context\030\002 \001(\0132"
          + "9.google.cloud.discoveryengine.v1alpha.C"
          + "onversationContext\"\334\001\n\023ConversationMessa"
          + "ge\022E\n\nuser_input\030\001 \001(\0132/.google.cloud.di"
          + "scoveryengine.v1alpha.TextInputH\000\022<\n\005rep"
          + "ly\030\002 \001(\0132+.google.cloud.discoveryengine."
          + "v1alpha.ReplyH\000\0225\n\013create_time\030\003 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\004\342A\001\003B\t\n\007messag"
          + "eB\235\002\n(com.google.cloud.discoveryengine.v"
          + "1alphaB\021ConversationProtoP\001ZRcloud.googl"
          + "e.com/go/discoveryengine/apiv1alpha/disc"
          + "overyenginepb;discoveryenginepb\242\002\017DISCOV"
          + "ERYENGINE\252\002$Google.Cloud.DiscoveryEngine"
          + ".V1Alpha\312\002$Google\\Cloud\\DiscoveryEngine\\"
          + "V1alpha\352\002\'Google::Cloud::DiscoveryEngine"
          + "::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.SearchServiceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Conversation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Conversation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Conversation_descriptor,
            new java.lang.String[] {
              "Name", "State", "UserPseudoId", "Messages", "StartTime", "EndTime",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Reply_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Reply_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Reply_descriptor,
            new java.lang.String[] {
              "Reply", "References", "Summary",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Reply_Reference_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Reply_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Reply_Reference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Reply_Reference_descriptor,
            new java.lang.String[] {
              "Uri", "AnchorText", "Start", "End",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_descriptor,
            new java.lang.String[] {
              "ContextDocuments", "ActiveDocument",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_TextInput_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_TextInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_TextInput_descriptor,
            new java.lang.String[] {
              "Input", "Context",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ConversationMessage_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_ConversationMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ConversationMessage_descriptor,
            new java.lang.String[] {
              "UserInput", "Reply", "CreateTime", "Message",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.SearchServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
