//https://leetcode.com/problems/missing-number/
package com.sharan;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while(i<arr.length){
            if(arr[i] == arr.length){
                i++;
            }
            else if(arr[i] == i){
                i++;
            }
            else{
                swap(arr,arr[i],i);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
}
