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
// source: google/devtools/containeranalysis/v1beta1/common/common.proto

package io.grafeas.v1beta1.common;

public final class Common {
  private Common() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_RelatedUrl_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_RelatedUrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/devtools/containeranalysis/v1be"
          + "ta1/common/common.proto\022\017grafeas.v1beta1"
          + "\"(\n\nRelatedUrl\022\013\n\003url\030\001 \001(\t\022\r\n\005label\030\002 \001"
          + "(\t*\213\001\n\010NoteKind\022\031\n\025NOTE_KIND_UNSPECIFIED"
          + "\020\000\022\021\n\rVULNERABILITY\020\001\022\t\n\005BUILD\020\002\022\t\n\005IMAG"
          + "E\020\003\022\013\n\007PACKAGE\020\004\022\016\n\nDEPLOYMENT\020\005\022\r\n\tDISC"
          + "OVERY\020\006\022\017\n\013ATTESTATION\020\007B{\n\031io.grafeas.v"
          + "1beta1.commonP\001ZVgoogle.golang.org/genpr"
          + "oto/googleapis/devtools/containeranalysi"
          + "s/v1beta1/common;common\242\002\003GRAb\006proto3"
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
        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_grafeas_v1beta1_RelatedUrl_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1beta1_RelatedUrl_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_RelatedUrl_descriptor,
            new java.lang.String[] {
              "Url", "Label",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
