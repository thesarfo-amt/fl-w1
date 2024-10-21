package dev.thesarfo.linkedlist;

public class LinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " added at the beginning.");
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println(data + " added at the end.");
    }

    public void addAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            System.out.println(data + " added at position " + position + ".");
            return;
        }

        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
            System.out.println(data + " added at position " + position + ".");
        }
    }

    public boolean search(int data) {
        Node current = head;
        int position = 0;

        while (current != null) {
            if (current.data == data) {
                System.out.println(data + " found at position " + position + ".");
                return true;
            }
            current = current.next;
            position++;
        }

        System.out.println(data + " not found in the list.");
        return false;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Deletion failed.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println(data + " deleted from the list.");
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println(data + " not found in the list. Deletion failed.");
            return;
        }

        previous.next = current.next;
        System.out.println(data + " deleted from the list.");
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
