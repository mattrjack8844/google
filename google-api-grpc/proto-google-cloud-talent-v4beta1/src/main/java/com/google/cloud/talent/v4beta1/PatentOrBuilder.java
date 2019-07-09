// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface PatentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Patent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Name of the patent.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. Name of the patent.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A list of inventors' names.
   * Number of characters allowed for each is 100.
   * </pre>
   *
   * <code>repeated string inventors = 2;</code>
   */
  java.util.List<java.lang.String> getInventorsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of inventors' names.
   * Number of characters allowed for each is 100.
   * </pre>
   *
   * <code>repeated string inventors = 2;</code>
   */
  int getInventorsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of inventors' names.
   * Number of characters allowed for each is 100.
   * </pre>
   *
   * <code>repeated string inventors = 2;</code>
   */
  java.lang.String getInventors(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of inventors' names.
   * Number of characters allowed for each is 100.
   * </pre>
   *
   * <code>repeated string inventors = 2;</code>
   */
  com.google.protobuf.ByteString getInventorsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The status of the patent.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string patent_status = 3;</code>
   */
  java.lang.String getPatentStatus();
  /**
   *
   *
   * <pre>
   * Optional. The status of the patent.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string patent_status = 3;</code>
   */
  com.google.protobuf.ByteString getPatentStatusBytes();

  /**
   *
   *
   * <pre>
   * Optional. The date the last time the status of the patent was checked.
   * </pre>
   *
   * <code>.google.type.Date patent_status_date = 4;</code>
   */
  boolean hasPatentStatusDate();
  /**
   *
   *
   * <pre>
   * Optional. The date the last time the status of the patent was checked.
   * </pre>
   *
   * <code>.google.type.Date patent_status_date = 4;</code>
   */
  com.google.type.Date getPatentStatusDate();
  /**
   *
   *
   * <pre>
   * Optional. The date the last time the status of the patent was checked.
   * </pre>
   *
   * <code>.google.type.Date patent_status_date = 4;</code>
   */
  com.google.type.DateOrBuilder getPatentStatusDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The date that the patent was filed.
   * </pre>
   *
   * <code>.google.type.Date patent_filing_date = 5;</code>
   */
  boolean hasPatentFilingDate();
  /**
   *
   *
   * <pre>
   * Optional. The date that the patent was filed.
   * </pre>
   *
   * <code>.google.type.Date patent_filing_date = 5;</code>
   */
  com.google.type.Date getPatentFilingDate();
  /**
   *
   *
   * <pre>
   * Optional. The date that the patent was filed.
   * </pre>
   *
   * <code>.google.type.Date patent_filing_date = 5;</code>
   */
  com.google.type.DateOrBuilder getPatentFilingDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The name of the patent office.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string patent_office = 6;</code>
   */
  java.lang.String getPatentOffice();
  /**
   *
   *
   * <pre>
   * Optional. The name of the patent office.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string patent_office = 6;</code>
   */
  com.google.protobuf.ByteString getPatentOfficeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of the patent.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string patent_number = 7;</code>
   */
  java.lang.String getPatentNumber();
  /**
   *
   *
   * <pre>
   * Optional. The number of the patent.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string patent_number = 7;</code>
   */
  com.google.protobuf.ByteString getPatentNumberBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of the patent.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string patent_description = 8;</code>
   */
  java.lang.String getPatentDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of the patent.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string patent_description = 8;</code>
   */
  com.google.protobuf.ByteString getPatentDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The skills used in this patent.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 9;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.Skill> getSkillsUsedList();
  /**
   *
   *
   * <pre>
   * Optional. The skills used in this patent.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 9;</code>
   */
  com.google.cloud.talent.v4beta1.Skill getSkillsUsed(int index);
  /**
   *
   *
   * <pre>
   * Optional. The skills used in this patent.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 9;</code>
   */
  int getSkillsUsedCount();
  /**
   *
   *
   * <pre>
   * Optional. The skills used in this patent.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 9;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.SkillOrBuilder>
      getSkillsUsedOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The skills used in this patent.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Skill skills_used = 9;</code>
   */
  com.google.cloud.talent.v4beta1.SkillOrBuilder getSkillsUsedOrBuilder(int index);
}
