package org.example.todo_list;


public class Task {
    private int taskID;
    private String taskTitle;
    private String taskDescription;

    // taskStatus shows if the task is done or not.
    private boolean taskStatus;

    public Task() {}

    public Task(String taskTitle, String taskDescription, boolean taskStatus) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskID() {
        return taskID++;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    @Override
    public String toString() {
        return "Task [ID=" + taskID +
                ", Title=" + taskTitle +
                ", Description=" + taskDescription +
                ", Status=" + taskStatus + "]";
    }

}
