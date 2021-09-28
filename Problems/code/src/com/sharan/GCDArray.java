// https://leetcode.com/problems/find-greatest-common-divisor-of-array/
package com.sharan;

public class GCDArray {
    public static void main(String[] args) {
        int[] arr ={2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
    public static int findGCD(int[] nums) {
        int defaultValue = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        for(int k = 1 ;k <= nums[0] && k <= nums[nums.length - 1]; k++){
            if(nums[0] % k == 0 && nums[nums.length - 1] % k == 0){
                defaultValue = Math.max(defaultValue,k);
            }
        }
        return defaultValue;
    }
}
