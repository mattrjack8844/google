/* * Copyright 2015 Google Inc. All Rights Reserved. * * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except * in compliance with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */package com.google.gcloud.spi;import com.google.api.client.http.AbstractInputStreamContent;import com.google.api.client.http.HttpRequestInitializer;import com.google.api.client.http.HttpTransport;import com.google.api.client.json.jackson.JacksonFactory;import com.google.api.services.storage.Storage;import com.google.api.services.storage.model.Bucket;import com.google.api.services.storage.model.StorageObject;import com.google.gcloud.storage.BlobReadChannel;import com.google.gcloud.storage.BlobWriteChannel;import com.google.gcloud.storage.Option;import com.google.gcloud.storage.StorageServiceException;import com.google.gcloud.storage.StorageServiceOptions;import java.io.ByteArrayInputStream;import java.io.IOException;import java.io.InputStream;import java.util.Iterator;import java.util.List;public class DefaultStorageRpc implements StorageRpc {  private final StorageServiceOptions options;  private final Storage storage;  public DefaultStorageRpc(StorageServiceOptions options) {    HttpTransport transport = options.httpTransport();    HttpRequestInitializer initializer = transport.createRequestFactory().getInitializer();    this.options = options;    storage = new Storage.Builder(transport, new JacksonFactory(), initializer).build();    // Todo: set projection to full    // Todo: make sure nulls are being used as Data.asNull()    // TOdo: consider options  }  private StorageServiceException translate(IOException exception) {    StorageServiceException translated = new StorageServiceException(0, exception.getMessage(), false);    translated.initCause(exception);    return translated;  }  @Override  public Bucket create(Bucket bucket, Option... options) throws StorageServiceException {    try {      return storage.buckets().insert(this.options.project(), bucket).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public StorageObject create(StorageObject storageObject, final byte[] content, Option... options)      throws StorageServiceException {    try {      return storage.objects().insert(storageObject.getBucket(), storageObject,          new AbstractInputStreamContent(storageObject.getContentType()) {            @Override            public InputStream getInputStream() throws IOException {              return new ByteArrayInputStream(content);            }            @Override            public long getLength() throws IOException {              return content.length;            }            @Override            public boolean retrySupported() {              return true;            }          }).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public Iterator<Bucket> list() {    try {      return storage.buckets().list(options.project()).execute().getItems().iterator();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public Iterator<StorageObject> list(String bucket, String prefix, String delimiter, String cursor,      boolean includeOlderVersions, int limit) {    // todo: implement    return null;  }  @Override  public Bucket get(Bucket bucket, Option... options) {    try {      return storage.buckets().get(bucket.getName()).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public StorageObject get(StorageObject object, Option... options) {    try {      return storage.objects().get(object.getBucket(), object.getName()).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public Bucket patch(Bucket bucket, Option... options) {    try {      return storage.buckets().patch(bucket.getName(), bucket).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public StorageObject patch(StorageObject storageObject, Option... options) {    try {    return storage.objects()        .patch(storageObject.getBucket(), storageObject.getName(), storageObject).execute();    } catch (IOException ex) {    throw translate(ex);    }  }  @Override  public void delete(Bucket bucket, Option... options) {    try {      storage.buckets().delete(bucket.getName()).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public void delete(StorageObject blob, Option... options) {    try {      storage.objects().delete(blob.getBucket(), blob.getName()).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public StorageObject compose(Iterable<StorageObject> src, StorageObject destination,      List<? extends Option> destinationOptions) throws StorageServiceException {    // todo: implement null -> ComposeRequest    try {      return storage.objects().compose(destination.getBucket(), destination.getName(), null).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public StorageObject copy(StorageObject from, List<? extends Option> blobSourceOptions,      StorageObject to, List<? extends Option> blobTargetOptions) throws StorageServiceException {    try {      return storage.objects()          .copy(from.getBucket(), from.getName(), to.getBucket(), to.getName(), to).execute();    } catch (IOException ex) {      throw translate(ex);    }  }  @Override  public BlobReadChannel reader(StorageObject from, Option... options)      throws StorageServiceException {    // todo: implement    return null;  }  @Override  public BlobWriteChannel writer(StorageObject to, Option... options)      throws StorageServiceException {    // todo: implement    return null;  }}