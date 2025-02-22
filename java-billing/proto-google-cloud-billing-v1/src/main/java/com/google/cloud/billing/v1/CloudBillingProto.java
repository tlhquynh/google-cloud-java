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
// source: google/cloud/billing/v1/cloud_billing.proto

package com.google.cloud.billing.v1;

public final class CloudBillingProto {
  private CloudBillingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_BillingAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_BillingAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ProjectBillingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ProjectBillingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_GetBillingAccountRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_GetBillingAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ListBillingAccountsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ListBillingAccountsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ListBillingAccountsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ListBillingAccountsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ListProjectBillingInfoRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ListProjectBillingInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_ListProjectBillingInfoResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_ListProjectBillingInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_GetProjectBillingInfoRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_GetProjectBillingInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/billing/v1/cloud_billing."
          + "proto\022\027google.cloud.billing.v1\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\036google/iam/v1"
          + "/iam_policy.proto\032\032google/iam/v1/policy."
          + "proto\032 google/protobuf/field_mask.proto\""
          + "\235\001\n\016BillingAccount\022A\n\004name\030\001 \001(\tB3\342A\001\003\372A"
          + ",\n*cloudbilling.googleapis.com/BillingAc"
          + "count\022\022\n\004open\030\002 \001(\010B\004\342A\001\003\022\024\n\014display_nam"
          + "e\030\003 \001(\t\022\036\n\026master_billing_account\030\004 \001(\t\""
          + "\324\001\n\022ProjectBillingInfo\022\022\n\004name\030\001 \001(\tB\004\342A"
          + "\001\003\022\030\n\nproject_id\030\002 \001(\tB\004\342A\001\003\022\034\n\024billing_"
          + "account_name\030\003 \001(\t\022\035\n\017billing_enabled\030\004 "
          + "\001(\010B\004\342A\001\003:S\352AP\n.cloudbilling.googleapis."
          + "com/ProjectBillingInfo\022\036projects/{projec"
          + "t}/billingInfo\"]\n\030GetBillingAccountReque"
          + "st\022A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*cloudbilling."
          + "googleapis.com/BillingAccount\"S\n\032ListBil"
          + "lingAccountsRequest\022\021\n\tpage_size\030\001 \001(\005\022\022"
          + "\n\npage_token\030\002 \001(\t\022\016\n\006filter\030\003 \001(\t\"y\n\033Li"
          + "stBillingAccountsResponse\022A\n\020billing_acc"
          + "ounts\030\001 \003(\0132\'.google.cloud.billing.v1.Bi"
          + "llingAccount\022\027\n\017next_page_token\030\002 \001(\t\"e\n"
          + "\033CreateBillingAccountRequest\022F\n\017billing_"
          + "account\030\001 \001(\0132\'.google.cloud.billing.v1."
          + "BillingAccountB\004\342A\001\002\"\321\001\n\033UpdateBillingAc"
          + "countRequest\022A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*clo"
          + "udbilling.googleapis.com/BillingAccount\022"
          + ">\n\007account\030\002 \001(\0132\'.google.cloud.billing."
          + "v1.BillingAccountB\004\342A\001\002\022/\n\013update_mask\030\003"
          + " \001(\0132\032.google.protobuf.FieldMask\"\211\001\n\035Lis"
          + "tProjectBillingInfoRequest\022A\n\004name\030\001 \001(\t"
          + "B3\342A\001\002\372A,\n*cloudbilling.googleapis.com/B"
          + "illingAccount\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage"
          + "_token\030\003 \001(\t\"\204\001\n\036ListProjectBillingInfoR"
          + "esponse\022I\n\024project_billing_info\030\001 \003(\0132+."
          + "google.cloud.billing.v1.ProjectBillingIn"
          + "fo\022\027\n\017next_page_token\030\002 \001(\t\"b\n\034GetProjec"
          + "tBillingInfoRequest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372"
          + "A-\n+cloudresourcemanager.googleapis.com/"
          + "Project\"\200\001\n\037UpdateProjectBillingInfoRequ"
          + "est\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022I\n\024project_billi"
          + "ng_info\030\002 \001(\0132+.google.cloud.billing.v1."
          + "ProjectBillingInfo2\262\017\n\014CloudBilling\022\234\001\n\021"
          + "GetBillingAccount\0221.google.cloud.billing"
          + ".v1.GetBillingAccountRequest\032\'.google.cl"
          + "oud.billing.v1.BillingAccount\"+\332A\004name\202\323"
          + "\344\223\002\036\022\034/v1/{name=billingAccounts/*}\022\240\001\n\023L"
          + "istBillingAccounts\0223.google.cloud.billin"
          + "g.v1.ListBillingAccountsRequest\0324.google"
          + ".cloud.billing.v1.ListBillingAccountsRes"
          + "ponse\"\036\332A\000\202\323\344\223\002\025\022\023/v1/billingAccounts\022\263\001"
          + "\n\024UpdateBillingAccount\0224.google.cloud.bi"
          + "lling.v1.UpdateBillingAccountRequest\032\'.g"
          + "oogle.cloud.billing.v1.BillingAccount\"<\332"
          + "A\014name,account\202\323\344\223\002\'2\034/v1/{name=billingA"
          + "ccounts/*}:\007account\022\265\001\n\024CreateBillingAcc"
          + "ount\0224.google.cloud.billing.v1.CreateBil"
          + "lingAccountRequest\032\'.google.cloud.billin"
          + "g.v1.BillingAccount\">\332A\017billing_account\202"
          + "\323\344\223\002&\"\023/v1/billingAccounts:\017billing_acco"
          + "unt\022\277\001\n\026ListProjectBillingInfo\0226.google."
          + "cloud.billing.v1.ListProjectBillingInfoR"
          + "equest\0327.google.cloud.billing.v1.ListPro"
          + "jectBillingInfoResponse\"4\332A\004name\202\323\344\223\002\'\022%"
          + "/v1/{name=billingAccounts/*}/projects\022\255\001"
          + "\n\025GetProjectBillingInfo\0225.google.cloud.b"
          + "illing.v1.GetProjectBillingInfoRequest\032+"
          + ".google.cloud.billing.v1.ProjectBillingI"
          + "nfo\"0\332A\004name\202\323\344\223\002#\022!/v1/{name=projects/*"
          + "}/billingInfo\022\336\001\n\030UpdateProjectBillingIn"
          + "fo\0228.google.cloud.billing.v1.UpdateProje"
          + "ctBillingInfoRequest\032+.google.cloud.bill"
          + "ing.v1.ProjectBillingInfo\"[\332A\031name,proje"
          + "ct_billing_info\202\323\344\223\0029\032!/v1/{name=project"
          + "s/*}/billingInfo:\024project_billing_info\022\213"
          + "\001\n\014GetIamPolicy\022\".google.iam.v1.GetIamPo"
          + "licyRequest\032\025.google.iam.v1.Policy\"@\332A\010r"
          + "esource\202\323\344\223\002/\022-/v1/{resource=billingAcco"
          + "unts/*}:getIamPolicy\022\225\001\n\014SetIamPolicy\022\"."
          + "google.iam.v1.SetIamPolicyRequest\032\025.goog"
          + "le.iam.v1.Policy\"J\332A\017resource,policy\202\323\344\223"
          + "\0022\"-/v1/{resource=billingAccounts/*}:set"
          + "IamPolicy:\001*\022\300\001\n\022TestIamPermissions\022(.go"
          + "ogle.iam.v1.TestIamPermissionsRequest\032)."
          + "google.iam.v1.TestIamPermissionsResponse"
          + "\"U\332A\024resource,permissions\202\323\344\223\0028\"3/v1/{re"
          + "source=billingAccounts/*}:testIamPermiss"
          + "ions:\001*\032\265\001\312A\033cloudbilling.googleapis.com"
          + "\322A\223\001https://www.googleapis.com/auth/clou"
          + "d-billing,https://www.googleapis.com/aut"
          + "h/cloud-billing.readonly,https://www.goo"
          + "gleapis.com/auth/cloud-platformBi\n\033com.g"
          + "oogle.cloud.billing.v1B\021CloudBillingProt"
          + "oP\001Z5cloud.google.com/go/billing/apiv1/b"
          + "illingpb;billingpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_billing_v1_BillingAccount_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_billing_v1_BillingAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_BillingAccount_descriptor,
            new java.lang.String[] {
              "Name", "Open", "DisplayName", "MasterBillingAccount",
            });
    internal_static_google_cloud_billing_v1_ProjectBillingInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_billing_v1_ProjectBillingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ProjectBillingInfo_descriptor,
            new java.lang.String[] {
              "Name", "ProjectId", "BillingAccountName", "BillingEnabled",
            });
    internal_static_google_cloud_billing_v1_GetBillingAccountRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_billing_v1_GetBillingAccountRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_GetBillingAccountRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_billing_v1_ListBillingAccountsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_billing_v1_ListBillingAccountsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ListBillingAccountsRequest_descriptor,
            new java.lang.String[] {
              "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_billing_v1_ListBillingAccountsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_billing_v1_ListBillingAccountsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ListBillingAccountsResponse_descriptor,
            new java.lang.String[] {
              "BillingAccounts", "NextPageToken",
            });
    internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_descriptor,
            new java.lang.String[] {
              "BillingAccount",
            });
    internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_descriptor,
            new java.lang.String[] {
              "Name", "Account", "UpdateMask",
            });
    internal_static_google_cloud_billing_v1_ListProjectBillingInfoRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_billing_v1_ListProjectBillingInfoRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ListProjectBillingInfoRequest_descriptor,
            new java.lang.String[] {
              "Name", "PageSize", "PageToken",
            });
    internal_static_google_cloud_billing_v1_ListProjectBillingInfoResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_billing_v1_ListProjectBillingInfoResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_ListProjectBillingInfoResponse_descriptor,
            new java.lang.String[] {
              "ProjectBillingInfo", "NextPageToken",
            });
    internal_static_google_cloud_billing_v1_GetProjectBillingInfoRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_billing_v1_GetProjectBillingInfoRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_GetProjectBillingInfoRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_descriptor,
            new java.lang.String[] {
              "Name", "ProjectBillingInfo",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
