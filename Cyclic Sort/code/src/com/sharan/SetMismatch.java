// https://leetcode.com/problems/set-mismatch/
package com.sharan;

public class SetMismatch {
        public int[] findErrorNums(int[] arr) {
            int[] nums = new int[2];
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
                    nums[0] = arr[i];
                    nums[1] = i+1;
                }
            }
            return nums;
        }
        public void swap(int[] arr, int a, int b) {
            int c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
        }
}
