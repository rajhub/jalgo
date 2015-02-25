package org.jalgo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int array[] = new int[10]; 
		populateArray(array);
		printArray(array);
		sort(array);
	}

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int val = array[i];
			int j = i;
			while(j > 0 && array[j-1] > val) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = val;
			printArray(array);
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
