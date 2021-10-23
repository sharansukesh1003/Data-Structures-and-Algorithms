// https://leetcode.com/problems/3sum-closest/
package com.sharan;
// 35% faster.
import java.util.Arrays;
// Revisit
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(Math.abs(4));
        System.out.println(threeSumClosest(arr,target));
    }
    public static int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int closest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - 2; i++){
            int tempSum = 0;
            int start = i+1;
            int end = arr.length - 1;
            while(start < end){
                tempSum = arr[i] + arr[start] + arr[end];
                if(tempSum == target){
                    closest = tempSum;
                    return closest;
                }
                if(tempSum < target){
                    start++;
                }
                else{
                    end--;
                }
                if (Math.abs(target - tempSum) < Math.abs(target - closest) || closest == Integer.MIN_VALUE) {
                    closest = tempSum;
                }
            }
        }
        return closest;
    }
}
