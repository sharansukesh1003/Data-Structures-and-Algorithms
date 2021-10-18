// https://leetcode.com/problems/subarray-sum-equals-k/submissions/
package com.sharan;
// 5.26% Faster O(n^2)
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {28,54,7,-70,22,65,-6};
        int k = 100;
        System.out.println(subarraySum(arr,k));
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == k){
                count++;
            }
            int sum = nums[i];
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
