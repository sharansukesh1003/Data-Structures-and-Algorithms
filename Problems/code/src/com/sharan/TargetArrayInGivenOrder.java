//https://leetcode.com/problems/create-target-array-in-the-given-order
package com.sharan;
// incomplete (can be done easily in python)
import java.util.Arrays;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] nums = createTargetArray(arr,index);
        System.out.println(Arrays.toString(nums));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[nums.length];
        for(int j = 0;j < nums.length ;j++){
            arr[j] = nums[j];
        }
        for(int i = 0;i < index.length; i++){
            int correctIndex = index[i];
            if(nums[i] != nums[correctIndex]){
                swap(arr,i,correctIndex);
                System.out.println(i);
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
