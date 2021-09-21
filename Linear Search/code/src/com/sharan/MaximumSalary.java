package com.sharan;

public class MaximumSalary {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int maxValue = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > maxValue){
                maxValue = sum;
            }
        }
        return maxValue;
    }
}
