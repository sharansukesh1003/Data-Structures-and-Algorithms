// https://leetcode.com/problems/sort-an-array/
package com.sharan;
// Simple Quick Sort 90.86% Faster
public class SortArray {
    public int[] sortArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr,low,high);
        return arr;
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
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
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
