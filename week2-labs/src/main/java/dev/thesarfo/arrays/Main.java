package dev.thesarfo.arrays;

import java.util.Scanner;

import static dev.thesarfo.arrays.StudentManager.getValidIntegerInput;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nStudent Manager:");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = getValidIntegerInput(scanner);
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = scanner.nextLine();
                    manager.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = scanner.nextLine();
                    manager.searchStudent(nameToSearch);
                    break;
                case 3:
                    System.out.print("Enter student name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    manager.deleteStudent(nameToDelete);
                    break;
                case 4:
                    manager.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
