package org.jalgo.search;

/**
 * Created by raj on 3/30/15.
 */
public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(search(array, 0, array.length - 1, 100));
    }

    public static int search(int[] array, int start, int end, int target) {

        int middle = (start + end) / 2;
        if(end < start) {
            return -1;
        }
        if (target == array[middle])
            return middle;
        else if (target < array[middle])
            return search(array, start, middle - 1, target);
        else
            return search(array, middle + 1, end, target);
    }
}
