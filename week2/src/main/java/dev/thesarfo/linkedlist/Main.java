package dev.thesarfo.linkedlist;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtBeginning(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtPosition(25, 2);
        list.display();

        list.search(20);
        list.search(40);

        list.delete(25);
        list.display();

        list.delete(40);
        list.display();
    }
}
