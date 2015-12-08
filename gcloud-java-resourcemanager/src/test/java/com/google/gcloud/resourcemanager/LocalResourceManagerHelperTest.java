package com.google.gcloud.resourcemanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableMap;
import com.google.gcloud.resourcemanager.testing.LocalResourceManagerHelper;
import com.google.gcloud.spi.DefaultResourceManagerRpc;
import com.google.gcloud.spi.ResourceManagerRpc;
import com.google.gcloud.spi.ResourceManagerRpc.Tuple;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LocalResourceManagerHelperTest {

  private static final int PORT = 8080;
  private static final long DEFAULT_PROJECT_NUMBER = 123456789L;
  private static final String DEFAULT_CREATE_TIME = "2011-11-11T01:23:45.678Z";
  private static final String DEFAULT_PARENT_ID = "12345";
  private static final String DEFAULT_PARENT_TYPE = "organization";
  private static final com.google.api.services.cloudresourcemanager.model.ResourceId PARENT =
      new com.google.api.services.cloudresourcemanager.model.ResourceId()
          .setId(DEFAULT_PARENT_ID)
          .setType(DEFAULT_PARENT_TYPE);
  private static final Map<ResourceManagerRpc.Option, ?> EMPTY_RPC_OPTIONS = ImmutableMap.of();
  private static final LocalResourceManagerHelper RESOURCE_MANAGER_HELPER =
      LocalResourceManagerHelper.create(PORT);
  private static final ResourceManagerRpc rpc = new DefaultResourceManagerRpc(
      ResourceManagerOptions.builder()
      .host("http://localhost:" + PORT)
      .build());
  private static final com.google.api.services.cloudresourcemanager.model.Project PARTIAL_PROJECT =
      new com.google.api.services.cloudresourcemanager.model.Project().setProjectId(
          "partial-project");
  private static final com.google.api.services.cloudresourcemanager.model.Project COMPLETE_PROJECT =
      new com.google.api.services.cloudresourcemanager.model.Project()
          .setProjectId("complete-project")
          .setName("full project")
          .setLabels(ImmutableMap.of("k1", "v1", "k2", "v2"))
          .setProjectNumber(DEFAULT_PROJECT_NUMBER)
          .setCreateTime(DEFAULT_CREATE_TIME)
          .setLifecycleState("ACTIVE");
  private static final com.google.api.services.cloudresourcemanager.model.Project
      DELETE_REQUESTED_PROJECT = copyFrom(COMPLETE_PROJECT)
          .setProjectId("delete-requested-project-id")
          .setLifecycleState("DELETE_REQUESTED");
  private static final com.google.api.services.cloudresourcemanager.model.Project
      DELETE_IN_PROGRESS_PROJECT = copyFrom(COMPLETE_PROJECT)
          .setProjectId("delete-in-progress-project-id")
          .setLifecycleState("DELETE_IN_PROGRESS");
  private static final com.google.api.services.cloudresourcemanager.model.Project
      PROJECT_WITH_PARENT =
      copyFrom(COMPLETE_PROJECT).setProjectId("project-with-parent-id").setParent(PARENT);

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @BeforeClass
  public static void beforeClass() {
    RESOURCE_MANAGER_HELPER.start();
  }

  private static com.google.api.services.cloudresourcemanager.model.Project copyFrom(
      com.google.api.services.cloudresourcemanager.model.Project from) {
    return new com.google.api.services.cloudresourcemanager.model.Project()
        .setProjectId(from.getProjectId())
        .setName(from.getName())
        .setLabels(from.getLabels() != null ? ImmutableMap.copyOf(from.getLabels()) : null)
        .setProjectNumber(
            from.getProjectNumber() != null ? from.getProjectNumber().longValue() : null)
        .setCreateTime(from.getCreateTime())
        .setLifecycleState(from.getLifecycleState())
        .setParent(from.getParent() != null ? from.getParent().clone() : null);
  }

  @Before
  public void setUp() {
    RESOURCE_MANAGER_HELPER.clearProjects();
  }

  @AfterClass
  public static void afterClass() {
    RESOURCE_MANAGER_HELPER.stop();
  }
  
  @Test
  public void testCreate() {
    com.google.api.services.cloudresourcemanager.model.Project returnedProject =
        rpc.create(PARTIAL_PROJECT);
    assertEquals(PARTIAL_PROJECT.getProjectId(), returnedProject.getProjectId());
    assertEquals("ACTIVE", returnedProject.getLifecycleState());
    assertNull(returnedProject.getLabels());
    assertNull(returnedProject.getName());
    assertNull(returnedProject.getParent());
    assertNotNull(returnedProject.getProjectNumber());
    assertNotNull(returnedProject.getCreateTime());
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Requested entity already exists.");
    rpc.create(PARTIAL_PROJECT);
    returnedProject = rpc.create(PROJECT_WITH_PARENT);
    assertEquals(PROJECT_WITH_PARENT.getProjectId(), returnedProject.getProjectId());
    assertEquals("ACTIVE", returnedProject.getLifecycleState());
    assertEquals(PARENT, returnedProject.getParent());
    assertEquals(PROJECT_WITH_PARENT.getLabels(), returnedProject.getLabels());
    assertEquals(PROJECT_WITH_PARENT.getName(), returnedProject.getName());
    assertNotNull(returnedProject.getProjectNumber());
    assertFalse(PROJECT_WITH_PARENT.getCreateTime().equals(returnedProject.getCreateTime()));
  }

  @Test
  public void testIsInvalidProjectId() {
    com.google.api.services.cloudresourcemanager.model.Project project =
        new com.google.api.services.cloudresourcemanager.model.Project();
    expectInvalidArgumentException(project);
    project.setProjectId("abcde");
    expectInvalidArgumentException(project);
    project.setProjectId("this-project-id-is-more-than-thirty-characters-long");
    expectInvalidArgumentException(project);
    project.setProjectId("project-id-with-invalid-character-?");
    expectInvalidArgumentException(project);
    project.setProjectId("-invalid-start-character");
    expectInvalidArgumentException(project);
    project.setProjectId("invalid-ending-character-");
    expectInvalidArgumentException(project);
    project.setProjectId("some-valid-project-id-12345");
    rpc.create(project);
    assertNotNull(RESOURCE_MANAGER_HELPER.getProject(project.getProjectId()));
  }

  private void expectInvalidArgumentException(
      com.google.api.services.cloudresourcemanager.model.Project project) {
    try {
      rpc.create(project);
      fail("Should fail because of an invalid argument.");
    } catch (ResourceManagerException e) {
      assertEquals("Request contains an invalid argument.", e.getMessage());
    }
  }

  @Test
  public void testIsInvalidProjectName() {
    com.google.api.services.cloudresourcemanager.model.Project project =
        new com.google.api.services.cloudresourcemanager.model.Project().setProjectId(
            "some-project-id");
    rpc.create(project);
    assertNull(RESOURCE_MANAGER_HELPER.getProject(project.getProjectId()).getName());
    RESOURCE_MANAGER_HELPER.removeProject(project.getProjectId());
    project.setName("This is a valid name-'\"!");
    rpc.create(project);
    assertEquals(
        project.getName(), RESOURCE_MANAGER_HELPER.getProject(project.getProjectId()).getName());
    RESOURCE_MANAGER_HELPER.removeProject(project.getProjectId());
    project.setName("invalid-character-,");
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Request contains an invalid argument.");
    rpc.create(project);
  }

  @Test
  public void testIsInvalidProjectLabels() {
    com.google.api.services.cloudresourcemanager.model.Project project =
        new com.google.api.services.cloudresourcemanager.model.Project().setProjectId(
            "some-valid-project-id");
    rpc.create(project);
    RESOURCE_MANAGER_HELPER.removeProject(project.getProjectId());
    project.setLabels(ImmutableMap.of("", "v1"));
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of(
        "this-project-label-is-more-than-sixty-three-characters-long-so-it-should-fail", "v1"));
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of(
        "k1", "this-project-label-is-more-than-sixty-three-characters-long-so-it-should-fail"));
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of("k1?", "v1"));
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of("k1", "v1*"));
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of("-k1", "v1"));
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of("k1", "-v1"));
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of("k1-", "v1"));
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of("k1", "v1-"));
    expectInvalidArgumentException(project);
    Map<String, String> tooManyLabels = new HashMap<>();
    for (int i = 0; i < 257; i++) {
      tooManyLabels.put("k" + Integer.toString(i), "v" + Integer.toString(i));
    }
    expectInvalidArgumentException(project);
    project.setLabels(ImmutableMap.of("k-1", ""));
    rpc.create(project);
    assertNotNull(RESOURCE_MANAGER_HELPER.getProject(project.getProjectId()));
    assertTrue(RESOURCE_MANAGER_HELPER.getProject(project.getProjectId())
        .getLabels()
        .get("k-1")
        .isEmpty());
  }

  @Test
  public void testDelete() {
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    rpc.delete(COMPLETE_PROJECT.getProjectId());
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("The caller does not have permission.");
    rpc.delete("some-nonexistant-project-id");
  }

  @Test
  public void testDeleteWhenDeleteInProgress() {
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    RESOURCE_MANAGER_HELPER.changeLifecycleState(
        COMPLETE_PROJECT.getProjectId(), "DELETE_IN_PROGRESS");
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Precondition check failed.");
    rpc.delete(COMPLETE_PROJECT.getProjectId());
  }

  @Test
  public void testDeleteWhenDeleteRequested() {
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    RESOURCE_MANAGER_HELPER.changeLifecycleState(
        COMPLETE_PROJECT.getProjectId(), "DELETE_REQUESTED");
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Precondition check failed.");
    rpc.delete(COMPLETE_PROJECT.getProjectId());
  }

  @Test
  public void testGet() {
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    com.google.api.services.cloudresourcemanager.model.Project returnedProject =
        rpc.get(COMPLETE_PROJECT.getProjectId(), EMPTY_RPC_OPTIONS);
    assertEquals(COMPLETE_PROJECT, returnedProject);
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("The caller does not have permission.");
    RESOURCE_MANAGER_HELPER.removeProject(COMPLETE_PROJECT.getProjectId());
    rpc.get(COMPLETE_PROJECT.getProjectId(), EMPTY_RPC_OPTIONS);
  }

  @Test
  public void testGetWithOptions() {
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    Map<ResourceManagerRpc.Option, Object> rpcOptions = new HashMap<>();
    rpcOptions.put(ResourceManagerRpc.Option.FIELDS, "projectId,name,createTime");
    com.google.api.services.cloudresourcemanager.model.Project returnedProject =
        rpc.get(COMPLETE_PROJECT.getProjectId(), rpcOptions);
    assertFalse(COMPLETE_PROJECT.equals(returnedProject));
    assertEquals(COMPLETE_PROJECT.getProjectId(), returnedProject.getProjectId());
    assertEquals(COMPLETE_PROJECT.getName(), returnedProject.getName());
    assertEquals(COMPLETE_PROJECT.getCreateTime(), returnedProject.getCreateTime());
    assertNull(returnedProject.getParent());
    assertNull(returnedProject.getProjectNumber());
    assertNull(returnedProject.getLifecycleState());
    assertNull(returnedProject.getLabels());
  }

  @Test
  public void testList() {
    Tuple<String, Iterable<com.google.api.services.cloudresourcemanager.model.Project>> projects =
        rpc.list(EMPTY_RPC_OPTIONS);
    assertNull(projects.x()); // change this when #421 is resolved
    assertFalse(projects.y().iterator().hasNext());
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    RESOURCE_MANAGER_HELPER.addProject(PROJECT_WITH_PARENT);
    projects = rpc.list(EMPTY_RPC_OPTIONS);
    Iterator<com.google.api.services.cloudresourcemanager.model.Project> it =
        projects.y().iterator();
    assertEquals(COMPLETE_PROJECT, it.next());
    assertEquals(PROJECT_WITH_PARENT, it.next());
  }

  @Test
  public void testListFieldOptions() {
    Map<ResourceManagerRpc.Option, Object> rpcOptions = new HashMap<>();
    rpcOptions.put(ResourceManagerRpc.Option.FIELDS, "projectId,name,labels");
    rpcOptions.put(ResourceManagerRpc.Option.PAGE_TOKEN, "somePageToken");
    rpcOptions.put(ResourceManagerRpc.Option.PAGE_SIZE, 1);
    RESOURCE_MANAGER_HELPER.addProject(PROJECT_WITH_PARENT);
    Tuple<String, Iterable<com.google.api.services.cloudresourcemanager.model.Project>> projects =
        rpc.list(rpcOptions);
    com.google.api.services.cloudresourcemanager.model.Project returnedProject =
        projects.y().iterator().next();
    assertFalse(PROJECT_WITH_PARENT.equals(returnedProject));
    assertEquals(PROJECT_WITH_PARENT.getProjectId(), returnedProject.getProjectId());
    assertEquals(PROJECT_WITH_PARENT.getName(), returnedProject.getName());
    assertEquals(PROJECT_WITH_PARENT.getLabels(), returnedProject.getLabels());
    assertNull(returnedProject.getParent());
    assertNull(returnedProject.getProjectNumber());
    assertNull(returnedProject.getLifecycleState());
    assertNull(returnedProject.getCreateTime());
  }

  @Test
  public void testListFilterOptions() {
    Map<ResourceManagerRpc.Option, Object> rpcFilterOptions = new HashMap<>();
    rpcFilterOptions.put(
        ResourceManagerRpc.Option.FILTER, "id:* name:myProject labels.color:blue LABELS.SIZE:*");
    com.google.api.services.cloudresourcemanager.model.Project matchingProject =
        new com.google.api.services.cloudresourcemanager.model.Project()
            .setProjectId("matching-project")
            .setName("MyProject")
            .setProjectNumber(DEFAULT_PROJECT_NUMBER)
            .setLabels(ImmutableMap.of("Color", "blue", "size", "Big"));
    com.google.api.services.cloudresourcemanager.model.Project nonMatchingProject1 =
        new com.google.api.services.cloudresourcemanager.model.Project()
            .setProjectId("non-matching-project1")
            .setName("myProject")
            .setProjectNumber(DEFAULT_PROJECT_NUMBER);
    nonMatchingProject1.setLabels(ImmutableMap.of("color", "blue"));
    com.google.api.services.cloudresourcemanager.model.Project nonMatchingProject2 =
        new com.google.api.services.cloudresourcemanager.model.Project()
            .setProjectId("non-matching-project2")
            .setName("myProj")
            .setProjectNumber(DEFAULT_PROJECT_NUMBER)
            .setLabels(ImmutableMap.of("color", "blue", "size", "big"));
    com.google.api.services.cloudresourcemanager.model.Project nonMatchingProject3 =
        new com.google.api.services.cloudresourcemanager.model.Project()
            .setProjectId("non-matching-project3")
            .setProjectNumber(DEFAULT_PROJECT_NUMBER);
    RESOURCE_MANAGER_HELPER.addProject(matchingProject);
    RESOURCE_MANAGER_HELPER.addProject(nonMatchingProject1);
    RESOURCE_MANAGER_HELPER.addProject(nonMatchingProject2);
    RESOURCE_MANAGER_HELPER.addProject(nonMatchingProject3);
    for (com.google.api.services.cloudresourcemanager.model.Project p :
        rpc.list(rpcFilterOptions).y()) {
      assertFalse(p.equals(nonMatchingProject1));
      assertFalse(p.equals(nonMatchingProject2));
      assertTrue(p.equals(matchingProject));
    }
  }

  @Test
  public void testReplace() {
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    String newName = "new name";
    Map<String, String> newLabels = ImmutableMap.of("new k1", "new v1");
    com.google.api.services.cloudresourcemanager.model.Project anotherCompleteProject =
        new com.google.api.services.cloudresourcemanager.model.Project()
            .setProjectId(COMPLETE_PROJECT.getProjectId())
            .setName(newName)
            .setLabels(newLabels)
            .setProjectNumber(987654321L)
            .setCreateTime("2000-01-01T00:00:00.001Z")
            .setLifecycleState("DELETE_REQUESTED");
    rpc.replace(anotherCompleteProject);
    com.google.api.services.cloudresourcemanager.model.Project returnedProject =
        RESOURCE_MANAGER_HELPER.getProject(COMPLETE_PROJECT.getProjectId());
    assertEquals(COMPLETE_PROJECT.getProjectId(), returnedProject.getProjectId());
    assertEquals(newName, returnedProject.getName());
    assertEquals(newLabels, returnedProject.getLabels());
    assertEquals(COMPLETE_PROJECT.getProjectNumber(), returnedProject.getProjectNumber());
    assertEquals(COMPLETE_PROJECT.getCreateTime(), returnedProject.getCreateTime());
    assertEquals(COMPLETE_PROJECT.getLifecycleState(), returnedProject.getLifecycleState());
    assertNull(returnedProject.getParent());
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("The caller does not have permission.");
    com.google.api.services.cloudresourcemanager.model.Project nonexistantProject =
        new com.google.api.services.cloudresourcemanager.model.Project();
    nonexistantProject.setProjectId("some-project-id-that-does-not-exist");
    rpc.replace(nonexistantProject);
  }

  @Test
  public void testReplaceWhenDeleteRequested() {
    RESOURCE_MANAGER_HELPER.addProject(DELETE_REQUESTED_PROJECT);
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Precondition check failed.");
    com.google.api.services.cloudresourcemanager.model.Project anotherProject =
        new com.google.api.services.cloudresourcemanager.model.Project().setProjectId(
            DELETE_REQUESTED_PROJECT.getProjectId());
    rpc.replace(anotherProject);
  }

  @Test
  public void testReplaceWhenDeleteInProgress() {
    RESOURCE_MANAGER_HELPER.addProject(DELETE_IN_PROGRESS_PROJECT);
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Precondition check failed.");
    com.google.api.services.cloudresourcemanager.model.Project anotherProject =
        new com.google.api.services.cloudresourcemanager.model.Project().setProjectId(
            DELETE_IN_PROGRESS_PROJECT.getProjectId());
    rpc.replace(anotherProject);
  }

  @Test
  public void testReplaceAddingParent() {
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    com.google.api.services.cloudresourcemanager.model.Project anotherProject =
        new com.google.api.services.cloudresourcemanager.model.Project()
            .setProjectId(COMPLETE_PROJECT.getProjectId())
            .setParent(PARENT);
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Request contains an invalid argument.");
    rpc.replace(anotherProject);
  }

  @Test
  public void testReplaceRemovingParent() {
    RESOURCE_MANAGER_HELPER.addProject(PROJECT_WITH_PARENT);
    com.google.api.services.cloudresourcemanager.model.Project anotherProject =
        new com.google.api.services.cloudresourcemanager.model.Project().setProjectId(
            PROJECT_WITH_PARENT.getProjectId());
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Request contains an invalid argument.");
    rpc.replace(anotherProject);
  }

  @Test
  public void testUndelete() {
    RESOURCE_MANAGER_HELPER.addProject(DELETE_REQUESTED_PROJECT);
    rpc.undelete(DELETE_REQUESTED_PROJECT.getProjectId());
    com.google.api.services.cloudresourcemanager.model.Project returnedProject =
        rpc.get(DELETE_REQUESTED_PROJECT.getProjectId(), EMPTY_RPC_OPTIONS);
    assertEquals("ACTIVE", returnedProject.getLifecycleState());
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("The caller does not have permission.");
    rpc.undelete("invalid-project-id");
  }

  @Test
  public void testUndeleteWhenActive() {
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Precondition check failed.");
    rpc.undelete(COMPLETE_PROJECT.getProjectId());
  }

  @Test
  public void testUndeleteWhenDeleteInProgress() {
    RESOURCE_MANAGER_HELPER.addProject(DELETE_IN_PROGRESS_PROJECT);
    thrown.expect(ResourceManagerException.class);
    thrown.expectMessage("Precondition check failed.");
    rpc.undelete(DELETE_IN_PROGRESS_PROJECT.getProjectId());
  }

  @Test
  public void testChangeLifecycleStatus() {
    assertFalse(RESOURCE_MANAGER_HELPER.changeLifecycleState(
        COMPLETE_PROJECT.getProjectId(), "DELETE_IN_PROGRESS"));
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    assertTrue(RESOURCE_MANAGER_HELPER.changeLifecycleState(
        COMPLETE_PROJECT.getProjectId(), "DELETE_IN_PROGRESS"));
    thrown.expect(IllegalArgumentException.class);
    assertFalse(RESOURCE_MANAGER_HELPER.changeLifecycleState(
        COMPLETE_PROJECT.getProjectId(), "INVALID_STATE"));
  }

  @Test
  public void testAddProject() {
    assertTrue(RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT));
    com.google.api.services.cloudresourcemanager.model.Project project =
        new com.google.api.services.cloudresourcemanager.model.Project().setProjectId(
            COMPLETE_PROJECT.getProjectId());
    assertFalse(RESOURCE_MANAGER_HELPER.addProject(project));
    assertFalse(
        project.equals(RESOURCE_MANAGER_HELPER.getProject(COMPLETE_PROJECT.getProjectId())));
    assertFalse(RESOURCE_MANAGER_HELPER.addProject(
        new com.google.api.services.cloudresourcemanager.model.Project()));
  }

  @Test
  public void testGetProject() {
    assertNull(RESOURCE_MANAGER_HELPER.getProject("some-invalid-project-id"));
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    assertEquals(
        COMPLETE_PROJECT, RESOURCE_MANAGER_HELPER.getProject(COMPLETE_PROJECT.getProjectId()));
  }

  @Test
  public void testRemoveProject() {
    assertFalse(RESOURCE_MANAGER_HELPER.removeProject(COMPLETE_PROJECT.getProjectId()));
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    assertTrue(RESOURCE_MANAGER_HELPER.removeProject(COMPLETE_PROJECT.getProjectId()));
  }

  @Test
  public void testChangeProjectNumber() {
    assertFalse(RESOURCE_MANAGER_HELPER.changeProjectNumber(COMPLETE_PROJECT.getProjectId(), 123L));
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    assertTrue(RESOURCE_MANAGER_HELPER.changeProjectNumber(COMPLETE_PROJECT.getProjectId(), 123L));
  }

  @Test
  public void testChangeCreateTime() {
    assertFalse(RESOURCE_MANAGER_HELPER.changeCreateTime(
        COMPLETE_PROJECT.getProjectId(), "2015-01-01T01:01:01.001Z"));
    RESOURCE_MANAGER_HELPER.addProject(COMPLETE_PROJECT);
    assertTrue(RESOURCE_MANAGER_HELPER.changeCreateTime(
        COMPLETE_PROJECT.getProjectId(), "2015-01-01T01:01:01.001Z"));
  }

  @Test
  public void testClearProjects() {
    RESOURCE_MANAGER_HELPER.clearProjects();
    assertFalse(rpc.list(EMPTY_RPC_OPTIONS).y().iterator().hasNext());
  }
}
