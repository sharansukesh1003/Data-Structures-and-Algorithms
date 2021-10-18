// https://leetcode.com/problems/subarray-product-less-than-k/
package com.sharan;
// 5.01% Faster O(n^2).
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k){
                count++;
            }
            int prod = nums[i];
            for(int j = i+1; j < nums.length; j++){
                prod *= nums[j];
                if(prod < k){
                    count++;
                }
                if(prod >= k){
                    break;
                }
            }
        }
        return count;
    }
}
