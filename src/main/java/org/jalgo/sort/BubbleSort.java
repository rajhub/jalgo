package org.jalgo.sort;

public class BubbleSort {

	public static void sort(int[] array) {
		int i = array.length - 1;
		while (i > 0) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int t = array[j+1];
					array[j+1] = array[j];
					array[j] = t;
				}
			}
			i--;
		}
	}
}
