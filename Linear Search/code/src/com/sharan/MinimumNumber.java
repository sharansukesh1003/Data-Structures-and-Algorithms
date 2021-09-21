package com.sharan;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-9,-1,9,-10,Integer.MIN_VALUE};
        System.out.println(minimumNumber(arr));
    }
    static int minimumNumber(int[] array){
        int minNumber = Integer.MAX_VALUE;
        for (int index = 0;index < array.length;index++){
            if (minNumber > array[index]){
                 minNumber = array[index];
            }
        }
        return minNumber;
    }
}
