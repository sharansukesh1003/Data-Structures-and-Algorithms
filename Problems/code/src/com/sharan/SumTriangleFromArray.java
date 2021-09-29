// https://www.geeksforgeeks.org/sum-triangle-from-array/
package com.sharan;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = 1;
        System.out.println(sumTriangleFromArray(arr,a));
    }
    public static int sumTriangleFromArray(int[] arr,int k){

        if (k > arr.length){
            return arr[0];
        }
        for (int i = 0; i < arr.length-k; i++) {
            arr[i] += arr[i+1];
        }
        k++;
        return sumTriangleFromArray(arr,k);
    }
}
