// https://leetcode.com/problems/wiggle-sort-ii/
package com.sharan;
// 47.93%. (Revisit)
import java.util.Arrays;

public class WiggleSort {
    // Sort the array.
    // Odd index descending.
    // 0 and even index ascending.
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[nums.length];
        int i = nums.length - 1;
        int j = 1;
        while(j < nums.length){
            arr[j] = nums[i];
            i--;
            j += 2;
        }
        j = 0;
        while(i >= 0){
            arr[j] = nums[i];
            i--;
            j += 2;
        }
        for(int k = 0; k <nums.length; k++){
            nums[k] = arr[k];
        }
    }
}
