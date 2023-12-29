package org.example.todo_list;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<Task>();
    }

    public void addTask(String taskTitle, String taskDescription, boolean taskStatus) {
        Task task = new Task(taskTitle, taskDescription, taskStatus);
        tasks.add(task);
    }

    public void removeTaskByName(Task taskTitle) {
        for (Task task : tasks) {
            if (taskTitle.getTaskID().equals(task.getTaskID())) {
                tasks.remove(task);
                break;
            }
        }
    }

    public List<Task> listAllTasks() {
        for (Task task : tasks) {
            task.toString();
        }
        return tasks;
    }



}
