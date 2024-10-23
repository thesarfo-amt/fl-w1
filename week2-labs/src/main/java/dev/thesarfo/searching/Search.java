package dev.thesarfo.searching;

import java.util.Arrays;

public class Search {

    public Search() {
    }

    public int linearSearch(int[] struct, int key) {
        for (int i = 0; i < struct.length; i++) {
            if (struct[i] == key) {
                return i;
            }
        }
        System.out.println(key + " not found");
        return -1;
    }

    public int binarySearch(int[] struct, int key) {
        int low = 0;
        int high = struct.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (struct[mid] == key) {
                return mid;
            } else if (key < struct[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public void sort(int[] struct) {
        Arrays.sort(struct);
    }
}