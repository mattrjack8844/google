/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.logging;

import com.google.api.gax.core.ApiFutures;
import com.google.cloud.MonitoredResource;
import com.google.cloud.logging.LogEntry.Builder;
import com.google.cloud.logging.Logging.WriteOption;
import com.google.cloud.logging.Payload.StringPayload;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.logging.ErrorManager;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoggingHandlerTest {

  private static final String LOG_NAME = "java.log";
  private static final String MESSAGE = "message";
  private static final String PROJECT = "project";
  private static final MonitoredResource DEFAULT_RESOURCE =
      MonitoredResource.of("global", ImmutableMap.of("project_id", PROJECT));
  private static final LogEntry FINEST_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.DEBUG)
      .addLabel("levelName", "FINEST")
      .addLabel("levelValue", String.valueOf(Level.FINEST.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry FINEST_ENHANCED_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.DEBUG)
      .addLabel("levelName", "FINEST")
      .addLabel("levelValue", String.valueOf(Level.FINEST.intValue()))
      .addLabel("enhanced", "true")
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry FINER_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.DEBUG)
      .addLabel("levelName", "FINER")
      .addLabel("levelValue", String.valueOf(Level.FINER.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry FINE_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.DEBUG)
      .addLabel("levelName", "FINE")
      .addLabel("levelValue", String.valueOf(Level.FINE.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry CONFIG_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.INFO)
      .addLabel("levelName", "CONFIG")
      .addLabel("levelValue", String.valueOf(Level.CONFIG.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry INFO_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.INFO)
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry WARNING_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.WARNING)
      .addLabel("levelName", "WARNING")
      .addLabel("levelValue", String.valueOf(Level.WARNING.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry SEVERE_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.ERROR)
      .addLabel("levelName", "SEVERE")
      .addLabel("levelValue", String.valueOf(Level.SEVERE.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry DEBUG_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.DEBUG)
      .addLabel("levelName", "DEBUG")
      .addLabel("levelValue", String.valueOf(LoggingLevel.DEBUG.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry NOTICE_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.NOTICE)
      .addLabel("levelName", "NOTICE")
      .addLabel("levelValue", String.valueOf(LoggingLevel.NOTICE.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry ERROR_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.ERROR)
      .addLabel("levelName", "ERROR")
      .addLabel("levelValue", String.valueOf(LoggingLevel.ERROR.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry CRITICAL_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.CRITICAL)
      .addLabel("levelName", "CRITICAL")
      .addLabel("levelValue", String.valueOf(LoggingLevel.CRITICAL.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry ALERT_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.ALERT)
      .addLabel("levelName", "ALERT")
      .addLabel("levelValue", String.valueOf(LoggingLevel.ALERT.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final LogEntry EMERGENCY_ENTRY = LogEntry.newBuilder(StringPayload.of(MESSAGE))
      .setSeverity(Severity.EMERGENCY)
      .addLabel("levelName", "EMERGENCY")
      .addLabel("levelValue", String.valueOf(LoggingLevel.EMERGENCY.intValue()))
      .setTimestamp(123456789L)
      .build();
  private static final ImmutableMap<String, String> NATIVE_SEVERITY_MAP =
      ImmutableMap.of("levelName", Level.INFO.getName(), "levelValue", Level.INFO.intValue() + "");
  private static final WriteOption[] DEFAULT_OPTION =
      new WriteOption[] {
        WriteOption.logName(LOG_NAME),
        WriteOption.resource(DEFAULT_RESOURCE),
        WriteOption.labels(NATIVE_SEVERITY_MAP)
      };

  private Logging logging;
  private LoggingOptions options;

  static final class TestFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
      return record.getMessage();
    }
  }

  @Before
  public void setUp() {
    logging = EasyMock.createStrictMock(Logging.class);
    options = EasyMock.createStrictMock(LoggingOptions.class);
  }

  @After
  public void after() {
    EasyMock.verify(logging, options);
  }

  private static LogRecord newLogRecord(Level level, String message) {
    LogRecord record = new LogRecord(level, message);
    record.setMillis(123456789L);
    return record;
  }

  @Test
  public void testPublishLevels() {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.expect(options.getService()).andReturn(logging);
    logging.writeAsync(ImmutableList.of(FINEST_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(FINER_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(FINE_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(CONFIG_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(INFO_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(WARNING_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(SEVERE_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(DEBUG_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(NOTICE_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(ERROR_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(CRITICAL_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(ALERT_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.writeAsync(ImmutableList.of(EMERGENCY_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    EasyMock.replay(options, logging);
    Handler handler = new LoggingHandler(LOG_NAME, options);
    handler.setLevel(Level.ALL);
    handler.setFormatter(new TestFormatter());
    // default levels
    handler.publish(newLogRecord(Level.FINEST, MESSAGE));
    handler.publish(newLogRecord(Level.FINER, MESSAGE));
    handler.publish(newLogRecord(Level.FINE, MESSAGE));
    handler.publish(newLogRecord(Level.CONFIG, MESSAGE));
    handler.publish(newLogRecord(Level.INFO, MESSAGE));
    handler.publish(newLogRecord(Level.WARNING, MESSAGE));
    handler.publish(newLogRecord(Level.SEVERE, MESSAGE));
    // Logging levels
    handler.publish(newLogRecord(LoggingLevel.DEBUG, MESSAGE));
    handler.publish(newLogRecord(LoggingLevel.NOTICE, MESSAGE));
    handler.publish(newLogRecord(LoggingLevel.ERROR, MESSAGE));
    handler.publish(newLogRecord(LoggingLevel.CRITICAL, MESSAGE));
    handler.publish(newLogRecord(LoggingLevel.ALERT, MESSAGE));
    handler.publish(newLogRecord(LoggingLevel.EMERGENCY, MESSAGE));
  }

  @Test
  public void testPublishCustomResource() {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.expect(options.getService()).andReturn(logging);
    MonitoredResource resource = MonitoredResource.of("custom", ImmutableMap.<String, String>of());
    logging.writeAsync(
        ImmutableList.of(FINEST_ENTRY),
        WriteOption.logName(LOG_NAME),
        WriteOption.resource(resource),
        WriteOption.labels(NATIVE_SEVERITY_MAP));
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    EasyMock.replay(options, logging);
    Handler handler = new LoggingHandler(LOG_NAME, options, resource);
    handler.setLevel(Level.ALL);
    handler.setFormatter(new TestFormatter());
    handler.publish(newLogRecord(Level.FINEST, MESSAGE));
  }

  @Test
  public void testEnhancedLogEntry() {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.expect(options.getService()).andReturn(logging);
    MonitoredResource resource = MonitoredResource.of("custom", ImmutableMap.<String, String>of());
    logging.writeAsync(
        ImmutableList.of(FINEST_ENHANCED_ENTRY),
        WriteOption.logName(LOG_NAME),
        WriteOption.resource(resource),
        WriteOption.labels(NATIVE_SEVERITY_MAP));
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    EasyMock.replay(options, logging);
    LoggingHandler.Enhancer enhancer = new LoggingHandler.Enhancer() {
      @Override
      public void enhanceMonitoredResource(MonitoredResource.Builder builder) {
        throw new IllegalStateException();
      }

      @Override
      public void enhanceLogEntry(Builder builder, LogRecord record) {
        builder.addLabel("enhanced", "true");
      }
    };
    Handler handler =
        new LoggingHandler(LOG_NAME, options, resource, Collections.singletonList(enhancer));
    handler.setLevel(Level.ALL);
    handler.setFormatter(new TestFormatter());
    handler.publish(newLogRecord(Level.FINEST, MESSAGE));
  }

  @Test
  public void testReportFlushError() {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.expect(options.getService()).andReturn(logging);
    RuntimeException ex = new RuntimeException();
    logging.writeAsync(ImmutableList.of(FINEST_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andThrow(ex);
    EasyMock.replay(options, logging);
    ErrorManager errorManager = EasyMock.createStrictMock(ErrorManager.class);
    errorManager.error(null, ex, ErrorManager.FLUSH_FAILURE);
    EasyMock.expectLastCall().once();
    EasyMock.replay(errorManager);
    Handler handler = new LoggingHandler(LOG_NAME, options);
    handler.setLevel(Level.ALL);
    handler.setErrorManager(errorManager);
    handler.setFormatter(new TestFormatter());
    handler.publish(newLogRecord(Level.FINEST, MESSAGE));
    EasyMock.verify(errorManager);
  }

  @Test
  public void testReportFormatError() {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.replay(options, logging);
    Formatter formatter = EasyMock.createStrictMock(Formatter.class);
    RuntimeException ex = new RuntimeException();
    ErrorManager errorManager = EasyMock.createStrictMock(ErrorManager.class);
    errorManager.error(null, ex, ErrorManager.FORMAT_FAILURE);
    EasyMock.expectLastCall().once();
    LogRecord record = newLogRecord(Level.FINEST, MESSAGE);
    EasyMock.expect(formatter.format(record)).andThrow(ex);
    EasyMock.replay(errorManager, formatter);
    Handler handler = new LoggingHandler(LOG_NAME, options);
    handler.setLevel(Level.ALL);
    handler.setErrorManager(errorManager);
    handler.setFormatter(formatter);
    handler.publish(record);
    EasyMock.verify(errorManager, formatter);
  }

  @Test
  public void testFlushSize() {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.expect(options.getService()).andReturn(logging);
    logging.writeAsync(
        ImmutableList.of(
            FINEST_ENTRY, FINER_ENTRY, FINE_ENTRY, CONFIG_ENTRY, INFO_ENTRY, WARNING_ENTRY),
        DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    EasyMock.replay(options, logging);
    LoggingHandler handler = new LoggingHandler(LOG_NAME, options);
    handler.setLevel(Level.ALL);
    handler.setFlushSize(6);
    handler.setFormatter(new TestFormatter());
    handler.publish(newLogRecord(Level.FINEST, MESSAGE));
    handler.publish(newLogRecord(Level.FINER, MESSAGE));
    handler.publish(newLogRecord(Level.FINE, MESSAGE));
    handler.publish(newLogRecord(Level.CONFIG, MESSAGE));
    handler.publish(newLogRecord(Level.INFO, MESSAGE));
    handler.publish(newLogRecord(Level.WARNING, MESSAGE));
  }

  @Test
  public void testFlushLevel() {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.expect(options.getService()).andReturn(logging);
    logging.writeAsync(
        ImmutableList.of(
            FINEST_ENTRY, FINER_ENTRY, FINE_ENTRY, CONFIG_ENTRY, INFO_ENTRY, WARNING_ENTRY),
        DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    EasyMock.replay(options, logging);
    LoggingHandler handler = new LoggingHandler(LOG_NAME, options);
    handler.setLevel(Level.ALL);
    handler.setFlushSize(100);
    handler.setFlushLevel(Level.WARNING);
    handler.setFormatter(new TestFormatter());
    handler.publish(newLogRecord(Level.FINEST, MESSAGE));
    handler.publish(newLogRecord(Level.FINER, MESSAGE));
    handler.publish(newLogRecord(Level.FINE, MESSAGE));
    handler.publish(newLogRecord(Level.CONFIG, MESSAGE));
    handler.publish(newLogRecord(Level.INFO, MESSAGE));
    handler.publish(newLogRecord(Level.WARNING, MESSAGE));
  }

  @Test
  public void testAddHandler() {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.expect(options.getService()).andReturn(logging);
    logging.writeAsync(ImmutableList.of(FINEST_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    EasyMock.replay(options, logging);
    LoggingHandler handler = new LoggingHandler(LOG_NAME, options) {
      @Override
      public void close() {
        // Make close NOOP to avoid mock close exception
      }
    };
    handler.setLevel(Level.ALL);
    handler.setFormatter(new TestFormatter());
    Logger logger = Logger.getLogger(getClass().getName());
    logger.setLevel(Level.ALL);
    LoggingHandler.addHandler(logger, handler);
    logger.log(newLogRecord(Level.FINEST, MESSAGE));
  }

  @Test
  public void testClose() throws Exception {
    EasyMock.expect(options.getProjectId()).andReturn(PROJECT).anyTimes();
    EasyMock.expect(options.getService()).andReturn(logging);
    logging.writeAsync(ImmutableList.of(FINEST_ENTRY), DEFAULT_OPTION);
    EasyMock.expectLastCall().andReturn(ApiFutures.immediateFuture(null));
    logging.close();
    EasyMock.expectLastCall().once();
    EasyMock.replay(options, logging);
    Handler handler = new LoggingHandler(LOG_NAME, options);
    handler.setLevel(Level.ALL);
    handler.setFormatter(new TestFormatter());
    handler.publish(newLogRecord(Level.FINEST, MESSAGE));
    handler.close();
    handler.close();
  }
}
