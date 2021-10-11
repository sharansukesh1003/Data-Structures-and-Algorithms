// https://leetcode.com/problems/single-element-in-a-sorted-array/
package com.sharan;
// 9.97%
// For better Time complexity binary search (Sorted Array).
public class SingleElementSortedArray {
    public int singleNonDuplicateXOR(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
    public int singleNonDuplicateBinarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        // If the array is not missing any element in the left half,
        // then if mid is -ve then arr[mid] == arr[mid+1]
        // if it is odd then arr[mid] == arr[mid-1]
        // if either of them are true that means
        // the answer lies on the right side
        while(start < end){
            int mid = start + (end - start) / 2;
            if((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || mid % 2 == 1 && nums[mid] == nums[mid - 1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        // return either end or return start.
        return nums[start];
    }
}
