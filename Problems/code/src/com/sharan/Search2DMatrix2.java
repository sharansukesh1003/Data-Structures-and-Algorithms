// https://leetcode.com/problems/search-a-2d-matrix-ii/
package com.sharan;
// O(n*log(m))
public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int start = 0;
            int end = matrix[i].length - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(matrix[i][mid] < target){
                    start = mid + 1;
                }
                else if(matrix[i][mid] > target){
                    end = mid - 1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}
