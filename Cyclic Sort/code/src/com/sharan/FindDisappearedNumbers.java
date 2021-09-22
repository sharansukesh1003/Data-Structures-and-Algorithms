//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package com.sharan;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
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
                nums.add(i+1);
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
