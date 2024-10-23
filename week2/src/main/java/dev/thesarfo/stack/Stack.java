package dev.thesarfo.stack;

public class Stack {

    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack is full - Cannot push " + x);
        }
        System.out.println("Inserting " + x + " into stack");
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty - Cannot pop");
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
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

        int result;
        switch (operator) {
            case '+':
                result = add(operand1, operand2);
                break;
            case '-':
                result = subtract(operand1, operand2);
                break;
            case '*':
                result = multiply(operand1, operand2);
                break;
            case '/':
                result = divide(operand1, operand2);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        push(result);

        return result;
    }

}
