package com.sharan;

import java.util.ArrayList;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        int index = 0;
        int target = 3;
        System.out.println(findAllIndex(arr, target, index));
        System.out.println(linearSearch(arr,index,target));
    }
    public static boolean linearSearch(int[] arr, int index, int target){
        return index == arr.length ? false : arr[index] == target || linearSearch(arr, index + 1, target);
    }
    static public ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        // Recursive linear search without taking list as input.
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
