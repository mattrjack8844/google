// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/iamcredentials.proto

package google.iam.credentials.v1;

public final class Iamcredentials {
  private Iamcredentials() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/iam/credentials/v1/iamcredentia" +
      "ls.proto\022\031google.iam.credentials.v1\032\034goo" +
      "gle/api/annotations.proto\032&google/iam/cr" +
      "edentials/v1/common.proto2\353\007\n\016IAMCredent" +
      "ials\022\314\001\n\023GenerateAccessToken\0225.google.ia" +
      "m.credentials.v1.GenerateAccessTokenRequ" +
      "est\0326.google.iam.credentials.v1.Generate" +
      "AccessTokenResponse\"F\202\323\344\223\002@\";/v1/{name=p" +
      "rojects/*/serviceAccounts/*}:generateAcc" +
      "essToken:\001*\022\274\001\n\017GenerateIdToken\0221.google" +
      ".iam.credentials.v1.GenerateIdTokenReque" +
      "st\0322.google.iam.credentials.v1.GenerateI" +
      "dTokenResponse\"B\202\323\344\223\002<\"7/v1/{name=projec" +
      "ts/*/serviceAccounts/*}:generateIdToken:" +
      "\001*\022\240\001\n\010SignBlob\022*.google.iam.credentials" +
      ".v1.SignBlobRequest\032+.google.iam.credent" +
      "ials.v1.SignBlobResponse\";\202\323\344\223\0025\"0/v1/{n" +
      "ame=projects/*/serviceAccounts/*}:signBl" +
      "ob:\001*\022\234\001\n\007SignJwt\022).google.iam.credentia" +
      "ls.v1.SignJwtRequest\032*.google.iam.creden" +
      "tials.v1.SignJwtResponse\":\202\323\344\223\0024\"//v1/{n" +
      "ame=projects/*/serviceAccounts/*}:signJw" +
      "t:\001*\022\210\002\n\"GenerateIdentityBindingAccessTo" +
      "ken\022D.google.iam.credentials.v1.Generate" +
      "IdentityBindingAccessTokenRequest\032E.goog" +
      "le.iam.credentials.v1.GenerateIdentityBi" +
      "ndingAccessTokenResponse\"U\202\323\344\223\002O\"J/v1/{n" +
      "ame=projects/*/serviceAccounts/*}:genera" +
      "teIdentityBindingAccessToken:\001*BIZDgoogl" +
      "e.golang.org/genproto/googleapis/iam/cre" +
      "dentials/v1;credentials\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.iam.credentials.v1.IAMCredentialsCommonProto.getDescriptor(),
        }, assigner);
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.iam.credentials.v1.IAMCredentialsCommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
