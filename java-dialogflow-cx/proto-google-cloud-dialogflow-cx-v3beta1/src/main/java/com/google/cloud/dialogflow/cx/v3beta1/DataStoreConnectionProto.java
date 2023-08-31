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
// source: google/cloud/dialogflow/cx/v3beta1/data_store_connection.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class DataStoreConnectionProto {
  private DataStoreConnectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/dialogflow/cx/v3beta1/dat"
          + "a_store_connection.proto\022\"google.cloud.d"
          + "ialogflow.cx.v3beta1\"u\n\023DataStoreConnect"
          + "ion\022J\n\017data_store_type\030\001 \001(\01621.google.cl"
          + "oud.dialogflow.cx.v3beta1.DataStoreType\022"
          + "\022\n\ndata_store\030\002 \001(\t*b\n\rDataStoreType\022\037\n\033"
          + "DATA_STORE_TYPE_UNSPECIFIED\020\000\022\016\n\nPUBLIC_"
          + "WEB\020\001\022\020\n\014UNSTRUCTURED\020\002\022\016\n\nSTRUCTURED\020\003B"
          + "\251\001\n&com.google.cloud.dialogflow.cx.v3bet"
          + "a1B\030DataStoreConnectionProtoP\001Z6cloud.go"
          + "ogle.com/go/dialogflow/cx/apiv3beta1/cxp"
          + "b;cxpb\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialogflow"
          + ".Cx.V3Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_descriptor,
            new java.lang.String[] {
              "DataStoreType", "DataStore",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
