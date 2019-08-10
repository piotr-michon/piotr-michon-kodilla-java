package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTaskList studentTaskList) {
        System.out.println(mentorName + ": New task was submitted by " + studentTaskList.getStudentName() + "\n" +
                "(total amount of completed tasks: " + studentTaskList.getCompletedTasks().size() + ")\n");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
