package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void update() {
        //given
        StudentTaskList studentTaskList1 = new StudentTaskList("Student 1");
        StudentTaskList studentTaskList2 = new StudentTaskList("Student 2");
        StudentTaskList studentTaskList3 = new StudentTaskList("Student 3");
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        studentTaskList1.registerObserver(mentor1);
        studentTaskList2.registerObserver(mentor2);
        studentTaskList3.registerObserver(mentor1);
        //when
        studentTaskList1.addCompletedTasks("Task 1.1");
        studentTaskList1.addCompletedTasks("Task 1.2");
        studentTaskList2.addCompletedTasks("Task 2.1");
        studentTaskList2.addCompletedTasks("Task 2.2");
        studentTaskList3.addCompletedTasks("Task 3.1");

        //then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
