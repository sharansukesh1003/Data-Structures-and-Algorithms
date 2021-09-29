package com.sharan;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr ={1,2};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] % 2 == 0 && i % 2 == 0){
                even += 2;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[even];
                nums[even] = temp;
                even+=2;
            }
        }
        return nums;
    }
//    public static int[] sortArrayByParityII(int[] nums) {
//        int odd = 1;
//        int even = 0;
//        for(int i = 0; i < nums.length - 1; i++){
//            if(nums[i] % 2 == 0){
//                even += 2;
//            }
//            else if(nums[i] % 2 == 1 && i % 2 == 1){
//                even+=2;
//            }
//            else{
//                int temp = nums[i];
//                nums[i] = nums[odd];
//                nums[odd] = temp;
//                odd+=2;
//            }
//        }
//        return nums;
//    }
}
