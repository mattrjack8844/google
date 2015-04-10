/*
 * Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.gcloud.storage;

import static com.google.api.client.repackaged.com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.collect.Iterables.transform;

import com.google.api.client.util.DateTime;
import com.google.api.services.storage.model.Bucket;
import com.google.api.services.storage.model.Bucket.Lifecycle.Rule;
import com.google.api.services.storage.model.Bucket.Versioning;
import com.google.api.services.storage.model.BucketAccessControl;
import com.google.api.services.storage.model.ObjectAccessControl;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gcloud.storage.Acl.Entity;

import java.io.Serializable;
import java.util.List;

public final class BucketInfo implements Serializable {

  private static final long serialVersionUID = -3946094202176916586L;

  private final String id;
  private final String name;
  private final Acl.Entity owner;
  private final String selfLink;
  private final boolean versioningEnabled;
  private final String indexPage;
  private final String notFoundPage;
  private final ImmutableList<DeleteRule> deleteRules;
  private final String etag;
  private final long createTime;
  private final long metageneration;
  private final ImmutableList<Cors> cors;
  private final ImmutableList<Acl> acl;
  private final ImmutableList<Acl> defaultAcl;
  private final Location location;
  private final StorageClass storageClass;


  public static abstract class DeleteRule implements Serializable {

    private static final long serialVersionUID = 3137971668395933033L;
    private final Type type;
    private static final String SUPPORTED_ACTION = "Delete";

    public enum Type {
      AGE, CREATE_BEFORE, NUM_NEWER_VERSIONS, IS_LIVE, UNKNOWN
    }

    DeleteRule(Type type) {
      this.type = type;
    }

    public Type type() {
      return type;
    }

    Rule toPb() {
      Rule rule = new Rule();
      rule.setAction(new Rule.Action().setType(SUPPORTED_ACTION));
      Rule.Condition condition = new Rule.Condition();
      populateCondition(condition);
      rule.setCondition(condition);
      return rule;
    }

    abstract void populateCondition(Rule.Condition condition);

    static DeleteRule fromPb(Rule rule) {
      if (rule.getAction() != null && SUPPORTED_ACTION.endsWith(rule.getAction().getType())) {
        Rule.Condition condition = rule.getCondition();
        Integer age = condition.getAge();
        if (age != null) {
          return new AgeDeleteRule(age);
        }
        DateTime dateTime = condition.getCreatedBefore();
        if (dateTime != null) {
          return new CreatedBeforeDeleteRule(dateTime.getValue());
        }
        Integer numNewerVersions = condition.getNumNewerVersions();
        if (numNewerVersions != null) {
          return new NumNewerVersionsDeleteRule(numNewerVersions);
        }
        Boolean isLive = condition.getIsLive();
        if (isLive != null) {
          return new IsLiveDeleteRule(isLive);
        }
      }
      return new RawDeleteRule(rule);
    }
  }

  public static class AgeDeleteRule extends DeleteRule {

    private static final long serialVersionUID = 5697166940712116380L;
    private final int daysToLive;

    public AgeDeleteRule(int daysToLive) {
      super(Type.AGE);
      this.daysToLive = daysToLive;
    }

    public int daysToLive() {
      return daysToLive;
    }

    void populateCondition(Rule.Condition condition) {
      condition.setAge(daysToLive);
    }
  }

  static class RawDeleteRule extends DeleteRule {

    private final Rule rule;

    RawDeleteRule(Rule rule) {
      super(Type.UNKNOWN);
      this.rule = rule;
    }

    void populateCondition(Rule.Condition condition) {
      throw new UnsupportedOperationException();
    }

    Rule toPb() {
      return rule;
    }
  }

  public static class CreatedBeforeDeleteRule extends DeleteRule {

    private static final long serialVersionUID = 881692650279195867L;
    private final long timeMillis;

    public CreatedBeforeDeleteRule(long timeMillis) {
      super(Type.CREATE_BEFORE);
      this.timeMillis = timeMillis;
    }

    public long timeMillis() {
      return timeMillis;
    }

    void populateCondition(Rule.Condition condition) {
      condition.setCreatedBefore(new DateTime(timeMillis));
    }
  }

  public static class NumNewerVersionsDeleteRule extends DeleteRule {

    private static final long serialVersionUID = -1955554976528303894L;
    private final int numNewerVersions;

    public NumNewerVersionsDeleteRule(int numNewerVersions) {
      super(Type.NUM_NEWER_VERSIONS);
      this.numNewerVersions = numNewerVersions;
    }

    public int numNewerVersions() {
      return numNewerVersions;
    }

    void populateCondition(Rule.Condition condition) {
      condition.setNumNewerVersions(numNewerVersions);
    }
  }

  public static class IsLiveDeleteRule extends DeleteRule {

    private static final long serialVersionUID = -3502994563121313364L;
    private final boolean isLive;

    public IsLiveDeleteRule(boolean isLive) {
      super(Type.IS_LIVE);
      this.isLive = isLive;
    }

    public boolean isLive() {
      return isLive;
    }

    void populateCondition(Rule.Condition condition) {
      condition.setIsLive(isLive);
    }
  }

  public static final class StorageClass implements Serializable {

    private static final long serialVersionUID = 374002156285326563L;
    private static final ImmutableMap<String, Option> STRING_TO_OPTION;
    private final String value;

    public enum Option {
      DURABLE_REDUCED_AVAILABILITY,
      STANDARD;

      private final StorageClass storageClass;

      Option() {
        storageClass = new StorageClass(name());
      }
    }

    static {
      ImmutableMap.Builder<String, Option> map = ImmutableMap.builder();
      for (Option option : Option.values()) {
        map.put(option.name(), option);
      }
      STRING_TO_OPTION = map.build();
    }

    private StorageClass(String value) {
      this.value = checkNotNull(value);
    }

    public static StorageClass standard() {
      return Option.STANDARD.storageClass;
    }

    public static StorageClass durableReducedAvailability() {
      return Option.DURABLE_REDUCED_AVAILABILITY.storageClass;
    }

    public static StorageClass of(String value) {
      Option option = STRING_TO_OPTION.get(value.toUpperCase());
      return option == null ? new StorageClass(value) : option.storageClass;
    }

    @Override
    public String toString() {
      return value();
    }

    public String value() {
      return value;
    }
  }

  public static final class Location implements Serializable {

    private static final long serialVersionUID = 9073107666838637662L;
    private static final ImmutableMap<String, Option> STRING_TO_OPTION;
    private final String value;

    public enum Option {
      US, EU, ASIA;

      private final Location location;

      Option() {
        location = new Location(name());
      }
    }

    static {
      ImmutableMap.Builder<String, Option> map = ImmutableMap.builder();
      for (Option option : Option.values()) {
        map.put(option.name(), option);
      }
      STRING_TO_OPTION = map.build();
    }

    private Location(String value) {
      this.value = checkNotNull(value);
    }

    public static Location us() {
      return Option.US.location;
    }

    public static Location eu() {
      return Option.EU.location;
    }

    public static Location asia() {
      return Option.ASIA.location;
    }

    public static Location of(String value) {
      Option option = STRING_TO_OPTION.get(value.toUpperCase());
      return option == null ? new Location(value) : option.location;
    }

    @Override
    public String toString() {
      return value();
    }

    public String value() {
      return value;
    }
  }

  public final static class Builder {

    private final String id;
    private final String name;
    private Acl.Entity owner;
    private String selfLink;
    private boolean versioningEnabled;
    private String indexPage;
    private String notFoundPage;
    private ImmutableList<DeleteRule> deleteRules = ImmutableList.of();
    private StorageClass storageClass;
    private Location location;
    private String etag;
    private Long createTime;
    private Long metageneration;
    private Iterable<Cors> cors = ImmutableList.of();
    private Iterable<Acl> acl = ImmutableList.of();
    private Iterable<Acl> defaultAcl = ImmutableList.of();

    Builder(String id, String name) {
      this.id = id;
      this.name = name;
    }

    Builder owner(Acl.Entity owner) {
      this.owner = owner;
      return this;
    }

    Builder selfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public Builder versioningEnabled(boolean enable) {
      this.versioningEnabled = enable;
      return this;
    }

    public Builder indexPage(String indexPage) {
      this.indexPage = indexPage;
      return this;
    }

    public Builder notFoundPage(String notFoundPage) {
      this.notFoundPage = notFoundPage;
      return this;
    }

    public Builder deleteRules(Iterable<DeleteRule> rules) {
      this.deleteRules = ImmutableList.copyOf(rules);
      return this;
    }

    public Builder storageClass(StorageClass storageClass) {
      this.storageClass = storageClass;
      return this;
    }

    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    Builder etag(String etag) {
      this.etag = etag;
      return this;
    }

    Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    Builder metageneration(Long metageneration) {
      this.metageneration = metageneration;
      return this;
    }

    Builder cors(Iterable<Cors> cors) {
      this.cors = cors;
      return this;
    }

    public Builder acl(Iterable<Acl> acl) {
      this.acl = ImmutableList.copyOf(acl);
      return this;
    }

    public Builder defaultAcl(Iterable<Acl> acl) {
      this.defaultAcl = ImmutableList.copyOf(acl);
      return this;
    }

    public BucketInfo build() {
      return new BucketInfo(this);
    }
  }

  private BucketInfo(Builder builder) {
    id = builder.id;
    name = builder.name;
    etag = builder.etag;
    createTime = MoreObjects.firstNonNull(builder.createTime, 0L);
    metageneration = MoreObjects.firstNonNull(builder.metageneration, 0L);
    location = builder.location;
    storageClass = builder.storageClass;
    cors = ImmutableList.copyOf(builder.cors);
    acl = ImmutableList.copyOf(builder.acl);
    defaultAcl = ImmutableList.copyOf(builder.defaultAcl);
    owner = builder.owner;
    selfLink = builder.selfLink;
    versioningEnabled = builder.versioningEnabled;
    indexPage = builder.indexPage;
    notFoundPage = builder.notFoundPage;
    deleteRules = ImmutableList.copyOf(builder.deleteRules);
  }

  public String id() {
    return id;
  }

  public String name() {
    return name;
  }

  public Entity Owner() {
    return owner;
  }

  public String selfLink() {
    return selfLink;
  }

  public boolean versioningEnabled() {
    return versioningEnabled;
  }

  public String indexPage() {
    return indexPage;
  }

  public String notFoundPage() {
    return notFoundPage;
  }

  public ImmutableList<DeleteRule> deleteRules() {
    return deleteRules;
  }

  public String etag() {
    return etag;
  }

  public long createTime() {
    return createTime;
  }

  public long metageneration() {
    return metageneration;
  }

  public Location location() {
    return location;
  }

  public StorageClass storageClass() {
    return storageClass;
  }

  public List<Cors> cors() {
    return cors;
  }

  public List<Acl> acl() {
    return acl;
  }

  public List<Acl> defaultAcl() {
    return defaultAcl;
  }

  public Builder toBuilder() {
    return new Builder(id, name)
        .createTime(createTime)
        .etag(etag)
        .metageneration(metageneration)
        .cors(cors)
        .acl(acl)
        .defaultAcl(defaultAcl)
        .location(location)
        .storageClass(storageClass)
        .owner(owner)
        .selfLink(selfLink)
        .versioningEnabled(versioningEnabled)
        .indexPage(indexPage)
        .notFoundPage(notFoundPage)
        .deleteRules(deleteRules);
  }

  BucketInfo fromPb(Bucket bucket) {
    Builder builder = new Builder(bucket.getId(), bucket.getName())
        .createTime(bucket.getTimeCreated().getValue())
        .etag(bucket.getEtag())
        .metageneration(bucket.getMetageneration())
        .location(Location.of(bucket.getLocation()))
        .storageClass(StorageClass.of(bucket.getStorageClass()))
        .cors(transform(bucket.getCors(), new Function<Bucket.Cors, Cors>() {
          @Override public Cors apply(Bucket.Cors cors) {
            return Cors.fromPb(cors);
          }
        }))
        .acl(transform(bucket.getAcl(), new Function<BucketAccessControl, Acl>() {
          @Override public Acl apply(BucketAccessControl bucketAccessControl) {
            return Acl.fromPb(bucketAccessControl);
          }
        }))
        .defaultAcl(transform(bucket.getDefaultObjectAcl(), new Function<ObjectAccessControl, Acl>() {
          @Override public Acl apply(ObjectAccessControl objectAccessControl) {
            return Acl.fromPb(objectAccessControl);
          }
        }))
        .owner(Entity.fromPb(bucket.getOwner().getEntity()))
        .selfLink(bucket.getSelfLink());
    Bucket.Versioning versioning = bucket.getVersioning();
    if (versioning != null) {
      builder.versioningEnabled(MoreObjects.firstNonNull(versioning.getEnabled(), Boolean.FALSE));
    }
    Bucket.Website website = bucket.getWebsite();
    if (website != null) {
      builder.indexPage(website.getMainPageSuffix());
      builder.notFoundPage(website.getNotFoundPage());
    }
    Bucket.Lifecycle lifecycle = bucket.getLifecycle();
    if (lifecycle != null) {
      builder.deleteRules(transform(lifecycle.getRule(),
          new Function<Rule, DeleteRule>() {
            @Override public DeleteRule apply(Rule rule) {
              return DeleteRule.fromPb(rule);
            }
          }));
    }
    return builder.build();
  }

  Bucket toPb() {
    Bucket bucket = new Bucket();
    bucket.setId(id);
    bucket.setName(name);
    bucket.setEtag(etag);
    if (createTime > 0) {
      bucket.setTimeCreated(new DateTime(createTime));
    }
    if (metageneration > 0) {
      bucket.setMetageneration(metageneration);
    }
    if (location != null) {
      bucket.setLocation(location.value());
    }
    if (storageClass != null) {
      bucket.setStorageClass(storageClass.value());
    }
    bucket.setCors(Lists.transform(cors, new Function<Cors, Bucket.Cors>() {
      @Override
      public Bucket.Cors apply(Cors cors) {
        return cors.toPb();
      }
    }));
    bucket.setAcl(Lists.transform(acl, new Function<Acl, BucketAccessControl>() {
      @Override
      public BucketAccessControl apply(Acl acl) {
        return acl.toBucketPb();
      }
    }));
    bucket.setDefaultObjectAcl(
        Lists.transform(defaultAcl, new Function<Acl, ObjectAccessControl>() {
          @Override
          public ObjectAccessControl apply(Acl acl) {
            return acl.toObjectPb();
          }
        }));
    bucket.setOwner(new Bucket.Owner().setEntity(owner.toPb()));
    bucket.setSelfLink(selfLink);
    bucket.setVersioning(new Versioning().setEnabled(versioningEnabled));
    Bucket.Website website = new Bucket.Website();
    website.setMainPageSuffix(indexPage);
    website.setNotFoundPage(notFoundPage);
    bucket.setWebsite(website);
    Bucket.Lifecycle lifecycle = new Bucket.Lifecycle();
    lifecycle.setRule(Lists.transform(deleteRules, new Function<DeleteRule, Rule>() {
      @Override public Rule apply(DeleteRule deleteRule) {
        return deleteRule.toPb();
      }
    }));
    return bucket;
  }
}
