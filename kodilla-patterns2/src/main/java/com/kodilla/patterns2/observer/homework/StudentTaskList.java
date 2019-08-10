package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTaskList implements Observable {
    private final List<Observer> observers;
    private final List<String> completedTasks;
    private final String studentName;

    public StudentTaskList(String studentName) {
        observers = new ArrayList<>();
        completedTasks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addCompletedTasks(String task) {
        completedTasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getCompletedTasks() {
        return completedTasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
