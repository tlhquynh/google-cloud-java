/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/securitycenter/v1/organization_settings.proto

package com.google.cloud.securitycenter.v1;

public final class OrganizationSettingsOuterClass {
  private OrganizationSettingsOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_OrganizationSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_OrganizationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_OrganizationSettings_AssetDiscoveryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_OrganizationSettings_AssetDiscoveryConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/securitycenter/v1/organiz"
          + "ation_settings.proto\022\036google.cloud.secur"
          + "itycenter.v1\032\034google/api/annotations.pro"
          + "to\032\031google/api/resource.proto\"\212\004\n\024Organi"
          + "zationSettings\022\014\n\004name\030\001 \001(\t\022\036\n\026enable_a"
          + "sset_discovery\030\002 \001(\010\022i\n\026asset_discovery_"
          + "config\030\003 \001(\0132I.google.cloud.securitycent"
          + "er.v1.OrganizationSettings.AssetDiscover"
          + "yConfig\032\354\001\n\024AssetDiscoveryConfig\022\023\n\013proj"
          + "ect_ids\030\001 \003(\t\022o\n\016inclusion_mode\030\002 \001(\0162W."
          + "google.cloud.securitycenter.v1.Organizat"
          + "ionSettings.AssetDiscoveryConfig.Inclusi"
          + "onMode\"N\n\rInclusionMode\022\036\n\032INCLUSION_MOD"
          + "E_UNSPECIFIED\020\000\022\020\n\014INCLUDE_ONLY\020\001\022\013\n\007EXC"
          + "LUDE\020\002:j\352Ag\n2securitycenter.googleapis.c"
          + "om/OrganizationSettings\0221organizations/{"
          + "organization}/organizationSettingsB\332\001\n\"c"
          + "om.google.cloud.securitycenter.v1P\001ZLgoo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/securitycenter/v1;securitycenter\252\002\036Goog"
          + "le.Cloud.SecurityCenter.V1\312\002\036Google\\Clou"
          + "d\\SecurityCenter\\V1\352\002!Google::Cloud::Sec"
          + "urityCenter::V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_securitycenter_v1_OrganizationSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_OrganizationSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_OrganizationSettings_descriptor,
            new java.lang.String[] {
              "Name", "EnableAssetDiscovery", "AssetDiscoveryConfig",
            });
    internal_static_google_cloud_securitycenter_v1_OrganizationSettings_AssetDiscoveryConfig_descriptor =
        internal_static_google_cloud_securitycenter_v1_OrganizationSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1_OrganizationSettings_AssetDiscoveryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_OrganizationSettings_AssetDiscoveryConfig_descriptor,
            new java.lang.String[] {
              "ProjectIds", "InclusionMode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
