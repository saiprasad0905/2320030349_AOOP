package taskmanagement;

import java.util.*;

public class Taskmanager {
    private ArrayList<Task> tasks;

    public Taskmanager() {
        tasks = new ArrayList<>();
    }

    // Add a new task
    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
        System.out.println("Task added: " + description);
    }

    // Update a task's description by position
    public void updateTask(int position, String newDescription) {
        if (position >= 0 && position < tasks.size()) {
            Task task = tasks.get(position);
            task.setDescription(newDescription);
            System.out.println("Task at position " + position + " updated to: " + newDescription);
        } else {
            System.out.println("Invalid position. Cannot update task.");
        }
    }

    // Remove a task by position
    public void removeTask(int position) {
        if (position >= 0 && position < tasks.size()) {
            Task removedTask = tasks.remove(position);
            System.out.println("Task removed: " + removedTask.getDescription());
        } else {
            System.out.println("Invalid position. Cannot remove task.");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getDescription());
            }
        }
    }

    public static void main(String[] args) {
        Taskmanager Taskmanager = new Taskmanager();

        // Add tasks
        Taskmanager.addTask("Finish homework");
        Taskmanager.addTask("Go to the gym");
        Taskmanager.addTask("Buy groceries");

        // Display tasks
        Taskmanager.displayTasks();

        // Update a task
        Taskmanager.updateTask(1, "Attend yoga class");

        // Display tasks again
        Taskmanager.displayTasks();

        // Remove a task
        Taskmanager.removeTask(0);

        // Display tasks one last time
        Taskmanager.displayTasks();
    }
}
