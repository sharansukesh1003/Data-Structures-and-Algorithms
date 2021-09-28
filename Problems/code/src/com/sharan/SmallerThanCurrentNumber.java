// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package com.sharan;

public class SmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            answer[k] = count;
            k++;
        }
        return answer;
    }
}
