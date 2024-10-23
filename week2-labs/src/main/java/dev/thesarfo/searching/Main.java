package dev.thesarfo.searching;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        int[] data = {12, 3, 45, 7, 23, 19, 50, 11};

        int keyToFind = 19;
        int linearResult = search.linearSearch(data, keyToFind);
        if (linearResult != -1) {
            System.out.println("Linear Search: Key " + keyToFind + " found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Key " + keyToFind + " not found.");
        }

        search.sort(data);
        System.out.println("Sorted Array: " + Arrays.toString(data));

        int binaryKeyToFind = 45;
        int binaryResult = search.binarySearch(data, binaryKeyToFind);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Key " + binaryKeyToFind + " found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Key " + binaryKeyToFind + " not found.");
        }
    }
}
