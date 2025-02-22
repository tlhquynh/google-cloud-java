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
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

public final class AccessApprovalProto {
  private AccessApprovalProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_AccessLocations_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_AccessLocations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_AccessReason_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_AccessReason_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_SignatureInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_SignatureInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_ApproveDecision_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_ApproveDecision_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_DismissDecision_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_DismissDecision_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_ResourceProperties_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_ResourceProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_ApprovalRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_ApprovalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_EnrolledService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_EnrolledService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_AccessApprovalSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_AccessApprovalSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_AccessApprovalServiceAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_AccessApprovalServiceAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_GetApprovalRequestMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_GetApprovalRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_ApproveApprovalRequestMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_ApproveApprovalRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_DismissApprovalRequestMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_DismissApprovalRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_InvalidateApprovalRequestMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_InvalidateApprovalRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_GetAccessApprovalSettingsMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_GetAccessApprovalSettingsMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_DeleteAccessApprovalSettingsMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_DeleteAccessApprovalSettingsMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_accessapproval_v1_GetAccessApprovalServiceAccountMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_accessapproval_v1_GetAccessApprovalServiceAccountMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/accessapproval/v1/accessa"
          + "pproval.proto\022\036google.cloud.accessapprov"
          + "al.v1\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032\033google/protobuf/empty.proto\032 google/pr"
          + "otobuf/field_mask.proto\032\037google/protobuf"
          + "/timestamp.proto\"`\n\017AccessLocations\022 \n\030p"
          + "rincipal_office_country\030\001 \001(\t\022+\n#princip"
          + "al_physical_location_country\030\002 \001(\t\"\240\002\n\014A"
          + "ccessReason\022?\n\004type\030\001 \001(\01621.google.cloud"
          + ".accessapproval.v1.AccessReason.Type\022\016\n\006"
          + "detail\030\002 \001(\t\"\276\001\n\004Type\022\024\n\020TYPE_UNSPECIFIE"
          + "D\020\000\022\036\n\032CUSTOMER_INITIATED_SUPPORT\020\001\022\034\n\030G"
          + "OOGLE_INITIATED_SERVICE\020\002\022\033\n\027GOOGLE_INIT"
          + "IATED_REVIEW\020\003\022\034\n\030THIRD_PARTY_DATA_REQUE"
          + "ST\020\004\022\'\n#GOOGLE_RESPONSE_TO_PRODUCTION_AL"
          + "ERT\020\005\"|\n\rSignatureInfo\022\021\n\tsignature\030\001 \001("
          + "\014\022\037\n\025google_public_key_pem\030\002 \001(\tH\000\022\"\n\030cu"
          + "stomer_kms_key_version\030\003 \001(\tH\000B\023\n\021verifi"
          + "cation_info\"\207\002\n\017ApproveDecision\0220\n\014appro"
          + "ve_time\030\001 \001(\0132\032.google.protobuf.Timestam"
          + "p\022/\n\013expire_time\030\002 \001(\0132\032.google.protobuf"
          + ".Timestamp\0223\n\017invalidate_time\030\003 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022E\n\016signature_inf"
          + "o\030\004 \001(\0132-.google.cloud.accessapproval.v1"
          + ".SignatureInfo\022\025\n\rauto_approved\030\005 \001(\010\"U\n"
          + "\017DismissDecision\0220\n\014dismiss_time\030\001 \001(\0132\032"
          + ".google.protobuf.Timestamp\022\020\n\010implicit\030\002"
          + " \001(\010\"2\n\022ResourceProperties\022\034\n\024excludes_d"
          + "escendants\030\001 \001(\010\"\227\006\n\017ApprovalRequest\022\014\n\004"
          + "name\030\001 \001(\t\022\037\n\027requested_resource_name\030\002 "
          + "\001(\t\022Y\n\035requested_resource_properties\030\t \001"
          + "(\01322.google.cloud.accessapproval.v1.Reso"
          + "urceProperties\022F\n\020requested_reason\030\003 \001(\013"
          + "2,.google.cloud.accessapproval.v1.Access"
          + "Reason\022L\n\023requested_locations\030\004 \001(\0132/.go"
          + "ogle.cloud.accessapproval.v1.AccessLocat"
          + "ions\0220\n\014request_time\030\005 \001(\0132\032.google.prot"
          + "obuf.Timestamp\0228\n\024requested_expiration\030\006"
          + " \001(\0132\032.google.protobuf.Timestamp\022B\n\007appr"
          + "ove\030\007 \001(\0132/.google.cloud.accessapproval."
          + "v1.ApproveDecisionH\000\022B\n\007dismiss\030\010 \001(\0132/."
          + "google.cloud.accessapproval.v1.DismissDe"
          + "cisionH\000:\343\001\352A\337\001\n-accessapproval.googleap"
          + "is.com/ApprovalRequest\0226projects/{projec"
          + "t}/approvalRequests/{approval_request}\0224"
          + "folders/{folder}/approvalRequests/{appro"
          + "val_request}\022@organizations/{organizatio"
          + "n}/approvalRequests/{approval_request}B\n"
          + "\n\010decision\"s\n\017EnrolledService\022\025\n\rcloud_p"
          + "roduct\030\001 \001(\t\022I\n\020enrollment_level\030\002 \001(\0162/"
          + ".google.cloud.accessapproval.v1.Enrollme"
          + "ntLevel\"\237\004\n\026AccessApprovalSettings\022G\n\004na"
          + "me\030\001 \001(\tB9\372A6\n4accessapproval.googleapis"
          + ".com/AccessApprovalSettings\022\033\n\023notificat"
          + "ion_emails\030\002 \003(\t\022J\n\021enrolled_services\030\003 "
          + "\003(\0132/.google.cloud.accessapproval.v1.Enr"
          + "olledService\022\037\n\021enrolled_ancestor\030\004 \001(\010B"
          + "\004\342A\001\003\022\032\n\022active_key_version\030\006 \001(\t\022-\n\037anc"
          + "estor_has_active_key_version\030\007 \001(\010B\004\342A\001\003"
          + "\022!\n\023invalid_key_version\030\010 \001(\010B\004\342A\001\003:\303\001\352A"
          + "\277\001\n4accessapproval.googleapis.com/Access"
          + "ApprovalSettings\022)projects/{project}/acc"
          + "essApprovalSettings\022\'folders/{folder}/ac"
          + "cessApprovalSettings\0223organizations/{org"
          + "anization}/accessApprovalSettings\"\270\002\n\034Ac"
          + "cessApprovalServiceAccount\022M\n\004name\030\001 \001(\t"
          + "B?\372A<\n:accessapproval.googleapis.com/Acc"
          + "essApprovalServiceAccount\022\025\n\raccount_ema"
          + "il\030\002 \001(\t:\261\001\352A\255\001\n:accessapproval.googleap"
          + "is.com/AccessApprovalServiceAccount\022!pro"
          + "jects/{project}/serviceAccount\022\037folders/"
          + "{folder}/serviceAccount\022+organizations/{"
          + "organization}/serviceAccount\"\230\001\n\033ListApp"
          + "rovalRequestsMessage\022B\n\006parent\030\001 \001(\tB2\372A"
          + "/\022-accessapproval.googleapis.com/Approva"
          + "lRequest\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 "
          + "\001(\005\022\022\n\npage_token\030\004 \001(\t\"\203\001\n\034ListApproval"
          + "RequestsResponse\022J\n\021approval_requests\030\001 "
          + "\003(\0132/.google.cloud.accessapproval.v1.App"
          + "rovalRequest\022\027\n\017next_page_token\030\002 \001(\t\"]\n"
          + "\031GetApprovalRequestMessage\022@\n\004name\030\001 \001(\t"
          + "B2\372A/\n-accessapproval.googleapis.com/App"
          + "rovalRequest\"\222\001\n\035ApproveApprovalRequestM"
          + "essage\022@\n\004name\030\001 \001(\tB2\372A/\n-accessapprova"
          + "l.googleapis.com/ApprovalRequest\022/\n\013expi"
          + "re_time\030\002 \001(\0132\032.google.protobuf.Timestam"
          + "p\"a\n\035DismissApprovalRequestMessage\022@\n\004na"
          + "me\030\001 \001(\tB2\372A/\n-accessapproval.googleapis"
          + ".com/ApprovalRequest\"d\n InvalidateApprov"
          + "alRequestMessage\022@\n\004name\030\001 \001(\tB2\372A/\n-acc"
          + "essapproval.googleapis.com/ApprovalReque"
          + "st\"k\n GetAccessApprovalSettingsMessage\022G"
          + "\n\004name\030\001 \001(\tB9\372A6\n4accessapproval.google"
          + "apis.com/AccessApprovalSettings\"\240\001\n#Upda"
          + "teAccessApprovalSettingsMessage\022H\n\010setti"
          + "ngs\030\001 \001(\01326.google.cloud.accessapproval."
          + "v1.AccessApprovalSettings\022/\n\013update_mask"
          + "\030\002 \001(\0132\032.google.protobuf.FieldMask\"n\n#De"
          + "leteAccessApprovalSettingsMessage\022G\n\004nam"
          + "e\030\001 \001(\tB9\372A6\n4accessapproval.googleapis."
          + "com/AccessApprovalSettings\"6\n&GetAccessA"
          + "pprovalServiceAccountMessage\022\014\n\004name\030\001 \001"
          + "(\t*B\n\017EnrollmentLevel\022 \n\034ENROLLMENT_LEVE"
          + "L_UNSPECIFIED\020\000\022\r\n\tBLOCK_ALL\020\0012\207\027\n\016Acces"
          + "sApproval\022\252\002\n\024ListApprovalRequests\022;.goo"
          + "gle.cloud.accessapproval.v1.ListApproval"
          + "RequestsMessage\032<.google.cloud.accessapp"
          + "roval.v1.ListApprovalRequestsResponse\"\226\001"
          + "\332A\006parent\202\323\344\223\002\206\001\022(/v1/{parent=projects/*"
          + "}/approvalRequestsZ)\022\'/v1/{parent=folder"
          + "s/*}/approvalRequestsZ/\022-/v1/{parent=org"
          + "anizations/*}/approvalRequests\022\227\002\n\022GetAp"
          + "provalRequest\0229.google.cloud.accessappro"
          + "val.v1.GetApprovalRequestMessage\032/.googl"
          + "e.cloud.accessapproval.v1.ApprovalReques"
          + "t\"\224\001\332A\004name\202\323\344\223\002\206\001\022(/v1/{name=projects/*"
          + "/approvalRequests/*}Z)\022\'/v1/{name=folder"
          + "s/*/approvalRequests/*}Z/\022-/v1/{name=org"
          + "anizations/*/approvalRequests/*}\022\271\002\n\026App"
          + "roveApprovalRequest\022=.google.cloud.acces"
          + "sapproval.v1.ApproveApprovalRequestMessa"
          + "ge\032/.google.cloud.accessapproval.v1.Appr"
          + "ovalRequest\"\256\001\202\323\344\223\002\247\001\"0/v1/{name=project"
          + "s/*/approvalRequests/*}:approve:\001*Z4\"//v"
          + "1/{name=folders/*/approvalRequests/*}:ap"
          + "prove:\001*Z:\"5/v1/{name=organizations/*/ap"
          + "provalRequests/*}:approve:\001*\022\271\002\n\026Dismiss"
          + "ApprovalRequest\022=.google.cloud.accessapp"
          + "roval.v1.DismissApprovalRequestMessage\032/"
          + ".google.cloud.accessapproval.v1.Approval"
          + "Request\"\256\001\202\323\344\223\002\247\001\"0/v1/{name=projects/*/"
          + "approvalRequests/*}:dismiss:\001*Z4\"//v1/{n"
          + "ame=folders/*/approvalRequests/*}:dismis"
          + "s:\001*Z:\"5/v1/{name=organizations/*/approv"
          + "alRequests/*}:dismiss:\001*\022\310\002\n\031InvalidateA"
          + "pprovalRequest\022@.google.cloud.accessappr"
          + "oval.v1.InvalidateApprovalRequestMessage"
          + "\032/.google.cloud.accessapproval.v1.Approv"
          + "alRequest\"\267\001\202\323\344\223\002\260\001\"3/v1/{name=projects/"
          + "*/approvalRequests/*}:invalidate:\001*Z7\"2/"
          + "v1/{name=folders/*/approvalRequests/*}:i"
          + "nvalidate:\001*Z=\"8/v1/{name=organizations/"
          + "*/approvalRequests/*}:invalidate:\001*\022\270\002\n\031"
          + "GetAccessApprovalSettings\022@.google.cloud"
          + ".accessapproval.v1.GetAccessApprovalSett"
          + "ingsMessage\0326.google.cloud.accessapprova"
          + "l.v1.AccessApprovalSettings\"\240\001\332A\004name\202\323\344"
          + "\223\002\222\001\022,/v1/{name=projects/*/accessApprova"
          + "lSettings}Z-\022+/v1/{name=folders/*/access"
          + "ApprovalSettings}Z3\0221/v1/{name=organizat"
          + "ions/*/accessApprovalSettings}\022\207\003\n\034Updat"
          + "eAccessApprovalSettings\022C.google.cloud.a"
          + "ccessapproval.v1.UpdateAccessApprovalSet"
          + "tingsMessage\0326.google.cloud.accessapprov"
          + "al.v1.AccessApprovalSettings\"\351\001\332A\024settin"
          + "gs,update_mask\202\323\344\223\002\313\00125/v1/{settings.nam"
          + "e=projects/*/accessApprovalSettings}:\010se"
          + "ttingsZ@24/v1/{settings.name=folders/*/a"
          + "ccessApprovalSettings}:\010settingsZF2:/v1/"
          + "{settings.name=organizations/*/accessApp"
          + "rovalSettings}:\010settings\022\236\002\n\034DeleteAcces"
          + "sApprovalSettings\022C.google.cloud.accessa"
          + "pproval.v1.DeleteAccessApprovalSettingsM"
          + "essage\032\026.google.protobuf.Empty\"\240\001\332A\004name"
          + "\202\323\344\223\002\222\001*,/v1/{name=projects/*/accessAppr"
          + "ovalSettings}Z-*+/v1/{name=folders/*/acc"
          + "essApprovalSettings}Z3*1/v1/{name=organi"
          + "zations/*/accessApprovalSettings}\022\261\002\n\037Ge"
          + "tAccessApprovalServiceAccount\022F.google.c"
          + "loud.accessapproval.v1.GetAccessApproval"
          + "ServiceAccountMessage\032<.google.cloud.acc"
          + "essapproval.v1.AccessApprovalServiceAcco"
          + "unt\"\207\001\332A\004name\202\323\344\223\002z\022$/v1/{name=projects/"
          + "*/serviceAccount}Z%\022#/v1/{name=folders/*"
          + "/serviceAccount}Z+\022)/v1/{name=organizati"
          + "ons/*/serviceAccount}\032Q\312A\035accessapproval"
          + ".googleapis.com\322A.https://www.googleapis"
          + ".com/auth/cloud-platformB\355\001\n\"com.google."
          + "cloud.accessapproval.v1B\023AccessApprovalP"
          + "rotoP\001ZJcloud.google.com/go/accessapprov"
          + "al/apiv1/accessapprovalpb;accessapproval"
          + "pb\252\002\036Google.Cloud.AccessApproval.V1\312\002\036Go"
          + "ogle\\Cloud\\AccessApproval\\V1\352\002!Google::C"
          + "loud::AccessApproval::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_accessapproval_v1_AccessLocations_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_accessapproval_v1_AccessLocations_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_AccessLocations_descriptor,
            new java.lang.String[] {
              "PrincipalOfficeCountry", "PrincipalPhysicalLocationCountry",
            });
    internal_static_google_cloud_accessapproval_v1_AccessReason_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_accessapproval_v1_AccessReason_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_AccessReason_descriptor,
            new java.lang.String[] {
              "Type", "Detail",
            });
    internal_static_google_cloud_accessapproval_v1_SignatureInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_accessapproval_v1_SignatureInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_SignatureInfo_descriptor,
            new java.lang.String[] {
              "Signature", "GooglePublicKeyPem", "CustomerKmsKeyVersion", "VerificationInfo",
            });
    internal_static_google_cloud_accessapproval_v1_ApproveDecision_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_accessapproval_v1_ApproveDecision_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_ApproveDecision_descriptor,
            new java.lang.String[] {
              "ApproveTime", "ExpireTime", "InvalidateTime", "SignatureInfo", "AutoApproved",
            });
    internal_static_google_cloud_accessapproval_v1_DismissDecision_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_accessapproval_v1_DismissDecision_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_DismissDecision_descriptor,
            new java.lang.String[] {
              "DismissTime", "Implicit",
            });
    internal_static_google_cloud_accessapproval_v1_ResourceProperties_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_accessapproval_v1_ResourceProperties_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_ResourceProperties_descriptor,
            new java.lang.String[] {
              "ExcludesDescendants",
            });
    internal_static_google_cloud_accessapproval_v1_ApprovalRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_accessapproval_v1_ApprovalRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_ApprovalRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "RequestedResourceName",
              "RequestedResourceProperties",
              "RequestedReason",
              "RequestedLocations",
              "RequestTime",
              "RequestedExpiration",
              "Approve",
              "Dismiss",
              "Decision",
            });
    internal_static_google_cloud_accessapproval_v1_EnrolledService_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_accessapproval_v1_EnrolledService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_EnrolledService_descriptor,
            new java.lang.String[] {
              "CloudProduct", "EnrollmentLevel",
            });
    internal_static_google_cloud_accessapproval_v1_AccessApprovalSettings_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_accessapproval_v1_AccessApprovalSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_AccessApprovalSettings_descriptor,
            new java.lang.String[] {
              "Name",
              "NotificationEmails",
              "EnrolledServices",
              "EnrolledAncestor",
              "ActiveKeyVersion",
              "AncestorHasActiveKeyVersion",
              "InvalidKeyVersion",
            });
    internal_static_google_cloud_accessapproval_v1_AccessApprovalServiceAccount_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_accessapproval_v1_AccessApprovalServiceAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_AccessApprovalServiceAccount_descriptor,
            new java.lang.String[] {
              "Name", "AccountEmail",
            });
    internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsMessage_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsMessage_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_ListApprovalRequestsResponse_descriptor,
            new java.lang.String[] {
              "ApprovalRequests", "NextPageToken",
            });
    internal_static_google_cloud_accessapproval_v1_GetApprovalRequestMessage_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_accessapproval_v1_GetApprovalRequestMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_GetApprovalRequestMessage_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_accessapproval_v1_ApproveApprovalRequestMessage_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_accessapproval_v1_ApproveApprovalRequestMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_ApproveApprovalRequestMessage_descriptor,
            new java.lang.String[] {
              "Name", "ExpireTime",
            });
    internal_static_google_cloud_accessapproval_v1_DismissApprovalRequestMessage_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_accessapproval_v1_DismissApprovalRequestMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_DismissApprovalRequestMessage_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_accessapproval_v1_InvalidateApprovalRequestMessage_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_accessapproval_v1_InvalidateApprovalRequestMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_InvalidateApprovalRequestMessage_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_accessapproval_v1_GetAccessApprovalSettingsMessage_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_accessapproval_v1_GetAccessApprovalSettingsMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_GetAccessApprovalSettingsMessage_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor,
            new java.lang.String[] {
              "Settings", "UpdateMask",
            });
    internal_static_google_cloud_accessapproval_v1_DeleteAccessApprovalSettingsMessage_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_accessapproval_v1_DeleteAccessApprovalSettingsMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_DeleteAccessApprovalSettingsMessage_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_accessapproval_v1_GetAccessApprovalServiceAccountMessage_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_accessapproval_v1_GetAccessApprovalServiceAccountMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_accessapproval_v1_GetAccessApprovalServiceAccountMessage_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
