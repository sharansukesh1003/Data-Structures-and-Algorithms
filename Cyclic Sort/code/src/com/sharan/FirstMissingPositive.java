// https://leetcode.com/problems/first-missing-positive/submissions/
package com.sharan;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {4,1,-1,3};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            // Numbers which are negative and greater than the length of the array will be ignored while sorting
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j = 0;j < arr.length; j++){
            if (arr[j] != j+1){
                return j+1;
            }
        }
        // If the array is sorted and continuous that means the next positive integer,
        // would be length of array + 1
        return arr.length + 1;
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}


