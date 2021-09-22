package com.sharan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Cyclic sort will only work on continuous array which start from 1 up to n or from 0 to n;
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Original Array = " + Arrays.toString(arr));
        System.out.println("Sorted Array = " + Arrays.toString(cyclicSort(arr)));
    }
    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            // If array starts from 0 up to n then no need to -1.
            int correctIndex = arr[i] - 1;
            // The algorithm checks whether the value at arr[i] == arr[arr[i]-1] i.e. the correct index,
            // if it is not equal, it will swap it with the correct value, else i will be incremented.
            if (arr[i] == arr[correctIndex]){
                i++;
            }
            else swap(arr,i,correctIndex);
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
}
