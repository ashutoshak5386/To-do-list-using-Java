package com.todoapp;

public class Task {
    private static int count = 0;
    private int id;
    private String description;

    public Task(String description) {
        this.id = ++count;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Description: " + description;
    }
}
