package com.sharan;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {44,55,66},
                {78,97}
        };
        int element = 444;
        System.out.println(search2DArray(arr,element));
    }
    static boolean search2DArray(int[][] arr,int element){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0 ; col < arr[row].length; col++){
                if (arr[row][col] == element){
                    return true;
                }
            }
        }
        return false;
    }
}
