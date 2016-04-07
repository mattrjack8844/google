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

package com.google.gcloud.compute;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.api.services.compute.model.Disk;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

/**
 * A Google Compute Engine persistent disk. A disk can be used as primary storage for your virtual
 * machine instances.
 *
 * @see <a href="https://cloud.google.com/compute/docs/disks/">Block Storage</a>
 */
public class DiskInfo implements Serializable {

  static final Function<Disk, DiskInfo> FROM_PB_FUNCTION =
      new Function<Disk, DiskInfo>() {
        @Override
        public DiskInfo apply(Disk pb) {
          return DiskInfo.fromPb(pb);
        }
      };
  static final Function<DiskInfo, Disk> TO_PB_FUNCTION =
      new Function<DiskInfo, Disk>() {
        @Override
        public Disk apply(DiskInfo diskType) {
          return diskType.toPb();
        }
      };

  private static final long serialVersionUID = -7173418340679279619L;
  private static final DateTimeFormatter TIMESTAMP_FORMATTER = ISODateTimeFormat.dateTime();

  private final String id;
  private final DiskId diskId;
  private final DiskConfiguration configuration;
  private final Long creationTimestamp;
  private final CreationStatus creationStatus;
  private final String description;
  private final List<LicenseId> licenses;
  private final List<InstanceId> attachedInstances;
  private final Long lastAttachTimestamp;
  private final Long lastDetachTimestamp;

  /**
   * The status of disk creation.
   */
  public enum CreationStatus {
    /**
     * The disk is being created.
     */
    CREATING,

    /**
     * Disk creation failed.
     */
    FAILED,

    /**
     * The disk has been created and is ready to use.
     */
    READY,

    /**
     * The disk is being restored.
     */
    RESTORING
  }

  /**
   * Builder for {@code DiskInfo} objects.
   */
  public abstract static class Builder {

    abstract Builder id(String id);

    /**
     * Sets the disk configuration.
     */
    public abstract Builder configuration(DiskConfiguration configuration);

    /**
     * Sets the disk identity.
     */
    public abstract Builder diskId(DiskId diskId);

    abstract Builder creationTimestamp(Long creationTimestamp);

    abstract Builder creationStatus(CreationStatus creationStatus);

    /**
     * Sets an optional textual description of the resource.
     */
    public abstract Builder description(String description);

    abstract Builder licenses(List<LicenseId> licenses);

    abstract Builder attachedInstances(List<InstanceId> attachedInstances);

    abstract Builder lastAttachTimestamp(Long lastAttachTimestamp);

    abstract Builder lastDetachTimestamp(Long lastDetachTimestamp);

    /**
     * Creates a {@code DiskInfo} object.
     */
    public abstract DiskInfo build();
  }

  static final class BuilderImpl extends Builder {

    private String id;
    private DiskId diskId;
    private DiskConfiguration configuration;
    private Long creationTimestamp;
    private CreationStatus creationStatus;
    private String description;
    private List<LicenseId> licenses;
    private List<InstanceId> attachedInstances;
    private Long lastAttachTimestamp;
    private Long lastDetachTimestamp;

    BuilderImpl(DiskId diskId, DiskConfiguration configuration) {
      this.diskId = checkNotNull(diskId);
      this.configuration = checkNotNull(configuration);
    }

    BuilderImpl(DiskInfo diskInfo) {
      this.id = diskInfo.id;
      this.configuration = diskInfo.configuration;
      this.creationTimestamp = diskInfo.creationTimestamp;
      this.creationStatus = diskInfo.creationStatus;
      this.diskId = diskInfo.diskId;
      this.description = diskInfo.description;
      this.licenses = diskInfo.licenses;
      this.attachedInstances = diskInfo.attachedInstances;
      this.lastAttachTimestamp = diskInfo.lastAttachTimestamp;
      this.lastDetachTimestamp = diskInfo.lastDetachTimestamp;
    }

