// https://leetcode.com/problems/sort-colors/
package com.sharan;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(colorSort(arr)));
    }
    static int[] colorSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return arr;
    }
}
