package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {94, 14, 45, 2, 32, 10, 80};

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        //Sorting algorithm
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

}
