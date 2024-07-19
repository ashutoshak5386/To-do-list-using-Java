package com.todoapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void removeTask(int id) {
        Iterator<Task> iterator = tasks.iterator();
        boolean taskRemoved = false;

        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove();
                taskRemoved = true;
                System.out.println("Task removed successfully.");
            }
        }

        if (!taskRemoved) {
            System.out.println("Task with ID " + id + " not found.");
        }
    }
}
