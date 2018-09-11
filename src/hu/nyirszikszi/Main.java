package hu.nyirszikszi;

import hu.nyirszikszi.sorts.BubbleSort;
import hu.nyirszikszi.sorts.InsertionSort;
import hu.nyirszikszi.sorts.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int pcs = 10;
        int min = 1;
        int max = 10;
        
        int[] arraybs = new int[pcs];
        arrayGenerator(arraybs, min, max);
        BubbleSort bs = new BubbleSort(arraybs);
        
        System.out.println();
        
        int[] arrayss = new int[pcs];
        arrayGenerator(arrayss, min, max);
        SelectionSort.getSorted(arrayss);
        
        System.out.println();
        
        int[] arrayis = new int[pcs];
        arrayGenerator(arrayis, min, max);
        InsertionSort.getSorted(arrayis);
    }
    
    private static int numberGenerator(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
    
    private static void arrayGenerator(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            int num = numberGenerator(min, max);
            
            while (!isUnique(array, num)) {
                num = numberGenerator(min, max);
            }
            
            array[i] = num;
        }
    
        System.out.println("Original:\t" + Arrays.toString(array));
    }
    
    private static boolean isUnique(int[] array, int num) {
        for (int a : array) {
            if (a == num) {
                return false;
            }
        }
        
        return true;
    }
}