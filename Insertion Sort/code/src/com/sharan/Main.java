package com.sharan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr = {5,3,4,1,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr) {
        //Outer loop is n-2 because j = i + 1, else index will overflow.
        for (int i = 0; i < arr.length - 1; i++) {
            //Array is sorted in backward unlike bubble sort and selection sort.
            for (int j = i+1; j > 0; j--) {
                if (arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }
                // If no swap takes place that means elements are sorted, therefore break.
                else break;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int c, int b){
        int a = arr[b];
        arr[b] = arr[c];
        arr[c] = a;
    }
}
