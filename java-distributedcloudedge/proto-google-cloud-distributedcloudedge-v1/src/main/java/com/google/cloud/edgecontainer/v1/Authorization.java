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
// source: google/cloud/edgecontainer/v1/resources.proto

package com.google.cloud.edgecontainer.v1;

/**
 *
 *
 * <pre>
 * RBAC policy that will be applied and managed by GEC.
 * </pre>
 *
 * Protobuf type {@code google.cloud.edgecontainer.v1.Authorization}
 */
public final class Authorization extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.edgecontainer.v1.Authorization)
    AuthorizationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Authorization.newBuilder() to construct.
  private Authorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Authorization() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Authorization();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.edgecontainer.v1.ResourcesProto
        .internal_static_google_cloud_edgecontainer_v1_Authorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.edgecontainer.v1.ResourcesProto
        .internal_static_google_cloud_edgecontainer_v1_Authorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.edgecontainer.v1.Authorization.class,
            com.google.cloud.edgecontainer.v1.Authorization.Builder.class);
  }

  public static final int ADMIN_USERS_FIELD_NUMBER = 1;
  private com.google.cloud.edgecontainer.v1.ClusterUser adminUsers_;
  /**
   *
   *
   * <pre>
   * Required. User that will be granted the cluster-admin role on the cluster, providing
   * full access to the cluster. Currently, this is a singular field, but will
   * be expanded to allow multiple admins in the future.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the adminUsers field is set.
   */
  @java.lang.Override
  public boolean hasAdminUsers() {
    return adminUsers_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. User that will be granted the cluster-admin role on the cluster, providing
   * full access to the cluster. Currently, this is a singular field, but will
   * be expanded to allow multiple admins in the future.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The adminUsers.
   */
  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.ClusterUser getAdminUsers() {
    return adminUsers_ == null
        ? com.google.cloud.edgecontainer.v1.ClusterUser.getDefaultInstance()
        : adminUsers_;
  }
  /**
   *
   *
   * <pre>
   * Required. User that will be granted the cluster-admin role on the cluster, providing
   * full access to the cluster. Currently, this is a singular field, but will
   * be expanded to allow multiple admins in the future.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.ClusterUserOrBuilder getAdminUsersOrBuilder() {
    return adminUsers_ == null
        ? com.google.cloud.edgecontainer.v1.ClusterUser.getDefaultInstance()
        : adminUsers_;
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
    if (adminUsers_ != null) {
      output.writeMessage(1, getAdminUsers());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adminUsers_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAdminUsers());
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
    if (!(obj instanceof com.google.cloud.edgecontainer.v1.Authorization)) {
      return super.equals(obj);
    }
    com.google.cloud.edgecontainer.v1.Authorization other =
        (com.google.cloud.edgecontainer.v1.Authorization) obj;

    if (hasAdminUsers() != other.hasAdminUsers()) return false;
    if (hasAdminUsers()) {
      if (!getAdminUsers().equals(other.getAdminUsers())) return false;
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
    if (hasAdminUsers()) {
      hash = (37 * hash) + ADMIN_USERS_FIELD_NUMBER;
      hash = (53 * hash) + getAdminUsers().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.Authorization parseFrom(
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

  public static Builder newBuilder(com.google.cloud.edgecontainer.v1.Authorization prototype) {
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
   * RBAC policy that will be applied and managed by GEC.
   * </pre>
   *
   * Protobuf type {@code google.cloud.edgecontainer.v1.Authorization}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.edgecontainer.v1.Authorization)
      com.google.cloud.edgecontainer.v1.AuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_Authorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_Authorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.edgecontainer.v1.Authorization.class,
              com.google.cloud.edgecontainer.v1.Authorization.Builder.class);
    }

    // Construct using com.google.cloud.edgecontainer.v1.Authorization.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      adminUsers_ = null;
      if (adminUsersBuilder_ != null) {
        adminUsersBuilder_.dispose();
        adminUsersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_Authorization_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.Authorization getDefaultInstanceForType() {
      return com.google.cloud.edgecontainer.v1.Authorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.Authorization build() {
      com.google.cloud.edgecontainer.v1.Authorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.Authorization buildPartial() {
      com.google.cloud.edgecontainer.v1.Authorization result =
          new com.google.cloud.edgecontainer.v1.Authorization(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.edgecontainer.v1.Authorization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.adminUsers_ = adminUsersBuilder_ == null ? adminUsers_ : adminUsersBuilder_.build();
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
      if (other instanceof com.google.cloud.edgecontainer.v1.Authorization) {
        return mergeFrom((com.google.cloud.edgecontainer.v1.Authorization) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.edgecontainer.v1.Authorization other) {
      if (other == com.google.cloud.edgecontainer.v1.Authorization.getDefaultInstance())
        return this;
      if (other.hasAdminUsers()) {
        mergeAdminUsers(other.getAdminUsers());
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
                input.readMessage(getAdminUsersFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.edgecontainer.v1.ClusterUser adminUsers_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.edgecontainer.v1.ClusterUser,
            com.google.cloud.edgecontainer.v1.ClusterUser.Builder,
            com.google.cloud.edgecontainer.v1.ClusterUserOrBuilder>
        adminUsersBuilder_;
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the adminUsers field is set.
     */
    public boolean hasAdminUsers() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The adminUsers.
     */
    public com.google.cloud.edgecontainer.v1.ClusterUser getAdminUsers() {
      if (adminUsersBuilder_ == null) {
        return adminUsers_ == null
            ? com.google.cloud.edgecontainer.v1.ClusterUser.getDefaultInstance()
            : adminUsers_;
      } else {
        return adminUsersBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAdminUsers(com.google.cloud.edgecontainer.v1.ClusterUser value) {
      if (adminUsersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adminUsers_ = value;
      } else {
        adminUsersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAdminUsers(
        com.google.cloud.edgecontainer.v1.ClusterUser.Builder builderForValue) {
      if (adminUsersBuilder_ == null) {
        adminUsers_ = builderForValue.build();
      } else {
        adminUsersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAdminUsers(com.google.cloud.edgecontainer.v1.ClusterUser value) {
      if (adminUsersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && adminUsers_ != null
            && adminUsers_ != com.google.cloud.edgecontainer.v1.ClusterUser.getDefaultInstance()) {
          getAdminUsersBuilder().mergeFrom(value);
        } else {
          adminUsers_ = value;
        }
      } else {
        adminUsersBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAdminUsers() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adminUsers_ = null;
      if (adminUsersBuilder_ != null) {
        adminUsersBuilder_.dispose();
        adminUsersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.edgecontainer.v1.ClusterUser.Builder getAdminUsersBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAdminUsersFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.edgecontainer.v1.ClusterUserOrBuilder getAdminUsersOrBuilder() {
      if (adminUsersBuilder_ != null) {
        return adminUsersBuilder_.getMessageOrBuilder();
      } else {
        return adminUsers_ == null
            ? com.google.cloud.edgecontainer.v1.ClusterUser.getDefaultInstance()
            : adminUsers_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User that will be granted the cluster-admin role on the cluster, providing
     * full access to the cluster. Currently, this is a singular field, but will
     * be expanded to allow multiple admins in the future.
     * </pre>
     *
     * <code>
     * .google.cloud.edgecontainer.v1.ClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.edgecontainer.v1.ClusterUser,
            com.google.cloud.edgecontainer.v1.ClusterUser.Builder,
            com.google.cloud.edgecontainer.v1.ClusterUserOrBuilder>
        getAdminUsersFieldBuilder() {
      if (adminUsersBuilder_ == null) {
        adminUsersBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.edgecontainer.v1.ClusterUser,
                com.google.cloud.edgecontainer.v1.ClusterUser.Builder,
                com.google.cloud.edgecontainer.v1.ClusterUserOrBuilder>(
                getAdminUsers(), getParentForChildren(), isClean());
        adminUsers_ = null;
      }
      return adminUsersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.edgecontainer.v1.Authorization)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.edgecontainer.v1.Authorization)
  private static final com.google.cloud.edgecontainer.v1.Authorization DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.edgecontainer.v1.Authorization();
  }

  public static com.google.cloud.edgecontainer.v1.Authorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Authorization> PARSER =
      new com.google.protobuf.AbstractParser<Authorization>() {
        @java.lang.Override
        public Authorization parsePartialFrom(
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

  public static com.google.protobuf.Parser<Authorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Authorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.Authorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
