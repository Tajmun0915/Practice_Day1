package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 5, 2, 8, 7, 3};

        // Convert array to stream, filter distinct elements, collect into a List
        List<Integer> duplicates = Arrays.stream(arr)
                                              .distinct()
                                              .boxed()
                                              .collect(Collectors.toList());

        // Print distinct elements
        System.out.println("Distinct elements in the array:");
        duplicates.forEach(System.out::println);
    }
}
