// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public interface DatasetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only.
   * Dataset resource name, format is:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only.
   * Dataset resource name, format is:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the dataset. Maximum of 64 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the dataset. Maximum of 64 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-provided description of the annotation specification set.
   * The description can be up to 10000 characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. User-provided description of the annotation specification set.
   * The description can be up to 10000 characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time the dataset is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the dataset is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the dataset is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. This is populated with the original input configs
   * where ImportData is called. It is available only after the clients
   * import data to this dataset.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.InputConfig input_configs = 5;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.InputConfig> getInputConfigsList();
  /**
   *
   *
   * <pre>
   * Output only. This is populated with the original input configs
   * where ImportData is called. It is available only after the clients
   * import data to this dataset.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.InputConfig input_configs = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.InputConfig getInputConfigs(int index);
  /**
   *
   *
   * <pre>
   * Output only. This is populated with the original input configs
   * where ImportData is called. It is available only after the clients
   * import data to this dataset.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.InputConfig input_configs = 5;</code>
   */
  int getInputConfigsCount();
  /**
   *
   *
   * <pre>
   * Output only. This is populated with the original input configs
   * where ImportData is called. It is available only after the clients
   * import data to this dataset.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.InputConfig input_configs = 5;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.InputConfigOrBuilder>
      getInputConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. This is populated with the original input configs
   * where ImportData is called. It is available only after the clients
   * import data to this dataset.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.InputConfig input_configs = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.InputConfigOrBuilder getInputConfigsOrBuilder(int index);
}
