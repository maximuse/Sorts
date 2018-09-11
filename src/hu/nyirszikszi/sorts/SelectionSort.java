package hu.nyirszikszi.sorts;

import java.util.Arrays;

public class SelectionSort {
	public static void getSorted(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			int num = i;
			
			for (int j = i+1; j < array.length; j++) {
				if (array[num] > array[j]) {
					num = j;
				}
			}
			
			int smaller = array[num];
			array[num] = array[i];
			array[i] = smaller;
		}
		
		System.out.println("Selection Sort:\t" + Arrays.toString(array));
	}
}