package com.google.gcloud.datastore;import static junit.framework.TestCase.fail;import static org.junit.Assert.assertEquals;import com.google.gcloud.com.google.gcloud.spi.DatastoreRpc.DatastoreRpcException;import com.google.gcloud.com.google.gcloud.spi.DatastoreRpc.DatastoreRpcException.Reason;import com.google.gcloud.datastore.DatastoreServiceException.Code;import org.junit.Test;public class DatastoreServiceExceptionTest {  @Test  public void testCode() throws Exception {    for (Reason reason : Reason.values()) {      Code code = Code.valueOf(reason.name());      assertEquals(reason.retryable(), code.retriable());      assertEquals(reason.description(), code.description());      assertEquals(reason.httpStatus(), code.httpStatus());    }    DatastoreServiceException exception = new DatastoreServiceException(Code.ABORTED, "bla");    assertEquals(Code.ABORTED, exception.code());  }  @Test  public void testTranslateAndThrow() throws Exception {    for (Reason reason : Reason.values()) {      try {        DatastoreServiceException.translateAndThrow(new DatastoreRpcException(reason));        fail("Exception expected");      } catch (DatastoreServiceException ex) {        assertEquals(reason.name(), ex.code().name());      }    }  }  @Test  public void testThrowInvalidRequest() throws Exception {    try {      DatastoreServiceException.throwInvalidRequest("message %s %d", "a", 1);      fail("Exception expected");    } catch (DatastoreServiceException ex) {      assertEquals(Code.FAILED_PRECONDITION, ex.code());      assertEquals("message a 1", ex.getMessage());    }  }}