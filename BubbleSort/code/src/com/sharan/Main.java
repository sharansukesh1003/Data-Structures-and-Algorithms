package com.sharan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr = {-5,3,-2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        // This is to count how many times the outer loop ran to sort,
        // for example if the input array is sorted this loop will only run once.
        for (int i = 0; i < arr.length; i++) {
            // This boolean is to check whether the elements of the array were swapped,
            // if they were swapped then it would be set to true, which would continue the execution of the loop.
            boolean swap = false;
            // Inner loop is used to sort the array, for every iteration of the outer loop the inner loop's,
            // last element is sorted.
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                    // This means the element is swapped.
                }
            }
            if (!swap) {
                // If the previous iteration didn't swap any elements that means the array,
                // is sorted so break the loop.
                break;
            }
        }
        return arr;
    }
}
