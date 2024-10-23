package dev.thesarfo.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager implements ManagerOps {

    private static final int MAX_SIZE = 5;
    private final String[] students;
    private int studentCount;

    public StudentManager() {
        students = new String[MAX_SIZE];
        studentCount = 0;
    }

    public void addStudent(String name) {
        if (studentCount == MAX_SIZE) {
            System.out.println("Error: Student List is full! You cannot add more students");
        } else if (!validName(name)) {
            System.out.println();
            //System.out.println("Error: Invalid name. Please enter a valid name");
        } else {
            students[studentCount] = name;
            studentCount++;
            System.out.println("\n");
            System.out.println("***************************");
            System.out.println("Student added successfully");
            System.out.println("***************************");
        }
    }

    public void searchStudent(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                System.out.println("\n");
                System.out.println("***************************");
                System.out.println("Student " + name + " found at index " + i);
                System.out.println("***************************");
                return;
            }
        }
        System.out.println("\n");
        System.out.println("***************************");
        System.out.println("Student " + name + " not found");
        System.out.println("***************************");
    }

    public void deleteStudent(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                System.out.println("\n");
                System.out.println("***************************");
                System.out.println("Student " + name + " deleted successfully.");
                System.out.println("***************************");
                return;
            }
        }
        System.out.println("Student " + name + " not found. Deletion failed.");
    }

    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("\n");
            System.out.println("***************************");
            System.out.println("No students to display.");
            System.out.println("***************************");
        } else {
            System.out.println("\n");
            System.out.println("***************************");
            System.out.println("List of students:");
            System.out.println("***************************");
            for (int i = 0; i < studentCount; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
    }

    public static int getValidIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    public static boolean validName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            return false;
        }

        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                System.out.println();
                System.out.println("Error: Name contains invalid characters.");
                return false;
            }
        }
        return true;
    }


}
