package com.kodilla.stream.portfolio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTestSuite {

    @Test
    void testAddTaskListAverageWorkingOnTask() {
        //Given
        Board project = prepareTestData();

        //When
        System.out.println(project.getTaskLists());
        List<Long> tasksCreationDaysList = project.getTaskLists().stream()
                .filter(taskList -> "In progress".equals(taskList.getName()))
                .map(TaskList::getTasks)
                .flatMap(tasks -> tasks.stream()
                        .map(Task::getCreated))
                .map(created -> LocalDate.now().toEpochDay() - created.toEpochDay())
                .toList();

        long average = tasksCreationDaysList.stream().mapToLong(Long::longValue).sum() / tasksCreationDaysList.size();

        int listSize = tasksCreationDaysList.size();
        long listSum = tasksCreationDaysList.stream().mapToLong(Long::longValue).sum();
        long listAverage = listSum / listSize;

        //Then
        assertEquals(10, listAverage);
        assertEquals(average, listAverage);
    }

    @Test
    void testAddTaskList() {
        //Given
        Board project = prepareTestData();

        //When + Then
        assertEquals(3, project.getTaskLists().size());
    }

    @Test
    void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData();

        //When
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .toList();

        //Then
        assertEquals(2, tasks.size());
        assertEquals(user, tasks.get(0).getAssignedUser());
        assertEquals(user, tasks.get(1).getAssignedUser());
    }

    @Test
    void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .toList();

        //Then
        assertEquals(1, tasks.size());
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }

    @Test
    void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        var inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        var longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(Task::getCreated)
                .filter(d -> !d.isAfter(LocalDate.now().minusDays(10)))
                .count();

        //Then
        assertEquals(2, longTasks);
    }

    private Board prepareTestData() {
        //users
        User developer1 = new User("developer1", "John Smith");
        User projectManager1 = new User("projectmanager1", "Nina White");
        User developer2 = new User("developer2", "Emilia Stephanson");
        User developer3 = new User("developer3", "Konrad Bridge");

        //tasks
        Task todoTask1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                developer1,
                projectManager1,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task inProgressTask1 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                developer1,
                projectManager1,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task todoTask2 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                developer2,
                projectManager1,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task inProgressTask2 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                developer2,
                projectManager1,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task inProgressTask3 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                developer3,
                projectManager1,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task doneTask = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                developer3,
                projectManager1,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(todoTask1);
        taskListToDo.addTask(todoTask2);

        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(inProgressTask1);
        taskListInProgress.addTask(inProgressTask2);
        taskListInProgress.addTask(inProgressTask3);

        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(doneTask);

        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }


}