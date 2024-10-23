## Lab Exercises

### Part 1: Data Structures

#### Summary
Data structures provide a structured way to organize and manage data. Choosing the right data structure significantly impacts an application's efficiency and memory usage. This section covers arrays and linked lists.

#### Key Theory
- **Arrays**: Fixed-size, contiguous memory allocation for elements of the same type. They offer efficient random access but are less flexible for insertions and deletions.
- **Linked Lists**: A collection of nodes where each node contains data and a reference to the next node. Linked lists are dynamic in size and excel at insertions and deletions but have slower random access compared to arrays.

#### Exercises
1. **Array Application - In the "arrays" directorry**:
    - Manages a list of student names using an array.
    - Implements functionalities to add, search, delete, and display student names, handling edge cases like array overflow.

2. **Linked List Implementation - In the "linkedlist" directory**:
    - Creates a basic linked list to store integers.
    - Includes methods for adding, searching, and deleting elements.

#### Takeaways
- Arrays offer fast random access but lack flexibility for data manipulation.
- Linked lists provide dynamic resizing and efficient insertions/deletions.

---

### Part 2: Stacks & Queues

#### Summary
Stacks and queues are specialized linear data structures that follow specific principles for insertion and removal.

#### Key Theory
- **Stack (LIFO)**: Last In, First Out. Ideal for scenarios like undo/redo functionality.
- **Queue (FIFO)**: First In, First Out. Suitable for task scheduling and real-world queue simulations.

#### Exercises
1. **Stack Simulation - In the "stack" directory**:
    - Simulate a calculator using a stack to store operands and operators, implementing basic arithmetic operations.

2. **Task Scheduler - In the "queue" directory**:
    - Create a program to simulate a task scheduler using a queue, managing tasks in a FIFO manner.

#### Takeaways
- Stacks are suited for last-added element access.
- Queues are effective for processing elements in the order they were added.

---

### Part 3: Searching & Sorting Algorithms

#### Summary
Searching and sorting algorithms are vital for organizing and locating data.

#### Key Theory
- **Searching Algorithms**:
    - **Linear Search**: Iterates through each element; simple but inefficient for large datasets.
    - **Binary Search**: Divides search space in half; efficient for sorted datasets.

- **Sorting Algorithms**:
    - **Bubble Sort**: Compares adjacent elements; simple but inefficient.
    - **Selection Sort**: Finds and swaps minimum elements; more efficient than bubble sort but still not ideal for large datasets.

#### Exercises
1. **Searching - In the "searching" directory**:
    - Implement linear and binary search algorithms, comparing their time complexities.

2. **Sorting - In the "sorting" directory**:
    - Implement bubble sort and selection sort for an array of integers, analyzing their time complexities.

#### Takeaways
- The choice of algorithm depends on data size and sorted nature.
- Linear search is slow for large datasets, while binary search is much faster for sorted data.