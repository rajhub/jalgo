package org.jalgo.sort;

public class QuickSort {
    public static void sort(int[] array, int begin, int end) {

        if (array == null || array.length == 0)
            return;

        if (begin >= end)
            return;

        int middle = begin + (end - begin) / 2;
        int pivot = array[middle];

        int i = begin;
        int j = end;

        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;

            if (i <= j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
            }

            if (begin < j)
                sort(array, begin, j);

            if (end > i)
                sort(array, i, end);
        }

    }
}
