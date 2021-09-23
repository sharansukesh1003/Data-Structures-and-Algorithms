// https://leetcode.com/problems/median-of-two-sorted-arrays/
package com.sharan;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOf2SortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>(nums1.length + nums2.length);
        for(int i=0; i < nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int j=0; j < nums2.length; j++){
            list.add(nums2[j]);
        }
        for(int k=0; k < list.size(); k++){
            sum+= list.get(k);
        }
        Collections.sort(list);
        double middle = list.get(list.size() / 2);
        if (list.size() % 2 == 0){
            double a =  list.get(list.size() / 2 );
            double b =  list.get(list.size() / 2 - 1);
            return middle = (a + b) / 2;
        }
        return middle;
    }
}
