package org.jalgo.search;

/**
 * Created by raj on 3/30/15.
 */
public class BinarySearchIterative {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(search(100, array));
    }

    public static int search(int target, int[] array) {

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
}
