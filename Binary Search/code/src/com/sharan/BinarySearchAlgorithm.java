package com.sharan;

import java.util.Scanner;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] arr = {1,2,3,4,5,6,7,89,90,907};
            System.out.print("Enter Target Element = ");
            int target = in.nextInt();
            System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[]arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // if start is less than end or if start is
        // equal to end that means the element is not present in the array
        while (start <= end){
            // if the value exceed int (s + e) / 2 won't work, therefore the below formula is used
           int mid = start + (end-start)/2;
           // if target is greater than mid
            if (target > arr[mid]){
                start = mid+1;
            }
            // if target is less than mid
            else if (target < arr[mid]){
                end = mid - 1;
            }
            // since any one of the cases will be true or we
            else return mid;
        }
        return -1;
    }
}
