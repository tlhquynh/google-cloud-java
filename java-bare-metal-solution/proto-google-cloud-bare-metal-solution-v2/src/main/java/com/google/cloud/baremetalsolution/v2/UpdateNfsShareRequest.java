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
// source: google/cloud/baremetalsolution/v2/nfs_share.proto

package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Message requesting to updating an NFS share.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.UpdateNfsShareRequest}
 */
public final class UpdateNfsShareRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.UpdateNfsShareRequest)
    UpdateNfsShareRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateNfsShareRequest.newBuilder() to construct.
  private UpdateNfsShareRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateNfsShareRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateNfsShareRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.NfsShareProto
        .internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.NfsShareProto
        .internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest.class,
            com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest.Builder.class);
  }

  public static final int NFS_SHARE_FIELD_NUMBER = 1;
  private com.google.cloud.baremetalsolution.v2.NfsShare nfsShare_;
  /**
   *
   *
   * <pre>
   * Required. The NFS share to update.
   *
   * The `name` field is used to identify the NFS share to update.
   * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the nfsShare field is set.
   */
  @java.lang.Override
  public boolean hasNfsShare() {
    return nfsShare_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The NFS share to update.
   *
   * The `name` field is used to identify the NFS share to update.
   * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The nfsShare.
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.NfsShare getNfsShare() {
    return nfsShare_ == null
        ? com.google.cloud.baremetalsolution.v2.NfsShare.getDefaultInstance()
        : nfsShare_;
  }
  /**
   *
   *
   * <pre>
   * Required. The NFS share to update.
   *
   * The `name` field is used to identify the NFS share to update.
   * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.NfsShareOrBuilder getNfsShareOrBuilder() {
    return nfsShare_ == null
        ? com.google.cloud.baremetalsolution.v2.NfsShare.getDefaultInstance()
        : nfsShare_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `labels`
   *   `allowed_clients`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `labels`
   *   `allowed_clients`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `labels`
   *   `allowed_clients`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (nfsShare_ != null) {
      output.writeMessage(1, getNfsShare());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nfsShare_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNfsShare());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest other =
        (com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest) obj;

    if (hasNfsShare() != other.hasNfsShare()) return false;
    if (hasNfsShare()) {
      if (!getNfsShare().equals(other.getNfsShare())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasNfsShare()) {
      hash = (37 * hash) + NFS_SHARE_FIELD_NUMBER;
      hash = (53 * hash) + getNfsShare().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest parseFrom(
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
      com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest prototype) {
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
   * Message requesting to updating an NFS share.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.UpdateNfsShareRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.UpdateNfsShareRequest)
      com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.NfsShareProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.NfsShareProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest.class,
              com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      nfsShare_ = null;
      if (nfsShareBuilder_ != null) {
        nfsShareBuilder_.dispose();
        nfsShareBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.NfsShareProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest build() {
      com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest buildPartial() {
      com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest result =
          new com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nfsShare_ = nfsShareBuilder_ == null ? nfsShare_ : nfsShareBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest other) {
      if (other == com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest.getDefaultInstance())
        return this;
      if (other.hasNfsShare()) {
        mergeNfsShare(other.getNfsShare());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getNfsShareFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.cloud.baremetalsolution.v2.NfsShare nfsShare_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.NfsShare,
            com.google.cloud.baremetalsolution.v2.NfsShare.Builder,
            com.google.cloud.baremetalsolution.v2.NfsShareOrBuilder>
        nfsShareBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the nfsShare field is set.
     */
    public boolean hasNfsShare() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The nfsShare.
     */
    public com.google.cloud.baremetalsolution.v2.NfsShare getNfsShare() {
      if (nfsShareBuilder_ == null) {
        return nfsShare_ == null
            ? com.google.cloud.baremetalsolution.v2.NfsShare.getDefaultInstance()
            : nfsShare_;
      } else {
        return nfsShareBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNfsShare(com.google.cloud.baremetalsolution.v2.NfsShare value) {
      if (nfsShareBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nfsShare_ = value;
      } else {
        nfsShareBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNfsShare(
        com.google.cloud.baremetalsolution.v2.NfsShare.Builder builderForValue) {
      if (nfsShareBuilder_ == null) {
        nfsShare_ = builderForValue.build();
      } else {
        nfsShareBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeNfsShare(com.google.cloud.baremetalsolution.v2.NfsShare value) {
      if (nfsShareBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && nfsShare_ != null
            && nfsShare_ != com.google.cloud.baremetalsolution.v2.NfsShare.getDefaultInstance()) {
          getNfsShareBuilder().mergeFrom(value);
        } else {
          nfsShare_ = value;
        }
      } else {
        nfsShareBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearNfsShare() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nfsShare_ = null;
      if (nfsShareBuilder_ != null) {
        nfsShareBuilder_.dispose();
        nfsShareBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.baremetalsolution.v2.NfsShare.Builder getNfsShareBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNfsShareFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.baremetalsolution.v2.NfsShareOrBuilder getNfsShareOrBuilder() {
      if (nfsShareBuilder_ != null) {
        return nfsShareBuilder_.getMessageOrBuilder();
      } else {
        return nfsShare_ == null
            ? com.google.cloud.baremetalsolution.v2.NfsShare.getDefaultInstance()
            : nfsShare_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The NFS share to update.
     *
     * The `name` field is used to identify the NFS share to update.
     * Format: projects/{project}/locations/{location}/nfsShares/{nfs_share}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.NfsShare,
            com.google.cloud.baremetalsolution.v2.NfsShare.Builder,
            com.google.cloud.baremetalsolution.v2.NfsShareOrBuilder>
        getNfsShareFieldBuilder() {
      if (nfsShareBuilder_ == null) {
        nfsShareBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.baremetalsolution.v2.NfsShare,
                com.google.cloud.baremetalsolution.v2.NfsShare.Builder,
                com.google.cloud.baremetalsolution.v2.NfsShareOrBuilder>(
                getNfsShare(), getParentForChildren(), isClean());
        nfsShare_ = null;
      }
      return nfsShareBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`
     *   `allowed_clients`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.UpdateNfsShareRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.UpdateNfsShareRequest)
  private static final com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest();
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateNfsShareRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateNfsShareRequest>() {
        @java.lang.Override
        public UpdateNfsShareRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateNfsShareRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateNfsShareRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
