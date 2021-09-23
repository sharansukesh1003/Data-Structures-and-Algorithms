package com.sharan;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60},
                {65,72,87,93}
        };
        int target = 17;
        System.out.println(searchMatrix(arr,target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int[]arr = searchIn2DArray(matrix, target);
        return arr[1] != -1;
    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
//            int j = arr[mid].length - 1;
                if (target > arr[mid][i] && target > arr[mid][arr[mid].length - 1]){
                    start = mid + 1;
                }
                else if (target < arr[mid][i] && target < arr[mid][arr[mid].length - 1]){
                   end = mid - 1;
                }
                else return new int[] {mid, binarySearch(arr[mid],target)};

        }
        return new int[] {-1,-1};
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
            // since any one of the cases will be true
            else return mid;
        }
        return -1;
    }
}
