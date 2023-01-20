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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CreateRun][google.cloud.datacatalog.lineage.v1.CreateRun].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.lineage.v1.CreateRunRequest}
 */
public final class CreateRunRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.lineage.v1.CreateRunRequest)
    CreateRunRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateRunRequest.newBuilder() to construct.
  private CreateRunRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateRunRequest() {
    parent_ = "";
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateRunRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto
        .internal_static_google_cloud_datacatalog_lineage_v1_CreateRunRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto
        .internal_static_google_cloud_datacatalog_lineage_v1_CreateRunRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.lineage.v1.CreateRunRequest.class,
            com.google.cloud.datacatalog.lineage.v1.CreateRunRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the process that should own the run.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the process that should own the run.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RUN_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.lineage.v1.Run run_;
  /**
   *
   *
   * <pre>
   * Required. The run to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the run field is set.
   */
  @java.lang.Override
  public boolean hasRun() {
    return run_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The run to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The run.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.Run getRun() {
    return run_ == null ? com.google.cloud.datacatalog.lineage.v1.Run.getDefaultInstance() : run_;
  }
  /**
   *
   *
   * <pre>
   * Required. The run to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.RunOrBuilder getRunOrBuilder() {
    return run_ == null ? com.google.cloud.datacatalog.lineage.v1.Run.getDefaultInstance() : run_;
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object requestId_ = "";
  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters.
   * A random UUID is recommended. This request is idempotent only if a
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters.
   * A random UUID is recommended. This request is idempotent only if a
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (run_ != null) {
      output.writeMessage(2, getRun());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, requestId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (run_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRun());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, requestId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datacatalog.lineage.v1.CreateRunRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.lineage.v1.CreateRunRequest other =
        (com.google.cloud.datacatalog.lineage.v1.CreateRunRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasRun() != other.hasRun()) return false;
    if (hasRun()) {
      if (!getRun().equals(other.getRun())) return false;
    }
    if (!getRequestId().equals(other.getRequestId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasRun()) {
      hash = (37 * hash) + RUN_FIELD_NUMBER;
      hash = (53 * hash) + getRun().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datacatalog.lineage.v1.CreateRunRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [CreateRun][google.cloud.datacatalog.lineage.v1.CreateRun].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.lineage.v1.CreateRunRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.lineage.v1.CreateRunRequest)
      com.google.cloud.datacatalog.lineage.v1.CreateRunRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_CreateRunRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_CreateRunRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.lineage.v1.CreateRunRequest.class,
              com.google.cloud.datacatalog.lineage.v1.CreateRunRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.lineage.v1.CreateRunRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      run_ = null;
      if (runBuilder_ != null) {
        runBuilder_.dispose();
        runBuilder_ = null;
      }
      requestId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_CreateRunRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.CreateRunRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.lineage.v1.CreateRunRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.CreateRunRequest build() {
      com.google.cloud.datacatalog.lineage.v1.CreateRunRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.CreateRunRequest buildPartial() {
      com.google.cloud.datacatalog.lineage.v1.CreateRunRequest result =
          new com.google.cloud.datacatalog.lineage.v1.CreateRunRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.lineage.v1.CreateRunRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.run_ = runBuilder_ == null ? run_ : runBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.requestId_ = requestId_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.lineage.v1.CreateRunRequest) {
        return mergeFrom((com.google.cloud.datacatalog.lineage.v1.CreateRunRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.lineage.v1.CreateRunRequest other) {
      if (other == com.google.cloud.datacatalog.lineage.v1.CreateRunRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRun()) {
        mergeRun(other.getRun());
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getRunFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                requestId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the process that should own the run.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the process that should own the run.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the process that should own the run.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the process that should own the run.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the process that should own the run.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.lineage.v1.Run run_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.lineage.v1.Run,
            com.google.cloud.datacatalog.lineage.v1.Run.Builder,
            com.google.cloud.datacatalog.lineage.v1.RunOrBuilder>
        runBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the run field is set.
     */
    public boolean hasRun() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The run.
     */
    public com.google.cloud.datacatalog.lineage.v1.Run getRun() {
      if (runBuilder_ == null) {
        return run_ == null
            ? com.google.cloud.datacatalog.lineage.v1.Run.getDefaultInstance()
            : run_;
      } else {
        return runBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRun(com.google.cloud.datacatalog.lineage.v1.Run value) {
      if (runBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        run_ = value;
      } else {
        runBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRun(com.google.cloud.datacatalog.lineage.v1.Run.Builder builderForValue) {
      if (runBuilder_ == null) {
        run_ = builderForValue.build();
      } else {
        runBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRun(com.google.cloud.datacatalog.lineage.v1.Run value) {
      if (runBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && run_ != null
            && run_ != com.google.cloud.datacatalog.lineage.v1.Run.getDefaultInstance()) {
          getRunBuilder().mergeFrom(value);
        } else {
          run_ = value;
        }
      } else {
        runBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRun() {
      bitField0_ = (bitField0_ & ~0x00000002);
      run_ = null;
      if (runBuilder_ != null) {
        runBuilder_.dispose();
        runBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Run.Builder getRunBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRunFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.lineage.v1.RunOrBuilder getRunOrBuilder() {
      if (runBuilder_ != null) {
        return runBuilder_.getMessageOrBuilder();
      } else {
        return run_ == null
            ? com.google.cloud.datacatalog.lineage.v1.Run.getDefaultInstance()
            : run_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The run to create.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.lineage.v1.Run run = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.lineage.v1.Run,
            com.google.cloud.datacatalog.lineage.v1.Run.Builder,
            com.google.cloud.datacatalog.lineage.v1.RunOrBuilder>
        getRunFieldBuilder() {
      if (runBuilder_ == null) {
        runBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.lineage.v1.Run,
                com.google.cloud.datacatalog.lineage.v1.Run.Builder,
                com.google.cloud.datacatalog.lineage.v1.RunOrBuilder>(
                getRun(), getParentForChildren(), isClean());
        run_ = null;
      }
      return runBuilder_;
    }

    private java.lang.Object requestId_ = "";
    /**
     *
     *
     * <pre>
     * A unique identifier for this request. Restricted to 36 ASCII characters.
     * A random UUID is recommended. This request is idempotent only if a
     * `request_id` is provided.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     *
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for this request. Restricted to 36 ASCII characters.
     * A random UUID is recommended. This request is idempotent only if a
     * `request_id` is provided.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     *
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for this request. Restricted to 36 ASCII characters.
     * A random UUID is recommended. This request is idempotent only if a
     * `request_id` is provided.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     *
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      requestId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for this request. Restricted to 36 ASCII characters.
     * A random UUID is recommended. This request is idempotent only if a
     * `request_id` is provided.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      requestId_ = getDefaultInstance().getRequestId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for this request. Restricted to 36 ASCII characters.
     * A random UUID is recommended. This request is idempotent only if a
     * `request_id` is provided.
     * </pre>
     *
     * <code>string request_id = 3;</code>
     *
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      requestId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.lineage.v1.CreateRunRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.lineage.v1.CreateRunRequest)
  private static final com.google.cloud.datacatalog.lineage.v1.CreateRunRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.lineage.v1.CreateRunRequest();
  }

  public static com.google.cloud.datacatalog.lineage.v1.CreateRunRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRunRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateRunRequest>() {
        @java.lang.Override
        public CreateRunRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreateRunRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRunRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.CreateRunRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
