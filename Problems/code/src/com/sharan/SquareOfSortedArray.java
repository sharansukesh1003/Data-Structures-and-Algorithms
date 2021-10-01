// https://leetcode.com/problems/squares-of-a-sorted-array/
package com.sharan;
// Bad Solution very slow. :(
public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length - 1; i ++){
            for(int j = 1; j < nums.length; j++){
                if(nums[j-1] < 0){
                    nums[j-1] *= -1;
                }
                if(nums[j-1] > nums[j]){
                    swap(nums,j-1,j);
                }
            }
        }
        for(int l = 0; l < nums.length; l++){
            nums[l] *= nums[l];
        }
        return nums;
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
