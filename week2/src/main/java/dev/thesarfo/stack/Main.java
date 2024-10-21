package dev.thesarfo.stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(10);

//        stack.push(10);
//        stack.push(20);
//
//        System.out.print("Current Stack: ");
//        stack.printStack();
//
//        //int result = stack.evaluate('+');
//        //System.out.println("Result of addition: " + result);
//
//        stack.push(50);
//        stack.push(30);
//        result = stack.evaluate('-');
//        System.out.println("Result of subtraction: " + result);
//
//        System.out.print("Current Stack after operations: ");
//        stack.printStack();

        while (true) {
            System.out.println("\nEnter first number: ");
            int num1 = scanner.nextInt();
            stack.push(num1);

            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            stack.push(num2);

            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            try {
                int result = stack.evaluate(operator);
                System.out.println("Result: " + result);

                System.out.println("Do you want to perform another operation? (yes/no): ");
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
}
