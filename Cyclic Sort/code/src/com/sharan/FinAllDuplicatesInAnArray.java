//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
package com.sharan;

import java.util.ArrayList;
import java.util.List;

public class FinAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> nums = new ArrayList<Integer>();
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] == arr[correctIndex]){
                i++;
            }
            else swap(arr,i,correctIndex);
        }
        for(i=0;i<arr.length;i++){
            if (arr[i] != i+1){
                nums.add(arr[i]);
            }
        }
        return nums;
    }
    static void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
}
