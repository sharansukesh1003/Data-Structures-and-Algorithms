package com.sharan;

import java.util.ArrayList;
import java.util.Collections;

public class StringLargestNumber {
    public static void main(String[] args) {
        int[] arr = {10,2};
        System.out.println(largestNumber(arr));
    }
        public static String largestNumber(int[] nums) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            StringBuilder answer = new StringBuilder();
            for(int i = 0; i < nums.length; i++){
                while(nums[i] > 0){
                    arr.add(nums[i] % 10);
                    nums[i] /= 10;
                }
            }
            arr.sort(Collections.reverseOrder());
            for(int k = 0; k < arr.size(); k++){
                answer.append(arr.get(k));
            }
            System.out.println(answer);
            return answer.toString();
        }
}
