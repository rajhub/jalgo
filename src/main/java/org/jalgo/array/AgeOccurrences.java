package org.jalgo.array;

import java.util.HashMap;
import java.util.Map;

public class AgeOccurrences {

    public static void main(String args[]) {
        int array[] = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3};
        System.out.println(count(array));
    }

    public static Map<Integer, Integer> count(int[] array) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        count(array, 0, array.length - 1, counts);
        return counts;
    }

    public static void count(int[] array, int start, int end, Map<Integer, Integer> counts) {
        if (array[start] == array[end]) {
            int delta = end - start + 1;
            counts.put(array[start], counts.containsKey(array[start]) ? counts.get(array[start]) + delta : delta);
        } else {
            count(array, start, (end + start)/2, counts);
            count(array, (end + start)/2 + 1, end, counts);
        }
    }
}
