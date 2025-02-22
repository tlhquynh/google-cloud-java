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
// source: google/cloud/support/v2/attachment_service.proto

package com.google.cloud.support.v2;

public final class AttachmentServiceProto {
  private AttachmentServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_support_v2_ListAttachmentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_support_v2_ListAttachmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_support_v2_ListAttachmentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_support_v2_ListAttachmentsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/support/v2/attachment_ser"
          + "vice.proto\022\027google.cloud.support.v2\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032(google/c"
          + "loud/support/v2/attachment.proto\"z\n\026List"
          + "AttachmentsRequest\0229\n\006parent\030\001 \001(\tB)\342A\001\002"
          + "\372A\"\n cloudsupport.googleapis.com/Case\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"l\n\027"
          + "ListAttachmentsResponse\0228\n\013attachments\030\001"
          + " \003(\0132#.google.cloud.support.v2.Attachmen"
          + "t\022\027\n\017next_page_token\030\002 \001(\t2\321\002\n\025CaseAttac"
          + "hmentService\022\346\001\n\017ListAttachments\022/.googl"
          + "e.cloud.support.v2.ListAttachmentsReques"
          + "t\0320.google.cloud.support.v2.ListAttachme"
          + "ntsResponse\"p\332A\006parent\202\323\344\223\002a\022+/v2/{paren"
          + "t=projects/*/cases/*}/attachmentsZ2\0220/v2"
          + "/{parent=organizations/*/cases/*}/attach"
          + "ments\032O\312A\033cloudsupport.googleapis.com\322A."
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atformB\277\001\n\033com.google.cloud.support.v2B\026"
          + "AttachmentServiceProtoP\001Z5cloud.google.c"
          + "om/go/support/apiv2/supportpb;supportpb\252"
          + "\002\027Google.Cloud.Support.V2\312\002\027Google\\Cloud"
          + "\\Support\\V2\352\002\032Google::Cloud::Support::V2"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.support.v2.AttachmentProto.getDescriptor(),
            });
    internal_static_google_cloud_support_v2_ListAttachmentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_support_v2_ListAttachmentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_support_v2_ListAttachmentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_support_v2_ListAttachmentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_support_v2_ListAttachmentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_support_v2_ListAttachmentsResponse_descriptor,
            new java.lang.String[] {
              "Attachments", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.support.v2.AttachmentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
