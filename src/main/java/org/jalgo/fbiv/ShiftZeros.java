package org.jalgo.fbiv;

import java.util.Arrays;

/* Given an array of integers, modify it in-place such that all non-zero values
 * are on the higher end, and all zeros are on the lower end. Order of non-zero
 * values can be ignored for the final result.
 */
public class ShiftZeros {

    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 4, 0};
        System.out.println(Arrays.toString(shiftZeros(new int[]{1, 0, 2, 0, 4, 0})));
        System.out.println(Arrays.toString(shiftZeros(new int[]{0, 1, 4, 0})));
        System.out.println(Arrays.toString(shiftZeros(new int[]{1, 1, 4, 5})));
        System.out.println(Arrays.toString(shiftZeros(new int[]{0, 0, 0})));
        System.out.println(Arrays.toString(shiftZeros(new int[]{0})));
        System.out.println(Arrays.toString(shiftZeros(new int[]{0, 1})));
    }

    public static int[] shiftZeros(int[] array) {

        if (array == null || array.length <= 1) {
            return array;
        }

        int begin = 0;
        int end = array.length - 1;

        while(begin < end) {
            if (array[end] == 0) {
                end--;
                continue;
            }
            if (array[begin] != 0) {
                begin++;
                continue;
            }
            if (array[begin] == 0 && array[end] != 0) {
                // swap
                int t = array[begin];
                array[begin] = array[end];
                array[end] = t;
                begin++;
                end--;
            }
        }
        return array;
    }
}
