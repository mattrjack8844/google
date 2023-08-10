// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface TransitionCoverageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.TransitionCoverage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of Transitions present in the agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.Transition transitions = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.Transition> 
      getTransitionsList();
  /**
   * <pre>
   * The list of Transitions present in the agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.Transition transitions = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.Transition getTransitions(int index);
  /**
   * <pre>
   * The list of Transitions present in the agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.Transition transitions = 1;</code>
   */
  int getTransitionsCount();
  /**
   * <pre>
   * The list of Transitions present in the agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.Transition transitions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.TransitionOrBuilder> 
      getTransitionsOrBuilderList();
  /**
   * <pre>
   * The list of Transitions present in the agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.Transition transitions = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionCoverage.TransitionOrBuilder getTransitionsOrBuilder(
      int index);

  /**
   * <pre>
   * The percent of transitions in the agent that are covered.
   * </pre>
   *
   * <code>float coverage_score = 2;</code>
   * @return The coverageScore.
   */
  float getCoverageScore();
}
