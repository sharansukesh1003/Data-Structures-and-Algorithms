package com.sharan;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4,6,7};
        int target = 5;
        System.out.println(ceiling(target,arr));
    }
    static int ceiling(int num,int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > num){
               end = mid - 1;
            }
            else if (arr[mid] < num){
                start = mid + 1;
            }
            else return arr[mid];
        }
        return start < arr.length ? arr[start]: -1 ;
    }
}
