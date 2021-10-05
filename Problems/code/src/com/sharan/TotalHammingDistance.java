package com.sharan;

public class TotalHammingDistance {
    public static void main(String[] args) {
        int[] arr = {4,14,2};
        System.out.println(totalHammingDistance(arr));
    }
    public static int totalHammingDistance(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                ans += hammingDistance(nums[i],nums[j]);
            }
        }
        return ans;
    }
    public static int hammingDistance(int x, int y) {
        int count = 0;
        while(x > 0 || y > 0){
            if(((x & 1) ^ (y & 1)) == 1){
                count ++;
            }
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
