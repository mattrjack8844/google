package com.google.cloud.spanner;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.google.common.util.concurrent.Uninterruptibles;

@RunWith(Parameterized.class)
public class SessionPoolStressTest extends BaseSessionPoolTest {
	@Rule public ExpectedException expectedException = ExpectedException.none();
    @Parameter(0) public float writeSessionsFraction;
    @Parameter(1) public boolean shouldBlock;
	  
	  DatabaseId db = DatabaseId.of("projects/p/instances/i/databases/unused");
	  SessionPool pool;
	  SessionPoolOptions options;
	  Object lock = new Object();
	  Random random = new Random();
	  FakeClock clock = new FakeClock();
	  
	  
		  Map<String, Boolean> sessions = new HashMap<>();
		  Set<String> closedSessions = new HashSet<>();
		  SpannerImpl mockSpanner;
		  int maxAliveSessions = 0;
		  int minSessionsWhenSessionClosed = Integer.MAX_VALUE;
		  Exception e;
		  
		  @Parameters(name = "write fraction = {0}, should block = {1}")
		  public static Collection<Object[]> data() {
			List<Object[]> params = new ArrayList<>();
			for (float writeFraction = 0; writeFraction <=1; writeFraction +=0.2) {
				params.add(new Object[]{writeFraction, true});
				params.add(new Object[]{writeFraction, false});
			}
			return params;
		  }
		  
		  private void setupSpanner(DatabaseId db) {
		    mockSpanner = mock(SpannerImpl.class);
		    when(mockSpanner.createSession(db)).thenAnswer(new Answer<Session>() {

				@Override
				public Session answer(InvocationOnMock invocation) throws Throwable {
				  synchronized(lock) {
				  Session session = mockSession();
				  setupSession(session);
				  
				    sessions.put(session.getName(), false);
				    if (sessions.size() > maxAliveSessions) {
				    	maxAliveSessions = sessions.size();
				    }
				    return session;
				  }
				  
				}
			});
		  }
		  
		  private void setupSession(final Session session) {
			ReadContext mockContext = mock(ReadContext.class);
			ResultSet mockResult = mock(ResultSet.class);
			when(session.singleUse(any(TimestampBound.class))).thenReturn(mockContext);
			when(mockContext.executeQuery(any(Statement.class))).thenReturn(mockResult);
			when(mockResult.next()).thenReturn(true);
		    doAnswer(new Answer<Void>() {

				@Override
				public Void answer(InvocationOnMock invocation) throws Throwable {
				  synchronized(lock) {
				  if (sessions.remove(session.getName()) == null) {
				    setFailed();
				  }
				  if (!closedSessions.add(session.getName())) {
					  setFailed();
				  }
				  if (sessions.size() < minSessionsWhenSessionClosed) {
					  minSessionsWhenSessionClosed = sessions.size();
				  }
				  }
				  return null;
				}
			}).when(session).close();
		    
		    doAnswer(new Answer<Void>() {
	          @Override
			  public Void answer(InvocationOnMock invocation) throws Throwable {
	        	if (random.nextInt(100) < 10) {
	        		expireSession(session);
	        		throw SpannerExceptionFactory.newSpannerException(ErrorCode.NOT_FOUND, "Session not found");
	        	}
			    synchronized(lock) {
			      if (sessions.put(session.getName(), true) != false) {
			        setFailed();
			      }
			      
			    }
			    return null;
		      }
		    	
		    }).when(session).prepareReadWriteTransaction();
			  
		  }
		  
		  private void expireSession(Session session) {
		    synchronized(lock) {
		      sessions.remove(session.getName());
		    }
		  }
		  
		  private void assertWritePrepared(Session session) {
		    synchronized(lock) {
		      if (!sessions.get(session.getName())) {
		    	  setFailed();
		      }
		    }
		  }
		  
		  private void resetTransaction(Session session) {
			  synchronized(lock) {
			    sessions.put(session.getName(), false);
			  }
		  }
		  
		  private void setFailed(Exception cause) {
			  e = new Exception(cause);
		  }
		  
		  private void setFailed() {
			  e = new Exception();
		  }
		  
		  private Exception getFailedError() {
			  synchronized(lock) {
			    return e;	  
			  }
		  }
	  
	
	  @Test
	  public void stressTest() throws Exception {
		    int concurrentThreads = 10;
		    final int numOperationsPerThread = 1000;
		    final CountDownLatch releaseThreads = new CountDownLatch(1);
		    final CountDownLatch threadsDone = new CountDownLatch(concurrentThreads);
		    final int writeOperationFraction = 5;
		    setupSpanner(db);
		    int minSessions = 2;
		    int maxSessions = concurrentThreads / 2;
		    float writeSessionsFraction = 0.5f;
		    SessionPoolOptions.Builder builder = SessionPoolOptions.newBuilder()
		    		.setMinSessions(minSessions)
		    		.setMaxSessions(maxSessions)
		    		.setWriteSessionsFraction(writeSessionsFraction);
		    if (shouldBlock) {
		    	builder.setBlockIfPoolExhausted();
		    } else {
		    	builder.setFailIfPoolExhausted();
		    }
		    pool = SessionPool.createPool(builder.build(), new TestExecutorFactory(), db, mockSpanner, clock);
		    for (int i = 0; i < concurrentThreads; i++) {
		      new Thread(new Runnable() {
				
				@Override
				public void run() {
				  Uninterruptibles.awaitUninterruptibly(releaseThreads);
				  for (int i = 0; i < numOperationsPerThread; i++) {
					try {
					Session session = null;
				    if (random.nextInt(10) < writeOperationFraction) {
				      session = pool.getReadWriteSession();
				      assertWritePrepared(session);
				    } else {
				      session = pool.getReadSession();
				    }
				    Uninterruptibles.sleepUninterruptibly(random.nextInt(5), TimeUnit.MILLISECONDS);
				    resetTransaction(session);
				    session.close();
					} catch(SpannerException e) {
						if (e.getErrorCode() != ErrorCode.RESOURCE_EXHAUSTED || shouldBlock) {
							setFailed(e);
						}
					} catch(Exception e) {
					  setFailed(e);	
					}
				  }
				  threadsDone.countDown();
			    }
			}).start();
		    }
		    // Start maintenance threads in tight loop
		    final AtomicBoolean stopMaintenance = new AtomicBoolean(false);
		    new Thread(new Runnable() {

				@Override
				public void run() {
					while (!stopMaintenance.get()) {
					runMaintainanceLoop(clock, pool, 1);
					}
					
				}
		    	
		    });
		    releaseThreads.countDown();
		    threadsDone.await();
		    synchronized(lock) {
			  assertThat(maxAliveSessions).isAtMost(maxSessions);
			  assertThat(minSessionsWhenSessionClosed).isAtLeast(minSessions);
			}
		    pool.closeAsync().get();
		    Exception e = getFailedError();
		    if (e != null) {
		    	throw e;
		    }
		    
		  }
}