    BuilderImpl(Disk diskPb) {
      if (diskPb.getId() != null) {
        this.id = diskPb.getId().toString();
      }
      this.configuration = DiskConfiguration.fromPb(diskPb);
      if (diskPb.getCreationTimestamp() != null) {
        this.creationTimestamp = TIMESTAMP_FORMATTER.parseMillis(diskPb.getCreationTimestamp());
      }
      if (diskPb.getStatus() != null) {
        this.creationStatus = CreationStatus.valueOf(diskPb.getStatus());
      }
      this.diskId = DiskId.fromUrl(diskPb.getSelfLink());
      this.description = diskPb.getDescription();
      if (diskPb.getLicenses() != null) {
        this.licenses = Lists.transform(diskPb.getLicenses(), LicenseId.FROM_URL_FUNCTION);
      }
      if (diskPb.getUsers() != null) {
        this.attachedInstances = Lists.transform(diskPb.getUsers(), InstanceId.FROM_URL_FUNCTION);
      }
      if (diskPb.getLastAttachTimestamp() != null) {
        this.lastAttachTimestamp = TIMESTAMP_FORMATTER.parseMillis(diskPb.getLastAttachTimestamp());
      }
      if (diskPb.getLastDetachTimestamp() != null) {
        this.lastDetachTimestamp = TIMESTAMP_FORMATTER.parseMillis(diskPb.getLastDetachTimestamp());
      }
    }

    @Override
    BuilderImpl id(String id) {
      this.id = id;
      return this;
    }

    @Override
    public BuilderImpl configuration(DiskConfiguration configuration) {
      this.configuration = checkNotNull(configuration);
      return this;
    }

    @Override
    public BuilderImpl diskId(DiskId diskId) {
      this.diskId = checkNotNull(diskId);
      return this;
    }

    @Override
    BuilderImpl creationTimestamp(Long creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    @Override
    BuilderImpl creationStatus(CreationStatus creationStatus) {
      this.creationStatus = creationStatus;
      return this;
    }

    @Override
    public BuilderImpl description(String description) {
      this.description = description;
      return this;
    }

    @Override
    BuilderImpl licenses(List<LicenseId> licenses) {
      this.licenses = licenses != null ? ImmutableList.copyOf(licenses) : null;
      return this;
    }

    @Override
    BuilderImpl attachedInstances(List<InstanceId> attachedInstances) {
      this.attachedInstances =
          attachedInstances != null ? ImmutableList.copyOf(attachedInstances) : null;
      return this;
    }

    @Override
    BuilderImpl lastAttachTimestamp(Long lastAttachTimestamp) {
      this.lastAttachTimestamp = lastAttachTimestamp;
      return this;
    }

    @Override
    BuilderImpl lastDetachTimestamp(Long lastDetachTimestamp) {
      this.lastDetachTimestamp = lastDetachTimestamp;
      return this;
    }

    @Override
    public DiskInfo build() {
      return new DiskInfo(this);
    }
  }

  DiskInfo(BuilderImpl builder) {
    this.id = builder.id;
    this.configuration = builder.configuration;
    this.creationTimestamp = builder.creationTimestamp;
    this.creationStatus = builder.creationStatus;
    this.diskId = builder.diskId;
    this.description = builder.description;
    this.licenses = builder.licenses;
    this.attachedInstances = builder.attachedInstances;
    this.lastAttachTimestamp = builder.lastAttachTimestamp;
    this.lastDetachTimestamp = builder.lastDetachTimestamp;
  }

  /**
   * Returns the creation timestamp in milliseconds since epoch.
   */
  public Long creationTimestamp() {
    return creationTimestamp;
  }

  /**
   * Returns the unique identifier for the disk; defined by the service.
   */
  public String id() {
    return id;
  }

  /**
   * Returns the disk configuration.
   */
  @SuppressWarnings("unchecked")
  public <T extends DiskConfiguration> T configuration() {
    return (T) configuration;
  }

  /**
   * Returns the disk identity.
   */
  public DiskId diskId() {
    return diskId;
  }

  /**
   * Returns the creation status of the disk.
   */
  public CreationStatus creationStatus() {
    return creationStatus;
  }

  /**
   * Returns a textual description of the disk.
   */
  public String description() {
    return description;
  }

