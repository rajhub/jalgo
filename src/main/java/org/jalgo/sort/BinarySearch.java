package org.jalgo.sort;

/**
 * Created by raj on 3/30/15.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(bsearchRecursive(100, array, 0, array.length));
        System.out.println(bsearchIterative(100, array));

        System.out.println(findBug(array));
    }

    public static int bsearchRecursive(int value, int[] array, int start, int end) {

        if (start >= end)
            return -1;

        int middle = start + (end - start) / 2;

        if (value < array[middle])
            return bsearchRecursive(value, array, start, middle);

        if (value > array[middle])
            return bsearchRecursive(value, array, middle + 1, end);

        return middle;
    }

    public static int bsearchIterative(int target, int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (array[middle] == target)
                return middle;

            if (target > array[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static int findBug(int array[]) {
        int start = 0;
        int end = array.length - 1;
        int lastBug = 0;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (isBug(array[middle])) {
                lastBug = array[middle];
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return lastBug;
    }

    private static boolean isBug(int target) {
        return (target >= 120);
    }
}
