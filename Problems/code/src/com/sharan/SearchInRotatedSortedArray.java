// https://leetcode.com/problems/search-in-rotated-sorted-array/
package com.sharan;
// recursive binary search to find pivot element then normal binary search in the sub-array.
class SearchInRotatedSortedArray {
    public static void main(String[] args) {
      int[] arr = {3,1};
      int target = 3;
      System.out.println(search(arr,target));
    }
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 1){
            return (arr[0] == target) ? 0 : -1;
        }
        if (arr[start] < arr[end]){
            return binarySearch(arr,target,start,end);
        }
        int pivot = findMin(arr);
        System.out.println(pivot + " 1st");
        if (target == arr[pivot]){
            return pivot;
        }
        else if(target >= arr[start] && target < arr[pivot]){
            return binarySearch(arr,target,start,pivot - 1);
        }
        else{
            return binarySearch(arr,target,pivot + 1,end);
        }
    }
    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int target = arr[0];
        return recursiveBinarySearch(arr,start,end,target);
    }
    public static int recursiveBinarySearch(int[] arr,int start, int end, int target){
        if(arr.length == 1) return arr[0];
        if(arr[start] < arr[end]) return arr[start];
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target || start == end) {
            return mid;
        }
        if (arr[mid] > target){
            return recursiveBinarySearch(arr,mid,end,arr[mid]);
        }
        return recursiveBinarySearch(arr,start,mid,arr[mid]);
    }
    public static int binarySearch(int[]arr, int target, int start,int end) {
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else return mid;
        }
        return -1;
    }
}
