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
// source: google/cloud/automl/v1beta1/io.proto

package com.google.cloud.automl.v1beta1;

public interface ModelExportOutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ModelExportOutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the model is to be written to.
   * This location may only be set for the following model formats:
   *   "tflite", "edgetpu_tflite", "tf_saved_model", "tf_js", "core_ml".
   *  Under the directory given as the destination a new one with name
   *  "model-export-&lt;model-display-name&gt;-&lt;timestamp-of-export-call&gt;",
   *  where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format,
   *  will be created. Inside the model and any of its supporting files
   *  will be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the model is to be written to.
   * This location may only be set for the following model formats:
   *   "tflite", "edgetpu_tflite", "tf_saved_model", "tf_js", "core_ml".
   *  Under the directory given as the destination a new one with name
   *  "model-export-&lt;model-display-name&gt;-&lt;timestamp-of-export-call&gt;",
   *  where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format,
   *  will be created. Inside the model and any of its supporting files
   *  will be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.automl.v1beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the model is to be written to.
   * This location may only be set for the following model formats:
   *   "tflite", "edgetpu_tflite", "tf_saved_model", "tf_js", "core_ml".
   *  Under the directory given as the destination a new one with name
   *  "model-export-&lt;model-display-name&gt;-&lt;timestamp-of-export-call&gt;",
   *  where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format,
   *  will be created. Inside the model and any of its supporting files
   *  will be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * The GCR location where model image is to be pushed to. This location
   * may only be set for the following model formats:
   *   "docker".
   * The model image will be created under the given URI.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcrDestination gcr_destination = 3;</code>
   *
   * @return Whether the gcrDestination field is set.
   */
  boolean hasGcrDestination();
  /**
   *
   *
   * <pre>
   * The GCR location where model image is to be pushed to. This location
   * may only be set for the following model formats:
   *   "docker".
   * The model image will be created under the given URI.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcrDestination gcr_destination = 3;</code>
   *
   * @return The gcrDestination.
   */
  com.google.cloud.automl.v1beta1.GcrDestination getGcrDestination();
  /**
   *
   *
   * <pre>
   * The GCR location where model image is to be pushed to. This location
   * may only be set for the following model formats:
   *   "docker".
   * The model image will be created under the given URI.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcrDestination gcr_destination = 3;</code>
   */
  com.google.cloud.automl.v1beta1.GcrDestinationOrBuilder getGcrDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * The format in which the model must be exported. The available, and default,
   * formats depend on the problem and model type (if given problem and type
   * combination doesn't have a format listed, it means its models are not
   * exportable):
   * *  For Image Classification mobile-low-latency-1, mobile-versatile-1,
   *        mobile-high-accuracy-1:
   *      "tflite" (default), "edgetpu_tflite", "tf_saved_model", "tf_js",
   *      "docker".
   * *  For Image Classification mobile-core-ml-low-latency-1,
   *        mobile-core-ml-versatile-1, mobile-core-ml-high-accuracy-1:
   *      "core_ml" (default).
   * *  For Image Object Detection mobile-low-latency-1, mobile-versatile-1,
   *        mobile-high-accuracy-1:
   *      "tflite", "tf_saved_model", "tf_js".
   * *  For Video Classification cloud,
   *      "tf_saved_model".
   * *  For Video Object Tracking cloud,
   *      "tf_saved_model".
   * *  For Video Object Tracking mobile-versatile-1:
   *      "tflite", "edgetpu_tflite", "tf_saved_model", "docker".
   * *  For Video Object Tracking mobile-coral-versatile-1:
   *      "tflite", "edgetpu_tflite", "docker".
   * *  For Video Object Tracking mobile-coral-low-latency-1:
   *      "tflite", "edgetpu_tflite", "docker".
   * *  For Video Object Tracking mobile-jetson-versatile-1:
   *      "tf_saved_model", "docker".
   * *  For Tables:
   *      "docker".
   * Formats description:
   * * tflite - Used for Android mobile devices.
   * * edgetpu_tflite - Used for [Edge TPU](https://cloud.google.com/edge-tpu/)
   *                    devices.
   * * tf_saved_model - A tensorflow model in SavedModel format.
   * * tf_js - A [TensorFlow.js](https://www.tensorflow.org/js) model that can
   *           be used in the browser and in Node.js using JavaScript.
   * * docker - Used for Docker containers. Use the params field to customize
   *            the container. The container is verified to work correctly on
   *            ubuntu 16.04 operating system. See more at
   *            [containers
   * quickstart](https:
   * //cloud.google.com/vision/automl/docs/containers-gcs-quickstart)
   * * core_ml - Used for iOS mobile devices.
   * </pre>
   *
   * <code>string model_format = 4;</code>
   *
   * @return The modelFormat.
   */
  java.lang.String getModelFormat();
  /**
   *
   *
   * <pre>
   * The format in which the model must be exported. The available, and default,
   * formats depend on the problem and model type (if given problem and type
   * combination doesn't have a format listed, it means its models are not
   * exportable):
   * *  For Image Classification mobile-low-latency-1, mobile-versatile-1,
   *        mobile-high-accuracy-1:
   *      "tflite" (default), "edgetpu_tflite", "tf_saved_model", "tf_js",
   *      "docker".
   * *  For Image Classification mobile-core-ml-low-latency-1,
   *        mobile-core-ml-versatile-1, mobile-core-ml-high-accuracy-1:
   *      "core_ml" (default).
   * *  For Image Object Detection mobile-low-latency-1, mobile-versatile-1,
   *        mobile-high-accuracy-1:
   *      "tflite", "tf_saved_model", "tf_js".
   * *  For Video Classification cloud,
   *      "tf_saved_model".
   * *  For Video Object Tracking cloud,
   *      "tf_saved_model".
   * *  For Video Object Tracking mobile-versatile-1:
   *      "tflite", "edgetpu_tflite", "tf_saved_model", "docker".
   * *  For Video Object Tracking mobile-coral-versatile-1:
   *      "tflite", "edgetpu_tflite", "docker".
   * *  For Video Object Tracking mobile-coral-low-latency-1:
   *      "tflite", "edgetpu_tflite", "docker".
   * *  For Video Object Tracking mobile-jetson-versatile-1:
   *      "tf_saved_model", "docker".
   * *  For Tables:
   *      "docker".
   * Formats description:
   * * tflite - Used for Android mobile devices.
   * * edgetpu_tflite - Used for [Edge TPU](https://cloud.google.com/edge-tpu/)
   *                    devices.
   * * tf_saved_model - A tensorflow model in SavedModel format.
   * * tf_js - A [TensorFlow.js](https://www.tensorflow.org/js) model that can
   *           be used in the browser and in Node.js using JavaScript.
   * * docker - Used for Docker containers. Use the params field to customize
   *            the container. The container is verified to work correctly on
   *            ubuntu 16.04 operating system. See more at
   *            [containers
   * quickstart](https:
   * //cloud.google.com/vision/automl/docs/containers-gcs-quickstart)
   * * core_ml - Used for iOS mobile devices.
   * </pre>
   *
   * <code>string model_format = 4;</code>
   *
   * @return The bytes for modelFormat.
   */
  com.google.protobuf.ByteString getModelFormatBytes();

  /**
   *
   *
   * <pre>
   * Additional model-type and format specific parameters describing the
   * requirements for the to be exported model files, any string must be up to
   * 25000 characters long.
   *  * For `docker` format:
   *     `cpu_architecture` - (string) "x86_64" (default).
   *     `gpu_architecture` - (string) "none" (default), "nvidia".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  int getParamsCount();
  /**
   *
   *
   * <pre>
   * Additional model-type and format specific parameters describing the
   * requirements for the to be exported model files, any string must be up to
   * 25000 characters long.
   *  * For `docker` format:
   *     `cpu_architecture` - (string) "x86_64" (default).
   *     `gpu_architecture` - (string) "none" (default), "nvidia".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  boolean containsParams(java.lang.String key);
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParams();
  /**
   *
   *
   * <pre>
   * Additional model-type and format specific parameters describing the
   * requirements for the to be exported model files, any string must be up to
   * 25000 characters long.
   *  * For `docker` format:
   *     `cpu_architecture` - (string) "x86_64" (default).
   *     `gpu_architecture` - (string) "none" (default), "nvidia".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParamsMap();
  /**
   *
   *
   * <pre>
   * Additional model-type and format specific parameters describing the
   * requirements for the to be exported model files, any string must be up to
   * 25000 characters long.
   *  * For `docker` format:
   *     `cpu_architecture` - (string) "x86_64" (default).
   *     `gpu_architecture` - (string) "none" (default), "nvidia".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  /* nullable */
  java.lang.String getParamsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Additional model-type and format specific parameters describing the
   * requirements for the to be exported model files, any string must be up to
   * 25000 characters long.
   *  * For `docker` format:
   *     `cpu_architecture` - (string) "x86_64" (default).
   *     `gpu_architecture` - (string) "none" (default), "nvidia".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  java.lang.String getParamsOrThrow(java.lang.String key);

  public com.google.cloud.automl.v1beta1.ModelExportOutputConfig.DestinationCase
      getDestinationCase();
}
