/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/task.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.batch.v1;

public interface ComputeResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.ComputeResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The milliCPU count.
   *
   * `cpuMilli` defines the amount of CPU resources per task in milliCPU units.
   * For example, `1000` corresponds to 1 vCPU per task. If undefined, the
   * default value is `2000`.
   *
   * If you also define the VM's machine type using the `machineType` in
   * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
   * field or inside the `instanceTemplate` in the
   * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
   * field, make sure the CPU resources for both fields are compatible with each
   * other and with how many tasks you want to allow to run on the same VM at
   * the same time.
   *
   * For example, if you specify the `n2-standard-2` machine type, which has 2
   * vCPUs each, you are recommended to set `cpuMilli` no more than `2000`, or
   * you are recommended to run two tasks on the same VM if you set `cpuMilli`
   * to `1000` or less.
   * </pre>
   *
   * <code>int64 cpu_milli = 1;</code>
   *
   * @return The cpuMilli.
   */
  long getCpuMilli();

  /**
   *
   *
   * <pre>
   * Memory in MiB.
   *
   * `memoryMib` defines the amount of memory per task in MiB units.
   * If undefined, the default value is `2000`.
   * If you also define the VM's machine type using the `machineType` in
   * [InstancePolicy](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicy)
   * field or inside the `instanceTemplate` in the
   * [InstancePolicyOrTemplate](https://cloud.google.com/batch/docs/reference/rest/v1/projects.locations.jobs#instancepolicyortemplate)
   * field, make sure the memory resources for both fields are compatible with
   * each other and with how many tasks you want to allow to run on the same VM
   * at the same time.
   *
   * For example, if you specify the `n2-standard-2` machine type, which has 8
   * GiB each, you are recommended to set `memoryMib` to no more than `8192`,
   * or you are recommended to run two tasks on the same VM if you set
   * `memoryMib` to `4096` or less.
   * </pre>
   *
   * <code>int64 memory_mib = 2;</code>
   *
   * @return The memoryMib.
   */
  long getMemoryMib();

  /**
   *
   *
   * <pre>
   * Extra boot disk size in MiB for each task.
   * </pre>
   *
   * <code>int64 boot_disk_mib = 4;</code>
   *
   * @return The bootDiskMib.
   */
  long getBootDiskMib();
}
