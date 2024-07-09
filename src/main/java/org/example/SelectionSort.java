package org.example;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {94, 14, 45, 2, 32, 10, 80};
        
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
}

