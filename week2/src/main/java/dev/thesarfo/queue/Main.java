package dev.thesarfo.queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Task Scheduler");
        System.out.println("Available commands: ADD, COMPLETE, DISPLAY, EXIT");

        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "ADD":
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    taskScheduler.addTask(task);
                    break;
                case "COMPLETE":
                    taskScheduler.completeTask();
                    break;
                case "DISPLAY":
                    taskScheduler.displayTasks();
                    break;
                case "EXIT":
                    System.out.println("Exiting the Task Scheduler.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}

