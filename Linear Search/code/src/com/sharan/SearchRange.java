package com.sharan;

import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,9,8,5,7,3,55,87,29,902,93021};
        System.out.println("Enter the element");
        int element = in.nextInt();
        System.out.println("Enter the start index");
        int start = in.nextInt();
        System.out.println("Enter the end index");
        int end = in.nextInt();
        int ans = searchInRange(arr,element,start,end);
        System.out.println(ans);
    }
    static int searchInRange(int[] array,int givenElement, int start, int stop){
        if (start > array.length-1 || stop > array.length-1 || start > stop || start < 0 ){
            System.out.println("Something went wrong!");
            return Integer.MIN_VALUE;
        }
       for (int index = start; index <= stop; index++){
           if (givenElement == array[index]){
               System.out.println("Found the element");
               return givenElement;
           }
       }
        System.out.println("Not Found");
        return Integer.MAX_VALUE;
    }
}
