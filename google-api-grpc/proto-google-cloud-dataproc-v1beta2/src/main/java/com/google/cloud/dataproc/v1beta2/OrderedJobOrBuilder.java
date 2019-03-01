// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface OrderedJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.OrderedJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The step id. The id must be unique among all jobs
   * within the template.
   * The step id is used as prefix for job id, as job
   * `goog-dataproc-workflow-step-id` label, and in
   * [prerequisiteStepIds][google.cloud.dataproc.v1beta2.OrderedJob.prerequisite_step_ids]
   * field from other steps.
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string step_id = 1;</code>
   */
  java.lang.String getStepId();
  /**
   *
   *
   * <pre>
   * Required. The step id. The id must be unique among all jobs
   * within the template.
   * The step id is used as prefix for job id, as job
   * `goog-dataproc-workflow-step-id` label, and in
   * [prerequisiteStepIds][google.cloud.dataproc.v1beta2.OrderedJob.prerequisite_step_ids]
   * field from other steps.
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string step_id = 1;</code>
   */
  com.google.protobuf.ByteString getStepIdBytes();

  /**
   *
   *
   * <pre>
   * Job is a Hadoop job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HadoopJob hadoop_job = 2;</code>
   */
  boolean hasHadoopJob();
  /**
   *
   *
   * <pre>
   * Job is a Hadoop job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HadoopJob hadoop_job = 2;</code>
   */
  com.google.cloud.dataproc.v1beta2.HadoopJob getHadoopJob();
  /**
   *
   *
   * <pre>
   * Job is a Hadoop job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HadoopJob hadoop_job = 2;</code>
   */
  com.google.cloud.dataproc.v1beta2.HadoopJobOrBuilder getHadoopJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Spark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkJob spark_job = 3;</code>
   */
  boolean hasSparkJob();
  /**
   *
   *
   * <pre>
   * Job is a Spark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkJob spark_job = 3;</code>
   */
  com.google.cloud.dataproc.v1beta2.SparkJob getSparkJob();
  /**
   *
   *
   * <pre>
   * Job is a Spark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkJob spark_job = 3;</code>
   */
  com.google.cloud.dataproc.v1beta2.SparkJobOrBuilder getSparkJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Pyspark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PySparkJob pyspark_job = 4;</code>
   */
  boolean hasPysparkJob();
  /**
   *
   *
   * <pre>
   * Job is a Pyspark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PySparkJob pyspark_job = 4;</code>
   */
  com.google.cloud.dataproc.v1beta2.PySparkJob getPysparkJob();
  /**
   *
   *
   * <pre>
   * Job is a Pyspark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PySparkJob pyspark_job = 4;</code>
   */
  com.google.cloud.dataproc.v1beta2.PySparkJobOrBuilder getPysparkJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HiveJob hive_job = 5;</code>
   */
  boolean hasHiveJob();
  /**
   *
   *
   * <pre>
   * Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HiveJob hive_job = 5;</code>
   */
  com.google.cloud.dataproc.v1beta2.HiveJob getHiveJob();
  /**
   *
   *
   * <pre>
   * Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HiveJob hive_job = 5;</code>
   */
  com.google.cloud.dataproc.v1beta2.HiveJobOrBuilder getHiveJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PigJob pig_job = 6;</code>
   */
  boolean hasPigJob();
  /**
   *
   *
   * <pre>
   * Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PigJob pig_job = 6;</code>
   */
  com.google.cloud.dataproc.v1beta2.PigJob getPigJob();
  /**
   *
   *
   * <pre>
   * Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PigJob pig_job = 6;</code>
   */
  com.google.cloud.dataproc.v1beta2.PigJobOrBuilder getPigJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a SparkSql job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkSqlJob spark_sql_job = 7;</code>
   */
  boolean hasSparkSqlJob();
  /**
   *
   *
   * <pre>
   * Job is a SparkSql job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkSqlJob spark_sql_job = 7;</code>
   */
  com.google.cloud.dataproc.v1beta2.SparkSqlJob getSparkSqlJob();
  /**
   *
   *
   * <pre>
   * Job is a SparkSql job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkSqlJob spark_sql_job = 7;</code>
   */
  com.google.cloud.dataproc.v1beta2.SparkSqlJobOrBuilder getSparkSqlJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 9;</code>
   */
  boolean hasScheduling();
  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 9;</code>
   */
  com.google.cloud.dataproc.v1beta2.JobScheduling getScheduling();
  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 9;</code>
   */
  com.google.cloud.dataproc.v1beta2.JobSchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The optional list of prerequisite job step_ids.
   * If not specified, the job will start at the beginning of workflow.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 10;</code>
   */
  java.util.List<java.lang.String> getPrerequisiteStepIdsList();
  /**
   *
   *
   * <pre>
   * Optional. The optional list of prerequisite job step_ids.
   * If not specified, the job will start at the beginning of workflow.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 10;</code>
   */
  int getPrerequisiteStepIdsCount();
  /**
   *
   *
   * <pre>
   * Optional. The optional list of prerequisite job step_ids.
   * If not specified, the job will start at the beginning of workflow.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 10;</code>
   */
  java.lang.String getPrerequisiteStepIds(int index);
  /**
   *
   *
   * <pre>
   * Optional. The optional list of prerequisite job step_ids.
   * If not specified, the job will start at the beginning of workflow.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 10;</code>
   */
  com.google.protobuf.ByteString getPrerequisiteStepIdsBytes(int index);

  public com.google.cloud.dataproc.v1beta2.OrderedJob.JobTypeCase getJobTypeCase();
}
