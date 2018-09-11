package hu.nyirszikszi.sorts;

import java.util.Arrays;

public class BubbleSort {
	private int[] array;
	
	public BubbleSort(int[] array) {
		this.array = array;
		getSorted(array);
	}
	
	public void getSorted(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j+1]) {
					array[j] = array[j] + array[j+1];
					array[j+1] = array[j] - array[j+1];
					array[j] = array[j] - array[j+1];
				}
			}
		}
		
		System.out.println("Bubble Sort:\t" + Arrays.toString(array));
	}
}