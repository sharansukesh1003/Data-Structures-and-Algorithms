//https://leetcode.com/problems/find-the-duplicate-number/
package com.sharan;

class FindDuplicate {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] == arr[correctIndex]){
                i++;
            }
            else swap(arr,i,correctIndex);
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1){
                return arr[i];
            }
        }
        return -1;
    }
    public void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
}
