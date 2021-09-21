package com.sharan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,0,2};
        System.out.println("Original Array = " + Arrays.toString(arr));
        System.out.println("Sorted Array = " + Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // below variable lastIndex gives the last index of the current array sortable array,
            // as the elements in the end will be sorted first, after every iteration just - i,
            // from the original length i.e. the actual length of the array.
            int lastIndex = arr.length - i - 1;
            int indexOfMaxValue = MaxIndex(arr, lastIndex);
            swap(arr, indexOfMaxValue, lastIndex);
        }
        return arr;
    }

    static void swap(int[] arr, int maxIndex, int last) {
       // Swaps the maximum value with the last index of the unsorted sub-array.
       int temp = arr[last];
       arr[last] = arr[maxIndex];
       arr[maxIndex] = temp;
    }

    static int MaxIndex(int[] arr, int end) {
        // Finds the maximum value in the array and returns the index of the max element.
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
