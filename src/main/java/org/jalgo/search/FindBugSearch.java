package org.jalgo.search;

/**
 * Created by raj on 3/30/15.
 */
public class FindBugSearch {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(findBug(array));
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
