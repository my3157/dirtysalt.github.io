// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/message.proto

package com.dirlt.java.mr.proto;

public final class MessageProtos1 {
  private MessageProtos1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Message extends
      com.google.protobuf.GeneratedMessage {
    // Use Message.newBuilder() to construct.
    private Message() {
      initFields();
    }
    private Message(boolean noInit) {}
    
    private static final Message defaultInstance;
    public static Message getDefaultInstance() {
      return defaultInstance;
    }
    
    public Message getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dirlt.java.mr.proto.MessageProtos1.internal_static_com_dirlt_java_mr_proto_Message_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dirlt.java.mr.proto.MessageProtos1.internal_static_com_dirlt_java_mr_proto_Message_fieldAccessorTable;
    }
    
    // required string text = 1;
    public static final int TEXT_FIELD_NUMBER = 1;
    private boolean hasText;
    private java.lang.String text_ = "";
    public boolean hasText() { return hasText; }
    public java.lang.String getText() { return text_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasText) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasText()) {
        output.writeString(1, getText());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasText()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getText());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dirlt.java.mr.proto.MessageProtos1.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dirlt.java.mr.proto.MessageProtos1.Message prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.dirlt.java.mr.proto.MessageProtos1.Message result;
      
      // Construct using com.dirlt.java.mr.proto.MessageProtos1.Message.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.dirlt.java.mr.proto.MessageProtos1.Message();
        return builder;
      }
      
      protected com.dirlt.java.mr.proto.MessageProtos1.Message internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.dirlt.java.mr.proto.MessageProtos1.Message();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dirlt.java.mr.proto.MessageProtos1.Message.getDescriptor();
      }
      
      public com.dirlt.java.mr.proto.MessageProtos1.Message getDefaultInstanceForType() {
        return com.dirlt.java.mr.proto.MessageProtos1.Message.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.dirlt.java.mr.proto.MessageProtos1.Message build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.dirlt.java.mr.proto.MessageProtos1.Message buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.dirlt.java.mr.proto.MessageProtos1.Message buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.dirlt.java.mr.proto.MessageProtos1.Message returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dirlt.java.mr.proto.MessageProtos1.Message) {
          return mergeFrom((com.dirlt.java.mr.proto.MessageProtos1.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.dirlt.java.mr.proto.MessageProtos1.Message other) {
        if (other == com.dirlt.java.mr.proto.MessageProtos1.Message.getDefaultInstance()) return this;
        if (other.hasText()) {
          setText(other.getText());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setText(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required string text = 1;
      public boolean hasText() {
        return result.hasText();
      }
      public java.lang.String getText() {
        return result.getText();
      }
      public Builder setText(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasText = true;
        result.text_ = value;
        return this;
      }
      public Builder clearText() {
        result.hasText = false;
        result.text_ = getDefaultInstance().getText();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.dirlt.java.mr.proto.Message)
    }
    
    static {
      defaultInstance = new Message(true);
      com.dirlt.java.mr.proto.MessageProtos1.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.dirlt.java.mr.proto.Message)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dirlt_java_mr_proto_Message_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_dirlt_java_mr_proto_Message_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034src/main/proto/message.proto\022\027com.dirl" +
      "t.java.mr.proto\"\027\n\007Message\022\014\n\004text\030\001 \002(\t" +
      "B\020B\016MessageProtos1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_dirlt_java_mr_proto_Message_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_dirlt_java_mr_proto_Message_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_dirlt_java_mr_proto_Message_descriptor,
              new java.lang.String[] { "Text", },
              com.dirlt.java.mr.proto.MessageProtos1.Message.class,
              com.dirlt.java.mr.proto.MessageProtos1.Message.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}