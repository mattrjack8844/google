// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/system_parameter.proto

package com.google.api;

public interface SystemParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.SystemParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Define system parameters.
   *
   * The parameters defined here will override the default parameters
   * implemented by the system. If this field is missing from the service
   * config, default system parameters will be used. Default system parameters
   * and names is implementation-dependent.
   *
   * Example: define api key for all methods
   *
   *     system_parameters
   *       rules:
   *         - selector: "*"
   *           parameters:
   *             - name: api_key
   *               url_query_parameter: api_key
   *
   *
   * Example: define 2 api key names for a specific method.
   *
   *     system_parameters
   *       rules:
   *         - selector: "/ListShelves"
   *           parameters:
   *             - name: api_key
   *               http_header: Api-Key1
   *             - name: api_key
   *               http_header: Api-Key2
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameterRule rules = 1;</code>
   */
  java.util.List<com.google.api.SystemParameterRule> 
      getRulesList();
  /**
   * <pre>
   * Define system parameters.
   *
   * The parameters defined here will override the default parameters
   * implemented by the system. If this field is missing from the service
   * config, default system parameters will be used. Default system parameters
   * and names is implementation-dependent.
   *
   * Example: define api key for all methods
   *
   *     system_parameters
   *       rules:
   *         - selector: "*"
   *           parameters:
   *             - name: api_key
   *               url_query_parameter: api_key
   *
   *
   * Example: define 2 api key names for a specific method.
   *
   *     system_parameters
   *       rules:
   *         - selector: "/ListShelves"
   *           parameters:
   *             - name: api_key
   *               http_header: Api-Key1
   *             - name: api_key
   *               http_header: Api-Key2
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameterRule rules = 1;</code>
   */
  com.google.api.SystemParameterRule getRules(int index);
  /**
   * <pre>
   * Define system parameters.
   *
   * The parameters defined here will override the default parameters
   * implemented by the system. If this field is missing from the service
   * config, default system parameters will be used. Default system parameters
   * and names is implementation-dependent.
   *
   * Example: define api key for all methods
   *
   *     system_parameters
   *       rules:
   *         - selector: "*"
   *           parameters:
   *             - name: api_key
   *               url_query_parameter: api_key
   *
   *
   * Example: define 2 api key names for a specific method.
   *
   *     system_parameters
   *       rules:
   *         - selector: "/ListShelves"
   *           parameters:
   *             - name: api_key
   *               http_header: Api-Key1
   *             - name: api_key
   *               http_header: Api-Key2
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameterRule rules = 1;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * Define system parameters.
   *
   * The parameters defined here will override the default parameters
   * implemented by the system. If this field is missing from the service
   * config, default system parameters will be used. Default system parameters
   * and names is implementation-dependent.
   *
   * Example: define api key for all methods
   *
   *     system_parameters
   *       rules:
   *         - selector: "*"
   *           parameters:
   *             - name: api_key
   *               url_query_parameter: api_key
   *
   *
   * Example: define 2 api key names for a specific method.
   *
   *     system_parameters
   *       rules:
   *         - selector: "/ListShelves"
   *           parameters:
   *             - name: api_key
   *               http_header: Api-Key1
   *             - name: api_key
   *               http_header: Api-Key2
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameterRule rules = 1;</code>
   */
  java.util.List<? extends com.google.api.SystemParameterRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * Define system parameters.
   *
   * The parameters defined here will override the default parameters
   * implemented by the system. If this field is missing from the service
   * config, default system parameters will be used. Default system parameters
   * and names is implementation-dependent.
   *
   * Example: define api key for all methods
   *
   *     system_parameters
   *       rules:
   *         - selector: "*"
   *           parameters:
   *             - name: api_key
   *               url_query_parameter: api_key
   *
   *
   * Example: define 2 api key names for a specific method.
   *
   *     system_parameters
   *       rules:
   *         - selector: "/ListShelves"
   *           parameters:
   *             - name: api_key
   *               http_header: Api-Key1
   *             - name: api_key
   *               http_header: Api-Key2
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.SystemParameterRule rules = 1;</code>
   */
  com.google.api.SystemParameterRuleOrBuilder getRulesOrBuilder(
      int index);
}
