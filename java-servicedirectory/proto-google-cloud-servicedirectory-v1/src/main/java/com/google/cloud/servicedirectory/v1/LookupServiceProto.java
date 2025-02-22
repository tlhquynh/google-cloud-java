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
// source: google/cloud/servicedirectory/v1/lookup_service.proto

package com.google.cloud.servicedirectory.v1;

public final class LookupServiceProto {
  private LookupServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_ResolveServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_ResolveServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/servicedirectory/v1/looku"
          + "p_service.proto\022 google.cloud.servicedir"
          + "ectory.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032.google/cloud/servicedirectory/v1/s"
          + "ervice.proto\"\223\001\n\025ResolveServiceRequest\022>"
          + "\n\004name\030\001 \001(\tB0\342A\001\002\372A)\n\'servicedirectory."
          + "googleapis.com/Service\022\033\n\rmax_endpoints\030"
          + "\002 \001(\005B\004\342A\001\001\022\035\n\017endpoint_filter\030\003 \001(\tB\004\342A"
          + "\001\001\"T\n\026ResolveServiceResponse\022:\n\007service\030"
          + "\001 \001(\0132).google.cloud.servicedirectory.v1"
          + ".Service2\270\002\n\rLookupService\022\321\001\n\016ResolveSe"
          + "rvice\0227.google.cloud.servicedirectory.v1"
          + ".ResolveServiceRequest\0328.google.cloud.se"
          + "rvicedirectory.v1.ResolveServiceResponse"
          + "\"L\202\323\344\223\002F\"A/v1/{name=projects/*/locations"
          + "/*/namespaces/*/services/*}:resolve:\001*\032S"
          + "\312A\037servicedirectory.googleapis.com\322A.htt"
          + "ps://www.googleapis.com/auth/cloud-platf"
          + "ormB\375\001\n$com.google.cloud.servicedirector"
          + "y.v1B\022LookupServiceProtoP\001ZPcloud.google"
          + ".com/go/servicedirectory/apiv1/servicedi"
          + "rectorypb;servicedirectorypb\370\001\001\252\002 Google"
          + ".Cloud.ServiceDirectory.V1\312\002 Google\\Clou"
          + "d\\ServiceDirectory\\V1\352\002#Google::Cloud::S"
          + "erviceDirectory::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.servicedirectory.v1.ServiceProto.getDescriptor(),
            });
    internal_static_google_cloud_servicedirectory_v1_ResolveServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_ResolveServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_ResolveServiceRequest_descriptor,
            new java.lang.String[] {
              "Name", "MaxEndpoints", "EndpointFilter",
            });
    internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_descriptor,
            new java.lang.String[] {
              "Service",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.servicedirectory.v1.ServiceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
