package dev.thesarfo.linkedlist;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Search");
            System.out.println("5. Delete");
            System.out.println("6. Display");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = getValidIntegerInput(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at beginning: ");
                    list.addAtBeginning(getValidIntegerInput(scanner));
                    break;
                case 2:
                    System.out.print("Enter value to add at end: ");
                    list.addAtEnd(getValidIntegerInput(scanner));
                    break;
                case 3:
                    System.out.print("Enter value to add: ");
                    int valueToAdd = getValidIntegerInput(scanner);
                    System.out.print("Enter position to add at: ");
                    int position = getValidIntegerInput(scanner);
                    list.addAtPosition(valueToAdd, position);
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    list.search(getValidIntegerInput(scanner));
                    break;
                case 5:
                    System.out.print("Enter value to delete: ");
                    list.delete(getValidIntegerInput(scanner));
                    break;
                case 6:
                    list.display();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static int getValidIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }
}

