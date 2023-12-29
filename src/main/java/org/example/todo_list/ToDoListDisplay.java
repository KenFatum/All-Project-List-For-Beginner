package org.example.todo_list;

import java.util.List;
import java.util.Scanner;

public class ToDoListDisplay {
    ToDoList toDoList = new ToDoList();

    Scanner scanner = new Scanner(System.in);

    public void startToDoList() {
        System.out.println("Welcome to the ToDo-List program.");
        System.out.println("Select an option from the menu:");

        while(true) {
            System.out.println("""
                    [-----------------------------------------------------]
                    [1] Create a new task.
                    [2] List all tasks.
                    [3] Delete a task (by name).
                    [4] Exit.
                    [-----------------------------------------------------]
                    """);
            System.out.print(">> ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> createNewTask();
                case "2" -> listAllTasks();
                case "3" -> deleteTaskByName();
                case "4" -> {return;}
            }
        }
    }

    private void createNewTask() {
        System.out.print("Enter the Title of the Task: ");
        String taskTitle = scanner.nextLine();
        System.out.print("Enter the Description of the Task: ");
        String taskDescription = scanner.nextLine();
        System.out.print("Enter the Status of your task, if its done or not (true or false): ");
        boolean taskStatus = scanner.nextBoolean();
        toDoList.addTask(taskTitle, taskDescription, taskStatus);
        System.out.println("Task created successfully!");
    }

    private void listAllTasks() {
        for (Task task : toDoList.listAllTasks()) {
            System.out.println(task);
        }
    }

    private void deleteTaskByName() {
        System.out.print("Enter the name of the task you want to delete: ");
        String taskName = scanner.nextLine();
        List<Task> tasks = toDoList.listAllTasks();
        for (Task task : tasks) {
            if (task.getTaskTitle().equals(taskName)) {
                toDoList.removeTaskByName(task);
                break;
            }
            else {
                System.out.println("Task not found!");
            }
        }
    }
}
