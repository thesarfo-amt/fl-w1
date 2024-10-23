package dev.thesarfo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    private final Queue<String> taskQueue;

    public TaskScheduler() {
        taskQueue = new LinkedList<>();
    }

    public void addTask(String task) {
        taskQueue.offer(task);
        System.out.println("Task added: " + task);
    }

    public void completeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks to complete.");
            return;
        }
        String completedTask = taskQueue.poll();
        System.out.println("Completed task: " + completedTask);
    }

    public void displayTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks in the queue.");
        } else {
            System.out.println("Current tasks in the queue: " + taskQueue);
        }
    }
}

