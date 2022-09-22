// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/study.proto

package com.google.cloud.aiplatform.v1;

public interface TrialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Trial)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the Trial assigned by the service.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the Trial assigned by the service.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The identifier of the Trial assigned by the service.
   * </pre>
   *
   * <code>string id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. The identifier of the Trial assigned by the service.
   * </pre>
   *
   * <code>string id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. The detailed state of the Trial.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Trial.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The detailed state of the Trial.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Trial.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.aiplatform.v1.Trial.State getState();

  /**
   * <pre>
   * Output only. The parameters of the Trial.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Trial.Parameter> 
      getParametersList();
  /**
   * <pre>
   * Output only. The parameters of the Trial.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.Trial.Parameter getParameters(int index);
  /**
   * <pre>
   * Output only. The parameters of the Trial.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * Output only. The parameters of the Trial.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.Trial.ParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <pre>
   * Output only. The parameters of the Trial.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.Trial.ParameterOrBuilder getParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The final measurement containing the objective value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Measurement final_measurement = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the finalMeasurement field is set.
   */
  boolean hasFinalMeasurement();
  /**
   * <pre>
   * Output only. The final measurement containing the objective value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Measurement final_measurement = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The finalMeasurement.
   */
  com.google.cloud.aiplatform.v1.Measurement getFinalMeasurement();
  /**
   * <pre>
   * Output only. The final measurement containing the objective value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Measurement final_measurement = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.MeasurementOrBuilder getFinalMeasurementOrBuilder();

  /**
   * <pre>
   * Output only. A list of measurements that are strictly lexicographically
   * ordered by their induced tuples (steps, elapsed_duration).
   * These are used for early stopping computations.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Measurement measurements = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Measurement> 
      getMeasurementsList();
  /**
   * <pre>
   * Output only. A list of measurements that are strictly lexicographically
   * ordered by their induced tuples (steps, elapsed_duration).
   * These are used for early stopping computations.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Measurement measurements = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.Measurement getMeasurements(int index);
  /**
   * <pre>
   * Output only. A list of measurements that are strictly lexicographically
   * ordered by their induced tuples (steps, elapsed_duration).
   * These are used for early stopping computations.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Measurement measurements = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getMeasurementsCount();
  /**
   * <pre>
   * Output only. A list of measurements that are strictly lexicographically
   * ordered by their induced tuples (steps, elapsed_duration).
   * These are used for early stopping computations.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Measurement measurements = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.MeasurementOrBuilder> 
      getMeasurementsOrBuilderList();
  /**
   * <pre>
   * Output only. A list of measurements that are strictly lexicographically
   * ordered by their induced tuples (steps, elapsed_duration).
   * These are used for early stopping computations.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Measurement measurements = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.MeasurementOrBuilder getMeasurementsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Time when the Trial was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Output only. Time when the Trial was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Output only. Time when the Trial was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time when the Trial's status changed to `SUCCEEDED` or `INFEASIBLE`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. Time when the Trial's status changed to `SUCCEEDED` or `INFEASIBLE`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Output only. Time when the Trial's status changed to `SUCCEEDED` or `INFEASIBLE`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. The identifier of the client that originally requested this Trial.
   * Each client is identified by a unique client_id. When a client
   * asks for a suggestion, Vertex AI Vizier will assign it a Trial. The client
   * should evaluate the Trial, complete it, and report back to Vertex AI
   * Vizier. If suggestion is asked again by same client_id before the Trial is
   * completed, the same Trial will be returned. Multiple clients with
   * different client_ids can ask for suggestions simultaneously, each of them
   * will get their own Trial.
   * </pre>
   *
   * <code>string client_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * Output only. The identifier of the client that originally requested this Trial.
   * Each client is identified by a unique client_id. When a client
   * asks for a suggestion, Vertex AI Vizier will assign it a Trial. The client
   * should evaluate the Trial, complete it, and report back to Vertex AI
   * Vizier. If suggestion is asked again by same client_id before the Trial is
   * completed, the same Trial will be returned. Multiple clients with
   * different client_ids can ask for suggestions simultaneously, each of them
   * will get their own Trial.
   * </pre>
   *
   * <code>string client_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * Output only. A human readable string describing why the Trial is
   * infeasible. This is set only if Trial state is `INFEASIBLE`.
   * </pre>
   *
   * <code>string infeasible_reason = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The infeasibleReason.
   */
  java.lang.String getInfeasibleReason();
  /**
   * <pre>
   * Output only. A human readable string describing why the Trial is
   * infeasible. This is set only if Trial state is `INFEASIBLE`.
   * </pre>
   *
   * <code>string infeasible_reason = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for infeasibleReason.
   */
  com.google.protobuf.ByteString
      getInfeasibleReasonBytes();

  /**
   * <pre>
   * Output only. The CustomJob name linked to the Trial.
   * It's set for a HyperparameterTuningJob's Trial.
   * </pre>
   *
   * <code>string custom_job = 11 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The customJob.
   */
  java.lang.String getCustomJob();
  /**
   * <pre>
   * Output only. The CustomJob name linked to the Trial.
   * It's set for a HyperparameterTuningJob's Trial.
   * </pre>
   *
   * <code>string custom_job = 11 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customJob.
   */
  com.google.protobuf.ByteString
      getCustomJobBytes();

  /**
   * <pre>
   * Output only. URIs for accessing [interactive
   * shells](https://cloud.google.com/vertex-ai/docs/training/monitor-debug-interactive-shell)
   * (one URI for each training node). Only available if this trial is part of
   * a [HyperparameterTuningJob][google.cloud.aiplatform.v1.HyperparameterTuningJob] and the job's
   * [trial_job_spec.enable_web_access][google.cloud.aiplatform.v1.CustomJobSpec.enable_web_access] field
   * is `true`.
   * The keys are names of each node used for the trial; for example,
   * `workerpool0-0` for the primary node, `workerpool1-0` for the first node in
   * the second worker pool, and `workerpool1-1` for the second node in the
   * second worker pool.
   * The values are the URIs for each node's interactive shell.
   * </pre>
   *
   * <code>map&lt;string, string&gt; web_access_uris = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getWebAccessUrisCount();
  /**
   * <pre>
   * Output only. URIs for accessing [interactive
   * shells](https://cloud.google.com/vertex-ai/docs/training/monitor-debug-interactive-shell)
   * (one URI for each training node). Only available if this trial is part of
   * a [HyperparameterTuningJob][google.cloud.aiplatform.v1.HyperparameterTuningJob] and the job's
   * [trial_job_spec.enable_web_access][google.cloud.aiplatform.v1.CustomJobSpec.enable_web_access] field
   * is `true`.
   * The keys are names of each node used for the trial; for example,
   * `workerpool0-0` for the primary node, `workerpool1-0` for the first node in
   * the second worker pool, and `workerpool1-1` for the second node in the
   * second worker pool.
   * The values are the URIs for each node's interactive shell.
   * </pre>
   *
   * <code>map&lt;string, string&gt; web_access_uris = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean containsWebAccessUris(
      java.lang.String key);
  /**
   * Use {@link #getWebAccessUrisMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getWebAccessUris();
  /**
   * <pre>
   * Output only. URIs for accessing [interactive
   * shells](https://cloud.google.com/vertex-ai/docs/training/monitor-debug-interactive-shell)
   * (one URI for each training node). Only available if this trial is part of
   * a [HyperparameterTuningJob][google.cloud.aiplatform.v1.HyperparameterTuningJob] and the job's
   * [trial_job_spec.enable_web_access][google.cloud.aiplatform.v1.CustomJobSpec.enable_web_access] field
   * is `true`.
   * The keys are names of each node used for the trial; for example,
   * `workerpool0-0` for the primary node, `workerpool1-0` for the first node in
   * the second worker pool, and `workerpool1-1` for the second node in the
   * second worker pool.
   * The values are the URIs for each node's interactive shell.
   * </pre>
   *
   * <code>map&lt;string, string&gt; web_access_uris = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getWebAccessUrisMap();
  /**
   * <pre>
   * Output only. URIs for accessing [interactive
   * shells](https://cloud.google.com/vertex-ai/docs/training/monitor-debug-interactive-shell)
   * (one URI for each training node). Only available if this trial is part of
   * a [HyperparameterTuningJob][google.cloud.aiplatform.v1.HyperparameterTuningJob] and the job's
   * [trial_job_spec.enable_web_access][google.cloud.aiplatform.v1.CustomJobSpec.enable_web_access] field
   * is `true`.
   * The keys are names of each node used for the trial; for example,
   * `workerpool0-0` for the primary node, `workerpool1-0` for the first node in
   * the second worker pool, and `workerpool1-1` for the second node in the
   * second worker pool.
   * The values are the URIs for each node's interactive shell.
   * </pre>
   *
   * <code>map&lt;string, string&gt; web_access_uris = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  /* nullable */
java.lang.String getWebAccessUrisOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Output only. URIs for accessing [interactive
   * shells](https://cloud.google.com/vertex-ai/docs/training/monitor-debug-interactive-shell)
   * (one URI for each training node). Only available if this trial is part of
   * a [HyperparameterTuningJob][google.cloud.aiplatform.v1.HyperparameterTuningJob] and the job's
   * [trial_job_spec.enable_web_access][google.cloud.aiplatform.v1.CustomJobSpec.enable_web_access] field
   * is `true`.
   * The keys are names of each node used for the trial; for example,
   * `workerpool0-0` for the primary node, `workerpool1-0` for the first node in
   * the second worker pool, and `workerpool1-1` for the second node in the
   * second worker pool.
   * The values are the URIs for each node's interactive shell.
   * </pre>
   *
   * <code>map&lt;string, string&gt; web_access_uris = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  java.lang.String getWebAccessUrisOrThrow(
      java.lang.String key);
}
