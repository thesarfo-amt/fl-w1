package dev.thesarfo.stack;

public class Stack {

    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full - Exiting Program");
            System.exit(1);
        }
        System.out.println("Inserting " + x + " into stack");
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int evaluate(char operator) {
        if (size() < 2) {
            throw new IllegalStateException("Insufficient operands to perform operation");
        }

        int operand2 = pop();
        int operand1 = pop();

        switch (operator) {
            case '+':
                return add(operand1, operand2);
            case '-':
                return subtract(operand1, operand2);
            case '*':
                return multiply(operand1, operand2);
            case '/':
                return divide(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
