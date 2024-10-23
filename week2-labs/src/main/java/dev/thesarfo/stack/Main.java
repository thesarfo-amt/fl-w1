package dev.thesarfo.stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(10);

        while (true) {
            try {
                System.out.println("\n--- Stack Calculator ---");

                int num1 = getValidIntegerInput(scanner);
                stack.push(num1);

                int num2 = getValidIntegerInput(scanner);
                stack.push(num2);

                char operator = getValidOperator(scanner);

                int result = stack.evaluate(operator);
                System.out.println("Result: " + result);

                stack.printStack();

                System.out.print("Do you want to perform another operation? (yes/no): ");
                String response = scanner.next();
                if (response.equalsIgnoreCase("no")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static int getValidIntegerInput(Scanner scanner) {
        while (true) {
            System.out.print("Enter a number: ");
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    private static char getValidOperator(Scanner scanner) {
        while (true) {
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                return operator;
            } else {
                System.out.println("Invalid operator. Please enter one of (+, -, *, /).");
            }
        }
    }
}

