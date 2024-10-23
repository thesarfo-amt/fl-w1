package dev.thesarfo.sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] bubbleSortData = {64, 34, 25, 12, 22, 11, 90};
        int[] selectionSortData = {29, 10, 14, 37, 13};

        System.out.println("Original Array for Bubble Sort: " + Arrays.toString(bubbleSortData));
        sorting.bubbleSort(bubbleSortData);
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(bubbleSortData));

        System.out.println("Original Array for Selection Sort: " + Arrays.toString(selectionSortData));
        sorting.selectionSort(selectionSortData);
        System.out.println("Sorted Array (Selection Sort): " + Arrays.toString(selectionSortData));
    }
}
