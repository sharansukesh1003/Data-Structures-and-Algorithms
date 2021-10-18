package com.company;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 24, 31, 10 ,25};
        int low = 0;
        int high = arr.length - 1;
        QuickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            // Also, a reason why if its already sorted it will not swap
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // Now pivot is at the correct index, sort the two halves.
        QuickSort(arr, low, e);
        QuickSort(arr, s, high);
    }
}
