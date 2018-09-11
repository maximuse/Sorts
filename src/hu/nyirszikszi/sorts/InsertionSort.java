package hu.nyirszikszi.sorts;

import java.util.Arrays;

public class InsertionSort {
	public static void getSorted(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int k = array[i];
			int j = i - 1;
			
			while (j>-1 && array[j]>k) {
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = k;
		}
		
		System.out.println("Insertion Sort:\t" + Arrays.toString(array));
	}
}