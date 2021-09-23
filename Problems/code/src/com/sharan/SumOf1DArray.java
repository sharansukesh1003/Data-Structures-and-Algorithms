// https://leetcode.com/problems/running-sum-of-1d-array/
package com.sharan;

public class SumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
