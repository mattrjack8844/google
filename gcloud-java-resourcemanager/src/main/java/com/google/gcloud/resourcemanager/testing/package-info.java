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

/**
 * A testing helper for Google Cloud Resource Manager.
 *
 * <p>A simple usage example:
 * <p>Before the test:
 * <pre> {@code
 * LocalResourceManagerHelper resourceManagerHelper = LocalResourceManagerHelper.create();
 * // TODO(ajaykannan): implement the following line when ResourceManagerImpl is checked in.
 * ResourceManager resourceManager = resourceManagerHelper.options().service();
 * implement this in the next PR
 * resourceManager.list();
 * } </pre>
 *
 * <p>After the test:
 * <pre> {@code
 * resourceManagerHelper.stop();
 * } </pre>
 */
package com.google.gcloud.resourcemanager.testing;
