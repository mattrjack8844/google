/*
 * Copyright 2017 Google Inc. All Rights Reserved.
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

import com.google.api.gax.core.ApiFuture;
import com.google.api.gax.core.ApiFutureCallback;
import com.google.api.gax.core.ApiFutures;
import com.google.cloud.MonitoredResource;
import com.google.cloud.logging.Logging.WriteOption;
import com.google.common.util.concurrent.Uninterruptibles;

import java.util.*;

import static com.google.common.base.MoreObjects.firstNonNull;
import static com.google.common.base.Preconditions.checkNotNull;

public class BufferedLogging {

  private static final ThreadLocal<Boolean> inPublishCall = new ThreadLocal<>();
  private volatile Logging logging;
  private LoggingOptions loggingOptions;
  private WriteOption[] writeOptions;
  private Severity flushSeverity;
  private Integer flushSize;
  private Synchronicity synchronicity;
  private LoggingErrorHandler errorHandler;
  private List<Enhancer> resourceEnhancers;
  private LinkedList<LogEntry> buffer;

  private final Object writeLock = new Object();
  private final Set<ApiFuture<Void>> pendingWrites =
          Collections.newSetFromMap(new IdentityHashMap<ApiFuture<Void>, Boolean>());

  private BufferedLogging() {}

  public void flush() {

    flushBuffer();
    // BUG(1795): We should force batcher to issue RPC call for buffered messages,
    // so the code below doesn't wait uselessly.
    ArrayList<ApiFuture<Void>> writesToFlush = new ArrayList<>();
    synchronized(writeLock) {
      writesToFlush.addAll(pendingWrites);
    }
    for (ApiFuture<Void> write : writesToFlush) {
      try {
        Uninterruptibles.getUninterruptibly(write);
      } catch (Exception e) {
        // Ignore exceptions, they are propagated to the error manager.
      }
    }
  }

  private void enhanceLogEntry(LogEntry.Builder entryBuilder) {
    for (Enhancer enhancer : resourceEnhancers) {
      enhancer.enhanceLogEntry(entryBuilder);
    }
  }

  public void publish(LogEntry.Builder entryBuilder) {
    enhanceLogEntry(entryBuilder);
    LogEntry entry = entryBuilder.build();

    if (inPublishCall.get() != null) {
      // ignore all logs generated in the course of logging through this handler
      return;
    }
    inPublishCall.set(true);

    try {
      synchronized (this) {
        buffer.add(entry);
        if (buffer.size() >= flushSize || entry.getSeverity().compareTo(flushSeverity) >= 0) {
          flushBuffer();
        }
      }
    }
    finally{
      inPublishCall.remove();
    }
  }

  /**
   * Closes the handler and the associated {@link Logging} object.
   */
  public synchronized void close() throws SecurityException {
    if (logging != null) {
      try {
        logging.close();
      } catch (Exception ex) {
        // ignore
      }
    }
    logging = null;
  }

  public synchronized void setFlushSeverity(Severity severity) {
    flushSeverity = severity;
  }

  public synchronized void setFlushSize(int size) {
    flushSize = size;
  }

  public synchronized void setSynchronicity(Synchronicity syncType) {
    synchronicity = syncType;
  }

  public Integer getFlushSize() {
    return flushSize;
  }

  public Synchronicity getSynchronicity() {
    return synchronicity;
  }

  private synchronized void flushBuffer() {
    if (buffer.isEmpty()) {
      return;
    }
    List<LogEntry> logEntries = buffer;
    write(logEntries);
    buffer = new LinkedList<>();
  }

  private void write(List<LogEntry> entryList) {
    switch (this.synchronicity) {
      case SYNC:
        try {
          getLogging().write(entryList, writeOptions);
        } catch (Exception ex) {
          errorHandler.handleWriteError(ex);
        }
        break;

      case ASYNC:
      default:
        final ApiFuture<Void> writeFuture = getLogging().writeAsync(entryList, writeOptions);
        ApiFutures.addCallback(
                writeFuture,
                new ApiFutureCallback<Void>() {
                  private void removeFromPending() {
                    synchronized(writeLock) {
                      pendingWrites.remove(writeFuture);
                    }
                  }
                  @Override
                  public void onSuccess(Void v) {
                    removeFromPending();
                  }

                  @Override
                  public void onFailure(Throwable t) {
                    try {
                      Exception ex = (t instanceof Exception) ? (Exception) t : new Exception(t);
                      errorHandler.handleFlushError(ex);
                    }
                    finally {
                      removeFromPending();
                    }
                }
                });
        pendingWrites.add(writeFuture);
        break;
    }
  }

  /**
   * Returns an instance of the logging service.
   */
  private Logging getLogging() {
    if (logging == null) {
      synchronized (this) {
        if (logging == null) {
          logging = loggingOptions.getService();
        }
      }
    }
    return logging;
  }

  /**
   * Returns a builder for this {@code BufferedLogging} object.
   */
  public BufferedLogging.Builder toBuilder() {
    return new BufferedLogging.BuilderImpl(this);
  }

  /**
   * Returns a builder for {@code BufferedLogging} objects given the name of the sink and its destination.
   */
  public static BufferedLogging.Builder newBuilder(LoggingOptions loggingOptions) {
    return new BufferedLogging.BuilderImpl(loggingOptions);
  }

  public abstract static class Builder {
    /**
     * Service configuration of the cloud logging service
     */
    public abstract BufferedLogging.Builder setLoggingOptions(LoggingOptions loggingOptions);

    /**
     * Set the synchronicity of logging : {@link Synchronicity}, defaults to async
     */
    public abstract BufferedLogging.Builder setSynchronicity(Synchronicity synchronicity);

    /**
     * Allow for logs to be buffered in memory till a certain size is reached, default = 1, ie, logs immediately
     */
    public abstract BufferedLogging.Builder setFlushSize(int flushSize);


    /**
     * Minimum severity of log message to not buffer but immediately write out to cloud logging.
     * Default : Error
     * @param flushSeverity : minimum logging severity
     */
    public abstract BufferedLogging.Builder setFlushSeverity(Severity flushSeverity);

    /**
     * Sets the default write options for log entries
     */
    public abstract BufferedLogging.Builder  setWriteOptions(String logName, MonitoredResource resource,
                                                             WriteOption[] labelOptions);

    /**
     * Sets the error log handler
     */
    public abstract BufferedLogging.Builder setErrorHandler(LoggingErrorHandler errorHandler);
    /**
     * Creates a {@code BufferedLogging} object for this builder.
     */
    public abstract BufferedLogging build();
  }

  static final class BuilderImpl extends BufferedLogging.Builder {

    private LoggingOptions loggingOptions;
    private Severity flushSeverity;
    private Integer flushSize;
    private Synchronicity synchronicity;
    private WriteOption[] writeOptions;
    private LoggingErrorHandler errorHandler;

    BuilderImpl(LoggingOptions loggingOptions) {
      this.loggingOptions = loggingOptions;
    }

    BuilderImpl(BufferedLogging bufferedLogging) {
      this.loggingOptions = bufferedLogging.loggingOptions;
      this.flushSeverity = bufferedLogging.flushSeverity;
      this.flushSize = bufferedLogging.flushSize;
      this.synchronicity = bufferedLogging.synchronicity;
      this.writeOptions = bufferedLogging.writeOptions;
      this.errorHandler = bufferedLogging.errorHandler;
    }

    @Override
    public BufferedLogging.Builder setLoggingOptions(LoggingOptions loggingOptions) {
      this.loggingOptions = loggingOptions;
      return this;
    }

    @Override
    public BufferedLogging.Builder setFlushSeverity(Severity flushSeverity) {
      this.flushSeverity = flushSeverity;
      return this;
    }

    @Override
    public BufferedLogging.Builder setFlushSize(int flushSize) {
      this.flushSize = flushSize;
      return this;
    }

    @Override
    public BufferedLogging.Builder setSynchronicity(Synchronicity synchronicity) {
      this.synchronicity = synchronicity;
      return this;
    }

    @Override
    public BufferedLogging.Builder setWriteOptions(String logName, MonitoredResource resource,
                                                   WriteOption[] labelOptions) {
      List<WriteOption> writeOptionsList = new ArrayList<>();
      writeOptionsList.add(WriteOption.logName(logName));
      writeOptionsList.add(WriteOption.resource(resource));
      if (labelOptions != null) {
        Collections.addAll(writeOptionsList, labelOptions);
      }
      this.writeOptions = new WriteOption[writeOptionsList.size()];
      writeOptionsList.toArray(this.writeOptions);
      return this;
    }

    @Override
    public BufferedLogging.Builder setErrorHandler(LoggingErrorHandler errorHandler) {
      this.errorHandler = errorHandler;
      return this;
    }

    @Override
    public BufferedLogging build() {
      return new BufferedLogging(this);
    }
  }

  BufferedLogging(BufferedLogging.BuilderImpl builder) {
    this.loggingOptions = checkNotNull(firstNonNull(builder.loggingOptions, LoggingOptions.getDefaultInstance()));
    this.flushSize = firstNonNull(builder.flushSize, 1);
    this.buffer = new LinkedList<>();
    this.flushSeverity = firstNonNull(builder.flushSeverity, Severity.ERROR);
    this.synchronicity = firstNonNull(builder.synchronicity, Synchronicity.ASYNC);
    this.writeOptions = checkNotNull(builder.writeOptions);
    this.errorHandler = checkNotNull(builder.errorHandler);
    this.resourceEnhancers = MonitoredResourceHelper.getResourceEnhancers();
  }

}