  /**
   * Returns all applicable publicly visible licenses for the disk.
   */
  public List<LicenseId> licenses() {
    return licenses;
  }

  /**
   * Returns all the identities of the instances this disk is attached to.
   */
  public List<InstanceId> attachedInstances() {
    return attachedInstances;
  }

  /**
   * Returns the last attach timestamp in milliseconds since epoch.
   */
  public Long lastAttachTimestamp() {
    return lastAttachTimestamp;
  }

  /**
   * Returns the last detach timestamp in milliseconds since epoch.
   */
  public Long lastDetachTimestamp() {
    return lastDetachTimestamp;
  }

  /**
   * Returns a builder for the object.
   */
  public Builder toBuilder() {
    return new BuilderImpl(this);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("id", id)
        .add("diskId", diskId)
        .add("configuration", configuration)
        .add("creationTimestamp", creationTimestamp)
        .add("creationStatus", creationStatus)
        .add("description", description)
        .add("licenses", licenses)
        .add("attachedInstances", attachedInstances)
        .add("lastAttachTimestamp", lastAttachTimestamp)
        .add("lastDetachTimestamp", lastDetachTimestamp)
        .toString();
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskId, configuration, creationTimestamp, creationStatus, description,
        licenses, attachedInstances, lastAttachTimestamp, lastDetachTimestamp);
  }

  @Override
  public boolean equals(Object obj) {
    return obj != null
        && obj.getClass().equals(DiskInfo.class)
        && Objects.equals(toPb(), ((DiskInfo) obj).toPb());
  }

  /**
   * Returns a builder for a {@code DiskInfo} object given its identity and configuration. Use
   * {@link StandardDiskConfiguration} to create a simple disk given its type and size. Use
   * {@link SnapshotDiskConfiguration} to create a disk from a snapshot. Use
   * {@link ImageDiskConfiguration} to create a disk from a disk image.
   */
  public static Builder builder(DiskId diskId, DiskConfiguration configuration) {
    return new BuilderImpl(diskId, configuration);
  }

  /**
   * Returns a {@code DiskInfo} object given its identity and configuration. Use
   * {@link StandardDiskConfiguration} to create a simple disk given its type and size. Use
   * {@link SnapshotDiskConfiguration} to create a disk from a snapshot. Use
   * {@link ImageDiskConfiguration} to create a disk from a disk image.
   */
  public static DiskInfo of(DiskId diskId, DiskConfiguration configuration) {
    return builder(diskId, configuration).build();
  }

  DiskInfo setProjectId(String projectId) {
    return toBuilder()
        .diskId(diskId.setProjectId(projectId))
        .configuration(configuration.setProjectId(projectId))
        .build();
  }

  Disk toPb() {
    Disk diskPb = configuration.toPb();
    if (id != null) {
      diskPb.setId(new BigInteger(id));
    }
    if (creationTimestamp != null) {
      diskPb.setCreationTimestamp(TIMESTAMP_FORMATTER.print(creationTimestamp));
    }
    diskPb.setZone(diskId.zoneId().selfLink());
    if (creationStatus != null) {
      diskPb.setStatus(creationStatus.toString());
    }
    diskPb.setName(diskId.disk());
    diskPb.setDescription(description);
    diskPb.setSelfLink(diskId.selfLink());
    if (licenses != null) {
      diskPb.setLicenses(Lists.transform(licenses, LicenseId.TO_URL_FUNCTION));
    }
    if (attachedInstances != null) {
      diskPb.setUsers(Lists.transform(attachedInstances, InstanceId.TO_URL_FUNCTION));
    }
    if (lastAttachTimestamp != null) {
      diskPb.setLastAttachTimestamp(TIMESTAMP_FORMATTER.print(lastAttachTimestamp));
    }
    if (lastDetachTimestamp != null) {
      diskPb.setLastDetachTimestamp(TIMESTAMP_FORMATTER.print(lastDetachTimestamp));
    }
    return diskPb;
  }

  static DiskInfo fromPb(Disk diskPb) {
    return new BuilderImpl(diskPb).build();
  }
}
