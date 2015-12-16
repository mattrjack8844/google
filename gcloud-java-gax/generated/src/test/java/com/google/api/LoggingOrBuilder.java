// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/logging.proto

package com.google.api;

public interface LoggingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Logging)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   */
  java.util.List<com.google.api.Logging.LoggingDestination> 
      getProducerDestinationsList();
  /**
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   */
  com.google.api.Logging.LoggingDestination getProducerDestinations(int index);
  /**
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   */
  int getProducerDestinationsCount();
  /**
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   */
  java.util.List<? extends com.google.api.Logging.LoggingDestinationOrBuilder> 
      getProducerDestinationsOrBuilderList();
  /**
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   */
  com.google.api.Logging.LoggingDestinationOrBuilder getProducerDestinationsOrBuilder(
      int index);

  /**
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   */
  java.util.List<com.google.api.Logging.LoggingDestination> 
      getConsumerDestinationsList();
  /**
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   */
  com.google.api.Logging.LoggingDestination getConsumerDestinations(int index);
  /**
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   */
  int getConsumerDestinationsCount();
  /**
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   */
  java.util.List<? extends com.google.api.Logging.LoggingDestinationOrBuilder> 
      getConsumerDestinationsOrBuilderList();
  /**
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   *
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   */
  com.google.api.Logging.LoggingDestinationOrBuilder getConsumerDestinationsOrBuilder(
      int index);
}
