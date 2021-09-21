package com.sharan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {1,2,5,675,334,54645,87,9,23};
        System.out.println("Enter the Element");
        int wantedTarget = input.nextInt();
        int ans = linearSearch(nums, wantedTarget);
        if (ans == -1 ){
            System.out.println("Array is empty");
        }
        else if (ans == -2){
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element exists at " + ans);
        }
    }
    // search the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i< arr.length; i++){
            // check for element at every index if is = target
            if (arr[i] == target){
                return i;
            }
        }
        // if element does not exist
        return -2;
    }
    static int linearSearchEnhancedFor(int[] arr,int target){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        // for using a for each loop it is necessary to have either an array or collection
        for (int element : arr) {
            // check if the element = target
            if (element == target) {
                return element;
            }
        }
        // if element does not exist
        return Integer.MIN_VALUE;
    }
}
