/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/datacatalog/v1/tags.proto

package com.google.cloud.datacatalog.v1;

public interface FieldTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.FieldType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Primitive types, such as string, boolean, etc.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType.PrimitiveType primitive_type = 1;</code>
   *
   * @return Whether the primitiveType field is set.
   */
  boolean hasPrimitiveType();
  /**
   *
   *
   * <pre>
   * Primitive types, such as string, boolean, etc.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType.PrimitiveType primitive_type = 1;</code>
   *
   * @return The enum numeric value on the wire for primitiveType.
   */
  int getPrimitiveTypeValue();
  /**
   *
   *
   * <pre>
   * Primitive types, such as string, boolean, etc.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType.PrimitiveType primitive_type = 1;</code>
   *
   * @return The primitiveType.
   */
  com.google.cloud.datacatalog.v1.FieldType.PrimitiveType getPrimitiveType();

  /**
   *
   *
   * <pre>
   * An enum type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType.EnumType enum_type = 2;</code>
   *
   * @return Whether the enumType field is set.
   */
  boolean hasEnumType();
  /**
   *
   *
   * <pre>
   * An enum type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType.EnumType enum_type = 2;</code>
   *
   * @return The enumType.
   */
  com.google.cloud.datacatalog.v1.FieldType.EnumType getEnumType();
  /**
   *
   *
   * <pre>
   * An enum type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FieldType.EnumType enum_type = 2;</code>
   */
  com.google.cloud.datacatalog.v1.FieldType.EnumTypeOrBuilder getEnumTypeOrBuilder();

  public com.google.cloud.datacatalog.v1.FieldType.TypeDeclCase getTypeDeclCase();
}
