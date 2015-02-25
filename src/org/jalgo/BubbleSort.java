package org.jalgo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = new int[10]; 
		populateArray(array);
		printArray(array);
		sort(array);
	}

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
			printArray(array);
			i--;
		}
	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void populateArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
	}
}
